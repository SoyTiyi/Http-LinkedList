var app = (function() {

    /**
     * En este metodo indicamos en que div con un indicado id llegaran las respuestas del servidor
     * @param {*} error 
     * @param {*} data 
     */
    const numbers = (error, data) => {
        if (error != null) {
            console.log(`Error: ${error}`);
            alert("Formato Invalido -> ej: 10.5,3.5,5");
            return;
        }
        $("#avg").text(data.media);
        $("#stdv").text(data.desviacion);
    }

    /**
     * Este metodo trae del html el valor del input y lo transforma en una lista separada por las comas
     */
    const send = () => {
        var data = $("#list").val();
        var listNum = data.split(",");
        postMethod(listNum, numbers);
    }

    /**
     * Este metodo genera la promesa a la url que crea spark y luego setea la const numbers para retornar el valor
     * @param {*} listNum Lista de numeros en strings
     * @param {*} numbers Respuesta del servidor
     */
    const postMethod = (listNum,numbers) => {
        var promise = $.post({
            url: "/calc",
            data: JSON.stringify(listNum),
            contentType: "application/json"
        });
        promise.then((data) => {
            numbers(null, JSON.parse(data));
        },(error) => {
            numbers(error, null);
        });
    }

    return {
        send: function() {
            send();
        }
    }
})();
var app = (function() {
    const numbers = (error, data) => {
        if (error != null) {
            console.log(`Error: ${error}`);
            alert("Formato Invalido -> ej: 10.5,3.5,5");
            return;
        }
        $("#avg").text(data.media);
        $("#stdv").text(data.desviacion);
    }

    const send = () => {
        var data = $("#list").val();
        var listNum = data.split(",");
        postMethod(listNum, numbers);
    }

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
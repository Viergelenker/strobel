/**
 * Created by Julien on 19.07.16.
 */
$(document).foundation();

$(document).ready(function(){
    $("#doors").click(function(){
        $("#box").load("/ajax/doors");
    });
});
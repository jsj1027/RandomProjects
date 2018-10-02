function text_color_change(color){
    var clock_text = document.getElementById("clock");

    switch (color) {
        case "red":
            clock_text.setAttribute("style","color: red");
            break;
        case "white":
            clock_text.setAttribute("style","color: white");
            break;
        case "black":
            clock_text.setAttribute("style","color: black");
            break;
    }
}

function bg_color_change(color){
    var body = document.getElementById("body");

    switch (color) {
        case "crimson":
            body.setAttribute("style","background-color: crimson");
            break;
        case "white":
            body.setAttribute("style","background-color: white");
            break;
        case "black":
            body.setAttribute("style","background-color: black");
            break;
        case "blue":
            body.setAttribute("style","background-color: blue");
            break;
    }
}

window.onload=function (){
    document.getElementById("red_text_button").addEventListener("click", function(){text_color_change("red")});
    document.getElementById("white_text_button").addEventListener("click", function(){text_color_change("white")});
    document.getElementById("black_text_button").addEventListener("click", function(){text_color_change("black")});
    document.getElementById("crimson_bg_button").addEventListener("click", function(){bg_color_change("crimson")});
    document.getElementById("white_bg_button").addEventListener("click", function(){bg_color_change("white")});
    document.getElementById("black_bg_button").addEventListener("click", function(){bg_color_change("black")});
    document.getElementById("blue_bg_button").addEventListener("click", function(){bg_color_change("blue")});
};
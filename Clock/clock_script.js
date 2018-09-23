function Clock (hours, minutes, seconds){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
    this.mode = false; //If False it is in 24 hour time.
    this.day_half = "AM"; //Default
    this.shown = "";
    this.add_zero = function () {
        if (this.hours < 10)
            this.hours = "0" + this.hours;
        if (this.minutes < 10)
            this.minutes = "0" + this.minutes;
        if (this.seconds < 10)
            this.seconds = "0" + this.seconds;

    };
    this.half_switch = function (shift) {
      if (shift === true)
          this.day_half = "AM";
      else
          this.day_half = "PM";
    };
}

function update() {
    var time = new Date();
    current_clock = new Clock(time.getHours(), time.getMinutes(), time.getSeconds());
    if (current_clock.mode === false) {
        current_clock.add_zero();
        current_clock.shown = current_clock.hours + ":" + current_clock.minutes + ":" + current_clock.seconds;
    }
    else {
        if (current_clock.hours > 12) {
            current_clock.hours -= 12;
            current_clock.half_switch(false);
        }
        else {
            current_clock.half_switch(true);
        }
        current_clock.add_zero();
        current_clock.shown = current_clock.hours + ":" + current_clock.minutes + ":" + current_clock.seconds
            + " " + current_clock.day_half
    }
    document.getElementById("clock").textContent = current_clock.shown;
}

setInterval(function() {update();},1000);
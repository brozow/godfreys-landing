window.onload = function(){ 
	var x = 1;
	var y = 1;
	var block = 10;
	var canvas = document.getElementById("world");
	var ctx = canvas.getContext("2d");
	var player = new Image(30,60);
	player.addEventListener('load', function() {
		ctx.drawImage(player, x*block, y*block);
	}, false);
	player.src = "/images/Player30x60.png";

	console.log("Loaded main.js");
};
window.load =slide(1);
var bgNumber =1;

function slide(a){
var allBgs = 4;
document.getElementById('imageBg').style.backgroundImage= "url('images/"+n+".jpg');";
}



function anterior(){
if(bgNumber>1){
    bgNumber--;
slide(bgNumber);
}

}


function posterior(){
    if(bgNumber<4){
        bgNumber++;
    slide(bgNumber);
    }
    
    }
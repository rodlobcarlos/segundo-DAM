alert("Hello to JS");
console.log("Hola buenos dias!");

var table = "Normal Table";
let chair = "One chair";

let testBoolean = true;
console.log(testBoolean);

let testString = "text";
console.log(testString);

let testnumber = 10;
console.log(testnumber);

let testBooleanObject = new Boolean(true);
console.log(testBooleanObject);

let testNumberObject = new Number(10);
console.log(testNumberObject);

let testStringObject = new String("text");
console.log(testStringObject);

let name = "John";
let surname = "doe";
let question = "How are you"+name+" "+surname+"?";
let answer = `How are you`+name+` `+surname+`?`;

let operador_a = 3;
let operador_b = 3;
let expo = operador_a** operador_b;
let inc = ++operador_a;
let dec = --operador_a;
console.log(expo);
console.log(inc);
console.log(dec);

// Typeof, null & undefinded
let testboolean = true;
let testNumber = 12;
let teststring = "Hello";
let testbooleanObject = new Boolean(true);

// Typeof, null & undefined I
let testNull = null;
console.log(testNull);

// Typeof, null & undefined II
let testUndefined;
console.log(testUndefined);

//Array definition
var first_array = [];
var second_array = new Array(3);
var third_array = new Array(3,5,"Seville",true,third_array);
var fourth_array = new Array(3,5);
console.log(first_array);
console.log(second_array),
console.log(third_array);

//Array access
console.log(third_array[1]);
console.log(fourth_array[4][0]);

// Array push 
console.log(fourth_array.push("Spain"));
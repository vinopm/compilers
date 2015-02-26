	#not sure if all of these should be positive
	c : int := 9;
	c := 10;

	a : dict<int, char> := { 1:'1', 2:'2', 3:'3' } ; 
	b : int := 10;
	c : string := "hello world!";
	d : person := "Shin", "Yoo", 30;
	e : char := 'a';
	f : seq<rat> := [ 1/2, 3, 4_2/17, -7 ];

main {
	foo(a,  bar(a, b));
	a : dict<int, char> := { 1:'1', 2:'2', 3:'3' } ;
	b : int := 10;
	c : string := "hello world!";
	d : person := "Shin", "Yoo", 30;
	e : char := 'a';
	f : seq<rat> := [ 1/2, 3, 4_2/17, -7 ];
	c := 10;

	c : int := 9;
	d:int := "hello"-2.8;
	a:float := ------10.9;
	b:rat := 1_7/-8;
	fibonacci( 13 );
	return;
}

alias seq<char> string;
tdef person {name:string}; # person fdefinition


main { 

m:person := "aaaaAAA";
a : seq<int> := [1,2,3];
b : seq<int> := reverse(a);

# here we generate
/# random shit #/

  fdef reverse (inseq : seq<top>) {
	outseq : seq<top> := [];
	i : int := 0;
	while (i < len(l)) do
	outseq := inseq[i] :: outseq;
	i := i + 1;
	od
	return outseq;
	} : seq<top> ;

  return;
};

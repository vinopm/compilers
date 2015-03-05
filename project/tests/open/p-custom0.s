
main {
	a : seq<int> := [1, 2, 3];
	forall(n in a) do
		print n * 2;
	od return;
};

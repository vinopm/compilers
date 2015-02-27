alias seq<char> string;
tdef person {name:string}; # person fdefinition

tdef family {mother:person, father:person, children:seq<person>}; # family fdefinition

main { 

# here we generate
/# a family #/

  m:person := "aaaaAAA";
  p:person := "aaabAAA", "bbBB0_i", 35;
  c1:person := "aaabAAA", "bbBB0_i", 1;
  c2:person := "aaadAAA", "bbBB0_i", 2;
  c3:person := "aaaeAAA", "bbBB0_i", 3;

  f:family := m,p,[c1,c2];
  f.children := f.children :: [c3];

  return;
}

main {
  input:string := "abc";
  i:int := 0;
  while( input = "q" ) do 
    read input;
    a[i] := input;
    i := i + 1;
  od
    
  b:dict<top,top> := invert(a);

  return;
}

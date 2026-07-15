program v3;

var
	randnum : Integer;
	integ: Integer;
	range: Integer;

begin
	Randomize;


	writeln('The Lamest Guessing Game!');
	write('RANGE: ');
	readln(range);

	while True do
		begin
			randnum := Random(range);
			
			write(LineEnding, 'GUESS: ');
			readln(integ);
			
			if integ = randnum then
				begin
					writeln('YOU WIN!', LineEnding);
					break;
				end
			
			else
				begin
					writeln('YOU LOST!', LineEnding);
				end;
		end;
end.

program v3;

uses
	sysutils;

var
	randnum : Integer;
	integ: Integer;
	range: Integer;

begin
	Randomize;


	writeln('The Lamest Guessing Game!');
	Sleep(500);
	write('RANGE: ');
	readln(range);

	while True do
		begin
			randnum := Random(range);
			
			Sleep(300);
			write(LineEnding, 'GUESS: ');
			readln(integ);
			
			if integ = randnum then
				begin
					Sleep(700);
					writeln('YOU WIN!', LineEnding);
					break;
				end
			
			else
				begin
					Sleep(700);
					writeln('YOU LOST!', LineEnding);
				end;
		end;
end.

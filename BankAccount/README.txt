OPGAVER:

1. Implementér metoden `hæveFraKonto` i klassen `BankAccount`:
    - Metoden skal tage et beløb som parameter (`hæveBeløb`) og trække dette beløb fra kontosaldoen (`saldo`).

2. Opret en ny metode i klassen `BankAccount` kaldet `indsætPåKonto`:
    - Metoden skal tage et beløb som parameter og lægge dette beløb til kontosaldoen (`saldo`).
    - Sørg for, at beløbet, der indsættes, er positivt. Hvis det ikke er det, skal 
      der udskrives en besked til brugeren, og saldoen skal forblive uændret.

3. Når du har implementeret metoden `indsætPåKonto`, skal du udkommentere de relevante linjer i `Main.java` 
   (de linjer, der allerede er skrevet, men udkommenteret), så brugeren kan indsætte penge på kontoen.

4. Test din løsning ved at køre programmet og sikre, at både hævning og indsættelse fungerer korrekt.

EKSTRA OPGAVER:
5. Udvid metoden `hæveFraKonto` i klassen `BankAccount`:
    - Sørg for, at det ikke er muligt at hæve et beløb, der overstiger kontosaldoen (`saldo`).
    - Hvis brugeren forsøger at hæve et for stort beløb, skal der udskrives en besked som: 
      "Ikke nok penge på kontoen til at hæve det ønskede beløb."
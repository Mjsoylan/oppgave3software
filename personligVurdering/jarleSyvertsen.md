# Jarle Syvertsen
## Personlig tanker
### Programmering
Det er flere praktiske løsninger jeg har blande følelser om, men
siden jeg har hatt hånd i å designe og implementere mesteparten
av all kode, fra SQL opp til Javascripten i vue, er det en del rå
kode å dekke. Legger ved noen kommentarer på de punktene jeg 
har tenkt mest på:

#### SQL
Implementert før vi engang kom til ORM, jeg har vist dette
var en greie, men foretrakk å holde meg til noe jeg hadde en 
gitt grunnkunnskap om. 

Ser i etterkant at ting som JINQ (for
automatisk bygging av query fra høyt opp i koden), og mindre
arbeid med å oversette modellene hadde vært en stor fordel.
Må dog si det har vært ganske morsomt å lære og jobbe rundt SQLen
direkte, så angrer ikke for å ha prøvd i praksis.

Skulle også ha gått over til preparedStatements med setters
av de forskjellige verdiene for bedre beskyttelse mot injections.
Tenkte det ikke er relevant for akuratt presentasjonen av en
MVP, derimot.

#### Tester
Usikker på om det ble en god blanding av unit tests
(anser DB-testene som units, selvom det er en dependency
på DB, som er "ekstern".) og use-case tester som er mer 
integrasjonsrettet. 

Det er sannsynligvis også noen JavalinTest
funksjoner som kunne gjort det mindre nødvendig å konvertere
til klasser slik at jeg ikke måtte JSON behandle resultatene 
for testing. 

På den positive siden får jeg testet alle API
kallene som faktisk blir brukt av en bruker på en måte som 
er veldig lik den faktiske usecasen med riktig POST input og alt,
så temmelig fornøyd med det.

Det er et periodisk problem med okHTTP3 kallene som gjør at
vi kan få advarsler om "leaks" av en Response body, dette
forsette å skje uansett om jeg benytter close eller autocloseable
via try-with-resources, som jeg er skuffet over å ikke finne en løsning
for, men debugging av dette faller noe utenfor scopet av en MVP, tenker jeg.

### Skriving
Har fått tid til å produsere både en god mengde innhold på skriving,
og tatt ansvaret for formatering av slutt produktet (beklager på forhånd.)

#### Definisjon av programmet
Føler at introduksjonsdelen kanskje krysser for fort i å definere
forskjellige ledd, men føler at denne "komponent tenkingen" fort
formidler de gitte oppgavene som skal utføres i systemet.
Kanskje noe uønsket overlapping med systemfunksjonalitet.

#### Praktiske begrensninger
Noe usikkerhet på gitte punkter som "praktiske begrensninger til systemet". Der
dette faller litt på grenseland mellom ren teoretisk kravspesifikasjon,
og faktiske begrensninger vi fant ved utvikling av systemet.

#### Krav - Funksjonelle
Usikker også på om tonen og mengden av kravene, og spesielt ID-givningen
er god. Det føles alltid ut som flere underkrav kan introduseres, og om vi
dekker det relevante. Siden denne deler en noe der alle har kommet med krav
i større eller mindre grad, og jeg siden har kommet med forklaringer for å gi dybde
til noen av svarene, kan det komme fram noe intern konflikt blant ideer.

Noe usikker på om flere use-case tester skal kunne bygges, eller om
vi skulle sløyfe noen punkter som ikke lar seg teste i systemet 
for å ha bedre 1-1 med test og krav. Føler derimot at
det ikke faller naturlig å bare rette kravene mot en MVP.
#### Krav - Ikke funksjonelle
Stått for denne selv, så det er noe større grad av "en-stemme", men
igjen, føler meg litt usikker til slutt på om dybden og fokuset 
av kravene er helt på rett sted.

#### System-funksjoner
Føler en konkret definisjon av systemets funksjoner virker naturlig i 
spesifikasjonen, spesielt når jeg ser noen maler gjøre bruk av den.
Ikke helt sikker på om det er en riktig måte å definere dem på, og 
om dette gjenforteller deler av introduksjonen til programmet, og krav.

Ellers noe fornøyd med denne.

#### Bruk av systemet
Føler denne delen ble noe lang, men vi hadde som punkt å forklare
for noen ikke tenkniske, så tenkte det var bedre å gi for mye
informasjon en for lite.
## Feedback til andre
### Heljar Andreas Nilsen Korbi
God domene kunnskap om biler, så det var meget nyttig å ha en som
tidlig tok ansvar om at vi faktisk registrerte relevant informasjon
om biler. Var meget villig til å lære seg plantUML for å matche
resten av diagrammene til gruppa, samt å ta seg av deler
av brukerstories.


### Tim Didrik Asbjørnsen Sandmark
Tok personlig ansvar for å gjøre om våre tidligere utkast
av gruppesamtaler til et ordentlig dokument. Definerte alle
funksjonelle kravpunkter ut fra brukerkrav, og var meget
selvstendig i å produsere gode diagrammer.

### Mads Joakim Gohlke Søyland 
Ivrig til å diskutere programløsninger, produsert mesteparten av
CSSen utenfor innleggslisten+innlegg (jeg er glad i grid+flex).
Gjorde en stor innsats i å gjøre de tidlige "API-preview punktene"
til faktiske grensesnitt noen kan bruke.

Også tatt alt av sidedesign som logoer, headers, footers, etc.
Veldig kjekt å ha noen med interesse i gjøre de visuelle greiene.

Meget aktiv i gruppesamtaler og var på å ta administrative ting
som bestilling av grupperom, oppsett av gruppe-discord, og andre
ting som er nyttig utenfor oppgaven.

# README - Middle Earth Army API
Descriere
Această aplicație oferă un API simplu pentru gestionarea batalioanelor și creaturilor din Middle Earth.

Pas cu pas - Ordinea operațiilor recomandate

Creare batalion > Afisare Toate Batalioanele pentru a lua indexul > Adaugare Creatura la batalion > Afiseaza Toate Creaturile (Optional) > Afiseaza Creaturi si Batalioane (Optional)

Creare Batalion
Endpoint: POST /army/createBattalion?type={type}
Exemplu: POST http://localhost:8080/army/createBattalion?type=elf
Descriere: Creează un batalion nou de tip specificat (elf, gnome, ent).

Adăugare creatură la batalion
Endpoint: POST /army/addCreatureToBattalion?battalionIndex={index}&type={type}&name={name}&health={health}&attackPower={attackPower}
Exemplu: POST http://localhost:8080/army/addCreatureToBattalion?battalionIndex=0&type=elf&name=Legolas&health=100&attackPower=80


Afișare toate batalioanele și creaturile din ele
Endpoint: GET /army/showAllBattalionsAndCreatures
Exemplu: GET http://localhost:8080/army/showAllBattalionsAndCreatures


Afișare toate batalioanele
Endpoint: GET /army/showAllBattalions
Exemplu: GET http://localhost:8080/army/showAllBattalions

Afișare toate creaturile din armată
Endpoint: GET /army/showAllCreatures
Exemplu: GET http://localhost:8080/army/showAllCreatures

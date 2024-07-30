# Simulaattori

Simulaattori lentokentän kävijöiden turvatarkastuksen simuloimiseen. Tämä on kurssin harjoitustyö, joten arvot ja tulokset eivät perustu todellisuuteen. Tekemiseen osallistui useampi opiskelija.

# Käynnistäminen

Projekti käynnistyy ajamalla tiedosto src/simulaattorinrunko5FX/src/Main.java. Ennen käynnistämistä on luotava MariaDB-tietokanta nimellä simulaattori, ja luotava käyttäjätunnus ja salasana tietokannan käyttämistä varten. Tämän jälkeen tiedot tulee lisätä src/META-INF kansion persistence.xml-tiedostoon: käyttäjätunnuksesi kohtaan kayttajatunnus ja salasanasi kohtaan salasana. Jos haluat, että tiedot pysyvät tietokannassa ohjelman sulkemisen jälkeenkin, muuta persistence.xml-tiedoston "drop-and-create"-arvo "update"-arvoksi. Testejen ajamista varten Java Build Pathiin tulee lisätä JUnit kirjasto. Ohjelman käyttämiseen IDE:ssä tätä kirjastoa ei kuitenkaan tarvita.

# TelegramBot

TELEGRAM BOT ANALISI
 per la Gestione della Reperibilità di Strumenti Musicali

 Introduzione

Questo documento offre un'analisi approfondita per lo sviluppo di un Telegram Bot che ha lo scopo di gestire la reperibilità di strumenti musicali come chitarre, bassi, contrabbassi, batterie e saxofoni. L'obiettivo principale è fornire informazioni precise e dettagliate agli utenti sfruttando un database MySQL tramite un web scraper. Questo sistema consentirà agli utenti di verificare la disponibilità, la localizzazione e altre informazioni relative a questi strumenti musicali.
https://www.thomann.de/it/index.html 

Contesto

Il bot si rivolge a musicisti e appassionati di strumenti musicali che vogliono consultare informazioni riguardanti la reperibilità o la disponibilità di determinati strumenti in base a località, preferenze personali o dettagli tecnici. L'intento è semplificare la ricerca e l'accesso a questi dati, attraverso un'interfaccia rapida ed efficace.

Obiettivi del Software

Fornire accesso a informazioni sulla reperibilità degli strumenti musicali: Offrire agli utenti un'interfaccia interattiva per verificare la disponibilità dei bassi, contrabbassi, chitarre, batterie e sassofoni in vari negozi e località.
Automatizzare la ricerca delle informazioni relative alla reperibilità: Consentire agli utenti di effettuare ricerche rapide senza dover visitare siti diversi manualmente.
Creare un'esperienza accessibile per tutti gli utenti.

Requisiti del Sistema

Requisiti non funzionali (qualità):
La risposta del bot deve essere rapida.
I dati forniti devono essere accurati e verificabili.

Funzionalità
Il bot Telegram offrirà le seguenti funzionalità principali:

Ricerca Strumenti Musicali:
Gli utenti possono effettuare ricerche sulla reperibilità di uno strumento musicale specifico tramite una query diretta.
Consulta la Disponibilità Locale:L'utente può filtrare le ricerche in base alla località per ottenere informazioni specifiche sulla reperibilità regionale.
Visualizzazione Dettagliata:
Oltre alla disponibilità, fornire informazioni su caratteristiche, marca, modello e dettagli tecnici di ciascun strumento.
Gestione Profili Utente:
Consentire agli utenti di salvare preferenze personali e storici di ricerca.


Architettura del Sistema


Componenti principali del sistema:
- Telegram Bot:
Responsabile dell'interfaccia con l'utente, riceve richieste e invia risposte personalizzate.
-API Telegram:
Funziona come ponte per comunicare con l'utente e tradurre i comandi in richieste al server.
-Web Scraper:
Si occupa di estrarre periodicamente dati da siti web specializzati o piattaforme di vendita di strumenti musicali.
-Database MySQL:
Memorizza informazioni aggiornate sulla reperibilità degli strumenti, dettagli tecnici, informazioni sui negozi e i dati derivati dallo scraping.
-Interfaccia Utente (Telegram):
L'app Telegram è l'ambiente principale attraverso cui l'utente interagisce con il bot.


Tecnologie Utilizzate

Linguaggi di Programmazione
-Java: Utilizzato per la logica principale del bot, l'elaborazione delle richieste e la connessione con il database.
-Database MySQL: Sistema di gestione dei dati utilizzato per mantenere informazioni aggiornate e strutturate.

Librerie e Strumenti

-TelegramBots Java:
Libreria ufficiale per comunicare con l'API di Telegram. https://github.com/rubenlagus/TelegramBots?authuser=0



JSoup:
Utilizzato per il web scraping da siti di riferimento al fine di aggiornare automaticamente il database.
https://jsoup.org/

Modello E-R e Schema del Database

Entità principali
Utente: Contiene informazioni sull'utente che interagisce con il bot.

Campi: ID_utente, nome, preferenze.
Strumenti Musicali: Contiene informazioni relative agli strumenti come chitarre, batterie, ecc.

Campi: ID_strumento, tipo, marca, modello, caratteristiche tecniche.

Negozi e Rivenditori: Memorizza informazioni sui negozi fisici o online in cui reperire gli strumenti.

Campi: ID_negozio, nome, indirizzo, contatti.
Reperibilità: Contiene informazioni aggiornate sulla quantità e disponibilità in ciascun negozio.

Campi: ID_disponibilita, ID_strumento, ID_negozio, data, quantità.

Interfacce Utente
L'interfaccia è implementata direttamente su Telegram, attraverso bottoni interattivi e comandi rapidi

Comandi principali
/start: Avvia la conversazione con il bot e illustra le sue funzionalità principali.
/cerca [strumento]: Permette di effettuare una ricerca per verificare la reperibilità di uno strumento.
/suggerisci: Consiglia strumentali correlati in base agli interessi e ai comportamenti precedenti dell'utente.
/aiuto: Mostra la lista dei comandi disponibili e il loro utilizzo.
/profilo: Consente di gestire le preferenze e configurare il proprio profilo.

Conclusioni
Il Telegram Bot rappresenterà uno strumento interattivo per consentire agli utenti di reperire informazioni sulla disponibilità di strumenti musicali con facilità. Attraverso l'integrazione con un database aggiornato tramite scraping periodico e un'interfaccia intuitiva, l'applicazione risponderà alle esigenze di musicisti, appassionati e professionisti del settore musicale, promuovendo un'esperienza rapida, chiara e personalizzata.


(ho fatto un casino ma nella cartella del progetto ci sarebbero due cartelle relative rispettivamente alle librerie 'mysql-connector-j-9.1.0.3' e 'telegramBots-8.2.0')

# JavaEnterpriseBeans

EJB : Enterprise JavaBeans
Utvecklat av IBM 1997 och togs över av Sun Microsystems som släppte EJB 1.0 år 1999.
EJB är en del av Java EE-specifikationen. EJB är en standard för server-side(back-end)-mjukvara.

Det finns Session Beans (Stateless, Stateful och Singleton), Entity Bean samt Message Driven Beans.
Vad har man dessa till?
....
...

En session representeras av ett HttpSession-objekt. Användare som öppnar en sida tilldelas ett id i ett Session-object. 
Anropa getSession på en request för att få sessionen.
En Session Beans data sparas inte i en databas.

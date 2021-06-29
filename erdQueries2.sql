Select distinct(app.PROFILE_ID),ati.TICKET_ID,app.first_name,app.address,count(ati.TICKET_ID) as no_of_tickets
From air_flight af join air_passenger_profile app join air_ticket_info ati 
on ati.FLIGHT_ID=af.FLIGHT_ID and ati.PROFILE_ID=app.PROFILE_ID
where af.AIRLINE_NAME='Malaysian Airlines' group by app.PROFILE_ID
having count(ati.TICKET_ID) in (select max(t.top) from 
(select count(ati.TICKET_ID) as top 
from air_flight af join air_passenger_profile app join air_ticket_info ati 
on ati.FLIGHT_ID=af.FLIGHT_ID and ati.PROFILE_ID=app.PROFILE_ID
where af.AIRLINE_NAME='ABC Airlines' group by app.PROFILE_ID)as t);
select eu.unique_id, em.name 
from employees em left join employeeUNI eu on em.id = eu.id;

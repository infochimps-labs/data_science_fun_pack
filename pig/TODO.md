

* bytes	  		in	out
* records 		in	out
* groups  		in	out

* subcomponents
* time			overall 	processing 	overhead	wait
  effective rec/s	overall 	processing 	overhead	wait
  effective MB/s	overall 	processing 	overhead	wait


	map jobs	number
			throughput
			non-local
			spills per record
			% 2nd attempt
			% 3rd attempt

	feature/bolt 	...
	attempt/executor 	...
	 	...

	trident func
	executor
	bolt
	worker


Execunit: name; location; bytes; records; status; is_successful, schema

Times:

* per window



Startup        	x
Map        	x
Combine        	x
Fetch        	x
Group/Sort    	x
Reduce        	x
Write    	x
Commit    	x
--------	
Overall        	x

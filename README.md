# Data Science Fun Pack


Meta-repository of big data tools -- source and essential plugins for hadoop, pig, wukong, storm, kafka etc.

### Justification

This meta-repo will clone the essential components

Also, I hate figuring out what stupid `src/main/java/org/with/lots/of/dirs` or `java/src/main` or whatever. So there's a `browse` directory that links to the most-likely-to-be-interesting directory.

### Things it doesn't do

* We aren't trying to link to every tool in the space, but only to stuff we have found useful or promising.
* build everything from scratch. (Pull request encouraged!)

## Included

### Hadoop

* **hadoop-common**    -- Hadoop (Core Framework)
* **hadoop-mapreduce** -- Hadoop (Distributed Computation)
* **hadoop-hdfs**      -- Hadoop (Distributed File System)
* **mahout**	       -- machine learning on Hadoop
* **hive**             -- High-level interface to hadoop
* **crunch**           -- data science on Hadoop

### Scalable Datastores

* **elasticsearch**    -- full-text datastore of joy
* **hbase**            -- store a billion of y'know whatever

### Math

* **R**
* **Julia**


### Dataflow frameworks

* **storm**
* **kafka**


### Data

* **wukong-example-data**

## Support

Tools that are needed to make the other tools work

### Gems, Jars and Utilities

* **addressable**


RedCloth
bundler
forgery
guard
guard-rspec
guard-yard
highline
htmlentities
jeweler
json
kramdown
multi_json
oj
perftools.rb
pry
rake
rb-fsevent
redcarpet
rspec
simplecov
uuidtools
yard

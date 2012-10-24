# Data Science Fun Pack

A meta-repository of big data tools

### Justification

Here are the source code for the major pieces of a data science platform (hadoop, pig, wukong, storm, kafka, etc), and their essential plugins. 

Clone it so you have all the source at hand -- to track development, to steal ideas from, or because you're getting on an airplane in ten minutes. The `browse` directory links to the most-likely-to-be-interesting directory, so you don't spend time trying to figure out if it's `src/main/java/org/with/lots/of/dirs` or `java/src/main` or what.

### Things it doesn't do

* It's not a link to every tool in the space -- only repos we've found useful or promising.
* It doesn't build everything from scratch, or have a complete set of dependencies. (Pull request encouraged!)

## Included

### Hadoop

* **hadoop-common**    -- Hadoop (Core Framework)
* **hadoop-mapreduce** -- Hadoop (Distributed Computation)
* **hadoop-hdfs**      -- Hadoop (Distributed File System)
* **mahout**	       -- machine learning on Hadoop
* **hive**             -- High-level interface to hadoop
* **crunch**           -- data science on Hadoop

### Pig

* **pig**              -- the tool itself
* **piggybank**        -- the official contrib set of Pig UDFs
* **piggychimp**       -- Pig UDFs from infochimps-labs
* **sounder**          -- Pig UDFs from Jacob Perkins (@thedatachef)
* **datafu**           -- Pig UDFs from linkedin

### Scalable Datastores

* **elasticsearch**    -- full-text datastore of joy
* **hbase**            -- store a billion of y'know whatever

### Math

* **R**                -- statistics, tried and true, written by statisticians (unfortunately, written by statisticians)
* **Julia**            -- statistics, exciting and new, written by programmers (unfortunately, exciting and new)

### Dataflow frameworks

* **kafka**            -- real-time data delivery
* **storm**            -- real-time data analytics

### Data

* **wukong-example-data** -- useful tables and interesting datasets, from country codes to UFO sightings

## Support Gems, Jars and Utilities

Tools that are needed to make the other tools work

### Ruby gems

* **addressable**
* **bundler**
* **guard**, guard-rspec, guard-yard
* **uuidtools**
* **htmlentities**
* **oj**

(other dependencies: RedCloth forgery highline jeweler json kramdown multi_json perftools.rb pry rake rb-fsevent redcarpet rspec simplecov yard)

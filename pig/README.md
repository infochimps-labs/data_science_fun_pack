



* Schematized JSON loader: 
  - must declare types; outermost must be a bag
  - inside a map, arrays become bags 
  - 
  
* JSON-decode a string

* Move pigsy layout to be
  -
  - src/java/pigsy/pig
  - test/pig/pigsy/test/pig
* 


* [space-piggies](https://github.com/cstenac/space-piggies/tree/master/src/main/java/org/apache/pig/piggybank/evaluation/spatial) -- LineFromMultipoint, LineFromMultipointLatLon.java, MultiIntersectionComputer.java, Polygonize.java
* [bacon](https://github.com/aaronbinns/bacon.git) -- language recognition & other linguistic modules
* [pigitos](https://github.com/kawaa/Pigitos/tree/master/src/main/java/pl/ceon/research/pigitos/pig/udf) -- MapEntriesToBag.java MapFieldToBag.java MapKeysToBag.java MapSize.javaMapValuesToBag.java
* [PigBAT](https://github.com/jkebinger/PigBAT/tree/master/src/main/java/com/kebinger/pigbat) -- decode shorts, ints, and longs from byte arrays in pig
* [ThinkBigAnalytics-Pig-Extension](https://github.com/ThinkBigAnalytics/ThinkBigAnalytics-Pig-Extension/tree/master/src/main/java/thinkbig/pig/udf) -- IndexInBag, TupleToBag
* [white-elephant](https://github.com/whitepages/white-elephant/tree/master/src/main/java/com/whitepages/white-elephant) -- BagToMap Digestify EditDistance In Median NonNull Now SplitIndexer TupleToJson

* [datafu](https://github.com/linkedin/datafu/tree/master/src/java/datafu)

	datafu/pig/bags/AliasBagFields
	datafu/pig/bags/AppendToBag
	datafu/pig/bags/BagConcat
	datafu/pig/bags/BagSplit
	datafu/pig/bags/DistinctBy
	datafu/pig/bags/Enumerate
	datafu/pig/bags/FirstTupleFromBag
	datafu/pig/bags/NullToEmptyBag
	datafu/pig/bags/PrependToBag
	datafu/pig/bags/ReverseEnumerate
	datafu/pig/bags/sets/SetIntersect
	datafu/pig/bags/sets/SetOperationsBase
	datafu/pig/bags/sets/SetUnion
	datafu/pig/bags/UnorderedPairs
	datafu/pig/date/TimeCount
	datafu/pig/geo/HaversineDistInMiles
	datafu/pig/hash/MD5
	datafu/pig/hash/MD5Base64
	datafu/pig/linkanalysis
	datafu/pig/linkanalysis/PageRank
	datafu/pig/numbers/RandInt
	datafu/pig/sessions/Sessionize
	datafu/pig/stats/ApplyQuantile
	datafu/pig/stats/DoubleVAR
	datafu/pig/stats/FloatVAR
	datafu/pig/stats/IntVAR
	datafu/pig/stats/LongVAR
	datafu/pig/stats/MarkovPairs
	datafu/pig/stats/Median
	datafu/pig/stats/Quantile
	datafu/pig/stats/QuantileUtil
	datafu/pig/stats/StreamingMedian
	datafu/pig/stats/StreamingQuantile
	datafu/pig/stats/VAR
	datafu/pig/stats/WilsonBinConf
	datafu/pig/urls/UserAgentClassify
	datafu/pig/util/ASSERT
	datafu/pig/util/BoolToInt
	datafu/pig/util/IntToBool
	datafu/pig/util/SimpleEvalFunc
	datafu/linkanalysis/PageRank


* https://github.com/ogrisel/pignlproc/tree/master/src/main/java/pignlproc

* others:
  - https://github.com/jeromatron/pygmalion/blob/master/udf/src/main/java/org/pygmalion/udf/uuid/GenerateTimeUUID.java
  - https://github.com/jeromatron/pygmalion/blob/master/udf/src/main/java/org/pygmalion/udf/RangeBasedStringConcat.java



AggregateTextBag.java	a year ago	reduce default size limit for AggregateTextBag [ogrisel]
CheckAbstract.java	a year ago	reduce be more tolerant with articles with short abstracts [ogrisel]
ConcatTextBag.java	a year ago	remove duplicate paths [ogrisel]
MergeAsOpenNLPAnnotatedText.java	2 years ago	ENH: use SimpleTokenizer instead of Maximum Entropy tokenizer model a… [ogrisel]
NoLoopInPath.java	a year ago	filter out loops in grounded paths [ogrisel]
SafeTsvText.java	2 years ago	index ground topics main articles directly [ogrisel]
SentencesWithLink.java


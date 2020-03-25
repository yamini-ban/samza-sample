name := "hello-world"

version := "0.1"

scalaVersion := "2.12.10"

val samzaVersion = "1.0.0"
val samzaCore = "org.apache.samza" %% "samza-core" % samzaVersion
val samzaKv = "org.apache.samza" %% "samza-kv" % samzaVersion
val samzaKvInMem = "org.apache.samza" %% "samza-kv-inmemory" % samzaVersion
val samzaKvRocksdb = "org.apache.samza" %% "samza-kv-rocksdb" % samzaVersion
val samzaKafka = "org.apache.samza" %% "samza-kafka" % samzaVersion
val slf4j = "org.slf4j" % "slf4j-api" % "1.7.30"
val typesafe = "com.typesafe" % "config" % "1.4.0"
// samza-log4j is only built with 2.11, hence it implicitly pulls samza-core_2.11
// in. :  val samzaLog4j = "org.apache.samza" % "samza-log4j" % samzaVersion exclude ("org.apache.samza", "samza-core_2.11")
libraryDependencies ++= Seq(
  samzaCore
  , samzaKv
  , samzaKvInMem
  , samzaKvRocksdb
  , samzaKafka
  , typesafe
)

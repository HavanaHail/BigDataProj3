import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql._
//import org.apache.spark.sql.functions.{filter, select, $}
object WordCount {

  def main(args: Array[String]): Unit = {

    val sparConf = new SparkConf().setMaster("local").setAppName("WordCount")


    val sc = new SparkContext(sparConf)

    val data: RDD[String] = sc.textFile("/Users/haile/IdeaProjects/Scala_WordCount/data/people_some_infected.csv")

    //val notInfectedRDD = data.orderBy(line => line.split(",")(3) == "yes")
    //val notInfectedCount = notInfectedRDD.count()

    //println(notInfectedCount)

    //resultArray.count(println)


    sc.stop()
  }
}

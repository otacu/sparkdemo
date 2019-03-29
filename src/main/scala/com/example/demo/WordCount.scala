package com.example.demo

import org.apache.spark.{SparkContext, SparkConf}

object WordCount {
  def main(args: Array[String]) {
//    val conf=new SparkConf().setAppName("wordcount")
//    val sc=new SparkContext(conf)
//    val input=sc.textFile("/home/spark-projects/demo/helloSpark.txt")
//    val lines=input.flatMap(line=>line.split(" "))
//    val count=lines.map(word=>(word,1)).reduceByKey{case (x,y)=>x+y}
//    val output=count.saveAsTextFile("/home/spark-projects/demo/helloSparkResult.txt")
      println("helloworld")
  }
}

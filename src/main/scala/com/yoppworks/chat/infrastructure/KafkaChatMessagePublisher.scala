package com.yoppworks.chat.infrastructure

import akka.actor.ActorSystem
import akka.kafka.ProducerSettings
import akka.kafka.scaladsl.Producer
import akka.stream.ActorMaterializer
import com.yoppworks.chat.domain.{ ChatMessage, ChatMessagePublisher }
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.{ByteArraySerializer, StringSerializer }
import akka.stream.scaladsl.Source
import scala.concurrent.ExecutionContext.Implicits.global

class KafkaChatMessagePublisher(implicit val system: ActorSystem) extends ChatMessagePublisher {

  def one(message: ChatMessage) = ???

}
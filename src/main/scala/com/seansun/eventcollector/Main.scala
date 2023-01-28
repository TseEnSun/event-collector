package com.seansun.eventcollector

import cats.effect.{ExitCode, IO, IOApp}
import com.seansun.eventcollector.http.EventCollectorServer

object Main extends IOApp.Simple:
  def run: IO[Unit] =
    EventCollectorServer.stream[IO].compile.drain.as(ExitCode.Success)


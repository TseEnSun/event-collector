package com.seansun.eventcollector

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp.Simple:
  def run: IO[Unit] =
    EventcollectorServer.stream[IO].compile.drain.as(ExitCode.Success)


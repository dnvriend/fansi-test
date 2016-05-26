package com.github.dnvriend

import fansi._

object Launch extends App {
  val colored: fansi.Str = fansi.Color.Red("Hello World Ansi!")
  // Or fansi.Str("Hello World Ansi!").overlay(fansi.Color.Red)
  println(colored)

  val length = colored.length // Fast and returns the non-colored length of string

  val blueWorld = colored.overlay(fansi.Color.Blue, 6, 11)
  println(blueWorld)

  val underlinedWorld = colored.overlay(fansi.Underlined.On, 6, 11)
  println(underlinedWorld)

  val underlinedBlue = blueWorld.overlay(fansi.Underlined.On, 4, 13)
  println(underlinedBlue)

  val greenHelloWorld = fansi.Color.Green("HelloWorld!")
  println(greenHelloWorld)

  val greenHelloWorldBold = greenHelloWorld.overlay(Bold.On)
  println(greenHelloWorldBold)
}

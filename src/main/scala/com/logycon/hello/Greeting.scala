package com.logycon.hello

import scala.beans.BeanProperty

case class Greeting(@BeanProperty message: String)

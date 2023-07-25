
class MyTVListener : TVSetupBoxListener, RemoteListener {
    override fun onPowerOn() {
        println("TV is powered on")
    }

    override fun onPowerOff() {
        println("TV is powered off")
    }

    override fun onChannelChange(channel: Int) {
        println("TV channel changed to $channel")
    }

    override fun onPowerButtonPressed() {
        println("Remote power button pressed")
    }

    override fun onNumberButtonPressed(number: Int) {
        println("Remote number button $number pressed")
    }
}


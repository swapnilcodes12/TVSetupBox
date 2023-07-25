class TVSetupBox(private val listener: TVSetupBoxListener) {
    var isPoweredOn = false
    private var currentChannel = 0

    fun powerOn() {
        isPoweredOn = true
        listener.onPowerOn()
    }

    fun powerOff() {
        isPoweredOn = false
        listener.onPowerOff()
    }

    fun changeChannel(channel: Int) {
        if (isPoweredOn && channel >= 0) {
            currentChannel = channel
            listener.onChannelChange(channel)
        }
    }
}


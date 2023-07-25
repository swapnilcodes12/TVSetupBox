
class Remote(private val setupBox: TVSetupBox, private val listener: RemoteListener){
    fun powerButtonPressed(){
        if (setupBox.isPoweredOn){
            setupBox.powerOff()
        }else{
            setupBox.powerOn()
        }
        listener.onPowerButtonPressed()
    }
    fun numberButtonPressed(number: Int){
        setupBox.changeChannel(number)
        listener.onNumberButtonPressed(number)
    }
}
package com.example.cities_mobile_dubl2.viewmodel

class SettingsViewModel : ViewModel() {
    private val _isFahrenheit = MutableStateFlow(false)
    val isFahrenheit: StateFlow<Boolean> = _isFahrenheit

    fun setTemperatureUnit(isFahrenheit: Boolean) {
        _isFahrenheit.value = isFahrenheit
    }
}

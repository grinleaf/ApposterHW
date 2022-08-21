package com.example.apposterhw

class WatchResponse{
    val count = 0
    val watchSells = WatchSells()
}

class WatchSells { var watch = Watch() }

class Watch{ val images = WatchImages() }

class WatchImages{ val preview = Preview() }

class Preview{ val preview = "" }
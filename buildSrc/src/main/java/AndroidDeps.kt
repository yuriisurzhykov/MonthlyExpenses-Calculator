object AndroidDeps {
    const val AndroidCoreX = "androidx.core:core-ktx:${AndroidVersions.AndroidCoreX}"
    const val AndroidXCompat = "androidx.appcompat:appcompat:${AndroidVersions.AndroidXCompat}"
    const val Material = "com.google.android.material:material:${AndroidVersions.Material}"
    const val ConstraintLayout =
        "androidx.constraintlayout:constraintlayout:${AndroidVersions.ConstraintLayout}"

    const val Room = "androidx.room:room-runtime:${AndroidVersions.Room}" // Main deps
    const val RoomKtx = "androidx.room:room-ktx:${AndroidVersions.Room}" // Coroutine support
}
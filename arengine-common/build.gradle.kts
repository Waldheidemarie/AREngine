plugins {
    id("com.android.library")
    id("prieto.fernando.android.plugin")
}

dependencies {
    implementation(Dependencies.Huawei.arEngine)
    implementation(Dependencies.AndroidX.annotation)
    implementation(Dependencies.AndroidX.coreKtx)
}
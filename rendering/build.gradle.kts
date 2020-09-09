plugins {
    id("com.android.library")
    id("prieto.fernando.android.plugin")
}

dependencies {
    implementation(Dependencies.Huawei.arEngine)
    implementation(project(ProjectModules.arEngineCommon))
    implementation(Dependencies.Rendering.javaGlObject)
}
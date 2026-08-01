package io.ktor.utils.p131io;

/* JADX INFO: renamed from: io.ktor.utils.io.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3466f {
    /* JADX INFO: renamed from: a */
    public static final boolean m12938a() {
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}

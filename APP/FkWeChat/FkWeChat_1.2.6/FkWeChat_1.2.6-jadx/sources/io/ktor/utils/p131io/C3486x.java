package io.ktor.utils.p131io;

/* JADX INFO: renamed from: io.ktor.utils.io.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3486x extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486x(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        str.getClass();
    }
}

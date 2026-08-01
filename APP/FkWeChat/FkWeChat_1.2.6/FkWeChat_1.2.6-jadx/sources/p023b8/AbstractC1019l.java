package p023b8;

import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: b8.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019l {
    /* JADX INFO: renamed from: a */
    public static final Throwable m3760a(Throwable th, InterfaceC5976f interfaceC5976f) {
        th.getClass();
        interfaceC5976f.getClass();
        try {
            return AbstractC1018k.m3759a(th, th.getCause());
        } catch (Throwable unused) {
            return th;
        }
    }
}

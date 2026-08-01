package p371z7;

import p024b9.AbstractC1052o0;
import p086ff.InterfaceC2436d;

/* JADX INFO: renamed from: z7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9885c {
    /* JADX INFO: renamed from: a */
    public static final void m38365a(InterfaceC2436d interfaceC2436d, Throwable th) {
        interfaceC2436d.getClass();
        th.getClass();
        String message = th.getMessage();
        if (message == null) {
            message = "Exception of type " + AbstractC1052o0.m3807b(th.getClass());
        }
        interfaceC2436d.mo8808f(message, th);
    }
}

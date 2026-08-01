package p270s6;

import p086ff.InterfaceC2436d;

/* JADX INFO: renamed from: s6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7194d {
    /* JADX INFO: renamed from: a */
    public static final void m28428a(C7193c c7193c, C7191a c7191a, Object obj, InterfaceC2436d interfaceC2436d) {
        c7193c.getClass();
        c7191a.getClass();
        try {
            c7193c.m28425b(c7191a, obj);
        } catch (Throwable th) {
            if (interfaceC2436d != null) {
                interfaceC2436d.mo8808f("Some handlers have thrown an exception", th);
            }
        }
    }
}

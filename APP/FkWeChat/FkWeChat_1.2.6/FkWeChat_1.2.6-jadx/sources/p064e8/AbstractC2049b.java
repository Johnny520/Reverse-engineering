package p064e8;

import p215oc.C5708d;
import p215oc.InterfaceC5726u;
import p215oc.InterfaceC5728w;

/* JADX INFO: renamed from: e8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2049b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5726u m7391a() {
        return new C5708d();
    }

    /* JADX INFO: renamed from: b */
    public static final void m7392b(InterfaceC5726u interfaceC5726u, CharSequence charSequence, int i10, int i11) {
        interfaceC5726u.getClass();
        charSequence.getClass();
        AbstractC2053f.m7407f(interfaceC5726u, charSequence, i10, i11, null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7393c(InterfaceC5726u interfaceC5726u, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        m7392b(interfaceC5726u, charSequence, i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC5728w m7394d(InterfaceC5726u interfaceC5726u) {
        interfaceC5726u.getClass();
        return interfaceC5726u.mo23102b();
    }

    /* JADX INFO: renamed from: e */
    public static final int m7395e(InterfaceC5726u interfaceC5726u) {
        interfaceC5726u.getClass();
        return (int) interfaceC5726u.mo23102b().m23111j();
    }
}

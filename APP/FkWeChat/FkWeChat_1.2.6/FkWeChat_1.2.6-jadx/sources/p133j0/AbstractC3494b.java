package p133j0;

import p010a9.InterfaceC0173a;
import p015b0.AbstractC0834p5;
import p073f2.AbstractC2279z;
import p121i3.C3179i;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4548h2;
import p166l2.C4584s;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3494b {

    /* JADX INFO: renamed from: a */
    public static final float f9698a;

    /* JADX INFO: renamed from: b */
    public static final float f9699b;

    /* JADX INFO: renamed from: c */
    public static final C4584s f9700c;

    static {
        float fM12003k = C3179i.m12003k(40);
        f9698a = fM12003k;
        float fM12003k2 = C3179i.m12003k(10);
        f9699b = fM12003k2;
        f9700c = AbstractC4548h2.m17813a(fM12003k2, fM12003k, fM12003k2, fM12003k);
    }

    /* JADX INFO: renamed from: a */
    public static final C4584s m13021a() {
        return f9700c;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m13022b(InterfaceC4507m interfaceC4507m, boolean z10, boolean z11, InterfaceC0173a interfaceC0173a) {
        if (!z10 || !AbstractC3496d.m13028a()) {
            return interfaceC4507m;
        }
        if (z11) {
            interfaceC4507m = AbstractC2279z.m8295c(interfaceC4507m, AbstractC0834p5.m3147a(), false, f9700c);
        }
        return interfaceC4507m.mo17445i(new C3493a(interfaceC0173a));
    }
}

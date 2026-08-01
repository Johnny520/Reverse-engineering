package p274t;

import p080f9.AbstractC2368o;
import p165l1.InterfaceC4507m;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.d3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7821d3 implements InterfaceC7815c3 {

    /* JADX INFO: renamed from: a */
    public static final C7821d3 f26039a = new C7821d3();

    @Override // p274t.InterfaceC7815c3
    /* JADX INFO: renamed from: a */
    public InterfaceC4507m mo30258a(InterfaceC4507m interfaceC4507m, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            AbstractC8476a.m32537a("invalid weight; must be greater than zero");
        }
        return interfaceC4507m.mo17445i(new C7931z1(AbstractC2368o.m8581h(f10, Float.MAX_VALUE), z10));
    }
}

package p274t;

import p080f9.AbstractC2368o;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7818d0 implements InterfaceC7812c0 {

    /* JADX INFO: renamed from: a */
    public static final C7818d0 f26038a = new C7818d0();

    @Override // p274t.InterfaceC7812c0
    /* JADX INFO: renamed from: a */
    public InterfaceC4507m mo30255a(InterfaceC4507m interfaceC4507m, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            AbstractC8476a.m32537a("invalid weight; must be greater than zero");
        }
        return interfaceC4507m.mo17445i(new C7931z1(AbstractC2368o.m8581h(f10, Float.MAX_VALUE), z10));
    }

    @Override // p274t.InterfaceC7812c0
    /* JADX INFO: renamed from: b */
    public InterfaceC4507m mo30256b(InterfaceC4507m interfaceC4507m, InterfaceC4499e.b bVar) {
        return interfaceC4507m.mo17445i(new C7846i1(bVar));
    }
}

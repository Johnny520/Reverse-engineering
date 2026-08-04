package yyds;

import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᲁᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2101 extends C1612 {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ThreadLocal f10426;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2101(InterfaceC2213 interfaceC2213, InterfaceC0274 interfaceC0274) {
        C0463 c0463 = C0463.f2313;
        super(interfaceC2213.mo423(c0463) == null ? interfaceC2213.mo422(c0463) : interfaceC2213, interfaceC0274);
        this.f10426 = new ThreadLocal();
        if (interfaceC0274.mo733().mo423(C0135.f836) instanceof AbstractC0974) {
            return;
        }
        Object objM1832 = AbstractC0797.m1832(interfaceC2213, null);
        AbstractC0797.m1826(interfaceC2213, objM1832);
        m3996(interfaceC2213, objM1832);
    }

    @Override // yyds.C1612, yyds.AbstractC0986
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final void mo2147(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f10426.get();
            if (pair != null) {
                AbstractC0797.m1826((InterfaceC2213) pair.component1(), pair.component2());
            }
            this.f10426.remove();
        }
        Object objM1328 = AbstractC0476.m1328(obj);
        InterfaceC0274 interfaceC0274 = this.f8219;
        InterfaceC2213 interfaceC2213Mo733 = interfaceC0274.mo733();
        Object objM1832 = AbstractC0797.m1832(interfaceC2213Mo733, null);
        C2101 c2101M981 = objM1832 != AbstractC0797.f3657 ? AbstractC0319.m981(interfaceC0274, interfaceC2213Mo733, objM1832) : null;
        try {
            this.f8219.mo812(objM1328);
            if (c2101M981 == null || c2101M981.m3995()) {
                AbstractC0797.m1826(interfaceC2213Mo733, objM1832);
            }
        } catch (Throwable th) {
            if (c2101M981 == null || c2101M981.m3995()) {
                AbstractC0797.m1826(interfaceC2213Mo733, objM1832);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛳᛴᲇᛶ, reason: contains not printable characters */
    public final boolean m3995() {
        boolean z = this.threadLocalIsSet && this.f10426.get() == null;
        this.f10426.remove();
        return !z;
    }

    /* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
    public final void m3996(InterfaceC2213 interfaceC2213, Object obj) {
        this.threadLocalIsSet = true;
        this.f10426.set(new Pair(interfaceC2213, obj));
    }
}

package p000;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: jv */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0364jv implements InterfaceC0930yo {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5229h;

    /* JADX INFO: renamed from: i */
    public final Type f5230i;

    public /* synthetic */ C0364jv(int i, Type type) {
        this.f5229h = i;
        this.f5230i = type;
    }

    @Override // p000.InterfaceC0930yo
    /* JADX INFO: renamed from: e */
    public final Type mo2577e() {
        int i = this.f5229h;
        return this.f5230i;
    }

    @Override // p000.InterfaceC0930yo
    /* JADX INFO: renamed from: i */
    public final Object mo2578i(ct1 ct1Var) {
        switch (this.f5229h) {
            case 0:
                C0401kv c0401kv = new C0401kv(ct1Var);
                ct1Var.mo93b(new C0326iv(c0401kv, 0));
                return c0401kv;
            default:
                C0401kv c0401kv2 = new C0401kv(ct1Var);
                ct1Var.mo93b(new C0326iv(c0401kv2, 1));
                return c0401kv2;
        }
    }
}

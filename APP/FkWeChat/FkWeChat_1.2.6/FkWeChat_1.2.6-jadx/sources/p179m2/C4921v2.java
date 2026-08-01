package p179m2;

import java.util.List;
import p166l2.InterfaceC4583r1;
import p277t2.C8083m;

/* JADX INFO: renamed from: m2.v2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4921v2 implements InterfaceC4583r1 {

    /* JADX INFO: renamed from: q */
    public final int f14898q;

    /* JADX INFO: renamed from: r */
    public final List f14899r;

    /* JADX INFO: renamed from: s */
    public Float f14900s;

    /* JADX INFO: renamed from: t */
    public Float f14901t;

    /* JADX INFO: renamed from: u */
    public C8083m f14902u;

    /* JADX INFO: renamed from: v */
    public C8083m f14903v;

    public C4921v2(int i10, List list, Float f10, Float f11, C8083m c8083m, C8083m c8083m2) {
        this.f14898q = i10;
        this.f14899r = list;
        this.f14900s = f10;
        this.f14901t = f11;
        this.f14902u = c8083m;
        this.f14903v = c8083m2;
    }

    /* JADX INFO: renamed from: a */
    public final C8083m m19893a() {
        return this.f14902u;
    }

    /* JADX INFO: renamed from: b */
    public final Float m19894b() {
        return this.f14900s;
    }

    /* JADX INFO: renamed from: c */
    public final Float m19895c() {
        return this.f14901t;
    }

    /* JADX INFO: renamed from: d */
    public final int m19896d() {
        return this.f14898q;
    }

    /* JADX INFO: renamed from: e */
    public final C8083m m19897e() {
        return this.f14903v;
    }

    /* JADX INFO: renamed from: f */
    public final void m19898f(C8083m c8083m) {
        this.f14902u = c8083m;
    }

    /* JADX INFO: renamed from: g */
    public final void m19899g(Float f10) {
        this.f14900s = f10;
    }

    @Override // p166l2.InterfaceC4583r1
    /* JADX INFO: renamed from: g0 */
    public boolean mo17556g0() {
        return this.f14899r.contains(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m19900h(Float f10) {
        this.f14901t = f10;
    }

    /* JADX INFO: renamed from: i */
    public final void m19901i(C8083m c8083m) {
        this.f14903v = c8083m;
    }
}

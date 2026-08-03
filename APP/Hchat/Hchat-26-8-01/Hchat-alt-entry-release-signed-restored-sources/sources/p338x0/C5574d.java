package p338x0;

import java.util.List;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.C1836h0;
import p175m0.InterfaceC2703k0;
import p304uf.C4330d;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: x0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5574d implements InterfaceC2703k0, InterfaceC5559e {

    /* JADX INFO: renamed from: h */
    public static final C4330d f22700h = new C4330d(5);

    /* JADX INFO: renamed from: g */
    public final C1836h0 f22701g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5574d(C1836h0 c1836h0) {
        this.f22701g = c1836h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final /* bridge */ InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.InterfaceC2703k0
    /* JADX INFO: renamed from: f */
    public final List mo628f(Integer num) {
        return this.f22701g.m4507I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5559e
    public final InterfaceC5560f getKey() {
        return f22700h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.InterfaceC2703k0
    /* JADX INFO: renamed from: j */
    public final boolean mo632j() {
        return this.f22701g.f6078C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final /* bridge */ InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final /* bridge */ InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }
}

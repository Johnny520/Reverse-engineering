package p045d5;

import p032c5.C1329c;
import p032c5.C1335i;
import p032c5.C1336j;
import p032c5.C1337k;
import p094g5.InterfaceC2519b;
import p094g5.InterfaceC2520c;
import p094g5.InterfaceC2524g;
import p239q5.C6274y;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6521z;
import p269s5.C7186a;

/* JADX INFO: renamed from: d5.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1889k implements InterfaceC2524g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2524g f5257a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2520c f5258b;

    /* JADX INFO: renamed from: c */
    public final C1329c f5259c;

    /* JADX INFO: renamed from: d */
    public final C1892n f5260d;

    /* JADX INFO: renamed from: e */
    public final C1893o f5261e;

    public C1889k(InterfaceC2524g interfaceC2524g, InterfaceC2520c interfaceC2520c, boolean z10, boolean z11) {
        this.f5257a = interfaceC2524g;
        this.f5258b = interfaceC2520c;
        C1329c c1329c = (C1329c) interfaceC2524g.getAttributes().mo9028k("Code");
        this.f5259c = c1329c;
        InterfaceC2519b interfaceC2519bM5339b = c1329c.m5339b();
        C1892n c1892nM6792E = C1892n.f5268s;
        if (z10) {
            for (C1335i c1335i = (C1335i) interfaceC2519bM5339b.mo9028k("LineNumberTable"); c1335i != null; c1335i = (C1335i) interfaceC2519bM5339b.mo9029n(c1335i)) {
                c1892nM6792E = C1892n.m6792E(c1892nM6792E, c1335i.m5349b());
            }
        }
        this.f5260d = c1892nM6792E;
        C1893o c1893oM6800H = C1893o.f5271s;
        if (z11) {
            for (C1336j c1336j = (C1336j) interfaceC2519bM5339b.mo9028k("LocalVariableTable"); c1336j != null; c1336j = (C1336j) interfaceC2519bM5339b.mo9029n(c1336j)) {
                c1893oM6800H = C1893o.m6799E(c1893oM6800H, c1336j.m5354b());
            }
            C1893o c1893oM6799E = C1893o.f5271s;
            for (C1337k c1337k = (C1337k) interfaceC2519bM5339b.mo9028k("LocalVariableTypeTable"); c1337k != null; c1337k = (C1337k) interfaceC2519bM5339b.mo9029n(c1337k)) {
                c1893oM6799E = C1893o.m6799E(c1893oM6799E, c1337k.m5354b());
            }
            if (c1893oM6799E.size() != 0) {
                c1893oM6800H = C1893o.m6800H(c1893oM6800H, c1893oM6799E);
            }
        }
        this.f5261e = c1893oM6800H;
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: a */
    public C6492c0 mo6749a() {
        return this.f5257a.mo6749a();
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: b */
    public int mo6750b() {
        return this.f5257a.mo6750b();
    }

    @Override // p094g5.InterfaceC2524g
    /* JADX INFO: renamed from: c */
    public C7186a mo6751c() {
        return this.f5257a.mo6751c();
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: d */
    public C6496e0 mo6752d() {
        return this.f5257a.mo6752d();
    }

    @Override // p094g5.InterfaceC2523f
    /* JADX INFO: renamed from: e */
    public C6521z mo6753e() {
        return this.f5257a.mo6753e();
    }

    /* JADX INFO: renamed from: g */
    public C1886h m6754g() {
        return this.f5259c.m5340c();
    }

    @Override // p094g5.InterfaceC2523f
    public InterfaceC2519b getAttributes() {
        return this.f5257a.getAttributes();
    }

    @Override // p094g5.InterfaceC2523f
    public C6492c0 getName() {
        return this.f5257a.getName();
    }

    /* JADX INFO: renamed from: h */
    public C1888j m6755h() {
        return this.f5259c.m5341d();
    }

    /* JADX INFO: renamed from: i */
    public C1893o m6756i() {
        return this.f5261e;
    }

    /* JADX INFO: renamed from: j */
    public int m6757j() {
        return this.f5259c.m5342e();
    }

    /* JADX INFO: renamed from: k */
    public int m6758k() {
        return this.f5259c.m5343f();
    }

    /* JADX INFO: renamed from: l */
    public C6492c0 m6759l() {
        return this.f5258b.mo8360a();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6760m() {
        return ((this.f5258b.mo8361b() & 512) == 0 || mo6753e().m25815s()) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6761n() {
        return (mo6750b() & 8) != 0;
    }

    /* JADX INFO: renamed from: o */
    public C6274y m6762o(int i10) {
        return new C6274y(m6759l(), i10, this.f5260d.m6794G(i10));
    }
}

package p000A;

import me.dartcv.nuke.BuildConfig;
import p007B0.InterfaceC0169B;
import p047I0.C0696T;
import p047I0.C0711a0;
import p051J.C0811c;
import p051J.C0824p;
import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p095T.C1398y0;
import p095T.C1400z0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p115X0.C1636k;
import p115X0.C1646u;
import p115X0.C1647v;
import p160f3.InterfaceC2160t;
import p227r.C2989g0;
import p266y.C3473c;

/* JADX INFO: renamed from: A.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0024M extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f122h = 0;

    /* JADX INFO: renamed from: i */
    public int f123i;

    /* JADX INFO: renamed from: j */
    public Object f124j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f125k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f126l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f127m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f128n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C0078o0 c0078o0, InterfaceC1347Y interfaceC1347Y, C1647v c1647v, C0920W c0920w, C1636k c1636k, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f124j = c0078o0;
        this.f125k = interfaceC1347Y;
        this.f126l = c1647v;
        this.f127m = c0920w;
        this.f128n = c1636k;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f122h) {
            case 2:
                ((C0024M) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
                break;
        }
        return ((C0024M) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f122h) {
            case 0:
                return new C0024M((C0078o0) this.f124j, (InterfaceC1347Y) this.f125k, (C1647v) this.f126l, (C0920W) this.f127m, (C1636k) this.f128n, interfaceC1046d);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0024M((C3473c) this.f125k, (C1646u) this.f126l, (C0078o0) this.f124j, (C0036S0) this.f127m, (C0042V0) this.f128n, interfaceC1046d);
            case 2:
                C0024M c0024m = new C0024M((C0696T) this.f125k, (InterfaceC1601c) this.f126l, (C0811c) this.f127m, (C0824p) this.f128n, interfaceC1046d);
                c0024m.f124j = obj;
                return c0024m;
            case 3:
                C0024M c0024m2 = new C0024M((C1400z0) this.f126l, (C1398y0) this.f127m, (C0711a0) this.f128n, interfaceC1046d);
                c0024m2.f125k = obj;
                return c0024m2;
            default:
                C0024M c0024m3 = new C0024M((InterfaceC0169B) this.f125k, (InterfaceC1604f) this.f126l, (InterfaceC1601c) this.f127m, (C2989g0) this.f128n, interfaceC1046d);
                c0024m3.f124j = obj;
                return c0024m3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v21, types: [Q2.i, W2.f] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000A.C0024M.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0024M(InterfaceC0169B interfaceC0169B, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, C2989g0 c2989g0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = interfaceC0169B;
        this.f126l = (AbstractC1184i) interfaceC1604f;
        this.f127m = interfaceC1601c;
        this.f128n = c2989g0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C0696T c0696t, InterfaceC1601c interfaceC1601c, C0811c c0811c, C0824p c0824p, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = c0696t;
        this.f126l = interfaceC1601c;
        this.f127m = c0811c;
        this.f128n = c0824p;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C1400z0 c1400z0, C1398y0 c1398y0, C0711a0 c0711a0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f126l = c1400z0;
        this.f127m = c1398y0;
        this.f128n = c0711a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024M(C3473c c3473c, C1646u c1646u, C0078o0 c0078o0, C0036S0 c0036s0, C0042V0 c0042v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f125k = c3473c;
        this.f126l = c1646u;
        this.f124j = c0078o0;
        this.f127m = c0036s0;
        this.f128n = c0042v0;
    }
}

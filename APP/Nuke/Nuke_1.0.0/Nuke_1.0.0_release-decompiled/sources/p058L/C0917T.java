package p058L;

import p000A.C0042V0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p092S0.C1259L;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p227r.C2962L0;
import p227r.C2992i;
import p227r.C3025y0;
import p227r.InterfaceC2982d;

/* JADX INFO: renamed from: L.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0917T extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2848h = 0;

    /* JADX INFO: renamed from: i */
    public int f2849i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f2850j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f2851k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2852l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2853m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f2854n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f2855o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917T(C0943o c0943o, String str, long j5, C1259L c1259l, C0920W c0920w, C0042V0 c0042v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2851k = c0943o;
        this.f2852l = str;
        this.f2850j = j5;
        this.f2853m = c1259l;
        this.f2854n = c0920w;
        this.f2855o = c0042v0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2848h) {
            case 0:
                return ((C0917T) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0917T) mo7n((InterfaceC1046d) obj2, (C3025y0) obj)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2848h) {
            case 0:
                return new C0917T((C0943o) this.f2851k, (String) this.f2852l, this.f2850j, (C1259L) this.f2853m, (C0920W) this.f2854n, (C0042V0) this.f2855o, interfaceC1046d);
            default:
                C0917T c0917t = new C0917T((C2962L0) this.f2852l, (C2992i) this.f2853m, (InterfaceC2982d) this.f2854n, this.f2850j, (InterfaceC2115S) this.f2855o, interfaceC1046d);
                c0917t.f2851k = obj;
                return c0917t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0917T.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917T(C2962L0 c2962l0, C2992i c2992i, InterfaceC2982d interfaceC2982d, long j5, InterfaceC2115S interfaceC2115S, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2852l = c2962l0;
        this.f2853m = c2992i;
        this.f2854n = interfaceC2982d;
        this.f2850j = j5;
        this.f2855o = interfaceC2115S;
    }
}

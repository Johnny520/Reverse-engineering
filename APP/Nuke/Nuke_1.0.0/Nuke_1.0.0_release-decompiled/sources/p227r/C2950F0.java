package p227r;

import p007B0.C0185S;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1183h;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p160f3.C2136g0;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: r.F0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2950F0 extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public C2136g0 f9319f;

    /* JADX INFO: renamed from: g */
    public int f9320g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f9321h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2160t f9322i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC1184i f9323j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1601c f9324k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2989g0 f9325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2950F0(InterfaceC2160t interfaceC2160t, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, C2989g0 c2989g0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9322i = interfaceC2160t;
        this.f9323j = (AbstractC1184i) interfaceC1604f;
        this.f9324k = interfaceC1601c;
        this.f9325l = c2989g0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2950F0) mo7n((InterfaceC1046d) obj2, (C0185S) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2950F0 c2950f0 = new C2950F0(this.f9322i, this.f9323j, this.f9324k, this.f9325l, interfaceC1046d);
        c2950f0.f9321h = obj;
        return c2950f0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r13 == r7) goto L19;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [Q2.i, W2.f] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f9320g
            r1 = 0
            f3.t r2 = r12.f9322i
            r3 = 2
            r4 = 1
            r.g0 r5 = r12.f9325l
            r6 = 0
            P2.a r7 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L22
            if (r0 != r3) goto L1a
            java.lang.Object r0 = r12.f9321h
            f3.S r0 = (p160f3.InterfaceC2115S) r0
            p127Z2.AbstractC1784a.m3205S(r13)
            goto L72
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            f3.g0 r0 = r12.f9319f
            java.lang.Object r8 = r12.f9321h
            B0.S r8 = (p007B0.C0185S) r8
            p127Z2.AbstractC1784a.m3205S(r13)
            goto L50
        L2c:
            p127Z2.AbstractC1784a.m3205S(r13)
            java.lang.Object r13 = r12.f9321h
            r8 = r13
            B0.S r8 = (p007B0.C0185S) r8
            r.B0 r13 = p227r.AbstractC2958J0.f9362a
            r.E0 r13 = new r.E0
            r13.<init>(r5, r6, r1)
            f3.g0 r13 = p160f3.AbstractC2162v.m3994p(r2, r6, r13, r4)
            r12.f9321h = r8
            r12.f9319f = r13
            r12.f9320g = r4
            r0 = 3
            java.lang.Object r0 = p227r.AbstractC2958J0.m5158b(r8, r12, r0)
            if (r0 != r7) goto L4d
            goto L71
        L4d:
            r11 = r0
            r0 = r13
            r13 = r11
        L50:
            B0.w r13 = (p007B0.C0209w) r13
            r13.m320a()
            r.B0 r9 = p227r.AbstractC2958J0.f9362a
            Q2.i r10 = r12.f9323j
            if (r10 == r9) goto L63
            G.k r9 = new G.k
            r9.<init>(r10, r5, r13, r6)
            p227r.AbstractC2958J0.m5161e(r2, r0, r9)
        L63:
            r12.f9321h = r0
            r12.f9319f = r6
            r12.f9320g = r3
            B0.o r13 = p007B0.EnumC0201o.f703e
            java.lang.Object r13 = p227r.AbstractC2958J0.m5162f(r8, r13, r12)
            if (r13 != r7) goto L72
        L71:
            return r7
        L72:
            B0.w r13 = (p007B0.C0209w) r13
            if (r13 != 0) goto L7f
            r.D0 r13 = new r.D0
            r13.<init>(r5, r6, r1)
            p227r.AbstractC2958J0.m5161e(r2, r0, r13)
            goto L96
        L7f:
            r13.m320a()
            r.D0 r1 = new r.D0
            r1.<init>(r5, r6, r4)
            p227r.AbstractC2958J0.m5161e(r2, r0, r1)
            long r0 = r13.f713c
            n0.b r13 = new n0.b
            r13.<init>(r0)
            W2.c r0 = r12.f9324k
            r0.mo1h(r13)
        L96:
            K2.q r13 = p056K2.C0891q.f2780a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C2950F0.mo8p(java.lang.Object):java.lang.Object");
    }
}

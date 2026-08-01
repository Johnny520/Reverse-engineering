package p216p;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p160f3.InterfaceC2160t;
import p232s.C3162i;
import p232s.C3164k;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2839d extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public int f8921h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3162i f8922i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3164k f8923j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f8924k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C2865v f8925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839d(C3162i c3162i, C3164k c3164k, boolean z5, C2865v c2865v, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f8922i = c3162i;
        this.f8923j = c3164k;
        this.f8924k = z5;
        this.f8925l = c2865v;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2839d) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        return new C2839d(this.f8922i, this.f8923j, this.f8924k, this.f8925l, interfaceC1046d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r7.f8922i.m5429a(r3, r7) == r4) goto L15;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f8921h
            r1 = 2
            r2 = 1
            s.k r3 = r7.f8923j
            P2.a r4 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L37
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L2c
        L1e:
            p127Z2.AbstractC1784a.m3205S(r8)
            long r5 = p216p.AbstractC2866w.f9053a
            r7.f8921h = r2
            java.lang.Object r8 = p160f3.AbstractC2162v.m3983e(r5, r7)
            if (r8 != r4) goto L2c
            goto L36
        L2c:
            r7.f8921h = r1
            s.i r8 = r7.f8922i
            java.lang.Object r8 = r8.m5429a(r3, r7)
            if (r8 != r4) goto L37
        L36:
            return r4
        L37:
            boolean r8 = r7.f8924k
            p.v r0 = r7.f8925l
            if (r8 == 0) goto L40
            r0.f9039G = r3
            goto L42
        L40:
            r0.f9035C = r3
        L42:
            K2.q r8 = p056K2.C0891q.f2780a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p216p.C2839d.mo8p(java.lang.Object):java.lang.Object");
    }
}

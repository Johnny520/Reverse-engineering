package p058L;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: L.O */
/* JADX INFO: loaded from: classes.dex */
public final class C0913O extends AbstractC1184i implements InterfaceC1601c {

    /* JADX INFO: renamed from: h */
    public int f2841h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0920W f2842i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0913O(C0920W c0920w, InterfaceC1046d interfaceC1046d) {
        super(1, interfaceC1046d);
        this.f2842i = c0920w;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        return new C0913O(this.f2842i, (InterfaceC1046d) obj).mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r13 == r5) goto L28;
     */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.f2841h
            K2.q r1 = p056K2.C0891q.f2780a
            r2 = 2
            r3 = 1
            L.W r4 = r12.f2842i
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            p127Z2.AbstractC1784a.m3205S(r13)
            goto L6b
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            p127Z2.AbstractC1784a.m3205S(r13)
            goto L2c
        L20:
            p127Z2.AbstractC1784a.m3205S(r13)
            r12.f2841h = r3
            java.lang.Object r13 = r4.m1944s(r12)
            if (r13 != r5) goto L2c
            goto L6a
        L2c:
            K2.h r13 = p058L.C0920W.m1926a(r4)
            if (r13 == 0) goto L6b
            java.lang.Object r0 = r13.f2769d
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r13 = r13.f2770e
            S0.L r13 = (p092S0.C1259L) r13
            long r7 = r13.f4538a
            L.o r9 = r4.f2873i
            if (r9 == 0) goto L6b
            r12.f2841h = r2
            int r13 = r11.length()
            if (r13 != 0) goto L4a
            goto L50
        L4a:
            boolean r13 = p092S0.C1259L.m2335c(r7)
            if (r13 == 0) goto L52
        L50:
            r13 = r1
            goto L64
        L52:
            G.g r6 = new G.g
            r10 = 0
            r6.<init>(r7, r9, r10, r11)
            O2.i r13 = r9.f2964a
            J.b r0 = new J.b
            r2 = 0
            r0.<init>(r9, r6, r2)
            java.lang.Object r13 = p160f3.AbstractC2162v.m4001w(r13, r0, r12)
        L64:
            if (r13 != r5) goto L67
            goto L68
        L67:
            r13 = r1
        L68:
            if (r13 != r5) goto L6b
        L6a:
            return r5
        L6b:
            r4.f2864A = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0913O.mo8p(java.lang.Object):java.lang.Object");
    }
}

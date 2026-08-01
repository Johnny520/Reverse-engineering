package p227r;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p153e1.C2021q;

/* JADX INFO: renamed from: r.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3027z0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public long f9600h;

    /* JADX INFO: renamed from: i */
    public int f9601i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f9602j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2940A0 f9603k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3027z0(C2940A0 c2940a0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f9603k = c2940a0;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        long j5 = ((C2021q) obj).f6750a;
        C3027z0 c3027z0 = new C3027z0(this.f9603k, (InterfaceC1046d) obj2);
        c3027z0.f9602j = j5;
        return c3027z0.mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C3027z0 c3027z0 = new C3027z0(this.f9603k, interfaceC1046d);
        c3027z0.f9602j = ((C2021q) obj).f6750a;
        return c3027z0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f9601i
            r1 = 3
            r2 = 2
            r3 = 1
            r.A0 r4 = r14.f9603k
            P2.a r5 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L29
            if (r0 == r2) goto L21
            if (r0 != r1) goto L19
            long r0 = r14.f9600h
            long r2 = r14.f9602j
            p127Z2.AbstractC1784a.m3205S(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r2 = r14.f9600h
            long r6 = r14.f9602j
            p127Z2.AbstractC1784a.m3205S(r15)
            goto L57
        L29:
            long r6 = r14.f9602j
            p127Z2.AbstractC1784a.m3205S(r15)
            goto L41
        L2f:
            p127Z2.AbstractC1784a.m3205S(r15)
            long r6 = r14.f9602j
            A0.e r15 = r4.f9275f
            r14.f9602j = r6
            r14.f9601i = r3
            java.lang.Object r15 = r15.m138b(r6, r14)
            if (r15 != r5) goto L41
            goto L6e
        L41:
            e1.q r15 = (p153e1.C2021q) r15
            long r8 = r15.f6750a
            long r8 = p153e1.C2021q.m3716d(r6, r8)
            r14.f9602j = r6
            r14.f9600h = r8
            r14.f9601i = r2
            java.lang.Object r15 = r4.m5141a(r8, r14)
            if (r15 != r5) goto L56
            goto L6e
        L56:
            r2 = r8
        L57:
            e1.q r15 = (p153e1.C2021q) r15
            long r11 = r15.f6750a
            A0.e r8 = r4.f9275f
            long r9 = p153e1.C2021q.m3716d(r2, r11)
            r14.f9602j = r6
            r14.f9600h = r11
            r14.f9601i = r1
            r13 = r14
            java.lang.Object r15 = r8.m137a(r9, r11, r13)
            if (r15 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r2 = r6
            r0 = r11
        L71:
            e1.q r15 = (p153e1.C2021q) r15
            long r4 = r15.f6750a
            long r0 = p153e1.C2021q.m3716d(r0, r4)
            long r0 = p153e1.C2021q.m3716d(r2, r0)
            e1.q r15 = new e1.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p227r.C3027z0.mo8p(java.lang.Object):java.lang.Object");
    }
}

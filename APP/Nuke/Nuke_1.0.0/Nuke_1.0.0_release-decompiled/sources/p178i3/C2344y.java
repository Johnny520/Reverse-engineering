package p178i3;

import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1604f;

/* JADX INFO: renamed from: i3.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2344y extends AbstractC1184i implements InterfaceC1604f {

    /* JADX INFO: renamed from: h */
    public int f7637h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ InterfaceC2324e f7638i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ int f7639j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2345z f7640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344y(C2345z c2345z, InterfaceC1046d interfaceC1046d) {
        super(3, interfaceC1046d);
        this.f7640k = c2345z;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C2344y c2344y = new C2344y(this.f7640k, (InterfaceC1046d) obj3);
        c2344y.f7638i = (InterfaceC2324e) obj;
        c2344y.f7639j = iIntValue;
        return c2344y.mo8p(C0891q.f2780a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r0.mo9c(p178i3.EnumC2341v.f7630d, r7) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r0.mo9c(p178i3.EnumC2341v.f7632f, r7) != r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r0
  0x0062: PHI (r0v3 i3.e) = (r0v2 i3.e), (r0v6 i3.e) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r0
  0x0072: PHI (r0v4 i3.e) = (r0v3 i3.e), (r0v7 i3.e) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f7637h
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r0 == 0) goto L34
            if (r0 == r5) goto L30
            if (r0 == r4) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            i3.e r0 = r7.f7638i
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L72
        L24:
            i3.e r0 = r7.f7638i
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L62
        L2a:
            i3.e r0 = r7.f7638i
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L55
        L30:
            p127Z2.AbstractC1784a.m3205S(r8)
            goto L80
        L34:
            p127Z2.AbstractC1784a.m3205S(r8)
            i3.e r0 = r7.f7638i
            int r8 = r7.f7639j
            if (r8 <= 0) goto L48
            r7.f7637h = r5
            i3.v r8 = p178i3.EnumC2341v.f7630d
            java.lang.Object r8 = r0.mo9c(r8, r7)
            if (r8 != r6) goto L80
            goto L7f
        L48:
            r7.f7638i = r0
            r7.f7637h = r4
            r4 = 0
            java.lang.Object r8 = p160f3.AbstractC2162v.m3983e(r4, r7)
            if (r8 != r6) goto L55
            goto L7f
        L55:
            r7.f7638i = r0
            r7.f7637h = r3
            i3.v r8 = p178i3.EnumC2341v.f7631e
            java.lang.Object r8 = r0.mo9c(r8, r7)
            if (r8 != r6) goto L62
            goto L7f
        L62:
            r7.f7638i = r0
            r7.f7637h = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = p160f3.AbstractC2162v.m3983e(r2, r7)
            if (r8 != r6) goto L72
            goto L7f
        L72:
            r8 = 0
            r7.f7638i = r8
            r7.f7637h = r1
            i3.v r8 = p178i3.EnumC2341v.f7632f
            java.lang.Object r8 = r0.mo9c(r8, r7)
            if (r8 != r6) goto L80
        L7f:
            return r6
        L80:
            K2.q r8 = p056K2.C0891q.f2780a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p178i3.C2344y.mo8p(java.lang.Object):java.lang.Object");
    }
}

package p332x;

import p049d9.AbstractC1927c;
import p172l8.C4700i0;
import p219p.InterfaceC5836c1;
import p219p.InterfaceC5859j0;
import p219p.InterfaceC5902x1;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: x.i1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9260i1 implements InterfaceC5859j0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5902x1 f31645a;

    /* JADX INFO: renamed from: b */
    public final AbstractC9242c1 f31646b;

    /* JADX INFO: renamed from: x.i1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f31647q;

        /* JADX INFO: renamed from: s */
        public int f31649s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f31647q = obj;
            this.f31649s |= Integer.MIN_VALUE;
            return C9260i1.this.mo23621a(null, 0.0f, this);
        }
    }

    public C9260i1(InterfaceC5902x1 interfaceC5902x1, AbstractC9242c1 abstractC9242c1) {
        this.f31645a = interfaceC5902x1;
        this.f31646b = abstractC9242c1;
    }

    /* JADX INFO: renamed from: d */
    public static C4700i0 m36066d(C9260i1 c9260i1, InterfaceC5836c1 interfaceC5836c1, float f10) {
        c9260i1.f31646b.m36029q0(interfaceC5836c1, AbstractC1927c.m6980d(c9260i1.f31646b.m36001L() != 0 ? f10 / c9260i1.f31646b.m36001L() : 0.0f) + c9260i1.f31646b.m36036x());
        return C4700i0.f13910a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p219p.InterfaceC5859j0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo23621a(final p219p.InterfaceC5836c1 r5, float r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof p332x.C9260i1.a
            if (r0 == 0) goto L13
            r0 = r7
            x.i1$a r0 = (p332x.C9260i1.a) r0
            int r1 = r0.f31649s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31649s = r1
            goto L18
        L13:
            x.i1$a r0 = new x.i1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31647q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f31649s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r7)
            goto L43
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r5)
            r5 = 0
            return r5
        L30:
            p172l8.AbstractC4713t.m18808b(r7)
            p.x1 r7 = r4.f31645a
            x.h1 r2 = new x.h1
            r2.<init>()
            r0.f31649s = r3
            java.lang.Object r7 = r7.mo23802c(r5, r6, r2, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            x.c1 r6 = r4.f31646b
            float r6 = r6.m36037y()
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L55
            goto L75
        L55:
            x.c1 r6 = r4.f31646b
            float r6 = r6.m36037y()
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L75
            x.c1 r6 = r4.f31646b
            int r0 = r6.m36036x()
            r1 = 2
            r2 = 0
            p332x.AbstractC9242c1.m35976c0(r6, r0, r7, r1, r2)
            goto L7e
        L75:
            x.c1 r6 = r4.f31646b
            float r6 = r6.m36037y()
            p257r8.AbstractC6533b.m25847c(r6)
        L7e:
            java.lang.Float r5 = p257r8.AbstractC6533b.m25847c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p332x.C9260i1.mo23621a(p.c1, float, p8.f):java.lang.Object");
    }
}

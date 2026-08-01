package p034c7;

import p023b8.AbstractC1012e;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: c7.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1366g0 extends AbstractC1387r {

    /* JADX INFO: renamed from: c */
    public final AbstractC1012e f4031c;

    /* JADX INFO: renamed from: c7.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f4032q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f4033r;

        /* JADX INFO: renamed from: t */
        public int f4035t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f4033r = obj;
            this.f4035t |= Integer.MIN_VALUE;
            return C1366g0.this.m5399c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366g0(Object obj, AbstractC1012e abstractC1012e) {
        super(obj, abstractC1012e);
        obj.getClass();
        abstractC1012e.getClass();
        this.f4031c = abstractC1012e;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1012e m5398b() {
        return this.f4031c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5399c(p010a9.InterfaceC0189q r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p034c7.C1366g0.a
            if (r0 == 0) goto L13
            r0 = r7
            c7.g0$a r0 = (p034c7.C1366g0.a) r0
            int r1 = r0.f4035t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4035t = r1
            goto L18
        L13:
            c7.g0$a r0 = new c7.g0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4033r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f4035t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f4032q
            b8.e r6 = (p023b8.AbstractC1012e) r6
            p172l8.AbstractC4713t.m18808b(r7)
            goto L66
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L34:
            p172l8.AbstractC4713t.m18808b(r7)
            c7.t0 r7 = new c7.t0
            b8.e r2 = r5.m5398b()
            java.lang.Object r2 = r2.m3752c()
            c7.h0 r2 = (p034c7.InterfaceC1368h0) r2
            p7.e r2 = r2.mo5371k()
            c8.a r2 = p227p7.AbstractC5970h.m23967a(r2)
            r7.<init>(r2)
            b8.e r2 = r5.m5398b()
            b8.e r4 = r5.m5398b()
            java.lang.Object r4 = r4.mo3708f()
            r0.f4032q = r2
            r0.f4035t = r3
            java.lang.Object r7 = r6.mo236e(r7, r4, r0)
            if (r7 != r1) goto L65
            return r1
        L65:
            r6 = r2
        L66:
            r6.mo3711i(r7)
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C1366g0.m5399c(a9.q, p8.f):java.lang.Object");
    }
}

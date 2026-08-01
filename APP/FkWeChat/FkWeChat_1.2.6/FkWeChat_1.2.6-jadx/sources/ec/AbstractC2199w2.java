package ec;

import p010a9.InterfaceC0188p;
import p161kc.AbstractC4244b;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: ec.w2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2199w2 {

    /* JADX INFO: renamed from: ec.w2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public long f6024q;

        /* JADX INFO: renamed from: r */
        public Object f6025r;

        /* JADX INFO: renamed from: s */
        public Object f6026s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f6027t;

        /* JADX INFO: renamed from: u */
        public int f6028u;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f6027t = obj;
            this.f6028u |= Integer.MIN_VALUE;
            return AbstractC2199w2.m7929e(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C2191u2 m7925a(long j10, InterfaceC2201x0 interfaceC2201x0, InterfaceC2198w1 interfaceC2198w1) {
        return new C2191u2("Timed out waiting for " + j10 + " ms", interfaceC2198w1);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m7926b(RunnableC2195v2 runnableC2195v2, InterfaceC0188p interfaceC0188p) {
        AbstractC2210z1.m7957j(runnableC2195v2, AbstractC2205y0.m7939c(runnableC2195v2.f11025t.getContext()).mo7800k(runnableC2195v2.f6021u, runnableC2195v2, runnableC2195v2.getContext()));
        return AbstractC4244b.m16728e(runnableC2195v2, runnableC2195v2, interfaceC0188p);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m7927c(long j10, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        if (j10 <= 0) {
            throw new C2191u2("Timed out immediately");
        }
        Object objM7926b = m7926b(new RunnableC2195v2(j10, interfaceC5976f), interfaceC0188p);
        if (objM7926b == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7926b;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m7928d(long j10, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        return m7927c(AbstractC2205y0.m7940d(j10), interfaceC0188p, interfaceC5976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7929e(long r7, p010a9.InterfaceC0188p r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof ec.AbstractC2199w2.a
            if (r0 == 0) goto L13
            r0 = r10
            ec.w2$a r0 = (ec.AbstractC2199w2.a) r0
            int r1 = r0.f6028u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6028u = r1
            goto L18
        L13:
            ec.w2$a r0 = new ec.w2$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f6027t
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f6028u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f6026s
            b9.n0 r7 = (p024b9.C1050n0) r7
            java.lang.Object r8 = r0.f6025r
            a9.p r8 = (p010a9.InterfaceC0188p) r8
            p172l8.AbstractC4713t.m18808b(r10)     // Catch: ec.C2191u2 -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6e
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L3b:
            p172l8.AbstractC4713t.m18808b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L45
            return r3
        L45:
            b9.n0 r10 = new b9.n0
            r10.<init>()
            r0.f6025r = r9     // Catch: ec.C2191u2 -> L67
            r0.f6026s = r10     // Catch: ec.C2191u2 -> L67
            r0.f6024q = r7     // Catch: ec.C2191u2 -> L67
            r0.f6028u = r4     // Catch: ec.C2191u2 -> L67
            ec.v2 r2 = new ec.v2     // Catch: ec.C2191u2 -> L67
            r2.<init>(r7, r0)     // Catch: ec.C2191u2 -> L67
            r10.f3208q = r2     // Catch: ec.C2191u2 -> L67
            java.lang.Object r7 = m7926b(r2, r9)     // Catch: ec.C2191u2 -> L67
            java.lang.Object r8 = p242q8.AbstractC6325c.m24992g()     // Catch: ec.C2191u2 -> L67
            if (r7 != r8) goto L6a
            p257r8.AbstractC6539h.m25860c(r0)     // Catch: ec.C2191u2 -> L67
            goto L6a
        L67:
            r8 = move-exception
            r7 = r10
            goto L6e
        L6a:
            if (r7 != r1) goto L6d
            return r1
        L6d:
            return r7
        L6e:
            ec.w1 r9 = r8.f6019q
            java.lang.Object r7 = r7.f3208q
            if (r9 != r7) goto L75
            return r3
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.AbstractC2199w2.m7929e(long, a9.p, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    public static final Object m7930f(long j10, InterfaceC0188p interfaceC0188p, InterfaceC5976f interfaceC5976f) {
        return m7929e(AbstractC2205y0.m7940d(j10), interfaceC0188p, interfaceC5976f);
    }
}

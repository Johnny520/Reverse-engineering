package p034c7;

import p023b8.AbstractC1012e;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: c7.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1364f0 extends AbstractC1387r {

    /* JADX INFO: renamed from: c */
    public final AbstractC1012e f4026c;

    /* JADX INFO: renamed from: c7.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f4027q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f4028r;

        /* JADX INFO: renamed from: t */
        public int f4030t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f4028r = obj;
            this.f4030t |= Integer.MIN_VALUE;
            return C1364f0.this.m5394c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364f0(Object obj, AbstractC1012e abstractC1012e) {
        super(obj, abstractC1012e);
        obj.getClass();
        abstractC1012e.getClass();
        this.f4026c = abstractC1012e;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1012e m5393b() {
        return this.f4026c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5394c(p010a9.InterfaceC0189q r6, p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p034c7.C1364f0.a
            if (r0 == 0) goto L13
            r0 = r7
            c7.f0$a r0 = (p034c7.C1364f0.a) r0
            int r1 = r0.f4030t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4030t = r1
            goto L18
        L13:
            c7.f0$a r0 = new c7.f0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4028r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f4030t
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f4027q
            b8.e r6 = (p023b8.AbstractC1012e) r6
            p172l8.AbstractC4713t.m18808b(r7)
            goto L6f
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L34:
            p172l8.AbstractC4713t.m18808b(r7)
            b8.e r7 = r5.m5393b()
            java.lang.Object r7 = r7.mo3708f()
            boolean r2 = r7 instanceof io.ktor.utils.p131io.InterfaceC3468g
            if (r2 == 0) goto L46
            io.ktor.utils.io.g r7 = (io.ktor.utils.p131io.InterfaceC3468g) r7
            goto L47
        L46:
            r7 = 0
        L47:
            if (r7 != 0) goto L4c
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        L4c:
            b8.e r2 = r5.m5393b()
            java.lang.Object r2 = r2.m3752c()
            c7.h0 r2 = (p034c7.InterfaceC1368h0) r2
            c8.a r2 = p034c7.AbstractC1370i0.m5403a(r2)
            c7.t0 r4 = new c7.t0
            r4.<init>(r2)
            b8.e r2 = r5.m5393b()
            r0.f4027q = r2
            r0.f4030t = r3
            java.lang.Object r7 = r6.mo236e(r4, r7, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r6 = r2
        L6f:
            r6.mo3711i(r7)
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C1364f0.m5394c(a9.q, p8.f):java.lang.Object");
    }
}

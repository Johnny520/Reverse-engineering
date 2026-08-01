package io.ktor.utils.p131io;

import ec.InterfaceC2198w1;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: io.ktor.utils.io.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3461c0 implements InterfaceC3478p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3473k f9582a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2198w1 f9583b;

    /* JADX INFO: renamed from: io.ktor.utils.io.c0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f9584q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9585r;

        /* JADX INFO: renamed from: t */
        public int f9587t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9585r = obj;
            this.f9587t |= Integer.MIN_VALUE;
            return C3461c0.this.m12932b(this);
        }
    }

    public C3461c0(InterfaceC3473k interfaceC3473k, InterfaceC2198w1 interfaceC2198w1) {
        interfaceC3473k.getClass();
        interfaceC2198w1.getClass();
        this.f9582a = interfaceC3473k;
        this.f9583b = interfaceC2198w1;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3478p
    /* JADX INFO: renamed from: a */
    public InterfaceC2198w1 mo12931a() {
        return this.f9583b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r7.mo12881f(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12932b(p228p8.InterfaceC5976f r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.p131io.C3461c0.a
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.c0$a r0 = (io.ktor.utils.p131io.C3461c0.a) r0
            int r1 = r0.f9587t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9587t = r1
            goto L18
        L13:
            io.ktor.utils.io.c0$a r0 = new io.ktor.utils.io.c0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9585r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9587t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            p172l8.AbstractC4713t.m18808b(r7)
            goto L7a
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
            r7 = 0
            return r7
        L34:
            java.lang.Object r2 = r0.f9584q
            java.util.Iterator r2 = (java.util.Iterator) r2
            p172l8.AbstractC4713t.m18808b(r7)
            goto L53
        L3c:
            p172l8.AbstractC4713t.m18808b(r7)
            ec.w1 r7 = r6.mo12931a()
            ec.AbstractC2210z1.m7956i(r7, r5, r4, r5)
            ec.w1 r7 = r6.mo12931a()
            sb.h r7 = r7.mo7686f()
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r2.next()
            ec.w1 r7 = (ec.InterfaceC2198w1) r7
            ec.InterfaceC2198w1.a.m7920a(r7, r5, r4, r5)
            r0.f9584q = r2
            r0.f9587t = r4
            java.lang.Object r7 = r7.mo7657J0(r0)
            if (r7 != r1) goto L53
            goto L79
        L6d:
            io.ktor.utils.io.k r7 = r6.f9582a
            r0.f9584q = r5
            r0.f9587t = r3
            java.lang.Object r7 = r7.mo12881f(r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3461c0.m12932b(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3473k m12933c() {
        return this.f9582a;
    }
}

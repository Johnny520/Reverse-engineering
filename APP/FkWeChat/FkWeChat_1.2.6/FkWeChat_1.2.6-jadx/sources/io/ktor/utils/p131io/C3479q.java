package io.ktor.utils.p131io;

import p010a9.InterfaceC0184l;
import p215oc.InterfaceC5726u;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: io.ktor.utils.io.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3479q implements InterfaceC3473k {

    /* JADX INFO: renamed from: b */
    public final InterfaceC3473k f9678b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f9679c;

    /* JADX INFO: renamed from: io.ktor.utils.io.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9680q;

        /* JADX INFO: renamed from: s */
        public int f9682s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9680q = obj;
            this.f9682s |= Integer.MIN_VALUE;
            return C3479q.this.mo12881f(this);
        }
    }

    public C3479q(InterfaceC3473k interfaceC3473k, InterfaceC0184l interfaceC0184l) {
        interfaceC3473k.getClass();
        interfaceC0184l.getClass();
        this.f9678b = interfaceC3473k;
        this.f9679c = interfaceC0184l;
    }

    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: a */
    public Throwable mo12967a() {
        return this.f9678b.mo12967a();
    }

    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: b */
    public Object mo12879b(InterfaceC5976f interfaceC5976f) {
        return this.f9678b.mo12879b(interfaceC5976f);
    }

    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: d */
    public InterfaceC5726u mo12880d() {
        return this.f9678b.mo12880d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r6.mo27m(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo12881f(p228p8.InterfaceC5976f r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof io.ktor.utils.p131io.C3479q.a
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.q$a r0 = (io.ktor.utils.p131io.C3479q.a) r0
            int r1 = r0.f9682s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9682s = r1
            goto L18
        L13:
            io.ktor.utils.io.q$a r0 = new io.ktor.utils.io.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f9680q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9682s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r6)
            goto L50
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            p172l8.AbstractC4713t.m18808b(r6)
            goto L45
        L37:
            p172l8.AbstractC4713t.m18808b(r6)
            io.ktor.utils.io.k r6 = r5.f9678b
            r0.f9682s = r4
            java.lang.Object r6 = r6.mo12881f(r0)
            if (r6 != r1) goto L45
            goto L4f
        L45:
            a9.l r6 = r5.f9679c
            r0.f9682s = r3
            java.lang.Object r6 = r6.mo27m(r0)
            if (r6 != r1) goto L50
        L4f:
            return r1
        L50:
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3479q.mo12881f(p8.f):java.lang.Object");
    }

    @Override // io.ktor.utils.p131io.InterfaceC3473k
    /* JADX INFO: renamed from: g */
    public void mo12968g(Throwable th) {
        this.f9678b.mo12968g(th);
    }
}

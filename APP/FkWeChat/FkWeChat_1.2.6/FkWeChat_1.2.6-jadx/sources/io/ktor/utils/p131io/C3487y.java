package io.ktor.utils.p131io;

import p215oc.C5708d;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: io.ktor.utils.io.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3487y implements InterfaceC3468g {

    /* JADX INFO: renamed from: b */
    public final InterfaceC3468g f9686b;

    /* JADX INFO: renamed from: c */
    public final C5708d f9687c;

    /* JADX INFO: renamed from: d */
    public long f9688d;

    /* JADX INFO: renamed from: e */
    public long f9689e;

    /* JADX INFO: renamed from: io.ktor.utils.io.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f9690q;

        /* JADX INFO: renamed from: s */
        public int f9692s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9690q = obj;
            this.f9692s |= Integer.MIN_VALUE;
            return C3487y.this.mo8541c(0, this);
        }
    }

    public C3487y(InterfaceC3468g interfaceC3468g) {
        interfaceC3468g.getClass();
        this.f9686b = interfaceC3468g;
        this.f9687c = new C5708d();
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: a */
    public Throwable mo8540a() {
        return this.f9686b.mo8540a();
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5708d mo8542e() {
        m13001f();
        return this.f9687c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8541c(int r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.p131io.C3487y.a
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.y$a r0 = (io.ktor.utils.p131io.C3487y.a) r0
            int r1 = r0.f9692s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9692s = r1
            goto L18
        L13:
            io.ktor.utils.io.y$a r0 = new io.ktor.utils.io.y$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f9690q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9692s
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            p172l8.AbstractC4713t.m18808b(r10)
            goto L50
        L29:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r9)
            r9 = 0
            return r9
        L30:
            p172l8.AbstractC4713t.m18808b(r10)
            oc.d r10 = r8.mo8542e()
            long r4 = r10.m23111j()
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L45
            java.lang.Boolean r9 = p257r8.AbstractC6533b.m25845a(r3)
            return r9
        L45:
            io.ktor.utils.io.g r10 = r8.f9686b
            r0.f9692s = r3
            java.lang.Object r10 = r10.mo8541c(r9, r0)
            if (r10 != r1) goto L50
            return r1
        L50:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L60
            r8.m13001f()
            java.lang.Boolean r9 = p257r8.AbstractC6533b.m25845a(r3)
            return r9
        L60:
            r9 = 0
            java.lang.Boolean r9 = p257r8.AbstractC6533b.m25845a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.p131io.C3487y.mo8541c(int, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final long m13000d() {
        m13002i();
        return this.f9689e;
    }

    /* JADX INFO: renamed from: f */
    public final void m13001f() {
        m13002i();
        this.f9688d += this.f9687c.mo23120s0(this.f9686b.mo8542e());
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: g */
    public void mo8543g(Throwable th) {
        this.f9686b.mo8543g(th);
        this.f9687c.close();
    }

    @Override // io.ktor.utils.p131io.InterfaceC3468g
    /* JADX INFO: renamed from: h */
    public boolean mo8544h() {
        return this.f9687c.mo23108g() && this.f9686b.mo8544h();
    }

    /* JADX INFO: renamed from: i */
    public final void m13002i() {
        this.f9689e += this.f9688d - this.f9687c.m23111j();
        this.f9688d = this.f9687c.m23111j();
    }
}

package p256r7;

import io.ktor.utils.p131io.InterfaceC3473k;
import nc.AbstractC5568g;
import nc.InterfaceC5562a;
import p034c7.InterfaceC1355b;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p256r7.InterfaceC6530f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: r7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6525a implements InterfaceC6530f {

    /* JADX INFO: renamed from: q */
    public final InterfaceC3473k f20451q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC1355b f20452r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC5980j f20453s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC5562a f20454t;

    /* JADX INFO: renamed from: r7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f20455q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f20456r;

        /* JADX INFO: renamed from: t */
        public int f20458t;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f20456r = obj;
            this.f20458t |= Integer.MIN_VALUE;
            return C6525a.this.mo25825E0(this);
        }
    }

    /* JADX INFO: renamed from: r7.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f20459q;

        /* JADX INFO: renamed from: r */
        public Object f20460r;

        /* JADX INFO: renamed from: s */
        public /* synthetic */ Object f20461s;

        /* JADX INFO: renamed from: u */
        public int f20463u;

        public b(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f20461s = obj;
            this.f20463u |= Integer.MIN_VALUE;
            return C6525a.this.mo25829x(null, this);
        }
    }

    /* JADX INFO: renamed from: r7.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f20464q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f20465r;

        /* JADX INFO: renamed from: t */
        public int f20467t;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f20465r = obj;
            this.f20467t |= Integer.MIN_VALUE;
            return C6525a.this.m25826b(null, null, this);
        }
    }

    public C6525a(InterfaceC3473k interfaceC3473k, InterfaceC1355b interfaceC1355b, InterfaceC5980j interfaceC5980j) {
        interfaceC3473k.getClass();
        interfaceC1355b.getClass();
        interfaceC5980j.getClass();
        this.f20451q = interfaceC3473k;
        this.f20452r = interfaceC1355b;
        this.f20453s = interfaceC5980j;
        this.f20454t = AbstractC5568g.m22627b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p256r7.InterfaceC6530f
    /* JADX INFO: renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo25825E0(p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p256r7.C6525a.a
            if (r0 == 0) goto L13
            r0 = r8
            r7.a$a r0 = (p256r7.C6525a.a) r0
            int r1 = r0.f20458t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20458t = r1
            goto L18
        L13:
            r7.a$a r0 = new r7.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20456r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f20458t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.f20455q
            nc.a r0 = (nc.InterfaceC5562a) r0
            p172l8.AbstractC4713t.m18808b(r8)     // Catch: java.lang.Throwable -> L31
            goto L60
        L31:
            r8 = move-exception
            goto L6c
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r8)
            return r5
        L39:
            java.lang.Object r2 = r0.f20455q
            nc.a r2 = (nc.InterfaceC5562a) r2
            p172l8.AbstractC4713t.m18808b(r8)
            r8 = r2
            goto L52
        L42:
            p172l8.AbstractC4713t.m18808b(r8)
            nc.a r8 = r7.f20454t
            r0.f20455q = r8
            r0.f20458t = r4
            java.lang.Object r2 = r8.mo22609d(r5, r0)
            if (r2 != r1) goto L52
            goto L5e
        L52:
            io.ktor.utils.io.k r2 = r7.f20451q     // Catch: java.lang.Throwable -> L68
            r0.f20455q = r8     // Catch: java.lang.Throwable -> L68
            r0.f20458t = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r2.mo12881f(r0)     // Catch: java.lang.Throwable -> L68
            if (r0 != r1) goto L5f
        L5e:
            return r1
        L5f:
            r0 = r8
        L60:
            l8.i0 r8 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L31
            r0.mo22608c(r5)
            l8.i0 r8 = p172l8.C4700i0.f13910a
            return r8
        L68:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L6c:
            r0.mo22608c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p256r7.C6525a.mo25825E0(p8.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.mo12879b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m25826b(io.ktor.utils.p131io.InterfaceC3473k r6, p271s7.C7195a r7, p228p8.InterfaceC5976f r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p256r7.C6525a.c
            if (r0 == 0) goto L13
            r0 = r8
            r7.a$c r0 = (p256r7.C6525a.c) r0
            int r1 = r0.f20467t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20467t = r1
            goto L18
        L13:
            r7.a$c r0 = new r7.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20465r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f20467t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            p172l8.AbstractC4713t.m18808b(r8)
            goto L66
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r6)
            r6 = 0
            return r6
        L33:
            java.lang.Object r6 = r0.f20464q
            io.ktor.utils.io.k r6 = (io.ktor.utils.p131io.InterfaceC3473k) r6
            p172l8.AbstractC4713t.m18808b(r8)
            goto L5a
        L3b:
            p172l8.AbstractC4713t.m18808b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "\r\n"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r0.f20464q = r6
            r0.f20467t = r4
            java.lang.Object r7 = io.ktor.utils.p131io.AbstractC3476n.m12985n(r6, r7, r0)
            if (r7 != r1) goto L5a
            goto L65
        L5a:
            r7 = 0
            r0.f20464q = r7
            r0.f20467t = r3
            java.lang.Object r6 = r6.mo12879b(r0)
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            l8.i0 r6 = p172l8.C4700i0.f13910a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p256r7.C6525a.m25826b(io.ktor.utils.io.k, s7.a, p8.f):java.lang.Object");
    }

    @Override // p256r7.InterfaceC6530f
    /* JADX INFO: renamed from: b0 */
    public Object mo25827b0(String str, String str2, String str3, Long l10, String str4, InterfaceC5976f interfaceC5976f) {
        return InterfaceC6530f.a.m25842a(this, str, str2, str3, l10, str4, interfaceC5976f);
    }

    @Override // p256r7.InterfaceC6530f
    /* JADX INFO: renamed from: e */
    public InterfaceC1355b mo25828e() {
        return this.f20452r;
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        return this.f20453s;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p256r7.InterfaceC6530f
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo25829x(p271s7.C7195a r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p256r7.C6525a.b
            if (r0 == 0) goto L13
            r0 = r9
            r7.a$b r0 = (p256r7.C6525a.b) r0
            int r1 = r0.f20463u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20463u = r1
            goto L18
        L13:
            r7.a$b r0 = new r7.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20461s
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f20463u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f20459q
            nc.a r8 = (nc.InterfaceC5562a) r8
            p172l8.AbstractC4713t.m18808b(r9)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r9 = move-exception
            goto L75
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r8)
            return r5
        L39:
            java.lang.Object r8 = r0.f20460r
            nc.a r8 = (nc.InterfaceC5562a) r8
            java.lang.Object r2 = r0.f20459q
            s7.a r2 = (p271s7.C7195a) r2
            p172l8.AbstractC4713t.m18808b(r9)
            r9 = r8
            r8 = r2
            goto L59
        L47:
            p172l8.AbstractC4713t.m18808b(r9)
            nc.a r9 = r7.f20454t
            r0.f20459q = r8
            r0.f20460r = r9
            r0.f20463u = r4
            java.lang.Object r2 = r9.mo22609d(r5, r0)
            if (r2 != r1) goto L59
            goto L67
        L59:
            io.ktor.utils.io.k r2 = r7.f20451q     // Catch: java.lang.Throwable -> L71
            r0.f20459q = r9     // Catch: java.lang.Throwable -> L71
            r0.f20460r = r5     // Catch: java.lang.Throwable -> L71
            r0.f20463u = r3     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r7.m25826b(r2, r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r8 = r9
        L69:
            l8.i0 r9 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L31
            r8.mo22608c(r5)
            l8.i0 r8 = p172l8.C4700i0.f13910a
            return r8
        L71:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            r8.mo22608c(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p256r7.C6525a.mo25829x(s7.a, p8.f):java.lang.Object");
    }
}

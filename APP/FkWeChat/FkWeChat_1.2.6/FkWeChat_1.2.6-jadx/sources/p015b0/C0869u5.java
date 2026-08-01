package p015b0;

import p018b3.C0978t0;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: b0.u5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0869u5 {

    /* JADX INFO: renamed from: a */
    public final int f2736a;

    /* JADX INFO: renamed from: b */
    public a f2737b;

    /* JADX INFO: renamed from: c */
    public a f2738c;

    /* JADX INFO: renamed from: d */
    public int f2739d;

    /* JADX INFO: renamed from: e */
    public Long f2740e;

    /* JADX INFO: renamed from: f */
    public boolean f2741f;

    /* JADX INFO: renamed from: b0.u5$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public a f2742a;

        /* JADX INFO: renamed from: b */
        public C0978t0 f2743b;

        public a(a aVar, C0978t0 c0978t0) {
            this.f2742a = aVar;
            this.f2743b = c0978t0;
        }

        /* JADX INFO: renamed from: a */
        public final a m3227a() {
            return this.f2742a;
        }

        /* JADX INFO: renamed from: b */
        public final C0978t0 m3228b() {
            return this.f2743b;
        }

        /* JADX INFO: renamed from: c */
        public final void m3229c(a aVar) {
            this.f2742a = aVar;
        }

        /* JADX INFO: renamed from: d */
        public final void m3230d(C0978t0 c0978t0) {
            this.f2743b = c0978t0;
        }
    }

    public /* synthetic */ C0869u5(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m3220f(C0869u5 c0869u5, C0978t0 c0978t0, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = AbstractC0883w5.m3249a();
        }
        c0869u5.m3225e(c0978t0, j10);
    }

    /* JADX INFO: renamed from: a */
    public final void m3221a() {
        this.f2741f = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m3222b(C0978t0 c0978t0) {
        C0978t0 c0978t0M3228b;
        this.f2741f = false;
        a aVar = this.f2737b;
        if (AbstractC1061t.m3842c(c0978t0, aVar != null ? aVar.m3228b() : null)) {
            return;
        }
        String strM3586k = c0978t0.m3586k();
        a aVar2 = this.f2737b;
        boolean zM3842c = AbstractC1061t.m3842c(strM3586k, (aVar2 == null || (c0978t0M3228b = aVar2.m3228b()) == null) ? null : c0978t0M3228b.m3586k());
        a aVar3 = this.f2737b;
        if (zM3842c) {
            if (aVar3 != null) {
                aVar3.m3230d(c0978t0);
                return;
            }
            return;
        }
        this.f2737b = new a(aVar3, c0978t0);
        this.f2738c = null;
        int length = this.f2739d + c0978t0.m3586k().length();
        this.f2739d = length;
        if (length > this.f2736a) {
            m3224d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0978t0 m3223c() {
        a aVar = this.f2738c;
        if (aVar == null) {
            return null;
        }
        this.f2738c = aVar.m3227a();
        this.f2737b = new a(this.f2737b, aVar.m3228b());
        this.f2739d += aVar.m3228b().m3586k().length();
        return aVar.m3228b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3224d() {
        /*
            r3 = this;
            b0.u5$a r0 = r3.f2737b
            r1 = 0
            if (r0 == 0) goto La
            b0.u5$a r2 = r0.m3227a()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            goto L28
        Le:
            if (r0 == 0) goto L1b
            b0.u5$a r2 = r0.m3227a()
            if (r2 == 0) goto L1b
            b0.u5$a r2 = r2.m3227a()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            b0.u5$a r0 = r0.m3227a()
            goto Le
        L23:
            if (r0 == 0) goto L28
            r0.m3229c(r1)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b0.C0869u5.m3224d():void");
    }

    /* JADX INFO: renamed from: e */
    public final void m3225e(C0978t0 c0978t0, long j10) {
        if (!this.f2741f) {
            Long l10 = this.f2740e;
            if (j10 <= (l10 != null ? l10.longValue() : 0L) + ((long) AbstractC0876v5.m3235a())) {
                return;
            }
        }
        this.f2740e = Long.valueOf(j10);
        m3222b(c0978t0);
    }

    /* JADX INFO: renamed from: g */
    public final C0978t0 m3226g() {
        a aVarM3227a;
        a aVar = this.f2737b;
        if (aVar == null || (aVarM3227a = aVar.m3227a()) == null) {
            return null;
        }
        this.f2737b = aVarM3227a;
        this.f2739d -= aVar.m3228b().m3586k().length();
        this.f2738c = new a(this.f2738c, aVar.m3228b());
        return aVarM3227a.m3228b();
    }

    public C0869u5(int i10) {
        this.f2736a = i10;
    }
}

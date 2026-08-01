package p073f2;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1067w;
import p117i.C3070l0;
import p117i.C3076o0;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;

/* JADX INFO: renamed from: f2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2237e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3578w f6130a;

    /* JADX INFO: renamed from: b */
    public boolean f6131b;

    /* JADX INFO: renamed from: c */
    public boolean f6132c;

    /* JADX INFO: renamed from: d */
    public boolean f6133d;

    /* JADX INFO: renamed from: e */
    public boolean f6134e;

    /* JADX INFO: renamed from: f */
    public final C3076o0 f6135f = new C3076o0(0, 1, null);

    /* JADX INFO: renamed from: g */
    public final C2255n f6136g = new C2255n();

    /* JADX INFO: renamed from: h */
    public final C3070l0 f6137h = new C3070l0(10);

    /* JADX INFO: renamed from: f2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0173a {

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC4507m.c f6139s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4507m.c cVar) {
            super(0);
            this.f6139s = cVar;
        }

        /* JADX INFO: renamed from: a */
        public final void m8093a() {
            C2237e.this.m8092g(this.f6139s);
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            m8093a();
            return C4700i0.f13910a;
        }
    }

    public C2237e(InterfaceC3578w interfaceC3578w) {
        this.f6130a = interfaceC3578w;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8087b(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073f2.C2237e.m8087b(long, java.util.List, boolean):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m8088c() {
        if (this.f6133d) {
            this.f6133d = true;
        } else {
            this.f6136g.m8190c();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8089d(C2241g c2241g, boolean z10) {
        C3076o0 c3076o0;
        if (!this.f6136g.mo8179a(c2241g.m8124b(), this.f6130a, c2241g, z10)) {
            return false;
        }
        boolean z11 = true;
        this.f6131b = true;
        boolean zMo8183f = this.f6136g.mo8183f(c2241g.m8124b(), this.f6130a, c2241g, z10);
        if (!this.f6136g.mo8182e(c2241g) && !zMo8183f) {
            z11 = false;
        }
        this.f6131b = false;
        if (this.f6134e) {
            this.f6134e = false;
            int iM11587e = this.f6135f.m11587e();
            int i10 = 0;
            while (true) {
                c3076o0 = this.f6135f;
                if (i10 >= iM11587e) {
                    break;
                }
                m8092g((InterfaceC4507m.c) c3076o0.m11586d(i10));
                i10++;
            }
            c3076o0.m11468u();
        }
        if (this.f6132c) {
            this.f6132c = false;
            m8090e();
        }
        if (this.f6133d) {
            this.f6133d = false;
            m8088c();
        }
        return z11;
    }

    /* JADX INFO: renamed from: e */
    public final void m8090e() {
        if (this.f6131b) {
            this.f6132c = true;
        } else {
            this.f6136g.mo8181d();
            m8088c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8091f(long j10, C3076o0 c3076o0) {
        this.f6136g.mo8184h(j10, c3076o0);
    }

    /* JADX INFO: renamed from: g */
    public final void m8092g(InterfaceC4507m.c cVar) {
        if (!this.f6131b) {
            this.f6136g.m8192i(cVar);
        } else {
            this.f6134e = true;
            this.f6135f.m11461n(cVar);
        }
    }
}

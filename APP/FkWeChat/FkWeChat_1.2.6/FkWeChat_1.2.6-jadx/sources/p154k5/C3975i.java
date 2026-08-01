package p154k5;

import bsh.C1259t2;
import java.util.HashSet;
import p254r5.AbstractC6487a;

/* JADX INFO: renamed from: k5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3975i {

    /* JADX INFO: renamed from: a */
    public final int f11474a;

    /* JADX INFO: renamed from: b */
    public C3989w f11475b;

    /* JADX INFO: renamed from: c */
    public InterfaceC3964c f11476c;

    /* JADX INFO: renamed from: d */
    public C3968e f11477d;

    /* JADX INFO: renamed from: e */
    public C3990x f11478e;

    /* JADX INFO: renamed from: f */
    public C3983q f11479f;

    /* JADX INFO: renamed from: g */
    public C3977k f11480g;

    /* JADX INFO: renamed from: k5.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo13474a(AbstractC6487a abstractC6487a);
    }

    public C3975i(int i10, C3989w c3989w, InterfaceC3964c interfaceC3964c) {
        if (c3989w == null) {
            C1259t2.m5095a("unprocessedInsns == null");
            throw null;
        }
        if (interfaceC3964c == null) {
            C1259t2.m5095a("unprocessedCatches == null");
            throw null;
        }
        this.f11474a = i10;
        this.f11475b = c3989w;
        this.f11476c = interfaceC3964c;
        this.f11477d = null;
        this.f11478e = null;
        this.f11479f = null;
        this.f11480g = null;
    }

    /* JADX INFO: renamed from: a */
    public void m15757a(a aVar) {
        this.f11475b.m15895j(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m15758b() {
        if (this.f11480g != null) {
            return;
        }
        C3977k c3977kM15899o = this.f11475b.m15899o();
        this.f11480g = c3977kM15899o;
        this.f11478e = C3990x.m15909F(c3977kM15899o, this.f11474a);
        this.f11479f = C3983q.m15836F(this.f11480g);
        this.f11477d = this.f11476c.build();
        this.f11475b = null;
        this.f11476c = null;
    }

    /* JADX INFO: renamed from: c */
    public HashSet m15759c() {
        return this.f11476c.mo15718b();
    }

    /* JADX INFO: renamed from: d */
    public C3968e m15760d() {
        m15758b();
        return this.f11477d;
    }

    /* JADX INFO: renamed from: e */
    public HashSet m15761e() {
        return this.f11475b.m15902r();
    }

    /* JADX INFO: renamed from: f */
    public C3977k m15762f() {
        m15758b();
        return this.f11480g;
    }

    /* JADX INFO: renamed from: g */
    public C3983q m15763g() {
        m15758b();
        return this.f11479f;
    }

    /* JADX INFO: renamed from: h */
    public C3990x m15764h() {
        m15758b();
        return this.f11478e;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15765i() {
        return this.f11476c.mo15717a();
    }

    /* JADX INFO: renamed from: j */
    public boolean m15766j() {
        return this.f11475b.m15903s();
    }

    /* JADX INFO: renamed from: k */
    public boolean m15767k() {
        return this.f11474a != 1 && this.f11475b.m15904t();
    }
}

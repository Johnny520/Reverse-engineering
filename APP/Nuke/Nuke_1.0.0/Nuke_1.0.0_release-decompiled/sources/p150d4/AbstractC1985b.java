package p150d4;

import java.io.IOException;
import p117X2.AbstractC1665j;
import p118X3.C1692b;
import p118X3.C1707q;
import p118X3.C1709s;
import p118X3.C1715y;
import p144c4.AbstractC1916f;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2711j;
import p208n4.C2716o;
import p208n4.InterfaceC2722u;

/* JADX INFO: renamed from: d4.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1985b implements InterfaceC2722u {

    /* JADX INFO: renamed from: d */
    public final C1709s f6676d;

    /* JADX INFO: renamed from: e */
    public final C2711j f6677e;

    /* JADX INFO: renamed from: f */
    public boolean f6678f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1991h f6679g;

    public AbstractC1985b(C1991h c1991h, C1709s c1709s) {
        AbstractC1665j.m2985e(c1709s, "url");
        this.f6679g = c1991h;
        this.f6676d = c1709s;
        this.f6677e = new C2711j(((C2716o) c1991h.f6695c.f308f).f8650d.mo3157a());
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3157a() {
        return this.f6677e;
    }

    /* JADX INFO: renamed from: b */
    public final void m3662b(C1707q c1707q) {
        C1715y c1715y;
        C1692b c1692b;
        AbstractC1665j.m2985e(c1707q, "trailers");
        C1991h c1991h = this.f6679g;
        int i5 = c1991h.f6696d;
        if (i5 == 6) {
            return;
        }
        if (i5 != 5) {
            throw new IllegalStateException("state: " + c1991h.f6696d);
        }
        C2711j c2711j = this.f6677e;
        AbstractC2724w abstractC2724w = c2711j.f8635e;
        c2711j.f8635e = AbstractC2724w.f8665d;
        abstractC2724w.mo4743a();
        abstractC2724w.mo4744b();
        c1991h.f6696d = 6;
        if (c1707q.size() <= 0 || (c1715y = c1991h.f6693a) == null || (c1692b = c1715y.f5926j) == null) {
            return;
        }
        AbstractC1916f.m3407b(c1692b, this.f6676d, c1707q);
    }

    @Override // p208n4.InterfaceC2722u
    /* JADX INFO: renamed from: y */
    public long mo554y(C2706e c2706e, long j5) throws IOException {
        C1991h c1991h = this.f6679g;
        AbstractC1665j.m2985e(c2706e, "sink");
        try {
            return ((C2716o) c1991h.f6695c.f308f).mo554y(c2706e, j5);
        } catch (IOException e5) {
            c1991h.f6694b.mo3333h();
            m3662b(C1991h.f6692f);
            throw e5;
        }
    }
}

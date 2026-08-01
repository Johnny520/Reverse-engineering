package p150d4;

import p123Y3.AbstractC1774e;
import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2711j;
import p208n4.C2715n;
import p208n4.InterfaceC2720s;

/* JADX INFO: renamed from: d4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1989f implements InterfaceC2720s {

    /* JADX INFO: renamed from: d */
    public final C2711j f6688d;

    /* JADX INFO: renamed from: e */
    public boolean f6689e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1991h f6690f;

    public C1989f(C1991h c1991h) {
        this.f6690f = c1991h;
        this.f6688d = new C2711j(((C2715n) c1991h.f6695c.f309g).f8647d.mo3339a());
    }

    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f6688d;
    }

    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6689e) {
            return;
        }
        this.f6689e = true;
        C2711j c2711j = this.f6688d;
        AbstractC2724w abstractC2724w = c2711j.f8635e;
        c2711j.f8635e = AbstractC2724w.f8665d;
        abstractC2724w.mo4743a();
        abstractC2724w.mo4744b();
        this.f6690f.f6696d = 3;
    }

    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    public final void flush() {
        if (this.f6689e) {
            return;
        }
        ((C2715n) this.f6690f.f6695c.f309g).flush();
    }

    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) {
        if (this.f6689e) {
            throw new IllegalStateException("closed");
        }
        AbstractC1774e.m3160a(c2706e.f8629e, 0L, j5);
        ((C2715n) this.f6690f.f6695c.f309g).mo3343p(c2706e, j5);
    }
}

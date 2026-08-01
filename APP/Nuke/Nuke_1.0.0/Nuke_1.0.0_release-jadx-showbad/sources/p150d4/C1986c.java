package p150d4;

import p208n4.AbstractC2724w;
import p208n4.C2706e;
import p208n4.C2711j;
import p208n4.C2715n;
import p208n4.InterfaceC2720s;

/* JADX INFO: renamed from: d4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1986c implements InterfaceC2720s {

    /* JADX INFO: renamed from: d */
    public final C2711j f6680d;

    /* JADX INFO: renamed from: e */
    public boolean f6681e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1991h f6682f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1986c(C1991h c1991h) {
        this.f6682f = c1991h;
        this.f6680d = new C2711j(((C2715n) c1991h.f6695c.f309g).f8647d.mo3339a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: a */
    public final AbstractC2724w mo3339a() {
        return this.f6680d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f6681e) {
            return;
        }
        this.f6681e = true;
        ((C2715n) this.f6682f.f6695c.f309g).mo4728v("0\r\n\r\n");
        C2711j c2711j = this.f6680d;
        AbstractC2724w abstractC2724w = c2711j.f8635e;
        c2711j.f8635e = AbstractC2724w.f8665d;
        abstractC2724w.mo4743a();
        abstractC2724w.mo4744b();
        this.f6682f.f6696d = 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s, java.io.Flushable
    public final synchronized void flush() {
        if (this.f6681e) {
            return;
        }
        ((C2715n) this.f6682f.f6695c.f309g).flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.InterfaceC2720s
    /* JADX INFO: renamed from: p */
    public final void mo3343p(C2706e c2706e, long j5) {
        if (this.f6681e) {
            throw new IllegalStateException("closed");
        }
        if (j5 == 0) {
            return;
        }
        C2715n c2715n = (C2715n) this.f6682f.f6695c.f309g;
        if (c2715n.f8649f) {
            throw new IllegalStateException("closed");
        }
        c2715n.f8648e.m4707I(j5);
        c2715n.m4752b();
        c2715n.mo4728v("\r\n");
        c2715n.mo3343p(c2706e, j5);
        c2715n.mo4728v("\r\n");
    }
}

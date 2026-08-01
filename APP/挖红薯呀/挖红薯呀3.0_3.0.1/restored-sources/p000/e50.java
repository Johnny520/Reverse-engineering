package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e50 implements ju0, InterfaceC0729sk {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0618pk f1298d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0904ww f1299e;

    /* JADX INFO: renamed from: f */
    public final C0286hk f1300f;

    /* JADX INFO: renamed from: g */
    public r31 f1301g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e50(InterfaceC0618pk interfaceC0618pk, InterfaceC0904ww interfaceC0904ww) {
        this.f1298d = interfaceC0618pk;
        this.f1299e = interfaceC0904ww;
        this.f1300f = p30.m2995e(interfaceC0618pk.mo63h(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: c */
    public final void mo784c() {
        r31 r31Var = this.f1301g;
        if (r31Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r31Var.mo478a(cancellationException);
        }
        this.f1301g = AbstractC0307i4.m1547w(this.f1300f, null, this.f1299e, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: d */
    public final void mo785d() {
        r31 r31Var = this.f1301g;
        if (r31Var != null) {
            r31Var.mo1613B(new C0224fw(1));
        }
        this.f1301g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ju0
    /* JADX INFO: renamed from: e */
    public final void mo786e() {
        r31 r31Var = this.f1301g;
        if (r31Var != null) {
            r31Var.mo1613B(new C0224fw(1));
        }
        this.f1301g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0515nk
    public final InterfaceC0554ok getKey() {
        return C0496n2.f4164x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk mo63h(InterfaceC0618pk interfaceC0618pk) {
        return pf1.m3034J(this, interfaceC0618pk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: l */
    public final InterfaceC0515nk mo64l(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3062v(this, interfaceC0554ok);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0729sk
    /* JADX INFO: renamed from: n */
    public final void mo787n(InterfaceC0618pk interfaceC0618pk, Throwable th) throws Throwable {
        C0890wi c0890wi = (C0890wi) interfaceC0618pk.mo64l(C0890wi.f7133e);
        if (c0890wi != null) {
            rd0.m3464W(th, new C0081c7(2, c0890wi, this));
        }
        InterfaceC0729sk interfaceC0729sk = (InterfaceC0729sk) this.f1298d.mo64l(C0496n2.f4164x);
        if (interfaceC0729sk == null) {
            throw th;
        }
        interfaceC0729sk.mo787n(interfaceC0618pk, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: p */
    public final Object mo65p(InterfaceC0904ww interfaceC0904ww, Object obj) {
        return interfaceC0904ww.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0618pk
    /* JADX INFO: renamed from: t */
    public final InterfaceC0618pk mo66t(InterfaceC0554ok interfaceC0554ok) {
        return pf1.m3030F(this, interfaceC0554ok);
    }
}

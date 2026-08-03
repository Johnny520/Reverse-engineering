package p000;

/* JADX INFO: renamed from: mt */
/* JADX INFO: loaded from: classes.dex */
public final class C2249mt implements InterfaceC0480L6 {

    /* JADX INFO: renamed from: a */
    public final C2461ri f7954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2335ot f7955b;

    public C2249mt(C2335ot c2335ot, C2461ri c2461ri) {
        this.f7955b = c2335ot;
        this.f7954a = c2461ri;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ui, pj] */
    @Override // p000.InterfaceC0480L6
    public final void cancel() {
        C2335ot c2335ot = this.f7955b;
        C0134D4 c0134d4 = c2335ot.f8204b;
        C2461ri c2461ri = this.f7954a;
        c0134d4.remove(c2461ri);
        if (AbstractC0585Nj.m1134a(c2335ot.f8205c, c2461ri)) {
            c2461ri.getClass();
            c2335ot.f8205c = null;
        }
        c2461ri.f8674b.remove(this);
        ?? r0 = c2461ri.f8675c;
        if (r0 != 0) {
            r0.mo6a();
        }
        c2461ri.f8675c = null;
    }
}

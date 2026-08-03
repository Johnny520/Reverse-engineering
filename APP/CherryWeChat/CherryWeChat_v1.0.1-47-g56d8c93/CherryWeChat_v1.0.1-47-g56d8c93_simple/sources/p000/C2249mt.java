package p000;

/* JADX INFO: renamed from: mt */
/* JADX INFO: loaded from: classes.dex */
public final class C2249mt implements InterfaceC0480L6 {

    /* JADX INFO: renamed from: a */
    public final C2461ri f7954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2335ot f7955b;

    public C2249mt(C2335ot r1, C2461ri r2) {
        this.f7955b = r1;
        this.f7954a = r2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Ui, pj] */
    @Override // p000.InterfaceC0480L6
    public final void cancel() {
        C2335ot r0 = this.f7955b;
        C0134D4 r1 = r0.f8204b;
        C2461ri r2 = this.f7954a;
        r1.remove(r2);
        if (AbstractC0585Nj.m1134a(r0.f8205c, r2) == false) goto L5;
        r2.getClass();
        r0.f8205c = null;
    L5:
        r2.f8674b.remove(this);
        ?? r02 = r2.f8675c;
        if (r02 == 0) goto L8;
        r02.mo6a();
    L8:
        r2.f8675c = null;
    }
}

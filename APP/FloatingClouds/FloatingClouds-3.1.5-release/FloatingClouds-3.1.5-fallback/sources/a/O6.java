package a;

/* JADX INFO: loaded from: classes.dex */
public final class O6 implements a.Q3<a.R6.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.H2 f199a;

    public O6(a.H2 r1) {
            r0 = this;
            r0.<init>()
            r0.f199a = r1
            return
    }

    @Override // a.Q3
    public final void a(a.R6.a r2) {
            r1 = this;
            a.R6$a r2 = (a.R6.a) r2
            if (r2 != 0) goto La
            a.R6$a r2 = new a.R6$a
            r0 = -3
            r2.<init>(r0)
        La:
            a.H2 r0 = r1.f199a
            r0.a(r2)
            return
    }
}

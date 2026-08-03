package a;

/* JADX INFO: renamed from: a.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303oc extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.C0115e3 f625a;

    public C0303oc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r4) {
            r3 = this;
            a.e3 r0 = r3.f625a
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.b(r4)
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 2
            r4.i(r2)
            r2 = 1
            r4.a(r2, r0)
            r4.a(r1, r1)
            int r0 = r4.e()
            r4.f(r0)
            return r0
    }
}

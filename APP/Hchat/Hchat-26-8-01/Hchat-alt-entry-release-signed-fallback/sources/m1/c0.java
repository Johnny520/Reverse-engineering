package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg.l f8524a;

    public abstract void a(h1.d r1);

    public fg.l b() {
            r1 = this;
            fg.l r0 = r1.f8524a
            return r0
    }

    public final void c() {
            r1 = this;
            fg.l r0 = r1.b()
            if (r0 == 0) goto L9
            r0.invoke(r1)
        L9:
            return
    }

    public void d(b1.f r1) {
            r0 = this;
            r0.f8524a = r1
            return
    }
}

package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22555g;

    public j() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f22555g = r0
            return
    }

    public j(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f22555g = r1
            return
    }

    public final boolean e() {
            r1 = this;
            boolean r0 = r1.f22555g
            return r0
    }

    public void i() {
            r1 = this;
            r0 = 0
            r1.f22555g = r0
            return
    }

    public final void j() {
            r3 = this;
            boolean r0 = r3.f22555g
            if (r0 == 0) goto L5
            return
        L5:
            e4.a r0 = new e4.a
            java.lang.String r1 = "immutable instance"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
    }

    public final void k() {
            r3 = this;
            boolean r0 = r3.f22555g
            if (r0 != 0) goto L5
            return
        L5:
            e4.a r0 = new e4.a
            java.lang.String r1 = "mutable instance"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
    }
}

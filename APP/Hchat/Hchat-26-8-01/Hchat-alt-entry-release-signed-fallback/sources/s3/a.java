package s3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r3.c f12335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f12336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.List f12337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r3.a f12340f;

    public final void a() {
            r2 = this;
            r3.a r0 = r2.f12340f
            if (r0 == 0) goto L21
            java.util.LinkedHashSet r1 = r0.f11336d
            boolean r1 = r1.remove(r2)
            if (r1 == 0) goto L21
            r3.d r0 = r0.f11334b
            r0.getClass()
            tf.k r1 = r0.f11342b
            r1.remove(r2)
            tf.k r1 = r0.f11343c
            r1.remove(r2)
            r1 = 0
            r2.f12340f = r1
            r0.a()
        L21:
            return
    }
}

package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.l f296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.o f297b;

    public final void a(androidx.lifecycle.q r4, androidx.lifecycle.k r5) {
            r3 = this;
            androidx.lifecycle.l r0 = r5.a()
            androidx.lifecycle.l r1 = r3.f296a
            r1.getClass()
            int r2 = r0.compareTo(r1)
            if (r2 >= 0) goto L10
            r1 = r0
        L10:
            r3.f296a = r1
            androidx.lifecycle.o r1 = r3.f297b
            r1.b(r4, r5)
            r3.f296a = r0
            return
    }
}

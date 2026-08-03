package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.PathMeasure f3072a;

    public k(android.graphics.PathMeasure r1) {
            r0 = this;
            r0.<init>()
            r0.f3072a = r1
            return
    }

    public final void a(float r3, float r4, f1.j r5) {
            r2 = this;
            if (r5 == 0) goto Lb
            android.graphics.Path r5 = r5.f3067a
            android.graphics.PathMeasure r0 = r2.f3072a
            r1 = 1
            r0.getSegment(r3, r4, r5, r1)
            return
        Lb:
            java.lang.String r3 = "Unable to obtain android.graphics.Path"
            j8.o.w(r3)
            return
    }
}

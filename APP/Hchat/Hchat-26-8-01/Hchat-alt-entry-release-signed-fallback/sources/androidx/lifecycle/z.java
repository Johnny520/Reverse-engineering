package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static void a(android.app.Activity r1, androidx.lifecycle.k r2) {
            r2.getClass()
            boolean r0 = r1 instanceof androidx.lifecycle.q
            if (r0 == 0) goto L12
            androidx.lifecycle.q r1 = (androidx.lifecycle.q) r1
            androidx.lifecycle.s r1 = r1.f()
            if (r1 == 0) goto L12
            r1.d(r2)
        L12:
            return
    }
}

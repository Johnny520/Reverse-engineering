package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u2.d f20942a = null;

    static {
            u2.d r0 = fb.v0.a()
            x1.i0.f20942a = r0
            return
    }

    public static final x1.r1 a(x1.f0 r0) {
            x1.r1 r0 = r0.f20902t
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "LayoutNode should be attached to an owner"
            af.d r0 = wb.en.a(r0)
            throw r0
    }
}

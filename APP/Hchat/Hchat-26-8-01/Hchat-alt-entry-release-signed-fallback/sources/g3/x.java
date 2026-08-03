package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends g3.a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f4247e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3.a f4248f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final android.view.animation.DecelerateInterpolator f4249g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final android.view.animation.AccelerateInterpolator f4250h = null;

    static {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 1066192077(0x3f8ccccd, float:1.1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0.<init>(r3, r1, r3, r2)
            g3.x.f4247e = r0
            n3.a r0 = new n3.a
            r0.<init>()
            g3.x.f4248f = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r1)
            g3.x.f4249g = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            g3.x.f4250h = r0
            return
    }

    public static void f(android.view.View r2, g3.b0 r3) {
            g3.s r0 = j(r2)
            if (r0 == 0) goto Le
            r0.a(r3)
            int r0 = r0.f4232h
            if (r0 != 0) goto Le
            goto L25
        Le:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L15:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r2.getChildAt(r0)
            f(r1, r3)
            int r0 = r0 + 1
            goto L15
        L25:
            return
    }

    public static void g(android.view.View r2, g3.b0 r3, g3.r0 r4, boolean r5) {
            g3.s r0 = j(r2)
            r1 = 0
            if (r0 == 0) goto L15
            r0.f4233i = r4
            if (r5 != 0) goto L15
            r0.b()
            int r5 = r0.f4232h
            if (r5 != 0) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = r1
        L15:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L1b:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L2b
            android.view.View r0 = r2.getChildAt(r1)
            g(r0, r3, r4, r5)
            int r1 = r1 + 1
            goto L1b
        L2b:
            return
    }

    public static void h(android.view.View r2, g3.r0 r3, java.util.List r4) {
            g3.s r0 = j(r2)
            if (r0 == 0) goto Lf
            g3.r0 r3 = r0.d(r3, r4)
            int r0 = r0.f4232h
            if (r0 != 0) goto Lf
            goto L26
        Lf:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L26
            android.view.View r1 = r2.getChildAt(r0)
            h(r1, r3, r4)
            int r0 = r0 + 1
            goto L16
        L26:
            return
    }

    public static void i(android.view.View r2, g3.b0 r3, b.e r4) {
            g3.s r0 = j(r2)
            if (r0 == 0) goto Le
            r0.e(r3, r4)
            int r0 = r0.f4232h
            if (r0 != 0) goto Le
            goto L25
        Le:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L15:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r2.getChildAt(r0)
            i(r1, r3, r4)
            int r0 = r0 + 1
            goto L15
        L25:
            return
    }

    public static g3.s j(android.view.View r1) {
            r0 = 2131099758(0x7f06006e, float:1.7811878E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof g3.w
            if (r0 == 0) goto L10
            g3.w r1 = (g3.w) r1
            g3.s r1 = r1.f4245a
            return r1
        L10:
            r1 = 0
            return r1
    }
}

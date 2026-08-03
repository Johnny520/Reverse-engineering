package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4227a = 0;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return
    }

    public static void a(android.view.ViewGroup r1, g3.b r2) {
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto La
            r0 = 1
            r1.setImportantForAccessibility(r0)
        La:
            g3.a r2 = r2.f4186h
            r1.setAccessibilityDelegate(r2)
            return
    }

    public static void b(android.view.View r3, g3.s r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L12
            if (r4 == 0) goto Le
            g3.y r2 = new g3.y
            r2.<init>(r4)
        Le:
            g3.h.m(r3, r2)
            return
        L12:
            android.view.animation.PathInterpolator r0 = g3.x.f4247e
            if (r4 == 0) goto L1b
            g3.w r2 = new g3.w
            r2.<init>(r3, r4)
        L1b:
            r4 = 2131099758(0x7f06006e, float:1.7811878E38)
            r3.setTag(r4, r2)
            r4 = 2131099748(0x7f060064, float:1.7811858E38)
            java.lang.Object r4 = r3.getTag(r4)
            if (r4 != 0) goto L36
            r4 = 2131099749(0x7f060065, float:1.781186E38)
            java.lang.Object r4 = r3.getTag(r4)
            if (r4 != 0) goto L36
            r3.setOnApplyWindowInsetsListener(r2)
        L36:
            return
    }
}

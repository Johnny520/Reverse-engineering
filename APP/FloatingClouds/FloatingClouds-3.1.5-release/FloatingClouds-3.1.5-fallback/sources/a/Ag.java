package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f17a = true;

    public static class a {
        public static int a(android.view.ViewGroup r0, int r1) {
                int r0 = r0.getChildDrawingOrder(r1)
                return r0
        }

        public static void b(android.view.ViewGroup r0, boolean r1) {
                r0.suppressLayout(r1)
                return
        }
    }

    public static void a(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            a.Ag.a.b(r2, r3)
            return
        La:
            boolean r0 = a.Ag.f17a
            if (r0 == 0) goto L15
            a.Ag.a.b(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r2 = 0
            a.Ag.f17a = r2
        L15:
            return
    }
}

package a;

/* JADX INFO: renamed from: a.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.DisplayCutout f572a;

    /* JADX INFO: renamed from: a.m5$a */
    public static class a {
        public static android.view.DisplayCutout a(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        public static java.util.List<android.graphics.Rect> b(android.view.DisplayCutout r0) {
                java.util.List r0 = r0.getBoundingRects()
                return r0
        }

        public static int c(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetBottom()
                return r0
        }

        public static int d(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetLeft()
                return r0
        }

        public static int e(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetRight()
                return r0
        }

        public static int f(android.view.DisplayCutout r0) {
                int r0 = r0.getSafeInsetTop()
                return r0
        }
    }

    public C0260m5(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.f572a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<a.m5> r1 = a.C0260m5.class
            if (r1 == r0) goto Lf
            goto L1a
        Lf:
            a.m5 r3 = (a.C0260m5) r3
            android.view.DisplayCutout r0 = r2.f572a
            android.view.DisplayCutout r3 = r3.f572a
            boolean r3 = java.util.Objects.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.f572a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r1 = r2.f572a
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

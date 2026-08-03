package a;

/* JADX INFO: renamed from: a.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0475y5 {

    /* JADX INFO: renamed from: a.y5$a */
    public static class a {
        public static void a(android.graphics.Outline r0, android.graphics.Path r1) {
                r0.setConvexPath(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.y5$b */
    public static class b {
        public static void a(android.graphics.Outline r0, android.graphics.Path r1) {
                a.F.n(r0, r1)
                return
        }
    }

    public static android.content.res.ColorStateList a(android.graphics.drawable.Drawable r2) {
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto Lf
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r2 = r2.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            return r2
        Lf:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L24
            boolean r0 = a.E.q(r2)
            if (r0 == 0) goto L24
            android.graphics.drawable.ColorStateListDrawable r2 = a.E.d(r2)
            android.content.res.ColorStateList r2 = a.E.c(r2)
            return r2
        L24:
            r2 = 0
            return r2
    }
}

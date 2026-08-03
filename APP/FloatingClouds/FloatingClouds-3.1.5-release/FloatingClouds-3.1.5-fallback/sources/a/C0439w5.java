package a;

/* JADX INFO: renamed from: a.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0439w5 {

    /* JADX INFO: renamed from: a.w5$a */
    public static class a {
        public static void a(android.graphics.drawable.Drawable r0, android.content.res.Resources.Theme r1) {
                r0.applyTheme(r1)
                return
        }

        public static boolean b(android.graphics.drawable.Drawable r0) {
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        public static android.graphics.ColorFilter c(android.graphics.drawable.Drawable r0) {
                android.graphics.ColorFilter r0 = r0.getColorFilter()
                return r0
        }

        public static void d(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) {
                r0.inflate(r1, r2, r3, r4)
                return
        }

        public static void e(android.graphics.drawable.Drawable r0, float r1, float r2) {
                r0.setHotspot(r1, r2)
                return
        }

        public static void f(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
                r0.setHotspotBounds(r1, r2, r3, r4)
                return
        }

        public static void g(android.graphics.drawable.Drawable r0, int r1) {
                r0.setTint(r1)
                return
        }

        public static void h(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
                r0.setTintList(r1)
                return
        }

        public static void i(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
                r0.setTintMode(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.w5$b */
    public static class b {
        public static int a(android.graphics.drawable.Drawable r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        public static boolean b(android.graphics.drawable.Drawable r0, int r1) {
                boolean r0 = r0.setLayoutDirection(r1)
                return r0
        }
    }

    public static void a(android.graphics.drawable.Drawable r0, int r1) {
            a.C0439w5.a.g(r0, r1)
            return
    }
}

package a;

/* JADX INFO: loaded from: classes.dex */
public class Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f266a = true;
    public static java.lang.reflect.Field b;
    public static boolean c;

    public static class a {
        public static float a(android.view.View r0) {
                float r0 = a.E.a(r0)
                return r0
        }

        public static void b(android.view.View r0, float r1) {
                a.E.j(r0, r1)
                return
        }
    }

    @android.annotation.SuppressLint({"NewApi"})
    public float a(android.view.View r2) {
            r1 = this;
            boolean r0 = a.Sg.f266a
            if (r0 == 0) goto Lc
            float r2 = a.Sg.a.a(r2)     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            a.Sg.f266a = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void b(android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = a.Sg.f266a
            if (r0 == 0) goto Lb
            a.Sg.a.b(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            a.Sg.f266a = r0
        Lb:
            r2.setAlpha(r3)
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public void c(android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = a.Sg.c
            if (r0 != 0) goto L1c
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            a.Sg.b = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            goto L1a
        L13:
            java.lang.String r1 = "ViewUtilsApi19"
            java.lang.String r2 = "fetchViewFlagsField: "
            android.util.Log.i(r1, r2)
        L1a:
            a.Sg.c = r0
        L1c:
            java.lang.reflect.Field r0 = a.Sg.b
            if (r0 == 0) goto L2c
            int r0 = r0.getInt(r4)     // Catch: java.lang.IllegalAccessException -> L2c
            java.lang.reflect.Field r1 = a.Sg.b     // Catch: java.lang.IllegalAccessException -> L2c
            r0 = r0 & (-13)
            r5 = r5 | r0
            r1.setInt(r4, r5)     // Catch: java.lang.IllegalAccessException -> L2c
        L2c:
            return
    }
}

package a;

/* JADX INFO: loaded from: classes.dex */
public class Tg extends a.Sg {
    public static boolean d = true;
    public static boolean e = true;

    public static class a {
        public static void a(android.view.View r0, android.graphics.Matrix r1) {
                a.E.m(r0, r1)
                return
        }

        public static void b(android.view.View r0, android.graphics.Matrix r1) {
                a.E.t(r0, r1)
                return
        }

        public static void c(android.view.View r0, android.graphics.Matrix r1) {
                a.E.y(r0, r1)
                return
        }
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void d(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = a.Tg.d
            if (r0 == 0) goto Lb
            a.Tg.a.b(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            a.Tg.d = r2
        Lb:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void e(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = a.Tg.e
            if (r0 == 0) goto Lb
            a.Tg.a.c(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            a.Tg.e = r2
        Lb:
            return
    }
}

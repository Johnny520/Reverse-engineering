package a;

/* JADX INFO: loaded from: classes.dex */
public class Ug extends a.Tg {
    public static boolean f = true;

    public static class a {
        public static void a(android.view.View r0, int r1, int r2, int r3, int r4) {
                a.E.l(r0, r1, r2, r3, r4)
                return
        }
    }

    @android.annotation.SuppressLint({"NewApi"})
    public void f(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = a.Ug.f
            if (r0 == 0) goto Lb
            a.Ug.a.a(r2, r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            a.Ug.f = r2
        Lb:
            return
    }
}

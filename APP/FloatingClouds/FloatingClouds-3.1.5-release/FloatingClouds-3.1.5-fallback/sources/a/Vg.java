package a;

/* JADX INFO: loaded from: classes.dex */
public class Vg extends a.Ug {
    public static boolean g = true;

    public static class a {
        public static void a(android.view.View r0, int r1) {
                a.E.k(r0, r1)
                return
        }
    }

    @Override // a.Sg
    @android.annotation.SuppressLint({"NewApi"})
    public void c(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.c(r3, r4)
            return
        La:
            boolean r0 = a.Vg.g
            if (r0 == 0) goto L15
            a.Vg.a.a(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r3 = 0
            a.Vg.g = r3
        L15:
            return
    }
}

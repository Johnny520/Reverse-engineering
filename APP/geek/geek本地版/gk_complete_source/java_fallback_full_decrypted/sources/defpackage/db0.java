package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class db0 extends defpackage.zt {
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;
    public static boolean h = true;

    @Override // defpackage.zt
    public void O(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.O(r3, r4)
            return
        La:
            boolean r0 = defpackage.db0.h
            if (r0 == 0) goto L15
            defpackage.f0.l(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r3 = 0
            defpackage.db0.h = r3
        L15:
            return
    }

    public void T(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = defpackage.db0.g
            if (r0 == 0) goto Lb
            defpackage.f0.m(r2, r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            defpackage.db0.g = r2
        Lb:
            return
    }

    public void U(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = defpackage.db0.e
            if (r0 == 0) goto Lb
            defpackage.f0.n(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            defpackage.db0.e = r2
        Lb:
            return
    }

    public void V(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = defpackage.db0.f
            if (r0 == 0) goto Lb
            defpackage.f0.x(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r2 = 0
            defpackage.db0.f = r2
        Lb:
            return
    }
}

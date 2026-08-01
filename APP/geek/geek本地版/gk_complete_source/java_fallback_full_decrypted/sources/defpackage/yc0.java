package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends defpackage.gt {
    public final android.view.WindowInsetsController a;
    public android.view.Window b;

    public yc0(android.view.WindowInsetsController r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.gt
    public final void B(boolean r2) {
            r1 = this;
            android.view.Window r0 = r1.b
            if (r2 == 0) goto L19
            if (r0 == 0) goto L13
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 | 16
            r2.setSystemUiVisibility(r0)
        L13:
            android.view.WindowInsetsController r2 = r1.a
            defpackage.uc0.e(r2)
            return
        L19:
            if (r0 == 0) goto L28
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 & (-17)
            r2.setSystemUiVisibility(r0)
        L28:
            android.view.WindowInsetsController r2 = r1.a
            defpackage.uc0.f(r2)
            return
    }

    @Override // defpackage.gt
    public final void C(boolean r2) {
            r1 = this;
            android.view.Window r0 = r1.b
            if (r2 == 0) goto L19
            if (r0 == 0) goto L13
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 | 8192(0x2000, float:1.148E-41)
            r2.setSystemUiVisibility(r0)
        L13:
            android.view.WindowInsetsController r2 = r1.a
            defpackage.uc0.c(r2)
            return
        L19:
            if (r0 == 0) goto L28
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r2.setSystemUiVisibility(r0)
        L28:
            android.view.WindowInsetsController r2 = r1.a
            defpackage.uc0.d(r2)
            return
    }
}

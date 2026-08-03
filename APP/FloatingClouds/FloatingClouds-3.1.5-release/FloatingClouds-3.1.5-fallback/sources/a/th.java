package a;

/* JADX INFO: loaded from: classes.dex */
public final class th extends a.C0282n9 {
    public final android.view.WindowInsetsController b;
    public android.view.Window c;

    public th(android.view.WindowInsetsController r1, a.C0233ke r2) {
            r0 = this;
            r0.<init>()
            a.ge r2 = new a.ge
            r2.<init>()
            r0.b = r1
            return
    }

    @Override // a.C0282n9
    public final void x(boolean r2) {
            r1 = this;
            android.view.Window r0 = r1.c
            if (r2 == 0) goto L19
            if (r0 == 0) goto L13
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 | 16
            r2.setSystemUiVisibility(r0)
        L13:
            android.view.WindowInsetsController r2 = r1.b
            a.sh.b(r2)
            return
        L19:
            if (r0 == 0) goto L28
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 & (-17)
            r2.setSystemUiVisibility(r0)
        L28:
            android.view.WindowInsetsController r2 = r1.b
            a.sh.a(r2)
            return
    }

    @Override // a.C0282n9
    public final void y(boolean r2) {
            r1 = this;
            android.view.Window r0 = r1.c
            if (r2 == 0) goto L19
            if (r0 == 0) goto L13
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 | 8192(0x2000, float:1.148E-41)
            r2.setSystemUiVisibility(r0)
        L13:
            android.view.WindowInsetsController r2 = r1.b
            a.F.r(r2)
            return
        L19:
            if (r0 == 0) goto L28
            android.view.View r2 = r0.getDecorView()
            int r0 = r2.getSystemUiVisibility()
            r0 = r0 & (-8193(0xffffffffffffdfff, float:NaN))
            r2.setSystemUiVisibility(r0)
        L28:
            android.view.WindowInsetsController r2 = r1.b
            a.F.w(r2)
            return
    }
}

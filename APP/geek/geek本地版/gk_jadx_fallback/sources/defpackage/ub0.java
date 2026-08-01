package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ub0 {
    public static void a(android.view.Window r1, boolean r2) {
            android.view.View r1 = r1.getDecorView()
            int r0 = r1.getSystemUiVisibility()
            if (r2 == 0) goto Ld
            r2 = r0 & (-1793(0xfffffffffffff8ff, float:NaN))
            goto Lf
        Ld:
            r2 = r0 | 1792(0x700, float:2.511E-42)
        Lf:
            r1.setSystemUiVisibility(r2)
            return
    }
}

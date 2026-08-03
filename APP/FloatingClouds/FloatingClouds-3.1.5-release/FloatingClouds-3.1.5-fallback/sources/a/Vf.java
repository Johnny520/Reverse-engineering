package a;

/* JADX INFO: loaded from: classes.dex */
public final class Vf {
    public static android.graphics.Typeface a(android.content.res.Configuration r2, android.graphics.Typeface r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L30
            int r0 = a.C0382t2.a(r2)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L30
            int r0 = a.C0382t2.a(r2)
            if (r0 == 0) goto L30
            if (r3 == 0) goto L30
            int r0 = r3.getWeight()
            int r2 = a.C0382t2.a(r2)
            int r2 = r2 + r0
            r0 = 1
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = a.C0282n9.j(r2, r0, r1)
            boolean r0 = r3.isItalic()
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r3, r2, r0)
            return r2
        L30:
            r2 = 0
            return r2
    }
}

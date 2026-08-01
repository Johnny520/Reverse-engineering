package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb0 {
    public static final defpackage.db0 a = null;
    public static final defpackage.x8 b = null;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            eb0 r0 = new eb0
            r0.<init>()
            defpackage.bb0.a = r0
            goto L15
        Le:
            db0 r0 = new db0
            r0.<init>()
            defpackage.bb0.a = r0
        L15:
            x8 r0 = new x8
            java.lang.String r1 = "translationAlpha"
            r2 = 5
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r0.<init>(r3, r1, r2)
            defpackage.bb0.b = r0
            x8 r0 = new x8
            java.lang.String r1 = "clipBounds"
            r2 = 6
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            r0.<init>(r3, r1, r2)
            return
    }

    public static void a(android.view.View r6, int r7, int r8, int r9, int r10) {
            db0 r0 = defpackage.bb0.a
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.T(r1, r2, r3, r4, r5)
            return
    }
}

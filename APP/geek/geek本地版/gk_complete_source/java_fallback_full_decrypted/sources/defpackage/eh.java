package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class eh {
    public static final int[] a = null;
    public static final int[] b = null;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            defpackage.eh.a = r0
            r0 = 0
            int[] r0 = new int[r0]
            defpackage.eh.b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            return
    }

    public static void a(android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L32
            r2 = 31
            if (r1 >= r2) goto L32
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L32
            int[] r0 = r3.getState()
            if (r0 == 0) goto L2a
            int r1 = r0.length
            if (r1 != 0) goto L24
            goto L2a
        L24:
            int[] r1 = defpackage.eh.b
            r3.setState(r1)
            goto L2f
        L2a:
            int[] r1 = defpackage.eh.a
            r3.setState(r1)
        L2f:
            r3.setState(r0)
        L32:
            return
    }

    public static android.graphics.PorterDuff.Mode b(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }
}

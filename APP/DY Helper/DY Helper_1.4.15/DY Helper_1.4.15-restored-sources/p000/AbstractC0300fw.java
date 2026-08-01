package p000;

/* JADX INFO: renamed from: fw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300fw {

    /* JADX INFO: renamed from: α */
    public static final int[] f4146 = null;

    /* JADX INFO: renamed from: β */
    public static final int[] f4147 = null;

    /* JADX INFO: renamed from: γ */
    public static final android.graphics.Rect f4148 = null;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            p000.AbstractC0300fw.f4146 = r0
            r0 = 0
            int[] r0 = new int[r0]
            p000.AbstractC0300fw.f4147 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            p000.AbstractC0300fw.f4148 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2205(android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto L2e
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2e
            int[] r0 = r3.getState()
            if (r0 == 0) goto L26
            int r1 = r0.length
            if (r1 != 0) goto L20
            goto L26
        L20:
            int[] r1 = p000.AbstractC0300fw.f4147
            r3.setState(r1)
            goto L2b
        L26:
            int[] r1 = p000.AbstractC0300fw.f4146
            r3.setState(r1)
        L2b:
            r3.setState(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: β */
    public static android.graphics.Rect m2206(android.graphics.drawable.Drawable r4) {
            android.graphics.Insets r4 = p000.AbstractC0263ew.m1967(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.left
            int r2 = r4.top
            int r3 = r4.right
            int r4 = r4.bottom
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static android.graphics.PorterDuff.Mode m2207(int r1, android.graphics.PorterDuff.Mode r2) {
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

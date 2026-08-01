package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲁᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0313 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int[] f1186 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final int[] f1187 = null;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final int[] f1188 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.lang.ThreadLocal f1189 = null;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final int[] f1190 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final int[] f1191 = null;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final int[] f1192 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            xhss.AbstractC0313.f1189 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0313.f1186 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0313.f1187 = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0313.f1191 = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            xhss.AbstractC0313.f1188 = r0
            r0 = 0
            int[] r0 = new int[r0]
            xhss.AbstractC0313.f1192 = r0
            r0 = 1
            int[] r0 = new int[r0]
            xhss.AbstractC0313.f1190 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static int m650(android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = m653(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = xhss.AbstractC0313.f1186
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            java.lang.ThreadLocal r0 = xhss.AbstractC0313.f1189
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L29
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L29:
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r0.resolveAttribute(r2, r1, r3)
            float r0 = r1.getFloat()
            int r4 = m651(r4, r5)
            int r5 = android.graphics.Color.alpha(r4)
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            int r0 = xhss.AbstractC0785.f2570
            if (r5 < 0) goto L56
            r0 = 255(0xff, float:3.57E-43)
            if (r5 > r0) goto L56
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            int r5 = r5 << 24
            r4 = r4 | r5
            return r4
        L56:
            java.lang.String r4 = "alpha must be between 0 and 255."
            xhss.C0532.m959(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m651(android.content.Context r2, int r3) {
            int[] r0 = xhss.AbstractC0313.f1190
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = r2.getColor(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.recycle()
            return r3
        L12:
            r3 = move-exception
            r2.recycle()
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m652(android.widget.TextView r3, android.content.Context r4) {
            java.lang.String r0 = "View "
            int[] r1 = xhss.AbstractC0293.f1126
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r1)
            r1 = 117(0x75, float:1.64E-43)
            boolean r1 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            java.lang.String r1 = "ThemeUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L2b
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            android.util.Log.e(r1, r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r3 = move-exception
            goto L31
        L2d:
            r4.recycle()
            return
        L31:
            r4.recycle()
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m653(android.content.Context r2, int r3) {
            int[] r0 = xhss.AbstractC0313.f1190
            r1 = 0
            r0[r1] = r3
            r3 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0)
            boolean r0 = r3.hasValue(r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1d
            int r0 = r3.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1d
            android.content.res.ColorStateList r2 = xhss.C0614.m1064(r2, r0)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r2 = r3.getColorStateList(r1)     // Catch: java.lang.Throwable -> L25
        L21:
            r3.recycle()
            return r2
        L25:
            r2 = move-exception
            r3.recycle()
            throw r2
    }
}

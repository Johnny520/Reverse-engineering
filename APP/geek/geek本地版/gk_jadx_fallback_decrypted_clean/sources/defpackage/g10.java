package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g10 {
    public static final int[] a = null;
    public static final java.lang.String b = null;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0, r1}
            defpackage.g10.a = r0
            java.lang.Class<g10> r0 = defpackage.g10.class
            java.lang.String r0 = r0.getSimpleName()
            defpackage.g10.b = r0
            return
    }

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList r3) {
            r0 = 0
            if (r3 == 0) goto L27
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            if (r1 > r2) goto L26
            int r1 = r3.getDefaultColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 != 0) goto L26
            int[] r1 = defpackage.g10.a
            int r0 = r3.getColorForState(r1, r0)
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L26
            java.lang.String r0 = defpackage.g10.b
            java.lang.String r1 = "Use a non-transparent color for the default color as it will be used to finish ripple animations."
            android.util.Log.w(r0, r1)
        L26:
            return r3
        L27:
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r0)
            return r3
    }

    public static boolean b(int[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L5:
            r5 = 1
            if (r2 >= r0) goto L27
            r6 = r8[r2]
            r7 = 16842910(0x101009e, float:2.3694E-38)
            if (r6 != r7) goto L11
            r3 = r5
            goto L24
        L11:
            r7 = 16842908(0x101009c, float:2.3693995E-38)
            if (r6 != r7) goto L18
        L16:
            r4 = r5
            goto L24
        L18:
            r7 = 16842919(0x10100a7, float:2.3694026E-38)
            if (r6 != r7) goto L1e
            goto L16
        L1e:
            r7 = 16843623(0x1010367, float:2.3696E-38)
            if (r6 != r7) goto L24
            goto L16
        L24:
            int r2 = r2 + 1
            goto L5
        L27:
            if (r3 == 0) goto L2c
            if (r4 == 0) goto L2c
            return r5
        L2c:
            return r1
    }
}

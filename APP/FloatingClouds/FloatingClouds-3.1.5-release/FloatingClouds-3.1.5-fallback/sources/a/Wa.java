package a;

/* JADX INFO: loaded from: classes.dex */
public final class Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f325a = null;
    public static final int[] b = null;

    static {
            r0 = 16842752(0x1010000, float:2.3693558E-38)
            int r1 = com.google.android.material.R.attr.theme
            int[] r0 = new int[]{r0, r1}
            a.Wa.f325a = r0
            int r0 = com.google.android.material.R.attr.materialThemeOverlay
            int[] r0 = new int[]{r0}
            a.Wa.b = r0
            return
    }

    public static android.content.Context a(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            int[] r0 = a.Wa.b
            android.content.res.TypedArray r4 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r5 = 0
            int r0 = r4.getResourceId(r5, r5)
            r4.recycle()
            boolean r4 = r2 instanceof a.Z3
            r1 = 1
            if (r4 == 0) goto L1c
            r4 = r2
            a.Z3 r4 = (a.Z3) r4
            int r4 = r4.f367a
            if (r4 != r0) goto L1c
            r4 = r1
            goto L1d
        L1c:
            r4 = r5
        L1d:
            if (r0 == 0) goto L46
            if (r4 == 0) goto L22
            goto L46
        L22:
            a.Z3 r4 = new a.Z3
            r4.<init>(r2, r0)
            int[] r0 = a.Wa.f325a
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = r2.getResourceId(r5, r5)
            int r5 = r2.getResourceId(r1, r5)
            r2.recycle()
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r3 = r5
        L3c:
            if (r3 == 0) goto L45
            android.content.res.Resources$Theme r2 = r4.getTheme()
            r2.applyStyle(r3, r1)
        L45:
            return r4
        L46:
            return r2
    }
}

package a;

/* JADX INFO: renamed from: a.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f427a = null;
    public static final int[] b = null;

    static {
            int r0 = com.google.android.material.R.attr.colorPrimary
            int[] r0 = new int[]{r0}
            a.C0091cf.f427a = r0
            int r0 = com.google.android.material.R.attr.colorPrimaryVariant
            int[] r0 = new int[]{r0}
            a.C0091cf.b = r0
            return
    }

    public static void a(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            int[] r0 = com.google.android.material.R.styleable.ThemeEnforcement
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r0, r3, r4)
            int r3 = com.google.android.material.R.styleable.ThemeEnforcement_enforceMaterialTheme
            r4 = 0
            boolean r3 = r2.getBoolean(r3, r4)
            r2.recycle()
            if (r3 == 0) goto L35
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r1.getTheme()
            int r4 = com.google.android.material.R.attr.isMaterialTheme
            r0 = 1
            boolean r3 = r3.resolveAttribute(r4, r2, r0)
            if (r3 == 0) goto L2e
            int r3 = r2.type
            r4 = 18
            if (r3 != r4) goto L35
            int r2 = r2.data
            if (r2 != 0) goto L35
        L2e:
            int[] r2 = a.C0091cf.b
            java.lang.String r3 = "Theme.MaterialComponents"
            c(r1, r2, r3)
        L35:
            int[] r2 = a.C0091cf.f427a
            java.lang.String r3 = "Theme.AppCompat"
            c(r1, r2, r3)
            return
    }

    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
            int[] r0 = com.google.android.material.R.styleable.ThemeEnforcement
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            int r1 = com.google.android.material.R.styleable.ThemeEnforcement_enforceTextAppearance
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L13
            r0.recycle()
            return
        L13:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L22
            int r5 = com.google.android.material.R.styleable.ThemeEnforcement_android_textAppearance
            int r5 = r0.getResourceId(r5, r4)
            if (r5 == r4) goto L3d
        L20:
            r2 = r3
            goto L3d
        L22:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L28:
            if (r7 >= r6) goto L39
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L36
            r5.recycle()
            goto L3d
        L36:
            int r7 = r7 + 1
            goto L28
        L39:
            r5.recycle()
            goto L20
        L3d:
            r0.recycle()
            if (r2 == 0) goto L43
            return
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
    }

    public static void c(android.content.Context r2, int[] r3, java.lang.String r4) {
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
            r0 = 0
        L5:
            int r1 = r3.length
            if (r0 >= r1) goto L22
            boolean r1 = r2.hasValue(r0)
            if (r1 == 0) goto L11
            int r0 = r0 + 1
            goto L5
        L11:
            r2.recycle()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "The style on this component requires your app theme to be "
            java.lang.String r0 = " (or a descendant)."
            java.lang.String r3 = a.C0487z.g(r3, r4, r0)
            r2.<init>(r3)
            throw r2
        L22:
            r2.recycle()
            return
    }

    public static android.content.res.TypedArray d(android.content.Context r0, android.util.AttributeSet r1, int[] r2, int r3, int r4, int... r5) {
            a(r0, r1, r3, r4)
            b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            return r0
    }
}

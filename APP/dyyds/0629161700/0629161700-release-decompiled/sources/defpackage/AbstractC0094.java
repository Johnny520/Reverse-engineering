package defpackage;

/* JADX INFO: renamed from: ᛱᛵᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0094 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.InterpolatorC0846 f894 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.InterpolatorC0846 f895 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f896;

    static {
            ᛵᛳᛱᛳ r0 = new ᛵᛳᛱᛳ
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC0094.f895 = r0
            ᛵᛳᛱᛳ r0 = new ᛵᛳᛱᛳ
            r1 = 1
            r0.<init>(r1)
            defpackage.AbstractC0094.f894 = r0
            return
    }

    public AbstractC0094() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f896 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static void m584(defpackage.C0055 r6, defpackage.AbstractC2316 r7, float r8, float r9, boolean r10) {
            android.view.View r7 = r7.f9791
            if (r10 == 0) goto L3d
            r10 = 1711866428(0x6609023c, float:1.6175136E23)
            java.lang.Object r0 = r7.getTag(r10)
            if (r0 != 0) goto L3d
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            float r0 = r7.getElevation()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r1 = r6.getChildCount()
            r2 = 0
            r3 = 0
        L1d:
            if (r3 >= r1) goto L34
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != r7) goto L26
            goto L31
        L26:
            java.util.WeakHashMap r5 = defpackage.AbstractC0858.f3911
            float r4 = r4.getElevation()
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L31
            r2 = r4
        L31:
            int r3 = r3 + 1
            goto L1d
        L34:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 + r6
            r7.setElevation(r2)
            r7.setTag(r10, r0)
        L3d:
            r7.setTranslationX(r8)
            r7.setTranslationY(r9)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m585(int r3, int r4) {
            r0 = 789516(0xc0c0c, float:1.106348E-39)
            r1 = r3 & r0
            if (r1 != 0) goto L8
            return r3
        L8:
            int r2 = ~r1
            r3 = r3 & r2
            if (r4 != 0) goto L10
            int r4 = r1 << 2
        Le:
            r3 = r3 | r4
            return r3
        L10:
            int r4 = r1 << 1
            r1 = -789517(0xfffffffffff3f3f3, float:NaN)
            r1 = r1 & r4
            r3 = r3 | r1
            r4 = r4 & r0
            int r4 = r4 << 2
            goto Le
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static int m586(int r3, int r4) {
            r0 = 3158064(0x303030, float:4.42539E-39)
            r1 = r3 & r0
            if (r1 != 0) goto L8
            return r3
        L8:
            int r2 = ~r1
            r3 = r3 & r2
            if (r4 != 0) goto L10
            int r4 = r1 >> 2
        Le:
            r3 = r3 | r4
            return r3
        L10:
            int r4 = r1 >> 1
            r1 = -3158065(0xffffffffffcfcfcf, float:NaN)
            r1 = r1 & r4
            r3 = r3 | r1
            r4 = r4 & r0
            int r4 = r4 >> 2
            goto Le
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m587(defpackage.C0055 r4, int r5, int r6, long r7) {
            r3 = this;
            int r0 = r3.f896
            r1 = -1
            if (r0 != r1) goto L12
            android.content.res.Resources r4 = r4.getResources()
            r0 = 1711734942(0x6607009e, float:1.5938272E23)
            int r0 = r4.getDimensionPixelSize(r0)
            r3.f896 = r0
        L12:
            int r3 = java.lang.Math.abs(r6)
            float r4 = (float) r6
            float r4 = java.lang.Math.signum(r4)
            int r4 = (int) r4
            float r3 = (float) r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r2
            float r5 = (float) r5
            float r3 = r3 / r5
            float r3 = java.lang.Math.min(r2, r3)
            int r4 = r4 * r0
            float r4 = (float) r4
            ᛵᛳᛱᛳ r5 = defpackage.AbstractC0094.f894
            float r3 = r5.getInterpolation(r3)
            float r3 = r3 * r4
            int r3 = (int) r3
            r4 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L37
            goto L3c
        L37:
            float r4 = (float) r7
            r5 = 1157234688(0x44fa0000, float:2000.0)
            float r2 = r4 / r5
        L3c:
            float r3 = (float) r3
            ᛵᛳᛱᛳ r4 = defpackage.AbstractC0094.f895
            float r4 = r4.getInterpolation(r2)
            float r4 = r4 * r3
            int r3 = (int) r4
            if (r3 != 0) goto L4c
            if (r6 <= 0) goto L4b
            r3 = 1
            return r3
        L4b:
            return r1
        L4c:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void mo588(defpackage.C0055 r2, defpackage.AbstractC2316 r3) {
            r1 = this;
            android.view.View r1 = r3.f9791
            r2 = 1711866428(0x6609023c, float:1.6175136E23)
            java.lang.Object r3 = r1.getTag(r2)
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L18
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            r1.setElevation(r3)
        L18:
            r3 = 0
            r1.setTag(r2, r3)
            r2 = 0
            r1.setTranslationX(r2)
            r1.setTranslationY(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public abstract boolean mo589(defpackage.C0055 r1, defpackage.AbstractC2316 r2, defpackage.AbstractC2316 r3);

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public abstract void mo590();
}

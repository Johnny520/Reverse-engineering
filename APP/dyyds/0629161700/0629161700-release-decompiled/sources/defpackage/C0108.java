package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0108 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f939;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.graphics.PointF f940;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final android.util.DisplayMetrics f941;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final android.view.animation.LinearInterpolator f942;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f943;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f944;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public boolean f945;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f946;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.AbstractC1270 f947;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f948;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final android.view.animation.DecelerateInterpolator f949;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public float f950;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public defpackage.C0055 f951;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.view.View f952;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f953;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0572 f954;

    public C0108(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f948 = r0
            ᛳᲇᛴᛶ r1 = new ᛳᲇᛴᛶ
            r1.<init>()
            r1.f2840 = r0
            r0 = 0
            r1.f2844 = r0
            r1.f2845 = r0
            r1.f2842 = r0
            r1.f2843 = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f2841 = r2
            r2 = 0
            r1.f2839 = r2
            r3.f954 = r1
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r3.f942 = r1
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.f949 = r1
            r3.f945 = r0
            r3.f943 = r0
            r3.f953 = r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r3.f941 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int m597(int r1, int r2, int r3, int r4, int r5) {
            r0 = -1
            if (r5 == r0) goto L1b
            if (r5 == 0) goto L11
            r1 = 1
            if (r5 != r1) goto La
            int r4 = r4 - r2
            return r4
        La:
            java.lang.String r1 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            defpackage.C2264.m3684(r1)
            r1 = 0
            return r1
        L11:
            int r3 = r3 - r1
            if (r3 <= 0) goto L15
            return r3
        L15:
            int r4 = r4 - r2
            if (r4 >= 0) goto L19
            return r4
        L19:
            r1 = 0
            return r1
        L1b:
            int r3 = r3 - r1
            return r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m598() {
            r4 = this;
            boolean r0 = r4.f944
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.f944 = r0
            r4.f953 = r0
            r4.f943 = r0
            r1 = 0
            r4.f940 = r1
            ᛱᛳᛶᛱ r2 = r4.f951
            ᛵᲈᲁᲀ r2 = r2.f623
            r3 = -1
            r2.f4453 = r3
            r4.f952 = r1
            r4.f948 = r3
            r4.f946 = r0
            ᛷᛵᛱᲀ r0 = r4.f947
            ᛱᛶᛲ r2 = r0.f5684
            if (r2 != r4) goto L24
            r0.f5684 = r1
        L24:
            r4.f947 = r1
            r4.f951 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m599(int r14, int r15) {
            r13 = this;
            ᛱᛳᛶᛱ r0 = r13.f951
            int r1 = r13.f948
            r2 = -1
            if (r1 == r2) goto L9
            if (r0 != 0) goto Lc
        L9:
            r13.m598()
        Lc:
            boolean r1 = r13.f946
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L3d
            android.view.View r1 = r13.f952
            if (r1 != 0) goto L3d
            ᛷᛵᛱᲀ r1 = r13.f947
            if (r1 == 0) goto L3d
            int r1 = r13.f948
            android.graphics.PointF r1 = r13.m600(r1)
            if (r1 == 0) goto L3d
            float r5 = r1.x
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L2e
            float r6 = r1.y
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L3d
        L2e:
            float r5 = java.lang.Math.signum(r5)
            int r5 = (int) r5
            float r1 = r1.y
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r0.m443(r5, r1, r3)
        L3d:
            r1 = 0
            r13.f946 = r1
            android.view.View r5 = r13.f952
            r6 = 1
            ᛳᲇᛴᛶ r7 = r13.f954
            if (r5 == 0) goto L11d
            ᛱᛳᛶᛱ r8 = r13.f951
            r8.getClass()
            ᲈᛸᲈᛷ r5 = defpackage.C0055.m405(r5)
            if (r5 == 0) goto L57
            int r5 = r5.m3782()
            goto L58
        L57:
            r5 = r2
        L58:
            int r8 = r13.f948
            if (r5 != r8) goto L114
            android.view.View r3 = r13.f952
            ᛵᲈᲁᲀ r5 = r0.f623
            android.graphics.PointF r5 = r13.f940
            if (r5 == 0) goto L71
            float r5 = r5.x
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 != 0) goto L6b
            goto L71
        L6b:
            if (r5 <= 0) goto L6f
            r5 = r6
            goto L72
        L6f:
            r5 = r2
            goto L72
        L71:
            r5 = r1
        L72:
            ᛷᛵᛱᲀ r8 = r13.f947
            if (r8 == 0) goto La1
            boolean r9 = r8.mo172()
            if (r9 != 0) goto L7d
            goto La1
        L7d:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            ᛵᛲᲁᛴ r9 = (defpackage.C0840) r9
            int r10 = defpackage.AbstractC1270.m2375(r3)
            int r11 = r9.leftMargin
            int r10 = r10 - r11
            int r11 = defpackage.AbstractC1270.m2374(r3)
            int r9 = r9.rightMargin
            int r11 = r11 + r9
            int r9 = r8.m2380()
            int r12 = r8.f5690
            int r8 = r8.m2389()
            int r12 = r12 - r8
            int r5 = m597(r10, r11, r9, r12, r5)
            goto La2
        La1:
            r5 = r1
        La2:
            android.graphics.PointF r8 = r13.f940
            if (r8 == 0) goto Lb1
            float r8 = r8.y
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto Lad
            goto Lb1
        Lad:
            if (r8 <= 0) goto Lb2
            r2 = r6
            goto Lb2
        Lb1:
            r2 = r1
        Lb2:
            ᛷᛵᛱᲀ r8 = r13.f947
            if (r8 == 0) goto Le1
            boolean r9 = r8.mo170()
            if (r9 != 0) goto Lbd
            goto Le1
        Lbd:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            ᛵᛲᲁᛴ r9 = (defpackage.C0840) r9
            int r10 = defpackage.AbstractC1270.m2370(r3)
            int r11 = r9.topMargin
            int r10 = r10 - r11
            int r3 = defpackage.AbstractC1270.m2377(r3)
            int r9 = r9.bottomMargin
            int r3 = r3 + r9
            int r9 = r8.m2402()
            int r11 = r8.f5683
            int r8 = r8.m2397()
            int r11 = r11 - r8
            int r2 = m597(r10, r3, r9, r11, r2)
            goto Le2
        Le1:
            r2 = r1
        Le2:
            int r3 = r5 * r5
            int r8 = r2 * r2
            int r8 = r8 + r3
            double r8 = (double) r8
            double r8 = java.lang.Math.sqrt(r8)
            int r3 = (int) r8
            int r3 = r13.m601(r3)
            double r8 = (double) r3
            r10 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r8 = r8 / r10
            double r8 = java.lang.Math.ceil(r8)
            int r3 = (int) r8
            if (r3 <= 0) goto L10d
            int r5 = -r5
            int r2 = -r2
            r7.f2842 = r5
            r7.f2843 = r2
            r7.f2841 = r3
            android.view.animation.DecelerateInterpolator r2 = r13.f949
            r7.f2839 = r2
            r7.f2844 = r6
        L10d:
            r7.m1368(r0)
            r13.m598()
            goto L11d
        L114:
            java.lang.String r2 = "RecyclerView"
            java.lang.String r5 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r2, r5)
            r13.f952 = r3
        L11d:
            boolean r2 = r13.f944
            if (r2 == 0) goto L1c0
            ᛵᲈᲁᲀ r2 = r0.f623
            ᛱᛳᛶᛱ r2 = r13.f951
            ᛷᛵᛱᲀ r2 = r2.f682
            int r2 = r2.m2393()
            if (r2 != 0) goto L132
            r13.m598()
            goto L1ab
        L132:
            int r2 = r13.f943
            int r14 = r2 - r14
            int r2 = r2 * r14
            if (r2 > 0) goto L13a
            r14 = r1
        L13a:
            r13.f943 = r14
            int r2 = r13.f953
            int r15 = r2 - r15
            int r2 = r2 * r15
            if (r2 > 0) goto L144
            r15 = r1
        L144:
            r13.f953 = r15
            if (r14 != 0) goto L1ab
            if (r15 != 0) goto L1ab
            int r14 = r13.f948
            android.graphics.PointF r14 = r13.m600(r14)
            if (r14 == 0) goto L1a4
            float r15 = r14.x
            int r2 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r2 != 0) goto L15f
            float r2 = r14.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L15f
            goto L1a4
        L15f:
            float r15 = r15 * r15
            float r2 = r14.y
            float r2 = r2 * r2
            float r2 = r2 + r15
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r15 = (float) r2
            float r2 = r14.x
            float r2 = r2 / r15
            r14.x = r2
            float r3 = r14.y
            float r3 = r3 / r15
            r14.y = r3
            r13.f940 = r14
            r14 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r14
            int r15 = (int) r2
            r13.f943 = r15
            float r3 = r3 * r14
            int r14 = (int) r3
            r13.f953 = r14
            r14 = 10000(0x2710, float:1.4013E-41)
            int r14 = r13.m601(r14)
            int r15 = r13.f943
            float r15 = (float) r15
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r15 = r15 * r2
            int r15 = (int) r15
            int r3 = r13.f953
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            float r14 = (float) r14
            float r14 = r14 * r2
            int r14 = (int) r14
            r7.f2842 = r15
            r7.f2843 = r3
            r7.f2841 = r14
            android.view.animation.LinearInterpolator r14 = r13.f942
            r7.f2839 = r14
            r7.f2844 = r6
            goto L1ab
        L1a4:
            int r14 = r13.f948
            r7.f2840 = r14
            r13.m598()
        L1ab:
            int r14 = r7.f2840
            if (r14 < 0) goto L1b0
            r1 = r6
        L1b0:
            r7.m1368(r0)
            if (r1 == 0) goto L1c0
            boolean r14 = r13.f944
            if (r14 == 0) goto L1c0
            r13.f946 = r6
            ᛷᛴᛳ r13 = r0.f621
            r13.m2358()
        L1c0:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.PointF m600(int r2) {
            r1 = this;
            ᛷᛵᛱᲀ r1 = r1.f947
            boolean r0 = r1 instanceof defpackage.InterfaceC2256
            if (r0 == 0) goto Ld
            ᲈᛶᛱᛷ r1 = (defpackage.InterfaceC2256) r1
            android.graphics.PointF r1 = r1.mo178(r2)
            return r1
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
            r1.<init>(r2)
            java.lang.Class<ᲈᛶᛱᛷ> r2 = defpackage.InterfaceC2256.class
            java.lang.String r2 = r2.getCanonicalName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m601(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            boolean r0 = r2.f945
            if (r0 != 0) goto L16
            android.util.DisplayMetrics r0 = r2.f941
            int r0 = r0.densityDpi
            float r0 = (float) r0
            r1 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 / r0
            r2.f950 = r1
            r0 = 1
            r2.f945 = r0
        L16:
            float r2 = r2.f950
            float r3 = r3 * r2
            double r2 = (double) r3
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            return r2
    }
}

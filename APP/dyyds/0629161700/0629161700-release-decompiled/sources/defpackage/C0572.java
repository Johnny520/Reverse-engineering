package defpackage;

/* JADX INFO: renamed from: ᛳᲇᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0572 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.view.animation.BaseInterpolator f2839;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f2840;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f2841;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f2842;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f2843;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f2844;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f2845;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1368(defpackage.C0055 r7) {
            r6 = this;
            int r0 = r6.f2840
            r1 = 0
            if (r0 < 0) goto Le
            r2 = -1
            r6.f2840 = r2
            r7.m410(r0)
            r6.f2844 = r1
            return
        Le:
            boolean r0 = r6.f2844
            if (r0 == 0) goto L48
            android.view.animation.BaseInterpolator r0 = r6.f2839
            r2 = 1
            if (r0 == 0) goto L22
            int r3 = r6.f2841
            if (r3 < r2) goto L1c
            goto L22
        L1c:
            java.lang.String r6 = "If you provide an interpolator, you must set a positive duration"
            defpackage.C2264.m3676(r6)
            return
        L22:
            int r3 = r6.f2841
            if (r3 < r2) goto L42
            ᛷᛴᛳ r7 = r7.f621
            int r4 = r6.f2842
            int r5 = r6.f2843
            r7.m2356(r4, r5, r3, r0)
            int r7 = r6.f2845
            int r7 = r7 + r2
            r6.f2845 = r7
            r0 = 10
            if (r7 <= r0) goto L3f
            java.lang.String r7 = "RecyclerView"
            java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
            android.util.Log.e(r7, r0)
        L3f:
            r6.f2844 = r1
            return
        L42:
            java.lang.String r6 = "Scroll duration must be a positive number"
            defpackage.C2264.m3676(r6)
            return
        L48:
            r6.f2845 = r1
            return
    }
}

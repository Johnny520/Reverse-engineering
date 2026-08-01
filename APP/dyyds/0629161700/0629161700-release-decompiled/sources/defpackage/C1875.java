package defpackage;

/* JADX INFO: renamed from: ᲁᛶᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1875 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.InterpolatorC1289 f8131 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.InterpolatorC1289 f8132 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f8133;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final com.android.app.CustomRecyclerView f8134;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f8135;

    static {
            ᛷᛶᛴᲁ r0 = new ᛷᛶᛴᲁ
            r1 = 1
            r0.<init>(r1)
            defpackage.C1875.f8132 = r0
            ᛷᛶᛴᲁ r0 = new ᛷᛶᛴᲁ
            r1 = 0
            r0.<init>(r1)
            defpackage.C1875.f8131 = r0
            return
    }

    public C1875(com.android.app.CustomRecyclerView r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8135 = r0
            r1.f8134 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3278(android.view.View r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r4.f8135
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f8135 = r0
            android.view.ViewPropertyAnimator r4 = r5.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r4 = r4.alpha(r5)
            r0 = 0
            android.view.ViewPropertyAnimator r4 = r4.translationX(r0)
            r1 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r1)
            ᛷᛶᛴᲁ r3 = defpackage.C1875.f8132
            android.view.ViewPropertyAnimator r4 = r4.setInterpolator(r3)
            r4.start()
            android.view.ViewPropertyAnimator r4 = r6.animate()
            android.view.ViewPropertyAnimator r4 = r4.alpha(r5)
            android.view.ViewPropertyAnimator r4 = r4.translationX(r0)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r1)
            android.view.ViewPropertyAnimator r4 = r4.setInterpolator(r3)
            r4.start()
            return
    }
}

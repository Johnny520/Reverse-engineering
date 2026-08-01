package defpackage;

/* JADX INFO: renamed from: ᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public float f3713;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f3714;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f3715;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0877 f3716;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f3717;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f3718;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public android.os.Handler f3719;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f3720;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public long f3721;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.view.animation.Interpolator f3722;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public float f3723;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C0804 m1744(float r3, float r4) {
            ᛵ r0 = new ᛵ
            r0.<init>()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f3719 = r1
            r1 = 0
            r0.f3717 = r1
            r0.f3715 = r1
            r0.f3720 = r1
            r1 = 16
            r0.f3714 = r1
            r0.f3723 = r3
            r0.f3713 = r4
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1745() {
            r3 = this;
            boolean r0 = r3.f3717
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f3717 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r3.f3718 = r0
            java.lang.Thread r0 = new java.lang.Thread
            ᛳᛳᛵᛲ r1 = new ᛳᛳᛵᛲ
            r2 = 5
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }
}

package defpackage;

/* JADX INFO: renamed from: ᲁᛷᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1883 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.AbstractFragmentC0854 f8173;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f8174;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f8175;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Object f8176;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public boolean f8177;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C1884 f8178;

    public AbstractC1883(defpackage.AbstractFragmentC0854 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f8176 = r0
            r1.f8173 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public abstract void mo954(android.app.Activity r1, java.util.ArrayList r2, int r3);

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo955(int r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3292() {
            r4 = this;
            ᛵᛳᲀ r0 = r4.f8173
            android.app.Activity r1 = r0.getActivity()
            boolean r1 = defpackage.AbstractC1592.m2874(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            ᲁᲈᛳ r1 = new ᲁᲈᛳ
            r2 = 6
            r1.<init>(r2, r4)
            android.os.Bundle r0 = r0.getArguments()
            if (r0 != 0) goto L1b
            r0 = 0
            goto L2c
        L1b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L26
            java.util.ArrayList r0 = defpackage.AbstractC1306.m2431(r0)
            goto L2c
        L26:
            java.lang.String r2 = "request_permissions"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r2)
        L2c:
            if (r0 != 0) goto L2f
            goto L43
        L2f:
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            ᲁᛱᛲᛳ r2 = (defpackage.AbstractC1793) r2
            r2.getClass()
            goto L33
        L43:
            android.os.Handler r0 = defpackage.AbstractC1710.f7613
            long r2 = android.os.SystemClock.uptimeMillis()
            android.os.Handler r0 = defpackage.AbstractC1710.f7613
            java.lang.Object r4 = r4.f8176
            r0.postAtTime(r1, r4, r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo3293(int r1) {
            r0 = this;
            return
    }
}

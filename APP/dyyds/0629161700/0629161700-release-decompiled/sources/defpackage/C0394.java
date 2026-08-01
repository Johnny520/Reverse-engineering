package defpackage;

/* JADX INFO: renamed from: ᛲᲈᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0394 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1181 f2027;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.ref.WeakReference f2028;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2029;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2030;

    public C0394(defpackage.C1181 r1, int r2, int r3, java.lang.ref.WeakReference r4) {
            r0 = this;
            r0.<init>()
            r0.f2027 = r1
            r0.f2029 = r2
            r0.f2030 = r3
            r0.f2028 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1136() {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ᛷᛷᛲᲀ r1 = new ᛷᛷᛲᲀ
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1137(android.graphics.Typeface r3) {
            r2 = this;
            r0 = -1
            int r1 = r2.f2029
            if (r1 == r0) goto L12
            int r0 = r2.f2030
            r0 = r0 & 2
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.graphics.Typeface r3 = defpackage.AbstractC1030.m1984(r3, r1, r0)
        L12:
            ᛶᲈᛳᛵ r0 = r2.f2027
            boolean r1 = r0.f5362
            if (r1 == 0) goto L3a
            r0.f5359 = r3
            java.lang.ref.WeakReference r2 = r2.f2028
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L3a
            java.util.WeakHashMap r1 = defpackage.AbstractC0858.f3911
            boolean r1 = r2.isAttachedToWindow()
            int r0 = r0.f5366
            if (r1 == 0) goto L37
            ᛴᛸᛲᛸ r1 = new ᛴᛸᛲᛸ
            r1.<init>(r2, r3, r0)
            r2.post(r1)
            return
        L37:
            r2.setTypeface(r3, r0)
        L3a:
            return
    }
}

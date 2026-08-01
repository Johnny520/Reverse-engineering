package defpackage;

/* JADX INFO: renamed from: ᛷᛱᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1206 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.RunnableC0439 f5446;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ float f5447;

    public RunnableC1206(defpackage.RunnableC0439 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f5446 = r1
            r0.f5447 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            ᛳᛳᛵᛲ r0 = r2.f5446
            java.lang.Object r0 = r0.f2168
            ᛵ r0 = (defpackage.C0804) r0
            ᛵᛴᲁᛲ r0 = r0.f3716
            int r1 = r0.f3957
            float r2 = r2.f5447
            switch(r1) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto Lf;
            }
        Lf:
            ᛱᲇᲁᲈ r0 = r0.f3958
            r0.f1283 = r2
            goto L2a
        L14:
            ᛱᲇᲁᲈ r0 = r0.f3958
            boolean r1 = r0.isAttachedToWindow()
            if (r1 != 0) goto L1d
            goto L2a
        L1d:
            r0.f1280 = r2
            r0.invalidate()
            goto L2a
        L23:
            ᛱᲇᲁᲈ r0 = r0.f3958
            r0.f1280 = r2
            r0.invalidate()
        L2a:
            return
    }
}

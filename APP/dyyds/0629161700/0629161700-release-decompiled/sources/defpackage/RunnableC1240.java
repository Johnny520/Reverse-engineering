package defpackage;

/* JADX INFO: renamed from: ᛷᛳᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1240 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.RunnableC0884 f5549;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5550;

    public /* synthetic */ RunnableC1240(defpackage.RunnableC0884 r1, int r2) {
            r0 = this;
            r0.f5550 = r2
            r0.f5549 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            int r0 = r5.f5550
            ᛵᛵᛱᛸ r1 = r5.f5549
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            java.lang.Object r5 = r1.f3971
            ᛱᛳᲀᛷ r5 = (defpackage.C0060) r5
            ᛳᛸᛳᛸ r0 = r5.f701
            int r0 = r0.f2587
            r1 = -1
            if (r0 <= r1) goto L16
            r0 = 0
            r5.m477(r0)
        L16:
            return
        L17:
            ᲈᲀᛴᛷ r0 = new ᲈᲀᛴᛷ
            r0.<init>()
            r0.m3793()
            java.lang.Object r0 = r1.f3971
            ᛱᛳᲀᛷ r0 = (defpackage.C0060) r0
            r0.m476()
            ᛳᛸᛳᛸ r1 = r0.f701
            long r1 = r1.f2589
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L3c
            ᛱᲇᲁᲈ r0 = r0.f697
            ᛳᛳᛵᛲ r3 = new ᛳᛳᛵᛲ
            r4 = 20
            r3.<init>(r4, r5)
            r0.postDelayed(r3, r1)
        L3c:
            return
    }
}

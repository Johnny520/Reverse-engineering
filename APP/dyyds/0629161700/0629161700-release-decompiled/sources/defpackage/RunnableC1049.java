package defpackage;

/* JADX INFO: renamed from: ᛶᛳᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1049 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0580 f4644;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.app.Activity f4645;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.util.Iterator f4646;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1403 f4647;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0548 f4648;

    public RunnableC1049(defpackage.C0548 r1, java.util.Iterator r2, android.app.Activity r3, defpackage.C0580 r4, defpackage.C1403 r5) {
            r0 = this;
            r0.<init>()
            r0.f4648 = r1
            r0.f4646 = r2
            r0.f4645 = r3
            r0.f4644 = r4
            r0.f4647 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            java.util.Iterator r2 = r5.f4646
            boolean r3 = r2.hasNext()
            android.app.Activity r4 = r5.f4645
            if (r3 == 0) goto L22
            java.lang.Object r1 = r2.next()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L2
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1b
            goto L2
        L1b:
            boolean r2 = defpackage.AbstractC2346.m3849(r4, r1)
            if (r2 == 0) goto L22
            goto L1
        L22:
            if (r1 == 0) goto L51
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L2b
            goto L51
        L2b:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            ᲁᛱᛲᛳ r0 = (defpackage.AbstractC1793) r0
            r0.getClass()
            java.util.Iterator r0 = r1.iterator()
        L39:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            ᲁᛱᛲᛳ r2 = (defpackage.AbstractC1793) r2
            r2.getClass()
            goto L39
        L49:
            ᛳᲇᲇᛶ r0 = r5.f4644
            ᛷᲈᲀ r2 = r5.f4647
            defpackage.C0548.m1335(r4, r1, r0, r2, r5)
            return
        L51:
            ᲁᲈᛳ r0 = new ᲁᲈᛳ
            r1 = 7
            ᛳᲀᲁᲈ r5 = r5.f4648
            r0.<init>(r1, r5)
            r1 = 100
            android.os.Handler r5 = defpackage.AbstractC1710.f7613
            r5.postDelayed(r0, r1)
            return
    }
}

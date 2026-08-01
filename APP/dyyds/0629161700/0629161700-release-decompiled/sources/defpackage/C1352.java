package defpackage;

/* JADX INFO: renamed from: ᛷᲀᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1352 extends defpackage.AbstractC1714 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0077 f5935;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0124 f5936;

    public C1352(java.lang.String r1, defpackage.InterfaceC0077 r2, defpackage.C0124 r3) {
            r0 = this;
            r0.f5935 = r2
            r0.f5936 = r3
            r0.<init>(r1)
            return
    }

    @Override // defpackage.AbstractC1714
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final long mo2339() {
            r5 = this;
            ᛱᛴᛶᛳ r0 = r5.f5935
            ᛸᛴᛸᛵ r1 = r0.mo539()     // Catch: java.lang.Throwable -> L7
            goto L10
        L7:
            r1 = move-exception
            ᛸᛴᛸᛵ r2 = new ᛸᛴᛸᛵ
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r1, r4)
            r1 = r2
        L10:
            ᛱᛷᛲᛶ r5 = r5.f5936
            java.util.concurrent.CopyOnWriteArrayList r2 = r5.f1033
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1f
            java.util.concurrent.LinkedBlockingDeque r5 = r5.f1034
            r5.put(r1)
        L1f:
            r0 = -1
            return r0
    }
}

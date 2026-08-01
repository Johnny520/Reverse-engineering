package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛳᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0850 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.CallableC0234 f2760;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public xhss.C0866 f2761;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public android.os.Handler f2762;

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            xhss.ᛳᛱᛵᛱ r0 = r4.f2760     // Catch: java.lang.Exception -> L7
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            xhss.ᲀᛶᛲᛵ r1 = r4.f2761
            android.os.Handler r4 = r4.f2762
            xhss.ᛳᛵᛲᲇ r2 = new xhss.ᛳᛵᛲᲇ
            r3 = 3
            r2.<init>(r3, r1, r0)
            r4.post(r2)
            return
    }
}

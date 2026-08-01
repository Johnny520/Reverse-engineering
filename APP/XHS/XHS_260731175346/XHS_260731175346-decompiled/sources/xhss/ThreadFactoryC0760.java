package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛴᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0760 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2537;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f2538;

    public /* synthetic */ ThreadFactoryC0760(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f2538 = r1
            r0.f2537 = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.f2538
            r0.<init>(r3, r1)
            boolean r2 = r2.f2537
            r0.setDaemon(r2)
            return r0
    }
}

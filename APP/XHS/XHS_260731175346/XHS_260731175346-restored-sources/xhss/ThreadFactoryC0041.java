package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛴᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0041 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f273;

    public /* synthetic */ ThreadFactoryC0041(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f273 = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r1.f273
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }
}

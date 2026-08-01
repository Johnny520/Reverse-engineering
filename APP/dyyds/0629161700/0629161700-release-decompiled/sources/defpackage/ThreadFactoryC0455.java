package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛵᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0455 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f2261;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2262;

    public /* synthetic */ ThreadFactoryC0455(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f2261 = r1
            r0.f2262 = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.f2261
            r0.<init>(r3, r1)
            boolean r2 = r2.f2262
            r0.setDaemon(r2)
            return r0
    }
}

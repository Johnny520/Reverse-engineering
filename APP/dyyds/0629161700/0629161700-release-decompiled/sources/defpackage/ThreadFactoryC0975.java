package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0975 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f4369;

    public /* synthetic */ ThreadFactoryC0975(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f4369 = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r1.f4369
            r0.<init>(r2, r1)
            r1 = 10
            r0.setPriority(r1)
            return r0
    }
}

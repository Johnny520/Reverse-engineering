package defpackage;

/* JADX INFO: renamed from: ᛸᛲᛶᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1435 implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r2) {
            r1 = this;
            int r1 = com.qmdeve.blurview.BlurNative.f417
            java.lang.Thread r1 = new java.lang.Thread
            java.lang.String r0 = "NativeBlurThread"
            r1.<init>(r2, r0)
            r2 = 1
            r1.setPriority(r2)
            r1.setDaemon(r2)
            return r1
    }
}

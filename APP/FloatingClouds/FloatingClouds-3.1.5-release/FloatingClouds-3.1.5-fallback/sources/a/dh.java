package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dh implements java.util.concurrent.ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = "WXMaskPartInit"
            r0.<init>(r3, r1)
            r3 = 1
            r0.setDaemon(r3)
            return r0
    }
}

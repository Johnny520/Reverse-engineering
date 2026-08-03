package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H3 implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111a;

    public /* synthetic */ H3(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f111a = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.f111a
            r0.<init>(r3, r1)
            r3 = 10
            r0.setPriority(r3)
            return r0
    }
}

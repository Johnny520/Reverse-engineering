package yyds;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: yyds.ᛸᛴᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1763 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f8852;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f8853;

    public /* synthetic */ ThreadFactoryC1763(String str, boolean z) {
        this.f8852 = str;
        this.f8853 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f8852);
        thread.setDaemon(this.f8853);
        return thread;
    }
}

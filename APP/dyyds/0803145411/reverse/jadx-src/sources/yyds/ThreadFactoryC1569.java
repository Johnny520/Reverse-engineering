package yyds;

import com.qmdeve.blurview.BlurNative;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: yyds.ᛷᛶᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1569 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = BlurNative.f447;
        Thread thread = new Thread(runnable, "NativeBlurThread");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}

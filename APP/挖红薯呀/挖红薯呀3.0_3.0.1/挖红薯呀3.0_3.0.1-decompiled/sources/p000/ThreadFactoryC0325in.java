package p000;

import java.util.concurrent.ThreadFactory;
import org.luckypray.dexkit.DexKitCacheBridge;

/* JADX INFO: renamed from: in */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0325in implements ThreadFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return DexKitCacheBridge.reaperScheduler$lambda$1(runnable);
    }
}

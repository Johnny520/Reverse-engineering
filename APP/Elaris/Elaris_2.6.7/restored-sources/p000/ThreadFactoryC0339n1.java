package p000;

import java.util.concurrent.ThreadFactory;
import org.luckypray.dexkit.DexKitCacheBridge;

/* JADX INFO: renamed from: n1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0339n1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f586a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [org.luckypray.dexkit.DexKitCacheBridge.<clinit>():void] */
    public /* synthetic */ ThreadFactoryC0339n1(int i) {
        this.f586a = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.DexKitCacheBridge.a(java.lang.Runnable):java.lang.Thread */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f586a) {
            case 0:
                Thread thread = new Thread(runnable, "ElarisCloudSticker");
                thread.setDaemon(true);
                thread.setPriority(1);
                return thread;
            default:
                return DexKitCacheBridge.reaperScheduler$lambda$1(runnable);
        }
    }
}

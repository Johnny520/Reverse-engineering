package p408;

import java.util.Timer;
import java.util.TimerTask;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9930 extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C9929 c9929 = C9929.f25863;
        DexKitBridge dexKitBridge = C9929.f25861;
        if (dexKitBridge != null) {
            dexKitBridge.close();
            C9929.f25861 = null;
        }
        Timer timer = C9929.f25860;
        if (timer != null) {
            timer.cancel();
            C9929.f25860 = null;
        }
    }
}

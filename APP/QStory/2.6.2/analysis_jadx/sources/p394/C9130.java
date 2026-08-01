package p394;

import java.util.Timer;
import java.util.TimerTask;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9130 extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C9129 c9129 = C9129.f25541;
        DexKitBridge dexKitBridge = C9129.f25539;
        if (dexKitBridge != null) {
            dexKitBridge.close();
            C9129.f25539 = null;
        }
        Timer timer = C9129.f25538;
        if (timer != null) {
            timer.cancel();
            C9129.f25538 = null;
        }
    }
}

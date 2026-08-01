package p408;

import com.bumptech.glide.AbstractC3888;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Timer f25860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static DexKitBridge f25861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9929 f25863 = new C9929();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f25862 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f25859 = 10000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final DexKitBridge m15253() {
        if (f25861 == null) {
            C9929 c9929 = f25863;
            String str = AbstractC3888.f10105.getApplicationInfo().sourceDir;
            str.getClass();
            synchronized (c9929) {
                if (f25861 == null) {
                    if (!f25862.getAndSet(true)) {
                        try {
                            System.loadLibrary("dexkit");
                        } catch (Exception unused) {
                        }
                    }
                    f25861 = new DexKitBridge(str);
                }
            }
        }
        long j = f25859;
        if (j > 0) {
            Timer timer = f25860;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            f25860 = timer2;
            timer2.schedule(new C9930(), j);
        }
        DexKitBridge dexKitBridge = f25861;
        dexKitBridge.getClass();
        return dexKitBridge;
    }
}

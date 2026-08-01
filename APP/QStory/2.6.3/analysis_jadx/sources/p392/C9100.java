package p392;

import com.bumptech.glide.AbstractC3056;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Timer f25515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static DexKitBridge f25516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9100 f25518 = new C9100();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f25517 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f25514 = 10000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final DexKitBridge m14694() {
        if (f25516 == null) {
            C9100 c9100 = f25518;
            String str = AbstractC3056.f9760.getApplicationInfo().sourceDir;
            str.getClass();
            synchronized (c9100) {
                if (f25516 == null) {
                    if (!f25517.getAndSet(true)) {
                        try {
                            System.loadLibrary("dexkit");
                        } catch (Exception unused) {
                        }
                    }
                    f25516 = new DexKitBridge(str);
                }
            }
        }
        long j = f25514;
        if (j > 0) {
            Timer timer = f25515;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            f25515 = timer2;
            timer2.schedule(new C9101(), j);
        }
        DexKitBridge dexKitBridge = f25516;
        dexKitBridge.getClass();
        return dexKitBridge;
    }
}

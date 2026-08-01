package p394;

import com.bumptech.glide.AbstractC3065;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲子兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Timer f25538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static DexKitBridge f25539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9129 f25541 = new C9129();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicBoolean f25540 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f25537 = 10000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final DexKitBridge m14697() {
        if (f25539 == null) {
            C9129 c9129 = f25541;
            String str = AbstractC3065.f9795.getApplicationInfo().sourceDir;
            str.getClass();
            synchronized (c9129) {
                if (f25539 == null) {
                    if (!f25540.getAndSet(true)) {
                        try {
                            System.loadLibrary("dexkit");
                        } catch (Exception unused) {
                        }
                    }
                    f25539 = new DexKitBridge(str);
                }
            }
        }
        long j = f25537;
        if (j > 0) {
            Timer timer = f25538;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            f25538 = timer2;
            timer2.schedule(new C9130(), j);
        }
        DexKitBridge dexKitBridge = f25539;
        dexKitBridge.getClass();
        return dexKitBridge;
    }
}

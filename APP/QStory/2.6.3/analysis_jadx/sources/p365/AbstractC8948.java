package p365;

import org.luckypray.dexkit.DexKitBridge;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DexKitBridge f25144;

    public AbstractC8948(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.f25144 = dexKitBridge;
        this.f25143 = i;
        this.f25142 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m14557(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m14558() {
        int i = this.f25143;
        if (i >= 0) {
            return m14557(this.f25142, i);
        }
        C5925.m11311("not has id");
        return 0L;
    }
}

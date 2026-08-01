package p381;

import org.luckypray.dexkit.DexKitBridge;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DexKitBridge f25489;

    public AbstractC9777(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.f25489 = dexKitBridge;
        this.f25488 = i;
        this.f25487 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m15116(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m15117() {
        int i = this.f25488;
        if (i >= 0) {
            return m15116(this.f25487, i);
        }
        C6755.m11870("not has id");
        return 0L;
    }
}

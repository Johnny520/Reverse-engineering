package p365;

import org.luckypray.dexkit.DexKitBridge;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲世楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DexKitBridge f25148;

    public AbstractC8944(DexKitBridge dexKitBridge, int i, int i2) {
        dexKitBridge.getClass();
        this.f25148 = dexKitBridge;
        this.f25147 = i;
        this.f25146 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m14538(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m14539() {
        int i = this.f25147;
        if (i >= 0) {
            return m14538(this.f25146, i);
        }
        C5919.m11250("not has id");
        return 0L;
    }
}

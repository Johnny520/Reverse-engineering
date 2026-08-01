package p160;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f20724 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC7636) {
            return AbstractC4395.m8907(this.f20724, ((AbstractC7636) obj).f20724);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20724.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f20724 + ')';
    }
}

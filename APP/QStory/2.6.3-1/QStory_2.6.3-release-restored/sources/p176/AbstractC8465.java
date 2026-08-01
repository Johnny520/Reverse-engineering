package p176;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8465 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinkedHashMap f21069 = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC8465) {
            return AbstractC5227.m9466(this.f21069, ((AbstractC8465) obj).f21069);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21069.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f21069 + ')';
    }
}

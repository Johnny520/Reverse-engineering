package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import org.slf4j.Marker;
import p113.InterfaceC8059;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5702 implements InterfaceC8059 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5702)) {
            return false;
        }
        AbstractC5702 abstractC5702 = (AbstractC5702) obj;
        return mo10299() == abstractC5702.mo10299() && mo10301() == abstractC5702.mo10301() && mo10300().equals(abstractC5702.mo10300());
    }

    public final int hashCode() {
        int iHashCode = mo10301().hashCode();
        if (AbstractC5749.m10411(mo10300())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo10299() ? 17 : mo10300().hashCode());
    }

    public final String toString() {
        if (mo10299()) {
            return Marker.ANY_MARKER;
        }
        if (mo10301() == Variance.INVARIANT) {
            return mo10300().toString();
        }
        return mo10301() + " " + mo10300();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract AbstractC5702 mo10298(AbstractC5693 abstractC5693);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo10299();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract AbstractC5714 mo10300();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Variance mo10301();
}

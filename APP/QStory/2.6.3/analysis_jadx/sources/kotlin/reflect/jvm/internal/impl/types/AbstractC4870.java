package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import org.slf4j.Marker;
import p097.InterfaceC7230;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4870 implements InterfaceC7230 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4870)) {
            return false;
        }
        AbstractC4870 abstractC4870 = (AbstractC4870) obj;
        return mo9740() == abstractC4870.mo9740() && mo9742() == abstractC4870.mo9742() && mo9741().equals(abstractC4870.mo9741());
    }

    public final int hashCode() {
        int iHashCode = mo9742().hashCode();
        if (AbstractC4917.m9852(mo9741())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo9740() ? 17 : mo9741().hashCode());
    }

    public final String toString() {
        if (mo9740()) {
            return Marker.ANY_MARKER;
        }
        if (mo9742() == Variance.INVARIANT) {
            return mo9741().toString();
        }
        return mo9742() + " " + mo9741();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract AbstractC4870 mo9739(AbstractC4861 abstractC4861);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo9740();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract AbstractC4882 mo9741();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Variance mo9742();
}

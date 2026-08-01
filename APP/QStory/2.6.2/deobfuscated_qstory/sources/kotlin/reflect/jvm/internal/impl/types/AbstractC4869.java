package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import org.slf4j.Marker;
import p097.InterfaceC7229;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4869 implements InterfaceC7229 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4869)) {
            return false;
        }
        AbstractC4869 abstractC4869 = (AbstractC4869) obj;
        return mo9750() == abstractC4869.mo9750() && mo9752() == abstractC4869.mo9752() && mo9751().equals(abstractC4869.mo9751());
    }

    public final int hashCode() {
        int iHashCode = mo9752().hashCode();
        if (AbstractC4916.m9858(mo9751())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (mo9750() ? 17 : mo9751().hashCode());
    }

    public final String toString() {
        if (mo9750()) {
            return Marker.ANY_MARKER;
        }
        if (mo9752() == Variance.INVARIANT) {
            return mo9751().toString();
        }
        return mo9752() + " " + mo9751();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract AbstractC4869 mo9749(AbstractC4860 abstractC4860);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public abstract boolean mo9750();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract AbstractC4881 mo9751();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Variance mo9752();
}

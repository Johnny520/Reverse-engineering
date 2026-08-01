package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4857;
import p046.InterfaceC6478;
import p046.InterfaceC6480;
import p097.InterfaceC7219;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4881 implements InterfaceC6478, InterfaceC7219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14187;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4881)) {
            return false;
        }
        AbstractC4881 abstractC4881 = (AbstractC4881) obj;
        if (mo9735() == abstractC4881.mo9735()) {
            return AbstractC4892.m9809(C4857.f14136, mo9778(), abstractC4881.mo9778());
        }
        return false;
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return AbstractC4909.m9847(mo9733());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f14187;
        if (i != 0) {
            return i;
        }
        if (AbstractC4892.m9835(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo9735() ? 1 : 0) + ((mo9736().hashCode() + (mo9732().hashCode() * 31)) * 31);
        }
        this.f14187 = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public abstract AbstractC4913 mo9778();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public abstract AbstractC4881 mo9731(AbstractC4860 abstractC4860);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract InterfaceC4872 mo9732();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C4873 mo9733();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract InterfaceC7253 mo9734();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract boolean mo9735();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo9736();
}

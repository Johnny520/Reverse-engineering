package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5690;
import p062.InterfaceC7308;
import p062.InterfaceC7310;
import p113.InterfaceC8049;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5714 implements InterfaceC7308, InterfaceC8049 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14536;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5714)) {
            return false;
        }
        AbstractC5714 abstractC5714 = (AbstractC5714) obj;
        if (mo10284() == abstractC5714.mo10284()) {
            return AbstractC5725.m10362(C5690.f14485, mo10331(), abstractC5714.mo10331());
        }
        return false;
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return AbstractC5742.m10400(mo10282());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f14536;
        if (i != 0) {
            return i;
        }
        if (AbstractC5725.m10388(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo10284() ? 1 : 0) + ((mo10285().hashCode() + (mo10281().hashCode() * 31)) * 31);
        }
        this.f14536 = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public abstract AbstractC5746 mo10331();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public abstract AbstractC5714 mo10280(AbstractC5693 abstractC5693);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract InterfaceC5705 mo10281();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C5706 mo10282();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract InterfaceC8083 mo10283();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract boolean mo10284();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo10285();
}

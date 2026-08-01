package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4858;
import p046.InterfaceC6479;
import p046.InterfaceC6481;
import p097.InterfaceC7220;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4882 implements InterfaceC6479, InterfaceC7220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14191;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4882)) {
            return false;
        }
        AbstractC4882 abstractC4882 = (AbstractC4882) obj;
        if (mo9725() == abstractC4882.mo9725()) {
            return AbstractC4893.m9803(C4858.f14140, mo9772(), abstractC4882.mo9772());
        }
        return false;
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return AbstractC4910.m9841(mo9723());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.f14191;
        if (i != 0) {
            return i;
        }
        if (AbstractC4893.m9829(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (mo9725() ? 1 : 0) + ((mo9726().hashCode() + (mo9722().hashCode() * 31)) * 31);
        }
        this.f14191 = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public abstract AbstractC4914 mo9772();

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public abstract AbstractC4882 mo9721(AbstractC4861 abstractC4861);

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract InterfaceC4873 mo9722();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract C4874 mo9723();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public abstract InterfaceC7254 mo9724();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public abstract boolean mo9725();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract List mo9726();
}

package kotlin.reflect.jvm.internal.types;

import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.C5901;
import kotlin.reflect.jvm.internal.C5906;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import p068.InterfaceC7372;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8051;
import p113.InterfaceC8055;
import p113.InterfaceC8056;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5758 implements InterfaceC8051, InterfaceC8050, InterfaceC8056, InterfaceC8055, InterfaceC5919 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5906 f14608;

    public AbstractC5758(InterfaceC7372 interfaceC7372) {
        C5906 c5906M14937 = null;
        C5906 c5906 = interfaceC7372 instanceof C5906 ? (C5906) interfaceC7372 : null;
        if (c5906 != null) {
            c5906M14937 = c5906;
        } else if (interfaceC7372 != null) {
            c5906M14937 = C9496.m14937(null, interfaceC7372);
        }
        this.f14608 = c5906M14937;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC5758) && AbstractC5725.m10362(C5763.f14626, this, (InterfaceC8049) obj);
    }

    public int hashCode() {
        InterfaceC5924 interfaceC5924Mo9458 = mo9458();
        int iHashCode = interfaceC5924Mo9458 != null ? interfaceC5924Mo9458.hashCode() : 0;
        return Boolean.hashCode(mo9455()) + ((mo9457().hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return C5901.m10641(this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract AbstractC5758 mo10472();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract AbstractC5758 mo10473(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC5758 mo10474(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract AbstractC5758 mo10475();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract boolean mo10476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5919 mo10477();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract boolean mo10478();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract boolean mo10479();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract InterfaceC5925 mo10480();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract boolean mo10481();
}

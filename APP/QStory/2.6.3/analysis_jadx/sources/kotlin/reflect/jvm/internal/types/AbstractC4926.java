package kotlin.reflect.jvm.internal.types;

import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.C5069;
import kotlin.reflect.jvm.internal.C5074;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import p052.InterfaceC6543;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7222;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4926 implements InterfaceC7222, InterfaceC7221, InterfaceC7227, InterfaceC7226, InterfaceC5087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5074 f14263;

    public AbstractC4926(InterfaceC6543 interfaceC6543) {
        C5074 c5074M14378 = null;
        C5074 c5074 = interfaceC6543 instanceof C5074 ? (C5074) interfaceC6543 : null;
        if (c5074 != null) {
            c5074M14378 = c5074;
        } else if (interfaceC6543 != null) {
            c5074M14378 = C8667.m14378(null, interfaceC6543);
        }
        this.f14263 = c5074M14378;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC4926) && AbstractC4893.m9803(C4931.f14281, this, (InterfaceC7220) obj);
    }

    public int hashCode() {
        InterfaceC5092 interfaceC5092Mo8899 = mo8899();
        int iHashCode = interfaceC5092Mo8899 != null ? interfaceC5092Mo8899.hashCode() : 0;
        return Boolean.hashCode(mo8896()) + ((mo8898().hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return C5069.m10082(this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract AbstractC4926 mo9913();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract AbstractC4926 mo9914(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC4926 mo9915(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract AbstractC4926 mo9916();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract boolean mo9917();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5087 mo9918();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract boolean mo9919();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract boolean mo9920();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract InterfaceC5093 mo9921();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract boolean mo9922();
}

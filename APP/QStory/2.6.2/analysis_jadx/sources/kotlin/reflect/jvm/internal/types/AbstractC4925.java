package kotlin.reflect.jvm.internal.types;

import com.bumptech.glide.AbstractC3055;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.C5068;
import kotlin.reflect.jvm.internal.C5073;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import p052.InterfaceC6542;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7225;
import p097.InterfaceC7226;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4925 implements InterfaceC7221, InterfaceC7220, InterfaceC7226, InterfaceC7225, InterfaceC5086 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5073 f14261;

    public AbstractC4925(InterfaceC6542 interfaceC6542) {
        C5073 c5073M6635 = null;
        C5073 c5073 = interfaceC6542 instanceof C5073 ? (C5073) interfaceC6542 : null;
        if (c5073 != null) {
            c5073M6635 = c5073;
        } else if (interfaceC6542 != null) {
            c5073M6635 = AbstractC3055.m6635(null, interfaceC6542);
        }
        this.f14261 = c5073M6635;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC4925) && AbstractC4892.m9809(C4930.f14279, this, (InterfaceC7219) obj);
    }

    public int hashCode() {
        InterfaceC5091 interfaceC5091Mo8909 = mo8909();
        int iHashCode = interfaceC5091Mo8909 != null ? interfaceC5091Mo8909.hashCode() : 0;
        return Boolean.hashCode(mo8906()) + ((mo8908().hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        return C5068.m10078(this, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public abstract AbstractC4925 mo9916();

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public abstract AbstractC4925 mo9917(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public abstract AbstractC4925 mo9918(boolean z);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public abstract AbstractC4925 mo9919();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public abstract boolean mo9920();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract InterfaceC5086 mo9921();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public abstract boolean mo9922();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public abstract boolean mo9923();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract InterfaceC5092 mo9924();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract boolean mo9925();
}

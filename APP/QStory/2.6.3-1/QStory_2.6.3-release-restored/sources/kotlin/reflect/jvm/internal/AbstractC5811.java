package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.p009km.C5367;
import p063.InterfaceC7318;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5811 extends AbstractC5810 implements InterfaceC5938 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f14713 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 14));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5811) && AbstractC5227.m9466(mo10518(), ((AbstractC5811) obj).mo10518());
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return AbstractC0900.m708(new StringBuilder("<get-"), mo10518().f14723.f13562, '>');
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        return mo10518().getParameters();
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return mo10518().getReturnType();
    }

    public final int hashCode() {
        return mo10518().hashCode();
    }

    public final String toString() {
        return "getter of " + mo10518();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14713.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final List mo10520() {
        return mo10518().mo10520();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5810
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C5367 mo10521() {
        return mo10518().f14723.f13561;
    }
}

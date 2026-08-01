package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.jvm.internal.impl.p009km.C5367;
import p063.InterfaceC7318;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5801 extends AbstractC5810 implements InterfaceC5941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f14703;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14704;

    public AbstractC5801() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f14703 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5799(this, 0));
        this.f14704 = AbstractC6019.m10774(lazyThreadSafetyMode, new C5799(this, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5801) && AbstractC5227.m9466(mo10518(), ((AbstractC5801) obj).mo10518());
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return AbstractC0900.m708(new StringBuilder("<set-"), mo10518().f14723.f13562, '>');
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final List getParameters() {
        return AbstractC5176.m9353(mo10518().getParameters(), this.f14703.getValue());
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final InterfaceC5919 getReturnType() {
        return AbstractC5904.f14960;
    }

    public final int hashCode() {
        return mo10518().hashCode();
    }

    public final String toString() {
        return "setter of " + mo10518();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14704.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List mo10520() {
        return AbstractC5176.m9353(mo10518().mo10520(), this.f14703.getValue());
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5810
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5367 mo10521() {
        return mo10518().f14723.f13560;
    }
}

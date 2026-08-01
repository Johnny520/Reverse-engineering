package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.types.C5770;
import p063.InterfaceC7318;
import p095.AbstractC7823;
import p095.C7819;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5792 extends AbstractC5785 implements InterfaceC5941 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14684 = {new PropertyReference1Impl(AbstractC5792.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5906 f14685 = C9496.m14937(null, new C5794(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14686 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5794(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5792) && AbstractC5227.m9466(mo10508(), ((AbstractC5792) obj).mo10508());
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return AbstractC0900.m708(new StringBuilder("<set-"), mo10508().f14654, '>');
    }

    public final int hashCode() {
        return mo10508().hashCode();
    }

    public final String toString() {
        return "setter of " + mo10508();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7823 mo10512() {
        InterfaceC5920 interfaceC5920 = f14684[0];
        Object objInvoke = this.f14685.invoke();
        objInvoke.getClass();
        return (C7819) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5856 mo10506(C5883 c5883) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14686.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC5312 mo10501() {
        InterfaceC5920 interfaceC5920 = f14684[0];
        Object objInvoke = this.f14685.invoke();
        objInvoke.getClass();
        return (C7819) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C5770 mo10503() {
        InterfaceC5920 interfaceC5920 = f14684[0];
        Object objInvoke = this.f14685.invoke();
        objInvoke.getClass();
        return new C5770(AbstractC5605.m10058((C7819) objInvoke).m12587(), C5793.f14687, false);
    }
}

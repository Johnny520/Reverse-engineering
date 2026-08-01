package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.types.C5770;
import p063.InterfaceC7318;
import p095.AbstractC7823;
import p095.C7820;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5795 extends AbstractC5785 implements InterfaceC5938 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14692 = {new PropertyReference1Impl(AbstractC5795.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5906 f14693 = C9496.m14937(null, new C5784(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC6016 f14694 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5784(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC5795) && AbstractC5227.m9466(mo10508(), ((AbstractC5795) obj).mo10508());
    }

    @Override // kotlin.reflect.InterfaceC5926
    public final String getName() {
        return AbstractC0900.m708(new StringBuilder("<get-"), mo10508().f14654, '>');
    }

    public final int hashCode() {
        return mo10508().hashCode();
    }

    public final String toString() {
        return "getter of " + mo10508();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7823 mo10512() {
        InterfaceC5920 interfaceC5920 = f14692[0];
        Object objInvoke = this.f14693.invoke();
        objInvoke.getClass();
        return (C7820) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5856 mo10506(C5883 c5883) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7318 mo10500() {
        return (InterfaceC7318) this.f14694.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC5312 mo10501() {
        InterfaceC5920 interfaceC5920 = f14692[0];
        Object objInvoke = this.f14693.invoke();
        objInvoke.getClass();
        return (C7820) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C5770 mo10503() {
        return (C5770) mo10508().getReturnType();
    }
}

package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.InterfaceC5109;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.types.C4938;
import p047.InterfaceC6489;
import p079.AbstractC6994;
import p079.C6990;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4960 extends AbstractC4953 implements InterfaceC5109 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14339 = {new PropertyReference1Impl(AbstractC4960.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5074 f14340 = C8667.m14378(null, new C4962(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5184 f14341 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C4962(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4960) && AbstractC4395.m8907(mo9949(), ((AbstractC4960) obj).mo9949());
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final String getName() {
        return AbstractC0053.m148(new StringBuilder("<set-"), mo9949().f14309, '>');
    }

    public final int hashCode() {
        return mo9949().hashCode();
    }

    public final String toString() {
        return "setter of " + mo9949();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4953
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC6994 mo9953() {
        InterfaceC5088 interfaceC5088 = f14339[0];
        Object objInvoke = this.f14340.invoke();
        objInvoke.getClass();
        return (C6990) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5024 mo9947(C5051 c5051) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5064
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6489 mo9941() {
        return (InterfaceC6489) this.f14341.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC4480 mo9942() {
        InterfaceC5088 interfaceC5088 = f14339[0];
        Object objInvoke = this.f14340.invoke();
        objInvoke.getClass();
        return (C6990) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5024
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4938 mo9944() {
        InterfaceC5088 interfaceC5088 = f14339[0];
        Object objInvoke = this.f14340.invoke();
        objInvoke.getClass();
        return new C4938(AbstractC4773.m9499((C6990) objInvoke).m12028(), C4961.f14342, false);
    }
}

package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3055;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.types.C4937;
import p047.InterfaceC6488;
import p079.AbstractC6993;
import p079.C6989;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4959 extends AbstractC4952 implements InterfaceC5108 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14337 = {new PropertyReference1Impl(AbstractC4959.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5073 f14338 = AbstractC3055.m6635(null, new C4961(this, 0));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5183 f14339 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C4961(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC4959) && AbstractC4394.m8917(mo9952(), ((AbstractC4959) obj).mo9952());
    }

    @Override // kotlin.reflect.InterfaceC5093
    public final String getName() {
        return AbstractC0053.m155(new StringBuilder("<set-"), mo9952().f14307, '>');
    }

    public final int hashCode() {
        return mo9952().hashCode();
    }

    public final String toString() {
        return "setter of " + mo9952();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4952
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC6993 mo9956() {
        InterfaceC5087 interfaceC5087 = f14337[0];
        Object objInvoke = this.f14338.invoke();
        objInvoke.getClass();
        return (C6989) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5023 mo9950(C5050 c5050) {
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC5063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6488 mo9944() {
        return (InterfaceC6488) this.f14339.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final InterfaceC4479 mo9945() {
        InterfaceC5087 interfaceC5087 = f14337[0];
        Object objInvoke = this.f14338.invoke();
        objInvoke.getClass();
        return (C6989) objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4937 mo9947() {
        InterfaceC5087 interfaceC5087 = f14337[0];
        Object objInvoke = this.f14338.invoke();
        objInvoke.getClass();
        return new C4937(AbstractC4772.m9509((C6989) objInvoke).m11985(), C4960.f14340, false);
    }
}

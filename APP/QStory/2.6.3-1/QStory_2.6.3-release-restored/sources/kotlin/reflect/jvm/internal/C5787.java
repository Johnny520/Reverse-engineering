package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5306;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.C5770;
import p068.InterfaceC7372;
import p095.AbstractC7838;
import p095.C7808;
import p332.C9496;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5787 extends AbstractC5892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14673 = {new PropertyReference1Impl(C5787.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new PropertyReference1Impl(C5787.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5906 f14674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final KParameter$Kind f14676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5856 f14677;

    public C5787(AbstractC5856 abstractC5856, int i, KParameter$Kind kParameter$Kind, InterfaceC7372 interfaceC7372) {
        kParameter$Kind.getClass();
        this.f14677 = abstractC5856;
        this.f14675 = i;
        this.f14676 = kParameter$Kind;
        this.f14674 = C9496.m14937(null, interfaceC7372);
        C9496.m14937(null, new C5788(this, 0));
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final int getIndex() {
        return this.f14675;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final KParameter$Kind getKind() {
        return this.f14676;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final String getName() {
        Object objM10516 = m10516();
        Object obj = objM10516 instanceof InterfaceC5288 ? (InterfaceC5288) objM10516 : null;
        if (obj != null && !((C7808) obj).mo9587().mo9595()) {
            C5523 name = ((AbstractC7838) obj).getName();
            name.getClass();
            if (!name.f14049) {
                return name.m9894();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final InterfaceC5919 getType() {
        AbstractC5714 type = m10516().getType();
        type.getClass();
        C5770 c5770 = new C5770(type, new C5788(this, 1), false);
        AbstractC5856 abstractC5856 = this.f14677;
        InterfaceC5919 interfaceC5919 = abstractC5856.f14834.f14925.m10487(c5770, KVariance.INVARIANT).f14982;
        if (interfaceC5919 != null) {
            return interfaceC5919;
        }
        AbstractC5889.m10562(abstractC5856);
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo10513() {
        InterfaceC5306 interfaceC5306M10516 = m10516();
        InterfaceC5288 interfaceC5288 = interfaceC5306M10516 instanceof InterfaceC5288 ? (InterfaceC5288) interfaceC5306M10516 : null;
        if (interfaceC5288 != null) {
            return AbstractC5605.m10062(interfaceC5288);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5896 mo10514() {
        return this.f14677;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo10515() {
        InterfaceC5306 interfaceC5306M10516 = m10516();
        InterfaceC5288 interfaceC5288 = interfaceC5306M10516 instanceof InterfaceC5288 ? (InterfaceC5288) interfaceC5306M10516 : null;
        return interfaceC5288 != null && ((C7808) interfaceC5288).m12849();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5306 m10516() {
        InterfaceC5920 interfaceC5920 = f14673[0];
        Object objInvoke = this.f14674.invoke();
        objInvoke.getClass();
        return (InterfaceC5306) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo10517() {
        InterfaceC5306 interfaceC5306M10516 = m10516();
        return (interfaceC5306M10516 instanceof InterfaceC5288) && ((C7808) ((InterfaceC5288) interfaceC5306M10516)).f19016 != null;
    }
}

package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.types.C4938;
import p052.InterfaceC6543;
import p079.AbstractC7009;
import p079.C6979;
import p316.C8667;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4955 extends AbstractC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f14328 = {new PropertyReference1Impl(C4955.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new PropertyReference1Impl(C4955.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5074 f14329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final KParameter$Kind f14331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5024 f14332;

    public C4955(AbstractC5024 abstractC5024, int i, KParameter$Kind kParameter$Kind, InterfaceC6543 interfaceC6543) {
        kParameter$Kind.getClass();
        this.f14332 = abstractC5024;
        this.f14330 = i;
        this.f14331 = kParameter$Kind;
        this.f14329 = C8667.m14378(null, interfaceC6543);
        C8667.m14378(null, new C4956(this, 0));
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final int getIndex() {
        return this.f14330;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final KParameter$Kind getKind() {
        return this.f14331;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final String getName() {
        Object objM9957 = m9957();
        Object obj = objM9957 instanceof InterfaceC4456 ? (InterfaceC4456) objM9957 : null;
        if (obj != null && !((C6979) obj).mo9028().mo9036()) {
            C4691 name = ((AbstractC7009) obj).getName();
            name.getClass();
            if (!name.f13704) {
                return name.m9335();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final InterfaceC5087 getType() {
        AbstractC4882 type = m9957().getType();
        type.getClass();
        C4938 c4938 = new C4938(type, new C4956(this, 1), false);
        AbstractC5024 abstractC5024 = this.f14332;
        InterfaceC5087 interfaceC5087 = abstractC5024.f14489.f14580.m9928(c4938, KVariance.INVARIANT).f14637;
        if (interfaceC5087 != null) {
            return interfaceC5087;
        }
        AbstractC5057.m10003(abstractC5024);
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo9954() {
        InterfaceC4474 interfaceC4474M9957 = m9957();
        InterfaceC4456 interfaceC4456 = interfaceC4474M9957 instanceof InterfaceC4456 ? (InterfaceC4456) interfaceC4474M9957 : null;
        if (interfaceC4456 != null) {
            return AbstractC4773.m9503(interfaceC4456);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5064 mo9955() {
        return this.f14332;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo9956() {
        InterfaceC4474 interfaceC4474M9957 = m9957();
        InterfaceC4456 interfaceC4456 = interfaceC4474M9957 instanceof InterfaceC4456 ? (InterfaceC4456) interfaceC4474M9957 : null;
        return interfaceC4456 != null && ((C6979) interfaceC4456).m12290();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4474 m9957() {
        InterfaceC5088 interfaceC5088 = f14328[0];
        Object objInvoke = this.f14329.invoke();
        objInvoke.getClass();
        return (InterfaceC4474) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo9958() {
        InterfaceC4474 interfaceC4474M9957 = m9957();
        return (interfaceC4474M9957 instanceof InterfaceC4456) && ((C6979) ((InterfaceC4456) interfaceC4474M9957)).f18671 != null;
    }
}

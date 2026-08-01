package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3055;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.types.C4937;
import p052.InterfaceC6542;
import p079.AbstractC7008;
import p079.C6978;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4954 extends AbstractC5059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f14326 = {new PropertyReference1Impl(C4954.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new PropertyReference1Impl(C4954.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5073 f14327;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14328;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final KParameter$Kind f14329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5023 f14330;

    public C4954(AbstractC5023 abstractC5023, int i, KParameter$Kind kParameter$Kind, InterfaceC6542 interfaceC6542) {
        kParameter$Kind.getClass();
        this.f14330 = abstractC5023;
        this.f14328 = i;
        this.f14329 = kParameter$Kind;
        this.f14327 = AbstractC3055.m6635(null, interfaceC6542);
        AbstractC3055.m6635(null, new C4955(this, 0));
    }

    @Override // kotlin.reflect.InterfaceC5094
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final int getIndex() {
        return this.f14328;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final KParameter$Kind getKind() {
        return this.f14329;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final String getName() {
        Object objM9960 = m9960();
        Object obj = objM9960 instanceof InterfaceC4455 ? (InterfaceC4455) objM9960 : null;
        if (obj != null && !((C6978) obj).mo9038().mo9046()) {
            C4690 name = ((AbstractC7008) obj).getName();
            name.getClass();
            if (!name.f13700) {
                return name.m9345();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5086 getType() {
        AbstractC4881 type = m9960().getType();
        type.getClass();
        C4937 c4937 = new C4937(type, new C4955(this, 1), false);
        AbstractC5023 abstractC5023 = this.f14330;
        InterfaceC5086 interfaceC5086 = abstractC5023.f14487.f14578.m9931(c4937, KVariance.INVARIANT).f14637;
        if (interfaceC5086 != null) {
            return interfaceC5086;
        }
        AbstractC5056.m10006(abstractC5023);
        throw null;
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo9957() {
        InterfaceC4473 interfaceC4473M9960 = m9960();
        InterfaceC4455 interfaceC4455 = interfaceC4473M9960 instanceof InterfaceC4455 ? (InterfaceC4455) interfaceC4473M9960 : null;
        if (interfaceC4455 != null) {
            return AbstractC4772.m9513(interfaceC4455);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5063 mo9958() {
        return this.f14330;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo9959() {
        InterfaceC4473 interfaceC4473M9960 = m9960();
        InterfaceC4455 interfaceC4455 = interfaceC4473M9960 instanceof InterfaceC4455 ? (InterfaceC4455) interfaceC4473M9960 : null;
        return interfaceC4455 != null && ((C6978) interfaceC4455).m12263();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4473 m9960() {
        InterfaceC5087 interfaceC5087 = f14326[0];
        Object objInvoke = this.f14327.invoke();
        objInvoke.getClass();
        return (InterfaceC4473) objInvoke;
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo9961() {
        InterfaceC4473 interfaceC4473M9960 = m9960();
        return (interfaceC4473M9960 instanceof InterfaceC4455) && ((C6978) ((InterfaceC4455) interfaceC4473M9960)).f18676 != null;
    }
}

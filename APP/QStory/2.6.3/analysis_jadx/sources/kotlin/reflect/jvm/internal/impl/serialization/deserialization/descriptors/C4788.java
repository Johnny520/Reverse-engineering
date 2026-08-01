package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p007.C6157;
import p046.InterfaceC6481;
import p070.C6906;
import p070.InterfaceC6908;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p079.C6997;
import p079.C6998;
import p098.C7239;
import p098.C7240;
import p101.C7255;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4788 extends AbstractC6996 implements InterfaceC4799 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC4878 f13939;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC4878 f13940;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC4802 f13941;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C6906 f13942;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6157 f13943;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6908 f13944;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC4878 f13945;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f13946;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias f13947;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4788(C4845 c4845, InterfaceC4499 interfaceC4499, InterfaceC6481 interfaceC6481, C4691 c4691, C4490 c4490, ProtoBuf$TypeAlias protoBuf$TypeAlias, InterfaceC6908 interfaceC6908, C6157 c6157, C6906 c6906, InterfaceC4802 interfaceC4802) {
        super(c4845, interfaceC4499, interfaceC6481, c4691, c4490);
        c4845.getClass();
        interfaceC4499.getClass();
        c4490.getClass();
        protoBuf$TypeAlias.getClass();
        interfaceC6908.getClass();
        c6157.getClass();
        c6906.getClass();
        this.f13947 = protoBuf$TypeAlias;
        this.f13944 = interfaceC6908;
        this.f13943 = c6157;
        this.f13942 = c6906;
        this.f13941 = interfaceC4802;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6157 mo9512() {
        return this.f13943;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC4802 mo9513() {
        return this.f13941;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC6908 mo9514() {
        return this.f13944;
    }

    @Override // p079.AbstractC6996
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final AbstractC6989 mo9519() {
        if (AbstractC4893.m9829(mo9521())) {
            return null;
        }
        InterfaceC4477 interfaceC4477Mo9211 = mo9521().mo9722().mo9211();
        if (interfaceC4477Mo9211 instanceof AbstractC6989) {
            return (AbstractC6989) interfaceC4477Mo9211;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m9520(List list, AbstractC4878 abstractC4878, AbstractC4878 abstractC48782) {
        InterfaceC7254 interfaceC7254Mo9214;
        AbstractC4878 abstractC4878M9816;
        list.getClass();
        abstractC4878.getClass();
        abstractC48782.getClass();
        this.f18753 = list;
        this.f13940 = abstractC4878;
        this.f13939 = abstractC48782;
        this.f13946 = AbstractC4491.m9078(this);
        AbstractC6989 abstractC6989Mo9519 = mo9519();
        if (abstractC6989Mo9519 == null || (interfaceC7254Mo9214 = abstractC6989Mo9519.mo9214()) == null) {
            interfaceC7254Mo9214 = C7255.f19336;
        }
        InterfaceC7254 interfaceC7254 = interfaceC7254Mo9214;
        C6998 c6998 = new C6998();
        C7239 c7239 = AbstractC4917.f14247;
        if (C7240.m12467(this)) {
            abstractC4878M9816 = C7240.m12470(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            InterfaceC4873 interfaceC4873Mo9001 = mo9001();
            if (interfaceC4873Mo9001 == null) {
                AbstractC4917.m9848(12);
                throw null;
            }
            List listM9845 = AbstractC4917.m9845(((C6997) interfaceC4873Mo9001).getParameters());
            C4874.f14175.getClass();
            abstractC4878M9816 = AbstractC4893.m9816(C4874.f14176, interfaceC4873Mo9001, listM9845, false, interfaceC7254, c6998);
        }
        this.f13945 = abstractC4878M9816;
    }

    @Override // p079.AbstractC6996
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final AbstractC4878 mo9521() {
        AbstractC4878 abstractC4878 = this.f13939;
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        AbstractC4395.m8908("expandedType");
        throw null;
    }

    @Override // p079.AbstractC6996
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC4878 mo9522() {
        AbstractC4878 abstractC4878 = this.f13940;
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        AbstractC4395.m8908("underlyingType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4500 mo9005(C4919 c4919) {
        c4919.getClass();
        if (c4919.f14249.mo9734()) {
            return this;
        }
        InterfaceC4499 interfaceC4499Mo9028 = mo9028();
        interfaceC4499Mo9028.getClass();
        InterfaceC6481 annotations = getAnnotations();
        annotations.getClass();
        C4691 name = getName();
        name.getClass();
        C4788 c4788 = new C4788(this.f18750, interfaceC4499Mo9028, annotations, name, this.f18752, this.f13947, this.f13944, this.f13943, this.f13942, this.f13941);
        List listMo9015 = mo9015();
        AbstractC4878 abstractC4878Mo9522 = mo9522();
        Variance variance = Variance.INVARIANT;
        c4788.m9520(listMo9015, AbstractC4893.m9812(c4919.m9861(abstractC4878Mo9522, variance)), AbstractC4893.m9812(c4919.m9861(mo9521(), variance)));
        return c4788;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4799
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4701 mo9516() {
        return this.f13947;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4878 mo9025() {
        AbstractC4878 abstractC4878 = this.f13945;
        if (abstractC4878 != null) {
            return abstractC4878;
        }
        AbstractC4395.m8908("defaultTypeImpl");
        throw null;
    }
}

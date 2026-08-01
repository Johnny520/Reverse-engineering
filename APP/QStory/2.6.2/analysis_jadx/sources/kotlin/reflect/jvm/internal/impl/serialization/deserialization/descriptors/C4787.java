package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p015.C6230;
import p046.InterfaceC6480;
import p070.C6905;
import p070.InterfaceC6907;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.C6996;
import p079.C6997;
import p098.C7238;
import p098.C7239;
import p101.C7254;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4787 extends AbstractC6995 implements InterfaceC4798 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC4877 f13935;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC4877 f13936;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC4801 f13937;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C6905 f13938;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6230 f13939;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC6907 f13940;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC4877 f13941;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f13942;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias f13943;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4787(C4844 c4844, InterfaceC4498 interfaceC4498, InterfaceC6480 interfaceC6480, C4690 c4690, C4489 c4489, ProtoBuf$TypeAlias protoBuf$TypeAlias, InterfaceC6907 interfaceC6907, C6230 c6230, C6905 c6905, InterfaceC4801 interfaceC4801) {
        super(c4844, interfaceC4498, interfaceC6480, c4690, c4489);
        c4844.getClass();
        interfaceC4498.getClass();
        c4489.getClass();
        protoBuf$TypeAlias.getClass();
        interfaceC6907.getClass();
        c6230.getClass();
        c6905.getClass();
        this.f13943 = protoBuf$TypeAlias;
        this.f13940 = interfaceC6907;
        this.f13939 = c6230;
        this.f13938 = c6905;
        this.f13937 = interfaceC4801;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6230 mo9522() {
        return this.f13939;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC4801 mo9523() {
        return this.f13937;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC6907 mo9524() {
        return this.f13940;
    }

    @Override // p079.AbstractC6995
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final AbstractC6988 mo9529() {
        if (AbstractC4892.m9835(mo9531())) {
            return null;
        }
        InterfaceC4476 interfaceC4476Mo9221 = mo9531().mo9732().mo9221();
        if (interfaceC4476Mo9221 instanceof AbstractC6988) {
            return (AbstractC6988) interfaceC4476Mo9221;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m9530(List list, AbstractC4877 abstractC4877, AbstractC4877 abstractC48772) {
        InterfaceC7253 interfaceC7253Mo9224;
        AbstractC4877 abstractC4877M9822;
        list.getClass();
        abstractC4877.getClass();
        abstractC48772.getClass();
        this.f18758 = list;
        this.f13936 = abstractC4877;
        this.f13935 = abstractC48772;
        this.f13942 = AbstractC4490.m9088(this);
        AbstractC6988 abstractC6988Mo9529 = mo9529();
        if (abstractC6988Mo9529 == null || (interfaceC7253Mo9224 = abstractC6988Mo9529.mo9224()) == null) {
            interfaceC7253Mo9224 = C7254.f19341;
        }
        InterfaceC7253 interfaceC7253 = interfaceC7253Mo9224;
        C6997 c6997 = new C6997();
        C7238 c7238 = AbstractC4916.f14243;
        if (C7239.m12440(this)) {
            abstractC4877M9822 = C7239.m12443(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            InterfaceC4872 interfaceC4872Mo9011 = mo9011();
            if (interfaceC4872Mo9011 == null) {
                AbstractC4916.m9854(12);
                throw null;
            }
            List listM9851 = AbstractC4916.m9851(((C6996) interfaceC4872Mo9011).getParameters());
            C4873.f14171.getClass();
            abstractC4877M9822 = AbstractC4892.m9822(C4873.f14172, interfaceC4872Mo9011, listM9851, false, interfaceC7253, c6997);
        }
        this.f13941 = abstractC4877M9822;
    }

    @Override // p079.AbstractC6995
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final AbstractC4877 mo9531() {
        AbstractC4877 abstractC4877 = this.f13935;
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        AbstractC4394.m8918("expandedType");
        throw null;
    }

    @Override // p079.AbstractC6995
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC4877 mo9532() {
        AbstractC4877 abstractC4877 = this.f13936;
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        AbstractC4394.m8918("underlyingType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4499 mo9015(C4918 c4918) {
        c4918.getClass();
        if (c4918.f14245.mo9744()) {
            return this;
        }
        InterfaceC4498 interfaceC4498Mo9038 = mo9038();
        interfaceC4498Mo9038.getClass();
        InterfaceC6480 annotations = getAnnotations();
        annotations.getClass();
        C4690 name = getName();
        name.getClass();
        C4787 c4787 = new C4787(this.f18755, interfaceC4498Mo9038, annotations, name, this.f18757, this.f13943, this.f13940, this.f13939, this.f13938, this.f13937);
        List listMo9025 = mo9025();
        AbstractC4877 abstractC4877Mo9532 = mo9532();
        Variance variance = Variance.INVARIANT;
        c4787.m9530(listMo9025, AbstractC4892.m9818(c4918.m9867(abstractC4877Mo9532, variance)), AbstractC4892.m9818(c4918.m9867(mo9531(), variance)));
        return c4787;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4798
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4700 mo9526() {
        return this.f13943;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4877 mo9035() {
        AbstractC4877 abstractC4877 = this.f13941;
        if (abstractC4877 != null) {
            return abstractC4877;
        }
        AbstractC4394.m8918("defaultTypeImpl");
        throw null;
    }
}

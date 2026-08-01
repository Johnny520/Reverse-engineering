package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p023.C6986;
import p062.InterfaceC7310;
import p086.C7735;
import p086.InterfaceC7737;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.C7826;
import p095.C7827;
import p114.C8068;
import p114.C8069;
import p117.C8084;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5620 extends AbstractC7825 implements InterfaceC5631 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public AbstractC5710 f14284;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public AbstractC5710 f14285;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5634 f14286;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C7735 f14287;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C6986 f14288;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC7737 f14289;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AbstractC5710 f14290;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public List f14291;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ProtoBuf$TypeAlias f14292;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5620(C5677 c5677, InterfaceC5331 interfaceC5331, InterfaceC7310 interfaceC7310, C5523 c5523, C5322 c5322, ProtoBuf$TypeAlias protoBuf$TypeAlias, InterfaceC7737 interfaceC7737, C6986 c6986, C7735 c7735, InterfaceC5634 interfaceC5634) {
        super(c5677, interfaceC5331, interfaceC7310, c5523, c5322);
        c5677.getClass();
        interfaceC5331.getClass();
        c5322.getClass();
        protoBuf$TypeAlias.getClass();
        interfaceC7737.getClass();
        c6986.getClass();
        c7735.getClass();
        this.f14292 = protoBuf$TypeAlias;
        this.f14289 = interfaceC7737;
        this.f14288 = c6986;
        this.f14287 = c7735;
        this.f14286 = interfaceC5634;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final C6986 mo10071() {
        return this.f14288;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC5634 mo10072() {
        return this.f14286;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final InterfaceC7737 mo10073() {
        return this.f14289;
    }

    @Override // p095.AbstractC7825
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final AbstractC7818 mo10078() {
        if (AbstractC5725.m10388(mo10080())) {
            return null;
        }
        InterfaceC5309 interfaceC5309Mo9770 = mo10080().mo10281().mo9770();
        if (interfaceC5309Mo9770 instanceof AbstractC7818) {
            return (AbstractC7818) interfaceC5309Mo9770;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void m10079(List list, AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        InterfaceC8083 interfaceC8083Mo9773;
        AbstractC5710 abstractC5710M10375;
        list.getClass();
        abstractC5710.getClass();
        abstractC57102.getClass();
        this.f19098 = list;
        this.f14285 = abstractC5710;
        this.f14284 = abstractC57102;
        this.f14291 = AbstractC5323.m9637(this);
        AbstractC7818 abstractC7818Mo10078 = mo10078();
        if (abstractC7818Mo10078 == null || (interfaceC8083Mo9773 = abstractC7818Mo10078.mo9773()) == null) {
            interfaceC8083Mo9773 = C8084.f19681;
        }
        InterfaceC8083 interfaceC8083 = interfaceC8083Mo9773;
        C7827 c7827 = new C7827();
        C8068 c8068 = AbstractC5749.f14592;
        if (C8069.m13026(this)) {
            abstractC5710M10375 = C8069.m13029(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            InterfaceC5705 interfaceC5705Mo9560 = mo9560();
            if (interfaceC5705Mo9560 == null) {
                AbstractC5749.m10407(12);
                throw null;
            }
            List listM10404 = AbstractC5749.m10404(((C7826) interfaceC5705Mo9560).getParameters());
            C5706.f14520.getClass();
            abstractC5710M10375 = AbstractC5725.m10375(C5706.f14521, interfaceC5705Mo9560, listM10404, false, interfaceC8083, c7827);
        }
        this.f14290 = abstractC5710M10375;
    }

    @Override // p095.AbstractC7825
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final AbstractC5710 mo10080() {
        AbstractC5710 abstractC5710 = this.f14284;
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        AbstractC5227.m9467("expandedType");
        throw null;
    }

    @Override // p095.AbstractC7825
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final AbstractC5710 mo10081() {
        AbstractC5710 abstractC5710 = this.f14285;
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        AbstractC5227.m9467("underlyingType");
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5332 mo9564(C5751 c5751) {
        c5751.getClass();
        if (c5751.f14594.mo10293()) {
            return this;
        }
        InterfaceC5331 interfaceC5331Mo9587 = mo9587();
        interfaceC5331Mo9587.getClass();
        InterfaceC7310 annotations = getAnnotations();
        annotations.getClass();
        C5523 name = getName();
        name.getClass();
        C5620 c5620 = new C5620(this.f19095, interfaceC5331Mo9587, annotations, name, this.f19097, this.f14292, this.f14289, this.f14288, this.f14287, this.f14286);
        List listMo9574 = mo9574();
        AbstractC5710 abstractC5710Mo10081 = mo10081();
        Variance variance = Variance.INVARIANT;
        c5620.m10079(listMo9574, AbstractC5725.m10371(c5751.m10420(abstractC5710Mo10081, variance)), AbstractC5725.m10371(c5751.m10420(mo10080(), variance)));
        return c5620;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5631
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC5533 mo10075() {
        return this.f14292;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC5710 mo9584() {
        AbstractC5710 abstractC5710 = this.f14290;
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        AbstractC5227.m9467("defaultTypeImpl");
        throw null;
    }
}

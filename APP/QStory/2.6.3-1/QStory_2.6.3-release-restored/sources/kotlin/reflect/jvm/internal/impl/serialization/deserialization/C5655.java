package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC4765;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5616;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5618;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5621;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5625;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5626;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p023.C6986;
import p050.AbstractC7176;
import p062.C7303;
import p062.C7311;
import p062.C7314;
import p062.InterfaceC7310;
import p082.AbstractC7705;
import p086.AbstractC7728;
import p086.AbstractC7738;
import p086.C7730;
import p086.C7735;
import p086.InterfaceC7737;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.C7808;
import p095.C7819;
import p095.C7820;
import p095.C7835;
import p095.C7840;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5645 f14400;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5656 f14401;

    public C5655(C5656 c5656) {
        this.f14401 = c5656;
        C5665 c5665 = c5656.f14407;
        this.f14400 = new C5645(c5665.f14436, c5665.f14449);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5626 m10114(ProtoBuf$Function protoBuf$Function) {
        int flags;
        AbstractC5714 abstractC5714M10110;
        C5656 c5656 = this.f14401;
        InterfaceC7737 interfaceC7737 = c5656.f14406;
        C6986 c6986 = c5656.f14404;
        if (protoBuf$Function.hasFlags()) {
            flags = protoBuf$Function.getFlags();
        } else {
            int oldFlags = protoBuf$Function.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        InterfaceC7310 interfaceC7310M10117 = m10117(protoBuf$Function, i, annotatedCallableKind);
        InterfaceC7310 c5618 = (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) ? new C5618(c5656.f14407.f14437, new C5651(this, protoBuf$Function, annotatedCallableKind, 1)) : C7311.f18113;
        C5626 c5626 = new C5626(c5656.f14405, null, interfaceC7310M10117, AbstractC4765.m8875(interfaceC7737, protoBuf$Function.getName()), AbstractC5894.m10581((ProtoBuf$MemberKind) AbstractC7728.f18738.mo12740(i)), protoBuf$Function, c5656.f14406, c6986, AbstractC5605.m10064(c5656.f14405).m9880(AbstractC4765.m8875(interfaceC7737, protoBuf$Function.getName())).equals(AbstractC5636.f14355) ? C7735.f18766 : c5656.f14403, c5656.f14409, null);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C5656 c5656M10123 = c5656.m10123(c5626, typeParameterList, c5656.f14406, c5656.f14404, c5656.f14403, c5656.f14402);
        C5655 c5655 = c5656M10123.f14410;
        C5642 c5642 = c5656M10123.f14408;
        ProtoBuf$Type protoBuf$TypeM12760 = AbstractC7738.m12760(protoBuf$Function, c6986);
        C7835 c7835M12690 = (protoBuf$TypeM12760 == null || (abstractC5714M10110 = c5642.m10110(protoBuf$TypeM12760)) == null) ? null : AbstractC7705.m12690(c5626, abstractC5714M10110, c5618);
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        AbstractC7818 abstractC7818 = interfaceC5331 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5331 : null;
        C7835 c7835Mo12866 = abstractC7818 != null ? abstractC7818.mo12866() : null;
        List listM12747 = AbstractC7738.m12747(protoBuf$Function, c6986);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        ArrayList arrayListM10118 = c5655.m10118(listM12747, contextParameterList, protoBuf$Function, annotatedCallableKind);
        List listM10109 = c5642.m10109();
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        c5626.mo9701(c7835M12690, c7835Mo12866, arrayListM10118, listM10109, c5655.m10120(valueParameterList, protoBuf$Function, annotatedCallableKind), c5642.m10110(AbstractC7738.m12758(protoBuf$Function, c6986)), C5638.m10101((ProtoBuf$Modality) AbstractC7728.f18725.mo12740(i)), AbstractC5894.m10612((ProtoBuf$Visibility) AbstractC7728.f18726.mo12740(i)), AbstractC5171.m9335());
        c5626.f19116 = AbstractC7728.f18739.mo12740(i).booleanValue();
        c5626.f19115 = AbstractC7728.f18731.mo12740(i).booleanValue();
        c5626.f19114 = AbstractC7728.f18735.mo12740(i).booleanValue();
        c5626.f19125 = AbstractC7728.f18730.mo12740(i).booleanValue();
        c5626.f19124 = AbstractC7728.f18734.mo12740(i).booleanValue();
        c5626.f19120 = AbstractC7728.f18732.mo12740(i).booleanValue();
        c5626.f19123 = AbstractC7728.f18733.mo12740(i).booleanValue();
        c5626.f19111 = !AbstractC7728.f18717.mo12740(i).booleanValue();
        c5656.f14407.f14441.getClass();
        return c5626;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5616 m10115(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        C5322 c5322;
        C5656 c5656 = this.f14401;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        interfaceC5331.getClass();
        AbstractC7818 abstractC7818 = (AbstractC7818) interfaceC5331;
        int flags = protoBuf$Constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C5616 c5616 = new C5616(abstractC7818, null, m10117(protoBuf$Constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor$Kind.DECLARATION, protoBuf$Constructor, c5656.f14406, c5656.f14404, c5656.f14403, c5656.f14409, null);
        C5655 c5655 = c5656.m10123(c5616, EmptyList.INSTANCE, c5656.f14406, c5656.f14404, c5656.f14403, c5656.f14402).f14410;
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
        valueParameterList.getClass();
        List listM10120 = c5655.m10120(valueParameterList, protoBuf$Constructor, annotatedCallableKind);
        ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC7728.f18726.mo12740(protoBuf$Constructor.getFlags());
        switch (protoBuf$Visibility == null ? -1 : AbstractC5637.f14356[protoBuf$Visibility.ordinal()]) {
            case 1:
                c5322 = AbstractC5321.f13462;
                c5322.getClass();
                break;
            case 2:
                c5322 = AbstractC5321.f13465;
                c5322.getClass();
                break;
            case 3:
                c5322 = AbstractC5321.f13464;
                c5322.getClass();
                break;
            case 4:
                c5322 = AbstractC5321.f13463;
                c5322.getClass();
                break;
            case 5:
                c5322 = AbstractC5321.f13461;
                c5322.getClass();
                break;
            case 6:
                c5322 = AbstractC5321.f13460;
                c5322.getClass();
                break;
            default:
                c5322 = AbstractC5321.f13465;
                c5322.getClass();
                break;
        }
        c5616.m12921(listM10120, c5322);
        c5616.m12893(abstractC7818.mo9584());
        c5616.f19123 = abstractC7818.mo9567();
        c5616.f19111 = !AbstractC7728.f18740.mo12740(protoBuf$Constructor.getFlags()).booleanValue();
        return c5616;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC7310 m10116(ProtoBuf$Property protoBuf$Property, boolean z) {
        return !AbstractC7728.f18727.mo12740(protoBuf$Property.getFlags()).booleanValue() ? C7311.f18113 : new C5621(this.f14401.f14407.f14437, new C5650(this, z, protoBuf$Property));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7310 m10117(GeneratedMessageLite.ExtendableMessage extendableMessage, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !AbstractC7728.f18727.mo12740(i).booleanValue() ? C7311.f18113 : new C5621(this.f14401.f14407.f14437, new C5651(this, extendableMessage, annotatedCallableKind, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m10118(List list, List list2, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        C5655 c5655 = this;
        C5656 c5656 = c5655.f14401;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        interfaceC5331.getClass();
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC5331;
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5313.mo9587();
        interfaceC5331Mo9587.getClass();
        AbstractC5640 abstractC5640M10119 = c5655.m10119(interfaceC5331Mo9587);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) AbstractC5176.m9377(i, list2);
            C7835 c7835M12683 = AbstractC7705.m12683(interfaceC5313, c5656.f14408.m10110(protoBuf$Type), null, (abstractC5640M10119 == null || !AbstractC7728.f18727.mo12740((protoBuf$ValueParameter == null || !protoBuf$ValueParameter.hasFlags()) ? 0 : protoBuf$ValueParameter.getFlags()).booleanValue()) ? C7311.f18113 : new C5621(c5656.f14407.f14437, new C5654(c5655, abstractC5640M10119, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 1)), i);
            if (c7835M12683 != null) {
                arrayList.add(c7835M12683);
            }
            c5655 = this;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC5640 m10119(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 instanceof InterfaceC5298) {
            C5519 c5519 = ((AbstractC7815) ((InterfaceC5298) interfaceC5331)).f19032;
            C5656 c5656 = this.f14401;
            return new C5653(c5519, c5656.f14406, c5656.f14404, c5656.f14409);
        }
        if (interfaceC5331 instanceof C5633) {
            return ((C5633) interfaceC5331).f14342;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m10120(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        int i;
        AbstractC5714 abstractC5714;
        InterfaceC7310 c5621;
        C5655 c5655 = this;
        C5656 c5656 = c5655.f14401;
        C6986 c6986 = c5656.f14404;
        C5642 c5642 = c5656.f14408;
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        interfaceC5331.getClass();
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC5331;
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5313.mo9587();
        interfaceC5331Mo9587.getClass();
        AbstractC5640 abstractC5640M10119 = c5655.m10119(interfaceC5331Mo9587);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
            int flags = protoBuf$ValueParameter.hasFlags() ? protoBuf$ValueParameter.getFlags() : 0;
            if (abstractC5640M10119 == null || !AbstractC7728.f18727.mo12740(flags).booleanValue()) {
                i = i2;
                abstractC5714 = null;
                c5621 = C7311.f18113;
            } else {
                i = i2;
                abstractC5714 = null;
                c5621 = new C5621(c5656.f14407.f14437, new C5654(c5655, abstractC5640M10119, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 0));
            }
            C5523 c5523M8875 = AbstractC4765.m8875(c5656.f14406, protoBuf$ValueParameter.getName());
            AbstractC5714 abstractC5714M10110 = c5642.m10110(AbstractC7738.m12754(protoBuf$ValueParameter, c6986));
            boolean zBooleanValue = AbstractC7728.f18709.mo12740(flags).booleanValue();
            boolean zBooleanValue2 = AbstractC7728.f18708.mo12740(flags).booleanValue();
            boolean zBooleanValue3 = AbstractC7728.f18711.mo12740(flags).booleanValue();
            ProtoBuf$Type protoBuf$TypeM12753 = AbstractC7738.m12753(protoBuf$ValueParameter, c6986);
            AbstractC5714 abstractC5714M101102 = protoBuf$TypeM12753 != null ? c5642.m10110(protoBuf$TypeM12753) : abstractC5714;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C7808(interfaceC5313, null, i, c5621, c5523M8875, abstractC5714M10110, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC5714M101102, InterfaceC5294.f13436));
            arrayList = arrayList2;
            i2 = i3;
            c5655 = this;
        }
        return AbstractC5176.m9356(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5625 m10121(ProtoBuf$Property protoBuf$Property, boolean z) {
        int flags;
        InterfaceC7310 interfaceC7310M10117;
        C5655 c5655;
        InterfaceC7310 c5618;
        List list;
        C7835 c7835;
        List list2;
        C7835 c78352;
        boolean z2;
        C7730 c7730;
        C5655 c56552;
        C7820 c7820M12682;
        C7820 c7820;
        C5675 c5675;
        C7819 c7819M12689;
        boolean z3;
        boolean z4;
        AbstractC5714 abstractC5714M10110;
        C5656 c5656 = this.f14401;
        InterfaceC7737 interfaceC7737 = c5656.f14406;
        C6986 c6986 = c5656.f14404;
        protoBuf$Property.getClass();
        if (protoBuf$Property.hasFlags()) {
            flags = protoBuf$Property.getFlags();
        } else {
            int oldFlags = protoBuf$Property.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        C7303 c7303 = C7311.f18113;
        if (z) {
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(annotationList, 10));
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                arrayList.add(this.f14400.m10113(protoBuf$Annotation, interfaceC7737));
            }
            interfaceC7310M10117 = arrayList.isEmpty() ? c7303 : new C7314(0, arrayList);
        } else {
            interfaceC7310M10117 = null;
        }
        InterfaceC5331 interfaceC5331 = c5656.f14405;
        if (interfaceC7310M10117 == null) {
            interfaceC7310M10117 = m10117(protoBuf$Property, flags, AnnotatedCallableKind.PROPERTY);
        }
        C7730 c77302 = AbstractC7728.f18725;
        Modality modalityM10101 = C5638.m10101((ProtoBuf$Modality) c77302.mo12740(flags));
        C7730 c77303 = AbstractC7728.f18726;
        int i = flags;
        C5625 c5625 = new C5625(interfaceC5331, null, interfaceC7310M10117, modalityM10101, AbstractC5894.m10612((ProtoBuf$Visibility) c77303.mo12740(flags)), AbstractC7728.f18715.mo12740(flags).booleanValue(), AbstractC4765.m8875(interfaceC7737, protoBuf$Property.getName()), AbstractC5894.m10581((ProtoBuf$MemberKind) AbstractC7728.f18738.mo12740(flags)), AbstractC7728.f18723.mo12740(flags).booleanValue(), AbstractC7728.f18712.mo12740(flags).booleanValue(), AbstractC7728.f18721.mo12740(flags).booleanValue(), AbstractC7728.f18720.mo12740(flags).booleanValue(), AbstractC7728.f18719.mo12740(flags).booleanValue(), protoBuf$Property, c5656.f14406, c6986, c5656.f14403, c5656.f14409);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C5656 c5656M10123 = c5656.m10123(c5625, typeParameterList, c5656.f14406, c5656.f14404, c5656.f14403, c5656.f14402);
        C5642 c5642 = c5656M10123.f14408;
        boolean zBooleanValue = AbstractC7728.f18714.mo12740(i).booleanValue();
        if (zBooleanValue && (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId())) {
            c5655 = this;
            c5618 = new C5618(c5656.f14407.f14437, new C5651(c5655, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, 1));
        } else {
            c5655 = this;
            c5618 = c7303;
        }
        AbstractC5714 abstractC5714M101102 = c5642.m10110(AbstractC7738.m12759(protoBuf$Property, c6986));
        List listM10109 = c5642.m10109();
        InterfaceC5331 interfaceC53312 = c5656.f14405;
        AbstractC7818 abstractC7818 = interfaceC53312 instanceof AbstractC7818 ? (AbstractC7818) interfaceC53312 : null;
        if (abstractC7818 != null) {
            C7835 c7835Mo12866 = abstractC7818.mo12866();
            list = listM10109;
            c7835 = c7835Mo12866;
        } else {
            list = listM10109;
            c7835 = null;
        }
        ProtoBuf$Type protoBuf$TypeM12761 = AbstractC7738.m12761(protoBuf$Property, c6986);
        if (protoBuf$TypeM12761 == null || (abstractC5714M10110 = c5642.m10110(protoBuf$TypeM12761)) == null) {
            list2 = list;
            c78352 = null;
        } else {
            C7835 c7835M12690 = AbstractC7705.m12690(c5625, abstractC5714M10110, c5618);
            list2 = list;
            c78352 = c7835M12690;
        }
        C5655 c56553 = c5656M10123.f14410;
        List listM12746 = AbstractC7738.m12746(protoBuf$Property, c6986);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        c5625.m12879(abstractC5714M101102, list2, c7835, c78352, c56553.m10118(listM12746, contextParameterList, protoBuf$Property, annotatedCallableKind));
        int iM12734 = AbstractC7728.m12734(AbstractC7728.f18727.mo12740(i).booleanValue(), (ProtoBuf$Visibility) c77303.mo12740(i), (ProtoBuf$Modality) c77302.mo12740(i));
        C5293 c5293 = InterfaceC5294.f13436;
        if (zBooleanValue) {
            int getterFlags = protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : iM12734;
            boolean zBooleanValue2 = AbstractC7728.f18710.mo12740(getterFlags).booleanValue();
            boolean zBooleanValue3 = AbstractC7728.f18706.mo12740(getterFlags).booleanValue();
            boolean zBooleanValue4 = AbstractC7728.f18707.mo12740(getterFlags).booleanValue();
            InterfaceC7310 interfaceC7310M101172 = c5655.m10117(protoBuf$Property, getterFlags, annotatedCallableKind);
            if (zBooleanValue2) {
                z2 = true;
                c7730 = c77302;
                c56552 = this;
                c7820M12682 = new C7820(c5625, interfaceC7310M101172, C5638.m10101((ProtoBuf$Modality) c77302.mo12740(getterFlags)), AbstractC5894.m10612((ProtoBuf$Visibility) c77303.mo12740(getterFlags)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, c5625.getKind(), null, c5293);
            } else {
                z2 = true;
                c7730 = c77302;
                c56552 = c5655;
                c7820M12682 = AbstractC7705.m12682(c5625, interfaceC7310M101172);
            }
            c7820M12682.m12873(c5625.getReturnType());
        } else {
            z2 = true;
            c7730 = c77302;
            c56552 = c5655;
            c7820M12682 = null;
        }
        if (AbstractC7728.f18713.mo12740(i).booleanValue()) {
            if (protoBuf$Property.hasSetterFlags()) {
                iM12734 = protoBuf$Property.getSetterFlags();
            }
            boolean zBooleanValue5 = AbstractC7728.f18710.mo12740(iM12734).booleanValue();
            boolean zBooleanValue6 = AbstractC7728.f18706.mo12740(iM12734).booleanValue();
            boolean zBooleanValue7 = AbstractC7728.f18707.mo12740(iM12734).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            InterfaceC7310 interfaceC7310M101173 = c56552.m10117(protoBuf$Property, iM12734, annotatedCallableKind2);
            if (zBooleanValue5) {
                c7820 = c7820M12682;
                C7819 c7819 = new C7819(c5625, interfaceC7310M101173, C5638.m10101((ProtoBuf$Modality) c7730.mo12740(iM12734)), AbstractC5894.m10612((ProtoBuf$Visibility) c77303.mo12740(iM12734)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, c5625.getKind(), null, c5293);
                InterfaceC5288 interfaceC5288 = (InterfaceC5288) AbstractC5176.m9338(c5656M10123.m10123(c7819, EmptyList.INSTANCE, c5656M10123.f14406, c5656M10123.f14404, c5656M10123.f14403, c5656M10123.f14402).f14410.m10120(AbstractC7176.m12487(protoBuf$Property.getSetterValueParameter()), protoBuf$Property, annotatedCallableKind2));
                if (interfaceC5288 == null) {
                    C7819.m12870(6);
                    throw null;
                }
                c7819.f19051 = interfaceC5288;
                c7819M12689 = c7819;
                c5675 = null;
            } else {
                c7820 = c7820M12682;
                c5675 = null;
                c7819M12689 = AbstractC7705.m12689(c5625, interfaceC7310M101173);
            }
        } else {
            c7820 = c7820M12682;
            c5675 = null;
            c7819M12689 = null;
        }
        if (AbstractC7728.f18722.mo12740(i).booleanValue()) {
            z3 = false;
            c5625.m12881(c5675, new C5659(c56552, protoBuf$Property, c5625, false ? 1 : 0));
        } else {
            z3 = false;
        }
        InterfaceC5331 interfaceC53313 = c5656.f14405;
        ?? r6 = interfaceC53313 instanceof AbstractC7818 ? (AbstractC7818) interfaceC53313 : c5675;
        if ((r6 != 0 ? r6.mo9569() : c5675) == ClassKind.ANNOTATION_CLASS) {
            z4 = z2;
            c5625.m12881(c5675, new C5659(c56552, protoBuf$Property, c5625, z4 ? 1 : 0));
        } else {
            z4 = z2;
        }
        c5625.m12880(c7820, c7819M12689, new C7840(c56552.m10116(protoBuf$Property, z3)), new C7840(c56552.m10116(protoBuf$Property, z4)));
        return c5625;
    }
}

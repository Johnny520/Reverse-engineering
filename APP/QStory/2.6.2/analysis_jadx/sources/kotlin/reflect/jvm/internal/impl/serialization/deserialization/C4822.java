package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
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
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4783;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4785;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4788;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4792;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4800;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p015.C6230;
import p046.C6473;
import p046.C6481;
import p046.C6484;
import p046.InterfaceC6480;
import p066.AbstractC6875;
import p070.AbstractC6898;
import p070.AbstractC6908;
import p070.C6900;
import p070.C6905;
import p070.InterfaceC6907;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p079.C6978;
import p079.C6989;
import p079.C6990;
import p079.C7005;
import p079.C7010;
import p175.AbstractC7738;
import p251.AbstractC8174;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4822 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4812 f14051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4823 f14052;

    public C4822(C4823 c4823) {
        this.f14052 = c4823;
        C4832 c4832 = c4823.f14058;
        this.f14051 = new C4812(c4832.f14087, c4832.f14100);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4793 m9565(ProtoBuf$Function protoBuf$Function) {
        int flags;
        AbstractC4881 abstractC4881M9561;
        C4823 c4823 = this.f14052;
        InterfaceC6907 interfaceC6907 = c4823.f14057;
        C6230 c6230 = c4823.f14055;
        if (protoBuf$Function.hasFlags()) {
            flags = protoBuf$Function.getFlags();
        } else {
            int oldFlags = protoBuf$Function.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        InterfaceC6480 interfaceC6480M9568 = m9568(protoBuf$Function, i, annotatedCallableKind);
        InterfaceC6480 c4785 = (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) ? new C4785(c4823.f14058.f14088, new C4818(this, protoBuf$Function, annotatedCallableKind, 1)) : C6481.f17772;
        C4793 c4793 = new C4793(c4823.f14056, null, interfaceC6480M9568, AbstractC7738.m13047(interfaceC6907, protoBuf$Function.getName()), AbstractC8174.m13613((ProtoBuf$MemberKind) AbstractC6898.f18398.mo12153(i)), protoBuf$Function, c4823.f14057, c6230, AbstractC4772.m9515(c4823.f14056).m9331(AbstractC7738.m13047(interfaceC6907, protoBuf$Function.getName())).equals(AbstractC4803.f14006) ? C6905.f18426 : c4823.f14054, c4823.f14060, null);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C4823 c4823M9574 = c4823.m9574(c4793, typeParameterList, c4823.f14057, c4823.f14055, c4823.f14054, c4823.f14053);
        C4822 c4822 = c4823M9574.f14061;
        C4809 c4809 = c4823M9574.f14059;
        ProtoBuf$Type protoBuf$TypeM12173 = AbstractC6908.m12173(protoBuf$Function, c6230);
        C7005 c7005M12103 = (protoBuf$TypeM12173 == null || (abstractC4881M9561 = c4809.m9561(protoBuf$TypeM12173)) == null) ? null : AbstractC6875.m12103(c4793, abstractC4881M9561, c4785);
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        AbstractC6988 abstractC6988 = interfaceC4498 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4498 : null;
        C7005 c7005Mo12280 = abstractC6988 != null ? abstractC6988.mo12280() : null;
        List listM12160 = AbstractC6908.m12160(protoBuf$Function, c6230);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        ArrayList arrayListM9569 = c4822.m9569(listM12160, contextParameterList, protoBuf$Function, annotatedCallableKind);
        List listM9560 = c4809.m9560();
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        c4793.mo9152(c7005M12103, c7005Mo12280, arrayListM9569, listM9560, c4822.m9571(valueParameterList, protoBuf$Function, annotatedCallableKind), c4809.m9561(AbstractC6908.m12171(protoBuf$Function, c6230)), C4805.m9552((ProtoBuf$Modality) AbstractC6898.f18385.mo12153(i)), AbstractC8174.m13620((ProtoBuf$Visibility) AbstractC6898.f18386.mo12153(i)), AbstractC4338.m8781());
        c4793.f18776 = AbstractC6898.f18399.mo12153(i).booleanValue();
        c4793.f18775 = AbstractC6898.f18391.mo12153(i).booleanValue();
        c4793.f18774 = AbstractC6898.f18395.mo12153(i).booleanValue();
        c4793.f18785 = AbstractC6898.f18390.mo12153(i).booleanValue();
        c4793.f18784 = AbstractC6898.f18394.mo12153(i).booleanValue();
        c4793.f18780 = AbstractC6898.f18392.mo12153(i).booleanValue();
        c4793.f18783 = AbstractC6898.f18393.mo12153(i).booleanValue();
        c4793.f18771 = !AbstractC6898.f18377.mo12153(i).booleanValue();
        c4823.f14058.f14092.getClass();
        return c4793;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4783 m9566(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        C4489 c4489;
        C4823 c4823 = this.f14052;
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        interfaceC4498.getClass();
        AbstractC6988 abstractC6988 = (AbstractC6988) interfaceC4498;
        int flags = protoBuf$Constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C4783 c4783 = new C4783(abstractC6988, null, m9568(protoBuf$Constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor$Kind.DECLARATION, protoBuf$Constructor, c4823.f14057, c4823.f14055, c4823.f14054, c4823.f14060, null);
        C4822 c4822 = c4823.m9574(c4783, EmptyList.INSTANCE, c4823.f14057, c4823.f14055, c4823.f14054, c4823.f14053).f14061;
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
        valueParameterList.getClass();
        List listM9571 = c4822.m9571(valueParameterList, protoBuf$Constructor, annotatedCallableKind);
        ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC6898.f18386.mo12153(protoBuf$Constructor.getFlags());
        switch (protoBuf$Visibility == null ? -1 : AbstractC4804.f14007[protoBuf$Visibility.ordinal()]) {
            case 1:
                c4489 = AbstractC4488.f13113;
                c4489.getClass();
                break;
            case 2:
                c4489 = AbstractC4488.f13116;
                c4489.getClass();
                break;
            case 3:
                c4489 = AbstractC4488.f13115;
                c4489.getClass();
                break;
            case 4:
                c4489 = AbstractC4488.f13114;
                c4489.getClass();
                break;
            case 5:
                c4489 = AbstractC4488.f13112;
                c4489.getClass();
                break;
            case 6:
                c4489 = AbstractC4488.f13111;
                c4489.getClass();
                break;
            default:
                c4489 = AbstractC4488.f13116;
                c4489.getClass();
                break;
        }
        c4783.m12335(listM9571, c4489);
        c4783.m12307(abstractC6988.mo9035());
        c4783.f18783 = abstractC6988.mo9018();
        c4783.f18771 = !AbstractC6898.f18400.mo12153(protoBuf$Constructor.getFlags()).booleanValue();
        return c4783;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6480 m9567(ProtoBuf$Property protoBuf$Property, boolean z) {
        return !AbstractC6898.f18387.mo12153(protoBuf$Property.getFlags()).booleanValue() ? C6481.f17772 : new C4788(this.f14052.f14058.f14088, new C4817(this, z, protoBuf$Property));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6480 m9568(GeneratedMessageLite.ExtendableMessage extendableMessage, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !AbstractC6898.f18387.mo12153(i).booleanValue() ? C6481.f17772 : new C4788(this.f14052.f14058.f14088, new C4818(this, extendableMessage, annotatedCallableKind, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m9569(List list, List list2, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        C4822 c4822 = this;
        C4823 c4823 = c4822.f14052;
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        interfaceC4498.getClass();
        InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC4498;
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4480.mo9038();
        interfaceC4498Mo9038.getClass();
        AbstractC4807 abstractC4807M9570 = c4822.m9570(interfaceC4498Mo9038);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) AbstractC4343.m8831(i, list2);
            C7005 c7005M12096 = AbstractC6875.m12096(interfaceC4480, c4823.f14059.m9561(protoBuf$Type), null, (abstractC4807M9570 == null || !AbstractC6898.f18387.mo12153((protoBuf$ValueParameter == null || !protoBuf$ValueParameter.hasFlags()) ? 0 : protoBuf$ValueParameter.getFlags()).booleanValue()) ? C6481.f17772 : new C4788(c4823.f14058.f14088, new C4821(c4822, abstractC4807M9570, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 1)), i);
            if (c7005M12096 != null) {
                arrayList.add(c7005M12096);
            }
            c4822 = this;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4807 m9570(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 instanceof InterfaceC4465) {
            C4686 c4686 = ((AbstractC6985) ((InterfaceC4465) interfaceC4498)).f18692;
            C4823 c4823 = this.f14052;
            return new C4820(c4686, c4823.f14057, c4823.f14055, c4823.f14060);
        }
        if (interfaceC4498 instanceof C4800) {
            return ((C4800) interfaceC4498).f13993;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m9571(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        int i;
        AbstractC4881 abstractC4881;
        InterfaceC6480 c4788;
        C4822 c4822 = this;
        C4823 c4823 = c4822.f14052;
        C6230 c6230 = c4823.f14055;
        C4809 c4809 = c4823.f14059;
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        interfaceC4498.getClass();
        InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC4498;
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4480.mo9038();
        interfaceC4498Mo9038.getClass();
        AbstractC4807 abstractC4807M9570 = c4822.m9570(interfaceC4498Mo9038);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
            int flags = protoBuf$ValueParameter.hasFlags() ? protoBuf$ValueParameter.getFlags() : 0;
            if (abstractC4807M9570 == null || !AbstractC6898.f18387.mo12153(flags).booleanValue()) {
                i = i2;
                abstractC4881 = null;
                c4788 = C6481.f17772;
            } else {
                i = i2;
                abstractC4881 = null;
                c4788 = new C4788(c4823.f14058.f14088, new C4821(c4822, abstractC4807M9570, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 0));
            }
            C4690 c4690M13047 = AbstractC7738.m13047(c4823.f14057, protoBuf$ValueParameter.getName());
            AbstractC4881 abstractC4881M9561 = c4809.m9561(AbstractC6908.m12167(protoBuf$ValueParameter, c6230));
            boolean zBooleanValue = AbstractC6898.f18369.mo12153(flags).booleanValue();
            boolean zBooleanValue2 = AbstractC6898.f18368.mo12153(flags).booleanValue();
            boolean zBooleanValue3 = AbstractC6898.f18371.mo12153(flags).booleanValue();
            ProtoBuf$Type protoBuf$TypeM12166 = AbstractC6908.m12166(protoBuf$ValueParameter, c6230);
            AbstractC4881 abstractC4881M95612 = protoBuf$TypeM12166 != null ? c4809.m9561(protoBuf$TypeM12166) : abstractC4881;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C6978(interfaceC4480, null, i, c4788, c4690M13047, abstractC4881M9561, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC4881M95612, InterfaceC4461.f13087));
            arrayList = arrayList2;
            i2 = i3;
            c4822 = this;
        }
        return AbstractC4343.m8804(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4792 m9572(ProtoBuf$Property protoBuf$Property, boolean z) {
        int flags;
        InterfaceC6480 interfaceC6480M9568;
        C4822 c4822;
        InterfaceC6480 c4785;
        List list;
        C7005 c7005;
        List list2;
        C7005 c70052;
        boolean z2;
        C6900 c6900;
        C4822 c48222;
        C6990 c6990M12095;
        C6990 c6990;
        C4842 c4842;
        C6989 c6989M12102;
        boolean z3;
        boolean z4;
        AbstractC4881 abstractC4881M9561;
        C4823 c4823 = this.f14052;
        InterfaceC6907 interfaceC6907 = c4823.f14057;
        C6230 c6230 = c4823.f14055;
        protoBuf$Property.getClass();
        if (protoBuf$Property.hasFlags()) {
            flags = protoBuf$Property.getFlags();
        } else {
            int oldFlags = protoBuf$Property.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        C6473 c6473 = C6481.f17772;
        if (z) {
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(annotationList, 10));
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                arrayList.add(this.f14051.m9564(protoBuf$Annotation, interfaceC6907));
            }
            interfaceC6480M9568 = arrayList.isEmpty() ? c6473 : new C6484(0, arrayList);
        } else {
            interfaceC6480M9568 = null;
        }
        InterfaceC4498 interfaceC4498 = c4823.f14056;
        if (interfaceC6480M9568 == null) {
            interfaceC6480M9568 = m9568(protoBuf$Property, flags, AnnotatedCallableKind.PROPERTY);
        }
        C6900 c69002 = AbstractC6898.f18385;
        Modality modalityM9552 = C4805.m9552((ProtoBuf$Modality) c69002.mo12153(flags));
        C6900 c69003 = AbstractC6898.f18386;
        int i = flags;
        C4792 c4792 = new C4792(interfaceC4498, null, interfaceC6480M9568, modalityM9552, AbstractC8174.m13620((ProtoBuf$Visibility) c69003.mo12153(flags)), AbstractC6898.f18375.mo12153(flags).booleanValue(), AbstractC7738.m13047(interfaceC6907, protoBuf$Property.getName()), AbstractC8174.m13613((ProtoBuf$MemberKind) AbstractC6898.f18398.mo12153(flags)), AbstractC6898.f18383.mo12153(flags).booleanValue(), AbstractC6898.f18372.mo12153(flags).booleanValue(), AbstractC6898.f18381.mo12153(flags).booleanValue(), AbstractC6898.f18380.mo12153(flags).booleanValue(), AbstractC6898.f18379.mo12153(flags).booleanValue(), protoBuf$Property, c4823.f14057, c6230, c4823.f14054, c4823.f14060);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C4823 c4823M9574 = c4823.m9574(c4792, typeParameterList, c4823.f14057, c4823.f14055, c4823.f14054, c4823.f14053);
        C4809 c4809 = c4823M9574.f14059;
        boolean zBooleanValue = AbstractC6898.f18374.mo12153(i).booleanValue();
        if (zBooleanValue && (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId())) {
            c4822 = this;
            c4785 = new C4785(c4823.f14058.f14088, new C4818(c4822, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, 1));
        } else {
            c4822 = this;
            c4785 = c6473;
        }
        AbstractC4881 abstractC4881M95612 = c4809.m9561(AbstractC6908.m12172(protoBuf$Property, c6230));
        List listM9560 = c4809.m9560();
        InterfaceC4498 interfaceC44982 = c4823.f14056;
        AbstractC6988 abstractC6988 = interfaceC44982 instanceof AbstractC6988 ? (AbstractC6988) interfaceC44982 : null;
        if (abstractC6988 != null) {
            C7005 c7005Mo12280 = abstractC6988.mo12280();
            list = listM9560;
            c7005 = c7005Mo12280;
        } else {
            list = listM9560;
            c7005 = null;
        }
        ProtoBuf$Type protoBuf$TypeM12174 = AbstractC6908.m12174(protoBuf$Property, c6230);
        if (protoBuf$TypeM12174 == null || (abstractC4881M9561 = c4809.m9561(protoBuf$TypeM12174)) == null) {
            list2 = list;
            c70052 = null;
        } else {
            C7005 c7005M12103 = AbstractC6875.m12103(c4792, abstractC4881M9561, c4785);
            list2 = list;
            c70052 = c7005M12103;
        }
        C4822 c48223 = c4823M9574.f14061;
        List listM12159 = AbstractC6908.m12159(protoBuf$Property, c6230);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        c4792.m12293(abstractC4881M95612, list2, c7005, c70052, c48223.m9569(listM12159, contextParameterList, protoBuf$Property, annotatedCallableKind));
        int iM12147 = AbstractC6898.m12147(AbstractC6898.f18387.mo12153(i).booleanValue(), (ProtoBuf$Visibility) c69003.mo12153(i), (ProtoBuf$Modality) c69002.mo12153(i));
        C4460 c4460 = InterfaceC4461.f13087;
        if (zBooleanValue) {
            int getterFlags = protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : iM12147;
            boolean zBooleanValue2 = AbstractC6898.f18370.mo12153(getterFlags).booleanValue();
            boolean zBooleanValue3 = AbstractC6898.f18366.mo12153(getterFlags).booleanValue();
            boolean zBooleanValue4 = AbstractC6898.f18367.mo12153(getterFlags).booleanValue();
            InterfaceC6480 interfaceC6480M95682 = c4822.m9568(protoBuf$Property, getterFlags, annotatedCallableKind);
            if (zBooleanValue2) {
                z2 = true;
                c6900 = c69002;
                c48222 = this;
                c6990M12095 = new C6990(c4792, interfaceC6480M95682, C4805.m9552((ProtoBuf$Modality) c69002.mo12153(getterFlags)), AbstractC8174.m13620((ProtoBuf$Visibility) c69003.mo12153(getterFlags)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, c4792.getKind(), null, c4460);
            } else {
                z2 = true;
                c6900 = c69002;
                c48222 = c4822;
                c6990M12095 = AbstractC6875.m12095(c4792, interfaceC6480M95682);
            }
            c6990M12095.m12287(c4792.getReturnType());
        } else {
            z2 = true;
            c6900 = c69002;
            c48222 = c4822;
            c6990M12095 = null;
        }
        if (AbstractC6898.f18373.mo12153(i).booleanValue()) {
            if (protoBuf$Property.hasSetterFlags()) {
                iM12147 = protoBuf$Property.getSetterFlags();
            }
            boolean zBooleanValue5 = AbstractC6898.f18370.mo12153(iM12147).booleanValue();
            boolean zBooleanValue6 = AbstractC6898.f18366.mo12153(iM12147).booleanValue();
            boolean zBooleanValue7 = AbstractC6898.f18367.mo12153(iM12147).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            InterfaceC6480 interfaceC6480M95683 = c48222.m9568(protoBuf$Property, iM12147, annotatedCallableKind2);
            if (zBooleanValue5) {
                c6990 = c6990M12095;
                C6989 c6989 = new C6989(c4792, interfaceC6480M95683, C4805.m9552((ProtoBuf$Modality) c6900.mo12153(iM12147)), AbstractC8174.m13620((ProtoBuf$Visibility) c69003.mo12153(iM12147)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, c4792.getKind(), null, c4460);
                InterfaceC4455 interfaceC4455 = (InterfaceC4455) AbstractC4343.m8818(c4823M9574.m9574(c6989, EmptyList.INSTANCE, c4823M9574.f14057, c4823M9574.f14055, c4823M9574.f14054, c4823M9574.f14053).f14061.m9571(AbstractC8189.m13660(protoBuf$Property.getSetterValueParameter()), protoBuf$Property, annotatedCallableKind2));
                if (interfaceC4455 == null) {
                    C6989.m12284(6);
                    throw null;
                }
                c6989.f18711 = interfaceC4455;
                c6989M12102 = c6989;
                c4842 = null;
            } else {
                c6990 = c6990M12095;
                c4842 = null;
                c6989M12102 = AbstractC6875.m12102(c4792, interfaceC6480M95683);
            }
        } else {
            c6990 = c6990M12095;
            c4842 = null;
            c6989M12102 = null;
        }
        if (AbstractC6898.f18382.mo12153(i).booleanValue()) {
            z3 = false;
            c4792.m12295(c4842, new C4826(c48222, protoBuf$Property, c4792, false ? 1 : 0));
        } else {
            z3 = false;
        }
        InterfaceC4498 interfaceC44983 = c4823.f14056;
        ?? r6 = interfaceC44983 instanceof AbstractC6988 ? (AbstractC6988) interfaceC44983 : c4842;
        if ((r6 != 0 ? r6.mo9020() : c4842) == ClassKind.ANNOTATION_CLASS) {
            z4 = z2;
            c4792.m12295(c4842, new C4826(c48222, protoBuf$Property, c4792, z4 ? 1 : 0));
        } else {
            z4 = z2;
        }
        c4792.m12294(c6990, c6989M12102, new C7010(c48222.m9567(protoBuf$Property, z3)), new C7010(c48222.m9567(protoBuf$Property, z4)));
        return c4792;
    }
}

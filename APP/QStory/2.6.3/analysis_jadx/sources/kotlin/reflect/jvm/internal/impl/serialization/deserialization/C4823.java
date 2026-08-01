package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import io.ktor.client.plugins.AbstractC3933;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
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
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4784;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4786;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4789;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4793;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4794;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4801;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p007.C6157;
import p034.AbstractC6347;
import p046.C6474;
import p046.C6482;
import p046.C6485;
import p046.InterfaceC6481;
import p066.AbstractC6876;
import p070.AbstractC6899;
import p070.AbstractC6909;
import p070.C6901;
import p070.C6906;
import p070.InterfaceC6908;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p079.C6979;
import p079.C6990;
import p079.C6991;
import p079.C7006;
import p079.C7011;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4823 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4813 f14055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4824 f14056;

    public C4823(C4824 c4824) {
        this.f14056 = c4824;
        C4833 c4833 = c4824.f14062;
        this.f14055 = new C4813(c4833.f14091, c4833.f14104);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4794 m9555(ProtoBuf$Function protoBuf$Function) {
        int flags;
        AbstractC4882 abstractC4882M9551;
        C4824 c4824 = this.f14056;
        InterfaceC6908 interfaceC6908 = c4824.f14061;
        C6157 c6157 = c4824.f14059;
        if (protoBuf$Function.hasFlags()) {
            flags = protoBuf$Function.getFlags();
        } else {
            int oldFlags = protoBuf$Function.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        int i = flags;
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        InterfaceC6481 interfaceC6481M9558 = m9558(protoBuf$Function, i, annotatedCallableKind);
        InterfaceC6481 c4786 = (protoBuf$Function.hasReceiverType() || protoBuf$Function.hasReceiverTypeId()) ? new C4786(c4824.f14062.f14092, new C4819(this, protoBuf$Function, annotatedCallableKind, 1)) : C6482.f17768;
        C4794 c4794 = new C4794(c4824.f14060, null, interfaceC6481M9558, AbstractC3933.m8316(interfaceC6908, protoBuf$Function.getName()), AbstractC5062.m10022((ProtoBuf$MemberKind) AbstractC6899.f18393.mo12181(i)), protoBuf$Function, c4824.f14061, c6157, AbstractC4773.m9505(c4824.f14060).m9321(AbstractC3933.m8316(interfaceC6908, protoBuf$Function.getName())).equals(AbstractC4804.f14010) ? C6906.f18421 : c4824.f14058, c4824.f14064, null);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C4824 c4824M9564 = c4824.m9564(c4794, typeParameterList, c4824.f14061, c4824.f14059, c4824.f14058, c4824.f14057);
        C4823 c4823 = c4824M9564.f14065;
        C4810 c4810 = c4824M9564.f14063;
        ProtoBuf$Type protoBuf$TypeM12201 = AbstractC6909.m12201(protoBuf$Function, c6157);
        C7006 c7006M12131 = (protoBuf$TypeM12201 == null || (abstractC4882M9551 = c4810.m9551(protoBuf$TypeM12201)) == null) ? null : AbstractC6876.m12131(c4794, abstractC4882M9551, c4786);
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        AbstractC6989 abstractC6989 = interfaceC4499 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4499 : null;
        C7006 c7006Mo12307 = abstractC6989 != null ? abstractC6989.mo12307() : null;
        List listM12188 = AbstractC6909.m12188(protoBuf$Function, c6157);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        ArrayList arrayListM9559 = c4823.m9559(listM12188, contextParameterList, protoBuf$Function, annotatedCallableKind);
        List listM9550 = c4810.m9550();
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        c4794.mo9142(c7006M12131, c7006Mo12307, arrayListM9559, listM9550, c4823.m9561(valueParameterList, protoBuf$Function, annotatedCallableKind), c4810.m9551(AbstractC6909.m12199(protoBuf$Function, c6157)), C4806.m9542((ProtoBuf$Modality) AbstractC6899.f18380.mo12181(i)), AbstractC5062.m10053((ProtoBuf$Visibility) AbstractC6899.f18381.mo12181(i)), AbstractC4339.m8776());
        c4794.f18771 = AbstractC6899.f18394.mo12181(i).booleanValue();
        c4794.f18770 = AbstractC6899.f18386.mo12181(i).booleanValue();
        c4794.f18769 = AbstractC6899.f18390.mo12181(i).booleanValue();
        c4794.f18780 = AbstractC6899.f18385.mo12181(i).booleanValue();
        c4794.f18779 = AbstractC6899.f18389.mo12181(i).booleanValue();
        c4794.f18775 = AbstractC6899.f18387.mo12181(i).booleanValue();
        c4794.f18778 = AbstractC6899.f18388.mo12181(i).booleanValue();
        c4794.f18766 = !AbstractC6899.f18372.mo12181(i).booleanValue();
        c4824.f14062.f14096.getClass();
        return c4794;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4784 m9556(ProtoBuf$Constructor protoBuf$Constructor, boolean z) {
        C4490 c4490;
        C4824 c4824 = this.f14056;
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        interfaceC4499.getClass();
        AbstractC6989 abstractC6989 = (AbstractC6989) interfaceC4499;
        int flags = protoBuf$Constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C4784 c4784 = new C4784(abstractC6989, null, m9558(protoBuf$Constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor$Kind.DECLARATION, protoBuf$Constructor, c4824.f14061, c4824.f14059, c4824.f14058, c4824.f14064, null);
        C4823 c4823 = c4824.m9564(c4784, EmptyList.INSTANCE, c4824.f14061, c4824.f14059, c4824.f14058, c4824.f14057).f14065;
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
        valueParameterList.getClass();
        List listM9561 = c4823.m9561(valueParameterList, protoBuf$Constructor, annotatedCallableKind);
        ProtoBuf$Visibility protoBuf$Visibility = (ProtoBuf$Visibility) AbstractC6899.f18381.mo12181(protoBuf$Constructor.getFlags());
        switch (protoBuf$Visibility == null ? -1 : AbstractC4805.f14011[protoBuf$Visibility.ordinal()]) {
            case 1:
                c4490 = AbstractC4489.f13117;
                c4490.getClass();
                break;
            case 2:
                c4490 = AbstractC4489.f13120;
                c4490.getClass();
                break;
            case 3:
                c4490 = AbstractC4489.f13119;
                c4490.getClass();
                break;
            case 4:
                c4490 = AbstractC4489.f13118;
                c4490.getClass();
                break;
            case 5:
                c4490 = AbstractC4489.f13116;
                c4490.getClass();
                break;
            case 6:
                c4490 = AbstractC4489.f13115;
                c4490.getClass();
                break;
            default:
                c4490 = AbstractC4489.f13120;
                c4490.getClass();
                break;
        }
        c4784.m12362(listM9561, c4490);
        c4784.m12334(abstractC6989.mo9025());
        c4784.f18778 = abstractC6989.mo9008();
        c4784.f18766 = !AbstractC6899.f18395.mo12181(protoBuf$Constructor.getFlags()).booleanValue();
        return c4784;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC6481 m9557(ProtoBuf$Property protoBuf$Property, boolean z) {
        return !AbstractC6899.f18382.mo12181(protoBuf$Property.getFlags()).booleanValue() ? C6482.f17768 : new C4789(this.f14056.f14062.f14092, new C4818(this, z, protoBuf$Property));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6481 m9558(GeneratedMessageLite.ExtendableMessage extendableMessage, int i, AnnotatedCallableKind annotatedCallableKind) {
        return !AbstractC6899.f18382.mo12181(i).booleanValue() ? C6482.f17768 : new C4789(this.f14056.f14062.f14092, new C4819(this, extendableMessage, annotatedCallableKind, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m9559(List list, List list2, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        C4823 c4823 = this;
        C4824 c4824 = c4823.f14056;
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        interfaceC4499.getClass();
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC4499;
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4481.mo9028();
        interfaceC4499Mo9028.getClass();
        AbstractC4808 abstractC4808M9560 = c4823.m9560(interfaceC4499Mo9028);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) AbstractC4344.m8818(i, list2);
            C7006 c7006M12124 = AbstractC6876.m12124(interfaceC4481, c4824.f14063.m9551(protoBuf$Type), null, (abstractC4808M9560 == null || !AbstractC6899.f18382.mo12181((protoBuf$ValueParameter == null || !protoBuf$ValueParameter.hasFlags()) ? 0 : protoBuf$ValueParameter.getFlags()).booleanValue()) ? C6482.f17768 : new C4789(c4824.f14062.f14092, new C4822(c4823, abstractC4808M9560, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 1)), i);
            if (c7006M12124 != null) {
                arrayList.add(c7006M12124);
            }
            c4823 = this;
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4808 m9560(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 instanceof InterfaceC4466) {
            C4687 c4687 = ((AbstractC6986) ((InterfaceC4466) interfaceC4499)).f18687;
            C4824 c4824 = this.f14056;
            return new C4821(c4687, c4824.f14061, c4824.f14059, c4824.f14064);
        }
        if (interfaceC4499 instanceof C4801) {
            return ((C4801) interfaceC4499).f13997;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final List m9561(List list, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind) {
        int i;
        AbstractC4882 abstractC4882;
        InterfaceC6481 c4789;
        C4823 c4823 = this;
        C4824 c4824 = c4823.f14056;
        C6157 c6157 = c4824.f14059;
        C4810 c4810 = c4824.f14063;
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        interfaceC4499.getClass();
        InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC4499;
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4481.mo9028();
        interfaceC4499Mo9028.getClass();
        AbstractC4808 abstractC4808M9560 = c4823.m9560(interfaceC4499Mo9028);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) obj;
            int flags = protoBuf$ValueParameter.hasFlags() ? protoBuf$ValueParameter.getFlags() : 0;
            if (abstractC4808M9560 == null || !AbstractC6899.f18382.mo12181(flags).booleanValue()) {
                i = i2;
                abstractC4882 = null;
                c4789 = C6482.f17768;
            } else {
                i = i2;
                abstractC4882 = null;
                c4789 = new C4789(c4824.f14062.f14092, new C4822(c4823, abstractC4808M9560, extendableMessage, annotatedCallableKind, i, protoBuf$ValueParameter, 0));
            }
            C4691 c4691M8316 = AbstractC3933.m8316(c4824.f14061, protoBuf$ValueParameter.getName());
            AbstractC4882 abstractC4882M9551 = c4810.m9551(AbstractC6909.m12195(protoBuf$ValueParameter, c6157));
            boolean zBooleanValue = AbstractC6899.f18364.mo12181(flags).booleanValue();
            boolean zBooleanValue2 = AbstractC6899.f18363.mo12181(flags).booleanValue();
            boolean zBooleanValue3 = AbstractC6899.f18366.mo12181(flags).booleanValue();
            ProtoBuf$Type protoBuf$TypeM12194 = AbstractC6909.m12194(protoBuf$ValueParameter, c6157);
            AbstractC4882 abstractC4882M95512 = protoBuf$TypeM12194 != null ? c4810.m9551(protoBuf$TypeM12194) : abstractC4882;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C6979(interfaceC4481, null, i, c4789, c4691M8316, abstractC4882M9551, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC4882M95512, InterfaceC4462.f13091));
            arrayList = arrayList2;
            i2 = i3;
            c4823 = this;
        }
        return AbstractC4344.m8797(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4793 m9562(ProtoBuf$Property protoBuf$Property, boolean z) {
        int flags;
        InterfaceC6481 interfaceC6481M9558;
        C4823 c4823;
        InterfaceC6481 c4786;
        List list;
        C7006 c7006;
        List list2;
        C7006 c70062;
        boolean z2;
        C6901 c6901;
        C4823 c48232;
        C6991 c6991M12123;
        C6991 c6991;
        C4843 c4843;
        C6990 c6990M12130;
        boolean z3;
        boolean z4;
        AbstractC4882 abstractC4882M9551;
        C4824 c4824 = this.f14056;
        InterfaceC6908 interfaceC6908 = c4824.f14061;
        C6157 c6157 = c4824.f14059;
        protoBuf$Property.getClass();
        if (protoBuf$Property.hasFlags()) {
            flags = protoBuf$Property.getFlags();
        } else {
            int oldFlags = protoBuf$Property.getOldFlags();
            flags = ((oldFlags >> 8) << 6) + (oldFlags & 63);
        }
        C6474 c6474 = C6482.f17768;
        if (z) {
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(annotationList, 10));
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                arrayList.add(this.f14055.m9554(protoBuf$Annotation, interfaceC6908));
            }
            interfaceC6481M9558 = arrayList.isEmpty() ? c6474 : new C6485(0, arrayList);
        } else {
            interfaceC6481M9558 = null;
        }
        InterfaceC4499 interfaceC4499 = c4824.f14060;
        if (interfaceC6481M9558 == null) {
            interfaceC6481M9558 = m9558(protoBuf$Property, flags, AnnotatedCallableKind.PROPERTY);
        }
        C6901 c69012 = AbstractC6899.f18380;
        Modality modalityM9542 = C4806.m9542((ProtoBuf$Modality) c69012.mo12181(flags));
        C6901 c69013 = AbstractC6899.f18381;
        int i = flags;
        C4793 c4793 = new C4793(interfaceC4499, null, interfaceC6481M9558, modalityM9542, AbstractC5062.m10053((ProtoBuf$Visibility) c69013.mo12181(flags)), AbstractC6899.f18370.mo12181(flags).booleanValue(), AbstractC3933.m8316(interfaceC6908, protoBuf$Property.getName()), AbstractC5062.m10022((ProtoBuf$MemberKind) AbstractC6899.f18393.mo12181(flags)), AbstractC6899.f18378.mo12181(flags).booleanValue(), AbstractC6899.f18367.mo12181(flags).booleanValue(), AbstractC6899.f18376.mo12181(flags).booleanValue(), AbstractC6899.f18375.mo12181(flags).booleanValue(), AbstractC6899.f18374.mo12181(flags).booleanValue(), protoBuf$Property, c4824.f14061, c6157, c4824.f14058, c4824.f14064);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C4824 c4824M9564 = c4824.m9564(c4793, typeParameterList, c4824.f14061, c4824.f14059, c4824.f14058, c4824.f14057);
        C4810 c4810 = c4824M9564.f14063;
        boolean zBooleanValue = AbstractC6899.f18369.mo12181(i).booleanValue();
        if (zBooleanValue && (protoBuf$Property.hasReceiverType() || protoBuf$Property.hasReceiverTypeId())) {
            c4823 = this;
            c4786 = new C4786(c4824.f14062.f14092, new C4819(c4823, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, 1));
        } else {
            c4823 = this;
            c4786 = c6474;
        }
        AbstractC4882 abstractC4882M95512 = c4810.m9551(AbstractC6909.m12200(protoBuf$Property, c6157));
        List listM9550 = c4810.m9550();
        InterfaceC4499 interfaceC44992 = c4824.f14060;
        AbstractC6989 abstractC6989 = interfaceC44992 instanceof AbstractC6989 ? (AbstractC6989) interfaceC44992 : null;
        if (abstractC6989 != null) {
            C7006 c7006Mo12307 = abstractC6989.mo12307();
            list = listM9550;
            c7006 = c7006Mo12307;
        } else {
            list = listM9550;
            c7006 = null;
        }
        ProtoBuf$Type protoBuf$TypeM12202 = AbstractC6909.m12202(protoBuf$Property, c6157);
        if (protoBuf$TypeM12202 == null || (abstractC4882M9551 = c4810.m9551(protoBuf$TypeM12202)) == null) {
            list2 = list;
            c70062 = null;
        } else {
            C7006 c7006M12131 = AbstractC6876.m12131(c4793, abstractC4882M9551, c4786);
            list2 = list;
            c70062 = c7006M12131;
        }
        C4823 c48233 = c4824M9564.f14065;
        List listM12187 = AbstractC6909.m12187(protoBuf$Property, c6157);
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_GETTER;
        c4793.m12320(abstractC4882M95512, list2, c7006, c70062, c48233.m9559(listM12187, contextParameterList, protoBuf$Property, annotatedCallableKind));
        int iM12175 = AbstractC6899.m12175(AbstractC6899.f18382.mo12181(i).booleanValue(), (ProtoBuf$Visibility) c69013.mo12181(i), (ProtoBuf$Modality) c69012.mo12181(i));
        C4461 c4461 = InterfaceC4462.f13091;
        if (zBooleanValue) {
            int getterFlags = protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : iM12175;
            boolean zBooleanValue2 = AbstractC6899.f18365.mo12181(getterFlags).booleanValue();
            boolean zBooleanValue3 = AbstractC6899.f18361.mo12181(getterFlags).booleanValue();
            boolean zBooleanValue4 = AbstractC6899.f18362.mo12181(getterFlags).booleanValue();
            InterfaceC6481 interfaceC6481M95582 = c4823.m9558(protoBuf$Property, getterFlags, annotatedCallableKind);
            if (zBooleanValue2) {
                z2 = true;
                c6901 = c69012;
                c48232 = this;
                c6991M12123 = new C6991(c4793, interfaceC6481M95582, C4806.m9542((ProtoBuf$Modality) c69012.mo12181(getterFlags)), AbstractC5062.m10053((ProtoBuf$Visibility) c69013.mo12181(getterFlags)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, c4793.getKind(), null, c4461);
            } else {
                z2 = true;
                c6901 = c69012;
                c48232 = c4823;
                c6991M12123 = AbstractC6876.m12123(c4793, interfaceC6481M95582);
            }
            c6991M12123.m12314(c4793.getReturnType());
        } else {
            z2 = true;
            c6901 = c69012;
            c48232 = c4823;
            c6991M12123 = null;
        }
        if (AbstractC6899.f18368.mo12181(i).booleanValue()) {
            if (protoBuf$Property.hasSetterFlags()) {
                iM12175 = protoBuf$Property.getSetterFlags();
            }
            boolean zBooleanValue5 = AbstractC6899.f18365.mo12181(iM12175).booleanValue();
            boolean zBooleanValue6 = AbstractC6899.f18361.mo12181(iM12175).booleanValue();
            boolean zBooleanValue7 = AbstractC6899.f18362.mo12181(iM12175).booleanValue();
            AnnotatedCallableKind annotatedCallableKind2 = AnnotatedCallableKind.PROPERTY_SETTER;
            InterfaceC6481 interfaceC6481M95583 = c48232.m9558(protoBuf$Property, iM12175, annotatedCallableKind2);
            if (zBooleanValue5) {
                c6991 = c6991M12123;
                C6990 c6990 = new C6990(c4793, interfaceC6481M95583, C4806.m9542((ProtoBuf$Modality) c6901.mo12181(iM12175)), AbstractC5062.m10053((ProtoBuf$Visibility) c69013.mo12181(iM12175)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, c4793.getKind(), null, c4461);
                InterfaceC4456 interfaceC4456 = (InterfaceC4456) AbstractC4344.m8779(c4824M9564.m9564(c6990, EmptyList.INSTANCE, c4824M9564.f14061, c4824M9564.f14059, c4824M9564.f14058, c4824M9564.f14057).f14065.m9561(AbstractC6347.m11928(protoBuf$Property.getSetterValueParameter()), protoBuf$Property, annotatedCallableKind2));
                if (interfaceC4456 == null) {
                    C6990.m12311(6);
                    throw null;
                }
                c6990.f18706 = interfaceC4456;
                c6990M12130 = c6990;
                c4843 = null;
            } else {
                c6991 = c6991M12123;
                c4843 = null;
                c6990M12130 = AbstractC6876.m12130(c4793, interfaceC6481M95583);
            }
        } else {
            c6991 = c6991M12123;
            c4843 = null;
            c6990M12130 = null;
        }
        if (AbstractC6899.f18377.mo12181(i).booleanValue()) {
            z3 = false;
            c4793.m12322(c4843, new C4827(c48232, protoBuf$Property, c4793, false ? 1 : 0));
        } else {
            z3 = false;
        }
        InterfaceC4499 interfaceC44993 = c4824.f14060;
        ?? r6 = interfaceC44993 instanceof AbstractC6989 ? (AbstractC6989) interfaceC44993 : c4843;
        if ((r6 != 0 ? r6.mo9010() : c4843) == ClassKind.ANNOTATION_CLASS) {
            z4 = z2;
            c4793.m12322(c4843, new C4827(c48232, protoBuf$Property, c4793, z4 ? 1 : 0));
        } else {
            z4 = z2;
        }
        c4793.m12321(c6991, c6990M12130, new C7011(c48232.m9557(protoBuf$Property, z3)), new C7011(c48232.m9557(protoBuf$Property, z4)));
        return c4793;
    }
}

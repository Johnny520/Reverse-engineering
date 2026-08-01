package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.profileinstaller.C2444;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.km.C4522;
import kotlin.reflect.jvm.internal.impl.km.C4523;
import kotlin.reflect.jvm.internal.impl.km.C4524;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.reflect.jvm.internal.impl.km.C4527;
import kotlin.reflect.jvm.internal.impl.km.C4530;
import kotlin.reflect.jvm.internal.impl.km.C4531;
import kotlin.reflect.jvm.internal.impl.km.C4532;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.InterfaceC4528;
import kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4515;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4517;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import net.bytebuddy.utility.JavaConstant;
import p000.AbstractC6087;
import p015.C6230;
import p067.C6885;
import p067.C6886;
import p067.C6892;
import p070.AbstractC6898;
import p070.AbstractC6908;
import p070.AbstractC6909;
import p070.AbstractC6911;
import p070.C6903;
import p070.C6904;
import p070.C6905;
import p070.InterfaceC6907;
import p071.AbstractC6912;
import p085.C7051;
import p085.C7052;
import p085.C7053;
import p085.C7054;
import p085.C7057;
import p085.C7058;
import p086.C7062;
import p086.InterfaceC7059;
import p251.AbstractC8174;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4507 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4536 m9111(ProtoBuf$Package protoBuf$Package, InterfaceC6907 interfaceC6907, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        protoBuf$Package.getClass();
        interfaceC6907.getClass();
        emptyList.getClass();
        C4536 c4536 = new C4536();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6230 c6230 = new C6230(typeTable);
        C6905 c6905 = C6905.f18426;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C2444 c2444 = new C2444(interfaceC6907, c6230, AbstractC3055.m6644(versionRequirementTable), z2, emptyList, 16);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        m9119(c4536, functionList, propertyList, typeAliasList, c2444);
        Iterator it = ((List) c2444.f7126).iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            C7062 c7062 = C7052.f18950;
            c7062.getClass();
            C7052 c7052 = (C7052) AbstractC8189.m13664(c4536.f13224, c7062);
            for (ProtoBuf$Property protoBuf$Property : (List) protoBuf$Package.getExtension(AbstractC6912.f18441)) {
                ArrayList arrayList = c7052.f18951;
                protoBuf$Property.getClass();
                arrayList.add(m9118(protoBuf$Property, c2444));
            }
            C4724 c4724 = AbstractC6912.f18440;
            c4724.getClass();
            Integer num = (Integer) AbstractC6911.m12176(protoBuf$Package, c4724);
            if (num != null) {
                ((InterfaceC6907) c2444.f7124).getString(num.intValue());
            }
        }
        return c4536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4537 m9112(ProtoBuf$Function protoBuf$Function, C2444 c2444) {
        ArrayList arrayList;
        KmEffectType kmEffectType;
        C4537 c4537 = new C4537(protoBuf$Function.getFlags(), ((InterfaceC6907) c2444.f7124).getString(protoBuf$Function.getName()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C2444 c2444M4580 = c2444.m4580(typeParameterList);
        C6230 c6230 = (C6230) c2444M4580.f7123;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Function.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c4537.f13231.add(m9120(protoBuf$TypeParameter, c2444M4580));
        }
        ProtoBuf$Type protoBuf$TypeM12173 = AbstractC6908.m12173(protoBuf$Function, c6230);
        c4537.f13230 = protoBuf$TypeM12173 != null ? m9117(protoBuf$TypeM12173, c2444M4580) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c4537.f13235;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9121(protoBuf$ValueParameter, c2444M4580));
        }
        if (protoBuf$Function.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC6908.m12160(protoBuf$Function, c6230).iterator();
                while (it2.hasNext()) {
                    C4533 c4533M9117 = m9117((ProtoBuf$Type) it2.next(), c2444M4580);
                    C4525 c4525 = new C4525(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c4525.f13182 = c4533M9117;
                    arrayList.add(c4525);
                }
            }
        }
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        for (ProtoBuf$ValueParameter protoBuf$ValueParameter2 : valueParameterList) {
            protoBuf$ValueParameter2.getClass();
            c4537.f13228.add(m9121(protoBuf$ValueParameter2, c2444M4580));
        }
        c4537.f13234 = m9117(AbstractC6908.m12171(protoBuf$Function, c6230), c2444M4580);
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            contract.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (ProtoBuf$Effect protoBuf$Effect : contract.getEffectList()) {
                if (protoBuf$Effect.hasEffectType()) {
                    ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
                    if (effectType == null) {
                        C5919.m11249("Required value was null.");
                        return null;
                    }
                    int i = AbstractC4508.f13144[effectType.ordinal()];
                    if (i == 1) {
                        kmEffectType = KmEffectType.RETURNS_CONSTANT;
                    } else if (i == 2) {
                        kmEffectType = KmEffectType.CALLS;
                    } else {
                        if (i != 3) {
                            C4210.m8621();
                            return null;
                        }
                        kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                    }
                    if (protoBuf$Effect.hasKind()) {
                        ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
                        if (kind == null) {
                            C5919.m11249("Required value was null.");
                            return null;
                        }
                        int i2 = AbstractC4508.f13143[kind.ordinal()];
                        if (i2 != 1 && i2 != 2 && i2 != 3) {
                            C4210.m8621();
                            return null;
                        }
                        KmEffectInvocationKind kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                    }
                    C1562 c1562 = new C1562(kmEffectType);
                    List<ProtoBuf$Expression> effectConstructorArgumentList = protoBuf$Effect.getEffectConstructorArgumentList();
                    effectConstructorArgumentList.getClass();
                    for (ProtoBuf$Expression protoBuf$Expression : effectConstructorArgumentList) {
                        protoBuf$Expression.getClass();
                        c1562.f4599.add(m9113(protoBuf$Expression, c2444M4580));
                    }
                    if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
                        ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
                        conclusionOfConditionalEffect.getClass();
                        m9113(conclusionOfConditionalEffect, c2444M4580);
                    }
                    arrayList2.add(c1562);
                }
            }
        }
        List<Integer> versionRequirementList = protoBuf$Function.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c4537.f13237.add(m9115(num.intValue(), c2444M4580));
        }
        Iterator it3 = ((List) c2444M4580.f7126).iterator();
        while (it3.hasNext()) {
            ((C7053) ((InterfaceC7059) it3.next())).getClass();
            InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444M4580.f7124;
            C7054 c7054M13617 = AbstractC8174.m13617(c4537);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Function.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4537.f13238.add(AbstractC4509.m9123(protoBuf$Annotation, interfaceC6907));
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Function.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation2 : extensionReceiverAnnotationList) {
                protoBuf$Annotation2.getClass();
                c4537.f13229.add(AbstractC4509.m9123(protoBuf$Annotation2, interfaceC6907));
            }
            C4725 c4725 = C6892.f18352;
            C6885 c6885M12141 = C6892.m12141(protoBuf$Function, interfaceC6907, c6230);
            c7054M13617.f18953 = c6885M12141 != null ? new C4515(c6885M12141.f18339, c6885M12141.f18338) : null;
            C4724 c4724 = AbstractC6912.f18435;
            c4724.getClass();
            Integer num2 = (Integer) AbstractC6911.m12176(protoBuf$Function, c4724);
            if (num2 != null) {
                interfaceC6907.getString(num2.intValue());
            }
        }
        return c4537;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4527 m9113(ProtoBuf$Expression protoBuf$Expression, C2444 c2444) {
        C4527 c4527 = new C4527();
        c4527.f13190 = protoBuf$Expression.getFlags();
        if (protoBuf$Expression.hasValueParameterReference()) {
            protoBuf$Expression.getValueParameterReference();
        }
        ProtoBuf$Type protoBuf$TypeM11685 = null;
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            if (constantValue == null) {
                C5919.m11249("Required value was null.");
                return null;
            }
            int i = AbstractC4508.f13149[constantValue.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                C4210.m8621();
                return null;
            }
        }
        C6230 c6230 = (C6230) c2444.f7123;
        c6230.getClass();
        if (protoBuf$Expression.hasIsInstanceType()) {
            protoBuf$TypeM11685 = protoBuf$Expression.getIsInstanceType();
        } else if (protoBuf$Expression.hasIsInstanceTypeId()) {
            protoBuf$TypeM11685 = c6230.m11685(protoBuf$Expression.getIsInstanceTypeId());
        }
        if (protoBuf$TypeM11685 != null) {
            m9117(protoBuf$TypeM11685, c2444);
        }
        List<ProtoBuf$Expression> andArgumentList = protoBuf$Expression.getAndArgumentList();
        andArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression2 : andArgumentList) {
            protoBuf$Expression2.getClass();
            c4527.f13189.add(m9113(protoBuf$Expression2, c2444));
        }
        List<ProtoBuf$Expression> orArgumentList = protoBuf$Expression.getOrArgumentList();
        orArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression3 : orArgumentList) {
            protoBuf$Expression3.getClass();
            c4527.f13188.add(m9113(protoBuf$Expression3, c2444));
        }
        return c4527;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x027a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.km.C4548 m9114(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r16, p070.InterfaceC6907 r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4507.m9114(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, boolean, int):kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰哲苏世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1245 m9115(int i, C2444 c2444) {
        DeprecationLevel deprecationLevel;
        C6903 c6903;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        C1245 c1245 = new C1245(3);
        InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444.f7124;
        C6905 c6905 = (C6905) c2444.f7122;
        interfaceC6907.getClass();
        c6905.getClass();
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) AbstractC4343.m8831(i, c6905.f18427);
        C6904 c6904 = C6904.f18422;
        if (protoBuf$VersionRequirement == null) {
            c6903 = null;
        } else {
            Integer numValueOf = protoBuf$VersionRequirement.hasVersion() ? Integer.valueOf(protoBuf$VersionRequirement.getVersion()) : null;
            Integer numValueOf2 = protoBuf$VersionRequirement.hasVersionFull() ? Integer.valueOf(protoBuf$VersionRequirement.getVersionFull()) : null;
            C6904 c69042 = numValueOf2 != null ? new C6904(numValueOf2.intValue() & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 8) & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 16) & Opcodes.CONST_METHOD_TYPE) : numValueOf != null ? new C6904(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : c6904;
            ProtoBuf$VersionRequirement.Level level = protoBuf$VersionRequirement.getLevel();
            level.getClass();
            int i2 = AbstractC6909.f18429[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    C4210.m8621();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf3 = protoBuf$VersionRequirement.hasErrorCode() ? Integer.valueOf(protoBuf$VersionRequirement.getErrorCode()) : null;
            String string = protoBuf$VersionRequirement.hasMessage() ? interfaceC6907.getString(protoBuf$VersionRequirement.getMessage()) : null;
            ProtoBuf$VersionRequirement.VersionKind versionKind = protoBuf$VersionRequirement.getVersionKind();
            versionKind.getClass();
            c6903 = new C6903(c69042, versionKind, deprecationLevel2, numValueOf3, string);
        }
        if (c6903 == null && !c2444.f7125) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf$VersionRequirement.VersionKind versionKind2 = c6903 != null ? c6903.f18420 : null;
        int i3 = versionKind2 == null ? -1 : AbstractC4508.f13146[versionKind2.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i3 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i3 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i3 != 3) {
                C4210.m8621();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel deprecationLevel3 = c6903 != null ? c6903.f18419 : null;
        int i4 = deprecationLevel3 == null ? -1 : AbstractC4508.f13145[deprecationLevel3.ordinal()];
        if (i4 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i4 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i4 != 2) {
            if (i4 != 3) {
                C4210.m8621();
                return null;
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirementVersionKind.getClass();
        c1245.f3619 = kmVersionRequirementVersionKind;
        kmVersionRequirementLevel.getClass();
        c1245.f3620 = kmVersionRequirementLevel;
        c1245.f3617 = c6903 != null ? c6903.f18418 : null;
        c1245.f3616 = c6903 != null ? c6903.f18417 : null;
        if (c6903 != null) {
            c6904 = c6903.f18421;
        }
        c1245.f3618 = new C4522(c6904.f18425, c6904.f18424, c6904.f18423);
        return c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m9116(int i) {
        return AbstractC6898.m12147(AbstractC6898.f18387.mo12153(i).booleanValue(), (ProtoBuf$Visibility) AbstractC6898.f18386.mo12153(i), (ProtoBuf$Modality) AbstractC6898.f18385.mo12153(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4533 m9117(ProtoBuf$Type protoBuf$Type, C2444 c2444) {
        AbstractC6087 c4530;
        KmVariance kmVariance;
        C6230 c6230 = (C6230) c2444.f7123;
        InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444.f7124;
        C4533 c4533 = new C4533((protoBuf$Type.getNullable() ? 1 : 0) + (protoBuf$Type.getFlags() << 1));
        C4538 c4538 = null;
        if (protoBuf$Type.hasClassName()) {
            c4530 = new C4532(AbstractC4509.m9124(interfaceC6907, protoBuf$Type.getClassName()));
        } else if (protoBuf$Type.hasTypeAliasName()) {
            c4530 = new C4531(AbstractC4509.m9124(interfaceC6907, protoBuf$Type.getTypeAliasName()));
        } else if (protoBuf$Type.hasTypeParameter()) {
            c4530 = new C4530(protoBuf$Type.getTypeParameter());
        } else {
            if (!protoBuf$Type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numM4583 = c2444.m4583(protoBuf$Type.getTypeParameterName());
            if (numM4583 == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(interfaceC6907.getString(protoBuf$Type.getTypeParameterName())), null, 2, null);
            }
            c4530 = new C4530(numM4583.intValue());
        }
        c4533.f13203 = c4530;
        for (ProtoBuf$Type.Argument argument : protoBuf$Type.getArgumentList()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                C5919.m11249("Required value was null.");
                return null;
            }
            int i = AbstractC4508.f13147[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    C4210.m8621();
                    return null;
                }
                kmVariance = null;
            }
            ArrayList arrayList = c4533.f13202;
            if (kmVariance != null) {
                ProtoBuf$Type protoBuf$TypeM12163 = AbstractC6908.m12163(argument, c6230);
                if (protoBuf$TypeM12163 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                arrayList.add(new C4526(kmVariance, m9117(protoBuf$TypeM12163, c2444)));
            } else {
                arrayList.add(C4526.f13185);
            }
        }
        ProtoBuf$Type protoBuf$TypeM12162 = AbstractC6908.m12162(protoBuf$Type, c6230);
        c4533.f13201 = protoBuf$TypeM12162 != null ? m9117(protoBuf$TypeM12162, c2444) : null;
        ProtoBuf$Type protoBuf$TypeM12169 = AbstractC6908.m12169(protoBuf$Type, c6230);
        c4533.f13200 = protoBuf$TypeM12169 != null ? m9117(protoBuf$TypeM12169, c2444) : null;
        ProtoBuf$Type protoBuf$TypeM12157 = AbstractC6908.m12157(protoBuf$Type, c6230);
        if (protoBuf$TypeM12157 != null) {
            C4533 c4533M9117 = m9117(protoBuf$TypeM12157, c2444);
            String string = protoBuf$Type.hasFlexibleTypeCapabilitiesId() ? interfaceC6907.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId()) : null;
            C4538 c45382 = new C4538();
            c45382.f13240 = c4533M9117;
            c45382.f13239 = string;
            c4538 = c45382;
        }
        c4533.f13199 = c4538;
        Iterator it = ((List) c2444.f7126).iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            C7062 c7062 = C7058.f18962;
            c7062.getClass();
            C7058 c7058 = (C7058) AbstractC8189.m13664(c4533.f13205, c7062);
            Object extension = protoBuf$Type.getExtension(AbstractC6912.f18432);
            extension.getClass();
            c7058.f18964 = ((Boolean) extension).booleanValue();
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$Type.getAnnotationList()) {
                ArrayList arrayList2 = c7058.f18963;
                protoBuf$Annotation.getClass();
                arrayList2.add(AbstractC4509.m9123(protoBuf$Annotation, interfaceC6907));
            }
        }
        return c4533;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4535 m9118(ProtoBuf$Property protoBuf$Property, C2444 c2444) {
        ArrayList arrayList;
        protoBuf$Property.getClass();
        C4535 c4535 = new C4535(protoBuf$Property.getFlags(), ((InterfaceC6907) c2444.f7124).getString(protoBuf$Property.getName()), protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : m9116(protoBuf$Property.getFlags()), protoBuf$Property.hasSetterFlags() ? protoBuf$Property.getSetterFlags() : m9116(protoBuf$Property.getFlags()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C2444 c2444M4580 = c2444.m4580(typeParameterList);
        C6230 c6230 = (C6230) c2444M4580.f7123;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Property.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c4535.f13210.add(m9120(protoBuf$TypeParameter, c2444M4580));
        }
        ProtoBuf$Type protoBuf$TypeM12174 = AbstractC6908.m12174(protoBuf$Property, c6230);
        c4535.f13209 = protoBuf$TypeM12174 != null ? m9117(protoBuf$TypeM12174, c2444M4580) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c4535.f13218;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9121(protoBuf$ValueParameter, c2444M4580));
        }
        if (protoBuf$Property.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC6908.m12159(protoBuf$Property, c6230).iterator();
                while (it2.hasNext()) {
                    C4533 c4533M9117 = m9117((ProtoBuf$Type) it2.next(), c2444M4580);
                    C4525 c4525 = new C4525(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c4525.f13182 = c4533M9117;
                    arrayList.add(c4525);
                }
            }
        }
        if (protoBuf$Property.hasSetterValueParameter()) {
            ProtoBuf$ValueParameter setterValueParameter = protoBuf$Property.getSetterValueParameter();
            setterValueParameter.getClass();
            c4535.f13222 = m9121(setterValueParameter, c2444M4580);
        }
        c4535.f13223 = m9117(AbstractC6908.m12172(protoBuf$Property, c6230), c2444M4580);
        List<Integer> versionRequirementList = protoBuf$Property.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c4535.f13220.add(m9115(num.intValue(), c2444M4580));
        }
        Iterator it3 = ((List) c2444M4580.f7126).iterator();
        while (it3.hasNext()) {
            ((C7053) ((InterfaceC7059) it3.next())).getClass();
            InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444M4580.f7124;
            C7051 c7051M13610 = AbstractC8174.m13610(c4535);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4535.f13221.add(AbstractC4509.m9123(protoBuf$Annotation, interfaceC6907));
            }
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property.getGetterAnnotationList();
            getterAnnotationList.getClass();
            ArrayList arrayList2 = c4535.f13212.f13206;
            for (ProtoBuf$Annotation protoBuf$Annotation2 : getterAnnotationList) {
                protoBuf$Annotation2.getClass();
                arrayList2.add(AbstractC4509.m9123(protoBuf$Annotation2, interfaceC6907));
            }
            C4534 c4534 = c4535.f13211;
            if (c4534 != null) {
                List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property.getSetterAnnotationList();
                setterAnnotationList.getClass();
                ArrayList arrayList3 = c4534.f13206;
                for (ProtoBuf$Annotation protoBuf$Annotation3 : setterAnnotationList) {
                    protoBuf$Annotation3.getClass();
                    arrayList3.add(AbstractC4509.m9123(protoBuf$Annotation3, interfaceC6907));
                }
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Property.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation4 : extensionReceiverAnnotationList) {
                protoBuf$Annotation4.getClass();
                c4535.f13219.add(AbstractC4509.m9123(protoBuf$Annotation4, interfaceC6907));
            }
            List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
            backingFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation5 : backingFieldAnnotationList) {
                protoBuf$Annotation5.getClass();
                c4535.f13216.add(AbstractC4509.m9123(protoBuf$Annotation5, interfaceC6907));
            }
            List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
            delegateFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation6 : delegateFieldAnnotationList) {
                protoBuf$Annotation6.getClass();
                c4535.f13215.add(AbstractC4509.m9123(protoBuf$Annotation6, interfaceC6907));
            }
            C4725 c4725 = C6892.f18352;
            C6886 c6886M12142 = C6892.m12142(protoBuf$Property, interfaceC6907, c6230, true);
            C4724 c4724 = AbstractC6912.f18434;
            c4724.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6911.m12176(protoBuf$Property, c4724);
            JvmProtoBuf$JvmMethodSignature getter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasGetter()) ? null : jvmProtoBuf$JvmPropertySignature.getGetter();
            JvmProtoBuf$JvmMethodSignature setter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSetter()) ? null : jvmProtoBuf$JvmPropertySignature.getSetter();
            Object extension = protoBuf$Property.getExtension(AbstractC6912.f18433);
            extension.getClass();
            c7051M13610.f18949 = ((Number) extension).intValue();
            c7051M13610.f18948 = c6886M12142 != null ? new C4517(c6886M12142.f18341, c6886M12142.f18340) : null;
            c7051M13610.f18947 = getter != null ? new C4515(interfaceC6907.getString(getter.getName()), interfaceC6907.getString(getter.getDesc())) : null;
            c7051M13610.f18946 = setter != null ? new C4515(interfaceC6907.getString(setter.getName()), interfaceC6907.getString(setter.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature syntheticMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            c7051M13610.f18945 = syntheticMethod != null ? new C4515(interfaceC6907.getString(syntheticMethod.getName()), interfaceC6907.getString(syntheticMethod.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature delegateMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            c7051M13610.f18944 = delegateMethod != null ? new C4515(interfaceC6907.getString(delegateMethod.getName()), interfaceC6907.getString(delegateMethod.getDesc())) : null;
        }
        return c4535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m9119(InterfaceC4528 interfaceC4528, List list, List list2, List list3, C2444 c2444) {
        ArrayList arrayListMo9139 = interfaceC4528.mo9139();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListMo9139.add(m9112((ProtoBuf$Function) it.next(), c2444));
        }
        ArrayList arrayListMo9140 = interfaceC4528.mo9140();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListMo9140.add(m9118((ProtoBuf$Property) it2.next(), c2444));
        }
        ArrayList arrayListMo9138 = interfaceC4528.mo9138();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) it3.next();
            C4524 c4524 = new C4524(protoBuf$TypeAlias.getFlags(), ((InterfaceC6907) c2444.f7124).getString(protoBuf$TypeAlias.getName()));
            List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList.getClass();
            C2444 c2444M4580 = c2444.m4580(typeParameterList);
            C6230 c6230 = (C6230) c2444M4580.f7123;
            List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList2.getClass();
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
                protoBuf$TypeParameter.getClass();
                c4524.f13178.add(m9120(protoBuf$TypeParameter, c2444M4580));
            }
            m9117(AbstractC6908.m12168(protoBuf$TypeAlias, c6230), c2444M4580);
            m9117(AbstractC6908.m12158(protoBuf$TypeAlias, c6230), c2444M4580);
            List<ProtoBuf$Annotation> annotationList = protoBuf$TypeAlias.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4524.f13177.add(AbstractC4509.m9123(protoBuf$Annotation, (InterfaceC6907) c2444M4580.f7124));
            }
            List<Integer> versionRequirementList = protoBuf$TypeAlias.getVersionRequirementList();
            versionRequirementList.getClass();
            for (Integer num : versionRequirementList) {
                num.getClass();
                c4524.f13176.add(m9115(num.intValue(), c2444M4580));
            }
            Iterator it4 = ((List) c2444M4580.f7126).iterator();
            while (it4.hasNext()) {
                ((InterfaceC7059) it4.next()).getClass();
            }
            arrayListMo9138.add(c4524);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4523 m9120(ProtoBuf$TypeParameter protoBuf$TypeParameter, C2444 c2444) {
        KmVariance kmVariance;
        InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444.f7124;
        ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
        if (variance == null) {
            C5919.m11249("Required value was null.");
            return null;
        }
        int i = AbstractC4508.f13148[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                C4210.m8621();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        boolean reified = protoBuf$TypeParameter.getReified();
        C4523 c4523 = new C4523(reified ? 1 : 0, interfaceC6907.getString(protoBuf$TypeParameter.getName()), protoBuf$TypeParameter.getId(), kmVariance);
        Iterator it = AbstractC6908.m12165(protoBuf$TypeParameter, (C6230) c2444.f7123).iterator();
        while (it.hasNext()) {
            c4523.f13171.add(m9117((ProtoBuf$Type) it.next(), c2444));
        }
        Iterator it2 = ((List) c2444.f7126).iterator();
        while (it2.hasNext()) {
            ((C7053) ((InterfaceC7059) it2.next())).getClass();
            C7062 c7062 = C7057.f18960;
            c7062.getClass();
            C7057 c7057 = (C7057) AbstractC8189.m13664(c4523.f13170, c7062);
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$TypeParameter.getAnnotationList()) {
                ArrayList arrayList = c7057.f18961;
                protoBuf$Annotation.getClass();
                arrayList.add(AbstractC4509.m9123(protoBuf$Annotation, interfaceC6907));
            }
        }
        return c4523;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4525 m9121(ProtoBuf$ValueParameter protoBuf$ValueParameter, C2444 c2444) {
        int flags = protoBuf$ValueParameter.getFlags();
        int name = protoBuf$ValueParameter.getName();
        InterfaceC6907 interfaceC6907 = (InterfaceC6907) c2444.f7124;
        C4525 c4525 = new C4525(flags, interfaceC6907.getString(name));
        C6230 c6230 = (C6230) c2444.f7123;
        c4525.f13182 = m9117(AbstractC6908.m12167(protoBuf$ValueParameter, c6230), c2444);
        ProtoBuf$Type protoBuf$TypeM12166 = AbstractC6908.m12166(protoBuf$ValueParameter, c6230);
        c4525.f13181 = protoBuf$TypeM12166 != null ? m9117(protoBuf$TypeM12166, c2444) : null;
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            AbstractC4509.m9122(annotationParameterDefaultValue, interfaceC6907);
        }
        Iterator it = ((List) c2444.f7126).iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4525.f13180.add(AbstractC4509.m9123(protoBuf$Annotation, interfaceC6907));
            }
        }
        return c4525;
    }
}

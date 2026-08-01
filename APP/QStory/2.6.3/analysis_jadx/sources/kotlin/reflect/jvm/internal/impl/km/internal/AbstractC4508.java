package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.profileinstaller.C2444;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3066;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.km.C4523;
import kotlin.reflect.jvm.internal.impl.km.C4524;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.reflect.jvm.internal.impl.km.C4527;
import kotlin.reflect.jvm.internal.impl.km.C4528;
import kotlin.reflect.jvm.internal.impl.km.C4531;
import kotlin.reflect.jvm.internal.impl.km.C4532;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.C4535;
import kotlin.reflect.jvm.internal.impl.km.C4536;
import kotlin.reflect.jvm.internal.impl.km.C4537;
import kotlin.reflect.jvm.internal.impl.km.C4538;
import kotlin.reflect.jvm.internal.impl.km.C4539;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.InterfaceC4529;
import kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4516;
import kotlin.reflect.jvm.internal.impl.km.jvm.C4518;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import net.bytebuddy.utility.JavaConstant;
import p007.C6157;
import p034.AbstractC6344;
import p067.C6886;
import p067.C6887;
import p067.C6893;
import p070.AbstractC6899;
import p070.AbstractC6909;
import p070.AbstractC6910;
import p070.AbstractC6912;
import p070.C6904;
import p070.C6905;
import p070.C6906;
import p070.InterfaceC6908;
import p071.AbstractC6913;
import p085.C7052;
import p085.C7053;
import p085.C7054;
import p085.C7055;
import p085.C7058;
import p085.C7059;
import p086.C7063;
import p086.InterfaceC7060;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4508 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4537 m9101(ProtoBuf$Package protoBuf$Package, InterfaceC6908 interfaceC6908, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        protoBuf$Package.getClass();
        interfaceC6908.getClass();
        emptyList.getClass();
        C4537 c4537 = new C4537();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6157 c6157 = new C6157(typeTable);
        C6906 c6906 = C6906.f18421;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C2444 c2444 = new C2444(interfaceC6908, c6157, AbstractC6344.m11889(versionRequirementTable), z2, emptyList, 16);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        m9109(c4537, functionList, propertyList, typeAliasList, c2444);
        Iterator it = ((List) c2444.f7127).iterator();
        while (it.hasNext()) {
            ((C7054) ((InterfaceC7060) it.next())).getClass();
            C7063 c7063 = C7053.f18945;
            c7063.getClass();
            C7053 c7053 = (C7053) AbstractC3055.m6635(c4537.f13228, c7063);
            for (ProtoBuf$Property protoBuf$Property : (List) protoBuf$Package.getExtension(AbstractC6913.f18436)) {
                ArrayList arrayList = c7053.f18946;
                protoBuf$Property.getClass();
                arrayList.add(m9108(protoBuf$Property, c2444));
            }
            C4725 c4725 = AbstractC6913.f18435;
            c4725.getClass();
            Integer num = (Integer) AbstractC6912.m12204(protoBuf$Package, c4725);
            if (num != null) {
                ((InterfaceC6908) c2444.f7125).getString(num.intValue());
            }
        }
        return c4537;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4538 m9102(ProtoBuf$Function protoBuf$Function, C2444 c2444) {
        ArrayList arrayList;
        KmEffectType kmEffectType;
        C4538 c4538 = new C4538(protoBuf$Function.getFlags(), ((InterfaceC6908) c2444.f7125).getString(protoBuf$Function.getName()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C2444 c2444M4590 = c2444.m4590(typeParameterList);
        C6157 c6157 = (C6157) c2444M4590.f7124;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Function.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c4538.f13235.add(m9110(protoBuf$TypeParameter, c2444M4590));
        }
        ProtoBuf$Type protoBuf$TypeM12201 = AbstractC6909.m12201(protoBuf$Function, c6157);
        c4538.f13234 = protoBuf$TypeM12201 != null ? m9107(protoBuf$TypeM12201, c2444M4590) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c4538.f13239;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9111(protoBuf$ValueParameter, c2444M4590));
        }
        if (protoBuf$Function.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC6909.m12188(protoBuf$Function, c6157).iterator();
                while (it2.hasNext()) {
                    C4534 c4534M9107 = m9107((ProtoBuf$Type) it2.next(), c2444M4590);
                    C4526 c4526 = new C4526(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c4526.f13186 = c4534M9107;
                    arrayList.add(c4526);
                }
            }
        }
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        for (ProtoBuf$ValueParameter protoBuf$ValueParameter2 : valueParameterList) {
            protoBuf$ValueParameter2.getClass();
            c4538.f13232.add(m9111(protoBuf$ValueParameter2, c2444M4590));
        }
        c4538.f13238 = m9107(AbstractC6909.m12199(protoBuf$Function, c6157), c2444M4590);
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            contract.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (ProtoBuf$Effect protoBuf$Effect : contract.getEffectList()) {
                if (protoBuf$Effect.hasEffectType()) {
                    ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
                    if (effectType == null) {
                        C5925.m11310("Required value was null.");
                        return null;
                    }
                    int i = AbstractC4509.f13148[effectType.ordinal()];
                    if (i == 1) {
                        kmEffectType = KmEffectType.RETURNS_CONSTANT;
                    } else if (i == 2) {
                        kmEffectType = KmEffectType.CALLS;
                    } else {
                        if (i != 3) {
                            C4211.m8611();
                            return null;
                        }
                        kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                    }
                    if (protoBuf$Effect.hasKind()) {
                        ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
                        if (kind == null) {
                            C5925.m11310("Required value was null.");
                            return null;
                        }
                        int i2 = AbstractC4509.f13147[kind.ordinal()];
                        if (i2 != 1 && i2 != 2 && i2 != 3) {
                            C4211.m8611();
                            return null;
                        }
                        KmEffectInvocationKind kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                    }
                    C1562 c1562 = new C1562(kmEffectType);
                    List<ProtoBuf$Expression> effectConstructorArgumentList = protoBuf$Effect.getEffectConstructorArgumentList();
                    effectConstructorArgumentList.getClass();
                    for (ProtoBuf$Expression protoBuf$Expression : effectConstructorArgumentList) {
                        protoBuf$Expression.getClass();
                        c1562.f4600.add(m9103(protoBuf$Expression, c2444M4590));
                    }
                    if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
                        ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
                        conclusionOfConditionalEffect.getClass();
                        m9103(conclusionOfConditionalEffect, c2444M4590);
                    }
                    arrayList2.add(c1562);
                }
            }
        }
        List<Integer> versionRequirementList = protoBuf$Function.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c4538.f13241.add(m9105(num.intValue(), c2444M4590));
        }
        Iterator it3 = ((List) c2444M4590.f7127).iterator();
        while (it3.hasNext()) {
            ((C7054) ((InterfaceC7060) it3.next())).getClass();
            InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444M4590.f7125;
            C7055 c7055M6714 = AbstractC3056.m6714(c4538);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Function.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4538.f13242.add(AbstractC4510.m9113(protoBuf$Annotation, interfaceC6908));
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Function.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation2 : extensionReceiverAnnotationList) {
                protoBuf$Annotation2.getClass();
                c4538.f13233.add(AbstractC4510.m9113(protoBuf$Annotation2, interfaceC6908));
            }
            C4726 c4726 = C6893.f18347;
            C6886 c6886M12169 = C6893.m12169(protoBuf$Function, interfaceC6908, c6157);
            c7055M6714.f18948 = c6886M12169 != null ? new C4516(c6886M12169.f18334, c6886M12169.f18333) : null;
            C4725 c4725 = AbstractC6913.f18430;
            c4725.getClass();
            Integer num2 = (Integer) AbstractC6912.m12204(protoBuf$Function, c4725);
            if (num2 != null) {
                interfaceC6908.getString(num2.intValue());
            }
        }
        return c4538;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4528 m9103(ProtoBuf$Expression protoBuf$Expression, C2444 c2444) {
        C4528 c4528 = new C4528();
        c4528.f13194 = protoBuf$Expression.getFlags();
        if (protoBuf$Expression.hasValueParameterReference()) {
            protoBuf$Expression.getValueParameterReference();
        }
        ProtoBuf$Type protoBuf$TypeM11557 = null;
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            if (constantValue == null) {
                C5925.m11310("Required value was null.");
                return null;
            }
            int i = AbstractC4509.f13153[constantValue.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                C4211.m8611();
                return null;
            }
        }
        C6157 c6157 = (C6157) c2444.f7124;
        c6157.getClass();
        if (protoBuf$Expression.hasIsInstanceType()) {
            protoBuf$TypeM11557 = protoBuf$Expression.getIsInstanceType();
        } else if (protoBuf$Expression.hasIsInstanceTypeId()) {
            protoBuf$TypeM11557 = c6157.m11557(protoBuf$Expression.getIsInstanceTypeId());
        }
        if (protoBuf$TypeM11557 != null) {
            m9107(protoBuf$TypeM11557, c2444);
        }
        List<ProtoBuf$Expression> andArgumentList = protoBuf$Expression.getAndArgumentList();
        andArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression2 : andArgumentList) {
            protoBuf$Expression2.getClass();
            c4528.f13193.add(m9103(protoBuf$Expression2, c2444));
        }
        List<ProtoBuf$Expression> orArgumentList = protoBuf$Expression.getOrArgumentList();
        orArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression3 : orArgumentList) {
            protoBuf$Expression3.getClass();
            c4528.f13192.add(m9103(protoBuf$Expression3, c2444));
        }
        return c4528;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x027a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.km.C4549 m9104(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r16, p070.InterfaceC6908 r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4508.m9104(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, 飘花落叶言世楪哲兰子苏.飘花落叶言子楪苏世哲兰, boolean, int):kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪兰哲苏世");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1245 m9105(int i, C2444 c2444) {
        DeprecationLevel deprecationLevel;
        C6904 c6904;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        C1245 c1245 = new C1245(3);
        InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444.f7125;
        C6906 c6906 = (C6906) c2444.f7123;
        interfaceC6908.getClass();
        c6906.getClass();
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) AbstractC4344.m8818(i, c6906.f18422);
        C6905 c6905 = C6905.f18417;
        if (protoBuf$VersionRequirement == null) {
            c6904 = null;
        } else {
            Integer numValueOf = protoBuf$VersionRequirement.hasVersion() ? Integer.valueOf(protoBuf$VersionRequirement.getVersion()) : null;
            Integer numValueOf2 = protoBuf$VersionRequirement.hasVersionFull() ? Integer.valueOf(protoBuf$VersionRequirement.getVersionFull()) : null;
            C6905 c69052 = numValueOf2 != null ? new C6905(numValueOf2.intValue() & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 8) & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 16) & Opcodes.CONST_METHOD_TYPE) : numValueOf != null ? new C6905(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : c6905;
            ProtoBuf$VersionRequirement.Level level = protoBuf$VersionRequirement.getLevel();
            level.getClass();
            int i2 = AbstractC6910.f18424[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    C4211.m8611();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf3 = protoBuf$VersionRequirement.hasErrorCode() ? Integer.valueOf(protoBuf$VersionRequirement.getErrorCode()) : null;
            String string = protoBuf$VersionRequirement.hasMessage() ? interfaceC6908.getString(protoBuf$VersionRequirement.getMessage()) : null;
            ProtoBuf$VersionRequirement.VersionKind versionKind = protoBuf$VersionRequirement.getVersionKind();
            versionKind.getClass();
            c6904 = new C6904(c69052, versionKind, deprecationLevel2, numValueOf3, string);
        }
        if (c6904 == null && !c2444.f7126) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf$VersionRequirement.VersionKind versionKind2 = c6904 != null ? c6904.f18415 : null;
        int i3 = versionKind2 == null ? -1 : AbstractC4509.f13150[versionKind2.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i3 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i3 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i3 != 3) {
                C4211.m8611();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel deprecationLevel3 = c6904 != null ? c6904.f18414 : null;
        int i4 = deprecationLevel3 == null ? -1 : AbstractC4509.f13149[deprecationLevel3.ordinal()];
        if (i4 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i4 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i4 != 2) {
            if (i4 != 3) {
                C4211.m8611();
                return null;
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirementVersionKind.getClass();
        c1245.f3620 = kmVersionRequirementVersionKind;
        kmVersionRequirementLevel.getClass();
        c1245.f3621 = kmVersionRequirementLevel;
        c1245.f3618 = c6904 != null ? c6904.f18413 : null;
        c1245.f3617 = c6904 != null ? c6904.f18412 : null;
        if (c6904 != null) {
            c6905 = c6904.f18416;
        }
        c1245.f3619 = new C4523(c6905.f18420, c6905.f18419, c6905.f18418);
        return c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m9106(int i) {
        return AbstractC6899.m12175(AbstractC6899.f18382.mo12181(i).booleanValue(), (ProtoBuf$Visibility) AbstractC6899.f18381.mo12181(i), (ProtoBuf$Modality) AbstractC6899.f18380.mo12181(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4534 m9107(ProtoBuf$Type protoBuf$Type, C2444 c2444) {
        AbstractC3066 c4531;
        KmVariance kmVariance;
        C6157 c6157 = (C6157) c2444.f7124;
        InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444.f7125;
        C4534 c4534 = new C4534((protoBuf$Type.getNullable() ? 1 : 0) + (protoBuf$Type.getFlags() << 1));
        C4539 c4539 = null;
        if (protoBuf$Type.hasClassName()) {
            c4531 = new C4533(AbstractC4510.m9114(interfaceC6908, protoBuf$Type.getClassName()));
        } else if (protoBuf$Type.hasTypeAliasName()) {
            c4531 = new C4532(AbstractC4510.m9114(interfaceC6908, protoBuf$Type.getTypeAliasName()));
        } else if (protoBuf$Type.hasTypeParameter()) {
            c4531 = new C4531(protoBuf$Type.getTypeParameter());
        } else {
            if (!protoBuf$Type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numM4593 = c2444.m4593(protoBuf$Type.getTypeParameterName());
            if (numM4593 == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(interfaceC6908.getString(protoBuf$Type.getTypeParameterName())), null, 2, null);
            }
            c4531 = new C4531(numM4593.intValue());
        }
        c4534.f13207 = c4531;
        for (ProtoBuf$Type.Argument argument : protoBuf$Type.getArgumentList()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                C5925.m11310("Required value was null.");
                return null;
            }
            int i = AbstractC4509.f13151[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    C4211.m8611();
                    return null;
                }
                kmVariance = null;
            }
            ArrayList arrayList = c4534.f13206;
            if (kmVariance != null) {
                ProtoBuf$Type protoBuf$TypeM12191 = AbstractC6909.m12191(argument, c6157);
                if (protoBuf$TypeM12191 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                arrayList.add(new C4527(kmVariance, m9107(protoBuf$TypeM12191, c2444)));
            } else {
                arrayList.add(C4527.f13189);
            }
        }
        ProtoBuf$Type protoBuf$TypeM12190 = AbstractC6909.m12190(protoBuf$Type, c6157);
        c4534.f13205 = protoBuf$TypeM12190 != null ? m9107(protoBuf$TypeM12190, c2444) : null;
        ProtoBuf$Type protoBuf$TypeM12197 = AbstractC6909.m12197(protoBuf$Type, c6157);
        c4534.f13204 = protoBuf$TypeM12197 != null ? m9107(protoBuf$TypeM12197, c2444) : null;
        ProtoBuf$Type protoBuf$TypeM12185 = AbstractC6909.m12185(protoBuf$Type, c6157);
        if (protoBuf$TypeM12185 != null) {
            C4534 c4534M9107 = m9107(protoBuf$TypeM12185, c2444);
            String string = protoBuf$Type.hasFlexibleTypeCapabilitiesId() ? interfaceC6908.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId()) : null;
            C4539 c45392 = new C4539();
            c45392.f13244 = c4534M9107;
            c45392.f13243 = string;
            c4539 = c45392;
        }
        c4534.f13203 = c4539;
        Iterator it = ((List) c2444.f7127).iterator();
        while (it.hasNext()) {
            ((C7054) ((InterfaceC7060) it.next())).getClass();
            C7063 c7063 = C7059.f18957;
            c7063.getClass();
            C7059 c7059 = (C7059) AbstractC3055.m6635(c4534.f13209, c7063);
            Object extension = protoBuf$Type.getExtension(AbstractC6913.f18427);
            extension.getClass();
            c7059.f18959 = ((Boolean) extension).booleanValue();
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$Type.getAnnotationList()) {
                ArrayList arrayList2 = c7059.f18958;
                protoBuf$Annotation.getClass();
                arrayList2.add(AbstractC4510.m9113(protoBuf$Annotation, interfaceC6908));
            }
        }
        return c4534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4536 m9108(ProtoBuf$Property protoBuf$Property, C2444 c2444) {
        ArrayList arrayList;
        protoBuf$Property.getClass();
        C4536 c4536 = new C4536(protoBuf$Property.getFlags(), ((InterfaceC6908) c2444.f7125).getString(protoBuf$Property.getName()), protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : m9106(protoBuf$Property.getFlags()), protoBuf$Property.hasSetterFlags() ? protoBuf$Property.getSetterFlags() : m9106(protoBuf$Property.getFlags()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C2444 c2444M4590 = c2444.m4590(typeParameterList);
        C6157 c6157 = (C6157) c2444M4590.f7124;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Property.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c4536.f13214.add(m9110(protoBuf$TypeParameter, c2444M4590));
        }
        ProtoBuf$Type protoBuf$TypeM12202 = AbstractC6909.m12202(protoBuf$Property, c6157);
        c4536.f13213 = protoBuf$TypeM12202 != null ? m9107(protoBuf$TypeM12202, c2444M4590) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c4536.f13222;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9111(protoBuf$ValueParameter, c2444M4590));
        }
        if (protoBuf$Property.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC6909.m12187(protoBuf$Property, c6157).iterator();
                while (it2.hasNext()) {
                    C4534 c4534M9107 = m9107((ProtoBuf$Type) it2.next(), c2444M4590);
                    C4526 c4526 = new C4526(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c4526.f13186 = c4534M9107;
                    arrayList.add(c4526);
                }
            }
        }
        if (protoBuf$Property.hasSetterValueParameter()) {
            ProtoBuf$ValueParameter setterValueParameter = protoBuf$Property.getSetterValueParameter();
            setterValueParameter.getClass();
            c4536.f13226 = m9111(setterValueParameter, c2444M4590);
        }
        c4536.f13227 = m9107(AbstractC6909.m12200(protoBuf$Property, c6157), c2444M4590);
        List<Integer> versionRequirementList = protoBuf$Property.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c4536.f13224.add(m9105(num.intValue(), c2444M4590));
        }
        Iterator it3 = ((List) c2444M4590.f7127).iterator();
        while (it3.hasNext()) {
            ((C7054) ((InterfaceC7060) it3.next())).getClass();
            InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444M4590.f7125;
            C7052 c7052M6706 = AbstractC3056.m6706(c4536);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4536.f13225.add(AbstractC4510.m9113(protoBuf$Annotation, interfaceC6908));
            }
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property.getGetterAnnotationList();
            getterAnnotationList.getClass();
            ArrayList arrayList2 = c4536.f13216.f13210;
            for (ProtoBuf$Annotation protoBuf$Annotation2 : getterAnnotationList) {
                protoBuf$Annotation2.getClass();
                arrayList2.add(AbstractC4510.m9113(protoBuf$Annotation2, interfaceC6908));
            }
            C4535 c4535 = c4536.f13215;
            if (c4535 != null) {
                List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property.getSetterAnnotationList();
                setterAnnotationList.getClass();
                ArrayList arrayList3 = c4535.f13210;
                for (ProtoBuf$Annotation protoBuf$Annotation3 : setterAnnotationList) {
                    protoBuf$Annotation3.getClass();
                    arrayList3.add(AbstractC4510.m9113(protoBuf$Annotation3, interfaceC6908));
                }
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Property.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation4 : extensionReceiverAnnotationList) {
                protoBuf$Annotation4.getClass();
                c4536.f13223.add(AbstractC4510.m9113(protoBuf$Annotation4, interfaceC6908));
            }
            List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
            backingFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation5 : backingFieldAnnotationList) {
                protoBuf$Annotation5.getClass();
                c4536.f13220.add(AbstractC4510.m9113(protoBuf$Annotation5, interfaceC6908));
            }
            List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
            delegateFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation6 : delegateFieldAnnotationList) {
                protoBuf$Annotation6.getClass();
                c4536.f13219.add(AbstractC4510.m9113(protoBuf$Annotation6, interfaceC6908));
            }
            C4726 c4726 = C6893.f18347;
            C6887 c6887M12170 = C6893.m12170(protoBuf$Property, interfaceC6908, c6157, true);
            C4725 c4725 = AbstractC6913.f18429;
            c4725.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC6912.m12204(protoBuf$Property, c4725);
            JvmProtoBuf$JvmMethodSignature getter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasGetter()) ? null : jvmProtoBuf$JvmPropertySignature.getGetter();
            JvmProtoBuf$JvmMethodSignature setter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSetter()) ? null : jvmProtoBuf$JvmPropertySignature.getSetter();
            Object extension = protoBuf$Property.getExtension(AbstractC6913.f18428);
            extension.getClass();
            c7052M6706.f18944 = ((Number) extension).intValue();
            c7052M6706.f18943 = c6887M12170 != null ? new C4518(c6887M12170.f18336, c6887M12170.f18335) : null;
            c7052M6706.f18942 = getter != null ? new C4516(interfaceC6908.getString(getter.getName()), interfaceC6908.getString(getter.getDesc())) : null;
            c7052M6706.f18941 = setter != null ? new C4516(interfaceC6908.getString(setter.getName()), interfaceC6908.getString(setter.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature syntheticMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            c7052M6706.f18940 = syntheticMethod != null ? new C4516(interfaceC6908.getString(syntheticMethod.getName()), interfaceC6908.getString(syntheticMethod.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature delegateMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            c7052M6706.f18939 = delegateMethod != null ? new C4516(interfaceC6908.getString(delegateMethod.getName()), interfaceC6908.getString(delegateMethod.getDesc())) : null;
        }
        return c4536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m9109(InterfaceC4529 interfaceC4529, List list, List list2, List list3, C2444 c2444) {
        ArrayList arrayListMo9129 = interfaceC4529.mo9129();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListMo9129.add(m9102((ProtoBuf$Function) it.next(), c2444));
        }
        ArrayList arrayListMo9130 = interfaceC4529.mo9130();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListMo9130.add(m9108((ProtoBuf$Property) it2.next(), c2444));
        }
        ArrayList arrayListMo9128 = interfaceC4529.mo9128();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) it3.next();
            C4525 c4525 = new C4525(protoBuf$TypeAlias.getFlags(), ((InterfaceC6908) c2444.f7125).getString(protoBuf$TypeAlias.getName()));
            List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList.getClass();
            C2444 c2444M4590 = c2444.m4590(typeParameterList);
            C6157 c6157 = (C6157) c2444M4590.f7124;
            List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList2.getClass();
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
                protoBuf$TypeParameter.getClass();
                c4525.f13182.add(m9110(protoBuf$TypeParameter, c2444M4590));
            }
            m9107(AbstractC6909.m12196(protoBuf$TypeAlias, c6157), c2444M4590);
            m9107(AbstractC6909.m12186(protoBuf$TypeAlias, c6157), c2444M4590);
            List<ProtoBuf$Annotation> annotationList = protoBuf$TypeAlias.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4525.f13181.add(AbstractC4510.m9113(protoBuf$Annotation, (InterfaceC6908) c2444M4590.f7125));
            }
            List<Integer> versionRequirementList = protoBuf$TypeAlias.getVersionRequirementList();
            versionRequirementList.getClass();
            for (Integer num : versionRequirementList) {
                num.getClass();
                c4525.f13180.add(m9105(num.intValue(), c2444M4590));
            }
            Iterator it4 = ((List) c2444M4590.f7127).iterator();
            while (it4.hasNext()) {
                ((InterfaceC7060) it4.next()).getClass();
            }
            arrayListMo9128.add(c4525);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4524 m9110(ProtoBuf$TypeParameter protoBuf$TypeParameter, C2444 c2444) {
        KmVariance kmVariance;
        InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444.f7125;
        ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
        if (variance == null) {
            C5925.m11310("Required value was null.");
            return null;
        }
        int i = AbstractC4509.f13152[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                C4211.m8611();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        boolean reified = protoBuf$TypeParameter.getReified();
        C4524 c4524 = new C4524(reified ? 1 : 0, interfaceC6908.getString(protoBuf$TypeParameter.getName()), protoBuf$TypeParameter.getId(), kmVariance);
        Iterator it = AbstractC6909.m12193(protoBuf$TypeParameter, (C6157) c2444.f7124).iterator();
        while (it.hasNext()) {
            c4524.f13175.add(m9107((ProtoBuf$Type) it.next(), c2444));
        }
        Iterator it2 = ((List) c2444.f7127).iterator();
        while (it2.hasNext()) {
            ((C7054) ((InterfaceC7060) it2.next())).getClass();
            C7063 c7063 = C7058.f18955;
            c7063.getClass();
            C7058 c7058 = (C7058) AbstractC3055.m6635(c4524.f13174, c7063);
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$TypeParameter.getAnnotationList()) {
                ArrayList arrayList = c7058.f18956;
                protoBuf$Annotation.getClass();
                arrayList.add(AbstractC4510.m9113(protoBuf$Annotation, interfaceC6908));
            }
        }
        return c4524;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4526 m9111(ProtoBuf$ValueParameter protoBuf$ValueParameter, C2444 c2444) {
        int flags = protoBuf$ValueParameter.getFlags();
        int name = protoBuf$ValueParameter.getName();
        InterfaceC6908 interfaceC6908 = (InterfaceC6908) c2444.f7125;
        C4526 c4526 = new C4526(flags, interfaceC6908.getString(name));
        C6157 c6157 = (C6157) c2444.f7124;
        c4526.f13186 = m9107(AbstractC6909.m12195(protoBuf$ValueParameter, c6157), c2444);
        ProtoBuf$Type protoBuf$TypeM12194 = AbstractC6909.m12194(protoBuf$ValueParameter, c6157);
        c4526.f13185 = protoBuf$TypeM12194 != null ? m9107(protoBuf$TypeM12194, c2444) : null;
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            AbstractC4510.m9112(annotationParameterDefaultValue, interfaceC6908);
        }
        Iterator it = ((List) c2444.f7127).iterator();
        while (it.hasNext()) {
            ((C7054) ((InterfaceC7060) it.next())).getClass();
            List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c4526.f13184.add(AbstractC4510.m9113(protoBuf$Annotation, interfaceC6908));
            }
        }
        return c4526;
    }
}

package kotlin.reflect.jvm.internal.impl.p009km.internal;

import androidx.compose.p001ui.graphics.vector.C2397;
import androidx.compose.runtime.internal.C2080;
import androidx.profileinstaller.C3277;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3898;
import io.ktor.util.C5043;
import io.ktor.websocket.C5102;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
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
import kotlin.reflect.jvm.internal.impl.p009km.C5355;
import kotlin.reflect.jvm.internal.impl.p009km.C5356;
import kotlin.reflect.jvm.internal.impl.p009km.C5357;
import kotlin.reflect.jvm.internal.impl.p009km.C5358;
import kotlin.reflect.jvm.internal.impl.p009km.C5359;
import kotlin.reflect.jvm.internal.impl.p009km.C5360;
import kotlin.reflect.jvm.internal.impl.p009km.C5362;
import kotlin.reflect.jvm.internal.impl.p009km.C5363;
import kotlin.reflect.jvm.internal.impl.p009km.C5364;
import kotlin.reflect.jvm.internal.impl.p009km.C5365;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.C5367;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;
import kotlin.reflect.jvm.internal.impl.p009km.C5369;
import kotlin.reflect.jvm.internal.impl.p009km.C5370;
import kotlin.reflect.jvm.internal.impl.p009km.C5371;
import kotlin.reflect.jvm.internal.impl.p009km.C5381;
import kotlin.reflect.jvm.internal.impl.p009km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.p009km.InterfaceC5361;
import kotlin.reflect.jvm.internal.impl.p009km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.p009km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.p009km.KmVariance;
import kotlin.reflect.jvm.internal.impl.p009km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.p009km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5348;
import kotlin.reflect.jvm.internal.impl.p009km.jvm.C5350;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import net.bytebuddy.utility.JavaConstant;
import p023.C6986;
import p050.AbstractC7173;
import p083.C7715;
import p083.C7716;
import p083.C7722;
import p086.AbstractC7728;
import p086.AbstractC7738;
import p086.AbstractC7739;
import p086.AbstractC7741;
import p086.C7733;
import p086.C7734;
import p086.C7735;
import p086.InterfaceC7737;
import p087.AbstractC7742;
import p101.C7881;
import p101.C7882;
import p101.C7883;
import p101.C7884;
import p101.C7885;
import p101.C7886;
import p101.C7887;
import p101.C7888;
import p102.C7892;
import p102.InterfaceC7889;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5340 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5369 m9660(ProtoBuf$Package protoBuf$Package, InterfaceC7737 interfaceC7737, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        EmptyList emptyList = EmptyList.INSTANCE;
        protoBuf$Package.getClass();
        interfaceC7737.getClass();
        emptyList.getClass();
        C5369 c5369 = new C5369();
        ProtoBuf$TypeTable typeTable = protoBuf$Package.getTypeTable();
        typeTable.getClass();
        C6986 c6986 = new C6986(typeTable);
        C7735 c7735 = C7735.f18766;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Package.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C3277 c3277 = new C3277(interfaceC7737, c6986, AbstractC7173.m12448(versionRequirementTable), z2, emptyList, 16);
        List<ProtoBuf$Function> functionList = protoBuf$Package.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Package.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Package.getTypeAliasList();
        typeAliasList.getClass();
        m9668(c5369, functionList, propertyList, typeAliasList, c3277);
        Iterator it = ((List) c3277.f7472).iterator();
        while (it.hasNext()) {
            ((C7883) ((InterfaceC7889) it.next())).getClass();
            C7892 c7892 = C7882.f19290;
            c7892.getClass();
            C7882 c7882 = (C7882) AbstractC3887.m7195(c5369.f13573, c7892);
            for (ProtoBuf$Property protoBuf$Property : (List) protoBuf$Package.getExtension(AbstractC7742.f18781)) {
                ArrayList arrayList = c7882.f19291;
                protoBuf$Property.getClass();
                arrayList.add(m9667(protoBuf$Property, c3277));
            }
            C5557 c5557 = AbstractC7742.f18780;
            c5557.getClass();
            Integer num = (Integer) AbstractC7741.m12763(protoBuf$Package, c5557);
            if (num != null) {
                ((InterfaceC7737) c3277.f7470).getString(num.intValue());
            }
        }
        return c5369;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5370 m9661(ProtoBuf$Function protoBuf$Function, C3277 c3277) {
        ArrayList arrayList;
        KmEffectType kmEffectType;
        C5370 c5370 = new C5370(protoBuf$Function.getFlags(), ((InterfaceC7737) c3277.f7470).getString(protoBuf$Function.getName()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Function.getTypeParameterList();
        typeParameterList.getClass();
        C3277 c3277M5150 = c3277.m5150(typeParameterList);
        C6986 c6986 = (C6986) c3277M5150.f7469;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Function.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c5370.f13580.add(m9669(protoBuf$TypeParameter, c3277M5150));
        }
        ProtoBuf$Type protoBuf$TypeM12760 = AbstractC7738.m12760(protoBuf$Function, c6986);
        c5370.f13579 = protoBuf$TypeM12760 != null ? m9666(protoBuf$TypeM12760, c3277M5150) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Function.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c5370.f13584;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9670(protoBuf$ValueParameter, c3277M5150));
        }
        if (protoBuf$Function.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Function.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC7738.m12747(protoBuf$Function, c6986).iterator();
                while (it2.hasNext()) {
                    C5366 c5366M9666 = m9666((ProtoBuf$Type) it2.next(), c3277M5150);
                    C5358 c5358 = new C5358(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c5358.f13531 = c5366M9666;
                    arrayList.add(c5358);
                }
            }
        }
        List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Function.getValueParameterList();
        valueParameterList.getClass();
        for (ProtoBuf$ValueParameter protoBuf$ValueParameter2 : valueParameterList) {
            protoBuf$ValueParameter2.getClass();
            c5370.f13577.add(m9670(protoBuf$ValueParameter2, c3277M5150));
        }
        c5370.f13583 = m9666(AbstractC7738.m12758(protoBuf$Function, c6986), c3277M5150);
        if (protoBuf$Function.hasContract()) {
            ProtoBuf$Contract contract = protoBuf$Function.getContract();
            contract.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            for (ProtoBuf$Effect protoBuf$Effect : contract.getEffectList()) {
                if (protoBuf$Effect.hasEffectType()) {
                    ProtoBuf$Effect.EffectType effectType = protoBuf$Effect.getEffectType();
                    if (effectType == null) {
                        C6755.m11869("Required value was null.");
                        return null;
                    }
                    int i = AbstractC5341.f13493[effectType.ordinal()];
                    if (i == 1) {
                        kmEffectType = KmEffectType.RETURNS_CONSTANT;
                    } else if (i == 2) {
                        kmEffectType = KmEffectType.CALLS;
                    } else {
                        if (i != 3) {
                            C5043.m9170();
                            return null;
                        }
                        kmEffectType = KmEffectType.RETURNS_NOT_NULL;
                    }
                    if (protoBuf$Effect.hasKind()) {
                        ProtoBuf$Effect.InvocationKind kind = protoBuf$Effect.getKind();
                        if (kind == null) {
                            C6755.m11869("Required value was null.");
                            return null;
                        }
                        int i2 = AbstractC5341.f13492[kind.ordinal()];
                        if (i2 != 1 && i2 != 2 && i2 != 3) {
                            C5043.m9170();
                            return null;
                        }
                        KmEffectInvocationKind kmEffectInvocationKind = KmEffectInvocationKind.AT_MOST_ONCE;
                    }
                    C2397 c2397 = new C2397(kmEffectType);
                    List<ProtoBuf$Expression> effectConstructorArgumentList = protoBuf$Effect.getEffectConstructorArgumentList();
                    effectConstructorArgumentList.getClass();
                    for (ProtoBuf$Expression protoBuf$Expression : effectConstructorArgumentList) {
                        protoBuf$Expression.getClass();
                        c2397.f4945.add(m9662(protoBuf$Expression, c3277M5150));
                    }
                    if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
                        ProtoBuf$Expression conclusionOfConditionalEffect = protoBuf$Effect.getConclusionOfConditionalEffect();
                        conclusionOfConditionalEffect.getClass();
                        m9662(conclusionOfConditionalEffect, c3277M5150);
                    }
                    arrayList2.add(c2397);
                }
            }
        }
        List<Integer> versionRequirementList = protoBuf$Function.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c5370.f13586.add(m9664(num.intValue(), c3277M5150));
        }
        Iterator it3 = ((List) c3277M5150.f7472).iterator();
        while (it3.hasNext()) {
            ((C7883) ((InterfaceC7889) it3.next())).getClass();
            InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277M5150.f7470;
            C7884 c7884M7274 = AbstractC3888.m7274(c5370);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Function.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c5370.f13587.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC7737));
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Function.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation2 : extensionReceiverAnnotationList) {
                protoBuf$Annotation2.getClass();
                c5370.f13578.add(AbstractC5342.m9672(protoBuf$Annotation2, interfaceC7737));
            }
            C5558 c5558 = C7722.f18692;
            C7715 c7715M12728 = C7722.m12728(protoBuf$Function, interfaceC7737, c6986);
            c7884M7274.f19293 = c7715M12728 != null ? new C5348(c7715M12728.f18679, c7715M12728.f18678) : null;
            C5557 c5557 = AbstractC7742.f18775;
            c5557.getClass();
            Integer num2 = (Integer) AbstractC7741.m12763(protoBuf$Function, c5557);
            if (num2 != null) {
                interfaceC7737.getString(num2.intValue());
            }
        }
        return c5370;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5360 m9662(ProtoBuf$Expression protoBuf$Expression, C3277 c3277) {
        C5360 c5360 = new C5360();
        c5360.f13539 = protoBuf$Expression.getFlags();
        if (protoBuf$Expression.hasValueParameterReference()) {
            protoBuf$Expression.getValueParameterReference();
        }
        ProtoBuf$Type protoBuf$TypeM12116 = null;
        if (protoBuf$Expression.hasConstantValue()) {
            ProtoBuf$Expression.ConstantValue constantValue = protoBuf$Expression.getConstantValue();
            if (constantValue == null) {
                C6755.m11869("Required value was null.");
                return null;
            }
            int i = AbstractC5341.f13498[constantValue.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                C5043.m9170();
                return null;
            }
        }
        C6986 c6986 = (C6986) c3277.f7469;
        c6986.getClass();
        if (protoBuf$Expression.hasIsInstanceType()) {
            protoBuf$TypeM12116 = protoBuf$Expression.getIsInstanceType();
        } else if (protoBuf$Expression.hasIsInstanceTypeId()) {
            protoBuf$TypeM12116 = c6986.m12116(protoBuf$Expression.getIsInstanceTypeId());
        }
        if (protoBuf$TypeM12116 != null) {
            m9666(protoBuf$TypeM12116, c3277);
        }
        List<ProtoBuf$Expression> andArgumentList = protoBuf$Expression.getAndArgumentList();
        andArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression2 : andArgumentList) {
            protoBuf$Expression2.getClass();
            c5360.f13538.add(m9662(protoBuf$Expression2, c3277));
        }
        List<ProtoBuf$Expression> orArgumentList = protoBuf$Expression.getOrArgumentList();
        orArgumentList.getClass();
        for (ProtoBuf$Expression protoBuf$Expression3 : orArgumentList) {
            protoBuf$Expression3.getClass();
            c5360.f13537.add(m9662(protoBuf$Expression3, c3277));
        }
        return c5360;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x027a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C5381 m9663(ProtoBuf$Class protoBuf$Class, InterfaceC7737 interfaceC7737, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        EmptyList emptyList = EmptyList.INSTANCE;
        protoBuf$Class.getClass();
        interfaceC7737.getClass();
        emptyList.getClass();
        C5381 c5381 = new C5381();
        ProtoBuf$TypeTable typeTable = protoBuf$Class.getTypeTable();
        typeTable.getClass();
        C6986 c6986 = new C6986(typeTable);
        C7735 c7735 = C7735.f18766;
        ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$Class.getVersionRequirementTable();
        versionRequirementTable.getClass();
        C3277 c3277 = new C3277(interfaceC7737, c6986, AbstractC7173.m12448(versionRequirementTable), z2, emptyList, 16);
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Class.getTypeParameterList();
        typeParameterList.getClass();
        C3277 c3277M5150 = c3277.m5150(typeParameterList);
        List list = (List) c3277M5150.f7472;
        C6986 c69862 = (C6986) c3277M5150.f7469;
        c5381.f13634 = protoBuf$Class.getFlags();
        int fqName = protoBuf$Class.getFqName();
        InterfaceC7737 interfaceC77372 = (InterfaceC7737) c3277M5150.f7470;
        c5381.f13633 = AbstractC5342.m9673(interfaceC77372, fqName);
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Class.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c5381.f13632.add(m9669(protoBuf$TypeParameter, c3277M5150));
        }
        Iterator it = AbstractC7738.m12751(protoBuf$Class, c69862).iterator();
        while (it.hasNext()) {
            c5381.f13631.add(m9666((ProtoBuf$Type) it.next(), c3277M5150));
        }
        List<ProtoBuf$Constructor> constructorList = protoBuf$Class.getConstructorList();
        constructorList.getClass();
        Iterator<T> it2 = constructorList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            ProtoBuf$Constructor protoBuf$Constructor = (ProtoBuf$Constructor) it2.next();
            protoBuf$Constructor.getClass();
            C5362 c5362 = new C5362(protoBuf$Constructor.getFlags());
            List<ProtoBuf$ValueParameter> valueParameterList = protoBuf$Constructor.getValueParameterList();
            valueParameterList.getClass();
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : valueParameterList) {
                protoBuf$ValueParameter.getClass();
                c5362.f13543.add(m9670(protoBuf$ValueParameter, c3277M5150));
            }
            List<Integer> versionRequirementList = protoBuf$Constructor.getVersionRequirementList();
            versionRequirementList.getClass();
            for (Integer num : versionRequirementList) {
                num.getClass();
                c5362.f13542.add(m9664(num.intValue(), c3277M5150));
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((C7883) ((InterfaceC7889) it3.next())).getClass();
                C7885 c7885M7273 = AbstractC3888.m7273(c5362);
                List<ProtoBuf$Annotation> annotationList = protoBuf$Constructor.getAnnotationList();
                annotationList.getClass();
                for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                    protoBuf$Annotation.getClass();
                    c5362.f13541.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC77372));
                }
                C5558 c5558 = C7722.f18692;
                C7715 c7715M12730 = C7722.m12730(protoBuf$Constructor, interfaceC77372, c69862);
                c7885M7273.f19295 = c7715M12730 != null ? new C5348(c7715M12730.f18679, c7715M12730.f18678) : null;
            }
            c5381.f13641.add(c5362);
        }
        List<ProtoBuf$Function> functionList = protoBuf$Class.getFunctionList();
        functionList.getClass();
        List<ProtoBuf$Property> propertyList = protoBuf$Class.getPropertyList();
        propertyList.getClass();
        List<ProtoBuf$TypeAlias> typeAliasList = protoBuf$Class.getTypeAliasList();
        typeAliasList.getClass();
        m9668(c5381, functionList, propertyList, typeAliasList, c3277M5150);
        if (protoBuf$Class.hasCompanionObjectName()) {
            interfaceC77372.getString(protoBuf$Class.getCompanionObjectName());
        }
        List<Integer> nestedClassNameList = protoBuf$Class.getNestedClassNameList();
        nestedClassNameList.getClass();
        for (Integer num2 : nestedClassNameList) {
            num2.getClass();
            c5381.f13645.add(interfaceC77372.getString(num2.intValue()));
        }
        for (ProtoBuf$EnumEntry protoBuf$EnumEntry : protoBuf$Class.getEnumEntryList()) {
            if (!protoBuf$EnumEntry.hasName()) {
                throw new InconsistentKotlinMetadataException("No name for EnumEntry", null, 2, null);
            }
            c5381.f13646.add(interfaceC77372.getString(protoBuf$EnumEntry.getName()));
            C5102 c5102 = new C5102(interfaceC77372.getString(protoBuf$EnumEntry.getName()));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                ((C7883) ((InterfaceC7889) it4.next())).getClass();
                for (ProtoBuf$Annotation protoBuf$Annotation2 : protoBuf$EnumEntry.getAnnotationList()) {
                    protoBuf$Annotation2.getClass();
                    c5102.f13161.add(AbstractC5342.m9672(protoBuf$Annotation2, interfaceC77372));
                }
            }
            c5381.f13643.add(c5102);
        }
        List<Integer> sealedSubclassFqNameList = protoBuf$Class.getSealedSubclassFqNameList();
        sealedSubclassFqNameList.getClass();
        for (Integer num3 : sealedSubclassFqNameList) {
            num3.getClass();
            c5381.f13644.add(AbstractC5342.m9673(interfaceC77372, num3.intValue()));
        }
        if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
            c5381.f13636 = interfaceC77372.getString(protoBuf$Class.getInlineClassUnderlyingPropertyName());
        }
        ProtoBuf$Type protoBuf$TypeM12757 = AbstractC7738.m12757(protoBuf$Class, c69862);
        if (protoBuf$TypeM12757 == null) {
            if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
                List<ProtoBuf$Property> propertyList2 = protoBuf$Class.getPropertyList();
                propertyList2.getClass();
                Iterator<T> it5 = propertyList2.iterator();
                Object obj = null;
                boolean z3 = false;
                while (true) {
                    if (it5.hasNext()) {
                        Object next = it5.next();
                        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) next;
                        protoBuf$Property.getClass();
                        if (AbstractC7738.m12761(protoBuf$Property, c69862) == null && interfaceC77372.getString(protoBuf$Property.getName()).equals(interfaceC77372.getString(protoBuf$Class.getInlineClassUnderlyingPropertyName()))) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            obj = next;
                        }
                    } else if (!z3) {
                        break;
                    }
                }
                obj = null;
                ProtoBuf$Property protoBuf$Property2 = (ProtoBuf$Property) obj;
                if (protoBuf$Property2 != null) {
                    protoBuf$TypeM12757 = AbstractC7738.m12759(protoBuf$Property2, c69862);
                }
            } else {
                protoBuf$TypeM12757 = null;
            }
        }
        c5381.f13635 = protoBuf$TypeM12757 != null ? m9666(protoBuf$TypeM12757, c3277M5150) : null;
        Iterator it6 = AbstractC7738.m12748(protoBuf$Class, c69862).iterator();
        while (it6.hasNext()) {
            c5381.f13640.add(m9666((ProtoBuf$Type) it6.next(), c3277M5150));
        }
        List<Integer> versionRequirementList2 = protoBuf$Class.getVersionRequirementList();
        versionRequirementList2.getClass();
        for (Integer num4 : versionRequirementList2) {
            num4.getClass();
            c5381.f13637.add(m9664(num4.intValue(), c3277M5150));
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            ((C7883) ((InterfaceC7889) it7.next())).getClass();
            C7886 c7886M7276 = AbstractC3888.m7276(c5381);
            List<ProtoBuf$Annotation> annotationList2 = protoBuf$Class.getAnnotationList();
            annotationList2.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation3 : annotationList2) {
                protoBuf$Annotation3.getClass();
                c5381.f13639.add(AbstractC5342.m9672(protoBuf$Annotation3, interfaceC77372));
            }
            C5557 c5557 = AbstractC7742.f18782;
            c5557.getClass();
            Integer num5 = (Integer) AbstractC7741.m12763(protoBuf$Class, c5557);
            if (num5 != null) {
                interfaceC77372.getString(num5.intValue());
            }
            for (ProtoBuf$Property protoBuf$Property3 : (List) protoBuf$Class.getExtension(AbstractC7742.f18778)) {
                ArrayList arrayList = c7886M7276.f19299;
                protoBuf$Property3.getClass();
                arrayList.add(m9667(protoBuf$Property3, c3277M5150));
            }
            C5557 c55572 = AbstractC7742.f18779;
            c55572.getClass();
            Integer num6 = (Integer) AbstractC7741.m12763(protoBuf$Class, c55572);
            c7886M7276.f19298 = num6 != null ? interfaceC77372.getString(num6.intValue()) : "main";
            C5557 c55573 = AbstractC7742.f18783;
            c55573.getClass();
            Integer num7 = (Integer) AbstractC7741.m12763(protoBuf$Class, c55573);
            if (num7 != null) {
                c7886M7276.f19297 = num7.intValue();
            }
        }
        return c5381;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2080 m9664(int i, C3277 c3277) {
        DeprecationLevel deprecationLevel;
        C7733 c7733;
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        C2080 c2080 = new C2080(3);
        InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277.f7470;
        C7735 c7735 = (C7735) c3277.f7468;
        interfaceC7737.getClass();
        c7735.getClass();
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) AbstractC5176.m9377(i, c7735.f18767);
        C7734 c7734 = C7734.f18762;
        if (protoBuf$VersionRequirement == null) {
            c7733 = null;
        } else {
            Integer numValueOf = protoBuf$VersionRequirement.hasVersion() ? Integer.valueOf(protoBuf$VersionRequirement.getVersion()) : null;
            Integer numValueOf2 = protoBuf$VersionRequirement.hasVersionFull() ? Integer.valueOf(protoBuf$VersionRequirement.getVersionFull()) : null;
            C7734 c77342 = numValueOf2 != null ? new C7734(numValueOf2.intValue() & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 8) & Opcodes.CONST_METHOD_TYPE, (numValueOf2.intValue() >> 16) & Opcodes.CONST_METHOD_TYPE) : numValueOf != null ? new C7734(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : c7734;
            ProtoBuf$VersionRequirement.Level level = protoBuf$VersionRequirement.getLevel();
            level.getClass();
            int i2 = AbstractC7739.f18769[level.ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    C5043.m9170();
                    return null;
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            DeprecationLevel deprecationLevel2 = deprecationLevel;
            Integer numValueOf3 = protoBuf$VersionRequirement.hasErrorCode() ? Integer.valueOf(protoBuf$VersionRequirement.getErrorCode()) : null;
            String string = protoBuf$VersionRequirement.hasMessage() ? interfaceC7737.getString(protoBuf$VersionRequirement.getMessage()) : null;
            ProtoBuf$VersionRequirement.VersionKind versionKind = protoBuf$VersionRequirement.getVersionKind();
            versionKind.getClass();
            c7733 = new C7733(c77342, versionKind, deprecationLevel2, numValueOf3, string);
        }
        if (c7733 == null && !c3277.f7471) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf$VersionRequirement.VersionKind versionKind2 = c7733 != null ? c7733.f18760 : null;
        int i3 = versionKind2 == null ? -1 : AbstractC5341.f13495[versionKind2.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i3 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i3 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i3 != 3) {
                C5043.m9170();
                return null;
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        DeprecationLevel deprecationLevel3 = c7733 != null ? c7733.f18759 : null;
        int i4 = deprecationLevel3 == null ? -1 : AbstractC5341.f13494[deprecationLevel3.ordinal()];
        if (i4 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i4 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i4 != 2) {
            if (i4 != 3) {
                C5043.m9170();
                return null;
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirementVersionKind.getClass();
        c2080.f3965 = kmVersionRequirementVersionKind;
        kmVersionRequirementLevel.getClass();
        c2080.f3966 = kmVersionRequirementLevel;
        c2080.f3963 = c7733 != null ? c7733.f18758 : null;
        c2080.f3962 = c7733 != null ? c7733.f18757 : null;
        if (c7733 != null) {
            c7734 = c7733.f18761;
        }
        c2080.f3964 = new C5355(c7734.f18765, c7734.f18764, c7734.f18763);
        return c2080;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int m9665(int i) {
        return AbstractC7728.m12734(AbstractC7728.f18727.mo12740(i).booleanValue(), (ProtoBuf$Visibility) AbstractC7728.f18726.mo12740(i), (ProtoBuf$Modality) AbstractC7728.f18725.mo12740(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5366 m9666(ProtoBuf$Type protoBuf$Type, C3277 c3277) {
        AbstractC3898 c5363;
        KmVariance kmVariance;
        C6986 c6986 = (C6986) c3277.f7469;
        InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277.f7470;
        C5366 c5366 = new C5366((protoBuf$Type.getNullable() ? 1 : 0) + (protoBuf$Type.getFlags() << 1));
        C5371 c5371 = null;
        if (protoBuf$Type.hasClassName()) {
            c5363 = new C5365(AbstractC5342.m9673(interfaceC7737, protoBuf$Type.getClassName()));
        } else if (protoBuf$Type.hasTypeAliasName()) {
            c5363 = new C5364(AbstractC5342.m9673(interfaceC7737, protoBuf$Type.getTypeAliasName()));
        } else if (protoBuf$Type.hasTypeParameter()) {
            c5363 = new C5363(protoBuf$Type.getTypeParameter());
        } else {
            if (!protoBuf$Type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numM5153 = c3277.m5153(protoBuf$Type.getTypeParameterName());
            if (numM5153 == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for ".concat(interfaceC7737.getString(protoBuf$Type.getTypeParameterName())), null, 2, null);
            }
            c5363 = new C5363(numM5153.intValue());
        }
        c5366.f13552 = c5363;
        for (ProtoBuf$Type.Argument argument : protoBuf$Type.getArgumentList()) {
            ProtoBuf$Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                C6755.m11869("Required value was null.");
                return null;
            }
            int i = AbstractC5341.f13496[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.f305IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    C5043.m9170();
                    return null;
                }
                kmVariance = null;
            }
            ArrayList arrayList = c5366.f13551;
            if (kmVariance != null) {
                ProtoBuf$Type protoBuf$TypeM12750 = AbstractC7738.m12750(argument, c6986);
                if (protoBuf$TypeM12750 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                arrayList.add(new C5359(kmVariance, m9666(protoBuf$TypeM12750, c3277)));
            } else {
                arrayList.add(C5359.f13534);
            }
        }
        ProtoBuf$Type protoBuf$TypeM12749 = AbstractC7738.m12749(protoBuf$Type, c6986);
        c5366.f13550 = protoBuf$TypeM12749 != null ? m9666(protoBuf$TypeM12749, c3277) : null;
        ProtoBuf$Type protoBuf$TypeM12756 = AbstractC7738.m12756(protoBuf$Type, c6986);
        c5366.f13549 = protoBuf$TypeM12756 != null ? m9666(protoBuf$TypeM12756, c3277) : null;
        ProtoBuf$Type protoBuf$TypeM12744 = AbstractC7738.m12744(protoBuf$Type, c6986);
        if (protoBuf$TypeM12744 != null) {
            C5366 c5366M9666 = m9666(protoBuf$TypeM12744, c3277);
            String string = protoBuf$Type.hasFlexibleTypeCapabilitiesId() ? interfaceC7737.getString(protoBuf$Type.getFlexibleTypeCapabilitiesId()) : null;
            C5371 c53712 = new C5371();
            c53712.f13589 = c5366M9666;
            c53712.f13588 = string;
            c5371 = c53712;
        }
        c5366.f13548 = c5371;
        Iterator it = ((List) c3277.f7472).iterator();
        while (it.hasNext()) {
            ((C7883) ((InterfaceC7889) it.next())).getClass();
            C7892 c7892 = C7888.f19302;
            c7892.getClass();
            C7888 c7888 = (C7888) AbstractC3887.m7195(c5366.f13554, c7892);
            Object extension = protoBuf$Type.getExtension(AbstractC7742.f18772);
            extension.getClass();
            c7888.f19304 = ((Boolean) extension).booleanValue();
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$Type.getAnnotationList()) {
                ArrayList arrayList2 = c7888.f19303;
                protoBuf$Annotation.getClass();
                arrayList2.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC7737));
            }
        }
        return c5366;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5368 m9667(ProtoBuf$Property protoBuf$Property, C3277 c3277) {
        ArrayList arrayList;
        protoBuf$Property.getClass();
        C5368 c5368 = new C5368(protoBuf$Property.getFlags(), ((InterfaceC7737) c3277.f7470).getString(protoBuf$Property.getName()), protoBuf$Property.hasGetterFlags() ? protoBuf$Property.getGetterFlags() : m9665(protoBuf$Property.getFlags()), protoBuf$Property.hasSetterFlags() ? protoBuf$Property.getSetterFlags() : m9665(protoBuf$Property.getFlags()));
        List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$Property.getTypeParameterList();
        typeParameterList.getClass();
        C3277 c3277M5150 = c3277.m5150(typeParameterList);
        C6986 c6986 = (C6986) c3277M5150.f7469;
        List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$Property.getTypeParameterList();
        typeParameterList2.getClass();
        for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
            protoBuf$TypeParameter.getClass();
            c5368.f13559.add(m9669(protoBuf$TypeParameter, c3277M5150));
        }
        ProtoBuf$Type protoBuf$TypeM12761 = AbstractC7738.m12761(protoBuf$Property, c6986);
        c5368.f13558 = protoBuf$TypeM12761 != null ? m9666(protoBuf$TypeM12761, c3277M5150) : null;
        List<ProtoBuf$ValueParameter> contextParameterList = protoBuf$Property.getContextParameterList();
        contextParameterList.getClass();
        Iterator<T> it = contextParameterList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c5368.f13567;
            if (!zHasNext) {
                break;
            }
            ProtoBuf$ValueParameter protoBuf$ValueParameter = (ProtoBuf$ValueParameter) it.next();
            protoBuf$ValueParameter.getClass();
            arrayList.add(m9670(protoBuf$ValueParameter, c3277M5150));
        }
        if (protoBuf$Property.getContextParameterList().isEmpty()) {
            List<ProtoBuf$Type> contextReceiverTypeList = protoBuf$Property.getContextReceiverTypeList();
            contextReceiverTypeList.getClass();
            if (!contextReceiverTypeList.isEmpty()) {
                Iterator it2 = AbstractC7738.m12746(protoBuf$Property, c6986).iterator();
                while (it2.hasNext()) {
                    C5366 c5366M9666 = m9666((ProtoBuf$Type) it2.next(), c3277M5150);
                    C5358 c5358 = new C5358(0, JavaConstant.Dynamic.DEFAULT_NAME);
                    c5358.f13531 = c5366M9666;
                    arrayList.add(c5358);
                }
            }
        }
        if (protoBuf$Property.hasSetterValueParameter()) {
            ProtoBuf$ValueParameter setterValueParameter = protoBuf$Property.getSetterValueParameter();
            setterValueParameter.getClass();
            c5368.f13571 = m9670(setterValueParameter, c3277M5150);
        }
        c5368.f13572 = m9666(AbstractC7738.m12759(protoBuf$Property, c6986), c3277M5150);
        List<Integer> versionRequirementList = protoBuf$Property.getVersionRequirementList();
        versionRequirementList.getClass();
        for (Integer num : versionRequirementList) {
            num.getClass();
            c5368.f13569.add(m9664(num.intValue(), c3277M5150));
        }
        Iterator it3 = ((List) c3277M5150.f7472).iterator();
        while (it3.hasNext()) {
            ((C7883) ((InterfaceC7889) it3.next())).getClass();
            InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277M5150.f7470;
            C7881 c7881M7266 = AbstractC3888.m7266(c5368);
            List<ProtoBuf$Annotation> annotationList = protoBuf$Property.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c5368.f13570.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC7737));
            }
            List<ProtoBuf$Annotation> getterAnnotationList = protoBuf$Property.getGetterAnnotationList();
            getterAnnotationList.getClass();
            ArrayList arrayList2 = c5368.f13561.f13555;
            for (ProtoBuf$Annotation protoBuf$Annotation2 : getterAnnotationList) {
                protoBuf$Annotation2.getClass();
                arrayList2.add(AbstractC5342.m9672(protoBuf$Annotation2, interfaceC7737));
            }
            C5367 c5367 = c5368.f13560;
            if (c5367 != null) {
                List<ProtoBuf$Annotation> setterAnnotationList = protoBuf$Property.getSetterAnnotationList();
                setterAnnotationList.getClass();
                ArrayList arrayList3 = c5367.f13555;
                for (ProtoBuf$Annotation protoBuf$Annotation3 : setterAnnotationList) {
                    protoBuf$Annotation3.getClass();
                    arrayList3.add(AbstractC5342.m9672(protoBuf$Annotation3, interfaceC7737));
                }
            }
            List<ProtoBuf$Annotation> extensionReceiverAnnotationList = protoBuf$Property.getExtensionReceiverAnnotationList();
            extensionReceiverAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation4 : extensionReceiverAnnotationList) {
                protoBuf$Annotation4.getClass();
                c5368.f13568.add(AbstractC5342.m9672(protoBuf$Annotation4, interfaceC7737));
            }
            List<ProtoBuf$Annotation> backingFieldAnnotationList = protoBuf$Property.getBackingFieldAnnotationList();
            backingFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation5 : backingFieldAnnotationList) {
                protoBuf$Annotation5.getClass();
                c5368.f13565.add(AbstractC5342.m9672(protoBuf$Annotation5, interfaceC7737));
            }
            List<ProtoBuf$Annotation> delegateFieldAnnotationList = protoBuf$Property.getDelegateFieldAnnotationList();
            delegateFieldAnnotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation6 : delegateFieldAnnotationList) {
                protoBuf$Annotation6.getClass();
                c5368.f13564.add(AbstractC5342.m9672(protoBuf$Annotation6, interfaceC7737));
            }
            C5558 c5558 = C7722.f18692;
            C7716 c7716M12729 = C7722.m12729(protoBuf$Property, interfaceC7737, c6986, true);
            C5557 c5557 = AbstractC7742.f18774;
            c5557.getClass();
            JvmProtoBuf$JvmPropertySignature jvmProtoBuf$JvmPropertySignature = (JvmProtoBuf$JvmPropertySignature) AbstractC7741.m12763(protoBuf$Property, c5557);
            JvmProtoBuf$JvmMethodSignature getter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasGetter()) ? null : jvmProtoBuf$JvmPropertySignature.getGetter();
            JvmProtoBuf$JvmMethodSignature setter = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSetter()) ? null : jvmProtoBuf$JvmPropertySignature.getSetter();
            Object extension = protoBuf$Property.getExtension(AbstractC7742.f18773);
            extension.getClass();
            c7881M7266.f19289 = ((Number) extension).intValue();
            c7881M7266.f19288 = c7716M12729 != null ? new C5350(c7716M12729.f18681, c7716M12729.f18680) : null;
            c7881M7266.f19287 = getter != null ? new C5348(interfaceC7737.getString(getter.getName()), interfaceC7737.getString(getter.getDesc())) : null;
            c7881M7266.f19286 = setter != null ? new C5348(interfaceC7737.getString(setter.getName()), interfaceC7737.getString(setter.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature syntheticMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasSyntheticMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getSyntheticMethod();
            c7881M7266.f19285 = syntheticMethod != null ? new C5348(interfaceC7737.getString(syntheticMethod.getName()), interfaceC7737.getString(syntheticMethod.getDesc())) : null;
            JvmProtoBuf$JvmMethodSignature delegateMethod = (jvmProtoBuf$JvmPropertySignature == null || !jvmProtoBuf$JvmPropertySignature.hasDelegateMethod()) ? null : jvmProtoBuf$JvmPropertySignature.getDelegateMethod();
            c7881M7266.f19284 = delegateMethod != null ? new C5348(interfaceC7737.getString(delegateMethod.getName()), interfaceC7737.getString(delegateMethod.getDesc())) : null;
        }
        return c5368;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final void m9668(InterfaceC5361 interfaceC5361, List list, List list2, List list3, C3277 c3277) {
        ArrayList arrayListMo9688 = interfaceC5361.mo9688();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayListMo9688.add(m9661((ProtoBuf$Function) it.next(), c3277));
        }
        ArrayList arrayListMo9689 = interfaceC5361.mo9689();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListMo9689.add(m9667((ProtoBuf$Property) it2.next(), c3277));
        }
        ArrayList arrayListMo9687 = interfaceC5361.mo9687();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = (ProtoBuf$TypeAlias) it3.next();
            C5357 c5357 = new C5357(protoBuf$TypeAlias.getFlags(), ((InterfaceC7737) c3277.f7470).getString(protoBuf$TypeAlias.getName()));
            List<ProtoBuf$TypeParameter> typeParameterList = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList.getClass();
            C3277 c3277M5150 = c3277.m5150(typeParameterList);
            C6986 c6986 = (C6986) c3277M5150.f7469;
            List<ProtoBuf$TypeParameter> typeParameterList2 = protoBuf$TypeAlias.getTypeParameterList();
            typeParameterList2.getClass();
            for (ProtoBuf$TypeParameter protoBuf$TypeParameter : typeParameterList2) {
                protoBuf$TypeParameter.getClass();
                c5357.f13527.add(m9669(protoBuf$TypeParameter, c3277M5150));
            }
            m9666(AbstractC7738.m12755(protoBuf$TypeAlias, c6986), c3277M5150);
            m9666(AbstractC7738.m12745(protoBuf$TypeAlias, c6986), c3277M5150);
            List<ProtoBuf$Annotation> annotationList = protoBuf$TypeAlias.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c5357.f13526.add(AbstractC5342.m9672(protoBuf$Annotation, (InterfaceC7737) c3277M5150.f7470));
            }
            List<Integer> versionRequirementList = protoBuf$TypeAlias.getVersionRequirementList();
            versionRequirementList.getClass();
            for (Integer num : versionRequirementList) {
                num.getClass();
                c5357.f13525.add(m9664(num.intValue(), c3277M5150));
            }
            Iterator it4 = ((List) c3277M5150.f7472).iterator();
            while (it4.hasNext()) {
                ((InterfaceC7889) it4.next()).getClass();
            }
            arrayListMo9687.add(c5357);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5356 m9669(ProtoBuf$TypeParameter protoBuf$TypeParameter, C3277 c3277) {
        KmVariance kmVariance;
        InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277.f7470;
        ProtoBuf$TypeParameter.Variance variance = protoBuf$TypeParameter.getVariance();
        if (variance == null) {
            C6755.m11869("Required value was null.");
            return null;
        }
        int i = AbstractC5341.f13497[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.f305IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                C5043.m9170();
                return null;
            }
            kmVariance = KmVariance.INVARIANT;
        }
        boolean reified = protoBuf$TypeParameter.getReified();
        C5356 c5356 = new C5356(reified ? 1 : 0, interfaceC7737.getString(protoBuf$TypeParameter.getName()), protoBuf$TypeParameter.getId(), kmVariance);
        Iterator it = AbstractC7738.m12752(protoBuf$TypeParameter, (C6986) c3277.f7469).iterator();
        while (it.hasNext()) {
            c5356.f13520.add(m9666((ProtoBuf$Type) it.next(), c3277));
        }
        Iterator it2 = ((List) c3277.f7472).iterator();
        while (it2.hasNext()) {
            ((C7883) ((InterfaceC7889) it2.next())).getClass();
            C7892 c7892 = C7887.f19300;
            c7892.getClass();
            C7887 c7887 = (C7887) AbstractC3887.m7195(c5356.f13519, c7892);
            for (ProtoBuf$Annotation protoBuf$Annotation : protoBuf$TypeParameter.getAnnotationList()) {
                ArrayList arrayList = c7887.f19301;
                protoBuf$Annotation.getClass();
                arrayList.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC7737));
            }
        }
        return c5356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5358 m9670(ProtoBuf$ValueParameter protoBuf$ValueParameter, C3277 c3277) {
        int flags = protoBuf$ValueParameter.getFlags();
        int name = protoBuf$ValueParameter.getName();
        InterfaceC7737 interfaceC7737 = (InterfaceC7737) c3277.f7470;
        C5358 c5358 = new C5358(flags, interfaceC7737.getString(name));
        C6986 c6986 = (C6986) c3277.f7469;
        c5358.f13531 = m9666(AbstractC7738.m12754(protoBuf$ValueParameter, c6986), c3277);
        ProtoBuf$Type protoBuf$TypeM12753 = AbstractC7738.m12753(protoBuf$ValueParameter, c6986);
        c5358.f13530 = protoBuf$TypeM12753 != null ? m9666(protoBuf$TypeM12753, c3277) : null;
        if (protoBuf$ValueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf$Annotation.Argument.Value annotationParameterDefaultValue = protoBuf$ValueParameter.getAnnotationParameterDefaultValue();
            annotationParameterDefaultValue.getClass();
            AbstractC5342.m9671(annotationParameterDefaultValue, interfaceC7737);
        }
        Iterator it = ((List) c3277.f7472).iterator();
        while (it.hasNext()) {
            ((C7883) ((InterfaceC7889) it.next())).getClass();
            List<ProtoBuf$Annotation> annotationList = protoBuf$ValueParameter.getAnnotationList();
            annotationList.getClass();
            for (ProtoBuf$Annotation protoBuf$Annotation : annotationList) {
                protoBuf$Annotation.getClass();
                c5358.f13529.add(AbstractC5342.m9672(protoBuf$Annotation, interfaceC7737));
            }
        }
        return c5358;
    }
}

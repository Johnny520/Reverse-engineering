package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C0325;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4746;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4747;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4750;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4751;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4760;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4769;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p046.C6477;
import p048.C6517;
import p048.C6519;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p066.AbstractC6870;
import p070.AbstractC6899;
import p070.InterfaceC6908;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.AbstractC7009;
import p079.C7018;
import p098.C7240;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4813 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f14030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4486 f14031;

    public C4813(InterfaceC4486 interfaceC4486, C0325 c0325) {
        interfaceC4486.getClass();
        c0325.getClass();
        this.f14031 = interfaceC4486;
        this.f14030 = c0325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4768 m9552(AbstractC4882 abstractC4882, ProtoBuf$Annotation.Argument.Value value, InterfaceC6908 interfaceC6908) {
        interfaceC6908.getClass();
        boolean zBooleanValue = AbstractC6899.f18360.mo12181(value.getFlags()).booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : AbstractC4814.f14032[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new C4746(intValue) : new C4751(intValue);
            case 2:
                return new C4750(Character.valueOf((char) value.getIntValue()));
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new C4746(intValue2) : new C4758(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new C4746(intValue3) : new C4769(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new C4746(intValue4) : new C4760(intValue4);
            case 6:
                return new C4752(value.getFloatValue());
            case 7:
                return new C4752(value.getDoubleValue());
            case 8:
                return new C4752(Boolean.valueOf(value.getIntValue() != 0));
            case 9:
                return new C4748(interfaceC6908.getString(value.getStringValue()));
            case 10:
                return new C4759(AbstractC3933.m8319(interfaceC6908, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new C4771(AbstractC3933.m8319(interfaceC6908, value.getClassId()), C4691.m9331(interfaceC6908.getString(value.getEnumValueId())));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C4754((Object) m9554(annotation, interfaceC6908));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(arrayElementList, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    AbstractC4878 abstractC4878M12025 = this.f14031.mo9061().m12025();
                    value2.getClass();
                    arrayList.add(m9552(abstractC4878M12025, value2, interfaceC6908));
                }
                return new C4747(arrayList, abstractC4882);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + abstractC4882 + ')').toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m9553(AbstractC4768 abstractC4768, AbstractC4882 abstractC4882, ProtoBuf$Annotation.Argument.Value value) {
        AbstractC4768 abstractC47682;
        ProtoBuf$Annotation.Argument.Value arrayElement;
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : AbstractC4814.f14032[type.ordinal()];
        if (i == 10) {
            InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
            AbstractC6989 abstractC6989 = interfaceC4477Mo9211 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9211 : null;
            if (abstractC6989 != null) {
                C4691 c4691 = AbstractC6530.f17920;
                if (!AbstractC6530.m12019(abstractC6989, AbstractC6527.f17859)) {
                    return false;
                }
            }
            return true;
        }
        InterfaceC4486 interfaceC4486 = this.f14031;
        if (i != 13) {
            return AbstractC4395.m8907(abstractC4768.mo9491(interfaceC4486), abstractC4882);
        }
        if (abstractC4768 instanceof C4753) {
            Object obj = ((C4753) abstractC4768).f13905;
            if (((List) obj).size() == value.getArrayElementList().size()) {
                AbstractC4882 abstractC4882M12035 = interfaceC4486.mo9061().m12035(abstractC4882);
                if (abstractC4882M12035 != null) {
                    Collection collection = (Collection) obj;
                    collection.getClass();
                    Iterable c6519 = new C6519(0, collection.size() - 1, 1);
                    if (!(c6519 instanceof Collection) || !((Collection) c6519).isEmpty()) {
                        Iterator it = c6519.iterator();
                        do {
                            C6517 c6517 = (C6517) it;
                            if (c6517.f17823) {
                                int iNextInt = c6517.nextInt();
                                abstractC47682 = (AbstractC4768) ((List) obj).get(iNextInt);
                                arrayElement = value.getArrayElement(iNextInt);
                                arrayElement.getClass();
                            }
                        } while (m9553(abstractC47682, abstractC4882M12035, arrayElement));
                    }
                    return true;
                }
                return false;
            }
        }
        C4211.m8615(abstractC4768, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6477 m9554(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC6908 interfaceC6908) {
        protoBuf$Annotation.getClass();
        interfaceC6908.getClass();
        AbstractC6989 abstractC6989M9075 = AbstractC4491.m9075(this.f14031, AbstractC3933.m8319(interfaceC6908, protoBuf$Annotation.getId()), this.f14030);
        Map mapM8776 = AbstractC4339.m8776();
        if (protoBuf$Annotation.getArgumentCount() != 0 && !C7240.m12467(abstractC6989M9075)) {
            int i = AbstractC6870.f18312;
            if (AbstractC6870.m12116(abstractC6989M9075, ClassKind.ANNOTATION_CLASS)) {
                Collection collectionMo9007 = abstractC6989M9075.mo9007();
                collectionMo9007.getClass();
                C7018 c7018 = (C7018) AbstractC4344.m8782(collectionMo9007);
                if (c7018 != null) {
                    List listMo9035 = c7018.mo9035();
                    listMo9035.getClass();
                    int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(listMo9035, 10));
                    if (iM8772 < 16) {
                        iM8772 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
                    for (Object obj : listMo9035) {
                        linkedHashMap.put(((AbstractC7009) ((InterfaceC4456) obj)).getName(), obj);
                    }
                    List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
                    argumentList.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (ProtoBuf$Annotation.Argument argument : argumentList) {
                        argument.getClass();
                        InterfaceC4481 interfaceC4481 = (InterfaceC4456) linkedHashMap.get(C4691.m9331(interfaceC6908.getString(argument.getNameId())));
                        if (interfaceC4481 != null) {
                            C4691 c4691M9331 = C4691.m9331(interfaceC6908.getString(argument.getNameId()));
                            AbstractC4882 type = ((AbstractC6977) interfaceC4481).getType();
                            type.getClass();
                            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
                            value.getClass();
                            AbstractC4768 abstractC4768M9552 = m9552(type, value, interfaceC6908);
                            pair = m9553(abstractC4768M9552, type, value) ? abstractC4768M9552 : null;
                            if (pair == null) {
                                pair = new C4772("Unexpected argument value: actual type " + value.getType() + " != expected type " + type);
                            }
                            pair = new Pair(c4691M9331, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapM8776 = AbstractC4339.m8771(arrayList);
                }
            }
        }
        return new C6477(abstractC6989M9075.mo9025(), mapM8776, InterfaceC4462.f13091);
    }
}

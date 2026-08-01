package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C0325;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4745;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4746;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4747;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4750;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4751;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4757;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p046.C6476;
import p048.C6516;
import p048.C6518;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p066.AbstractC6869;
import p070.AbstractC6898;
import p070.InterfaceC6907;
import p079.AbstractC6976;
import p079.AbstractC6988;
import p079.AbstractC7008;
import p079.C7017;
import p098.C7239;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4812 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f14026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4485 f14027;

    public C4812(InterfaceC4485 interfaceC4485, C0325 c0325) {
        interfaceC4485.getClass();
        c0325.getClass();
        this.f14027 = interfaceC4485;
        this.f14026 = c0325;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4767 m9562(AbstractC4881 abstractC4881, ProtoBuf$Annotation.Argument.Value value, InterfaceC6907 interfaceC6907) {
        interfaceC6907.getClass();
        boolean zBooleanValue = AbstractC6898.f18365.mo12153(value.getFlags()).booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : AbstractC4813.f14028[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new C4745(intValue) : new C4750(intValue);
            case 2:
                return new C4749(Character.valueOf((char) value.getIntValue()));
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new C4745(intValue2) : new C4757(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new C4745(intValue3) : new C4768(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new C4745(intValue4) : new C4759(intValue4);
            case 6:
                return new C4751(value.getFloatValue());
            case 7:
                return new C4751(value.getDoubleValue());
            case 8:
                return new C4751(Boolean.valueOf(value.getIntValue() != 0));
            case 9:
                return new C4747(interfaceC6907.getString(value.getStringValue()));
            case 10:
                return new C4758(AbstractC7738.m13051(interfaceC6907, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new C4770(AbstractC7738.m13051(interfaceC6907, value.getClassId()), C4690.m9341(interfaceC6907.getString(value.getEnumValueId())));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C4753((Object) m9564(annotation, interfaceC6907));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(arrayElementList, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    AbstractC4877 abstractC4877M11982 = this.f14027.mo9071().m11982();
                    value2.getClass();
                    arrayList.add(m9562(abstractC4877M11982, value2, interfaceC6907));
                }
                return new C4746(arrayList, abstractC4881);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + abstractC4881 + ')').toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m9563(AbstractC4767 abstractC4767, AbstractC4881 abstractC4881, ProtoBuf$Annotation.Argument.Value value) {
        AbstractC4767 abstractC47672;
        ProtoBuf$Annotation.Argument.Value arrayElement;
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : AbstractC4813.f14028[type.ordinal()];
        if (i == 10) {
            InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
            AbstractC6988 abstractC6988 = interfaceC4476Mo9221 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9221 : null;
            if (abstractC6988 != null) {
                C4690 c4690 = AbstractC6529.f17924;
                if (!AbstractC6529.m11976(abstractC6988, AbstractC6526.f17863)) {
                    return false;
                }
            }
            return true;
        }
        InterfaceC4485 interfaceC4485 = this.f14027;
        if (i != 13) {
            return AbstractC4394.m8917(abstractC4767.mo9501(interfaceC4485), abstractC4881);
        }
        if (abstractC4767 instanceof C4752) {
            Object obj = ((C4752) abstractC4767).f13901;
            if (((List) obj).size() == value.getArrayElementList().size()) {
                AbstractC4881 abstractC4881M11992 = interfaceC4485.mo9071().m11992(abstractC4881);
                if (abstractC4881M11992 != null) {
                    Collection collection = (Collection) obj;
                    collection.getClass();
                    Iterable c6518 = new C6518(0, collection.size() - 1, 1);
                    if (!(c6518 instanceof Collection) || !((Collection) c6518).isEmpty()) {
                        Iterator it = c6518.iterator();
                        do {
                            C6516 c6516 = (C6516) it;
                            if (c6516.f17827) {
                                int iNextInt = c6516.nextInt();
                                abstractC47672 = (AbstractC4767) ((List) obj).get(iNextInt);
                                arrayElement = value.getArrayElement(iNextInt);
                                arrayElement.getClass();
                            }
                        } while (m9563(abstractC47672, abstractC4881M11992, arrayElement));
                    }
                    return true;
                }
                return false;
            }
        }
        C4210.m8625(abstractC4767, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6476 m9564(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC6907 interfaceC6907) {
        protoBuf$Annotation.getClass();
        interfaceC6907.getClass();
        AbstractC6988 abstractC6988M9085 = AbstractC4490.m9085(this.f14027, AbstractC7738.m13051(interfaceC6907, protoBuf$Annotation.getId()), this.f14026);
        Map mapM8781 = AbstractC4338.m8781();
        if (protoBuf$Annotation.getArgumentCount() != 0 && !C7239.m12440(abstractC6988M9085)) {
            int i = AbstractC6869.f18317;
            if (AbstractC6869.m12088(abstractC6988M9085, ClassKind.ANNOTATION_CLASS)) {
                Collection collectionMo9017 = abstractC6988M9085.mo9017();
                collectionMo9017.getClass();
                C7017 c7017 = (C7017) AbstractC4343.m8819(collectionMo9017);
                if (c7017 != null) {
                    List listMo9045 = c7017.mo9045();
                    listMo9045.getClass();
                    int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(listMo9045, 10));
                    if (iM8779 < 16) {
                        iM8779 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
                    for (Object obj : listMo9045) {
                        linkedHashMap.put(((AbstractC7008) ((InterfaceC4455) obj)).getName(), obj);
                    }
                    List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
                    argumentList.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (ProtoBuf$Annotation.Argument argument : argumentList) {
                        argument.getClass();
                        InterfaceC4480 interfaceC4480 = (InterfaceC4455) linkedHashMap.get(C4690.m9341(interfaceC6907.getString(argument.getNameId())));
                        if (interfaceC4480 != null) {
                            C4690 c4690M9341 = C4690.m9341(interfaceC6907.getString(argument.getNameId()));
                            AbstractC4881 type = ((AbstractC6976) interfaceC4480).getType();
                            type.getClass();
                            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
                            value.getClass();
                            AbstractC4767 abstractC4767M9562 = m9562(type, value, interfaceC6907);
                            pair = m9563(abstractC4767M9562, type, value) ? abstractC4767M9562 : null;
                            if (pair == null) {
                                pair = new C4771("Unexpected argument value: actual type " + value.getType() + " != expected type " + type);
                            }
                            pair = new Pair(c4690M9341, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapM8781 = AbstractC4338.m8783(arrayList);
                }
            }
        }
        return new C6476(abstractC6988M9085.mo9035(), mapM8781, InterfaceC4461.f13087);
    }
}

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.animation.core.C1171;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5578;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5579;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5580;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5582;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5583;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5584;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5585;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5590;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5592;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5601;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5604;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p062.C7306;
import p064.C7346;
import p064.C7348;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p082.AbstractC7699;
import p086.AbstractC7728;
import p086.InterfaceC7737;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7838;
import p095.C7847;
import p114.C8069;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5645 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1171 f14375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5318 f14376;

    public C5645(InterfaceC5318 interfaceC5318, C1171 c1171) {
        interfaceC5318.getClass();
        c1171.getClass();
        this.f14376 = interfaceC5318;
        this.f14375 = c1171;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5600 m10111(AbstractC5714 abstractC5714, ProtoBuf$Annotation.Argument.Value value, InterfaceC7737 interfaceC7737) {
        interfaceC7737.getClass();
        boolean zBooleanValue = AbstractC7728.f18705.mo12740(value.getFlags()).booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : AbstractC5646.f14377[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new C5578(intValue) : new C5583(intValue);
            case 2:
                return new C5582(Character.valueOf((char) value.getIntValue()));
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new C5578(intValue2) : new C5590(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new C5578(intValue3) : new C5601(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new C5578(intValue4) : new C5592(intValue4);
            case 6:
                return new C5584(value.getFloatValue());
            case 7:
                return new C5584(value.getDoubleValue());
            case 8:
                return new C5584(Boolean.valueOf(value.getIntValue() != 0));
            case 9:
                return new C5580(interfaceC7737.getString(value.getStringValue()));
            case 10:
                return new C5591(AbstractC4765.m8878(interfaceC7737, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new C5603(AbstractC4765.m8878(interfaceC7737, value.getClassId()), C5523.m9890(interfaceC7737.getString(value.getEnumValueId())));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C5586((Object) m10113(annotation, interfaceC7737));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(arrayElementList, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    AbstractC5710 abstractC5710M12584 = this.f14376.mo9620().m12584();
                    value2.getClass();
                    arrayList.add(m10111(abstractC5710M12584, value2, interfaceC7737));
                }
                return new C5579(arrayList, abstractC5714);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + abstractC5714 + ')').toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m10112(AbstractC5600 abstractC5600, AbstractC5714 abstractC5714, ProtoBuf$Annotation.Argument.Value value) {
        AbstractC5600 abstractC56002;
        ProtoBuf$Annotation.Argument.Value arrayElement;
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : AbstractC5646.f14377[type.ordinal()];
        if (i == 10) {
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
            AbstractC7818 abstractC7818 = interfaceC5309Mo9770 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9770 : null;
            if (abstractC7818 != null) {
                C5523 c5523 = AbstractC7359.f18265;
                if (!AbstractC7359.m12578(abstractC7818, AbstractC7356.f18204)) {
                    return false;
                }
            }
            return true;
        }
        InterfaceC5318 interfaceC5318 = this.f14376;
        if (i != 13) {
            return AbstractC5227.m9466(abstractC5600.mo10050(interfaceC5318), abstractC5714);
        }
        if (abstractC5600 instanceof C5585) {
            Object obj = ((C5585) abstractC5600).f14250;
            if (((List) obj).size() == value.getArrayElementList().size()) {
                AbstractC5714 abstractC5714M12594 = interfaceC5318.mo9620().m12594(abstractC5714);
                if (abstractC5714M12594 != null) {
                    Collection collection = (Collection) obj;
                    collection.getClass();
                    Iterable c7348 = new C7348(0, collection.size() - 1, 1);
                    if (!(c7348 instanceof Collection) || !((Collection) c7348).isEmpty()) {
                        Iterator it = c7348.iterator();
                        do {
                            C7346 c7346 = (C7346) it;
                            if (c7346.f18168) {
                                int iNextInt = c7346.nextInt();
                                abstractC56002 = (AbstractC5600) ((List) obj).get(iNextInt);
                                arrayElement = value.getArrayElement(iNextInt);
                                arrayElement.getClass();
                            }
                        } while (m10112(abstractC56002, abstractC5714M12594, arrayElement));
                    }
                    return true;
                }
                return false;
            }
        }
        C5043.m9174(abstractC5600, "Deserialized ArrayValue should have the same number of elements as the original array value: ");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7306 m10113(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC7737 interfaceC7737) {
        protoBuf$Annotation.getClass();
        interfaceC7737.getClass();
        AbstractC7818 abstractC7818M9634 = AbstractC5323.m9634(this.f14376, AbstractC4765.m8878(interfaceC7737, protoBuf$Annotation.getId()), this.f14375);
        Map mapM9335 = AbstractC5171.m9335();
        if (protoBuf$Annotation.getArgumentCount() != 0 && !C8069.m13026(abstractC7818M9634)) {
            int i = AbstractC7699.f18657;
            if (AbstractC7699.m12675(abstractC7818M9634, ClassKind.ANNOTATION_CLASS)) {
                Collection collectionMo9566 = abstractC7818M9634.mo9566();
                collectionMo9566.getClass();
                C7847 c7847 = (C7847) AbstractC5176.m9341(collectionMo9566);
                if (c7847 != null) {
                    List listMo9594 = c7847.mo9594();
                    listMo9594.getClass();
                    int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(listMo9594, 10));
                    if (iM9331 < 16) {
                        iM9331 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
                    for (Object obj : listMo9594) {
                        linkedHashMap.put(((AbstractC7838) ((InterfaceC5288) obj)).getName(), obj);
                    }
                    List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
                    argumentList.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (ProtoBuf$Annotation.Argument argument : argumentList) {
                        argument.getClass();
                        InterfaceC5313 interfaceC5313 = (InterfaceC5288) linkedHashMap.get(C5523.m9890(interfaceC7737.getString(argument.getNameId())));
                        if (interfaceC5313 != null) {
                            C5523 c5523M9890 = C5523.m9890(interfaceC7737.getString(argument.getNameId()));
                            AbstractC5714 type = ((AbstractC7806) interfaceC5313).getType();
                            type.getClass();
                            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
                            value.getClass();
                            AbstractC5600 abstractC5600M10111 = m10111(type, value, interfaceC7737);
                            pair = m10112(abstractC5600M10111, type, value) ? abstractC5600M10111 : null;
                            if (pair == null) {
                                pair = new C5604("Unexpected argument value: actual type " + value.getType() + " != expected type " + type);
                            }
                            pair = new Pair(c5523M9890, pair);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    mapM9335 = AbstractC5171.m9330(arrayList);
                }
            }
        }
        return new C7306(abstractC7818M9634.mo9584(), mapM9335, InterfaceC5294.f13436);
    }
}

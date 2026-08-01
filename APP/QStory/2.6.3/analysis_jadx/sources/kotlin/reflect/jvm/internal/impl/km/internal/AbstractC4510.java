package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.collection.C0276;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4548;
import kotlin.reflect.jvm.internal.impl.km.C4540;
import kotlin.reflect.jvm.internal.impl.km.C4541;
import kotlin.reflect.jvm.internal.impl.km.C4542;
import kotlin.reflect.jvm.internal.impl.km.C4543;
import kotlin.reflect.jvm.internal.impl.km.C4546;
import kotlin.reflect.jvm.internal.impl.km.C4547;
import kotlin.reflect.jvm.internal.impl.km.C4550;
import kotlin.reflect.jvm.internal.impl.km.C4551;
import kotlin.reflect.jvm.internal.impl.km.C4552;
import kotlin.reflect.jvm.internal.impl.km.C4553;
import kotlin.reflect.jvm.internal.impl.km.C4554;
import kotlin.reflect.jvm.internal.impl.km.C4555;
import kotlin.reflect.jvm.internal.impl.km.C4557;
import kotlin.reflect.jvm.internal.impl.km.C4558;
import kotlin.reflect.jvm.internal.impl.km.C4559;
import kotlin.reflect.jvm.internal.impl.km.C4560;
import kotlin.reflect.jvm.internal.impl.km.C4561;
import kotlin.reflect.jvm.internal.impl.km.C4562;
import kotlin.reflect.jvm.internal.impl.km.C4563;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p070.AbstractC6899;
import p070.InterfaceC6908;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4510 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4548 m9112(ProtoBuf$Annotation.Argument.Value value, InterfaceC6908 interfaceC6908) {
        interfaceC6908.getClass();
        if (AbstractC6899.f18360.mo12181(value.getFlags()).booleanValue()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            int i = type != null ? AbstractC4511.f13154[type.ordinal()] : -1;
            if (i == 1) {
                return new C4547((byte) value.getIntValue());
            }
            if (i == 2) {
                return new C4551((short) value.getIntValue());
            }
            if (i == 3) {
                return new C4546((int) value.getIntValue());
            }
            if (i == 4) {
                return new C4550(value.getIntValue());
            }
            C0276.m845(value.getType(), "Cannot read value of unsigned type: ");
            return null;
        }
        ProtoBuf$Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? AbstractC4511.f13154[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                C4211.m8611();
                return null;
            case 1:
                return new C4558((byte) value.getIntValue());
            case 2:
                return new C4554((short) value.getIntValue());
            case 3:
                return new C4553((int) value.getIntValue());
            case 4:
                return new C4557(value.getIntValue());
            case 5:
                return new C4562((char) value.getIntValue());
            case 6:
                return new C4561(value.getFloatValue());
            case 7:
                return new C4563(value.getDoubleValue());
            case 8:
                return new C4559(value.getIntValue() != 0);
            case 9:
                return new C4555(interfaceC6908.getString(value.getStringValue()));
            case 10:
                String strM9114 = m9114(interfaceC6908, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new C4552(strM9114) : new C4541(strM9114, value.getArrayDimensionCount());
            case 11:
                return new C4560(m9114(interfaceC6908, value.getClassId()), interfaceC6908.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C4542(m9113(annotation, interfaceC6908));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    value2.getClass();
                    AbstractC4548 abstractC4548M9112 = m9112(value2, interfaceC6908);
                    if (abstractC4548M9112 != null) {
                        arrayList.add(abstractC4548M9112);
                    }
                }
                return new C4540(arrayList);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4543 m9113(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC6908 interfaceC6908) {
        interfaceC6908.getClass();
        String strM9114 = m9114(interfaceC6908, protoBuf$Annotation.getId());
        List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf$Annotation.Argument argument : argumentList) {
            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
            value.getClass();
            AbstractC4548 abstractC4548M9112 = m9112(value, interfaceC6908);
            Pair pair = abstractC4548M9112 != null ? new Pair(interfaceC6908.getString(argument.getNameId()), abstractC4548M9112) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new C4543(strM9114, AbstractC4339.m8771(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9114(InterfaceC6908 interfaceC6908, int i) {
        interfaceC6908.getClass();
        String strMo12165 = interfaceC6908.mo12165(i);
        return interfaceC6908.mo12164(i) ? ".".concat(strMo12165) : strMo12165;
    }
}

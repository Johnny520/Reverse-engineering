package kotlin.reflect.jvm.internal.impl.p009km.internal;

import androidx.collection.C1123;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5380;
import kotlin.reflect.jvm.internal.impl.p009km.C5372;
import kotlin.reflect.jvm.internal.impl.p009km.C5373;
import kotlin.reflect.jvm.internal.impl.p009km.C5374;
import kotlin.reflect.jvm.internal.impl.p009km.C5375;
import kotlin.reflect.jvm.internal.impl.p009km.C5378;
import kotlin.reflect.jvm.internal.impl.p009km.C5379;
import kotlin.reflect.jvm.internal.impl.p009km.C5382;
import kotlin.reflect.jvm.internal.impl.p009km.C5383;
import kotlin.reflect.jvm.internal.impl.p009km.C5384;
import kotlin.reflect.jvm.internal.impl.p009km.C5385;
import kotlin.reflect.jvm.internal.impl.p009km.C5386;
import kotlin.reflect.jvm.internal.impl.p009km.C5387;
import kotlin.reflect.jvm.internal.impl.p009km.C5389;
import kotlin.reflect.jvm.internal.impl.p009km.C5390;
import kotlin.reflect.jvm.internal.impl.p009km.C5391;
import kotlin.reflect.jvm.internal.impl.p009km.C5392;
import kotlin.reflect.jvm.internal.impl.p009km.C5393;
import kotlin.reflect.jvm.internal.impl.p009km.C5394;
import kotlin.reflect.jvm.internal.impl.p009km.C5395;
import p086.AbstractC7728;
import p086.InterfaceC7737;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5342 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC5380 m9671(ProtoBuf$Annotation.Argument.Value value, InterfaceC7737 interfaceC7737) {
        interfaceC7737.getClass();
        if (AbstractC7728.f18705.mo12740(value.getFlags()).booleanValue()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            int i = type != null ? AbstractC5343.f13499[type.ordinal()] : -1;
            if (i == 1) {
                return new C5379((byte) value.getIntValue());
            }
            if (i == 2) {
                return new C5383((short) value.getIntValue());
            }
            if (i == 3) {
                return new C5378((int) value.getIntValue());
            }
            if (i == 4) {
                return new C5382(value.getIntValue());
            }
            C1123.m1405(value.getType(), "Cannot read value of unsigned type: ");
            return null;
        }
        ProtoBuf$Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? AbstractC5343.f13499[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                C5043.m9170();
                return null;
            case 1:
                return new C5390((byte) value.getIntValue());
            case 2:
                return new C5386((short) value.getIntValue());
            case 3:
                return new C5385((int) value.getIntValue());
            case 4:
                return new C5389(value.getIntValue());
            case 5:
                return new C5394((char) value.getIntValue());
            case 6:
                return new C5393(value.getFloatValue());
            case 7:
                return new C5395(value.getDoubleValue());
            case 8:
                return new C5391(value.getIntValue() != 0);
            case 9:
                return new C5387(interfaceC7737.getString(value.getStringValue()));
            case 10:
                String strM9673 = m9673(interfaceC7737, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new C5384(strM9673) : new C5373(strM9673, value.getArrayDimensionCount());
            case 11:
                return new C5392(m9673(interfaceC7737, value.getClassId()), interfaceC7737.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C5374(m9672(annotation, interfaceC7737));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    value2.getClass();
                    AbstractC5380 abstractC5380M9671 = m9671(value2, interfaceC7737);
                    if (abstractC5380M9671 != null) {
                        arrayList.add(abstractC5380M9671);
                    }
                }
                return new C5372(arrayList);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5375 m9672(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC7737 interfaceC7737) {
        interfaceC7737.getClass();
        String strM9673 = m9673(interfaceC7737, protoBuf$Annotation.getId());
        List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf$Annotation.Argument argument : argumentList) {
            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
            value.getClass();
            AbstractC5380 abstractC5380M9671 = m9671(value, interfaceC7737);
            Pair pair = abstractC5380M9671 != null ? new Pair(interfaceC7737.getString(argument.getNameId()), abstractC5380M9671) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new C5375(strM9673, AbstractC5171.m9330(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9673(InterfaceC7737 interfaceC7737, int i) {
        interfaceC7737.getClass();
        String strMo12724 = interfaceC7737.mo12724(i);
        return interfaceC7737.mo12723(i) ? ".".concat(strMo12724) : strMo12724;
    }
}

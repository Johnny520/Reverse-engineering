package kotlin.reflect.jvm.internal.impl.km.internal;

import androidx.collection.C0276;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4547;
import kotlin.reflect.jvm.internal.impl.km.C4539;
import kotlin.reflect.jvm.internal.impl.km.C4540;
import kotlin.reflect.jvm.internal.impl.km.C4541;
import kotlin.reflect.jvm.internal.impl.km.C4542;
import kotlin.reflect.jvm.internal.impl.km.C4545;
import kotlin.reflect.jvm.internal.impl.km.C4546;
import kotlin.reflect.jvm.internal.impl.km.C4549;
import kotlin.reflect.jvm.internal.impl.km.C4550;
import kotlin.reflect.jvm.internal.impl.km.C4551;
import kotlin.reflect.jvm.internal.impl.km.C4552;
import kotlin.reflect.jvm.internal.impl.km.C4553;
import kotlin.reflect.jvm.internal.impl.km.C4554;
import kotlin.reflect.jvm.internal.impl.km.C4556;
import kotlin.reflect.jvm.internal.impl.km.C4557;
import kotlin.reflect.jvm.internal.impl.km.C4558;
import kotlin.reflect.jvm.internal.impl.km.C4559;
import kotlin.reflect.jvm.internal.impl.km.C4560;
import kotlin.reflect.jvm.internal.impl.km.C4561;
import kotlin.reflect.jvm.internal.impl.km.C4562;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import p070.AbstractC6898;
import p070.InterfaceC6907;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4509 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AbstractC4547 m9122(ProtoBuf$Annotation.Argument.Value value, InterfaceC6907 interfaceC6907) {
        interfaceC6907.getClass();
        if (AbstractC6898.f18365.mo12153(value.getFlags()).booleanValue()) {
            ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
            int i = type != null ? AbstractC4510.f13150[type.ordinal()] : -1;
            if (i == 1) {
                return new C4546((byte) value.getIntValue());
            }
            if (i == 2) {
                return new C4550((short) value.getIntValue());
            }
            if (i == 3) {
                return new C4545((int) value.getIntValue());
            }
            if (i == 4) {
                return new C4549(value.getIntValue());
            }
            C0276.m844(value.getType(), "Cannot read value of unsigned type: ");
            return null;
        }
        ProtoBuf$Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? AbstractC4510.f13150[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                C4210.m8621();
                return null;
            case 1:
                return new C4557((byte) value.getIntValue());
            case 2:
                return new C4553((short) value.getIntValue());
            case 3:
                return new C4552((int) value.getIntValue());
            case 4:
                return new C4556(value.getIntValue());
            case 5:
                return new C4561((char) value.getIntValue());
            case 6:
                return new C4560(value.getFloatValue());
            case 7:
                return new C4562(value.getDoubleValue());
            case 8:
                return new C4558(value.getIntValue() != 0);
            case 9:
                return new C4554(interfaceC6907.getString(value.getStringValue()));
            case 10:
                String strM9124 = m9124(interfaceC6907, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new C4551(strM9124) : new C4540(strM9124, value.getArrayDimensionCount());
            case 11:
                return new C4559(m9124(interfaceC6907, value.getClassId()), interfaceC6907.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new C4541(m9123(annotation, interfaceC6907));
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    value2.getClass();
                    AbstractC4547 abstractC4547M9122 = m9122(value2, interfaceC6907);
                    if (abstractC4547M9122 != null) {
                        arrayList.add(abstractC4547M9122);
                    }
                }
                return new C4539(arrayList);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4542 m9123(ProtoBuf$Annotation protoBuf$Annotation, InterfaceC6907 interfaceC6907) {
        interfaceC6907.getClass();
        String strM9124 = m9124(interfaceC6907, protoBuf$Annotation.getId());
        List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf$Annotation.Argument argument : argumentList) {
            ProtoBuf$Annotation.Argument.Value value = argument.getValue();
            value.getClass();
            AbstractC4547 abstractC4547M9122 = m9122(value, interfaceC6907);
            Pair pair = abstractC4547M9122 != null ? new Pair(interfaceC6907.getString(argument.getNameId()), abstractC4547M9122) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new C4542(strM9124, AbstractC4338.m8783(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m9124(InterfaceC6907 interfaceC6907, int i) {
        interfaceC6907.getClass();
        String strMo12137 = interfaceC6907.mo12137(i);
        return interfaceC6907.mo12136(i) ? ".".concat(strMo12137) : strMo12137;
    }
}

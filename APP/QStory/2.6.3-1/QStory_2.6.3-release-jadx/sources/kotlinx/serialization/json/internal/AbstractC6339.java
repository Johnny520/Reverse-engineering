package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0851;
import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0954;
import androidx.appcompat.widget.C1038;
import androidx.compose.runtime.internal.C2080;
import androidx.core.view.C3075;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.AbstractC7988;
import p104.C7981;
import p104.InterfaceC7998;
import p104.InterfaceC7999;
import p104.InterfaceC8002;
import p105.InterfaceC8013;
import p107.C8021;
import p107.C8022;
import p107.C8025;
import p107.C8026;
import p107.C8027;
import p107.InterfaceC8020;
import p191.AbstractC8568;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6340 f15575 = new C6340();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final byte m11298(char c) {
        if (c < '~') {
            return C6320.f15512[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC8020 m11299(InterfaceC8020 interfaceC8020, C2080 c2080) {
        interfaceC8020.getClass();
        c2080.getClass();
        if (!AbstractC5227.m9466(interfaceC8020.getKind(), C8026.f19551)) {
            return interfaceC8020.isInline() ? m11299(interfaceC8020.mo12942(0), c2080) : interfaceC8020;
        }
        InterfaceC5925 interfaceC5925M13639 = AbstractC8568.m13639(interfaceC8020);
        if (interfaceC5925M13639 == null) {
            return interfaceC8020;
        }
        C2080.m2710(c2080, interfaceC5925M13639);
        return interfaceC8020;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m11300(AbstractC7988 abstractC7988, InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132, String str) {
        InterfaceC8020 descriptor = interfaceC80132.getDescriptor();
        descriptor.getClass();
        abstractC7988.getClass();
        m11311(abstractC7988, descriptor);
        if (AbstractC7973.m12974(descriptor).contains(str)) {
            String strMo12941 = interfaceC8013.getDescriptor().mo12941();
            String strMo129412 = interfaceC80132.getDescriptor().mo12941();
            throw new JsonEncodingException(AbstractC0900.m711(AbstractC7012.m12141("Class '", strMo129412, "' cannot be serialized ", (abstractC7988.f19473.f19505 == ClassDiscriminatorMode.ALL_JSON_OBJECTS && AbstractC5227.m9466(strMo12941, strMo129412)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC7012.m12149('\'', "as base class '", strMo12941), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), strMo129412, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1038 m11301(AbstractC7988 abstractC7988, String str) {
        abstractC7988.getClass();
        str.getClass();
        return new C1038(str, abstractC7988.f19473);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final JsonEncodingException m11302(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return new JsonEncodingException("Value of type '" + interfaceC8020.mo12941() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC8020.getKind() + '\'', interfaceC8020.mo12941(), "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final JsonEncodingException m11303(Number number, String str) {
        return new JsonEncodingException(m11308(number, str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String m11304(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final WriteMode m11305(AbstractC7988 abstractC7988, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        AbstractC9019 kind = interfaceC8020.getKind();
        if (kind instanceof C8022) {
            return WriteMode.POLY_OBJ;
        }
        if (AbstractC5227.m9466(kind, C8027.f19555)) {
            return WriteMode.LIST;
        }
        if (!AbstractC5227.m9466(kind, C8027.f19553)) {
            return WriteMode.OBJ;
        }
        InterfaceC8020 interfaceC8020M11299 = m11299(interfaceC8020.mo12942(0), abstractC7988.f19472);
        AbstractC9019 kind2 = interfaceC8020M11299.getKind();
        if ((kind2 instanceof C8021) || AbstractC5227.m9466(kind2, C8025.f19550)) {
            return WriteMode.MAP;
        }
        throw m11302(interfaceC8020M11299);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m11306(C1038 c1038, String str) {
        c1038.m1240(c1038.f1095 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m11307(AbstractC7988 abstractC7988, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        abstractC7988.getClass();
        if (abstractC7988.f19473.f19501) {
            return true;
        }
        List annotations = interfaceC8020.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC7999) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String m11308(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC0900.m711(sb, str != null ? AbstractC0900.m718(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object m11309(AbstractC7988 abstractC7988, String str, C7981 c7981, InterfaceC8013 interfaceC8013) {
        abstractC7988.getClass();
        str.getClass();
        return new C6335(abstractC7988, c7981, str, interfaceC8013.getDescriptor()).mo11216(interfaceC8013);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final CharSequence m11310(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM700 = AbstractC0900.m700(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM700.append(charSequence.subSequence(i2, i3).toString());
                sbM700.append(str2);
                return sbM700.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m11311(AbstractC7988 abstractC7988, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        abstractC7988.getClass();
        AbstractC5227.m9466(interfaceC8020.getKind(), C8027.f19554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m11312(AbstractC7988 abstractC7988, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        abstractC7988.getClass();
        for (Annotation annotation : interfaceC8020.getAnnotations()) {
            if (annotation instanceof InterfaceC8002) {
                return ((InterfaceC8002) annotation).discriminator();
            }
        }
        return abstractC7988.f19473.f19504;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m11313(AbstractC9019 abstractC9019) {
        abstractC9019.getClass();
        if (abstractC9019 instanceof C8025) {
            C6755.m11870("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC9019 instanceof C8021) {
            C6755.m11870("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC9019 instanceof C8022) {
            C6755.m11870("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int m11314(InterfaceC8020 interfaceC8020, AbstractC7988 abstractC7988, String str) throws NoSuchMethodException {
        interfaceC8020.getClass();
        abstractC7988.getClass();
        str.getClass();
        m11311(abstractC7988, interfaceC8020);
        int iMo12940 = interfaceC8020.mo12940(str);
        if (iMo12940 != -3 || !abstractC7988.f19473.f19503) {
            return iMo12940;
        }
        C3075 c3075 = abstractC7988.f19471;
        C0851 c0851 = new C0851(interfaceC8020, 9, abstractC7988);
        c3075.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3075.f6882;
        Map map = (Map) concurrentHashMap.get(interfaceC8020);
        C6340 c6340 = f15575;
        Object obj = map != null ? map.get(c6340) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c0851.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC8020);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC8020, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c6340, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int m11315(InterfaceC8020 interfaceC8020, AbstractC7988 abstractC7988, String str, String str2) throws NoSuchMethodException {
        interfaceC8020.getClass();
        abstractC7988.getClass();
        str.getClass();
        int iM11314 = m11314(interfaceC8020, abstractC7988, str);
        if (iM11314 != -3) {
            return iM11314;
        }
        throw new SerializationException(interfaceC8020.mo12941() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m11316(AbstractC7988 abstractC7988, C0954 c0954, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8013.getClass();
        WriteMode writeMode = WriteMode.OBJ;
        InterfaceC7998[] interfaceC7998Arr = new InterfaceC7998[WriteMode.getEntries().size()];
        writeMode.getClass();
        new C6328(abstractC7988.f19473.f19499 ? new C6337(c0954, abstractC7988) : new C0911(c0954), abstractC7988, writeMode, interfaceC7998Arr).mo11264(interfaceC8013, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m11317(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC5976.m10731(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC5976.m10731(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }
}

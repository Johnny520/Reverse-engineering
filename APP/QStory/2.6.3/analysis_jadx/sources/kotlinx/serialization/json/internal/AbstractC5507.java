package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import androidx.core.view.C2242;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5093;
import kotlin.text.AbstractC5144;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.AbstractC7159;
import p088.C7152;
import p088.InterfaceC7169;
import p088.InterfaceC7170;
import p088.InterfaceC7173;
import p089.InterfaceC7184;
import p091.C7192;
import p091.C7193;
import p091.C7196;
import p091.C7197;
import p091.C7198;
import p091.InterfaceC7191;
import p175.AbstractC7739;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5508 f15230 = new C5508();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final byte m10739(char c) {
        if (c < '~') {
            return C5488.f15167[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7191 m10740(InterfaceC7191 interfaceC7191, C1245 c1245) {
        interfaceC7191.getClass();
        c1245.getClass();
        if (!AbstractC4395.m8907(interfaceC7191.getKind(), C7197.f19206)) {
            return interfaceC7191.isInline() ? m10740(interfaceC7191.mo12383(0), c1245) : interfaceC7191;
        }
        InterfaceC5093 interfaceC5093M13080 = AbstractC7739.m13080(interfaceC7191);
        if (interfaceC5093M13080 == null) {
            return interfaceC7191;
        }
        C1245.m2150(c1245, interfaceC5093M13080);
        return interfaceC7191;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10741(AbstractC7159 abstractC7159, InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842, String str) {
        InterfaceC7191 descriptor = interfaceC71842.getDescriptor();
        descriptor.getClass();
        abstractC7159.getClass();
        m10752(abstractC7159, descriptor);
        if (AbstractC7144.m12415(descriptor).contains(str)) {
            String strMo12382 = interfaceC7184.getDescriptor().mo12382();
            String strMo123822 = interfaceC71842.getDescriptor().mo12382();
            throw new JsonEncodingException(AbstractC0053.m151(AbstractC6183.m11582("Class '", strMo123822, "' cannot be serialized ", (abstractC7159.f19128.f19160 == ClassDiscriminatorMode.ALL_JSON_OBJECTS && AbstractC4395.m8907(strMo12382, strMo123822)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC6183.m11590('\'', "as base class '", strMo12382), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), strMo123822, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0191 m10742(AbstractC7159 abstractC7159, String str) {
        abstractC7159.getClass();
        str.getClass();
        return new C0191(str, abstractC7159.f19128);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final JsonEncodingException m10743(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return new JsonEncodingException("Value of type '" + interfaceC7191.mo12382() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC7191.getKind() + '\'', interfaceC7191.mo12382(), "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final JsonEncodingException m10744(Number number, String str) {
        return new JsonEncodingException(m10749(number, str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String m10745(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final WriteMode m10746(AbstractC7159 abstractC7159, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        AbstractC8190 kind = interfaceC7191.getKind();
        if (kind instanceof C7193) {
            return WriteMode.POLY_OBJ;
        }
        if (AbstractC4395.m8907(kind, C7198.f19210)) {
            return WriteMode.LIST;
        }
        if (!AbstractC4395.m8907(kind, C7198.f19208)) {
            return WriteMode.OBJ;
        }
        InterfaceC7191 interfaceC7191M10740 = m10740(interfaceC7191.mo12383(0), abstractC7159.f19127);
        AbstractC8190 kind2 = interfaceC7191M10740.getKind();
        if ((kind2 instanceof C7192) || AbstractC4395.m8907(kind2, C7196.f19205)) {
            return WriteMode.MAP;
        }
        throw m10743(interfaceC7191M10740);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m10747(C0191 c0191, String str) {
        c0191.m680(c0191.f750 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m10748(AbstractC7159 abstractC7159, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        abstractC7159.getClass();
        if (abstractC7159.f19128.f19156) {
            return true;
        }
        List annotations = interfaceC7191.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC7170) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String m10749(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC0053.m151(sb, str != null ? AbstractC0053.m158(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object m10750(AbstractC7159 abstractC7159, String str, C7152 c7152, InterfaceC7184 interfaceC7184) {
        abstractC7159.getClass();
        str.getClass();
        return new C5503(abstractC7159, c7152, str, interfaceC7184.getDescriptor()).mo10657(interfaceC7184);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final CharSequence m10751(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM140 = AbstractC0053.m140(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM140.append(charSequence.subSequence(i2, i3).toString());
                sbM140.append(str2);
                return sbM140.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m10752(AbstractC7159 abstractC7159, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        abstractC7159.getClass();
        AbstractC4395.m8907(interfaceC7191.getKind(), C7198.f19209);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m10753(AbstractC7159 abstractC7159, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        abstractC7159.getClass();
        for (Annotation annotation : interfaceC7191.getAnnotations()) {
            if (annotation instanceof InterfaceC7173) {
                return ((InterfaceC7173) annotation).discriminator();
            }
        }
        return abstractC7159.f19128.f19159;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m10754(AbstractC8190 abstractC8190) {
        abstractC8190.getClass();
        if (abstractC8190 instanceof C7196) {
            C5925.m11311("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC8190 instanceof C7192) {
            C5925.m11311("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC8190 instanceof C7193) {
            C5925.m11311("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int m10755(InterfaceC7191 interfaceC7191, AbstractC7159 abstractC7159, String str) throws NoSuchMethodException {
        interfaceC7191.getClass();
        abstractC7159.getClass();
        str.getClass();
        m10752(abstractC7159, interfaceC7191);
        int iMo12381 = interfaceC7191.mo12381(str);
        if (iMo12381 != -3 || !abstractC7159.f19128.f19158) {
            return iMo12381;
        }
        C2242 c2242 = abstractC7159.f19126;
        C0004 c0004 = new C0004(interfaceC7191, 9, abstractC7159);
        c2242.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2242.f6537;
        Map map = (Map) concurrentHashMap.get(interfaceC7191);
        C5508 c5508 = f15230;
        Object obj = map != null ? map.get(c5508) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c0004.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC7191);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC7191, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c5508, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int m10756(InterfaceC7191 interfaceC7191, AbstractC7159 abstractC7159, String str, String str2) throws NoSuchMethodException {
        interfaceC7191.getClass();
        abstractC7159.getClass();
        str.getClass();
        int iM10755 = m10755(interfaceC7191, abstractC7159, str);
        if (iM10755 != -3) {
            return iM10755;
        }
        throw new SerializationException(interfaceC7191.mo12382() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10757(AbstractC7159 abstractC7159, C0107 c0107, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7184.getClass();
        WriteMode writeMode = WriteMode.OBJ;
        InterfaceC7169[] interfaceC7169Arr = new InterfaceC7169[WriteMode.getEntries().size()];
        writeMode.getClass();
        new C5496(abstractC7159.f19128.f19154 ? new C5505(c0107, abstractC7159) : new C0064(c0107), abstractC7159, writeMode, interfaceC7169Arr).mo10705(interfaceC7184, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m10758(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC5144.m10172(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC5144.m10172(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }
}

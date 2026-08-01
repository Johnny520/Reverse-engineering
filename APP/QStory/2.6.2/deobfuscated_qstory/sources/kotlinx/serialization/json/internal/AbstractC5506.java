package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import androidx.appcompat.widget.C0191;
import androidx.compose.runtime.internal.C1245;
import androidx.core.view.C2242;
import io.ktor.client.plugins.AbstractC3932;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.AbstractC7158;
import p088.C7151;
import p088.InterfaceC7168;
import p088.InterfaceC7169;
import p088.InterfaceC7172;
import p089.InterfaceC7183;
import p091.C7191;
import p091.C7192;
import p091.C7195;
import p091.C7196;
import p091.C7197;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5507 f15230 = new C5507();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final byte m10682(char c) {
        if (c < '~') {
            return C5487.f15167[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7190 m10683(InterfaceC7190 interfaceC7190, C1245 c1245) {
        interfaceC7190.getClass();
        c1245.getClass();
        if (!AbstractC4394.m8917(interfaceC7190.getKind(), C7196.f19211)) {
            return interfaceC7190.isInline() ? m10683(interfaceC7190.mo12356(0), c1245) : interfaceC7190;
        }
        InterfaceC5092 interfaceC5092M8322 = AbstractC3932.m8322(interfaceC7190);
        if (interfaceC5092M8322 == null) {
            return interfaceC7190;
        }
        C1245.m2140(c1245, interfaceC5092M8322);
        return interfaceC7190;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m10684(AbstractC7158 abstractC7158, InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832, String str) {
        InterfaceC7190 descriptor = interfaceC71832.getDescriptor();
        descriptor.getClass();
        abstractC7158.getClass();
        m10695(abstractC7158, descriptor);
        if (AbstractC7143.m12388(descriptor).contains(str)) {
            String strMo12355 = interfaceC7183.getDescriptor().mo12355();
            String strMo123552 = interfaceC71832.getDescriptor().mo12355();
            throw new JsonEncodingException(AbstractC0053.m146(AbstractC6136.m11551("Class '", strMo123552, "' cannot be serialized ", (abstractC7158.f19133.f19165 == ClassDiscriminatorMode.ALL_JSON_OBJECTS && AbstractC4394.m8917(strMo12355, strMo123552)) ? "in ALL_JSON_OBJECTS class discriminator mode" : AbstractC6136.m11558('\'', "as base class '", strMo12355), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), strMo123552, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0191 m10685(AbstractC7158 abstractC7158, String str) {
        abstractC7158.getClass();
        str.getClass();
        return new C0191(str, abstractC7158.f19133);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final JsonEncodingException m10686(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return new JsonEncodingException("Value of type '" + interfaceC7190.mo12355() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC7190.getKind() + '\'', interfaceC7190.mo12355(), "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final JsonEncodingException m10687(Number number, String str) {
        return new JsonEncodingException(m10692(number, str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final String m10688(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final WriteMode m10689(AbstractC7158 abstractC7158, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        AbstractC4921 kind = interfaceC7190.getKind();
        if (kind instanceof C7192) {
            return WriteMode.POLY_OBJ;
        }
        if (AbstractC4394.m8917(kind, C7197.f19212)) {
            return WriteMode.LIST;
        }
        if (!AbstractC4394.m8917(kind, C7197.f19215)) {
            return WriteMode.OBJ;
        }
        InterfaceC7190 interfaceC7190M10683 = m10683(interfaceC7190.mo12356(0), abstractC7158.f19132);
        AbstractC4921 kind2 = interfaceC7190M10683.getKind();
        if ((kind2 instanceof C7191) || AbstractC4394.m8917(kind2, C7195.f19210)) {
            return WriteMode.MAP;
        }
        throw m10686(interfaceC7190M10683);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final void m10690(C0191 c0191, String str) {
        c0191.m679(c0191.f750 - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final boolean m10691(AbstractC7158 abstractC7158, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        abstractC7158.getClass();
        if (abstractC7158.f19133.f19161) {
            return true;
        }
        List annotations = interfaceC7190.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC7169) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String m10692(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return AbstractC0053.m146(sb, str != null ? AbstractC0053.m156(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object m10693(AbstractC7158 abstractC7158, String str, C7151 c7151, InterfaceC7183 interfaceC7183) {
        abstractC7158.getClass();
        str.getClass();
        return new C5502(abstractC7158, c7151, str, interfaceC7183.getDescriptor()).mo10644(interfaceC7183);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final CharSequence m10694(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM149 = AbstractC0053.m149(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sbM149.append(charSequence.subSequence(i2, i3).toString());
                sbM149.append(str2);
                return sbM149.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final void m10695(AbstractC7158 abstractC7158, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        abstractC7158.getClass();
        AbstractC4394.m8917(interfaceC7190.getKind(), C7197.f19213);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m10696(AbstractC7158 abstractC7158, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        abstractC7158.getClass();
        for (Annotation annotation : interfaceC7190.getAnnotations()) {
            if (annotation instanceof InterfaceC7172) {
                return ((InterfaceC7172) annotation).discriminator();
            }
        }
        return abstractC7158.f19133.f19164;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m10697(AbstractC4921 abstractC4921) {
        abstractC4921.getClass();
        if (abstractC4921 instanceof C7195) {
            C5919.m11250("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC4921 instanceof C7191) {
            C5919.m11250("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC4921 instanceof C7192) {
            C5919.m11250("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int m10698(InterfaceC7190 interfaceC7190, AbstractC7158 abstractC7158, String str) throws NoSuchMethodException {
        interfaceC7190.getClass();
        abstractC7158.getClass();
        str.getClass();
        m10695(abstractC7158, interfaceC7190);
        int iMo12354 = interfaceC7190.mo12354(str);
        if (iMo12354 != -3 || !abstractC7158.f19133.f19163) {
            return iMo12354;
        }
        C2242 c2242 = abstractC7158.f19131;
        C0004 c0004 = new C0004(interfaceC7190, 9, abstractC7158);
        c2242.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2242.f6536;
        Map map = (Map) concurrentHashMap.get(interfaceC7190);
        C5507 c5507 = f15230;
        Object obj = map != null ? map.get(c5507) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = c0004.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC7190);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(interfaceC7190, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c5507, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int m10699(InterfaceC7190 interfaceC7190, AbstractC7158 abstractC7158, String str, String str2) throws NoSuchMethodException {
        interfaceC7190.getClass();
        abstractC7158.getClass();
        str.getClass();
        int iM10698 = m10698(interfaceC7190, abstractC7158, str);
        if (iM10698 != -3) {
            return iM10698;
        }
        throw new SerializationException(interfaceC7190.mo12355() + " does not contain element with name '" + str + '\'' + str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m10700(AbstractC7158 abstractC7158, C0107 c0107, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7183.getClass();
        WriteMode writeMode = WriteMode.OBJ;
        InterfaceC7168[] interfaceC7168Arr = new InterfaceC7168[WriteMode.getEntries().size()];
        writeMode.getClass();
        new C5495(abstractC7158.f19133.f19159 ? new C5504(c0107, abstractC7158) : new C0064(c0107), abstractC7158, writeMode, interfaceC7168Arr).mo10670(interfaceC7183, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final String m10701(String str, String str2, String str3, int i, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !AbstractC5143.m10164(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !AbstractC5143.m10164(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }
}

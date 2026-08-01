package p067;

import androidx.activity.AbstractC0053;
import io.ktor.client.plugins.AbstractC3933;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4344;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f18340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f18341 = AbstractC4344.m8810(AbstractC6347.m11931('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM11931 = AbstractC6347.m11931("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM8307 = AbstractC3933.m8307(0, listM11931.size() - 1, 2);
        if (iM8307 >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f18341;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM11931.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listM11931.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC0053.m151(sb2, (String) listM11931.get(i), "Array"), "[" + ((String) listM11931.get(i2)));
                if (i == iM8307) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f18341 + "/Unit", "V");
        m12162(linkedHashMap, "Any", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        m12162(linkedHashMap, "Nothing", "java/lang/Void");
        m12162(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC6347.m11931("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m12162(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC6347.m11931("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m12162(linkedHashMap, AbstractC0053.m157("collections/", str3), "java/util/" + str3);
            m12162(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m12162(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m12162(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m12162(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m12162(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strM11588 = AbstractC6183.m11588(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f18341;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m12162(linkedHashMap, strM11588, sb3.toString());
            m12162(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC6347.m11931("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m12162(linkedHashMap, AbstractC0053.m136(str5, ".Companion"), f18341 + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f18340 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m12161(String str) {
        str.getClass();
        String str2 = (String) f18340.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        String strReplace = str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        strReplace.getClass();
        sb.append(strReplace);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m12162(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f18341 + '/' + str, "L" + str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
    }
}

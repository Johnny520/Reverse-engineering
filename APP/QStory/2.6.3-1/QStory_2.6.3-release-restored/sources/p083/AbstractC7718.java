package p083;

import androidx.activity.AbstractC0900;
import io.ktor.client.plugins.AbstractC4765;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5176;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7718 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f18685;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f18686 = AbstractC5176.m9369(AbstractC7176.m12490('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM12490 = AbstractC7176.m12490("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM8866 = AbstractC4765.m8866(0, listM12490.size() - 1, 2);
        if (iM8866 >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f18686;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM12490.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listM12490.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC0900.m711(sb2, (String) listM12490.get(i), "Array"), "[" + ((String) listM12490.get(i2)));
                if (i == iM8866) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f18686 + "/Unit", "V");
        m12721(linkedHashMap, "Any", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        m12721(linkedHashMap, "Nothing", "java/lang/Void");
        m12721(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC7176.m12490("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m12721(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC7176.m12490("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m12721(linkedHashMap, AbstractC0900.m717("collections/", str3), "java/util/" + str3);
            m12721(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m12721(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m12721(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m12721(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m12721(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strM12147 = AbstractC7012.m12147(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f18686;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m12721(linkedHashMap, strM12147, sb3.toString());
            m12721(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC7176.m12490("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m12721(linkedHashMap, AbstractC0900.m696(str5, ".Companion"), f18686 + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f18685 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m12720(String str) {
        str.getClass();
        String str2 = (String) f18685.get(str);
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
    public static final void m12721(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f18686 + '/' + str, "L" + str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
    }
}

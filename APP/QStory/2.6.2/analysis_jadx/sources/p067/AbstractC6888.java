package p067;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4343;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子苏哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f18345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f18346 = AbstractC4343.m8813(AbstractC8189.m13659('k', 'o', Character.valueOf(Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL), 'l', 'i', 'n'), "", null, null, null, 62);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM13659 = AbstractC8189.m13659("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM1155 = AbstractC0455.m1155(0, listM13659.size() - 1, 2);
        if (iM1155 >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f18346;
                sb.append(str);
                sb.append('/');
                sb.append((String) listM13659.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listM13659.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(AbstractC0053.m146(sb2, (String) listM13659.get(i), "Array"), "[" + ((String) listM13659.get(i2)));
                if (i == iM1155) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f18346 + "/Unit", "V");
        m12134(linkedHashMap, "Any", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        m12134(linkedHashMap, "Nothing", "java/lang/Void");
        m12134(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC8189.m13659("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m12134(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC8189.m13659("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m12134(linkedHashMap, AbstractC0053.m152("collections/", str3), "java/util/" + str3);
            m12134(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m12134(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m12134(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m12134(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m12134(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strM11556 = AbstractC6136.m11556(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f18346;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            m12134(linkedHashMap, strM11556, sb3.toString());
            m12134(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC8189.m13659("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m12134(linkedHashMap, AbstractC0053.m136(str5, ".Companion"), f18346 + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f18345 = linkedHashMap;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m12133(String str) {
        str.getClass();
        String str2 = (String) f18345.get(str);
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
    public static final void m12134(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f18346 + '/' + str, "L" + str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
    }
}

package na;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p283t8.AbstractC8205c;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: na.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5527b {

    /* JADX INFO: renamed from: a */
    public static final C5527b f17285a = new C5527b();

    /* JADX INFO: renamed from: b */
    public static final String f17286b = AbstractC5081g0.m20585s0(AbstractC5114x.m20803r('k', 'o', 't', 'l', 'i', 'n'), _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c */
    public static final Map f17287c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM20803r = AbstractC5114x.m20803r("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iM31894c = AbstractC8205c.m31894c(0, listM20803r.size() - 1, 2);
        if (iM31894c >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f17286b;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listM20803r.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listM20803r.get(i11));
                linkedHashMap.put(str + '/' + ((String) listM20803r.get(i10)) + "Array", "[" + ((String) listM20803r.get(i11)));
                if (i10 == iM31894c) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f17286b + "/Unit", "V");
        m22530a(linkedHashMap, "Any", ASMUtils.TYPE_OBJECT);
        m22530a(linkedHashMap, "Nothing", "java/lang/Void");
        m22530a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC5114x.m20803r("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m22530a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC5114x.m20803r("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m22530a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m22530a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m22530a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m22530a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m22530a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m22530a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f17286b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            m22530a(linkedHashMap, "Function" + i12, sb3.toString());
            m22530a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC5114x.m20803r("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m22530a(linkedHashMap, str5 + ".Companion", f17286b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f17287c = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static final void m22530a(Map map, String str, String str2) {
        map.put(f17286b + '/' + str, "L" + str2 + ';');
    }

    /* JADX INFO: renamed from: b */
    public static final String m22531b(String str) {
        str.getClass();
        String str2 = (String) f17287c.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + AbstractC8611a0.m33068M(str, '.', '$', false, 4, null) + ';';
    }
}

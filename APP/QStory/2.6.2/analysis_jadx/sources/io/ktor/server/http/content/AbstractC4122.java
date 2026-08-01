package io.ktor.server.http.content;

import androidx.activity.compose.C0002;
import androidx.compose.ui.graphics.vector.C1541;
import androidx.window.area.C2558;
import io.ktor.server.application.C4057;
import io.ktor.server.engine.C4091;
import io.ktor.server.plugins.BadRequestException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4345;
import kotlin.sequences.C5119;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6557;
import p244.AbstractC8150;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4122 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5183 f12510 = AbstractC5186.m10210(new C2558(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Pair m8530(C4057 c4057, String str, String str2, InterfaceC6557 interfaceC6557) {
        ArrayList arrayList;
        Object objInvoke;
        Pair pair;
        ClassLoader classLoader = ((C4091) c4057.f12337).f12434;
        c4057.getClass();
        str.getClass();
        classLoader.getClass();
        interfaceC6557.getClass();
        if (!str.endsWith("/") && !str.endsWith("\\")) {
            List listM10147 = AbstractC5143.m10147(str, new char[]{'/', '\\'});
            if (listM10147.contains("..")) {
                throw new BadRequestException("Relative path should not contain path traversing characters: ".concat(str), null, 2, null);
            }
            if (str2 == null) {
                str2 = "";
            }
            ArrayList arrayListM8825 = AbstractC4343.m8825(listM10147, AbstractC5143.m10147(str2, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', '\\'}));
            boolean[] zArr = AbstractC8150.f22479;
            int size = arrayListM8825.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList = arrayListM8825;
                    break;
                }
                if (AbstractC8150.m13573((String) arrayListM8825.get(i))) {
                    ArrayList arrayList2 = new ArrayList(arrayListM8825.size());
                    if (i > 0) {
                        arrayList2.addAll(arrayListM8825.subList(0, i));
                    }
                    AbstractC8150.m13574((String) arrayListM8825.get(i), arrayList2);
                    int size2 = arrayListM8825.size();
                    for (int i2 = i + 1; i2 < size2; i2++) {
                        String str3 = (String) arrayListM8825.get(i2);
                        if (AbstractC8150.m13573(str3)) {
                            AbstractC8150.m13574(str3, arrayList2);
                        } else {
                            arrayList2.add(str3);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    i++;
                }
            }
            String strM8813 = AbstractC4343.m8813(arrayList, "/", null, null, null, 62);
            String str4 = classLoader.hashCode() + '/' + strM8813;
            C0002 c0002 = new C0002(strM8813, 20, interfaceC6557);
            InterfaceC5183 interfaceC5183 = f12510;
            URL url = (URL) ((ConcurrentHashMap) interfaceC5183.getValue()).get(str4);
            if (url != null && (pair = (Pair) c0002.invoke(url)) != null) {
                return pair;
            }
            Enumeration<URL> resources = classLoader.getResources(strM8813);
            resources.getClass();
            Iterator it = new C5119(new C4345(new C1541(resources), 3)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = c0002.invoke(it.next());
                if (objInvoke != null) {
                    break;
                }
            }
            Pair pair2 = (Pair) objInvoke;
            if (pair2 != null) {
                ((ConcurrentHashMap) interfaceC5183.getValue()).put(str4, (URL) pair2.component1());
                return pair2;
            }
        }
        return null;
    }
}

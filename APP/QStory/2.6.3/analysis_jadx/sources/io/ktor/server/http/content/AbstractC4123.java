package io.ktor.server.http.content;

import androidx.activity.compose.C0002;
import androidx.compose.ui.graphics.vector.C1541;
import androidx.window.area.C2558;
import io.ktor.server.application.C4058;
import io.ktor.server.engine.C4092;
import io.ktor.server.plugins.BadRequestException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4346;
import kotlin.sequences.C5120;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;
import p244.AbstractC8151;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4123 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5184 f12514 = AbstractC5187.m10214(new C2558(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Pair m8520(C4058 c4058, String str, String str2, InterfaceC6558 interfaceC6558) {
        ArrayList arrayList;
        Object objInvoke;
        Pair pair;
        ClassLoader classLoader = ((C4092) c4058.f12341).f12438;
        c4058.getClass();
        str.getClass();
        classLoader.getClass();
        interfaceC6558.getClass();
        if (!str.endsWith("/") && !str.endsWith("\\")) {
            List listM10150 = AbstractC5144.m10150(str, new char[]{'/', '\\'});
            if (listM10150.contains("..")) {
                throw new BadRequestException("Relative path should not contain path traversing characters: ".concat(str), null, 2, null);
            }
            if (str2 == null) {
                str2 = "";
            }
            ArrayList arrayListM8793 = AbstractC4344.m8793(listM10150, AbstractC5144.m10150(str2, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', '\\'}));
            boolean[] zArr = AbstractC8151.f22477;
            int size = arrayListM8793.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList = arrayListM8793;
                    break;
                }
                if (AbstractC8151.m13602((String) arrayListM8793.get(i))) {
                    ArrayList arrayList2 = new ArrayList(arrayListM8793.size());
                    if (i > 0) {
                        arrayList2.addAll(arrayListM8793.subList(0, i));
                    }
                    AbstractC8151.m13603((String) arrayListM8793.get(i), arrayList2);
                    int size2 = arrayListM8793.size();
                    for (int i2 = i + 1; i2 < size2; i2++) {
                        String str3 = (String) arrayListM8793.get(i2);
                        if (AbstractC8151.m13602(str3)) {
                            AbstractC8151.m13603(str3, arrayList2);
                        } else {
                            arrayList2.add(str3);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    i++;
                }
            }
            String strM8810 = AbstractC4344.m8810(arrayList, "/", null, null, null, 62);
            String str4 = classLoader.hashCode() + '/' + strM8810;
            C0002 c0002 = new C0002(strM8810, 20, interfaceC6558);
            InterfaceC5184 interfaceC5184 = f12514;
            URL url = (URL) ((ConcurrentHashMap) interfaceC5184.getValue()).get(str4);
            if (url != null && (pair = (Pair) c0002.invoke(url)) != null) {
                return pair;
            }
            Enumeration<URL> resources = classLoader.getResources(strM8810);
            resources.getClass();
            Iterator it = new C5120(new C4346(new C1541(resources), 3)).iterator();
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
                ((ConcurrentHashMap) interfaceC5184.getValue()).put(str4, (URL) pair2.component1());
                return pair2;
            }
        }
        return null;
    }
}

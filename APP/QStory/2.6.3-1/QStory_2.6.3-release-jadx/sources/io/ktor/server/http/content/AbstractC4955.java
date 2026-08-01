package io.ktor.server.http.content;

import androidx.activity.compose.C0849;
import androidx.compose.p001ui.graphics.vector.C2376;
import androidx.window.area.C3391;
import io.ktor.server.application.C4890;
import io.ktor.server.engine.C4924;
import io.ktor.server.plugins.BadRequestException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5178;
import kotlin.sequences.C5952;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;
import p260.AbstractC8980;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6016 f12859 = AbstractC6019.m10773(new C3391(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Pair m9079(C4890 c4890, String str, String str2, InterfaceC7387 interfaceC7387) {
        ArrayList arrayList;
        Object objInvoke;
        Pair pair;
        ClassLoader classLoader = ((C4924) c4890.f12686).f12783;
        c4890.getClass();
        str.getClass();
        classLoader.getClass();
        interfaceC7387.getClass();
        if (!str.endsWith("/") && !str.endsWith("\\")) {
            List listM10709 = AbstractC5976.m10709(str, new char[]{'/', '\\'});
            if (listM10709.contains("..")) {
                throw new BadRequestException("Relative path should not contain path traversing characters: ".concat(str), null, 2, null);
            }
            if (str2 == null) {
                str2 = "";
            }
            ArrayList arrayListM9352 = AbstractC5176.m9352(listM10709, AbstractC5976.m10709(str2, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/', '\\'}));
            boolean[] zArr = AbstractC8980.f22822;
            int size = arrayListM9352.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList = arrayListM9352;
                    break;
                }
                if (AbstractC8980.m14161((String) arrayListM9352.get(i))) {
                    ArrayList arrayList2 = new ArrayList(arrayListM9352.size());
                    if (i > 0) {
                        arrayList2.addAll(arrayListM9352.subList(0, i));
                    }
                    AbstractC8980.m14162((String) arrayListM9352.get(i), arrayList2);
                    int size2 = arrayListM9352.size();
                    for (int i2 = i + 1; i2 < size2; i2++) {
                        String str3 = (String) arrayListM9352.get(i2);
                        if (AbstractC8980.m14161(str3)) {
                            AbstractC8980.m14162(str3, arrayList2);
                        } else {
                            arrayList2.add(str3);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    i++;
                }
            }
            String strM9369 = AbstractC5176.m9369(arrayList, "/", null, null, null, 62);
            String str4 = classLoader.hashCode() + '/' + strM9369;
            C0849 c0849 = new C0849(strM9369, 20, interfaceC7387);
            InterfaceC6016 interfaceC6016 = f12859;
            URL url = (URL) ((ConcurrentHashMap) interfaceC6016.getValue()).get(str4);
            if (url != null && (pair = (Pair) c0849.invoke(url)) != null) {
                return pair;
            }
            Enumeration<URL> resources = classLoader.getResources(strM9369);
            resources.getClass();
            Iterator it = new C5952(new C5178(new C2376(resources), 3)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = c0849.invoke(it.next());
                if (objInvoke != null) {
                    break;
                }
            }
            Pair pair2 = (Pair) objInvoke;
            if (pair2 != null) {
                ((ConcurrentHashMap) interfaceC6016.getValue()).put(str4, (URL) pair2.component1());
                return pair2;
            }
        }
        return null;
    }
}

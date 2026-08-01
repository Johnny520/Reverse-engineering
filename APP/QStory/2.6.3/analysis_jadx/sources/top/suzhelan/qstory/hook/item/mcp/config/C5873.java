package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import p024.AbstractC6309;
import p287.AbstractC8405;
import p329.InterfaceC8769;
import p330.C8780;
import p391.C9095;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5873 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11272(ArrayList arrayList) {
        AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜呜喵");
        HashSet hashSet = new HashSet();
        ArrayList<C5872> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C5872) obj).f16045)) {
                arrayList2.add(obj);
            }
        }
        C9095 c9095 = C5871.f16035;
        String strM13972 = AbstractC8405.m13972(2298);
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C5872) it.next()).f16045);
        }
        c9095.m14677(arrayList3, strM13972);
        for (C5872 c5872 : arrayList2) {
            C5871.f16035.m14677(Boolean.valueOf(c5872.f16042), AbstractC8405.m13972(2299) + c5872.f16045);
        }
        ArrayList arrayList4 = C5871.f16033;
        ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((InterfaceC8769) it2.next()).getId());
        }
        ArrayList<String> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            String str = (String) obj2;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (AbstractC4395.m8907(((C5872) it3.next()).f16045, str)) {
                        break;
                    }
                }
            }
            arrayList6.add(obj2);
        }
        for (String str2 : arrayList6) {
            C5871.f16035.m14677(Boolean.TRUE, AbstractC8405.m13972(2299) + str2);
        }
        AbstractC5399.m10477(C5871.f16032, null, null, new McpServerManager$Companion$saveToolConfig$6(null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11273(C5873 c5873) {
        c5873.getClass();
        AbstractC5399.m10477(C5871.f16032, null, null, new McpServerManager$Companion$run$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11274(C5873 c5873) {
        c5873.getClass();
        AbstractC5399.m10477(C5871.f16032, null, null, new McpServerManager$Companion$refreshServerForCurrentProcess$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m11275(String str) {
        C9095 c9095 = C5871.f16035;
        String str2 = AbstractC8405.m13972(2299) + str;
        c9095.getClass();
        return c9095.f25489.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ArrayList m11276() {
        ArrayList arrayListM14680 = C5871.f16035.m14680(String.class, AbstractC8405.m13972(2298));
        ArrayList arrayList = C5871.f16033;
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayList, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Object obj : arrayList) {
            linkedHashMap.put(((InterfaceC8769) obj).getId(), obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListM14680.iterator();
        while (it.hasNext()) {
            InterfaceC8769 interfaceC8769 = (InterfaceC8769) linkedHashMap.get((String) it.next());
            if (interfaceC8769 != null) {
                arrayList2.add(interfaceC8769);
            }
        }
        for (InterfaceC8769 interfaceC87692 : C5871.f16033) {
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC4395.m8907(((InterfaceC8769) it2.next()).getId(), interfaceC87692.getId())) {
                        break;
                    }
                }
            }
            arrayList2.add(interfaceC87692);
        }
        if (!arrayListM14680.isEmpty() && arrayList2.size() == AbstractC4344.m8797(AbstractC4344.m8784(arrayListM14680)).size()) {
            return arrayList2;
        }
        C9095 c9095 = C5871.f16035;
        String strM13972 = AbstractC8405.m13972(2298);
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InterfaceC8769) it3.next()).getId());
        }
        c9095.m14677(arrayList3, strM13972);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11277(C5873 c5873) {
        c5873.getClass();
        Object obj = AbstractC6309.f17424.get(C8780.class);
        C8780 c8780 = obj instanceof C8780 ? (C8780) obj : null;
        return c8780 != null && c8780.f17425.booleanValue();
    }
}

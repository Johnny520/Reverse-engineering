package top.suzhelan.qstory.hook.item.mcp.config;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import p007.AbstractC6136;
import p024.AbstractC6291;
import p325.InterfaceC8761;
import p329.C8789;
import p391.C9114;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5868 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11210(ArrayList arrayList) {
        AbstractC3056.m6668(-3937645464669914535L);
        HashSet hashSet = new HashSet();
        ArrayList<C5867> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C5867) obj).f16038)) {
                arrayList2.add(obj);
            }
        }
        C9114 c9114 = C5866.f16028;
        String strM6668 = AbstractC3056.m6668(-3937808243930432935L);
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C5867) it.next()).f16038);
        }
        c9114.m14640(arrayList3, strM6668);
        for (C5867 c5867 : arrayList2) {
            C5866.f16028.m14640(Boolean.valueOf(c5867.f16035), AbstractC3056.m6668(-3937808153736119719L) + c5867.f16038);
        }
        ArrayList arrayList4 = C5866.f16026;
        ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((InterfaceC8761) it2.next()).getId());
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            String str = (String) obj2;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (AbstractC4394.m8917(((C5867) it3.next()).f16038, str)) {
                        break;
                    }
                }
            }
            arrayList6.add(obj2);
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            C5866.f16028.m14640(Boolean.TRUE, AbstractC6136.m11557(-3937808153736119719L, new StringBuilder(), (String) it4.next()));
        }
        AbstractC5398.m10473(C5866.f16025, null, null, new McpServerManager$Companion$saveToolConfig$6(null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11211(C5868 c5868) {
        c5868.getClass();
        AbstractC5398.m10473(C5866.f16025, null, null, new McpServerManager$Companion$run$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11212(C5868 c5868) {
        c5868.getClass();
        AbstractC5398.m10473(C5866.f16025, null, null, new McpServerManager$Companion$refreshServerForCurrentProcess$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m11213(String str) {
        C9114 c9114 = C5866.f16028;
        String str2 = AbstractC3056.m6668(-3937808153736119719L) + str;
        c9114.getClass();
        return c9114.f25485.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ArrayList m11214() {
        ArrayList arrayListM14643 = C5866.f16028.m14643(String.class, AbstractC3056.m6668(-3937808243930432935L));
        ArrayList arrayList = C5866.f16026;
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayList, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Object obj : arrayList) {
            linkedHashMap.put(((InterfaceC8761) obj).getId(), obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListM14643.iterator();
        while (it.hasNext()) {
            InterfaceC8761 interfaceC8761 = (InterfaceC8761) linkedHashMap.get((String) it.next());
            if (interfaceC8761 != null) {
                arrayList2.add(interfaceC8761);
            }
        }
        for (InterfaceC8761 interfaceC87612 : C5866.f16026) {
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC4394.m8917(((InterfaceC8761) it2.next()).getId(), interfaceC87612.getId())) {
                        break;
                    }
                }
            }
            arrayList2.add(interfaceC87612);
        }
        if (!arrayListM14643.isEmpty() && arrayList2.size() == AbstractC4343.m8804(AbstractC4343.m8801(arrayListM14643)).size()) {
            return arrayList2;
        }
        C9114 c9114 = C5866.f16028;
        String strM6668 = AbstractC3056.m6668(-3937808243930432935L);
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InterfaceC8761) it3.next()).getId());
        }
        c9114.m14640(arrayList3, strM6668);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11215(C5868 c5868) {
        c5868.getClass();
        Object obj = AbstractC6291.f17375.get(C8789.class);
        C8789 c8789 = obj instanceof C8789 ? (C8789) obj : null;
        return c8789 != null && c8789.f17376.booleanValue();
    }
}

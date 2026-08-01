package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import p040.AbstractC7138;
import p303.AbstractC9234;
import p345.InterfaceC9598;
import p346.C9609;
import p407.C9924;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.mcp.config.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6703 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m11831(ArrayList arrayList) {
        AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜喵呜~喵喵喵呜喵呜呜喵");
        HashSet hashSet = new HashSet();
        ArrayList<C6702> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C6702) obj).f16390)) {
                arrayList2.add(obj);
            }
        }
        C9924 c9924 = C6701.f16380;
        String strM14531 = AbstractC9234.m14531(2298);
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C6702) it.next()).f16390);
        }
        c9924.m15236(arrayList3, strM14531);
        for (C6702 c6702 : arrayList2) {
            C6701.f16380.m15236(Boolean.valueOf(c6702.f16387), AbstractC9234.m14531(2299) + c6702.f16390);
        }
        ArrayList arrayList4 = C6701.f16378;
        ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((InterfaceC9598) it2.next()).getId());
        }
        ArrayList<String> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            String str = (String) obj2;
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (AbstractC5227.m9466(((C6702) it3.next()).f16390, str)) {
                        break;
                    }
                }
            }
            arrayList6.add(obj2);
        }
        for (String str2 : arrayList6) {
            C6701.f16380.m15236(Boolean.TRUE, AbstractC9234.m14531(2299) + str2);
        }
        AbstractC6231.m11036(C6701.f16377, null, null, new McpServerManager$Companion$saveToolConfig$6(null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11832(C6703 c6703) {
        c6703.getClass();
        AbstractC6231.m11036(C6701.f16377, null, null, new McpServerManager$Companion$run$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m11833(C6703 c6703) {
        c6703.getClass();
        AbstractC6231.m11036(C6701.f16377, null, null, new McpServerManager$Companion$refreshServerForCurrentProcess$1(9000, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m11834(String str) {
        C9924 c9924 = C6701.f16380;
        String str2 = AbstractC9234.m14531(2299) + str;
        c9924.getClass();
        return c9924.f25834.getBoolean(str2, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ArrayList m11835() {
        ArrayList arrayListM15239 = C6701.f16380.m15239(String.class, AbstractC9234.m14531(2298));
        ArrayList arrayList = C6701.f16378;
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayList, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Object obj : arrayList) {
            linkedHashMap.put(((InterfaceC9598) obj).getId(), obj);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListM15239.iterator();
        while (it.hasNext()) {
            InterfaceC9598 interfaceC9598 = (InterfaceC9598) linkedHashMap.get((String) it.next());
            if (interfaceC9598 != null) {
                arrayList2.add(interfaceC9598);
            }
        }
        for (InterfaceC9598 interfaceC95982 : C6701.f16378) {
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (AbstractC5227.m9466(((InterfaceC9598) it2.next()).getId(), interfaceC95982.getId())) {
                        break;
                    }
                }
            }
            arrayList2.add(interfaceC95982);
        }
        if (!arrayListM15239.isEmpty() && arrayList2.size() == AbstractC5176.m9356(AbstractC5176.m9343(arrayListM15239)).size()) {
            return arrayList2;
        }
        C9924 c9924 = C6701.f16380;
        String strM14531 = AbstractC9234.m14531(2298);
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((InterfaceC9598) it3.next()).getId());
        }
        c9924.m15236(arrayList3, strM14531);
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11836(C6703 c6703) {
        c6703.getClass();
        Object obj = AbstractC7138.f17769.get(C9609.class);
        C9609 c9609 = obj instanceof C9609 ? (C9609) obj : null;
        return c9609 != null && c9609.f17770.booleanValue();
    }
}

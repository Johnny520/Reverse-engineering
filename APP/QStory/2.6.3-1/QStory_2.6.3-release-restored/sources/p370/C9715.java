package p370;

import androidx.compose.foundation.lazy.C1596;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p233.AbstractC8794;
import p233.AbstractC8798;
import p352.C9620;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9715 extends AbstractC8794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C1596 f25396;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25397 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25398 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f25395 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public String f25394 = "";

    public C9715() {
        this.f22383.put(1, new C9714(this, 0));
        this.f22383.put(2, new C9714(this, 1));
        this.f22384 = new C9620(4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m15097() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25394.length() == 0) {
            list = this.f25398;
        } else {
            String lowerCase = this.f25394.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            lowerCase.getClass();
            List list2 = this.f25398;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                C9709 c9709 = (C9709) obj;
                String str = c9709.f25383.GroupName;
                "GroupName";
                str.getClass();
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                "toLowerCase(...)";
                lowerCase2.getClass();
                if (!AbstractC5976.m10735(lowerCase2, lowerCase, false)) {
                    String str2 = c9709.f25383.GroupUin;
                    "GroupUin";
                    str2.getClass();
                    if (AbstractC5976.m10735(str2, this.f25394, false)) {
                    }
                }
                arrayList2.add(obj);
            }
            list = arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            int i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C9709 c97092 = (C9709) next;
            if (c97092.f25382) {
                i = 0;
            } else if (!c97092.f25383.IsOwnerOrAdmin) {
                i = 2;
            }
            Integer numValueOf = Integer.valueOf(i);
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(next);
        }
        Iterator it2 = AbstractC5176.m9336(linkedHashMap.keySet()).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String strM14532 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? "其他" : "我加入的群" : "我管理的群" : "我创建的群";
                boolean zM9466 = AbstractC5227.m9466(this.f25395.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C9710(strM14532, iIntValue, list3.size(), !zM9466));
                if (!zM9466) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((C9709) it3.next());
                    }
                }
            }
        }
        AbstractC8798.m14017(this, arrayList);
    }
}

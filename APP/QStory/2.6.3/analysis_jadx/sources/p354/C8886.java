package p354;

import androidx.compose.foundation.lazy.C0755;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import p217.AbstractC7965;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p336.C8791;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8886 extends AbstractC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C0755 f25051;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25052 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25053 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f25050 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public String f25049 = "";

    public C8886() {
        this.f22038.put(1, new C8885(this, 0));
        this.f22038.put(2, new C8885(this, 1));
        this.f22039 = new C8791(4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14538() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25049.length() == 0) {
            list = this.f25053;
        } else {
            String lowerCase = this.f25049.toLowerCase(Locale.ROOT);
            AbstractC8405.m13972(1322);
            lowerCase.getClass();
            List list2 = this.f25053;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                C8880 c8880 = (C8880) obj;
                String str = c8880.f25038.GroupName;
                AbstractC8405.m13972(2932);
                str.getClass();
                String lowerCase2 = str.toLowerCase(Locale.ROOT);
                AbstractC8405.m13972(1322);
                lowerCase2.getClass();
                if (!AbstractC5144.m10176(lowerCase2, lowerCase, false)) {
                    String str2 = c8880.f25038.GroupUin;
                    AbstractC8405.m13972(2933);
                    str2.getClass();
                    if (AbstractC5144.m10176(str2, this.f25049, false)) {
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
            C8880 c88802 = (C8880) next;
            if (c88802.f25037) {
                i = 0;
            } else if (!c88802.f25038.IsOwnerOrAdmin) {
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
        Iterator it2 = AbstractC4344.m8777(linkedHashMap.keySet()).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String strM13973 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜呜喵喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜呜呜喵~呜呜呜呜呜喵呜喵") : AbstractC8405.m13972(2936) : AbstractC8405.m13972(2935) : AbstractC8405.m13972(2934);
                boolean zM8907 = AbstractC4395.m8907(this.f25050.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C8881(strM13973, iIntValue, list3.size(), !zM8907));
                if (!zM8907) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((C8880) it3.next());
                    }
                }
            }
        }
        AbstractC7969.m13458(this, arrayList);
    }
}

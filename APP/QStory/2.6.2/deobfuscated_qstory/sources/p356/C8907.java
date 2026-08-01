package p356;

import androidx.compose.foundation.lazy.C0755;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import p217.AbstractC7964;
import p217.AbstractC7968;
import p330.C8796;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8907 extends AbstractC7964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C0755 f25090;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25091 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25092 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final LinkedHashMap f25089 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public String f25088 = "";

    public C8907() {
        this.f22041.put(1, new C8906(this, 0));
        this.f22041.put(2, new C8906(this, 1));
        this.f22042 = new C8796(4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14528() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25088.length() == 0) {
            list = this.f25092;
        } else {
            String strM4563 = AbstractC2442.m4563(this.f25088, Locale.ROOT, -3937688152349869479L);
            List list2 = this.f25092;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                C8901 c8901 = (C8901) obj;
                String str = c8901.f25077.GroupName;
                "GroupName";
                str.getClass();
                if (!AbstractC5143.m10171(AbstractC2442.m4563(str, Locale.ROOT, -3937688152349869479L), strM4563, false)) {
                    String str2 = c8901.f25077.GroupUin;
                    "GroupUin";
                    str2.getClass();
                    if (AbstractC5143.m10171(str2, this.f25088, false)) {
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
            C8901 c89012 = (C8901) next;
            if (c89012.f25076) {
                i = 0;
            } else if (!c89012.f25077.IsOwnerOrAdmin) {
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
        Iterator it2 = AbstractC4343.m8814(linkedHashMap.keySet()).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String strM6668 = iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? "\u5176\u4ed6" : "\u6211\u52a0\u5165\u7684\u7fa4" : "\u6211\u7ba1\u7406\u7684\u7fa4" : "\u6211\u521b\u5efa\u7684\u7fa4";
                boolean zM8917 = AbstractC4394.m8917(this.f25089.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C8902(strM6668, iIntValue, list3.size(), !zM8917));
                if (!zM8917) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList.add((C8901) it3.next());
                    }
                }
            }
        }
        AbstractC7968.m13430(this, arrayList);
    }
}

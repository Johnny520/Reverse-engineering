package p370;

import androidx.compose.foundation.lazy.C1596;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p233.AbstractC8794;
import p233.AbstractC8798;
import p303.AbstractC9234;
import p352.C9620;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9706 extends AbstractC8794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1596 f25373;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25374 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25375 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Map f25371 = AbstractC5171.m9335();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f25370 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public String f25372 = "";

    public C9706() {
        this.f22383.put(1, new C9707(this, 0));
        this.f22383.put(2, new C9707(this, 1));
        this.f22384 = new C9620(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m15096() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25372.length() == 0) {
            list = this.f25375;
        } else {
            String lowerCase = this.f25372.toLowerCase(Locale.ROOT);
            AbstractC9234.m14531(1322);
            lowerCase.getClass();
            List list2 = this.f25375;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj;
                String str = newFriendInfo.nickname;
                AbstractC9234.m14531(1051);
                str.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase2 = str.toLowerCase(locale);
                AbstractC9234.m14531(1322);
                lowerCase2.getClass();
                if (!AbstractC5976.m10735(lowerCase2, lowerCase, false)) {
                    String str2 = newFriendInfo.uin;
                    AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
                    str2.getClass();
                    if (!AbstractC5976.m10735(str2, this.f25372, false)) {
                        String str3 = newFriendInfo.remark;
                        AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜");
                        str3.getClass();
                        String lowerCase3 = str3.toLowerCase(locale);
                        AbstractC9234.m14531(1322);
                        lowerCase3.getClass();
                        if (AbstractC5976.m10735(lowerCase3, lowerCase, false)) {
                        }
                    }
                }
                arrayList2.add(obj);
            }
            list = arrayList2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            Integer numValueOf = Integer.valueOf(((NewFriendInfo) obj2).categoryId);
            Object arrayList3 = linkedHashMap.get(numValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        Iterator it = AbstractC5176.m9336(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String str4 = (String) this.f25371.get(Integer.valueOf(iIntValue));
                if (str4 == null) {
                    str4 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜呜呜呜喵喵~呜喵喵喵呜呜呜呜~呜呜喵呜呜呜呜喵~呜呜呜喵呜喵喵喵~喵呜喵喵喵喵喵呜") + iIntValue;
                }
                boolean zM9466 = AbstractC5227.m9466(this.f25370.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C9704(str4, iIntValue, list3.size(), !zM9466));
                if (!zM9466) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C9705((NewFriendInfo) it2.next()));
                    }
                }
            }
        }
        AbstractC8798.m14017(this, arrayList);
    }
}

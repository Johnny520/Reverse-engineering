package p354;

import androidx.compose.foundation.lazy.C0755;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import p217.AbstractC7965;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p336.C8791;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8877 extends AbstractC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C0755 f25028;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25029 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25030 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Map f25026 = AbstractC4339.m8776();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f25025 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public String f25027 = "";

    public C8877() {
        this.f22038.put(1, new C8878(this, 0));
        this.f22038.put(2, new C8878(this, 1));
        this.f22039 = new C8791(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14537() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25027.length() == 0) {
            list = this.f25030;
        } else {
            String lowerCase = this.f25027.toLowerCase(Locale.ROOT);
            AbstractC8405.m13972(1322);
            lowerCase.getClass();
            List list2 = this.f25030;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj;
                String str = newFriendInfo.nickname;
                AbstractC8405.m13972(1051);
                str.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase2 = str.toLowerCase(locale);
                AbstractC8405.m13972(1322);
                lowerCase2.getClass();
                if (!AbstractC5144.m10176(lowerCase2, lowerCase, false)) {
                    String str2 = newFriendInfo.uin;
                    AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵");
                    str2.getClass();
                    if (!AbstractC5144.m10176(str2, this.f25027, false)) {
                        String str3 = newFriendInfo.remark;
                        AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜");
                        str3.getClass();
                        String lowerCase3 = str3.toLowerCase(locale);
                        AbstractC8405.m13972(1322);
                        lowerCase3.getClass();
                        if (AbstractC5144.m10176(lowerCase3, lowerCase, false)) {
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
        Iterator it = AbstractC4344.m8777(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String str4 = (String) this.f25026.get(Integer.valueOf(iIntValue));
                if (str4 == null) {
                    str4 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜呜呜呜呜喵喵~呜喵喵喵呜呜呜呜~呜呜喵呜呜呜呜喵~呜呜呜喵呜喵喵喵~喵呜喵喵喵喵喵呜") + iIntValue;
                }
                boolean zM8907 = AbstractC4395.m8907(this.f25025.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C8875(str4, iIntValue, list3.size(), !zM8907));
                if (!zM8907) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C8876((NewFriendInfo) it2.next()));
                    }
                }
            }
        }
        AbstractC7969.m13458(this, arrayList);
    }
}

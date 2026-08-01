package p356;

import androidx.compose.foundation.lazy.C0755;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import p217.AbstractC7964;
import p217.AbstractC7968;
import p330.C8796;
import top.suzhelan.qstory.hook.plugin.entity.NewFriendInfo;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪子兰世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8898 extends AbstractC7964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C0755 f25067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final LinkedHashMap f25068 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public List f25069 = EmptyList.INSTANCE;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public Map f25065 = AbstractC4338.m8781();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final LinkedHashMap f25064 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public String f25066 = "";

    public C8898() {
        this.f22041.put(1, new C8899(this, 0));
        this.f22041.put(2, new C8899(this, 1));
        this.f22042 = new C8796(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14527() {
        List list;
        ArrayList arrayList = new ArrayList();
        if (this.f25066.length() == 0) {
            list = this.f25069;
        } else {
            String strM4563 = AbstractC2442.m4563(this.f25066, Locale.ROOT, -3937688152349869479L);
            List list2 = this.f25069;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                NewFriendInfo newFriendInfo = (NewFriendInfo) obj;
                String str = newFriendInfo.nickname;
                "nickname";
                str.getClass();
                Locale locale = Locale.ROOT;
                if (!AbstractC5143.m10171(AbstractC2442.m4563(str, locale, -3937688152349869479L), strM4563, false)) {
                    String str2 = newFriendInfo.uin;
                    "uin";
                    str2.getClass();
                    if (!AbstractC5143.m10171(str2, this.f25066, false)) {
                        String str3 = newFriendInfo.remark;
                        "remark";
                        str3.getClass();
                        String lowerCase = str3.toLowerCase(locale);
                        "toLowerCase(...)";
                        lowerCase.getClass();
                        if (AbstractC5143.m10171(lowerCase, strM4563, false)) {
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
        Iterator it = AbstractC4343.m8814(linkedHashMap.keySet()).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            if (list3 != null && !list3.isEmpty()) {
                String str4 = (String) this.f25065.get(Integer.valueOf(iIntValue));
                if (str4 == null) {
                    str4 = "\u5206\u7ec4 " + iIntValue;
                }
                boolean zM8917 = AbstractC4394.m8917(this.f25064.get(Integer.valueOf(iIntValue)), Boolean.FALSE);
                arrayList.add(new C8896(str4, iIntValue, list3.size(), !zM8917));
                if (!zM8917) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C8897((NewFriendInfo) it2.next()));
                    }
                }
            }
        }
        AbstractC7968.m13430(this, arrayList);
    }
}

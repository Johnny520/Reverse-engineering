package kotlin.text;

import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5144 extends AbstractC3055 {
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static String m10173(String str) throws IOException {
        if (AbstractC5143.m10164("|")) {
            C5919.m11249("marginPrefix must be non-blank string.");
            return null;
        }
        List listM10161 = AbstractC5143.m10161(str);
        int length = str.length();
        listM10161.size();
        int size = listM10161.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM10161) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && AbstractC5143.m10164(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC3056.m6673(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && AbstractC5138.m10124(str2, i3, "|", false)) ? str2.substring("|".length() + i3) : null;
                if (strSubstring != null) {
                    str2 = strSubstring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        AbstractC4343.m8829(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static String m10174(String str) throws IOException {
        int length;
        Comparable comparable;
        List listM10161 = AbstractC5143.m10161(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM10161) {
            if (!AbstractC5143.m10164((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!AbstractC3056.m6673(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM10161.size();
        int size = listM10161.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM10161) {
            int i = length + 1;
            if (length < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            String str3 = (String) obj2;
            String strM10169 = ((length == 0 || length == size) && AbstractC5143.m10164(str3)) ? null : AbstractC5143.m10169(iIntValue, str3);
            if (strM10169 != null) {
                arrayList3.add(strM10169);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC4343.m8829(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}

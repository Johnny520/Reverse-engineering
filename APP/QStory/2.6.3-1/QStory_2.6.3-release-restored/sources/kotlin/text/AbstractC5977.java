package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import p050.AbstractC7176;
import p191.AbstractC8568;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5977 extends AbstractC9004 {
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static String m10736(String str) throws IOException {
        if (AbstractC5976.m10731("|")) {
            C6755.m11869("marginPrefix must be non-blank string.");
            return null;
        }
        List listM10723 = AbstractC5976.m10723(str);
        int length = str.length();
        listM10723.size();
        int size = listM10723.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM10723) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && AbstractC5976.m10731(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!AbstractC8568.m13623(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && AbstractC5971.m10695(str2, i3, "|", false)) ? str2.substring("|".length() + i3) : null;
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
        AbstractC5176.m9368(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static String m10737(String str) throws IOException {
        int length;
        Comparable comparable;
        List listM10723 = AbstractC5976.m10723(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM10723) {
            if (!AbstractC5976.m10731((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
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
                if (!AbstractC8568.m13623(str2.charAt(length))) {
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
        listM10723.size();
        int size = listM10723.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM10723) {
            int i = length + 1;
            if (length < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            String str3 = (String) obj2;
            String strM10721 = ((length == 0 || length == size) && AbstractC5976.m10731(str3)) ? null : AbstractC5976.m10721(iIntValue, str3);
            if (strM10721 != null) {
                arrayList3.add(strM10721);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC5176.m9368(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}

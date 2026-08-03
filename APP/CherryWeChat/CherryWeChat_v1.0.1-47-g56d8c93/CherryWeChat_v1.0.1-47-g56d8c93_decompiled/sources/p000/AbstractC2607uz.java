package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: uz */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2607uz extends AbstractC0671Pj {
    /* JADX INFO: renamed from: D */
    public static String m5118D(String str) {
        List listSingletonList;
        int length;
        Comparable comparable;
        C2287no c2287no = new C2287no(str);
        if (c2287no.hasNext()) {
            Object next = c2287no.next();
            if (c2287no.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c2287no.hasNext()) {
                    arrayList.add(c2287no.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = C0452Kf.f1484a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSingletonList) {
            if (!AbstractC2564tz.m5059T((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC2539ta.m5019d0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
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
                char cCharAt = str2.charAt(length);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
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
        listSingletonList.size();
        int iM4976a0 = AbstractC2496sa.m4976a0(listSingletonList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listSingletonList) {
            int i = length + 1;
            if (length < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            String str3 = (String) obj2;
            String strM5052M = ((length == 0 || length == iM4976a0) && AbstractC2564tz.m5059T(str3)) ? null : AbstractC2564tz.m5052M(iIntValue, str3);
            if (strM5052M != null) {
                arrayList4.add(strM5052M);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC2453ra.m4899i0(arrayList4, sb, "\n", "", "", null);
        return sb.toString();
    }
}

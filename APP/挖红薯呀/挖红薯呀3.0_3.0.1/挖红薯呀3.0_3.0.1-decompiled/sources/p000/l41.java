package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l41 extends w60 {
    /* JADX DEBUG: Class process forced to load method for inline: ye.N(java.util.ArrayList, java.lang.StringBuilder):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static String m1976P(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        List listM1771c0 = k41.m1771c0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1771c0) {
            if (!k41.m1769a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1001ze.m5585E(arrayList));
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
                if (!p30.m2978N(str2.charAt(length))) {
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
        listM1771c0.size();
        int size = listM1771c0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM1771c0) {
            int i = length + 1;
            if (length < 0) {
                o30.m2757A();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == size) && k41.m1769a0(str3)) {
                strSubstring = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    C0921xc.m5126g("Requested character count ", iIntValue, " is less than zero.");
                    return null;
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0960ye.m5243M(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}

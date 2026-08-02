package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qv2 extends se {
    /* JADX DEBUG: Class process forced to load method for inline: du.t0(java.util.List, java.lang.StringBuilder, v, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String S(String str) {
        int length;
        Comparable comparable;
        List listV0 = pv2.v0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listV0) {
            if (!pv2.s0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
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
                if (!xe1.Q(str2.charAt(length))) {
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
        listV0.size();
        int size = listV0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listV0) {
            int i = length + 1;
            if (length < 0) {
                eu.a0();
                throw null;
            }
            String str3 = (String) obj2;
            String strJ0 = ((length == 0 || length == size) && pv2.s0(str3)) ? null : pv2.j0(str3, iIntValue);
            if (strJ0 != null) {
                arrayList3.add(strJ0);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        du.t0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String T(String str) {
        if (pv2.s0("|")) {
            s.j("marginPrefix must be non-blank string.");
            return null;
        }
        List listV0 = pv2.v0(str);
        int length = str.length();
        listV0.size();
        int size = listV0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listV0) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && pv2.s0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!xe1.Q(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String strSubstring = (i3 != -1 && wv2.c0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
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
        du.t0(arrayList, sb, null, 124);
        return sb.toString();
    }
}

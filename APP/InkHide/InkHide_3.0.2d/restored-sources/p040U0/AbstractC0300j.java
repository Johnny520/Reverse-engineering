package p040U0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p006D.AbstractC0079h;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0124l;
import p011F0.AbstractC0125m;
import p011F0.C0113a;
import p021K0.C0169h;
import p027N0.AbstractC0223g;
import p038T0.AbstractC0284i;

/* JADX INFO: renamed from: U0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0300j extends AbstractC0079h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static String m529Y(String str) {
        int length;
        Comparable comparable;
        String strSubstring;
        AbstractC0223g.m418e(str, "<this>");
        List listM498Z = AbstractC0284i.m498Z(new C0169h(new C0169h(str, new C0113a(3, AbstractC0120h.m252Z(new String[]{"\r\n", "\n", "\r"}))), new C0113a(4, str)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM498Z) {
            if (!AbstractC0307q.m534d0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(arrayList));
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
                if (!AbstractC0079h.m166D(str2.charAt(length))) {
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
        listM498Z.size();
        int iM285Y = AbstractC0124l.m285Y(listM498Z);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM498Z) {
            int i2 = length + 1;
            if (length < 0) {
                AbstractC0124l.m288b0();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM285Y) && AbstractC0307q.m534d0(str3)) {
                strSubstring = null;
            } else {
                AbstractC0223g.m418e(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                AbstractC0223g.m417d(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList3.add(strSubstring);
            }
            length = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0123k.m270l0(arrayList3, sb, "\n", "", "", "...", null);
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }
}

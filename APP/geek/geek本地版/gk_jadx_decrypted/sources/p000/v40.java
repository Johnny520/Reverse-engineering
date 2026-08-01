package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v40 extends AbstractC0126ct {
    /* JADX INFO: renamed from: z */
    public static String m2489z(String str) {
        List listM1469C;
        AbstractC0346ip.m1503o("<this>", str);
        C0078br c0078br = new C0078br(str);
        if (c0078br.hasNext()) {
            Object next = c0078br.next();
            if (c0078br.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c0078br.hasNext()) {
                    arrayList.add(c0078br.next());
                }
                listM1469C = arrayList;
            } else {
                listM1469C = AbstractC0346ip.m1469C(next);
            }
        } else {
            listM1469C = C0931yi.f5342a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM1469C) {
            if (!b50.m522H((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0098cb.m657h0(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                char cCharAt = str2.charAt(length2);
                if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Integer num = (Integer) AbstractC0012ab.m84k0(arrayList3);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM1469C.size();
        int size2 = listM1469C.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listM1469C) {
            int i3 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                AbstractC0062bb.m550g0();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i != 0 && i != size2) || !b50.m522H(str3)) {
                AbstractC0346ip.m1503o("<this>", str3);
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                AbstractC0346ip.m1502n("substring(...)", strSubstring);
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0012ab.m82i0(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}

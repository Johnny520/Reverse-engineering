package p149d3;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0974n;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: d3.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1977e extends AbstractC2352g {
    /* JADX INFO: renamed from: K */
    public static String m3648K(String str) {
        List listM4211y;
        int length;
        Comparable comparable;
        AbstractC1665j.m2985e(str, "<this>");
        C1974b c1974b = new C1974b(str);
        if (c1974b.hasNext()) {
            Object next = c1974b.next();
            if (c1974b.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c1974b.hasNext()) {
                    arrayList.add(c1974b.next());
                }
                listM4211y = arrayList;
            } else {
                listM4211y = AbstractC2352g.m4211y(next);
            }
        } else {
            listM4211y = C0981u.f3047d;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM4211y) {
            if (!AbstractC1976d.m3637e0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0974n.m2029K(arrayList2, 10));
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
                if (!AbstractC1926h.m3580w(str2.charAt(length))) {
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
        listM4211y.size();
        int iM4208u = AbstractC2352g.m4208u(listM4211y);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listM4211y) {
            int i5 = length + 1;
            if (length < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            String str3 = (String) obj2;
            String strM3630X = ((length == 0 || length == iM4208u) && AbstractC1976d.m3637e0(str3)) ? null : AbstractC1976d.m3630X(str3, iIntValue);
            if (strM3630X != null) {
                arrayList4.add(strM3630X);
            }
            length = i5;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC0973m.m2015V(arrayList4, sb, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: L */
    public static String m3649L(String str) {
        List listM4211y;
        AbstractC1665j.m2985e(str, "<this>");
        if (AbstractC1976d.m3637e0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        C1974b c1974b = new C1974b(str);
        if (c1974b.hasNext()) {
            Object next = c1974b.next();
            if (c1974b.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c1974b.hasNext()) {
                    arrayList.add(c1974b.next());
                }
                listM4211y = arrayList;
            } else {
                listM4211y = AbstractC2352g.m4211y(next);
            }
        } else {
            listM4211y = C0981u.f3047d;
        }
        int length = str.length();
        listM4211y.size();
        int iM4208u = AbstractC2352g.m4208u(listM4211y);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listM4211y.iterator();
        int i5 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                AbstractC0973m.m2015V(arrayList2, sb, null, 124);
                return sb.toString();
            }
            Object next2 = it.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC2352g.m4187J();
                throw null;
            }
            String str2 = (String) next2;
            if ((i5 != 0 && i5 != iM4208u) || !AbstractC1976d.m3637e0(str2)) {
                int length2 = str2.length();
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        i7 = -1;
                        break;
                    }
                    if (!AbstractC1926h.m3580w(str2.charAt(i7))) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1 && AbstractC1983k.m3655R(str2, "|", i7, false)) {
                    strSubstring = str2.substring("|".length() + i7);
                    AbstractC1665j.m2984d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i5 = i6;
        }
    }
}

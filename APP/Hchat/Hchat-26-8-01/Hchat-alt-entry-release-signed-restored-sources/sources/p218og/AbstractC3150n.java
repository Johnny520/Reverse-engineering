package p218og;

import ac.AbstractC0063p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p136j8.C2104o;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: og.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3150n extends AbstractC0063p {
    /* JADX DEBUG: Class process forced to load method for inline: tf.m.z1(java.util.List, java.lang.StringBuilder, java.lang.String, b0.d0, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m6728R(String str) {
        int length;
        List listM6725x0 = AbstractC3149m.m6725x0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM6725x0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
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
                if (!AbstractC0000a.m95v0(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) AbstractC4166m.m8395D1(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM6725x0.size();
        int size = listM6725x0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listM6725x0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length3);
                AbstractC4166m.m8428z1(arrayList3, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it2.next();
            int i9 = length + 1;
            if (length < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            String str3 = (String) next;
            String strM6711j0 = ((length == 0 || length == size) && AbstractC3149m.m6721t0(str3)) ? null : AbstractC3149m.m6711j0(iIntValue, str3);
            if (strM6711j0 != null) {
                arrayList3.add(strM6711j0);
            }
            length = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static String m6729S(String str) {
        if (AbstractC3149m.m6721t0("|")) {
            C2104o.m5294t("marginPrefix must be non-blank string.");
            return null;
        }
        List listM6725x0 = AbstractC3149m.m6725x0(str);
        int length = str.length();
        listM6725x0.size();
        int size = listM6725x0.size() - 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = listM6725x0.iterator();
        int i9 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb2 = new StringBuilder(length);
                AbstractC4166m.m8428z1(arrayList, sb2, "\n", null, 124);
                return sb2.toString();
            }
            Object next = it.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            String str2 = (String) next;
            if ((i9 != 0 && i9 != size) || !AbstractC3149m.m6721t0(str2)) {
                int length2 = str2.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        i11 = -1;
                        break;
                    }
                    if (!AbstractC0000a.m95v0(str2.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                if (i11 != -1 && AbstractC3156t.m6739c0(str2, "|", i11, false)) {
                    strSubstring = str2.substring("|".length() + i11);
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i9 = i10;
        }
    }
}

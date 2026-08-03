package p010aa;

import android.text.TextUtils;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p276sf.C3958e;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: aa.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0038f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m300a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        ArrayList arrayListM304e = m304e(str);
        if (arrayListM304e.isEmpty()) {
            return false;
        }
        Iterator it = arrayListM304e.iterator();
        while (it.hasNext()) {
            if (m301b((String) it.next(), str2, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m301b(String str, String str2, String str3) {
        C3958e c3958eM303d = m303d(str);
        return c3958eM303d != null && AbstractC1416l.m3825a(c3958eM303d.f12961g, str2) && AbstractC1416l.m3825a(c3958eM303d.f12962h, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m302c(String str, String str2) {
        str2.getClass();
        ArrayList arrayListM304e = m304e(str2);
        if (!arrayListM304e.isEmpty()) {
            int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6);
            if (iM6719r0 > 0) {
                str = str.substring(iM6719r0 + 2);
            }
            if (!arrayListM304e.isEmpty()) {
                Iterator it = arrayListM304e.iterator();
                while (it.hasNext()) {
                    if (AbstractC3149m.m6709h0(str, (String) it.next(), true)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C3958e m303d(String str) {
        char[] cArr = {'/', '#', ':', 65306};
        ArrayList arrayList = new ArrayList(4);
        for (int i9 = 0; i9 < 4; i9++) {
            arrayList.add(Integer.valueOf(AbstractC3149m.m6718q0(str, cArr[i9], 0, 6)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() > 0) {
                arrayList2.add(next);
            }
        }
        Integer num = (Integer) AbstractC4166m.m8395D1(arrayList2);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String string = AbstractC3149m.m6703R0(str.substring(0, iIntValue)).toString();
        String string2 = AbstractC3149m.m6703R0(str.substring(iIntValue + 1)).toString();
        if (string.length() == 0 || string2.length() == 0) {
            return null;
        }
        return new C3958e(string, string2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static ArrayList m304e(String str) {
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{"|", ",", "，", "\n", "\r"});
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6692G0));
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m305f(String str, String str2, String str3) {
        ArrayList arrayListM304e = m304e(str);
        if (arrayListM304e.isEmpty()) {
            return false;
        }
        Iterator it = arrayListM304e.iterator();
        while (it.hasNext()) {
            if (m306g((String) it.next(), str2, str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m306g(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (m301b(string, str2, str3)) {
            return true;
        }
        if (m303d(string) != null) {
            return false;
        }
        return AbstractC1416l.m3825a(string, str2) || AbstractC1416l.m3825a(string, str3);
    }
}

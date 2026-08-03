package p080fb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p000a.AbstractC0000a;
import p027c0.C0361f;
import p136j8.C2104o;
import p172lg.C2563c;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: fb.y1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1194y1 {

    /* JADX INFO: renamed from: a */
    public static final C3147k f4014a = new C3147k("^@@\\s+-(\\d+)(?:,\\d+)?\\s+\\+\\d+(?:,\\d+)?\\s+@@.*$");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m3243a(ArrayList arrayList, ArrayList arrayList2, int i9) {
        int iIntValue;
        if (i9 < 0 || arrayList2.size() + i9 > arrayList.size()) {
            return false;
        }
        Iterable iterableM45X = AbstractC0000a.m45X(arrayList2);
        if ((iterableM45X instanceof Collection) && ((Collection) iterableM45X).isEmpty()) {
            return true;
        }
        Iterator it = iterableM45X.iterator();
        do {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                return true;
            }
            iIntValue = ((Number) c2563c.next()).intValue();
        } while (AbstractC1416l.m3825a(arrayList.get(i9 + iIntValue), arrayList2.get(iIntValue)));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m3244b(ArrayList arrayList, ArrayList arrayList2, int i9) {
        int iIntValue;
        if (i9 < 0 || arrayList2.size() + i9 > arrayList.size()) {
            return false;
        }
        Iterable iterableM45X = AbstractC0000a.m45X(arrayList2);
        if ((iterableM45X instanceof Collection) && ((Collection) iterableM45X).isEmpty()) {
            return true;
        }
        Iterator it = iterableM45X.iterator();
        do {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                return true;
            }
            iIntValue = ((Number) c2563c.next()).intValue();
        } while (AbstractC1416l.m3825a(AbstractC3149m.m6703R0((String) arrayList.get(i9 + iIntValue)).toString(), AbstractC3149m.m6703R0((String) arrayList2.get(iIntValue)).toString()));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final String m3245c(LinkedHashMap linkedHashMap, C0361f c0361f, String str) {
        return linkedHashMap.containsKey(str) ? (String) linkedHashMap.get(str) : (String) c0361f.invoke(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m3246d(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, C1188w1 c1188w1) {
        String str = c1188w1.f3995a;
        linkedHashMap.put(str, c1188w1.f3996b);
        linkedHashMap2.put(str, c1188w1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3247e(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!AbstractC3149m.m6694I0(str2, ' ') && !AbstractC3149m.m6694I0(str2, '+') && !AbstractC3149m.m6694I0(str2, '-') && !AbstractC1416l.m3825a(str2, "\\ No newline at end of file")) {
                C2104o.m5291q(AbstractC4855en.m9263g("补丁行必须以空格、+ 或 - 开头: ", str));
                return;
            }
        }
    }
}

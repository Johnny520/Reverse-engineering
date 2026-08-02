package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oi2 implements Comparable {
    public static final o72 i = new o72("^[A-Za-z]:.*");
    public final String h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ak.b(sz0, th2, java.util.List, u00):java.lang.Object, dq1.M(oh2, u00):java.lang.Object, fg1.K(java.util.HashSet, java.util.LinkedHashSet, java.lang.String, java.util.LinkedHashMap, java.util.ArrayList, java.util.Set, java.lang.String):void, j51.A(sz0, java.util.List, u00):java.lang.Object, sz0.s(java.io.File, java.io.File, pb1):void] */
    public /* synthetic */ oi2(String str) {
        this.h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String a(String str, String str2) {
        if (pv2.s0(str2)) {
            s.j("Relative script path must not be blank.");
            return null;
        }
        String strReplace = str2.replace('\\', '/');
        strReplace.getClass();
        if (pv2.E0(strReplace, '/')) {
            s.c("Relative script path must not be absolute: ".concat(str2));
            return null;
        }
        if (i.b(strReplace)) {
            s.c("Relative script path must not be absolute: ".concat(str2));
            return null;
        }
        int iU0 = pv2.u0(str, '/', 0, 6);
        List listC0 = pv2.C0(iU0 == -1 ? "" : str.substring(0, iU0), new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (String str3 : pv2.C0(strReplace, new char[]{'/'})) {
            int iHashCode = str3.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 46) {
                    if (iHashCode == 1472 && str3.equals("..")) {
                        if (arrayList2.isEmpty()) {
                            s.c("Relative script path escapes the script root: ".concat(str2));
                            return null;
                        }
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        arrayList2.add(str3);
                    }
                } else if (!str3.equals(".")) {
                    arrayList2.add(str3);
                }
            } else if (!str3.equals("")) {
                arrayList2.add(str3);
            }
        }
        return xe1.Y(du.u0(arrayList2, "/", null, null, null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((oi2) obj).h;
        str.getClass();
        return this.h.compareTo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof oi2) {
            return t11.l(this.h, ((oi2) obj).h);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.h;
    }
}

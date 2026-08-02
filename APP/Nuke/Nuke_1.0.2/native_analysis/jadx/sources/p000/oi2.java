package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oi2 implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final o72 f7689i = new o72("^[A-Za-z]:.*");

    /* JADX INFO: renamed from: h */
    public final String f7690h;

    public /* synthetic */ oi2(String str) {
        this.f7690h = str;
    }

    /* JADX INFO: renamed from: a */
    public static final String m3564a(String str, String str2) {
        if (pv2.m4006s0(str2)) {
            C0676s.m4651j("Relative script path must not be blank.");
            return null;
        }
        String strReplace = str2.replace('\\', '/');
        strReplace.getClass();
        if (pv2.m3989E0(strReplace, '/')) {
            C0676s.m4645c("Relative script path must not be absolute: ".concat(str2));
            return null;
        }
        if (f7689i.m3539b(strReplace)) {
            C0676s.m4645c("Relative script path must not be absolute: ".concat(str2));
            return null;
        }
        int iM4008u0 = pv2.m4008u0(str, '/', 0, 6);
        List listM3987C0 = pv2.m3987C0(iM4008u0 == -1 ? "" : str.substring(0, iM4008u0), new char[]{'/'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3987C0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (String str3 : pv2.m3987C0(strReplace, new char[]{'/'})) {
            int iHashCode = str3.hashCode();
            if (iHashCode != 0) {
                if (iHashCode != 46) {
                    if (iHashCode == 1472 && str3.equals("..")) {
                        if (arrayList2.isEmpty()) {
                            C0676s.m4645c("Relative script path escapes the script root: ".concat(str2));
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
        return xe1.m6107Y(AbstractC0142du.m1165u0(arrayList2, "/", null, null, null, 62));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        String str = ((oi2) obj).f7690h;
        str.getClass();
        return this.f7690h.compareTo(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oi2) {
            return t11.m5086l(this.f7690h, ((oi2) obj).f7690h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7690h.hashCode();
    }

    public final String toString() {
        return this.f7690h;
    }
}

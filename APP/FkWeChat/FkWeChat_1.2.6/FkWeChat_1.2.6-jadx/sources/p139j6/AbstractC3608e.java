package p139j6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p155k6.AbstractC4007o;
import p170l6.C4676o;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;

/* JADX INFO: renamed from: j6.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3608e {
    /* JADX INFO: renamed from: a */
    public static final boolean m13494a(C2363j c2363j, C2363j c2363j2) {
        c2363j.getClass();
        c2363j2.getClass();
        return c2363j2.m8560o() >= c2363j.m8560o() && c2363j2.m8561p() <= c2363j.m8561p();
    }

    /* JADX INFO: renamed from: b */
    public static final Set m13495b(String str, String str2) {
        str.getClass();
        str2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iM33152n0 = AbstractC8621f0.m33152n0(str, str2, 0, false, 4, null);
        if (iM33152n0 < 0) {
            return AbstractC5068b1.m20483e();
        }
        linkedHashSet.add(Integer.valueOf(iM33152n0));
        if (iM33152n0 != AbstractC8621f0.m33140h0(str) - str2.length()) {
            int iM33152n02 = AbstractC8621f0.m33152n0(str, str2, iM33152n0 + str2.length(), false, 4, null);
            while (iM33152n02 > 0) {
                linkedHashSet.add(Integer.valueOf(iM33152n02));
                iM33152n02 = AbstractC8621f0.m33152n0(str, str2, iM33152n02 + str2.length(), false, 4, null);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m13496c(String str, String str2, int i10) {
        if (i10 == 0) {
            return false;
        }
        if (!AbstractC4007o.m15937c().contains(Character.valueOf(str2.charAt(i10 - 1)))) {
            return false;
        }
        int i11 = i10 - 2;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (i11 < 0) {
                break;
            }
            char cCharAt = str2.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                i11--;
                z11 = true;
            } else if (cCharAt == '.') {
                if (z10) {
                    return false;
                }
                i11--;
                z10 = true;
            } else if (cCharAt == '-') {
                if (i11 != 0) {
                    char cCharAt2 = str2.charAt(i11 - 1);
                    if (Character.isLetterOrDigit(cCharAt2) || cCharAt2 == '_') {
                        return false;
                    }
                }
            } else if (cCharAt == '_') {
                i11--;
            } else if (Character.isLetter(cCharAt)) {
                return false;
            }
        }
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m13497d(String str, String str2, int i10) {
        str.getClass();
        str2.getClass();
        if (i10 == AbstractC8621f0.m33140h0(str2) || str2.length() == str.length()) {
            return true;
        }
        char cCharAt = str2.charAt(Math.min(str.length() + i10, AbstractC8621f0.m33140h0(str2)));
        if (i10 == 0) {
            return (Character.isDigit(cCharAt) || Character.isLetter(cCharAt) || cCharAt == '_') ? false : true;
        }
        char cCharAt2 = str2.charAt(Math.max(i10 - 1, 0));
        return str.length() + i10 == str2.length() ? !(Character.isLetter(cCharAt2) || cCharAt2 == '_') || m13496c(str, str2, i10) : ((Character.isLetter(cCharAt2) && !m13496c(str, str2, i10)) || Character.isDigit(cCharAt) || Character.isLetter(cCharAt) || cCharAt == '_') ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m13498e(char c10) {
        String strValueOf = String.valueOf(c10);
        return AbstractC1061t.m3842c(strValueOf, "\n") || AbstractC1061t.m3842c(strValueOf, "\r") || AbstractC1061t.m3842c(strValueOf, "\r\n");
    }

    /* JADX INFO: renamed from: f */
    public static final int m13499f(String str, int i10) {
        str.getClass();
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (m13498e(str.charAt(i11))) {
                int i12 = i10;
                while (true) {
                    if (AbstractC8625h0.m33179y1(str, i12) == null || !(!m13498e(r1.charValue()))) {
                        break;
                    }
                    i12++;
                }
                return i12 - i10;
            }
        }
        return str.length() - i10;
    }

    /* JADX INFO: renamed from: g */
    public static final Set m13500g(Set set) {
        set.getClass();
        Set<C4676o> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(set2, 10));
        for (C4676o c4676o : set2) {
            arrayList.add(new C2363j(c4676o.getStart(), c4676o.getEnd()));
        }
        return AbstractC5081g0.m20564c1(arrayList);
    }
}

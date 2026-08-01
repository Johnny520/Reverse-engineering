package p155k6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p139j6.AbstractC3608e;
import p139j6.C3609f;
import p170l6.C4676o;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8625h0;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: k6.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4006n {

    /* JADX INFO: renamed from: a */
    public static final C4006n f11761a = new C4006n();

    /* JADX INFO: renamed from: a */
    public static boolean m15924a(char c10) {
        return Character.isDigit(c10) || AbstractC4007o.f11763b.contains(Character.valueOf(c10));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15925b(String str) {
        Character chM33179y1;
        str.getClass();
        return Character.isDigit(AbstractC8625h0.m33178x1(str)) || (AbstractC4007o.f11762a.contains(Character.valueOf(AbstractC8625h0.m33178x1(str))) && (chM33179y1 = AbstractC8625h0.m33179y1(str, 1)) != null && Character.isDigit(chM33179y1.charValue()));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15926c(String str) {
        str.getClass();
        return !AbstractC8621f0.m33156p0(str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15927d(Set set, String str) {
        str.getClass();
        return set.contains(str);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m15928e(char c10) {
        return c10 == '0' || c10 == '1';
    }

    /* JADX INFO: renamed from: f */
    public final int m15929f(String str) {
        if (AbstractC8611a0.m33075T(str, "0x", false, 2, null)) {
            return m15931h(str, new InterfaceC0184l() { // from class: k6.l
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Boolean.valueOf(C4006n.m15924a(((Character) obj).charValue()));
                }
            });
        }
        if (AbstractC8621f0.m33126a0(str, "0b", false, 2, null)) {
            return m15931h(str, new InterfaceC0184l() { // from class: k6.m
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return Boolean.valueOf(C4006n.m15928e(((Character) obj).charValue()));
                }
            });
        }
        int length = str.length();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt) || ((cCharAt == '-' && i12 == 0) || cCharAt == '_')) {
                i10++;
            } else if (cCharAt == '.' && !z10) {
                i10++;
                z10 = true;
            } else if (Character.toLowerCase(cCharAt) == 'e' && !z11) {
                i10++;
                z11 = true;
            } else if ((cCharAt == '+' || cCharAt == '-') && z11 && !z12) {
                i10++;
                z12 = true;
            } else {
                if (!AbstractC4007o.m15937c().contains(Character.valueOf(cCharAt)) || i11 >= 1) {
                    break;
                }
                i10++;
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public final Set m15930g(String str) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listM13523w = C3609f.f10025a.m13523w();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM13523w) {
            if (!AbstractC1061t.m3842c((String) obj, ".")) {
                arrayList.add(obj);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        for (String str2 : AbstractC7294t.m28915y(AbstractC7294t.m28915y(AbstractC7294t.m28916z(AbstractC5081g0.m20555Y(AbstractC8621f0.m33112S0(str, (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null)), new InterfaceC0184l() { // from class: k6.i
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj2) {
                return Boolean.valueOf(C4006n.m15927d(linkedHashSet, (String) obj2));
            }
        }), new InterfaceC0184l() { // from class: k6.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj2) {
                return Boolean.valueOf(C4006n.m15926c((String) obj2));
            }
        }), new InterfaceC0184l() { // from class: k6.k
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj2) {
                return Boolean.valueOf(C4006n.m15925b((String) obj2));
            }
        })) {
            Iterator it = AbstractC3608e.m13495b(str, str2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(str2);
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                C4006n c4006n = f11761a;
                if (!c4006n.m15932i(str, str2, iIntValue) || !c4006n.m15933j(str, iIntValue)) {
                    break;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                linkedHashSet2.add(new C4676o(iIntValue, c4006n.m15929f(lowerCase) + iIntValue));
            }
        }
        return AbstractC5081g0.m20564c1(linkedHashSet2);
    }

    /* JADX INFO: renamed from: h */
    public final int m15931h(String str, InterfaceC0184l interfaceC0184l) {
        int i10 = 2;
        String strSubstring = str.substring(2);
        for (int i11 = 0; i11 < strSubstring.length() && ((Boolean) interfaceC0184l.mo27m(Character.valueOf(strSubstring.charAt(i11)))).booleanValue(); i11++) {
            i10++;
        }
        return i10;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m15932i(String str, String str2, int i10) {
        int length = i10 + str2.length();
        if (length >= AbstractC8621f0.m33140h0(str)) {
            return true;
        }
        Character chM33179y1 = AbstractC8625h0.m33179y1(str, length);
        if (chM33179y1 == null) {
            return false;
        }
        return C3609f.f10025a.m13523w().contains(String.valueOf(chM33179y1.charValue()));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m15933j(String str, int i10) {
        if (i10 < 0) {
            return false;
        }
        if (i10 == 0) {
            return true;
        }
        Character chM33179y1 = AbstractC8625h0.m33179y1(str, Math.max(i10 - 1, 0));
        if (chM33179y1 == null) {
            return false;
        }
        return C3609f.f10025a.m13523w().contains(String.valueOf(chM33179y1.charValue()));
    }

    /* JADX INFO: renamed from: k */
    public final Set m15934k(String str) {
        str.getClass();
        return m15930g(str);
    }
}

package be;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007a7.C0019b;
import p025bc.AbstractC0255e;
import p089g1.C1275d;
import p157kd.AbstractC2390d;
import p215od.C3128a;
import p215od.C3131d;
import p233pd.C3403n;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3503g;
import p246qd.C3507k;
import p246qd.C3509m;
import p246qd.C3515s;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5798s;
import p351xe.C5796q;
import td.C4145a;

/* JADX INFO: renamed from: be.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0273c extends AbstractC0269a {

    /* JADX INFO: renamed from: h */
    public static final Map f802h;

    /* JADX INFO: renamed from: i */
    public static final Set f803i;

    /* JADX INFO: renamed from: j */
    public static final List f804j;

    /* JADX INFO: renamed from: g */
    public C4325u f805g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String[] strArr = {"java.lang.String", "str", "java.lang.Class", "cls", "java.lang.Throwable", "th", "java.lang.Object", "obj", "java.util.Iterator", "it", "java.util.HashMap", "map", "java.lang.Boolean", "bool", "java.lang.Short", "sh", "java.lang.Integer", "num", "java.lang.Character", "ch", "java.lang.Byte", "b", "java.lang.Float", "f", "java.lang.Long", "l", "java.lang.Double", "d", "java.lang.StringBuilder", "sb", "java.lang.Exception", "exc"};
        String str = AbstractC5798s.f23545a;
        HashMap map = new HashMap(16);
        for (int i9 = 0; i9 < 31; i9 += 2) {
            map.put(strArr[i9], strArr[i9 + 1]);
        }
        f802h = Collections.unmodifiableMap(map);
        Object[] objArr = {"size", "length", "list", "map", "next"};
        HashSet hashSet = new HashSet(5);
        for (int i10 = 0; i10 < 5; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                C1275d.m3412f(obj, "duplicate element: ");
                return;
            }
        }
        f803i = Collections.unmodifiableSet(hashSet);
        Object[] objArr2 = {"get", "set", "to", "parse", "read", "format"};
        ArrayList arrayList = new ArrayList(6);
        for (int i11 = 0; i11 < 6; i11++) {
            Object obj2 = objArr2[i11];
            Objects.requireNonNull(obj2);
            arrayList.add(obj2);
        }
        f804j = Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1110i(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.toUpperCase().equals(str)) {
                return str.toLowerCase();
            }
            String str2 = Character.toLowerCase(str.charAt(0)) + str.substring(1);
            if (!str2.equals(str)) {
                return str2;
            }
            if (str.length() < 3) {
                return str.concat("Var");
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "ApplyVariableNames";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f805g = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        String strM1111j;
        String strM1112k;
        Iterator it = c4322r.f14404D.iterator();
        while (it.hasNext()) {
            C3507k c3507kM7398b = ((C3515s) it.next()).m7398b();
            if (c3507kM7398b.f11415e) {
                strM1111j = "this";
            } else if (c3507kM7398b.f11416f && !AbstractC2390d.m5714c(c3507kM7398b.f11411a)) {
                List<C3515s> list = c3507kM7398b.f11413c;
                if (!AbstractC5798s.m10520n(list) || list.stream().anyMatch(new C0019b(1))) {
                    strM1111j = m1111j(c3507kM7398b.f11412b);
                } else {
                    for (C3515s c3515s : list) {
                        String strM7401e = c3515s.m7401e();
                        if (strM7401e != null) {
                            strM1112k = strM7401e;
                        } else {
                            C4320p c4320p = c3515s.f11444i.f11420j;
                            if (c4320p != null) {
                                strM1112k = m1112k(c3515s, c4320p);
                                if (!AbstractC2390d.m5714c(strM1112k)) {
                                    strM1112k = null;
                                }
                            }
                        }
                        if (strM1112k != null) {
                            strM1111j = strM1112k;
                            break;
                        }
                    }
                    strM1111j = m1111j(c3507kM7398b.f11412b);
                }
            } else {
                strM1111j = null;
            }
            if (strM1111j != null) {
                c3507kM7398b.f11411a = strM1111j;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m1111j(AbstractC3506j abstractC3506j) {
        abstractC3506j.getClass();
        if (abstractC3506j instanceof C3503g) {
            return abstractC3506j.mo7343o().f11436g.toLowerCase();
        }
        if (abstractC3506j instanceof C3497a) {
            return AbstractC0255e.m1020i(m1111j(abstractC3506j.mo7341h()), "Arr");
        }
        if (abstractC3506j instanceof C3499c) {
            return C5796q.m10497a(abstractC3506j.mo7350l().toLowerCase());
        }
        if (!abstractC3506j.mo7351v()) {
            return C5796q.m10497a(abstractC3506j.toString());
        }
        String str = (String) f802h.get(abstractC3506j.mo7350l());
        if (str != null) {
            return str;
        }
        String strM6646k = C3128a.m6637e(this.f805g, abstractC3506j).m6646k();
        String strM1110i = m1110i(strM6646k);
        if (strM1110i != null) {
            return strM1110i;
        }
        String strM10497a = C5796q.m10497a(strM6646k.toLowerCase());
        return strM6646k.equals(strM10497a) ? strM10497a.concat("Var") : strM10497a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r8.f9217g.mo6235a(md.EnumC2824a.f9122H) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0170  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1112k(C3515s c3515s, C4320p c4320p) {
        String strM1112k;
        int iOrdinal = c4320p.f14396k.ordinal();
        String strSubstring = null;
        if (iOrdinal == 3 || iOrdinal == 8) {
            for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
                abstractC3508l.getClass();
                if ((abstractC3508l instanceof C3509m) && (strM1112k = m1112k(c3515s, ((C3509m) abstractC3508l).f11421l)) != null) {
                    return strM1112k;
                }
            }
        } else {
            if (iOrdinal == 22) {
                return "length";
            }
            Map map = f802h;
            if (iOrdinal == 34) {
                C3131d c3131d = ((C3403n) c4320p).f11005p;
                String str = c3131d.f10157n;
                C3128a c3128a = c3131d.f10153j;
                if ("getInstance".equals(str)) {
                    String str2 = (String) map.get(c3128a.f10141j);
                    if (str2 != null) {
                        return str2;
                    }
                    String strM6646k = c3128a.m6646k();
                    String strM1110i = m1110i(strM6646k);
                    if (strM1110i != null) {
                        return strM1110i;
                    }
                    String strM10497a = C5796q.m10497a(strM6646k.toLowerCase());
                    return strM6646k.equals(strM10497a) ? strM10497a.concat("Var") : strM10497a;
                }
                Iterator it = f804j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (str.startsWith(str3)) {
                        strSubstring = str.substring(str3.length());
                        break;
                    }
                }
                if (strSubstring != null) {
                    return m1110i(strSubstring);
                }
                if ("iterator".equals(str)) {
                    return "it";
                }
                if ("toString".equals(str)) {
                    String str4 = (String) map.get(c3128a.f10141j);
                    if (str4 != null) {
                        return str4;
                    }
                    String strM6646k2 = c3128a.m6646k();
                    String strM1110i2 = m1110i(strM6646k2);
                    if (strM1110i2 != null) {
                        return strM1110i2;
                    }
                    String strM10497a2 = C5796q.m10497a(strM6646k2.toLowerCase());
                    return strM6646k2.equals(strM10497a2) ? strM10497a2.concat("Var") : strM10497a2;
                }
                if ("forName".equals(str) && c3128a.f10138g.equals(AbstractC3506j.f11395l)) {
                    return (String) map.get("java.lang.Class");
                }
                if (!f803i.contains(str)) {
                    String strM1111j = m1111j(c3515s.m7398b().f11412b);
                    if (!strM1111j.equalsIgnoreCase(str)) {
                        if (!C5796q.m10501g(str)) {
                            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                        }
                        return AbstractC0255e.m1020i(strM1111j, str);
                    }
                }
                return str;
            }
            if (iOrdinal != 37) {
                if (iOrdinal == 38) {
                    C4145a c4145a = (C4145a) c4320p;
                    InterfaceC4317m interfaceC4317mM3342g = this.f805g.f14442h.m3342g(c4145a);
                    C4322r c4322r = interfaceC4317mM3342g instanceof C4322r ? (C4322r) interfaceC4317mM3342g : null;
                    if (c4322r != null) {
                    }
                    C3128a c3128a2 = c4145a.f13662o.f10153j;
                    String str5 = (String) map.get(c3128a2.f10141j);
                    if (str5 != null) {
                        return str5;
                    }
                    String strM6646k3 = c3128a2.m6646k();
                    String strM1110i3 = m1110i(strM6646k3);
                    if (strM1110i3 != null) {
                        return strM1110i3;
                    }
                    String strM10497a3 = C5796q.m10497a(strM6646k3.toLowerCase());
                    return strM6646k3.equals(strM10497a3) ? strM10497a3.concat("Var") : strM10497a3;
                }
            }
        }
        return null;
    }
}

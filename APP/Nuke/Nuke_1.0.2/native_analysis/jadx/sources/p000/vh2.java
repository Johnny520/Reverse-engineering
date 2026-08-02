package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vh2 {

    /* JADX INFO: renamed from: a */
    public static final t21 f11965a = u21.f11071d;

    /* JADX INFO: renamed from: b */
    public static final Set f11966b = AbstractC0460mg.m3106u0(new String[]{"manifestVersion", "apiVersion", "id", "name", "version", "versionCode", "entry", "description", "author", "configSchema", "permissions"});

    /* JADX INFO: renamed from: c */
    public static final Set f11967c = AbstractC0460mg.m3106u0(new String[]{"network", "host", "filesystem"});

    /* JADX INFO: renamed from: d */
    public static final Set f11968d = AbstractC0460mg.m3106u0(new String[]{"origins", "privateNetwork", "any"});

    /* JADX INFO: renamed from: e */
    public static final Set f11969e = AbstractC0460mg.m3106u0(new String[]{"reflect", "hook", "classes", "reason"});

    /* JADX INFO: renamed from: f */
    public static final Set f11970f = AbstractC0460mg.m3106u0(new String[]{"external", "host", "reason"});

    /* JADX INFO: renamed from: a */
    public static Boolean m5674a(d41 d41Var, String str) {
        if (!d41Var.containsKey(str)) {
            return null;
        }
        i41 i41VarM5679f = m5679f(d41Var, str);
        if (i41VarM5679f.mo2264b()) {
            C0676s.m4645c(vi0.m5691j("Manifest field '", str, "' must be a boolean."));
            return null;
        }
        Boolean boolM2796d = l31.m2796d(i41VarM5679f);
        if (boolM2796d != null) {
            return boolM2796d;
        }
        C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' must be a boolean."));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static d41 m5675b(d41 d41Var, String str) {
        if (!d41Var.containsKey(str)) {
            return null;
        }
        Object obj = d41Var.get(str);
        d41 d41Var2 = obj instanceof d41 ? (d41) obj : null;
        if (d41Var2 != null) {
            return d41Var2;
        }
        C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' must be an object."));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m5676c(d41 d41Var, String str) {
        if (d41Var.containsKey(str)) {
            return m5680g(d41Var, str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static th2 m5677d(String str) {
        ri2 ri2Var;
        String strM6107Y;
        ji2 ji2Var;
        kh2 kh2Var;
        ch2 ch2Var;
        str.getClass();
        String strM4012y0 = pv2.m4012y0(str, "\ufeff");
        t21 t21Var = f11965a;
        t21Var.getClass();
        j31 j31Var = (j31) t21Var.m5453a(o31.f7461a, strM4012y0);
        d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
        if (d41Var == null) {
            C0676s.m4651j("Manifest root must be a JSON object.");
            return null;
        }
        Set setM3353b0 = np2.m3353b0(d41Var.f1861h.keySet(), f11966b);
        if (!setM3353b0.isEmpty()) {
            C0676s.m4645c("Manifest contains unknown fields: ".concat(AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b0), null, null, null, null, 63)));
            return null;
        }
        int iM5678e = m5678e(d41Var, "manifestVersion");
        if (iM5678e != 1) {
            C0676s.m4645c(vi0.m5688g("Unsupported manifest version: ", iM5678e));
            return null;
        }
        String strM5676c = m5676c(d41Var, "entry");
        if (strM5676c == null) {
            strM5676c = "main.js";
        }
        try {
            o72 o72Var = oi2.f7689i;
            String strM6107Y2 = xe1.m6107Y(strM5676c);
            d41 d41VarM5675b = m5675b(d41Var, "permissions");
            if (d41VarM5675b != null) {
                Set setM3353b02 = np2.m3353b0(d41VarM5675b.f1861h.keySet(), f11967c);
                if (!setM3353b02.isEmpty()) {
                    C0676s.m4645c("Manifest permissions contain unknown fields: ".concat(AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b02), null, null, null, null, 63)));
                    return null;
                }
                j31 j31Var2 = (j31) d41VarM5675b.get("network");
                if (j31Var2 == null) {
                    ji2Var = null;
                } else {
                    boolean z = j31Var2 instanceof i41;
                    List listM5681h = be0.f819h;
                    if (z) {
                        i41 i41Var = (i41) j31Var2;
                        if (i41Var.mo2264b()) {
                            d41 d41Var2 = j31Var2 instanceof d41 ? (d41) j31Var2 : null;
                            if (d41Var2 == null) {
                                C0676s.m4651j("Manifest field 'network' must be a boolean or object.");
                                return null;
                            }
                            Set setM3353b03 = np2.m3353b0(d41Var2.f1861h.keySet(), f11968d);
                            if (!setM3353b03.isEmpty()) {
                                C0676s.m4645c("Manifest network permission contains unknown fields: ".concat(AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b03), null, null, null, null, 63)));
                                return null;
                            }
                            Boolean boolM5674a = m5674a(d41Var2, "any");
                            boolean zBooleanValue = boolM5674a != null ? boolM5674a.booleanValue() : false;
                            if (zBooleanValue) {
                                ArrayList arrayListM5681h = !d41Var2.containsKey("origins") ? null : m5681h(d41Var2, "origins");
                                if (arrayListM5681h != null) {
                                    listM5681h = arrayListM5681h;
                                }
                            } else {
                                listM5681h = m5681h(d41Var2, "origins");
                            }
                            Boolean boolM5674a2 = m5674a(d41Var2, "privateNetwork");
                            ji2Var = new ji2(listM5681h, boolM5674a2 != null ? boolM5674a2.booleanValue() : false, zBooleanValue);
                        } else {
                            Boolean boolM2796d = l31.m2796d(i41Var);
                            if (boolM2796d == null) {
                                C0676s.m4651j("Manifest field 'network' must be a boolean or object.");
                                return null;
                            }
                            if (!boolM2796d.booleanValue()) {
                                C0676s.m4651j("Manifest field 'network' must be true or an object when present.");
                                return null;
                            }
                            ji2Var = new ji2(listM5681h, false, true);
                        }
                    }
                }
                d41 d41VarM5675b2 = m5675b(d41VarM5675b, "host");
                if (d41VarM5675b2 != null) {
                    Set setM3353b04 = np2.m3353b0(d41VarM5675b2.f1861h.keySet(), f11969e);
                    if (!setM3353b04.isEmpty()) {
                        C0676s.m4645c("Manifest host permission contains unknown fields: ".concat(AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b04), null, null, null, null, 63)));
                        return null;
                    }
                    Boolean boolM5674a3 = m5674a(d41VarM5675b2, "reflect");
                    boolean zBooleanValue2 = boolM5674a3 != null ? boolM5674a3.booleanValue() : false;
                    Boolean boolM5674a4 = m5674a(d41VarM5675b2, "hook");
                    boolean zBooleanValue3 = boolM5674a4 != null ? boolM5674a4.booleanValue() : false;
                    List listM5681h2 = !d41VarM5675b2.containsKey("classes") ? null : m5681h(d41VarM5675b2, "classes");
                    if (listM5681h2 == null) {
                        listM5681h2 = kh2.f5575e;
                    }
                    kh2Var = new kh2(zBooleanValue2, zBooleanValue3, listM5681h2, m5676c(d41VarM5675b2, "reason"));
                } else {
                    kh2Var = null;
                }
                d41 d41VarM5675b3 = m5675b(d41VarM5675b, "filesystem");
                if (d41VarM5675b3 != null) {
                    Set setM3353b05 = np2.m3353b0(d41VarM5675b3.f1861h.keySet(), f11970f);
                    if (!setM3353b05.isEmpty()) {
                        C0676s.m4645c("Manifest filesystem permission contains unknown fields: ".concat(AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b05), null, null, null, null, 63)));
                        return null;
                    }
                    Boolean boolM5674a5 = m5674a(d41VarM5675b3, "external");
                    boolean zBooleanValue4 = boolM5674a5 != null ? boolM5674a5.booleanValue() : false;
                    Boolean boolM5674a6 = m5674a(d41VarM5675b3, "host");
                    ch2Var = new ch2(m5676c(d41VarM5675b3, "reason"), zBooleanValue4, boolM5674a6 != null ? boolM5674a6.booleanValue() : false);
                } else {
                    ch2Var = null;
                }
                ri2Var = new ri2(ji2Var, kh2Var, ch2Var);
            } else {
                ri2Var = new ri2(null, null, null);
            }
            ri2 ri2Var2 = ri2Var;
            String strM5676c2 = m5676c(d41Var, "configSchema");
            if (strM5676c2 != null) {
                try {
                    strM6107Y = xe1.m6107Y(strM5676c2);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException(vi0.m5691j("Invalid manifest configSchema '", strM5676c2, "'."), e);
                }
            } else {
                strM6107Y = null;
            }
            int iM5678e2 = m5678e(d41Var, "apiVersion");
            String strM5680g = m5680g(d41Var, "id");
            String strM5680g2 = m5680g(d41Var, "name");
            String strM5680g3 = m5680g(d41Var, "version");
            i41 i41VarM5679f = m5679f(d41Var, "versionCode");
            if (i41VarM5679f.mo2264b()) {
                C0676s.m4651j("Manifest field 'versionCode' must be an integer.");
                return null;
            }
            Long lM2798f = l31.m2798f(i41VarM5679f);
            if (lM2798f != null) {
                return new th2(iM5678e, iM5678e2, strM5680g, strM5680g2, strM5680g3, lM2798f.longValue(), strM6107Y2, m5676c(d41Var, "description"), m5676c(d41Var, "author"), strM6107Y, ri2Var2);
            }
            C0676s.m4651j("Manifest field 'versionCode' must be an integer.");
            return null;
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(vi0.m5691j("Invalid manifest entry '", strM5676c, "'."), e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m5678e(d41 d41Var, String str) {
        i41 i41VarM5679f = m5679f(d41Var, str);
        if (i41VarM5679f.mo2264b()) {
            C0676s.m4645c(vi0.m5691j("Manifest field '", str, "' must be an integer."));
            return 0;
        }
        Integer numM2797e = l31.m2797e(i41VarM5679f);
        if (numM2797e != null) {
            return numM2797e.intValue();
        }
        C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' must be an integer."));
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public static i41 m5679f(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' is required."));
            return null;
        }
        i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
        if (i41Var != null) {
            return i41Var;
        }
        C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' must be a primitive value."));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m5680g(d41 d41Var, String str) {
        i41 i41VarM5679f = m5679f(d41Var, str);
        if (i41VarM5679f.mo2264b()) {
            return i41VarM5679f.mo2263a();
        }
        C0676s.m4645c(vi0.m5691j("Manifest field '", str, "' must be a string."));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m5681h(d41 d41Var, String str) {
        Object obj = d41Var.get(str);
        z21 z21Var = obj instanceof z21 ? (z21) obj : null;
        if (z21Var == null) {
            C0676s.m4651j(vi0.m5691j("Manifest field '", str, "' must be an array."));
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(z21Var, 10));
        int i = 0;
        for (Object obj2 : z21Var.f13709h) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            j31 j31Var = (j31) obj2;
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null) {
                throw new IllegalArgumentException("Manifest field '" + str + "[" + i + "]' must be a string.");
            }
            if (!i41Var.mo2264b()) {
                throw new IllegalArgumentException(("Manifest field '" + str + "[" + i + "]' must be a string.").toString());
            }
            arrayList.add(i41Var.mo2263a());
            i = i2;
        }
        return arrayList;
    }
}

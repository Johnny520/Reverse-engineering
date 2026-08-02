package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vh2 {
    public static final t21 a = u21.d;
    public static final Set b = mg.u0(new String[]{"manifestVersion", "apiVersion", "id", "name", "version", "versionCode", "entry", "description", "author", "configSchema", "permissions"});
    public static final Set c = mg.u0(new String[]{"network", "host", "filesystem"});
    public static final Set d = mg.u0(new String[]{"origins", "privateNetwork", "any"});
    public static final Set e = mg.u0(new String[]{"reflect", "hook", "classes", "reason"});
    public static final Set f = mg.u0(new String[]{"external", "host", "reason"});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean a(d41 d41Var, String str) {
        if (!d41Var.containsKey(str)) {
            return null;
        }
        i41 i41VarF = f(d41Var, str);
        if (i41VarF.b()) {
            s.c(vi0.j("Manifest field '", str, "' must be a boolean."));
            return null;
        }
        Boolean boolD = l31.d(i41VarF);
        if (boolD != null) {
            return boolD;
        }
        s.j(vi0.j("Manifest field '", str, "' must be a boolean."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d41 b(d41 d41Var, String str) {
        if (!d41Var.containsKey(str)) {
            return null;
        }
        Object obj = d41Var.get(str);
        d41 d41Var2 = obj instanceof d41 ? (d41) obj : null;
        if (d41Var2 != null) {
            return d41Var2;
        }
        s.j(vi0.j("Manifest field '", str, "' must be an object."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String c(d41 d41Var, String str) {
        if (d41Var.containsKey(str)) {
            return g(d41Var, str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static th2 d(String str) {
        ri2 ri2Var;
        String strY;
        ji2 ji2Var;
        kh2 kh2Var;
        ch2 ch2Var;
        str.getClass();
        String strY0 = pv2.y0(str, "\ufeff");
        t21 t21Var = a;
        t21Var.getClass();
        j31 j31Var = (j31) t21Var.a(o31.a, strY0);
        d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
        if (d41Var == null) {
            s.j("Manifest root must be a JSON object.");
            return null;
        }
        Set setB0 = np2.b0(d41Var.h.keySet(), b);
        if (!setB0.isEmpty()) {
            s.c("Manifest contains unknown fields: ".concat(du.u0(du.z0(setB0), null, null, null, null, 63)));
            return null;
        }
        int iE = e(d41Var, "manifestVersion");
        if (iE != 1) {
            s.c(vi0.g("Unsupported manifest version: ", iE));
            return null;
        }
        String strC = c(d41Var, "entry");
        if (strC == null) {
            strC = "main.js";
        }
        try {
            o72 o72Var = oi2.i;
            String strY2 = xe1.Y(strC);
            d41 d41VarB = b(d41Var, "permissions");
            if (d41VarB != null) {
                Set setB02 = np2.b0(d41VarB.h.keySet(), c);
                if (!setB02.isEmpty()) {
                    s.c("Manifest permissions contain unknown fields: ".concat(du.u0(du.z0(setB02), null, null, null, null, 63)));
                    return null;
                }
                j31 j31Var2 = (j31) d41VarB.get("network");
                if (j31Var2 == null) {
                    ji2Var = null;
                } else {
                    boolean z = j31Var2 instanceof i41;
                    List listH = be0.h;
                    if (z) {
                        i41 i41Var = (i41) j31Var2;
                        if (i41Var.b()) {
                            d41 d41Var2 = j31Var2 instanceof d41 ? (d41) j31Var2 : null;
                            if (d41Var2 == null) {
                                s.j("Manifest field 'network' must be a boolean or object.");
                                return null;
                            }
                            Set setB03 = np2.b0(d41Var2.h.keySet(), d);
                            if (!setB03.isEmpty()) {
                                s.c("Manifest network permission contains unknown fields: ".concat(du.u0(du.z0(setB03), null, null, null, null, 63)));
                                return null;
                            }
                            Boolean boolA = a(d41Var2, "any");
                            boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
                            if (zBooleanValue) {
                                ArrayList arrayListH = !d41Var2.containsKey("origins") ? null : h(d41Var2, "origins");
                                if (arrayListH != null) {
                                    listH = arrayListH;
                                }
                            } else {
                                listH = h(d41Var2, "origins");
                            }
                            Boolean boolA2 = a(d41Var2, "privateNetwork");
                            ji2Var = new ji2(listH, boolA2 != null ? boolA2.booleanValue() : false, zBooleanValue);
                        } else {
                            Boolean boolD = l31.d(i41Var);
                            if (boolD == null) {
                                s.j("Manifest field 'network' must be a boolean or object.");
                                return null;
                            }
                            if (!boolD.booleanValue()) {
                                s.j("Manifest field 'network' must be true or an object when present.");
                                return null;
                            }
                            ji2Var = new ji2(listH, false, true);
                        }
                    }
                }
                d41 d41VarB2 = b(d41VarB, "host");
                if (d41VarB2 != null) {
                    Set setB04 = np2.b0(d41VarB2.h.keySet(), e);
                    if (!setB04.isEmpty()) {
                        s.c("Manifest host permission contains unknown fields: ".concat(du.u0(du.z0(setB04), null, null, null, null, 63)));
                        return null;
                    }
                    Boolean boolA3 = a(d41VarB2, "reflect");
                    boolean zBooleanValue2 = boolA3 != null ? boolA3.booleanValue() : false;
                    Boolean boolA4 = a(d41VarB2, "hook");
                    boolean zBooleanValue3 = boolA4 != null ? boolA4.booleanValue() : false;
                    List listH2 = !d41VarB2.containsKey("classes") ? null : h(d41VarB2, "classes");
                    if (listH2 == null) {
                        listH2 = kh2.e;
                    }
                    kh2Var = new kh2(zBooleanValue2, zBooleanValue3, listH2, c(d41VarB2, "reason"));
                } else {
                    kh2Var = null;
                }
                d41 d41VarB3 = b(d41VarB, "filesystem");
                if (d41VarB3 != null) {
                    Set setB05 = np2.b0(d41VarB3.h.keySet(), f);
                    if (!setB05.isEmpty()) {
                        s.c("Manifest filesystem permission contains unknown fields: ".concat(du.u0(du.z0(setB05), null, null, null, null, 63)));
                        return null;
                    }
                    Boolean boolA5 = a(d41VarB3, "external");
                    boolean zBooleanValue4 = boolA5 != null ? boolA5.booleanValue() : false;
                    Boolean boolA6 = a(d41VarB3, "host");
                    ch2Var = new ch2(c(d41VarB3, "reason"), zBooleanValue4, boolA6 != null ? boolA6.booleanValue() : false);
                } else {
                    ch2Var = null;
                }
                ri2Var = new ri2(ji2Var, kh2Var, ch2Var);
            } else {
                ri2Var = new ri2(null, null, null);
            }
            ri2 ri2Var2 = ri2Var;
            String strC2 = c(d41Var, "configSchema");
            if (strC2 != null) {
                try {
                    strY = xe1.Y(strC2);
                } catch (IllegalArgumentException e2) {
                    throw new IllegalArgumentException(vi0.j("Invalid manifest configSchema '", strC2, "'."), e2);
                }
            } else {
                strY = null;
            }
            int iE2 = e(d41Var, "apiVersion");
            String strG = g(d41Var, "id");
            String strG2 = g(d41Var, "name");
            String strG3 = g(d41Var, "version");
            i41 i41VarF = f(d41Var, "versionCode");
            if (i41VarF.b()) {
                s.j("Manifest field 'versionCode' must be an integer.");
                return null;
            }
            Long lF = l31.f(i41VarF);
            if (lF != null) {
                return new th2(iE, iE2, strG, strG2, strG3, lF.longValue(), strY2, c(d41Var, "description"), c(d41Var, "author"), strY, ri2Var2);
            }
            s.j("Manifest field 'versionCode' must be an integer.");
            return null;
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException(vi0.j("Invalid manifest entry '", strC, "'."), e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int e(d41 d41Var, String str) {
        i41 i41VarF = f(d41Var, str);
        if (i41VarF.b()) {
            s.c(vi0.j("Manifest field '", str, "' must be an integer."));
            return 0;
        }
        Integer numE = l31.e(i41VarF);
        if (numE != null) {
            return numE.intValue();
        }
        s.j(vi0.j("Manifest field '", str, "' must be an integer."));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i41 f(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            s.j(vi0.j("Manifest field '", str, "' is required."));
            return null;
        }
        i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
        if (i41Var != null) {
            return i41Var;
        }
        s.j(vi0.j("Manifest field '", str, "' must be a primitive value."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(d41 d41Var, String str) {
        i41 i41VarF = f(d41Var, str);
        if (i41VarF.b()) {
            return i41VarF.a();
        }
        s.c(vi0.j("Manifest field '", str, "' must be a string."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList h(d41 d41Var, String str) {
        Object obj = d41Var.get(str);
        z21 z21Var = obj instanceof z21 ? (z21) obj : null;
        if (z21Var == null) {
            s.j(vi0.j("Manifest field '", str, "' must be an array."));
            return null;
        }
        ArrayList arrayList = new ArrayList(eu.B(z21Var, 10));
        int i = 0;
        for (Object obj2 : z21Var.h) {
            int i2 = i + 1;
            if (i < 0) {
                eu.a0();
                throw null;
            }
            j31 j31Var = (j31) obj2;
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null) {
                throw new IllegalArgumentException("Manifest field '" + str + "[" + i + "]' must be a string.");
            }
            if (!i41Var.b()) {
                throw new IllegalArgumentException(("Manifest field '" + str + "[" + i + "]' must be a string.").toString());
            }
            arrayList.add(i41Var.a());
            i = i2;
        }
        return arrayList;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nf2 {
    public static final t21 a = u21.d;
    public static final o72 b = new o72("^[a-z][A-Za-z0-9_]*$");
    public static final Set c = mg.u0(new String[]{"__proto__", "prototype", "constructor"});
    public static final Set d = mg.u0(new String[]{"plain", "nonBlank", "digits", "uri"});
    public static final Set e = mg.u0(new String[]{"schemaVersion", "type", "additionalProperties", "properties", "required", "ui"});
    public static final Set f = mg.u0(new String[]{"type", "title", "description", "default", "sensitive", "options", "ui", "minimum", "maximum", "multipleOf", "minLength", "maxLength", "format", "items", "minItems", "maxItems", "uniqueItems"});
    public static final Set g = mg.u0(new String[]{"type", "options", "minimum", "maximum", "multipleOf", "minLength", "maxLength", "format"});
    public static final Set h = mg.u0(new String[]{"widget", "placeholder", "unit", "minLines", "maxLines"});
    public static final Set i = t11.Q("sections");
    public static final Set j = mg.u0(new String[]{"id", "title", "properties"});
    public static final Set k = mg.u0(new String[]{"value", "label"});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(int i2, String str, String str2) {
        if (str.codePointCount(0, str.length()) <= i2) {
            return;
        }
        s.c(str2.concat(" is too long."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static z21 b(d41 d41Var) {
        j31 j31Var = (j31) d41Var.get("options");
        if (j31Var == null) {
            return null;
        }
        if (j31Var instanceof z21) {
            return (z21) j31Var;
        }
        s.j("Field 'options' must be an array.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean c(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            s.j(vi0.j("Field '", str, "' must be a boolean."));
            return null;
        }
        Boolean boolD = l31.d((i41) j31Var);
        if (boolD != null) {
            return boolD;
        }
        s.j(vi0.j("Field '", str, "' must be a boolean."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Double d(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            s.j(vi0.j("Field '", str, "' must be a finite number."));
            return null;
        }
        gz0 gz0Var = l31.a;
        Double dV = vv2.V(((i41) j31Var).a());
        if (dV != null) {
            if (Math.abs(dV.doubleValue()) > Double.MAX_VALUE) {
                dV = null;
            }
            if (dV != null) {
                return dV;
            }
        }
        s.j(vi0.j("Field '", str, "' must be a finite number."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Integer e(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            s.j(vi0.j("Field '", str, "' must be an integer."));
            return null;
        }
        Integer numE = l31.e((i41) j31Var);
        if (numE != null) {
            return numE;
        }
        s.j(vi0.j("Field '", str, "' must be an integer."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static d41 f(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (j31Var instanceof d41) {
            return (d41) j31Var;
        }
        s.j(vi0.j("Field '", str, "' must be an object."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(d41 d41Var, String str) {
        String strA;
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            s.j(vi0.j("Field '", str, "' must be a string."));
            return null;
        }
        if (!((i41) j31Var).b()) {
            j31Var = null;
        }
        i41 i41Var = (i41) j31Var;
        if (i41Var != null && (strA = i41Var.a()) != null) {
            return strA;
        }
        s.j(vi0.j("Field '", str, "' must be a string."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List h(d41 d41Var, String str) {
        Object obj = (j31) d41Var.get(str);
        if (obj == null) {
            return be0.h;
        }
        if (!(obj instanceof z21)) {
            s.j(vi0.j("Field '", str, "' must be an array."));
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
        int i2 = 0;
        for (Object obj2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                eu.a0();
                throw null;
            }
            j31 j31Var = (j31) obj2;
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null) {
                throw new IllegalArgumentException("Field '" + str + "[" + i2 + "]' must be a string.");
            }
            if (!i41Var.b()) {
                throw new IllegalArgumentException(("Field '" + str + "[" + i2 + "]' must be a string.").toString());
            }
            arrayList.add(i41Var.a());
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static lf2 i(String str) {
        Integer numE;
        List listO;
        String str2;
        uf2 uf2Var;
        d41 d41Var;
        String str3;
        if2 if2Var;
        String str4;
        wf2 wf2Var;
        int iIntValue;
        Set setU0;
        String str5;
        String str6;
        String str7;
        String str8;
        String strM;
        String strG;
        String strG2;
        String strG3;
        Object next;
        String str9;
        String strY0 = pv2.y0(str, "\ufeff");
        t21 t21Var = a;
        t21Var.getClass();
        j31 j31Var = (j31) t21Var.a(o31.a, strY0);
        d41 d41Var2 = j31Var instanceof d41 ? (d41) j31Var : null;
        if (d41Var2 == null) {
            s.j("Config schema root must be an object.");
            return null;
        }
        k(d41Var2, e, "Config schema");
        Object obj = d41Var2.get("schemaVersion");
        i41 i41Var = obj instanceof i41 ? (i41) obj : null;
        if (i41Var == null || (numE = l31.e(i41Var)) == null) {
            s.j("Field 'schemaVersion' must be an integer.");
            return null;
        }
        if (numE.intValue() != 1) {
            s.j("Unsupported config schema version.");
            return null;
        }
        String str10 = "type";
        if (!t11.l(l(d41Var2, "type"), "object")) {
            s.j("Config schema type must be 'object'.");
            return null;
        }
        if (t11.l(c(d41Var2, "additionalProperties"), Boolean.TRUE)) {
            s.j("Config schema additionalProperties must be false.");
            return null;
        }
        Set setK0 = du.K0(h(d41Var2, "required"));
        String str11 = "properties";
        Object obj2 = d41Var2.get("properties");
        d41 d41Var3 = obj2 instanceof d41 ? (d41) obj2 : null;
        if (d41Var3 == null) {
            s.j("Field 'properties' must be an object.");
            return null;
        }
        Map map = d41Var3.h;
        if (map.isEmpty()) {
            s.j("Config schema must contain at least one property.");
            return null;
        }
        if (map.size() > 128) {
            s.j("Config schema contains too many properties.");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str12 = (String) entry.getKey();
            j31 j31Var2 = (j31) entry.getValue();
            if (!b.b(str12) || c.contains(str12)) {
                s.c(vi0.j("Invalid config key '", str12, "'."));
                return null;
            }
            d41 d41Var4 = j31Var2 instanceof d41 ? (d41) j31Var2 : null;
            if (d41Var4 == null) {
                s.j(vi0.j("Config property '", str12, "' must be an object."));
                return null;
            }
            boolean zContains = setK0.contains(str12);
            k(d41Var4, f, "Config property '" + str12 + "'");
            String strL = l(d41Var4, str10);
            uf2.i.getClass();
            uf2 uf2VarT = i51.t(strL);
            Boolean boolC = c(d41Var4, "sensitive");
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            uf2 uf2Var2 = uf2.m;
            if (zBooleanValue && uf2VarT != uf2Var2) {
                s.c(vi0.j("Sensitive config property '", str12, "' must be a string."));
                return null;
            }
            z21 z21VarB = b(d41Var4);
            Set set = setK0;
            ArrayList arrayListJ = z21VarB != null ? j(z21VarB, uf2VarT, "Config property '" + str12 + "'") : null;
            be0 be0Var = be0.h;
            List list = arrayListJ == null ? be0Var : arrayListJ;
            d41 d41VarF = f(d41Var4, "items");
            uf2 uf2Var3 = uf2.n;
            Iterator it2 = it;
            String str13 = str11;
            d41 d41Var5 = d41Var2;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (d41VarF != null) {
                uf2Var = uf2Var2;
                StringBuilder sb = new StringBuilder("Config property '");
                sb.append(str12);
                str3 = "'.";
                sb.append("' items");
                d41Var = d41Var4;
                k(d41VarF, g, sb.toString());
                uf2 uf2VarT2 = i51.t(l(d41VarF, str10));
                if (uf2VarT2 == uf2Var3) {
                    s.j("Nested config arrays are not supported.");
                    return null;
                }
                Double d2 = d(d41VarF, "minimum");
                Double d3 = d(d41VarF, "maximum");
                if (d2 != null && d3 != null && d2.doubleValue() > d3.doubleValue()) {
                    s.c(vi0.j("Config property '", str12, "' item minimum must not exceed maximum."));
                    return null;
                }
                Double d4 = d(d41VarF, "multipleOf");
                if (d4 != null && d4.doubleValue() <= 0.0d) {
                    s.c(vi0.j("Config property '", str12, "' item multipleOf must be positive."));
                    return null;
                }
                Integer numE2 = e(d41VarF, "minLength");
                Integer numE3 = e(d41VarF, "maxLength");
                if (numE2 == null || numE3 == null) {
                    str2 = str10;
                } else {
                    str2 = str10;
                    if (numE2.intValue() > numE3.intValue()) {
                        s.c(vi0.j("Config property '", str12, "' item minLength must not exceed maxLength."));
                        return null;
                    }
                }
                z21 z21VarB2 = b(d41VarF);
                ArrayList arrayListJ2 = z21VarB2 != null ? j(z21VarB2, uf2VarT2, "Config property '" + str12 + "' items") : null;
                List list2 = arrayListJ2 == null ? be0Var : arrayListJ2;
                String strG4 = g(d41VarF, "format");
                if (strG4 != null) {
                    m(strG4);
                    str9 = strG4;
                } else {
                    str9 = null;
                }
                if2Var = new if2(uf2VarT2, list2, d2, d3, d4, numE2, numE3, str9);
            } else {
                str2 = str10;
                uf2Var = uf2Var2;
                d41Var = d41Var4;
                str3 = "'.";
                if2Var = null;
            }
            if ((uf2VarT == uf2Var3) != (if2Var != null)) {
                s.c(vi0.j("Array config property '", str12, "' must define items, and non-array properties must not."));
                return null;
            }
            d41 d41Var6 = d41Var;
            d41 d41VarF2 = f(d41Var6, "ui");
            wf2 wf2Var2 = wf2.p;
            wf2 wf2Var3 = wf2.q;
            wf2 wf2Var4 = wf2.l;
            wf2 wf2Var5 = wf2.m;
            wf2 wf2Var6 = wf2.j;
            wf2 wf2Var7 = wf2.o;
            if (d41VarF2 == null || (strG3 = g(d41VarF2, "widget")) == null) {
                str4 = str3;
                boolean zIsEmpty = list.isEmpty();
                if (uf2VarT == uf2.j) {
                    wf2Var = wf2Var6;
                } else if (zIsEmpty) {
                    uf2 uf2Var4 = uf2Var;
                    wf2Var = (uf2VarT == uf2Var4 && zBooleanValue) ? wf2Var5 : uf2VarT == uf2Var4 ? wf2Var4 : (uf2VarT == uf2.k || uf2VarT == uf2.l) ? wf2Var2 : wf2Var3;
                } else {
                    wf2Var = wf2Var7;
                }
            } else {
                wf2.i.getClass();
                Iterator it3 = wf2.s.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    Iterator it4 = it3;
                    if (((wf2) next).h.equals(strG3)) {
                        break;
                    }
                    it3 = it4;
                }
                wf2Var = (wf2) next;
                if (wf2Var == null) {
                    s.j(vi0.j("Unsupported config widget '", strG3, str3));
                    return null;
                }
                str4 = str3;
            }
            wf2 wf2Var8 = wf2Var;
            boolean zIsEmpty2 = list.isEmpty();
            String str14 = str4;
            int iOrdinal = uf2VarT.ordinal();
            wf2 wf2Var9 = wf2.n;
            if (iOrdinal == 0) {
                iIntValue = 3;
                setU0 = mg.u0(new wf2[]{wf2Var6, wf2.k});
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                iIntValue = 3;
                setU0 = mg.u0(new wf2[]{wf2Var2, wf2Var7});
            } else {
                iIntValue = 3;
                if (iOrdinal == 3) {
                    setU0 = mg.u0(new wf2[]{wf2Var4, wf2Var5, wf2Var9, wf2Var7});
                } else {
                    if (iOrdinal != 4) {
                        c80.s();
                        return null;
                    }
                    setU0 = t11.Q(wf2Var3);
                }
            }
            if (!setU0.contains(wf2Var8)) {
                s.c(vi0.k("Widget '", wf2Var8.h, "' is invalid for config property '", str12, str14));
                return null;
            }
            if (wf2Var8 == wf2Var7 && zIsEmpty2) {
                s.c(vi0.j("Select config property '", str12, "' must define options."));
                return null;
            }
            d41 d41VarF3 = f(d41Var6, "ui");
            if (d41VarF3 != null) {
                k(d41VarF3, h, "Config property '" + str12 + "' ui");
            }
            Integer numE4 = d41VarF3 != null ? e(d41VarF3, "minLines") : null;
            Integer numE5 = d41VarF3 != null ? e(d41VarF3, "maxLines") : null;
            if (wf2Var8 == wf2Var9) {
                int iIntValue2 = numE4 != null ? numE4.intValue() : iIntValue;
                if (1 <= iIntValue2 && iIntValue2 < 13) {
                    int iIntValue3 = numE5 != null ? numE5.intValue() : 5;
                    if (1 <= iIntValue3 && iIntValue3 < 13) {
                        int iIntValue4 = numE5 != null ? numE5.intValue() : 5;
                        if (numE4 != null) {
                            iIntValue = numE4.intValue();
                        }
                        if (iIntValue4 < iIntValue) {
                            s.c(vi0.j("Textarea maxLines for '", str12, "' must not be smaller than minLines."));
                            return null;
                        }
                    }
                }
                s.c(vi0.j("Textarea lines for '", str12, "' must be between 1 and 12."));
                return null;
            }
            if (numE4 != null || numE5 != null) {
                s.j("minLines and maxLines are only valid for textarea config properties.");
                return null;
            }
            Double d5 = d(d41Var6, "minimum");
            Double d6 = d(d41Var6, "maximum");
            if (d5 != null && d6 != null && d5.doubleValue() > d6.doubleValue()) {
                s.c(vi0.j("Config property '", str12, "' minimum must not exceed maximum."));
                return null;
            }
            Double d7 = d(d41Var6, "multipleOf");
            if (d7 != null && d7.doubleValue() <= 0.0d) {
                s.c(vi0.j("Config property '", str12, "' multipleOf must be positive."));
                return null;
            }
            Integer numE6 = e(d41Var6, "minLength");
            Integer numE7 = e(d41Var6, "maxLength");
            if (numE6 != null && numE6.intValue() < 0) {
                s.c(vi0.j("Config property '", str12, "' minLength is invalid."));
                return null;
            }
            if (numE7 != null && numE7.intValue() < 0) {
                s.c(vi0.j("Config property '", str12, "' maxLength is invalid."));
                return null;
            }
            if (numE6 != null && numE7 != null && numE6.intValue() > numE7.intValue()) {
                s.c(vi0.j("Config property '", str12, "' minLength must not exceed maxLength."));
                return null;
            }
            Integer numE8 = e(d41Var6, "minItems");
            int iIntValue5 = numE8 != null ? numE8.intValue() : 0;
            Integer numE9 = e(d41Var6, "maxItems");
            int iIntValue6 = numE9 != null ? numE9.intValue() : 256;
            if (iIntValue5 < 0 || iIntValue5 >= 257 || 1 > iIntValue6 || iIntValue6 >= 257 || iIntValue5 > iIntValue6) {
                s.c(vi0.j("Config property '", str12, "' array limits are invalid."));
                return null;
            }
            if (uf2VarT != uf2Var3 && (d41Var6.containsKey("minItems") || d41Var6.containsKey("maxItems") || d41Var6.containsKey("uniqueItems"))) {
                s.j("Array constraints are only valid for array config properties.");
                return null;
            }
            String strL2 = l(d41Var6, "title");
            a(128, strL2, "title");
            String strG5 = g(d41Var6, "description");
            if (strG5 != null) {
                a(2048, strG5, "description");
                str5 = strG5;
            } else {
                str5 = null;
            }
            j31 j31Var3 = (j31) d41Var6.get("default");
            String strG6 = g(d41Var6, "format");
            if (strG6 != null) {
                m(strG6);
                str6 = strG6;
            } else {
                str6 = null;
            }
            Boolean boolC2 = c(d41Var6, "uniqueItems");
            boolean zBooleanValue2 = boolC2 != null ? boolC2.booleanValue() : false;
            if (d41VarF3 == null || (strG2 = g(d41VarF3, "placeholder")) == null) {
                str7 = null;
            } else {
                a(256, strG2, "placeholder");
                str7 = strG2;
            }
            if (d41VarF3 == null || (strG = g(d41VarF3, "unit")) == null) {
                str8 = null;
            } else {
                a(128, strG, "unit");
                str8 = strG;
            }
            kf2 kf2Var = new kf2(str12, uf2VarT, strL2, str5, j31Var3, zContains, zBooleanValue, list, d5, d6, d7, numE6, numE7, str6, if2Var, iIntValue5, iIntValue6, zBooleanValue2, new vf2(wf2Var8, str7, str8, numE4, numE5));
            if (j31Var3 != null && (strM = up0.M(kf2Var, j31Var3)) != null) {
                um2.j("Default value for config '", str12, "' is invalid: ", strM);
                return null;
            }
            linkedHashMap2.put(str12, kf2Var);
            linkedHashMap = linkedHashMap2;
            setK0 = set;
            it = it2;
            str11 = str13;
            d41Var2 = d41Var5;
            str10 = str2;
        }
        d41 d41Var7 = d41Var2;
        String str15 = str11;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        Set set2 = setK0;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it5 = set2.iterator();
            while (it5.hasNext()) {
                if (!linkedHashMap3.containsKey((String) it5.next())) {
                    s.j("Config schema required contains an unknown property.");
                    return null;
                }
            }
        }
        d41 d41VarF4 = f(d41Var7, "ui");
        if (d41VarF4 != null) {
            Set setKeySet = linkedHashMap3.keySet();
            setKeySet.getClass();
            k(d41VarF4, i, "Config schema ui");
            Object obj3 = d41VarF4.get("sections");
            z21 z21Var = obj3 instanceof z21 ? (z21) obj3 : null;
            if (z21Var == null) {
                s.j("Field 'sections' must be an array.");
                return null;
            }
            List list3 = z21Var.h;
            int size = list3.size();
            if (1 > size || size >= 33) {
                s.j("Config schema must contain 1 to 32 sections.");
                return null;
            }
            ArrayList arrayList = new ArrayList(eu.B(z21Var, 10));
            int i2 = 0;
            for (Object obj4 : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    eu.a0();
                    throw null;
                }
                j31 j31Var4 = (j31) obj4;
                d41 d41Var8 = j31Var4 instanceof d41 ? (d41) j31Var4 : null;
                if (d41Var8 == null) {
                    s.j(hk1.g(i2, "Config section ", " must be an object."));
                    return null;
                }
                k(d41Var8, j, "Config section " + i2);
                String strL3 = l(d41Var8, "id");
                String strL4 = l(d41Var8, "title");
                a(128, strL4, "title");
                String str16 = str15;
                List listH = h(d41Var8, str16);
                if (!d41Var8.containsKey(str16)) {
                    s.j("Field 'properties' is required.");
                    return null;
                }
                if (listH.isEmpty()) {
                    s.j("Field 'properties' must not be empty.");
                    return null;
                }
                arrayList.add(new qf2(strL3, strL4, listH));
                i2 = i3;
                str15 = str16;
            }
            ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((qf2) it6.next()).a);
            }
            if (du.F0(du.J0(arrayList2)).size() != arrayList.size()) {
                s.j("Config section ids must be unique.");
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                iu.g0(((qf2) it7.next()).c, arrayList3);
            }
            if (arrayList3.size() != du.F0(du.J0(arrayList3)).size()) {
                s.j("Each config property must appear in only one section.");
                return null;
            }
            listO = arrayList;
            if (!du.K0(arrayList3).equals(setKeySet)) {
                s.j("Config sections must contain every config property exactly once.");
                return null;
            }
        } else {
            Set setKeySet2 = linkedHashMap3.keySet();
            setKeySet2.getClass();
            listO = eu.O(new qf2("general", "设置", du.F0(setKeySet2)));
        }
        return new lf2(linkedHashMap3, listO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(z21 z21Var, uf2 uf2Var, String str) {
        boolean zB;
        List list = z21Var.h;
        int size = list.size();
        if (1 > size || size >= 13) {
            s.c(str.concat(" options must contain 1 to 12 items."));
            return null;
        }
        ArrayList arrayList = new ArrayList(eu.B(z21Var, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                eu.a0();
                throw null;
            }
            j31 j31Var = (j31) obj;
            d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
            if (d41Var == null) {
                throw new IllegalArgumentException(str + " option " + i2 + " must be an object.");
            }
            k(d41Var, k, str + " option " + i2);
            Object obj2 = d41Var.get("value");
            i41 i41Var = obj2 instanceof i41 ? (i41) obj2 : null;
            if (i41Var == null) {
                throw new IllegalArgumentException(str + " option " + i2 + " value must be a primitive.");
            }
            int iOrdinal = uf2Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            zB = i41Var.b();
                        } else if (iOrdinal != 4) {
                            c80.s();
                            return null;
                        }
                    } else if (!i41Var.b()) {
                        gz0 gz0Var = l31.a;
                        Double dV = vv2.V(i41Var.a());
                        if (dV != null && Math.abs(dV.doubleValue()) <= Double.MAX_VALUE) {
                            zB = true;
                        }
                    }
                    zB = false;
                } else if (i41Var.b() || wv2.f0(i41Var.a()) == null) {
                    zB = false;
                }
            } else if (i41Var.b() || l31.d(i41Var) == null) {
            }
            if (!zB) {
                throw new IllegalArgumentException((str + " option " + i2 + " value does not match type " + uf2Var.h + ".").toString());
            }
            String strL = l(d41Var, "label");
            a(128, strL, "label");
            arrayList.add(new jf2(i41Var, strL));
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jf2) it.next()).a);
        }
        if (du.F0(du.J0(arrayList2)).size() == arrayList.size()) {
            return arrayList;
        }
        s.c(str.concat(" option values must be unique."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(d41 d41Var, Set set, String str) {
        Set setB0 = np2.b0(d41Var.h.keySet(), set);
        if (setB0.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException((str + " contains unknown fields: " + du.u0(du.z0(setB0), null, null, null, null, 63)).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String l(d41 d41Var, String str) {
        Object obj = d41Var.get(str);
        i41 i41Var = obj instanceof i41 ? (i41) obj : null;
        if (i41Var == null) {
            s.j(vi0.j("Field '", str, "' must be a string."));
            return null;
        }
        if (i41Var.b()) {
            return i41Var.a();
        }
        s.c(vi0.j("Field '", str, "' must be a string."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(String str) {
        if (d.contains(str)) {
            return;
        }
        s.c(vi0.j("Unsupported config string format '", str, "'."));
    }
}

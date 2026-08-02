package p000;

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

    /* JADX INFO: renamed from: a */
    public static final t21 f7134a = u21.f11071d;

    /* JADX INFO: renamed from: b */
    public static final o72 f7135b = new o72("^[a-z][A-Za-z0-9_]*$");

    /* JADX INFO: renamed from: c */
    public static final Set f7136c = AbstractC0460mg.m3106u0(new String[]{"__proto__", "prototype", "constructor"});

    /* JADX INFO: renamed from: d */
    public static final Set f7137d = AbstractC0460mg.m3106u0(new String[]{"plain", "nonBlank", "digits", "uri"});

    /* JADX INFO: renamed from: e */
    public static final Set f7138e = AbstractC0460mg.m3106u0(new String[]{"schemaVersion", "type", "additionalProperties", "properties", "required", "ui"});

    /* JADX INFO: renamed from: f */
    public static final Set f7139f = AbstractC0460mg.m3106u0(new String[]{"type", "title", "description", "default", "sensitive", "options", "ui", "minimum", "maximum", "multipleOf", "minLength", "maxLength", "format", "items", "minItems", "maxItems", "uniqueItems"});

    /* JADX INFO: renamed from: g */
    public static final Set f7140g = AbstractC0460mg.m3106u0(new String[]{"type", "options", "minimum", "maximum", "multipleOf", "minLength", "maxLength", "format"});

    /* JADX INFO: renamed from: h */
    public static final Set f7141h = AbstractC0460mg.m3106u0(new String[]{"widget", "placeholder", "unit", "minLines", "maxLines"});

    /* JADX INFO: renamed from: i */
    public static final Set f7142i = t11.m5065Q("sections");

    /* JADX INFO: renamed from: j */
    public static final Set f7143j = AbstractC0460mg.m3106u0(new String[]{"id", "title", "properties"});

    /* JADX INFO: renamed from: k */
    public static final Set f7144k = AbstractC0460mg.m3106u0(new String[]{"value", "label"});

    /* JADX INFO: renamed from: a */
    public static void m3294a(int i, String str, String str2) {
        if (str.codePointCount(0, str.length()) <= i) {
            return;
        }
        C0676s.m4645c(str2.concat(" is too long."));
    }

    /* JADX INFO: renamed from: b */
    public static z21 m3295b(d41 d41Var) {
        j31 j31Var = (j31) d41Var.get("options");
        if (j31Var == null) {
            return null;
        }
        if (j31Var instanceof z21) {
            return (z21) j31Var;
        }
        C0676s.m4651j("Field 'options' must be an array.");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m3296c(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a boolean."));
            return null;
        }
        Boolean boolM2796d = l31.m2796d((i41) j31Var);
        if (boolM2796d != null) {
            return boolM2796d;
        }
        C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a boolean."));
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Double m3297d(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a finite number."));
            return null;
        }
        gz0 gz0Var = l31.f5905a;
        Double dM5802V = vv2.m5802V(((i41) j31Var).mo2263a());
        if (dM5802V != null) {
            if (Math.abs(dM5802V.doubleValue()) > Double.MAX_VALUE) {
                dM5802V = null;
            }
            if (dM5802V != null) {
                return dM5802V;
            }
        }
        C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a finite number."));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Integer m3298e(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be an integer."));
            return null;
        }
        Integer numM2797e = l31.m2797e((i41) j31Var);
        if (numM2797e != null) {
            return numM2797e;
        }
        C0676s.m4651j(vi0.m5691j("Field '", str, "' must be an integer."));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static d41 m3299f(d41 d41Var, String str) {
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (j31Var instanceof d41) {
            return (d41) j31Var;
        }
        C0676s.m4651j(vi0.m5691j("Field '", str, "' must be an object."));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m3300g(d41 d41Var, String str) {
        String strMo2263a;
        j31 j31Var = (j31) d41Var.get(str);
        if (j31Var == null) {
            return null;
        }
        if (!(j31Var instanceof i41)) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a string."));
            return null;
        }
        if (!((i41) j31Var).mo2264b()) {
            j31Var = null;
        }
        i41 i41Var = (i41) j31Var;
        if (i41Var != null && (strMo2263a = i41Var.mo2263a()) != null) {
            return strMo2263a;
        }
        C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a string."));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static List m3301h(d41 d41Var, String str) {
        Object obj = (j31) d41Var.get(str);
        if (obj == null) {
            return be0.f819h;
        }
        if (!(obj instanceof z21)) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be an array."));
            return null;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
        int i = 0;
        for (Object obj2 : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            j31 j31Var = (j31) obj2;
            i41 i41Var = j31Var instanceof i41 ? (i41) j31Var : null;
            if (i41Var == null) {
                throw new IllegalArgumentException("Field '" + str + "[" + i + "]' must be a string.");
            }
            if (!i41Var.mo2264b()) {
                throw new IllegalArgumentException(("Field '" + str + "[" + i + "]' must be a string.").toString());
            }
            arrayList.add(i41Var.mo2263a());
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static lf2 m3302i(String str) {
        Integer numM2797e;
        List listM1434O;
        String str2;
        uf2 uf2Var;
        d41 d41Var;
        String str3;
        if2 if2Var;
        String str4;
        wf2 wf2Var;
        int iIntValue;
        Set setM3106u0;
        String str5;
        String str6;
        String str7;
        String str8;
        String strM5534M;
        String strM3300g;
        String strM3300g2;
        String strM3300g3;
        Object next;
        String str9;
        String strM4012y0 = pv2.m4012y0(str, "\ufeff");
        t21 t21Var = f7134a;
        t21Var.getClass();
        j31 j31Var = (j31) t21Var.m5453a(o31.f7461a, strM4012y0);
        d41 d41Var2 = j31Var instanceof d41 ? (d41) j31Var : null;
        if (d41Var2 == null) {
            C0676s.m4651j("Config schema root must be an object.");
            return null;
        }
        m3304k(d41Var2, f7138e, "Config schema");
        Object obj = d41Var2.get("schemaVersion");
        i41 i41Var = obj instanceof i41 ? (i41) obj : null;
        if (i41Var == null || (numM2797e = l31.m2797e(i41Var)) == null) {
            C0676s.m4651j("Field 'schemaVersion' must be an integer.");
            return null;
        }
        if (numM2797e.intValue() != 1) {
            C0676s.m4651j("Unsupported config schema version.");
            return null;
        }
        String str10 = "type";
        if (!t11.m5086l(m3305l(d41Var2, "type"), "object")) {
            C0676s.m4651j("Config schema type must be 'object'.");
            return null;
        }
        if (t11.m5086l(m3296c(d41Var2, "additionalProperties"), Boolean.TRUE)) {
            C0676s.m4651j("Config schema additionalProperties must be false.");
            return null;
        }
        Set setM1153K0 = AbstractC0142du.m1153K0(m3301h(d41Var2, "required"));
        String str11 = "properties";
        Object obj2 = d41Var2.get("properties");
        d41 d41Var3 = obj2 instanceof d41 ? (d41) obj2 : null;
        if (d41Var3 == null) {
            C0676s.m4651j("Field 'properties' must be an object.");
            return null;
        }
        Map map = d41Var3.f1861h;
        if (map.isEmpty()) {
            C0676s.m4651j("Config schema must contain at least one property.");
            return null;
        }
        if (map.size() > 128) {
            C0676s.m4651j("Config schema contains too many properties.");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str12 = (String) entry.getKey();
            j31 j31Var2 = (j31) entry.getValue();
            if (!f7135b.m3539b(str12) || f7136c.contains(str12)) {
                C0676s.m4645c(vi0.m5691j("Invalid config key '", str12, "'."));
                return null;
            }
            d41 d41Var4 = j31Var2 instanceof d41 ? (d41) j31Var2 : null;
            if (d41Var4 == null) {
                C0676s.m4651j(vi0.m5691j("Config property '", str12, "' must be an object."));
                return null;
            }
            boolean zContains = setM1153K0.contains(str12);
            m3304k(d41Var4, f7139f, "Config property '" + str12 + "'");
            String strM3305l = m3305l(d41Var4, str10);
            uf2.f11269i.getClass();
            uf2 uf2VarM2273t = i51.m2273t(strM3305l);
            Boolean boolM3296c = m3296c(d41Var4, "sensitive");
            boolean zBooleanValue = boolM3296c != null ? boolM3296c.booleanValue() : false;
            uf2 uf2Var2 = uf2.f11273m;
            if (zBooleanValue && uf2VarM2273t != uf2Var2) {
                C0676s.m4645c(vi0.m5691j("Sensitive config property '", str12, "' must be a string."));
                return null;
            }
            z21 z21VarM3295b = m3295b(d41Var4);
            Set set = setM1153K0;
            ArrayList arrayListM3303j = z21VarM3295b != null ? m3303j(z21VarM3295b, uf2VarM2273t, "Config property '" + str12 + "'") : null;
            be0 be0Var = be0.f819h;
            List list = arrayListM3303j == null ? be0Var : arrayListM3303j;
            d41 d41VarM3299f = m3299f(d41Var4, "items");
            uf2 uf2Var3 = uf2.f11274n;
            Iterator it2 = it;
            String str13 = str11;
            d41 d41Var5 = d41Var2;
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (d41VarM3299f != null) {
                uf2Var = uf2Var2;
                StringBuilder sb = new StringBuilder("Config property '");
                sb.append(str12);
                str3 = "'.";
                sb.append("' items");
                d41Var = d41Var4;
                m3304k(d41VarM3299f, f7140g, sb.toString());
                uf2 uf2VarM2273t2 = i51.m2273t(m3305l(d41VarM3299f, str10));
                if (uf2VarM2273t2 == uf2Var3) {
                    C0676s.m4651j("Nested config arrays are not supported.");
                    return null;
                }
                Double dM3297d = m3297d(d41VarM3299f, "minimum");
                Double dM3297d2 = m3297d(d41VarM3299f, "maximum");
                if (dM3297d != null && dM3297d2 != null && dM3297d.doubleValue() > dM3297d2.doubleValue()) {
                    C0676s.m4645c(vi0.m5691j("Config property '", str12, "' item minimum must not exceed maximum."));
                    return null;
                }
                Double dM3297d3 = m3297d(d41VarM3299f, "multipleOf");
                if (dM3297d3 != null && dM3297d3.doubleValue() <= 0.0d) {
                    C0676s.m4645c(vi0.m5691j("Config property '", str12, "' item multipleOf must be positive."));
                    return null;
                }
                Integer numM3298e = m3298e(d41VarM3299f, "minLength");
                Integer numM3298e2 = m3298e(d41VarM3299f, "maxLength");
                if (numM3298e == null || numM3298e2 == null) {
                    str2 = str10;
                } else {
                    str2 = str10;
                    if (numM3298e.intValue() > numM3298e2.intValue()) {
                        C0676s.m4645c(vi0.m5691j("Config property '", str12, "' item minLength must not exceed maxLength."));
                        return null;
                    }
                }
                z21 z21VarM3295b2 = m3295b(d41VarM3299f);
                ArrayList arrayListM3303j2 = z21VarM3295b2 != null ? m3303j(z21VarM3295b2, uf2VarM2273t2, "Config property '" + str12 + "' items") : null;
                List list2 = arrayListM3303j2 == null ? be0Var : arrayListM3303j2;
                String strM3300g4 = m3300g(d41VarM3299f, "format");
                if (strM3300g4 != null) {
                    m3306m(strM3300g4);
                    str9 = strM3300g4;
                } else {
                    str9 = null;
                }
                if2Var = new if2(uf2VarM2273t2, list2, dM3297d, dM3297d2, dM3297d3, numM3298e, numM3298e2, str9);
            } else {
                str2 = str10;
                uf2Var = uf2Var2;
                d41Var = d41Var4;
                str3 = "'.";
                if2Var = null;
            }
            if ((uf2VarM2273t == uf2Var3) != (if2Var != null)) {
                C0676s.m4645c(vi0.m5691j("Array config property '", str12, "' must define items, and non-array properties must not."));
                return null;
            }
            d41 d41Var6 = d41Var;
            d41 d41VarM3299f2 = m3299f(d41Var6, "ui");
            wf2 wf2Var2 = wf2.f12489p;
            wf2 wf2Var3 = wf2.f12490q;
            wf2 wf2Var4 = wf2.f12485l;
            wf2 wf2Var5 = wf2.f12486m;
            wf2 wf2Var6 = wf2.f12483j;
            wf2 wf2Var7 = wf2.f12488o;
            if (d41VarM3299f2 == null || (strM3300g3 = m3300g(d41VarM3299f2, "widget")) == null) {
                str4 = str3;
                boolean zIsEmpty = list.isEmpty();
                if (uf2VarM2273t == uf2.f11270j) {
                    wf2Var = wf2Var6;
                } else if (zIsEmpty) {
                    uf2 uf2Var4 = uf2Var;
                    wf2Var = (uf2VarM2273t == uf2Var4 && zBooleanValue) ? wf2Var5 : uf2VarM2273t == uf2Var4 ? wf2Var4 : (uf2VarM2273t == uf2.f11271k || uf2VarM2273t == uf2.f11272l) ? wf2Var2 : wf2Var3;
                } else {
                    wf2Var = wf2Var7;
                }
            } else {
                wf2.f12482i.getClass();
                Iterator it3 = wf2.f12492s.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    Iterator it4 = it3;
                    if (((wf2) next).f12493h.equals(strM3300g3)) {
                        break;
                    }
                    it3 = it4;
                }
                wf2Var = (wf2) next;
                if (wf2Var == null) {
                    C0676s.m4651j(vi0.m5691j("Unsupported config widget '", strM3300g3, str3));
                    return null;
                }
                str4 = str3;
            }
            wf2 wf2Var8 = wf2Var;
            boolean zIsEmpty2 = list.isEmpty();
            String str14 = str4;
            int iOrdinal = uf2VarM2273t.ordinal();
            wf2 wf2Var9 = wf2.f12487n;
            if (iOrdinal == 0) {
                iIntValue = 3;
                setM3106u0 = AbstractC0460mg.m3106u0(new wf2[]{wf2Var6, wf2.f12484k});
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                iIntValue = 3;
                setM3106u0 = AbstractC0460mg.m3106u0(new wf2[]{wf2Var2, wf2Var7});
            } else {
                iIntValue = 3;
                if (iOrdinal == 3) {
                    setM3106u0 = AbstractC0460mg.m3106u0(new wf2[]{wf2Var4, wf2Var5, wf2Var9, wf2Var7});
                } else {
                    if (iOrdinal != 4) {
                        c80.m675s();
                        return null;
                    }
                    setM3106u0 = t11.m5065Q(wf2Var3);
                }
            }
            if (!setM3106u0.contains(wf2Var8)) {
                C0676s.m4645c(vi0.m5692k("Widget '", wf2Var8.f12493h, "' is invalid for config property '", str12, str14));
                return null;
            }
            if (wf2Var8 == wf2Var7 && zIsEmpty2) {
                C0676s.m4645c(vi0.m5691j("Select config property '", str12, "' must define options."));
                return null;
            }
            d41 d41VarM3299f3 = m3299f(d41Var6, "ui");
            if (d41VarM3299f3 != null) {
                m3304k(d41VarM3299f3, f7141h, "Config property '" + str12 + "' ui");
            }
            Integer numM3298e3 = d41VarM3299f3 != null ? m3298e(d41VarM3299f3, "minLines") : null;
            Integer numM3298e4 = d41VarM3299f3 != null ? m3298e(d41VarM3299f3, "maxLines") : null;
            if (wf2Var8 == wf2Var9) {
                int iIntValue2 = numM3298e3 != null ? numM3298e3.intValue() : iIntValue;
                if (1 <= iIntValue2 && iIntValue2 < 13) {
                    int iIntValue3 = numM3298e4 != null ? numM3298e4.intValue() : 5;
                    if (1 <= iIntValue3 && iIntValue3 < 13) {
                        int iIntValue4 = numM3298e4 != null ? numM3298e4.intValue() : 5;
                        if (numM3298e3 != null) {
                            iIntValue = numM3298e3.intValue();
                        }
                        if (iIntValue4 < iIntValue) {
                            C0676s.m4645c(vi0.m5691j("Textarea maxLines for '", str12, "' must not be smaller than minLines."));
                            return null;
                        }
                    }
                }
                C0676s.m4645c(vi0.m5691j("Textarea lines for '", str12, "' must be between 1 and 12."));
                return null;
            }
            if (numM3298e3 != null || numM3298e4 != null) {
                C0676s.m4651j("minLines and maxLines are only valid for textarea config properties.");
                return null;
            }
            Double dM3297d4 = m3297d(d41Var6, "minimum");
            Double dM3297d5 = m3297d(d41Var6, "maximum");
            if (dM3297d4 != null && dM3297d5 != null && dM3297d4.doubleValue() > dM3297d5.doubleValue()) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' minimum must not exceed maximum."));
                return null;
            }
            Double dM3297d6 = m3297d(d41Var6, "multipleOf");
            if (dM3297d6 != null && dM3297d6.doubleValue() <= 0.0d) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' multipleOf must be positive."));
                return null;
            }
            Integer numM3298e5 = m3298e(d41Var6, "minLength");
            Integer numM3298e6 = m3298e(d41Var6, "maxLength");
            if (numM3298e5 != null && numM3298e5.intValue() < 0) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' minLength is invalid."));
                return null;
            }
            if (numM3298e6 != null && numM3298e6.intValue() < 0) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' maxLength is invalid."));
                return null;
            }
            if (numM3298e5 != null && numM3298e6 != null && numM3298e5.intValue() > numM3298e6.intValue()) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' minLength must not exceed maxLength."));
                return null;
            }
            Integer numM3298e7 = m3298e(d41Var6, "minItems");
            int iIntValue5 = numM3298e7 != null ? numM3298e7.intValue() : 0;
            Integer numM3298e8 = m3298e(d41Var6, "maxItems");
            int iIntValue6 = numM3298e8 != null ? numM3298e8.intValue() : 256;
            if (iIntValue5 < 0 || iIntValue5 >= 257 || 1 > iIntValue6 || iIntValue6 >= 257 || iIntValue5 > iIntValue6) {
                C0676s.m4645c(vi0.m5691j("Config property '", str12, "' array limits are invalid."));
                return null;
            }
            if (uf2VarM2273t != uf2Var3 && (d41Var6.containsKey("minItems") || d41Var6.containsKey("maxItems") || d41Var6.containsKey("uniqueItems"))) {
                C0676s.m4651j("Array constraints are only valid for array config properties.");
                return null;
            }
            String strM3305l2 = m3305l(d41Var6, "title");
            m3294a(128, strM3305l2, "title");
            String strM3300g5 = m3300g(d41Var6, "description");
            if (strM3300g5 != null) {
                m3294a(2048, strM3300g5, "description");
                str5 = strM3300g5;
            } else {
                str5 = null;
            }
            j31 j31Var3 = (j31) d41Var6.get("default");
            String strM3300g6 = m3300g(d41Var6, "format");
            if (strM3300g6 != null) {
                m3306m(strM3300g6);
                str6 = strM3300g6;
            } else {
                str6 = null;
            }
            Boolean boolM3296c2 = m3296c(d41Var6, "uniqueItems");
            boolean zBooleanValue2 = boolM3296c2 != null ? boolM3296c2.booleanValue() : false;
            if (d41VarM3299f3 == null || (strM3300g2 = m3300g(d41VarM3299f3, "placeholder")) == null) {
                str7 = null;
            } else {
                m3294a(256, strM3300g2, "placeholder");
                str7 = strM3300g2;
            }
            if (d41VarM3299f3 == null || (strM3300g = m3300g(d41VarM3299f3, "unit")) == null) {
                str8 = null;
            } else {
                m3294a(128, strM3300g, "unit");
                str8 = strM3300g;
            }
            kf2 kf2Var = new kf2(str12, uf2VarM2273t, strM3305l2, str5, j31Var3, zContains, zBooleanValue, list, dM3297d4, dM3297d5, dM3297d6, numM3298e5, numM3298e6, str6, if2Var, iIntValue5, iIntValue6, zBooleanValue2, new vf2(wf2Var8, str7, str8, numM3298e3, numM3298e4));
            if (j31Var3 != null && (strM5534M = up0.m5534M(kf2Var, j31Var3)) != null) {
                um2.m5520j("Default value for config '", str12, "' is invalid: ", strM5534M);
                return null;
            }
            linkedHashMap2.put(str12, kf2Var);
            linkedHashMap = linkedHashMap2;
            setM1153K0 = set;
            it = it2;
            str11 = str13;
            d41Var2 = d41Var5;
            str10 = str2;
        }
        d41 d41Var7 = d41Var2;
        String str15 = str11;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        Set set2 = setM1153K0;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it5 = set2.iterator();
            while (it5.hasNext()) {
                if (!linkedHashMap3.containsKey((String) it5.next())) {
                    C0676s.m4651j("Config schema required contains an unknown property.");
                    return null;
                }
            }
        }
        d41 d41VarM3299f4 = m3299f(d41Var7, "ui");
        if (d41VarM3299f4 != null) {
            Set setKeySet = linkedHashMap3.keySet();
            setKeySet.getClass();
            m3304k(d41VarM3299f4, f7142i, "Config schema ui");
            Object obj3 = d41VarM3299f4.get("sections");
            z21 z21Var = obj3 instanceof z21 ? (z21) obj3 : null;
            if (z21Var == null) {
                C0676s.m4651j("Field 'sections' must be an array.");
                return null;
            }
            List list3 = z21Var.f13709h;
            int size = list3.size();
            if (1 > size || size >= 33) {
                C0676s.m4651j("Config schema must contain 1 to 32 sections.");
                return null;
            }
            ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(z21Var, 10));
            int i = 0;
            for (Object obj4 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0179eu.m1447a0();
                    throw null;
                }
                j31 j31Var4 = (j31) obj4;
                d41 d41Var8 = j31Var4 instanceof d41 ? (d41) j31Var4 : null;
                if (d41Var8 == null) {
                    C0676s.m4651j(hk1.m2208g(i, "Config section ", " must be an object."));
                    return null;
                }
                m3304k(d41Var8, f7143j, "Config section " + i);
                String strM3305l3 = m3305l(d41Var8, "id");
                String strM3305l4 = m3305l(d41Var8, "title");
                m3294a(128, strM3305l4, "title");
                String str16 = str15;
                List listM3301h = m3301h(d41Var8, str16);
                if (!d41Var8.containsKey(str16)) {
                    C0676s.m4651j("Field 'properties' is required.");
                    return null;
                }
                if (listM3301h.isEmpty()) {
                    C0676s.m4651j("Field 'properties' must not be empty.");
                    return null;
                }
                arrayList.add(new qf2(strM3305l3, strM3305l4, listM3301h));
                i = i2;
                str15 = str16;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((qf2) it6.next()).f8953a);
            }
            if (AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(arrayList2)).size() != arrayList.size()) {
                C0676s.m4651j("Config section ids must be unique.");
                return null;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                AbstractC0325iu.m2393g0(((qf2) it7.next()).f8955c, arrayList3);
            }
            if (arrayList3.size() != AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(arrayList3)).size()) {
                C0676s.m4651j("Each config property must appear in only one section.");
                return null;
            }
            listM1434O = arrayList;
            if (!AbstractC0142du.m1153K0(arrayList3).equals(setKeySet)) {
                C0676s.m4651j("Config sections must contain every config property exactly once.");
                return null;
            }
        } else {
            Set setKeySet2 = linkedHashMap3.keySet();
            setKeySet2.getClass();
            listM1434O = AbstractC0179eu.m1434O(new qf2("general", "设置", AbstractC0142du.m1148F0(setKeySet2)));
        }
        return new lf2(linkedHashMap3, listM1434O);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m3303j(z21 z21Var, uf2 uf2Var, String str) {
        boolean zMo2264b;
        List list = z21Var.f13709h;
        int size = list.size();
        if (1 > size || size >= 13) {
            C0676s.m4645c(str.concat(" options must contain 1 to 12 items."));
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(z21Var, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            j31 j31Var = (j31) obj;
            d41 d41Var = j31Var instanceof d41 ? (d41) j31Var : null;
            if (d41Var == null) {
                throw new IllegalArgumentException(str + " option " + i + " must be an object.");
            }
            m3304k(d41Var, f7144k, str + " option " + i);
            Object obj2 = d41Var.get("value");
            i41 i41Var = obj2 instanceof i41 ? (i41) obj2 : null;
            if (i41Var == null) {
                throw new IllegalArgumentException(str + " option " + i + " value must be a primitive.");
            }
            int iOrdinal = uf2Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            zMo2264b = i41Var.mo2264b();
                        } else if (iOrdinal != 4) {
                            c80.m675s();
                            return null;
                        }
                    } else if (!i41Var.mo2264b()) {
                        gz0 gz0Var = l31.f5905a;
                        Double dM5802V = vv2.m5802V(i41Var.mo2263a());
                        if (dM5802V != null && Math.abs(dM5802V.doubleValue()) <= Double.MAX_VALUE) {
                            zMo2264b = true;
                        }
                    }
                    zMo2264b = false;
                } else if (i41Var.mo2264b() || wv2.m6014f0(i41Var.mo2263a()) == null) {
                    zMo2264b = false;
                }
            } else if (i41Var.mo2264b() || l31.m2796d(i41Var) == null) {
            }
            if (!zMo2264b) {
                throw new IllegalArgumentException((str + " option " + i + " value does not match type " + uf2Var.f11277h + ".").toString());
            }
            String strM3305l = m3305l(d41Var, "label");
            m3294a(128, strM3305l, "label");
            arrayList.add(new jf2(i41Var, strM3305l));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jf2) it.next()).f5016a);
        }
        if (AbstractC0142du.m1148F0(AbstractC0142du.m1152J0(arrayList2)).size() == arrayList.size()) {
            return arrayList;
        }
        C0676s.m4645c(str.concat(" option values must be unique."));
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static void m3304k(d41 d41Var, Set set, String str) {
        Set setM3353b0 = np2.m3353b0(d41Var.f1861h.keySet(), set);
        if (setM3353b0.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException((str + " contains unknown fields: " + AbstractC0142du.m1165u0(AbstractC0142du.m1170z0(setM3353b0), null, null, null, null, 63)).toString());
    }

    /* JADX INFO: renamed from: l */
    public static String m3305l(d41 d41Var, String str) {
        Object obj = d41Var.get(str);
        i41 i41Var = obj instanceof i41 ? (i41) obj : null;
        if (i41Var == null) {
            C0676s.m4651j(vi0.m5691j("Field '", str, "' must be a string."));
            return null;
        }
        if (i41Var.mo2264b()) {
            return i41Var.mo2263a();
        }
        C0676s.m4645c(vi0.m5691j("Field '", str, "' must be a string."));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static void m3306m(String str) {
        if (f7137d.contains(str)) {
            return;
        }
        C0676s.m4645c(vi0.m5691j("Unsupported config string format '", str, "'."));
    }
}

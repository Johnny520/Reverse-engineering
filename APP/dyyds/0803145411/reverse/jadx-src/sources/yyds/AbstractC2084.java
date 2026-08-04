package yyds;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᲀᲁᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2084 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1083 f10334 = C1083.f4987;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2133 f10335;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0644 f10336;

    static {
        C2133 c2133 = new C2133(1, false);
        c2133.f10555 = new ConcurrentHashMap();
        c2133.f10553 = new LinkedList();
        c2133.m4047(new C1585(19), String.class);
        c2133.m4047(new C1585(2), Double.class);
        c2133.m4047(new C1585(3), Date.class);
        c2133.m4047(new C1585(4), Float.class);
        C1585 c1585 = C2133.f10551;
        c2133.m4047(c1585, Integer.class, Long.class, Byte.class, Short.class, BigInteger.class, BigDecimal.class);
        c2133.m4047(c1585, Boolean.class);
        c2133.m4047(new C1585(5), int[].class);
        c2133.m4047(new C1585(6), short[].class);
        c2133.m4047(new C1585(7), long[].class);
        c2133.m4047(new C1585(8), float[].class);
        c2133.m4047(new C1585(9), double[].class);
        c2133.m4047(new C1585(10), boolean[].class);
        c2133.m4064(InterfaceC0956.class, C2133.f10541);
        c2133.m4064(InterfaceC1349.class, C2133.f10547);
        c2133.m4064(InterfaceC0663.class, C2133.f10543);
        c2133.m4064(InterfaceC1732.class, C2133.f10550);
        c2133.m4064(Map.class, C2133.f10542);
        c2133.m4064(Iterable.class, C2133.f10548);
        c2133.m4064(Enum.class, C2133.f10549);
        c2133.m4064(Number.class, c1585);
        f10335 = c2133;
        f10336 = new C0644(21);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m3986(Object obj, StringBuilder sb, C1083 c1083) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        C2133 c2133 = f10335;
        C1585 c1585 = (C1585) ((ConcurrentHashMap) c2133.f10555).get(cls);
        if (c1585 == null) {
            if (cls.isArray()) {
                c1585 = C2133.f10544;
            } else {
                Class<?> cls2 = obj.getClass();
                Iterator it = ((LinkedList) c2133.f10553).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        c1585 = null;
                        break;
                    }
                    C0946 c0946 = (C0946) it.next();
                    if (c0946.f4408.isAssignableFrom(cls2)) {
                        c1585 = c0946.f4409;
                        break;
                    }
                }
                if (c1585 == null) {
                    c1585 = C2133.f10540;
                }
            }
            c2133.m4047(c1585, cls);
        }
        int i = 0;
        boolean z = true;
        switch (c1585.f8035) {
            case 0:
                c1083.getClass();
                sb.append('[');
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                boolean z2 = false;
                while (i < length) {
                    Object obj2 = objArr[i];
                    if (z2) {
                        sb.append(',');
                    } else {
                        z2 = true;
                    }
                    m3986(obj2, sb, c1083);
                    i++;
                }
                sb.append(']');
                return;
            case 1:
                AbstractC1324.m2616(obj.getClass());
                throw null;
            case 2:
                Double d = (Double) obj;
                if (d.isInfinite()) {
                    sb.append("null");
                    return;
                } else {
                    sb.append((CharSequence) d.toString());
                    return;
                }
            case 3:
                sb.append('\"');
                String string = ((Date) obj).toString();
                if (string != null) {
                    c1083.f4992.mo1273(string, sb);
                }
                sb.append('\"');
                return;
            case 4:
                Float f = (Float) obj;
                if (f.isInfinite()) {
                    sb.append("null");
                    return;
                } else {
                    sb.append((CharSequence) f.toString());
                    return;
                }
            case 5:
                int[] iArr = (int[]) obj;
                c1083.getClass();
                sb.append('[');
                int length2 = iArr.length;
                boolean z3 = false;
                while (i < length2) {
                    int i2 = iArr[i];
                    if (z3) {
                        sb.append(',');
                    } else {
                        z3 = true;
                    }
                    sb.append((CharSequence) Integer.toString(i2));
                    i++;
                }
                sb.append(']');
                return;
            case 6:
                short[] sArr = (short[]) obj;
                c1083.getClass();
                sb.append('[');
                int length3 = sArr.length;
                boolean z4 = false;
                while (i < length3) {
                    short s = sArr[i];
                    if (z4) {
                        sb.append(',');
                    } else {
                        z4 = true;
                    }
                    sb.append((CharSequence) Short.toString(s));
                    i++;
                }
                sb.append(']');
                return;
            case 7:
                long[] jArr = (long[]) obj;
                c1083.getClass();
                sb.append('[');
                int length4 = jArr.length;
                boolean z5 = false;
                while (i < length4) {
                    long j = jArr[i];
                    if (z5) {
                        sb.append(',');
                    } else {
                        z5 = true;
                    }
                    sb.append((CharSequence) Long.toString(j));
                    i++;
                }
                sb.append(']');
                return;
            case 8:
                float[] fArr = (float[]) obj;
                c1083.getClass();
                sb.append('[');
                int length5 = fArr.length;
                boolean z6 = false;
                while (i < length5) {
                    float f2 = fArr[i];
                    if (z6) {
                        sb.append(',');
                    } else {
                        z6 = true;
                    }
                    sb.append((CharSequence) Float.toString(f2));
                    i++;
                }
                sb.append(']');
                return;
            case 9:
                double[] dArr = (double[]) obj;
                c1083.getClass();
                sb.append('[');
                int length6 = dArr.length;
                boolean z7 = false;
                while (i < length6) {
                    double d2 = dArr[i];
                    if (z7) {
                        sb.append(',');
                    } else {
                        z7 = true;
                    }
                    sb.append((CharSequence) Double.toString(d2));
                    i++;
                }
                sb.append(']');
                return;
            case 10:
                boolean[] zArr = (boolean[]) obj;
                c1083.getClass();
                sb.append('[');
                int length7 = zArr.length;
                boolean z8 = false;
                while (i < length7) {
                    boolean z9 = zArr[i];
                    if (z8) {
                        sb.append(',');
                    } else {
                        z8 = true;
                    }
                    sb.append((CharSequence) Boolean.toString(z9));
                    i++;
                }
                sb.append(']');
                return;
            case 11:
                ((InterfaceC0956) obj).mo2754(sb);
                return;
            case 12:
                ((InterfaceC0956) obj).mo2096(sb, c1083);
                return;
            case 13:
                sb.append((CharSequence) ((InterfaceC0663) obj).mo1578(c1083));
                return;
            case 14:
                sb.append((CharSequence) ((InterfaceC1732) obj).mo3460());
                return;
            case 15:
                c1083.getClass();
                sb.append('[');
                for (Object obj3 : (Iterable) obj) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(',');
                    }
                    if (obj3 == null) {
                        sb.append("null");
                    } else {
                        m3986(obj3, sb, c1083);
                    }
                }
                sb.append(']');
                return;
            case 16:
                c1083.m2293(((Enum) obj).name(), sb);
                return;
            case 17:
                c1083.getClass();
                sb.append('{');
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null || !c1083.f4989) {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(',');
                        }
                        C2133.m4044(entry.getKey().toString(), value, sb, c1083);
                    }
                }
                sb.append('}');
                return;
            case 18:
                sb.append((CharSequence) obj.toString());
                return;
            default:
                c1083.m2293((String) obj, sb);
                return;
        }
    }
}

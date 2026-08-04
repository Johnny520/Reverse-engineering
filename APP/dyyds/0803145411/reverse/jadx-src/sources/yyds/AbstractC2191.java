package yyds;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᲁᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2191 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2534 f10761;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C2534 f10762;

    static {
        C2534 c2534 = new C2534("\"\\".getBytes(AbstractC0347.f1806));
        c2534.f12476 = "\"\\";
        f10761 = c2534;
        C2534 c25342 = new C2534("\t ,=".getBytes(AbstractC0347.f1806));
        c25342.f12476 = "\t ,=";
        f10762 = c25342;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final boolean m4182(C1507 c1507) throws EOFException {
        boolean z = false;
        while (!c1507.m3021()) {
            byte bM3038 = c1507.m3038(0L);
            if (bM3038 != 44) {
                if (bM3038 != 32 && bM3038 != 9) {
                    break;
                }
                c1507.m3033();
            } else {
                c1507.m3033();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final boolean m4183(C0837 c0837) {
        if (AbstractC1544.m3188(c0837.f3858.f10390, "HEAD")) {
            return false;
        }
        int i = c0837.f3860;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC0795.m1802(c0837) != -1) {
            return true;
        }
        String strM3306 = c0837.f3847.m3306("Transfer-Encoding");
        if (strM3306 == null) {
            strM3306 = null;
        }
        return "chunked".equalsIgnoreCase(strM3306);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0100, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4184(C1507 c1507, ArrayList arrayList) {
        String strM4185;
        int iM2914;
        LinkedHashMap linkedHashMap;
        String strM41852;
        while (true) {
            String strM41853 = null;
            while (true) {
                if (strM41853 == null) {
                    m4182(c1507);
                    strM41853 = m4185(c1507);
                    if (strM41853 == null) {
                        return;
                    }
                }
                boolean zM4182 = m4182(c1507);
                strM4185 = m4185(c1507);
                if (strM4185 == null) {
                    if (c1507.m3021()) {
                        arrayList.add(new C1121(strM41853, C0704.f3312));
                        return;
                    }
                    return;
                }
                iM2914 = AbstractC1429.m2914(c1507);
                boolean zM41822 = m4182(c1507);
                if (zM4182 || (!zM41822 && !c1507.m3021())) {
                    linkedHashMap = new LinkedHashMap();
                    int iM29142 = AbstractC1429.m2914(c1507) + iM2914;
                    while (true) {
                        if (strM4185 == null) {
                            strM4185 = m4185(c1507);
                            if (!m4182(c1507)) {
                                iM29142 = AbstractC1429.m2914(c1507);
                                if (iM29142 == 0) {
                                    if (iM29142 > 1 || m4182(c1507)) {
                                        return;
                                    }
                                    if (c1507.m3021() || c1507.m3038(0L) != 34) {
                                        strM41852 = m4185(c1507);
                                    } else {
                                        if (c1507.m3033() != 34) {
                                            C0188.m798("Failed requirement.");
                                            return;
                                        }
                                        C1507 c15072 = new C1507();
                                        while (true) {
                                            long jM3027 = c1507.m3027(f10761);
                                            if (jM3027 == -1) {
                                                break;
                                            }
                                            if (c1507.m3038(jM3027) == 34) {
                                                c15072.mo576(jM3027, c1507);
                                                c1507.m3033();
                                                strM41852 = c15072.m3035();
                                                break;
                                            } else {
                                                if (c1507.f7087 == jM3027 + 1) {
                                                    break;
                                                }
                                                c15072.mo576(jM3027, c1507);
                                                c1507.m3033();
                                                c15072.mo576(1L, c1507);
                                            }
                                        }
                                        strM41852 = null;
                                    }
                                    if (strM41852 == null || ((String) linkedHashMap.put(strM4185, strM41852)) != null) {
                                        return;
                                    }
                                    if (!m4182(c1507) && !c1507.m3021()) {
                                        return;
                                    } else {
                                        strM4185 = null;
                                    }
                                }
                            }
                        } else if (iM29142 == 0) {
                            break;
                        }
                    }
                }
                arrayList.add(new C1121(strM41853, linkedHashMap));
                strM41853 = strM4185;
            }
            arrayList.add(new C1121(strM41853, Collections.singletonMap(null, strM4185 + AbstractC0692.m1599(iM2914, "="))));
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String m4185(C1507 c1507) {
        long jM3027 = c1507.m3027(f10762);
        if (jM3027 == -1) {
            jM3027 = c1507.f7087;
        }
        if (jM3027 != 0) {
            return c1507.m3031(jM3027, AbstractC0347.f1806);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4186(C1985 c1985, C0082 c0082, C1605 c1605) {
        C2627 c2627;
        C0082 c00822;
        C2627 c26272;
        String strSubstring;
        if (c1985 == C1985.f9941) {
            return;
        }
        Pattern pattern = C2627.f12917;
        int size = c1605.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(AbstractC0797.m1836(c1605, i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(AbstractC0797.m1817(c1605, i));
            }
        }
        List listUnmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : null;
        List list = C1860.f9345;
        List list2 = listUnmodifiableList == null ? list : listUnmodifiableList;
        int size2 = list2.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) list2.get(i2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = AbstractC1429.f6782;
            char c = ';';
            int iM2925 = AbstractC1429.m2925(str, ';', 0, str.length());
            char c2 = '=';
            int iM29252 = AbstractC1429.m2925(str, '=', 0, iM2925);
            if (iM29252 == iM2925) {
                c2627 = null;
            } else {
                int iM2919 = AbstractC1429.m2919(str, 0, iM29252);
                String strSubstring2 = str.substring(iM2919, AbstractC1429.m2913(str, iM2919, iM29252));
                if (strSubstring2.length() != 0 && AbstractC1429.m2924(strSubstring2) == -1) {
                    int iM29192 = AbstractC1429.m2919(str, iM29252 + 1, iM2925);
                    String strSubstring3 = str.substring(iM29192, AbstractC1429.m2913(str, iM29192, iM2925));
                    if (AbstractC1429.m2924(strSubstring3) == -1) {
                        int i3 = iM2925 + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jM1187 = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i3 < length) {
                                int iM29253 = AbstractC1429.m2925(str, c, i3, length);
                                int iM29254 = AbstractC1429.m2925(str, c2, i3, iM29253);
                                int iM29193 = AbstractC1429.m2919(str, i3, iM29254);
                                String strSubstring5 = str.substring(iM29193, AbstractC1429.m2913(str, iM29193, iM29254));
                                if (iM29254 < iM29253) {
                                    int iM29194 = AbstractC1429.m2919(str, iM29254 + 1, iM29253);
                                    strSubstring = str.substring(iM29194, AbstractC1429.m2913(str, iM29194, iM29253));
                                } else {
                                    strSubstring = "";
                                }
                                if (strSubstring5.equalsIgnoreCase("expires")) {
                                    try {
                                        jM1187 = AbstractC0427.m1187(strSubstring.length(), strSubstring);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long j3 = Long.parseLong(strSubstring);
                                        j2 = j3 <= 0 ? Long.MIN_VALUE : j3;
                                    } catch (NumberFormatException e) {
                                        if (!Pattern.compile("-?\\d+").matcher(strSubstring).matches()) {
                                            throw e;
                                        }
                                        j2 = strSubstring.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                    if (AbstractC0692.m1600(strSubstring, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strM1185 = AbstractC0425.m1185(AbstractC0473.m1310(strSubstring, "."));
                                    if (strM1185 == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strM1185;
                                    z4 = false;
                                } else if (strSubstring5.equalsIgnoreCase("path")) {
                                    strSubstring4 = strSubstring;
                                } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                    z = true;
                                } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                    z2 = true;
                                } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                    str3 = strSubstring;
                                }
                                i3 = iM29253 + 1;
                                c = ';';
                                c2 = '=';
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    c00822 = c0082;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j4 < jCurrentTimeMillis || j4 > 253402300799999L) {
                                        c00822 = c0082;
                                    } else {
                                        c00822 = c0082;
                                        j = j4;
                                    }
                                } else {
                                    c00822 = c0082;
                                    j = jM1187;
                                }
                                String str4 = c00822.f670;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!AbstractC1544.m3188(str4, str2) && (!AbstractC0692.m1600(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || AbstractC0425.f2171.f548.matcher(str4).matches())) {
                                    c26272 = null;
                                    c2627 = c26272;
                                }
                                if (str4.length() == str2.length() || C0553.f2645.m1401(str2) != null) {
                                    if (strSubstring4 == null || !strSubstring4.startsWith("/")) {
                                        String strM478 = c00822.m478();
                                        int iM1307 = AbstractC0473.m1307(strM478, '/', 0, 6);
                                        strSubstring4 = iM1307 != 0 ? strM478.substring(0, iM1307) : "/";
                                    }
                                    c26272 = new C2627(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4, str3);
                                }
                                c2627 = c26272;
                            }
                        }
                    }
                }
            }
            if (c2627 != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c2627);
            }
        }
        List listUnmodifiableList2 = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : null;
        if (listUnmodifiableList2 != null) {
            list = listUnmodifiableList2;
        }
        list.isEmpty();
    }
}

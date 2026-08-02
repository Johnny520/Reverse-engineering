package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = eu.R("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList h(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iP0 = pv2.p0(str, '&', i, 4);
            if (iP0 == -1) {
                iP0 = str.length();
            }
            int iP02 = pv2.p0(str, '=', i, 4);
            if (iP02 == -1 || iP02 > iP0) {
                arrayList.add(str.substring(i, iP0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iP02));
                arrayList.add(str.substring(iP02 + 1, iP0));
            }
            i = iP0 + 1;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String str, String str2) {
        str.getClass();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(ci0.w(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = this.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ci0.w(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yw0 b() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            s.l("scheme == null");
            return null;
        }
        String strR = ci0.R(this.b, 0, 0, 7);
        String strR2 = ci0.R(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            s.l("host == null");
            return null;
        }
        int iC = c();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(eu.B(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ci0.R((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(eu.B(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? ci0.R(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new yw0(str, strR, strR2, str2, iC, arrayList3, arrayList, str4 != null ? ci0.R(str4, 0, 0, 7) : null, toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        str.getClass();
        String strB = sg3.b(ci0.R(str, 0, 0, 7));
        if (strB != null) {
            this.d = strB;
        } else {
            s.j("unexpected host: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(yw0 yw0Var, String str) {
        int i;
        int i2;
        byte b;
        int iD;
        int i3;
        char cCharAt;
        str.getClass();
        byte[] bArr = ug3.a;
        int i4 = 0;
        int iG = ug3.g(str, 0, str.length());
        int iH = ug3.h(str, iG, str.length());
        byte b2 = -1;
        if (iH - iG < 2) {
            i = -1;
        } else {
            char cCharAt2 = str.charAt(iG);
            if ((t11.o(cCharAt2, 97) >= 0 && t11.o(cCharAt2, 122) <= 0) || (t11.o(cCharAt2, 65) >= 0 && t11.o(cCharAt2, 90) <= 0)) {
                i = iG + 1;
                while (true) {
                    if (i >= iH) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i);
                    if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                        i++;
                    } else if (cCharAt3 != ':') {
                        break;
                    }
                }
                i = -1;
            }
        }
        int i5 = 1;
        if (i != -1) {
            if (wv2.c0(str, "https:", iG, true)) {
                this.a = "https";
                iG += 6;
            } else {
                if (!wv2.c0(str, "http:", iG, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                iG += 5;
            }
        } else {
            if (yw0Var == null) {
                s.j("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? pv2.H0(str, 6).concat("...") : str));
                return;
            }
            this.a = yw0Var.a;
        }
        int i6 = iG;
        int i7 = 0;
        while (true) {
            i2 = i5;
            b = 47;
            if (i6 >= iH || !((cCharAt = str.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        byte b3 = 35;
        if (i7 >= 2 || yw0Var == null || !t11.l(yw0Var.a, this.a)) {
            int i8 = iG + i7;
            int i9 = 0;
            while (true) {
                iD = ug3.d(str, i8, "@/\\?#", iH);
                byte bCharAt = iD != iH ? str.charAt(iD) : b2;
                if (bCharAt == b2 || bCharAt == b3 || bCharAt == b || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i4 == 0) {
                        int iC = ug3.c(str, ':', i8, iD);
                        String strW = ci0.w(str, i8, iC, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (i9 != 0) {
                            strW = this.b + "%40" + strW;
                        }
                        this.b = strW;
                        if (iC != iD) {
                            this.c = ci0.w(str, iC + 1, iD, " \"':;<=>@[]^`{}|/\\?#", 112);
                            i4 = i2;
                        }
                        i9 = i2;
                    } else {
                        this.c += "%40" + ci0.w(str, i8, iD, " \"':;<=>@[]^`{}|/\\?#", 112);
                    }
                    i8 = iD + 1;
                    b3 = 35;
                    b2 = -1;
                }
                b = 47;
            }
            int i10 = i8;
            while (true) {
                if (i10 < iD) {
                    char cCharAt4 = str.charAt(i10);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i10++;
                            if (i10 < iD) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                } else {
                    i10 = iD;
                    break;
                }
            }
            int i11 = i10 + 1;
            if (i11 < iD) {
                this.d = sg3.b(ci0.R(str, i8, i10, 4));
                try {
                    i3 = Integer.parseInt(ci0.w(str, i11, iD, "", 120));
                } catch (NumberFormatException unused) {
                }
                if (i2 > i3 || i3 >= 65536) {
                    i3 = -1;
                }
                this.e = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i11, iD) + '\"').toString());
                }
            } else {
                this.d = sg3.b(ci0.R(str, i8, i10, 4));
                String str2 = this.a;
                str2.getClass();
                this.e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i8, i10) + '\"').toString());
            }
            iG = iD;
        } else {
            this.b = yw0Var.e();
            this.c = yw0Var.a();
            this.d = yw0Var.d;
            this.e = yw0Var.e;
            ArrayList arrayList = this.f;
            arrayList.clear();
            arrayList.addAll(yw0Var.c());
            if (iG == iH || str.charAt(iG) == '#') {
                String strD = yw0Var.d();
                this.g = strD != null ? h(ci0.w(strD, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iD2 = ug3.d(str, iG, "?#", iH);
        f(str, iG, iD2);
        if (iD2 < iH && str.charAt(iD2) == '?') {
            int iC2 = ug3.c(str, '#', iD2, iH);
            this.g = h(ci0.w(str, iD2 + 1, iC2, " \"'<>#", 80));
            iD2 = iC2;
        }
        if (iD2 >= iH || str.charAt(iD2) != '#') {
            return;
        }
        this.h = ci0.w(str, iD2 + 1, iH, "", 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        char cCharAt = str.charAt(i);
        ArrayList arrayList = this.f;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        while (i < i2) {
            int iD = ug3.d(str, i, "/\\", i2);
            boolean z = iD < i2;
            String strW = ci0.w(str, i, iD, " \"<>^`{}|/\\?#", 112);
            if (!strW.equals(".") && !strW.equalsIgnoreCase("%2e")) {
                if (!strW.equals("..") && !strW.equalsIgnoreCase("%2e.") && !strW.equalsIgnoreCase(".%2e") && !strW.equalsIgnoreCase("%2e%2e")) {
                    if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                        arrayList.set(arrayList.size() - 1, strW);
                    } else {
                        arrayList.add(strW);
                    }
                    if (z) {
                        arrayList.add("");
                    }
                } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                }
            }
            i = z ? iD + 1 : iD;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.a = "http";
        } else if (str.equalsIgnoreCase("https")) {
            this.a = "https";
        } else {
            s.j("unexpected scheme: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (pv2.i0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iC = c();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iC);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iC != i) {
                }
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            a11 a11VarW = ci0.W(ci0.X(0, arrayList2.size()), 2);
            int i3 = a11VarW.h;
            int i4 = a11VarW.i;
            int i5 = a11VarW.j;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}

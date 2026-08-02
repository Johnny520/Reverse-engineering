package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xw0 {

    /* JADX INFO: renamed from: a */
    public String f13200a;

    /* JADX INFO: renamed from: d */
    public String f13203d;

    /* JADX INFO: renamed from: g */
    public ArrayList f13206g;

    /* JADX INFO: renamed from: h */
    public String f13207h;

    /* JADX INFO: renamed from: b */
    public String f13201b = "";

    /* JADX INFO: renamed from: c */
    public String f13202c = "";

    /* JADX INFO: renamed from: e */
    public int f13204e = -1;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13205f = AbstractC0179eu.m1437R("");

    /* JADX INFO: renamed from: h */
    public static ArrayList m6191h(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM4003p0 = pv2.m4003p0(str, '&', i, 4);
            if (iM4003p0 == -1) {
                iM4003p0 = str.length();
            }
            int iM4003p02 = pv2.m4003p0(str, '=', i, 4);
            if (iM4003p02 == -1 || iM4003p02 > iM4003p0) {
                arrayList.add(str.substring(i, iM4003p0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM4003p02));
                arrayList.add(str.substring(iM4003p02 + 1, iM4003p0));
            }
            i = iM4003p0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m6192a(String str, String str2) {
        str.getClass();
        if (this.f13206g == null) {
            this.f13206g = new ArrayList();
        }
        ArrayList arrayList = this.f13206g;
        arrayList.getClass();
        arrayList.add(ci0.m822w(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = this.f13206g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? ci0.m822w(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    /* JADX INFO: renamed from: b */
    public final yw0 m6193b() {
        ArrayList arrayList;
        String str = this.f13200a;
        if (str == null) {
            C0676s.m4653l("scheme == null");
            return null;
        }
        String strM793R = ci0.m793R(this.f13201b, 0, 0, 7);
        String strM793R2 = ci0.m793R(this.f13202c, 0, 0, 7);
        String str2 = this.f13203d;
        if (str2 == null) {
            C0676s.m4653l("host == null");
            return null;
        }
        int iM6194c = m6194c();
        ArrayList arrayList2 = this.f13205f;
        ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(ci0.m793R((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f13206g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0179eu.m1421B(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? ci0.m793R(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f13207h;
        return new yw0(str, strM793R, strM793R2, str2, iM6194c, arrayList3, arrayList, str4 != null ? ci0.m793R(str4, 0, 0, 7) : null, toString());
    }

    /* JADX INFO: renamed from: c */
    public final int m6194c() {
        int i = this.f13204e;
        if (i != -1) {
            return i;
        }
        String str = this.f13200a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m6195d(String str) {
        str.getClass();
        String strM4866b = sg3.m4866b(ci0.m793R(str, 0, 0, 7));
        if (strM4866b != null) {
            this.f13203d = strM4866b;
        } else {
            C0676s.m4651j("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6196e(yw0 yw0Var, String str) {
        int i;
        int i2;
        byte b;
        int iM5496d;
        int i3;
        char cCharAt;
        str.getClass();
        byte[] bArr = ug3.f11300a;
        int i4 = 0;
        int iM5499g = ug3.m5499g(str, 0, str.length());
        int iM5500h = ug3.m5500h(str, iM5499g, str.length());
        byte b2 = -1;
        if (iM5500h - iM5499g < 2) {
            i = -1;
        } else {
            char cCharAt2 = str.charAt(iM5499g);
            if ((t11.m5089o(cCharAt2, 97) >= 0 && t11.m5089o(cCharAt2, 122) <= 0) || (t11.m5089o(cCharAt2, 65) >= 0 && t11.m5089o(cCharAt2, 90) <= 0)) {
                i = iM5499g + 1;
                while (true) {
                    if (i >= iM5500h) {
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
            if (wv2.m6011c0(str, "https:", iM5499g, true)) {
                this.f13200a = "https";
                iM5499g += 6;
            } else {
                if (!wv2.m6011c0(str, "http:", iM5499g, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.f13200a = "http";
                iM5499g += 5;
            }
        } else {
            if (yw0Var == null) {
                C0676s.m4651j("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? pv2.m3992H0(str, 6).concat("...") : str));
                return;
            }
            this.f13200a = yw0Var.f13641a;
        }
        int i6 = iM5499g;
        int i7 = 0;
        while (true) {
            i2 = i5;
            b = 47;
            if (i6 >= iM5500h || !((cCharAt = str.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        byte b3 = 35;
        if (i7 >= 2 || yw0Var == null || !t11.m5086l(yw0Var.f13641a, this.f13200a)) {
            int i8 = iM5499g + i7;
            int i9 = 0;
            while (true) {
                iM5496d = ug3.m5496d(str, i8, "@/\\?#", iM5500h);
                byte bCharAt = iM5496d != iM5500h ? str.charAt(iM5496d) : b2;
                if (bCharAt == b2 || bCharAt == b3 || bCharAt == b || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i4 == 0) {
                        int iM5495c = ug3.m5495c(str, ':', i8, iM5496d);
                        String strM822w = ci0.m822w(str, i8, iM5495c, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (i9 != 0) {
                            strM822w = this.f13201b + "%40" + strM822w;
                        }
                        this.f13201b = strM822w;
                        if (iM5495c != iM5496d) {
                            this.f13202c = ci0.m822w(str, iM5495c + 1, iM5496d, " \"':;<=>@[]^`{}|/\\?#", 112);
                            i4 = i2;
                        }
                        i9 = i2;
                    } else {
                        this.f13202c += "%40" + ci0.m822w(str, i8, iM5496d, " \"':;<=>@[]^`{}|/\\?#", 112);
                    }
                    i8 = iM5496d + 1;
                    b3 = 35;
                    b2 = -1;
                }
                b = 47;
            }
            int i10 = i8;
            while (true) {
                if (i10 < iM5496d) {
                    char cCharAt4 = str.charAt(i10);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i10++;
                            if (i10 < iM5496d) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                } else {
                    i10 = iM5496d;
                    break;
                }
            }
            int i11 = i10 + 1;
            if (i11 < iM5496d) {
                this.f13203d = sg3.m4866b(ci0.m793R(str, i8, i10, 4));
                try {
                    i3 = Integer.parseInt(ci0.m822w(str, i11, iM5496d, "", 120));
                } catch (NumberFormatException unused) {
                }
                if (i2 > i3 || i3 >= 65536) {
                    i3 = -1;
                }
                this.f13204e = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i11, iM5496d) + '\"').toString());
                }
            } else {
                this.f13203d = sg3.m4866b(ci0.m793R(str, i8, i10, 4));
                String str2 = this.f13200a;
                str2.getClass();
                this.f13204e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.f13203d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i8, i10) + '\"').toString());
            }
            iM5499g = iM5496d;
        } else {
            this.f13201b = yw0Var.m6359e();
            this.f13202c = yw0Var.m6355a();
            this.f13203d = yw0Var.f13644d;
            this.f13204e = yw0Var.f13645e;
            ArrayList arrayList = this.f13205f;
            arrayList.clear();
            arrayList.addAll(yw0Var.m6357c());
            if (iM5499g == iM5500h || str.charAt(iM5499g) == '#') {
                String strM6358d = yw0Var.m6358d();
                this.f13206g = strM6358d != null ? m6191h(ci0.m822w(strM6358d, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iM5496d2 = ug3.m5496d(str, iM5499g, "?#", iM5500h);
        m6197f(str, iM5499g, iM5496d2);
        if (iM5496d2 < iM5500h && str.charAt(iM5496d2) == '?') {
            int iM5495c2 = ug3.m5495c(str, '#', iM5496d2, iM5500h);
            this.f13206g = m6191h(ci0.m822w(str, iM5496d2 + 1, iM5495c2, " \"'<>#", 80));
            iM5496d2 = iM5495c2;
        }
        if (iM5496d2 >= iM5500h || str.charAt(iM5496d2) != '#') {
            return;
        }
        this.f13207h = ci0.m822w(str, iM5496d2 + 1, iM5500h, "", 48);
    }

    /* JADX INFO: renamed from: f */
    public final void m6197f(String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        char cCharAt = str.charAt(i);
        ArrayList arrayList = this.f13205f;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        while (i < i2) {
            int iM5496d = ug3.m5496d(str, i, "/\\", i2);
            boolean z = iM5496d < i2;
            String strM822w = ci0.m822w(str, i, iM5496d, " \"<>^`{}|/\\?#", 112);
            if (!strM822w.equals(".") && !strM822w.equalsIgnoreCase("%2e")) {
                if (!strM822w.equals("..") && !strM822w.equalsIgnoreCase("%2e.") && !strM822w.equalsIgnoreCase(".%2e") && !strM822w.equalsIgnoreCase("%2e%2e")) {
                    if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                        arrayList.set(arrayList.size() - 1, strM822w);
                    } else {
                        arrayList.add(strM822w);
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
            i = z ? iM5496d + 1 : iM5496d;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6198g(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.f13200a = "http";
        } else if (str.equalsIgnoreCase("https")) {
            this.f13200a = "https";
        } else {
            C0676s.m4651j("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13200a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f13201b.length() > 0 || this.f13202c.length() > 0) {
            sb.append(this.f13201b);
            if (this.f13202c.length() > 0) {
                sb.append(':');
                sb.append(this.f13202c);
            }
            sb.append('@');
        }
        String str2 = this.f13203d;
        if (str2 != null) {
            if (pv2.m3996i0(str2, ':')) {
                sb.append('[');
                sb.append(this.f13203d);
                sb.append(']');
            } else {
                sb.append(this.f13203d);
            }
        }
        int i = -1;
        if (this.f13204e != -1 || this.f13200a != null) {
            int iM6194c = m6194c();
            String str3 = this.f13200a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iM6194c);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iM6194c != i) {
                }
            }
        }
        ArrayList arrayList = this.f13205f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f13206g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f13206g;
            arrayList2.getClass();
            a11 a11VarM798W = ci0.m798W(ci0.m799X(0, arrayList2.size()), 2);
            int i3 = a11VarM798W.f25h;
            int i4 = a11VarM798W.f26i;
            int i5 = a11VarM798W.f27j;
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
        if (this.f13207h != null) {
            sb.append('#');
            sb.append(this.f13207h);
        }
        return sb.toString();
    }
}

package p118X3;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Iterator;
import p061L2.AbstractC0974n;
import p117X2.AbstractC1665j;
import p123Y3.AbstractC1773d;
import p123Y3.AbstractC1774e;
import p132a3.C1802b;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;
import p179i4.AbstractC2352g;
import p202m4.AbstractC2617a;

/* JADX INFO: renamed from: X3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1708r {

    /* JADX INFO: renamed from: a */
    public String f5860a;

    /* JADX INFO: renamed from: d */
    public String f5863d;

    /* JADX INFO: renamed from: g */
    public ArrayList f5866g;

    /* JADX INFO: renamed from: h */
    public String f5867h;

    /* JADX INFO: renamed from: b */
    public String f5861b = "";

    /* JADX INFO: renamed from: c */
    public String f5862c = "";

    /* JADX INFO: renamed from: e */
    public int f5864e = -1;

    /* JADX INFO: renamed from: f */
    public final ArrayList f5865f = AbstractC2352g.m4178A("");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m3042d(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 <= str.length()) {
            int iM3634b0 = AbstractC1976d.m3634b0(str, '&', i5, 4);
            if (iM3634b0 == -1) {
                iM3634b0 = str.length();
            }
            int iM3634b02 = AbstractC1976d.m3634b0(str, '=', i5, 4);
            if (iM3634b02 == -1 || iM3634b02 > iM3634b0) {
                String strSubstring = str.substring(i5, iM3634b0);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i5, iM3634b02);
                AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM3634b02 + 1, iM3634b0);
                AbstractC1665j.m2984d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i5 = iM3634b0 + 1;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1709s m3043a() {
        ArrayList arrayList;
        String str = this.f5860a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM4570d = AbstractC2617a.m4570d(this.f5861b, 0, 0, 7);
        String strM4570d2 = AbstractC2617a.m4570d(this.f5862c, 0, 0, 7);
        String str2 = this.f5863d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM3044b = m3044b();
        ArrayList arrayList2 = this.f5865f;
        ArrayList arrayList3 = new ArrayList(AbstractC0974n.m2029K(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC2617a.m4570d((String) it.next(), 0, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f5866g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC0974n.m2029K(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? AbstractC2617a.m4570d(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f5867h;
        return new C1709s(str, strM4570d, strM4570d2, str2, iM3044b, arrayList3, arrayList, str4 != null ? AbstractC2617a.m4570d(str4, 0, 0, 7) : null, toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m3044b() {
        int i5 = this.f5864e;
        if (i5 != -1) {
            return i5;
        }
        String str = this.f5860a;
        AbstractC1665j.m2982b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3045c(C1709s c1709s, String str) {
        int i5;
        int iM3163d;
        int i6;
        char cCharAt;
        AbstractC1665j.m2985e(str, "input");
        byte[] bArr = AbstractC1774e.f6072a;
        int iM3166g = AbstractC1774e.m3166g(0, str.length(), str);
        int iM3167h = AbstractC1774e.m3167h(iM3166g, str.length(), str);
        if (iM3167h - iM3166g < 2) {
            i5 = -1;
        } else {
            char cCharAt2 = str.charAt(iM3166g);
            if ((AbstractC1665j.m2987g(cCharAt2, 97) >= 0 && AbstractC1665j.m2987g(cCharAt2, 122) <= 0) || (AbstractC1665j.m2987g(cCharAt2, 65) >= 0 && AbstractC1665j.m2987g(cCharAt2, 90) <= 0)) {
                i5 = iM3166g + 1;
                while (true) {
                    if (i5 >= iM3167h) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i5);
                    if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && (('0' > cCharAt3 || cCharAt3 >= ':') && cCharAt3 != '+' && cCharAt3 != '-' && cCharAt3 != '.'))) {
                        if (cCharAt3 != ':') {
                            break;
                        }
                    } else {
                        i5++;
                    }
                }
                i5 = -1;
            }
        }
        if (i5 == -1) {
            if (c1709s == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + (str.length() > 6 ? AbstractC1976d.m3646n0(str, 6).concat("...") : str));
            }
            this.f5860a = c1709s.f5868a;
        } else if (AbstractC1983k.m3655R(str, "https:", iM3166g, true)) {
            this.f5860a = "https";
            iM3166g += 6;
        } else {
            if (!AbstractC1983k.m3655R(str, "http:", iM3166g, true)) {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = str.substring(0, i5);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
            this.f5860a = "http";
            iM3166g += 5;
        }
        int i7 = 0;
        for (int i8 = iM3166g; i8 < iM3167h && ((cCharAt = str.charAt(i8)) == '/' || cCharAt == '\\'); i8++) {
            i7++;
        }
        ArrayList arrayList = this.f5865f;
        char c5 = '#';
        if (i7 >= 2 || c1709s == null || !AbstractC1665j.m2981a(c1709s.f5868a, this.f5860a)) {
            int i9 = iM3166g + i7;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                iM3163d = AbstractC1774e.m3163d(str, i9, "@/\\?#", iM3167h);
                byte bCharAt = iM3163d != iM3167h ? str.charAt(iM3163d) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c5 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z5) {
                        this.f5862c += "%40" + AbstractC2617a.m4567a(str, i9, iM3163d, " \"':;<=>@[]^`{}|/\\?#", 112);
                        z5 = z5;
                    } else {
                        boolean z7 = z5;
                        int iM3162c = AbstractC1774e.m3162c(str, ':', i9, iM3163d);
                        String strM4567a = AbstractC2617a.m4567a(str, i9, iM3162c, " \"':;<=>@[]^`{}|/\\?#", 112);
                        if (z6) {
                            strM4567a = this.f5861b + "%40" + strM4567a;
                        }
                        this.f5861b = strM4567a;
                        if (iM3162c != iM3163d) {
                            this.f5862c = AbstractC2617a.m4567a(str, iM3162c + 1, iM3163d, " \"':;<=>@[]^`{}|/\\?#", 112);
                            z5 = true;
                        } else {
                            z5 = z7;
                        }
                        z6 = true;
                    }
                    i9 = iM3163d + 1;
                    c5 = '#';
                }
            }
            int i10 = i9;
            while (true) {
                if (i10 >= iM3163d) {
                    i10 = iM3163d;
                    break;
                }
                char cCharAt4 = str.charAt(i10);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i10++;
                        if (i10 < iM3163d) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            int i11 = i10 + 1;
            if (i11 < iM3163d) {
                this.f5863d = AbstractC1773d.m3159b(AbstractC2617a.m4570d(str, i9, i10, 4));
                try {
                    i6 = Integer.parseInt(AbstractC2617a.m4567a(str, i11, iM3163d, "", 120));
                } catch (NumberFormatException unused) {
                }
                if (1 > i6 || i6 >= 65536) {
                    i6 = -1;
                }
                this.f5864e = i6;
                if (i6 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = str.substring(i11, iM3163d);
                    AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f5863d = AbstractC1773d.m3159b(AbstractC2617a.m4570d(str, i9, i10, 4));
                String str2 = this.f5860a;
                AbstractC1665j.m2982b(str2);
                this.f5864e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.f5863d == null) {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = str.substring(i9, i10);
                AbstractC1665j.m2984d(strSubstring3, "substring(...)");
                sb3.append(strSubstring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            iM3166g = iM3163d;
        } else {
            this.f5861b = c1709s.m3050e();
            this.f5862c = c1709s.m3046a();
            this.f5863d = c1709s.f5871d;
            this.f5864e = c1709s.f5872e;
            arrayList.clear();
            arrayList.addAll(c1709s.m3048c());
            if (iM3166g == iM3167h || str.charAt(iM3166g) == '#') {
                String strM3049d = c1709s.m3049d();
                this.f5866g = strM3049d != null ? m3042d(AbstractC2617a.m4567a(strM3049d, 0, 0, " \"'<>#", 83)) : null;
            }
        }
        int iM3163d2 = AbstractC1774e.m3163d(str, iM3166g, "?#", iM3167h);
        if (iM3166g != iM3163d2) {
            char cCharAt5 = str.charAt(iM3166g);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM3166g++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM3166g < iM3163d2) {
                int iM3163d3 = AbstractC1774e.m3163d(str, iM3166g, "/\\", iM3163d2);
                boolean z8 = iM3163d3 < iM3163d2;
                String strM4567a2 = AbstractC2617a.m4567a(str, iM3166g, iM3163d3, " \"<>^`{}|/\\?#", 112);
                if (!strM4567a2.equals(".") && !strM4567a2.equalsIgnoreCase("%2e")) {
                    if (!strM4567a2.equals("..") && !strM4567a2.equalsIgnoreCase("%2e.") && !strM4567a2.equalsIgnoreCase(".%2e") && !strM4567a2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM4567a2);
                        } else {
                            arrayList.add(strM4567a2);
                        }
                        if (z8) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM3166g = z8 ? iM3163d3 + 1 : iM3163d3;
            }
        }
        if (iM3163d2 < iM3167h && str.charAt(iM3163d2) == '?') {
            int iM3162c2 = AbstractC1774e.m3162c(str, '#', iM3163d2, iM3167h);
            this.f5866g = m3042d(AbstractC2617a.m4567a(str, iM3163d2 + 1, iM3162c2, " \"'<>#", 80));
            iM3163d2 = iM3162c2;
        }
        if (iM3163d2 >= iM3167h || str.charAt(iM3163d2) != '#') {
            return;
        }
        this.f5867h = AbstractC2617a.m4567a(str, iM3163d2 + 1, iM3167h, "", 48);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f5860a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f5861b.length() > 0 || this.f5862c.length() > 0) {
            sb.append(this.f5861b);
            if (this.f5862c.length() > 0) {
                sb.append(':');
                sb.append(this.f5862c);
            }
            sb.append('@');
        }
        String str2 = this.f5863d;
        if (str2 != null) {
            if (AbstractC1976d.m3628V(str2, ':')) {
                sb.append('[');
                sb.append(this.f5863d);
                sb.append(']');
            } else {
                sb.append(this.f5863d);
            }
        }
        int i5 = -1;
        if (this.f5864e != -1 || this.f5860a != null) {
            int iM3044b = m3044b();
            String str3 = this.f5860a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iM3044b);
            } else {
                if (str3.equals("http")) {
                    i5 = 80;
                } else if (str3.equals("https")) {
                    i5 = 443;
                }
                if (iM3044b != i5) {
                }
            }
        }
        ArrayList arrayList = this.f5865f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            sb.append('/');
            sb.append((String) arrayList.get(i6));
        }
        if (this.f5866g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f5866g;
            AbstractC1665j.m2982b(arrayList2);
            C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, arrayList2.size()), 2);
            int i7 = c1802bM3552E.f6140d;
            int i8 = c1802bM3552E.f6141e;
            int i9 = c1802bM3552E.f6142f;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i7);
                    String str5 = (String) arrayList2.get(i7 + 1);
                    if (i7 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i7 == i8) {
                        break;
                    }
                    i7 += i9;
                }
            }
        }
        if (this.f5867h != null) {
            sb.append('#');
            sb.append(this.f5867h);
        }
        return sb.toString();
    }
}

package p035c8;

import af.C0082e;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import okhttp3.HttpUrl;
import p250qh.InterfaceC3613a;

/* JADX INFO: renamed from: c8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413b implements InterfaceC3613a, Closeable {

    /* JADX INFO: renamed from: G */
    public static final HashMap f1129G;

    /* JADX INFO: renamed from: H */
    public static final char[] f1130H;

    /* JADX INFO: renamed from: I */
    public static final char[] f1131I;

    /* JADX INFO: renamed from: J */
    public static final char[] f1132J;

    /* JADX INFO: renamed from: K */
    public static final char[] f1133K;

    /* JADX INFO: renamed from: L */
    public static final char[] f1134L;

    /* JADX INFO: renamed from: M */
    public static final char[] f1135M;

    /* JADX INFO: renamed from: N */
    public static final char[] f1136N;

    /* JADX INFO: renamed from: O */
    public static final char[] f1137O;

    /* JADX INFO: renamed from: P */
    public static final char[] f1138P;

    /* JADX INFO: renamed from: Q */
    public static final char[] f1139Q;

    /* JADX INFO: renamed from: R */
    public static final char[] f1140R;

    /* JADX INFO: renamed from: S */
    public static final char[] f1141S;

    /* JADX INFO: renamed from: T */
    public static final char[] f1142T;

    /* JADX INFO: renamed from: U */
    public static final char[] f1143U;

    /* JADX INFO: renamed from: V */
    public static final char[] f1144V;

    /* JADX INFO: renamed from: W */
    public static final char[] f1145W;

    /* JADX INFO: renamed from: X */
    public static final char[] f1146X;

    /* JADX INFO: renamed from: Y */
    public static final char[] f1147Y;

    /* JADX INFO: renamed from: Z */
    public static final char[] f1148Z;

    /* JADX INFO: renamed from: a0 */
    public static final char[] f1149a0;

    /* JADX INFO: renamed from: b0 */
    public static final char[] f1150b0;

    /* JADX INFO: renamed from: c0 */
    public static final char[] f1151c0;

    /* JADX INFO: renamed from: d0 */
    public static final char[] f1152d0;

    /* JADX INFO: renamed from: A */
    public boolean f1153A;

    /* JADX INFO: renamed from: B */
    public int f1154B;

    /* JADX INFO: renamed from: C */
    public boolean f1155C;

    /* JADX INFO: renamed from: D */
    public String[] f1156D;

    /* JADX INFO: renamed from: E */
    public String f1157E;

    /* JADX INFO: renamed from: F */
    public boolean f1158F;

    /* JADX INFO: renamed from: g */
    public String f1159g;

    /* JADX INFO: renamed from: h */
    public HashMap f1160h;

    /* JADX INFO: renamed from: i */
    public HashMap f1161i;

    /* JADX INFO: renamed from: j */
    public int f1162j;

    /* JADX INFO: renamed from: k */
    public String[] f1163k;

    /* JADX INFO: renamed from: l */
    public String[] f1164l;

    /* JADX INFO: renamed from: m */
    public int[] f1165m;

    /* JADX INFO: renamed from: n */
    public StringReader f1166n;

    /* JADX INFO: renamed from: o */
    public C0412a f1167o;

    /* JADX INFO: renamed from: p */
    public char[] f1168p;

    /* JADX INFO: renamed from: q */
    public int f1169q;

    /* JADX INFO: renamed from: r */
    public int f1170r;

    /* JADX INFO: renamed from: s */
    public int f1171s;

    /* JADX INFO: renamed from: t */
    public int f1172t;

    /* JADX INFO: renamed from: u */
    public int f1173u;

    /* JADX INFO: renamed from: v */
    public boolean f1174v;

    /* JADX INFO: renamed from: w */
    public String f1175w;

    /* JADX INFO: renamed from: x */
    public String f1176x;

    /* JADX INFO: renamed from: y */
    public String f1177y;

    /* JADX INFO: renamed from: z */
    public String f1178z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        f1129G = map;
        map.put("lt", "<");
        map.put("gt", ">");
        map.put("amp", "&");
        map.put("apos", "'");
        map.put("quot", "\"");
        f1130H = new char[]{'<', '!', '-', '-'};
        f1131I = new char[]{'-', '-', '>'};
        f1132J = new char[]{'-', '-'};
        f1133K = new char[]{'<', '!', '[', 'C', 'D', 'A', 'T', 'A', '['};
        f1134L = new char[]{']', ']', '>'};
        f1135M = new char[]{'<', '?'};
        f1136N = new char[]{'?', '>'};
        f1137O = new char[]{'<', '!', 'D', 'O', 'C', 'T', 'Y', 'P', 'E'};
        f1138P = new char[]{'S', 'Y', 'S', 'T', 'E', 'M'};
        f1139Q = new char[]{'P', 'U', 'B', 'L', 'I', 'C'};
        f1140R = new char[]{'<', '!', 'E', 'L', 'E', 'M', 'E', 'N', 'T'};
        f1141S = new char[]{'<', '!', 'A', 'T', 'T', 'L', 'I', 'S', 'T'};
        f1142T = new char[]{'<', '!', 'E', 'N', 'T', 'I', 'T', 'Y'};
        f1143U = new char[]{'<', '!', 'N', 'O', 'T', 'A', 'T', 'I', 'O', 'N'};
        f1144V = new char[]{'E', 'M', 'P', 'T', 'Y'};
        f1145W = new char[]{'A', 'N', 'Y'};
        f1146X = new char[]{'N', 'D', 'A', 'T', 'A'};
        f1147Y = new char[]{'N', 'O', 'T', 'A', 'T', 'I', 'O', 'N'};
        f1148Z = new char[]{'R', 'E', 'Q', 'U', 'I', 'R', 'E', 'D'};
        f1149a0 = new char[]{'I', 'M', 'P', 'L', 'I', 'E', 'D'};
        f1150b0 = new char[]{'F', 'I', 'X', 'E', 'D'};
        f1151c0 = new char[]{'\''};
        f1152d0 = new char[]{'\"'};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String[] m1383b(String[] strArr, int i9) {
        if (strArr.length >= i9) {
            return strArr;
        }
        String[] strArr2 = new String[i9 + 16];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1384a(String str) throws C0082e {
        throw new C0082e(str, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1385c(int i9) throws C0082e, IOException {
        int i10;
        int i11;
        while (true) {
            C0412a c0412a = this.f1167o;
            if (c0412a == null) {
                int i12 = 0;
                while (true) {
                    i10 = this.f1169q;
                    if (i12 >= i10) {
                        break;
                    }
                    if (this.f1168p[i12] == '\n') {
                        this.f1171s++;
                        this.f1172t = 0;
                    } else {
                        this.f1172t++;
                    }
                    i12++;
                }
                int i13 = this.f1170r;
                if (i13 != i10) {
                    int i14 = i13 - i10;
                    this.f1170r = i14;
                    char[] cArr = this.f1168p;
                    System.arraycopy(cArr, i10, cArr, 0, i14);
                } else {
                    this.f1170r = 0;
                }
                this.f1169q = 0;
                do {
                    StringReader stringReader = this.f1166n;
                    char[] cArr2 = this.f1168p;
                    int i15 = this.f1170r;
                    int i16 = stringReader.read(cArr2, i15, cArr2.length - i15);
                    if (i16 == -1) {
                        return false;
                    }
                    i11 = this.f1170r + i16;
                    this.f1170r = i11;
                } while (i11 < i9);
            } else {
                if (this.f1169q < this.f1170r) {
                    throw new C0082e("Unbalanced entity!", this);
                }
                this.f1168p = (char[]) c0412a.f1128e;
                int i17 = c0412a.f1125b;
                this.f1169q = i17;
                int i18 = c0412a.f1126c;
                this.f1170r = i18;
                this.f1167o = (C0412a) c0412a.f1127d;
                if (i18 - i17 >= i9) {
                    break;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1386e() {
        int i9 = this.f1171s;
        int i10 = this.f1169q - 1;
        char[] cArr = this.f1168p;
        int i11 = 0;
        while (i11 < i10) {
            if (cArr[i11] == '\n') {
                i9++;
            }
            i11++;
        }
        while (i11 >= 0) {
            char c10 = cArr[i11];
            if (c10 > ' ') {
                break;
            }
            if (c10 == '\n') {
                i9--;
            }
            i11--;
        }
        return i9 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m1387g(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int i9 = (this.f1165m[this.f1162j] << 1) - 2; i9 >= 0; i9 -= 2) {
            String[] strArr = this.f1164l;
            if (str == null) {
                if (strArr[i9] == null) {
                    return strArr[i9 + 1];
                }
            } else if (str.equals(strArr[i9])) {
                return this.f1164l[i9 + 1];
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m1388h() {
        int i9 = this.f1173u;
        if (i9 < 4) {
            return null;
        }
        if (i9 == 6 && this.f1158F) {
            return null;
        }
        String str = this.f1178z;
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r10 = r9.f1162j;
        r11 = r10 + 1;
        r9.f1162j = r11;
        r10 = r10 * 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r11 != 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        r9.f1155C = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r11 = m1383b(r9.f1163k, r10 + 4);
        r9.f1163k = r11;
        r11[r10 + 3] = r9.f1177y;
        r11 = r9.f1162j;
        r1 = r9.f1165m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r11 < r1.length) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        r11 = new int[r11 + 4];
        java.lang.System.arraycopy(r1, 0, r11, 0, r1.length);
        r9.f1165m = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r11 = r9.f1165m;
        r0 = r9.f1162j;
        r11[r0] = r11[r0 - 1];
        r9.f1175w = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
        r11 = r9.f1161i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r11 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
    
        r11 = (java.util.Map) r11.get(r9.f1177y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r11 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        r11 = r11.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r11.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r0 = (java.util.Map.Entry) r11.next();
        r1 = (java.lang.String) r0.getKey();
        r2 = (r9.f1154B * 4) - 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ba, code lost:
    
        if (r2 < 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        if (r9.f1156D[r2 + 2].equals(r1) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        r1 = r9.f1156D[r2 + 3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r2 = r2 - 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (r1 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        r1 = r9.f1154B;
        r9.f1154B = r1 + 1;
        r1 = r1 * 4;
        r2 = m1383b(r9.f1156D, r1 + 4);
        r9.f1156D = r2;
        r2[r1] = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
        r2[r1 + 1] = null;
        r2[r1 + 2] = (java.lang.String) r0.getKey();
        r9.f1156D[r1 + 3] = (java.lang.String) r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        r11 = r9.f1163k;
        r11[r10] = r9.f1175w;
        r11[r10 + 1] = r9.f1176x;
        r11[r10 + 2] = r9.f1177y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0117, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1389i(boolean z9, boolean z10) throws C0082e {
        if (!z9) {
            m1392m('<');
        }
        this.f1177y = m1396t();
        this.f1154B = 0;
        while (true) {
            m1400y();
            if (this.f1169q >= this.f1170r && !m1385c(1)) {
                m1384a("Unexpected EOF");
                return;
            }
            char[] cArr = this.f1168p;
            int i9 = this.f1169q;
            char c10 = cArr[i9];
            if (!z9) {
                if (c10 != '/') {
                    if (c10 == '>') {
                        this.f1169q = i9 + 1;
                        break;
                    }
                } else {
                    this.f1153A = true;
                    this.f1169q = i9 + 1;
                    m1400y();
                    m1392m('>');
                    break;
                }
            } else if (c10 == '?') {
                this.f1169q = i9 + 1;
                m1392m('>');
                return;
            }
            String strM1396t = m1396t();
            int i10 = this.f1154B;
            this.f1154B = i10 + 1;
            int i11 = i10 * 4;
            String[] strArrM1383b = m1383b(this.f1156D, i11 + 4);
            this.f1156D = strArrM1383b;
            strArrM1383b[i11] = HttpUrl.FRAGMENT_ENCODE_SET;
            strArrM1383b[i11 + 1] = null;
            strArrM1383b[i11 + 2] = strM1396t;
            m1400y();
            if (this.f1169q >= this.f1170r && !m1385c(1)) {
                m1384a("Unexpected EOF");
                return;
            }
            char[] cArr2 = this.f1168p;
            int i12 = this.f1169q;
            if (cArr2[i12] == '=') {
                this.f1169q = i12 + 1;
                m1400y();
                if (this.f1169q >= this.f1170r && !m1385c(1)) {
                    m1384a("Unexpected EOF");
                    return;
                }
                char[] cArr3 = this.f1168p;
                int i13 = this.f1169q;
                char c11 = cArr3[i13];
                if (c11 != '\'' && c11 != '\"') {
                    throw new C0082e("attr value delimiter missing!", this);
                }
                this.f1169q = i13 + 1;
                this.f1156D[i11 + 3] = m1399x(c11, true, z10, 1);
                if (c11 != ' ' && m1390k() == c11) {
                    this.f1169q++;
                }
            } else {
                m1384a("Attr.value missing f. ".concat(strM1396t));
                this.f1156D[i11 + 3] = strM1396t;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m1390k() {
        if (this.f1169q < this.f1170r || m1385c(1)) {
            return this.f1168p[this.f1169q];
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final int m1391l(boolean z9) throws C0082e {
        char c10;
        char c11;
        if (this.f1169q >= this.f1170r && !m1385c(1)) {
            return 1;
        }
        char[] cArr = this.f1168p;
        int i9 = this.f1169q;
        char c12 = cArr[i9];
        if (c12 != '%') {
            if (c12 == '&') {
                return 6;
            }
            if (c12 == '<') {
                if (i9 + 3 >= this.f1170r && !m1385c(4)) {
                    throw new C0082e("Dangling <", this);
                }
                char[] cArr2 = this.f1168p;
                int i10 = this.f1169q;
                char c13 = cArr2[i10 + 1];
                if (c13 != '!') {
                    if (c13 == '/') {
                        return 3;
                    }
                    if (c13 != '?') {
                        return 2;
                    }
                    if (i10 + 5 < this.f1170r || m1385c(6)) {
                        char[] cArr3 = this.f1168p;
                        int i11 = this.f1169q;
                        char c14 = cArr3[i11 + 2];
                        if ((c14 == 'x' || c14 == 'X') && (((c10 = cArr3[i11 + 3]) == 'm' || c10 == 'M') && (((c11 = cArr3[i11 + 4]) == 'l' || c11 == 'L') && cArr3[i11 + 5] == ' '))) {
                            return 998;
                        }
                    }
                    return 8;
                }
                char c15 = cArr2[i10 + 2];
                if (c15 == '-') {
                    return 9;
                }
                if (c15 == 'A') {
                    return 13;
                }
                if (c15 == 'N') {
                    return 14;
                }
                if (c15 == '[') {
                    return 5;
                }
                if (c15 == 'D') {
                    return 10;
                }
                if (c15 == 'E') {
                    char c16 = cArr2[i10 + 3];
                    if (c16 == 'L') {
                        return 11;
                    }
                    if (c16 == 'N') {
                        return 12;
                    }
                }
                throw new C0082e("Unexpected <!", this);
            }
        } else if (z9) {
            return 15;
        }
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1392m(char c10) throws C0082e {
        int iM1390k = m1390k();
        if (iM1390k != c10) {
            m1384a("expected: '" + c10 + "' actual: '" + ((char) iM1390k) + "'");
            if (iM1390k == -1) {
                return;
            }
        }
        this.f1169q++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1393o(char[] cArr) throws C0082e {
        if (this.f1169q + cArr.length > this.f1170r && !m1385c(cArr.length)) {
            m1384a("expected: '" + new String(cArr) + "' but was EOF");
            return;
        }
        for (int i9 = 0; i9 < cArr.length; i9++) {
            if (this.f1168p[this.f1169q + i9] != cArr[i9]) {
                m1384a("expected: \"" + new String(cArr) + "\" but was \"" + new String(this.f1168p, this.f1169q, cArr.length) + "...\"");
            }
        }
        this.f1169q += cArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m1394q() throws C0082e {
        m1393o(f1130H);
        String strM1398w = m1398w(f1132J, false);
        if (m1390k() != 62) {
            throw new C0082e("Comments may not contain --", this);
        }
        this.f1169q++;
        return strM1398w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m1395s(boolean z9, boolean z10) throws C0082e {
        int iM1390k;
        m1400y();
        int iM1390k2 = m1390k();
        if (iM1390k2 == 83) {
            m1393o(f1138P);
        } else {
            if (iM1390k2 != 80) {
                return false;
            }
            m1393o(f1139Q);
            m1400y();
            if (z10) {
                m1397u(true);
            } else {
                m1397u(false);
            }
        }
        m1400y();
        if (!z9 && (iM1390k = m1390k()) != 34 && iM1390k != 39) {
            return true;
        }
        if (z10) {
            this.f1159g = m1397u(true);
            return true;
        }
        m1397u(false);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m1396t() throws C0082e {
        if (this.f1169q >= this.f1170r && !m1385c(1)) {
            m1384a("name expected");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i9 = this.f1169q;
        char c10 = this.f1168p[i9];
        if ((c10 < 'a' || c10 > 'z') && ((c10 < 'A' || c10 > 'Z') && c10 != '_' && c10 != ':' && c10 < 192)) {
            m1384a("name expected");
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.f1169q = i9 + 1;
        StringBuilder sb2 = null;
        while (true) {
            if (this.f1169q >= this.f1170r) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f1168p, i9, this.f1169q - i9);
                if (!m1385c(1)) {
                    return sb2.toString();
                }
                i9 = this.f1169q;
            }
            char[] cArr = this.f1168p;
            int i10 = this.f1169q;
            char c11 = cArr[i10];
            if ((c11 < 'a' || c11 > 'z') && ((c11 < 'A' || c11 > 'Z') && !((c11 >= '0' && c11 <= '9') || c11 == '_' || c11 == '-' || c11 == ':' || c11 == '.' || c11 >= 183))) {
                if (sb2 == null) {
                    return new String(cArr, i9, i10 - i9);
                }
                sb2.append(cArr, i9, i10 - i9);
                return sb2.toString();
            }
            this.f1169q = i10 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final String m1397u(boolean z9) throws C0082e {
        char[] cArr;
        int iM1390k = m1390k();
        if (iM1390k == 34) {
            cArr = f1152d0;
        } else {
            if (iM1390k != 39) {
                throw new C0082e("Expected a quoted string", this);
            }
            cArr = f1151c0;
        }
        this.f1169q++;
        return m1398w(cArr, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final String m1398w(char[] cArr, boolean z9) throws C0082e {
        StringBuilder sb2;
        int i9;
        int i10 = this.f1169q;
        if (!z9 || this.f1178z == null) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f1178z);
        }
        while (true) {
            int i11 = this.f1169q;
            if (cArr.length + i11 > this.f1170r) {
                if (i10 < i11 && z9) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(this.f1168p, i10, this.f1169q - i10);
                }
                if (!m1385c(cArr.length)) {
                    m1384a("Unexpected EOF");
                    this.f1173u = 9;
                    return null;
                }
                i10 = this.f1169q;
            }
            for (int i12 = 0; i12 < cArr.length; i12++) {
                char[] cArr2 = this.f1168p;
                i9 = this.f1169q;
                if (cArr2[i9 + i12] != cArr[i12]) {
                    break;
                }
            }
            int i13 = this.f1169q;
            this.f1169q = cArr.length + i13;
            if (!z9) {
                return null;
            }
            char[] cArr3 = this.f1168p;
            if (sb2 == null) {
                return new String(cArr3, i10, i13 - i10);
            }
            sb2.append(cArr3, i10, i13 - i10);
            return sb2.toString();
            this.f1169q = i9 + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0183, code lost:
    
        m1384a("unresolved: &" + r9 + ";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0199, code lost:
    
        r3 = r16.f1169q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0232, code lost:
    
        if (r5 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023a, code lost:
    
        return new java.lang.String(r6, r3, r7 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x023b, code lost:
    
        r5.append(r6, r3, r7 - r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        return r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e8, code lost:
    
        r5.append(';');
        r16.f1169q++;
        r9 = r5.substring(r7 + 1, r5.length() - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0101, code lost:
    
        if (r9.startsWith("#") == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0109, code lost:
    
        if (r9.startsWith("#x") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        r8 = java.lang.Integer.parseInt(r9.substring(2), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        r8 = java.lang.Integer.parseInt(r9.substring(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011e, code lost:
    
        r5.delete(r7, r5.length());
        r5.appendCodePoint(r8);
        r16.f1158F = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
    
        throw new af.C0082e("Invalid character reference: &".concat(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        throw new af.C0082e("Invalid character reference: &".concat(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0140, code lost:
    
        if (r20 != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        r3 = (java.lang.String) p035c8.AbstractC0413b.f1129G.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
    
        if (r3 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014d, code lost:
    
        r5.delete(r7, r5.length());
        r16.f1158F = false;
        r5.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015a, code lost:
    
        r3 = r16.f1160h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015c, code lost:
    
        if (r3 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015e, code lost:
    
        r3 = (char[]) r3.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
    
        if (r3 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0166, code lost:
    
        r5.delete(r7, r5.length());
        r16.f1158F = false;
        r5.append(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0175, code lost:
    
        if (r16.f1159g == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0177, code lost:
    
        r5.delete(r7, r5.length());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017f, code lost:
    
        r16.f1158F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0181, code lost:
    
        if (r19 == false) goto L101;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m1399x(char c10, boolean z9, boolean z10, int i9) throws C0082e {
        StringBuilder sb2;
        int i10 = this.f1169q;
        if (i9 != 2 || this.f1178z == null) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f1178z);
        }
        while (true) {
            int i11 = this.f1169q;
            if (i11 >= this.f1170r) {
                if (i10 < i11) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    }
                    sb2.append(this.f1168p, i10, this.f1169q - i10);
                }
                if (!m1385c(1)) {
                    return sb2 != null ? sb2.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
                }
                i10 = this.f1169q;
            }
            char[] cArr = this.f1168p;
            int i12 = this.f1169q;
            char c11 = cArr[i12];
            if (c11 == c10 || ((c10 == ' ' && (c11 <= ' ' || c11 == '>')) || (c11 == '&' && !z9))) {
                break;
            }
            if (c11 == '\r' || ((c11 == '\n' && i9 == 1) || c11 == '&' || c11 == '<' || ((c11 == ']' && i9 == 2) || (c11 == '%' && i9 == 3)))) {
                if (sb2 == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.f1168p, i10, this.f1169q - i10);
                if (c11 == '\r') {
                    if (this.f1169q + 1 < this.f1170r || m1385c(2)) {
                        char[] cArr2 = this.f1168p;
                        int i13 = this.f1169q + 1;
                        if (cArr2[i13] == '\n') {
                            this.f1169q = i13;
                        }
                    }
                    c11 = i9 == 1 ? ' ' : '\n';
                    this.f1169q++;
                    sb2.append(c11);
                    i10 = this.f1169q;
                } else if (c11 == '\n') {
                    this.f1169q++;
                    sb2.append(c11);
                    i10 = this.f1169q;
                } else if (c11 == '&') {
                    this.f1174v = false;
                    int length = sb2.length();
                    char[] cArr3 = this.f1168p;
                    int i14 = this.f1169q;
                    this.f1169q = i14 + 1;
                    if (cArr3[i14] != '&') {
                        throw new AssertionError();
                    }
                    sb2.append('&');
                    while (true) {
                        int iM1390k = m1390k();
                        if (iM1390k == 59) {
                            break;
                        }
                        if (iM1390k < 128 && ((iM1390k < 48 || iM1390k > 57) && ((iM1390k < 97 || iM1390k > 122) && ((iM1390k < 65 || iM1390k > 90) && iM1390k != 95 && iM1390k != 45 && iM1390k != 35)))) {
                            throw new C0082e("unterminated entity ref", this);
                        }
                        this.f1169q++;
                        sb2.append((char) iM1390k);
                    }
                } else {
                    if (c11 == '<') {
                        if (i9 == 1) {
                            m1384a("Illegal: \"<\" inside attribute value");
                        }
                        this.f1174v = false;
                    } else {
                        if (c11 != ']') {
                            if (c11 == '%') {
                                throw new C0082e("This parser doesn't support parameter entities", this);
                            }
                            throw new AssertionError();
                        }
                        if (this.f1169q + 2 < this.f1170r || m1385c(3)) {
                            char[] cArr4 = this.f1168p;
                            int i15 = this.f1169q;
                            if (cArr4[i15 + 1] == ']' && cArr4[i15 + 2] == '>') {
                                m1384a("Illegal: \"]]>\" outside CDATA section");
                            }
                        }
                        this.f1174v = false;
                    }
                    this.f1169q++;
                    sb2.append(c11);
                    i10 = this.f1169q;
                }
            } else {
                this.f1174v &= c11 <= ' ';
                this.f1169q = i12 + 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m1400y() {
        while (true) {
            if (this.f1169q >= this.f1170r && !m1385c(1)) {
                return;
            }
            char[] cArr = this.f1168p;
            int i9 = this.f1169q;
            if (cArr[i9] > ' ') {
                return;
            } else {
                this.f1169q = i9 + 1;
            }
        }
    }
}

package p000;

import java.util.HashMap;

/* JADX INFO: renamed from: z9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0566z9 {

    /* JADX INFO: renamed from: a */
    public final byte[] f1143a;

    /* JADX INFO: renamed from: b */
    public final int f1144b;

    /* JADX INFO: renamed from: c */
    public final int f1145c;

    /* JADX INFO: renamed from: d */
    public final int f1146d;

    /* JADX INFO: renamed from: e */
    public final int f1147e;

    /* JADX INFO: renamed from: f */
    public final int f1148f;

    /* JADX INFO: renamed from: g */
    public final int f1149g;

    /* JADX INFO: renamed from: h */
    public final int f1150h;

    /* JADX INFO: renamed from: i */
    public final int f1151i;

    /* JADX INFO: renamed from: j */
    public final int f1152j;

    /* JADX INFO: renamed from: k */
    public final int[] f1153k;

    /* JADX INFO: renamed from: l */
    public final String[] f1154l;

    /* JADX INFO: renamed from: m */
    public final HashMap f1155m = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0566z9(byte[] bArr) {
        this.f1143a = bArr;
        int iM1208o = m1208o(56);
        this.f1144b = iM1208o;
        this.f1145c = m1208o(60);
        this.f1146d = m1208o(64);
        this.f1147e = m1208o(68);
        m1208o(72);
        this.f1148f = m1208o(76);
        this.f1149g = m1208o(88);
        this.f1150h = m1208o(92);
        this.f1151i = m1208o(96);
        this.f1152j = m1208o(100);
        this.f1153k = new int[Math.max(0, iM1208o)];
        this.f1154l = new String[Math.max(0, iM1208o)];
        for (int i = 0; i < this.f1144b; i++) {
            this.f1153k[i] = m1208o((i * 4) + this.f1145c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m1194a(C0566z9 c0566z9, int i) {
        return c0566z9.m1204k(c0566z9.m1208o((i * 8) + c0566z9.f1150h + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m1195b(C0566z9 c0566z9, int i) {
        int iM1199f = c0566z9.m1199f(i);
        if (iM1199f < 0) {
            return -1;
        }
        int iM1208o = c0566z9.m1208o((iM1199f * 12) + c0566z9.f1148f + 8);
        if (iM1208o == 0) {
            return 0;
        }
        return c0566z9.m1208o(iM1208o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m1196c(C0566z9 c0566z9, int i) {
        int iM1199f = c0566z9.m1199f(i);
        if (iM1199f < 0) {
            return "";
        }
        return c0566z9.m1205l(c0566z9.m1208o((iM1199f * 12) + c0566z9.f1148f + 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1197d(String str, int i) {
        int i2;
        byte[] bArr = this.f1143a;
        if (i <= 0 || (i2 = i + 16) > bArr.length) {
            i2 = -1;
        }
        if (i2 <= 0) {
            return false;
        }
        int iMin = Math.min(bArr.length, (m1208o(i + 12) * 2) + i2);
        while (i2 + 1 < iMin) {
            int i3 = bArr[i2] & 255;
            int iM1208o = (i3 != 26 || i2 + 4 > iMin) ? (i3 != 27 || i2 + 6 > iMin) ? -1 : m1208o(i2 + 2) : m1207n(i2 + 2);
            if (iM1208o >= 0 && str.equals(m1204k(iM1208o))) {
                return true;
            }
            i2 += 2;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1198e(int i, InterfaceC0027ba interfaceC0027ba) {
        int iM1208o;
        for (int i2 = 0; i2 < this.f1151i; i2++) {
            int i3 = (i2 * 32) + this.f1152j;
            if (m1208o(i3) == i && (iM1208o = m1208o(i3 + 24)) > 0) {
                m1200g(iM1208o, interfaceC0027ba);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1199f(int i) {
        if (i < 0 || i >= this.f1149g) {
            return -1;
        }
        return m1207n((i * 8) + this.f1150h + 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1200g(int i, InterfaceC0027ba interfaceC0027ba) {
        C0011aa c0011aa = new C0011aa();
        c0011aa.f43a = i;
        int iM1202i = m1202i(c0011aa);
        int iM1202i2 = m1202i(c0011aa);
        int iM1202i3 = m1202i(c0011aa);
        int iM1202i4 = m1202i(c0011aa);
        for (int i2 = 0; i2 < iM1202i + iM1202i2; i2++) {
            m1202i(c0011aa);
            m1202i(c0011aa);
        }
        m1201h(c0011aa, iM1202i3, interfaceC0027ba);
        m1201h(c0011aa, iM1202i4, interfaceC0027ba);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1201h(C0011aa c0011aa, int i, InterfaceC0027ba interfaceC0027ba) {
        int iM1202i = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM1202i += m1202i(c0011aa);
            m1202i(c0011aa);
            int iM1202i2 = m1202i(c0011aa);
            if (iM1202i >= 0 && iM1202i < this.f1149g) {
                interfaceC0027ba.mo74a(iM1202i, iM1202i2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m1202i(C0011aa c0011aa) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = c0011aa.f43a;
            byte[] bArr = this.f1143a;
            if (i3 >= bArr.length || i >= 35) {
                break;
            }
            c0011aa.f43a = i3 + 1;
            byte b = bArr[i3];
            i2 |= (b & 127) << i;
            if ((b & 128) == 0) {
                return i2;
            }
            i += 7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1203j(int i, C0358o4 c0358o4) {
        int iM1206m = m1206m("Lcom/tencent/mobileqq/mini/api/IMiniAppService;");
        int i2 = -1;
        if (iM1206m >= 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.f1149g) {
                    break;
                }
                int i4 = (i3 * 8) + this.f1150h;
                if (m1207n(i4) == iM1206m && "createMiniAppEntryManager".equals(m1204k(m1208o(i4 + 4)))) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        m1198e(i, new C0024b7(this, c0358o4, i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1204k(int i) {
        byte[] bArr;
        if (i < 0 || i >= this.f1144b) {
            return "";
        }
        String[] strArr = this.f1154l;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f1153k[i];
        int i3 = 0;
        while (true) {
            bArr = this.f1143a;
            if (i2 >= bArr.length || i3 >= 35) {
                break;
            }
            int i4 = i2 + 1;
            if ((bArr[i2] & 128) == 0) {
                i2 = i4;
                break;
            }
            i3 += 7;
            i2 = i4;
        }
        StringBuilder sb = new StringBuilder();
        while (i2 < bArr.length) {
            int i5 = i2 + 1;
            byte b = bArr[i2];
            int i6 = b & 255;
            if (i6 == 0) {
                break;
            }
            if ((b & 128) == 0) {
                sb.append((char) i6);
            } else if ((b & 224) != 192 || i5 >= bArr.length) {
                int i7 = i2 + 2;
                if (i7 < bArr.length) {
                    i2 += 3;
                    sb.append((char) (((bArr[i5] & 63) << 6) | ((b & 15) << 12) | (bArr[i7] & 63)));
                }
            } else {
                i2 += 2;
                sb.append((char) ((bArr[i5] & 63) | ((b & 31) << 6)));
            }
            i2 = i5;
        }
        String string = sb.toString();
        strArr[i] = string;
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m1205l(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f1155m;
        String str = (String) map.get(numValueOf);
        if (str != null) {
            return str;
        }
        if (i < 0 || i >= this.f1146d) {
            return "";
        }
        String strM1204k = m1204k(m1208o((i * 4) + this.f1147e));
        map.put(Integer.valueOf(i), strM1204k);
        return strM1204k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final int m1206m(String str) {
        for (int i = 0; i < this.f1146d; i++) {
            if (str.equals(m1205l(i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m1207n(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = i + 1;
        byte[] bArr = this.f1143a;
        if (i2 >= bArr.length) {
            return 0;
        }
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m1208o(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = i + 3;
        byte[] bArr = this.f1143a;
        if (i2 >= bArr.length) {
            return 0;
        }
        return ((bArr[i2] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }
}

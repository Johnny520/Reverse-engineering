package p314v7;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import java.util.Arrays;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p068eh.AbstractC0921a;
import p152k7.AbstractC2331a;
import p174m.C2571a;
import p222p.AbstractC3199a;
import p257r7.C3713c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4519y extends AbstractC4520z implements Comparable {

    /* JADX INFO: renamed from: o */
    public String f14893o;

    /* JADX INFO: renamed from: p */
    public int f14894p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C4519y(16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4519y(int i9) {
        super(i9);
        this.f14894p = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static char[] m8941U(byte b10, byte b11, char c10) {
        if ((b10 & 128) != 0) {
            return new char[]{(char) (((byte) (b11 & 31)) + c10), (char) (((byte) (((b11 & 224) >> 5) + ((b10 & 3) << 3))) + c10), (char) (((byte) ((b10 & JSONB.Constants.BC_STR_UTF16LE) >> 2)) + c10)};
        }
        return (b10 == 0 || b11 == 0) ? new char[2] : new char[]{(char) b10, (char) b11};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c9  */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m8942T() {
        String str;
        String str2;
        char[] cArr;
        char[] cArr2;
        char c10;
        C4502j c4502j;
        int i9;
        String str3;
        String string;
        int iHashCode = hashCode();
        if (this.f14893o == null || this.f14894p != iHashCode) {
            C2571a c2571a = new C2571a(22, false);
            C4485a0 c4485a0 = this.f14896n;
            if (AbstractC4520z.m8944R(c4485a0.mo5552r())) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                c2571a.f8339h = new StringBuilder();
                c2571a.m6029i(c4485a0.m8919T(0, 2), "mcc");
                c2571a.m6029i(c4485a0.m8919T(2, 2), "mnc");
                byte[] bArrM8918S = this.f14895m.f12083n < 16 ? new byte[2] : c4485a0.m8918S(4, 2);
                char[] cArrM8941U = m8941U(bArrM8918S[0], bArrM8918S[1], 'a');
                int i10 = 0;
                while (true) {
                    if (i10 >= cArrM8941U.length) {
                        str = null;
                        break;
                    }
                    if (cArrM8941U[i10] != 0) {
                        str = new String(cArrM8941U);
                        break;
                    }
                    i10++;
                }
                byte[] bArrM8918S2 = c4485a0.m8918S(6, 2);
                char[] cArrM8941U2 = m8941U(bArrM8918S2[0], bArrM8918S2[1], '0');
                int i11 = 0;
                while (true) {
                    if (i11 >= cArrM8941U2.length) {
                        str2 = null;
                        break;
                    }
                    if (cArrM8941U2[i11] != 0) {
                        str2 = new String(cArrM8941U2);
                        break;
                    }
                    i11++;
                }
                byte[] bArrM8918S3 = c4485a0.m8918S(32, 4);
                if (AbstractC4520z.m8944R(bArrM8918S3)) {
                    cArr = null;
                } else {
                    int length = bArrM8918S3.length;
                    cArr = new char[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        cArr[i12] = (char) (bArrM8918S3[i12] & 255);
                    }
                }
                char[] cArrM8945S = AbstractC4520z.m8945S(cArr);
                String str4 = cArrM8945S == null ? null : new String(cArrM8945S);
                String strM8943Q = str4 == null ? null : AbstractC4520z.m8943Q(3, str4);
                byte[] bArrM8918S4 = c4485a0.m8918S(36, 8);
                if (AbstractC4520z.m8944R(bArrM8918S4)) {
                    cArr2 = null;
                } else {
                    int length2 = bArrM8918S4.length;
                    cArr2 = new char[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        cArr2[i13] = (char) (bArrM8918S4[i13] & 255);
                    }
                }
                char[] cArrM8945S2 = AbstractC4520z.m8945S(cArr2);
                String str5 = cArrM8945S2 == null ? null : new String(cArrM8945S2);
                String upperCase = str5 == null ? null : AbstractC4520z.m8943Q(5, str5).toUpperCase();
                if (str != null || str2 != null) {
                    StringBuilder sb2 = (StringBuilder) c2571a.f8339h;
                    if (strM8943Q == null && upperCase == null && (str2 == null || str2.length() != 3)) {
                        c10 = '-';
                    } else {
                        sb2.append('-');
                        sb2.append('b');
                        c10 = '+';
                    }
                    if (str != null) {
                        sb2.append(c10);
                        sb2.append(str);
                    }
                    if (str2 != null) {
                        sb2.append(c10);
                        if (str2.length() == 2) {
                            sb2.append('r');
                        }
                        sb2.append(str2);
                    }
                    if (strM8943Q != null) {
                        sb2.append(c10);
                        sb2.append(strM8943Q);
                    }
                    if (upperCase != null) {
                        sb2.append(c10);
                        sb2.append(upperCase);
                    }
                }
                c2571a.m6028h((C4506l) AbstractC4504k.m8940a(C4506l.f14880i, 3, c4485a0.m8919T(15, 1)));
                c2571a.m6028h((C4512r) AbstractC4504k.m8940a(C4512r.f14886i, Opcodes.CHECKCAST, c4485a0.m8919T(24, 1)));
                c2571a.m6027g(c4485a0.m8919T(26, 2), "sw");
                c2571a.m6027g(c4485a0.m8919T(28, 2), "w");
                c2571a.m6027g(c4485a0.m8919T(30, 2), "h");
                c2571a.m6028h((C4515u) AbstractC4504k.m8940a(C4515u.f14889i, 15, c4485a0.m8919T(24, 1)));
                c2571a.m6028h((C4513s) AbstractC4504k.m8940a(C4513s.f14887i, 48, c4485a0.m8919T(24, 1)));
                c2571a.m6028h((C4514t) AbstractC4504k.m8940a(C4514t.f14888i, 3, c4485a0.m8919T(44, 1)));
                c2571a.m6028h((C4500i) AbstractC4504k.m8940a(C4500i.f14854i, 3, c4485a0.m8919T(45, 1)));
                c2571a.m6028h((C4498h) AbstractC4504k.m8940a(C4498h.f14851i, 12, c4485a0.m8919T(45, 1)));
                c2571a.m6028h((C4511q) AbstractC4504k.m8940a(C4511q.f14885i, 15, c4485a0.m8919T(8, 1)));
                c2571a.m6028h((C4518x) AbstractC4504k.m8940a(C4518x.f14892i, 15, c4485a0.m8919T(25, 1)));
                c2571a.m6028h((C4517w) AbstractC4504k.m8940a(C4517w.f14891i, 48, c4485a0.m8919T(25, 1)));
                int iM8919T = c4485a0.m8919T(10, 2);
                if (iM8919T == 0) {
                    c4502j = null;
                } else {
                    c4502j = (C4502j) AbstractC4504k.m8940a(C4502j.f14856i, Settings.DEFAULT_INITIAL_WINDOW_SIZE, iM8919T);
                    if (c4502j == null) {
                        int i14 = iM8919T & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        c4502j = new C4502j(AbstractC3199a.m6836i(i14, "dpi"), i14);
                    }
                }
                c2571a.m6028h(c4502j);
                c2571a.m6028h((C4516v) AbstractC4504k.m8940a(C4516v.f14890i, 15, c4485a0.m8919T(9, 1)));
                c2571a.m6028h((C4507m) AbstractC4504k.m8940a(C4507m.f14881i, 3, c4485a0.m8919T(14, 1)));
                c2571a.m6028h((C4509o) AbstractC4504k.m8940a(C4509o.f14883i, 15, c4485a0.m8919T(12, 1)));
                c2571a.m6028h((C4508n) AbstractC4504k.m8940a(C4508n.f14882i, 12, c4485a0.m8919T(14, 1)));
                c2571a.m6028h((C4510p) AbstractC4504k.m8940a(C4510p.f14884i, 15, c4485a0.m8919T(13, 1)));
                int iM8919T2 = c4485a0.m8919T(16, 2);
                int iM8919T3 = c4485a0.m8919T(18, 2);
                if (iM8919T2 != 0 || iM8919T3 != 0) {
                    StringBuilder sb3 = (StringBuilder) c2571a.f8339h;
                    sb3.append('-');
                    sb3.append(iM8919T2);
                    sb3.append('x');
                    sb3.append(iM8919T3);
                }
                c2571a.m6029i(c4485a0.m8919T(20, 2), "v");
                byte[] bArrM8918S5 = c4485a0.m8918S(48, r4.f12083n - 52);
                if (bArrM8918S5 == null) {
                    bArrM8918S5 = null;
                    i9 = 0;
                    if (AbstractC4520z.m8944R(bArrM8918S5)) {
                        str3 = null;
                    } else {
                        int length3 = bArrM8918S5.length < 8 ? bArrM8918S5.length : 8;
                        String strM10750m = null;
                        while (i9 < length3) {
                            strM10750m = AbstractC5999a.m10750m(2, strM10750m, ((long) bArrM8918S5[i9]) & 255);
                            i9++;
                        }
                        str3 = strM10750m;
                    }
                    if (str3 != null) {
                        StringBuilder sb4 = (StringBuilder) c2571a.f8339h;
                        sb4.append('-');
                        sb4.append("unknown_bytes");
                        sb4.append(str3);
                    }
                    string = ((StringBuilder) c2571a.f8339h).toString();
                } else {
                    int i15 = -1;
                    for (int i16 = 0; i16 < bArrM8918S5.length; i16++) {
                        if (bArrM8918S5[i16] != 0) {
                            i15 = i16;
                        }
                    }
                    if (i15 != -1) {
                        int i17 = i15 + 1;
                        if (i17 != bArrM8918S5.length) {
                            byte[] bArr = new byte[i17];
                            i9 = 0;
                            System.arraycopy(bArrM8918S5, 0, bArr, 0, i17);
                            bArrM8918S5 = bArr;
                        }
                        if (AbstractC4520z.m8944R(bArrM8918S5)) {
                        }
                        if (str3 != null) {
                        }
                        string = ((StringBuilder) c2571a.f8339h).toString();
                    }
                    i9 = 0;
                    if (AbstractC4520z.m8944R(bArrM8918S5)) {
                    }
                    if (str3 != null) {
                    }
                    string = ((StringBuilder) c2571a.f8339h).toString();
                }
            }
            this.f14893o = string;
            this.f14894p = iHashCode;
        }
        return this.f14893o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C4519y c4519y = (C4519y) obj;
        C4485a0 c4485a0 = this.f14896n;
        int iM8919T = c4485a0.m8919T(2, 2);
        C4485a0 c4485a02 = c4519y.f14896n;
        C4485a0 c4485a03 = c4519y.f14896n;
        int iM10739b = AbstractC5999a.m10739b(iM8919T, c4485a02.m8919T(2, 2));
        if (iM10739b != 0) {
            return iM10739b;
        }
        int iM10739b2 = AbstractC5999a.m10739b(c4485a0.m8919T(0, 2), c4485a03.m8919T(0, 2));
        if (iM10739b2 != 0) {
            return iM10739b2;
        }
        int iM10739b3 = AbstractC5999a.m10739b(c4485a0.m8919T(6, 2), c4485a03.m8919T(6, 2));
        if (iM10739b3 == 0) {
            iM10739b3 = AbstractC5999a.m10739b(c4485a0.m8919T(4, 2), c4485a03.m8919T(4, 2));
        }
        if (iM10739b3 == 0) {
            iM10739b3 = AbstractC5999a.m10739b(c4485a0.m8919T(32, 4), c4485a03.m8919T(32, 4));
        }
        if (iM10739b3 == 0) {
            iM10739b3 = AbstractC5999a.m10740c(Long.valueOf(AbstractC2331a.m5540t(c4485a0.f12076k, 36)), Long.valueOf(AbstractC2331a.m5540t(c4485a03.f12076k, 36)));
        }
        if (iM10739b3 != 0) {
            return iM10739b3;
        }
        int iM10739b4 = AbstractC5999a.m10739b(c4485a0.m8919T(15, 1), c4485a03.m8919T(15, 1));
        if (iM10739b4 != 0) {
            return iM10739b4;
        }
        int iM10739b5 = AbstractC5999a.m10739b(c4485a0.m8919T(10, 2), c4485a03.m8919T(10, 2));
        if (iM10739b5 != 0) {
            return iM10739b5;
        }
        int iM10739b6 = AbstractC5999a.m10739b(c4485a0.m8919T(9, 1), c4485a03.m8919T(9, 1));
        if (iM10739b6 != 0) {
            return iM10739b6;
        }
        int iM10739b7 = AbstractC5999a.m10739b(c4485a0.m8919T(8, 1), c4485a03.m8919T(8, 1));
        if (iM10739b7 != 0) {
            return iM10739b7;
        }
        int iM10739b8 = AbstractC5999a.m10739b(c4485a0.m8919T(13, 1), c4485a03.m8919T(13, 1));
        if (iM10739b8 != 0) {
            return iM10739b8;
        }
        int iM10739b9 = AbstractC5999a.m10739b(c4485a0.m8919T(12, 1), c4485a03.m8919T(12, 1));
        if (iM10739b9 != 0) {
            return iM10739b9;
        }
        int iM10739b10 = AbstractC5999a.m10739b(c4485a0.m8919T(14, 1), c4485a03.m8919T(14, 1));
        if (iM10739b10 != 0) {
            return iM10739b10;
        }
        int iM10739b11 = AbstractC5999a.m10739b(c4485a0.m8919T(16, 2), c4485a03.m8919T(16, 2));
        if (iM10739b11 != 0) {
            return iM10739b11;
        }
        int iM10739b12 = AbstractC5999a.m10739b(c4485a0.m8919T(18, 2), c4485a03.m8919T(18, 2));
        if (iM10739b12 != 0) {
            return iM10739b12;
        }
        int iM10739b13 = AbstractC5999a.m10739b(c4485a0.m8919T(20, 2), c4485a03.m8919T(20, 2));
        if (iM10739b13 != 0) {
            return iM10739b13;
        }
        int iM10739b14 = AbstractC5999a.m10739b(c4485a0.m8919T(24, 1), c4485a03.m8919T(24, 1));
        if (iM10739b14 != 0) {
            return iM10739b14;
        }
        int iM10739b15 = AbstractC5999a.m10739b(c4485a0.m8919T(44, 1), c4485a03.m8919T(44, 1));
        if (iM10739b15 != 0) {
            return iM10739b15;
        }
        int iM10739b16 = AbstractC5999a.m10739b(c4485a0.m8919T(45, 1), c4485a03.m8919T(45, 1));
        if (iM10739b16 != 0) {
            return iM10739b16;
        }
        int iM10739b17 = AbstractC5999a.m10739b(c4485a0.m8919T(25, 1), c4485a03.m8919T(25, 1));
        if (iM10739b17 != 0) {
            return iM10739b17;
        }
        int iM10739b18 = AbstractC5999a.m10739b(c4485a0.m8919T(26, 2), c4485a03.m8919T(26, 2));
        if (iM10739b18 != 0) {
            return iM10739b18;
        }
        int iM10739b19 = AbstractC5999a.m10739b(c4485a0.m8919T(30, 2), c4485a03.m8919T(30, 2));
        if (iM10739b19 != 0) {
            return iM10739b19;
        }
        int iM10739b20 = AbstractC5999a.m10739b(c4485a0.m8919T(28, 2), c4485a03.m8919T(28, 2));
        if (iM10739b20 != 0) {
            return iM10739b20;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C4519y)) {
            return false;
        }
        byte[] bArrMo5552r = this.f14896n.mo5552r();
        byte[] bArrMo5552r2 = ((C4519y) obj).f14896n.mo5552r();
        if (bArrMo5552r == bArrMo5552r2) {
            return true;
        }
        return C3713c.m7716N(C3713c.m7717R(bArrMo5552r), C3713c.m7717R(bArrMo5552r2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(C3713c.m7717R(this.f14896n.mo5552r()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strM8942T = m8942T();
        return strM8942T.length() == 0 ? "[DEFAULT]" : AbstractC0921a.m2251n("[", strM8942T, "]");
    }
}

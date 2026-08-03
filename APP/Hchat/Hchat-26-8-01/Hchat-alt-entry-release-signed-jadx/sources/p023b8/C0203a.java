package p023b8;

import af.C0082e;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import p035c8.AbstractC0413b;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0203a extends AbstractC0413b {

    /* JADX INFO: renamed from: e0 */
    public StringReader f504e0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        StringReader stringReader = this.f504e0;
        if (stringReader != null) {
            stringReader.close();
            this.f504e0 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c3, code lost:
    
        throw new af.C0082e("Unexpected token", r19);
     */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m867z() throws C0082e, IOException {
        byte b10;
        int i9;
        char c10;
        Object obj;
        int iM1391l;
        String str;
        byte b11;
        int i10;
        int i11;
        if (this.f504e0 == null) {
            return 1;
        }
        if (this.f1166n == null) {
            throw new C0082e("setInput() must be called first.", this);
        }
        int i12 = 3;
        if (this.f1173u == 3) {
            this.f1162j--;
        }
        boolean z9 = false;
        if (!this.f1153A) {
            if (this.f1157E != null) {
                this.f1157E = null;
            }
            int iM1391l2 = m1391l(false);
            this.f1173u = iM1391l2;
            char[] cArr = AbstractC0413b.f1135M;
            int i13 = 2;
            if (iM1391l2 == 998) {
                if (this.f1171s != 0 || this.f1172t != 0 || this.f1169q != 0) {
                    m1384a("processing instructions must not start with xml");
                }
                m1393o(cArr);
                m1389i(true, true);
                if (this.f1154B < 1 || !"version".equals(this.f1156D[2])) {
                    m1384a("version expected");
                }
                String[] strArr = this.f1156D;
                String str2 = strArr[3];
                if (1 >= this.f1154B || !"encoding".equals(strArr[6])) {
                    i11 = 1;
                } else {
                    String str3 = this.f1156D[7];
                    i11 = 2;
                }
                if (i11 < this.f1154B) {
                    int i14 = i11 * 4;
                    if ("standalone".equals(this.f1156D[i14 + 2])) {
                        String str4 = this.f1156D[i14 + 3];
                        if (!"yes".equals(str4) && !"no".equals(str4)) {
                            m1384a("illegal standalone value: " + str4);
                        }
                        i11++;
                    }
                }
                if (i11 != this.f1154B) {
                    m1384a("unexpected attributes in XML declaration");
                }
                this.f1174v = true;
                this.f1178z = null;
                this.f1173u = m1391l(false);
            }
            this.f1178z = null;
            this.f1174v = true;
            this.f1176x = null;
            this.f1177y = null;
            this.f1175w = null;
            byte b12 = -1;
            this.f1154B = -1;
            while (true) {
                int i15 = this.f1173u;
                char[] cArr2 = AbstractC0413b.f1136N;
                char c11 = '>';
                switch (i15) {
                    case 1:
                        i12 = i15;
                        break;
                    case 2:
                        m1389i(z9 ? 1 : 0, true);
                        i12 = this.f1173u;
                        break;
                    case 3:
                        m1392m('<');
                        m1392m('/');
                        this.f1177y = m1396t();
                        m1400y();
                        m1392m('>');
                        int i16 = this.f1162j;
                        int i17 = (i16 - 1) * 4;
                        String str5 = this.f1177y;
                        if (i16 == 0) {
                            m1384a("read end tag " + str5 + " with no tags open");
                            this.f1173u = 9;
                        } else {
                            int i18 = i17 + 3;
                            if (!str5.equals(this.f1163k[i18])) {
                                throw new C0082e("expected: /" + this.f1163k[i18] + " read: " + this.f1177y, this);
                            }
                            String[] strArr2 = this.f1163k;
                            this.f1175w = strArr2[i17];
                            this.f1176x = strArr2[i17 + 1];
                            this.f1177y = strArr2[i17 + 2];
                        }
                        i12 = this.f1173u;
                        break;
                    case 4:
                    case 6:
                        b10 = b12;
                        i9 = i12;
                        this.f1178z = m1399x('<', true, true, i13);
                        if (this.f1162j == 0 && this.f1174v) {
                            this.f1173u = 7;
                        }
                        if (this.f1162j == 0) {
                            int i19 = this.f1173u;
                            c10 = 6;
                            if (i19 == 6 || i19 == 4 || i19 == 5) {
                            }
                        } else {
                            c10 = 6;
                        }
                        if (this.f1173u == 7) {
                            obj = null;
                            this.f1178z = null;
                        } else {
                            obj = null;
                        }
                        iM1391l = m1391l(false);
                        str = this.f1178z;
                        if (str == null || str.isEmpty() || iM1391l >= 4) {
                            this.f1173u = iM1391l;
                            b12 = b10;
                            i12 = i9;
                            z9 = false;
                            i13 = 2;
                        } else {
                            this.f1173u = 4;
                            i12 = 4;
                        }
                        break;
                    case 5:
                        b10 = b12;
                        i9 = i12;
                        m1393o(AbstractC0413b.f1133K);
                        this.f1178z = m1398w(AbstractC0413b.f1134L, true);
                        if (this.f1162j == 0) {
                        }
                        if (this.f1173u == 7) {
                        }
                        iM1391l = m1391l(false);
                        str = this.f1178z;
                        if (str == null) {
                        }
                        this.f1173u = iM1391l;
                        b12 = b10;
                        i12 = i9;
                        z9 = false;
                        i13 = 2;
                        break;
                    case 7:
                    default:
                        throw new C0082e("Unexpected token", this);
                    case 8:
                        b10 = b12;
                        i9 = i12;
                        m1393o(cArr);
                        m1398w(cArr2, false);
                        if (this.f1162j == 0) {
                        }
                        if (this.f1173u == 7) {
                        }
                        iM1391l = m1391l(false);
                        str = this.f1178z;
                        if (str == null) {
                        }
                        this.f1173u = iM1391l;
                        b12 = b10;
                        i12 = i9;
                        z9 = false;
                        i13 = 2;
                        break;
                    case 9:
                        b10 = b12;
                        i9 = i12;
                        m1394q();
                        if (this.f1162j == 0) {
                        }
                        if (this.f1173u == 7) {
                        }
                        iM1391l = m1391l(false);
                        str = this.f1178z;
                        if (str == null) {
                        }
                        this.f1173u = iM1391l;
                        b12 = b10;
                        i12 = i9;
                        z9 = false;
                        i13 = 2;
                        break;
                    case 10:
                        m1393o(AbstractC0413b.f1137O);
                        m1400y();
                        m1396t();
                        m1395s(true, true);
                        m1400y();
                        if (m1390k() == 91) {
                            m1392m('[');
                            while (true) {
                                m1400y();
                                if (m1390k() == 93) {
                                    this.f1169q++;
                                } else {
                                    switch (m1391l(true)) {
                                        case 8:
                                            b11 = b12;
                                            i10 = i12;
                                            m1393o(cArr);
                                            m1398w(cArr2, false);
                                            i12 = i10;
                                            b12 = b11;
                                            z9 = false;
                                            i13 = 2;
                                            c11 = '>';
                                            break;
                                        case 9:
                                            b11 = b12;
                                            i10 = i12;
                                            m1394q();
                                            i12 = i10;
                                            b12 = b11;
                                            z9 = false;
                                            i13 = 2;
                                            c11 = '>';
                                            break;
                                        case 10:
                                        default:
                                            throw new C0082e("Unexpected token", this);
                                        case 11:
                                            i10 = i12;
                                            m1393o(AbstractC0413b.f1140R);
                                            m1400y();
                                            m1396t();
                                            m1400y();
                                            int iM1390k = m1390k();
                                            if (iM1390k == 40) {
                                                int i20 = 0;
                                                do {
                                                    if (iM1390k == 40) {
                                                        i20++;
                                                    } else if (iM1390k == 41) {
                                                        i20--;
                                                    } else {
                                                        b11 = -1;
                                                        if (iM1390k == -1) {
                                                            throw new C0082e("Unterminated element content spec", this);
                                                        }
                                                        this.f1169q++;
                                                        iM1390k = m1390k();
                                                    }
                                                    b11 = -1;
                                                    this.f1169q++;
                                                    iM1390k = m1390k();
                                                } while (i20 > 0);
                                                if (iM1390k == 42 || iM1390k == 63 || iM1390k == 43) {
                                                    this.f1169q++;
                                                }
                                            } else {
                                                b11 = -1;
                                                char[] cArr3 = AbstractC0413b.f1144V;
                                                if (iM1390k == cArr3[0]) {
                                                    m1393o(cArr3);
                                                } else {
                                                    char[] cArr4 = AbstractC0413b.f1145W;
                                                    if (iM1390k != cArr4[0]) {
                                                        throw new C0082e("Expected element content spec", this);
                                                    }
                                                    m1393o(cArr4);
                                                }
                                            }
                                            m1400y();
                                            m1392m('>');
                                            i12 = i10;
                                            b12 = b11;
                                            z9 = false;
                                            i13 = 2;
                                            c11 = '>';
                                            break;
                                        case 12:
                                            boolean z10 = z9 ? 1 : 0;
                                            m1393o(AbstractC0413b.f1142T);
                                            m1400y();
                                            if (m1390k() == 37) {
                                                this.f1169q++;
                                                m1400y();
                                            }
                                            m1396t();
                                            m1400y();
                                            int iM1390k2 = m1390k();
                                            if (iM1390k2 == 34 || iM1390k2 == 39) {
                                                this.f1169q++;
                                                i10 = 3;
                                                m1399x((char) iM1390k2, true, false, 3);
                                                if (m1390k() == iM1390k2) {
                                                    this.f1169q++;
                                                }
                                            } else {
                                                if (!m1395s(true, z10)) {
                                                    throw new C0082e("Expected entity value or external ID", this);
                                                }
                                                m1400y();
                                                int iM1390k3 = m1390k();
                                                char[] cArr5 = AbstractC0413b.f1146X;
                                                if (iM1390k3 == cArr5[z10 ? 1 : 0]) {
                                                    m1393o(cArr5);
                                                    m1400y();
                                                    m1396t();
                                                }
                                                i10 = 3;
                                            }
                                            m1400y();
                                            m1392m('>');
                                            b11 = -1;
                                            i12 = i10;
                                            b12 = b11;
                                            z9 = false;
                                            i13 = 2;
                                            c11 = '>';
                                            break;
                                        case 13:
                                            m1393o(AbstractC0413b.f1141S);
                                            m1400y();
                                            String strM1396t = m1396t();
                                            while (true) {
                                                m1400y();
                                                if (m1390k() == c11) {
                                                    this.f1169q++;
                                                } else {
                                                    String strM1396t2 = m1396t();
                                                    m1400y();
                                                    if (this.f1169q + 1 >= this.f1170r && !m1385c(i13)) {
                                                        throw new C0082e("Malformed attribute list", this);
                                                    }
                                                    char[] cArr6 = this.f1168p;
                                                    int i21 = this.f1169q;
                                                    char c12 = cArr6[i21];
                                                    char[] cArr7 = AbstractC0413b.f1147Y;
                                                    boolean z11 = z9;
                                                    if (c12 == cArr7[z11 ? 1 : 0] && cArr6[i21 + 1] == cArr7[1]) {
                                                        m1393o(cArr7);
                                                        m1400y();
                                                    }
                                                    if (m1390k() == 40) {
                                                        this.f1169q++;
                                                        while (true) {
                                                            m1400y();
                                                            m1396t();
                                                            m1400y();
                                                            int iM1390k4 = m1390k();
                                                            if (iM1390k4 == 41) {
                                                                this.f1169q++;
                                                            } else {
                                                                if (iM1390k4 != 124) {
                                                                    throw new C0082e("Malformed attribute type", this);
                                                                }
                                                                this.f1169q++;
                                                            }
                                                        }
                                                    } else {
                                                        m1396t();
                                                    }
                                                    m1400y();
                                                    int iM1390k5 = m1390k();
                                                    if (iM1390k5 == 35) {
                                                        this.f1169q++;
                                                        int iM1390k6 = m1390k();
                                                        if (iM1390k6 == 82) {
                                                            m1393o(AbstractC0413b.f1148Z);
                                                        } else if (iM1390k6 == 73) {
                                                            m1393o(AbstractC0413b.f1149a0);
                                                        } else {
                                                            if (iM1390k6 != 70) {
                                                                throw new C0082e("Malformed attribute type", this);
                                                            }
                                                            m1393o(AbstractC0413b.f1150b0);
                                                        }
                                                        m1400y();
                                                        iM1390k5 = m1390k();
                                                    }
                                                    if (iM1390k5 == 34 || iM1390k5 == 39) {
                                                        this.f1169q++;
                                                        String strM1399x = m1399x((char) iM1390k5, true, true, 1);
                                                        if (m1390k() == iM1390k5) {
                                                            this.f1169q++;
                                                        }
                                                        if (this.f1161i == null) {
                                                            this.f1161i = new HashMap();
                                                        }
                                                        Map map = (Map) this.f1161i.get(strM1396t);
                                                        if (map == null) {
                                                            map = new HashMap();
                                                            this.f1161i.put(strM1396t, map);
                                                        }
                                                        map.put(strM1396t2, strM1399x);
                                                    }
                                                    z9 = z11 ? 1 : 0;
                                                    b12 = -1;
                                                    i12 = 3;
                                                    i13 = 2;
                                                    c11 = '>';
                                                }
                                                break;
                                            }
                                            break;
                                        case 14:
                                            m1393o(AbstractC0413b.f1143U);
                                            m1400y();
                                            m1396t();
                                            if (!m1395s(z9, z9)) {
                                                throw new C0082e("Expected external ID or public ID for notation", this);
                                            }
                                            m1400y();
                                            m1392m(c11);
                                            b11 = b12;
                                            i10 = i12;
                                            i12 = i10;
                                            b12 = b11;
                                            z9 = false;
                                            i13 = 2;
                                            c11 = '>';
                                            break;
                                            break;
                                        case 15:
                                            throw new C0082e("Parameter entity references are not supported", this);
                                    }
                                }
                            }
                        }
                        b10 = b12;
                        i9 = i12;
                        m1400y();
                        m1392m('>');
                        if (this.f1155C) {
                            throw new C0082e("Unexpected token", this);
                        }
                        if (this.f1162j == 0) {
                        }
                        if (this.f1173u == 7) {
                        }
                        iM1391l = m1391l(false);
                        str = this.f1178z;
                        if (str == null) {
                        }
                        this.f1173u = iM1391l;
                        b12 = b10;
                        i12 = i9;
                        z9 = false;
                        i13 = 2;
                        break;
                }
            }
        } else {
            this.f1153A = false;
            this.f1173u = 3;
        }
        if (i12 == 1) {
            close();
        }
        return i12;
    }
}

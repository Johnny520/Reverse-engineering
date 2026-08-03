package p045d5;

import ac.C0058k;
import androidx.lifecycle.C0119x;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import p005a5.C0016a;
import p020b5.AbstractC0191j;
import p020b5.C0184c;
import p020b5.C0188g;
import p020b5.C0190i;
import p020b5.C0192k;
import p046d6.AbstractC0711h;
import p046d6.C0709f;
import p061e5.C0826a;
import p074f5.AbstractC1073i;
import p074f5.EnumC1070f;
import p150k5.C2270u;
import p164l5.C2489f0;
import p164l5.C2491h;
import p164l5.C2497n;
import p164l5.C2499p;
import p281t3.AbstractC4106c;
import p283t5.InterfaceC4118a;
import p283t5.InterfaceC4119b;
import p283t5.InterfaceC4120c;
import p283t5.InterfaceC4121d;
import p283t5.InterfaceC4122e;
import p283t5.InterfaceC4124g;
import p283t5.InterfaceC4125h;
import p283t5.InterfaceC4126i;
import p283t5.InterfaceC4128k;
import p283t5.InterfaceC4130m;
import p283t5.InterfaceC4131n;
import p296u5.InterfaceC4273a;
import p312v5.C4478a;
import p312v5.InterfaceC4479b;

/* JADX INFO: renamed from: d5.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0694e extends AbstractC0191j {

    /* JADX INFO: renamed from: h */
    public final C0190i f2109h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC4121d f2110i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0694e(C0190i c0190i, int i9, InterfaceC4121d interfaceC4121d) {
        super(i9);
        this.f2109h = c0190i;
        this.f2110i = interfaceC4121d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1862d(C0826a c0826a, long j3) throws IOException {
        if (j3 != AbstractC0711h.f2137e && j3 != AbstractC0711h.f2138f && j3 != AbstractC0711h.f2139g && j3 != AbstractC0711h.f2140h) {
            if (j3 == Long.MAX_VALUE || j3 == Long.MIN_VALUE) {
                return;
            }
            double dLongBitsToDouble = Double.longBitsToDouble(j3);
            if (Double.isNaN(dLongBitsToDouble)) {
                return;
            }
            DecimalFormat decimalFormat = AbstractC0711h.f2141i;
            String str = decimalFormat.format(j3);
            String strConcat = decimalFormat.format(dLongBitsToDouble);
            int iIndexOf = strConcat.indexOf(46);
            int iIndexOf2 = strConcat.indexOf("E");
            int iIndexOf3 = strConcat.indexOf("000");
            if (iIndexOf3 <= iIndexOf || iIndexOf3 >= iIndexOf2) {
                int iIndexOf4 = strConcat.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    strConcat = strConcat.substring(0, iIndexOf4).concat(strConcat.substring(iIndexOf2));
                }
            } else {
                strConcat = strConcat.substring(0, iIndexOf3).concat(strConcat.substring(iIndexOf2));
            }
            if (strConcat.length() >= str.length()) {
                return;
            }
        }
        c0826a.write("    # ");
        double dLongBitsToDouble2 = Double.longBitsToDouble(j3);
        if (dLongBitsToDouble2 == Double.POSITIVE_INFINITY) {
            c0826a.write("Double.POSITIVE_INFINITY");
            return;
        }
        if (dLongBitsToDouble2 == Double.NEGATIVE_INFINITY) {
            c0826a.write("Double.NEGATIVE_INFINITY");
            return;
        }
        if (Double.isNaN(dLongBitsToDouble2)) {
            c0826a.write("Double.NaN");
            return;
        }
        if (dLongBitsToDouble2 == Double.MAX_VALUE) {
            c0826a.write("Double.MAX_VALUE");
            return;
        }
        if (dLongBitsToDouble2 == 3.141592653589793d) {
            c0826a.write("Math.PI");
        } else if (dLongBitsToDouble2 == 2.718281828459045d) {
            c0826a.write("Math.E");
        } else {
            c0826a.write(Double.toString(dLongBitsToDouble2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1863e(C0826a c0826a, int i9) throws IOException {
        if (i9 != AbstractC0711h.f2133a && i9 != AbstractC0711h.f2134b && i9 != AbstractC0711h.f2135c && i9 != AbstractC0711h.f2136d) {
            if (i9 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE) {
                return;
            }
            int i10 = i9 >> 24;
            int i11 = (i9 >> 16) & 255;
            int i12 = 65535 & i9;
            if ((i10 == 127 || i10 == 1) && i11 < 31 && i12 < 4095) {
                return;
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i9);
            if (Float.isNaN(fIntBitsToFloat)) {
                return;
            }
            DecimalFormat decimalFormat = AbstractC0711h.f2141i;
            String str = decimalFormat.format(i9);
            String strConcat = decimalFormat.format(fIntBitsToFloat);
            int iIndexOf = strConcat.indexOf(46);
            int iIndexOf2 = strConcat.indexOf("E");
            int iIndexOf3 = strConcat.indexOf("000");
            if (iIndexOf3 <= iIndexOf || iIndexOf3 >= iIndexOf2) {
                int iIndexOf4 = strConcat.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    strConcat = strConcat.substring(0, iIndexOf4).concat(strConcat.substring(iIndexOf2));
                }
            } else {
                strConcat = strConcat.substring(0, iIndexOf3).concat(strConcat.substring(iIndexOf2));
            }
            if (strConcat.length() >= str.length()) {
                return;
            }
        }
        c0826a.write("    # ");
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9);
        if (fIntBitsToFloat2 == Float.POSITIVE_INFINITY) {
            c0826a.write("Float.POSITIVE_INFINITY");
            return;
        }
        if (fIntBitsToFloat2 == Float.NEGATIVE_INFINITY) {
            c0826a.write("Float.NEGATIVE_INFINITY");
            return;
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            c0826a.write("Float.NaN");
            return;
        }
        if (fIntBitsToFloat2 == Float.MAX_VALUE) {
            c0826a.write("Float.MAX_VALUE");
            return;
        }
        if (fIntBitsToFloat2 == 3.1415927f) {
            c0826a.write("(float)Math.PI");
        } else if (fIntBitsToFloat2 == 2.7182817f) {
            c0826a.write("(float)Math.E");
        } else {
            c0826a.write(Float.toString(fIntBitsToFloat2));
            c0826a.write(102);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: b */
    public final double mo775b() {
        return 100.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[PHI: r16
  0x0113: PHI (r16v3 boolean) = (r16v2 boolean), (r16v4 boolean), (r16v4 boolean) binds: [B:111:0x0113, B:50:0x0100, B:45:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo776c(final C0826a c0826a) throws IOException {
        String str;
        InterfaceC0693d interfaceC0693d;
        InterfaceC0693d interfaceC0693d2;
        boolean z9;
        boolean z10;
        String str2;
        InterfaceC4121d interfaceC4121d = this.f2110i;
        EnumC1070f enumC1070fMo5878i = interfaceC4121d.mo5878i();
        final int i9 = 1;
        if (interfaceC4121d instanceof C2491h) {
            C2491h c2491h = (C2491h) interfaceC4121d;
            int iM584O = c2491h.f8116a.f7532b.m584O(c2491h.f8118c + 1) & 63;
            int i10 = AbstractC1073i.f3456a;
            str = "generic-error";
            switch (iM584O) {
                case 1:
                    str2 = "generic-error";
                    break;
                case 2:
                    str2 = "no-such-class";
                    break;
                case 3:
                    str2 = "no-such-field";
                    break;
                case 4:
                    str2 = "no-such-method";
                    break;
                case 5:
                    str2 = "illegal-class-access";
                    break;
                case 6:
                    str2 = "illegal-field-access";
                    break;
                case 7:
                    str2 = "illegal-method-access";
                    break;
                case 8:
                    str2 = "class-change-error";
                    break;
                case 9:
                    str2 = "instantiation-error";
                    break;
                default:
                    str2 = null;
                    break;
            }
            if (str2 == null) {
                c0826a.write("#was invalid verification error type: ");
                c0826a.m2084z(iM584O);
                c0826a.write("\n");
            } else {
                str = str2;
            }
        } else {
            str = null;
        }
        final int i11 = 0;
        if (interfaceC4121d instanceof InterfaceC4125h) {
            final InterfaceC4479b interfaceC4479bMo5888a = ((InterfaceC4125h) interfaceC4121d).mo5888a();
            try {
                interfaceC4479bMo5888a.mo105a();
                interfaceC0693d = new InterfaceC0693d() { // from class: d5.b
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p045d5.InterfaceC0693d
                    /* JADX INFO: renamed from: a */
                    public final void mo1861a() {
                        switch (i11) {
                            case 0:
                                c0826a.m7219o(interfaceC4479bMo5888a);
                                break;
                            default:
                                c0826a.m7219o(interfaceC4479bMo5888a);
                                break;
                        }
                    }
                };
                z9 = false;
            } catch (C4478a e6) {
                c0826a.write("#");
                c0826a.write(e6.getMessage());
                c0826a.write("\n");
                interfaceC0693d = new InterfaceC0693d() { // from class: d5.c
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p045d5.InterfaceC0693d
                    /* JADX INFO: renamed from: a */
                    public final void mo1861a() throws IOException {
                        switch (i11) {
                            case 0:
                                c0826a.write(e6.f14829g);
                                break;
                            default:
                                c0826a.write(e6.f14829g);
                                break;
                        }
                    }
                };
                z9 = true;
            }
            if (interfaceC4121d instanceof InterfaceC4118a) {
                try {
                    final InterfaceC4479b interfaceC4479bMo5898f = ((InterfaceC4118a) interfaceC4121d).mo5898f();
                    interfaceC4479bMo5898f.mo105a();
                    interfaceC0693d2 = new InterfaceC0693d() { // from class: d5.b
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p045d5.InterfaceC0693d
                        /* JADX INFO: renamed from: a */
                        public final void mo1861a() {
                            switch (i9) {
                                case 0:
                                    c0826a.m7219o(interfaceC4479bMo5898f);
                                    break;
                                default:
                                    c0826a.m7219o(interfaceC4479bMo5898f);
                                    break;
                            }
                        }
                    };
                } catch (C4478a e7) {
                    c0826a.write("#");
                    c0826a.write(e7.getMessage());
                    c0826a.write("\n");
                    interfaceC0693d = new InterfaceC0693d() { // from class: d5.c
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p045d5.InterfaceC0693d
                        /* JADX INFO: renamed from: a */
                        public final void mo1861a() throws IOException {
                            switch (i9) {
                                case 0:
                                    c0826a.write(e7.f14829g);
                                    break;
                                default:
                                    c0826a.write(e7.f14829g);
                                    break;
                            }
                        }
                    };
                    z9 = true;
                    interfaceC0693d2 = null;
                }
            } else {
                interfaceC0693d2 = null;
            }
        } else {
            interfaceC0693d = null;
            interfaceC0693d2 = null;
            z9 = false;
        }
        boolean z11 = interfaceC4121d instanceof InterfaceC4273a;
        C0190i c0190i = this.f2109h;
        if (z11) {
            int iOrdinal = interfaceC4121d.mo5878i().ordinal();
            int i12 = this.f486g;
            if (iOrdinal != 38) {
                z10 = true;
                if (iOrdinal == 43) {
                    if (((C0058k) c0190i.f483i).m360k(((InterfaceC4273a) interfaceC4121d).mo5882l() + i12) == -1) {
                    }
                } else {
                    if (iOrdinal != 44) {
                        throw new C0709f(null, "Invalid 31t opcode: %s", interfaceC4121d.mo5878i());
                    }
                    if (((C0058k) c0190i.f484j).m360k(((InterfaceC4273a) interfaceC4121d).mo5882l() + i12) == -1) {
                        c0826a.write("#invalid payload reference\n");
                        z9 = z10;
                    }
                }
            } else {
                z10 = true;
                try {
                    c0190i.m843e(i12 + ((InterfaceC4273a) interfaceC4121d).mo5882l(), EnumC1070f.ARRAY_PAYLOAD);
                } catch (C0188g unused) {
                    c0826a.write("#invalid payload reference\n");
                    z9 = z10;
                }
            }
        } else {
            z10 = true;
        }
        int i13 = enumC1070fMo5878i.f3446k;
        if ((i13 & 2) != 0 && (((C0016a) ((C0184c) c0190i.f476b).f469a).f55h >= 14 || ((i13 & 128) == 0 && enumC1070fMo5878i != EnumC1070f.THROW_VERIFICATION_ERROR))) {
            c0826a.write("#disallowed odex opcode\n");
            z9 = z10;
        }
        if (z9) {
            c0826a.write("#");
        }
        switch (AbstractC4106c.m8279b(interfaceC4121d.mo5878i().f3448m)) {
            case 0:
            case 6:
            case 19:
                m1868k(c0826a);
                c0826a.write(32);
                mo1871n(c0826a);
                break;
            case 1:
                if (interfaceC4121d instanceof C2489f0) {
                    c0826a.write("#unknown opcode: 0x");
                    C2489f0 c2489f0 = (C2489f0) interfaceC4121d;
                    C2270u c2270u = c2489f0.f8116a;
                    C0119x c0119x = c2270u.f7532b;
                    int i14 = c2489f0.f8118c;
                    int iM584O2 = c0119x.m584O(i14);
                    if (iM584O2 == 0) {
                        iM584O2 = c2270u.f7532b.m585P(i14);
                    }
                    c0826a.m2071C(iM584O2);
                    c0826a.write(10);
                }
                m1868k(c0826a);
                break;
            case 2:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                c0826a.m2069A(((InterfaceC4131n) interfaceC4121d).mo5884g());
                break;
            case 3:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                break;
            case 4:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                break;
            case 5:
                m1868k(c0826a);
                c0826a.write(32);
                c0826a.write(str);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                break;
            case 7:
            case 20:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                break;
            case 8:
            case 9:
            case 10:
            case 21:
            case 32:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                c0826a.m2069A(((InterfaceC4131n) interfaceC4121d).mo5884g());
                if ((interfaceC4121d.mo5878i().f3446k & 32) == 0) {
                    InterfaceC4122e interfaceC4122e = (InterfaceC4122e) interfaceC4121d;
                    if (!m1864f(c0826a, interfaceC4122e.mo5886k())) {
                        m1863e(c0826a, interfaceC4122e.mo5886k());
                    }
                } else {
                    m1862d(c0826a, ((InterfaceC4131n) interfaceC4121d).mo5884g());
                }
                break;
            case 11:
            case 22:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                mo1871n(c0826a);
                break;
            case 12:
            case 15:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                c0826a.write(", ");
                c0826a.m2069A(((InterfaceC4131n) interfaceC4121d).mo5884g());
                break;
            case 13:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                break;
            case 14:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                c0826a.write(", ");
                c0826a.write("field@0x");
                C2497n c2497n = (C2497n) interfaceC4121d;
                c0826a.m2071C(c2497n.f8116a.f7532b.m585P(c2497n.f8118c + 2));
                break;
            case 16:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                c0826a.write(", ");
                mo1871n(c0826a);
                break;
            case 17:
            case 23:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                break;
            case 18:
                m1868k(c0826a);
                c0826a.write(32);
                m1865g(c0826a);
                c0826a.write(", ");
                m1870m(c0826a);
                c0826a.write(", ");
                C2499p c2499p = (C2499p) interfaceC4121d;
                m1869l(c0826a, c2499p.f8116a.f7532b.m584O(c2499p.f8118c + 3));
                break;
            case 24:
                m1868k(c0826a);
                c0826a.write(32);
                m1867j(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                break;
            case 25:
                m1868k(c0826a);
                c0826a.write(32);
                m1867j(c0826a);
                c0826a.write(", ");
                c0826a.write("inline@");
                c0826a.m2084z(((InterfaceC4120c) interfaceC4121d).mo5895m());
                break;
            case 26:
                m1868k(c0826a);
                c0826a.write(32);
                m1867j(c0826a);
                c0826a.write(", ");
                c0826a.write("vtable@");
                c0826a.m2084z(((InterfaceC4130m) interfaceC4121d).mo5896o());
                break;
            case 27:
                m1868k(c0826a);
                c0826a.write(32);
                m1866i(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                break;
            case 28:
                m1868k(c0826a);
                c0826a.write(32);
                m1866i(c0826a);
                c0826a.write(", ");
                c0826a.write("inline@");
                c0826a.m2084z(((InterfaceC4120c) interfaceC4121d).mo5895m());
                break;
            case 29:
                m1868k(c0826a);
                c0826a.write(32);
                m1866i(c0826a);
                c0826a.write(", ");
                c0826a.write("vtable@");
                c0826a.m2084z(((InterfaceC4130m) interfaceC4121d).mo5896o());
                break;
            case 30:
                m1868k(c0826a);
                c0826a.write(32);
                m1867j(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                c0826a.write(", ");
                interfaceC0693d2.mo1861a();
                break;
            case 31:
                m1868k(c0826a);
                c0826a.write(32);
                m1866i(c0826a);
                c0826a.write(", ");
                interfaceC0693d.mo1861a();
                c0826a.write(", ");
                interfaceC0693d2.mo1861a();
                break;
            default:
                return false;
        }
        if (z9) {
            c0826a.write("\nnop");
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m1864f(C0826a c0826a, int i9) throws IOException {
        String str = (String) ((HashMap) ((C0016a) ((C0184c) this.f2109h.f476b).f469a).f56i).get(Integer.valueOf(i9));
        if (str == null) {
            return false;
        }
        c0826a.write("    # ");
        c0826a.write(str);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1865g(C0826a c0826a) {
        m1869l(c0826a, ((InterfaceC4124g) this.f2110i).mo5885h());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1866i(C0826a c0826a) throws IOException {
        InterfaceC4126i interfaceC4126i = (InterfaceC4126i) this.f2110i;
        int iMo5889b = interfaceC4126i.mo5889b();
        if (iMo5889b == 0) {
            c0826a.write("{}");
            return;
        }
        int iMo5897n = interfaceC4126i.mo5897n();
        C0192k c0192k = (C0192k) this.f2109h.f481g;
        int i9 = (iMo5889b + iMo5897n) - 1;
        int i10 = c0192k.f488b - c0192k.f489c;
        if (iMo5897n >= i10) {
            c0826a.write("{p");
            c0826a.m2084z(iMo5897n - i10);
            c0826a.write(" .. p");
            c0826a.m2084z(i9 - i10);
            c0826a.write(125);
            return;
        }
        c0826a.write("{v");
        c0826a.m2084z(iMo5897n);
        c0826a.write(" .. v");
        c0826a.m2084z(i9);
        c0826a.write(125);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1867j(C0826a c0826a) throws IOException {
        InterfaceC4119b interfaceC4119b = (InterfaceC4119b) this.f2110i;
        int iMo5889b = interfaceC4119b.mo5889b();
        c0826a.write(123);
        if (iMo5889b == 1) {
            m1869l(c0826a, interfaceC4119b.mo5892p());
        } else if (iMo5889b == 2) {
            m1869l(c0826a, interfaceC4119b.mo5892p());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5891j());
        } else if (iMo5889b == 3) {
            m1869l(c0826a, interfaceC4119b.mo5892p());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5891j());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5894r());
        } else if (iMo5889b == 4) {
            m1869l(c0826a, interfaceC4119b.mo5892p());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5891j());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5894r());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5893q());
        } else if (iMo5889b == 5) {
            m1869l(c0826a, interfaceC4119b.mo5892p());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5891j());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5894r());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5893q());
            c0826a.write(", ");
            m1869l(c0826a, interfaceC4119b.mo5890d());
        }
        c0826a.write(125);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m1868k(C0826a c0826a) throws IOException {
        c0826a.write(this.f2110i.mo5878i().f3444i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m1869l(C0826a c0826a, int i9) {
        ((C0192k) this.f2109h.f481g).m862o(c0826a, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m1870m(C0826a c0826a) {
        m1869l(c0826a, ((InterfaceC4128k) this.f2110i).mo5887e());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void mo1871n(C0826a c0826a) {
        throw new RuntimeException();
    }
}

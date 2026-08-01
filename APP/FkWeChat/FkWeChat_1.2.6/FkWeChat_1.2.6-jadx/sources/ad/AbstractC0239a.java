package ad;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p172l8.C4699i;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p215oc.C5706c;
import p215oc.C5725t;
import p215oc.C5729x;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ad.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0239a {

    /* JADX INFO: renamed from: a */
    public int f592a;

    /* JADX INFO: renamed from: c */
    public String f594c;

    /* JADX INFO: renamed from: b */
    public final C0264i0 f593b = new C0264i0();

    /* JADX INFO: renamed from: d */
    public StringBuilder f595d = new StringBuilder();

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ boolean m585Q(AbstractC0239a abstractC0239a, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: tryConsumeNull");
            return false;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractC0239a.m604P(z10);
    }

    /* JADX INFO: renamed from: o */
    public static final double m587o(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        C5729x.m23182a();
        return 0.0d;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Void m588z(AbstractC0239a abstractC0239a, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: fail");
            return null;
        }
        if ((i11 & 2) != 0) {
            i10 = abstractC0239a.f592a;
        }
        if ((i11 & 4) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return abstractC0239a.m629y(str, i10, str2);
    }

    /* JADX INFO: renamed from: A */
    public final void m589A(String str) {
        str.getClass();
        int iM33166u0 = AbstractC8621f0.m33166u0(mo601M(0, this.f592a), str, 0, false, 6, null);
        throw new C0298y("Encountered an unknown key '" + str + "' at offset " + iM33166u0 + " at path: " + this.f593b.m775a() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) AbstractC0246c0.m703i(mo592D(), iM33166u0)));
    }

    /* JADX INFO: renamed from: B */
    public final int m590B(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m588z(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        C5706c.m23089a();
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final StringBuilder m591C() {
        return this.f595d;
    }

    /* JADX INFO: renamed from: D */
    public abstract CharSequence mo592D();

    /* JADX INFO: renamed from: E */
    public final boolean m593E() {
        return mo596H() != 10;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m594F(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public abstract String mo595G(String str, boolean z10);

    /* JADX INFO: renamed from: H */
    public byte mo596H() {
        CharSequence charSequenceMo592D = mo592D();
        int i10 = this.f592a;
        while (true) {
            int iMo598J = mo598J(i10);
            if (iMo598J == -1) {
                this.f592a = iMo598J;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo592D.charAt(iMo598J);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f592a = iMo598J;
                return AbstractC0242b.m651a(cCharAt);
            }
            i10 = iMo598J + 1;
        }
    }

    /* JADX INFO: renamed from: I */
    public final String m597I(boolean z10) {
        String strM621q;
        byte bMo596H = mo596H();
        if (z10) {
            if (bMo596H != 1 && bMo596H != 0) {
                return null;
            }
            strM621q = m623s();
        } else {
            if (bMo596H != 1) {
                return null;
            }
            strM621q = m621q();
        }
        this.f594c = strM621q;
        return strM621q;
    }

    /* JADX INFO: renamed from: J */
    public abstract int mo598J(int i10);

    /* JADX INFO: renamed from: K */
    public final void m599K(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bMo596H = mo596H();
        if (bMo596H != 8 && bMo596H != 6) {
            m623s();
            return;
        }
        while (true) {
            byte bMo596H2 = mo596H();
            if (bMo596H2 != 1) {
                if (bMo596H2 == 8 || bMo596H2 == 6) {
                    arrayList.add(Byte.valueOf(bMo596H2));
                } else if (bMo596H2 == 9) {
                    if (((Number) AbstractC5081g0.m20587u0(arrayList)).byteValue() != 8) {
                        throw AbstractC0246c0.m700f(this.f592a, "found ] instead of } at path: " + this.f593b, mo592D());
                    }
                    AbstractC5070c0.m20499L(arrayList);
                } else if (bMo596H2 == 7) {
                    if (((Number) AbstractC5081g0.m20587u0(arrayList)).byteValue() != 6) {
                        throw AbstractC0246c0.m700f(this.f592a, "found } instead of ] at path: " + this.f593b, mo592D());
                    }
                    AbstractC5070c0.m20499L(arrayList);
                } else if (bMo596H2 == 10) {
                    m588z(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    C5706c.m23089a();
                    return;
                }
                mo616k();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                m623s();
            } else {
                mo615j();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public abstract int mo600L();

    /* JADX INFO: renamed from: M */
    public String mo601M(int i10, int i11) {
        return mo592D().subSequence(i10, i11).toString();
    }

    /* JADX INFO: renamed from: N */
    public final String m602N() {
        String str = this.f594c;
        str.getClass();
        this.f594c = null;
        return str;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m603O() {
        int iMo600L = mo600L();
        CharSequence charSequenceMo592D = mo592D();
        if (iMo600L >= charSequenceMo592D.length() || iMo600L == -1 || charSequenceMo592D.charAt(iMo600L) != ',') {
            return false;
        }
        this.f592a++;
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m604P(boolean z10) {
        int iMo598J = mo598J(mo600L());
        int length = mo592D().length() - iMo598J;
        if (length < 4 || iMo598J == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if ("null".charAt(i10) != mo592D().charAt(iMo598J + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractC0242b.m651a(mo592D().charAt(iMo598J + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.f592a = iMo598J + 4;
        return true;
    }

    /* JADX INFO: renamed from: R */
    public final void m605R(char c10) {
        int i10 = this.f592a;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.f592a = i10 - 1;
                String strM623s = m623s();
                this.f592a = i10;
                if (AbstractC1061t.m3842c(strM623s, "null")) {
                    m629y("Expected string literal but 'null' literal was found", this.f592a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new C4699i();
                }
            } catch (Throwable th) {
                this.f592a = i10;
                throw th;
            }
        }
        String strM653c = AbstractC0242b.m653c(AbstractC0242b.m651a(c10));
        int i11 = this.f592a;
        int i12 = i11 - 1;
        m588z(this, "Expected " + strM653c + ", but had '" + ((i11 == mo592D().length() || i12 < 0) ? "EOF" : String.valueOf(mo592D().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new C4699i();
    }

    /* JADX INFO: renamed from: S */
    public final boolean m606S() {
        return mo592D().charAt(this.f592a - 1) != '\"';
    }

    /* JADX INFO: renamed from: b */
    public final int m607b(int i10) {
        int iMo598J = mo598J(i10);
        if (iMo598J == -1) {
            m588z(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            C5706c.m23089a();
            return 0;
        }
        int i11 = iMo598J + 1;
        char cCharAt = mo592D().charAt(iMo598J);
        if (cCharAt == 'u') {
            return m609d(mo592D(), i11);
        }
        char cM652b = AbstractC0242b.m652b(cCharAt);
        if (cM652b != 0) {
            this.f595d.append(cM652b);
            return i11;
        }
        m588z(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        C5706c.m23089a();
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m608c(int i10, int i11) {
        mo610e(i10, i11);
        return m607b(i11 + 1);
    }

    /* JADX INFO: renamed from: d */
    public final int m609d(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.f595d.append((char) ((m590B(charSequence, i10) << 12) + (m590B(charSequence, i10 + 1) << 8) + (m590B(charSequence, i10 + 2) << 4) + m590B(charSequence, i10 + 3)));
            return i11;
        }
        this.f592a = i10;
        mo627w();
        if (this.f592a + 4 < charSequence.length()) {
            return m609d(charSequence, this.f592a);
        }
        m588z(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        C5706c.m23089a();
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public void mo610e(int i10, int i11) {
        this.f595d.append(mo592D(), i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo611f();

    /* JADX INFO: renamed from: g */
    public final boolean m612g(int i10) {
        int iMo598J = mo598J(i10);
        if (iMo598J >= mo592D().length() || iMo598J == -1) {
            m588z(this, "EOF", 0, null, 6, null);
            C5706c.m23089a();
            return false;
        }
        int i11 = iMo598J + 1;
        int iCharAt = mo592D().charAt(iMo598J) | ' ';
        if (iCharAt == 102) {
            m614i("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            m614i("rue", i11);
            return true;
        }
        m588z(this, "Expected valid boolean literal prefix, but had '" + m623s() + '\'', 0, null, 6, null);
        C5706c.m23089a();
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m613h() {
        boolean z10;
        int iMo600L = mo600L();
        if (iMo600L == mo592D().length()) {
            m588z(this, "EOF", 0, null, 6, null);
            C5706c.m23089a();
            return false;
        }
        if (mo592D().charAt(iMo600L) == '\"') {
            iMo600L++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zM612g = m612g(iMo600L);
        if (!z10) {
            return zM612g;
        }
        if (this.f592a == mo592D().length()) {
            m588z(this, "EOF", 0, null, 6, null);
            C5706c.m23089a();
            return false;
        }
        if (mo592D().charAt(this.f592a) == '\"') {
            this.f592a++;
            return zM612g;
        }
        m588z(this, "Expected closing quotation mark", 0, null, 6, null);
        C5706c.m23089a();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m614i(String str, int i10) {
        if (mo592D().length() - i10 < str.length()) {
            m588z(this, "Unexpected end of boolean literal", 0, null, 6, null);
            C5706c.m23089a();
            return;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (mo592D().charAt(i10 + i11) | ' ')) {
                m588z(this, "Expected valid boolean literal prefix, but had '" + m623s() + '\'', 0, null, 6, null);
                C5706c.m23089a();
                return;
            }
        }
        this.f592a = i10 + str.length();
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo615j();

    /* JADX INFO: renamed from: k */
    public abstract byte mo616k();

    /* JADX INFO: renamed from: l */
    public final byte m617l(byte b10) {
        byte bMo616k = mo616k();
        if (bMo616k == b10) {
            return bMo616k;
        }
        String strM653c = AbstractC0242b.m653c(b10);
        int i10 = this.f592a;
        int i11 = i10 - 1;
        m588z(this, "Expected " + strM653c + ", but had '" + ((i10 == mo592D().length() || i11 < 0) ? "EOF" : String.valueOf(mo592D().charAt(i11))) + "' instead", i11, null, 4, null);
        C5706c.m23089a();
        return (byte) 0;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo618m(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        m588z(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0130, code lost:
    
        if (r2 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0135, code lost:
    
        if (r1 == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if (r9 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        if (r1 == (r2 - 1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        if (r0 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
    
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        if (mo592D().charAt(r2) != '\"') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0150, code lost:
    
        m588z(r18, "Expected closing quotation mark", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0160, code lost:
    
        m588z(r18, "EOF", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0170, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        r18.f592a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        if (r8 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0175, code lost:
    
        r1 = r10 * m587o(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0191, code lost:
    
        m588z(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        m588z(r18, "Numeric value overflow", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (r9 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        m588z(r18, "Numeric value overflow", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        m588z(r18, "Expected numeric literal", 0, null, 6, null);
        p215oc.C5706c.m23089a();
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m619n() {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.AbstractC0239a.m619n():long");
    }

    /* JADX INFO: renamed from: p */
    public final long m620p() {
        long jM619n = m619n();
        if (mo616k() == 10) {
            return jM619n;
        }
        AbstractC0242b.m653c((byte) 10);
        int i10 = this.f592a;
        int i11 = i10 - 1;
        m588z(this, "Expected input to contain a single valid number, but got '" + ((i10 == mo592D().length() || i11 < 0) ? "EOF" : String.valueOf(mo592D().charAt(i11))) + "' after it", i11, null, 4, null);
        C5706c.m23089a();
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public final String m621q() {
        return this.f594c != null ? m602N() : mo615j();
    }

    /* JADX INFO: renamed from: r */
    public final String m622r(CharSequence charSequence, int i10, int i11) {
        charSequence.getClass();
        char cCharAt = charSequence.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iMo598J = mo598J(m608c(i10, i11));
                if (iMo598J == -1) {
                    m588z(this, "Unexpected EOF", iMo598J, null, 4, null);
                    C5706c.m23089a();
                    return null;
                }
                z10 = true;
                i10 = iMo598J;
                i11 = i10;
            } else {
                i11++;
                if (i11 >= charSequence.length()) {
                    mo610e(i10, i11);
                    int iMo598J2 = mo598J(i11);
                    if (iMo598J2 == -1) {
                        m588z(this, "Unexpected EOF", iMo598J2, null, 4, null);
                        C5706c.m23089a();
                        return null;
                    }
                    i10 = iMo598J2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            cCharAt = charSequence.charAt(i11);
        }
        String strMo601M = !z10 ? mo601M(i10, i11) : m625u(i10, i11);
        this.f592a = i11 + 1;
        return strMo601M;
    }

    /* JADX INFO: renamed from: s */
    public final String m623s() {
        if (this.f594c != null) {
            return m602N();
        }
        int iMo600L = mo600L();
        if (iMo600L >= mo592D().length() || iMo600L == -1) {
            m588z(this, "EOF", iMo600L, null, 4, null);
            C5706c.m23089a();
            return null;
        }
        byte bM651a = AbstractC0242b.m651a(mo592D().charAt(iMo600L));
        if (bM651a == 1) {
            return m621q();
        }
        if (bM651a != 0) {
            m588z(this, "Expected beginning of the string, but got " + mo592D().charAt(iMo600L), 0, null, 6, null);
            C5706c.m23089a();
            return null;
        }
        boolean z10 = false;
        while (AbstractC0242b.m651a(mo592D().charAt(iMo600L)) == 0) {
            iMo600L++;
            if (iMo600L >= mo592D().length()) {
                mo610e(this.f592a, iMo600L);
                int iMo598J = mo598J(iMo600L);
                if (iMo598J == -1) {
                    this.f592a = iMo600L;
                    return m625u(0, 0);
                }
                iMo600L = iMo598J;
                z10 = true;
            }
        }
        int i10 = this.f592a;
        String strMo601M = !z10 ? mo601M(i10, iMo600L) : m625u(i10, iMo600L);
        this.f592a = iMo600L;
        return strMo601M;
    }

    /* JADX INFO: renamed from: t */
    public final String m624t() {
        String strM623s = m623s();
        if (!AbstractC1061t.m3842c(strM623s, "null") || !m606S()) {
            return strM623s;
        }
        m588z(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        C5706c.m23089a();
        return null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo592D()) + "', currentPosition=" + this.f592a + ')';
    }

    /* JADX INFO: renamed from: u */
    public final String m625u(int i10, int i11) {
        mo610e(i10, i11);
        String string = this.f595d.toString();
        this.f595d.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: v */
    public final void m626v() {
        this.f594c = null;
    }

    /* JADX INFO: renamed from: x */
    public final void m628x() {
        if (mo616k() == 10) {
            return;
        }
        m588z(this, "Expected EOF after parsing, but had " + mo592D().charAt(this.f592a - 1) + " instead", 0, null, 6, null);
        C5706c.m23089a();
    }

    /* JADX INFO: renamed from: y */
    public final Void m629y(String str, int i10, String str2) {
        String str3;
        str.getClass();
        str2.getClass();
        if (str2.length() == 0) {
            str3 = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            str3 = "\n" + str2;
        }
        throw AbstractC0246c0.m700f(i10, str + " at path: " + this.f593b.m775a() + str3, mo592D());
    }

    /* JADX INFO: renamed from: w */
    public void mo627w() {
    }
}

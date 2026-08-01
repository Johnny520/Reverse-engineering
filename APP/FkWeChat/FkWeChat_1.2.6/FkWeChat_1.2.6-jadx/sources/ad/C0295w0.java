package ad;

import p185m8.AbstractC5102r;
import p215oc.C5706c;

/* JADX INFO: renamed from: ad.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0295w0 extends AbstractC0239a {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0290u f719e;

    /* JADX INFO: renamed from: f */
    public final char[] f720f;

    /* JADX INFO: renamed from: g */
    public int f721g;

    /* JADX INFO: renamed from: h */
    public final C0254f f722h;

    public C0295w0(InterfaceC0290u interfaceC0290u, char[] cArr) {
        interfaceC0290u.getClass();
        cArr.getClass();
        this.f719e = interfaceC0290u;
        this.f720f = cArr;
        this.f721g = 128;
        this.f722h = new C0254f(cArr);
        m865V(0);
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: G */
    public String mo595G(String str, boolean z10) {
        str.getClass();
        return null;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: J */
    public int mo598J(int i10) {
        if (i10 < mo592D().length()) {
            return i10;
        }
        this.f592a = i10;
        mo627w();
        return (this.f592a != 0 || mo592D().length() == 0) ? -1 : 0;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: L */
    public int mo600L() {
        int iMo598J;
        char cCharAt;
        int i10 = this.f592a;
        while (true) {
            iMo598J = mo598J(i10);
            if (iMo598J == -1 || !((cCharAt = mo592D().charAt(iMo598J)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = iMo598J + 1;
        }
        this.f592a = iMo598J;
        return iMo598J;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: M */
    public String mo601M(int i10, int i11) {
        return mo592D().m750e(i10, i11);
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C0254f mo592D() {
        return this.f722h;
    }

    /* JADX INFO: renamed from: U */
    public int m864U(char c10, int i10) {
        C0254f c0254fMo592D = mo592D();
        int length = c0254fMo592D.length();
        while (i10 < length) {
            if (c0254fMo592D.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: V */
    public final void m865V(int i10) {
        char[] cArrM747b = mo592D().m747b();
        if (i10 != 0) {
            int i11 = this.f592a;
            AbstractC5102r.m20656h(cArrM747b, cArrM747b, 0, i11, i11 + i10);
        }
        int length = mo592D().length();
        while (true) {
            if (i10 == length) {
                break;
            }
            int iMo847a = this.f719e.mo847a(cArrM747b, i10, length - i10);
            if (iMo847a == -1) {
                mo592D().m751f(i10);
                this.f721g = -1;
                break;
            }
            i10 += iMo847a;
        }
        this.f592a = 0;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: e */
    public void mo610e(int i10, int i11) {
        m591C().append(mo592D().m747b(), i10, i11 - i10);
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: f */
    public boolean mo611f() {
        mo627w();
        int i10 = this.f592a;
        while (true) {
            int iMo598J = mo598J(i10);
            if (iMo598J == -1) {
                this.f592a = iMo598J;
                return false;
            }
            char cCharAt = mo592D().charAt(iMo598J);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f592a = iMo598J;
                return m594F(cCharAt);
            }
            i10 = iMo598J + 1;
        }
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: j */
    public String mo615j() {
        mo618m('\"');
        int i10 = this.f592a;
        int iM864U = m864U('\"', i10);
        if (iM864U != -1) {
            for (int i11 = i10; i11 < iM864U; i11++) {
                if (mo592D().charAt(i11) == '\\') {
                    return m622r(mo592D(), this.f592a, i11);
                }
            }
            this.f592a = iM864U + 1;
            return mo601M(i10, iM864U);
        }
        int iMo598J = mo598J(i10);
        if (iMo598J != -1) {
            return m622r(mo592D(), this.f592a, iMo598J);
        }
        String strM653c = AbstractC0242b.m653c((byte) 1);
        int i12 = this.f592a;
        int i13 = i12 - 1;
        AbstractC0239a.m588z(this, "Expected " + strM653c + ", but had '" + ((i12 == mo592D().length() || i13 < 0) ? "EOF" : String.valueOf(mo592D().charAt(i13))) + "' instead", i13, null, 4, null);
        C5706c.m23089a();
        return null;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: k */
    public byte mo616k() {
        mo627w();
        C0254f c0254fMo592D = mo592D();
        int i10 = this.f592a;
        while (true) {
            int iMo598J = mo598J(i10);
            if (iMo598J == -1) {
                this.f592a = iMo598J;
                return (byte) 10;
            }
            int i11 = iMo598J + 1;
            byte bM651a = AbstractC0242b.m651a(c0254fMo592D.charAt(iMo598J));
            if (bM651a != 3) {
                this.f592a = i11;
                return bM651a;
            }
            i10 = i11;
        }
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: m */
    public void mo618m(char c10) {
        mo627w();
        C0254f c0254fMo592D = mo592D();
        int i10 = this.f592a;
        while (true) {
            int iMo598J = mo598J(i10);
            if (iMo598J == -1) {
                this.f592a = iMo598J;
                m605R(c10);
                return;
            }
            int i11 = iMo598J + 1;
            char cCharAt = c0254fMo592D.charAt(iMo598J);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f592a = i11;
                if (cCharAt == c10) {
                    return;
                } else {
                    m605R(c10);
                }
            }
            i10 = i11;
        }
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: w */
    public void mo627w() {
        int length = mo592D().length() - this.f592a;
        if (length > this.f721g) {
            return;
        }
        m865V(length);
    }
}

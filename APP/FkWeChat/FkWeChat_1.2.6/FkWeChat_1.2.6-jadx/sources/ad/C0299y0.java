package ad;

import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p215oc.C5706c;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ad.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0299y0 extends C0295w0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0299y0(InterfaceC0290u interfaceC0290u, char[] cArr) {
        super(interfaceC0290u, cArr);
        interfaceC0290u.getClass();
        cArr.getClass();
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: H */
    public byte mo596H() {
        mo627w();
        C0254f c0254fMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= c0254fMo592D.length() || iMo600L == -1) {
            return (byte) 10;
        }
        this.f592a = iMo600L;
        return AbstractC0242b.m651a(c0254fMo592D.charAt(iMo600L));
    }

    @Override // ad.C0295w0, ad.AbstractC0239a
    /* JADX INFO: renamed from: L */
    public int mo600L() {
        int iMo598J;
        int i10 = this.f592a;
        while (true) {
            iMo598J = mo598J(i10);
            if (iMo598J == -1) {
                break;
            }
            char cCharAt = mo592D().charAt(iMo598J);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = iMo598J + 1;
            } else {
                if (cCharAt != '/' || iMo598J + 1 >= mo592D().length()) {
                    break;
                }
                C4711r c4711rM871W = m871W(iMo598J);
                int iIntValue = ((Number) c4711rM871W.m18792a()).intValue();
                if (!((Boolean) c4711rM871W.m18793b()).booleanValue()) {
                    iMo598J = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.f592a = iMo598J;
        return iMo598J;
    }

    /* JADX INFO: renamed from: W */
    public final C4711r m871W(int i10) {
        int i11 = i10 + 2;
        char cCharAt = mo592D().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return AbstractC4717x.m18815a(Integer.valueOf(i10), Boolean.FALSE);
            }
            int iMo598J = i11;
            while (i10 != -1) {
                int iM33150m0 = AbstractC8621f0.m33150m0(mo592D(), '\n', iMo598J, false, 4, null);
                if (iM33150m0 != -1) {
                    return AbstractC4717x.m18815a(Integer.valueOf(iM33150m0 + 1), Boolean.TRUE);
                }
                iMo598J = mo598J(mo592D().length());
                i10 = iMo598J;
            }
            return AbstractC4717x.m18815a(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iM872X = i11;
        while (i10 != -1) {
            int iM33152n0 = AbstractC8621f0.m33152n0(mo592D(), "*/", iM872X, false, 4, null);
            if (iM33152n0 != -1) {
                return AbstractC4717x.m18815a(Integer.valueOf(iM33152n0 + 2), Boolean.TRUE);
            }
            if (mo592D().charAt(mo592D().length() - 1) == '*') {
                iM872X = m872X(mo592D().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iM872X = mo598J(mo592D().length());
            }
            i10 = iM872X;
        }
        this.f592a = mo592D().length();
        AbstractC0239a.m588z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: X */
    public final int m872X(int i10) {
        if (mo592D().length() - i10 > this.f721g) {
            return i10;
        }
        this.f592a = i10;
        mo627w();
        return (this.f592a != 0 || mo592D().length() == 0) ? -1 : 0;
    }

    @Override // ad.C0295w0, ad.AbstractC0239a
    /* JADX INFO: renamed from: f */
    public boolean mo611f() {
        mo627w();
        int iMo600L = mo600L();
        if (iMo600L >= mo592D().length() || iMo600L == -1) {
            return false;
        }
        return m594F(mo592D().charAt(iMo600L));
    }

    @Override // ad.C0295w0, ad.AbstractC0239a
    /* JADX INFO: renamed from: k */
    public byte mo616k() {
        mo627w();
        C0254f c0254fMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= c0254fMo592D.length() || iMo600L == -1) {
            return (byte) 10;
        }
        this.f592a = iMo600L + 1;
        return AbstractC0242b.m651a(c0254fMo592D.charAt(iMo600L));
    }

    @Override // ad.C0295w0, ad.AbstractC0239a
    /* JADX INFO: renamed from: m */
    public void mo618m(char c10) {
        mo627w();
        C0254f c0254fMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= c0254fMo592D.length() || iMo600L == -1) {
            this.f592a = -1;
            m605R(c10);
        }
        char cCharAt = c0254fMo592D.charAt(iMo600L);
        this.f592a = iMo600L + 1;
        if (cCharAt == c10) {
            return;
        }
        m605R(c10);
    }
}

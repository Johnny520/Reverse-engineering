package ad;

import p215oc.C5706c;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ad.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0253e1 extends C0247c1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253e1(String str) {
        super(str);
        str.getClass();
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: H */
    public byte mo596H() {
        String strMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= strMo592D.length() || iMo600L == -1) {
            return (byte) 10;
        }
        this.f592a = iMo600L;
        return AbstractC0242b.m651a(strMo592D.charAt(iMo600L));
    }

    @Override // ad.C0247c1, ad.AbstractC0239a
    /* JADX INFO: renamed from: L */
    public int mo600L() {
        int i10;
        int iM33150m0 = this.f592a;
        if (iM33150m0 == -1) {
            return iM33150m0;
        }
        String strMo592D = mo592D();
        while (iM33150m0 < strMo592D.length()) {
            char cCharAt = strMo592D.charAt(iM33150m0);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iM33150m0 + 1) >= strMo592D.length()) {
                    break;
                }
                char cCharAt2 = strMo592D.charAt(i10);
                if (cCharAt2 == '*') {
                    int iM33152n0 = AbstractC8621f0.m33152n0(strMo592D, "*/", iM33150m0 + 2, false, 4, null);
                    if (iM33152n0 == -1) {
                        this.f592a = strMo592D.length();
                        AbstractC0239a.m588z(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        C5706c.m23089a();
                        return 0;
                    }
                    iM33150m0 = iM33152n0 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iM33150m0 = AbstractC8621f0.m33150m0(strMo592D, '\n', iM33150m0 + 2, false, 4, null);
                    iM33150m0 = iM33150m0 == -1 ? strMo592D.length() : iM33150m0 + 1;
                }
            }
        }
        this.f592a = iM33150m0;
        return iM33150m0;
    }

    @Override // ad.C0247c1, ad.AbstractC0239a
    /* JADX INFO: renamed from: f */
    public boolean mo611f() {
        int iMo600L = mo600L();
        if (iMo600L >= mo592D().length() || iMo600L == -1) {
            return false;
        }
        return m594F(mo592D().charAt(iMo600L));
    }

    @Override // ad.C0247c1, ad.AbstractC0239a
    /* JADX INFO: renamed from: k */
    public byte mo616k() {
        String strMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= strMo592D.length() || iMo600L == -1) {
            return (byte) 10;
        }
        this.f592a = iMo600L + 1;
        return AbstractC0242b.m651a(strMo592D.charAt(iMo600L));
    }

    @Override // ad.C0247c1, ad.AbstractC0239a
    /* JADX INFO: renamed from: m */
    public void mo618m(char c10) {
        String strMo592D = mo592D();
        int iMo600L = mo600L();
        if (iMo600L >= strMo592D.length() || iMo600L == -1) {
            this.f592a = -1;
            m605R(c10);
        }
        char cCharAt = strMo592D.charAt(iMo600L);
        this.f592a = iMo600L + 1;
        if (cCharAt == c10) {
            return;
        }
        m605R(c10);
    }
}

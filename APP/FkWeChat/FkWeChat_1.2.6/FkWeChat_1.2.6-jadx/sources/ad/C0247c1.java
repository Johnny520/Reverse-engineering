package ad;

import p024b9.AbstractC1061t;
import p215oc.C5706c;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: ad.c1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C0247c1 extends AbstractC0239a {

    /* JADX INFO: renamed from: e */
    public final String f611e;

    public C0247c1(String str) {
        str.getClass();
        this.f611e = str;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: G */
    public String mo595G(String str, boolean z10) {
        str.getClass();
        int i10 = this.f592a;
        try {
            if (mo616k() == 6 && AbstractC1061t.m3842c(m597I(z10), str)) {
                m626v();
                if (mo616k() == 5) {
                    return m597I(z10);
                }
            }
            return null;
        } finally {
            this.f592a = i10;
            m626v();
        }
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: J */
    public int mo598J(int i10) {
        if (i10 < mo592D().length()) {
            return i10;
        }
        return -1;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: L */
    public int mo600L() {
        char cCharAt;
        int i10 = this.f592a;
        if (i10 == -1) {
            return i10;
        }
        String strMo592D = mo592D();
        while (i10 < strMo592D.length() && ((cCharAt = strMo592D.charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.f592a = i10;
        return i10;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public String mo592D() {
        return this.f611e;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: f */
    public boolean mo611f() {
        int i10 = this.f592a;
        if (i10 == -1) {
            return false;
        }
        String strMo592D = mo592D();
        while (i10 < strMo592D.length()) {
            char cCharAt = strMo592D.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f592a = i10;
                return m594F(cCharAt);
            }
            i10++;
        }
        this.f592a = i10;
        return false;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: j */
    public String mo615j() {
        mo618m('\"');
        int i10 = this.f592a;
        int iM33150m0 = AbstractC8621f0.m33150m0(mo592D(), '\"', i10, false, 4, null);
        if (iM33150m0 != -1) {
            for (int i11 = i10; i11 < iM33150m0; i11++) {
                if (mo592D().charAt(i11) == '\\') {
                    return m622r(mo592D(), this.f592a, i11);
                }
            }
            this.f592a = iM33150m0 + 1;
            return mo592D().substring(i10, iM33150m0);
        }
        m623s();
        String strM653c = AbstractC0242b.m653c((byte) 1);
        int i12 = this.f592a;
        AbstractC0239a.m588z(this, "Expected " + strM653c + ", but had '" + ((i12 == mo592D().length() || i12 < 0) ? "EOF" : String.valueOf(mo592D().charAt(i12))) + "' instead", i12, null, 4, null);
        C5706c.m23089a();
        return null;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: k */
    public byte mo616k() {
        String strMo592D = mo592D();
        int i10 = this.f592a;
        while (i10 != -1 && i10 < strMo592D.length()) {
            int i11 = i10 + 1;
            char cCharAt = strMo592D.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f592a = i11;
                return AbstractC0242b.m651a(cCharAt);
            }
            i10 = i11;
        }
        this.f592a = strMo592D.length();
        return (byte) 10;
    }

    @Override // ad.AbstractC0239a
    /* JADX INFO: renamed from: m */
    public void mo618m(char c10) {
        if (this.f592a == -1) {
            m605R(c10);
        }
        String strMo592D = mo592D();
        int i10 = this.f592a;
        while (i10 < strMo592D.length()) {
            int i11 = i10 + 1;
            char cCharAt = strMo592D.charAt(i10);
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
        this.f592a = -1;
        m605R(c10);
    }
}

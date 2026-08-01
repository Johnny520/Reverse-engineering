package p154k5;

import bsh.C1259t2;
import okhttp3.internal.url._UrlKt;
import p239q5.C6268s;
import p239q5.C6274y;
import p254r5.AbstractC6487a;
import p309v5.AbstractC8826h;
import p376zd.C10010p0;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3986t extends AbstractC3980n {

    /* JADX INFO: renamed from: e */
    public final AbstractC6487a[] f11737e;

    /* JADX INFO: renamed from: f */
    public final int[] f11738f;

    /* JADX INFO: renamed from: g */
    public int f11739g;

    public C3986t(C3978l c3978l, C6274y c6274y, C6268s c6268s, AbstractC6487a[] abstractC6487aArr) {
        super(c3978l, c6274y, c6268s);
        if (abstractC6487aArr == null) {
            C1259t2.m5095a("constants == null");
            throw null;
        }
        this.f11737e = abstractC6487aArr;
        this.f11738f = new int[abstractC6487aArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr = this.f11738f;
            if (i10 >= iArr.length) {
                this.f11739g = -1;
                return;
            } else {
                if (abstractC6487aArr[i10] == null) {
                    C1259t2.m5095a("constants[i] == null");
                    throw null;
                }
                iArr[i10] = -1;
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public AbstractC6487a m15864A(int i10) {
        return this.f11737e[i10];
    }

    /* JADX INFO: renamed from: B */
    public int m15865B(int i10) {
        if (m15868E(i10)) {
            return this.f11738f[i10];
        }
        throw new IllegalStateException("index not yet set for constant " + i10 + " value = " + this.f11737e[i10]);
    }

    /* JADX INFO: renamed from: C */
    public int m15866C() {
        return this.f11737e.length;
    }

    /* JADX INFO: renamed from: D */
    public boolean m15867D() {
        return this.f11739g != -1;
    }

    /* JADX INFO: renamed from: E */
    public boolean m15868E(int i10) {
        return this.f11738f[i10] != -1;
    }

    /* JADX INFO: renamed from: F */
    public void m15869F(int i10) {
        if (i10 < 0) {
            C9987e.m38645a("index < 0");
        } else if (m15867D()) {
            C10010p0.m38820a("class index already set");
        } else {
            this.f11739g = i10;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m15870G(int i10, int i11) {
        if (i11 < 0) {
            C9987e.m38645a("index < 0");
        } else if (m15868E(i10)) {
            C10010p0.m38820a("index already set");
        } else {
            this.f11738f[i10] = i11;
        }
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f11737e.length; i10++) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f11737e[i10].mo6828g());
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: c */
    public String mo15755c() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f11737e.length; i10++) {
            if (!m15868E(i10)) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m15864A(i10).mo25729j());
            sb2.append('@');
            int iM15865B = m15865B(i10);
            if (iM15865B < 65536) {
                sb2.append(AbstractC8826h.m33898g(iM15865B));
            } else {
                sb2.append(AbstractC8826h.m33901j(iM15865B));
            }
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: d */
    public String mo15756d() {
        return mo15678a();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: w */
    public AbstractC3976j mo15716w(C3978l c3978l) {
        return new C3986t(c3978l, m15777m(), m15778n(), this.f11737e, this.f11738f, this.f11739g);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3986t(m15776l(), m15777m(), c6268s, this.f11737e, this.f11738f, this.f11739g);
    }

    public C3986t(C3978l c3978l, C6274y c6274y, C6268s c6268s, AbstractC6487a[] abstractC6487aArr, int[] iArr, int i10) {
        super(c3978l, c6274y, c6268s);
        this.f11737e = abstractC6487aArr;
        this.f11738f = iArr;
        this.f11739g = i10;
    }
}

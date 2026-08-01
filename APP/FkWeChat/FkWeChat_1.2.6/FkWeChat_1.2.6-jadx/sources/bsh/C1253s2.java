package bsh;

import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: bsh.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1253s2 extends AbstractC1126a {

    /* JADX INFO: renamed from: p */
    public char[] f3804p;

    /* JADX INFO: renamed from: q */
    public int f3805q;

    /* JADX INFO: renamed from: r */
    public Reader f3806r;

    public C1253s2(Reader reader, int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.f3805q = -1;
        this.f3804p = new char[4096];
        this.f3806r = reader;
    }

    /* JADX INFO: renamed from: q */
    public char m5082q() {
        int i10 = this.f3429g;
        if (i10 <= 0) {
            this.f3428f = 0;
            this.f3426d = -1;
            return m5087v();
        }
        this.f3429g = i10 - 1;
        int i11 = this.f3426d + 1;
        this.f3426d = i11;
        if (i11 == this.f3425c) {
            this.f3426d = 0;
        }
        int i12 = this.f3426d;
        this.f3428f = i12;
        return this.f3424b[i12];
    }

    /* JADX INFO: renamed from: r */
    public void m5083r() throws IOException {
        if (this.f3430h == 4096) {
            this.f3430h = 0;
            this.f3805q = 0;
        }
        try {
            char[] cArr = this.f3804p;
            int i10 = this.f3430h;
            int iM5089x = m5089x(cArr, i10, 4096 - i10);
            if (iM5089x != -1) {
                this.f3430h += iM5089x;
            } else {
                m5088w();
                throw new IOException();
            }
        } catch (IOException e10) {
            int i11 = this.f3426d;
            if (i11 != 0) {
                this.f3426d = i11 - 1;
                m4023a(0);
            } else {
                m4034m(m4032j(), m4028f());
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m5084s(Reader reader, int i10, int i11) {
        m5085t(reader, i10, i11, 4096);
    }

    /* JADX INFO: renamed from: t */
    public void m5085t(Reader reader, int i10, int i11, int i12) {
        this.f3804p = new char[4096];
        this.f3805q = -1;
        this.f3806r = reader;
        super.m4037p(i10, i11, i12);
    }

    /* JADX INFO: renamed from: u */
    public final char m5086u() throws IOException {
        int i10 = this.f3805q + 1;
        this.f3805q = i10;
        if (i10 >= this.f3430h) {
            m5083r();
        }
        return this.f3804p[this.f3805q];
    }

    /* JADX INFO: renamed from: v */
    public char m5087v() throws IOException {
        char cM5086u;
        char cM5086u2;
        int i10 = this.f3429g;
        if (i10 > 0) {
            this.f3429g = i10 - 1;
            int i11 = this.f3426d + 1;
            this.f3426d = i11;
            if (i11 == this.f3425c) {
                this.f3426d = 0;
            }
            return this.f3424b[this.f3426d];
        }
        int i12 = this.f3426d + 1;
        this.f3426d = i12;
        if (i12 == this.f3427e) {
            m4033l();
        }
        char cM5086u3 = m5086u();
        this.f3424b[this.f3426d] = cM5086u3;
        if (cM5086u3 != '\\') {
            if (m4036o()) {
                m4035n(cM5086u3);
            }
            return cM5086u3;
        }
        if (m4036o()) {
            m4035n(cM5086u3);
        }
        int i13 = 1;
        while (true) {
            int i14 = this.f3426d + 1;
            this.f3426d = i14;
            if (i14 == this.f3427e) {
                m4033l();
            }
            try {
                cM5086u = m5086u();
                this.f3424b[this.f3426d] = cM5086u;
                if (cM5086u != '\\') {
                    break;
                }
                if (m4036o()) {
                    m4035n(cM5086u);
                }
                i13++;
            } catch (IOException unused) {
                if (i13 > 1) {
                    m4023a(i13 - 1);
                }
                return '\\';
            }
        }
        if (m4036o()) {
            m4035n(cM5086u);
        }
        if (cM5086u != 'u' || (i13 & 1) != 1) {
            m4023a(i13);
            return '\\';
        }
        int i15 = this.f3426d - 1;
        this.f3426d = i15;
        if (i15 < 0) {
            this.f3426d = this.f3425c - 1;
        }
        while (true) {
            try {
                cM5086u2 = m5086u();
                if (cM5086u2 != 'u') {
                    break;
                }
                if (m4036o()) {
                    m4035n(cM5086u2);
                }
            } catch (IOException unused2) {
                throw new IllegalStateException("Invalid escape character at line " + m4032j() + " column " + m4028f() + ".");
            }
        }
        char cM5086u4 = m5086u();
        char cM5086u5 = m5086u();
        char cM5086u6 = m5086u();
        char cM4022k = (char) ((AbstractC1126a.m4022k(cM5086u2) << 12) | (AbstractC1126a.m4022k(cM5086u4) << 8) | (AbstractC1126a.m4022k(cM5086u5) << 4) | AbstractC1126a.m4022k(cM5086u6));
        this.f3424b[this.f3426d] = cM4022k;
        if (m4036o()) {
            m4035n(cM5086u2);
            m4035n(cM5086u4);
            m4035n(cM5086u5);
            m4035n(cM5086u6);
        }
        if (i13 == 1) {
            return cM4022k;
        }
        m4023a(i13 - 1);
        return '\\';
    }

    /* JADX INFO: renamed from: w */
    public void m5088w() throws IOException {
        this.f3806r.close();
    }

    /* JADX INFO: renamed from: x */
    public int m5089x(char[] cArr, int i10, int i11) {
        return this.f3806r.read(cArr, i10, i11);
    }

    public C1253s2(Reader reader, int i10, int i11) {
        this(reader, i10, i11, 4096);
    }
}

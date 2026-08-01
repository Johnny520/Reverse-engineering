package p239q5;

import bsh.C1259t2;
import p309v5.AbstractC8834p;
import p376zd.C9987e;

/* JADX INFO: renamed from: q5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6269t extends AbstractC8834p {

    /* JADX INFO: renamed from: t */
    public static final C6269t f19451t = new C6269t(0);

    /* JADX INFO: renamed from: r */
    public final C6267r[] f19452r;

    /* JADX INFO: renamed from: s */
    public int f19453s;

    public C6269t(int i10) {
        super(i10 != 0);
        this.f19452r = new C6267r[i10];
        this.f19453s = 0;
    }

    /* JADX INFO: renamed from: A */
    public void m24784A(C6269t c6269t, boolean z10) {
        C6267r c6267rM24756x;
        m33929u();
        C6267r[] c6267rArr = c6269t.f19452r;
        int length = this.f19452r.length;
        int iMin = Math.min(length, c6267rArr.length);
        this.f19453s = -1;
        for (int i10 = 0; i10 < iMin; i10++) {
            C6267r c6267r = this.f19452r[i10];
            if (c6267r != null && (c6267rM24756x = c6267r.m24756x(c6267rArr[i10], z10)) != c6267r) {
                this.f19452r[i10] = c6267rM24756x;
            }
        }
        while (iMin < length) {
            this.f19452r[iMin] = null;
            iMin++;
        }
    }

    /* JADX INFO: renamed from: B */
    public C6267r m24785B(C6260k c6260k) {
        int length = this.f19452r.length;
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r = this.f19452r[i10];
            if (c6267r != null && c6260k.equals(c6267r.m24752p())) {
                return c6267r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public C6269t m24786C() {
        int length = this.f19452r.length;
        C6269t c6269t = new C6269t(length);
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r = this.f19452r[i10];
            if (c6267r != null) {
                c6269t.m24787D(c6267r);
            }
        }
        c6269t.f19453s = this.f19453s;
        return c6269t;
    }

    /* JADX INFO: renamed from: D */
    public void m24787D(C6267r c6267r) {
        int i10;
        C6267r c6267r2;
        m33929u();
        if (c6267r == null) {
            C1259t2.m5095a("spec == null");
            return;
        }
        this.f19453s = -1;
        try {
            int iM24754t = c6267r.m24754t();
            C6267r[] c6267rArr = this.f19452r;
            c6267rArr[iM24754t] = c6267r;
            if (iM24754t > 0 && (c6267r2 = c6267rArr[iM24754t - 1]) != null && c6267r2.m24751n() == 2) {
                this.f19452r[i10] = null;
            }
            if (c6267r.m24751n() == 2) {
                this.f19452r[iM24754t + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: E */
    public void m24788E(C6269t c6269t) {
        int iM24794z = c6269t.m24794z();
        for (int i10 = 0; i10 < iM24794z; i10++) {
            C6267r c6267rM24792x = c6269t.m24792x(i10);
            if (c6267rM24792x != null) {
                m24787D(c6267rM24792x);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m24789F(C6267r c6267r) {
        try {
            this.f19452r[c6267r.m24754t()] = null;
            this.f19453s = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus reg");
        }
    }

    /* JADX INFO: renamed from: G */
    public C6269t m24790G(int i10) {
        int length = this.f19452r.length;
        C6269t c6269t = new C6269t(length + i10);
        for (int i11 = 0; i11 < length; i11++) {
            C6267r c6267r = this.f19452r[i11];
            if (c6267r != null) {
                c6269t.m24787D(c6267r.m24744I(i10));
            }
        }
        c6269t.f19453s = this.f19453s;
        if (m33928s()) {
            c6269t.mo6829t();
        }
        return c6269t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6269t)) {
            return false;
        }
        C6269t c6269t = (C6269t) obj;
        C6267r[] c6267rArr = c6269t.f19452r;
        int length = this.f19452r.length;
        if (length != c6267rArr.length || size() != c6269t.size()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r = this.f19452r[i10];
            Object obj2 = c6267rArr[i10];
            if (c6267r != obj2 && (c6267r == null || !c6267r.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int length = this.f19452r.length;
        int iHashCode = 0;
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r = this.f19452r[i10];
            iHashCode = (iHashCode * 31) + (c6267r == null ? 0 : c6267r.hashCode());
        }
        return iHashCode;
    }

    public int size() {
        int i10 = this.f19453s;
        if (i10 >= 0) {
            return i10;
        }
        int length = this.f19452r.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f19452r[i12] != null) {
                i11++;
            }
        }
        this.f19453s = i11;
        return i11;
    }

    public String toString() {
        int length = this.f19452r.length;
        StringBuilder sb2 = new StringBuilder(length * 25);
        sb2.append('{');
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r = this.f19452r[i10];
            if (c6267r != null) {
                if (z10) {
                    sb2.append(", ");
                } else {
                    z10 = true;
                }
                sb2.append(c6267r);
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: w */
    public C6267r m24791w(C6267r c6267r) {
        int length = this.f19452r.length;
        for (int i10 = 0; i10 < length; i10++) {
            C6267r c6267r2 = this.f19452r[i10];
            if (c6267r2 != null && c6267r.m24740D(c6267r2)) {
                return c6267r2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public C6267r m24792x(int i10) {
        try {
            return this.f19452r[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C9987e.m38645a("bogus reg");
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public C6267r m24793y(C6267r c6267r) {
        return m24792x(c6267r.m24754t());
    }

    /* JADX INFO: renamed from: z */
    public int m24794z() {
        return this.f19452r.length;
    }
}

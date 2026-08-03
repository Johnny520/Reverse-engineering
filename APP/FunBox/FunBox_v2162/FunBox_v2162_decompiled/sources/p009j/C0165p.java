package p009j;

import p013n.AbstractC0208j;

/* JADX INFO: renamed from: j.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0165p extends AbstractC0208j {

    /* JADX INFO: renamed from: b */
    private final C0162m[] f513b;

    /* JADX INFO: renamed from: c */
    private int f514c;

    static {
        new C0165p(0);
    }

    public C0165p(int i2) {
        super(i2 != 0);
        this.f513b = new C0162m[i2];
        this.f514c = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0165p)) {
            return false;
        }
        C0165p c0165p = (C0165p) obj;
        C0162m[] c0162mArr = c0165p.f513b;
        C0162m[] c0162mArr2 = this.f513b;
        int length = c0162mArr2.length;
        if (length != c0162mArr.length || m410p() != c0165p.m410p()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C0162m c0162m = c0162mArr2[i2];
            Object obj2 = c0162mArr[i2];
            if (c0162m != obj2 && (c0162m == null || !c0162m.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C0162m[] c0162mArr = this.f513b;
        int length = c0162mArr.length;
        int iHashCode = 0;
        for (int i2 = 0; i2 < length; i2++) {
            C0162m c0162m = c0162mArr[i2];
            iHashCode = (iHashCode * 31) + (c0162m == null ? 0 : c0162m.hashCode());
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final C0162m m404j(C0162m c0162m) {
        for (C0162m c0162m2 : this.f513b) {
            if (c0162m2 != null && c0162m.m387n(c0162m2)) {
                return c0162m2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C0162m m405k(int i2) {
        try {
            return this.f513b[i2];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m406l() {
        return this.f513b.length;
    }

    /* JADX INFO: renamed from: m */
    public final void m407m(C0162m c0162m) {
        int i2;
        C0162m c0162m2;
        C0162m[] c0162mArr = this.f513b;
        m537h();
        if (c0162m == null) {
            throw new NullPointerException("spec == null");
        }
        this.f514c = -1;
        try {
            int iM384i = c0162m.m384i();
            c0162mArr[iM384i] = c0162m;
            if (iM384i > 0 && (c0162m2 = c0162mArr[iM384i - 1]) != null && c0162m2.m382g() == 2) {
                c0162mArr[i2] = null;
            }
            if (c0162m.m382g() == 2) {
                c0162mArr[iM384i + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m408n(C0165p c0165p) {
        int length = c0165p.f513b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C0162m c0162mM405k = c0165p.m405k(i2);
            if (c0162mM405k != null) {
                m407m(c0162mM405k);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m409o(C0162m c0162m) {
        try {
            this.f513b[c0162m.m384i()] = null;
            this.f514c = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m410p() {
        int i2 = this.f514c;
        if (i2 >= 0) {
            return i2;
        }
        int i3 = 0;
        for (C0162m c0162m : this.f513b) {
            if (c0162m != null) {
                i3++;
            }
        }
        this.f514c = i3;
        return i3;
    }

    public final String toString() {
        C0162m[] c0162mArr = this.f513b;
        StringBuilder sb = new StringBuilder(c0162mArr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C0162m c0162m : c0162mArr) {
            if (c0162m != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c0162m);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

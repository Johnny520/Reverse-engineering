package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 {

    /* JADX INFO: renamed from: a */
    public final qr2 f8515a;

    /* JADX INFO: renamed from: b */
    public final int[] f8516b;

    /* JADX INFO: renamed from: c */
    public final int f8517c;

    /* JADX INFO: renamed from: d */
    public Object[] f8518d;

    /* JADX INFO: renamed from: e */
    public final int f8519e;

    /* JADX INFO: renamed from: f */
    public boolean f8520f;

    /* JADX INFO: renamed from: g */
    public int f8521g;

    /* JADX INFO: renamed from: h */
    public int f8522h;

    /* JADX INFO: renamed from: i */
    public int f8523i;

    /* JADX INFO: renamed from: j */
    public final i11 f8524j;

    /* JADX INFO: renamed from: k */
    public int f8525k;

    /* JADX INFO: renamed from: l */
    public int f8526l;

    /* JADX INFO: renamed from: m */
    public int f8527m;

    /* JADX INFO: renamed from: n */
    public boolean f8528n;

    public pr2(qr2 qr2Var) {
        this.f8515a = qr2Var;
        this.f8516b = qr2Var.f9132h;
        int i = qr2Var.f9133i;
        this.f8517c = i;
        this.f8518d = qr2Var.f9134j;
        this.f8519e = qr2Var.f9135k;
        this.f8522h = i;
        this.f8523i = -1;
        this.f8524j = new i11();
    }

    /* JADX INFO: renamed from: a */
    public final ao0 m3948a(int i) {
        ArrayList arrayList = this.f8515a.f9140p;
        int iM4993e = sr2.m4993e(arrayList, i, this.f8517c);
        if (iM4993e >= 0) {
            return (ao0) arrayList.get(iM4993e);
        }
        ao0 ao0Var = new ao0(i);
        arrayList.add(-(iM4993e + 1), ao0Var);
        return ao0Var;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3949b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f8518d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C0520nx.f7360a;
    }

    /* JADX INFO: renamed from: c */
    public final void m3950c() {
        this.f8520f = true;
        if (this.f8515a.f9136l <= 0) {
            AbstractC0752tx.m5443a("Unexpected reader close()");
        }
        r0.f9136l--;
        this.f8518d = new Object[0];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3951d(int i) {
        return (this.f8516b[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m3952e() {
        if (this.f8525k == 0) {
            if (this.f8521g != this.f8522h) {
                AbstractC0752tx.m5443a("endGroup() not called at the end of a group");
            }
            int i = (this.f8523i * 5) + 2;
            int[] iArr = this.f8516b;
            int i2 = iArr[i];
            this.f8523i = i2;
            int i3 = this.f8517c;
            this.f8522h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM2242b = this.f8524j.m2242b();
            if (iM2242b < 0) {
                this.f8526l = 0;
                this.f8527m = 0;
            } else {
                this.f8526l = iM2242b;
                this.f8527m = i2 >= i3 + (-1) ? this.f8519e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m3953f() {
        int i = this.f8521g;
        if (i < this.f8522h) {
            return m3949b(this.f8516b, i);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m3954g() {
        int i = this.f8521g;
        if (i >= this.f8522h) {
            return 0;
        }
        return this.f8516b[i * 5];
    }

    /* JADX INFO: renamed from: h */
    public final Object m3955h(int i, int i2) {
        int[] iArr = this.f8516b;
        int iM4990b = sr2.m4990b(iArr, i);
        int i3 = i + 1;
        int i4 = iM4990b + i2;
        return i4 < (i3 < this.f8517c ? iArr[(i3 * 5) + 4] : this.f8519e) ? this.f8518d[i4] : C0520nx.f7360a;
    }

    /* JADX INFO: renamed from: i */
    public final int m3956i(int i) {
        return this.f8516b[i * 5];
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3957j(int i) {
        return (this.f8516b[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3958k(int i) {
        return (this.f8516b[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3959l(int i) {
        return (this.f8516b[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final Object m3960m() {
        int i;
        if (this.f8525k > 0 || (i = this.f8526l) >= this.f8527m) {
            this.f8528n = false;
            return C0520nx.f7360a;
        }
        this.f8528n = true;
        Object[] objArr = this.f8518d;
        this.f8526l = i + 1;
        return objArr[i];
    }

    /* JADX INFO: renamed from: n */
    public final Object m3961n(int i) {
        int i2 = i * 5;
        int[] iArr = this.f8516b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f8518d[iArr[i2 + 4]] : C0520nx.f7360a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m3962o(int i) {
        return this.f8516b[(i * 5) + 1] & 67108863;
    }

    /* JADX INFO: renamed from: p */
    public final Object m3963p(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f8518d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX INFO: renamed from: q */
    public final int m3964q(int i) {
        return this.f8516b[(i * 5) + 2];
    }

    /* JADX INFO: renamed from: r */
    public final void m3965r(int i) {
        if (this.f8525k != 0) {
            AbstractC0752tx.m5443a("Cannot reposition while in an empty region");
        }
        this.f8521g = i;
        int[] iArr = this.f8516b;
        int i2 = this.f8517c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f8523i) {
            this.f8523i = i3;
            if (i3 < 0) {
                this.f8522h = i2;
            } else {
                this.f8522h = iArr[(i3 * 5) + 3] + i3;
            }
            this.f8526l = 0;
            this.f8527m = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m3966s() {
        if (this.f8525k != 0) {
            AbstractC0752tx.m5443a("Cannot skip while in an empty region");
        }
        int i = this.f8521g;
        int i2 = i * 5;
        int[] iArr = this.f8516b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f8521g = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX INFO: renamed from: t */
    public final void m3967t() {
        if (!(this.f8525k == 0)) {
            AbstractC0752tx.m5443a("Cannot skip the enclosing group while in an empty region");
        }
        this.f8521g = this.f8522h;
        this.f8526l = 0;
        this.f8527m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f8521g);
        sb.append(", key=");
        sb.append(m3954g());
        sb.append(", parent=");
        sb.append(this.f8523i);
        sb.append(", end=");
        return vi0.m5694m(sb, this.f8522h, ')');
    }

    /* JADX INFO: renamed from: u */
    public final void m3968u() {
        if (this.f8525k <= 0) {
            int i = this.f8523i;
            int i2 = this.f8521g;
            int i3 = i2 * 5;
            int[] iArr = this.f8516b;
            if (iArr[i3 + 2] != i) {
                j22.m2429a("Invalid slot table detected");
            }
            int i4 = this.f8526l;
            int i5 = this.f8527m;
            i11 i11Var = this.f8524j;
            if (i4 == 0 && i5 == 0) {
                i11Var.m2243c(-1);
            } else {
                i11Var.m2243c(i4);
            }
            this.f8523i = i2;
            this.f8522h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f8521g = i6;
            this.f8526l = sr2.m4990b(iArr, i2);
            this.f8527m = i2 >= this.f8517c + (-1) ? this.f8519e : iArr[(i6 * 5) + 4];
        }
    }
}

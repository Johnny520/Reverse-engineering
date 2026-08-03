package p159l0;

import java.util.ArrayList;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1861n1;
import p117i0.C1851l;
import p117i0.C1856m0;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: l0.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2425g {

    /* JADX INFO: renamed from: a */
    public final C2426h f7935a;

    /* JADX INFO: renamed from: b */
    public final int[] f7936b;

    /* JADX INFO: renamed from: c */
    public final int f7937c;

    /* JADX INFO: renamed from: d */
    public Object[] f7938d;

    /* JADX INFO: renamed from: e */
    public final int f7939e;

    /* JADX INFO: renamed from: f */
    public boolean f7940f;

    /* JADX INFO: renamed from: g */
    public int f7941g;

    /* JADX INFO: renamed from: h */
    public int f7942h;

    /* JADX INFO: renamed from: i */
    public int f7943i;

    /* JADX INFO: renamed from: j */
    public final C1856m0 f7944j;

    /* JADX INFO: renamed from: k */
    public int f7945k;

    /* JADX INFO: renamed from: l */
    public int f7946l;

    /* JADX INFO: renamed from: m */
    public int f7947m;

    /* JADX INFO: renamed from: n */
    public boolean f7948n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2425g(C2426h c2426h) {
        this.f7935a = c2426h;
        this.f7936b = c2426h.f7949g;
        int i9 = c2426h.f7950h;
        this.f7937c = i9;
        this.f7938d = c2426h.f7951i;
        this.f7939e = c2426h.f7952j;
        this.f7942h = i9;
        this.f7943i = -1;
        this.f7944j = new C1856m0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2420b m5760a(int i9) {
        ArrayList arrayList = this.f7935a.f7957o;
        int iM5791e = AbstractC2428j.m5791e(arrayList, i9, this.f7937c);
        if (iM5791e >= 0) {
            return (C2420b) arrayList.get(iM5791e);
        }
        C2420b c2420b = new C2420b(i9);
        arrayList.add(-(iM5791e + 1), c2420b);
        return c2420b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m5761b(int[] iArr, int i9) {
        int i10 = i9 * 5;
        int i11 = iArr[i10 + 1];
        if ((268435456 & i11) != 0) {
            return this.f7938d[i10 >= iArr.length ? iArr.length : iArr[i10 + 4] + Integer.bitCount(i11 >> 29)];
        }
        return C1851l.f6155a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5762c() {
        this.f7940f = true;
        if (this.f7935a.f7953k <= 0) {
            AbstractC1855m.m4573a("Unexpected reader close()");
        }
        r0.f7953k--;
        this.f7938d = new Object[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m5763d(int i9) {
        return (this.f7936b[(i9 * 5) + 1] & 67108864) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m5764e() {
        if (this.f7945k == 0) {
            if (this.f7941g != this.f7942h) {
                AbstractC1855m.m4573a("endGroup() not called at the end of a group");
            }
            int i9 = (this.f7943i * 5) + 2;
            int[] iArr = this.f7936b;
            int i10 = iArr[i9];
            this.f7943i = i10;
            int i11 = this.f7937c;
            this.f7942h = i10 < 0 ? i11 : iArr[(i10 * 5) + 3] + i10;
            int iM4576b = this.f7944j.m4576b();
            if (iM4576b < 0) {
                this.f7946l = 0;
                this.f7947m = 0;
            } else {
                this.f7946l = iM4576b;
                this.f7947m = i10 >= i11 + (-1) ? this.f7939e : iArr[((i10 + 1) * 5) + 4];
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m5765f() {
        int i9 = this.f7941g;
        if (i9 < this.f7942h) {
            return m5761b(this.f7936b, i9);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m5766g() {
        int i9 = this.f7941g;
        if (i9 >= this.f7942h) {
            return 0;
        }
        return this.f7936b[i9 * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m5767h(int i9, int i10) {
        int[] iArr = this.f7936b;
        int iM5788b = AbstractC2428j.m5788b(iArr, i9);
        int i11 = i9 + 1;
        int i12 = iM5788b + i10;
        return i12 < (i11 < this.f7937c ? iArr[(i11 * 5) + 4] : this.f7939e) ? this.f7938d[i12] : C1851l.f6155a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m5768i(int i9) {
        return this.f7936b[i9 * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m5769j(int i9) {
        return (this.f7936b[(i9 * 5) + 1] & 134217728) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m5770k(int i9) {
        return (this.f7936b[(i9 * 5) + 1] & 536870912) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m5771l(int i9) {
        return (this.f7936b[(i9 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object m5772m() {
        int i9;
        if (this.f7945k > 0 || (i9 = this.f7946l) >= this.f7947m) {
            this.f7948n = false;
            return C1851l.f6155a;
        }
        this.f7948n = true;
        Object[] objArr = this.f7938d;
        this.f7946l = i9 + 1;
        return objArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m5773n(int i9) {
        int i10 = i9 * 5;
        int[] iArr = this.f7936b;
        int i11 = iArr[i10 + 1] & 1073741824;
        if (i11 != 0) {
            return i11 != 0 ? this.f7938d[iArr[i10 + 4]] : C1851l.f6155a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m5774o(int i9) {
        return this.f7936b[(i9 * 5) + 1] & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m5775p(int[] iArr, int i9) {
        int i10 = i9 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) == 0) {
            return null;
        }
        return this.f7938d[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final int m5776q(int i9) {
        return this.f7936b[(i9 * 5) + 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m5777r(int i9) {
        if (this.f7945k != 0) {
            AbstractC1855m.m4573a("Cannot reposition while in an empty region");
        }
        this.f7941g = i9;
        int[] iArr = this.f7936b;
        int i10 = this.f7937c;
        int i11 = i9 < i10 ? iArr[(i9 * 5) + 2] : -1;
        if (i11 != this.f7943i) {
            this.f7943i = i11;
            if (i11 < 0) {
                this.f7942h = i10;
            } else {
                this.f7942h = iArr[(i11 * 5) + 3] + i11;
            }
            this.f7946l = 0;
            this.f7947m = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m5778s() {
        if (this.f7945k != 0) {
            AbstractC1855m.m4573a("Cannot skip while in an empty region");
        }
        int i9 = this.f7941g;
        int i10 = i9 * 5;
        int[] iArr = this.f7936b;
        int i11 = iArr[i10 + 1];
        int i12 = (1073741824 & i11) != 0 ? 1 : i11 & 67108863;
        this.f7941g = iArr[i10 + 3] + i9;
        return i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m5779t() {
        if (!(this.f7945k == 0)) {
            AbstractC1855m.m4573a("Cannot skip the enclosing group while in an empty region");
        }
        this.f7941g = this.f7942h;
        this.f7946l = 0;
        this.f7947m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f7941g);
        sb2.append(", key=");
        sb2.append(m5766g());
        sb2.append(", parent=");
        sb2.append(this.f7943i);
        sb2.append(", end=");
        return AbstractC3199a.m6841n(sb2, this.f7942h, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m5780u() {
        if (this.f7945k <= 0) {
            int i9 = this.f7943i;
            int i10 = this.f7941g;
            int i11 = i10 * 5;
            int[] iArr = this.f7936b;
            if (iArr[i11 + 2] != i9) {
                AbstractC1861n1.m4583a("Invalid slot table detected");
            }
            int i12 = this.f7946l;
            int i13 = this.f7947m;
            C1856m0 c1856m0 = this.f7944j;
            if (i12 == 0 && i13 == 0) {
                c1856m0.m4577c(-1);
            } else {
                c1856m0.m4577c(i12);
            }
            this.f7943i = i10;
            this.f7942h = iArr[i11 + 3] + i10;
            int i14 = i10 + 1;
            this.f7941g = i14;
            this.f7946l = AbstractC2428j.m5788b(iArr, i10);
            this.f7947m = i10 >= this.f7937c + (-1) ? this.f7939e : iArr[(i14 * 5) + 4];
        }
    }
}

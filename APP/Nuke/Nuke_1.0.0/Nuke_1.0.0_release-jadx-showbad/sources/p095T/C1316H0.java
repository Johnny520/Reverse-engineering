package p095T;

import java.util.ArrayList;
import p041H0.C0619t;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: T.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1316H0 {

    /* JADX INFO: renamed from: a */
    public final C1318I0 f4691a;

    /* JADX INFO: renamed from: b */
    public final int[] f4692b;

    /* JADX INFO: renamed from: c */
    public final int f4693c;

    /* JADX INFO: renamed from: d */
    public Object[] f4694d;

    /* JADX INFO: renamed from: e */
    public final int f4695e;

    /* JADX INFO: renamed from: f */
    public boolean f4696f;

    /* JADX INFO: renamed from: g */
    public int f4697g;

    /* JADX INFO: renamed from: h */
    public int f4698h;

    /* JADX INFO: renamed from: i */
    public int f4699i;

    /* JADX INFO: renamed from: j */
    public final C0619t f4700j;

    /* JADX INFO: renamed from: k */
    public int f4701k;

    /* JADX INFO: renamed from: l */
    public int f4702l;

    /* JADX INFO: renamed from: m */
    public int f4703m;

    /* JADX INFO: renamed from: n */
    public boolean f4704n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1316H0(C1318I0 c1318i0) {
        this.f4691a = c1318i0;
        this.f4692b = c1318i0.f4705d;
        int i5 = c1318i0.f4706e;
        this.f4693c = i5;
        this.f4694d = c1318i0.f4707f;
        this.f4695e = c1318i0.f4708g;
        this.f4698h = i5;
        this.f4699i = -1;
        this.f4700j = new C0619t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1349a m2415a(int i5) {
        ArrayList arrayList = this.f4691a.f4713l;
        int iM2446e = AbstractC1322K0.m2446e(arrayList, i5, this.f4693c);
        if (iM2446e >= 0) {
            return (C1349a) arrayList.get(iM2446e);
        }
        C1349a c1349a = new C1349a(i5);
        arrayList.add(-(iM2446e + 1), c1349a);
        return c1349a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m2416b(int[] iArr, int i5) {
        int i6 = i5 * 5;
        int i7 = iArr[i6 + 1];
        if ((268435456 & i7) != 0) {
            return this.f4694d[i6 >= iArr.length ? iArr.length : iArr[i6 + 4] + Integer.bitCount(i7 >> 29)];
        }
        return C1371l.f4833a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2417c() {
        this.f4696f = true;
        C1318I0 c1318i0 = this.f4691a;
        c1318i0.getClass();
        if (this.f4691a != c1318i0 || c1318i0.f4709h <= 0) {
            AbstractC1387t.m2638a("Unexpected reader close()");
        }
        c1318i0.f4709h--;
        this.f4694d = new Object[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m2418d(int i5) {
        return (this.f4692b[(i5 * 5) + 1] & 67108864) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2419e() {
        if (this.f4701k == 0) {
            if (!(this.f4697g == this.f4698h)) {
                AbstractC1387t.m2638a("endGroup() not called at the end of a group");
            }
            int i5 = (this.f4699i * 5) + 2;
            int[] iArr = this.f4692b;
            int i6 = iArr[i5];
            this.f4699i = i6;
            int i7 = this.f4693c;
            this.f4698h = i6 < 0 ? i7 : AbstractC1322K0.m2442a(iArr, i6) + i6;
            int iM1058b = this.f4700j.m1058b();
            if (iM1058b < 0) {
                this.f4702l = 0;
                this.f4703m = 0;
            } else {
                this.f4702l = iM1058b;
                this.f4703m = i6 >= i7 - 1 ? this.f4695e : iArr[((i6 + 1) * 5) + 4];
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m2420f() {
        int i5 = this.f4697g;
        if (i5 < this.f4698h) {
            return m2416b(this.f4692b, i5);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m2421g() {
        int i5 = this.f4697g;
        if (i5 >= this.f4698h) {
            return 0;
        }
        return this.f4692b[i5 * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m2422h(int i5, int i6) {
        int[] iArr = this.f4692b;
        int iM2444c = AbstractC1322K0.m2444c(iArr, i5);
        int i7 = i5 + 1;
        int i8 = iM2444c + i6;
        return i8 < (i7 < this.f4693c ? iArr[(i7 * 5) + 4] : this.f4695e) ? this.f4694d[i8] : C1371l.f4833a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m2423i(int i5) {
        return this.f4692b[i5 * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m2424j(int i5) {
        return (this.f4692b[(i5 * 5) + 1] & 134217728) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m2425k(int i5) {
        return (this.f4692b[(i5 * 5) + 1] & 536870912) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m2426l(int i5) {
        return (this.f4692b[(i5 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object m2427m() {
        int i5;
        if (this.f4701k > 0 || (i5 = this.f4702l) >= this.f4703m) {
            this.f4704n = false;
            return C1371l.f4833a;
        }
        this.f4704n = true;
        Object[] objArr = this.f4694d;
        this.f4702l = i5 + 1;
        return objArr[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m2428n(int i5) {
        int i6 = i5 * 5;
        int[] iArr = this.f4692b;
        int i7 = iArr[i6 + 1] & 1073741824;
        if (i7 != 0) {
            return i7 != 0 ? this.f4694d[iArr[i6 + 4]] : C1371l.f4833a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m2429o(int i5) {
        return this.f4692b[(i5 * 5) + 1] & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m2430p(int[] iArr, int i5) {
        int i6 = i5 * 5;
        int i7 = iArr[i6 + 1];
        if ((536870912 & i7) == 0) {
            return null;
        }
        return this.f4694d[Integer.bitCount(i7 >> 30) + iArr[i6 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final int m2431q(int i5) {
        return this.f4692b[(i5 * 5) + 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m2432r(int i5) {
        if (!(this.f4701k == 0)) {
            AbstractC1387t.m2638a("Cannot reposition while in an empty region");
        }
        this.f4697g = i5;
        int[] iArr = this.f4692b;
        int i6 = this.f4693c;
        int i7 = i5 < i6 ? iArr[(i5 * 5) + 2] : -1;
        if (i7 != this.f4699i) {
            this.f4699i = i7;
            if (i7 < 0) {
                this.f4698h = i6;
            } else {
                this.f4698h = AbstractC1322K0.m2442a(iArr, i7) + i7;
            }
            this.f4702l = 0;
            this.f4703m = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m2433s() {
        if (!(this.f4701k == 0)) {
            AbstractC1387t.m2638a("Cannot skip while in an empty region");
        }
        int i5 = this.f4697g;
        int[] iArr = this.f4692b;
        int i6 = (iArr[(i5 * 5) + 1] & 1073741824) == 0 ? iArr[(i5 * 5) + 1] & 67108863 : 1;
        this.f4697g = AbstractC1322K0.m2442a(iArr, i5) + i5;
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m2434t() {
        if (!(this.f4701k == 0)) {
            AbstractC1387t.m2638a("Cannot skip the enclosing group while in an empty region");
        }
        this.f4697g = this.f4698h;
        this.f4702l = 0;
        this.f4703m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f4697g);
        sb.append(", key=");
        sb.append(m2421g());
        sb.append(", parent=");
        sb.append(this.f4699i);
        sb.append(", end=");
        return AbstractC3202a.m5466a(sb, this.f4698h, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m2435u() {
        if (this.f4701k <= 0) {
            int i5 = this.f4699i;
            int i6 = this.f4697g;
            int[] iArr = this.f4692b;
            if (!(iArr[(i6 * 5) + 2] == i5)) {
                AbstractC1380p0.m2542a("Invalid slot table detected");
            }
            int i7 = this.f4702l;
            int i8 = this.f4703m;
            C0619t c0619t = this.f4700j;
            if (i7 == 0 && i8 == 0) {
                c0619t.m1059c(-1);
            } else {
                c0619t.m1059c(i7);
            }
            this.f4699i = i6;
            this.f4698h = AbstractC1322K0.m2442a(iArr, i6) + i6;
            int i9 = i6 + 1;
            this.f4697g = i9;
            this.f4702l = AbstractC1322K0.m2444c(iArr, i6);
            this.f4703m = i6 >= this.f4693c - 1 ? this.f4695e : iArr[(i9 * 5) + 4];
        }
    }
}

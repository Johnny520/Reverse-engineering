package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class v11 {

    /* JADX INFO: renamed from: a */
    public final w11 f6374a;

    /* JADX INFO: renamed from: b */
    public final int[] f6375b;

    /* JADX INFO: renamed from: c */
    public final int f6376c;

    /* JADX INFO: renamed from: d */
    public Object[] f6377d;

    /* JADX INFO: renamed from: e */
    public final int f6378e;

    /* JADX INFO: renamed from: f */
    public boolean f6379f;

    /* JADX INFO: renamed from: g */
    public int f6380g;

    /* JADX INFO: renamed from: h */
    public int f6381h;

    /* JADX INFO: renamed from: i */
    public int f6382i;

    /* JADX INFO: renamed from: j */
    public final e30 f6383j;

    /* JADX INFO: renamed from: k */
    public int f6384k;

    /* JADX INFO: renamed from: l */
    public int f6385l;

    /* JADX INFO: renamed from: m */
    public int f6386m;

    /* JADX INFO: renamed from: n */
    public boolean f6387n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v11(w11 w11Var) {
        this.f6374a = w11Var;
        this.f6375b = w11Var.f6893d;
        int i = w11Var.f6894e;
        this.f6376c = i;
        this.f6377d = w11Var.f6895f;
        this.f6378e = w11Var.f6896g;
        this.f6381h = i;
        this.f6382i = -1;
        this.f6383j = new e30();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0788u2 m4365a(int i) {
        ArrayList arrayList = this.f6374a.f6901l;
        int iM5202d = y11.m5202d(arrayList, i, this.f6376c);
        if (iM5202d >= 0) {
            return (C0788u2) arrayList.get(iM5202d);
        }
        C0788u2 c0788u2 = new C0788u2(i);
        arrayList.add(-(iM5202d + 1), c0788u2);
        return c0788u2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m4366b(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.f6377d[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return C0320ii.f2572a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4367c() {
        this.f6379f = true;
        if (this.f6374a.f6897h <= 0) {
            AbstractC0653qi.m3252a("Unexpected reader close()");
        }
        r0.f6897h--;
        this.f6377d = new Object[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m4368d(int i) {
        return (this.f6375b[(i * 5) + 1] & 67108864) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4369e() {
        if (this.f6384k == 0) {
            if (this.f6380g != this.f6381h) {
                AbstractC0653qi.m3252a("endGroup() not called at the end of a group");
            }
            int i = (this.f6382i * 5) + 2;
            int[] iArr = this.f6375b;
            int i2 = iArr[i];
            this.f6382i = i2;
            int i3 = this.f6376c;
            this.f6381h = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int iM770b = this.f6383j.m770b();
            if (iM770b < 0) {
                this.f6385l = 0;
                this.f6386m = 0;
            } else {
                this.f6385l = iM770b;
                this.f6386m = i2 >= i3 + (-1) ? this.f6378e : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m4370f() {
        int i = this.f6380g;
        if (i < this.f6381h) {
            return m4366b(this.f6375b, i);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m4371g() {
        int i = this.f6380g;
        if (i >= this.f6381h) {
            return 0;
        }
        return this.f6375b[i * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m4372h(int i, int i2) {
        int[] iArr = this.f6375b;
        int iM5200b = y11.m5200b(iArr, i);
        int i3 = i + 1;
        int i4 = iM5200b + i2;
        return i4 < (i3 < this.f6376c ? iArr[(i3 * 5) + 4] : this.f6378e) ? this.f6377d[i4] : C0320ii.f2572a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m4373i(int i) {
        return this.f6375b[i * 5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4374j(int i) {
        return (this.f6375b[(i * 5) + 1] & 134217728) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m4375k(int i) {
        return (this.f6375b[(i * 5) + 1] & 536870912) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m4376l(int i) {
        return (this.f6375b[(i * 5) + 1] & 1073741824) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object m4377m() {
        int i;
        if (this.f6384k > 0 || (i = this.f6385l) >= this.f6386m) {
            this.f6387n = false;
            return C0320ii.f2572a;
        }
        this.f6387n = true;
        Object[] objArr = this.f6377d;
        this.f6385l = i + 1;
        return objArr[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m4378n(int i) {
        int i2 = i * 5;
        int[] iArr = this.f6375b;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.f6377d[iArr[i2 + 4]] : C0320ii.f2572a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m4379o(int i) {
        return this.f6375b[(i * 5) + 1] & 67108863;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m4380p(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.f6377d[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final int m4381q(int i) {
        return this.f6375b[(i * 5) + 2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m4382r(int i) {
        if (this.f6384k != 0) {
            AbstractC0653qi.m3252a("Cannot reposition while in an empty region");
        }
        this.f6380g = i;
        int[] iArr = this.f6375b;
        int i2 = this.f6376c;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.f6382i) {
            this.f6382i = i3;
            if (i3 < 0) {
                this.f6381h = i2;
            } else {
                this.f6381h = iArr[(i3 * 5) + 3] + i3;
            }
            this.f6385l = 0;
            this.f6386m = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m4383s() {
        if (this.f6384k != 0) {
            AbstractC0653qi.m3252a("Cannot skip while in an empty region");
        }
        int i = this.f6380g;
        int i2 = i * 5;
        int[] iArr = this.f6375b;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.f6380g = iArr[i2 + 3] + i;
        return i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m4384t() {
        if (!(this.f6384k == 0)) {
            AbstractC0653qi.m3252a("Cannot skip the enclosing group while in an empty region");
        }
        this.f6380g = this.f6381h;
        this.f6385l = 0;
        this.f6386m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SlotReader(current=" + this.f6380g + ", key=" + m4371g() + ", parent=" + this.f6382i + ", end=" + this.f6381h + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m4385u() {
        if (this.f6384k <= 0) {
            int i = this.f6382i;
            int i2 = this.f6380g;
            int i3 = i2 * 5;
            int[] iArr = this.f6375b;
            if (iArr[i3 + 2] != i) {
                wr0.m5024a("Invalid slot table detected");
            }
            int i4 = this.f6385l;
            int i5 = this.f6386m;
            e30 e30Var = this.f6383j;
            if (i4 == 0 && i5 == 0) {
                e30Var.m771c(-1);
            } else {
                e30Var.m771c(i4);
            }
            this.f6382i = i2;
            this.f6381h = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.f6380g = i6;
            this.f6385l = y11.m5200b(iArr, i2);
            this.f6386m = i2 >= this.f6376c + (-1) ? this.f6378e : iArr[(i6 * 5) + 4];
        }
    }
}

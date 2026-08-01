package p166l2;

import java.util.Arrays;
import p120i2.AbstractC3167a;

/* JADX INFO: renamed from: l2.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4605z {

    /* JADX INFO: renamed from: a */
    public int[] f13633a;

    /* JADX INFO: renamed from: b */
    public int f13634b;

    public C4605z(int i10) {
        this.f13633a = new int[i10];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18451a(int i10, int i11) {
        int[] iArr = this.f13633a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    /* JADX INFO: renamed from: b */
    public final int m18452b(int i10) {
        return this.f13633a[i10];
    }

    /* JADX INFO: renamed from: c */
    public final int m18453c() {
        return this.f13634b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18454d() {
        return this.f13634b != 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m18455e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (m18451a(i10, i11)) {
                i13 += i12;
                m18462l(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        m18462l(i14, i11);
        return i14;
    }

    /* JADX INFO: renamed from: f */
    public final int m18456f() {
        int[] iArr = this.f13633a;
        int i10 = this.f13634b - 1;
        this.f13634b = i10;
        return iArr[i10];
    }

    /* JADX INFO: renamed from: g */
    public final void m18457g(int i10, int i11, int i12) {
        int i13 = this.f13634b;
        int[] iArrM18460j = this.f13633a;
        int i14 = i13 + 3;
        if (i14 >= iArrM18460j.length) {
            iArrM18460j = m18460j(iArrM18460j);
        }
        iArrM18460j[i13] = i10 + i12;
        iArrM18460j[i13 + 1] = i11 + i12;
        iArrM18460j[i13 + 2] = i12;
        this.f13634b = i14;
    }

    /* JADX INFO: renamed from: h */
    public final void m18458h(int i10, int i11, int i12, int i13) {
        int i14 = this.f13634b;
        int[] iArrM18460j = this.f13633a;
        int i15 = i14 + 4;
        if (i15 >= iArrM18460j.length) {
            iArrM18460j = m18460j(iArrM18460j);
        }
        iArrM18460j[i14] = i10;
        iArrM18460j[i14 + 1] = i11;
        iArrM18460j[i14 + 2] = i12;
        iArrM18460j[i14 + 3] = i13;
        this.f13634b = i15;
    }

    /* JADX INFO: renamed from: i */
    public final void m18459i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iM18455e = m18455e(i10, i11, i12);
            m18459i(i10, iM18455e - i12, i12);
            m18459i(iM18455e + i12, i11, i12);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int[] m18460j(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        this.f13633a = iArrCopyOf;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: k */
    public final void m18461k() {
        int i10 = this.f13634b;
        if (!(i10 % 3 == 0)) {
            AbstractC3167a.m11956b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            m18459i(0, i10 - 3, 3);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m18462l(int i10, int i11) {
        int[] iArr = this.f13633a;
        AbstractC4527c1.m17571i(iArr, i10, i11);
        AbstractC4527c1.m17571i(iArr, i10 + 1, i11 + 1);
        AbstractC4527c1.m17571i(iArr, i10 + 2, i11 + 2);
    }
}

package androidx.compose.runtime;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.compose.runtime.n1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0546n1 {

    /* JADX INFO: renamed from: a */
    public int[] f1499a = new int[10];

    /* JADX INFO: renamed from: b */
    public int f1500b;

    /* JADX INFO: renamed from: a */
    public final void m1933a() {
        this.f1500b = 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m1934b(int i10) {
        int[] iArr = this.f1499a;
        int iMin = Math.min(iArr.length, this.f1500b);
        for (int i11 = 0; i11 < iMin; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public final int m1935c() {
        return this.f1499a[this.f1500b - 1];
    }

    /* JADX INFO: renamed from: d */
    public final int m1936d(int i10) {
        return this.f1499a[i10];
    }

    /* JADX INFO: renamed from: e */
    public final int m1937e() {
        return this.f1499a[this.f1500b - 2];
    }

    /* JADX INFO: renamed from: f */
    public final int m1938f(int i10) {
        int i11 = this.f1500b - 1;
        return i11 >= 0 ? this.f1499a[i11] : i10;
    }

    /* JADX INFO: renamed from: g */
    public final int m1939g() {
        int[] iArr = this.f1499a;
        int i10 = this.f1500b - 1;
        this.f1500b = i10;
        return iArr[i10];
    }

    /* JADX INFO: renamed from: h */
    public final void m1940h(int i10) {
        int[] iArrM1941i = this.f1499a;
        if (this.f1500b >= iArrM1941i.length) {
            iArrM1941i = m1941i();
        }
        int i11 = this.f1500b;
        this.f1500b = i11 + 1;
        iArrM1941i[i11] = i10;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m1941i() {
        int[] iArr = this.f1499a;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
        this.f1499a = iArrCopyOf;
        return iArrCopyOf;
    }
}

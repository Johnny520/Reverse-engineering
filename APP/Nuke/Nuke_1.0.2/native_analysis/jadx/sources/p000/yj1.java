package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yj1 {

    /* JADX INFO: renamed from: a */
    public int[] f13490a;

    /* JADX INFO: renamed from: b */
    public int f13491b;

    public yj1(int i) {
        this.f13490a = i == 0 ? g11.f3247a : new int[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m6281a(int i) {
        m6282b(this.f13491b + 1);
        int[] iArr = this.f13490a;
        int i2 = this.f13491b;
        iArr[i2] = i;
        this.f13491b = i2 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m6282b(int i) {
        int[] iArr = this.f13490a;
        if (iArr.length < i) {
            this.f13490a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m6283c(int i) {
        if (i >= 0 && i < this.f13491b) {
            return this.f13490a[i];
        }
        C0676s.m4646d("Index must be between 0 and size");
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m6284d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f13491b)) {
            C0676s.m4646d("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f13490a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC0460mg.m3086a0(iArr, iArr, i, i + 1, i2);
        }
        this.f13491b--;
    }

    /* JADX INFO: renamed from: e */
    public final void m6285e(int i, int i2) {
        if (i < 0 || i >= this.f13491b) {
            C0676s.m4646d("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f13490a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yj1) {
            yj1 yj1Var = (yj1) obj;
            int i = yj1Var.f13491b;
            int i2 = this.f13491b;
            if (i == i2) {
                int[] iArr = this.f13490a;
                int[] iArr2 = yj1Var.f13490a;
                c11 c11VarM799X = ci0.m799X(0, i2);
                int i3 = c11VarM799X.f25h;
                int i4 = c11VarM799X.f26i;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f13490a;
        int i = this.f13491b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f13490a;
        int i = this.f13491b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ yj1() {
        this(16);
    }
}

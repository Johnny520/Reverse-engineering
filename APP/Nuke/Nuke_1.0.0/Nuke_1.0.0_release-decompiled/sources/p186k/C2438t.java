package p186k;

import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2438t {

    /* JADX INFO: renamed from: a */
    public int[] f7877a;

    /* JADX INFO: renamed from: b */
    public int f7878b;

    public C2438t(int i5) {
        this.f7877a = i5 == 0 ? AbstractC2430l.f7851a : new int[i5];
    }

    /* JADX INFO: renamed from: a */
    public final void m4334a(int i5) {
        m4335b(this.f7878b + 1);
        int[] iArr = this.f7877a;
        int i6 = this.f7878b;
        iArr[i6] = i5;
        this.f7878b = i6 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m4335b(int i5) {
        int[] iArr = this.f7877a;
        if (iArr.length < i5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i5, (iArr.length * 3) / 2));
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f7877a = iArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4336c(int i5) {
        if (i5 >= 0 && i5 < this.f7878b) {
            return this.f7877a[i5];
        }
        AbstractC2477a.m4423d("Index must be between 0 and size");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m4337d(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f7878b)) {
            AbstractC2477a.m4423d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f7877a;
        int i7 = iArr[i5];
        if (i5 != i6 - 1) {
            AbstractC0972l.m1991O(iArr, iArr, i5, i5 + 1, i6);
        }
        this.f7878b--;
    }

    /* JADX INFO: renamed from: e */
    public final void m4338e(int i5, int i6) {
        if (i5 < 0 || i5 >= this.f7878b) {
            AbstractC2477a.m4423d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f7877a;
        int i7 = iArr[i5];
        iArr[i5] = i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2438t) {
            C2438t c2438t = (C2438t) obj;
            int i5 = c2438t.f7878b;
            int i6 = this.f7878b;
            if (i5 == i6) {
                int[] iArr = this.f7877a;
                int[] iArr2 = c2438t.f7877a;
                C1804d c1804dM3557J = AbstractC1926h.m3557J(0, i6);
                int i7 = c1804dM3557J.f6140d;
                int i8 = c1804dM3557J.f6141e;
                if (i7 > i8) {
                    return true;
                }
                while (iArr[i7] == iArr2[i7]) {
                    if (i7 == i8) {
                        return true;
                    }
                    i7++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f7877a;
        int i5 = this.f7878b;
        int iHashCode = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode += Integer.hashCode(iArr[i6]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f7877a;
        int i5 = this.f7878b;
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                sb.append((CharSequence) "]");
                break;
            }
            int i7 = iArr[i6];
            if (i6 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i6 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i7);
            i6++;
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C2438t() {
        this(16);
    }
}

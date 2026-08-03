package p069f;

import java.util.Arrays;
import okio.C3193a;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964v {

    /* JADX INFO: renamed from: a */
    public int[] f3035a;

    /* JADX INFO: renamed from: b */
    public int f3036b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0964v(int i9) {
        this.f3035a = i9 == 0 ? AbstractC0946m.f2980a : new int[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2369a(int i9) {
        m2370b(this.f3036b + 1);
        int[] iArr = this.f3035a;
        int i10 = this.f3036b;
        iArr[i10] = i9;
        this.f3036b = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2370b(int i9) {
        int[] iArr = this.f3035a;
        if (iArr.length < i9) {
            this.f3035a = Arrays.copyOf(iArr, Math.max(i9, (iArr.length * 3) / 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m2371c(int i9) {
        if (i9 >= 0 && i9 < this.f3036b) {
            return this.f3035a[i9];
        }
        C3193a.m6820i("Index must be between 0 and size");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2372d(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.f3036b)) {
            C3193a.m6820i("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f3035a;
        int i11 = iArr[i9];
        if (i9 != i10 - 1) {
            AbstractC4165l.m8381p0(iArr, iArr, i9, i9 + 1, i10);
        }
        this.f3036b--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2373e(int i9, int i10) {
        if (i9 < 0 || i9 >= this.f3036b) {
            C3193a.m6820i("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f3035a;
        int i11 = iArr[i9];
        iArr[i9] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0964v) {
            C0964v c0964v = (C0964v) obj;
            int i9 = c0964v.f3036b;
            int i10 = this.f3036b;
            if (i9 == i10) {
                int[] iArr = this.f3035a;
                int[] iArr2 = c0964v.f3035a;
                C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, i10);
                int i11 = c2564dM7910r0.f8312g;
                int i12 = c2564dM7910r0.f8313h;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f3035a;
        int i9 = this.f3036b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode += Integer.hashCode(iArr[i10]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f3035a;
        int i9 = this.f3036b;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:14) call: f.v.<init>(int):void type: THIS */
    public /* synthetic */ C0964v() {
        this(16);
    }
}

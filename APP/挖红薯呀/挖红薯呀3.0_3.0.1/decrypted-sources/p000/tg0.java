package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class tg0 {

    /* JADX INFO: renamed from: a */
    public int[] f6000a;

    /* JADX INFO: renamed from: b */
    public int f6001b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tg0(int i) {
        this.f6000a = i == 0 ? c30.f649a : new int[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4198a(int i) {
        int i2 = this.f6001b + 1;
        int[] iArr = this.f6000a;
        if (iArr.length < i2) {
            this.f6000a = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.f6000a;
        int i3 = this.f6001b;
        iArr2[i3] = i;
        this.f6001b = i3 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m4199b(int i) {
        if (i >= 0 && i < this.f6001b) {
            return this.f6000a[i];
        }
        C0921xc.m5125f("Index must be between 0 and size");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4200c(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f6001b)) {
            C0921xc.m5125f("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f6000a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            AbstractC0201f9.m1055a0(iArr, iArr, i, i + 1, i2);
        }
        this.f6001b--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4201d(int i, int i2) {
        if (i < 0 || i >= this.f6001b) {
            C0921xc.m5125f("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.f6000a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof tg0) {
            tg0 tg0Var = (tg0) obj;
            int i = tg0Var.f6001b;
            int i2 = this.f6001b;
            if (i == i2) {
                int[] iArr = this.f6000a;
                int[] iArr2 = tg0Var.f6000a;
                z20 z20VarM4893O = w60.m4893O(0, i2);
                int i3 = z20VarM4893O.f7248d;
                int i4 = z20VarM4893O.f7249e;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f6000a;
        int i = this.f6001b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.f6000a;
        int i = this.f6001b;
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:14) call: tg0.<init>(int):void type: THIS */
    public /* synthetic */ tg0() {
        this(16);
    }
}

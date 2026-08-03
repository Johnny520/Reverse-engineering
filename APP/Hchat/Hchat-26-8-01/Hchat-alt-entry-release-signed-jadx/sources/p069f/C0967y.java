package p069f;

import java.util.Arrays;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: f.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967y {

    /* JADX INFO: renamed from: a */
    public long[] f3043a;

    /* JADX INFO: renamed from: b */
    public int f3044b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0967y(int i9) {
        this.f3043a = i9 == 0 ? AbstractC0950o.f2996a : new long[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2386a(long j3) {
        int i9 = this.f3044b + 1;
        long[] jArr = this.f3043a;
        if (jArr.length < i9) {
            this.f3043a = Arrays.copyOf(jArr, Math.max(i9, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.f3043a;
        int i10 = this.f3044b;
        jArr2[i10] = j3;
        this.f3044b = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0967y) {
            C0967y c0967y = (C0967y) obj;
            int i9 = c0967y.f3044b;
            int i10 = this.f3044b;
            if (i9 == i10) {
                long[] jArr = this.f3043a;
                long[] jArr2 = c0967y.f3043a;
                C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, i10);
                int i11 = c2564dM7910r0.f8312g;
                int i12 = c2564dM7910r0.f8313h;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
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
        long[] jArr = this.f3043a;
        int i9 = this.f3044b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode += Long.hashCode(jArr[i10]) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f3043a;
        int i9 = this.f3044b;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j3 = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j3);
            i10++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:14) call: f.y.<init>(int):void type: THIS */
    public /* synthetic */ C0967y() {
        this(16);
    }
}

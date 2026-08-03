package p092g4;

import java.util.Arrays;
import p326w4.C4682b;

/* JADX INFO: renamed from: g4.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1351k {

    /* JADX INFO: renamed from: a */
    public final C1350j[] f4482a;

    /* JADX INFO: renamed from: b */
    public final C4682b f4483b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1351k(C1350j[] c1350jArr) {
        this.f4482a = (C1350j[]) c1350jArr.clone();
        this.f4483b = new C4682b(c1350jArr.length);
        for (int i9 = 0; i9 < c1350jArr.length; i9++) {
            this.f4483b.m10841m(i9, c1350jArr[i9].f4480b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1351k) && Arrays.equals(((C1351k) obj).f4482a, this.f4482a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.f4482a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            C1350j[] c1350jArr = this.f4482a;
            if (i9 >= c1350jArr.length) {
                return sb2.toString();
            }
            if (i9 > 0) {
                sb2.append(", ");
            }
            sb2.append(c1350jArr[i9]);
            i9++;
        }
    }
}

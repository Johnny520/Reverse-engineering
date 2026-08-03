package p002c;

import java.util.Arrays;
import p011l.C0194b;

/* JADX INFO: renamed from: c.k */
/* JADX INFO: loaded from: classes.dex */
final class C0014k {

    /* JADX INFO: renamed from: a */
    final C0013j[] f55a;

    /* JADX INFO: renamed from: b */
    final C0194b f56b;

    C0014k(C0013j[] c0013jArr) {
        this.f55a = (C0013j[]) c0013jArr.clone();
        this.f56b = new C0194b(c0013jArr.length);
        for (int i2 = 0; i2 < c0013jArr.length; i2++) {
            this.f56b.m523z(i2, c0013jArr[i2].f53b);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0014k) && Arrays.equals(((C0014k) obj).f55a, this.f55a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            C0013j[] c0013jArr = this.f55a;
            if (i2 >= c0013jArr.length) {
                return sb.toString();
            }
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c0013jArr[i2]);
            i2++;
        }
    }
}

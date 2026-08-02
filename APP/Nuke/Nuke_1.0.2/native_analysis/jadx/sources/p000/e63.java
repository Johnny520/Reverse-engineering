package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e63 {

    /* JADX INFO: renamed from: a */
    public final a63[] f2329a;

    /* JADX INFO: renamed from: b */
    public final wu2 f2330b;

    public e63(a63[] a63VarArr) {
        this.f2329a = (a63[]) a63VarArr.clone();
        this.f2330b = new wu2(a63VarArr.length);
        for (int i = 0; i < a63VarArr.length; i++) {
            this.f2330b.m2694f(i, a63VarArr[i].f96b);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e63) && Arrays.equals(((e63) obj).f2329a, this.f2329a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2329a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            a63[] a63VarArr = this.f2329a;
            if (i >= a63VarArr.length) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a63VarArr[i]);
            i++;
        }
    }
}

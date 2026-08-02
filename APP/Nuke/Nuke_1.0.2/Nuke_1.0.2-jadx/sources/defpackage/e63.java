package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e63 {
    public final a63[] a;
    public final wu2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e63(a63[] a63VarArr) {
        this.a = (a63[]) a63VarArr.clone();
        this.b = new wu2(a63VarArr.length);
        for (int i = 0; i < a63VarArr.length; i++) {
            this.b.f(i, a63VarArr[i].b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof e63) && Arrays.equals(((e63) obj).a, this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            a63[] a63VarArr = this.a;
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

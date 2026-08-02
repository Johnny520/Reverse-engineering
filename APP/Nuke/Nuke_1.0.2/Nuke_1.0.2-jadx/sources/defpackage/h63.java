package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h63 {
    public final bt a;
    public final List b;
    public final int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h63(bt btVar, List list, boolean z) {
        list.getClass();
        this.a = btVar;
        this.b = list;
        this.c = z ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return this.a.equals(h63Var.a) && t11.l(this.b, h63Var.b) && this.c == h63Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        Class clsY = p40.y(this.a);
        return ((clsY.isArray() ? clsY.equals(boolean[].class) ? "kotlin.BooleanArray" : clsY.equals(char[].class) ? "kotlin.CharArray" : clsY.equals(byte[].class) ? "kotlin.ByteArray" : clsY.equals(short[].class) ? "kotlin.ShortArray" : clsY.equals(int[].class) ? "kotlin.IntArray" : clsY.equals(float[].class) ? "kotlin.FloatArray" : clsY.equals(long[].class) ? "kotlin.LongArray" : clsY.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : clsY.getName()) + (this.b.isEmpty() ? "" : du.u0(this.b, ", ", "<", ">", new kx2(this), 24)) + ((this.c & 1) != 0 ? "?" : "")).concat(" (Kotlin reflection is not available)");
    }
}

package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h63 {

    /* JADX INFO: renamed from: a */
    public final C0067bt f3840a;

    /* JADX INFO: renamed from: b */
    public final List f3841b;

    /* JADX INFO: renamed from: c */
    public final int f3842c;

    public h63(C0067bt c0067bt, List list, boolean z) {
        list.getClass();
        this.f3840a = c0067bt;
        this.f3841b = list;
        this.f3842c = z ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h63)) {
            return false;
        }
        h63 h63Var = (h63) obj;
        return this.f3840a.equals(h63Var.f3840a) && t11.m5086l(this.f3841b, h63Var.f3841b) && this.f3842c == h63Var.f3842c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3842c) + ((this.f3841b.hashCode() + (this.f3840a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Class clsM3741y = p40.m3741y(this.f3840a);
        return ((clsM3741y.isArray() ? clsM3741y.equals(boolean[].class) ? "kotlin.BooleanArray" : clsM3741y.equals(char[].class) ? "kotlin.CharArray" : clsM3741y.equals(byte[].class) ? "kotlin.ByteArray" : clsM3741y.equals(short[].class) ? "kotlin.ShortArray" : clsM3741y.equals(int[].class) ? "kotlin.IntArray" : clsM3741y.equals(float[].class) ? "kotlin.FloatArray" : clsM3741y.equals(long[].class) ? "kotlin.LongArray" : clsM3741y.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array" : clsM3741y.getName()) + (this.f3841b.isEmpty() ? "" : AbstractC0142du.m1165u0(this.f3841b, ", ", "<", ">", new kx2(this), 24)) + ((this.f3842c & 1) != 0 ? "?" : "")).concat(" (Kotlin reflection is not available)");
    }
}

package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pu0 {

    /* JADX INFO: renamed from: a */
    public final Object[] f8613a;

    /* JADX INFO: renamed from: b */
    public final int f8614b;

    public pu0(int i, Object[] objArr) {
        this.f8613a = objArr;
        this.f8614b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu0)) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        return this.f8613a.equals(pu0Var.f8613a) && this.f8614b == pu0Var.f8614b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8614b) + (Arrays.hashCode(this.f8613a) * 31);
    }

    public final String toString() {
        return "ConvertedArguments(arguments=" + Arrays.toString(this.f8613a) + ", score=" + this.f8614b + ")";
    }
}

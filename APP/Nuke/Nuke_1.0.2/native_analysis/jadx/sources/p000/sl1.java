package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 {

    /* JADX INFO: renamed from: a */
    public final ql1 f10186a;

    /* JADX INFO: renamed from: b */
    public final byte[] f10187b;

    public sl1(ql1 ql1Var, byte[] bArr) {
        this.f10186a = ql1Var;
        this.f10187b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sl1) {
            sl1 sl1Var = (sl1) obj;
            if (this.f10186a == sl1Var.f10186a && this.f10187b.equals(sl1Var.f10187b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10187b) + (this.f10186a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivationCandidate(runtime=" + this.f10186a + ", token=" + Arrays.toString(this.f10187b) + ")";
    }
}

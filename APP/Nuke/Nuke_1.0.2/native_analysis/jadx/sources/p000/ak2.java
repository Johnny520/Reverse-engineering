package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ak2 {

    /* JADX INFO: renamed from: a */
    public final long f238a;

    /* JADX INFO: renamed from: b */
    public final yf2 f239b;

    public ak2(long j, yf2 yf2Var) {
        this.f238a = j;
        this.f239b = yf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak2)) {
            return false;
        }
        ak2 ak2Var = (ak2) obj;
        return this.f238a == ak2Var.f238a && this.f239b.equals(ak2Var.f239b);
    }

    public final int hashCode() {
        return this.f239b.hashCode() + (Long.hashCode(this.f238a) * 31);
    }

    public final String toString() {
        return "ScriptSentMessage(id=null, timestamp=" + this.f238a + ", conversation=" + this.f239b + ")";
    }
}

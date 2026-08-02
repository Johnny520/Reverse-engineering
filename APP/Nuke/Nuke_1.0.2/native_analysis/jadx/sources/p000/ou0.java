package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ou0 {

    /* JADX INFO: renamed from: a */
    public final Object f7846a;

    /* JADX INFO: renamed from: b */
    public final int f7847b;

    public ou0(int i, Object obj) {
        this.f7846a = obj;
        this.f7847b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou0)) {
            return false;
        }
        ou0 ou0Var = (ou0) obj;
        return t11.m5086l(this.f7846a, ou0Var.f7846a) && this.f7847b == ou0Var.f7847b;
    }

    public final int hashCode() {
        Object obj = this.f7846a;
        return Integer.hashCode(this.f7847b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "ConvertedArgument(value=" + this.f7846a + ", score=" + this.f7847b + ")";
    }
}

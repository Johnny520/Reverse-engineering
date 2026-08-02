package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tx0 {

    /* JADX INFO: renamed from: a */
    public final sx0 f10991a;

    /* JADX INFO: renamed from: b */
    public final int f10992b;

    public tx0(sx0 sx0Var, int i) {
        this.f10991a = sx0Var;
        this.f10992b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx0)) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return this.f10991a.equals(tx0Var.f10991a) && this.f10992b == tx0Var.f10992b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10992b) + (this.f10991a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f10991a);
        sb.append(", configFlags=");
        return vi0.m5694m(sb, this.f10992b, ')');
    }
}

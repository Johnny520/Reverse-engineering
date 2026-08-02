package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 {

    /* JADX INFO: renamed from: a */
    public final C0878x9 f10386a;

    /* JADX INFO: renamed from: b */
    public final int f10387b;

    /* JADX INFO: renamed from: c */
    public final int f10388c;

    public sw1(C0878x9 c0878x9, int i, int i2) {
        this.f10386a = c0878x9;
        this.f10387b = i;
        this.f10388c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sw1) {
            sw1 sw1Var = (sw1) obj;
            if (this.f10386a == sw1Var.f10386a && this.f10387b == sw1Var.f10387b && this.f10388c == sw1Var.f10388c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10388c) + vi0.m5685d(this.f10387b, this.f10386a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f10386a);
        sb.append(", startIndex=");
        sb.append(this.f10387b);
        sb.append(", endIndex=");
        return vi0.m5694m(sb, this.f10388c, ')');
    }
}

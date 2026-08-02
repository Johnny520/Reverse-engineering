package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bo0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f956a = 0;

    /* JADX INFO: renamed from: b */
    public int f957b;

    /* JADX INFO: renamed from: c */
    public int f958c;

    /* JADX INFO: renamed from: d */
    public int f959d;

    /* JADX INFO: renamed from: e */
    public Object f960e;

    public bo0(int i, int i2, int i3, y03 y03Var) {
        this.f957b = i;
        this.f958c = i2;
        this.f959d = i3;
        this.f960e = y03Var;
    }

    /* JADX INFO: renamed from: a */
    public sm2 m576a(int i) {
        return new sm2(ci0.m787L((y03) this.f960e, i), i, 1L);
    }

    /* JADX INFO: renamed from: b */
    public int m577b() {
        return this.f959d - this.f958c;
    }

    /* JADX INFO: renamed from: c */
    public int m578c(int i) {
        return ((kv1) this.f960e).f5827o[this.f958c + i];
    }

    /* JADX INFO: renamed from: d */
    public Object m579d(int i) {
        return ((kv1) this.f960e).f5829q[this.f959d + i];
    }

    public String toString() {
        switch (this.f956a) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f957b;
                sb.append(i);
                sb.append('-');
                y03 y03Var = (y03) this.f960e;
                sb.append(ci0.m787L(y03Var, i));
                sb.append(',');
                int i2 = this.f958c;
                sb.append(i2);
                sb.append('-');
                sb.append(ci0.m787L(y03Var, i2));
                sb.append("), prevOffset=");
                return vi0.m5694m(sb, this.f959d, ')');
        }
    }

    public bo0(kv1 kv1Var) {
        this.f960e = kv1Var;
    }

    public /* synthetic */ bo0() {
    }
}

package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g30 extends i30 {

    /* JADX INFO: renamed from: i */
    public static final g30[] f3293i = new g30[511];

    /* JADX INFO: renamed from: j */
    public static final g30 f3294j;

    static {
        m1791j(-1);
        f3294j = m1791j(0);
        m1791j(1);
        m1791j(2);
        m1791j(3);
        m1791j(4);
        m1791j(5);
    }

    /* JADX INFO: renamed from: j */
    public static g30 m1791j(int i) {
        g30[] g30VarArr = f3293i;
        int length = (Integer.MAX_VALUE & i) % g30VarArr.length;
        g30 g30Var = g30VarArr[length];
        if (g30Var != null && g30Var.f4250h == i) {
            return g30Var;
        }
        g30 g30Var2 = new g30(i);
        g30VarArr[length] = g30Var2;
        return g30Var2;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7513s;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return Integer.toString(this.f4250h);
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "int";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("int{0x");
        int i = this.f4250h;
        sb.append(pp0.m3899K(i));
        sb.append(" / ");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}

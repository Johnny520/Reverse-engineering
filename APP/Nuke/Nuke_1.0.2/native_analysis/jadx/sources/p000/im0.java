package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class im0 implements Comparable {

    /* JADX INFO: renamed from: i */
    public static final im0 f4679i;

    /* JADX INFO: renamed from: j */
    public static final im0 f4680j;

    /* JADX INFO: renamed from: k */
    public static final im0 f4681k;

    /* JADX INFO: renamed from: l */
    public static final im0 f4682l;

    /* JADX INFO: renamed from: m */
    public static final im0 f4683m;

    /* JADX INFO: renamed from: h */
    public final int f4684h;

    static {
        im0 im0Var = new im0(100);
        im0 im0Var2 = new im0(200);
        im0 im0Var3 = new im0(300);
        im0 im0Var4 = new im0(400);
        im0 im0Var5 = new im0(500);
        im0 im0Var6 = new im0(600);
        f4679i = im0Var6;
        im0 im0Var7 = new im0(700);
        im0 im0Var8 = new im0(800);
        im0 im0Var9 = new im0(900);
        f4680j = im0Var4;
        f4681k = im0Var5;
        f4682l = im0Var6;
        f4683m = im0Var7;
        AbstractC0179eu.m1435P(im0Var, im0Var2, im0Var3, im0Var4, im0Var5, im0Var6, im0Var7, im0Var8, im0Var9);
    }

    public im0(int i) {
        this.f4684h = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        lz0.m2988a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return t11.m5089o(this.f4684h, ((im0) obj).f4684h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof im0) {
            return this.f4684h == ((im0) obj).f4684h;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4684h;
    }

    public final String toString() {
        return vi0.m5694m(new StringBuilder("FontWeight(weight="), this.f4684h, ')');
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class im0 implements Comparable {
    public static final im0 i;
    public static final im0 j;
    public static final im0 k;
    public static final im0 l;
    public static final im0 m;
    public final int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        im0 im0Var = new im0(100);
        im0 im0Var2 = new im0(200);
        im0 im0Var3 = new im0(300);
        im0 im0Var4 = new im0(400);
        im0 im0Var5 = new im0(500);
        im0 im0Var6 = new im0(600);
        i = im0Var6;
        im0 im0Var7 = new im0(700);
        im0 im0Var8 = new im0(800);
        im0 im0Var9 = new im0(900);
        j = im0Var4;
        k = im0Var5;
        l = im0Var6;
        m = im0Var7;
        eu.P(im0Var, im0Var2, im0Var3, im0Var4, im0Var5, im0Var6, im0Var7, im0Var8, im0Var9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public im0(int i2) {
        this.h = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        lz0.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return t11.o(this.h, ((im0) obj).h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof im0) {
            return this.h == ((im0) obj).h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return vi0.m(new StringBuilder("FontWeight(weight="), this.h, ')');
    }
}

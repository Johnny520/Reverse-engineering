package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class gw1 extends yh1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gw1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            iz0.a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        gw1 gw1Var = obj instanceof gw1 ? (gw1) obj : null;
        return gw1Var != null && za0.b(this.a, gw1Var.a) && za0.b(this.b, gw1Var.b) && za0.b(this.c, gw1Var.c) && za0.b(this.d, gw1Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        hw1 hw1Var = new hw1();
        hw1Var.v = this.a;
        hw1Var.w = this.b;
        hw1Var.x = this.c;
        hw1Var.y = this.d;
        hw1Var.z = true;
        return hw1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        hw1 hw1Var = (hw1) th1Var;
        hw1Var.v = this.a;
        hw1Var.w = this.b;
        hw1Var.x = this.c;
        hw1Var.y = this.d;
        hw1Var.z = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.c(this.d, vi0.c(this.c, vi0.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}

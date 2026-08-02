package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public mm2 f;
    public mm2 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mm2(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mm2 a() {
        mm2 mm2Var = this.f;
        if (mm2Var == this) {
            mm2Var = null;
        }
        mm2 mm2Var2 = this.g;
        mm2Var2.getClass();
        mm2Var2.f = this.f;
        mm2 mm2Var3 = this.f;
        mm2Var3.getClass();
        mm2Var3.g = this.g;
        this.f = null;
        this.g = null;
        return mm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(mm2 mm2Var) {
        mm2Var.getClass();
        mm2Var.g = this;
        mm2Var.f = this.f;
        mm2 mm2Var2 = this.f;
        mm2Var2.getClass();
        mm2Var2.g = mm2Var;
        this.f = mm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mm2 c() {
        this.d = true;
        return new mm2(this.a, this.b, this.c, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(mm2 mm2Var, int i) {
        mm2Var.getClass();
        if (!mm2Var.e) {
            s.l("only owner can write");
            return;
        }
        int i2 = mm2Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (mm2Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = mm2Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = mm2Var.a;
            mg.d0(bArr, bArr, 0, i4, i2, 2);
            mm2Var.c -= mm2Var.b;
            mm2Var.b = 0;
        }
        byte[] bArr2 = mm2Var.a;
        int i5 = mm2Var.c;
        int i6 = this.b;
        mg.Z(this.a, bArr2, i5, i6, i6 + i);
        mm2Var.c += i;
        this.b += i;
    }

    public mm2() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}

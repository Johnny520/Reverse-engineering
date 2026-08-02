package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class iv2 extends xs1 {
    public final q30 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iv2(q30 q30Var) {
        super(1, pp0.M(q30Var.h.length()) + q30Var.i.i + 1);
        this.l = q30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_STRING_DATA_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final int e(xs1 xs1Var) {
        return this.l.compareTo(((iv2) xs1Var).l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xs1
    public final void k(z70 z70Var, yn ynVar) {
        q30 q30Var = this.l;
        dk dkVar = q30Var.i;
        int length = q30Var.h.length();
        if (ynVar.d()) {
            ynVar.c("utf16_size: ".concat(pp0.K(length)), pp0.M(length));
            ynVar.c(q30Var.g(), dkVar.i + 1);
        }
        ynVar.m(length);
        int i = dkVar.i;
        int i2 = ynVar.c;
        int i3 = i + i2;
        if (ynVar.a) {
            ynVar.f(i3);
        } else if (i3 > ynVar.b.length) {
            yn.g();
            throw null;
        }
        byte[] bArr = ynVar.b;
        int length2 = bArr.length - i2;
        int i4 = dkVar.i;
        if (length2 < i4) {
            s.d("(out.length - offset) < size()");
            return;
        }
        System.arraycopy((byte[]) dkVar.j, 0, bArr, i2, i4);
        ynVar.c = i3;
        ynVar.i(0);
    }

    @Override // defpackage.f21
    public final void a(z70 z70Var) {
    }
}

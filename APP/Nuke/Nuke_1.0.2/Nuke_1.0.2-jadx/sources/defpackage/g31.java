package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 extends rp0 {
    public final qb2 r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g31(qb2 qb2Var, u21 u21Var) {
        u21Var.getClass();
        this.r = qb2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final long d() {
        qb2 qb2Var = this.r;
        String strK = qb2Var.k();
        try {
            strK.getClass();
            i73 i73VarC = rd3.c(strK);
            if (i73VarC != null) {
                return i73VarC.h;
            }
            wv2.Y(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'ULong' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vx
    public final int j(yo2 yo2Var) {
        yo2Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final int o() {
        qb2 qb2Var = this.r;
        String strK = qb2Var.k();
        try {
            strK.getClass();
            d73 d73VarB = rd3.b(strK);
            if (d73VarB != null) {
                return d73VarB.h;
            }
            wv2.Y(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'UInt' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final byte r() {
        s63 s63Var;
        qb2 qb2Var = this.r;
        String strK = qb2Var.k();
        try {
            strK.getClass();
            d73 d73VarB = rd3.b(strK);
            if (d73VarB != null) {
                int i = d73VarB.h;
                s63Var = Integer.compareUnsigned(i, 255) > 0 ? null : new s63((byte) i);
            }
            if (s63Var != null) {
                return s63Var.h;
            }
            wv2.Y(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'UByte' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rp0, defpackage.y40
    public final short v() {
        n73 n73Var;
        qb2 qb2Var = this.r;
        String strK = qb2Var.k();
        try {
            strK.getClass();
            d73 d73VarB = rd3.b(strK);
            if (d73VarB != null) {
                int i = d73VarB.h;
                n73Var = Integer.compareUnsigned(i, 65535) > 0 ? null : new n73((short) i);
            }
            if (n73Var != null) {
                return n73Var.h;
            }
            wv2.Y(strK);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m(qb2Var, "Failed to parse type 'UShort' for input '" + strK + '\'', 0, 6);
            throw null;
        }
    }
}

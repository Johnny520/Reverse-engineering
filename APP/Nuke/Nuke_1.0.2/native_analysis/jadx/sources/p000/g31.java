package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class g31 extends rp0 {

    /* JADX INFO: renamed from: r */
    public final qb2 f3295r;

    public g31(qb2 qb2Var, u21 u21Var) {
        u21Var.getClass();
        this.f3295r = qb2Var;
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: d */
    public final long mo897d() {
        qb2 qb2Var = this.f3295r;
        String strM4124k = qb2Var.m4124k();
        try {
            strM4124k.getClass();
            i73 i73VarM4436c = rd3.m4436c(strM4124k);
            if (i73VarM4436c != null) {
                return i73VarM4436c.f4479h;
            }
            wv2.m6007Y(strM4124k);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'ULong' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.InterfaceC0826vx
    /* JADX INFO: renamed from: j */
    public final int mo901j(yo2 yo2Var) {
        yo2Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: o */
    public final int mo902o() {
        qb2 qb2Var = this.f3295r;
        String strM4124k = qb2Var.m4124k();
        try {
            strM4124k.getClass();
            d73 d73VarM4435b = rd3.m4435b(strM4124k);
            if (d73VarM4435b != null) {
                return d73VarM4435b.f1902h;
            }
            wv2.m6007Y(strM4124k);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'UInt' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: r */
    public final byte mo903r() {
        s63 s63Var;
        qb2 qb2Var = this.f3295r;
        String strM4124k = qb2Var.m4124k();
        try {
            strM4124k.getClass();
            d73 d73VarM4435b = rd3.m4435b(strM4124k);
            if (d73VarM4435b != null) {
                int i = d73VarM4435b.f1902h;
                s63Var = Integer.compareUnsigned(i, 255) > 0 ? null : new s63((byte) i);
            }
            if (s63Var != null) {
                return s63Var.f9948h;
            }
            wv2.m6007Y(strM4124k);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'UByte' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }

    @Override // p000.rp0, p000.y40
    /* JADX INFO: renamed from: v */
    public final short mo908v() {
        n73 n73Var;
        qb2 qb2Var = this.f3295r;
        String strM4124k = qb2Var.m4124k();
        try {
            strM4124k.getClass();
            d73 d73VarM4435b = rd3.m4435b(strM4124k);
            if (d73VarM4435b != null) {
                int i = d73VarM4435b.f1902h;
                n73Var = Integer.compareUnsigned(i, 65535) > 0 ? null : new n73((short) i);
            }
            if (n73Var != null) {
                return n73Var.f7040h;
            }
            wv2.m6007Y(strM4124k);
            throw null;
        } catch (IllegalArgumentException unused) {
            qb2.m4114m(qb2Var, "Failed to parse type 'UShort' for input '" + strM4124k + '\'', 0, 6);
            throw null;
        }
    }
}

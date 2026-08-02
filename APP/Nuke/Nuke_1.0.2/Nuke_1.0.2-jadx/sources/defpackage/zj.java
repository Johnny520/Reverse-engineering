package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zj {
    public final int a;
    public final j01 b;
    public final v01 c;
    public final int d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zj(int i, j01 j01Var, v01 v01Var, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            s.j("label < 0");
            throw null;
        }
        try {
            if (j01Var.h) {
                throw new x70(null, "mutable instance");
            }
            int length = j01Var.i.length;
            if (length == 0) {
                s.j("insns.size() == 0");
                throw null;
            }
            int i5 = length - 2;
            while (true) {
                if (i5 < 0) {
                    if (((i01) j01Var.e(length - 1)).h.e == 1) {
                        s.j("insns does not end with a branch or throwing instruction");
                        throw null;
                    }
                    try {
                        if (v01Var.h) {
                            throw new x70(null, "mutable instance");
                        }
                        if (i2 < -1) {
                            s.j("primarySuccessor < -1");
                            throw null;
                        }
                        if (i2 >= 0) {
                            int i6 = v01Var.j;
                            if (!v01Var.k) {
                                i3 = 0;
                                while (true) {
                                    if (i3 >= i6) {
                                        i3 = -i6;
                                        break;
                                    } else if (v01Var.i[i3] == i2) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = i6;
                                int i7 = -1;
                                while (i3 > i7 + 1) {
                                    int i8 = ((i3 - i7) >> 1) + i7;
                                    if (i2 <= v01Var.i[i8]) {
                                        i3 = i8;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                if (i3 == i6) {
                                    i4 = -i6;
                                } else if (i2 != v01Var.i[i3]) {
                                    i4 = -i3;
                                }
                                i3 = i4 - 1;
                            }
                            if (!((i3 >= 0 ? i3 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + v01Var);
                            }
                        }
                        this.a = i;
                        this.b = j01Var;
                        this.c = v01Var;
                        this.d = i2;
                        return;
                    } catch (NullPointerException unused) {
                        um2.f("successors == null");
                        throw null;
                    }
                }
                if (((i01) j01Var.e(i5)).h.e != 1) {
                    s.j(hk1.g(i5, "insns[", "] is a branch or can throw"));
                    throw null;
                }
                i5--;
            }
        } catch (NullPointerException unused2) {
            um2.f("insns == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{" + pp0.J(this.a) + '}';
    }
}

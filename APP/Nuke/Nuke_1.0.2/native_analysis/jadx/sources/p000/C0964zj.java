package p000;

/* JADX INFO: renamed from: zj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0964zj {

    /* JADX INFO: renamed from: a */
    public final int f13925a;

    /* JADX INFO: renamed from: b */
    public final j01 f13926b;

    /* JADX INFO: renamed from: c */
    public final v01 f13927c;

    /* JADX INFO: renamed from: d */
    public final int f13928d;

    public C0964zj(int i, j01 j01Var, v01 v01Var, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            C0676s.m4651j("label < 0");
            throw null;
        }
        try {
            if (j01Var.f11990h) {
                throw new x70(null, "mutable instance");
            }
            int length = j01Var.f5590i.length;
            if (length == 0) {
                C0676s.m4651j("insns.size() == 0");
                throw null;
            }
            int i5 = length - 2;
            while (true) {
                if (i5 < 0) {
                    if (((i01) j01Var.m2693e(length - 1)).f4202h.f13815e == 1) {
                        C0676s.m4651j("insns does not end with a branch or throwing instruction");
                        throw null;
                    }
                    try {
                        if (v01Var.f11990h) {
                            throw new x70(null, "mutable instance");
                        }
                        if (i2 < -1) {
                            C0676s.m4651j("primarySuccessor < -1");
                            throw null;
                        }
                        if (i2 >= 0) {
                            int i6 = v01Var.f11588j;
                            if (!v01Var.f11589k) {
                                i3 = 0;
                                while (true) {
                                    if (i3 >= i6) {
                                        i3 = -i6;
                                        break;
                                    } else if (v01Var.f11587i[i3] == i2) {
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
                                    if (i2 <= v01Var.f11587i[i8]) {
                                        i3 = i8;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                if (i3 == i6) {
                                    i4 = -i6;
                                } else if (i2 != v01Var.f11587i[i3]) {
                                    i4 = -i3;
                                }
                                i3 = i4 - 1;
                            }
                            if (!((i3 >= 0 ? i3 : -1) >= 0)) {
                                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + v01Var);
                            }
                        }
                        this.f13925a = i;
                        this.f13926b = j01Var;
                        this.f13927c = v01Var;
                        this.f13928d = i2;
                        return;
                    } catch (NullPointerException unused) {
                        um2.m5516f("successors == null");
                        throw null;
                    }
                }
                if (((i01) j01Var.m2693e(i5)).f4202h.f13815e != 1) {
                    C0676s.m4651j(hk1.m2208g(i5, "insns[", "] is a branch or can throw"));
                    throw null;
                }
                i5--;
            }
        } catch (NullPointerException unused2) {
            um2.m5516f("insns == null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + pp0.m3898J(this.f13925a) + '}';
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {
    public final c61 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final lk1 f = new lk1();
    public final eo1 g = new eo1();
    public final dk1 h = new dk1(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public us0(c61 c61Var) {
        this.a = c61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, List list, boolean z) {
        dk1 dk1Var;
        long[] jArr;
        long[] jArr2;
        int i;
        sn1 sn1Var;
        Object obj;
        int size = list.size();
        eo1 eo1Var = this.g;
        eo1 eo1Var2 = eo1Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            dk1Var = this.h;
            if (i2 >= size) {
                break;
            }
            th1 th1Var = (th1) list.get(i2);
            if (th1Var.u) {
                th1Var.t = new t6(6, this, th1Var);
                if (z2) {
                    zk1 zk1Var = eo1Var2.a;
                    Object[] objArr = zk1Var.h;
                    int i3 = zk1Var.j;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (t11.l(((sn1) obj).c, th1Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    sn1Var = (sn1) obj;
                    if (sn1Var != null) {
                        sn1Var.i = true;
                        sn1Var.d.e(j);
                        if (z) {
                            Object objD = dk1Var.d(j);
                            if (objD == null) {
                                objD = new lk1();
                                dk1Var.f(j, objD);
                            }
                            ((lk1) objD).a(sn1Var);
                        }
                        eo1Var2 = sn1Var;
                    } else {
                        z2 = false;
                        sn1Var = new sn1(th1Var);
                        sn1Var.d.e(j);
                        if (z) {
                            Object objD2 = dk1Var.d(j);
                            if (objD2 == null) {
                                objD2 = new lk1();
                                dk1Var.f(j, objD2);
                            }
                            ((lk1) objD2).a(sn1Var);
                        }
                        eo1Var2.a.b(sn1Var);
                        eo1Var2 = sn1Var;
                    }
                } else {
                    sn1Var = new sn1(th1Var);
                    sn1Var.d.e(j);
                    if (z) {
                    }
                    eo1Var2.a.b(sn1Var);
                    eo1Var2 = sn1Var;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = dk1Var.b;
            Object[] objArr2 = dk1Var.c;
            long[] jArr4 = dk1Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                lk1 lk1Var = (lk1) objArr2[i9];
                                zk1 zk1Var2 = eo1Var.a;
                                i = i6;
                                Object[] objArr3 = zk1Var2.h;
                                int i10 = zk1Var2.j;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((sn1) objArr3[i11]).f(j3, lk1Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        dk1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(er2 er2Var, boolean z) {
        gd1 gd1Var = (gd1) er2Var.j;
        c61 c61Var = this.a;
        eo1 eo1Var = this.g;
        boolean zA = eo1Var.a(gd1Var, c61Var, er2Var, z);
        zk1 zk1Var = eo1Var.a;
        if (!zA) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((sn1) objArr[i2]).e(er2Var, z) || z3;
        }
        Object[] objArr2 = zk1Var.h;
        int i3 = zk1Var.j;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((sn1) objArr2[i4]).d(er2Var) || z4;
        }
        eo1Var.b(er2Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            lk1 lk1Var = this.f;
            int i5 = lk1Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((th1) lk1Var.f(i6));
            }
            lk1Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            eo1Var.a.g();
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        eo1 eo1Var = this.g;
        zk1 zk1Var = eo1Var.a;
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            eo1Var.a.g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(th1 th1Var) {
        if (this.b) {
            this.e = true;
            this.f.a(th1Var);
            return;
        }
        eo1 eo1Var = this.g;
        lk1 lk1Var = eo1Var.b;
        lk1Var.d();
        lk1Var.a(eo1Var);
        while (lk1Var.i()) {
            eo1 eo1Var2 = (eo1) lk1Var.k(lk1Var.b - 1);
            int i = 0;
            while (true) {
                zk1 zk1Var = eo1Var2.a;
                if (i < zk1Var.j) {
                    sn1 sn1Var = (sn1) zk1Var.h[i];
                    if (t11.l(sn1Var.c, th1Var)) {
                        eo1Var2.a.j(sn1Var);
                        sn1Var.c();
                    } else {
                        lk1Var.a(sn1Var);
                        i++;
                    }
                }
            }
        }
    }
}

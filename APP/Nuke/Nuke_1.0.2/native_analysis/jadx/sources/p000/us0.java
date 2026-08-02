package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class us0 {

    /* JADX INFO: renamed from: a */
    public final c61 f11465a;

    /* JADX INFO: renamed from: b */
    public boolean f11466b;

    /* JADX INFO: renamed from: c */
    public boolean f11467c;

    /* JADX INFO: renamed from: d */
    public boolean f11468d;

    /* JADX INFO: renamed from: e */
    public boolean f11469e;

    /* JADX INFO: renamed from: f */
    public final lk1 f11470f = new lk1();

    /* JADX INFO: renamed from: g */
    public final eo1 f11471g = new eo1();

    /* JADX INFO: renamed from: h */
    public final dk1 f11472h = new dk1(10);

    public us0(c61 c61Var) {
        this.f11465a = c61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5574a(long j, List list, boolean z) {
        dk1 dk1Var;
        long[] jArr;
        long[] jArr2;
        int i;
        sn1 sn1Var;
        Object obj;
        int size = list.size();
        eo1 eo1Var = this.f11471g;
        eo1 eo1Var2 = eo1Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            dk1Var = this.f11472h;
            if (i2 >= size) {
                break;
            }
            th1 th1Var = (th1) list.get(i2);
            if (th1Var.f10770u) {
                th1Var.f10769t = new C0723t6(6, this, th1Var);
                if (z2) {
                    zk1 zk1Var = eo1Var2.f2530a;
                    Object[] objArr = zk1Var.f13934h;
                    int i3 = zk1Var.f13936j;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (t11.m5086l(((sn1) obj).f10240c, th1Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    sn1Var = (sn1) obj;
                    if (sn1Var != null) {
                        sn1Var.f10246i = true;
                        sn1Var.f10241d.m1034e(j);
                        if (z) {
                            Object objM1049d = dk1Var.m1049d(j);
                            if (objM1049d == null) {
                                objM1049d = new lk1();
                                dk1Var.m1051f(j, objM1049d);
                            }
                            ((lk1) objM1049d).m2925a(sn1Var);
                        }
                        eo1Var2 = sn1Var;
                    } else {
                        z2 = false;
                        sn1Var = new sn1(th1Var);
                        sn1Var.f10241d.m1034e(j);
                        if (z) {
                            Object objM1049d2 = dk1Var.m1049d(j);
                            if (objM1049d2 == null) {
                                objM1049d2 = new lk1();
                                dk1Var.m1051f(j, objM1049d2);
                            }
                            ((lk1) objM1049d2).m2925a(sn1Var);
                        }
                        eo1Var2.f2530a.m6423b(sn1Var);
                        eo1Var2 = sn1Var;
                    }
                } else {
                    sn1Var = new sn1(th1Var);
                    sn1Var.f10241d.m1034e(j);
                    if (z) {
                    }
                    eo1Var2.f2530a.m6423b(sn1Var);
                    eo1Var2 = sn1Var;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = dk1Var.f2087b;
            Object[] objArr2 = dk1Var.f2088c;
            long[] jArr4 = dk1Var.f2086a;
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
                                zk1 zk1Var2 = eo1Var.f2530a;
                                i = i6;
                                Object[] objArr3 = zk1Var2.f13934h;
                                int i10 = zk1Var2.f13936j;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((sn1) objArr3[i11]).m4899f(j3, lk1Var);
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
        dk1Var.m1046a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5575b(er2 er2Var, boolean z) {
        gd1 gd1Var = (gd1) er2Var.f2577j;
        c61 c61Var = this.f11465a;
        eo1 eo1Var = this.f11471g;
        boolean zMo1398a = eo1Var.mo1398a(gd1Var, c61Var, er2Var, z);
        zk1 zk1Var = eo1Var.f2530a;
        if (!zMo1398a) {
            return false;
        }
        boolean z2 = true;
        this.f11466b = true;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((sn1) objArr[i2]).m4898e(er2Var, z) || z3;
        }
        Object[] objArr2 = zk1Var.f13934h;
        int i3 = zk1Var.f13936j;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((sn1) objArr2[i4]).m4897d(er2Var) || z4;
        }
        eo1Var.mo1399b(er2Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f11466b = false;
        if (this.f11469e) {
            this.f11469e = false;
            lk1 lk1Var = this.f11470f;
            int i5 = lk1Var.f6164b;
            for (int i6 = 0; i6 < i5; i6++) {
                m5577d((th1) lk1Var.m2930f(i6));
            }
            lk1Var.m2928d();
        }
        if (this.f11467c) {
            this.f11467c = false;
            m5576c();
        }
        if (this.f11468d) {
            this.f11468d = false;
            eo1Var.f2530a.m6428g();
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m5576c() {
        if (this.f11466b) {
            this.f11467c = true;
            return;
        }
        eo1 eo1Var = this.f11471g;
        zk1 zk1Var = eo1Var.f2530a;
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            ((sn1) objArr[i2]).m4896c();
        }
        if (this.f11468d) {
            this.f11468d = true;
        } else {
            eo1Var.f2530a.m6428g();
        }
    }

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
    /* JADX INFO: renamed from: d */
    public final void m5577d(th1 th1Var) {
        if (this.f11466b) {
            this.f11469e = true;
            this.f11470f.m2925a(th1Var);
            return;
        }
        eo1 eo1Var = this.f11471g;
        lk1 lk1Var = eo1Var.f2531b;
        lk1Var.m2928d();
        lk1Var.m2925a(eo1Var);
        while (lk1Var.m2933i()) {
            eo1 eo1Var2 = (eo1) lk1Var.m2935k(lk1Var.f6164b - 1);
            int i = 0;
            while (true) {
                zk1 zk1Var = eo1Var2.f2530a;
                if (i < zk1Var.f13936j) {
                    sn1 sn1Var = (sn1) zk1Var.f13934h[i];
                    if (t11.m5086l(sn1Var.f10240c, th1Var)) {
                        eo1Var2.f2530a.m6431j(sn1Var);
                        sn1Var.m4896c();
                    } else {
                        lk1Var.m2925a(sn1Var);
                        i++;
                    }
                }
            }
        }
    }
}

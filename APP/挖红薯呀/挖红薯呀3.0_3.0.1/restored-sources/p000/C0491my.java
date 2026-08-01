package p000;

import java.util.List;

/* JADX INFO: renamed from: my */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0491my {

    /* JADX INFO: renamed from: a */
    public final i50 f4068a;

    /* JADX INFO: renamed from: b */
    public boolean f4069b;

    /* JADX INFO: renamed from: c */
    public boolean f4070c;

    /* JADX INFO: renamed from: d */
    public boolean f4071d;

    /* JADX INFO: renamed from: e */
    public boolean f4072e;

    /* JADX INFO: renamed from: f */
    public final dh0 f4073f = new dh0();

    /* JADX INFO: renamed from: g */
    public final vj0 f4074g = new vj0();

    /* JADX INFO: renamed from: h */
    public final zg0 f4075h = new zg0(10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0491my(i50 i50Var) {
        this.f4068a = i50Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2607a(long j, List list, boolean z) {
        zg0 zg0Var;
        long[] jArr;
        long[] jArr2;
        int i;
        jj0 jj0Var;
        Object obj;
        int size = list.size();
        vj0 vj0Var = this.f4074g;
        vj0 vj0Var2 = vj0Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            zg0Var = this.f4075h;
            if (i2 >= size) {
                break;
            }
            oe0 oe0Var = (oe0) list.get(i2);
            if (oe0Var.f4542q) {
                oe0Var.f4541p = new C0458m3(6, this, oe0Var);
                if (z2) {
                    sh0 sh0Var = vj0Var2.f6726a;
                    Object[] objArr = sh0Var.f5768d;
                    int i3 = sh0Var.f5770f;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i4];
                        if (p30.m3002l(((jj0) obj).f2900c, oe0Var)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    jj0Var = (jj0) obj;
                    if (jj0Var != null) {
                        jj0Var.f2906i = true;
                        jj0Var.f2901d.m375d(j);
                        if (z) {
                            Object objM5589d = zg0Var.m5589d(j);
                            if (objM5589d == null) {
                                objM5589d = new dh0();
                                zg0Var.m5592g(j, objM5589d);
                            }
                            ((dh0) objM5589d).m697a(jj0Var);
                        }
                        vj0Var2 = jj0Var;
                    } else {
                        z2 = false;
                        jj0Var = new jj0(oe0Var);
                        jj0Var.f2901d.m375d(j);
                        if (z) {
                            Object objM5589d2 = zg0Var.m5589d(j);
                            if (objM5589d2 == null) {
                                objM5589d2 = new dh0();
                                zg0Var.m5592g(j, objM5589d2);
                            }
                            ((dh0) objM5589d2).m697a(jj0Var);
                        }
                        vj0Var2.f6726a.m4072b(jj0Var);
                        vj0Var2 = jj0Var;
                    }
                } else {
                    jj0Var = new jj0(oe0Var);
                    jj0Var.f2901d.m375d(j);
                    if (z) {
                    }
                    vj0Var2.f6726a.m4072b(jj0Var);
                    vj0Var2 = jj0Var;
                }
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = zg0Var.f7888b;
            Object[] objArr2 = zg0Var.f7889c;
            long[] jArr4 = zg0Var.f7887a;
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
                                dh0 dh0Var = (dh0) objArr2[i9];
                                sh0 sh0Var2 = vj0Var.f6726a;
                                i = i6;
                                Object[] objArr3 = sh0Var2.f5768d;
                                int i10 = sh0Var2.f5770f;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((jj0) objArr3[i11]).m1717f(j3, dh0Var);
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
        zg0Var.m5586a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2608b(C0111d c0111d, boolean z) {
        ub0 ub0Var = (ub0) c0111d.f919e;
        i50 i50Var = this.f4068a;
        vj0 vj0Var = this.f4074g;
        boolean zMo1712a = vj0Var.mo1712a(ub0Var, i50Var, c0111d, z);
        sh0 sh0Var = vj0Var.f6726a;
        if (!zMo1712a) {
            return false;
        }
        boolean z2 = true;
        this.f4069b = true;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((jj0) objArr[i2]).m1716e(c0111d, z) || z3;
        }
        Object[] objArr2 = sh0Var.f5768d;
        int i3 = sh0Var.f5770f;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((jj0) objArr2[i4]).m1715d(c0111d) || z4;
        }
        vj0Var.mo1713b(c0111d);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.f4069b = false;
        if (this.f4072e) {
            this.f4072e = false;
            dh0 dh0Var = this.f4073f;
            int i5 = dh0Var.f1109b;
            for (int i6 = 0; i6 < i5; i6++) {
                m2610d((oe0) dh0Var.m702f(i6));
            }
            dh0Var.m700d();
        }
        if (this.f4070c) {
            this.f4070c = false;
            m2609c();
        }
        if (this.f4071d) {
            this.f4071d = false;
            vj0Var.f6726a.m4077g();
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2609c() {
        if (this.f4069b) {
            this.f4070c = true;
            return;
        }
        vj0 vj0Var = this.f4074g;
        sh0 sh0Var = vj0Var.f6726a;
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ((jj0) objArr[i2]).m1714c();
        }
        if (this.f4071d) {
            this.f4071d = true;
        } else {
            vj0Var.f6726a.m4077g();
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
    /* JADX INFO: renamed from: d */
    public final void m2610d(oe0 oe0Var) {
        if (this.f4069b) {
            this.f4072e = true;
            this.f4073f.m697a(oe0Var);
            return;
        }
        vj0 vj0Var = this.f4074g;
        dh0 dh0Var = vj0Var.f6727b;
        dh0Var.m700d();
        dh0Var.m697a(vj0Var);
        while (dh0Var.m705i()) {
            vj0 vj0Var2 = (vj0) dh0Var.m707k(dh0Var.f1109b - 1);
            int i = 0;
            while (true) {
                sh0 sh0Var = vj0Var2.f6726a;
                if (i < sh0Var.f5770f) {
                    jj0 jj0Var = (jj0) sh0Var.f5768d[i];
                    if (p30.m3002l(jj0Var.f2900c, oe0Var)) {
                        vj0Var2.f6726a.m4080j(jj0Var);
                        jj0Var.m1714c();
                    } else {
                        dh0Var.m697a(jj0Var);
                        i++;
                    }
                }
            }
        }
    }
}

package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 implements uw {
    public final r61 h;
    public yx i;
    public sz0 j;
    public int k;
    public int l;
    public final rk1 m;
    public final rk1 n;
    public final z61 o;
    public final w61 p;
    public final rk1 q;
    public final jw2 r;
    public final rk1 s;
    public final zk1 t;
    public int u;
    public int v;
    public final String w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f71(r61 r61Var, sz0 sz0Var) {
        this.h = r61Var;
        this.j = sz0Var;
        long[] jArr = ed2.a;
        this.m = new rk1();
        this.n = new rk1();
        this.o = new z61(this);
        this.p = new w61(this);
        this.q = new rk1();
        this.r = new jw2();
        this.s = new rk1();
        this.t = new zk1(new Object[16]);
        this.w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(f71 f71Var, Object obj) {
        r61 r61Var = f71Var.h;
        f71Var.h();
        r61 r61Var2 = (r61) f71Var.q.k(obj);
        if (r61Var2 != null) {
            if (f71Var.v <= 0) {
                kz0.b("No pre-composed items to dispose");
            }
            int i = ((zk1) ((jk1) r61Var.o()).i).i(r61Var2);
            if (i < ((zk1) ((jk1) r61Var.o()).i).j - f71Var.v) {
                kz0.b("Item is not in pre-composed item range");
            }
            f71Var.u++;
            f71Var.v--;
            x61 x61Var = (x61) f71Var.m.g(r61Var2);
            if (x61Var != null) {
                e(x61Var);
            }
            int i2 = (((zk1) ((jk1) r61Var.o()).i).j - f71Var.v) - f71Var.u;
            f71Var.j(i, i2);
            f71Var.g(i2);
        }
        if (f71Var.t.h(obj)) {
            r61.V(r61Var, true, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(x61 x61Var) {
        sk1 sk1Var;
        sy1 sy1Var = x61Var.f;
        if (sy1Var != null) {
            sy1Var.h.set(uy1.i);
            z72 z72Var = sy1Var.k;
            if (z72Var.d.h()) {
                sk1Var = z72Var.d;
                sk1 sk1Var2 = fd2.a;
                z72Var.d = new sk1();
                z72Var.c.g();
            } else {
                sk1Var = null;
            }
            z72Var.b();
            fy fyVar = sy1Var.a;
            fyVar.x = null;
            if (sk1Var != null) {
                fyVar.B.k = sk1Var;
                fyVar.D = 2;
            }
            x61Var.f = null;
            fy fyVar2 = x61Var.c;
            if (fyVar2 != null) {
                fyVar2.m();
            }
            x61Var.c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // defpackage.uw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        fy fyVar;
        r61 r61Var = this.h;
        r61Var.x = true;
        rk1 rk1Var = this.m;
        Object[] objArr = rk1Var.c;
        long[] jArr = rk1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (fyVar = ((x61) objArr[(i << 3) + i3]).c) != null) {
                            fyVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        r61Var.P();
        r61Var.x = false;
        rk1Var.a();
        this.n.a();
        this.v = 0;
        this.u = 0;
        this.q.a();
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uw
    public final void c() {
        i(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(x61 x61Var, boolean z) {
        sy1 sy1Var = x61Var.f;
        if (sy1Var != null) {
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            try {
                r61 r61Var = this.h;
                r61Var.x = true;
                if (z) {
                    while (!sy1Var.c()) {
                        try {
                            sy1Var.e(new c80(10));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                sy1Var.a();
                x61Var.f = null;
                r61Var.x = false;
            } finally {
                tl.U(vr2VarB, vr2VarK, in0VarE);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fw2 f(Object obj) {
        return !this.h.H() ? new c71() : new d71(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        boolean z;
        boolean z2 = false;
        this.u = 0;
        List listO = this.h.o();
        jk1 jk1Var = (jk1) listO;
        int i2 = (((zk1) jk1Var.i).j - this.v) - 1;
        if (i <= i2) {
            this.r.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.m.g((r61) jk1Var.get(i3));
                    objG.getClass();
                    ((mk1) this.r.i).a(((x61) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            sz0 sz0Var = this.j;
            jw2 jw2Var = this.r;
            gk1 gk1Var = (gk1) sz0Var.j;
            gk1Var.a();
            mk1 mk1Var = (mk1) jw2Var.i;
            Object[] objArr = mk1Var.b;
            long[] jArr = mk1Var.c;
            int i4 = mk1Var.e;
            while (i4 != Integer.MAX_VALUE) {
                int i5 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                Object objB = ((z71) sz0Var.i).b(obj);
                int iD = gk1Var.d(objB);
                int i6 = iD >= 0 ? gk1Var.c[iD] : 0;
                if (i6 == 7) {
                    jw2Var.remove(obj);
                } else {
                    gk1Var.g(i6 + 1, objB);
                }
                i4 = i5;
            }
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            z = false;
            while (i2 >= i) {
                try {
                    r61 r61Var = (r61) ((jk1) listO).get(i2);
                    Object objG2 = this.m.g(r61Var);
                    objG2.getClass();
                    x61 x61Var = (x61) objG2;
                    Object obj2 = x61Var.a;
                    if (((mk1) this.r.i).c(obj2)) {
                        this.u++;
                        if (((Boolean) x61Var.g.getValue()).booleanValue()) {
                            v61 v61Var = r61Var.N;
                            mf1 mf1Var = v61Var.p;
                            p61 p61Var = p61.j;
                            mf1Var.s = p61Var;
                            qd1 qd1Var = v61Var.q;
                            if (qd1Var != null) {
                                qd1Var.q = p61Var;
                            }
                            l(x61Var, false);
                            if (x61Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        r61 r61Var2 = this.h;
                        r61Var2.x = true;
                        this.m.k(r61Var);
                        fy fyVar = x61Var.c;
                        if (fyVar != null) {
                            fyVar.m();
                        }
                        this.h.Q(i2, 1);
                        r61Var2.x = false;
                    }
                    this.n.k(obj2);
                    i2--;
                } catch (Throwable th) {
                    tl.U(vr2VarB, vr2VarK, in0VarE);
                    throw th;
                }
            }
            tl.U(vr2VarB, vr2VarK, in0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ds2.c) {
                sk1 sk1Var = ds2.j.h;
                if (sk1Var != null) {
                    if (sk1Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ds2.a();
            }
        }
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        int i = ((zk1) ((jk1) this.h.o()).i).j;
        rk1 rk1Var = this.m;
        if (rk1Var.e != i) {
            kz0.a("Inconsistency between the count of nodes tracked by the state (" + rk1Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.u) - this.v < 0) {
            StringBuilder sbN = vi0.n(i, "Incorrect state. Total children ", ". Reusable children ");
            sbN.append(this.u);
            sbN.append(". Precomposed children ");
            sbN.append(this.v);
            kz0.a(sbN.toString());
        }
        rk1 rk1Var2 = this.q;
        if (rk1Var2.e == this.v) {
            return;
        }
        kz0.a("Incorrect state. Precomposed children " + this.v + ". Map size " + rk1Var2.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(boolean z) {
        this.v = 0;
        this.q.a();
        List listO = this.h.o();
        int i = ((zk1) ((jk1) listO).i).j;
        if (this.u != i) {
            this.u = i;
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    r61 r61Var = (r61) ((jk1) listO).get(i2);
                    x61 x61Var = (x61) this.m.g(r61Var);
                    if (x61Var != null && ((Boolean) x61Var.g.getValue()).booleanValue()) {
                        v61 v61Var = r61Var.N;
                        mf1 mf1Var = v61Var.p;
                        p61 p61Var = p61.j;
                        mf1Var.s = p61Var;
                        qd1 qd1Var = v61Var.q;
                        if (qd1Var != null) {
                            qd1Var.q = p61Var;
                        }
                        l(x61Var, z);
                        x61Var.a = rp0.k;
                    }
                } catch (Throwable th) {
                    tl.U(vr2VarB, vr2VarK, in0VarE);
                    throw th;
                }
            }
            tl.U(vr2VarB, vr2VarK, in0VarE);
            this.n.a();
        }
        h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, int i2) {
        r61 r61Var = this.h;
        r61Var.x = true;
        r61Var.L(i, i2, 1);
        r61Var.x = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Object obj, mn0 mn0Var, boolean z) {
        r61 r61Var = this.h;
        if (r61Var.H()) {
            h();
            if (this.n.c(obj)) {
                return;
            }
            this.s.k(obj);
            rk1 rk1Var = this.q;
            Object objG = rk1Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((zk1) ((jk1) r61Var.o()).i).i(objG), ((zk1) ((jk1) r61Var.o()).i).j);
                    this.v++;
                } else {
                    int i = ((zk1) ((jk1) r61Var.o()).i).j;
                    r61 r61Var2 = new r61(2);
                    r61Var.x = true;
                    r61Var.A(i, r61Var2);
                    r61Var.x = false;
                    this.v++;
                    objG = r61Var2;
                }
                rk1Var.m(obj, objG);
            }
            m((r61) objG, obj, z, mn0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(x61 x61Var, boolean z) {
        fy fyVar;
        if (z || !x61Var.h) {
            x61Var.g = op0.u(Boolean.FALSE);
        } else {
            x61Var.g.setValue(Boolean.FALSE);
        }
        if (x61Var.f != null) {
            e(x61Var);
            return;
        }
        if (z) {
            fy fyVar2 = x61Var.c;
            if (fyVar2 != null) {
                fyVar2.l();
                return;
            }
            return;
        }
        rv1 rv1VarM9getOutOfFrameExecutor = ((b7) u61.a(this.h)).m9getOutOfFrameExecutor();
        if (rv1VarM9getOutOfFrameExecutor == null) {
            if (x61Var.h || (fyVar = x61Var.c) == null) {
                return;
            }
            fyVar.l();
            return;
        }
        ea eaVar = new ea(13, x61Var);
        b7 b7Var = (b7) rv1VarM9getOutOfFrameExecutor;
        ag agVar = b7Var.p;
        boolean zIsEmpty = agVar.isEmpty();
        agVar.addLast(eaVar);
        if (zIsEmpty) {
            Handler handler = b7Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(b7Var.q);
            } else {
                s.j("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(r61 r61Var, Object obj, boolean z, mn0 mn0Var) {
        boolean z2;
        fy fyVar;
        rk1 rk1Var = this.m;
        Object objG = rk1Var.g(r61Var);
        Object obj2 = objG;
        if (objG == null) {
            kw kwVar = qw.a;
            x61 x61Var = new x61();
            x61Var.a = obj;
            x61Var.b = kwVar;
            x61Var.c = null;
            x61Var.g = op0.u(Boolean.TRUE);
            rk1Var.m(r61Var, x61Var);
            obj2 = x61Var;
        }
        x61 x61Var2 = (x61) obj2;
        int i = 1;
        boolean z3 = x61Var2.b != mn0Var;
        if (x61Var2.f != null) {
            if (z3) {
                e(x61Var2);
            } else if (z) {
                return;
            } else {
                d(x61Var2, true);
            }
        }
        fy fyVar2 = x61Var2.c;
        if (fyVar2 != null) {
            synchronized (fyVar2.k) {
                z2 = fyVar2.u.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || x61Var2.d) {
            x61Var2.b = mn0Var;
            if (x61Var2.f != null) {
                kz0.a("new subcompose call while paused composition is still active");
            }
            vr2 vr2VarB = tl.B();
            in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
            vr2 vr2VarK = tl.K(vr2VarB);
            try {
                r61 r61Var2 = this.h;
                r61Var2.x = true;
                fy fyVar3 = x61Var2.c;
                yx yxVar = this.i;
                if (yxVar == null) {
                    kz0.c("parent composition reference not set");
                    throw new pv();
                }
                if (fyVar3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = dg3.a;
                        fyVar = new fy(yxVar, new s73(r61Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = dg3.a;
                        fyVar = new fy(yxVar, new s73(r61Var));
                    }
                    fyVar3 = fyVar;
                } else {
                    if (fyVar3.D == 3) {
                        if (z) {
                        }
                        fyVar3 = fyVar;
                    }
                }
                x61Var2.c = fyVar3;
                mn0 kwVar2 = x61Var2.b;
                if (((b7) u61.a(this.h)).m9getOutOfFrameExecutor() != null) {
                    x61Var2.h = false;
                } else {
                    x61Var2.h = true;
                    kwVar2 = new kw(1524156494, true, new v7(i, x61Var2, kwVar2));
                }
                if (z) {
                    if (x61Var2.e) {
                        fyVar3.i();
                        fyVar3.q();
                        x61Var2.f = fyVar3.k(true, kwVar2);
                    } else {
                        x61Var2.f = fyVar3.k(fyVar3.i(), kwVar2);
                    }
                } else if (x61Var2.e) {
                    fyVar3.i();
                    fyVar3.q();
                    go0 go0Var = fyVar3.C;
                    go0Var.z = 0;
                    go0Var.y = true;
                    fyVar3.h.a(fyVar3, kwVar2);
                    go0Var.s();
                } else {
                    fyVar3.A(kwVar2);
                }
                x61Var2.e = false;
                r61Var2.x = false;
                tl.U(vr2VarB, vr2VarK, in0VarE);
                x61Var2.d = false;
            } catch (Throwable th) {
                tl.U(vr2VarB, vr2VarK, in0VarE);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r61 n(Object obj) {
        rk1 rk1Var;
        int i;
        if (this.u == 0) {
            return null;
        }
        jk1 jk1Var = (jk1) this.h.o();
        int i2 = ((zk1) jk1Var.i).j - this.v;
        int i3 = i2 - this.u;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            rk1Var = this.m;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = rk1Var.g((r61) jk1Var.get(i5));
            objG.getClass();
            if (((x61) objG).a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objG2 = rk1Var.g((r61) jk1Var.get(i4));
                objG2.getClass();
                x61 x61Var = (x61) objG2;
                Object obj2 = x61Var.a;
                if (obj2 != rp0.k) {
                    z71 z71Var = (z71) this.j.i;
                    if (!t11.l(z71Var.b(obj), z71Var.b(obj2))) {
                        i4--;
                    }
                }
                x61Var.a = obj;
                i5 = i4;
                i = i5;
                break;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.u--;
        r61 r61Var = (r61) jk1Var.get(i3);
        Object objG3 = rk1Var.g(r61Var);
        objG3.getClass();
        x61 x61Var2 = (x61) objG3;
        x61Var2.g = op0.u(Boolean.TRUE);
        x61Var2.e = true;
        x61Var2.d = true;
        return r61Var;
    }
}

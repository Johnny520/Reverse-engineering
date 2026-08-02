package p000;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 implements InterfaceC0788uw {

    /* JADX INFO: renamed from: h */
    public final r61 f2826h;

    /* JADX INFO: renamed from: i */
    public AbstractC0941yx f2827i;

    /* JADX INFO: renamed from: j */
    public sz0 f2828j;

    /* JADX INFO: renamed from: k */
    public int f2829k;

    /* JADX INFO: renamed from: l */
    public int f2830l;

    /* JADX INFO: renamed from: m */
    public final rk1 f2831m;

    /* JADX INFO: renamed from: n */
    public final rk1 f2832n;

    /* JADX INFO: renamed from: o */
    public final z61 f2833o;

    /* JADX INFO: renamed from: p */
    public final w61 f2834p;

    /* JADX INFO: renamed from: q */
    public final rk1 f2835q;

    /* JADX INFO: renamed from: r */
    public final jw2 f2836r;

    /* JADX INFO: renamed from: s */
    public final rk1 f2837s;

    /* JADX INFO: renamed from: t */
    public final zk1 f2838t;

    /* JADX INFO: renamed from: u */
    public int f2839u;

    /* JADX INFO: renamed from: v */
    public int f2840v;

    /* JADX INFO: renamed from: w */
    public final String f2841w;

    public f71(r61 r61Var, sz0 sz0Var) {
        this.f2826h = r61Var;
        this.f2828j = sz0Var;
        long[] jArr = ed2.f2401a;
        this.f2831m = new rk1();
        this.f2832n = new rk1();
        this.f2833o = new z61(this);
        this.f2834p = new w61(this);
        this.f2835q = new rk1();
        this.f2836r = new jw2();
        this.f2837s = new rk1();
        this.f2838t = new zk1(new Object[16]);
        this.f2841w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX INFO: renamed from: b */
    public static final void m1535b(f71 f71Var, Object obj) {
        r61 r61Var = f71Var.f2826h;
        f71Var.m1542h();
        r61 r61Var2 = (r61) f71Var.f2835q.m4509k(obj);
        if (r61Var2 != null) {
            if (f71Var.f2840v <= 0) {
                kz0.m2764b("No pre-composed items to dispose");
            }
            int iM6430i = ((zk1) ((jk1) r61Var.m4383o()).f5084i).m6430i(r61Var2);
            if (iM6430i < ((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j - f71Var.f2840v) {
                kz0.m2764b("Item is not in pre-composed item range");
            }
            f71Var.f2839u++;
            f71Var.f2840v--;
            x61 x61Var = (x61) f71Var.f2831m.m4505g(r61Var2);
            if (x61Var != null) {
                m1536e(x61Var);
            }
            int i = (((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j - f71Var.f2840v) - f71Var.f2839u;
            f71Var.m1544j(iM6430i, i);
            f71Var.m1541g(i);
        }
        if (f71Var.f2838t.m6429h(obj)) {
            r61.m4341V(r61Var, true, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1536e(x61 x61Var) {
        sk1 sk1Var;
        sy1 sy1Var = x61Var.f12847f;
        if (sy1Var != null) {
            sy1Var.f10428h.set(uy1.f11556i);
            z72 z72Var = sy1Var.f10431k;
            if (z72Var.f13771d.m4889h()) {
                sk1Var = z72Var.f13771d;
                sk1 sk1Var2 = fd2.f2911a;
                z72Var.f13771d = new sk1();
                z72Var.f13770c.m6428g();
            } else {
                sk1Var = null;
            }
            z72Var.m6391b();
            C0220fy c0220fy = sy1Var.f10421a;
            c0220fy.f3192x = null;
            if (sk1Var != null) {
                c0220fy.f3173B.f13778k = sk1Var;
                c0220fy.f3175D = 2;
            }
            x61Var.f12847f = null;
            C0220fy c0220fy2 = x61Var.f12844c;
            if (c0220fy2 != null) {
                c0220fy2.m1742m();
            }
            x61Var.f12844c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p000.InterfaceC0788uw
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1537a() {
        C0220fy c0220fy;
        r61 r61Var = this.f2826h;
        r61Var.f9400x = true;
        rk1 rk1Var = this.f2831m;
        Object[] objArr = rk1Var.f9620c;
        long[] jArr = rk1Var.f9618a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (c0220fy = ((x61) objArr[(i << 3) + i3]).f12844c) != null) {
                            c0220fy.m1742m();
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
        r61Var.m4358P();
        r61Var.f9400x = false;
        rk1Var.m4499a();
        this.f2832n.m4499a();
        this.f2840v = 0;
        this.f2839u = 0;
        this.f2835q.m4499a();
        m1542h();
    }

    @Override // p000.InterfaceC0788uw
    /* JADX INFO: renamed from: c */
    public final void mo1538c() {
        m1543i(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1539d(x61 x61Var, boolean z) {
        sy1 sy1Var = x61Var.f12847f;
        if (sy1Var != null) {
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                r61 r61Var = this.f2826h;
                r61Var.f9400x = true;
                if (z) {
                    while (!sy1Var.m5021c()) {
                        try {
                            sy1Var.m5023e(new c80(10));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                sy1Var.m5019a();
                x61Var.f12847f = null;
                r61Var.f9400x = false;
            } finally {
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final fw2 m1540f(Object obj) {
        return !this.f2826h.m4350H() ? new c71() : new d71(this, obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m1541g(int i) {
        boolean z;
        boolean z2 = false;
        this.f2839u = 0;
        List listM4383o = this.f2826h.m4383o();
        jk1 jk1Var = (jk1) listM4383o;
        int i2 = (((zk1) jk1Var.f5084i).f13936j - this.f2840v) - 1;
        if (i <= i2) {
            this.f2836r.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objM4505g = this.f2831m.m4505g((r61) jk1Var.get(i3));
                    objM4505g.getClass();
                    ((mk1) this.f2836r.f5249i).m3124a(((x61) objM4505g).f12842a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            sz0 sz0Var = this.f2828j;
            jw2 jw2Var = this.f2836r;
            gk1 gk1Var = (gk1) sz0Var.f10437j;
            gk1Var.m1930a();
            mk1 mk1Var = (mk1) jw2Var.f5249i;
            Object[] objArr = mk1Var.f6703b;
            long[] jArr = mk1Var.f6704c;
            int i4 = mk1Var.f6706e;
            while (i4 != Integer.MAX_VALUE) {
                int i5 = (int) ((jArr[i4] >> 31) & 2147483647L);
                Object obj = objArr[i4];
                Object objM6388b = ((z71) sz0Var.f10436i).m6388b(obj);
                int iM1933d = gk1Var.m1933d(objM6388b);
                int i6 = iM1933d >= 0 ? gk1Var.f3554c[iM1933d] : 0;
                if (i6 == 7) {
                    jw2Var.remove(obj);
                } else {
                    gk1Var.m1936g(i6 + 1, objM6388b);
                }
                i4 = i5;
            }
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            z = false;
            while (i2 >= i) {
                try {
                    r61 r61Var = (r61) ((jk1) listM4383o).get(i2);
                    Object objM4505g2 = this.f2831m.m4505g(r61Var);
                    objM4505g2.getClass();
                    x61 x61Var = (x61) objM4505g2;
                    Object obj2 = x61Var.f12842a;
                    if (((mk1) this.f2836r.f5249i).m3126c(obj2)) {
                        this.f2839u++;
                        if (((Boolean) x61Var.f12848g.getValue()).booleanValue()) {
                            v61 v61Var = r61Var.f9373N;
                            mf1 mf1Var = v61Var.f11795p;
                            p61 p61Var = p61.f7987j;
                            mf1Var.f6624s = p61Var;
                            qd1 qd1Var = v61Var.f11796q;
                            if (qd1Var != null) {
                                qd1Var.f8911q = p61Var;
                            }
                            m1546l(x61Var, false);
                            if (x61Var.f12849h) {
                                z = true;
                            }
                        }
                    } else {
                        r61 r61Var2 = this.f2826h;
                        r61Var2.f9400x = true;
                        this.f2831m.m4509k(r61Var);
                        C0220fy c0220fy = x61Var.f12844c;
                        if (c0220fy != null) {
                            c0220fy.m1742m();
                        }
                        this.f2826h.m4359Q(i2, 1);
                        r61Var2.f9400x = false;
                    }
                    this.f2832n.m4509k(obj2);
                    i2--;
                } catch (Throwable th) {
                    AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                    throw th;
                }
            }
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ds2.f2181c) {
                sk1 sk1Var = ds2.f2188j.f12560h;
                if (sk1Var != null) {
                    if (sk1Var.m4889h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ds2.m1117a();
            }
        }
        m1542h();
    }

    /* JADX INFO: renamed from: h */
    public final void m1542h() {
        int i = ((zk1) ((jk1) this.f2826h.m4383o()).f5084i).f13936j;
        rk1 rk1Var = this.f2831m;
        if (rk1Var.f9622e != i) {
            kz0.m2763a("Inconsistency between the count of nodes tracked by the state (" + rk1Var.f9622e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f2839u) - this.f2840v < 0) {
            StringBuilder sbM5695n = vi0.m5695n(i, "Incorrect state. Total children ", ". Reusable children ");
            sbM5695n.append(this.f2839u);
            sbM5695n.append(". Precomposed children ");
            sbM5695n.append(this.f2840v);
            kz0.m2763a(sbM5695n.toString());
        }
        rk1 rk1Var2 = this.f2835q;
        if (rk1Var2.f9622e == this.f2840v) {
            return;
        }
        kz0.m2763a("Incorrect state. Precomposed children " + this.f2840v + ". Map size " + rk1Var2.f9622e);
    }

    /* JADX INFO: renamed from: i */
    public final void m1543i(boolean z) {
        this.f2840v = 0;
        this.f2835q.m4499a();
        List listM4383o = this.f2826h.m4383o();
        int i = ((zk1) ((jk1) listM4383o).f5084i).f13936j;
        if (this.f2839u != i) {
            this.f2839u = i;
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    r61 r61Var = (r61) ((jk1) listM4383o).get(i2);
                    x61 x61Var = (x61) this.f2831m.m4505g(r61Var);
                    if (x61Var != null && ((Boolean) x61Var.f12848g.getValue()).booleanValue()) {
                        v61 v61Var = r61Var.f9373N;
                        mf1 mf1Var = v61Var.f11795p;
                        p61 p61Var = p61.f7987j;
                        mf1Var.f6624s = p61Var;
                        qd1 qd1Var = v61Var.f11796q;
                        if (qd1Var != null) {
                            qd1Var.f8911q = p61Var;
                        }
                        m1546l(x61Var, z);
                        x61Var.f12842a = rp0.f9679k;
                    }
                } catch (Throwable th) {
                    AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                    throw th;
                }
            }
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            this.f2832n.m4499a();
        }
        m1542h();
    }

    /* JADX INFO: renamed from: j */
    public final void m1544j(int i, int i2) {
        r61 r61Var = this.f2826h;
        r61Var.f9400x = true;
        r61Var.m4354L(i, i2, 1);
        r61Var.f9400x = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m1545k(Object obj, mn0 mn0Var, boolean z) {
        r61 r61Var = this.f2826h;
        if (r61Var.m4350H()) {
            m1542h();
            if (this.f2832n.m4501c(obj)) {
                return;
            }
            this.f2837s.m4509k(obj);
            rk1 rk1Var = this.f2835q;
            Object objM4505g = rk1Var.m4505g(obj);
            if (objM4505g == null) {
                objM4505g = m1548n(obj);
                if (objM4505g != null) {
                    m1544j(((zk1) ((jk1) r61Var.m4383o()).f5084i).m6430i(objM4505g), ((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j);
                    this.f2840v++;
                } else {
                    int i = ((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j;
                    r61 r61Var2 = new r61(2);
                    r61Var.f9400x = true;
                    r61Var.m4344A(i, r61Var2);
                    r61Var.f9400x = false;
                    this.f2840v++;
                    objM4505g = r61Var2;
                }
                rk1Var.m4511m(obj, objM4505g);
            }
            m1547m((r61) objM4505g, obj, z, mn0Var);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1546l(x61 x61Var, boolean z) {
        C0220fy c0220fy;
        if (z || !x61Var.f12849h) {
            x61Var.f12848g = op0.m3598u(Boolean.FALSE);
        } else {
            x61Var.f12848g.setValue(Boolean.FALSE);
        }
        if (x61Var.f12847f != null) {
            m1536e(x61Var);
            return;
        }
        if (z) {
            C0220fy c0220fy2 = x61Var.f12844c;
            if (c0220fy2 != null) {
                c0220fy2.m1741l();
                return;
            }
            return;
        }
        rv1 rv1VarM6531getOutOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f2826h)).m6531getOutOfFrameExecutor();
        if (rv1VarM6531getOutOfFrameExecutor == null) {
            if (x61Var.f12849h || (c0220fy = x61Var.f12844c) == null) {
                return;
            }
            c0220fy.m1741l();
            return;
        }
        C0159ea c0159ea = new C0159ea(13, x61Var);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = (ViewTreeObserverOnGlobalLayoutListenerC0045b7) rv1VarM6531getOutOfFrameExecutor;
        C0017ag c0017ag = viewTreeObserverOnGlobalLayoutListenerC0045b7.f692p;
        boolean zIsEmpty = c0017ag.isEmpty();
        c0017ag.addLast(c0159ea);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC0045b7.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC0045b7.f694q);
            } else {
                C0676s.m4651j("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

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
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1547m(r61 r61Var, Object obj, boolean z, mn0 mn0Var) {
        boolean z2;
        C0220fy c0220fy;
        rk1 rk1Var = this.f2831m;
        Object objM4505g = rk1Var.m4505g(r61Var);
        Object obj2 = objM4505g;
        if (objM4505g == null) {
            C0402kw c0402kw = AbstractC0634qw.f9208a;
            x61 x61Var = new x61();
            x61Var.f12842a = obj;
            x61Var.f12843b = c0402kw;
            x61Var.f12844c = null;
            x61Var.f12848g = op0.m3598u(Boolean.TRUE);
            rk1Var.m4511m(r61Var, x61Var);
            obj2 = x61Var;
        }
        x61 x61Var2 = (x61) obj2;
        int i = 1;
        boolean z3 = x61Var2.f12843b != mn0Var;
        if (x61Var2.f12847f != null) {
            if (z3) {
                m1536e(x61Var2);
            } else if (z) {
                return;
            } else {
                m1539d(x61Var2, true);
            }
        }
        C0220fy c0220fy2 = x61Var2.f12844c;
        if (c0220fy2 != null) {
            synchronized (c0220fy2.f3179k) {
                z2 = c0220fy2.f3189u.f9622e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || x61Var2.f12845d) {
            x61Var2.f12843b = mn0Var;
            if (x61Var2.f12847f != null) {
                kz0.m2763a("new subcompose call while paused composition is still active");
            }
            vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
            in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
            vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
            try {
                r61 r61Var2 = this.f2826h;
                r61Var2.f9400x = true;
                C0220fy c0220fy3 = x61Var2.f12844c;
                AbstractC0941yx abstractC0941yx = this.f2827i;
                if (abstractC0941yx == null) {
                    kz0.m2765c("parent composition reference not set");
                    throw new C0594pv();
                }
                if (c0220fy3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = dg3.f2050a;
                        c0220fy = new C0220fy(abstractC0941yx, new s73(r61Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = dg3.f2050a;
                        c0220fy = new C0220fy(abstractC0941yx, new s73(r61Var));
                    }
                    c0220fy3 = c0220fy;
                } else {
                    if (c0220fy3.f3175D == 3) {
                        if (z) {
                        }
                        c0220fy3 = c0220fy;
                    }
                }
                x61Var2.f12844c = c0220fy3;
                mn0 c0402kw2 = x61Var2.f12843b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC0045b7) u61.m5471a(this.f2826h)).m6531getOutOfFrameExecutor() != null) {
                    x61Var2.f12849h = false;
                } else {
                    x61Var2.f12849h = true;
                    c0402kw2 = new C0402kw(1524156494, true, new C0800v7(i, x61Var2, c0402kw2));
                }
                if (z) {
                    if (x61Var2.f12846e) {
                        c0220fy3.m1738i();
                        c0220fy3.m1746q();
                        x61Var2.f12847f = c0220fy3.m1740k(true, c0402kw2);
                    } else {
                        x61Var2.f12847f = c0220fy3.m1740k(c0220fy3.m1738i(), c0402kw2);
                    }
                } else if (x61Var2.f12846e) {
                    c0220fy3.m1738i();
                    c0220fy3.m1746q();
                    go0 go0Var = c0220fy3.f3174C;
                    go0Var.f3641z = 0;
                    go0Var.f3640y = true;
                    c0220fy3.f3176h.mo1375a(c0220fy3, c0402kw2);
                    go0Var.m1997s();
                } else {
                    c0220fy3.m1729A(c0402kw2);
                }
                x61Var2.f12846e = false;
                r61Var2.f9400x = false;
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                x61Var2.f12845d = false;
            } catch (Throwable th) {
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final r61 m1548n(Object obj) {
        rk1 rk1Var;
        int i;
        if (this.f2839u == 0) {
            return null;
        }
        jk1 jk1Var = (jk1) this.f2826h.m4383o();
        int i2 = ((zk1) jk1Var.f5084i).f13936j - this.f2840v;
        int i3 = i2 - this.f2839u;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            rk1Var = this.f2831m;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objM4505g = rk1Var.m4505g((r61) jk1Var.get(i5));
            objM4505g.getClass();
            if (((x61) objM4505g).f12842a.equals(obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objM4505g2 = rk1Var.m4505g((r61) jk1Var.get(i4));
                objM4505g2.getClass();
                x61 x61Var = (x61) objM4505g2;
                Object obj2 = x61Var.f12842a;
                if (obj2 != rp0.f9679k) {
                    z71 z71Var = (z71) this.f2828j.f10436i;
                    if (!t11.m5086l(z71Var.m6388b(obj), z71Var.m6388b(obj2))) {
                        i4--;
                    }
                }
                x61Var.f12842a = obj;
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
            m1544j(i5, i3);
        }
        this.f2839u--;
        r61 r61Var = (r61) jk1Var.get(i3);
        Object objM4505g3 = rk1Var.m4505g(r61Var);
        objM4505g3.getClass();
        x61 x61Var2 = (x61) objM4505g3;
        x61Var2.f12848g = op0.m3598u(Boolean.TRUE);
        x61Var2.f12846e = true;
        x61Var2.f12845d = true;
        return r61Var;
    }
}

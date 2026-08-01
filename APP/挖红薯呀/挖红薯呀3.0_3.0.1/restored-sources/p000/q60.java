package p000;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q60 implements InterfaceC0852vh {

    /* JADX INFO: renamed from: d */
    public final b60 f5056d;

    /* JADX INFO: renamed from: e */
    public AbstractC0727si f5057e;

    /* JADX INFO: renamed from: f */
    public a51 f5058f;

    /* JADX INFO: renamed from: g */
    public int f5059g;

    /* JADX INFO: renamed from: h */
    public int f5060h;

    /* JADX INFO: renamed from: i */
    public final jh0 f5061i;

    /* JADX INFO: renamed from: j */
    public final jh0 f5062j;

    /* JADX INFO: renamed from: k */
    public final k60 f5063k;

    /* JADX INFO: renamed from: l */
    public final h60 f5064l;

    /* JADX INFO: renamed from: m */
    public final jh0 f5065m;

    /* JADX INFO: renamed from: n */
    public final z41 f5066n;

    /* JADX INFO: renamed from: o */
    public final jh0 f5067o;

    /* JADX INFO: renamed from: p */
    public final sh0 f5068p;

    /* JADX INFO: renamed from: q */
    public int f5069q;

    /* JADX INFO: renamed from: r */
    public int f5070r;

    /* JADX INFO: renamed from: s */
    public final String f5071s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q60(b60 b60Var, a51 a51Var) {
        this.f5056d = b60Var;
        this.f5058f = a51Var;
        long[] jArr = dy0.f1212a;
        this.f5061i = new jh0();
        this.f5062j = new jh0();
        this.f5063k = new k60(this);
        this.f5064l = new h60(this);
        this.f5065m = new jh0();
        this.f5066n = new z41();
        this.f5067o = new jh0();
        this.f5068p = new sh0(new Object[16]);
        this.f5071s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3195c(q60 q60Var, Object obj) {
        b60 b60Var = q60Var.f5056d;
        q60Var.m3200h();
        b60 b60Var2 = (b60) q60Var.f5065m.m1705k(obj);
        if (b60Var2 != null) {
            if (q60Var.f5070r <= 0) {
                w10.m4824b("No pre-composed items to dispose");
            }
            int iM4079i = ((ph0) b60Var.m308o()).f4858d.m4079i(b60Var2);
            if (iM4079i < ((ph0) b60Var.m308o()).f4858d.f5770f - q60Var.f5070r) {
                w10.m4824b("Item is not in pre-composed item range");
            }
            q60Var.f5069q++;
            q60Var.f5070r--;
            i60 i60Var = (i60) q60Var.f5061i.m1701g(b60Var2);
            if (i60Var != null) {
                m3196e(i60Var);
            }
            int i = (((ph0) b60Var.m308o()).f4858d.f5770f - q60Var.f5070r) - q60Var.f5069q;
            q60Var.m3202j(iM4079i, i);
            q60Var.m3199g(i);
        }
        if (q60Var.f5068p.m4078h(obj)) {
            b60.m262X(b60Var, true, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3196e(i60 i60Var) {
        kh0 kh0Var;
        yp0 yp0Var = i60Var.f2464f;
        if (yp0Var != null) {
            yp0Var.f7681h.set(aq0.f236e);
            iu0 iu0Var = yp0Var.f7684k;
            if (iu0Var.f2621d.m1897h()) {
                kh0Var = iu0Var.f2621d;
                kh0 kh0Var2 = ey0.f1546a;
                iu0Var.f2621d = new kh0();
                iu0Var.f2620c.m4077g();
            } else {
                kh0Var = null;
            }
            iu0Var.m1599b();
            C0964yi c0964yi = yp0Var.f7674a;
            c0964yi.f7641t = null;
            if (kh0Var != null) {
                c0964yi.f7645x.f2628k = kh0Var;
                c0964yi.f7647z = 2;
            }
            i60Var.f2464f = null;
            C0964yi c0964yi2 = i60Var.f2461c;
            if (c0964yi2 != null) {
                c0964yi2.m5272m();
            }
            i60Var.f2461c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p000.InterfaceC0852vh
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo287a() {
        C0964yi c0964yi;
        b60 b60Var = this.f5056d;
        b60Var.f421t = true;
        jh0 jh0Var = this.f5061i;
        Object[] objArr = jh0Var.f2880c;
        long[] jArr = jh0Var.f2878a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (c0964yi = ((i60) objArr[(i << 3) + i3]).f2461c) != null) {
                            c0964yi.m5272m();
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
        b60Var.m281R();
        b60Var.f421t = false;
        jh0Var.m1695a();
        this.f5062j.m1695a();
        this.f5070r = 0;
        this.f5069q = 0;
        this.f5065m.m1695a();
        m3200h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0852vh
    /* JADX INFO: renamed from: b */
    public final void mo289b() {
        m3201i(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3197d(i60 i60Var, boolean z) {
        yp0 yp0Var = i60Var.f2464f;
        if (yp0Var != null) {
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            try {
                b60 b60Var = this.f5056d;
                b60Var.f421t = true;
                if (z) {
                    while (!yp0Var.m5289c()) {
                        try {
                            yp0Var.m5291e(new C0921xc(14));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                yp0Var.m5287a();
                i60Var.f2464f = null;
                b60Var.f421t = false;
            } finally {
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final v41 m3198f(Object obj) {
        return !this.f5056d.m272H() ? new n60() : new o60(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3199g(int i) {
        boolean z;
        boolean z2 = false;
        this.f5069q = 0;
        List listM308o = this.f5056d.m308o();
        ph0 ph0Var = (ph0) listM308o;
        int i2 = (ph0Var.f4858d.f5770f - this.f5070r) - 1;
        if (i <= i2) {
            this.f5066n.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objM1701g = this.f5061i.m1701g((b60) ph0Var.get(i3));
                    objM1701g.getClass();
                    ((eh0) this.f5066n.f7799e).m929a(((i60) objM1701g).f2459a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f5058f.mo23d(this.f5066n);
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            z = false;
            while (i2 >= i) {
                try {
                    b60 b60Var = (b60) ((ph0) listM308o).get(i2);
                    Object objM1701g2 = this.f5061i.m1701g(b60Var);
                    objM1701g2.getClass();
                    i60 i60Var = (i60) objM1701g2;
                    Object obj = i60Var.f2459a;
                    if (((eh0) this.f5066n.f7799e).m931c(obj)) {
                        this.f5069q++;
                        if (((Boolean) i60Var.f2465g.getValue()).booleanValue()) {
                            f60 f60Var = b60Var.f396J;
                            wd0 wd0Var = f60Var.f1607p;
                            z50 z50Var = z50.f7802f;
                            wd0Var.f7101o = z50Var;
                            ec0 ec0Var = f60Var.f1608q;
                            if (ec0Var != null) {
                                ec0Var.f1381m = z50Var;
                            }
                            m3204l(i60Var, false);
                            if (i60Var.f2466h) {
                                z = true;
                            }
                        }
                    } else {
                        b60 b60Var2 = this.f5056d;
                        b60Var2.f421t = true;
                        this.f5061i.m1705k(b60Var);
                        C0964yi c0964yi = i60Var.f2461c;
                        if (c0964yi != null) {
                            c0964yi.m5272m();
                        }
                        this.f5056d.m282S(i2, 1);
                        b60Var2.f421t = false;
                    }
                    this.f5062j.m1705k(obj);
                    i2--;
                } catch (Throwable th) {
                    u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                    throw th;
                }
            }
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
        } else {
            z = false;
        }
        if (z) {
            synchronized (t21.f5893c) {
                kh0 kh0Var = t21.f5900j.f4268h;
                if (kh0Var != null) {
                    if (kh0Var.m1897h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                t21.m4163a();
            }
        }
        m3200h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3200h() {
        int i = ((ph0) this.f5056d.m308o()).f4858d.f5770f;
        jh0 jh0Var = this.f5061i;
        if (jh0Var.f2882e != i) {
            w10.m4823a("Inconsistency between the count of nodes tracked by the state (" + jh0Var.f2882e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f5069q) - this.f5070r < 0) {
            w10.m4823a("Incorrect state. Total children " + i + ". Reusable children " + this.f5069q + ". Precomposed children " + this.f5070r);
        }
        jh0 jh0Var2 = this.f5065m;
        if (jh0Var2.f2882e == this.f5070r) {
            return;
        }
        w10.m4823a("Incorrect state. Precomposed children " + this.f5070r + ". Map size " + jh0Var2.f2882e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m3201i(boolean z) {
        this.f5070r = 0;
        this.f5065m.m1695a();
        List listM308o = this.f5056d.m308o();
        int i = ((ph0) listM308o).f4858d.f5770f;
        if (this.f5069q != i) {
            this.f5069q = i;
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    b60 b60Var = (b60) ((ph0) listM308o).get(i2);
                    i60 i60Var = (i60) this.f5061i.m1701g(b60Var);
                    if (i60Var != null && ((Boolean) i60Var.f2465g.getValue()).booleanValue()) {
                        f60 f60Var = b60Var.f396J;
                        wd0 wd0Var = f60Var.f1607p;
                        z50 z50Var = z50.f7802f;
                        wd0Var.f7101o = z50Var;
                        ec0 ec0Var = f60Var.f1608q;
                        if (ec0Var != null) {
                            ec0Var.f1381m = z50Var;
                        }
                        m3204l(i60Var, z);
                        i60Var.f2459a = AbstractC0307i4.f2436q;
                    }
                } catch (Throwable th) {
                    u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                    throw th;
                }
            }
            u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
            this.f5062j.m1695a();
        }
        m3200h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m3202j(int i, int i2) {
        b60 b60Var = this.f5056d;
        b60Var.f421t = true;
        b60Var.m276L(i, i2, 1);
        b60Var.f421t = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m3203k(Object obj, InterfaceC0904ww interfaceC0904ww, boolean z) {
        b60 b60Var = this.f5056d;
        if (b60Var.m272H()) {
            m3200h();
            if (this.f5062j.m1697c(obj)) {
                return;
            }
            this.f5067o.m1705k(obj);
            jh0 jh0Var = this.f5065m;
            Object objM1701g = jh0Var.m1701g(obj);
            if (objM1701g == null) {
                objM1701g = m3206n(obj);
                if (objM1701g != null) {
                    m3202j(((ph0) b60Var.m308o()).f4858d.m4079i(objM1701g), ((ph0) b60Var.m308o()).f4858d.f5770f);
                    this.f5070r++;
                } else {
                    int i = ((ph0) b60Var.m308o()).f4858d.f5770f;
                    b60 b60Var2 = new b60(2);
                    b60Var.f421t = true;
                    b60Var.m266B(i, b60Var2);
                    b60Var.f421t = false;
                    this.f5070r++;
                    objM1701g = b60Var2;
                }
                jh0Var.m1707m(obj, objM1701g);
            }
            m3205m((b60) objM1701g, obj, z, interfaceC0904ww);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m3204l(i60 i60Var, boolean z) {
        C0964yi c0964yi;
        if (z || !i60Var.f2466h) {
            i60Var.f2465g = r60.m3419u(Boolean.FALSE);
        } else {
            i60Var.f2465g.setValue(Boolean.FALSE);
        }
        if (i60Var.f2464f != null) {
            m3196e(i60Var);
            return;
        }
        if (z) {
            C0964yi c0964yi2 = i60Var.f2461c;
            if (c0964yi2 != null) {
                c0964yi2.m5271l();
                return;
            }
            return;
        }
        vm0 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(this.f5056d)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (i60Var.f2466h || (c0964yi = i60Var.f2461c) == null) {
                return;
            }
            c0964yi.m5271l();
            return;
        }
        C0310i7 c0310i7 = new C0310i7(4, i60Var);
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) outOfFrameExecutor;
        C0917x8 c0917x8 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6961k;
        boolean zIsEmpty = c0917x8.isEmpty();
        c0917x8.addLast(c0310i7);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC0875w3.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC0875w3.f6963l);
            } else {
                C0921xc.m5131l("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d4, B:66:0x00d8, B:72:0x010e, B:67:0x00e5, B:68:0x00f0, B:70:0x00f4, B:71:0x010b, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0118, B:76:0x0122), top: B:79:0x0076 }] */
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
    public final void m3205m(b60 b60Var, Object obj, boolean z, InterfaceC0904ww interfaceC0904ww) {
        boolean z2;
        C0964yi c0964yi;
        jh0 jh0Var = this.f5061i;
        Object objM1701g = jh0Var.m1701g(b60Var);
        Object obj2 = objM1701g;
        if (objM1701g == null) {
            C0474mh c0474mh = AbstractC0689rh.f5417a;
            i60 i60Var = new i60();
            i60Var.f2459a = obj;
            i60Var.f2460b = c0474mh;
            i60Var.f2461c = null;
            i60Var.f2465g = r60.m3419u(Boolean.TRUE);
            jh0Var.m1707m(b60Var, i60Var);
            obj2 = i60Var;
        }
        i60 i60Var2 = (i60) obj2;
        boolean z3 = i60Var2.f2460b != interfaceC0904ww;
        if (i60Var2.f2464f != null) {
            if (z3) {
                m3196e(i60Var2);
            } else if (z) {
                return;
            } else {
                m3197d(i60Var2, true);
            }
        }
        C0964yi c0964yi2 = i60Var2.f2461c;
        if (c0964yi2 != null) {
            synchronized (c0964yi2.f7628g) {
                z2 = c0964yi2.f7638q.f2882e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || i60Var2.f2462d) {
            i60Var2.f2460b = interfaceC0904ww;
            if (i60Var2.f2464f != null) {
                w10.m4823a("new subcompose call while paused composition is still active");
            }
            l21 l21VarM4270k = u50.m4270k();
            InterfaceC0742sw interfaceC0742swMo809e = l21VarM4270k != null ? l21VarM4270k.mo809e() : null;
            l21 l21VarM4276s = u50.m4276s(l21VarM4270k);
            try {
                b60 b60Var2 = this.f5056d;
                b60Var2.f421t = true;
                C0964yi c0964yi3 = i60Var2.f2461c;
                AbstractC0727si abstractC0727si = this.f5057e;
                if (abstractC0727si == null) {
                    w10.m4825c("parent composition reference not set");
                    throw new C0725sg();
                }
                if (c0964yi3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = ye1.f7616a;
                        c0964yi = new C0964yi(abstractC0727si, new ja1(b60Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = ye1.f7616a;
                        c0964yi = new C0964yi(abstractC0727si, new ja1(b60Var));
                    }
                    c0964yi3 = c0964yi;
                } else {
                    if (c0964yi3.f7647z == 3) {
                        if (z) {
                        }
                        c0964yi3 = c0964yi;
                    }
                }
                i60Var2.f2461c = c0964yi3;
                InterfaceC0904ww c0474mh2 = i60Var2.f2460b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(this.f5056d)).getOutOfFrameExecutor() != null) {
                    i60Var2.f2466h = false;
                } else {
                    i60Var2.f2466h = true;
                    c0474mh2 = new C0474mh(1524156494, true, new C0459m4(2, i60Var2, c0474mh2));
                }
                if (z) {
                    if (i60Var2.f2463e) {
                        c0964yi3.m5268i();
                        c0964yi3.m5276q();
                        i60Var2.f2464f = c0964yi3.m5270k(true, c0474mh2);
                    } else {
                        i60Var2.f2464f = c0964yi3.m5270k(c0964yi3.m5268i(), c0474mh2);
                    }
                } else if (i60Var2.f2463e) {
                    c0964yi3.m5268i();
                    c0964yi3.m5276q();
                    C0616pi c0616pi = c0964yi3.f7646y;
                    c0616pi.f4905z = 100;
                    c0616pi.f4904y = true;
                    c0964yi3.f7625d.mo2708a(c0964yi3, c0474mh2);
                    c0616pi.m3122s();
                } else {
                    c0964yi3.m5259B(c0474mh2);
                }
                i60Var2.f2463e = false;
                b60Var2.f421t = false;
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                i60Var2.f2462d = false;
            } catch (Throwable th) {
                u50.m4283z(l21VarM4270k, l21VarM4276s, interfaceC0742swMo809e);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final b60 m3206n(Object obj) {
        jh0 jh0Var;
        int i;
        if (this.f5069q == 0) {
            return null;
        }
        ph0 ph0Var = (ph0) this.f5056d.m308o();
        int i2 = ph0Var.f4858d.f5770f - this.f5070r;
        int i3 = i2 - this.f5069q;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            jh0Var = this.f5061i;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objM1701g = jh0Var.m1701g((b60) ph0Var.get(i5));
            objM1701g.getClass();
            if (p30.m3002l(((i60) objM1701g).f2459a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                Object objM1701g2 = jh0Var.m1701g((b60) ph0Var.get(i4));
                objM1701g2.getClass();
                i60 i60Var = (i60) objM1701g2;
                Object obj2 = i60Var.f2459a;
                if (obj2 == AbstractC0307i4.f2436q || this.f5058f.mo24h(obj, obj2)) {
                    i60Var.f2459a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            m3202j(i5, i3);
        }
        this.f5069q--;
        b60 b60Var = (b60) ph0Var.get(i3);
        Object objM1701g3 = jh0Var.m1701g(b60Var);
        objM1701g3.getClass();
        i60 i60Var2 = (i60) objM1701g3;
        i60Var2.f2465g = r60.m3419u(Boolean.TRUE);
        i60Var2.f2463e = true;
        i60Var2.f2462d = true;
        return b60Var;
    }
}

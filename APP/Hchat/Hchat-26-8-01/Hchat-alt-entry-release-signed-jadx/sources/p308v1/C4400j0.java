package p308v1;

import af.C0081d;
import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import okio.C3193a;
import p002a1.C0009g;
import p020b5.C0190i;
import p041d1.C0655c0;
import p068eh.AbstractC0921a;
import p069f.AbstractC0957r0;
import p069f.AbstractC0959s0;
import p069f.C0929d0;
import p069f.C0935g0;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0963u0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1863o;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1853l1;
import p117i0.C1871q;
import p117i0.EnumC1857m1;
import p117i0.InterfaceC1835h;
import p131j0.C2046b;
import p136j8.C2104o;
import p266s0.C3874d;
import p292u1.AbstractC4229a;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4666q;
import p339x1.AbstractC5613i0;
import p339x1.C5602f0;
import p339x1.C5604f2;
import p339x1.C5616j0;
import p339x1.C5640r0;
import p339x1.C5652v0;
import p339x1.EnumC5594d0;
import p339x1.InterfaceC5635p1;
import p357y1.AbstractC5961z2;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import tf.C4164k;

/* JADX INFO: renamed from: v1.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4400j0 implements InterfaceC1835h {

    /* JADX INFO: renamed from: g */
    public final C5602f0 f14648g;

    /* JADX INFO: renamed from: h */
    public AbstractC1863o f14649h;

    /* JADX INFO: renamed from: i */
    public InterfaceC4407l1 f14650i;

    /* JADX INFO: renamed from: j */
    public int f14651j;

    /* JADX INFO: renamed from: k */
    public int f14652k;

    /* JADX INFO: renamed from: l */
    public final C0943k0 f14653l;

    /* JADX INFO: renamed from: m */
    public final C0943k0 f14654m;

    /* JADX INFO: renamed from: n */
    public final C4382d0 f14655n;

    /* JADX INFO: renamed from: o */
    public final C4373a0 f14656o;

    /* JADX INFO: renamed from: p */
    public final C0943k0 f14657p;

    /* JADX INFO: renamed from: q */
    public final C0963u0 f14658q;

    /* JADX INFO: renamed from: r */
    public final C0943k0 f14659r;

    /* JADX INFO: renamed from: s */
    public final C2046b f14660s;

    /* JADX INFO: renamed from: t */
    public int f14661t;

    /* JADX INFO: renamed from: u */
    public int f14662u;

    /* JADX INFO: renamed from: v */
    public final String f14663v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4400j0(C5602f0 c5602f0, InterfaceC4407l1 interfaceC4407l1) {
        this.f14648g = c5602f0;
        this.f14650i = interfaceC4407l1;
        long[] jArr = AbstractC0957r0.f3015a;
        this.f14653l = new C0943k0();
        this.f14654m = new C0943k0();
        this.f14655n = new C4382d0(this);
        this.f14656o = new C4373a0(this);
        this.f14657p = new C0943k0();
        this.f14658q = new C0963u0();
        this.f14659r = new C0943k0();
        this.f14660s = new C2046b(new Object[16]);
        this.f14663v = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m8843c(C4400j0 c4400j0, Object obj) {
        C5602f0 c5602f0 = c4400j0.f14648g;
        c4400j0.m8848h();
        C5602f0 c5602f02 = (C5602f0) c4400j0.f14657p.m2324k(obj);
        if (c5602f02 != null) {
            if (c4400j0.f14662u <= 0) {
                AbstractC4229a.m8494b("No pre-composed items to dispose");
            }
            int iM5063i = ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).m5063i(c5602f02);
            if (iM5063i < ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i - c4400j0.f14662u) {
                AbstractC4229a.m8494b("Item is not in pre-composed item range");
            }
            c4400j0.f14661t++;
            c4400j0.f14662u--;
            C4376b0 c4376b0 = (C4376b0) c4400j0.f14653l.m2320g(c5602f02);
            if (c4376b0 != null) {
                m8844e(c4376b0);
            }
            int i9 = (((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i - c4400j0.f14662u) - c4400j0.f14661t;
            c4400j0.m8850j(iM5063i, i9);
            c4400j0.m8847g(i9);
        }
        if (c4400j0.f14660s.m5062h(obj)) {
            C5602f0.m10001V(c5602f0, true, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m8844e(C4376b0 c4376b0) {
        C0945l0 c0945l0;
        C1853l1 c1853l1 = c4376b0.f14590f;
        if (c1853l1 != null) {
            c1853l1.f6164h.set(EnumC1857m1.f6177h);
            C0190i c0190i = c1853l1.f6167k;
            if (((C0945l0) c0190i.f479e).m2335h()) {
                c0945l0 = (C0945l0) c0190i.f479e;
                C0945l0 c0945l02 = AbstractC0959s0.f3019a;
                c0190i.f479e = new C0945l0();
                ((C2046b) c0190i.f478d).m5061g();
            } else {
                c0945l0 = null;
            }
            c0190i.m840b();
            C1871q c1871q = c1853l1.f6157a;
            c1871q.f6218w = null;
            if (c0945l0 != null) {
                c1871q.f6199A.f485k = c0945l0;
                c1871q.f6201C = 2;
            }
            c4376b0.f14590f = null;
            C1871q c1871q2 = c4376b0.f14587c;
            if (c1871q2 != null) {
                c1871q2.m4600m();
            }
            c4376b0.f14587c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p117i0.InterfaceC1835h
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4496a() {
        C1871q c1871q;
        C5602f0 c5602f0 = this.f14648g;
        c5602f0.f22806w = true;
        C0943k0 c0943k0 = this.f14653l;
        Object[] objArr = c0943k0.f2970c;
        long[] jArr = c0943k0.f2968a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr[i9];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j3) < 128 && (c1871q = ((C4376b0) objArr[(i9 << 3) + i11]).f14587c) != null) {
                            c1871q.m4600m();
                        }
                        j3 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    } else if (i9 == length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        c5602f0.m10018P();
        c5602f0.f22806w = false;
        c0943k0.m2314a();
        this.f14654m.m2314a();
        this.f14662u = 0;
        this.f14661t = 0;
        this.f14657p.m2314a();
        m8848h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1835h
    /* JADX INFO: renamed from: b */
    public final void mo4497b() {
        m8849i(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8845d(C4376b0 c4376b0, boolean z9) {
        C1853l1 c1853l1 = c4376b0.f14590f;
        if (c1853l1 != null) {
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            try {
                C5602f0 c5602f0 = this.f14648g;
                c5602f0.f22806w = true;
                if (z9) {
                    while (!c1853l1.m4570c()) {
                        try {
                            c1853l1.m4572e(new C3193a(21));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                c1853l1.m4568a();
                c4376b0.f14590f = null;
                c5602f0.f22806w = false;
            } finally {
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InterfaceC4395h1 m8846f(Object obj) {
        return !this.f14648g.m10010G() ? new C4391g0() : new C4394h0(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m8847g(int i9) {
        boolean z9;
        boolean z10 = false;
        this.f14661t = 0;
        List listM10043o = this.f14648g.m10043o();
        C0929d0 c0929d0 = (C0929d0) listM10043o;
        int i10 = (((C2046b) c0929d0.f2909h).f6893i - this.f14662u) - 1;
        if (i9 <= i10) {
            this.f14658q.clear();
            if (i9 <= i10) {
                int i11 = i9;
                while (true) {
                    Object objM2320g = this.f14653l.m2320g((C5602f0) c0929d0.get(i11));
                    objM2320g.getClass();
                    ((C0935g0) this.f14658q.f3034h).m2302a(((C4376b0) objM2320g).f14585a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f14650i.mo7024f(this.f14658q);
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            z9 = false;
            while (i10 >= i9) {
                try {
                    C5602f0 c5602f0 = (C5602f0) ((C0929d0) listM10043o).get(i10);
                    Object objM2320g2 = this.f14653l.m2320g(c5602f0);
                    objM2320g2.getClass();
                    C4376b0 c4376b0 = (C4376b0) objM2320g2;
                    Object obj = c4376b0.f14585a;
                    if (((C0935g0) this.f14658q.f3034h).m2304c(obj)) {
                        this.f14661t++;
                        if (((Boolean) c4376b0.f14591g.getValue()).booleanValue()) {
                            C5616j0 c5616j0 = c5602f0.f22779M;
                            C5652v0 c5652v0 = c5616j0.f22891p;
                            EnumC5594d0 enumC5594d0 = EnumC5594d0.f22745i;
                            c5652v0.f23035r = enumC5594d0;
                            C5640r0 c5640r0 = c5616j0.f22892q;
                            if (c5640r0 != null) {
                                c5640r0.f22964p = enumC5594d0;
                            }
                            m8852l(c4376b0, false);
                            if (c4376b0.f14592h) {
                                z9 = true;
                            }
                        }
                    } else {
                        C5602f0 c5602f02 = this.f14648g;
                        c5602f02.f22806w = true;
                        this.f14653l.m2324k(c5602f0);
                        C1871q c1871q = c4376b0.f14587c;
                        if (c1871q != null) {
                            c1871q.m4600m();
                        }
                        this.f14648g.m10019Q(i10, 1);
                        c5602f02.f22806w = false;
                    }
                    this.f14654m.m2324k(obj);
                    i10--;
                } catch (Throwable th2) {
                    AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                    throw th2;
                }
            }
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
        } else {
            z9 = false;
        }
        if (z9) {
            synchronized (AbstractC4662m.f15512c) {
                C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
                if (c0945l0 != null) {
                    if (c0945l0.m2335h()) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                AbstractC4662m.m9120a();
            }
        }
        m8848h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m8848h() {
        int i9 = ((C2046b) ((C0929d0) this.f14648g.m10043o()).f2909h).f6893i;
        C0943k0 c0943k0 = this.f14653l;
        if (c0943k0.f2972e != i9) {
            AbstractC4229a.m8493a("Inconsistency between the count of nodes tracked by the state (" + c0943k0.f2972e + ") and the children count on the SubcomposeLayout (" + i9 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i9 - this.f14661t) - this.f14662u < 0) {
            StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Incorrect state. Total children ", ". Reusable children ");
            sbM2257t.append(this.f14661t);
            sbM2257t.append(". Precomposed children ");
            sbM2257t.append(this.f14662u);
            AbstractC4229a.m8493a(sbM2257t.toString());
        }
        C0943k0 c0943k02 = this.f14657p;
        if (c0943k02.f2972e == this.f14662u) {
            return;
        }
        AbstractC4229a.m8493a("Incorrect state. Precomposed children " + this.f14662u + ". Map size " + c0943k02.f2972e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m8849i(boolean z9) {
        this.f14662u = 0;
        this.f14657p.m2314a();
        List listM10043o = this.f14648g.m10043o();
        int i9 = ((C2046b) ((C0929d0) listM10043o).f2909h).f6893i;
        if (this.f14661t != i9) {
            this.f14661t = i9;
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            for (int i10 = 0; i10 < i9; i10++) {
                try {
                    C5602f0 c5602f0 = (C5602f0) ((C0929d0) listM10043o).get(i10);
                    C4376b0 c4376b0 = (C4376b0) this.f14653l.m2320g(c5602f0);
                    if (c4376b0 != null && ((Boolean) c4376b0.f14591g.getValue()).booleanValue()) {
                        C5616j0 c5616j0 = c5602f0.f22779M;
                        C5652v0 c5652v0 = c5616j0.f22891p;
                        EnumC5594d0 enumC5594d0 = EnumC5594d0.f22745i;
                        c5652v0.f23035r = enumC5594d0;
                        C5640r0 c5640r0 = c5616j0.f22892q;
                        if (c5640r0 != null) {
                            c5640r0.f22964p = enumC5594d0;
                        }
                        m8852l(c4376b0, z9);
                        c4376b0.f14585a = AbstractC4434w.f14743a;
                    }
                } catch (Throwable th2) {
                    AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                    throw th2;
                }
            }
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            this.f14654m.m2314a();
        }
        m8848h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m8850j(int i9, int i10) {
        C5602f0 c5602f0 = this.f14648g;
        c5602f0.f22806w = true;
        c5602f0.m10014K(i9, i10, 1);
        c5602f0.f22806w = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m8851k(Object obj, InterfaceC1235p interfaceC1235p, boolean z9) {
        C5602f0 c5602f0 = this.f14648g;
        if (c5602f0.m10010G()) {
            m8848h();
            if (this.f14654m.m2316c(obj)) {
                return;
            }
            this.f14659r.m2324k(obj);
            C0943k0 c0943k0 = this.f14657p;
            Object objM2320g = c0943k0.m2320g(obj);
            if (objM2320g == null) {
                objM2320g = m8854n(obj);
                if (objM2320g != null) {
                    m8850j(((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).m5063i(objM2320g), ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i);
                    this.f14662u++;
                } else {
                    int i9 = ((C2046b) ((C0929d0) c5602f0.m10043o()).f2909h).f6893i;
                    C5602f0 c5602f02 = new C5602f0(2);
                    c5602f0.f22806w = true;
                    c5602f0.m10004A(i9, c5602f02);
                    c5602f0.f22806w = false;
                    this.f14662u++;
                    objM2320g = c5602f02;
                }
                c0943k0.m2326m(obj, objM2320g);
            }
            m8853m((C5602f0) objM2320g, obj, z9, interfaceC1235p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8852l(C4376b0 c4376b0, boolean z9) {
        C1871q c1871q;
        if (z9 || !c4376b0.f14592h) {
            c4376b0.f14591g = AbstractC1874r.m4639u(Boolean.FALSE);
        } else {
            c4376b0.f14591g.setValue(Boolean.FALSE);
        }
        if (c4376b0.f14590f != null) {
            m8844e(c4376b0);
            return;
        }
        if (z9) {
            C1871q c1871q2 = c4376b0.f14587c;
            if (c1871q2 != null) {
                c1871q2.m4599l();
                return;
            }
            return;
        }
        InterfaceC5635p1 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f14648g)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (c4376b0.f14592h || (c1871q = c4376b0.f14587c) == null) {
                return;
            }
            c1871q.m4599l();
            return;
        }
        C0655c0 c0655c0 = new C0655c0(c4376b0, 14);
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = (ViewTreeObserverOnGlobalLayoutListenerC5934t) outOfFrameExecutor;
        C4164k c4164k = viewTreeObserverOnGlobalLayoutListenerC5934t.f24126o;
        boolean zIsEmpty = c4164k.isEmpty();
        c4164k.addLast(c0655c0);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC5934t.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC5934t.f24128p);
            } else {
                C2104o.m5294t("schedule is called when outOfFrameExecutor is not available (view is detached)");
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
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8853m(C5602f0 c5602f0, Object obj, boolean z9, InterfaceC1235p interfaceC1235p) {
        boolean z10;
        C1871q c1871q;
        C0943k0 c0943k0 = this.f14653l;
        Object objM2320g = c0943k0.m2320g(c5602f0);
        Object obj2 = objM2320g;
        if (objM2320g == null) {
            C3874d c3874d = AbstractC4387f.f14623a;
            C4376b0 c4376b0 = new C4376b0();
            c4376b0.f14585a = obj;
            c4376b0.f14586b = c3874d;
            c4376b0.f14587c = null;
            c4376b0.f14591g = AbstractC1874r.m4639u(Boolean.TRUE);
            c0943k0.m2326m(c5602f0, c4376b0);
            obj2 = c4376b0;
        }
        C4376b0 c4376b02 = (C4376b0) obj2;
        int i9 = 1;
        boolean z11 = c4376b02.f14586b != interfaceC1235p;
        if (c4376b02.f14590f != null) {
            if (z11) {
                m8844e(c4376b02);
            } else if (z9) {
                return;
            } else {
                m8845d(c4376b02, true);
            }
        }
        C1871q c1871q2 = c4376b02.f14587c;
        if (c1871q2 != null) {
            synchronized (c1871q2.f6205j) {
                z10 = c1871q2.f6215t.f2972e > 0;
            }
        } else {
            z10 = true;
        }
        if (z11 || z10 || c4376b02.f14588d) {
            c4376b02.f14586b = interfaceC1235p;
            if (c4376b02.f14590f != null) {
                AbstractC4229a.m8493a("new subcompose call while paused composition is still active");
            }
            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
            InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
            AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
            try {
                C5602f0 c5602f02 = this.f14648g;
                c5602f02.f22806w = true;
                C1871q c1871q3 = c4376b02.f14587c;
                AbstractC1863o abstractC1863o = this.f14649h;
                if (abstractC1863o == null) {
                    AbstractC4229a.m8495c("parent composition reference not set");
                    throw new C0081d();
                }
                if (c1871q3 == null) {
                    if (z9) {
                        ViewGroup.LayoutParams layoutParams = AbstractC5961z2.f24236a;
                        c1871q = new C1871q(abstractC1863o, new C5604f2(c5602f0));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC5961z2.f24236a;
                        c1871q = new C1871q(abstractC1863o, new C5604f2(c5602f0));
                    }
                    c1871q3 = c1871q;
                } else {
                    if (c1871q3.f6201C == 3) {
                        if (z9) {
                        }
                        c1871q3 = c1871q;
                    }
                }
                c4376b02.f14587c = c1871q3;
                InterfaceC1235p c3874d2 = c4376b02.f14586b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f14648g)).getOutOfFrameExecutor() != null) {
                    c4376b02.f14592h = false;
                } else {
                    c4376b02.f14592h = true;
                    c3874d2 = new C3874d(1524156494, new C0009g(c4376b02, i9, c3874d2), true);
                }
                if (z9) {
                    if (c4376b02.f14589e) {
                        c1871q3.m4596i();
                        c1871q3.m4604q();
                        c4376b02.f14590f = c1871q3.m4598k(true, c3874d2);
                    } else {
                        c4376b02.f14590f = c1871q3.m4598k(c1871q3.m4596i(), c3874d2);
                    }
                } else if (c4376b02.f14589e) {
                    c1871q3.m4596i();
                    c1871q3.m4604q();
                    C1836h0 c1836h0 = c1871q3.f6200B;
                    c1836h0.f6122z = 0;
                    c1836h0.f6121y = true;
                    c1871q3.f6202g.mo4461a(c1871q3, c3874d2);
                    c1836h0.m4558u();
                } else {
                    c1871q3.m4587A(c3874d2);
                }
                c4376b02.f14589e = false;
                c5602f02.f22806w = false;
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                c4376b02.f14588d = false;
            } catch (Throwable th2) {
                AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final C5602f0 m8854n(Object obj) {
        C0943k0 c0943k0;
        int i9;
        if (this.f14661t == 0) {
            return null;
        }
        C0929d0 c0929d0 = (C0929d0) this.f14648g.m10043o();
        int i10 = ((C2046b) c0929d0.f2909h).f6893i - this.f14662u;
        int i11 = i10 - this.f14661t;
        int i12 = i10 - 1;
        int i13 = i12;
        while (true) {
            c0943k0 = this.f14653l;
            if (i13 < i11) {
                i9 = -1;
                break;
            }
            Object objM2320g = c0943k0.m2320g((C5602f0) c0929d0.get(i13));
            objM2320g.getClass();
            if (((C4376b0) objM2320g).f14585a.equals(obj)) {
                i9 = i13;
                break;
            }
            i13--;
        }
        if (i9 == -1) {
            while (i12 >= i11) {
                Object objM2320g2 = c0943k0.m2320g((C5602f0) c0929d0.get(i12));
                objM2320g2.getClass();
                C4376b0 c4376b0 = (C4376b0) objM2320g2;
                Object obj2 = c4376b0.f14585a;
                if (obj2 == AbstractC4434w.f14743a || this.f14650i.mo7025g(obj, obj2)) {
                    c4376b0.f14585a = obj;
                    i13 = i12;
                    i9 = i13;
                    break;
                }
                i12--;
            }
            i13 = i12;
        }
        if (i9 == -1) {
            return null;
        }
        if (i13 != i11) {
            m8850j(i13, i11);
        }
        this.f14661t--;
        C5602f0 c5602f0 = (C5602f0) c0929d0.get(i11);
        Object objM2320g3 = c0943k0.m2320g(c5602f0);
        objM2320g3.getClass();
        C4376b0 c4376b02 = (C4376b0) objM2320g3;
        c4376b02.f14591g = AbstractC1874r.m4639u(Boolean.TRUE);
        c4376b02.f14589e = true;
        c4376b02.f14588d = true;
        return c5602f0;
    }
}

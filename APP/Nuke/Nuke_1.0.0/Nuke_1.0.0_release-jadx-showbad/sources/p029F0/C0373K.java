package p029F0;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
import p001A0.C0102b;
import p011B4.AbstractC0231b;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p041H0.AbstractC0567L;
import p041H0.C0560F0;
import p041H0.C0564I;
import p041H0.C0568M;
import p041H0.C0576V;
import p041H0.C0580Z;
import p041H0.EnumC0561G;
import p041H0.InterfaceC0610o0;
import p047I0.AbstractC0751n1;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p061L2.C0971k;
import p095T.AbstractC1385s;
import p095T.AbstractC1391v;
import p095T.C1370k0;
import p095T.C1383r;
import p095T.C1397y;
import p095T.EnumC1372l0;
import p095T.InterfaceC1363h;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p136b0.C1849k;
import p154e2.C2023b;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2086r;
import p186k.AbstractC2415L;
import p186k.AbstractC2416M;
import p186k.C2405B;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2444z;
import p260x.C3438u;

/* JADX INFO: renamed from: F0.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0373K implements InterfaceC1363h {

    /* JADX INFO: renamed from: d */
    public final C0564I f1171d;

    /* JADX INFO: renamed from: e */
    public AbstractC1391v f1172e;

    /* JADX INFO: renamed from: f */
    public C2023b f1173f;

    /* JADX INFO: renamed from: g */
    public int f1174g;

    /* JADX INFO: renamed from: h */
    public int f1175h;

    /* JADX INFO: renamed from: i */
    public final C2408E f1176i;

    /* JADX INFO: renamed from: j */
    public final C2408E f1177j;

    /* JADX INFO: renamed from: k */
    public final C0367E f1178k;

    /* JADX INFO: renamed from: l */
    public final C0364B f1179l;

    /* JADX INFO: renamed from: m */
    public final C2408E f1180m;

    /* JADX INFO: renamed from: n */
    public final C0417o0 f1181n;

    /* JADX INFO: renamed from: o */
    public final C2408E f1182o;

    /* JADX INFO: renamed from: p */
    public final C1483e f1183p;

    /* JADX INFO: renamed from: q */
    public int f1184q;

    /* JADX INFO: renamed from: r */
    public int f1185r;

    /* JADX INFO: renamed from: s */
    public final String f1186s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0373K(C0564I c0564i, C2023b c2023b) {
        this.f1171d = c0564i;
        this.f1173f = c2023b;
        long[] jArr = AbstractC2415L.f7816a;
        this.f1176i = new C2408E();
        this.f1177j = new C2408E();
        this.f1178k = new C0367E(this);
        this.f1179l = new C0364B(this);
        this.f1180m = new C2408E();
        this.f1181n = new C0417o0();
        this.f1182o = new C2408E();
        this.f1183p = new C1483e(new Object[16]);
        this.f1186s = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m616d(C0365C c0365c) {
        C2409F c2409f;
        C1370k0 c1370k0 = c0365c.f1144f;
        if (c1370k0 != null) {
            c1370k0.f4828h.set(EnumC1372l0.f4835e);
            C1849k c1849k = c1370k0.f4831k;
            if (c1849k.f6261d.m4286h()) {
                c2409f = c1849k.f6261d;
                C2409F c2409f2 = AbstractC2416M.f7817a;
                c1849k.f6261d = new C2409F();
                c1849k.f6260c.m2758g();
            } else {
                c2409f = null;
            }
            c1849k.m3318b();
            C1397y c1397y = c1370k0.f4821a;
            c1397y.f4971t = null;
            if (c2409f != null) {
                c1397y.f4975x.f6268k = c2409f;
                c1397y.f4977z = 2;
            }
            c0365c.f1144f = null;
            C1397y c1397y2 = c0365c.f1141c;
            if (c1397y2 != null) {
                c1397y2.m2659m();
            }
            c0365c.f1141c = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m617a(C0365C c0365c, boolean z5) {
        C1370k0 c1370k0 = c0365c.f1144f;
        if (c1370k0 != null) {
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            try {
                C0564I c0564i = this.f1171d;
                c0564i.f1728u = true;
                if (z5) {
                    while (!c1370k0.m2515c()) {
                        try {
                            c1370k0.m2517e(new C0363A(0));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c1370k0.m2513a();
                c0365c.f1144f = null;
                c0564i.f1728u = false;
            } finally {
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // p095T.InterfaceC1363h
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo618b() {
        C1397y c1397y;
        C0564I c0564i = this.f1171d;
        c0564i.f1728u = true;
        C2408E c2408e = this.f1176i;
        Object[] objArr = c2408e.f7789c;
        long[] jArr = c2408e.f7787a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128 && (c1397y = ((C0365C) objArr[(i5 << 3) + i7]).f1141c) != null) {
                            c1397y.m2659m();
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    } else if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        c0564i.m808P();
        c0564i.f1728u = false;
        c2408e.m4266a();
        this.f1177j.m4266a();
        this.f1185r = 0;
        this.f1184q = 0;
        this.f1180m.m4266a();
        m622g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1363h
    /* JADX INFO: renamed from: c */
    public final void mo619c() {
        m623h(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final InterfaceC0409k0 m620e(Object obj) {
        return !this.f1171d.m799G() ? new C0370H() : new C0371I(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m621f(int i5) {
        boolean z5;
        boolean z6 = false;
        this.f1184q = 0;
        List listM833o = this.f1171d.m833o();
        C1480b c1480b = (C1480b) listM833o;
        int i6 = (((C1483e) c1480b.f5173e).f5183f - this.f1185r) - 1;
        if (i5 <= i6) {
            this.f1181n.clear();
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    Object objM4272g = this.f1176i.m4272g((C0564I) c1480b.get(i7));
                    AbstractC1665j.m2982b(objM4272g);
                    ((C2405B) this.f1181n.f1256e).m4257a(((C0365C) objM4272g).f1139a);
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            C2023b c2023b = this.f1173f;
            C0417o0 c0417o0 = this.f1181n;
            C2444z c2444z = (C2444z) c2023b.f6753f;
            c2444z.m4361a();
            C2405B c2405b = (C2405B) c0417o0.f1256e;
            Object[] objArr = c2405b.f7770b;
            long[] jArr = c2405b.f7771c;
            int i8 = c2405b.f7773e;
            while (i8 != Integer.MAX_VALUE) {
                int i9 = (int) ((jArr[i8] >> 31) & 2147483647L);
                Object obj = objArr[i8];
                Object objM5704b = ((C3438u) c2023b.f6752e).m5704b(obj);
                int iM4364d = c2444z.m4364d(objM5704b);
                int i10 = iM4364d >= 0 ? c2444z.f7900c[iM4364d] : 0;
                if (i10 == 7) {
                    c0417o0.remove(obj);
                } else {
                    c2444z.m4367g(i10 + 1, objM5704b);
                }
                i8 = i9;
            }
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            z5 = false;
            while (i6 >= i5) {
                try {
                    C0564I c0564i = (C0564I) ((C1480b) listM833o).get(i6);
                    Object objM4272g2 = this.f1176i.m4272g(c0564i);
                    AbstractC1665j.m2982b(objM4272g2);
                    C0365C c0365c = (C0365C) objM4272g2;
                    Object obj2 = c0365c.f1139a;
                    if (((C2405B) this.f1181n.f1256e).m4259c(obj2)) {
                        this.f1184q++;
                        if (((Boolean) c0365c.f1145g.getValue()).booleanValue()) {
                            C0568M c0568m = c0564i.f1700K;
                            C0580Z c0580z = c0568m.f1760p;
                            EnumC0561G enumC0561G = EnumC0561G.f1684f;
                            c0580z.f1852o = enumC0561G;
                            C0576V c0576v = c0568m.f1761q;
                            if (c0576v != null) {
                                c0576v.f1805m = enumC0561G;
                            }
                            m625j(c0365c, false);
                            if (c0365c.f1146h) {
                                z5 = true;
                            }
                        }
                    } else {
                        C0564I c0564i2 = this.f1171d;
                        c0564i2.f1728u = true;
                        this.f1176i.m4276k(c0564i);
                        C1397y c1397y = c0365c.f1141c;
                        if (c1397y != null) {
                            c1397y.m2659m();
                        }
                        this.f1171d.m809Q(i6, 1);
                        c0564i2.f1728u = false;
                    }
                    this.f1177j.m4276k(obj2);
                    i6--;
                } catch (Throwable th) {
                    AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                    throw th;
                }
            }
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (AbstractC2082n.f6972c) {
                C2409F c2409f = AbstractC2082n.f6979j.f6933h;
                if (c2409f != null) {
                    if (c2409f.m4286h()) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                AbstractC2082n.m3825a();
            }
        }
        m622g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m622g() {
        int i5 = ((C1483e) ((C1480b) this.f1171d.m833o()).f5173e).f5183f;
        C2408E c2408e = this.f1176i;
        if (c2408e.f7791e != i5) {
            AbstractC0277a.m482a("Inconsistency between the count of nodes tracked by the state (" + c2408e.f7791e + ") and the children count on the SubcomposeLayout (" + i5 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i5 - this.f1184q) - this.f1185r < 0) {
            StringBuilder sbM404o = AbstractC0231b.m404o(i5, "Incorrect state. Total children ", ". Reusable children ");
            sbM404o.append(this.f1184q);
            sbM404o.append(". Precomposed children ");
            sbM404o.append(this.f1185r);
            AbstractC0277a.m482a(sbM404o.toString());
        }
        C2408E c2408e2 = this.f1180m;
        if (c2408e2.f7791e == this.f1185r) {
            return;
        }
        AbstractC0277a.m482a("Incorrect state. Precomposed children " + this.f1185r + ". Map size " + c2408e2.f7791e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m623h(boolean z5) {
        this.f1185r = 0;
        this.f1180m.m4266a();
        List listM833o = this.f1171d.m833o();
        int i5 = ((C1483e) ((C1480b) listM833o).f5173e).f5183f;
        if (this.f1184q != i5) {
            this.f1184q = i5;
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            for (int i6 = 0; i6 < i5; i6++) {
                try {
                    C0564I c0564i = (C0564I) ((C1480b) listM833o).get(i6);
                    C0365C c0365c = (C0365C) this.f1176i.m4272g(c0564i);
                    if (c0365c != null && ((Boolean) c0365c.f1145g.getValue()).booleanValue()) {
                        C0568M c0568m = c0564i.f1700K;
                        C0580Z c0580z = c0568m.f1760p;
                        EnumC0561G enumC0561G = EnumC0561G.f1684f;
                        c0580z.f1852o = enumC0561G;
                        C0576V c0576v = c0568m.f1761q;
                        if (c0576v != null) {
                            c0576v.f1805m = enumC0561G;
                        }
                        m625j(c0365c, z5);
                        c0365c.f1139a = AbstractC0435z.f1307a;
                    }
                } catch (Throwable th) {
                    AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                    throw th;
                }
            }
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
            this.f1177j.m4266a();
        }
        m622g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m624i(int i5, int i6) {
        C0564I c0564i = this.f1171d;
        c0564i.f1728u = true;
        c0564i.m804L(i5, i6, 1);
        c0564i.f1728u = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m625j(C0365C c0365c, boolean z5) {
        C1397y c1397y;
        if (z5 || !c0365c.f1146h) {
            c0365c.f1145g = AbstractC1385s.m2629s(Boolean.FALSE);
        } else {
            c0365c.f1145g.setValue(Boolean.FALSE);
        }
        if (c0365c.f1144f != null) {
            m616d(c0365c);
            return;
        }
        if (z5) {
            C1397y c1397y2 = c0365c.f1141c;
            if (c1397y2 != null) {
                c1397y2.m2658l();
                return;
            }
            return;
        }
        InterfaceC0610o0 outOfFrameExecutor = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1171d)).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (c0365c.f1146h || (c1397y = c0365c.f1141c) == null) {
                return;
            }
            c1397y.m2658l();
            return;
        }
        C0102b c0102b = new C0102b(2, c0365c);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) outOfFrameExecutor;
        C0971k c0971k = viewTreeObserverOnGlobalLayoutListenerC0772y.f2479k;
        boolean zIsEmpty = c0971k.isEmpty();
        c0971k.addLast(c0102b);
        if (zIsEmpty) {
            Handler handler = viewTreeObserverOnGlobalLayoutListenerC0772y.getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(viewTreeObserverOnGlobalLayoutListenerC0772y.f2481l);
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
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m626k(C0564I c0564i, Object obj, boolean z5, InterfaceC1603e interfaceC1603e) {
        boolean z6;
        C1397y c1397y;
        C2408E c2408e = this.f1176i;
        Object objM4272g = c2408e.m4272g(c0564i);
        Object obj2 = objM4272g;
        if (objM4272g == null) {
            C1843e c1843e = AbstractC0400g.f1224a;
            C0365C c0365c = new C0365C();
            c0365c.f1139a = obj;
            c0365c.f1140b = c1843e;
            c0365c.f1141c = null;
            c0365c.f1145g = AbstractC1385s.m2629s(Boolean.TRUE);
            c2408e.m4278m(c0564i, c0365c);
            obj2 = c0365c;
        }
        C0365C c0365c2 = (C0365C) obj2;
        int i5 = 0;
        boolean z7 = c0365c2.f1140b != interfaceC1603e;
        if (c0365c2.f1144f != null) {
            if (z7) {
                m616d(c0365c2);
            } else if (z5) {
                return;
            } else {
                m617a(c0365c2, true);
            }
        }
        C1397y c1397y2 = c0365c2.f1141c;
        if (c1397y2 != null) {
            synchronized (c1397y2.f4958g) {
                z6 = c1397y2.f4968q.f7791e > 0;
            }
        } else {
            z6 = true;
        }
        if (z7 || z6 || c0365c2.f1142d) {
            c0365c2.f1140b = interfaceC1603e;
            if (c0365c2.f1144f != null) {
                AbstractC0277a.m482a("new subcompose call while paused composition is still active");
            }
            AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
            InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
            AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
            try {
                C0564I c0564i2 = this.f1171d;
                c0564i2.f1728u = true;
                C1397y c1397y3 = c0365c2.f1141c;
                AbstractC1391v abstractC1391v = this.f1172e;
                if (abstractC1391v == null) {
                    AbstractC0277a.m484c("parent composition reference not set");
                    throw new C0330q();
                }
                if (c1397y3 == null) {
                    if (z5) {
                        ViewGroup.LayoutParams layoutParams = AbstractC0751n1.f2336a;
                        c1397y = new C1397y(abstractC1391v, new C0560F0(c0564i));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = AbstractC0751n1.f2336a;
                        c1397y = new C1397y(abstractC1391v, new C0560F0(c0564i));
                    }
                    c1397y3 = c1397y;
                } else {
                    if (c1397y3.f4977z == 3) {
                        if (z5) {
                        }
                        c1397y3 = c1397y;
                    }
                }
                c0365c2.f1141c = c1397y3;
                InterfaceC1603e c1843e2 = c0365c2.f1140b;
                if (((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1171d)).getOutOfFrameExecutor() != null) {
                    c0365c2.f1146h = false;
                } else {
                    c0365c2.f1146h = true;
                    c1843e2 = new C1843e(1524156494, true, new C0372J(i5, c0365c2, c1843e2));
                }
                if (z5) {
                    if (c0365c2.f1143e) {
                        c1397y3.m2655i();
                        c1397y3.m2663q();
                        c0365c2.f1144f = c1397y3.m2657k(true, c1843e2);
                    } else {
                        c0365c2.f1144f = c1397y3.m2657k(c1397y3.m2655i(), c1843e2);
                    }
                } else if (c0365c2.f1143e) {
                    c1397y3.m2655i();
                    c1397y3.m2663q();
                    C1383r c1383r = c1397y3.f4976y;
                    c1383r.f4909z = 0;
                    c1383r.f4908y = true;
                    c1397y3.f4955d.mo2519a(c1397y3, c1843e2);
                    c1383r.m2600s();
                } else {
                    c1397y3.m2646B(c1843e2);
                }
                c0365c2.f1143e = false;
                c0564i2.f1728u = false;
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                c0365c2.f1142d = false;
            } catch (Throwable th) {
                AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C0564I m627l(Object obj) {
        C2408E c2408e;
        int i5;
        if (this.f1184q == 0) {
            return null;
        }
        C1480b c1480b = (C1480b) this.f1171d.m833o();
        int i6 = ((C1483e) c1480b.f5173e).f5183f - this.f1185r;
        int i7 = i6 - this.f1184q;
        int i8 = i6 - 1;
        int i9 = i8;
        while (true) {
            c2408e = this.f1176i;
            if (i9 < i7) {
                i5 = -1;
                break;
            }
            Object objM4272g = c2408e.m4272g((C0564I) c1480b.get(i9));
            AbstractC1665j.m2982b(objM4272g);
            if (((C0365C) objM4272g).f1139a.equals(obj)) {
                i5 = i9;
                break;
            }
            i9--;
        }
        if (i5 == -1) {
            while (i8 >= i7) {
                Object objM4272g2 = c2408e.m4272g((C0564I) c1480b.get(i8));
                AbstractC1665j.m2982b(objM4272g2);
                C0365C c0365c = (C0365C) objM4272g2;
                Object obj2 = c0365c.f1139a;
                if (obj2 != AbstractC0435z.f1307a) {
                    C3438u c3438u = (C3438u) this.f1173f.f6752e;
                    if (!AbstractC1665j.m2981a(c3438u.m5704b(obj), c3438u.m5704b(obj2))) {
                        i8--;
                    }
                }
                c0365c.f1139a = obj;
                i9 = i8;
                i5 = i9;
                break;
            }
            i9 = i8;
        }
        if (i5 == -1) {
            return null;
        }
        if (i9 != i7) {
            m624i(i9, i7);
        }
        this.f1184q--;
        C0564I c0564i = (C0564I) c1480b.get(i7);
        Object objM4272g3 = c2408e.m4272g(c0564i);
        AbstractC1665j.m2982b(objM4272g3);
        C0365C c0365c2 = (C0365C) objM4272g3;
        c0365c2.f1145g = AbstractC1385s.m2629s(Boolean.TRUE);
        c0365c2.f1143e = true;
        c0365c2.f1142d = true;
        return c0564i;
    }
}

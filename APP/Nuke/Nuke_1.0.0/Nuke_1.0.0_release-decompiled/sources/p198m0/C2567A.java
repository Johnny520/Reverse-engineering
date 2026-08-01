package p198m0;

import android.os.Trace;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1925g;
import p007B0.C0190d;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.InterfaceC0430v;
import p035G0.InterfaceC0471c;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0595h;
import p041H0.InterfaceC0597i;
import p041H0.InterfaceC0604l0;
import p041H0.InterfaceC0625w;
import p047I0.AbstractC0757q0;
import p047I0.C0762t;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p169h0.AbstractC2206o;
import p204n0.C2684c;
import p260x.C3432o;
import p261x0.C3444a;
import p261x0.C3446c;
import p261x0.InterfaceC3445b;

/* JADX INFO: renamed from: m0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2567A extends AbstractC2206o implements InterfaceC0595h, InterfaceC0625w, InterfaceC0604l0, InterfaceC0471c, InterfaceC0597i {

    /* JADX INFO: renamed from: r */
    public final boolean f8189r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1603e f8190s;

    /* JADX INFO: renamed from: t */
    public boolean f8191t;

    /* JADX INFO: renamed from: u */
    public boolean f8192u;

    /* JADX INFO: renamed from: v */
    public final int f8193v;

    public C2567A(int i5, InterfaceC1603e interfaceC1603e, int i6) {
        i5 = (i6 & 1) != 0 ? 1 : i5;
        boolean z5 = (i6 & 2) == 0;
        interfaceC1603e = (i6 & 4) != 0 ? null : interfaceC1603e;
        this.f8189r = z5;
        this.f8190s = interfaceC1603e;
        this.f8193v = i5;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        int iOrdinal = m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                InterfaceC2581l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner();
                C2567A c2567aM4499f = AbstractC2573d.m4499f(this);
                if (c2567aM4499f == null || !c2567aM4499f.f8189r) {
                    return;
                }
                C2584o c2584o = (C2584o) focusOwner;
                c2584o.f8222a.m1298F();
                c2584o.f8225d.m4525a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0330q();
                }
                return;
            }
        }
        C2584o c2584o2 = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner();
        c2584o2.m4527b(8, true, false);
        if (this.f8189r) {
            c2584o2.f8222a.m1298F();
        }
        c2584o2.f8225d.m4525a();
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: D0 */
    public final void mo4022D0() {
        if (m4488O0().m4540a()) {
            ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner()).m4527b(8, true, true);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final boolean m4483J0(int i5) {
        int iOrdinal = AbstractC2573d.m4515v(this, i5).ordinal();
        if (iOrdinal == 0) {
            return AbstractC2573d.m4516w(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new C0330q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: K0 */
    public final void m4484K0(EnumC2594y enumC2594y, EnumC2594y enumC2594y2) {
        C0590e0 c0590e0;
        InterfaceC1603e interfaceC1603e;
        C2584o c2584o = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner();
        C2567A c2567aM4531f = c2584o.m4531f();
        if (!enumC2594y.equals(enumC2594y2) && (interfaceC1603e = this.f8190s) != null) {
            interfaceC1603e.mo0g(enumC2594y, enumC2594y2);
        }
        AbstractC2206o abstractC2206o = this.f7186d;
        if (!abstractC2206o.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o2 = this.f7186d;
        C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
        while (c0564iM1044t != null) {
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 5120) != 0) {
                while (abstractC2206o2 != null) {
                    int i5 = abstractC2206o2.f7188f;
                    if ((i5 & 5120) != 0) {
                        if (abstractC2206o2 != abstractC2206o && (i5 & 1024) != 0) {
                            return;
                        }
                        if ((i5 & 4096) != 0) {
                            ?? M1029e = abstractC2206o2;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC2576g) {
                                    InterfaceC2576g interfaceC2576g = (InterfaceC2576g) M1029e;
                                    if (c2567aM4531f == c2584o.m4531f()) {
                                        interfaceC2576g.mo942W(enumC2594y2);
                                    }
                                } else if ((M1029e.f7188f & 4096) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o3 = ((AbstractC0599j) M1029e).f1943s;
                                    int i6 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o3 != null) {
                                        if ((abstractC2206o3.f7188f & 4096) != 0) {
                                            i6++;
                                            c1483e = c1483e;
                                            if (i6 == 1) {
                                                M1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o3);
                                            }
                                        }
                                        abstractC2206o3 = abstractC2206o3.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                    }
                    abstractC2206o2 = abstractC2206o2.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o2 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX INFO: renamed from: L0 */
    public final C2588s m4485L0() {
        boolean z5;
        C0590e0 c0590e0;
        C2588s c2588s = new C2588s();
        c2588s.f8234a = true;
        C2590u c2590u = C2590u.f8246b;
        c2588s.f8235b = c2590u;
        c2588s.f8236c = c2590u;
        c2588s.f8237d = c2590u;
        c2588s.f8238e = c2590u;
        c2588s.f8239f = c2590u;
        c2588s.f8240g = c2590u;
        c2588s.f8241h = c2590u;
        c2588s.f8242i = c2590u;
        c2588s.f8243j = C2587r.f8231f;
        c2588s.f8244k = C2587r.f8232g;
        c2588s.f8245l = C2585p.f8230a;
        int i5 = this.f8193v;
        if (i5 == 1) {
            z5 = true;
        } else if (i5 == 0) {
            z5 = !(((C3444a) ((C3446c) ((InterfaceC3445b) AbstractC0601k.m1032h(this, AbstractC0757q0.f2363m))).f10762a.getValue()).f10761a == 1);
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z5 = false;
        }
        c2588s.f8234a = z5;
        AbstractC2206o abstractC2206o = this.f7186d;
        if (!abstractC2206o.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o2 = this.f7186d;
        C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
        loop0: while (c0564iM1044t != null) {
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 3072) != 0) {
                while (abstractC2206o2 != null) {
                    int i6 = abstractC2206o2.f7188f;
                    if ((i6 & 3072) != 0) {
                        if (abstractC2206o2 != abstractC2206o && (i6 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i6 & 2048) != 0) {
                            ?? M1029e = abstractC2206o2;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC2589t) {
                                    ((InterfaceC2589t) M1029e).mo947e(c2588s);
                                } else if ((M1029e.f7188f & 2048) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o3 = ((AbstractC0599j) M1029e).f1943s;
                                    int i7 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o3 != null) {
                                        if ((abstractC2206o3.f7188f & 2048) != 0) {
                                            i7++;
                                            c1483e = c1483e;
                                            if (i7 == 1) {
                                                M1029e = abstractC2206o3;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o3);
                                            }
                                        }
                                        abstractC2206o3 = abstractC2206o3.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                    }
                    abstractC2206o2 = abstractC2206o2.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o2 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
        return c2588s;
    }

    /* JADX INFO: renamed from: M0 */
    public final C2684c m4486M0(InterfaceC0430v interfaceC0430v) {
        C2684c c2684c = m4485L0().f8245l;
        return c2684c != C2585p.f8230a ? interfaceC0430v == null ? c2684c : c2684c.m4658i(interfaceC0430v.mo635O(AbstractC0601k.m1043s(this), 0L)) : interfaceC0430v != null ? interfaceC0430v.mo634K(AbstractC0601k.m1043s(this), false) : AbstractC1922d.m3425d(0L, AbstractC1925g.m3523F(AbstractC0601k.m1043s(this).f1208f));
    }

    /* JADX INFO: renamed from: N0 */
    public final C3432o m4487N0() {
        C0590e0 c0590e0;
        Object obj;
        if (!this.f7186d.f7199q) {
            AbstractC0277a.m483b("visitAncestors called on an unattached node");
        }
        AbstractC2206o abstractC2206o = this.f7186d.f7190h;
        C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
        while (true) {
            if (c0564iM1044t == null) {
                break;
            }
            if ((c0564iM1044t.f1699J.f1896f.f7189g & 8388640) != 0) {
                while (abstractC2206o != null) {
                    int i5 = abstractC2206o.f7188f;
                    if ((i5 & 8388640) != 0) {
                        if ((8388608 & i5) != 0) {
                            if (!(abstractC2206o instanceof C3432o)) {
                                if (abstractC2206o instanceof AbstractC0599j) {
                                    AbstractC2206o abstractC2206o2 = null;
                                    for (AbstractC2206o abstractC2206o3 = ((AbstractC0599j) abstractC2206o).f1943s; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                                        if (abstractC2206o3 instanceof C3432o) {
                                            abstractC2206o2 = abstractC2206o3;
                                        }
                                    }
                                    abstractC2206o = abstractC2206o2;
                                } else {
                                    abstractC2206o = null;
                                }
                            }
                            C3432o c3432o = (C3432o) abstractC2206o;
                            if (c3432o != null) {
                                return c3432o;
                            }
                        } else if ((i5 & 32) != 0) {
                            if (abstractC2206o instanceof InterfaceC0471c) {
                                obj = abstractC2206o;
                            } else if (abstractC2206o instanceof AbstractC0599j) {
                                obj = null;
                                for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206o).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                    if (abstractC2206o4 instanceof InterfaceC0471c) {
                                        obj = abstractC2206o4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC0471c interfaceC0471c = (InterfaceC0471c) obj;
                            if (interfaceC0471c != null) {
                                interfaceC0471c.mo750i().getClass();
                            }
                        }
                    }
                    abstractC2206o = abstractC2206o.f7190h;
                }
            }
            c0564iM1044t = c0564iM1044t.m839u();
            abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
        }
        return null;
    }

    @Override // p041H0.InterfaceC0604l0
    /* JADX INFO: renamed from: O */
    public final void mo1051O() {
        m4489P0();
    }

    /* JADX INFO: renamed from: O0 */
    public final EnumC2594y m4488O0() {
        C2567A c2567aM4531f;
        C0590e0 c0590e0;
        boolean z5 = this.f7199q;
        EnumC2594y enumC2594y = EnumC2594y.f8254f;
        if (!z5 || (c2567aM4531f = ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner()).m4531f()) == null) {
            return enumC2594y;
        }
        if (this == c2567aM4531f) {
            return EnumC2594y.f8252d;
        }
        if (c2567aM4531f.f7199q) {
            if (!c2567aM4531f.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = c2567aM4531f.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4531f);
            while (c0564iM1044t != null) {
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 1024) != 0) {
                            AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                            C1483e c1483e = null;
                            while (abstractC2206oM1029e != null) {
                                if (abstractC2206oM1029e instanceof C2567A) {
                                    if (this == ((C2567A) abstractC2206oM1029e)) {
                                        return EnumC2594y.f8253e;
                                    }
                                } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                    int i5 = 0;
                                    for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                        if ((abstractC2206o2.f7188f & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                abstractC2206oM1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == null) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e != null) {
                                                    c1483e.m2753b(abstractC2206oM1029e);
                                                    abstractC2206oM1029e = null;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
        }
        return enumC2594y;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m4489P0() {
        int iOrdinal = m4488O0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C0330q();
                }
                return;
            }
        }
        C1675t c1675t = new C1675t();
        AbstractC0601k.m1040p(this, new C0190d(10, c1675t, this));
        Object obj = c1675t.f5710e;
        if (obj == null) {
            AbstractC1665j.m2991k("focusProperties");
            throw null;
        }
        if (((InterfaceC2586q) obj).mo955c()) {
            return;
        }
        ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(this)).getFocusOwner()).m4527b(8, true, true);
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m4490Q0(int i5) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean zM4483J0 = m4485L0().f8234a ? m4483J0(i5) : AbstractC2573d.m4501h(this, i5, new C0762t(i5, 4));
            Trace.endSection();
            return zM4483J0;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: y0 */
    public final boolean mo656y0() {
        return false;
    }

    @Override // p041H0.InterfaceC0625w
    /* JADX INFO: renamed from: v */
    public final void mo953v(InterfaceC0430v interfaceC0430v) {
    }
}

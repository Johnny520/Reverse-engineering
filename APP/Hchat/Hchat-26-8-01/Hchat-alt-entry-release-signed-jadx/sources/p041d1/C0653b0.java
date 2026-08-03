package p041d1;

import ac.AbstractC0063p;
import android.os.Trace;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1425u;
import okio.C3193a;
import p028c1.C0372b;
import p057e1.C0808c;
import p085fg.InterfaceC1235p;
import p131j0.C2046b;
import p136j8.C2104o;
import p203o1.C3039a;
import p203o1.C3041c;
import p203o1.InterfaceC3040b;
import p259r9.AbstractC3754e0;
import p265s.C3853r;
import p292u1.AbstractC4229a;
import p308v1.InterfaceC4428t;
import p323w1.InterfaceC4678c;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5626m1;
import p339x1.InterfaceC5648u;
import p356y0.AbstractC5852n;
import p357y1.AbstractC5888h1;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: d1.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0653b0 extends AbstractC5852n implements InterfaceC5609h, InterfaceC5648u, InterfaceC5626m1, InterfaceC4678c, InterfaceC5612i {

    /* JADX INFO: renamed from: u */
    public final boolean f2023u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC1235p f2024v;

    /* JADX INFO: renamed from: w */
    public boolean f2025w;

    /* JADX INFO: renamed from: x */
    public boolean f2026x;

    /* JADX INFO: renamed from: y */
    public final int f2027y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0653b0(int i9, InterfaceC1235p interfaceC1235p, int i10) {
        i9 = (i10 & 1) != 0 ? 1 : i9;
        boolean z9 = (i10 & 2) == 0;
        interfaceC1235p = (i10 & 4) != 0 ? null : interfaceC1235p;
        this.f2023u = z9;
        this.f2024v = interfaceC1235p;
        this.f2027y = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5626m1
    /* JADX INFO: renamed from: C0 */
    public final void mo1327C0() {
        m1804q1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        int iOrdinal = m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                InterfaceC0666l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner();
                C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(this);
                if (c0653b0M1814f == null || !c0653b0M1814f.f2023u) {
                    return;
                }
                C0670p c0670p = (C0670p) focusOwner;
                c0670p.f2054a.m10649H();
                c0670p.f2057d.m1841a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C3193a.m6822k();
                return;
            }
        }
        C0670p c0670p2 = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner();
        c0670p2.m1844b(8, true, false);
        if (this.f2023u) {
            c0670p2.f2054a.m10649H();
        }
        c0670p2.f2057d.m1841a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: e1 */
    public final void mo1328e1() {
        if (m1803p1().m1860a()) {
            ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner()).m1844b(8, true, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final boolean m1797k1(int i9) {
        int iOrdinal = AbstractC0656d.m1830v(this, i9).ordinal();
        if (iOrdinal == 0) {
            return AbstractC0656d.m1831w(this);
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
        C3193a.m6822k();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x008e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x009d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0097 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX INFO: renamed from: l1 */
    public final void m1798l1(EnumC0680z enumC0680z, EnumC0680z enumC0680z2) {
        C5587b1 c5587b1;
        InterfaceC1235p interfaceC1235p;
        C0670p c0670p = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner();
        C0653b0 c0653b0M1848f = c0670p.m1848f();
        if (!enumC0680z.equals(enumC0680z2) && (interfaceC1235p = this.f2024v) != null) {
            interfaceC1235p.invoke(enumC0680z, enumC0680z2);
        }
        AbstractC5852n abstractC5852n = this.f23788g;
        if (!abstractC5852n.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n2 = this.f23788g;
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this);
        while (c5602f0M10167w != null) {
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & 5120) != 0) {
                while (abstractC5852n2 != null) {
                    int i9 = abstractC5852n2.f23790i;
                    if ((i9 & 5120) != 0) {
                        if (abstractC5852n2 != abstractC5852n && (i9 & 1024) != 0) {
                            return;
                        }
                        if ((i9 & 4096) != 0) {
                            ?? M10149e = abstractC5852n2;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC0661g) {
                                    InterfaceC0661g interfaceC0661g = (InterfaceC0661g) M10149e;
                                    if (c0653b0M1848f == c0670p.m1848f()) {
                                        interfaceC0661g.mo1835E(enumC0680z2);
                                    }
                                } else if ((M10149e.f23790i & 4096) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n3 = ((AbstractC5615j) M10149e).f22875v;
                                    int i10 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n3 != null) {
                                        if ((abstractC5852n3.f23790i & 4096) != 0) {
                                            i10++;
                                            c2046b = c2046b;
                                            if (i10 == 1) {
                                                M10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n3);
                                            }
                                        }
                                        abstractC5852n3 = abstractC5852n3.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                    }
                    abstractC5852n2 = abstractC5852n2.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n2 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x00c8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x00c2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX INFO: renamed from: m1 */
    public final C0674t m1799m1() {
        boolean z9;
        C5587b1 c5587b1;
        C0674t c0674t = new C0674t();
        c0674t.f2066a = true;
        C0676v c0676v = C0676v.f2078b;
        c0674t.f2067b = c0676v;
        c0674t.f2068c = c0676v;
        c0674t.f2069d = c0676v;
        c0674t.f2070e = c0676v;
        c0674t.f2071f = c0676v;
        c0674t.f2072g = c0676v;
        c0674t.f2073h = c0676v;
        c0674t.f2074i = c0676v;
        c0674t.f2075j = C0673s.f2063h;
        c0674t.f2076k = C0673s.f2064i;
        c0674t.f2077l = C0671q.f2062a;
        int i9 = this.f2027y;
        if (i9 == 1) {
            z9 = true;
        } else if (i9 == 0) {
            z9 = !(((C3039a) ((C3041c) ((InterfaceC3040b) AbstractC5618k.m10152h(this, AbstractC5888h1.f23931m))).f9863a.getValue()).f9862a == 1);
        } else {
            if (i9 != 2) {
                C2104o.m5276A("Unknown Focusability");
                return null;
            }
            z9 = false;
        }
        c0674t.f2066a = z9;
        AbstractC5852n abstractC5852n = this.f23788g;
        if (!abstractC5852n.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n2 = this.f23788g;
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this);
        loop0: while (c5602f0M10167w != null) {
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & 3072) != 0) {
                while (abstractC5852n2 != null) {
                    int i10 = abstractC5852n2.f23790i;
                    if ((i10 & 3072) != 0) {
                        if (abstractC5852n2 != abstractC5852n && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & Opcodes.ACC_STRICT) != 0) {
                            ?? M10149e = abstractC5852n2;
                            ?? c2046b = 0;
                            while (M10149e != 0) {
                                if (M10149e instanceof InterfaceC0675u) {
                                    ((InterfaceC0675u) M10149e).mo1858r0(c0674t);
                                } else if ((M10149e.f23790i & Opcodes.ACC_STRICT) != 0 && (M10149e instanceof AbstractC5615j)) {
                                    AbstractC5852n abstractC5852n3 = ((AbstractC5615j) M10149e).f22875v;
                                    int i11 = 0;
                                    M10149e = M10149e;
                                    c2046b = c2046b;
                                    while (abstractC5852n3 != null) {
                                        if ((abstractC5852n3.f23790i & Opcodes.ACC_STRICT) != 0) {
                                            i11++;
                                            c2046b = c2046b;
                                            if (i11 == 1) {
                                                M10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b == 0) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (M10149e != 0) {
                                                    c2046b.m5056b(M10149e);
                                                    M10149e = 0;
                                                }
                                                c2046b.m5056b(abstractC5852n3);
                                            }
                                        }
                                        abstractC5852n3 = abstractC5852n3.f23793l;
                                        M10149e = M10149e;
                                        c2046b = c2046b;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                M10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                    }
                    abstractC5852n2 = abstractC5852n2.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n2 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
        return c0674t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final C0808c m1800n1(InterfaceC4428t interfaceC4428t) {
        C0808c c0808c = m1799m1().f2077l;
        return c0808c != C0671q.f2062a ? interfaceC4428t == null ? c0808c : c0808c.m2053i(interfaceC4428t.mo8861W(AbstractC5618k.m10166v(this), 0L)) : interfaceC4428t != null ? interfaceC4428t.mo8866k0(AbstractC5618k.m10166v(this), false) : AbstractC0063p.m408a(0L, AbstractC3754e0.m7908q0(AbstractC5618k.m10166v(this).f14595i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final C3853r m1801o1() {
        C5587b1 c5587b1;
        Object obj;
        if (!this.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitAncestors called on an unattached node");
        }
        AbstractC5852n abstractC5852n = this.f23788g.f23792k;
        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(this);
        while (true) {
            if (c5602f0M10167w == null) {
                break;
            }
            if ((c5602f0M10167w.f22778L.f22719f.f23791j & 8388640) != 0) {
                while (abstractC5852n != null) {
                    int i9 = abstractC5852n.f23790i;
                    if ((i9 & 8388640) != 0) {
                        if ((8388608 & i9) != 0) {
                            if (!(abstractC5852n instanceof C3853r)) {
                                if (abstractC5852n instanceof AbstractC5615j) {
                                    AbstractC5852n abstractC5852n2 = null;
                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852n).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                        if (abstractC5852n3 instanceof C3853r) {
                                            abstractC5852n2 = abstractC5852n3;
                                        }
                                    }
                                    abstractC5852n = abstractC5852n2;
                                } else {
                                    abstractC5852n = null;
                                }
                            }
                            C3853r c3853r = (C3853r) abstractC5852n;
                            if (c3853r != null) {
                                return c3853r;
                            }
                        } else if ((i9 & 32) != 0) {
                            if (abstractC5852n instanceof InterfaceC4678c) {
                                obj = abstractC5852n;
                            } else if (abstractC5852n instanceof AbstractC5615j) {
                                obj = null;
                                for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852n).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                    if (abstractC5852n4 instanceof InterfaceC4678c) {
                                        obj = abstractC5852n4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC4678c interfaceC4678c = (InterfaceC4678c) obj;
                            if (interfaceC4678c != null) {
                                interfaceC4678c.mo9169o0().getClass();
                            }
                        }
                    }
                    abstractC5852n = abstractC5852n.f23792k;
                }
            }
            c5602f0M10167w = c5602f0M10167w.m10049u();
            abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final EnumC0680z m1803p1() {
        C0653b0 c0653b0M1848f;
        C5587b1 c5587b1;
        boolean z9 = this.f23801t;
        EnumC0680z enumC0680z = EnumC0680z.f2086i;
        if (!z9 || (c0653b0M1848f = ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner()).m1848f()) == null) {
            return enumC0680z;
        }
        if (this == c0653b0M1848f) {
            return EnumC0680z.f2084g;
        }
        if (c0653b0M1848f.f23801t) {
            if (!c0653b0M1848f.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n = c0653b0M1848f.f23788g.f23792k;
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1848f);
            while (c5602f0M10167w != null) {
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                    while (abstractC5852n != null) {
                        if ((abstractC5852n.f23790i & 1024) != 0) {
                            AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                            C2046b c2046b = null;
                            while (abstractC5852nM10149e != null) {
                                if (abstractC5852nM10149e instanceof C0653b0) {
                                    if (this == ((C0653b0) abstractC5852nM10149e)) {
                                        return EnumC0680z.f2085h;
                                    }
                                } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i9 = 0;
                                    for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                        if ((abstractC5852n2.f23790i & 1024) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC5852nM10149e = abstractC5852n2;
                                            } else {
                                                if (c2046b == null) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b.m5056b(abstractC5852n2);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        abstractC5852n = abstractC5852n.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
            }
        }
        return enumC0680z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final void m1804q1() {
        int iOrdinal = m1803p1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                C3193a.m6822k();
                return;
            }
        }
        C1425u c1425u = new C1425u();
        AbstractC5618k.m10162r(this, new C0372b(c1425u, 2, this));
        Object obj = c1425u.f4738g;
        if (obj == null) {
            AbstractC1416l.m3831g("focusProperties");
            throw null;
        }
        if (((InterfaceC0672r) obj).mo1853a()) {
            return;
        }
        ((C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner()).m1844b(8, true, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    public final boolean m1805r1(int i9) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return m1799m1().f2066a ? m1797k1(i9) : AbstractC0656d.m1816h(this, i9, new C0669o(i9, 2));
        } finally {
            Trace.endSection();
        }
    }

    @Override // p339x1.InterfaceC5648u
    /* JADX INFO: renamed from: p0 */
    public final void mo1802p0(InterfaceC4428t interfaceC4428t) {
    }
}

package p001A0;

import p023E0.AbstractC0277a;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0558E0;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p169h0.AbstractC2206o;
import p204n0.C2683b;

/* JADX INFO: renamed from: A0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0110j extends AbstractC2206o implements InterfaceC0558E0, InterfaceC0101a {

    /* JADX INFO: renamed from: r */
    public InterfaceC0101a f484r;

    /* JADX INFO: renamed from: s */
    public C0105e f485s;

    /* JADX INFO: renamed from: t */
    public C0110j f486t;

    /* JADX INFO: renamed from: u */
    public final String f487u = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public C0110j(InterfaceC0101a interfaceC0101a, C0105e c0105e) {
        this.f484r = interfaceC0101a;
        this.f485s = c0105e;
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        C0105e c0105e = this.f485s;
        c0105e.f470a = this;
        c0105e.f471b = null;
        this.f486t = null;
        c0105e.f472c = new C0102b(1, this);
        c0105e.f473d = m4023x0();
    }

    @Override // p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        C1675t c1675t = new C1675t();
        AbstractC0601k.m1048x(this, new C0111k(c1675t, 0));
        C0110j c0110j = (C0110j) ((InterfaceC0558E0) c1675t.f5710e);
        this.f486t = c0110j;
        C0105e c0105e = this.f485s;
        c0105e.f471b = c0110j;
        if (c0105e.f470a == this) {
            c0105e.f470a = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
    
        if (r3 == r8) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo133D(long r17, p074O2.InterfaceC1046d r19) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.C0110j.mo133D(long, O2.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC2160t m145J0() {
        C0110j c0110j;
        InterfaceC0558E0 interfaceC0558E0;
        C0590e0 c0590e0;
        if (this.f7199q) {
            if (!this.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = this.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
            loop0: while (true) {
                if (c0564iM1044t == null) {
                    interfaceC0558E0 = null;
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 262144) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0558E0) {
                                    interfaceC0558E0 = (InterfaceC0558E0) M1029e;
                                    if (AbstractC1665j.m2981a(mo146s(), interfaceC0558E0.mo146s()) && C0110j.class == interfaceC0558E0.getClass()) {
                                        break loop0;
                                    }
                                } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i5 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 262144) != 0) {
                                            i5++;
                                            c1483e = c1483e;
                                            if (i5 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            c0110j = (C0110j) interfaceC0558E0;
        } else {
            c0110j = null;
        }
        InterfaceC2160t interfaceC2160tM145J0 = c0110j != null ? c0110j.m145J0() : null;
        if (interfaceC2160tM145J0 != null && AbstractC2162v.m3993o(interfaceC2160tM145J0)) {
            return interfaceC2160tM145J0;
        }
        InterfaceC2160t interfaceC2160t = this.f485s.f473d;
        if (interfaceC2160t != null) {
            return interfaceC2160t;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [A0.j] */
    /* JADX WARN: Type inference failed for: r3v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: Q */
    public final long mo134Q(int i5, long j5, long j6) {
        C0590e0 c0590e0;
        long jMo134Q = this.f484r.mo134Q(i5, j5, j6);
        boolean z5 = this.f7199q;
        InterfaceC0558E0 interfaceC0558E0 = null;
        if (z5 && z5) {
            if (!this.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = this.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
            loop0: while (true) {
                if (c0564iM1044t == null) {
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 262144) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0558E0) {
                                    InterfaceC0558E0 interfaceC0558E02 = (InterfaceC0558E0) M1029e;
                                    if (AbstractC1665j.m2981a(mo146s(), interfaceC0558E02.mo146s()) && C0110j.class == interfaceC0558E02.getClass()) {
                                        interfaceC0558E0 = interfaceC0558E02;
                                        break loop0;
                                    }
                                } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i6 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 262144) != 0) {
                                            i6++;
                                            c1483e = c1483e;
                                            if (i6 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            interfaceC0558E0 = (C0110j) interfaceC0558E0;
        }
        ?? r02 = interfaceC0558E0;
        return C2683b.m4647e(jMo134Q, r02 != 0 ? r02.mo134Q(i5, C2683b.m4647e(j5, jMo134Q), C2683b.m4646d(j6, jMo134Q)) : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [V.e] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo135i0(long r18, long r20, p074O2.InterfaceC1046d r22) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001A0.C0110j.mo135i0(long, long, O2.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p001A0.InterfaceC0101a
    /* JADX INFO: renamed from: n */
    public final long mo136n(long j5, int i5) {
        C0590e0 c0590e0;
        boolean z5 = this.f7199q;
        C0110j c0110j = null;
        InterfaceC0558E0 interfaceC0558E0 = null;
        c0110j = null;
        if (z5 && z5) {
            if (!this.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = this.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(this);
            loop0: while (true) {
                if (c0564iM1044t == null) {
                    break;
                }
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 262144) != 0) {
                            ?? M1029e = abstractC2206o;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0558E0) {
                                    InterfaceC0558E0 interfaceC0558E02 = (InterfaceC0558E0) M1029e;
                                    if (AbstractC1665j.m2981a(mo146s(), interfaceC0558E02.mo146s()) && C0110j.class == interfaceC0558E02.getClass()) {
                                        interfaceC0558E0 = interfaceC0558E02;
                                        break loop0;
                                    }
                                } else if ((M1029e.f7188f & 262144) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                                    int i6 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o2 != null) {
                                        if ((abstractC2206o2.f7188f & 262144) != 0) {
                                            i6++;
                                            c1483e = c1483e;
                                            if (i6 == 1) {
                                                M1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                        abstractC2206o2 = abstractC2206o2.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            c0110j = (C0110j) interfaceC0558E0;
        }
        long jMo136n = c0110j != null ? c0110j.mo136n(j5, i5) : 0L;
        return C2683b.m4647e(jMo136n, this.f484r.mo136n(C2683b.m4646d(j5, jMo136n), i5));
    }

    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return this.f487u;
    }
}

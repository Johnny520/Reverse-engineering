package p001A0;

import p023E0.AbstractC0277a;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0558E0;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p153e1.C2021q;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0110j(InterfaceC0101a interfaceC0101a, C0105e c0105e) {
        this.f484r = interfaceC0101a;
        this.f485s = c0105e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x00be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x00cd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0077 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x0077 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x00c7 */
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
    */
    public final Object mo133D(long j5, InterfaceC1046d interfaceC1046d) {
        C0109i c0109i;
        long j6;
        C0590e0 c0590e0;
        long j7;
        long j8 = j5;
        if (interfaceC1046d instanceof C0109i) {
            c0109i = (C0109i) interfaceC1046d;
            int i5 = c0109i.f483j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0109i.f483j = i5 - Integer.MIN_VALUE;
            } else {
                c0109i = new C0109i(this, (AbstractC1178c) interfaceC1046d);
            }
        }
        Object objMo133D = c0109i.f481h;
        int i6 = c0109i.f483j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objMo133D);
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
                                        int i7 = 0;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                        while (abstractC2206o2 != null) {
                                            if ((abstractC2206o2.f7188f & 262144) != 0) {
                                                i7++;
                                                c1483e = c1483e;
                                                if (i7 == 1) {
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
                                        if (i7 == 1) {
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
            if (c0110j == null) {
                j6 = 0;
                InterfaceC0101a interfaceC0101a = this.f484r;
                long jM3716d = C2021q.m3716d(j8, j6);
                c0109i.f480g = j6;
                c0109i.f483j = 2;
                objMo133D = interfaceC0101a.mo133D(jM3716d, c0109i);
                if (objMo133D != enumC1152a) {
                    j7 = j6;
                    return new C2021q(C2021q.m3717e(j7, ((C2021q) objMo133D).f6750a));
                }
                return enumC1152a;
            }
            c0109i.f480g = j8;
            c0109i.f483j = 1;
            objMo133D = c0110j.mo133D(j8, c0109i);
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = c0109i.f480g;
                AbstractC1784a.m3205S(objMo133D);
                return new C2021q(C2021q.m3717e(j7, ((C2021q) objMo133D).f6750a));
            }
            j8 = c0109i.f480g;
            AbstractC1784a.m3205S(objMo133D);
        }
        j6 = ((C2021q) objMo133D).f6750a;
        InterfaceC0101a interfaceC0101a2 = this.f484r;
        long jM3716d2 = C2021q.m3716d(j8, j6);
        c0109i.f480g = j6;
        c0109i.f483j = 2;
        objMo133D = interfaceC0101a2.mo133D(jM3716d2, c0109i);
        if (objMo133D != enumC1152a) {
        }
        return enumC1152a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0075 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0084 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x007e */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0082 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0091 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x003a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x003a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x008b */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x00e9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x00fc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x00f4 */
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
    */
    public final Object mo135i0(long j5, long j6, InterfaceC1046d interfaceC1046d) {
        C0108h c0108h;
        long j7;
        long j8;
        long j9;
        C0110j c0110j;
        long j10;
        long j11;
        InterfaceC0558E0 interfaceC0558E0;
        C0590e0 c0590e0;
        int i5;
        ?? r16;
        ?? M1029e;
        int i6;
        if (interfaceC1046d instanceof C0108h) {
            c0108h = (C0108h) interfaceC1046d;
            int i7 = c0108h.f479k;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0108h.f479k = i7 - Integer.MIN_VALUE;
            } else {
                c0108h = new C0108h(this, (AbstractC1178c) interfaceC1046d);
            }
        }
        C0108h c0108h2 = c0108h;
        Object objMo135i0 = c0108h2.f477i;
        int i8 = c0108h2.f479k;
        int i9 = 1;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i8 == 0) {
            AbstractC1784a.m3205S(objMo135i0);
            InterfaceC0101a interfaceC0101a = this.f484r;
            c0108h2.f475g = j5;
            c0108h2.f476h = j6;
            c0108h2.f479k = 1;
            objMo135i0 = interfaceC0101a.mo135i0(j5, j6, c0108h2);
            if (objMo135i0 != enumC1152a) {
                j7 = j5;
                j8 = j6;
            }
            return enumC1152a;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = c0108h2.f475g;
            AbstractC1784a.m3205S(objMo135i0);
            j10 = ((C2021q) objMo135i0).f6750a;
            j9 = j11;
            return new C2021q(C2021q.m3717e(j9, j10));
        }
        j8 = c0108h2.f476h;
        j7 = c0108h2.f475g;
        AbstractC1784a.m3205S(objMo135i0);
        j9 = ((C2021q) objMo135i0).f6750a;
        boolean z5 = this.f7199q;
        if (!z5) {
            c0110j = this.f486t;
        } else if (z5 && z5) {
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
                int i10 = 262144;
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 262144) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & i10) != 0) {
                            ?? r14 = abstractC2206o;
                            ?? r162 = 0;
                            while (r14 != 0) {
                                if (r14 instanceof InterfaceC0558E0) {
                                    InterfaceC0558E0 interfaceC0558E02 = (InterfaceC0558E0) r14;
                                    i5 = i10;
                                    if (AbstractC1665j.m2981a(mo146s(), interfaceC0558E02.mo146s()) && C0110j.class == interfaceC0558E02.getClass()) {
                                        interfaceC0558E0 = interfaceC0558E02;
                                        break loop0;
                                    }
                                } else {
                                    i5 = i10;
                                    if ((r14.f7188f & i5) != 0 && (r14 instanceof AbstractC0599j)) {
                                        AbstractC2206o abstractC2206o2 = ((AbstractC0599j) r14).f1943s;
                                        int i11 = 0;
                                        M1029e = r14;
                                        r16 = r162;
                                        while (abstractC2206o2 != null) {
                                            if ((abstractC2206o2.f7188f & i5) != 0) {
                                                i11++;
                                                if (i11 == i9) {
                                                    M1029e = abstractC2206o2;
                                                } else {
                                                    ?? c1483e = r16 == 0 ? new C1483e(new AbstractC2206o[16]) : r16;
                                                    if (M1029e != 0) {
                                                        c1483e.m2753b(M1029e);
                                                        M1029e = 0;
                                                    }
                                                    c1483e.m2753b(abstractC2206o2);
                                                    r16 = c1483e;
                                                }
                                            }
                                            abstractC2206o2 = abstractC2206o2.f7191i;
                                            i9 = 1;
                                            M1029e = M1029e;
                                            r16 = r16;
                                        }
                                        i6 = i9;
                                        r16 = r16;
                                        if (i11 == i6) {
                                        }
                                        i10 = i5;
                                        i9 = i6;
                                        r14 = M1029e;
                                        r162 = r16;
                                    }
                                    M1029e = AbstractC0601k.m1029e(r16);
                                    i10 = i5;
                                    i9 = i6;
                                    r14 = M1029e;
                                    r162 = r16;
                                }
                                i6 = i9;
                                r16 = r162;
                                M1029e = AbstractC0601k.m1029e(r16);
                                i10 = i5;
                                i9 = i6;
                                r14 = M1029e;
                                r162 = r16;
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                        i10 = i10;
                        i9 = i9;
                    }
                }
                int i12 = i9;
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
                i9 = i12;
            }
            c0110j = (C0110j) interfaceC0558E0;
        } else {
            c0110j = null;
        }
        if (c0110j == null) {
            j10 = 0;
            return new C2021q(C2021q.m3717e(j9, j10));
        }
        long jM3717e = C2021q.m3717e(j7, j9);
        long jM3716d = C2021q.m3716d(j8, j9);
        c0108h2.f475g = j9;
        c0108h2.f479k = 2;
        objMo135i0 = c0110j.mo135i0(jM3717e, jM3716d, c0108h2);
        if (objMo135i0 != enumC1152a) {
            j11 = j9;
            j10 = ((C2021q) objMo135i0).f6750a;
            j9 = j11;
            return new C2021q(C2021q.m3717e(j9, j10));
        }
        return enumC1152a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0078 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x0087 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:75:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:78:0x0081 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0558E0
    /* JADX INFO: renamed from: s */
    public final Object mo146s() {
        return this.f487u;
    }
}

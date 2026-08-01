package p227r;

import p000A.C0002B;
import p000A.C0011F0;
import p007B0.AbstractC0208v;
import p007B0.C0185S;
import p007B0.C0200n;
import p007B0.C0202p;
import p007B0.C0209w;
import p007B0.EnumC0201o;
import p007B0.InterfaceC0169B;
import p047I0.InterfaceC0697T0;
import p056K2.C0891q;
import p058L.C0927b0;
import p074O2.InterfaceC1046d;
import p076P.C1073T;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.C1671p;
import p117X2.C1674s;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p150d4.C1984a;
import p179i4.AbstractC2352g;
import p204n0.C2683b;

/* JADX INFO: renamed from: r.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2945D {

    /* JADX INFO: renamed from: a */
    public static final float f9309a = ((float) 0.125d) / 18;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (p204n0.C2683b.m4644b(p007B0.AbstractC0208v.m317g(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5150a(C0185S c0185s, long j5, AbstractC1178c abstractC1178c) {
        C3022x c3022x;
        C1674s c1674s;
        Object objM271a;
        EnumC1152a enumC1152a;
        Object obj;
        Object obj2;
        if (abstractC1178c instanceof C3022x) {
            c3022x = (C3022x) abstractC1178c;
            int i5 = c3022x.f9578j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3022x.f9578j = i5 - Integer.MIN_VALUE;
            } else {
                c3022x = new C3022x(abstractC1178c);
            }
        }
        Object obj3 = c3022x.f9577i;
        int i6 = c3022x.f9578j;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj3);
            if (!m5155f(c0185s.f645i.f653w, j5)) {
                c1674s = new C1674s();
                c1674s.f5708d = j5;
                c3022x.f9575g = c0185s;
                c3022x.f9576h = c1674s;
                c3022x.f9578j = 1;
                objM271a = c0185s.m271a(EnumC0201o.f703e, c3022x);
                enumC1152a = EnumC1152a.f3788d;
                if (objM271a != enumC1152a) {
                }
            }
            return null;
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1674s c1674s2 = c3022x.f9576h;
        C0185S c0185s2 = c3022x.f9575g;
        AbstractC1784a.m3205S(obj3);
        C1674s c1674s3 = c1674s2;
        c0185s = c0185s2;
        C0200n c0200n = (C0200n) obj3;
        ?? r14 = c0200n.f696a;
        int size = r14.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                obj = null;
                break;
            }
            obj = r14.get(i8);
            if (AbstractC0208v.m315e(((C0209w) obj).f711a, c1674s3.f5708d)) {
                break;
            }
            i8++;
        }
        C0209w c0209w = (C0209w) obj;
        if (c0209w == null) {
            if (AbstractC0208v.m314d(c0209w)) {
                ?? r142 = c0200n.f696a;
                int size2 = r142.size();
                while (true) {
                    if (i7 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r142.get(i7);
                    if (((C0209w) obj2).f714d) {
                        break;
                    }
                    i7++;
                }
                C0209w c0209w2 = (C0209w) obj2;
                if (c0209w2 != null) {
                    c1674s3.f5708d = c0209w2.f711a;
                    c1674s = c1674s3;
                    c3022x.f9575g = c0185s;
                    c3022x.f9576h = c1674s;
                    c3022x.f9578j = 1;
                    objM271a = c0185s.m271a(EnumC0201o.f703e, c3022x);
                    enumC1152a = EnumC1152a.f3788d;
                    if (objM271a != enumC1152a) {
                        return enumC1152a;
                    }
                    C1674s c1674s4 = c1674s;
                    obj3 = objM271a;
                    c1674s3 = c1674s4;
                }
            }
            C0200n c0200n2 = (C0200n) obj3;
            ?? r143 = c0200n2.f696a;
            int size3 = r143.size();
            int i72 = 0;
            int i82 = 0;
            while (true) {
                if (i82 < size3) {
                }
                i82++;
            }
            C0209w c0209w3 = (C0209w) obj;
            if (c0209w3 == null) {
                c0209w3 = null;
            }
        }
        if (c0209w3 == null || c0209w3.m321b()) {
            return null;
        }
        return c0209w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x001e */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: X2.t */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X2.t] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5151b(C0185S c0185s, long j5, AbstractC1178c abstractC1178c) {
        C3024y c3024y;
        Object obj;
        C0209w c0209w;
        C1671p c1671p;
        if (abstractC1178c instanceof C3024y) {
            c3024y = (C3024y) abstractC1178c;
            int i5 = c3024y.f9591k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3024y.f9591k = i5 - Integer.MIN_VALUE;
            } else {
                c3024y = new C3024y(abstractC1178c);
            }
        }
        Object obj2 = c3024y.f9590j;
        int i6 = c3024y.f9591k;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(obj2);
                if (!m5155f(c0185s.f645i.f653w, j5)) {
                    ?? r11 = c0185s.f645i.f653w.f696a;
                    int size = r11.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r11.get(i7);
                        if (AbstractC0208v.m315e(((C0209w) obj).f711a, j5)) {
                            break;
                        }
                        i7++;
                    }
                    c0209w = (C0209w) obj;
                    if (c0209w != null) {
                        C1675t c1675t = new C1675t();
                        C1675t c1675t2 = new C1675t();
                        c1675t2.f5710e = c0209w;
                        long jMo776c = c0185s.m277f().mo776c();
                        C1671p c1671p2 = new C1671p();
                        InterfaceC1603e c3026z = new C3026z(c1671p2, c1675t2, c1675t, null);
                        c3024y.f9587g = c0209w;
                        c3024y.f9588h = c1675t;
                        c3024y.f9589i = c1671p2;
                        c3024y.f9591k = 1;
                        Object objM279j = c0185s.m279j(jMo776c, c3026z, c3024y);
                        Object obj3 = EnumC1152a.f3788d;
                        if (objM279j == obj3) {
                            return obj3;
                        }
                        c1671p = c1671p2;
                        j5 = c1675t;
                    }
                }
                return null;
            }
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1671p = c3024y.f9589i;
            C1675t c1675t3 = c3024y.f9588h;
            c0209w = c3024y.f9587g;
            AbstractC1784a.m3205S(obj2);
            j5 = c1675t3;
            if (c1671p.f5705d) {
                C0209w c0209w2 = (C0209w) j5.f5710e;
                return c0209w2 == null ? c0209w : c0209w2;
            }
            return null;
        } catch (C0202p unused) {
            C0209w c0209w3 = (C0209w) j5.f5710e;
            return c0209w3 == null ? c0209w : c0209w3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:57:0x013c) to fix multi-entry loop: BACK_EDGE: B:57:0x013c -> B:58:0x0144 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0160 -> B:63:0x0166). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5152c(C0185S c0185s, long j5, C0002B c0002b, AbstractC1176a abstractC1176a) {
        C2939A c2939a;
        C0185S c0185s2;
        float fMo777d;
        C1674s c1674s;
        C1984a c1984a;
        InterfaceC1603e interfaceC1603e;
        float f2;
        C0185S c0185s3;
        C1674s c1674s2;
        C1984a c1984a2;
        int size;
        int i5;
        C0209w c0209w;
        EnumC1152a enumC1152a;
        Object obj;
        C0209w c0209w2;
        Object obj2;
        int i6;
        Object objM271a;
        if (abstractC1176a instanceof C2939A) {
            c2939a = (C2939A) abstractC1176a;
            int i7 = c2939a.f9269n;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c2939a.f9269n = i7 - Integer.MIN_VALUE;
            } else {
                c2939a = new C2939A(abstractC1176a);
            }
        }
        Object obj3 = c2939a.f9268m;
        int i8 = c2939a.f9269n;
        int i9 = 1;
        C0209w c0209w3 = null;
        EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
        if (i8 == 0) {
            AbstractC1784a.m3205S(obj3);
            c0185s2 = c0185s;
            if (m5155f(c0185s2.f645i.f653w, j5)) {
                return null;
            }
            fMo777d = c0185s2.m277f().mo777d();
            c1674s = new C1674s();
            c1674s.f5708d = j5;
            c1984a = new C1984a(0L, null);
            interfaceC1603e = c0002b;
            c2939a.f9262g = interfaceC1603e;
            c2939a.f9263h = c0185s2;
            c2939a.f9264i = c1674s;
            c2939a.f9265j = c1984a;
            c2939a.f9266k = c0209w3;
            c2939a.f9267l = fMo777d;
            c2939a.f9269n = i9;
            objM271a = c0185s2.m271a(EnumC0201o.f703e, c2939a);
            if (objM271a != enumC1152a2) {
            }
            return enumC1152a2;
        }
        if (i8 == 1) {
            float f5 = c2939a.f9267l;
            c1984a = c2939a.f9265j;
            c1674s2 = c2939a.f9264i;
            c0185s3 = c2939a.f9263h;
            InterfaceC1603e interfaceC1603e2 = c2939a.f9262g;
            AbstractC1784a.m3205S(obj3);
            f2 = f5;
            interfaceC1603e = interfaceC1603e2;
            c1984a2 = c1984a;
            C0200n c0200n = (C0200n) obj3;
            ?? r12 = c0200n.f696a;
            size = r12.size();
            i5 = 0;
            while (true) {
                if (i5 < size) {
                }
                i5 = i6 + 1;
                c0209w3 = c0209w;
                enumC1152a2 = enumC1152a;
            }
            c0209w2 = (C0209w) obj;
            if (c0209w2 != null) {
                return c0209w;
            }
            if (AbstractC0208v.m314d(c0209w2)) {
            }
            i9 = 1;
            c2939a.f9262g = interfaceC1603e;
            c2939a.f9263h = c0185s2;
            c2939a.f9264i = c1674s;
            c2939a.f9265j = c1984a;
            c2939a.f9266k = c0209w3;
            c2939a.f9267l = fMo777d;
            c2939a.f9269n = i9;
            objM271a = c0185s2.m271a(EnumC0201o.f703e, c2939a);
            if (objM271a != enumC1152a2) {
            }
            return enumC1152a2;
        }
        if (i8 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f6 = c2939a.f9267l;
        c0209w2 = c2939a.f9266k;
        C1984a c1984a3 = c2939a.f9265j;
        c1674s = c2939a.f9264i;
        C0185S c0185s4 = c2939a.f9263h;
        InterfaceC1603e interfaceC1603e3 = c2939a.f9262g;
        AbstractC1784a.m3205S(obj3);
        fMo777d = f6;
        interfaceC1603e = interfaceC1603e3;
        c1984a2 = c1984a3;
        c0209w = null;
        c0185s2 = c0185s4;
        if (!c0209w2.m321b()) {
            return c0209w;
        }
        c0209w3 = c0209w;
        c1984a = c1984a2;
        i9 = 1;
        c2939a.f9262g = interfaceC1603e;
        c2939a.f9263h = c0185s2;
        c2939a.f9264i = c1674s;
        c2939a.f9265j = c1984a;
        c2939a.f9266k = c0209w3;
        c2939a.f9267l = fMo777d;
        c2939a.f9269n = i9;
        objM271a = c0185s2.m271a(EnumC0201o.f703e, c2939a);
        if (objM271a != enumC1152a2) {
            f2 = fMo777d;
            c1674s2 = c1674s;
            c0185s3 = c0185s2;
            obj3 = objM271a;
            c1984a2 = c1984a;
            C0200n c0200n2 = (C0200n) obj3;
            ?? r122 = c0200n2.f696a;
            size = r122.size();
            i5 = 0;
            while (true) {
                if (i5 < size) {
                    c0209w = c0209w3;
                    enumC1152a = enumC1152a2;
                    obj = c0209w;
                    break;
                }
                obj = r122.get(i5);
                i6 = i5;
                c0209w = c0209w3;
                enumC1152a = enumC1152a2;
                if (AbstractC0208v.m315e(((C0209w) obj).f711a, c1674s2.f5708d)) {
                    break;
                }
                i5 = i6 + 1;
                c0209w3 = c0209w;
                enumC1152a2 = enumC1152a;
            }
            c0209w2 = (C0209w) obj;
            if (c0209w2 != null || c0209w2.m321b()) {
                return c0209w;
            }
            if (AbstractC0208v.m314d(c0209w2)) {
                long jM3659a = c1984a2.m3659a(c0209w2.f713c, c0209w2.f717g, f2);
                float f7 = f2;
                if ((9223372034707292159L & jM3659a) != 9205357640488583168L) {
                    interfaceC1603e.mo0g(c0209w2, new C2683b(jM3659a));
                    if (c0209w2.m321b()) {
                        return c0209w2;
                    }
                    c1984a2.f6674a = 0L;
                    C1674s c1674s3 = c1674s2;
                    fMo777d = f7;
                    c0185s2 = c0185s3;
                    c1674s = c1674s3;
                    c0209w3 = c0209w;
                    c1984a = c1984a2;
                    enumC1152a2 = enumC1152a;
                } else {
                    c2939a.f9262g = interfaceC1603e;
                    c2939a.f9263h = c0185s3;
                    c2939a.f9264i = c1674s2;
                    c2939a.f9265j = c1984a2;
                    c2939a.f9266k = c0209w2;
                    c2939a.f9267l = f7;
                    c2939a.f9269n = 2;
                    enumC1152a2 = enumC1152a;
                    if (c0185s3.m271a(EnumC0201o.f704f, c2939a) != enumC1152a2) {
                        C1674s c1674s4 = c1674s2;
                        fMo777d = f7;
                        c0185s2 = c0185s3;
                        c1674s = c1674s4;
                        if (!c0209w2.m321b()) {
                        }
                    }
                }
            } else {
                ?? r13 = c0200n2.f696a;
                int size2 = r13.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        obj2 = c0209w;
                        break;
                    }
                    obj2 = r13.get(i10);
                    if (((C0209w) obj2).f714d) {
                        break;
                    }
                    i10++;
                }
                C0209w c0209w4 = (C0209w) obj2;
                if (c0209w4 == null) {
                    return c0209w;
                }
                c1674s2.f5708d = c0209w4.f711a;
                C1674s c1674s5 = c1674s2;
                fMo777d = f2;
                c0185s2 = c0185s3;
                c1674s = c1674s5;
                c0209w3 = c0209w;
                c1984a = c1984a2;
                enumC1152a2 = enumC1152a;
            }
            i9 = 1;
            c2939a.f9262g = interfaceC1603e;
            c2939a.f9263h = c0185s2;
            c2939a.f9264i = c1674s;
            c2939a.f9265j = c1984a;
            c2939a.f9266k = c0209w3;
            c2939a.f9267l = fMo777d;
            c2939a.f9269n = i9;
            objM271a = c0185s2.m271a(EnumC0201o.f703e, c2939a);
            if (objM271a != enumC1152a2) {
            }
        }
        return enumC1152a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m5153d(InterfaceC0169B interfaceC0169B, InterfaceC1601c interfaceC1601c, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        C1073T c1073t = new C1073T(23);
        Object objM4197j = AbstractC2352g.m4197j(interfaceC0169B, new C2941B(new C1073T(24), new C1674s(), null, new C0011F0(interfaceC1601c, 1), interfaceC1603e, new C1073T(23), new C0927b0(c1073t, 2), null), interfaceC1046d);
        C0891q c0891q = C0891q.f2780a;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (objM4197j != enumC1152a) {
            objM4197j = c0891q;
        }
        return objM4197j == enumC1152a ? objM4197j : c0891q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5154e(C0185S c0185s, long j5, InterfaceC1601c interfaceC1601c, AbstractC1178c abstractC1178c) {
        C2943C c2943c;
        EnumC1152a enumC1152a;
        C0209w c0209w;
        if (abstractC1178c instanceof C2943C) {
            c2943c = (C2943C) abstractC1178c;
            int i5 = c2943c.f9303j;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2943c.f9303j = i5 - Integer.MIN_VALUE;
            } else {
                c2943c = new C2943C(abstractC1178c);
            }
        }
        Object objM5150a = c2943c.f9302i;
        int i6 = c2943c.f9303j;
        if (i6 == 0) {
            AbstractC1784a.m3205S(objM5150a);
            c2943c.f9300g = c0185s;
            c2943c.f9301h = interfaceC1601c;
            c2943c.f9303j = 1;
            objM5150a = m5150a(c0185s, j5, c2943c);
            enumC1152a = EnumC1152a.f3788d;
            if (objM5150a == enumC1152a) {
            }
            c0209w = (C0209w) objM5150a;
            if (c0209w == null) {
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC1601c interfaceC1601c2 = c2943c.f9301h;
            C0185S c0185s2 = c2943c.f9300g;
            AbstractC1784a.m3205S(objM5150a);
            interfaceC1601c = interfaceC1601c2;
            c0185s = c0185s2;
            c0209w = (C0209w) objM5150a;
            if (c0209w == null) {
                if (AbstractC0208v.m314d(c0209w)) {
                    return Boolean.TRUE;
                }
                interfaceC1601c.mo1h(c0209w);
                j5 = c0209w.f711a;
                c2943c.f9300g = c0185s;
                c2943c.f9301h = interfaceC1601c;
                c2943c.f9303j = 1;
                objM5150a = m5150a(c0185s, j5, c2943c);
                enumC1152a = EnumC1152a.f3788d;
                if (objM5150a == enumC1152a) {
                    return enumC1152a;
                }
                c0209w = (C0209w) objM5150a;
                if (c0209w == null) {
                    return Boolean.FALSE;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static final boolean m5155f(C0200n c0200n, long j5) {
        Object obj;
        ?? r6 = c0200n.f696a;
        int size = r6.size();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i5);
            if (AbstractC0208v.m315e(((C0209w) obj).f711a, j5)) {
                break;
            }
            i5++;
        }
        C0209w c0209w = (C0209w) obj;
        if (c0209w != null && c0209w.f714d) {
            z5 = true;
        }
        return true ^ z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final float m5156g(InterfaceC0697T0 interfaceC0697T0, int i5) {
        return i5 == 2 ? interfaceC0697T0.mo777d() * f9309a : interfaceC0697T0.mo777d();
    }
}

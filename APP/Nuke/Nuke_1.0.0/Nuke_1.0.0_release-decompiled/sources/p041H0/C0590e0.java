package p041H0;

import java.util.HashSet;
import p023E0.AbstractC0277a;
import p047I0.C0769w0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p169h0.InterfaceC2205n;
import p169h0.InterfaceC2207p;
import p186k.C2444z;

/* JADX INFO: renamed from: H0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0590e0 {

    /* JADX INFO: renamed from: a */
    public final C0564I f1891a;

    /* JADX INFO: renamed from: b */
    public final C0588d0 f1892b;

    /* JADX INFO: renamed from: c */
    public final C0617s f1893c;

    /* JADX INFO: renamed from: d */
    public AbstractC0596h0 f1894d;

    /* JADX INFO: renamed from: e */
    public final C0552B0 f1895e;

    /* JADX INFO: renamed from: f */
    public AbstractC2206o f1896f;

    /* JADX INFO: renamed from: g */
    public C1483e f1897g;

    /* JADX INFO: renamed from: h */
    public C1483e f1898h;

    /* JADX INFO: renamed from: i */
    public final C1483e f1899i;

    /* JADX INFO: renamed from: j */
    public C0586c0 f1900j;

    public C0590e0(C0564I c0564i) {
        this.f1891a = c0564i;
        C0588d0 c0588d0 = new C0588d0();
        c0588d0.f7189g = -1;
        this.f1892b = c0588d0;
        C0617s c0617s = new C0617s(c0564i);
        this.f1893c = c0617s;
        this.f1894d = c0617s;
        C0552B0 c0552b0 = c0617s.f1970U;
        this.f1895e = c0552b0;
        this.f1896f = c0552b0;
        this.f1899i = new C1483e(new InterfaceC2207p[16]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m958a(C0590e0 c0590e0, AbstractC2206o abstractC2206o, AbstractC0596h0 abstractC0596h0) {
        for (AbstractC2206o abstractC2206o2 = abstractC2206o.f7190h; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7190h) {
            if (abstractC2206o2 == c0590e0.f1892b) {
                C0564I c0564iM839u = c0590e0.f1891a.m839u();
                abstractC0596h0.f1934t = c0564iM839u != null ? c0564iM839u.f1699J.f1893c : null;
                c0590e0.f1894d = abstractC0596h0;
                return;
            } else {
                if ((abstractC2206o2.f7188f & 2) != 0) {
                    return;
                }
                abstractC2206o2.mo1020I0(abstractC0596h0);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2206o m959b(InterfaceC2205n interfaceC2205n, AbstractC2206o abstractC2206o) {
        AbstractC2206o abstractC2206oMo140e;
        if (interfaceC2205n instanceof AbstractC0582a0) {
            abstractC2206oMo140e = ((AbstractC0582a0) interfaceC2205n).mo140e();
            abstractC2206oMo140e.f7188f = AbstractC0598i0.m1013f(abstractC2206oMo140e);
        } else {
            C0583b c0583b = new C0583b();
            c0583b.f7188f = AbstractC0598i0.m1011d(interfaceC2205n);
            c0583b.f1864r = interfaceC2205n;
            new HashSet();
            abstractC2206oMo140e = c0583b;
        }
        if (abstractC2206oMo140e.f7199q) {
            AbstractC0277a.m483b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC2206oMo140e.f7194l = true;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 != null) {
            abstractC2206o2.f7190h = abstractC2206oMo140e;
            abstractC2206oMo140e.f7191i = abstractC2206o2;
        }
        abstractC2206o.f7191i = abstractC2206oMo140e;
        abstractC2206oMo140e.f7190h = abstractC2206o;
        return abstractC2206oMo140e;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC2206o m960c(AbstractC2206o abstractC2206o) throws ClassNotFoundException {
        boolean z5 = abstractC2206o.f7199q;
        if (z5) {
            C2444z c2444z = AbstractC0598i0.f1941a;
            if (!z5) {
                AbstractC0277a.m483b("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC0598i0.m1008a(abstractC2206o, -1, 2);
            abstractC2206o.mo1018G0();
            abstractC2206o.mo1015A0();
        }
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        AbstractC2206o abstractC2206o3 = abstractC2206o.f7190h;
        if (abstractC2206o2 != null) {
            abstractC2206o2.f7190h = abstractC2206o3;
            abstractC2206o.f7191i = null;
        }
        if (abstractC2206o3 != null) {
            abstractC2206o3.f7191i = abstractC2206o2;
            abstractC2206o.f7190h = null;
        }
        AbstractC1665j.m2982b(abstractC2206o3);
        return abstractC2206o3;
    }

    /* JADX INFO: renamed from: h */
    public static void m961h(InterfaceC2205n interfaceC2205n, InterfaceC2205n interfaceC2205n2, AbstractC2206o abstractC2206o) {
        if ((interfaceC2205n instanceof AbstractC0582a0) && (interfaceC2205n2 instanceof AbstractC0582a0)) {
            AbstractC1665j.m2983c(abstractC2206o, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0582a0) interfaceC2205n2).mo141f(abstractC2206o);
            if (abstractC2206o.f7199q) {
                AbstractC0598i0.m1010c(abstractC2206o);
                return;
            } else {
                abstractC2206o.f7195m = true;
                return;
            }
        }
        if (!(abstractC2206o instanceof C0583b)) {
            AbstractC0277a.m483b("Unknown Modifier.Node type");
            return;
        }
        C0583b c0583b = (C0583b) abstractC2206o;
        boolean z5 = c0583b.f7199q;
        if (z5) {
            if (!z5) {
                AbstractC0277a.m483b("unInitializeModifier called on unattached node");
            }
            if ((c0583b.f7188f & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c0583b)).m1295C();
            }
        }
        c0583b.f1864r = interfaceC2205n2;
        c0583b.f7188f = AbstractC0598i0.m1011d(interfaceC2205n2);
        if (c0583b.f7199q) {
            c0583b.m939J0(false);
        }
        if (abstractC2206o.f7199q) {
            AbstractC0598i0.m1010c(abstractC2206o);
        } else {
            abstractC2206o.f7195m = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m962d(int i5) {
        return (i5 & this.f1896f.f7189g) != 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m963e() {
        for (AbstractC2206o abstractC2206o = this.f1896f; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
            abstractC2206o.mo1017F0();
            if (abstractC2206o.f7194l) {
                C2444z c2444z = AbstractC0598i0.f1941a;
                if (!abstractC2206o.f7199q) {
                    AbstractC0277a.m483b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC0598i0.m1008a(abstractC2206o, -1, 1);
            }
            if (abstractC2206o.f7195m) {
                AbstractC0598i0.m1010c(abstractC2206o);
            }
            abstractC2206o.f7194l = false;
            abstractC2206o.f7195m = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a0, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ae, code lost:
    
        if (r0.m957a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m964f(int r32, p105V.C1483e r33, p105V.C1483e r34, p169h0.AbstractC2206o r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p041H0.C0590e0.m964f(int, V.e, V.e, h0.o, boolean):void");
    }

    /* JADX INFO: renamed from: g */
    public final void m965g() {
        C0564I c0564i;
        C0631z c0631z;
        InterfaceC0612p0 interfaceC0612p0;
        AbstractC2206o abstractC2206o = this.f1895e.f7190h;
        AbstractC0596h0 abstractC0596h0 = this.f1893c;
        while (true) {
            c0564i = this.f1891a;
            if (abstractC2206o == null) {
                break;
            }
            InterfaceC0627x interfaceC0627xM1030f = AbstractC0601k.m1030f(abstractC2206o);
            if (interfaceC0627xM1030f != null) {
                AbstractC0596h0 abstractC0596h02 = abstractC2206o.f7193k;
                if (abstractC0596h02 != null) {
                    c0631z = (C0631z) abstractC0596h02;
                    InterfaceC0627x interfaceC0627x = c0631z.f2006U;
                    c0631z.m1082s1(interfaceC0627xM1030f);
                    if (interfaceC0627x != abstractC2206o && (interfaceC0612p0 = c0631z.f1931O) != null) {
                        ((C0769w0) interfaceC0612p0).invalidate();
                    }
                } else {
                    c0631z = new C0631z(c0564i, interfaceC0627xM1030f);
                    abstractC2206o.mo1020I0(c0631z);
                }
                abstractC0596h0.f1934t = c0631z;
                c0631z.f1933s = abstractC0596h0;
                abstractC0596h0 = c0631z;
            } else {
                abstractC2206o.mo1020I0(abstractC0596h0);
            }
            abstractC2206o = abstractC2206o.f7190h;
        }
        C0564I c0564iM839u = c0564i.m839u();
        abstractC0596h0.f1934t = c0564iM839u != null ? c0564iM839u.f1699J.f1893c : null;
        this.f1894d = abstractC0596h0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        AbstractC2206o abstractC2206o = this.f1896f;
        C0552B0 c0552b0 = this.f1895e;
        if (abstractC2206o == c0552b0) {
            sb.append("]");
        } else {
            while (true) {
                if (abstractC2206o == null || abstractC2206o == c0552b0) {
                    break;
                }
                sb.append(String.valueOf(abstractC2206o));
                if (abstractC2206o.f7191i == c0552b0) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                abstractC2206o = abstractC2206o.f7191i;
            }
        }
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}

package p198m0;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p041H0.InterfaceC0597i;
import p047I0.C0762t;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p153e1.EnumC2017m;
import p169h0.AbstractC2206o;
import p170h1.C2214e;
import p186k.C2404A;
import p186k.C2443y;
import p204n0.C2684c;
import p273z0.AbstractC3510c;
import p273z0.InterfaceC3512e;

/* JADX INFO: renamed from: m0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2584o implements InterfaceC2581l {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f8222a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f8223b;

    /* JADX INFO: renamed from: d */
    public final C2578i f8225d;

    /* JADX INFO: renamed from: f */
    public C2443y f8227f;

    /* JADX INFO: renamed from: h */
    public C2567A f8229h;

    /* JADX INFO: renamed from: c */
    public final C2567A f8224c = new C2567A(2, null, 14);

    /* JADX INFO: renamed from: e */
    public final C2582m f8226e = new C2582m(this);

    /* JADX INFO: renamed from: g */
    public final C2404A f8228g = new C2404A(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2584o(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2) {
        this.f8222a = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f8223b = viewTreeObserverOnGlobalLayoutListenerC0772y2;
        this.f8225d = new C2578i(this, viewTreeObserverOnGlobalLayoutListenerC0772y2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m4526a(boolean z5) {
        C0590e0 c0590e0;
        if (m4531f() != null) {
            C2567A c2567aM4531f = m4531f();
            m4534i(null);
            if (c2567aM4531f != null) {
                EnumC2594y enumC2594y = EnumC2594y.f8252d;
                EnumC2594y enumC2594y2 = EnumC2594y.f8254f;
                c2567aM4531f.m4484K0(enumC2594y, enumC2594y2);
                if (!c2567aM4531f.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o = c2567aM4531f.f7186d.f7190h;
                C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4531f);
                while (c0564iM1044t != null) {
                    if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                        while (abstractC2206o != null) {
                            if ((abstractC2206o.f7188f & 1024) != 0) {
                                C1483e c1483e = null;
                                AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                                while (abstractC2206oM1029e != null) {
                                    if (abstractC2206oM1029e instanceof C2567A) {
                                        ((C2567A) abstractC2206oM1029e).m4484K0(EnumC2594y.f8253e, enumC2594y2);
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
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m4527b(int i5, boolean z5, boolean z6) {
        int iOrdinal;
        boolean z7 = true;
        if (z5 || (iOrdinal = AbstractC2573d.m4513t(this.f8224c, i5).ordinal()) == 0) {
            m4526a(z5);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new C0330q();
            }
            z7 = false;
        }
        if (z7 && z6) {
            m4528c();
        }
        return z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4528c() {
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f8222a;
        if (viewTreeObserverOnGlobalLayoutListenerC0772y.isFocused() || viewTreeObserverOnGlobalLayoutListenerC0772y.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC0772y.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC0772y.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC0772y.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC0772y.clearFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x0137 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:203:0x024d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:235:0x02ad */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:289:0x025c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:290:0x0214 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:292:0x0214 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:295:0x0256 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:303:0x02bc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:304:0x0274 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:306:0x0274 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:309:0x02b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:325:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:328:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:329:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:333:0x00ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:346:0x0146 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:350:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:351:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:355:0x0140 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00b1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:164:0x01d9, B:145:0x01a3, B:147:0x01a9, B:149:0x01ad, B:151:0x01b5, B:153:0x01bb, B:157:0x01c3, B:159:0x01cc, B:160:0x01d0, B:161:0x01d3, B:165:0x01de, B:166:0x01e1, B:168:0x01e7, B:170:0x01eb, B:173:0x01f2, B:175:0x01fa, B:182:0x0211, B:184:0x0216, B:186:0x021a, B:209:0x025c, B:190:0x0226, B:192:0x022c, B:194:0x0230, B:196:0x0238, B:198:0x023e, B:202:0x0246, B:204:0x024f, B:205:0x0253, B:206:0x0256, B:210:0x0261, B:214:0x0271, B:216:0x0276, B:218:0x027a, B:241:0x02bc, B:222:0x0286, B:224:0x028c, B:226:0x0290, B:228:0x0298, B:230:0x029e, B:234:0x02a6, B:236:0x02af, B:237:0x02b3, B:238:0x02b6, B:243:0x02c3, B:245:0x02ca, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:254:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [V.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [V.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r15v5, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r15v9, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [V.e] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [V.e] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4529d(KeyEvent keyEvent, InterfaceC1599a interfaceC1599a) {
        InterfaceC0597i interfaceC0597i;
        AbstractC2206o abstractC2206o;
        C0590e0 c0590e0;
        InterfaceC0597i interfaceC0597i2;
        C0590e0 c0590e02;
        int size;
        C0590e0 c0590e03;
        C2567A c2567a = this.f8224c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f8225d.f8217e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m4535j(keyEvent)) {
                return false;
            }
            C2567A c2567aM4499f = AbstractC2573d.m4499f(c2567a);
            if (c2567aM4499f != null) {
                if (!c2567aM4499f.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitLocalDescendants called on an unattached node");
                }
                AbstractC2206o abstractC2206o2 = c2567aM4499f.f7186d;
                if ((abstractC2206o2.f7189g & 9216) != 0) {
                    abstractC2206o = null;
                    for (AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i; abstractC2206o3 != null; abstractC2206o3 = abstractC2206o3.f7191i) {
                        int i5 = abstractC2206o3.f7188f;
                        if ((i5 & 9216) != 0) {
                            if ((i5 & 1024) != 0) {
                                break;
                            }
                            abstractC2206o = abstractC2206o3;
                        }
                    }
                } else {
                    abstractC2206o = null;
                }
                if (abstractC2206o == null) {
                }
            } else if (c2567aM4499f == null) {
                if (!c2567a.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o4 = c2567a.f7186d.f7190h;
                C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567a);
                loop15: while (true) {
                    if (c0564iM1044t == null) {
                        interfaceC0597i = null;
                        break;
                    }
                    if ((c0564iM1044t.f1699J.f1896f.f7189g & 8192) != 0) {
                        while (abstractC2206o4 != null) {
                            if ((abstractC2206o4.f7188f & 8192) != 0) {
                                AbstractC2206o abstractC2206oM1029e = abstractC2206o4;
                                C1483e c1483e = null;
                                while (abstractC2206oM1029e != null) {
                                    if (abstractC2206oM1029e instanceof InterfaceC3512e) {
                                        interfaceC0597i = abstractC2206oM1029e;
                                        break loop15;
                                    }
                                    if ((abstractC2206oM1029e.f7188f & 8192) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                        AbstractC2206o abstractC2206o5 = ((AbstractC0599j) abstractC2206oM1029e).f1943s;
                                        int i6 = 0;
                                        abstractC2206oM1029e = abstractC2206oM1029e;
                                        c1483e = c1483e;
                                        while (abstractC2206o5 != null) {
                                            if ((abstractC2206o5.f7188f & 8192) != 0) {
                                                i6++;
                                                c1483e = c1483e;
                                                if (i6 == 1) {
                                                    abstractC2206oM1029e = abstractC2206o5;
                                                } else {
                                                    if (c1483e == null) {
                                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e != null) {
                                                        c1483e.m2753b(abstractC2206oM1029e);
                                                        abstractC2206oM1029e = null;
                                                    }
                                                    c1483e.m2753b(abstractC2206o5);
                                                }
                                            }
                                            abstractC2206o5 = abstractC2206o5.f7191i;
                                            abstractC2206oM1029e = abstractC2206oM1029e;
                                            c1483e = c1483e;
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                                }
                            }
                            abstractC2206o4 = abstractC2206o4.f7190h;
                        }
                    }
                    c0564iM1044t = c0564iM1044t.m839u();
                    abstractC2206o4 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
                }
                InterfaceC0597i interfaceC0597i3 = (InterfaceC3512e) interfaceC0597i;
                abstractC2206o = interfaceC0597i3 != null ? ((AbstractC2206o) interfaceC0597i3).f7186d : null;
            } else {
                if (!c2567aM4499f.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o6 = c2567aM4499f.f7186d;
                C0564I c0564iM1044t2 = AbstractC0601k.m1044t(c2567aM4499f);
                loop11: while (true) {
                    if (c0564iM1044t2 == null) {
                        interfaceC0597i2 = null;
                        break;
                    }
                    if ((c0564iM1044t2.f1699J.f1896f.f7189g & 8192) != 0) {
                        while (abstractC2206o6 != null) {
                            if ((abstractC2206o6.f7188f & 8192) != 0) {
                                C1483e c1483e2 = null;
                                AbstractC2206o abstractC2206oM1029e2 = abstractC2206o6;
                                while (abstractC2206oM1029e2 != null) {
                                    if (abstractC2206oM1029e2 instanceof InterfaceC3512e) {
                                        interfaceC0597i2 = abstractC2206oM1029e2;
                                        break loop11;
                                    }
                                    if ((abstractC2206oM1029e2.f7188f & 8192) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                        AbstractC2206o abstractC2206o7 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s;
                                        int i7 = 0;
                                        abstractC2206oM1029e2 = abstractC2206oM1029e2;
                                        c1483e2 = c1483e2;
                                        while (abstractC2206o7 != null) {
                                            if ((abstractC2206o7.f7188f & 8192) != 0) {
                                                i7++;
                                                c1483e2 = c1483e2;
                                                if (i7 == 1) {
                                                    abstractC2206oM1029e2 = abstractC2206o7;
                                                } else {
                                                    if (c1483e2 == null) {
                                                        c1483e2 = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e2 != null) {
                                                        c1483e2.m2753b(abstractC2206oM1029e2);
                                                        abstractC2206oM1029e2 = null;
                                                    }
                                                    c1483e2.m2753b(abstractC2206o7);
                                                }
                                            }
                                            abstractC2206o7 = abstractC2206o7.f7191i;
                                            abstractC2206oM1029e2 = abstractC2206oM1029e2;
                                            c1483e2 = c1483e2;
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e2);
                                }
                            }
                            abstractC2206o6 = abstractC2206o6.f7190h;
                        }
                    }
                    c0564iM1044t2 = c0564iM1044t2.m839u();
                    abstractC2206o6 = (c0564iM1044t2 == null || (c0590e02 = c0564iM1044t2.f1699J) == null) ? null : c0590e02.f1895e;
                }
                InterfaceC0597i interfaceC0597i4 = (InterfaceC3512e) interfaceC0597i2;
                if (interfaceC0597i4 != null) {
                    abstractC2206o = ((AbstractC2206o) interfaceC0597i4).f7186d;
                }
            }
            if (abstractC2206o != null) {
                if (!abstractC2206o.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o8 = abstractC2206o.f7186d.f7190h;
                C0564I c0564iM1044t3 = AbstractC0601k.m1044t(abstractC2206o);
                ArrayList arrayList = null;
                while (c0564iM1044t3 != null) {
                    if ((c0564iM1044t3.f1699J.f1896f.f7189g & 8192) != 0) {
                        while (abstractC2206o8 != null) {
                            if ((abstractC2206o8.f7188f & 8192) != 0) {
                                AbstractC2206o abstractC2206oM1029e3 = abstractC2206o8;
                                C1483e c1483e3 = null;
                                while (abstractC2206oM1029e3 != null) {
                                    if (abstractC2206oM1029e3 instanceof InterfaceC3512e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC2206oM1029e3);
                                    } else if ((abstractC2206oM1029e3.f7188f & 8192) != 0 && (abstractC2206oM1029e3 instanceof AbstractC0599j)) {
                                        int i8 = 0;
                                        for (AbstractC2206o abstractC2206o9 = ((AbstractC0599j) abstractC2206oM1029e3).f1943s; abstractC2206o9 != null; abstractC2206o9 = abstractC2206o9.f7191i) {
                                            if ((abstractC2206o9.f7188f & 8192) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    abstractC2206oM1029e3 = abstractC2206o9;
                                                } else {
                                                    if (c1483e3 == null) {
                                                        c1483e3 = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e3 != null) {
                                                        c1483e3.m2753b(abstractC2206oM1029e3);
                                                        abstractC2206oM1029e3 = null;
                                                    }
                                                    c1483e3.m2753b(abstractC2206o9);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e3 = AbstractC0601k.m1029e(c1483e3);
                                }
                            }
                            abstractC2206o8 = abstractC2206o8.f7190h;
                        }
                    }
                    c0564iM1044t3 = c0564iM1044t3.m839u();
                    abstractC2206o8 = (c0564iM1044t3 == null || (c0590e03 = c0564iM1044t3.f1699J) == null) ? null : c0590e03.f1895e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i9 = size - 1;
                        if (((InterfaceC3512e) arrayList.get(size)).mo1267k(keyEvent)) {
                            return true;
                        }
                        if (i9 < 0) {
                            break;
                        }
                        size = i9;
                    }
                }
                ?? M1029e = abstractC2206o.f7186d;
                ?? c1483e4 = 0;
                while (M1029e != 0) {
                    if (M1029e instanceof InterfaceC3512e) {
                        if (((InterfaceC3512e) M1029e).mo1267k(keyEvent)) {
                            return true;
                        }
                    } else if ((M1029e.f7188f & 8192) != 0 && (M1029e instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o10 = ((AbstractC0599j) M1029e).f1943s;
                        int i10 = 0;
                        M1029e = M1029e;
                        c1483e4 = c1483e4;
                        while (abstractC2206o10 != null) {
                            if ((abstractC2206o10.f7188f & 8192) != 0) {
                                i10++;
                                c1483e4 = c1483e4;
                                if (i10 == 1) {
                                    M1029e = abstractC2206o10;
                                } else {
                                    if (c1483e4 == 0) {
                                        c1483e4 = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e != 0) {
                                        c1483e4.m2753b(M1029e);
                                        M1029e = 0;
                                    }
                                    c1483e4.m2753b(abstractC2206o10);
                                }
                            }
                            abstractC2206o10 = abstractC2206o10.f7191i;
                            M1029e = M1029e;
                            c1483e4 = c1483e4;
                        }
                        if (i10 == 1) {
                        }
                    }
                    M1029e = AbstractC0601k.m1029e(c1483e4);
                }
                if (((Boolean) interfaceC1599a.mo6a()).booleanValue()) {
                    return true;
                }
                ?? M1029e2 = abstractC2206o.f7186d;
                ?? c1483e5 = 0;
                while (M1029e2 != 0) {
                    if (M1029e2 instanceof InterfaceC3512e) {
                        if (((InterfaceC3512e) M1029e2).mo1266U(keyEvent)) {
                            return true;
                        }
                    } else if ((M1029e2.f7188f & 8192) != 0 && (M1029e2 instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o11 = ((AbstractC0599j) M1029e2).f1943s;
                        int i11 = 0;
                        c1483e5 = c1483e5;
                        M1029e2 = M1029e2;
                        while (abstractC2206o11 != null) {
                            if ((abstractC2206o11.f7188f & 8192) != 0) {
                                i11++;
                                c1483e5 = c1483e5;
                                if (i11 == 1) {
                                    M1029e2 = abstractC2206o11;
                                } else {
                                    if (c1483e5 == 0) {
                                        c1483e5 = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e2 != 0) {
                                        c1483e5.m2753b(M1029e2);
                                        M1029e2 = 0;
                                    }
                                    c1483e5.m2753b(abstractC2206o11);
                                }
                            }
                            abstractC2206o11 = abstractC2206o11.f7191i;
                            c1483e5 = c1483e5;
                            M1029e2 = M1029e2;
                        }
                        if (i11 == 1) {
                        }
                    }
                    M1029e2 = AbstractC0601k.m1029e(c1483e5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        if (((InterfaceC3512e) arrayList.get(i12)).mo1266U(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0120, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r6v20, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m4530e(int i5, C2684c c2684c, InterfaceC1601c interfaceC1601c) {
        boolean zM4494a;
        C2567A c2567a;
        C0590e0 c0590e0;
        C2567A c2567a2 = this.f8224c;
        C2567A c2567aM4499f = AbstractC2573d.m4499f(c2567a2);
        int i6 = 4;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f8223b;
        boolean zBooleanValue = false;
        if (c2567aM4499f != null) {
            EnumC2017m layoutDirection = viewTreeObserverOnGlobalLayoutListenerC0772y.getLayoutDirection();
            C2588s c2588sM4485L0 = c2567aM4499f.m4485L0();
            C2590u c2590u = c2588sM4485L0.f8241h;
            C2590u c2590u2 = c2588sM4485L0.f8242i;
            if (i5 == 1) {
                c2590u = c2588sM4485L0.f8235b;
            } else if (i5 == 2) {
                c2590u = c2588sM4485L0.f8236c;
            } else if (i5 == 5) {
                c2590u = c2588sM4485L0.f8237d;
            } else if (i5 == 6) {
                c2590u = c2588sM4485L0.f8238e;
            } else if (i5 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new C0330q();
                    }
                    c2590u = c2590u2;
                }
                if (c2590u == C2590u.f8246b) {
                    c2590u = null;
                }
                if (c2590u == null) {
                    c2590u = c2588sM4485L0.f8239f;
                }
            } else if (i5 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    c2590u = c2590u2;
                } else if (iOrdinal2 != 1) {
                    throw new C0330q();
                }
                if (c2590u == C2590u.f8246b) {
                    c2590u = null;
                }
                if (c2590u == null) {
                    c2590u = c2588sM4485L0.f8240g;
                }
            } else {
                if (i5 != 7 && i5 != 8) {
                    throw new IllegalStateException("invalid FocusDirection");
                }
                C2570a c2570a = new C2570a(i5);
                C2584o c2584o = (C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567aM4499f)).getFocusOwner();
                C2567A c2567aM4531f = c2584o.m4531f();
                if (i5 == 7) {
                    c2588sM4485L0.f8243j.mo1h(c2570a);
                } else {
                    c2588sM4485L0.f8244k.mo1h(c2570a);
                }
                c2590u = c2570a.f8202b ? C2590u.f8247c : c2567aM4531f != c2584o.m4531f() ? C2590u.f8248d : C2590u.f8246b;
            }
            C2590u c2590u3 = C2590u.f8247c;
            if (!AbstractC1665j.m2981a(c2590u, c2590u3)) {
                if (AbstractC1665j.m2981a(c2590u, C2590u.f8248d)) {
                    C2567A c2567aM4499f2 = AbstractC2573d.m4499f(c2567a2);
                    if (c2567aM4499f2 != null) {
                        return (Boolean) interfaceC1601c.mo1h(c2567aM4499f2);
                    }
                } else {
                    C2590u c2590u4 = C2590u.f8246b;
                    if (!AbstractC1665j.m2981a(c2590u, c2590u4)) {
                        if (c2590u == c2590u4) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        if (c2590u == c2590u3) {
                            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        }
                        C1483e c1483e = c2590u.f8249a;
                        int i7 = c1483e.f5183f;
                        if (i7 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = c1483e.f5181d;
                            boolean z5 = false;
                            for (int i8 = 0; i8 < i7; i8++) {
                                AbstractC2206o abstractC2206o = (AbstractC2206o) ((InterfaceC2592w) objArr[i8]);
                                if (!abstractC2206o.f7186d.f7199q) {
                                    AbstractC0277a.m483b("visitChildren called on an unattached node");
                                }
                                C1483e c1483e2 = new C1483e(new AbstractC2206o[16]);
                                AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d;
                                AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
                                if (abstractC2206o3 == null) {
                                    AbstractC0601k.m1026b(c1483e2, abstractC2206o2);
                                } else {
                                    c1483e2.m2753b(abstractC2206o3);
                                }
                                while (true) {
                                    int i9 = c1483e2.f5183f;
                                    if (i9 != 0) {
                                        AbstractC2206o abstractC2206oM1029e = (AbstractC2206o) c1483e2.m2762k(i9 - 1);
                                        if ((abstractC2206oM1029e.f7189g & 1024) == 0) {
                                            AbstractC0601k.m1026b(c1483e2, abstractC2206oM1029e);
                                        } else {
                                            while (true) {
                                                if (abstractC2206oM1029e == null) {
                                                    break;
                                                }
                                                if ((abstractC2206oM1029e.f7188f & 1024) != 0) {
                                                    C1483e c1483e3 = null;
                                                    while (abstractC2206oM1029e != null) {
                                                        if (abstractC2206oM1029e instanceof C2567A) {
                                                            if (((Boolean) interfaceC1601c.mo1h((C2567A) abstractC2206oM1029e)).booleanValue()) {
                                                                z5 = true;
                                                                break;
                                                            }
                                                        } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                                            int i10 = 0;
                                                            for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                                                if ((abstractC2206o4.f7188f & 1024) != 0) {
                                                                    i10++;
                                                                    if (i10 == 1) {
                                                                        abstractC2206oM1029e = abstractC2206o4;
                                                                    } else {
                                                                        if (c1483e3 == null) {
                                                                            c1483e3 = new C1483e(new AbstractC2206o[16]);
                                                                        }
                                                                        if (abstractC2206oM1029e != null) {
                                                                            c1483e3.m2753b(abstractC2206oM1029e);
                                                                            abstractC2206oM1029e = null;
                                                                        }
                                                                        c1483e3.m2753b(abstractC2206o4);
                                                                    }
                                                                }
                                                            }
                                                            if (i10 == 1) {
                                                            }
                                                        }
                                                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e3);
                                                    }
                                                } else {
                                                    abstractC2206oM1029e = abstractC2206oM1029e.f7191i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z5;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        c2567aM4499f = null;
        EnumC2017m layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC0772y.getLayoutDirection();
        C2214e c2214e = new C2214e(c2567aM4499f, this, interfaceC1601c);
        if (i5 == 1 || i5 == 2) {
            if (i5 == 1) {
                zM4494a = AbstractC2573d.m4504k(c2567a2, c2214e);
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zM4494a = AbstractC2573d.m4494a(c2567a2, c2214e);
            }
            return Boolean.valueOf(zM4494a);
        }
        if (i5 == 3 || i5 == 4 || i5 == 5 || i5 == 6) {
            return AbstractC2573d.m4493C(i5, c2214e, c2567a2, c2684c);
        }
        if (i5 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    throw new C0330q();
                }
                i6 = 3;
            }
            C2567A c2567aM4499f3 = AbstractC2573d.m4499f(c2567a2);
            if (c2567aM4499f3 != null) {
                return AbstractC2573d.m4493C(i6, c2214e, c2567aM4499f3, c2684c);
            }
            return null;
        }
        if (i5 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C2575f.m4520a(i5))).toString());
        }
        C2567A c2567aM4499f4 = AbstractC2573d.m4499f(c2567a2);
        if (c2567aM4499f4 == null) {
            c2567a = null;
        } else {
            if (!c2567aM4499f4.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o5 = c2567aM4499f4.f7186d.f7190h;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4499f4);
            loop5: while (c0564iM1044t != null) {
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 1024) != 0) {
                    while (abstractC2206o5 != null) {
                        if ((abstractC2206o5.f7188f & 1024) != 0) {
                            AbstractC2206o abstractC2206oM1029e2 = abstractC2206o5;
                            C1483e c1483e4 = null;
                            while (abstractC2206oM1029e2 != null) {
                                if (abstractC2206oM1029e2 instanceof C2567A) {
                                    C2567A c2567a3 = (C2567A) abstractC2206oM1029e2;
                                    if (c2567a3.m4485L0().f8234a) {
                                        c2567a = c2567a3;
                                        break loop5;
                                    }
                                } else if ((abstractC2206oM1029e2.f7188f & 1024) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                    int i11 = 0;
                                    for (AbstractC2206o abstractC2206o6 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s; abstractC2206o6 != null; abstractC2206o6 = abstractC2206o6.f7191i) {
                                        if ((abstractC2206o6.f7188f & 1024) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC2206oM1029e2 = abstractC2206o6;
                                            } else {
                                                if (c1483e4 == null) {
                                                    c1483e4 = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e2 != null) {
                                                    c1483e4.m2753b(abstractC2206oM1029e2);
                                                    abstractC2206oM1029e2 = null;
                                                }
                                                c1483e4.m2753b(abstractC2206o6);
                                            }
                                        }
                                    }
                                    if (i11 != 1) {
                                        abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e4);
                                    }
                                }
                                abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e4);
                            }
                        }
                        abstractC2206o5 = abstractC2206o5.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o5 = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
            }
            c2567a = null;
        }
        if (c2567a != null && !c2567a.equals(c2567a2)) {
            zBooleanValue = ((Boolean) c2214e.mo1h(c2567a)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C2567A m4531f() {
        C2567A c2567a = this.f8229h;
        if (c2567a == null || !c2567a.f7199q) {
            return null;
        }
        return c2567a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4532g(int i5, boolean z5) {
        C2567A c2567aM4531f = m4531f();
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f8222a;
        if (c2567aM4531f == null || !c2567aM4531f.f8189r || !viewTreeObserverOnGlobalLayoutListenerC0772y.m1317w(i5)) {
            C1675t c1675t = new C1675t();
            c1675t.f5710e = Boolean.FALSE;
            C2567A c2567aM4531f2 = m4531f();
            Boolean boolM4530e = m4530e(i5, viewTreeObserverOnGlobalLayoutListenerC0772y.getEmbeddedViewFocusRect(), new C2583n(c1675t, i5));
            if (!AbstractC1665j.m2981a(boolM4530e, Boolean.TRUE) || c2567aM4531f2 == m4531f()) {
                if (boolM4530e != null && c1675t.f5710e != null) {
                    if (!boolM4530e.booleanValue() || !((Boolean) c1675t.f5710e).booleanValue()) {
                        if ((i5 == 1 || i5 == 2) && z5 && m4527b(i5, false, false)) {
                            Boolean boolM4530e2 = m4530e(i5, null, new C0762t(i5, 3));
                            if (boolM4530e2 != null ? boolM4530e2.booleanValue() : false) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4533h(int i5) {
        if (!m4527b(i5, false, false)) {
            return false;
        }
        Boolean boolM4530e = m4530e(i5, null, new C0762t(i5, 2));
        boolean zBooleanValue = boolM4530e != null ? boolM4530e.booleanValue() : false;
        if (!zBooleanValue) {
            m4528c();
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4534i(C2567A c2567a) {
        C2567A c2567a2 = this.f8229h;
        this.f8229h = c2567a;
        C2404A c2404a = this.f8228g;
        Object[] objArr = c2404a.f7766a;
        int i5 = c2404a.f7767b;
        for (int i6 = 0; i6 < i5; i6++) {
            ((InterfaceC2579j) objArr[i6]).mo1307a(c2567a2, c2567a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r3 = r4.m4359b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.f7897e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.f7893a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.f7895c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f7896d) * 32, ((long) r3) * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r3 = r4.f7893a;
        r8 = r4.f7895c;
        r9 = r4.f7894b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e9, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00eb, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        r32 = r6;
        r17 = r15;
        r5 = p061L2.AbstractC0972l.m2002Z(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012c, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012e, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013b, code lost:
    
        if (r13 != r17) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013d, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0145, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r13 = r13 ^ (r13 << 16);
        r14 = r13 >>> 7;
        r15 = r4.m4359b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0166, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0168, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | (((long) (r13 & 127)) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0186, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0189, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r34 >> r6) & 255) != r17) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | (((long) (r13 & 127)) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r17 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c0, code lost:
    
        r3[r5] = (((long) (r13 & 127)) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01db, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e9, code lost:
    
        r33 = r7;
        r4.f7897e = p186k.AbstractC2415L.m4295a(r4.f7895c) - r4.f7896d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fa, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fc, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0201, code lost:
    
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0204, code lost:
    
        r3 = p186k.AbstractC2415L.m4296b(r4.f7895c);
        r5 = r4.f7893a;
        r6 = r4.f7894b;
        r7 = r4.f7895c;
        r4.m4360c(r3);
        r3 = r4.f7893a;
        r8 = r4.f7894b;
        r9 = r4.f7895c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x021b, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022a, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x022c, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.m4359b(r15 >>> 7);
        r19 = r5;
        r20 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r22 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r22))) | (r5 << r22);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026a, code lost:
    
        r16 = r3;
        r19 = r5;
        r20 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0270, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0279, code lost:
    
        r3 = r4.m4359b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        r32 = r3;
        r4.f7896d++;
        r3 = r4.f7897e;
        r5 = r4.f7893a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0297, code lost:
    
        if (((r7 >> r9) & 255) != r17) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0299, code lost:
    
        r21 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029b, code lost:
    
        r4.f7897e = r3 - r21;
        r3 = r4.f7895c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0345, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0347, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4535j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j5;
        boolean z5;
        int iNumberOfTrailingZeros2;
        long jM5764b = AbstractC3510c.m5764b(keyEvent);
        int iM5765c = AbstractC3510c.m5765c(keyEvent);
        int i5 = -862048943;
        long j6 = 0;
        int i6 = 8;
        int i7 = 0;
        ?? r21 = 0;
        boolean z6 = true;
        if (iM5765c == 2) {
            C2443y c2443y = this.f8227f;
            if (c2443y == null) {
                c2443y = new C2443y(3);
                this.f8227f = c2443y;
            }
            C2443y c2443y2 = c2443y;
            int iHashCode = Long.hashCode(jM5764b) * (-862048943);
            int i8 = iHashCode ^ (iHashCode << 16);
            int i9 = i8 >>> 7;
            int i10 = i8 & 127;
            int i11 = c2443y2.f7895c;
            int i12 = i9 & i11;
            int i13 = 0;
            loop0: while (true) {
                long[] jArr = c2443y2.f7893a;
                int i14 = i12 >> 3;
                int i15 = i5;
                int i16 = (i12 & 7) << 3;
                long j7 = (jArr[i14] >>> i16) | ((jArr[i14 + 1] << (64 - i16)) & ((-i16) >> 63));
                long j8 = i10;
                long j9 = j7 ^ (j8 * 72340172838076673L);
                long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
                while (true) {
                    if (j10 == j6) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
                    long j11 = j6;
                    if (c2443y2.f7894b[iNumberOfTrailingZeros2] == jM5764b) {
                        z5 = true;
                        break loop0;
                    }
                    j10 &= j10 - 1;
                    j6 = j11;
                }
                i13 += 8;
                i12 = (i12 + i13) & i11;
                i6 = i6;
                i5 = i15;
                j6 = j5;
            }
            c2443y2.f7894b[iNumberOfTrailingZeros2] = jM5764b;
            return z5;
        }
        if (iM5765c != 1) {
            return true;
        }
        C2443y c2443y3 = this.f8227f;
        if (c2443y3 == null || !c2443y3.m4358a(jM5764b)) {
            return false;
        }
        C2443y c2443y4 = this.f8227f;
        if (c2443y4 != null) {
            int iHashCode2 = Long.hashCode(jM5764b) * (-862048943);
            int i17 = iHashCode2 ^ (iHashCode2 << 16);
            int i18 = i17 & 127;
            int i19 = c2443y4.f7895c;
            int i20 = i17 >>> 7;
            loop5: while (true) {
                int i21 = i20 & i19;
                long[] jArr2 = c2443y4.f7893a;
                int i22 = i21 >> 3;
                int i23 = (i21 & 7) << 3;
                long j12 = ((jArr2[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr2[i22] >>> i23);
                long j13 = (((long) i18) * 72340172838076673L) ^ j12;
                long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j14 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i21) & i19;
                    if (c2443y4.f7894b[iNumberOfTrailingZeros] == jM5764b) {
                        break loop5;
                    }
                    j14 &= j14 - 1;
                }
                i7 += 8;
                i20 = i21 + i7;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c2443y4.f7896d--;
                long[] jArr3 = c2443y4.f7893a;
                int i24 = c2443y4.f7895c;
                int i25 = iNumberOfTrailingZeros >> 3;
                int i26 = (iNumberOfTrailingZeros & 7) << 3;
                long j15 = (jArr3[i25] & (~(255 << i26))) | (254 << i26);
                jArr3[i25] = j15;
                jArr3[(((iNumberOfTrailingZeros - 7) & i24) + (i24 & 7)) >> 3] = j15;
                return true;
            }
        }
        return true;
    }
}

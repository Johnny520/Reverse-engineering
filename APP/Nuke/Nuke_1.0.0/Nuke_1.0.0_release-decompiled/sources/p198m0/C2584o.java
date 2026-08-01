package p198m0;

import android.view.View;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p047I0.C0762t;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1483e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p169h0.AbstractC2206o;
import p186k.C2404A;
import p186k.C2443y;

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

    public C2584o(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2) {
        this.f8222a = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f8223b = viewTreeObserverOnGlobalLayoutListenerC0772y2;
        this.f8225d = new C2578i(this, viewTreeObserverOnGlobalLayoutListenerC0772y2);
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4529d(android.view.KeyEvent r14, p112W2.InterfaceC1599a r15) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.C2584o.m4529d(android.view.KeyEvent, W2.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0120, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r6v20, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean m4530e(int r20, p204n0.C2684c r21, p112W2.InterfaceC1601c r22) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.C2584o.m4530e(int, n0.c, W2.c):java.lang.Boolean");
    }

    /* JADX INFO: renamed from: f */
    public final C2567A m4531f() {
        C2567A c2567a = this.f8229h;
        if (c2567a == null || !c2567a.f7199q) {
            return null;
        }
        return c2567a;
    }

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m4535j(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p198m0.C2584o.m4535j(android.view.KeyEvent):boolean");
    }
}

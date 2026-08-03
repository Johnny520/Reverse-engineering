package p041d1;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import okio.C3193a;
import p016b1.C0167g;
import p057e1.C0808c;
import p069f.C0923a0;
import p069f.C0933f0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p089g1.C1275d;
import p131j0.C2046b;
import p136j8.C2104o;
import p236q1.AbstractC3424d;
import p236q1.InterfaceC3425e;
import p292u1.AbstractC4229a;
import p293u2.EnumC4243m;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.InterfaceC5612i;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: d1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0670p implements InterfaceC0666l {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f2054a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC5934t f2055b;

    /* JADX INFO: renamed from: d */
    public final C0663i f2057d;

    /* JADX INFO: renamed from: f */
    public C0923a0 f2059f;

    /* JADX INFO: renamed from: h */
    public C0653b0 f2061h;

    /* JADX INFO: renamed from: c */
    public final C0653b0 f2056c = new C0653b0(2, null, 14);

    /* JADX INFO: renamed from: e */
    public final C0667m f2058e = new C0667m(this);

    /* JADX INFO: renamed from: g */
    public final C0933f0 f2060g = new C0933f0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0670p(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2) {
        this.f2054a = viewTreeObserverOnGlobalLayoutListenerC5934t;
        this.f2055b = viewTreeObserverOnGlobalLayoutListenerC5934t2;
        this.f2057d = new C0663i(this, viewTreeObserverOnGlobalLayoutListenerC5934t2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1843a(boolean z9) {
        C5587b1 c5587b1;
        if (m1848f() != null) {
            C0653b0 c0653b0M1848f = m1848f();
            m1851i(null);
            if (c0653b0M1848f != null) {
                EnumC0680z enumC0680z = EnumC0680z.f2084g;
                EnumC0680z enumC0680z2 = EnumC0680z.f2086i;
                c0653b0M1848f.m1798l1(enumC0680z, enumC0680z2);
                if (!c0653b0M1848f.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n = c0653b0M1848f.f23788g.f23792k;
                C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1848f);
                while (c5602f0M10167w != null) {
                    if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                        while (abstractC5852n != null) {
                            if ((abstractC5852n.f23790i & 1024) != 0) {
                                C2046b c2046b = null;
                                AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                                while (abstractC5852nM10149e != null) {
                                    if (abstractC5852nM10149e instanceof C0653b0) {
                                        ((C0653b0) abstractC5852nM10149e).m1798l1(EnumC0680z.f2085h, enumC0680z2);
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
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1844b(int i9, boolean z9, boolean z10) {
        int iOrdinal;
        boolean z11 = true;
        if (z9 || (iOrdinal = AbstractC0656d.m1828t(this.f2056c, i9).ordinal()) == 0) {
            m1843a(z9);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                C3193a.m6822k();
                return false;
            }
            z11 = false;
        }
        if (z11 && z10) {
            m1845c();
        }
        return z11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1845c() {
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f2054a;
        if (viewTreeObserverOnGlobalLayoutListenerC5934t.isFocused() || viewTreeObserverOnGlobalLayoutListenerC5934t.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC5934t.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC5934t.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC5934t.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC5934t.clearFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x0137 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:205:0x0251 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:237:0x02b1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:288:0x0260 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:292:0x0218 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:294:0x0218 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:297:0x025a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:302:0x02c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:306:0x0278 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:308:0x0278 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:311:0x02ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:327:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:330:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:331:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:335:0x00ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:348:0x0146 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:352:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:353:0x0109 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:357:0x0140 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00b1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:10:0x001c, B:14:0x0026, B:17:0x0032, B:19:0x0038, B:20:0x003d, B:22:0x0045, B:24:0x004a, B:26:0x0050, B:30:0x0056, B:128:0x016a, B:130:0x0170, B:131:0x0173, B:133:0x017e, B:136:0x018a, B:140:0x0194, B:143:0x019a, B:144:0x019f, B:147:0x01a7, B:149:0x01ad, B:151:0x01b1, B:153:0x01b9, B:155:0x01bf, B:159:0x01c7, B:161:0x01d0, B:162:0x01d4, B:163:0x01d7, B:166:0x01dd, B:167:0x01e2, B:168:0x01e5, B:170:0x01eb, B:172:0x01ef, B:175:0x01f6, B:177:0x01fe, B:184:0x0215, B:186:0x021a, B:188:0x021e, B:211:0x0260, B:192:0x022a, B:194:0x0230, B:196:0x0234, B:198:0x023c, B:200:0x0242, B:204:0x024a, B:206:0x0253, B:207:0x0257, B:208:0x025a, B:212:0x0265, B:216:0x0275, B:218:0x027a, B:220:0x027e, B:243:0x02c0, B:224:0x028a, B:226:0x0290, B:228:0x0294, B:230:0x029c, B:232:0x02a2, B:236:0x02aa, B:238:0x02b3, B:239:0x02b7, B:240:0x02ba, B:245:0x02c7, B:247:0x02ce, B:34:0x005e, B:36:0x0064, B:37:0x0067, B:39:0x006f, B:42:0x007b, B:46:0x0085, B:77:0x00d8, B:79:0x00dc, B:49:0x008a, B:51:0x0090, B:53:0x0094, B:55:0x009c, B:57:0x00a2, B:61:0x00aa, B:63:0x00b3, B:64:0x00b7, B:65:0x00ba, B:68:0x00c0, B:69:0x00c5, B:70:0x00c8, B:72:0x00ce, B:74:0x00d2, B:80:0x00e2, B:82:0x00e8, B:83:0x00eb, B:85:0x00f5, B:88:0x0101, B:92:0x010b, B:123:0x015e, B:125:0x0162, B:95:0x0110, B:97:0x0116, B:99:0x011a, B:101:0x0122, B:103:0x0128, B:107:0x0130, B:109:0x0139, B:110:0x013d, B:111:0x0140, B:114:0x0146, B:115:0x014b, B:116:0x014e, B:118:0x0154, B:120:0x0158), top: B:256:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r0v24, types: [y0.n] */
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
    /* JADX WARN: Type inference failed for: r0v9, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r15v5, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r15v9, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1846d(KeyEvent keyEvent, InterfaceC1220a interfaceC1220a) {
        InterfaceC5612i interfaceC5612i;
        AbstractC5852n abstractC5852n;
        C5587b1 c5587b1;
        InterfaceC5612i interfaceC5612i2;
        C5587b1 c5587b12;
        int size;
        C5587b1 c5587b13;
        boolean z9;
        C0653b0 c0653b0 = this.f2056c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f2057d.f2047e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m1852j(keyEvent)) {
                return false;
            }
            C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(c0653b0);
            if (c0653b0M1814f != null) {
                if (!c0653b0M1814f.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitLocalDescendants called on an unattached node");
                }
                AbstractC5852n abstractC5852n2 = c0653b0M1814f.f23788g;
                if ((abstractC5852n2.f23791j & 9216) != 0) {
                    abstractC5852n = null;
                    for (AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                        int i9 = abstractC5852n3.f23790i;
                        if ((i9 & 9216) != 0) {
                            if ((i9 & 1024) != 0) {
                                break;
                            }
                            abstractC5852n = abstractC5852n3;
                        }
                    }
                } else {
                    abstractC5852n = null;
                }
                if (abstractC5852n == null) {
                }
            } else if (c0653b0M1814f == null) {
                if (!c0653b0.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n4 = c0653b0.f23788g.f23792k;
                C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
                loop15: while (true) {
                    if (c5602f0M10167w == null) {
                        interfaceC5612i = null;
                        break;
                    }
                    if ((c5602f0M10167w.f22778L.f22719f.f23791j & 8192) != 0) {
                        while (abstractC5852n4 != null) {
                            if ((abstractC5852n4.f23790i & 8192) != 0) {
                                AbstractC5852n abstractC5852nM10149e = abstractC5852n4;
                                C2046b c2046b = null;
                                while (abstractC5852nM10149e != null) {
                                    if (abstractC5852nM10149e instanceof InterfaceC3425e) {
                                        interfaceC5612i = abstractC5852nM10149e;
                                        break loop15;
                                    }
                                    if ((abstractC5852nM10149e.f23790i & 8192) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                        AbstractC5852n abstractC5852n5 = ((AbstractC5615j) abstractC5852nM10149e).f22875v;
                                        int i10 = 0;
                                        abstractC5852nM10149e = abstractC5852nM10149e;
                                        c2046b = c2046b;
                                        while (abstractC5852n5 != null) {
                                            if ((abstractC5852n5.f23790i & 8192) != 0) {
                                                i10++;
                                                c2046b = c2046b;
                                                if (i10 == 1) {
                                                    abstractC5852nM10149e = abstractC5852n5;
                                                } else {
                                                    if (c2046b == null) {
                                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e != null) {
                                                        c2046b.m5056b(abstractC5852nM10149e);
                                                        abstractC5852nM10149e = null;
                                                    }
                                                    c2046b.m5056b(abstractC5852n5);
                                                }
                                            }
                                            abstractC5852n5 = abstractC5852n5.f23793l;
                                            abstractC5852nM10149e = abstractC5852nM10149e;
                                            c2046b = c2046b;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                                }
                            }
                            abstractC5852n4 = abstractC5852n4.f23792k;
                        }
                    }
                    c5602f0M10167w = c5602f0M10167w.m10049u();
                    abstractC5852n4 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
                }
                InterfaceC5612i interfaceC5612i3 = (InterfaceC3425e) interfaceC5612i;
                abstractC5852n = interfaceC5612i3 != null ? ((AbstractC5852n) interfaceC5612i3).f23788g : null;
            } else {
                if (!c0653b0M1814f.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n6 = c0653b0M1814f.f23788g;
                C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(c0653b0M1814f);
                loop11: while (true) {
                    if (c5602f0M10167w2 == null) {
                        interfaceC5612i2 = null;
                        break;
                    }
                    if ((c5602f0M10167w2.f22778L.f22719f.f23791j & 8192) != 0) {
                        while (abstractC5852n6 != null) {
                            if ((abstractC5852n6.f23790i & 8192) != 0) {
                                C2046b c2046b2 = null;
                                AbstractC5852n abstractC5852nM10149e2 = abstractC5852n6;
                                while (abstractC5852nM10149e2 != null) {
                                    if (abstractC5852nM10149e2 instanceof InterfaceC3425e) {
                                        interfaceC5612i2 = abstractC5852nM10149e2;
                                        break loop11;
                                    }
                                    if ((abstractC5852nM10149e2.f23790i & 8192) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                        AbstractC5852n abstractC5852n7 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v;
                                        int i11 = 0;
                                        abstractC5852nM10149e2 = abstractC5852nM10149e2;
                                        c2046b2 = c2046b2;
                                        while (abstractC5852n7 != null) {
                                            if ((abstractC5852n7.f23790i & 8192) != 0) {
                                                i11++;
                                                c2046b2 = c2046b2;
                                                if (i11 == 1) {
                                                    abstractC5852nM10149e2 = abstractC5852n7;
                                                } else {
                                                    if (c2046b2 == null) {
                                                        c2046b2 = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e2 != null) {
                                                        c2046b2.m5056b(abstractC5852nM10149e2);
                                                        abstractC5852nM10149e2 = null;
                                                    }
                                                    c2046b2.m5056b(abstractC5852n7);
                                                }
                                            }
                                            abstractC5852n7 = abstractC5852n7.f23793l;
                                            abstractC5852nM10149e2 = abstractC5852nM10149e2;
                                            c2046b2 = c2046b2;
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b2);
                                }
                            }
                            abstractC5852n6 = abstractC5852n6.f23792k;
                        }
                    }
                    c5602f0M10167w2 = c5602f0M10167w2.m10049u();
                    abstractC5852n6 = (c5602f0M10167w2 == null || (c5587b12 = c5602f0M10167w2.f22778L) == null) ? null : c5587b12.f22718e;
                }
                InterfaceC5612i interfaceC5612i4 = (InterfaceC3425e) interfaceC5612i2;
                if (interfaceC5612i4 != null) {
                    abstractC5852n = ((AbstractC5852n) interfaceC5612i4).f23788g;
                }
            }
            if (abstractC5852n != null) {
                if (!abstractC5852n.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n8 = abstractC5852n.f23788g.f23792k;
                C5602f0 c5602f0M10167w3 = AbstractC5618k.m10167w(abstractC5852n);
                ArrayList arrayList = null;
                while (c5602f0M10167w3 != null) {
                    if ((c5602f0M10167w3.f22778L.f22719f.f23791j & 8192) != 0) {
                        while (abstractC5852n8 != null) {
                            if ((abstractC5852n8.f23790i & 8192) != 0) {
                                AbstractC5852n abstractC5852nM10149e3 = abstractC5852n8;
                                C2046b c2046b3 = null;
                                while (abstractC5852nM10149e3 != null) {
                                    if (abstractC5852nM10149e3 instanceof InterfaceC3425e) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC5852nM10149e3);
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    if (z9 && (abstractC5852nM10149e3.f23790i & 8192) != 0 && (abstractC5852nM10149e3 instanceof AbstractC5615j)) {
                                        int i12 = 0;
                                        for (AbstractC5852n abstractC5852n9 = ((AbstractC5615j) abstractC5852nM10149e3).f22875v; abstractC5852n9 != null; abstractC5852n9 = abstractC5852n9.f23793l) {
                                            if ((abstractC5852n9.f23790i & 8192) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    abstractC5852nM10149e3 = abstractC5852n9;
                                                } else {
                                                    if (c2046b3 == null) {
                                                        c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e3 != null) {
                                                        c2046b3.m5056b(abstractC5852nM10149e3);
                                                        abstractC5852nM10149e3 = null;
                                                    }
                                                    c2046b3.m5056b(abstractC5852n9);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e3 = AbstractC5618k.m10149e(c2046b3);
                                }
                            }
                            abstractC5852n8 = abstractC5852n8.f23792k;
                        }
                    }
                    c5602f0M10167w3 = c5602f0M10167w3.m10049u();
                    abstractC5852n8 = (c5602f0M10167w3 == null || (c5587b13 = c5602f0M10167w3.f22778L) == null) ? null : c5587b13.f22718e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i13 = size - 1;
                        if (((InterfaceC3425e) arrayList.get(size)).mo5389C(keyEvent)) {
                            return true;
                        }
                        if (i13 < 0) {
                            break;
                        }
                        size = i13;
                    }
                }
                ?? M10149e = abstractC5852n.f23788g;
                ?? c2046b4 = 0;
                while (M10149e != 0) {
                    if (M10149e instanceof InterfaceC3425e) {
                        if (((InterfaceC3425e) M10149e).mo5389C(keyEvent)) {
                            return true;
                        }
                    } else if ((M10149e.f23790i & 8192) != 0 && (M10149e instanceof AbstractC5615j)) {
                        AbstractC5852n abstractC5852n10 = ((AbstractC5615j) M10149e).f22875v;
                        int i14 = 0;
                        M10149e = M10149e;
                        c2046b4 = c2046b4;
                        while (abstractC5852n10 != null) {
                            if ((abstractC5852n10.f23790i & 8192) != 0) {
                                i14++;
                                c2046b4 = c2046b4;
                                if (i14 == 1) {
                                    M10149e = abstractC5852n10;
                                } else {
                                    if (c2046b4 == 0) {
                                        c2046b4 = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (M10149e != 0) {
                                        c2046b4.m5056b(M10149e);
                                        M10149e = 0;
                                    }
                                    c2046b4.m5056b(abstractC5852n10);
                                }
                            }
                            abstractC5852n10 = abstractC5852n10.f23793l;
                            M10149e = M10149e;
                            c2046b4 = c2046b4;
                        }
                        if (i14 == 1) {
                        }
                    }
                    M10149e = AbstractC5618k.m10149e(c2046b4);
                }
                if (((Boolean) interfaceC1220a.invoke()).booleanValue()) {
                    return true;
                }
                ?? M10149e2 = abstractC5852n.f23788g;
                ?? c2046b5 = 0;
                while (M10149e2 != 0) {
                    if (M10149e2 instanceof InterfaceC3425e) {
                        if (((InterfaceC3425e) M10149e2).mo5390W(keyEvent)) {
                            return true;
                        }
                    } else if ((M10149e2.f23790i & 8192) != 0 && (M10149e2 instanceof AbstractC5615j)) {
                        AbstractC5852n abstractC5852n11 = ((AbstractC5615j) M10149e2).f22875v;
                        int i15 = 0;
                        c2046b5 = c2046b5;
                        M10149e2 = M10149e2;
                        while (abstractC5852n11 != null) {
                            if ((abstractC5852n11.f23790i & 8192) != 0) {
                                i15++;
                                c2046b5 = c2046b5;
                                if (i15 == 1) {
                                    M10149e2 = abstractC5852n11;
                                } else {
                                    if (c2046b5 == 0) {
                                        c2046b5 = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (M10149e2 != 0) {
                                        c2046b5.m5056b(M10149e2);
                                        M10149e2 = 0;
                                    }
                                    c2046b5.m5056b(abstractC5852n11);
                                }
                            }
                            abstractC5852n11 = abstractC5852n11.f23793l;
                            c2046b5 = c2046b5;
                            M10149e2 = M10149e2;
                        }
                        if (i15 == 1) {
                        }
                    }
                    M10149e2 = AbstractC5618k.m10149e(c2046b5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        if (((InterfaceC3425e) arrayList.get(i16)).mo5390W(keyEvent)) {
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
    /* JADX WARN: Code restructure failed: missing block: B:233:0x011e, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r6v14, types: [fg.l, gg.m] */
    /* JADX WARN: Type inference failed for: r6v20, types: [fg.l, gg.m] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m1847e(int i9, C0808c c0808c, InterfaceC1231l interfaceC1231l) {
        boolean zM1809a;
        C0653b0 c0653b0;
        C5587b1 c5587b1;
        C0653b0 c0653b02 = this.f2056c;
        C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(c0653b02);
        int i10 = 4;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f2055b;
        boolean zBooleanValue = false;
        if (c0653b0M1814f != null) {
            EnumC4243m layoutDirection = viewTreeObserverOnGlobalLayoutListenerC5934t.getLayoutDirection();
            C0674t c0674tM1799m1 = c0653b0M1814f.m1799m1();
            C0676v c0676v = c0674tM1799m1.f2073h;
            C0676v c0676v2 = c0674tM1799m1.f2074i;
            if (i9 == 1) {
                c0676v = c0674tM1799m1.f2067b;
            } else if (i9 == 2) {
                c0676v = c0674tM1799m1.f2068c;
            } else if (i9 == 5) {
                c0676v = c0674tM1799m1.f2069d;
            } else if (i9 == 6) {
                c0676v = c0674tM1799m1.f2070e;
            } else if (i9 == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        C3193a.m6822k();
                        return null;
                    }
                    c0676v = c0676v2;
                }
                if (c0676v == C0676v.f2078b) {
                    c0676v = null;
                }
                if (c0676v == null) {
                    c0676v = c0674tM1799m1.f2071f;
                }
            } else if (i9 == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    c0676v = c0676v2;
                } else if (iOrdinal2 != 1) {
                    C3193a.m6822k();
                    return null;
                }
                if (c0676v == C0676v.f2078b) {
                    c0676v = null;
                }
                if (c0676v == null) {
                    c0676v = c0674tM1799m1.f2072g;
                }
            } else {
                if (i9 != 7 && i9 != 8) {
                    C2104o.m5276A("invalid FocusDirection");
                    return null;
                }
                C0650a c0650a = new C0650a(i9);
                C0670p c0670p = (C0670p) ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(c0653b0M1814f)).getFocusOwner();
                C0653b0 c0653b0M1848f = c0670p.m1848f();
                if (i9 == 7) {
                    c0674tM1799m1.f2075j.invoke(c0650a);
                } else {
                    c0674tM1799m1.f2076k.invoke(c0650a);
                }
                c0676v = c0650a.f2017b ? C0676v.f2079c : c0653b0M1848f != c0670p.m1848f() ? C0676v.f2080d : C0676v.f2078b;
            }
            C0676v c0676v3 = C0676v.f2079c;
            if (!AbstractC1416l.m3825a(c0676v, c0676v3)) {
                if (AbstractC1416l.m3825a(c0676v, C0676v.f2080d)) {
                    C0653b0 c0653b0M1814f2 = AbstractC0656d.m1814f(c0653b02);
                    if (c0653b0M1814f2 != null) {
                        return (Boolean) interfaceC1231l.invoke(c0653b0M1814f2);
                    }
                } else {
                    C0676v c0676v4 = C0676v.f2078b;
                    if (!AbstractC1416l.m3825a(c0676v, c0676v4)) {
                        if (c0676v == c0676v4) {
                            C2104o.m5276A("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (c0676v == c0676v3) {
                            C2104o.m5276A("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        C2046b c2046b = c0676v.f2081a;
                        int i11 = c2046b.f6893i;
                        if (i11 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = c2046b.f6891g;
                            boolean z9 = false;
                            for (int i12 = 0; i12 < i11; i12++) {
                                AbstractC5852n abstractC5852n = (AbstractC5852n) ((InterfaceC0678x) objArr[i12]);
                                if (!abstractC5852n.f23788g.f23801t) {
                                    AbstractC4229a.m8494b("visitChildren called on an unattached node");
                                }
                                C2046b c2046b2 = new C2046b(new AbstractC5852n[16]);
                                AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g;
                                AbstractC5852n abstractC5852n3 = abstractC5852n2.f23793l;
                                if (abstractC5852n3 == null) {
                                    AbstractC5618k.m10146b(c2046b2, abstractC5852n2);
                                } else {
                                    c2046b2.m5056b(abstractC5852n3);
                                }
                                while (true) {
                                    int i13 = c2046b2.f6893i;
                                    if (i13 != 0) {
                                        AbstractC5852n abstractC5852nM10149e = (AbstractC5852n) c2046b2.m5065k(i13 - 1);
                                        if ((abstractC5852nM10149e.f23791j & 1024) == 0) {
                                            AbstractC5618k.m10146b(c2046b2, abstractC5852nM10149e);
                                        } else {
                                            while (true) {
                                                if (abstractC5852nM10149e == null) {
                                                    break;
                                                }
                                                if ((abstractC5852nM10149e.f23790i & 1024) != 0) {
                                                    C2046b c2046b3 = null;
                                                    while (abstractC5852nM10149e != null) {
                                                        if (abstractC5852nM10149e instanceof C0653b0) {
                                                            if (((Boolean) interfaceC1231l.invoke((C0653b0) abstractC5852nM10149e)).booleanValue()) {
                                                                z9 = true;
                                                                break;
                                                            }
                                                        } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                                            int i14 = 0;
                                                            for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                                                if ((abstractC5852n4.f23790i & 1024) != 0) {
                                                                    i14++;
                                                                    if (i14 == 1) {
                                                                        abstractC5852nM10149e = abstractC5852n4;
                                                                    } else {
                                                                        if (c2046b3 == null) {
                                                                            c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                                        }
                                                                        if (abstractC5852nM10149e != null) {
                                                                            c2046b3.m5056b(abstractC5852nM10149e);
                                                                            abstractC5852nM10149e = null;
                                                                        }
                                                                        c2046b3.m5056b(abstractC5852n4);
                                                                    }
                                                                }
                                                            }
                                                            if (i14 == 1) {
                                                            }
                                                        }
                                                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b3);
                                                    }
                                                } else {
                                                    abstractC5852nM10149e = abstractC5852nM10149e.f23793l;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z9;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        c0653b0M1814f = null;
        EnumC4243m layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC5934t.getLayoutDirection();
        C0167g c0167g = new C0167g(c0653b0M1814f, this, interfaceC1231l);
        if (i9 == 1 || i9 == 2) {
            if (i9 == 1) {
                zM1809a = AbstractC0656d.m1819k(c0653b02, c0167g);
            } else {
                if (i9 != 2) {
                    C2104o.m5276A("This function should only be used for 1-D focus search");
                    return null;
                }
                zM1809a = AbstractC0656d.m1809a(c0653b02, c0167g);
            }
            return Boolean.valueOf(zM1809a);
        }
        if (i9 == 3 || i9 == 4 || i9 == 5 || i9 == 6) {
            return AbstractC0656d.m1808C(i9, c0167g, c0653b02, c0808c);
        }
        if (i9 == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    C3193a.m6822k();
                    return null;
                }
                i10 = 3;
            }
            C0653b0 c0653b0M1814f3 = AbstractC0656d.m1814f(c0653b02);
            if (c0653b0M1814f3 != null) {
                return AbstractC0656d.m1808C(i10, c0167g, c0653b0M1814f3, c0808c);
            }
            return null;
        }
        if (i9 != 8) {
            C1275d.m3414h(C0660f.m1836a(i9), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        C0653b0 c0653b0M1814f4 = AbstractC0656d.m1814f(c0653b02);
        if (c0653b0M1814f4 == null) {
            c0653b0 = null;
        } else {
            if (!c0653b0M1814f4.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n5 = c0653b0M1814f4.f23788g.f23792k;
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1814f4);
            loop5: while (c5602f0M10167w != null) {
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 1024) != 0) {
                    while (abstractC5852n5 != null) {
                        if ((abstractC5852n5.f23790i & 1024) != 0) {
                            AbstractC5852n abstractC5852nM10149e2 = abstractC5852n5;
                            C2046b c2046b4 = null;
                            while (abstractC5852nM10149e2 != null) {
                                if (abstractC5852nM10149e2 instanceof C0653b0) {
                                    C0653b0 c0653b03 = (C0653b0) abstractC5852nM10149e2;
                                    if (c0653b03.m1799m1().f2066a) {
                                        c0653b0 = c0653b03;
                                        break loop5;
                                    }
                                } else if ((abstractC5852nM10149e2.f23790i & 1024) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                    int i15 = 0;
                                    for (AbstractC5852n abstractC5852n6 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n6 != null; abstractC5852n6 = abstractC5852n6.f23793l) {
                                        if ((abstractC5852n6.f23790i & 1024) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                abstractC5852nM10149e2 = abstractC5852n6;
                                            } else {
                                                if (c2046b4 == null) {
                                                    c2046b4 = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e2 != null) {
                                                    c2046b4.m5056b(abstractC5852nM10149e2);
                                                    abstractC5852nM10149e2 = null;
                                                }
                                                c2046b4.m5056b(abstractC5852n6);
                                            }
                                        }
                                    }
                                    if (i15 != 1) {
                                        abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b4);
                                    }
                                }
                                abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b4);
                            }
                        }
                        abstractC5852n5 = abstractC5852n5.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n5 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
            }
            c0653b0 = null;
        }
        if (c0653b0 != null && !c0653b0.equals(c0653b02)) {
            zBooleanValue = ((Boolean) c0167g.invoke(c0653b0)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0653b0 m1848f() {
        C0653b0 c0653b0 = this.f2061h;
        if (c0653b0 == null || !c0653b0.f23801t) {
            return null;
        }
        return c0653b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m1849g(int i9, boolean z9) {
        C0653b0 c0653b0M1848f = m1848f();
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f2054a;
        if (c0653b0M1848f == null || !c0653b0M1848f.f2023u || !viewTreeObserverOnGlobalLayoutListenerC5934t.m10668z(i9)) {
            C1425u c1425u = new C1425u();
            c1425u.f4738g = Boolean.FALSE;
            C0653b0 c0653b0M1848f2 = m1848f();
            Boolean boolM1847e = m1847e(i9, viewTreeObserverOnGlobalLayoutListenerC5934t.getEmbeddedViewFocusRect(), new C0668n(c1425u, i9));
            if (!AbstractC1416l.m3825a(boolM1847e, Boolean.TRUE) || c0653b0M1848f2 == m1848f()) {
                if (boolM1847e != null && c1425u.f4738g != null) {
                    if (!boolM1847e.booleanValue() || !((Boolean) c1425u.f4738g).booleanValue()) {
                        if ((i9 == 1 || i9 == 2) && z9 && m1844b(i9, false, false)) {
                            Boolean boolM1847e2 = m1847e(i9, null, new C0669o(i9, 1));
                            if (boolM1847e2 != null ? boolM1847e2.booleanValue() : false) {
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
    public final boolean m1850h(int i9) {
        if (!m1844b(i9, false, false)) {
            return false;
        }
        Boolean boolM1847e = m1847e(i9, null, new C0669o(i9, 0));
        boolean zBooleanValue = boolM1847e != null ? boolM1847e.booleanValue() : false;
        if (!zBooleanValue) {
            m1845c();
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1851i(C0653b0 c0653b0) {
        C0653b0 c0653b02 = this.f2061h;
        this.f2061h = c0653b0;
        C0933f0 c0933f0 = this.f2060g;
        Object[] objArr = c0933f0.f2923a;
        int i9 = c0933f0.f2924b;
        for (int i10 = 0; i10 < i9; i10++) {
            ((InterfaceC0664j) objArr[i10]).mo1842e(c0653b02, c0653b0);
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
    
        r3 = r4.m2265b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (r4.f2892e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00be, code lost:
    
        if (((r4.f2888a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c0, code lost:
    
        r33 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r3 = r4.f2890c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ca, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f2891d) * 32, ((long) r3) * 25) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00dd, code lost:
    
        r3 = r4.f2888a;
        r8 = r4.f2890c;
        r9 = r4.f2889b;
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
        r5 = tf.AbstractC4165l.m8365B0(r3);
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
        r15 = r4.m2265b(r14);
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
        r4.f2892e = p069f.AbstractC0957r0.m2355a(r4.f2890c) - r4.f2891d;
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
    
        r3 = p069f.AbstractC0957r0.m2356b(r4.f2890c);
        r5 = r4.f2888a;
        r6 = r4.f2889b;
        r7 = r4.f2890c;
        r4.m2266c(r3);
        r3 = r4.f2888a;
        r8 = r4.f2889b;
        r9 = r4.f2890c;
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
        r3 = r4.m2265b(r15 >>> 7);
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
    
        r3 = r4.m2265b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x027d, code lost:
    
        r32 = r3;
        r4.f2891d++;
        r3 = r4.f2892e;
        r5 = r4.f2888a;
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
    
        r4.f2892e = r3 - r21;
        r3 = r4.f2890c;
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
    public final boolean m1852j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j3;
        boolean z9;
        int iNumberOfTrailingZeros2;
        long jM7198b = AbstractC3424d.m7198b(keyEvent);
        int iM7199c = AbstractC3424d.m7199c(keyEvent);
        int i9 = -862048943;
        long j4 = 0;
        int i10 = 8;
        int i11 = 0;
        ?? r21 = 0;
        boolean z10 = true;
        if (iM7199c == 2) {
            C0923a0 c0923a0 = this.f2059f;
            if (c0923a0 == null) {
                c0923a0 = new C0923a0(3);
                this.f2059f = c0923a0;
            }
            C0923a0 c0923a02 = c0923a0;
            int iHashCode = Long.hashCode(jM7198b) * (-862048943);
            int i12 = iHashCode ^ (iHashCode << 16);
            int i13 = i12 >>> 7;
            int i14 = i12 & 127;
            int i15 = c0923a02.f2890c;
            int i16 = i13 & i15;
            int i17 = 0;
            loop0: while (true) {
                long[] jArr = c0923a02.f2888a;
                int i18 = i16 >> 3;
                int i19 = i9;
                int i20 = (i16 & 7) << 3;
                long j5 = (jArr[i18] >>> i20) | ((jArr[i18 + 1] << (64 - i20)) & ((-i20) >> 63));
                long j10 = i14;
                long j11 = j5 ^ (j10 * 72340172838076673L);
                long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L);
                while (true) {
                    if (j12 == j4) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i16 + (Long.numberOfTrailingZeros(j12) >> 3)) & i15;
                    long j13 = j4;
                    if (c0923a02.f2889b[iNumberOfTrailingZeros2] == jM7198b) {
                        z9 = true;
                        break loop0;
                    }
                    j12 &= j12 - 1;
                    j4 = j13;
                }
                i17 += 8;
                i16 = (i16 + i17) & i15;
                i10 = i10;
                i9 = i19;
                j4 = j3;
            }
            c0923a02.f2889b[iNumberOfTrailingZeros2] = jM7198b;
            return z9;
        }
        if (iM7199c != 1) {
            return true;
        }
        C0923a0 c0923a03 = this.f2059f;
        if (c0923a03 == null || !c0923a03.m2264a(jM7198b)) {
            return false;
        }
        C0923a0 c0923a04 = this.f2059f;
        if (c0923a04 != null) {
            int iHashCode2 = Long.hashCode(jM7198b) * (-862048943);
            int i21 = iHashCode2 ^ (iHashCode2 << 16);
            int i22 = i21 & 127;
            int i23 = c0923a04.f2890c;
            int i24 = i21 >>> 7;
            loop5: while (true) {
                int i25 = i24 & i23;
                long[] jArr2 = c0923a04.f2888a;
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                long j14 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
                long j15 = (((long) i22) * 72340172838076673L) ^ j14;
                long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j16 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j16) >> 3) + i25) & i23;
                    if (c0923a04.f2889b[iNumberOfTrailingZeros] == jM7198b) {
                        break loop5;
                    }
                    j16 &= j16 - 1;
                }
                i11 += 8;
                i24 = i25 + i11;
            }
            if (iNumberOfTrailingZeros >= 0) {
                c0923a04.f2891d--;
                long[] jArr3 = c0923a04.f2888a;
                int i28 = c0923a04.f2890c;
                int i29 = iNumberOfTrailingZeros >> 3;
                int i30 = (iNumberOfTrailingZeros & 7) << 3;
                long j17 = (jArr3[i29] & (~(255 << i30))) | (254 << i30);
                jArr3[i29] = j17;
                jArr3[(((iNumberOfTrailingZeros - 7) & i28) + (i28 & 7)) >> 3] = j17;
                return true;
            }
        }
        return true;
    }
}

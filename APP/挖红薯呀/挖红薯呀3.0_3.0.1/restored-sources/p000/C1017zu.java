package p000;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: zu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1017zu implements InterfaceC0902wu {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f7996a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f7997b;

    /* JADX INFO: renamed from: d */
    public final C0816uu f7999d;

    /* JADX INFO: renamed from: f */
    public ah0 f8001f;

    /* JADX INFO: renamed from: h */
    public C0149dv f8003h;

    /* JADX INFO: renamed from: c */
    public final C0149dv f7998c = new C0149dv(2, null, 14);

    /* JADX INFO: renamed from: e */
    public final C0939xu f8000e = new C0939xu(this);

    /* JADX INFO: renamed from: g */
    public final dh0 f8002g = new dh0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1017zu(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32) {
        this.f7996a = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        this.f7997b = viewTreeObserverOnGlobalLayoutListenerC0875w32;
        this.f7999d = new C0816uu(this, viewTreeObserverOnGlobalLayoutListenerC0875w32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m5607a(boolean z) {
        mj0 mj0Var;
        if (m5612f() != null) {
            C0149dv c0149dvM5612f = m5612f();
            m5614h(null);
            if (c0149dvM5612f != null) {
                EnumC0106cv enumC0106cv = EnumC0106cv.f893d;
                EnumC0106cv enumC0106cv2 = EnumC0106cv.f895f;
                c0149dvM5612f.m732x0(enumC0106cv, enumC0106cv2);
                if (!c0149dvM5612f.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = c0149dvM5612f.f4529d.f4533h;
                b60 b60VarM3039Q = pf1.m3039Q(c0149dvM5612f);
                while (b60VarM3039Q != null) {
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 1024) != 0) {
                                oe0 oe0VarM3050f = oe0Var;
                                sh0 sh0Var = null;
                                while (oe0VarM3050f != null) {
                                    if (oe0VarM3050f instanceof C0149dv) {
                                        ((C0149dv) oe0VarM3050f).m732x0(EnumC0106cv.f894e, enumC0106cv2);
                                    } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                        int i = 0;
                                        for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                            if ((oe0Var2.f4531f & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    oe0VarM3050f = oe0Var2;
                                                } else {
                                                    if (sh0Var == null) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f != null) {
                                                        sh0Var.m4072b(oe0VarM3050f);
                                                        oe0VarM3050f = null;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    oe0VarM3050f = pf1.m3050f(sh0Var);
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5608b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = pf1.m3031G(this.f7998c).ordinal()) == 0) {
            m5607a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                C0921xc.m5129j();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            m5609c();
        }
        return z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5609c() {
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f7996a;
        if (viewTreeObserverOnGlobalLayoutListenerC0875w3.isFocused() || viewTreeObserverOnGlobalLayoutListenerC0875w3.hasFocus()) {
            viewTreeObserverOnGlobalLayoutListenerC0875w3.clearFocus();
        } else if (viewTreeObserverOnGlobalLayoutListenerC0875w3.hasFocus()) {
            View viewFindFocus = viewTreeObserverOnGlobalLayoutListenerC0875w3.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            viewTreeObserverOnGlobalLayoutListenerC0875w3.clearFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x0134 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:195:0x023a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:227:0x029a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:279:0x0249 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:281:0x020a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:283:0x020a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:286:0x0243 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:293:0x02a9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:295:0x0261 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:297:0x0261 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:300:0x02a3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:316:0x00bd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:319:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:320:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:324:0x00b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:339:0x0143 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:341:0x0106 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:342:0x0106 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:346:0x013d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x00ae */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df A[Catch: all -> 0x02ce, TryCatch #0 {all -> 0x02ce, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:162:0x01d6, B:143:0x01a0, B:145:0x01a6, B:147:0x01aa, B:149:0x01b2, B:151:0x01b8, B:155:0x01c0, B:157:0x01c9, B:158:0x01cd, B:159:0x01d0, B:163:0x01db, B:164:0x01de, B:166:0x01e4, B:168:0x01e8, B:171:0x01ef, B:173:0x01f7, B:177:0x0207, B:179:0x020c, B:181:0x0210, B:201:0x0249, B:182:0x0213, B:184:0x0219, B:186:0x021d, B:188:0x0225, B:190:0x022b, B:194:0x0233, B:196:0x023c, B:197:0x0240, B:198:0x0243, B:202:0x024e, B:206:0x025e, B:208:0x0263, B:210:0x0267, B:233:0x02a9, B:214:0x0273, B:216:0x0279, B:218:0x027d, B:220:0x0285, B:222:0x028b, B:226:0x0293, B:228:0x029c, B:229:0x02a0, B:230:0x02a3, B:235:0x02b0, B:237:0x02b7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:247:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [sh0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [sh0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v24, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v28, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v33, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v41, types: [oe0] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5610d(KeyEvent keyEvent, InterfaceC0298hw interfaceC0298hw) {
        Object obj;
        oe0 oe0Var;
        mj0 mj0Var;
        Object obj2;
        mj0 mj0Var2;
        int size;
        mj0 mj0Var3;
        C0149dv c0149dv = this.f7998c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.f7999d.f6311e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!m5615i(keyEvent)) {
                return false;
            }
            C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(c0149dv);
            if (c0149dvM1538n != null) {
                if (!c0149dvM1538n.f4529d.f4542q) {
                    w10.m4824b("visitLocalDescendants called on an unattached node");
                }
                oe0 oe0Var2 = c0149dvM1538n.f4529d;
                if ((oe0Var2.f4532g & 9216) != 0) {
                    oe0Var = null;
                    for (oe0 oe0Var3 = oe0Var2.f4534i; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                        int i = oe0Var3.f4531f;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            oe0Var = oe0Var3;
                        }
                    }
                } else {
                    oe0Var = null;
                }
                if (oe0Var == null) {
                }
            } else if (c0149dvM1538n == null) {
                if (!c0149dv.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var4 = c0149dv.f4529d.f4533h;
                b60 b60VarM3039Q = pf1.m3039Q(c0149dv);
                loop15: while (true) {
                    if (b60VarM3039Q == null) {
                        obj = null;
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 8192) != 0) {
                        while (oe0Var4 != null) {
                            if ((oe0Var4.f4531f & 8192) != 0) {
                                oe0 oe0VarM3050f = oe0Var4;
                                sh0 sh0Var = null;
                                while (oe0VarM3050f != null) {
                                    if (oe0VarM3050f instanceof a50) {
                                        obj = oe0VarM3050f;
                                        break loop15;
                                    }
                                    if ((oe0VarM3050f.f4531f & 8192) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                        oe0 oe0Var5 = ((AbstractC0731sm) oe0VarM3050f).f5782s;
                                        int i2 = 0;
                                        oe0VarM3050f = oe0VarM3050f;
                                        sh0Var = sh0Var;
                                        while (oe0Var5 != null) {
                                            if ((oe0Var5.f4531f & 8192) != 0) {
                                                i2++;
                                                sh0Var = sh0Var;
                                                if (i2 == 1) {
                                                    oe0VarM3050f = oe0Var5;
                                                } else {
                                                    if (sh0Var == null) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f != null) {
                                                        sh0Var.m4072b(oe0VarM3050f);
                                                        oe0VarM3050f = null;
                                                    }
                                                    sh0Var.m4072b(oe0Var5);
                                                }
                                            }
                                            oe0Var5 = oe0Var5.f4534i;
                                            oe0VarM3050f = oe0VarM3050f;
                                            sh0Var = sh0Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    oe0VarM3050f = pf1.m3050f(sh0Var);
                                }
                            }
                            oe0Var4 = oe0Var4.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var4 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                }
                Object obj3 = (a50) obj;
                oe0Var = obj3 != null ? ((oe0) obj3).f4529d : null;
            } else {
                if (!c0149dvM1538n.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var6 = c0149dvM1538n.f4529d;
                b60 b60VarM3039Q2 = pf1.m3039Q(c0149dvM1538n);
                loop11: while (true) {
                    if (b60VarM3039Q2 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((b60VarM3039Q2.f395I.f3998f.f4532g & 8192) != 0) {
                        while (oe0Var6 != null) {
                            if ((oe0Var6.f4531f & 8192) != 0) {
                                sh0 sh0Var2 = null;
                                oe0 oe0VarM3050f2 = oe0Var6;
                                while (oe0VarM3050f2 != null) {
                                    if (oe0VarM3050f2 instanceof a50) {
                                        obj2 = oe0VarM3050f2;
                                        break loop11;
                                    }
                                    if ((oe0VarM3050f2.f4531f & 8192) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                        oe0 oe0Var7 = ((AbstractC0731sm) oe0VarM3050f2).f5782s;
                                        int i3 = 0;
                                        oe0VarM3050f2 = oe0VarM3050f2;
                                        sh0Var2 = sh0Var2;
                                        while (oe0Var7 != null) {
                                            if ((oe0Var7.f4531f & 8192) != 0) {
                                                i3++;
                                                sh0Var2 = sh0Var2;
                                                if (i3 == 1) {
                                                    oe0VarM3050f2 = oe0Var7;
                                                } else {
                                                    if (sh0Var2 == null) {
                                                        sh0Var2 = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f2 != null) {
                                                        sh0Var2.m4072b(oe0VarM3050f2);
                                                        oe0VarM3050f2 = null;
                                                    }
                                                    sh0Var2.m4072b(oe0Var7);
                                                }
                                            }
                                            oe0Var7 = oe0Var7.f4534i;
                                            oe0VarM3050f2 = oe0VarM3050f2;
                                            sh0Var2 = sh0Var2;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    oe0VarM3050f2 = pf1.m3050f(sh0Var2);
                                }
                            }
                            oe0Var6 = oe0Var6.f4533h;
                        }
                    }
                    b60VarM3039Q2 = b60VarM3039Q2.m315v();
                    oe0Var6 = (b60VarM3039Q2 == null || (mj0Var2 = b60VarM3039Q2.f395I) == null) ? null : mj0Var2.f3997e;
                }
                Object obj4 = (a50) obj2;
                if (obj4 != null) {
                    oe0Var = ((oe0) obj4).f4529d;
                }
            }
            if (oe0Var != null) {
                if (!oe0Var.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var8 = oe0Var.f4529d.f4533h;
                b60 b60VarM3039Q3 = pf1.m3039Q(oe0Var);
                ArrayList arrayList = null;
                while (b60VarM3039Q3 != null) {
                    if ((b60VarM3039Q3.f395I.f3998f.f4532g & 8192) != 0) {
                        while (oe0Var8 != null) {
                            if ((oe0Var8.f4531f & 8192) != 0) {
                                oe0 oe0VarM3050f3 = oe0Var8;
                                sh0 sh0Var3 = null;
                                while (oe0VarM3050f3 != null) {
                                    if (oe0VarM3050f3 instanceof a50) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(oe0VarM3050f3);
                                    } else if ((oe0VarM3050f3.f4531f & 8192) != 0 && (oe0VarM3050f3 instanceof AbstractC0731sm)) {
                                        int i4 = 0;
                                        for (oe0 oe0Var9 = ((AbstractC0731sm) oe0VarM3050f3).f5782s; oe0Var9 != null; oe0Var9 = oe0Var9.f4534i) {
                                            if ((oe0Var9.f4531f & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    oe0VarM3050f3 = oe0Var9;
                                                } else {
                                                    if (sh0Var3 == null) {
                                                        sh0Var3 = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f3 != null) {
                                                        sh0Var3.m4072b(oe0VarM3050f3);
                                                        oe0VarM3050f3 = null;
                                                    }
                                                    sh0Var3.m4072b(oe0Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    oe0VarM3050f3 = pf1.m3050f(sh0Var3);
                                }
                            }
                            oe0Var8 = oe0Var8.f4533h;
                        }
                    }
                    b60VarM3039Q3 = b60VarM3039Q3.m315v();
                    oe0Var8 = (b60VarM3039Q3 == null || (mj0Var3 = b60VarM3039Q3.f395I) == null) ? null : mj0Var3.f3997e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        ((a50) arrayList.get(size)).getClass();
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M3050f = oe0Var.f4529d;
                ?? sh0Var4 = 0;
                while (M3050f != 0) {
                    if (M3050f instanceof a50) {
                    } else if ((M3050f.f4531f & 8192) != 0 && (M3050f instanceof AbstractC0731sm)) {
                        oe0 oe0Var10 = ((AbstractC0731sm) M3050f).f5782s;
                        int i6 = 0;
                        sh0Var4 = sh0Var4;
                        M3050f = M3050f;
                        while (oe0Var10 != null) {
                            if ((oe0Var10.f4531f & 8192) != 0) {
                                i6++;
                                sh0Var4 = sh0Var4;
                                if (i6 == 1) {
                                    M3050f = oe0Var10;
                                } else {
                                    if (sh0Var4 == 0) {
                                        sh0Var4 = new sh0(new oe0[16]);
                                    }
                                    if (M3050f != 0) {
                                        sh0Var4.m4072b(M3050f);
                                        M3050f = 0;
                                    }
                                    sh0Var4.m4072b(oe0Var10);
                                }
                            }
                            oe0Var10 = oe0Var10.f4534i;
                            sh0Var4 = sh0Var4;
                            M3050f = M3050f;
                        }
                        if (i6 == 1) {
                        }
                    }
                    M3050f = pf1.m3050f(sh0Var4);
                }
                if (((Boolean) interfaceC0298hw.invoke()).booleanValue()) {
                    return true;
                }
                ?? M3050f2 = oe0Var.f4529d;
                ?? sh0Var5 = 0;
                while (M3050f2 != 0) {
                    if (M3050f2 instanceof a50) {
                        if (((a50) M3050f2).mo22I(keyEvent)) {
                            return true;
                        }
                    } else if ((M3050f2.f4531f & 8192) != 0 && (M3050f2 instanceof AbstractC0731sm)) {
                        oe0 oe0Var11 = ((AbstractC0731sm) M3050f2).f5782s;
                        int i7 = 0;
                        M3050f2 = M3050f2;
                        sh0Var5 = sh0Var5;
                        while (oe0Var11 != null) {
                            if ((oe0Var11.f4531f & 8192) != 0) {
                                i7++;
                                sh0Var5 = sh0Var5;
                                if (i7 == 1) {
                                    M3050f2 = oe0Var11;
                                } else {
                                    if (sh0Var5 == 0) {
                                        sh0Var5 = new sh0(new oe0[16]);
                                    }
                                    if (M3050f2 != 0) {
                                        sh0Var5.m4072b(M3050f2);
                                        M3050f2 = 0;
                                    }
                                    sh0Var5.m4072b(oe0Var11);
                                }
                            }
                            oe0Var11 = oe0Var11.f4534i;
                            M3050f2 = M3050f2;
                            sh0Var5 = sh0Var5;
                        }
                        if (i7 == 1) {
                        }
                    }
                    M3050f2 = pf1.m3050f(sh0Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((a50) arrayList.get(i8)).mo22I(keyEvent)) {
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
    /* JADX WARN: Code restructure failed: missing block: B:227:0x010e, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m5611e(int i, st0 st0Var, InterfaceC0742sw interfaceC0742sw) {
        boolean zM4901h;
        C0149dv c0149dv;
        mj0 mj0Var;
        C0149dv c0149dv2 = this.f7998c;
        C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(c0149dv2);
        int i2 = 4;
        int i3 = 2;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f7997b;
        boolean zBooleanValue = false;
        if (c0149dvM1538n != null) {
            k50 layoutDirection = viewTreeObserverOnGlobalLayoutListenerC0875w3.getLayoutDirection();
            C0032av c0032avM733y0 = c0149dvM1538n.m733y0();
            C0069bv c0069bv = c0032avM733y0.f275h;
            C0069bv c0069bv2 = c0032avM733y0.f276i;
            if (i == 1) {
                c0069bv = c0032avM733y0.f269b;
            } else if (i == 2) {
                c0069bv = c0032avM733y0.f270c;
            } else if (i == 5) {
                c0069bv = c0032avM733y0.f271d;
            } else if (i == 6) {
                c0069bv = c0032avM733y0.f272e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        C0921xc.m5129j();
                        return null;
                    }
                    c0069bv = c0069bv2;
                }
                if (c0069bv == C0069bv.f589b) {
                    c0069bv = null;
                }
                if (c0069bv == null) {
                    c0069bv = c0032avM733y0.f273f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    c0069bv = c0069bv2;
                } else if (iOrdinal2 != 1) {
                    C0921xc.m5129j();
                    return null;
                }
                if (c0069bv == C0069bv.f589b) {
                    c0069bv = null;
                }
                if (c0069bv == null) {
                    c0069bv = c0032avM733y0.f274g;
                }
            } else {
                if (i != 7 && i != 8) {
                    C0921xc.m5134o("invalid FocusDirection");
                    return null;
                }
                C1017zu c1017zu = (C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dvM1538n)).getFocusOwner();
                C0149dv c0149dvM5612f = c1017zu.m5612f();
                if (i == 7) {
                    c0032avM733y0.f277j.getClass();
                } else {
                    c0032avM733y0.f278k.getClass();
                }
                c0069bv = c0149dvM5612f != c1017zu.m5612f() ? C0069bv.f591d : C0069bv.f589b;
            }
            C0069bv c0069bv3 = C0069bv.f590c;
            if (!p30.m3002l(c0069bv, c0069bv3)) {
                if (p30.m3002l(c0069bv, C0069bv.f591d)) {
                    C0149dv c0149dvM1538n2 = AbstractC0307i4.m1538n(c0149dv2);
                    if (c0149dvM1538n2 != null) {
                        return (Boolean) interfaceC0742sw.invoke(c0149dvM1538n2);
                    }
                } else {
                    C0069bv c0069bv4 = C0069bv.f589b;
                    if (!p30.m3002l(c0069bv, c0069bv4)) {
                        if (c0069bv == c0069bv4) {
                            C0921xc.m5134o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (c0069bv == c0069bv3) {
                            C0921xc.m5134o("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        sh0 sh0Var = c0069bv.f592a;
                        int i4 = sh0Var.f5770f;
                        if (i4 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = sh0Var.f5768d;
                            boolean z = false;
                            for (int i5 = 0; i5 < i4; i5++) {
                                C0795u9 c0795u9 = (C0795u9) objArr[i5];
                                if (!c0795u9.f4529d.f4542q) {
                                    w10.m4824b("visitChildren called on an unattached node");
                                }
                                sh0 sh0Var2 = new sh0(new oe0[16]);
                                oe0 oe0Var = c0795u9.f4529d;
                                oe0 oe0Var2 = oe0Var.f4534i;
                                if (oe0Var2 == null) {
                                    pf1.m3049e(sh0Var2, oe0Var);
                                } else {
                                    sh0Var2.m4072b(oe0Var2);
                                }
                                while (true) {
                                    int i6 = sh0Var2.f5770f;
                                    if (i6 != 0) {
                                        oe0 oe0VarM3050f = (oe0) sh0Var2.m4081k(i6 - 1);
                                        if ((oe0VarM3050f.f4532g & 1024) == 0) {
                                            pf1.m3049e(sh0Var2, oe0VarM3050f);
                                        } else {
                                            while (true) {
                                                if (oe0VarM3050f == null) {
                                                    break;
                                                }
                                                if ((oe0VarM3050f.f4531f & 1024) != 0) {
                                                    sh0 sh0Var3 = null;
                                                    while (oe0VarM3050f != null) {
                                                        if (oe0VarM3050f instanceof C0149dv) {
                                                            if (((Boolean) interfaceC0742sw.invoke((C0149dv) oe0VarM3050f)).booleanValue()) {
                                                                z = true;
                                                                break;
                                                            }
                                                        } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                                            int i7 = 0;
                                                            for (oe0 oe0Var3 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var3 != null; oe0Var3 = oe0Var3.f4534i) {
                                                                if ((oe0Var3.f4531f & 1024) != 0) {
                                                                    i7++;
                                                                    if (i7 == 1) {
                                                                        oe0VarM3050f = oe0Var3;
                                                                    } else {
                                                                        if (sh0Var3 == null) {
                                                                            sh0Var3 = new sh0(new oe0[16]);
                                                                        }
                                                                        if (oe0VarM3050f != null) {
                                                                            sh0Var3.m4072b(oe0VarM3050f);
                                                                            oe0VarM3050f = null;
                                                                        }
                                                                        sh0Var3.m4072b(oe0Var3);
                                                                    }
                                                                }
                                                            }
                                                            if (i7 == 1) {
                                                            }
                                                        }
                                                        oe0VarM3050f = pf1.m3050f(sh0Var3);
                                                    }
                                                } else {
                                                    oe0VarM3050f = oe0VarM3050f.f4534i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        c0149dvM1538n = null;
        k50 layoutDirection2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.getLayoutDirection();
        C0697rp c0697rp = new C0697rp(c0149dvM1538n, this, interfaceC0742sw, i3);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zM4901h = w60.m4912s(c0149dv2, c0697rp);
            } else {
                if (i != 2) {
                    C0921xc.m5134o("This function should only be used for 1-D focus search");
                    return null;
                }
                zM4901h = w60.m4901h(c0149dv2, c0697rp);
            }
            return Boolean.valueOf(zM4901h);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return z60.m5429P(i, c0697rp, c0149dv2, st0Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    C0921xc.m5129j();
                    return null;
                }
                i2 = 3;
            }
            C0149dv c0149dvM1538n3 = AbstractC0307i4.m1538n(c0149dv2);
            if (c0149dvM1538n3 != null) {
                return z60.m5429P(i2, c0697rp, c0149dvM1538n3, st0Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C0665qu.m3330a(i))).toString());
        }
        C0149dv c0149dvM1538n4 = AbstractC0307i4.m1538n(c0149dv2);
        if (c0149dvM1538n4 == null) {
            c0149dv = null;
        } else {
            if (!c0149dvM1538n4.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var4 = c0149dvM1538n4.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(c0149dvM1538n4);
            loop5: while (b60VarM3039Q != null) {
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 1024) != 0) {
                    while (oe0Var4 != null) {
                        if ((oe0Var4.f4531f & 1024) != 0) {
                            oe0 oe0VarM3050f2 = oe0Var4;
                            sh0 sh0Var4 = null;
                            while (oe0VarM3050f2 != null) {
                                if (oe0VarM3050f2 instanceof C0149dv) {
                                    C0149dv c0149dv3 = (C0149dv) oe0VarM3050f2;
                                    if (c0149dv3.m733y0().f268a) {
                                        c0149dv = c0149dv3;
                                        break loop5;
                                    }
                                } else if ((oe0VarM3050f2.f4531f & 1024) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                    int i8 = 0;
                                    for (oe0 oe0Var5 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var5 != null; oe0Var5 = oe0Var5.f4534i) {
                                        if ((oe0Var5.f4531f & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                oe0VarM3050f2 = oe0Var5;
                                            } else {
                                                if (sh0Var4 == null) {
                                                    sh0Var4 = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f2 != null) {
                                                    sh0Var4.m4072b(oe0VarM3050f2);
                                                    oe0VarM3050f2 = null;
                                                }
                                                sh0Var4.m4072b(oe0Var5);
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                        oe0VarM3050f2 = pf1.m3050f(sh0Var4);
                                    }
                                }
                                oe0VarM3050f2 = pf1.m3050f(sh0Var4);
                            }
                        }
                        oe0Var4 = oe0Var4.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var4 = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
            c0149dv = null;
        }
        if (c0149dv != null && c0149dv != c0149dv2) {
            zBooleanValue = ((Boolean) c0697rp.invoke(c0149dv)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0149dv m5612f() {
        C0149dv c0149dv = this.f8003h;
        if (c0149dv == null || !c0149dv.f4542q) {
            return null;
        }
        return c0149dv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m5613g(int i) {
        if (!m5608b(i, false, false)) {
            return false;
        }
        Boolean boolM5611e = m5611e(i, null, new C0712s3(i, 2));
        boolean zBooleanValue = boolM5611e != null ? boolM5611e.booleanValue() : false;
        if (!zBooleanValue) {
            m5609c();
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m5614h(C0149dv c0149dv) {
        C0149dv c0149dv2 = this.f8003h;
        this.f8003h = c0149dv;
        dh0 dh0Var = this.f8002g;
        Object[] objArr = dh0Var.f1108a;
        int i = dh0Var.f1109b;
        for (int i2 = 0; i2 < i; i2++) {
            ((InterfaceC0865vu) objArr[i2]).mo14d(c0149dv2, c0149dv);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        r0 = r4.m173b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.f168e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.f164a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.f166c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.f167d) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.f164a;
        r6 = r4.f166c;
        r12 = r4.f165b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = p000.AbstractC0201f9.m1064j0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if (r6 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (r16 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r16 = r16 ^ (r16 << 16);
        r17 = r13;
        r13 = r16 >>> 7;
        r14 = r4.m173b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | (((long) (r16 & 127)) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | (((long) (r16 & 127)) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ee, code lost:
    
        r37 = r7;
        r4.f168e = p000.dy0.m738a(r4.f166c) - r4.f167d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = p000.dy0.m739b(r4.f166c);
        r5 = r4.f164a;
        r6 = r4.f165b;
        r7 = r4.f166c;
        r4.m174c(r0);
        r0 = r4.f164a;
        r8 = r4.f165b;
        r9 = r4.f166c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.m173b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0276, code lost:
    
        r0 = r4.m173b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.f167d++;
        r0 = r4.f168e;
        r3 = r4.f164a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0295, code lost:
    
        r21 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0297, code lost:
    
        r4.f168e = r0 - r21;
        r0 = r4.f166c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033e, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0340, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5615i(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        boolean z;
        int iNumberOfTrailingZeros2;
        long jM2968D = p30.m2968D(keyEvent);
        int iM2971G = p30.m2971G(keyEvent);
        int i = -862048943;
        long j2 = 0;
        char c = '\b';
        int i2 = 0;
        ?? r21 = 0;
        boolean z2 = true;
        if (iM2971G == 2) {
            ah0 ah0Var = this.f8001f;
            if (ah0Var == null) {
                ah0Var = new ah0(3);
                this.f8001f = ah0Var;
            }
            ah0 ah0Var2 = ah0Var;
            int iHashCode = Long.hashCode(jM2968D) * (-862048943);
            int i3 = iHashCode ^ (iHashCode << 16);
            int i4 = i3 >>> 7;
            int i5 = i3 & 127;
            int i6 = ah0Var2.f166c;
            int i7 = i4 & i6;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = ah0Var2.f164a;
                int i9 = i7 >> 3;
                int i10 = (i7 & 7) << 3;
                long j3 = (jArr[i9] >>> i10) | ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63));
                int i11 = i;
                long j4 = i5;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    iNumberOfTrailingZeros2 = (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
                    long j7 = j2;
                    if (ah0Var2.f165b[iNumberOfTrailingZeros2] == jM2968D) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i8 += 8;
                i7 = (i7 + i8) & i6;
                i = i11;
                j2 = j;
            }
            ah0Var2.f165b[iNumberOfTrailingZeros2] = jM2968D;
            return z;
        }
        if (iM2971G != 1) {
            return true;
        }
        ah0 ah0Var3 = this.f8001f;
        if (ah0Var3 == null || !ah0Var3.m172a(jM2968D)) {
            return false;
        }
        ah0 ah0Var4 = this.f8001f;
        if (ah0Var4 != null) {
            int iHashCode2 = Long.hashCode(jM2968D) * (-862048943);
            int i12 = iHashCode2 ^ (iHashCode2 << 16);
            int i13 = i12 & 127;
            int i14 = ah0Var4.f166c;
            int i15 = i12 >>> 7;
            loop5: while (true) {
                int i16 = i15 & i14;
                long[] jArr2 = ah0Var4.f164a;
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                long j8 = ((jArr2[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr2[i17] >>> i18);
                long j9 = (((long) i13) * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i16) & i14;
                    if (ah0Var4.f165b[iNumberOfTrailingZeros] == jM2968D) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i2 += 8;
                i15 = i16 + i2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                ah0Var4.f167d--;
                long[] jArr3 = ah0Var4.f164a;
                int i19 = ah0Var4.f166c;
                int i20 = iNumberOfTrailingZeros >> 3;
                int i21 = (iNumberOfTrailingZeros & 7) << 3;
                long j11 = (jArr3[i20] & (~(255 << i21))) | (254 << i21);
                jArr3[i20] = j11;
                jArr3[(((iNumberOfTrailingZeros - 7) & i19) + (i19 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}

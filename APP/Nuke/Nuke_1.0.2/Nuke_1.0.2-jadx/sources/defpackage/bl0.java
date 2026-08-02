package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 implements yk0 {
    public final b7 a;
    public final b7 b;
    public final wk0 d;
    public ek1 f;
    public pl0 h;
    public final pl0 c = new pl0(2, null, 14);
    public final zk0 e = new zk0(this);
    public final lk1 g = new lk1(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bl0(b7 b7Var, b7 b7Var2) {
        this.a = b7Var;
        this.b = b7Var2;
        this.d = new wk0(this, b7Var2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(boolean z) {
        vn1 vn1Var;
        if (f() != null) {
            pl0 pl0VarF = f();
            i(null);
            if (pl0VarF != null) {
                kl0 kl0Var = kl0.h;
                kl0 kl0Var2 = kl0.j;
                pl0VarF.N0(kl0Var, kl0Var2);
                if (!pl0VarF.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var = pl0VarF.h.l;
                r61 r61VarC0 = sp0.c0(pl0VarF);
                while (r61VarC0 != null) {
                    if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                        while (th1Var != null) {
                            if ((th1Var.j & 1024) != 0) {
                                th1 th1VarM = th1Var;
                                zk1 zk1Var = null;
                                while (th1VarM != null) {
                                    if (th1VarM instanceof pl0) {
                                        ((pl0) th1VarM).N0(kl0.i, kl0Var2);
                                    } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                        int i = 0;
                                        for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                            if ((th1Var2.j & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    th1VarM = th1Var2;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM != null) {
                                                        zk1Var.b(th1VarM);
                                                        th1VarM = null;
                                                    }
                                                    zk1Var.b(th1Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    th1VarM = sp0.m(zk1Var);
                                }
                            }
                            th1Var = th1Var.l;
                        }
                    }
                    r61VarC0 = r61VarC0.u();
                    th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = qp0.I(this.c, i).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                c80.s();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        b7 b7Var = this.a;
        if (b7Var.isFocused() || b7Var.hasFocus()) {
            b7Var.clearFocus();
        } else if (b7Var.hasFocus()) {
            View viewFindFocus = b7Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            b7Var.clearFocus();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x013a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:203:0x025a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:235:0x02ba */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:290:0x0269 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:291:0x0221 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:293:0x0221 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:296:0x0263 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:304:0x02c9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:305:0x0281 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:307:0x0281 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:310:0x02c3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:326:0x00bf */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:329:0x0082 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:330:0x0082 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:334:0x00b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:349:0x0149 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:351:0x010c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:352:0x010c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:356:0x0143 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x00b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [zk1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v25, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v29, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v30, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v34, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [th1] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [zk1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [zk1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(KeyEvent keyEvent, xm0 xm0Var) {
        Object obj;
        th1 th1Var;
        vn1 vn1Var;
        Object obj2;
        vn1 vn1Var2;
        int size;
        vn1 vn1Var3;
        boolean z;
        pl0 pl0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!j(keyEvent)) {
                return false;
            }
            pl0 pl0VarA0 = rp0.a0(pl0Var);
            if (pl0VarA0 != null) {
                if (!pl0VarA0.h.u) {
                    kz0.b("visitLocalDescendants called on an unattached node");
                }
                th1 th1Var2 = pl0VarA0.h;
                if ((th1Var2.k & 9216) != 0) {
                    th1Var = null;
                    for (th1 th1Var3 = th1Var2.m; th1Var3 != null; th1Var3 = th1Var3.m) {
                        int i = th1Var3.j;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            th1Var = th1Var3;
                        }
                    }
                } else {
                    th1Var = null;
                }
                if (th1Var == null) {
                }
            } else if (pl0VarA0 == null) {
                if (!pl0Var.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var4 = pl0Var.h.l;
                r61 r61VarC0 = sp0.c0(pl0Var);
                loop15: while (true) {
                    if (r61VarC0 == null) {
                        obj = null;
                        break;
                    }
                    if ((((th1) r61VarC0.M.g).k & 8192) != 0) {
                        while (th1Var4 != null) {
                            if ((th1Var4.j & 8192) != 0) {
                                th1 th1VarM = th1Var4;
                                zk1 zk1Var = null;
                                while (th1VarM != null) {
                                    if (th1VarM instanceof g51) {
                                        obj = th1VarM;
                                        break loop15;
                                    }
                                    if ((th1VarM.j & 8192) != 0 && (th1VarM instanceof u60)) {
                                        th1 th1Var5 = ((u60) th1VarM).w;
                                        int i2 = 0;
                                        th1VarM = th1VarM;
                                        zk1Var = zk1Var;
                                        while (th1Var5 != null) {
                                            if ((th1Var5.j & 8192) != 0) {
                                                i2++;
                                                zk1Var = zk1Var;
                                                if (i2 == 1) {
                                                    th1VarM = th1Var5;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM != null) {
                                                        zk1Var.b(th1VarM);
                                                        th1VarM = null;
                                                    }
                                                    zk1Var.b(th1Var5);
                                                }
                                            }
                                            th1Var5 = th1Var5.m;
                                            th1VarM = th1VarM;
                                            zk1Var = zk1Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    th1VarM = sp0.m(zk1Var);
                                }
                            }
                            th1Var4 = th1Var4.l;
                        }
                    }
                    r61VarC0 = r61VarC0.u();
                    th1Var4 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
                }
                Object obj3 = (g51) obj;
                th1Var = obj3 != null ? ((th1) obj3).h : null;
            } else {
                if (!pl0VarA0.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var6 = pl0VarA0.h;
                r61 r61VarC02 = sp0.c0(pl0VarA0);
                loop11: while (true) {
                    if (r61VarC02 == null) {
                        obj2 = null;
                        break;
                    }
                    if ((((th1) r61VarC02.M.g).k & 8192) != 0) {
                        while (th1Var6 != null) {
                            if ((th1Var6.j & 8192) != 0) {
                                zk1 zk1Var2 = null;
                                th1 th1VarM2 = th1Var6;
                                while (th1VarM2 != null) {
                                    if (th1VarM2 instanceof g51) {
                                        obj2 = th1VarM2;
                                        break loop11;
                                    }
                                    if ((th1VarM2.j & 8192) != 0 && (th1VarM2 instanceof u60)) {
                                        th1 th1Var7 = ((u60) th1VarM2).w;
                                        int i3 = 0;
                                        th1VarM2 = th1VarM2;
                                        zk1Var2 = zk1Var2;
                                        while (th1Var7 != null) {
                                            if ((th1Var7.j & 8192) != 0) {
                                                i3++;
                                                zk1Var2 = zk1Var2;
                                                if (i3 == 1) {
                                                    th1VarM2 = th1Var7;
                                                } else {
                                                    if (zk1Var2 == null) {
                                                        zk1Var2 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM2 != null) {
                                                        zk1Var2.b(th1VarM2);
                                                        th1VarM2 = null;
                                                    }
                                                    zk1Var2.b(th1Var7);
                                                }
                                            }
                                            th1Var7 = th1Var7.m;
                                            th1VarM2 = th1VarM2;
                                            zk1Var2 = zk1Var2;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    th1VarM2 = sp0.m(zk1Var2);
                                }
                            }
                            th1Var6 = th1Var6.l;
                        }
                    }
                    r61VarC02 = r61VarC02.u();
                    th1Var6 = (r61VarC02 == null || (vn1Var2 = r61VarC02.M) == null) ? null : (qx2) vn1Var2.f;
                }
                Object obj4 = (g51) obj2;
                if (obj4 != null) {
                    th1Var = ((th1) obj4).h;
                }
            }
            if (th1Var != null) {
                if (!th1Var.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var8 = th1Var.h.l;
                r61 r61VarC03 = sp0.c0(th1Var);
                ArrayList arrayList = null;
                while (r61VarC03 != null) {
                    if ((((th1) r61VarC03.M.g).k & 8192) != 0) {
                        while (th1Var8 != null) {
                            if ((th1Var8.j & 8192) != 0) {
                                th1 th1VarM3 = th1Var8;
                                zk1 zk1Var3 = null;
                                while (th1VarM3 != null) {
                                    if (th1VarM3 instanceof g51) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th1VarM3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (th1VarM3.j & 8192) != 0 && (th1VarM3 instanceof u60)) {
                                        int i4 = 0;
                                        for (th1 th1Var9 = ((u60) th1VarM3).w; th1Var9 != null; th1Var9 = th1Var9.m) {
                                            if ((th1Var9.j & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    th1VarM3 = th1Var9;
                                                } else {
                                                    if (zk1Var3 == null) {
                                                        zk1Var3 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM3 != null) {
                                                        zk1Var3.b(th1VarM3);
                                                        th1VarM3 = null;
                                                    }
                                                    zk1Var3.b(th1Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    th1VarM3 = sp0.m(zk1Var3);
                                }
                            }
                            th1Var8 = th1Var8.l;
                        }
                    }
                    r61VarC03 = r61VarC03.u();
                    th1Var8 = (r61VarC03 == null || (vn1Var3 = r61VarC03.M) == null) ? null : (qx2) vn1Var3.f;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((g51) arrayList.get(size)).k(keyEvent)) {
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? M = th1Var.h;
                ?? zk1Var4 = 0;
                while (M != 0) {
                    if (M instanceof g51) {
                        if (((g51) M).k(keyEvent)) {
                            return true;
                        }
                    } else if ((M.j & 8192) != 0 && (M instanceof u60)) {
                        th1 th1Var10 = ((u60) M).w;
                        int i6 = 0;
                        zk1Var4 = zk1Var4;
                        M = M;
                        while (th1Var10 != null) {
                            if ((th1Var10.j & 8192) != 0) {
                                i6++;
                                zk1Var4 = zk1Var4;
                                if (i6 == 1) {
                                    M = th1Var10;
                                } else {
                                    if (zk1Var4 == 0) {
                                        zk1Var4 = new zk1(new th1[16]);
                                    }
                                    if (M != 0) {
                                        zk1Var4.b(M);
                                        M = 0;
                                    }
                                    zk1Var4.b(th1Var10);
                                }
                            }
                            th1Var10 = th1Var10.m;
                            zk1Var4 = zk1Var4;
                            M = M;
                        }
                        if (i6 == 1) {
                        }
                    }
                    M = sp0.m(zk1Var4);
                }
                if (((Boolean) xm0Var.a()).booleanValue()) {
                    return true;
                }
                ?? M2 = th1Var.h;
                ?? zk1Var5 = 0;
                while (M2 != 0) {
                    if (M2 instanceof g51) {
                        if (((g51) M2).X(keyEvent)) {
                            return true;
                        }
                    } else if ((M2.j & 8192) != 0 && (M2 instanceof u60)) {
                        th1 th1Var11 = ((u60) M2).w;
                        int i7 = 0;
                        M2 = M2;
                        zk1Var5 = zk1Var5;
                        while (th1Var11 != null) {
                            if ((th1Var11.j & 8192) != 0) {
                                i7++;
                                zk1Var5 = zk1Var5;
                                if (i7 == 1) {
                                    M2 = th1Var11;
                                } else {
                                    if (zk1Var5 == 0) {
                                        zk1Var5 = new zk1(new th1[16]);
                                    }
                                    if (M2 != 0) {
                                        zk1Var5.b(M2);
                                        M2 = 0;
                                    }
                                    zk1Var5.b(th1Var11);
                                }
                            }
                            th1Var11 = th1Var11.m;
                            M2 = M2;
                            zk1Var5 = zk1Var5;
                        }
                        if (i7 == 1) {
                        }
                    }
                    M2 = sp0.m(zk1Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((g51) arrayList.get(i8)).X(keyEvent)) {
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
    /* JADX WARN: Code restructure failed: missing block: B:231:0x011f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean e(int i, o62 o62Var, in0 in0Var) {
        boolean zM;
        pl0 pl0Var;
        vn1 vn1Var;
        pl0 pl0Var2 = this.c;
        pl0 pl0VarA0 = rp0.a0(pl0Var2);
        int i2 = 4;
        b7 b7Var = this.b;
        boolean zBooleanValue = false;
        if (pl0VarA0 != null) {
            d61 layoutDirection = b7Var.getLayoutDirection();
            el0 el0VarO0 = pl0VarA0.O0();
            gl0 gl0Var = el0VarO0.h;
            gl0 gl0Var2 = el0VarO0.i;
            if (i == 1) {
                gl0Var = el0VarO0.b;
            } else if (i == 2) {
                gl0Var = el0VarO0.c;
            } else if (i == 5) {
                gl0Var = el0VarO0.d;
            } else if (i == 6) {
                gl0Var = el0VarO0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        c80.s();
                        return null;
                    }
                    gl0Var = gl0Var2;
                }
                if (gl0Var == gl0.b) {
                    gl0Var = null;
                }
                if (gl0Var == null) {
                    gl0Var = el0VarO0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    gl0Var = gl0Var2;
                } else if (iOrdinal2 != 1) {
                    c80.s();
                    return null;
                }
                if (gl0Var == gl0.b) {
                    gl0Var = null;
                }
                if (gl0Var == null) {
                    gl0Var = el0VarO0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    s.l("invalid FocusDirection");
                    return null;
                }
                jp jpVar = new jp(i);
                bl0 bl0Var = (bl0) ((b7) sp0.f0(pl0VarA0)).getFocusOwner();
                pl0 pl0VarF = bl0Var.f();
                if (i == 7) {
                    el0VarO0.j.j(jpVar);
                } else {
                    el0VarO0.k.j(jpVar);
                }
                gl0Var = jpVar.b ? gl0.c : pl0VarF != bl0Var.f() ? gl0.d : gl0.b;
            }
            gl0 gl0Var3 = gl0.c;
            if (!t11.l(gl0Var, gl0Var3)) {
                if (t11.l(gl0Var, gl0.d)) {
                    pl0 pl0VarA02 = rp0.a0(pl0Var2);
                    if (pl0VarA02 != null) {
                        return (Boolean) in0Var.j(pl0VarA02);
                    }
                } else {
                    gl0 gl0Var4 = gl0.b;
                    if (!t11.l(gl0Var, gl0Var4)) {
                        if (gl0Var == gl0Var4) {
                            s.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (gl0Var == gl0Var3) {
                            s.l("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        zk1 zk1Var = gl0Var.a;
                        int i3 = zk1Var.j;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = zk1Var.h;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (il0) objArr[i4];
                                if (!((th1) obj).h.u) {
                                    kz0.b("visitChildren called on an unattached node");
                                }
                                zk1 zk1Var2 = new zk1(new th1[16]);
                                th1 th1Var = ((th1) obj).h;
                                th1 th1Var2 = th1Var.m;
                                if (th1Var2 == null) {
                                    sp0.k(zk1Var2, th1Var);
                                } else {
                                    zk1Var2.b(th1Var2);
                                }
                                while (true) {
                                    int i5 = zk1Var2.j;
                                    if (i5 != 0) {
                                        th1 th1VarM = (th1) zk1Var2.k(i5 - 1);
                                        if ((th1VarM.k & 1024) == 0) {
                                            sp0.k(zk1Var2, th1VarM);
                                        } else {
                                            while (true) {
                                                if (th1VarM == null) {
                                                    break;
                                                }
                                                if ((th1VarM.j & 1024) != 0) {
                                                    zk1 zk1Var3 = null;
                                                    while (th1VarM != null) {
                                                        if (th1VarM instanceof pl0) {
                                                            if (((Boolean) in0Var.j((pl0) th1VarM)).booleanValue()) {
                                                                z = true;
                                                                break;
                                                            }
                                                        } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                                            int i6 = 0;
                                                            for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                                                if ((th1Var3.j & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        th1VarM = th1Var3;
                                                                    } else {
                                                                        if (zk1Var3 == null) {
                                                                            zk1Var3 = new zk1(new th1[16]);
                                                                        }
                                                                        if (th1VarM != null) {
                                                                            zk1Var3.b(th1VarM);
                                                                            th1VarM = null;
                                                                        }
                                                                        zk1Var3.b(th1Var3);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        th1VarM = sp0.m(zk1Var3);
                                                    }
                                                } else {
                                                    th1VarM = th1VarM.m;
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
        pl0VarA0 = null;
        d61 layoutDirection2 = b7Var.getLayoutDirection();
        ec ecVar = new ec(pl0VarA0, this, in0Var, i2);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zM = t11.u(pl0Var2, ecVar);
            } else {
                if (i != 2) {
                    s.l("This function should only be used for 1-D focus search");
                    return null;
                }
                zM = t11.m(pl0Var2, ecVar);
            }
            return Boolean.valueOf(zM);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return dd3.q(i, ecVar, pl0Var2, o62Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    c80.s();
                    return null;
                }
                i2 = 3;
            }
            pl0 pl0VarA03 = rp0.a0(pl0Var2);
            if (pl0VarA03 != null) {
                return dd3.q(i2, ecVar, pl0VarA03, o62Var);
            }
            return null;
        }
        if (i != 8) {
            s.k("Focus search invoked with invalid FocusDirection ", ok0.a(i));
            return null;
        }
        pl0 pl0VarA04 = rp0.a0(pl0Var2);
        if (pl0VarA04 == null) {
            pl0Var = null;
        } else {
            if (!pl0VarA04.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var4 = pl0VarA04.h.l;
            r61 r61VarC0 = sp0.c0(pl0VarA04);
            loop5: while (r61VarC0 != null) {
                if ((((th1) r61VarC0.M.g).k & 1024) != 0) {
                    while (th1Var4 != null) {
                        if ((th1Var4.j & 1024) != 0) {
                            th1 th1VarM2 = th1Var4;
                            zk1 zk1Var4 = null;
                            while (th1VarM2 != null) {
                                if (th1VarM2 instanceof pl0) {
                                    pl0 pl0Var3 = (pl0) th1VarM2;
                                    if (pl0Var3.O0().a) {
                                        pl0Var = pl0Var3;
                                        break loop5;
                                    }
                                } else if ((th1VarM2.j & 1024) != 0 && (th1VarM2 instanceof u60)) {
                                    int i7 = 0;
                                    for (th1 th1Var5 = ((u60) th1VarM2).w; th1Var5 != null; th1Var5 = th1Var5.m) {
                                        if ((th1Var5.j & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                th1VarM2 = th1Var5;
                                            } else {
                                                if (zk1Var4 == null) {
                                                    zk1Var4 = new zk1(new th1[16]);
                                                }
                                                if (th1VarM2 != null) {
                                                    zk1Var4.b(th1VarM2);
                                                    th1VarM2 = null;
                                                }
                                                zk1Var4.b(th1Var5);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        th1VarM2 = sp0.m(zk1Var4);
                                    }
                                }
                                th1VarM2 = sp0.m(zk1Var4);
                            }
                        }
                        th1Var4 = th1Var4.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var4 = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
            }
            pl0Var = null;
        }
        if (pl0Var != null && pl0Var != pl0Var2) {
            zBooleanValue = ((Boolean) ecVar.j(pl0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pl0 f() {
        pl0 pl0Var = this.h;
        if (pl0Var == null || !pl0Var.u) {
            return null;
        }
        return pl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(int i, boolean z) {
        pl0 pl0VarF = f();
        b7 b7Var = this.a;
        if (pl0VarF == null || !pl0VarF.v || !b7Var.x(i)) {
            o72 o72Var = new o72();
            o72Var.i = Boolean.FALSE;
            pl0 pl0VarF2 = f();
            Boolean boolE = e(i, b7Var.getEmbeddedViewFocusRect(), new al0(o72Var, i));
            if (!t11.l(boolE, Boolean.TRUE) || pl0VarF2 == f()) {
                if (boolE != null && o72Var.i != null) {
                    if (!boolE.booleanValue() || !((Boolean) o72Var.i).booleanValue()) {
                        if ((i == 1 || i == 2) && z && b(i, false, false)) {
                            Boolean boolE2 = e(i, null, new y6(i, 3));
                            if (boolE2 != null ? boolE2.booleanValue() : false) {
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
    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new y6(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(pl0 pl0Var) {
        pl0 pl0Var2 = this.h;
        this.h = pl0Var;
        lk1 lk1Var = this.g;
        Object[] objArr = lk1Var.a;
        int i = lk1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((xk0) objArr[i2]).a(pl0Var2, pl0Var);
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
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(((long) r4.d) * 32, ((long) r0) * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
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
        r5 = defpackage.mg.m0(r0);
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
        r14 = r4.b(r13);
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
        r4.e = defpackage.ed2.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.ed2.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
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
        r0 = r4.b(r15 >>> 7);
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
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
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
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033f, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0341, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v3, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        long j;
        boolean z;
        int iNumberOfTrailingZeros2;
        long jZ = qp0.z(keyEvent);
        int iC = qp0.C(keyEvent);
        int i = -862048943;
        long j2 = 0;
        char c = '\b';
        int i2 = 0;
        ?? r21 = 0;
        boolean z2 = true;
        if (iC == 2) {
            ek1 ek1Var = this.f;
            if (ek1Var == null) {
                ek1Var = new ek1(3);
                this.f = ek1Var;
            }
            ek1 ek1Var2 = ek1Var;
            int iHashCode = Long.hashCode(jZ) * (-862048943);
            int i3 = iHashCode ^ (iHashCode << 16);
            int i4 = i3 >>> 7;
            int i5 = i3 & 127;
            int i6 = ek1Var2.c;
            int i7 = i4 & i6;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = ek1Var2.a;
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
                    if (ek1Var2.b[iNumberOfTrailingZeros2] == jZ) {
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
            ek1Var2.b[iNumberOfTrailingZeros2] = jZ;
            return z;
        }
        if (iC != 1) {
            return true;
        }
        ek1 ek1Var3 = this.f;
        if (ek1Var3 == null || !ek1Var3.a(jZ)) {
            return false;
        }
        ek1 ek1Var4 = this.f;
        if (ek1Var4 != null) {
            int iHashCode2 = Long.hashCode(jZ) * (-862048943);
            int i12 = iHashCode2 ^ (iHashCode2 << 16);
            int i13 = i12 & 127;
            int i14 = ek1Var4.c;
            int i15 = i12 >>> 7;
            loop5: while (true) {
                int i16 = i15 & i14;
                long[] jArr2 = ek1Var4.a;
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
                    if (ek1Var4.b[iNumberOfTrailingZeros] == jZ) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i2 += 8;
                i15 = i16 + i2;
            }
            if (iNumberOfTrailingZeros >= 0) {
                ek1Var4.d--;
                long[] jArr3 = ek1Var4.a;
                int i19 = ek1Var4.c;
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

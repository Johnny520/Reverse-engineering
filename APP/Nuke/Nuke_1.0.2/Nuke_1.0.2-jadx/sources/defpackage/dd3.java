package defpackage;

import android.database.Cursor;
import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd3 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        defpackage.s.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        defpackage.s.l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(o62 o62Var, o62 o62Var2, o62 o62Var3, int i) {
        boolean zB = b(i, o62Var3, o62Var);
        float f = o62Var3.b;
        float f2 = o62Var3.d;
        float f3 = o62Var3.a;
        float f4 = o62Var3.c;
        float f5 = o62Var.d;
        float f6 = o62Var.b;
        float f7 = o62Var.c;
        float f8 = o62Var.a;
        if (!zB && b(i, o62Var2, o62Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            s.l("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(int i, o62 o62Var, o62 o62Var2) {
        if (i == 3 || i == 4) {
            return o62Var.d > o62Var2.b && o62Var.b < o62Var2.d;
        }
        if (i == 5 || i == 6) {
            return o62Var.c > o62Var2.a && o62Var.a < o62Var2.c;
        }
        s.l("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(pl0 pl0Var, zk1 zk1Var) {
        if (!pl0Var.h.u) {
            kz0.b("visitChildren called on an unattached node");
        }
        zk1 zk1Var2 = new zk1(new th1[16]);
        th1 th1Var = pl0Var.h;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 == null) {
            sp0.k(zk1Var2, th1Var);
        } else {
            zk1Var2.b(th1Var2);
        }
        while (true) {
            int i = zk1Var2.j;
            if (i == 0) {
                return;
            }
            th1 th1VarM = (th1) zk1Var2.k(i - 1);
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
                                pl0 pl0Var2 = (pl0) th1VarM;
                                if (pl0Var2.u && !sp0.c0(pl0Var2).X) {
                                    if (pl0Var2.O0().a) {
                                        zk1Var.b(pl0Var2);
                                    } else {
                                        c(pl0Var2, zk1Var);
                                    }
                                }
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i2 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                    if ((th1Var3.j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 == 1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zc3 d(yc3 yc3Var, wc3 wc3Var, String str, Throwable th) {
        Object x92Var;
        xc3 xc3Var = new xc3(yc3Var, wc3Var, str, th);
        String string = (yc3Var + " failed: " + str + "\n" + fg1.Q(th)).toString();
        try {
            XposedBridge.log("[WeDbApi]" + string);
            x92Var = a83.a;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            Log.println(6, "WeDbApi", string);
        }
        return new zc3(xc3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final pl0 e(zk1 zk1Var, o62 o62Var, int i) {
        o62 o62VarH;
        pl0 pl0Var = null;
        if (i == 3) {
            o62VarH = o62Var.h((o62Var.c - o62Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            o62VarH = o62Var.h(-((o62Var.c - o62Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            o62VarH = o62Var.h(0.0f, (o62Var.d - o62Var.b) + 1.0f);
        } else {
            if (i != 6) {
                s.l("This function should only be used for 2-D focus search");
                return null;
            }
            o62VarH = o62Var.h(0.0f, -((o62Var.d - o62Var.b) + 1.0f));
        }
        Object[] objArr = zk1Var.h;
        int i2 = zk1Var.j;
        for (int i3 = 0; i3 < i2; i3++) {
            pl0 pl0Var2 = (pl0) objArr[i3];
            if (rp0.h0(pl0Var2)) {
                o62 o62VarE0 = rp0.e0(pl0Var2);
                if (j(o62VarE0, o62VarH, o62Var, i)) {
                    pl0Var = pl0Var2;
                    o62VarH = o62VarE0;
                }
            }
        }
        return pl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(pl0 pl0Var, int i, in0 in0Var) {
        o62 o62Var;
        zk1 zk1Var = new zk1(new pl0[16]);
        c(pl0Var, zk1Var);
        int i2 = zk1Var.j;
        if (i2 <= 1) {
            pl0 pl0Var2 = (pl0) (i2 == 0 ? null : zk1Var.h[0]);
            if (pl0Var2 != null) {
                return ((Boolean) in0Var.j(pl0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                o62 o62VarE0 = rp0.e0(pl0Var);
                float f = o62VarE0.a;
                float f2 = o62VarE0.b;
                o62Var = new o62(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    s.l("This function should only be used for 2-D focus search");
                    return false;
                }
                o62 o62VarE02 = rp0.e0(pl0Var);
                float f3 = o62VarE02.c;
                float f4 = o62VarE02.d;
                o62Var = new o62(f3, f4, f3, f4);
            }
            pl0 pl0VarE = e(zk1Var, o62Var, i);
            if (pl0VarE != null) {
                return ((Boolean) in0Var.j(pl0VarE)).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean g(int i, ec ecVar, pl0 pl0Var, o62 o62Var) {
        if (p(i, ecVar, pl0Var, o62Var)) {
            return true;
        }
        Boolean bool = (Boolean) tp0.K(pl0Var, i, new wt1(((bl0) ((b7) sp0.f0(pl0Var)).getFocusOwner()).f(), pl0Var, o62Var, i, ecVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bd3 h() {
        return m(yc3.h, "    SELECT \n    r.username, r.alias, r.conRemark, r.nickname,\n    r.pyInitial, r.quanPin, r.encryptUsername, i.reserved2 AS avatarUrl\n, r.type\n    FROM rcontact r\n    LEFT JOIN img_flag i ON r.username = i.username\n    WHERE\n        (r.encryptUsername != '' OR r.username = (SELECT value FROM userinfo WHERE id = 2))\n        AND r.verifyFlag = 0\n        AND (r.type & 1) != 0\n        AND (r.type & 8) = 0\n        AND (r.type & 32) = 0\n        AND r.username NOT LIKE '%chatroom'", null, new yb3(15));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static bd3 i() {
        return m(yc3.i, "SELECT r.username, r.nickname, r.pyInitial, r.quanPin, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE '%@chatroom'", null, new yb3(13));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean j(o62 o62Var, o62 o62Var2, o62 o62Var3, int i) {
        if (!k(i, o62Var, o62Var3)) {
            return false;
        }
        if (k(i, o62Var2, o62Var3) && !a(o62Var3, o62Var, o62Var2, i)) {
            return !a(o62Var3, o62Var2, o62Var, i) && l(i, o62Var3, o62Var) < l(i, o62Var3, o62Var2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean k(int i, o62 o62Var, o62 o62Var2) {
        if (i == 3) {
            float f = o62Var2.c;
            float f2 = o62Var2.a;
            float f3 = o62Var.c;
            return (f > f3 || f2 >= f3) && f2 > o62Var.a;
        }
        if (i == 4) {
            float f4 = o62Var2.a;
            float f5 = o62Var2.c;
            float f6 = o62Var.a;
            return (f4 < f6 || f5 <= f6) && f5 < o62Var.c;
        }
        if (i == 5) {
            float f7 = o62Var2.d;
            float f8 = o62Var2.b;
            float f9 = o62Var.d;
            return (f7 > f9 || f8 >= f9) && f8 > o62Var.b;
        }
        if (i != 6) {
            s.l("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = o62Var2.b;
        float f11 = o62Var2.d;
        float f12 = o62Var.b;
        return (f10 < f12 || f11 <= f12) && f11 < o62Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long l(int i, o62 o62Var, o62 o62Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = o62Var.a;
            f2 = o62Var2.c;
        } else if (i == 4) {
            f = o62Var2.a;
            f2 = o62Var.c;
        } else if (i == 5) {
            f = o62Var.b;
            f2 = o62Var2.d;
        } else {
            if (i != 6) {
                s.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = o62Var2.b;
            f2 = o62Var.d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = o62Var.b;
            f3 = ((o62Var.d - f7) / 2.0f) + f7;
            f4 = o62Var2.b;
            f5 = o62Var2.d;
        } else {
            if (i != 5 && i != 6) {
                s.l("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = o62Var.a;
            f3 = ((o62Var.c - f8) / 2.0f) + f8;
            f4 = o62Var2.a;
            f5 = o62Var2.c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static bd3 m(yc3 yc3Var, String str, String[] strArr, in0 in0Var) {
        bd3 bd3VarD;
        try {
            try {
                sg1 sg1VarV = op0.y(n()).v();
                sg1VarV.b();
                sg1VarV.b = "rawQuery";
                sg1VarV.i = new yb3(11);
                sg1VarV.D = new yb3(12);
                Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(str, strArr);
                Cursor cursor = objG0 instanceof Cursor ? (Cursor) objG0 : null;
                if (cursor == null) {
                    throw new IllegalStateException("WeChat rawQuery returned null");
                }
                try {
                    pb1 pb1VarE = eu.E();
                    while (cursor.moveToNext()) {
                        pb1VarE.add(in0Var.j(cursor));
                    }
                    bd3VarD = new ad3(eu.z(pb1VarE));
                } finally {
                }
                cursor.close();
                return bd3VarD;
            } catch (Throwable th) {
                return d(yc3Var, wc3.i, o("WeChat query failed", th), th);
            }
        } catch (Throwable th2) {
            return d(yc3Var, wc3.h, o("Unable to resolve WeChat database", th2), th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object n() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = ce1.b.e().invoke(null, null);
        if (objInvoke == null) {
            s.l("MMKernel core storage is not initialized");
            return null;
        }
        Class clsD = sb2.b.d();
        jp2 jp2Var = new jp2();
        jp2Var.add(clsD);
        Class<?>[] interfaces = clsD.getInterfaces();
        interfaces.getClass();
        iu.h0(jp2Var, interfaces);
        pe1 pe1Var = jp2Var.h;
        pe1Var.b();
        if (pe1Var.p <= 0) {
            jp2Var = jp2.i;
        }
        hi0 hi0VarR = op0.y(objInvoke).r();
        hi0VarR.b();
        hi0VarR.h = new xq2(9, jp2Var);
        Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
        if (objG0 == null) {
            s.l("CoreStorage database wrapper is not initialized");
            return null;
        }
        sg1 sg1VarV = op0.y(objG0).v();
        sg1VarV.b();
        sg1VarV.l = 0;
        sg1VarV.D = new yb3(14);
        Object objG02 = ((zg1) du.o0(sg1VarV.c())).g0(new Object[0]);
        if (objG02 != null) {
            return objG02;
        }
        s.l("WeChat database is not initialized");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String o(String str, Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
            th.getClass();
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return str + ": " + th.getClass().getSimpleName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean p(int i, ec ecVar, pl0 pl0Var, o62 o62Var) {
        pl0 pl0VarE;
        zk1 zk1Var = new zk1(new pl0[16]);
        if (!pl0Var.h.u) {
            kz0.b("visitChildren called on an unattached node");
        }
        zk1 zk1Var2 = new zk1(new th1[16]);
        th1 th1Var = pl0Var.h;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 == null) {
            sp0.k(zk1Var2, th1Var);
        } else {
            zk1Var2.b(th1Var2);
        }
        while (true) {
            int i2 = zk1Var2.j;
            if (i2 == 0) {
                break;
            }
            th1 th1VarM = (th1) zk1Var2.k(i2 - 1);
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
                                pl0 pl0Var2 = (pl0) th1VarM;
                                if (pl0Var2.u) {
                                    zk1Var.b(pl0Var2);
                                }
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                int i3 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM).w; th1Var3 != null; th1Var3 = th1Var3.m) {
                                    if ((th1Var3.j & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
                                if (i3 == 1) {
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
        while (zk1Var.j != 0 && (pl0VarE = e(zk1Var, o62Var, i)) != null) {
            if (pl0VarE.O0().a) {
                return ((Boolean) ecVar.j(pl0VarE)).booleanValue();
            }
            if (g(i, ecVar, pl0VarE, o62Var)) {
                return true;
            }
            zk1Var.j(pl0VarE);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Boolean q(int i, ec ecVar, pl0 pl0Var, o62 o62Var) {
        int iOrdinal = pl0Var.R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarF0 = rp0.f0(pl0Var);
                if (pl0VarF0 == null) {
                    s.l("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = pl0VarF0.R0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolQ = q(i, ecVar, pl0VarF0, o62Var);
                        if (!t11.l(boolQ, Boolean.FALSE)) {
                            return boolQ;
                        }
                        if (o62Var == null) {
                            if (pl0VarF0.R0() != kl0.i) {
                                s.l("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            pl0 pl0VarA0 = rp0.a0(pl0VarF0);
                            if (pl0VarA0 == null) {
                                s.l("ActiveParent must have a focusedChild");
                                return null;
                            }
                            o62Var = rp0.e0(pl0VarA0);
                        }
                        return Boolean.valueOf(g(i, ecVar, pl0Var, o62Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            c80.s();
                            return null;
                        }
                        s.l("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (o62Var == null) {
                    o62Var = rp0.e0(pl0VarF0);
                }
                return Boolean.valueOf(g(i, ecVar, pl0Var, o62Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pl0Var.O0().a ? (Boolean) ecVar.j(pl0Var) : o62Var == null ? Boolean.valueOf(f(pl0Var, i, ecVar)) : Boolean.valueOf(p(i, ecVar, pl0Var, o62Var));
                }
                c80.s();
                return null;
            }
        }
        return Boolean.valueOf(f(pl0Var, i, ecVar));
    }
}

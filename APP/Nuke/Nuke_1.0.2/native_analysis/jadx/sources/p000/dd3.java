package p000;

import android.database.Cursor;
import android.util.Log;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dd3 {
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
    
        r1 = r11 - r19.f7538c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f7536a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f7539d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f7537b - r8;
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
    
        p000.C0676s.m4653l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p000.C0676s.m4653l("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m993a(o62 o62Var, o62 o62Var2, o62 o62Var3, int i) {
        boolean zM994b = m994b(i, o62Var3, o62Var);
        float f = o62Var3.f7537b;
        float f2 = o62Var3.f7539d;
        float f3 = o62Var3.f7536a;
        float f4 = o62Var3.f7538c;
        float f5 = o62Var.f7539d;
        float f6 = o62Var.f7537b;
        float f7 = o62Var.f7538c;
        float f8 = o62Var.f7536a;
        if (!zM994b && m994b(i, o62Var2, o62Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            C0676s.m4653l("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m994b(int i, o62 o62Var, o62 o62Var2) {
        if (i == 3 || i == 4) {
            return o62Var.f7539d > o62Var2.f7537b && o62Var.f7537b < o62Var2.f7539d;
        }
        if (i == 5 || i == 6) {
            return o62Var.f7538c > o62Var2.f7536a && o62Var.f7536a < o62Var2.f7538c;
        }
        C0676s.m4653l("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m995c(pl0 pl0Var, zk1 zk1Var) {
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitChildren called on an unattached node");
        }
        zk1 zk1Var2 = new zk1(new th1[16]);
        th1 th1Var = pl0Var.f10757h;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 == null) {
            sp0.m4948k(zk1Var2, th1Var);
        } else {
            zk1Var2.m6423b(th1Var2);
        }
        while (true) {
            int i = zk1Var2.f13936j;
            if (i == 0) {
                return;
            }
            th1 th1VarM4952m = (th1) zk1Var2.m6432k(i - 1);
            if ((th1VarM4952m.f10760k & 1024) == 0) {
                sp0.m4948k(zk1Var2, th1VarM4952m);
            } else {
                while (true) {
                    if (th1VarM4952m == null) {
                        break;
                    }
                    if ((th1VarM4952m.f10759j & 1024) != 0) {
                        zk1 zk1Var3 = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m;
                                if (pl0Var2.f10770u && !sp0.m4933c0(pl0Var2).f9383X) {
                                    if (pl0Var2.m3873O0().f2484a) {
                                        zk1Var.m6423b(pl0Var2);
                                    } else {
                                        m995c(pl0Var2, zk1Var);
                                    }
                                }
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i2 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                    if ((th1Var3.f10759j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            th1VarM4952m = th1Var3;
                                        } else {
                                            if (zk1Var3 == null) {
                                                zk1Var3 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var3.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var3.m6423b(th1Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var3);
                        }
                    } else {
                        th1VarM4952m = th1VarM4952m.f10762m;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static zc3 m996d(yc3 yc3Var, wc3 wc3Var, String str, Throwable th) {
        Object x92Var;
        xc3 xc3Var = new xc3(yc3Var, wc3Var, str, th);
        String string = (yc3Var + " failed: " + str + "\n" + fg1.m1624Q(th)).toString();
        try {
            XposedBridge.log("[WeDbApi]" + string);
            x92Var = a83.f116a;
        } catch (Throwable th2) {
            x92Var = new x92(th2);
        }
        if (x92Var instanceof x92) {
            Log.println(6, "WeDbApi", string);
        }
        return new zc3(xc3Var);
    }

    /* JADX INFO: renamed from: e */
    public static final pl0 m997e(zk1 zk1Var, o62 o62Var, int i) {
        o62 o62VarM3520h;
        pl0 pl0Var = null;
        if (i == 3) {
            o62VarM3520h = o62Var.m3520h((o62Var.f7538c - o62Var.f7536a) + 1.0f, 0.0f);
        } else if (i == 4) {
            o62VarM3520h = o62Var.m3520h(-((o62Var.f7538c - o62Var.f7536a) + 1.0f), 0.0f);
        } else if (i == 5) {
            o62VarM3520h = o62Var.m3520h(0.0f, (o62Var.f7539d - o62Var.f7537b) + 1.0f);
        } else {
            if (i != 6) {
                C0676s.m4653l("This function should only be used for 2-D focus search");
                return null;
            }
            o62VarM3520h = o62Var.m3520h(0.0f, -((o62Var.f7539d - o62Var.f7537b) + 1.0f));
        }
        Object[] objArr = zk1Var.f13934h;
        int i2 = zk1Var.f13936j;
        for (int i3 = 0; i3 < i2; i3++) {
            pl0 pl0Var2 = (pl0) objArr[i3];
            if (rp0.m4547h0(pl0Var2)) {
                o62 o62VarM4544e0 = rp0.m4544e0(pl0Var2);
                if (m1002j(o62VarM4544e0, o62VarM3520h, o62Var, i)) {
                    pl0Var = pl0Var2;
                    o62VarM3520h = o62VarM4544e0;
                }
            }
        }
        return pl0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m998f(pl0 pl0Var, int i, in0 in0Var) {
        o62 o62Var;
        zk1 zk1Var = new zk1(new pl0[16]);
        m995c(pl0Var, zk1Var);
        int i2 = zk1Var.f13936j;
        if (i2 <= 1) {
            pl0 pl0Var2 = (pl0) (i2 == 0 ? null : zk1Var.f13934h[0]);
            if (pl0Var2 != null) {
                return ((Boolean) in0Var.mo5j(pl0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                o62 o62VarM4544e0 = rp0.m4544e0(pl0Var);
                float f = o62VarM4544e0.f7536a;
                float f2 = o62VarM4544e0.f7537b;
                o62Var = new o62(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C0676s.m4653l("This function should only be used for 2-D focus search");
                    return false;
                }
                o62 o62VarM4544e02 = rp0.m4544e0(pl0Var);
                float f3 = o62VarM4544e02.f7538c;
                float f4 = o62VarM4544e02.f7539d;
                o62Var = new o62(f3, f4, f3, f4);
            }
            pl0 pl0VarM997e = m997e(zk1Var, o62Var, i);
            if (pl0VarM997e != null) {
                return ((Boolean) in0Var.mo5j(pl0VarM997e)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m999g(int i, C0161ec c0161ec, pl0 pl0Var, o62 o62Var) {
        if (m1008p(i, c0161ec, pl0Var, o62Var)) {
            return true;
        }
        Boolean bool = (Boolean) tp0.m5347K(pl0Var, i, new wt1(((bl0) ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(pl0Var)).getFocusOwner()).m561f(), pl0Var, o62Var, i, c0161ec, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static bd3 m1000h() {
        return m1005m(yc3.f13408h, "    SELECT \n    r.username, r.alias, r.conRemark, r.nickname,\n    r.pyInitial, r.quanPin, r.encryptUsername, i.reserved2 AS avatarUrl\n, r.type\n    FROM rcontact r\n    LEFT JOIN img_flag i ON r.username = i.username\n    WHERE\n        (r.encryptUsername != '' OR r.username = (SELECT value FROM userinfo WHERE id = 2))\n        AND r.verifyFlag = 0\n        AND (r.type & 1) != 0\n        AND (r.type & 8) = 0\n        AND (r.type & 32) = 0\n        AND r.username NOT LIKE '%chatroom'", null, new yb3(15));
    }

    /* JADX INFO: renamed from: i */
    public static bd3 m1001i() {
        return m1005m(yc3.f13409i, "SELECT r.username, r.nickname, r.pyInitial, r.quanPin, i.reserved2 AS avatarUrl\nFROM rcontact r\nLEFT JOIN img_flag i ON r.username = i.username\nWHERE r.username LIKE '%@chatroom'", null, new yb3(13));
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m1002j(o62 o62Var, o62 o62Var2, o62 o62Var3, int i) {
        if (!m1003k(i, o62Var, o62Var3)) {
            return false;
        }
        if (m1003k(i, o62Var2, o62Var3) && !m993a(o62Var3, o62Var, o62Var2, i)) {
            return !m993a(o62Var3, o62Var2, o62Var, i) && m1004l(i, o62Var3, o62Var) < m1004l(i, o62Var3, o62Var2);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m1003k(int i, o62 o62Var, o62 o62Var2) {
        if (i == 3) {
            float f = o62Var2.f7538c;
            float f2 = o62Var2.f7536a;
            float f3 = o62Var.f7538c;
            return (f > f3 || f2 >= f3) && f2 > o62Var.f7536a;
        }
        if (i == 4) {
            float f4 = o62Var2.f7536a;
            float f5 = o62Var2.f7538c;
            float f6 = o62Var.f7536a;
            return (f4 < f6 || f5 <= f6) && f5 < o62Var.f7538c;
        }
        if (i == 5) {
            float f7 = o62Var2.f7539d;
            float f8 = o62Var2.f7537b;
            float f9 = o62Var.f7539d;
            return (f7 > f9 || f8 >= f9) && f8 > o62Var.f7537b;
        }
        if (i != 6) {
            C0676s.m4653l("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = o62Var2.f7537b;
        float f11 = o62Var2.f7539d;
        float f12 = o62Var.f7537b;
        return (f10 < f12 || f11 <= f12) && f11 < o62Var.f7539d;
    }

    /* JADX INFO: renamed from: l */
    public static final long m1004l(int i, o62 o62Var, o62 o62Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = o62Var.f7536a;
            f2 = o62Var2.f7538c;
        } else if (i == 4) {
            f = o62Var2.f7536a;
            f2 = o62Var.f7538c;
        } else if (i == 5) {
            f = o62Var.f7537b;
            f2 = o62Var2.f7539d;
        } else {
            if (i != 6) {
                C0676s.m4653l("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = o62Var2.f7537b;
            f2 = o62Var.f7539d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = o62Var.f7537b;
            f3 = ((o62Var.f7539d - f7) / 2.0f) + f7;
            f4 = o62Var2.f7537b;
            f5 = o62Var2.f7539d;
        } else {
            if (i != 5 && i != 6) {
                C0676s.m4653l("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = o62Var.f7536a;
            f3 = ((o62Var.f7538c - f8) / 2.0f) + f8;
            f4 = o62Var2.f7536a;
            f5 = o62Var2.f7538c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: m */
    public static bd3 m1005m(yc3 yc3Var, String str, String[] strArr, in0 in0Var) {
        bd3 bd3VarM996d;
        try {
            try {
                sg1 sg1VarM3244v = op0.m3602y(m1006n()).m3244v();
                sg1VarM3244v.m6411b();
                sg1VarM3244v.f13871b = "rawQuery";
                sg1VarM3244v.f10117i = new yb3(11);
                sg1VarM3244v.f10114D = new yb3(12);
                Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(str, strArr);
                Cursor cursor = objM6415g0 instanceof Cursor ? (Cursor) objM6415g0 : null;
                if (cursor == null) {
                    throw new IllegalStateException("WeChat rawQuery returned null");
                }
                try {
                    pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
                    while (cursor.moveToNext()) {
                        pb1VarM1424E.add(in0Var.mo5j(cursor));
                    }
                    bd3VarM996d = new ad3(AbstractC0179eu.m1476z(pb1VarM1424E));
                } finally {
                }
                cursor.close();
                return bd3VarM996d;
            } catch (Throwable th) {
                return m996d(yc3Var, wc3.f12461i, m1007o("WeChat query failed", th), th);
            }
        } catch (Throwable th2) {
            return m996d(yc3Var, wc3.f12460h, m1007o("Unable to resolve WeChat database", th2), th2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Object m1006n() throws IllegalAccessException, InvocationTargetException {
        Object objInvoke = ce1.f1493b.m5640e().invoke(null, null);
        if (objInvoke == null) {
            C0676s.m4653l("MMKernel core storage is not initialized");
            return null;
        }
        Class clsM5639d = sb2.f10021b.m5639d();
        jp2 jp2Var = new jp2();
        jp2Var.add(clsM5639d);
        Class<?>[] interfaces = clsM5639d.getInterfaces();
        interfaces.getClass();
        AbstractC0325iu.m2394h0(jp2Var, interfaces);
        pe1 pe1Var = jp2Var.f5149h;
        pe1Var.m3852b();
        if (pe1Var.f8279p <= 0) {
            jp2Var = jp2.f5148i;
        }
        hi0 hi0VarM3241r = op0.m3602y(objInvoke).m3241r();
        hi0VarM3241r.m6411b();
        hi0VarM3241r.f4031h = new xq2(9, jp2Var);
        Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
        if (objM3867g0 == null) {
            C0676s.m4653l("CoreStorage database wrapper is not initialized");
            return null;
        }
        sg1 sg1VarM3244v = op0.m3602y(objM3867g0).m3244v();
        sg1VarM3244v.m6411b();
        sg1VarM3244v.f10120l = 0;
        sg1VarM3244v.f10114D = new yb3(14);
        Object objM6415g0 = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).m6415g0(new Object[0]);
        if (objM6415g0 != null) {
            return objM6415g0;
        }
        C0676s.m4653l("WeChat database is not initialized");
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static String m1007o(String str, Throwable th) {
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

    /* JADX INFO: renamed from: p */
    public static final boolean m1008p(int i, C0161ec c0161ec, pl0 pl0Var, o62 o62Var) {
        pl0 pl0VarM997e;
        zk1 zk1Var = new zk1(new pl0[16]);
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitChildren called on an unattached node");
        }
        zk1 zk1Var2 = new zk1(new th1[16]);
        th1 th1Var = pl0Var.f10757h;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 == null) {
            sp0.m4948k(zk1Var2, th1Var);
        } else {
            zk1Var2.m6423b(th1Var2);
        }
        while (true) {
            int i2 = zk1Var2.f13936j;
            if (i2 == 0) {
                break;
            }
            th1 th1VarM4952m = (th1) zk1Var2.m6432k(i2 - 1);
            if ((th1VarM4952m.f10760k & 1024) == 0) {
                sp0.m4948k(zk1Var2, th1VarM4952m);
            } else {
                while (true) {
                    if (th1VarM4952m == null) {
                        break;
                    }
                    if ((th1VarM4952m.f10759j & 1024) != 0) {
                        zk1 zk1Var3 = null;
                        while (th1VarM4952m != null) {
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m;
                                if (pl0Var2.f10770u) {
                                    zk1Var.m6423b(pl0Var2);
                                }
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                int i3 = 0;
                                for (th1 th1Var3 = ((u60) th1VarM4952m).f11116w; th1Var3 != null; th1Var3 = th1Var3.f10762m) {
                                    if ((th1Var3.f10759j & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            th1VarM4952m = th1Var3;
                                        } else {
                                            if (zk1Var3 == null) {
                                                zk1Var3 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var3.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var3.m6423b(th1Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var3);
                        }
                    } else {
                        th1VarM4952m = th1VarM4952m.f10762m;
                    }
                }
            }
        }
        while (zk1Var.f13936j != 0 && (pl0VarM997e = m997e(zk1Var, o62Var, i)) != null) {
            if (pl0VarM997e.m3873O0().f2484a) {
                return ((Boolean) c0161ec.mo5j(pl0VarM997e)).booleanValue();
            }
            if (m999g(i, c0161ec, pl0VarM997e, o62Var)) {
                return true;
            }
            zk1Var.m6431j(pl0VarM997e);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static final Boolean m1009q(int i, C0161ec c0161ec, pl0 pl0Var, o62 o62Var) {
        int iOrdinal = pl0Var.m3876R0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                pl0 pl0VarM4545f0 = rp0.m4545f0(pl0Var);
                if (pl0VarM4545f0 == null) {
                    C0676s.m4653l("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = pl0VarM4545f0.m3876R0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM1009q = m1009q(i, c0161ec, pl0VarM4545f0, o62Var);
                        if (!t11.m5086l(boolM1009q, Boolean.FALSE)) {
                            return boolM1009q;
                        }
                        if (o62Var == null) {
                            if (pl0VarM4545f0.m3876R0() != kl0.f5627i) {
                                C0676s.m4653l("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            pl0 pl0VarM4540a0 = rp0.m4540a0(pl0VarM4545f0);
                            if (pl0VarM4540a0 == null) {
                                C0676s.m4653l("ActiveParent must have a focusedChild");
                                return null;
                            }
                            o62Var = rp0.m4544e0(pl0VarM4540a0);
                        }
                        return Boolean.valueOf(m999g(i, c0161ec, pl0Var, o62Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            c80.m675s();
                            return null;
                        }
                        C0676s.m4653l("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (o62Var == null) {
                    o62Var = rp0.m4544e0(pl0VarM4545f0);
                }
                return Boolean.valueOf(m999g(i, c0161ec, pl0Var, o62Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return pl0Var.m3873O0().f2484a ? (Boolean) c0161ec.mo5j(pl0Var) : o62Var == null ? Boolean.valueOf(m998f(pl0Var, i, c0161ec)) : Boolean.valueOf(m1008p(i, c0161ec, pl0Var, o62Var));
                }
                c80.m675s();
                return null;
            }
        }
        return Boolean.valueOf(m998f(pl0Var, i, c0161ec));
    }
}

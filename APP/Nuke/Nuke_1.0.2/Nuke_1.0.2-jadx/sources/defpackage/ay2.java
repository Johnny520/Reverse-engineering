package defpackage;

import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay2 {
    public static final rx2 a = new rx2(3, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(defpackage.yw2 r5, boolean r6, defpackage.i12 r7, defpackage.rj r8) {
        /*
            boolean r0 = r8 instanceof defpackage.sx2
            if (r0 == 0) goto L13
            r0 = r8
            sx2 r0 = (defpackage.sx2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            sx2 r0 = new sx2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.n
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.m
            i12 r6 = r0.l
            yw2 r7 = r0.k
            defpackage.fg1.T(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.s.l(r5)
            r5 = 0
            return r5
        L36:
            defpackage.fg1.T(r8)
        L39:
            r0.k = r5
            r0.l = r7
            r0.m = r6
            r0.o = r2
            java.lang.Object r8 = r5.a(r7, r0)
            k20 r1 = defpackage.k20.h
            if (r8 != r1) goto L4a
            return r1
        L4a:
            h12 r8 = (defpackage.h12) r8
            boolean r1 = d(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay2.a(yw2, boolean, i12, rj):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object b(yw2 yw2Var, rj rjVar, int i) {
        return a(yw2Var, (i & 1) != 0, i12.i, rjVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(yw2 yw2Var, u00 u00Var) {
        tx2 tx2Var;
        k20 k20Var;
        int size;
        int i;
        int i2;
        int size2;
        if (u00Var instanceof tx2) {
            tx2Var = (tx2) u00Var;
            int i3 = tx2Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tx2Var.m = i3 - Integer.MIN_VALUE;
            } else {
                tx2Var = new tx2(u00Var);
            }
        }
        Object objA = tx2Var.l;
        int i4 = tx2Var.m;
        if (i4 == 0) {
            fg1.T(objA);
            tx2Var.k = yw2Var;
            tx2Var.m = 1;
            objA = yw2Var.a(i12.i, tx2Var);
            k20Var = k20.h;
            if (objA == k20Var) {
            }
            h12 h12Var = (h12) objA;
            List list = h12Var.a;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = h12Var.a;
            size2 = list2.size();
            while (i < size2) {
            }
            return a83.a;
        }
        if (i4 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yw2Var = tx2Var.k;
        fg1.T(objA);
        h12 h12Var2 = (h12) objA;
        List list3 = h12Var2.a;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((o12) list3.get(i2)).a();
        }
        List list22 = h12Var2.a;
        size2 = list22.size();
        while (i < size2) {
            if (((o12) list22.get(i)).d) {
                tx2Var.k = yw2Var;
                tx2Var.m = 1;
                objA = yw2Var.a(i12.i, tx2Var);
                k20Var = k20.h;
                if (objA == k20Var) {
                    return k20Var;
                }
                h12 h12Var22 = (h12) objA;
                List list32 = h12Var22.a;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = h12Var22.a;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(h12 h12Var, boolean z) {
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            if (!(z ? tp0.n(o12Var) : tp0.o(o12Var))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zt2 e(j20 j20Var, k21 k21Var, mn0 mn0Var) {
        return p7.A(j20Var, null, new b2(k21Var, mn0Var, (t00) null, 22), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0387  */
    /* JADX WARN: Type inference failed for: r12v17, types: [o12] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v10, types: [t00] */
    /* JADX WARN: Type inference failed for: r13v13, types: [t00] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r26v1, types: [t00] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [a20, t00] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(yw2 yw2Var, j20 j20Var, x22 x22Var, nn0 nn0Var, j10 j10Var, rj rjVar) {
        wx2 wx2Var;
        j20 j20Var2;
        x22 x22Var2;
        ?? r5;
        nn0 nn0Var2;
        in0 in0Var;
        int i;
        Object objB;
        in0 in0Var2;
        in0 in0Var3;
        x22 x22Var3;
        o12 o12Var;
        yw2 yw2Var2;
        k21 k21Var;
        j20 j20Var3;
        in0 in0Var4;
        x22 x22Var4;
        nn0 nn0Var3;
        in0 in0Var5;
        j20 j20Var4;
        in0 in0Var6;
        in0 in0Var7;
        o12 o12Var2;
        x22 x22Var5;
        ad1 ad1Var;
        a83 a83Var;
        zt2 zt2VarE;
        in0 in0Var8;
        nn0 nn0Var4;
        yw2 yw2Var3;
        in0 in0Var9;
        in0 in0Var10;
        o12 o12Var3;
        k21 k21Var2;
        bd1 bd1Var;
        t00 t00Var;
        x22 x22Var6;
        j20 j20Var5;
        o12 o12Var4;
        in0 in0Var11;
        x22 x22Var7;
        o12 o12Var5;
        k21 k21Var3;
        o12 o12Var6;
        yw2 yw2Var4;
        o12 o12Var7;
        x22 x22Var8;
        j20 j20Var6;
        in0 in0Var12;
        in0 in0Var13;
        in0 in0Var14;
        k21 k21Var4;
        o12 o12Var8;
        j20 j20Var7;
        in0 in0Var15;
        in0 in0Var16;
        in0 in0Var17;
        ?? r13;
        ?? r12;
        in0 in0Var18;
        bd1 bd1Var2;
        Object obj;
        k21 k21Var5;
        j20 j20Var8;
        ?? r132;
        yw2 yw2Var5 = yw2Var;
        if (rjVar instanceof wx2) {
            wx2Var = (wx2) rjVar;
            int i2 = wx2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wx2Var.u = i2 - Integer.MIN_VALUE;
            } else {
                wx2Var = new wx2(rjVar);
            }
        }
        Object objH = wx2Var.t;
        int i3 = wx2Var.u;
        i12 i12Var = i12.i;
        ad1 ad1Var2 = ad1.a;
        rx2 rx2Var = a;
        a83 a83Var2 = a83.a;
        k20 k20Var = k20.h;
        switch (i3) {
            case 0:
                fg1.T(objH);
                wx2Var.k = yw2Var5;
                j20Var2 = j20Var;
                wx2Var.l = j20Var2;
                x22Var2 = x22Var;
                wx2Var.m = x22Var2;
                r5 = 0;
                wx2Var.n = null;
                wx2Var.o = null;
                nn0Var2 = nn0Var;
                wx2Var.p = nn0Var2;
                in0Var = j10Var;
                wx2Var.q = in0Var;
                i = 1;
                wx2Var.u = 1;
                objB = b(yw2Var5, wx2Var, 3);
                if (objB != k20Var) {
                    in0Var2 = null;
                    in0Var3 = null;
                    o12 o12Var9 = (o12) objB;
                    o12Var9.a();
                    zt2 zt2VarA = p7.A(j20Var2, r5, new vx2(x22Var2, r5, i), i);
                    if (nn0Var2 == rx2Var) {
                        x22 x22Var9 = x22Var2;
                        x22Var3 = x22Var9;
                        o12Var = o12Var9;
                        e(j20Var2, zt2VarA, new xx2(nn0Var2, x22Var9, o12Var9, r5, 0));
                    } else {
                        x22Var3 = x22Var2;
                        o12Var = o12Var9;
                    }
                    if (in0Var2 != null) {
                        wx2Var.k = yw2Var5;
                        wx2Var.l = j20Var2;
                        wx2Var.m = x22Var3;
                        wx2Var.n = in0Var3;
                        wx2Var.o = in0Var2;
                        wx2Var.p = nn0Var2;
                        wx2Var.q = in0Var;
                        wx2Var.r = zt2VarA;
                        wx2Var.u = 2;
                        Object objH2 = h(yw2Var5, i12Var, wx2Var);
                        if (objH2 != k20Var) {
                            yw2Var2 = yw2Var5;
                            k21Var = zt2VarA;
                            nn0Var3 = nn0Var2;
                            in0Var5 = in0Var2;
                            j20Var4 = j20Var2;
                            objH = objH2;
                            in0Var6 = in0Var;
                            in0Var7 = in0Var3;
                            o12Var2 = (o12) objH;
                            j20 j20Var9 = j20Var4;
                            in0Var2 = in0Var5;
                            x22Var5 = x22Var3;
                            j20Var3 = j20Var9;
                            if (o12Var2 == null) {
                                ad1Var = ad1Var2;
                                a83Var = a83Var2;
                                zt2VarE = e(j20Var3, k21Var, new ux2(x22Var5, null, 3));
                            } else {
                                ad1Var = ad1Var2;
                                a83Var = a83Var2;
                                o12Var2.a();
                                zt2VarE = e(j20Var3, k21Var, new ux2(x22Var5, null, 4));
                            }
                            if (o12Var2 != null) {
                                if (in0Var7 != null) {
                                    wx2Var.k = yw2Var2;
                                    wx2Var.l = j20Var3;
                                    wx2Var.m = x22Var5;
                                    wx2Var.n = in0Var7;
                                    wx2Var.o = in0Var2;
                                    wx2Var.p = nn0Var3;
                                    wx2Var.q = in0Var6;
                                    wx2Var.r = o12Var2;
                                    wx2Var.s = zt2VarE;
                                    wx2Var.u = 5;
                                    zt2 zt2Var = zt2VarE;
                                    Object objJ = yw2Var2.j(yw2Var2.e().b(), new cn2(o12Var2, null), wx2Var);
                                    if (objJ != k20Var) {
                                        in0Var8 = in0Var7;
                                        nn0Var4 = nn0Var3;
                                        yw2Var3 = yw2Var2;
                                        in0Var9 = in0Var2;
                                        in0Var10 = in0Var6;
                                        o12Var3 = o12Var2;
                                        objH = objJ;
                                        k21Var2 = zt2Var;
                                        o12Var4 = (o12) objH;
                                        if (o12Var4 == null) {
                                            t00 t00Var2 = null;
                                            zt2 zt2VarA2 = p7.A(j20Var3, null, new a2(k21Var2, x22Var5, t00Var2, 27), 1);
                                            if (nn0Var4 != rx2Var) {
                                                x22 x22Var10 = x22Var5;
                                                xx2 xx2Var = new xx2(nn0Var4, x22Var10, o12Var4, t00Var2, 1);
                                                x22Var7 = x22Var10;
                                                o12Var5 = o12Var4;
                                                in0Var11 = null;
                                                e(j20Var3, zt2VarA2, xx2Var);
                                            } else {
                                                in0Var11 = null;
                                                x22Var7 = x22Var5;
                                                o12Var5 = o12Var4;
                                            }
                                            if (in0Var9 == null) {
                                                wx2Var.k = j20Var3;
                                                wx2Var.l = x22Var7;
                                                wx2Var.m = in0Var8;
                                                wx2Var.n = in0Var10;
                                                wx2Var.o = zt2VarA2;
                                                wx2Var.p = o12Var3;
                                                wx2Var.q = in0Var11;
                                                wx2Var.r = in0Var11;
                                                wx2Var.s = in0Var11;
                                                wx2Var.u = 6;
                                                objH = h(yw2Var3, i12Var, wx2Var);
                                                if (objH != k20Var) {
                                                    o12 o12Var10 = o12Var3;
                                                    k21Var4 = zt2VarA2;
                                                    o12Var8 = o12Var10;
                                                    j20Var7 = j20Var3;
                                                    in0Var15 = in0Var10;
                                                    in0Var16 = in0Var8;
                                                    in0Var17 = in0Var11;
                                                    r12 = (o12) objH;
                                                    r13 = in0Var17;
                                                    if (r12 != 0) {
                                                        r12.a();
                                                        e(j20Var7, k21Var4, new ux2(x22Var7, r13, 5));
                                                        in0Var16.j(new rs1(r12.c));
                                                        return a83Var;
                                                    }
                                                    e(j20Var7, k21Var4, new ux2(x22Var7, r13, 6));
                                                    if (in0Var15 != null) {
                                                        in0Var15.j(new rs1(o12Var8.c));
                                                        return a83Var;
                                                    }
                                                }
                                            } else {
                                                wx2Var.k = yw2Var3;
                                                wx2Var.l = j20Var3;
                                                wx2Var.m = x22Var7;
                                                wx2Var.n = in0Var8;
                                                wx2Var.o = in0Var9;
                                                wx2Var.p = in0Var10;
                                                wx2Var.q = zt2VarA2;
                                                wx2Var.r = o12Var3;
                                                wx2Var.s = o12Var5;
                                                wx2Var.u = 7;
                                                Object objG = g(yw2Var3, i12Var, wx2Var);
                                                if (objG != k20Var) {
                                                    x22 x22Var11 = x22Var7;
                                                    k21Var3 = zt2VarA2;
                                                    o12Var6 = o12Var5;
                                                    objH = objG;
                                                    yw2Var4 = yw2Var3;
                                                    o12Var7 = o12Var3;
                                                    x22Var8 = x22Var11;
                                                    j20Var6 = j20Var3;
                                                    in0Var12 = in0Var10;
                                                    in0Var13 = in0Var9;
                                                    in0Var14 = in0Var8;
                                                    in0Var18 = in0Var11;
                                                    bd1Var2 = (bd1) objH;
                                                    if (t11.l(bd1Var2, ad1Var)) {
                                                        if (bd1Var2 instanceof zc1) {
                                                            k21 k21Var6 = k21Var3;
                                                            x22Var7 = x22Var8;
                                                            k21Var4 = k21Var6;
                                                            o12Var8 = o12Var7;
                                                            in0Var15 = in0Var12;
                                                            in0Var16 = in0Var14;
                                                            obj = ((zc1) bd1Var2).a;
                                                        } else {
                                                            if (!(bd1Var2 instanceof yc1)) {
                                                                c80.s();
                                                                return null;
                                                            }
                                                            k21 k21Var7 = k21Var3;
                                                            x22Var7 = x22Var8;
                                                            k21Var4 = k21Var7;
                                                            o12Var8 = o12Var7;
                                                            in0Var15 = in0Var12;
                                                            in0Var16 = in0Var14;
                                                            obj = in0Var18;
                                                        }
                                                        j20Var7 = j20Var6;
                                                        r12 = obj;
                                                        r13 = in0Var18;
                                                        if (r12 != 0) {
                                                        }
                                                    } else {
                                                        in0Var13.j(new rs1(o12Var6.c));
                                                        wx2Var.k = j20Var6;
                                                        wx2Var.l = x22Var8;
                                                        wx2Var.m = k21Var3;
                                                        wx2Var.n = in0Var18;
                                                        wx2Var.o = in0Var18;
                                                        wx2Var.p = in0Var18;
                                                        wx2Var.q = in0Var18;
                                                        wx2Var.r = in0Var18;
                                                        wx2Var.s = in0Var18;
                                                        wx2Var.u = 8;
                                                        if (c(yw2Var4, wx2Var) != k20Var) {
                                                            k21Var5 = k21Var3;
                                                            j20Var8 = j20Var6;
                                                            r132 = in0Var18;
                                                            e(j20Var8, k21Var5, new ux2(x22Var8, r132, 7));
                                                            return a83Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (in0Var10 != null) {
                                            in0Var10.j(new rs1(o12Var3.c));
                                            return a83Var;
                                        }
                                    }
                                } else if (in0Var6 != null) {
                                    in0Var6.j(new rs1(o12Var2.c));
                                    return a83Var;
                                }
                            }
                            return a83Var;
                        }
                    } else {
                        wx2Var.k = yw2Var5;
                        wx2Var.l = j20Var2;
                        wx2Var.m = x22Var3;
                        wx2Var.n = in0Var3;
                        wx2Var.o = in0Var2;
                        wx2Var.p = nn0Var2;
                        wx2Var.q = in0Var;
                        wx2Var.r = o12Var;
                        wx2Var.s = zt2VarA;
                        wx2Var.u = 3;
                        Object objG2 = g(yw2Var5, i12Var, wx2Var);
                        if (objG2 != k20Var) {
                            yw2Var2 = yw2Var5;
                            k21Var = zt2VarA;
                            x22 x22Var12 = x22Var3;
                            j20Var3 = j20Var2;
                            objH = objG2;
                            in0Var4 = in0Var;
                            x22Var4 = x22Var12;
                            bd1Var = (bd1) objH;
                            if (t11.l(bd1Var, ad1Var2)) {
                                if (bd1Var instanceof zc1) {
                                    o12Var2 = ((zc1) bd1Var).a;
                                } else {
                                    if (!(bd1Var instanceof yc1)) {
                                        c80.s();
                                        return null;
                                    }
                                    o12Var2 = null;
                                }
                                in0Var6 = in0Var4;
                                nn0Var3 = nn0Var2;
                                x22Var5 = x22Var4;
                                in0Var7 = in0Var3;
                                if (o12Var2 == null) {
                                }
                                if (o12Var2 != null) {
                                }
                                return a83Var;
                            }
                            in0Var2.j(new rs1(o12Var.c));
                            wx2Var.k = j20Var3;
                            wx2Var.l = x22Var4;
                            wx2Var.m = k21Var;
                            t00Var = null;
                            wx2Var.n = null;
                            wx2Var.o = null;
                            wx2Var.p = null;
                            wx2Var.q = null;
                            wx2Var.r = null;
                            wx2Var.s = null;
                            wx2Var.u = 4;
                            if (c(yw2Var2, wx2Var) != k20Var) {
                                x22Var6 = x22Var4;
                                j20Var5 = j20Var3;
                                e(j20Var5, k21Var, new ux2(x22Var6, t00Var, 2));
                                return a83Var2;
                            }
                        }
                    }
                }
                return k20Var;
            case 1:
                in0 in0Var19 = (in0) wx2Var.q;
                nn0 nn0Var5 = (nn0) wx2Var.p;
                in0 in0Var20 = (in0) wx2Var.o;
                in0 in0Var21 = wx2Var.n;
                x22 x22Var13 = (x22) wx2Var.m;
                j20 j20Var10 = (j20) wx2Var.l;
                yw2 yw2Var6 = (yw2) wx2Var.k;
                fg1.T(objH);
                objB = objH;
                in0Var3 = in0Var21;
                j20Var2 = j20Var10;
                i = 1;
                nn0Var2 = nn0Var5;
                x22Var2 = x22Var13;
                in0Var = in0Var19;
                yw2Var5 = yw2Var6;
                in0Var2 = in0Var20;
                r5 = 0;
                o12 o12Var92 = (o12) objB;
                o12Var92.a();
                zt2 zt2VarA3 = p7.A(j20Var2, r5, new vx2(x22Var2, r5, i), i);
                if (nn0Var2 == rx2Var) {
                }
                if (in0Var2 != null) {
                }
                return k20Var;
            case 2:
                k21Var = (k21) wx2Var.r;
                in0Var6 = (in0) wx2Var.q;
                nn0Var3 = (nn0) wx2Var.p;
                in0Var5 = (in0) wx2Var.o;
                in0Var7 = wx2Var.n;
                x22Var3 = (x22) wx2Var.m;
                j20Var4 = (j20) wx2Var.l;
                yw2Var2 = (yw2) wx2Var.k;
                fg1.T(objH);
                o12Var2 = (o12) objH;
                j20 j20Var92 = j20Var4;
                in0Var2 = in0Var5;
                x22Var5 = x22Var3;
                j20Var3 = j20Var92;
                if (o12Var2 == null) {
                }
                if (o12Var2 != null) {
                }
                return a83Var;
            case 3:
                k21Var = (k21) wx2Var.s;
                o12Var = (o12) wx2Var.r;
                in0Var4 = (in0) wx2Var.q;
                nn0Var2 = (nn0) wx2Var.p;
                in0Var2 = (in0) wx2Var.o;
                in0Var3 = wx2Var.n;
                x22Var4 = (x22) wx2Var.m;
                j20Var3 = (j20) wx2Var.l;
                yw2Var2 = (yw2) wx2Var.k;
                fg1.T(objH);
                bd1Var = (bd1) objH;
                if (t11.l(bd1Var, ad1Var2)) {
                }
                break;
            case 4:
                k21Var = (k21) wx2Var.m;
                x22Var6 = (x22) wx2Var.l;
                j20Var5 = (j20) wx2Var.k;
                fg1.T(objH);
                t00Var = null;
                e(j20Var5, k21Var, new ux2(x22Var6, t00Var, 2));
                return a83Var2;
            case 5:
                k21Var2 = (k21) wx2Var.s;
                o12Var3 = (o12) wx2Var.r;
                in0 in0Var22 = (in0) wx2Var.q;
                nn0Var4 = (nn0) wx2Var.p;
                in0 in0Var23 = (in0) wx2Var.o;
                in0 in0Var24 = wx2Var.n;
                x22Var5 = (x22) wx2Var.m;
                j20 j20Var11 = (j20) wx2Var.l;
                yw2 yw2Var7 = (yw2) wx2Var.k;
                fg1.T(objH);
                in0Var10 = in0Var22;
                yw2Var3 = yw2Var7;
                in0Var8 = in0Var24;
                in0Var9 = in0Var23;
                j20Var3 = j20Var11;
                ad1Var = ad1Var2;
                a83Var = a83Var2;
                o12Var4 = (o12) objH;
                if (o12Var4 == null) {
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                o12Var8 = (o12) wx2Var.p;
                k21Var4 = (k21) wx2Var.o;
                in0Var15 = wx2Var.n;
                in0Var16 = (in0) wx2Var.m;
                x22Var7 = (x22) wx2Var.l;
                j20Var7 = (j20) wx2Var.k;
                fg1.T(objH);
                a83Var = a83Var2;
                in0Var17 = null;
                r12 = (o12) objH;
                r13 = in0Var17;
                if (r12 != 0) {
                }
                break;
            case 7:
                o12Var6 = (o12) wx2Var.s;
                o12 o12Var11 = (o12) wx2Var.r;
                k21Var3 = (k21) wx2Var.q;
                in0Var12 = (in0) wx2Var.p;
                in0Var13 = (in0) wx2Var.o;
                in0Var14 = wx2Var.n;
                x22 x22Var14 = (x22) wx2Var.m;
                j20Var6 = (j20) wx2Var.l;
                yw2 yw2Var8 = (yw2) wx2Var.k;
                fg1.T(objH);
                yw2Var4 = yw2Var8;
                ad1Var = ad1Var2;
                a83Var = a83Var2;
                in0Var18 = null;
                o12Var7 = o12Var11;
                x22Var8 = x22Var14;
                bd1Var2 = (bd1) objH;
                if (t11.l(bd1Var2, ad1Var)) {
                }
                break;
            case 8:
                k21Var5 = (k21) wx2Var.m;
                x22Var8 = (x22) wx2Var.l;
                j20Var8 = (j20) wx2Var.k;
                fg1.T(objH);
                a83Var = a83Var2;
                r132 = 0;
                e(j20Var8, k21Var5, new ux2(x22Var8, r132, 7));
                return a83Var;
            default:
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(yw2 yw2Var, i12 i12Var, u00 u00Var) {
        yx2 yx2Var;
        o72 o72Var;
        if (u00Var instanceof yx2) {
            yx2Var = (yx2) u00Var;
            int i = yx2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx2Var.m = i - Integer.MIN_VALUE;
            } else {
                yx2Var = new yx2(u00Var);
            }
        }
        Object obj = yx2Var.l;
        int i2 = yx2Var.m;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.T(obj);
                o72 o72Var2 = new o72();
                o72Var2.i = yc1.a;
                long jC = yw2Var.e().c();
                mn0 lm0Var = new lm0(i12Var, o72Var2, t00Var, 4);
                yx2Var.k = o72Var2;
                yx2Var.m = 1;
                Object objG = yw2Var.g(jC, lm0Var, yx2Var);
                Object obj2 = k20.h;
                if (objG == obj2) {
                    return obj2;
                }
                o72Var = o72Var2;
            } else {
                if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o72Var = yx2Var.k;
                fg1.T(obj);
            }
            return o72Var.i;
        } catch (j12 unused) {
            return ad1.a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(yw2 yw2Var, i12 i12Var, rj rjVar) {
        zx2 zx2Var;
        yw2 yw2Var2;
        zx2 zx2Var2;
        i12 i12Var2;
        yw2 yw2Var3;
        i12 i12Var3;
        int size;
        int i;
        Object objA;
        if (rjVar instanceof zx2) {
            zx2Var = (zx2) rjVar;
            int i2 = zx2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zx2Var.n = i2 - Integer.MIN_VALUE;
            } else {
                zx2Var = new zx2(rjVar);
            }
        }
        Object objA2 = zx2Var.m;
        int i3 = zx2Var.n;
        k20 k20Var = k20.h;
        if (i3 == 0) {
            fg1.T(objA2);
            yw2Var2 = yw2Var;
            zx2Var2 = zx2Var;
            i12Var2 = i12Var;
            zx2Var2.k = yw2Var2;
            zx2Var2.l = i12Var2;
            zx2Var2.n = 1;
            objA = yw2Var2.a(i12Var2, zx2Var2);
            if (objA != k20Var) {
            }
            return k20Var;
        }
        if (i3 == 1) {
            i12Var3 = zx2Var.l;
            yw2Var3 = zx2Var.k;
            fg1.T(objA2);
            List list = ((h12) objA2).a;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i12Var3 = zx2Var.l;
        yw2Var3 = zx2Var.k;
        fg1.T(objA2);
        i12 i12Var4 = i12Var3;
        zx2Var2 = zx2Var;
        i12Var2 = i12Var4;
        List list2 = ((h12) objA2).a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((o12) list2.get(i4)).b()) {
                break;
            }
        }
        yw2Var2 = yw2Var3;
        zx2Var2.k = yw2Var2;
        zx2Var2.l = i12Var2;
        zx2Var2.n = 1;
        objA = yw2Var2.a(i12Var2, zx2Var2);
        if (objA != k20Var) {
            yw2Var3 = yw2Var2;
            objA2 = objA;
            zx2 zx2Var3 = zx2Var2;
            i12Var3 = i12Var2;
            zx2Var = zx2Var3;
            List list3 = ((h12) objA2).a;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!tp0.p((o12) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        o12 o12Var = (o12) list3.get(i5);
                        if (o12Var.b() || tp0.z(o12Var, yw2Var3.m.E, yw2Var3.c())) {
                            break;
                        }
                    }
                    zx2Var.k = yw2Var3;
                    zx2Var.l = i12Var3;
                    zx2Var.n = 2;
                    objA2 = yw2Var3.a(i12.j, zx2Var);
                }
            }
            return list3.get(0);
        }
        return k20Var;
    }
}

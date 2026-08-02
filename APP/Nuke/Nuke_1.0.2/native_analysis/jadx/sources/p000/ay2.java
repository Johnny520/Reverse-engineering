package p000;

import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ay2 {

    /* JADX INFO: renamed from: a */
    public static final rx2 f444a = new rx2(3, null);

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
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m304a(p000.yw2 r5, boolean r6, p000.i12 r7, p000.AbstractC0658rj r8) {
        /*
            boolean r0 = r8 instanceof p000.sx2
            if (r0 == 0) goto L13
            r0 = r8
            sx2 r0 = (p000.sx2) r0
            int r1 = r0.f10417o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10417o = r1
            goto L18
        L13:
            sx2 r0 = new sx2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10416n
            int r1 = r0.f10417o
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.f10415m
            i12 r6 = r0.f10414l
            yw2 r7 = r0.f10413k
            p000.fg1.m1627T(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0676s.m4653l(r5)
            r5 = 0
            return r5
        L36:
            p000.fg1.m1627T(r8)
        L39:
            r0.f10413k = r5
            r0.f10414l = r7
            r0.f10415m = r6
            r0.f10417o = r2
            java.lang.Object r8 = r5.m6363a(r7, r0)
            k20 r1 = p000.k20.f5323h
            if (r8 != r1) goto L4a
            return r1
        L4a:
            h12 r8 = (p000.h12) r8
            boolean r1 = m307d(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.f3776a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ay2.m304a(yw2, boolean, i12, rj):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m305b(yw2 yw2Var, AbstractC0658rj abstractC0658rj, int i) {
        return m304a(yw2Var, (i & 1) != 0, i12.f4217i, abstractC0658rj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m306c(yw2 yw2Var, u00 u00Var) {
        tx2 tx2Var;
        k20 k20Var;
        int size;
        int i;
        int i2;
        int size2;
        if (u00Var instanceof tx2) {
            tx2Var = (tx2) u00Var;
            int i3 = tx2Var.f10995m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tx2Var.f10995m = i3 - Integer.MIN_VALUE;
            } else {
                tx2Var = new tx2(u00Var);
            }
        }
        Object objM6363a = tx2Var.f10994l;
        int i4 = tx2Var.f10995m;
        if (i4 == 0) {
            fg1.m1627T(objM6363a);
            tx2Var.f10993k = yw2Var;
            tx2Var.f10995m = 1;
            objM6363a = yw2Var.m6363a(i12.f4217i, tx2Var);
            k20Var = k20.f5323h;
            if (objM6363a == k20Var) {
            }
            h12 h12Var = (h12) objM6363a;
            List list = h12Var.f3776a;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = h12Var.f3776a;
            size2 = list2.size();
            while (i < size2) {
            }
            return a83.f116a;
        }
        if (i4 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yw2Var = tx2Var.f10993k;
        fg1.m1627T(objM6363a);
        h12 h12Var2 = (h12) objM6363a;
        List list3 = h12Var2.f3776a;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((o12) list3.get(i2)).m3463a();
        }
        List list22 = h12Var2.f3776a;
        size2 = list22.size();
        while (i < size2) {
            if (((o12) list22.get(i)).f7423d) {
                tx2Var.f10993k = yw2Var;
                tx2Var.f10995m = 1;
                objM6363a = yw2Var.m6363a(i12.f4217i, tx2Var);
                k20Var = k20.f5323h;
                if (objM6363a == k20Var) {
                    return k20Var;
                }
                h12 h12Var22 = (h12) objM6363a;
                List list32 = h12Var22.f3776a;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = h12Var22.f3776a;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return a83.f116a;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m307d(h12 h12Var, boolean z) {
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            if (!(z ? tp0.m5366n(o12Var) : tp0.m5367o(o12Var))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static zt2 m308e(j20 j20Var, k21 k21Var, mn0 mn0Var) {
        return AbstractC0570p7.m3745A(j20Var, null, new C0040b2(k21Var, mn0Var, (t00) null, 22), 1);
    }

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
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m309f(yw2 yw2Var, j20 j20Var, x22 x22Var, nn0 nn0Var, j10 j10Var, AbstractC0658rj abstractC0658rj) {
        wx2 wx2Var;
        j20 j20Var2;
        x22 x22Var2;
        ?? r5;
        nn0 nn0Var2;
        in0 in0Var;
        int i;
        Object objM305b;
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
        zt2 zt2VarM308e;
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
        if (abstractC0658rj instanceof wx2) {
            wx2Var = (wx2) abstractC0658rj;
            int i2 = wx2Var.f12735u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wx2Var.f12735u = i2 - Integer.MIN_VALUE;
            } else {
                wx2Var = new wx2(abstractC0658rj);
            }
        }
        Object objM311h = wx2Var.f12734t;
        int i3 = wx2Var.f12735u;
        i12 i12Var = i12.f4217i;
        ad1 ad1Var2 = ad1.f160a;
        rx2 rx2Var = f444a;
        a83 a83Var2 = a83.f116a;
        k20 k20Var = k20.f5323h;
        switch (i3) {
            case 0:
                fg1.m1627T(objM311h);
                wx2Var.f12725k = yw2Var5;
                j20Var2 = j20Var;
                wx2Var.f12726l = j20Var2;
                x22Var2 = x22Var;
                wx2Var.f12727m = x22Var2;
                r5 = 0;
                wx2Var.f12728n = null;
                wx2Var.f12729o = null;
                nn0Var2 = nn0Var;
                wx2Var.f12730p = nn0Var2;
                in0Var = j10Var;
                wx2Var.f12731q = in0Var;
                i = 1;
                wx2Var.f12735u = 1;
                objM305b = m305b(yw2Var5, wx2Var, 3);
                if (objM305b != k20Var) {
                    in0Var2 = null;
                    in0Var3 = null;
                    o12 o12Var9 = (o12) objM305b;
                    o12Var9.m3463a();
                    zt2 zt2VarM3745A = AbstractC0570p7.m3745A(j20Var2, r5, new vx2(x22Var2, r5, i), i);
                    if (nn0Var2 == rx2Var) {
                        x22 x22Var9 = x22Var2;
                        x22Var3 = x22Var9;
                        o12Var = o12Var9;
                        m308e(j20Var2, zt2VarM3745A, new xx2(nn0Var2, x22Var9, o12Var9, r5, 0));
                    } else {
                        x22Var3 = x22Var2;
                        o12Var = o12Var9;
                    }
                    if (in0Var2 != null) {
                        wx2Var.f12725k = yw2Var5;
                        wx2Var.f12726l = j20Var2;
                        wx2Var.f12727m = x22Var3;
                        wx2Var.f12728n = in0Var3;
                        wx2Var.f12729o = in0Var2;
                        wx2Var.f12730p = nn0Var2;
                        wx2Var.f12731q = in0Var;
                        wx2Var.f12732r = zt2VarM3745A;
                        wx2Var.f12735u = 2;
                        Object objM311h2 = m311h(yw2Var5, i12Var, wx2Var);
                        if (objM311h2 != k20Var) {
                            yw2Var2 = yw2Var5;
                            k21Var = zt2VarM3745A;
                            nn0Var3 = nn0Var2;
                            in0Var5 = in0Var2;
                            j20Var4 = j20Var2;
                            objM311h = objM311h2;
                            in0Var6 = in0Var;
                            in0Var7 = in0Var3;
                            o12Var2 = (o12) objM311h;
                            j20 j20Var9 = j20Var4;
                            in0Var2 = in0Var5;
                            x22Var5 = x22Var3;
                            j20Var3 = j20Var9;
                            if (o12Var2 == null) {
                                ad1Var = ad1Var2;
                                a83Var = a83Var2;
                                zt2VarM308e = m308e(j20Var3, k21Var, new ux2(x22Var5, null, 3));
                            } else {
                                ad1Var = ad1Var2;
                                a83Var = a83Var2;
                                o12Var2.m3463a();
                                zt2VarM308e = m308e(j20Var3, k21Var, new ux2(x22Var5, null, 4));
                            }
                            if (o12Var2 != null) {
                                if (in0Var7 != null) {
                                    wx2Var.f12725k = yw2Var2;
                                    wx2Var.f12726l = j20Var3;
                                    wx2Var.f12727m = x22Var5;
                                    wx2Var.f12728n = in0Var7;
                                    wx2Var.f12729o = in0Var2;
                                    wx2Var.f12730p = nn0Var3;
                                    wx2Var.f12731q = in0Var6;
                                    wx2Var.f12732r = o12Var2;
                                    wx2Var.f12733s = zt2VarM308e;
                                    wx2Var.f12735u = 5;
                                    zt2 zt2Var = zt2VarM308e;
                                    Object objM6367j = yw2Var2.m6367j(yw2Var2.m6365e().mo3033b(), new cn2(o12Var2, null), wx2Var);
                                    if (objM6367j != k20Var) {
                                        in0Var8 = in0Var7;
                                        nn0Var4 = nn0Var3;
                                        yw2Var3 = yw2Var2;
                                        in0Var9 = in0Var2;
                                        in0Var10 = in0Var6;
                                        o12Var3 = o12Var2;
                                        objM311h = objM6367j;
                                        k21Var2 = zt2Var;
                                        o12Var4 = (o12) objM311h;
                                        if (o12Var4 == null) {
                                            t00 t00Var2 = null;
                                            zt2 zt2VarM3745A2 = AbstractC0570p7.m3745A(j20Var3, null, new C0003a2(k21Var2, x22Var5, t00Var2, 27), 1);
                                            if (nn0Var4 != rx2Var) {
                                                x22 x22Var10 = x22Var5;
                                                xx2 xx2Var = new xx2(nn0Var4, x22Var10, o12Var4, t00Var2, 1);
                                                x22Var7 = x22Var10;
                                                o12Var5 = o12Var4;
                                                in0Var11 = null;
                                                m308e(j20Var3, zt2VarM3745A2, xx2Var);
                                            } else {
                                                in0Var11 = null;
                                                x22Var7 = x22Var5;
                                                o12Var5 = o12Var4;
                                            }
                                            if (in0Var9 == null) {
                                                wx2Var.f12725k = j20Var3;
                                                wx2Var.f12726l = x22Var7;
                                                wx2Var.f12727m = in0Var8;
                                                wx2Var.f12728n = in0Var10;
                                                wx2Var.f12729o = zt2VarM3745A2;
                                                wx2Var.f12730p = o12Var3;
                                                wx2Var.f12731q = in0Var11;
                                                wx2Var.f12732r = in0Var11;
                                                wx2Var.f12733s = in0Var11;
                                                wx2Var.f12735u = 6;
                                                objM311h = m311h(yw2Var3, i12Var, wx2Var);
                                                if (objM311h != k20Var) {
                                                    o12 o12Var10 = o12Var3;
                                                    k21Var4 = zt2VarM3745A2;
                                                    o12Var8 = o12Var10;
                                                    j20Var7 = j20Var3;
                                                    in0Var15 = in0Var10;
                                                    in0Var16 = in0Var8;
                                                    in0Var17 = in0Var11;
                                                    r12 = (o12) objM311h;
                                                    r13 = in0Var17;
                                                    if (r12 != 0) {
                                                        r12.m3463a();
                                                        m308e(j20Var7, k21Var4, new ux2(x22Var7, r13, 5));
                                                        in0Var16.mo5j(new rs1(r12.f7422c));
                                                        return a83Var;
                                                    }
                                                    m308e(j20Var7, k21Var4, new ux2(x22Var7, r13, 6));
                                                    if (in0Var15 != null) {
                                                        in0Var15.mo5j(new rs1(o12Var8.f7422c));
                                                        return a83Var;
                                                    }
                                                }
                                            } else {
                                                wx2Var.f12725k = yw2Var3;
                                                wx2Var.f12726l = j20Var3;
                                                wx2Var.f12727m = x22Var7;
                                                wx2Var.f12728n = in0Var8;
                                                wx2Var.f12729o = in0Var9;
                                                wx2Var.f12730p = in0Var10;
                                                wx2Var.f12731q = zt2VarM3745A2;
                                                wx2Var.f12732r = o12Var3;
                                                wx2Var.f12733s = o12Var5;
                                                wx2Var.f12735u = 7;
                                                Object objM310g = m310g(yw2Var3, i12Var, wx2Var);
                                                if (objM310g != k20Var) {
                                                    x22 x22Var11 = x22Var7;
                                                    k21Var3 = zt2VarM3745A2;
                                                    o12Var6 = o12Var5;
                                                    objM311h = objM310g;
                                                    yw2Var4 = yw2Var3;
                                                    o12Var7 = o12Var3;
                                                    x22Var8 = x22Var11;
                                                    j20Var6 = j20Var3;
                                                    in0Var12 = in0Var10;
                                                    in0Var13 = in0Var9;
                                                    in0Var14 = in0Var8;
                                                    in0Var18 = in0Var11;
                                                    bd1Var2 = (bd1) objM311h;
                                                    if (t11.m5086l(bd1Var2, ad1Var)) {
                                                        if (bd1Var2 instanceof zc1) {
                                                            k21 k21Var6 = k21Var3;
                                                            x22Var7 = x22Var8;
                                                            k21Var4 = k21Var6;
                                                            o12Var8 = o12Var7;
                                                            in0Var15 = in0Var12;
                                                            in0Var16 = in0Var14;
                                                            obj = ((zc1) bd1Var2).f13834a;
                                                        } else {
                                                            if (!(bd1Var2 instanceof yc1)) {
                                                                c80.m675s();
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
                                                        in0Var13.mo5j(new rs1(o12Var6.f7422c));
                                                        wx2Var.f12725k = j20Var6;
                                                        wx2Var.f12726l = x22Var8;
                                                        wx2Var.f12727m = k21Var3;
                                                        wx2Var.f12728n = in0Var18;
                                                        wx2Var.f12729o = in0Var18;
                                                        wx2Var.f12730p = in0Var18;
                                                        wx2Var.f12731q = in0Var18;
                                                        wx2Var.f12732r = in0Var18;
                                                        wx2Var.f12733s = in0Var18;
                                                        wx2Var.f12735u = 8;
                                                        if (m306c(yw2Var4, wx2Var) != k20Var) {
                                                            k21Var5 = k21Var3;
                                                            j20Var8 = j20Var6;
                                                            r132 = in0Var18;
                                                            m308e(j20Var8, k21Var5, new ux2(x22Var8, r132, 7));
                                                            return a83Var;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (in0Var10 != null) {
                                            in0Var10.mo5j(new rs1(o12Var3.f7422c));
                                            return a83Var;
                                        }
                                    }
                                } else if (in0Var6 != null) {
                                    in0Var6.mo5j(new rs1(o12Var2.f7422c));
                                    return a83Var;
                                }
                            }
                            return a83Var;
                        }
                    } else {
                        wx2Var.f12725k = yw2Var5;
                        wx2Var.f12726l = j20Var2;
                        wx2Var.f12727m = x22Var3;
                        wx2Var.f12728n = in0Var3;
                        wx2Var.f12729o = in0Var2;
                        wx2Var.f12730p = nn0Var2;
                        wx2Var.f12731q = in0Var;
                        wx2Var.f12732r = o12Var;
                        wx2Var.f12733s = zt2VarM3745A;
                        wx2Var.f12735u = 3;
                        Object objM310g2 = m310g(yw2Var5, i12Var, wx2Var);
                        if (objM310g2 != k20Var) {
                            yw2Var2 = yw2Var5;
                            k21Var = zt2VarM3745A;
                            x22 x22Var12 = x22Var3;
                            j20Var3 = j20Var2;
                            objM311h = objM310g2;
                            in0Var4 = in0Var;
                            x22Var4 = x22Var12;
                            bd1Var = (bd1) objM311h;
                            if (t11.m5086l(bd1Var, ad1Var2)) {
                                if (bd1Var instanceof zc1) {
                                    o12Var2 = ((zc1) bd1Var).f13834a;
                                } else {
                                    if (!(bd1Var instanceof yc1)) {
                                        c80.m675s();
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
                            in0Var2.mo5j(new rs1(o12Var.f7422c));
                            wx2Var.f12725k = j20Var3;
                            wx2Var.f12726l = x22Var4;
                            wx2Var.f12727m = k21Var;
                            t00Var = null;
                            wx2Var.f12728n = null;
                            wx2Var.f12729o = null;
                            wx2Var.f12730p = null;
                            wx2Var.f12731q = null;
                            wx2Var.f12732r = null;
                            wx2Var.f12733s = null;
                            wx2Var.f12735u = 4;
                            if (m306c(yw2Var2, wx2Var) != k20Var) {
                                x22Var6 = x22Var4;
                                j20Var5 = j20Var3;
                                m308e(j20Var5, k21Var, new ux2(x22Var6, t00Var, 2));
                                return a83Var2;
                            }
                        }
                    }
                }
                return k20Var;
            case 1:
                in0 in0Var19 = (in0) wx2Var.f12731q;
                nn0 nn0Var5 = (nn0) wx2Var.f12730p;
                in0 in0Var20 = (in0) wx2Var.f12729o;
                in0 in0Var21 = wx2Var.f12728n;
                x22 x22Var13 = (x22) wx2Var.f12727m;
                j20 j20Var10 = (j20) wx2Var.f12726l;
                yw2 yw2Var6 = (yw2) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                objM305b = objM311h;
                in0Var3 = in0Var21;
                j20Var2 = j20Var10;
                i = 1;
                nn0Var2 = nn0Var5;
                x22Var2 = x22Var13;
                in0Var = in0Var19;
                yw2Var5 = yw2Var6;
                in0Var2 = in0Var20;
                r5 = 0;
                o12 o12Var92 = (o12) objM305b;
                o12Var92.m3463a();
                zt2 zt2VarM3745A3 = AbstractC0570p7.m3745A(j20Var2, r5, new vx2(x22Var2, r5, i), i);
                if (nn0Var2 == rx2Var) {
                }
                if (in0Var2 != null) {
                }
                return k20Var;
            case 2:
                k21Var = (k21) wx2Var.f12732r;
                in0Var6 = (in0) wx2Var.f12731q;
                nn0Var3 = (nn0) wx2Var.f12730p;
                in0Var5 = (in0) wx2Var.f12729o;
                in0Var7 = wx2Var.f12728n;
                x22Var3 = (x22) wx2Var.f12727m;
                j20Var4 = (j20) wx2Var.f12726l;
                yw2Var2 = (yw2) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                o12Var2 = (o12) objM311h;
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
                k21Var = (k21) wx2Var.f12733s;
                o12Var = (o12) wx2Var.f12732r;
                in0Var4 = (in0) wx2Var.f12731q;
                nn0Var2 = (nn0) wx2Var.f12730p;
                in0Var2 = (in0) wx2Var.f12729o;
                in0Var3 = wx2Var.f12728n;
                x22Var4 = (x22) wx2Var.f12727m;
                j20Var3 = (j20) wx2Var.f12726l;
                yw2Var2 = (yw2) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                bd1Var = (bd1) objM311h;
                if (t11.m5086l(bd1Var, ad1Var2)) {
                }
                break;
            case 4:
                k21Var = (k21) wx2Var.f12727m;
                x22Var6 = (x22) wx2Var.f12726l;
                j20Var5 = (j20) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                t00Var = null;
                m308e(j20Var5, k21Var, new ux2(x22Var6, t00Var, 2));
                return a83Var2;
            case 5:
                k21Var2 = (k21) wx2Var.f12733s;
                o12Var3 = (o12) wx2Var.f12732r;
                in0 in0Var22 = (in0) wx2Var.f12731q;
                nn0Var4 = (nn0) wx2Var.f12730p;
                in0 in0Var23 = (in0) wx2Var.f12729o;
                in0 in0Var24 = wx2Var.f12728n;
                x22Var5 = (x22) wx2Var.f12727m;
                j20 j20Var11 = (j20) wx2Var.f12726l;
                yw2 yw2Var7 = (yw2) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                in0Var10 = in0Var22;
                yw2Var3 = yw2Var7;
                in0Var8 = in0Var24;
                in0Var9 = in0Var23;
                j20Var3 = j20Var11;
                ad1Var = ad1Var2;
                a83Var = a83Var2;
                o12Var4 = (o12) objM311h;
                if (o12Var4 == null) {
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                o12Var8 = (o12) wx2Var.f12730p;
                k21Var4 = (k21) wx2Var.f12729o;
                in0Var15 = wx2Var.f12728n;
                in0Var16 = (in0) wx2Var.f12727m;
                x22Var7 = (x22) wx2Var.f12726l;
                j20Var7 = (j20) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                a83Var = a83Var2;
                in0Var17 = null;
                r12 = (o12) objM311h;
                r13 = in0Var17;
                if (r12 != 0) {
                }
                break;
            case 7:
                o12Var6 = (o12) wx2Var.f12733s;
                o12 o12Var11 = (o12) wx2Var.f12732r;
                k21Var3 = (k21) wx2Var.f12731q;
                in0Var12 = (in0) wx2Var.f12730p;
                in0Var13 = (in0) wx2Var.f12729o;
                in0Var14 = wx2Var.f12728n;
                x22 x22Var14 = (x22) wx2Var.f12727m;
                j20Var6 = (j20) wx2Var.f12726l;
                yw2 yw2Var8 = (yw2) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                yw2Var4 = yw2Var8;
                ad1Var = ad1Var2;
                a83Var = a83Var2;
                in0Var18 = null;
                o12Var7 = o12Var11;
                x22Var8 = x22Var14;
                bd1Var2 = (bd1) objM311h;
                if (t11.m5086l(bd1Var2, ad1Var)) {
                }
                break;
            case 8:
                k21Var5 = (k21) wx2Var.f12727m;
                x22Var8 = (x22) wx2Var.f12726l;
                j20Var8 = (j20) wx2Var.f12725k;
                fg1.m1627T(objM311h);
                a83Var = a83Var2;
                r132 = 0;
                m308e(j20Var8, k21Var5, new ux2(x22Var8, r132, 7));
                return a83Var;
            default:
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m310g(yw2 yw2Var, i12 i12Var, u00 u00Var) {
        yx2 yx2Var;
        o72 o72Var;
        if (u00Var instanceof yx2) {
            yx2Var = (yx2) u00Var;
            int i = yx2Var.f13665m;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx2Var.f13665m = i - Integer.MIN_VALUE;
            } else {
                yx2Var = new yx2(u00Var);
            }
        }
        Object obj = yx2Var.f13664l;
        int i2 = yx2Var.f13665m;
        t00 t00Var = null;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                o72 o72Var2 = new o72();
                o72Var2.f7574i = yc1.f13406a;
                long jMo3034c = yw2Var.m6365e().mo3034c();
                mn0 lm0Var = new lm0(i12Var, o72Var2, t00Var, 4);
                yx2Var.f13663k = o72Var2;
                yx2Var.f13665m = 1;
                Object objM6366g = yw2Var.m6366g(jMo3034c, lm0Var, yx2Var);
                Object obj2 = k20.f5323h;
                if (objM6366g == obj2) {
                    return obj2;
                }
                o72Var = o72Var2;
            } else {
                if (i2 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o72Var = yx2Var.f13663k;
                fg1.m1627T(obj);
            }
            return o72Var.f7574i;
        } catch (j12 unused) {
            return ad1.f160a;
        }
    }

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
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m311h(yw2 yw2Var, i12 i12Var, AbstractC0658rj abstractC0658rj) {
        zx2 zx2Var;
        yw2 yw2Var2;
        zx2 zx2Var2;
        i12 i12Var2;
        yw2 yw2Var3;
        i12 i12Var3;
        int size;
        int i;
        Object objM6363a;
        if (abstractC0658rj instanceof zx2) {
            zx2Var = (zx2) abstractC0658rj;
            int i2 = zx2Var.f14146n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zx2Var.f14146n = i2 - Integer.MIN_VALUE;
            } else {
                zx2Var = new zx2(abstractC0658rj);
            }
        }
        Object objM6363a2 = zx2Var.f14145m;
        int i3 = zx2Var.f14146n;
        k20 k20Var = k20.f5323h;
        if (i3 == 0) {
            fg1.m1627T(objM6363a2);
            yw2Var2 = yw2Var;
            zx2Var2 = zx2Var;
            i12Var2 = i12Var;
            zx2Var2.f14143k = yw2Var2;
            zx2Var2.f14144l = i12Var2;
            zx2Var2.f14146n = 1;
            objM6363a = yw2Var2.m6363a(i12Var2, zx2Var2);
            if (objM6363a != k20Var) {
            }
            return k20Var;
        }
        if (i3 == 1) {
            i12Var3 = zx2Var.f14144l;
            yw2Var3 = zx2Var.f14143k;
            fg1.m1627T(objM6363a2);
            List list = ((h12) objM6363a2).f3776a;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i12Var3 = zx2Var.f14144l;
        yw2Var3 = zx2Var.f14143k;
        fg1.m1627T(objM6363a2);
        i12 i12Var4 = i12Var3;
        zx2Var2 = zx2Var;
        i12Var2 = i12Var4;
        List list2 = ((h12) objM6363a2).f3776a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((o12) list2.get(i4)).m3464b()) {
                break;
            }
        }
        yw2Var2 = yw2Var3;
        zx2Var2.f14143k = yw2Var2;
        zx2Var2.f14144l = i12Var2;
        zx2Var2.f14146n = 1;
        objM6363a = yw2Var2.m6363a(i12Var2, zx2Var2);
        if (objM6363a != k20Var) {
            yw2Var3 = yw2Var2;
            objM6363a2 = objM6363a;
            zx2 zx2Var3 = zx2Var2;
            i12Var3 = i12Var2;
            zx2Var = zx2Var3;
            List list3 = ((h12) objM6363a2).f3776a;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!tp0.m5368p((o12) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        o12 o12Var = (o12) list3.get(i5);
                        if (o12Var.m3464b() || tp0.m5375z(o12Var, yw2Var3.f13658m.f14130E, yw2Var3.m6364c())) {
                            break;
                        }
                    }
                    zx2Var.f14143k = yw2Var3;
                    zx2Var.f14144l = i12Var3;
                    zx2Var.f14146n = 2;
                    objM6363a2 = yw2Var3.m6363a(i12.f4218j, zx2Var);
                }
            }
            return list3.get(0);
        }
        return k20Var;
    }
}

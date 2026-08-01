package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m61 {

    /* JADX INFO: renamed from: a */
    public static final C0521nq f3821a = new C0521nq(3, null, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2437a(r51 r51Var, AbstractC0955y9 abstractC0955y9) {
        g61 g61Var;
        EnumC1007zk enumC1007zk;
        int size;
        int i;
        int i2;
        int size2;
        if (abstractC0955y9 instanceof g61) {
            g61Var = (g61) abstractC0955y9;
            int i3 = g61Var.f1872i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g61Var.f1872i = i3 - Integer.MIN_VALUE;
            } else {
                g61Var = new g61(abstractC0955y9);
            }
        }
        Object objM3387a = g61Var.f1871h;
        int i4 = g61Var.f1872i;
        if (i4 == 0) {
            w60.m4891M(objM3387a);
            g61Var.f1870g = r51Var;
            g61Var.f1872i = 1;
            objM3387a = r51Var.m3387a(jr0.f2934e, g61Var);
            enumC1007zk = EnumC1007zk.f7916d;
            if (objM3387a == enumC1007zk) {
            }
            ir0 ir0Var = (ir0) objM3387a;
            List list = ir0Var.f2610a;
            size = list.size();
            i = 0;
            while (i2 < size) {
            }
            List list2 = ir0Var.f2610a;
            size2 = list2.size();
            while (i < size2) {
            }
            return na1.f4229a;
        }
        if (i4 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r51Var = g61Var.f1870g;
        w60.m4891M(objM3387a);
        ir0 ir0Var2 = (ir0) objM3387a;
        List list3 = ir0Var2.f2610a;
        size = list3.size();
        i = 0;
        for (i2 = 0; i2 < size; i2++) {
            ((nr0) list3.get(i2)).m2736a();
        }
        List list22 = ir0Var2.f2610a;
        size2 = list22.size();
        while (i < size2) {
            if (((nr0) list22.get(i)).f4308d) {
                g61Var.f1870g = r51Var;
                g61Var.f1872i = 1;
                objM3387a = r51Var.m3387a(jr0.f2934e, g61Var);
                enumC1007zk = EnumC1007zk.f7916d;
                if (objM3387a == enumC1007zk) {
                    return enumC1007zk;
                }
                ir0 ir0Var22 = (ir0) objM3387a;
                List list32 = ir0Var22.f2610a;
                size = list32.size();
                i = 0;
                while (i2 < size) {
                }
                List list222 = ir0Var22.f2610a;
                size2 = list222.size();
                while (i < size2) {
                }
            } else {
                i++;
            }
        }
        return na1.f4229a;
    }

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
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m2438b(p000.r51 r5, boolean r6, p000.jr0 r7, p000.AbstractC0955y9 r8) {
        /*
            boolean r0 = r8 instanceof p000.e61
            if (r0 == 0) goto L13
            r0 = r8
            e61 r0 = (p000.e61) r0
            int r1 = r0.f1309k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1309k = r1
            goto L18
        L13:
            e61 r0 = new e61
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f1308j
            int r1 = r0.f1309k
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.f1307i
            jr0 r6 = r0.f1306h
            r51 r7 = r0.f1305g
            p000.w60.m4891M(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0921xc.m5134o(r5)
            r5 = 0
            return r5
        L36:
            p000.w60.m4891M(r8)
        L39:
            r0.f1305g = r5
            r0.f1306h = r7
            r0.f1307i = r6
            r0.f1309k = r2
            java.lang.Object r8 = r5.m3387a(r7, r0)
            zk r1 = p000.EnumC1007zk.f7916d
            if (r8 != r1) goto L4a
            return r1
        L4a:
            ir0 r8 = (p000.ir0) r8
            boolean r1 = m2440d(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.f2610a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m61.m2438b(r51, boolean, jr0, y9):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2440d(ir0 ir0Var, boolean z) {
        List list = ir0Var.f2610a;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean zM4902i = true;
            if (i >= size) {
                return true;
            }
            nr0 nr0Var = (nr0) list.get(i);
            if (!z) {
                zM4902i = w60.m4902i(nr0Var);
            } else if (nr0Var.m2737b() || nr0Var.f4312h || !nr0Var.f4308d) {
                zM4902i = false;
            }
            if (!zM4902i) {
                return false;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static r31 m2441e(InterfaceC0966yk interfaceC0966yk, c40 c40Var, InterfaceC0904ww interfaceC0904ww) {
        return AbstractC0307i4.m1547w(interfaceC0966yk, null, new C0302i(c40Var, interfaceC0904ww, null, 12), 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2442f(r51 r51Var, jr0 jr0Var, AbstractC0955y9 abstractC0955y9) {
        k61 k61Var;
        zt0 zt0Var;
        if (abstractC0955y9 instanceof k61) {
            k61Var = (k61) abstractC0955y9;
            int i = k61Var.f3031i;
            if ((i & Integer.MIN_VALUE) != 0) {
                k61Var.f3031i = i - Integer.MIN_VALUE;
            } else {
                k61Var = new k61(abstractC0955y9);
            }
        }
        Object obj = k61Var.f3030h;
        int i2 = k61Var.f3031i;
        InterfaceC0322ik interfaceC0322ik = null;
        try {
            if (i2 == 0) {
                w60.m4891M(obj);
                zt0 zt0Var2 = new zt0();
                zt0Var2.f7995d = pb0.f4800a;
                long jMo2690c = r51Var.m3389f().mo2690c();
                InterfaceC0904ww c0187ew = new C0187ew(jr0Var, zt0Var2, interfaceC0322ik, 2);
                k61Var.f3029g = zt0Var2;
                k61Var.f3031i = 1;
                Object objM3390l = r51Var.m3390l(jMo2690c, c0187ew, k61Var);
                Object obj2 = EnumC1007zk.f7916d;
                if (objM3390l == obj2) {
                    return obj2;
                }
                zt0Var = zt0Var2;
            } else {
                if (i2 != 1) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zt0Var = k61Var.f3029g;
                w60.m4891M(obj);
            }
            return zt0Var.f7995d;
        } catch (kr0 unused) {
            return rb0.f5347a;
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
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2443g(r51 r51Var, jr0 jr0Var, AbstractC0955y9 abstractC0955y9) {
        l61 l61Var;
        r51 r51Var2;
        l61 l61Var2;
        jr0 jr0Var2;
        r51 r51Var3;
        jr0 jr0Var3;
        int size;
        int i;
        Object objM3387a;
        if (abstractC0955y9 instanceof l61) {
            l61Var = (l61) abstractC0955y9;
            int i2 = l61Var.f3368j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l61Var.f3368j = i2 - Integer.MIN_VALUE;
            } else {
                l61Var = new l61(abstractC0955y9);
            }
        }
        Object objM3387a2 = l61Var.f3367i;
        int i3 = l61Var.f3368j;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i3 == 0) {
            w60.m4891M(objM3387a2);
            r51Var2 = r51Var;
            l61Var2 = l61Var;
            jr0Var2 = jr0Var;
            l61Var2.f3365g = r51Var2;
            l61Var2.f3366h = jr0Var2;
            l61Var2.f3368j = 1;
            objM3387a = r51Var2.m3387a(jr0Var2, l61Var2);
            if (objM3387a != enumC1007zk) {
            }
            return enumC1007zk;
        }
        if (i3 == 1) {
            jr0Var3 = l61Var.f3366h;
            r51Var3 = l61Var.f3365g;
            w60.m4891M(objM3387a2);
            List list = ((ir0) objM3387a2).f2610a;
            size = list.size();
            while (i < size) {
            }
            return list.get(0);
        }
        if (i3 != 2) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jr0Var3 = l61Var.f3366h;
        r51Var3 = l61Var.f3365g;
        w60.m4891M(objM3387a2);
        jr0 jr0Var4 = jr0Var3;
        l61Var2 = l61Var;
        jr0Var2 = jr0Var4;
        List list2 = ((ir0) objM3387a2).f2610a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (((nr0) list2.get(i4)).m2737b()) {
                break;
            }
        }
        r51Var2 = r51Var3;
        l61Var2.f3365g = r51Var2;
        l61Var2.f3366h = jr0Var2;
        l61Var2.f3368j = 1;
        objM3387a = r51Var2.m3387a(jr0Var2, l61Var2);
        if (objM3387a != enumC1007zk) {
            r51Var3 = r51Var2;
            objM3387a2 = objM3387a;
            l61 l61Var3 = l61Var2;
            jr0Var3 = jr0Var2;
            l61Var = l61Var3;
            List list3 = ((ir0) objM3387a2).f2610a;
            size = list3.size();
            for (i = 0; i < size; i++) {
                if (!w60.m4903j((nr0) list3.get(i))) {
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        nr0 nr0Var = (nr0) list3.get(i5);
                        if (nr0Var.m2737b() || w60.m4879A(nr0Var, r51Var3.f5302i.f5645A, r51Var3.m3388d())) {
                            break;
                        }
                    }
                    l61Var.f3365g = r51Var3;
                    l61Var.f3366h = jr0Var3;
                    l61Var.f3368j = 2;
                    objM3387a2 = r51Var3.m3387a(jr0.f2935f, l61Var);
                }
            }
            return list3.get(0);
        }
        return enumC1007zk;
    }
}

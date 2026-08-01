package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class f11 extends AbstractC0451m0 implements InterfaceC0296hu, InterfaceC0331iu, InterfaceC0334ix {

    /* JADX INFO: renamed from: h */
    public final int f1556h;

    /* JADX INFO: renamed from: i */
    public final int f1557i;

    /* JADX INFO: renamed from: j */
    public final EnumC0758tb f1558j;

    /* JADX INFO: renamed from: k */
    public Object[] f1559k;

    /* JADX INFO: renamed from: l */
    public long f1560l;

    /* JADX INFO: renamed from: m */
    public long f1561m;

    /* JADX INFO: renamed from: n */
    public int f1562n;

    /* JADX INFO: renamed from: o */
    public int f1563o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f11(int i, int i2, EnumC0758tb enumC0758tb) {
        this.f1556h = i;
        this.f1557i = i2;
        this.f1558j = enumC0758tb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0036 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x001e */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|51|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|53|25|26))(1:29)|55|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [iu] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [m0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [f11] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [iu] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [n0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [g11] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [g11] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m980k(f11 f11Var, InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        e11 e11Var;
        ?? r4;
        ?? r10;
        f11 f11Var2;
        c40 c40Var;
        c40 c40Var2;
        ?? r1;
        Object objM994t;
        C1014zr c1014zr;
        EnumC1007zk enumC1007zk;
        ?? r102;
        ?? r9;
        ?? r8;
        if (interfaceC0322ik instanceof e11) {
            e11Var = (e11) interfaceC0322ik;
            int i = e11Var.f1266m;
            if ((i & Integer.MIN_VALUE) != 0) {
                e11Var.f1266m = i - Integer.MIN_VALUE;
            } else {
                e11Var = new e11(f11Var, interfaceC0322ik);
            }
        }
        Object obj = e11Var.f1264k;
        int i2 = e11Var.f1266m;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            w60.m4891M(obj);
            r10 = interfaceC0331iu;
            interfaceC0331iu = (g11) f11Var.m2099a();
            f11Var2 = f11Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    c40Var2 = e11Var.f1263j;
                    g11 g11Var = e11Var.f1262i;
                    InterfaceC0331iu interfaceC0331iu2 = e11Var.f1261h;
                    f11 f11Var3 = e11Var.f1260g;
                    w60.m4891M(obj);
                    r1 = interfaceC0331iu2;
                    r4 = f11Var3;
                    interfaceC0331iu = g11Var;
                    do {
                        objM994t = r4.m994t(interfaceC0331iu);
                        c1014zr = AbstractC0398kl.f3211v;
                        enumC1007zk = EnumC1007zk.f7916d;
                        if (objM994t == c1014zr) {
                        }
                        r4.m2100g(interfaceC0331iu);
                        throw th;
                    } while (r4.m984i(interfaceC0331iu, e11Var) != enumC1007zk);
                }
                if (i2 != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                c40Var2 = e11Var.f1263j;
                g11 g11Var2 = e11Var.f1262i;
                InterfaceC0331iu interfaceC0331iu3 = e11Var.f1261h;
                f11 f11Var4 = e11Var.f1260g;
                w60.m4891M(obj);
                ?? r12 = interfaceC0331iu3;
                ?? r42 = f11Var4;
                ?? r92 = g11Var2;
                r102 = r12;
                c40Var = c40Var2;
                r8 = r42;
                r9 = r92;
                r4 = r8;
                c40Var2 = c40Var;
                r1 = r102;
                interfaceC0331iu = r9;
                do {
                    objM994t = r4.m994t(interfaceC0331iu);
                    c1014zr = AbstractC0398kl.f3211v;
                    enumC1007zk = EnumC1007zk.f7916d;
                    if (objM994t == c1014zr) {
                        if (c40Var2 != null && !c40Var2.mo479b()) {
                            throw c40Var2.mo481o();
                        }
                        e11Var.f1260g = r4;
                        e11Var.f1261h = r1;
                        e11Var.f1262i = interfaceC0331iu;
                        e11Var.f1263j = c40Var2;
                        e11Var.f1266m = 3;
                        Object objMo827f = r1.mo827f(objM994t, e11Var);
                        r12 = r1;
                        r42 = r4;
                        r92 = interfaceC0331iu;
                        if (objMo827f == enumC1007zk) {
                            return;
                        }
                        r102 = r12;
                        c40Var = c40Var2;
                        r8 = r42;
                        r9 = r92;
                        r4 = r8;
                        c40Var2 = c40Var;
                        r1 = r102;
                        interfaceC0331iu = r9;
                        objM994t = r4.m994t(interfaceC0331iu);
                        c1014zr = AbstractC0398kl.f3211v;
                        enumC1007zk = EnumC1007zk.f7916d;
                        if (objM994t == c1014zr) {
                            e11Var.f1260g = r4;
                            e11Var.f1261h = r1;
                            e11Var.f1262i = interfaceC0331iu;
                            e11Var.f1263j = c40Var2;
                            e11Var.f1266m = 2;
                        }
                    }
                    r4.m2100g(interfaceC0331iu);
                    throw th;
                } while (r4.m984i(interfaceC0331iu, e11Var) != enumC1007zk);
            }
            interfaceC0331iu = e11Var.f1262i;
            InterfaceC0331iu interfaceC0331iu4 = e11Var.f1261h;
            f11 f11Var5 = e11Var.f1260g;
            try {
                w60.m4891M(obj);
                r10 = interfaceC0331iu4;
                f11Var2 = f11Var5;
                interfaceC0331iu = interfaceC0331iu;
            } catch (Throwable th2) {
                th = th2;
                r4 = f11Var5;
            }
        }
        c40Var = (c40) e11Var.mo540e().mo64l(C0496n2.f4129I);
        r8 = f11Var2;
        r9 = interfaceC0331iu;
        r102 = r10;
        r4 = r8;
        c40Var2 = c40Var;
        r1 = r102;
        interfaceC0331iu = r9;
        do {
            objM994t = r4.m994t(interfaceC0331iu);
            c1014zr = AbstractC0398kl.f3211v;
            enumC1007zk = EnumC1007zk.f7916d;
            if (objM994t == c1014zr) {
            }
            r4.m2100g(interfaceC0331iu);
            throw th;
        } while (r4.m984i(interfaceC0331iu, e11Var) != enumC1007zk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    public final Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        m980k(this, interfaceC0331iu, interfaceC0322ik);
        return EnumC1007zk.f7916d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0334ix
    /* JADX INFO: renamed from: c */
    public final InterfaceC0296hu mo981c(InterfaceC0618pk interfaceC0618pk, int i, EnumC0758tb enumC0758tb) {
        return ((i == 0 || i == -3) && enumC0758tb == EnumC0758tb.f5968d) ? this : new C0611pd(this, interfaceC0618pk, i, enumC0758tb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0451m0
    /* JADX INFO: renamed from: d */
    public final AbstractC0494n0 mo982d() {
        g11 g11Var = new g11();
        g11Var.f1841a = -1L;
        return g11Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0451m0
    /* JADX INFO: renamed from: e */
    public final AbstractC0494n0[] mo983e() {
        return new g11[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        f11 f11Var;
        Throwable th;
        InterfaceC0322ik[] interfaceC0322ikArrM988n;
        d11 d11Var;
        Object objM4990t;
        EnumC1007zk enumC1007zk;
        if (m991q(obj)) {
            return na1.f4229a;
        }
        int i = 1;
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(interfaceC0322ik));
        c0884wc.m4992v();
        InterfaceC0322ik[] interfaceC0322ikArrM988n2 = AbstractC0307i4.f2420a;
        synchronized (this) {
            try {
                if (m992r(obj)) {
                    try {
                        c0884wc.mo541i(na1.f4229a);
                        interfaceC0322ikArrM988n = m988n(interfaceC0322ikArrM988n2);
                        d11Var = null;
                        f11Var = this;
                        if (d11Var != null) {
                            c0884wc.m4995z(new C0684rc(i, d11Var));
                        }
                        for (InterfaceC0322ik interfaceC0322ik2 : interfaceC0322ikArrM988n) {
                            if (interfaceC0322ik2 != null) {
                                interfaceC0322ik2.mo541i(na1.f4229a);
                            }
                        }
                        objM4990t = c0884wc.m4990t();
                        enumC1007zk = EnumC1007zk.f7916d;
                        if (objM4990t != enumC1007zk) {
                            objM4990t = na1.f4229a;
                        }
                        return objM4990t != enumC1007zk ? objM4990t : na1.f4229a;
                    } catch (Throwable th2) {
                        th = th2;
                        f11Var = this;
                    }
                } else {
                    try {
                        f11Var = this;
                        try {
                            d11 d11Var2 = new d11(f11Var, m989o() + ((long) (this.f1562n + this.f1563o)), obj, c0884wc);
                            f11Var.m987m(d11Var2);
                            f11Var.f1563o++;
                            if (f11Var.f1557i == 0) {
                                interfaceC0322ikArrM988n2 = f11Var.m988n(interfaceC0322ikArrM988n2);
                            }
                            interfaceC0322ikArrM988n = interfaceC0322ikArrM988n2;
                            d11Var = d11Var2;
                            if (d11Var != null) {
                            }
                            while (i < r7) {
                            }
                            objM4990t = c0884wc.m4990t();
                            enumC1007zk = EnumC1007zk.f7916d;
                            if (objM4990t != enumC1007zk) {
                            }
                            if (objM4990t != enumC1007zk) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        f11Var = this;
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                f11Var = this;
            }
            th = th;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m984i(g11 g11Var, e11 e11Var) {
        C0884wc c0884wc = new C0884wc(1, rd0.m3497z(e11Var));
        c0884wc.m4992v();
        synchronized (this) {
            try {
                if (m993s(g11Var) < 0) {
                    g11Var.f1842b = c0884wc;
                } else {
                    c0884wc.mo541i(na1.f4229a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM4990t = c0884wc.m4990t();
        return objM4990t == EnumC1007zk.f7916d ? objM4990t : na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m985j() {
        if (this.f1557i != 0 || this.f1563o > 1) {
            Object[] objArr = this.f1559k;
            objArr.getClass();
            while (this.f1563o > 0) {
                long jM989o = m989o();
                int i = this.f1562n;
                int i2 = this.f1563o;
                if (objArr[((int) ((jM989o + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != AbstractC0398kl.f3211v) {
                    return;
                }
                this.f1563o = i2 - 1;
                AbstractC0398kl.m1919e(objArr, m989o() + ((long) (this.f1562n + this.f1563o)), null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m986l() {
        AbstractC0494n0[] abstractC0494n0Arr;
        Object[] objArr = this.f1559k;
        objArr.getClass();
        AbstractC0398kl.m1919e(objArr, m989o(), null);
        this.f1562n--;
        long jM989o = m989o() + 1;
        if (this.f1560l < jM989o) {
            this.f1560l = jM989o;
        }
        if (this.f1561m < jM989o) {
            if (this.f3637e != 0 && (abstractC0494n0Arr = this.f3636d) != null) {
                for (AbstractC0494n0 abstractC0494n0 : abstractC0494n0Arr) {
                    if (abstractC0494n0 != null) {
                        g11 g11Var = (g11) abstractC0494n0;
                        long j = g11Var.f1841a;
                        if (j >= 0 && j < jM989o) {
                            g11Var.f1841a = jM989o;
                        }
                    }
                }
            }
            this.f1561m = jM989o;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m987m(Object obj) {
        int i = this.f1562n + this.f1563o;
        Object[] objArrM990p = this.f1559k;
        if (objArrM990p == null) {
            objArrM990p = m990p(null, 0, 2);
        } else if (i >= objArrM990p.length) {
            objArrM990p = m990p(objArrM990p, i, objArrM990p.length * 2);
        }
        AbstractC0398kl.m1919e(objArrM990p, m989o() + ((long) i), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x003b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ik[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: n */
    public final InterfaceC0322ik[] m988n(InterfaceC0322ik[] interfaceC0322ikArr) {
        AbstractC0494n0[] abstractC0494n0Arr;
        g11 g11Var;
        C0884wc c0884wc;
        int length = interfaceC0322ikArr.length;
        if (this.f3637e != 0 && (abstractC0494n0Arr = this.f3636d) != null) {
            int length2 = abstractC0494n0Arr.length;
            int i = 0;
            interfaceC0322ikArr = interfaceC0322ikArr;
            while (i < length2) {
                AbstractC0494n0 abstractC0494n0 = abstractC0494n0Arr[i];
                if (abstractC0494n0 != null && (c0884wc = (g11Var = (g11) abstractC0494n0).f1842b) != null && m993s(g11Var) >= 0) {
                    int length3 = interfaceC0322ikArr.length;
                    interfaceC0322ikArr = interfaceC0322ikArr;
                    if (length >= length3) {
                        interfaceC0322ikArr = Arrays.copyOf((Object[]) interfaceC0322ikArr, Math.max(2, interfaceC0322ikArr.length * 2));
                    }
                    ((InterfaceC0322ik[]) interfaceC0322ikArr)[length] = c0884wc;
                    g11Var.f1842b = null;
                    length++;
                }
                i++;
                interfaceC0322ikArr = interfaceC0322ikArr;
            }
        }
        return (InterfaceC0322ik[]) interfaceC0322ikArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final long m989o() {
        return Math.min(this.f1561m, this.f1560l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object[] m990p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            C0921xc.m5134o("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.f1559k = objArr2;
        if (objArr != null) {
            long jM989o = m989o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jM989o;
                AbstractC0398kl.m1919e(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m991q(Object obj) {
        int i;
        boolean z;
        InterfaceC0322ik[] interfaceC0322ikArrM988n = AbstractC0307i4.f2420a;
        synchronized (this) {
            if (m992r(obj)) {
                interfaceC0322ikArrM988n = m988n(interfaceC0322ikArrM988n);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC0322ik interfaceC0322ik : interfaceC0322ikArrM988n) {
            if (interfaceC0322ik != null) {
                interfaceC0322ik.mo541i(na1.f4229a);
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m992r(Object obj) {
        int i = this.f3637e;
        int i2 = this.f1556h;
        if (i != 0) {
            int i3 = this.f1562n;
            int i4 = this.f1557i;
            if (i3 < i4 || this.f1561m > this.f1560l) {
                m987m(obj);
                int i5 = this.f1562n + 1;
                this.f1562n = i5;
                if (i5 > i4) {
                    m986l();
                }
                long jM989o = m989o() + ((long) this.f1562n);
                long j = this.f1560l;
                if (((int) (jM989o - j)) > i2) {
                    m995u(1 + j, this.f1561m, m989o() + ((long) this.f1562n), m989o() + ((long) this.f1562n) + ((long) this.f1563o));
                }
            } else {
                int iOrdinal = this.f1558j.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0921xc.m5129j();
                        return false;
                    }
                }
            }
        } else if (i2 != 0) {
            m987m(obj);
            int i6 = this.f1562n + 1;
            this.f1562n = i6;
            if (i6 > i2) {
                m986l();
            }
            this.f1561m = m989o() + ((long) this.f1562n);
            return true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final long m993s(g11 g11Var) {
        long j = g11Var.f1841a;
        if (j >= m989o() + ((long) this.f1562n) && (this.f1557i > 0 || j > m989o() || this.f1563o == 0)) {
            return -1L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Object m994t(g11 g11Var) {
        Object obj;
        InterfaceC0322ik[] interfaceC0322ikArrM996v = AbstractC0307i4.f2420a;
        synchronized (this) {
            try {
                long jM993s = m993s(g11Var);
                if (jM993s < 0) {
                    obj = AbstractC0398kl.f3211v;
                } else {
                    long j = g11Var.f1841a;
                    Object[] objArr = this.f1559k;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jM993s) & (objArr.length - 1)];
                    if (obj2 instanceof d11) {
                        obj2 = ((d11) obj2).f928f;
                    }
                    g11Var.f1841a = jM993s + 1;
                    Object obj3 = obj2;
                    interfaceC0322ikArrM996v = m996v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0322ik interfaceC0322ik : interfaceC0322ikArrM996v) {
            if (interfaceC0322ik != null) {
                interfaceC0322ik.mo541i(na1.f4229a);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m995u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM989o = m989o(); jM989o < jMin; jM989o++) {
            Object[] objArr = this.f1559k;
            objArr.getClass();
            AbstractC0398kl.m1919e(objArr, jM989o, null);
        }
        this.f1560l = j;
        this.f1561m = j2;
        this.f1562n = (int) (j3 - jMin);
        this.f1563o = (int) (j4 - j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final InterfaceC0322ik[] m996v(long j) {
        long j2;
        long j3;
        long j4;
        InterfaceC0322ik[] interfaceC0322ikArr;
        InterfaceC0322ik[] interfaceC0322ikArr2;
        AbstractC0494n0[] abstractC0494n0Arr;
        C1014zr c1014zr = AbstractC0398kl.f3211v;
        InterfaceC0322ik[] interfaceC0322ikArr3 = AbstractC0307i4.f2420a;
        if (j <= this.f1561m) {
            long jM989o = m989o();
            long j5 = ((long) this.f1562n) + jM989o;
            int i = this.f1557i;
            if (i == 0 && this.f1563o > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.f3637e != 0 && (abstractC0494n0Arr = this.f3636d) != null) {
                for (AbstractC0494n0 abstractC0494n0 : abstractC0494n0Arr) {
                    if (abstractC0494n0 != null) {
                        long j6 = ((g11) abstractC0494n0).f1841a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.f1561m) {
                long jM989o2 = m989o() + ((long) this.f1562n);
                int i3 = this.f3637e;
                int iMin = this.f1563o;
                if (i3 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i - ((int) (jM989o2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.f1563o) + jM989o2;
                if (iMin > 0) {
                    Object[] objArr = this.f1559k;
                    objArr.getClass();
                    j3 = jM989o;
                    InterfaceC0322ik[] interfaceC0322ikArr4 = new InterfaceC0322ik[iMin];
                    long j8 = jM989o2;
                    while (true) {
                        if (jM989o2 >= j7) {
                            interfaceC0322ikArr2 = interfaceC0322ikArr4;
                            j4 = j5;
                            break;
                        }
                        interfaceC0322ikArr2 = interfaceC0322ikArr4;
                        Object obj = objArr[((int) jM989o2) & (objArr.length - 1)];
                        if (obj != c1014zr) {
                            obj.getClass();
                            d11 d11Var = (d11) obj;
                            j4 = j5;
                            int i4 = i2 + 1;
                            interfaceC0322ikArr2[i2] = d11Var.f929g;
                            AbstractC0398kl.m1919e(objArr, jM989o2, c1014zr);
                            AbstractC0398kl.m1919e(objArr, j8, d11Var.f928f);
                            j8 += j2;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j4 = j5;
                        }
                        jM989o2 += j2;
                        interfaceC0322ikArr4 = interfaceC0322ikArr2;
                        j5 = j4;
                    }
                    jM989o2 = j8;
                    interfaceC0322ikArr = interfaceC0322ikArr2;
                } else {
                    j3 = jM989o;
                    j4 = j5;
                    interfaceC0322ikArr = interfaceC0322ikArr3;
                }
                int i5 = (int) (jM989o2 - j3);
                long j9 = this.f3637e == 0 ? jM989o2 : j4;
                long jMax = Math.max(this.f1560l, jM989o2 - ((long) Math.min(this.f1556h, i5)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr2 = this.f1559k;
                    objArr2.getClass();
                    if (p30.m3002l(objArr2[((int) jMax) & (objArr2.length - 1)], c1014zr)) {
                        jM989o2 += j2;
                        jMax += j2;
                    }
                }
                m995u(jMax, j9, jM989o2, j7);
                m985j();
                return interfaceC0322ikArr.length == 0 ? interfaceC0322ikArr : m988n(interfaceC0322ikArr);
            }
        }
        return interfaceC0322ikArr3;
    }
}

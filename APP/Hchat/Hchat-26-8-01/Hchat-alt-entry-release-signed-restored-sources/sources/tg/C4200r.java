package tg;

import gg.AbstractC1416l;
import java.util.Arrays;
import okio.C3193a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p162l3.C2463q;
import p249qg.C3558e;
import p249qg.C3564g;
import p249qg.C3593q;
import p249qg.InterfaceC3596r0;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import sg.EnumC3969a;
import ug.AbstractC4337b;
import ug.AbstractC4338c;
import ug.AbstractC4339d;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4200r extends AbstractC4337b implements InterfaceC4196n, InterfaceC4186d {

    /* JADX INFO: renamed from: k */
    public final int f13780k;

    /* JADX INFO: renamed from: l */
    public final int f13781l;

    /* JADX INFO: renamed from: m */
    public final EnumC3969a f13782m;

    /* JADX INFO: renamed from: n */
    public Object[] f13783n;

    /* JADX INFO: renamed from: o */
    public long f13784o;

    /* JADX INFO: renamed from: p */
    public long f13785p;

    /* JADX INFO: renamed from: q */
    public int f13786q;

    /* JADX INFO: renamed from: r */
    public int f13787r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4200r(int i9, int i10, EnumC3969a enumC3969a) {
        this.f13780k = i9;
        this.f13781l = i10;
        this.f13782m = enumC3969a;
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
    /* JADX WARN: Type inference failed for: r1v4, types: [tg.e] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ug.b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [tg.r] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [tg.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ug.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [tg.t] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [tg.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8449j(C4200r c4200r, InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) throws Throwable {
        C4199q c4199q;
        ?? r42;
        ?? r10;
        C4200r c4200r2;
        InterfaceC3596r0 interfaceC3596r0;
        InterfaceC3596r0 interfaceC3596r02;
        ?? r12;
        Object objM8460s;
        C2463q c2463q;
        EnumC5799a enumC5799a;
        ?? r102;
        ?? r92;
        ?? r82;
        if (interfaceC5557c instanceof C4199q) {
            c4199q = (C4199q) interfaceC5557c;
            int i9 = c4199q.f13779m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4199q.f13779m = i9 - Integer.MIN_VALUE;
            } else {
                c4199q = new C4199q(c4200r, interfaceC5557c);
            }
        }
        Object obj = c4199q.f13777k;
        int i10 = c4199q.f13779m;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            r10 = interfaceC4187e;
            interfaceC4187e = (C4202t) c4200r.m8790a();
            c4200r2 = c4200r;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    interfaceC3596r02 = c4199q.f13776j;
                    C4202t c4202t = c4199q.f13775i;
                    InterfaceC4187e interfaceC4187e2 = c4199q.f13774h;
                    C4200r c4200r3 = c4199q.f13773g;
                    AbstractC1089i.m2732I0(obj);
                    r12 = interfaceC4187e2;
                    r42 = c4200r3;
                    interfaceC4187e = c4202t;
                    do {
                        objM8460s = r42.m8460s(interfaceC4187e);
                        c2463q = AbstractC4201s.f13788a;
                        enumC5799a = EnumC5799a.f23547g;
                        if (objM8460s == c2463q) {
                        }
                        r42.m8791f(interfaceC4187e);
                        throw th;
                    } while (r42.m8450h(interfaceC4187e, c4199q) != enumC5799a);
                }
                if (i10 != 3) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                interfaceC3596r02 = c4199q.f13776j;
                C4202t c4202t2 = c4199q.f13775i;
                InterfaceC4187e interfaceC4187e3 = c4199q.f13774h;
                C4200r c4200r4 = c4199q.f13773g;
                AbstractC1089i.m2732I0(obj);
                ?? r13 = interfaceC4187e3;
                ?? r43 = c4200r4;
                ?? r93 = c4202t2;
                r102 = r13;
                interfaceC3596r0 = interfaceC3596r02;
                r82 = r43;
                r92 = r93;
                r42 = r82;
                interfaceC3596r02 = interfaceC3596r0;
                r12 = r102;
                interfaceC4187e = r92;
                do {
                    objM8460s = r42.m8460s(interfaceC4187e);
                    c2463q = AbstractC4201s.f13788a;
                    enumC5799a = EnumC5799a.f23547g;
                    if (objM8460s == c2463q) {
                        if (interfaceC3596r02 != null && !interfaceC3596r02.mo7486b()) {
                            throw interfaceC3596r02.mo7489h();
                        }
                        c4199q.f13773g = r42;
                        c4199q.f13774h = r12;
                        c4199q.f13775i = interfaceC4187e;
                        c4199q.f13776j = interfaceC3596r02;
                        c4199q.f13779m = 3;
                        Object objMo1602e = r12.mo1602e(objM8460s, c4199q);
                        r13 = r12;
                        r43 = r42;
                        r93 = interfaceC4187e;
                        if (objMo1602e == enumC5799a) {
                            return;
                        }
                        r102 = r13;
                        interfaceC3596r0 = interfaceC3596r02;
                        r82 = r43;
                        r92 = r93;
                        r42 = r82;
                        interfaceC3596r02 = interfaceC3596r0;
                        r12 = r102;
                        interfaceC4187e = r92;
                        objM8460s = r42.m8460s(interfaceC4187e);
                        c2463q = AbstractC4201s.f13788a;
                        enumC5799a = EnumC5799a.f23547g;
                        if (objM8460s == c2463q) {
                            c4199q.f13773g = r42;
                            c4199q.f13774h = r12;
                            c4199q.f13775i = interfaceC4187e;
                            c4199q.f13776j = interfaceC3596r02;
                            c4199q.f13779m = 2;
                        }
                    }
                    r42.m8791f(interfaceC4187e);
                    throw th;
                } while (r42.m8450h(interfaceC4187e, c4199q) != enumC5799a);
            }
            interfaceC4187e = c4199q.f13775i;
            InterfaceC4187e interfaceC4187e4 = c4199q.f13774h;
            C4200r c4200r5 = c4199q.f13773g;
            try {
                AbstractC1089i.m2732I0(obj);
                r10 = interfaceC4187e4;
                c4200r2 = c4200r5;
                interfaceC4187e = interfaceC4187e;
            } catch (Throwable th3) {
                th = th3;
                r42 = c4200r5;
            }
        }
        interfaceC3596r0 = (InterfaceC3596r0) c4199q.getContext().mo2062s(C3593q.f11607h);
        r82 = c4200r2;
        r92 = interfaceC4187e;
        r102 = r10;
        r42 = r82;
        interfaceC3596r02 = interfaceC3596r0;
        r12 = r102;
        interfaceC4187e = r92;
        do {
            objM8460s = r42.m8460s(interfaceC4187e);
            c2463q = AbstractC4201s.f13788a;
            enumC5799a = EnumC5799a.f23547g;
            if (objM8460s == c2463q) {
            }
            r42.m8791f(interfaceC4187e);
            throw th;
        } while (r42.m8450h(interfaceC4187e, c4199q) != enumC5799a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4186d
    /* JADX INFO: renamed from: b */
    public final Object mo6025b(InterfaceC4187e interfaceC4187e, InterfaceC5557c interfaceC5557c) throws Throwable {
        m8449j(this, interfaceC4187e, interfaceC5557c);
        return EnumC5799a.f23547g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4337b
    /* JADX INFO: renamed from: c */
    public final AbstractC4339d mo8444c() {
        C4202t c4202t = new C4202t();
        c4202t.f13791a = -1L;
        return c4202t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4337b
    /* JADX INFO: renamed from: d */
    public final AbstractC4339d[] mo8445d() {
        return new C4202t[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tg.InterfaceC4187e
    /* JADX INFO: renamed from: e */
    public final Object mo1602e(Object obj, InterfaceC5557c interfaceC5557c) throws Throwable {
        Throwable th2;
        InterfaceC5557c[] interfaceC5557cArrM8454m;
        C4198p c4198p;
        if (m8457p(obj)) {
            return C3967n.f12976a;
        }
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(interfaceC5557c));
        c3564g.m7513p();
        InterfaceC5557c[] interfaceC5557cArrM8454m2 = AbstractC4338c.f14499a;
        synchronized (this) {
            try {
                if (m8458q(obj)) {
                    try {
                        c3564g.resumeWith(C3967n.f12976a);
                        interfaceC5557cArrM8454m = m8454m(interfaceC5557cArrM8454m2);
                        c4198p = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        C4198p c4198p2 = new C4198p(this, m8455n() + ((long) (this.f13786q + this.f13787r)), obj, c3564g);
                        m8453l(c4198p2);
                        this.f13787r++;
                        if (this.f13781l == 0) {
                            interfaceC5557cArrM8454m2 = m8454m(interfaceC5557cArrM8454m2);
                        }
                        interfaceC5557cArrM8454m = interfaceC5557cArrM8454m2;
                        c4198p = c4198p2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (c4198p != null) {
                    c3564g.m7516s(new C3558e(c4198p, 1));
                }
                for (InterfaceC5557c interfaceC5557c2 : interfaceC5557cArrM8454m) {
                    if (interfaceC5557c2 != null) {
                        interfaceC5557c2.resumeWith(C3967n.f12976a);
                    }
                }
                Object objM7512o = c3564g.m7512o();
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM7512o != enumC5799a) {
                    objM7512o = C3967n.f12976a;
                }
                return objM7512o == enumC5799a ? objM7512o : C3967n.f12976a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m8450h(C4202t c4202t, C4199q c4199q) {
        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(c4199q));
        c3564g.m7513p();
        synchronized (this) {
            try {
                if (m8459r(c4202t) < 0) {
                    c4202t.f13792b = c3564g;
                } else {
                    c3564g.resumeWith(C3967n.f12976a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objM7512o = c3564g.m7512o();
        return objM7512o == EnumC5799a.f23547g ? objM7512o : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m8451i() {
        if (this.f13781l != 0 || this.f13787r > 1) {
            Object[] objArr = this.f13783n;
            objArr.getClass();
            while (this.f13787r > 0) {
                long jM8455n = m8455n();
                int i9 = this.f13786q;
                int i10 = this.f13787r;
                if (objArr[((int) ((jM8455n + ((long) (i9 + i10))) - 1)) & (objArr.length - 1)] != AbstractC4201s.f13788a) {
                    return;
                }
                this.f13787r = i10 - 1;
                AbstractC4201s.m8465c(objArr, m8455n() + ((long) (this.f13786q + this.f13787r)), null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m8452k() {
        AbstractC4339d[] abstractC4339dArr;
        Object[] objArr = this.f13783n;
        objArr.getClass();
        AbstractC4201s.m8465c(objArr, m8455n(), null);
        this.f13786q--;
        long jM8455n = m8455n() + 1;
        if (this.f13784o < jM8455n) {
            this.f13784o = jM8455n;
        }
        if (this.f13785p < jM8455n) {
            if (this.f14496h != 0 && (abstractC4339dArr = this.f14495g) != null) {
                for (AbstractC4339d abstractC4339d : abstractC4339dArr) {
                    if (abstractC4339d != null) {
                        C4202t c4202t = (C4202t) abstractC4339d;
                        long j3 = c4202t.f13791a;
                        if (j3 >= 0 && j3 < jM8455n) {
                            c4202t.f13791a = jM8455n;
                        }
                    }
                }
            }
            this.f13785p = jM8455n;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8453l(Object obj) {
        int i9 = this.f13786q + this.f13787r;
        Object[] objArrM8456o = this.f13783n;
        if (objArrM8456o == null) {
            objArrM8456o = m8456o(null, 0, 2);
        } else if (i9 >= objArrM8456o.length) {
            objArrM8456o = m8456o(objArrM8456o, i9, objArrM8456o.length * 2);
        }
        AbstractC4201s.m8465c(objArrM8456o, m8455n() + ((long) i9), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x003e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x003b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [wf.c[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: m */
    public final InterfaceC5557c[] m8454m(InterfaceC5557c[] interfaceC5557cArr) {
        AbstractC4339d[] abstractC4339dArr;
        C4202t c4202t;
        C3564g c3564g;
        int length = interfaceC5557cArr.length;
        if (this.f14496h != 0 && (abstractC4339dArr = this.f14495g) != null) {
            int length2 = abstractC4339dArr.length;
            int i9 = 0;
            interfaceC5557cArr = interfaceC5557cArr;
            while (i9 < length2) {
                AbstractC4339d abstractC4339d = abstractC4339dArr[i9];
                if (abstractC4339d != null && (c3564g = (c4202t = (C4202t) abstractC4339d).f13792b) != null && m8459r(c4202t) >= 0) {
                    int length3 = interfaceC5557cArr.length;
                    interfaceC5557cArr = interfaceC5557cArr;
                    if (length >= length3) {
                        interfaceC5557cArr = Arrays.copyOf((Object[]) interfaceC5557cArr, Math.max(2, interfaceC5557cArr.length * 2));
                    }
                    ((InterfaceC5557c[]) interfaceC5557cArr)[length] = c3564g;
                    c4202t.f13792b = null;
                    length++;
                }
                i9++;
                interfaceC5557cArr = interfaceC5557cArr;
            }
        }
        return (InterfaceC5557c[]) interfaceC5557cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final long m8455n() {
        return Math.min(this.f13785p, this.f13784o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final Object[] m8456o(Object[] objArr, int i9, int i10) {
        if (i10 <= 0) {
            C2104o.m5276A("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i10];
        this.f13783n = objArr2;
        if (objArr != null) {
            long jM8455n = m8455n();
            for (int i11 = 0; i11 < i9; i11++) {
                long j3 = ((long) i11) + jM8455n;
                AbstractC4201s.m8465c(objArr2, j3, objArr[((int) j3) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m8457p(Object obj) {
        int i9;
        boolean z9;
        InterfaceC5557c[] interfaceC5557cArrM8454m = AbstractC4338c.f14499a;
        synchronized (this) {
            if (m8458q(obj)) {
                interfaceC5557cArrM8454m = m8454m(interfaceC5557cArrM8454m);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (InterfaceC5557c interfaceC5557c : interfaceC5557cArrM8454m) {
            if (interfaceC5557c != null) {
                interfaceC5557c.resumeWith(C3967n.f12976a);
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8458q(Object obj) {
        int i9 = this.f14496h;
        int i10 = this.f13780k;
        if (i9 != 0) {
            int i11 = this.f13786q;
            int i12 = this.f13781l;
            if (i11 < i12 || this.f13785p > this.f13784o) {
                m8453l(obj);
                int i13 = this.f13786q + 1;
                this.f13786q = i13;
                if (i13 > i12) {
                    m8452k();
                }
                long jM8455n = m8455n() + ((long) this.f13786q);
                long j3 = this.f13784o;
                if (((int) (jM8455n - j3)) > i10) {
                    m8461t(1 + j3, this.f13785p, m8455n() + ((long) this.f13786q), m8455n() + ((long) this.f13786q) + ((long) this.f13787r));
                }
            } else {
                int iOrdinal = this.f13782m.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C3193a.m6822k();
                        return false;
                    }
                }
            }
        } else if (i10 != 0) {
            m8453l(obj);
            int i14 = this.f13786q + 1;
            this.f13786q = i14;
            if (i14 > i10) {
                m8452k();
            }
            this.f13785p = m8455n() + ((long) this.f13786q);
            return true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final long m8459r(C4202t c4202t) {
        long j3 = c4202t.f13791a;
        if (j3 < m8455n() + ((long) this.f13786q)) {
            return j3;
        }
        if (this.f13781l <= 0 && j3 <= m8455n() && this.f13787r != 0) {
            return j3;
        }
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final Object m8460s(C4202t c4202t) {
        Object obj;
        InterfaceC5557c[] interfaceC5557cArrM8462u = AbstractC4338c.f14499a;
        synchronized (this) {
            try {
                long jM8459r = m8459r(c4202t);
                if (jM8459r < 0) {
                    obj = AbstractC4201s.f13788a;
                } else {
                    long j3 = c4202t.f13791a;
                    Object[] objArr = this.f13783n;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jM8459r) & (objArr.length - 1)];
                    if (obj2 instanceof C4198p) {
                        obj2 = ((C4198p) obj2).f13771i;
                    }
                    c4202t.f13791a = jM8459r + 1;
                    Object obj3 = obj2;
                    interfaceC5557cArrM8462u = m8462u(j3);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC5557c interfaceC5557c : interfaceC5557cArrM8462u) {
            if (interfaceC5557c != null) {
                interfaceC5557c.resumeWith(C3967n.f12976a);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m8461t(long j3, long j4, long j5, long j10) {
        long jMin = Math.min(j4, j3);
        for (long jM8455n = m8455n(); jM8455n < jMin; jM8455n++) {
            Object[] objArr = this.f13783n;
            objArr.getClass();
            AbstractC4201s.m8465c(objArr, jM8455n, null);
        }
        this.f13784o = j3;
        this.f13785p = j4;
        this.f13786q = (int) (j5 - jMin);
        this.f13787r = (int) (j10 - j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final InterfaceC5557c[] m8462u(long j3) {
        long j4;
        long j5;
        long j10;
        InterfaceC5557c[] interfaceC5557cArr;
        InterfaceC5557c[] interfaceC5557cArr2;
        AbstractC4339d[] abstractC4339dArr;
        C2463q c2463q = AbstractC4201s.f13788a;
        InterfaceC5557c[] interfaceC5557cArr3 = AbstractC4338c.f14499a;
        if (j3 <= this.f13785p) {
            long jM8455n = m8455n();
            long j11 = ((long) this.f13786q) + jM8455n;
            int i9 = this.f13781l;
            if (i9 == 0 && this.f13787r > 0) {
                j11++;
            }
            int i10 = 0;
            if (this.f14496h != 0 && (abstractC4339dArr = this.f14495g) != null) {
                for (AbstractC4339d abstractC4339d : abstractC4339dArr) {
                    if (abstractC4339d != null) {
                        long j12 = ((C4202t) abstractC4339d).f13791a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.f13785p) {
                long jM8455n2 = m8455n() + ((long) this.f13786q);
                int i11 = this.f14496h;
                int iMin = this.f13787r;
                if (i11 > 0) {
                    j4 = 1;
                    iMin = Math.min(iMin, i9 - ((int) (jM8455n2 - j11)));
                } else {
                    j4 = 1;
                }
                long j13 = ((long) this.f13787r) + jM8455n2;
                if (iMin > 0) {
                    Object[] objArr = this.f13783n;
                    objArr.getClass();
                    j5 = jM8455n;
                    InterfaceC5557c[] interfaceC5557cArr4 = new InterfaceC5557c[iMin];
                    long j14 = jM8455n2;
                    while (true) {
                        if (jM8455n2 >= j13) {
                            interfaceC5557cArr2 = interfaceC5557cArr4;
                            j10 = j11;
                            break;
                        }
                        interfaceC5557cArr2 = interfaceC5557cArr4;
                        Object obj = objArr[((int) jM8455n2) & (objArr.length - 1)];
                        if (obj != c2463q) {
                            obj.getClass();
                            C4198p c4198p = (C4198p) obj;
                            j10 = j11;
                            int i12 = i10 + 1;
                            interfaceC5557cArr2[i10] = c4198p.f13772j;
                            AbstractC4201s.m8465c(objArr, jM8455n2, c2463q);
                            AbstractC4201s.m8465c(objArr, j14, c4198p.f13771i);
                            j14 += j4;
                            if (i12 >= iMin) {
                                break;
                            }
                            i10 = i12;
                        } else {
                            j10 = j11;
                        }
                        jM8455n2 += j4;
                        interfaceC5557cArr4 = interfaceC5557cArr2;
                        j11 = j10;
                    }
                    jM8455n2 = j14;
                    interfaceC5557cArr = interfaceC5557cArr2;
                } else {
                    j5 = jM8455n;
                    j10 = j11;
                    interfaceC5557cArr = interfaceC5557cArr3;
                }
                int i13 = (int) (jM8455n2 - j5);
                long j15 = this.f14496h == 0 ? jM8455n2 : j10;
                long jMax = Math.max(this.f13784o, jM8455n2 - ((long) Math.min(this.f13780k, i13)));
                if (i9 == 0 && jMax < j13) {
                    Object[] objArr2 = this.f13783n;
                    objArr2.getClass();
                    if (AbstractC1416l.m3825a(objArr2[((int) jMax) & (objArr2.length - 1)], c2463q)) {
                        jM8455n2 += j4;
                        jMax += j4;
                    }
                }
                m8461t(jMax, j15, jM8455n2, j13);
                m8451i();
                return interfaceC5557cArr.length == 0 ? interfaceC5557cArr : m8454m(interfaceC5557cArr);
            }
        }
        return interfaceC5557cArr3;
    }
}

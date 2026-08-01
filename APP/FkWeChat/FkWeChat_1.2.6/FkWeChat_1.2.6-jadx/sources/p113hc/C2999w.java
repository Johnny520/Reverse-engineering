package p113hc;

import ec.AbstractC2172q;
import ec.C2164o;
import ec.InterfaceC2126e1;
import java.util.Arrays;
import p099gc.EnumC2732a;
import p130ic.AbstractC3384b;
import p130ic.AbstractC3385c;
import p130ic.AbstractC3386d;
import p130ic.InterfaceC3395m;
import p172l8.C4700i0;
import p172l8.C4712s;
import p215oc.C5729x;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;
import p376zd.C10010p0;

/* JADX INFO: renamed from: hc.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2999w extends AbstractC3384b implements InterfaceC2994r, InterfaceC2972c, InterfaceC3395m {

    /* JADX INFO: renamed from: A */
    public int f7945A;

    /* JADX INFO: renamed from: B */
    public int f7946B;

    /* JADX INFO: renamed from: u */
    public final int f7947u;

    /* JADX INFO: renamed from: v */
    public final int f7948v;

    /* JADX INFO: renamed from: w */
    public final EnumC2732a f7949w;

    /* JADX INFO: renamed from: x */
    public Object[] f7950x;

    /* JADX INFO: renamed from: y */
    public long f7951y;

    /* JADX INFO: renamed from: z */
    public long f7952z;

    /* JADX INFO: renamed from: hc.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2126e1 {

        /* JADX INFO: renamed from: q */
        public final C2999w f7953q;

        /* JADX INFO: renamed from: r */
        public long f7954r;

        /* JADX INFO: renamed from: s */
        public final Object f7955s;

        /* JADX INFO: renamed from: t */
        public final InterfaceC5976f f7956t;

        public a(C2999w c2999w, long j10, Object obj, InterfaceC5976f interfaceC5976f) {
            this.f7953q = c2999w;
            this.f7954r = j10;
            this.f7955s = obj;
            this.f7956t = interfaceC5976f;
        }

        @Override // ec.InterfaceC2126e1
        /* JADX INFO: renamed from: a */
        public void mo7628a() {
            this.f7953q.m11062A(this);
        }
    }

    /* JADX INFO: renamed from: hc.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7957a;

        static {
            int[] iArr = new int[EnumC2732a.values().length];
            try {
                iArr[EnumC2732a.f7138q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2732a.f7140s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2732a.f7139r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7957a = iArr;
        }
    }

    /* JADX INFO: renamed from: hc.w$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7958q;

        /* JADX INFO: renamed from: r */
        public Object f7959r;

        /* JADX INFO: renamed from: s */
        public Object f7960s;

        /* JADX INFO: renamed from: t */
        public Object f7961t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f7962u;

        /* JADX INFO: renamed from: w */
        public int f7964w;

        public c(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7962u = obj;
            this.f7964w |= Integer.MIN_VALUE;
            return C2999w.m11050C(C2999w.this, null, this);
        }
    }

    public C2999w(int i10, int i11, EnumC2732a enumC2732a) {
        this.f7947u = i10;
        this.f7948v = i11;
        this.f7949w = enumC2732a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        ec.AbstractC2210z1.m7958k(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        r0.f7958q = r5;
        r0.f7959r = r2;
        r0.f7960s = r9;
        r0.f7961t = r8;
        r0.f7964w = 3;
        r10 = r2.mo400a(r10, r0);
        r2 = r2;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r10 != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0091, B:34:0x0099, B:38:0x00ac, B:39:0x00af, B:22:0x005c), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[EDGE_INSN: B:52:0x00aa->B:37:0x00aa BREAK  A[LOOP:0: B:32:0x0091->B:55:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v4, types: [hc.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ic.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [hc.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [hc.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ic.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [hc.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9, types: [hc.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bd -> B:16:0x003e). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object m11050C(p113hc.C2999w r8, p113hc.InterfaceC2974d r9, p228p8.InterfaceC5976f r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof p113hc.C2999w.c
            if (r0 == 0) goto L13
            r0 = r10
            hc.w$c r0 = (p113hc.C2999w.c) r0
            int r1 = r0.f7964w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7964w = r1
            goto L18
        L13:
            hc.w$c r0 = new hc.w$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7962u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7964w
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L76
            r8 = 1
            if (r2 == r8) goto L60
            if (r2 == r4) goto L4c
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f7961t
            ec.w1 r8 = (ec.InterfaceC2198w1) r8
            java.lang.Object r9 = r0.f7960s
            hc.y r9 = (p113hc.C3001y) r9
            java.lang.Object r2 = r0.f7959r
            hc.d r2 = (p113hc.InterfaceC2974d) r2
            java.lang.Object r5 = r0.f7958q
            hc.w r5 = (p113hc.C2999w) r5
            p172l8.AbstractC4713t.m18808b(r10)     // Catch: java.lang.Throwable -> L42
        L3e:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L8e
        L42:
            r8 = move-exception
            goto Lc3
        L45:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r8)
            r8 = 0
            return r8
        L4c:
            java.lang.Object r8 = r0.f7961t
            ec.w1 r8 = (ec.InterfaceC2198w1) r8
            java.lang.Object r9 = r0.f7960s
            hc.y r9 = (p113hc.C3001y) r9
            java.lang.Object r2 = r0.f7959r
            hc.d r2 = (p113hc.InterfaceC2974d) r2
            java.lang.Object r5 = r0.f7958q
            hc.w r5 = (p113hc.C2999w) r5
            p172l8.AbstractC4713t.m18808b(r10)     // Catch: java.lang.Throwable -> L42
            goto L91
        L60:
            java.lang.Object r8 = r0.f7960s
            r9 = r8
            hc.y r9 = (p113hc.C3001y) r9
            java.lang.Object r8 = r0.f7959r
            hc.d r8 = (p113hc.InterfaceC2974d) r8
            java.lang.Object r2 = r0.f7958q
            hc.w r2 = (p113hc.C2999w) r2
            p172l8.AbstractC4713t.m18808b(r10)     // Catch: java.lang.Throwable -> L73
            r10 = r8
            r8 = r2
            goto L82
        L73:
            r8 = move-exception
            r5 = r2
            goto Lc3
        L76:
            p172l8.AbstractC4713t.m18808b(r10)
            ic.d r10 = r8.m12719i()
            hc.y r10 = (p113hc.C3001y) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L82:
            p8.j r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lc0
            ec.w1$b r5 = ec.InterfaceC2198w1.f6022g     // Catch: java.lang.Throwable -> Lc0
            p8.j$b r2 = r2.mo1654h(r5)     // Catch: java.lang.Throwable -> Lc0
            ec.w1 r2 = (ec.InterfaceC2198w1) r2     // Catch: java.lang.Throwable -> Lc0
        L8e:
            r5 = r8
            r8 = r2
            r2 = r10
        L91:
            java.lang.Object r10 = r5.m11082W(r9)     // Catch: java.lang.Throwable -> L42
            jc.d0 r6 = p113hc.AbstractC3000x.f7965a     // Catch: java.lang.Throwable -> L42
            if (r10 != r6) goto Laa
            r0.f7958q = r5     // Catch: java.lang.Throwable -> L42
            r0.f7959r = r2     // Catch: java.lang.Throwable -> L42
            r0.f7960s = r9     // Catch: java.lang.Throwable -> L42
            r0.f7961t = r8     // Catch: java.lang.Throwable -> L42
            r0.f7964w = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r5.m11086z(r9, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L91
            goto Lbf
        Laa:
            if (r8 == 0) goto Laf
            ec.AbstractC2210z1.m7958k(r8)     // Catch: java.lang.Throwable -> L42
        Laf:
            r0.f7958q = r5     // Catch: java.lang.Throwable -> L42
            r0.f7959r = r2     // Catch: java.lang.Throwable -> L42
            r0.f7960s = r9     // Catch: java.lang.Throwable -> L42
            r0.f7961t = r8     // Catch: java.lang.Throwable -> L42
            r0.f7964w = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r10 = r2.mo400a(r10, r0)     // Catch: java.lang.Throwable -> L42
            if (r10 != r1) goto L3e
        Lbf:
            return r1
        Lc0:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lc3:
            r5.m12721m(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.C2999w.m11050C(hc.w, hc.d, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Object m11051H(C2999w c2999w, Object obj, InterfaceC5976f interfaceC5976f) throws Throwable {
        if (c2999w.mo11006f(obj)) {
            return C4700i0.f13910a;
        }
        Object objM11068I = c2999w.m11068I(obj, interfaceC5976f);
        return objM11068I == AbstractC6325c.m24992g() ? objM11068I : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: A */
    public final void m11062A(a aVar) {
        synchronized (this) {
            if (aVar.f7954r < m11072M()) {
                return;
            }
            Object[] objArr = this.f7950x;
            objArr.getClass();
            if (AbstractC3000x.m11092f(objArr, aVar.f7954r) != aVar) {
                return;
            }
            AbstractC3000x.m11093g(objArr, aVar.f7954r, AbstractC3000x.f7965a);
            m11063B();
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m11063B() {
        if (this.f7948v != 0 || this.f7946B > 1) {
            Object[] objArr = this.f7950x;
            objArr.getClass();
            while (this.f7946B > 0 && AbstractC3000x.m11092f(objArr, (m11072M() + ((long) m11077R())) - 1) == AbstractC3000x.f7965a) {
                this.f7946B--;
                AbstractC3000x.m11093g(objArr, m11072M() + ((long) m11077R()), null);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m11064D(long j10) {
        AbstractC3386d[] abstractC3386dArr;
        if (this.f9337r != 0 && (abstractC3386dArr = this.f9336q) != null) {
            for (AbstractC3386d abstractC3386d : abstractC3386dArr) {
                if (abstractC3386d != null) {
                    C3001y c3001y = (C3001y) abstractC3386d;
                    long j11 = c3001y.f7966a;
                    if (j11 >= 0 && j11 < j10) {
                        c3001y.f7966a = j10;
                    }
                }
            }
        }
        this.f7952z = j10;
    }

    @Override // p130ic.AbstractC3384b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3001y mo11007k() {
        return new C3001y();
    }

    @Override // p130ic.AbstractC3384b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3001y[] mo11008l(int i10) {
        return new C3001y[i10];
    }

    /* JADX INFO: renamed from: G */
    public final void m11067G() {
        Object[] objArr = this.f7950x;
        objArr.getClass();
        AbstractC3000x.m11093g(objArr, m11072M(), null);
        this.f7945A--;
        long jM11072M = m11072M() + 1;
        if (this.f7951y < jM11072M) {
            this.f7951y = jM11072M;
        }
        if (this.f7952z < jM11072M) {
            m11064D(jM11072M);
        }
    }

    /* JADX INFO: renamed from: I */
    public final Object m11068I(Object obj, InterfaceC5976f interfaceC5976f) throws Throwable {
        Throwable th;
        InterfaceC5976f[] interfaceC5976fArrM11070K;
        a aVar;
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        InterfaceC5976f[] interfaceC5976fArrM11070K2 = AbstractC3385c.f9340a;
        synchronized (this) {
            try {
                if (m11079T(obj)) {
                    try {
                        C4712s.a aVar2 = C4712s.f13928r;
                        c2164o.resumeWith(C4712s.m18798b(C4700i0.f13910a));
                        interfaceC5976fArrM11070K = m11070K(interfaceC5976fArrM11070K2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, m11072M() + ((long) m11077R()), obj, c2164o);
                        m11069J(aVar);
                        this.f7946B++;
                        if (this.f7948v == 0) {
                            interfaceC5976fArrM11070K2 = m11070K(interfaceC5976fArrM11070K2);
                        }
                        interfaceC5976fArrM11070K = interfaceC5976fArrM11070K2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    AbstractC2172q.m7887a(c2164o, aVar);
                }
                for (InterfaceC5976f interfaceC5976f2 : interfaceC5976fArrM11070K) {
                    if (interfaceC5976f2 != null) {
                        C4712s.a aVar3 = C4712s.f13928r;
                        interfaceC5976f2.resumeWith(C4712s.m18798b(C4700i0.f13910a));
                    }
                }
                Object objM7875w = c2164o.m7875w();
                if (objM7875w == AbstractC6325c.m24992g()) {
                    AbstractC6539h.m25860c(interfaceC5976f);
                }
                return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11069J(Object obj) {
        int iM11077R = m11077R();
        Object[] objArrM11078S = this.f7950x;
        if (objArrM11078S == null) {
            objArrM11078S = m11078S(null, 0, 2);
        } else if (iM11077R >= objArrM11078S.length) {
            objArrM11078S = m11078S(objArrM11078S, iM11077R, objArrM11078S.length * 2);
        }
        AbstractC3000x.m11093g(objArrM11078S, m11072M() + ((long) iM11077R), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p8.f[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: K */
    public final InterfaceC5976f[] m11070K(InterfaceC5976f[] interfaceC5976fArr) {
        AbstractC3386d[] abstractC3386dArr;
        C3001y c3001y;
        InterfaceC5976f interfaceC5976f;
        int length = interfaceC5976fArr.length;
        if (this.f9337r != 0 && (abstractC3386dArr = this.f9336q) != null) {
            int length2 = abstractC3386dArr.length;
            int i10 = 0;
            interfaceC5976fArr = interfaceC5976fArr;
            while (i10 < length2) {
                AbstractC3386d abstractC3386d = abstractC3386dArr[i10];
                if (abstractC3386d != null && (interfaceC5976f = (c3001y = (C3001y) abstractC3386d).f7967b) != null && m11081V(c3001y) >= 0) {
                    int length3 = interfaceC5976fArr.length;
                    interfaceC5976fArr = interfaceC5976fArr;
                    if (length >= length3) {
                        interfaceC5976fArr = Arrays.copyOf((Object[]) interfaceC5976fArr, Math.max(2, interfaceC5976fArr.length * 2));
                    }
                    ((InterfaceC5976f[]) interfaceC5976fArr)[length] = interfaceC5976f;
                    c3001y.f7967b = null;
                    length++;
                }
                i10++;
                interfaceC5976fArr = interfaceC5976fArr;
            }
        }
        return (InterfaceC5976f[]) interfaceC5976fArr;
    }

    /* JADX INFO: renamed from: L */
    public final long m11071L() {
        return m11072M() + ((long) this.f7945A);
    }

    /* JADX INFO: renamed from: M */
    public final long m11072M() {
        return Math.min(this.f7952z, this.f7951y);
    }

    /* JADX INFO: renamed from: N */
    public final Object m11073N() {
        Object[] objArr = this.f7950x;
        objArr.getClass();
        return AbstractC3000x.m11092f(objArr, (this.f7951y + ((long) m11076Q())) - 1);
    }

    /* JADX INFO: renamed from: O */
    public final Object m11074O(long j10) {
        Object[] objArr = this.f7950x;
        objArr.getClass();
        Object objM11092f = AbstractC3000x.m11092f(objArr, j10);
        return objM11092f instanceof a ? ((a) objM11092f).f7955s : objM11092f;
    }

    /* JADX INFO: renamed from: P */
    public final long m11075P() {
        return m11072M() + ((long) this.f7945A) + ((long) this.f7946B);
    }

    /* JADX INFO: renamed from: Q */
    public final int m11076Q() {
        return (int) ((m11072M() + ((long) this.f7945A)) - this.f7951y);
    }

    /* JADX INFO: renamed from: R */
    public final int m11077R() {
        return this.f7945A + this.f7946B;
    }

    /* JADX INFO: renamed from: S */
    public final Object[] m11078S(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            C10010p0.m38820a("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i11];
        this.f7950x = objArr2;
        if (objArr != null) {
            long jM11072M = m11072M();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jM11072M;
                AbstractC3000x.m11093g(objArr2, j10, AbstractC3000x.m11092f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m11079T(Object obj) {
        if (m12722n() == 0) {
            return m11080U(obj);
        }
        if (this.f7945A >= this.f7948v && this.f7952z <= this.f7951y) {
            int i10 = b.f7957a[this.f7949w.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                C5729x.m23182a();
                return false;
            }
        }
        m11069J(obj);
        int i11 = this.f7945A + 1;
        this.f7945A = i11;
        if (i11 > this.f7948v) {
            m11067G();
        }
        if (m11076Q() > this.f7947u) {
            m11083X(this.f7951y + 1, this.f7952z, m11071L(), m11075P());
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m11080U(Object obj) {
        if (this.f7947u == 0) {
            return true;
        }
        m11069J(obj);
        int i10 = this.f7945A + 1;
        this.f7945A = i10;
        if (i10 > this.f7947u) {
            m11067G();
        }
        this.f7952z = m11072M() + ((long) this.f7945A);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final long m11081V(C3001y c3001y) {
        long j10 = c3001y.f7966a;
        if (j10 >= m11071L() && (this.f7948v > 0 || j10 > m11072M() || this.f7946B == 0)) {
            return -1L;
        }
        return j10;
    }

    /* JADX INFO: renamed from: W */
    public final Object m11082W(C3001y c3001y) {
        Object obj;
        InterfaceC5976f[] interfaceC5976fArrM11084Y = AbstractC3385c.f9340a;
        synchronized (this) {
            try {
                long jM11081V = m11081V(c3001y);
                if (jM11081V < 0) {
                    obj = AbstractC3000x.f7965a;
                } else {
                    long j10 = c3001y.f7966a;
                    Object objM11074O = m11074O(jM11081V);
                    c3001y.f7966a = jM11081V + 1;
                    interfaceC5976fArrM11084Y = m11084Y(j10);
                    obj = objM11074O;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5976f interfaceC5976f : interfaceC5976fArrM11084Y) {
            if (interfaceC5976f != null) {
                C4712s.a aVar = C4712s.f13928r;
                interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: X */
    public final void m11083X(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM11072M = m11072M(); jM11072M < jMin; jM11072M++) {
            Object[] objArr = this.f7950x;
            objArr.getClass();
            AbstractC3000x.m11093g(objArr, jM11072M, null);
        }
        this.f7951y = j10;
        this.f7952z = j11;
        this.f7945A = (int) (j12 - jMin);
        this.f7946B = (int) (j13 - j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p228p8.InterfaceC5976f[] m11084Y(long r21) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.C2999w.m11084Y(long):p8.f[]");
    }

    /* JADX INFO: renamed from: Z */
    public final long m11085Z() {
        long j10 = this.f7951y;
        if (j10 < this.f7952z) {
            this.f7952z = j10;
        }
        return j10;
    }

    @Override // p113hc.InterfaceC2994r, p113hc.InterfaceC2974d
    /* JADX INFO: renamed from: a */
    public Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
        return m11051H(this, obj, interfaceC5976f);
    }

    @Override // p113hc.InterfaceC2998v, p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        return m11050C(this, interfaceC2974d, interfaceC5976f);
    }

    @Override // p113hc.InterfaceC2994r
    /* JADX INFO: renamed from: d */
    public void mo11004d() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m11083X(m11071L(), this.f7952z, m11071L(), m11075P());
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p130ic.InterfaceC3395m
    /* JADX INFO: renamed from: e */
    public InterfaceC2972c mo11005e(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return AbstractC3000x.m11091e(this, interfaceC5980j, i10, enumC2732a);
    }

    @Override // p113hc.InterfaceC2994r
    /* JADX INFO: renamed from: f */
    public boolean mo11006f(Object obj) {
        int i10;
        boolean z10;
        InterfaceC5976f[] interfaceC5976fArrM11070K = AbstractC3385c.f9340a;
        synchronized (this) {
            if (m11079T(obj)) {
                interfaceC5976fArrM11070K = m11070K(interfaceC5976fArrM11070K);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC5976f interfaceC5976f : interfaceC5976fArrM11070K) {
            if (interfaceC5976f != null) {
                C4712s.a aVar = C4712s.f13928r;
                interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: z */
    public final Object m11086z(C3001y c3001y, InterfaceC5976f interfaceC5976f) {
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        synchronized (this) {
            try {
                if (m11081V(c3001y) < 0) {
                    c3001y.f7967b = c2164o;
                } else {
                    C4712s.a aVar = C4712s.f13928r;
                    c2164o.resumeWith(C4712s.m18798b(C4700i0.f13910a));
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }
}

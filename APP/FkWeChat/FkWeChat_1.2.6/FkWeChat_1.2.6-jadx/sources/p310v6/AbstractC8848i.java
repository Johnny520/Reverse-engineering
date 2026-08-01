package p310v6;

import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p215oc.C5706c;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;
import p281t6.C8171x;

/* JADX INFO: renamed from: v6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8848i {

    /* JADX INFO: renamed from: a */
    public static final C8842c f29394a = C8842c.f29376b.m33945d(C8171x.f27399b.m31699a(), new InterfaceC0184l() { // from class: v6.g
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return Integer.valueOf(AbstractC8848i.m33972b((C8171x) obj));
        }
    }, new InterfaceC0188p() { // from class: v6.h
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return Character.valueOf(AbstractC8848i.m33971a((C8171x) obj, ((Integer) obj2).intValue()));
        }
    });

    /* JADX INFO: renamed from: b */
    public static final long[] f29395b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f29396c;

    /* JADX INFO: renamed from: v6.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f29397q;

        /* JADX INFO: renamed from: r */
        public Object f29398r;

        /* JADX INFO: renamed from: s */
        public int f29399s;

        /* JADX INFO: renamed from: t */
        public int f29400t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f29401u;

        /* JADX INFO: renamed from: v */
        public int f29402v;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f29401u = obj;
            this.f29402v |= Integer.MIN_VALUE;
            return AbstractC8848i.m33984n(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056 A[PHI: r6
  0x0056: PHI (r6v2 long) = (r6v1 long), (r6v0 long) binds: [B:18:0x0064, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            v6.c$a r0 = p310v6.C8842c.f29376b
            t6.x$a r1 = p281t6.C8171x.f27399b
            java.util.List r1 = r1.m31699a()
            v6.g r2 = new v6.g
            r2.<init>()
            v6.h r3 = new v6.h
            r3.<init>()
            v6.c r0 = r0.m33945d(r1, r2, r3)
            p310v6.AbstractC8848i.f29394a = r0
            f9.j r0 = new f9.j
            r1 = 255(0xff, float:3.57E-43)
            r2 = 0
            r0.<init>(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r4 = p185m8.AbstractC5116y.m20814z(r0, r3)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L71
            r4 = r0
            m8.q0 r4 = (p185m8.AbstractC5101q0) r4
            int r4 = r4.nextInt()
            r5 = 48
            if (r5 > r4) goto L49
            r5 = 58
            if (r4 >= r5) goto L49
            long r4 = (long) r4
            r6 = 48
            long r4 = r4 - r6
            goto L69
        L49:
            long r4 = (long) r4
            r6 = 97
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L5a
            r8 = 102(0x66, double:5.04E-322)
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L5a
        L56:
            long r4 = r4 - r6
            long r6 = (long) r3
            long r4 = r4 + r6
            goto L69
        L5a:
            r6 = 65
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L67
            r8 = 70
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto L67
            goto L56
        L67:
            r4 = -1
        L69:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            goto L2f
        L71:
            long[] r0 = p185m8.AbstractC5081g0.m20556Y0(r1)
            p310v6.AbstractC8848i.f29395b = r0
            f9.j r0 = new f9.j
            r1 = 15
            r0.<init>(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p185m8.AbstractC5116y.m20814z(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L8b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lac
            r2 = r0
            m8.q0 r2 = (p185m8.AbstractC5101q0) r2
            int r2 = r2.nextInt()
            if (r2 >= r3) goto L9e
            int r2 = r2 + 48
        L9c:
            byte r2 = (byte) r2
            goto La4
        L9e:
            int r2 = r2 + 97
            char r2 = (char) r2
            int r2 = r2 - r3
            char r2 = (char) r2
            goto L9c
        La4:
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r1.add(r2)
            goto L8b
        Lac:
            byte[] r0 = p185m8.AbstractC5081g0.m20547S0(r1)
            p310v6.AbstractC8848i.f29396c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p310v6.AbstractC8848i.<clinit>():void");
    }

    /* JADX INFO: renamed from: a */
    public static char m33971a(C8171x c8171x, int i10) {
        c8171x.getClass();
        return c8171x.m31698i().charAt(i10);
    }

    /* JADX INFO: renamed from: b */
    public static int m33972b(C8171x c8171x) {
        c8171x.getClass();
        return c8171x.m31698i().length();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m33973c(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i11 - i10 != charSequence2.length()) {
            return false;
        }
        for (int i12 = i10; i12 < i11; i12++) {
            int iCharAt = charSequence.charAt(i12);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            int iCharAt2 = charSequence2.charAt(i12 - i10);
            if (65 <= iCharAt2 && iCharAt2 < 91) {
                iCharAt2 += 32;
            }
            if (iCharAt != iCharAt2) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m33974d(CharSequence charSequence, int i10, int i11, CharSequence charSequence2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return m33973c(charSequence, i10, i11, charSequence2);
    }

    /* JADX INFO: renamed from: e */
    public static final C8842c m33975e() {
        return f29394a;
    }

    /* JADX INFO: renamed from: f */
    public static final int m33976f(CharSequence charSequence, int i10, int i11) {
        charSequence.getClass();
        int i12 = 0;
        while (i10 < i11) {
            int iCharAt = charSequence.charAt(i10);
            if (65 <= iCharAt && iCharAt < 91) {
                iCharAt += 32;
            }
            i12 = (i12 * 31) + iCharAt;
            i10++;
        }
        return i12;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m33977g(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        return m33976f(charSequence, i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static final Void m33978h(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid HEX number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10));
    }

    /* JADX INFO: renamed from: i */
    public static final void m33979i(CharSequence charSequence) {
        throw new NumberFormatException("Invalid number " + ((Object) charSequence) + ": too large for Long type");
    }

    /* JADX INFO: renamed from: j */
    public static final void m33980j(CharSequence charSequence, int i10) {
        throw new NumberFormatException("Invalid number: " + ((Object) charSequence) + ", wrong digit: " + charSequence.charAt(i10) + " at position " + i10);
    }

    /* JADX INFO: renamed from: k */
    public static final long m33981k(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length();
        if (length > 19) {
            m33979i(charSequence);
        }
        if (length == 19) {
            return m33982l(charSequence);
        }
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                m33980j(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
        }
        return j10;
    }

    /* JADX INFO: renamed from: l */
    public static final long m33982l(CharSequence charSequence) {
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            long jCharAt = ((long) charSequence.charAt(i10)) - 48;
            if (jCharAt < 0 || jCharAt > 9) {
                m33980j(charSequence, i10);
            }
            j10 = (j10 << 3) + (j10 << 1) + jCharAt;
            if (j10 < 0) {
                m33979i(charSequence);
            }
        }
        return j10;
    }

    /* JADX INFO: renamed from: m */
    public static final long m33983m(CharSequence charSequence) {
        charSequence.getClass();
        long[] jArr = f29395b;
        int length = charSequence.length();
        long j10 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int iCharAt = charSequence.charAt(i10) & 65535;
            long j11 = iCharAt < 255 ? jArr[iCharAt] : -1L;
            if (j11 == -1) {
                m33978h(charSequence, i10);
                C5706c.m23089a();
                return 0L;
            }
            j10 = (j10 << 4) | j11;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m33984n(io.ktor.utils.p131io.InterfaceC3473k r7, int r8, p228p8.InterfaceC5976f r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof p310v6.AbstractC8848i.a
            if (r0 == 0) goto L13
            r0 = r9
            v6.i$a r0 = (p310v6.AbstractC8848i.a) r0
            int r1 = r0.f29402v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29402v = r1
            goto L18
        L13:
            v6.i$a r0 = new v6.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29401u
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f29402v
            r3 = 8
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L32
            if (r2 != r4) goto L2b
            goto L32
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r7)
        L30:
            r7 = 0
            return r7
        L32:
            int r7 = r0.f29400t
            int r8 = r0.f29399s
            java.lang.Object r2 = r0.f29398r
            byte[] r2 = (byte[]) r2
            java.lang.Object r5 = r0.f29397q
            io.ktor.utils.io.k r5 = (io.ktor.utils.p131io.InterfaceC3473k) r5
            p172l8.AbstractC4713t.m18808b(r9)
            r6 = r7
            r7 = r5
            goto L6b
        L44:
            p172l8.AbstractC4713t.m18808b(r9)
            if (r8 <= 0) goto L8b
            byte[] r2 = p310v6.AbstractC8848i.f29396c
            r9 = 0
        L4c:
            int r6 = r9 + 1
            if (r9 >= r3) goto L6b
            int r9 = r8 >>> 28
            int r8 = r8 << 4
            if (r9 == 0) goto L69
            r9 = r2[r9]
            r0.f29397q = r7
            r0.f29398r = r2
            r0.f29399s = r8
            r0.f29400t = r6
            r0.f29402v = r5
            java.lang.Object r9 = io.ktor.utils.p131io.AbstractC3476n.m12980i(r7, r9, r0)
            if (r9 != r1) goto L6b
            goto L85
        L69:
            r9 = r6
            goto L4c
        L6b:
            int r9 = r6 + 1
            if (r6 >= r3) goto L88
            int r5 = r8 >>> 28
            int r8 = r8 << 4
            r5 = r2[r5]
            r0.f29397q = r7
            r0.f29398r = r2
            r0.f29399s = r8
            r0.f29400t = r9
            r0.f29402v = r4
            java.lang.Object r5 = io.ktor.utils.p131io.AbstractC3476n.m12980i(r7, r5, r0)
            if (r5 != r1) goto L86
        L85:
            return r1
        L86:
            r6 = r9
            goto L6b
        L88:
            l8.i0 r7 = p172l8.C4700i0.f13910a
            return r7
        L8b:
            java.lang.String r7 = "Does only work for positive numbers"
            p376zd.C9987e.m38645a(r7)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: p310v6.AbstractC8848i.m33984n(io.ktor.utils.io.k, int, p8.f):java.lang.Object");
    }
}

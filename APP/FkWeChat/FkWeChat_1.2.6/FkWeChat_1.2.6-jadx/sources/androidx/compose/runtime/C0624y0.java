package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC0630z0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p057e1.AbstractC1995w;
import p057e1.C1986n;
import p117i.AbstractC3088u0;
import p117i.AbstractC3090v0;
import p117i.C3074n0;
import p119i1.AbstractC3137l;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3160w0;
import p119i1.AbstractC3162x0;
import p119i1.InterfaceC3158v0;
import p172l8.C4700i0;
import p349y0.C9508c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.runtime.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0624y0 extends AbstractC3160w0 implements InterfaceC0630z0 {

    /* JADX INFO: renamed from: r */
    public final InterfaceC0173a f1787r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0466b5 f1788s;

    /* JADX INFO: renamed from: t */
    public a f1789t = new a(AbstractC3159w.m11882K().mo11678i());

    public C0624y0(InterfaceC0173a interfaceC0173a, InterfaceC0466b5 interfaceC0466b5) {
        this.f1787r = interfaceC0173a;
        this.f1788s = interfaceC0466b5;
    }

    /* JADX INFO: renamed from: x */
    public static final C4700i0 m2436x(C0624y0 c0624y0, C1986n c1986n, C3074n0 c3074n0, int i10, Object obj) {
        if (obj == c0624y0) {
            C10010p0.m38820a("A derived state calculation cannot read itself");
            return null;
        }
        if (obj instanceof InterfaceC3158v0) {
            c3074n0.m11447u(obj, Math.min(c1986n.m7168a() - i10, c3074n0.m11568e(obj, Integer.MAX_VALUE)));
        }
        return C4700i0.f13910a;
    }

    @Override // androidx.compose.runtime.InterfaceC0630z0
    /* JADX INFO: renamed from: c */
    public InterfaceC0466b5 mo2437c() {
        return this.f1788s;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e */
    public AbstractC3162x0 getFirstStateRecord() {
        return this.f1789t;
    }

    @Override // androidx.compose.runtime.InterfaceC0564p5
    public Object getValue() {
        AbstractC3137l.a aVar = AbstractC3137l.f8345e;
        InterfaceC0184l interfaceC0184lMo11676g = aVar.m11764c().mo11676g();
        if (interfaceC0184lMo11676g != null) {
            interfaceC0184lMo11676g.mo27m(this);
        }
        AbstractC3137l abstractC3137lM11764c = aVar.m11764c();
        return m2440w((a) AbstractC3159w.m11881J(this.f1789t, abstractC3137lM11764c), abstractC3137lM11764c, true, this.f1787r).m2445j();
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 abstractC3162x0) {
        abstractC3162x0.getClass();
        this.f1789t = (a) abstractC3162x0;
    }

    public String toString() {
        return "DerivedState(value=" + m2441y() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.InterfaceC0630z0
    /* JADX INFO: renamed from: u */
    public InterfaceC0630z0.a mo2438u() {
        AbstractC3137l abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
        return m2440w((a) AbstractC3159w.m11881J(this.f1789t, abstractC3137lM11764c), abstractC3137lM11764c, false, this.f1787r);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC3162x0 m2439v(AbstractC3137l abstractC3137l) {
        return m2440w((a) AbstractC3159w.m11881J(this.f1789t, abstractC3137l), abstractC3137l, false, this.f1787r);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C0624y0.a m2440w(androidx.compose.runtime.C0624y0.a r22, p119i1.AbstractC3137l r23, boolean r24, p010a9.InterfaceC0173a r25) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0624y0.m2440w(androidx.compose.runtime.y0$a, i1.l, boolean, a9.a):androidx.compose.runtime.y0$a");
    }

    /* JADX INFO: renamed from: y */
    public final String m2441y() {
        a aVar = (a) AbstractC3159w.m11880I(this.f1789t);
        return aVar.m2446k(this, AbstractC3137l.f8345e.m11764c()) ? String.valueOf(aVar.m2445j()) : "<Not calculated>";
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3162x0 implements InterfaceC0630z0.a {

        /* JADX INFO: renamed from: h */
        public static final C10052a f1790h = new C10052a(null);

        /* JADX INFO: renamed from: i */
        public static final int f1791i = 8;

        /* JADX INFO: renamed from: j */
        public static final Object f1792j = new Object();

        /* JADX INFO: renamed from: c */
        public long f1793c;

        /* JADX INFO: renamed from: d */
        public int f1794d;

        /* JADX INFO: renamed from: e */
        public AbstractC3088u0 f1795e;

        /* JADX INFO: renamed from: f */
        public Object f1796f;

        /* JADX INFO: renamed from: g */
        public int f1797g;

        public a(long j10) {
            super(j10);
            this.f1795e = AbstractC3090v0.m11575a();
            this.f1796f = f1792j;
        }

        @Override // androidx.compose.runtime.InterfaceC0630z0.a
        /* JADX INFO: renamed from: a */
        public Object mo2443a() {
            return this.f1796f;
        }

        @Override // androidx.compose.runtime.InterfaceC0630z0.a
        /* JADX INFO: renamed from: b */
        public AbstractC3088u0 mo2444b() {
            return this.f1795e;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: c */
        public void mo1522c(AbstractC3162x0 abstractC3162x0) {
            abstractC3162x0.getClass();
            a aVar = (a) abstractC3162x0;
            m2448m(aVar.mo2444b());
            this.f1796f = aVar.f1796f;
            this.f1797g = aVar.f1797g;
        }

        @Override // p119i1.AbstractC3162x0
        /* JADX INFO: renamed from: d */
        public AbstractC3162x0 mo1523d(long j10) {
            return new a(j10);
        }

        /* JADX INFO: renamed from: j */
        public final Object m2445j() {
            return this.f1796f;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m2446k(androidx.compose.runtime.InterfaceC0630z0 r6, p119i1.AbstractC3137l r7) {
            /*
                r5 = this;
                java.lang.Object r0 = p119i1.AbstractC3159w.m11883L()
                monitor-enter(r0)
                long r1 = r5.f1793c     // Catch: java.lang.Throwable -> L1c
                long r3 = r7.mo11678i()     // Catch: java.lang.Throwable -> L1c
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1e
                int r1 = r5.f1794d     // Catch: java.lang.Throwable -> L1c
                int r4 = r7.mo11679j()     // Catch: java.lang.Throwable -> L1c
                if (r1 == r4) goto L1a
                goto L1e
            L1a:
                r1 = r3
                goto L1f
            L1c:
                r6 = move-exception
                goto L4f
            L1e:
                r1 = r2
            L1f:
                monitor-exit(r0)
                java.lang.Object r0 = r5.f1796f
                java.lang.Object r4 = androidx.compose.runtime.C0624y0.a.f1792j
                if (r0 == r4) goto L31
                if (r1 == 0) goto L32
                int r0 = r5.f1797g
                int r6 = r5.m2447l(r6, r7)
                if (r0 != r6) goto L31
                goto L32
            L31:
                r2 = r3
            L32:
                if (r2 == 0) goto L4e
                if (r1 == 0) goto L4e
                java.lang.Object r6 = p119i1.AbstractC3159w.m11883L()
                monitor-enter(r6)
                long r0 = r7.mo11678i()     // Catch: java.lang.Throwable -> L4b
                r5.f1793c = r0     // Catch: java.lang.Throwable -> L4b
                int r7 = r7.mo11679j()     // Catch: java.lang.Throwable -> L4b
                r5.f1794d = r7     // Catch: java.lang.Throwable -> L4b
                l8.i0 r7 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r6)
                return r2
            L4b:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4e:
                return r2
            L4f:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C0624y0.a.m2446k(androidx.compose.runtime.z0, i1.l):boolean");
        }

        /* JADX INFO: renamed from: l */
        public final int m2447l(InterfaceC0630z0 interfaceC0630z0, AbstractC3137l abstractC3137l) {
            AbstractC3088u0 abstractC3088u0Mo2444b;
            int iM7200a;
            int i10;
            int i11;
            int i12;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3088u0Mo2444b = mo2444b();
            }
            int i13 = 7;
            if (!abstractC3088u0Mo2444b.m11571h()) {
                return 7;
            }
            C9508c c9508cM1564c = AbstractC0473c5.m1564c();
            Object[] objArr = c9508cM1564c.f32299q;
            int iM37039l = c9508cM1564c.m37039l();
            for (int i14 = 0; i14 < iM37039l; i14++) {
                ((InterfaceC0455a1) objArr[i14]).mo1512b(interfaceC0630z0);
            }
            try {
                Object[] objArr2 = abstractC3088u0Mo2444b.f8223b;
                int[] iArr = abstractC3088u0Mo2444b.f8224c;
                long[] jArr = abstractC3088u0Mo2444b.f8222a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iM7200a = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    InterfaceC3158v0 interfaceC3158v0 = (InterfaceC3158v0) objArr2[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        AbstractC3162x0 abstractC3162x0M2439v = interfaceC3158v0 instanceof C0624y0 ? ((C0624y0) interfaceC3158v0).m2439v(abstractC3137l) : AbstractC3159w.m11881J(interfaceC3158v0.getFirstStateRecord(), abstractC3137l);
                                        iM7200a = (((iM7200a * 31) + AbstractC1995w.m7200a(abstractC3162x0M2439v)) * 31) + Long.hashCode(abstractC3162x0M2439v.m11941f());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i16 = i12;
                                i13 = i11;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 == length) {
                            i13 = iM7200a;
                            break;
                        }
                        i15++;
                        i13 = i10;
                    }
                }
                iM7200a = i13;
                C4700i0 c4700i0 = C4700i0.f13910a;
                Object[] objArr3 = c9508cM1564c.f32299q;
                int iM37039l2 = c9508cM1564c.m37039l();
                for (int i20 = 0; i20 < iM37039l2; i20++) {
                    ((InterfaceC0455a1) objArr3[i20]).mo1511a(interfaceC0630z0);
                }
                return iM7200a;
            } catch (Throwable th) {
                Object[] objArr4 = c9508cM1564c.f32299q;
                int iM37039l3 = c9508cM1564c.m37039l();
                for (int i21 = 0; i21 < iM37039l3; i21++) {
                    ((InterfaceC0455a1) objArr4[i21]).mo1511a(interfaceC0630z0);
                }
                throw th;
            }
        }

        /* JADX INFO: renamed from: m */
        public void m2448m(AbstractC3088u0 abstractC3088u0) {
            this.f1795e = abstractC3088u0;
        }

        /* JADX INFO: renamed from: n */
        public final void m2449n(Object obj) {
            this.f1796f = obj;
        }

        /* JADX INFO: renamed from: o */
        public final void m2450o(int i10) {
            this.f1797g = i10;
        }

        /* JADX INFO: renamed from: p */
        public final void m2451p(long j10) {
            this.f1793c = j10;
        }

        /* JADX INFO: renamed from: q */
        public final void m2452q(int i10) {
            this.f1794d = i10;
        }

        /* JADX INFO: renamed from: androidx.compose.runtime.y0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10052a {
            public /* synthetic */ C10052a(AbstractC1043k abstractC1043k) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final Object m2453a() {
                return a.f1792j;
            }

            public C10052a() {
            }
        }
    }
}

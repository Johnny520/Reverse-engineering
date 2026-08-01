package p119i1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0455a1;
import androidx.compose.runtime.InterfaceC0630z0;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1064u0;
import p117i.AbstractC3088u0;
import p117i.C3074n0;
import p117i.C3082r0;
import p117i.C3084s0;
import p163l.AbstractC4284d1;
import p172l8.C4699i;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p215oc.C5706c;
import p349y0.AbstractC9512g;
import p349y0.C9508c;

/* JADX INFO: renamed from: i1.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3138l0 {

    /* JADX INFO: renamed from: l */
    public static final int f8351l = 8;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f8352a;

    /* JADX INFO: renamed from: c */
    public boolean f8354c;

    /* JADX INFO: renamed from: h */
    public InterfaceC3127g f8359h;

    /* JADX INFO: renamed from: i */
    public boolean f8360i;

    /* JADX INFO: renamed from: j */
    public a f8361j;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f8353b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p f8355d = new InterfaceC0188p() { // from class: i1.i0
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C3138l0.m11777b(this.f8340q, (Set) obj, (AbstractC3137l) obj2);
        }
    };

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f8356e = new InterfaceC0184l() { // from class: i1.j0
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C3138l0.m11778c(this.f8342q, obj);
        }
    };

    /* JADX INFO: renamed from: f */
    public final C9508c f8357f = new C9508c(new a[16], 0);

    /* JADX INFO: renamed from: g */
    public final Object f8358g = new Object();

    /* JADX INFO: renamed from: k */
    public long f8362k = -1;

    /* JADX INFO: renamed from: i1.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l f8363a;

        /* JADX INFO: renamed from: b */
        public Object f8364b;

        /* JADX INFO: renamed from: c */
        public C3074n0 f8365c;

        /* JADX INFO: renamed from: j */
        public boolean f8372j;

        /* JADX INFO: renamed from: k */
        public int f8373k;

        /* JADX INFO: renamed from: d */
        public int f8366d = -1;

        /* JADX INFO: renamed from: e */
        public final C3082r0 f8367e = AbstractC9512g.m37070d(null, 1, null);

        /* JADX INFO: renamed from: f */
        public final C3082r0 f8368f = new C3082r0(0, 1, null);

        /* JADX INFO: renamed from: g */
        public final C3084s0 f8369g = new C3084s0(0, 1, null);

        /* JADX INFO: renamed from: h */
        public final C9508c f8370h = new C9508c(new InterfaceC0630z0[16], 0);

        /* JADX INFO: renamed from: i */
        public final InterfaceC0455a1 f8371i = new C10107a();

        /* JADX INFO: renamed from: l */
        public final C3082r0 f8374l = AbstractC9512g.m37070d(null, 1, null);

        /* JADX INFO: renamed from: m */
        public final HashMap f8375m = new HashMap();

        /* JADX INFO: renamed from: i1.l0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10107a implements InterfaceC0455a1 {
            public C10107a() {
            }

            @Override // androidx.compose.runtime.InterfaceC0455a1
            /* JADX INFO: renamed from: a */
            public void mo1511a(InterfaceC0630z0 interfaceC0630z0) {
                a.this.f8373k--;
            }

            @Override // androidx.compose.runtime.InterfaceC0455a1
            /* JADX INFO: renamed from: b */
            public void mo1512b(InterfaceC0630z0 interfaceC0630z0) {
                a.this.f8373k++;
            }
        }

        public a(InterfaceC0184l interfaceC0184l) {
            this.f8363a = interfaceC0184l;
        }

        /* JADX INFO: renamed from: k */
        public final void m11801k() {
            AbstractC9512g.m37068b(this.f8367e);
            this.f8368f.m11516k();
            AbstractC9512g.m37068b(this.f8374l);
            this.f8375m.clear();
        }

        /* JADX INFO: renamed from: l */
        public final void m11802l(Object obj) {
            int i10 = this.f8366d;
            C3074n0 c3074n0 = this.f8365c;
            if (c3074n0 == null) {
                return;
            }
            long[] jArr = c3074n0.f8222a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = c3074n0.f8223b[i14];
                            boolean z10 = c3074n0.f8224c[i14] != i10;
                            if (z10) {
                                m11811u(obj, obj2);
                            }
                            if (z10) {
                                c3074n0.m11445s(i14);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m11803m(Object obj) {
            C3074n0 c3074n0 = (C3074n0) this.f8368f.m11526u(obj);
            if (c3074n0 == null) {
                return;
            }
            Object[] objArr = c3074n0.f8223b;
            int[] iArr = c3074n0.f8224c;
            long[] jArr = c3074n0.f8222a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m11811u(obj, obj2);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return;
                    }
                }
                if (i10 == length) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public final InterfaceC0455a1 m11804n() {
            return this.f8371i;
        }

        /* JADX INFO: renamed from: o */
        public final InterfaceC0184l m11805o() {
            return this.f8363a;
        }

        /* JADX INFO: renamed from: p */
        public final boolean m11806p() {
            return this.f8368f.m11242i();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /* JADX INFO: renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m11807q() {
            /*
                r17 = this;
                r0 = r17
                i.s0 r1 = r0.f8369g
                a9.l r2 = r0.f8363a
                java.lang.Object[] r3 = r1.f8093b
                long[] r4 = r1.f8092a
                int r5 = r4.length
                int r5 = r5 + (-2)
                if (r5 < 0) goto L49
                r6 = 0
                r7 = r6
            L11:
                r8 = r4[r7]
                long r10 = ~r8
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L44
                int r10 = r7 - r5
                int r10 = ~r10
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L2b:
                if (r12 >= r10) goto L42
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.3E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L3e
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]
                r2.mo27m(r13)
            L3e:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L2b
            L42:
                if (r10 != r11) goto L49
            L44:
                if (r7 == r5) goto L49
                int r7 = r7 + 1
                goto L11
            L49:
                r1.m11541m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p119i1.C3138l0.a.m11807q():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0232 A[PHI: r20
  0x0232: PHI (r20v38 boolean) = (r20v37 boolean), (r20v39 boolean) binds: [B:91:0x020a, B:99:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02b7 A[PHI: r20
  0x02b7: PHI (r20v30 boolean) = (r20v29 boolean), (r20v31 boolean) binds: [B:121:0x028e, B:129:0x02b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:245:0x04fa A[Catch: all -> 0x03a3, LOOP:18: B:232:0x04c1->B:245:0x04fa, LOOP_END, TryCatch #0 {all -> 0x03a3, blocks: (B:158:0x0349, B:160:0x034f, B:162:0x0353, B:165:0x0360, B:167:0x036d, B:169:0x0379, B:171:0x037f, B:173:0x039a, B:177:0x03a7, B:179:0x03b7, B:181:0x03bd, B:183:0x03c1, B:186:0x03d0, B:188:0x03e0, B:190:0x03ed, B:192:0x03f3, B:195:0x0406, B:201:0x041a, B:207:0x0433, B:211:0x0451, B:203:0x0423, B:208:0x0438, B:218:0x0478, B:220:0x0488, B:222:0x0498, B:223:0x049c, B:225:0x04aa, B:227:0x04b0, B:229:0x04b4, B:232:0x04c1, B:234:0x04cd, B:236:0x04db, B:238:0x04e1, B:239:0x04ea, B:245:0x04fa, B:247:0x04ff, B:248:0x0503, B:249:0x0507), top: B:291:0x0349 }] */
        /* JADX WARN: Removed duplicated region for block: B:251:0x050e  */
        /* JADX WARN: Removed duplicated region for block: B:336:0x04fd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[PHI: r20
  0x0144: PHI (r20v49 boolean) = (r20v48 boolean), (r20v50 boolean) binds: [B:51:0x0119, B:60:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015a  */
        /* JADX INFO: renamed from: r */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m11808r(java.util.Set r43) {
            /*
                Method dump skipped, instruction units count: 1453
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p119i1.C3138l0.a.m11808r(java.util.Set):boolean");
        }

        /* JADX INFO: renamed from: s */
        public final void m11809s(Object obj) {
            Object obj2 = this.f8364b;
            obj2.getClass();
            int i10 = this.f8366d;
            C3074n0 c3074n0 = this.f8365c;
            if (c3074n0 == null) {
                c3074n0 = new C3074n0(0, 1, null);
                this.f8365c = c3074n0;
                this.f8368f.m11529x(obj2, c3074n0);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            m11810t(obj, i10, obj2, c3074n0);
        }

        /* JADX INFO: renamed from: t */
        public final void m11810t(Object obj, int i10, Object obj2, C3074n0 c3074n0) {
            int i11;
            int i12;
            int i13;
            if (this.f8373k > 0) {
                return;
            }
            int iM11443q = c3074n0.m11443q(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof InterfaceC0630z0) || iM11443q == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                InterfaceC0630z0.a aVarMo2438u = ((InterfaceC0630z0) obj).mo2438u();
                this.f8375m.put(obj, aVarMo2438u.mo2443a());
                AbstractC3088u0 abstractC3088u0Mo2444b = aVarMo2438u.mo2444b();
                C3082r0 c3082r0 = this.f8374l;
                AbstractC9512g.m37074h(c3082r0, obj);
                Object[] objArr = abstractC3088u0Mo2444b.f8223b;
                long[] jArr = abstractC3088u0Mo2444b.f8222a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j10 & 255) < 128) {
                                    i13 = i14;
                                    InterfaceC3158v0 interfaceC3158v0 = (InterfaceC3158v0) objArr[(i15 << 3) + i17];
                                    if (interfaceC3158v0 instanceof AbstractC3160w0) {
                                        ((AbstractC3160w0) interfaceC3158v0).m11935k(AbstractC3129h.m11748a(i13));
                                    }
                                    AbstractC9512g.m37067a(c3082r0, interfaceC3158v0, obj);
                                } else {
                                    i13 = i14;
                                }
                                j10 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iM11443q == i12) {
                if (obj instanceof AbstractC3160w0) {
                    ((AbstractC3160w0) obj).m11935k(AbstractC3129h.m11748a(i11));
                }
                AbstractC9512g.m37067a(this.f8367e, obj, obj2);
            }
        }

        /* JADX INFO: renamed from: u */
        public final void m11811u(Object obj, Object obj2) {
            AbstractC9512g.m37073g(this.f8367e, obj2, obj);
            if (!(obj2 instanceof InterfaceC0630z0) || AbstractC9512g.m37071e(this.f8367e, obj2)) {
                return;
            }
            AbstractC9512g.m37074h(this.f8374l, obj2);
            this.f8375m.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX INFO: renamed from: v */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m11812v(p010a9.InterfaceC0184l r34) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p119i1.C3138l0.a.m11812v(a9.l):void");
        }

        /* JADX INFO: renamed from: w */
        public final void m11813w(InterfaceC0630z0 interfaceC0630z0) {
            long[] jArr;
            long[] jArr2;
            int i10;
            C3074n0 c3074n0;
            C3082r0 c3082r0 = this.f8368f;
            int iHashCode = Long.hashCode(AbstractC3159w.m11882K().mo11678i());
            Object objM11238e = this.f8367e.m11238e(interfaceC0630z0);
            if (objM11238e == null) {
                return;
            }
            if (!(objM11238e instanceof C3084s0)) {
                C3074n0 c3074n02 = (C3074n0) c3082r0.m11238e(objM11238e);
                if (c3074n02 == null) {
                    c3074n02 = new C3074n0(0, 1, null);
                    c3082r0.m11529x(objM11238e, c3074n02);
                    C4700i0 c4700i0 = C4700i0.f13910a;
                }
                m11810t(interfaceC0630z0, iHashCode, objM11238e, c3074n02);
                return;
            }
            C3084s0 c3084s0 = (C3084s0) objM11238e;
            Object[] objArr = c3084s0.f8093b;
            long[] jArr3 = c3084s0.f8092a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            i10 = i12;
                            Object obj = objArr[(i11 << 3) + i14];
                            C3074n0 c3074n03 = (C3074n0) c3082r0.m11238e(obj);
                            jArr2 = jArr3;
                            if (c3074n03 == null) {
                                c3074n0 = new C3074n0(0, 1, null);
                                c3082r0.m11529x(obj, c3074n0);
                                C4700i0 c4700i02 = C4700i0.f13910a;
                            } else {
                                c3074n0 = c3074n03;
                            }
                            m11810t(interfaceC0630z0, iHashCode, obj, c3074n0);
                        } else {
                            jArr2 = jArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }
    }

    public C3138l0(InterfaceC0184l interfaceC0184l) {
        this.f8352a = interfaceC0184l;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m11776a(C3138l0 c3138l0) {
        do {
            synchronized (c3138l0.f8358g) {
                try {
                    if (!c3138l0.f8354c) {
                        c3138l0.f8354c = true;
                        try {
                            C9508c c9508c = c3138l0.f8357f;
                            Object[] objArr = c9508c.f32299q;
                            int iM37039l = c9508c.m37039l();
                            for (int i10 = 0; i10 < iM37039l; i10++) {
                                ((a) objArr[i10]).m11807q();
                            }
                            c3138l0.f8354c = false;
                        } finally {
                        }
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (c3138l0.m11783h());
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m11777b(C3138l0 c3138l0, Set set, AbstractC3137l abstractC3137l) {
        c3138l0.m11779d(set);
        if (c3138l0.m11783h()) {
            c3138l0.m11788m();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static C4700i0 m11778c(C3138l0 c3138l0, Object obj) {
        if (!c3138l0.f8360i) {
            synchronized (c3138l0.f8358g) {
                a aVar = c3138l0.f8361j;
                aVar.getClass();
                aVar.m11809s(obj);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }
        return C4700i0.f13910a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m11779d(Set set) {
        Object obj;
        Set setM20533E0;
        do {
            obj = this.f8353b.get();
            if (obj == null) {
                setM20533E0 = set;
            } else if (obj instanceof Set) {
                setM20533E0 = AbstractC5114x.m20803r(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    m11787l();
                    C5706c.m23089a();
                    return;
                }
                setM20533E0 = AbstractC5081g0.m20533E0((Collection) obj, AbstractC5112w.m20789e(set));
            }
        } while (!AbstractC4284d1.m16830a(this.f8353b, obj, setM20533E0));
    }

    /* JADX INFO: renamed from: e */
    public final void m11780e() {
        synchronized (this.f8358g) {
            try {
                C9508c c9508c = this.f8357f;
                Object[] objArr = c9508c.f32299q;
                int iM37039l = c9508c.m37039l();
                for (int i10 = 0; i10 < iM37039l; i10++) {
                    ((a) objArr[i10]).m11801k();
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11781f(Object obj) {
        synchronized (this.f8358g) {
            try {
                C9508c c9508c = this.f8357f;
                int iM37039l = c9508c.m37039l();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    Object[] objArr = c9508c.f32299q;
                    if (i10 < iM37039l) {
                        a aVar = (a) objArr[i10];
                        aVar.m11803m(obj);
                        if (!aVar.m11806p()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr2 = c9508c.f32299q;
                            objArr2[i10 - i11] = objArr2[i10];
                        }
                        i10++;
                    } else {
                        int i12 = iM37039l - i11;
                        AbstractC5102r.m20672x(objArr, null, i12, iM37039l);
                        c9508c.m37050w(i12);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m11782g(InterfaceC0184l interfaceC0184l) {
        synchronized (this.f8358g) {
            try {
                C9508c c9508c = this.f8357f;
                int iM37039l = c9508c.m37039l();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    Object[] objArr = c9508c.f32299q;
                    if (i10 < iM37039l) {
                        a aVar = (a) objArr[i10];
                        aVar.m11812v(interfaceC0184l);
                        if (!aVar.m11806p()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr2 = c9508c.f32299q;
                            objArr2[i10 - i11] = objArr2[i10];
                        }
                        i10++;
                    } else {
                        int i12 = iM37039l - i11;
                        AbstractC5102r.m20672x(objArr, null, i12, iM37039l);
                        c9508c.m37050w(i12);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11783h() {
        boolean z10;
        synchronized (this.f8358g) {
            z10 = this.f8354c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set setM11786k = m11786k();
            if (setM11786k == null) {
                return z11;
            }
            synchronized (this.f8358g) {
                try {
                    C9508c c9508c = this.f8357f;
                    Object[] objArr = c9508c.f32299q;
                    int iM37039l = c9508c.m37039l();
                    for (int i10 = 0; i10 < iM37039l; i10++) {
                        z11 = ((a) objArr[i10]).m11808r(setM11786k) || z11;
                    }
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final a m11784i(InterfaceC0184l interfaceC0184l) {
        Object obj;
        C9508c c9508c = this.f8357f;
        Object[] objArr = c9508c.f32299q;
        int iM37039l = c9508c.m37039l();
        int i10 = 0;
        while (true) {
            if (i10 >= iM37039l) {
                obj = null;
                break;
            }
            obj = objArr[i10];
            if (((a) obj).m11805o() == interfaceC0184l) {
                break;
            }
            i10++;
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        interfaceC0184l.getClass();
        a aVar2 = new a((InterfaceC0184l) AbstractC1064u0.m3858f(interfaceC0184l, 1));
        this.f8357f.m37029b(aVar2);
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11785j(java.lang.Object r21, p010a9.InterfaceC0184l r22, p010a9.InterfaceC0173a r23) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p119i1.C3138l0.m11785j(java.lang.Object, a9.l, a9.a):void");
    }

    /* JADX INFO: renamed from: k */
    public final Set m11786k() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f8353b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    m11787l();
                    C5706c.m23089a();
                    return null;
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!AbstractC4284d1.m16830a(this.f8353b, obj, objSubList));
        return set;
    }

    /* JADX INFO: renamed from: l */
    public final Void m11787l() {
        AbstractC0468c0.m1549c("Unexpected notification");
        throw new C4699i();
    }

    /* JADX INFO: renamed from: m */
    public final void m11788m() {
        this.f8352a.mo27m(new InterfaceC0173a() { // from class: i1.k0
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3138l0.m11776a(this.f8344q);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m11789n() {
        this.f8359h = AbstractC3137l.f8345e.m11770i(this.f8355d);
    }

    /* JADX INFO: renamed from: o */
    public final void m11790o() {
        InterfaceC3127g interfaceC3127g = this.f8359h;
        if (interfaceC3127g != null) {
            interfaceC3127g.mo11733a();
        }
    }
}

package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C0418r1;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Map;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p102h1.AbstractC2819a0;
import p102h1.AbstractC2840u;
import p102h1.InterfaceC2821b0;
import p102h1.InterfaceC2828i;
import p102h1.InterfaceC2837r;
import p102h1.InterfaceC2843x;
import p117i.AbstractC3050e1;
import p117i.C3084s0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0418r1 implements InterfaceC2837r, InterfaceC2828i {

    /* JADX INFO: renamed from: t */
    public static final a f1192t = new a(null);

    /* JADX INFO: renamed from: q */
    public final InterfaceC2837r f1193q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2828i f1194r;

    /* JADX INFO: renamed from: s */
    public final C3084s0 f1195s;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.r1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0469c1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f1197b;

        public b(Object obj) {
            this.f1197b = obj;
        }

        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
            C0418r1.this.f1195s.m11552x(this.f1197b);
        }
    }

    public C0418r1(InterfaceC2837r interfaceC2837r, InterfaceC2828i interfaceC2828i) {
        this.f1193q = interfaceC2837r;
        this.f1194r = interfaceC2828i;
        this.f1195s = AbstractC3050e1.m11284b();
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC0469c1 m1342g(C0418r1 c0418r1, Object obj, C0476d1 c0476d1) {
        c0418r1.f1195s.m11549u(obj);
        return c0418r1.new b(obj);
    }

    /* JADX INFO: renamed from: h */
    public static C4700i0 m1343h(C0418r1 c0418r1, Object obj, InterfaceC0188p interfaceC0188p, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c0418r1.mo1351f(obj, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m1344i(InterfaceC2837r interfaceC2837r, Object obj) {
        if (interfaceC2837r != null) {
            return interfaceC2837r.mo1346a(obj);
        }
        return true;
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: a */
    public boolean mo1346a(Object obj) {
        return this.f1193q.mo1346a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map mo1347b() {
        /*
            r14 = this;
            i.s0 r0 = r14.f1195s
            java.lang.Object[] r1 = r0.f8093b
            long[] r0 = r0.f8092a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            h1.i r11 = r14.f1194r
            r11.mo1350e(r10)
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            h1.r r0 = r14.f1193q
            java.util.Map r0 = r0.mo1347b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0418r1.mo1347b():java.util.Map");
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: c */
    public Object mo1348c(String str) {
        return this.f1193q.mo1348c(str);
    }

    @Override // p102h1.InterfaceC2837r
    /* JADX INFO: renamed from: d */
    public InterfaceC2837r.a mo1349d(String str, InterfaceC0173a interfaceC0173a) {
        return this.f1193q.mo1349d(str, interfaceC0173a);
    }

    @Override // p102h1.InterfaceC2828i
    /* JADX INFO: renamed from: e */
    public void mo1350e(Object obj) {
        this.f1194r.mo1350e(obj);
    }

    @Override // p102h1.InterfaceC2828i
    /* JADX INFO: renamed from: f */
    public void mo1351f(final Object obj, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(-858296452);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC0572rMo2181q.mo2175k(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(interfaceC0188p) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC0572rMo2181q.mo2175k(this) ? 256 : 128;
        }
        if (interfaceC0572rMo2181q.mo2144C((i11 & Opcodes.I2S) != 146, i11 & 1)) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-858296452, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
            }
            int i12 = i11 & 14;
            this.f1194r.mo1351f(obj, interfaceC0188p, interfaceC0572rMo2181q, i11 & 126);
            boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(this) | interfaceC0572rMo2181q.mo2175k(obj);
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            if (zMo2175k || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.n1
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return C0418r1.m1342g(this.f1159q, obj, (C0476d1) obj2);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f);
            }
            AbstractC0497g1.m1677a(obj, (InterfaceC0184l) objMo2170f, interfaceC0572rMo2181q, i12);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: androidx.compose.foundation.lazy.layout.o1
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj2, Object obj3) {
                    return C0418r1.m1343h(this.f1167q, obj, interfaceC0188p, i10, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.r1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static C0418r1 m1352a(InterfaceC2837r interfaceC2837r, InterfaceC2828i interfaceC2828i, Map map) {
            return new C0418r1(interfaceC2837r, map, interfaceC2828i);
        }

        /* JADX INFO: renamed from: b */
        public static Map m1353b(InterfaceC2821b0 interfaceC2821b0, C0418r1 c0418r1) {
            Map mapMo1347b = c0418r1.mo1347b();
            if (mapMo1347b.isEmpty()) {
                return null;
            }
            return mapMo1347b;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC2843x m1354c(final InterfaceC2837r interfaceC2837r, final InterfaceC2828i interfaceC2828i) {
            return AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: androidx.compose.foundation.lazy.layout.p1
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C0418r1.a.m1353b((InterfaceC2821b0) obj, (C0418r1) obj2);
                }
            }, new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.q1
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C0418r1.a.m1352a(interfaceC2837r, interfaceC2828i, (Map) obj);
                }
            });
        }

        public a() {
        }
    }

    public C0418r1(final InterfaceC2837r interfaceC2837r, Map map, InterfaceC2828i interfaceC2828i) {
        this(AbstractC2840u.m10079b(map, new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.m1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C0418r1.m1344i(interfaceC2837r, obj));
            }
        }), interfaceC2828i);
    }
}

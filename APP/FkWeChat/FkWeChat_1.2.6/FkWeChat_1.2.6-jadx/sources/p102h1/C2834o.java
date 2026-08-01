package p102h1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0541m3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.C0513i3;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0514i4;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.C5754i;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p117i.AbstractC3044c1;
import p117i.C3082r0;
import p172l8.C4700i0;
import p194n4.AbstractC5492b;

/* JADX INFO: renamed from: h1.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2834o implements InterfaceC2828i {

    /* JADX INFO: renamed from: u */
    public static final a f7386u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final InterfaceC2843x f7387v = AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: h1.k
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C2834o.m10063d((InterfaceC2821b0) obj, (C2834o) obj2);
        }
    }, new InterfaceC0184l() { // from class: h1.l
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return C2834o.m10060a((Map) obj);
        }
    });

    /* JADX INFO: renamed from: q */
    public final Map f7388q;

    /* JADX INFO: renamed from: r */
    public final C3082r0 f7389r;

    /* JADX INFO: renamed from: s */
    public InterfaceC2837r f7390s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC0184l f7391t;

    /* JADX INFO: renamed from: h1.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0469c1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f7393b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2842w f7394c;

        public b(Object obj, C2842w c2842w) {
            this.f7393b = obj;
            this.f7394c = c2842w;
        }

        @Override // androidx.compose.runtime.InterfaceC0469c1
        /* JADX INFO: renamed from: a */
        public void mo1209a() {
            Object objM11526u = C2834o.this.f7389r.m11526u(this.f7393b);
            C2842w c2842w = this.f7394c;
            if (objM11526u == c2842w) {
                C2834o c2834o = C2834o.this;
                c2834o.m10071n(c2842w, c2834o.f7388q, this.f7393b);
            }
        }
    }

    public C2834o(Map map) {
        this.f7388q = map;
        this.f7389r = AbstractC3044c1.m11262b();
        this.f7391t = new InterfaceC0184l() { // from class: h1.j
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C2834o.m10062c(this.f7378q, obj));
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static C2834o m10060a(Map map) {
        return new C2834o(map);
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m10061b(C2834o c2834o, Object obj, InterfaceC0188p interfaceC0188p, int i10, InterfaceC0572r interfaceC0572r, int i11) {
        c2834o.mo1351f(obj, interfaceC0188p, interfaceC0572r, AbstractC0541m3.m1929a(i10 | 1));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10062c(C2834o c2834o, Object obj) {
        InterfaceC2837r interfaceC2837r = c2834o.f7390s;
        if (interfaceC2837r != null) {
            return interfaceC2837r.mo1346a(obj);
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static Map m10063d(InterfaceC2821b0 interfaceC2821b0, C2834o c2834o) {
        return c2834o.m10070m();
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0469c1 m10065h(C2834o c2834o, Object obj, C2842w c2842w, C0476d1 c0476d1) {
        if (c2834o.f7389r.m11235b(obj)) {
            C5754i.m23255a("Key ", obj, " was used multiple times ");
            return null;
        }
        c2834o.f7388q.remove(obj);
        c2834o.f7389r.m11529x(obj, c2842w);
        return c2834o.new b(obj, c2842w);
    }

    @Override // p102h1.InterfaceC2828i
    /* JADX INFO: renamed from: e */
    public void mo1350e(Object obj) {
        if (this.f7389r.m11526u(obj) == null) {
            this.f7388q.remove(obj);
        }
    }

    @Override // p102h1.InterfaceC2828i
    /* JADX INFO: renamed from: f */
    public void mo1351f(final Object obj, final InterfaceC0188p interfaceC0188p, InterfaceC0572r interfaceC0572r, final int i10) {
        int i11;
        InterfaceC0572r interfaceC0572rMo2181q = interfaceC0572r.mo2181q(533563200);
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
                AbstractC0468c0.m1559m(533563200, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:70)");
            }
            interfaceC0572rMo2181q.mo2187w(207, obj);
            Object objMo2170f = interfaceC0572rMo2181q.mo2170f();
            InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
            if (objMo2170f == aVar.m2191a()) {
                if (!((Boolean) this.f7391t.mo27m(obj)).booleanValue()) {
                    C5754i.m23255a("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                } else {
                    objMo2170f = new C2842w(AbstractC2840u.m10079b((Map) this.f7388q.get(obj), this.f7391t));
                    interfaceC0572rMo2181q.mo2153L(objMo2170f);
                }
            }
            final C2842w c2842w = (C2842w) objMo2170f;
            AbstractC0552o0.m1976d(new C0513i3[]{AbstractC2840u.m10083f().m1696d(c2842w), AbstractC5492b.m22337b().m1696d(c2842w)}, interfaceC0188p, interfaceC0572rMo2181q, (i11 & Opcodes.IREM) | C0513i3.f1416i);
            C4700i0 c4700i0 = C4700i0.f13910a;
            boolean zMo2175k = interfaceC0572rMo2181q.mo2175k(this) | interfaceC0572rMo2181q.mo2175k(obj) | interfaceC0572rMo2181q.mo2175k(c2842w);
            Object objMo2170f2 = interfaceC0572rMo2181q.mo2170f();
            if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
                objMo2170f2 = new InterfaceC0184l() { // from class: h1.m
                    @Override // p010a9.InterfaceC0184l
                    /* JADX INFO: renamed from: m */
                    public final Object mo27m(Object obj2) {
                        return C2834o.m10065h(this.f7379q, obj, c2842w, (C0476d1) obj2);
                    }
                };
                interfaceC0572rMo2181q.mo2153L(objMo2170f2);
            }
            AbstractC0497g1.m1677a(c4700i0, (InterfaceC0184l) objMo2170f2, interfaceC0572rMo2181q, 6);
            interfaceC0572rMo2181q.mo2168d();
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
        } else {
            interfaceC0572rMo2181q.mo2190z();
        }
        InterfaceC0514i4 interfaceC0514i4Mo2188x = interfaceC0572rMo2181q.mo2188x();
        if (interfaceC0514i4Mo2188x != null) {
            interfaceC0514i4Mo2188x.mo1756a(new InterfaceC0188p() { // from class: h1.n
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj2, Object obj3) {
                    return C2834o.m10061b(this.f7382q, obj, interfaceC0188p, i10, (InterfaceC0572r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m10070m() {
        /*
            r17 = this;
            r0 = r17
            java.util.Map r1 = r0.f7388q
            i.r0 r2 = r0.f7389r
            java.lang.Object[] r3 = r2.f8071b
            java.lang.Object[] r4 = r2.f8072c
            long[] r2 = r2.f8070a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L4f
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L48
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L44
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            h1.r r13 = (p102h1.InterfaceC2837r) r13
            r0.m10071n(r13, r1, r14)
        L44:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L48:
            if (r10 != r11) goto L4f
        L4a:
            if (r7 == r5) goto L4f
            int r7 = r7 + 1
            goto L13
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L56
            r1 = 0
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p102h1.C2834o.m10070m():java.util.Map");
    }

    /* JADX INFO: renamed from: n */
    public final void m10071n(InterfaceC2837r interfaceC2837r, Map map, Object obj) {
        Map mapMo1347b = interfaceC2837r.mo1347b();
        if (mapMo1347b.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, mapMo1347b);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10072o(InterfaceC2837r interfaceC2837r) {
        this.f7390s = interfaceC2837r;
    }

    /* JADX INFO: renamed from: h1.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2843x m10073a() {
            return C2834o.f7387v;
        }

        public a() {
        }
    }

    public /* synthetic */ C2834o(Map map, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}

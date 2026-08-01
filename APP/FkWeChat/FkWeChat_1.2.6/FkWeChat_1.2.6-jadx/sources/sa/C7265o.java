package sa;

import ae.C0307f;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2685l0;
import gb.AbstractC2706r0;
import gb.AbstractC2718v0;
import gb.C2664g;
import gb.C2713t1;
import gb.InterfaceC2716u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import okhttp3.internal.http.HttpStatusCodesKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p112hb.AbstractC2948g;
import p112hb.AbstractC2949h;
import p112hb.InterfaceC2947f;
import p172l8.C4700i0;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p213oa.C5695f;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5993d0;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6031q;
import p229p9.InterfaceC6039s1;
import p229p9.InterfaceC6053x0;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p244qb.C6380k;
import p254r5.C6494d0;
import p273s9.AbstractC7220j0;
import p273s9.AbstractC7237s;
import p273s9.C7222k0;
import p327wa.AbstractC9211e;
import p376zd.C9993h;
import sa.InterfaceC7260j;

/* JADX INFO: renamed from: sa.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C7265o {

    /* JADX INFO: renamed from: e */
    public static final List f24142e = AbstractC5081g0.m20554X0(ServiceLoader.load(InterfaceC7260j.class, InterfaceC7260j.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final C7265o f24143f;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2947f.a f24144g;

    /* JADX INFO: renamed from: a */
    public final AbstractC2949h f24145a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2948g f24146b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2947f.a f24147c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0188p f24148d;

    /* JADX INFO: renamed from: sa.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC2947f.a {
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m28831b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p112hb.InterfaceC2947f.a
        /* JADX INFO: renamed from: a */
        public boolean mo10842a(InterfaceC2716u1 interfaceC2716u1, InterfaceC2716u1 interfaceC2716u12) {
            if (interfaceC2716u1 == null) {
                m28831b(0);
            }
            if (interfaceC2716u12 == null) {
                m28831b(1);
            }
            return interfaceC2716u1.equals(interfaceC2716u12);
        }
    }

    /* JADX INFO: renamed from: sa.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b implements InterfaceC0188p {
        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4711r invoke(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
            return new C4711r(interfaceC5983a, interfaceC5983a2);
        }
    }

    /* JADX INFO: renamed from: sa.o$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC6019m f24149q;

        public c(InterfaceC6019m interfaceC6019m) {
            this.f24149q = interfaceC6019m;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo27m(InterfaceC5986b interfaceC5986b) {
            return Boolean.valueOf(interfaceC5986b.mo7443b() == this.f24149q);
        }
    }

    /* JADX INFO: renamed from: sa.o$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC5995e f24150q;

        public e(InterfaceC5995e interfaceC5995e) {
            this.f24150q = interfaceC5995e;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean mo27m(InterfaceC5986b interfaceC5986b) {
            boolean z10 = false;
            if (!AbstractC6040t.m24078g(interfaceC5986b.mo5587g()) && AbstractC6040t.m24079h(interfaceC5986b, this.f24150q, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: sa.o$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC7264n f24151q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC5986b f24152r;

        public g(AbstractC7264n abstractC7264n, InterfaceC5986b interfaceC5986b) {
            this.f24151q = abstractC7264n;
            this.f24152r = interfaceC5986b;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4700i0 mo27m(InterfaceC5986b interfaceC5986b) {
            this.f24151q.mo28790b(this.f24152r, interfaceC5986b);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: sa.o$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24153a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24154b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f24155c;

        static {
            int[] iArr = new int[EnumC5996e0.values().length];
            f24155c = iArr;
            try {
                iArr[EnumC5996e0.f18936r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24155c[EnumC5996e0.f18937s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24155c[EnumC5996e0.f18938t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24155c[EnumC5996e0.f18939u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f24154b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24154b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24154b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC7260j.b.values().length];
            f24153a = iArr3;
            try {
                iArr3[InterfaceC7260j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24153a[InterfaceC7260j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24153a[InterfaceC7260j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: sa.o$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class i {

        /* JADX INFO: renamed from: c */
        public static final i f24156c = new i(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        public final a f24157a;

        /* JADX INFO: renamed from: b */
        public final String f24158b;

        /* JADX INFO: renamed from: sa.o$i$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                m28838a(3);
            }
            if (str == null) {
                m28838a(4);
            }
            this.f24157a = aVar;
            this.f24158b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void m28838a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: sa.C7265o.i.m28838a(int):void");
        }

        /* JADX INFO: renamed from: b */
        public static i m28839b(String str) {
            if (str == null) {
                m28838a(2);
            }
            return new i(a.CONFLICT, str);
        }

        /* JADX INFO: renamed from: d */
        public static i m28840d(String str) {
            if (str == null) {
                m28838a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        /* JADX INFO: renamed from: e */
        public static i m28841e() {
            i iVar = f24156c;
            if (iVar == null) {
                m28838a(0);
            }
            return iVar;
        }

        /* JADX INFO: renamed from: c */
        public a m28842c() {
            a aVar = this.f24157a;
            if (aVar == null) {
                m28838a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f24157a + ": " + this.f24158b;
        }
    }

    static {
        a aVar = new a();
        f24144g = aVar;
        f24143f = new C7265o(aVar, AbstractC2949h.a.f7784a, AbstractC2948g.a.f7783a, null);
    }

    public C7265o(InterfaceC2947f.a aVar, AbstractC2949h abstractC2949h, AbstractC2948g abstractC2948g, InterfaceC0188p interfaceC0188p) {
        if (aVar == null) {
            m28802a(5);
        }
        if (abstractC2949h == null) {
            m28802a(6);
        }
        if (abstractC2948g == null) {
            m28802a(7);
        }
        this.f24147c = aVar;
        this.f24145a = abstractC2949h;
        this.f24146b = abstractC2948g;
        this.f24148d = interfaceC0188p;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m28793A(InterfaceC6053x0 interfaceC6053x0, InterfaceC6053x0 interfaceC6053x02) {
        if (interfaceC6053x0 == null || interfaceC6053x02 == null) {
            return true;
        }
        return m28797H(interfaceC6053x0, interfaceC6053x02);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m28794B(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
        if (interfaceC5983a == null) {
            m28802a(65);
        }
        if (interfaceC5983a2 == null) {
            m28802a(66);
        }
        AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC5983a.mo12675f();
        AbstractC2706r0 abstractC2706r0Mo12675f2 = interfaceC5983a2.mo12675f();
        if (!m28797H(interfaceC5983a, interfaceC5983a2)) {
            return false;
        }
        C2713t1 c2713t1M28828l = f24143f.m28828l(interfaceC5983a.getTypeParameters(), interfaceC5983a2.getTypeParameters());
        if (interfaceC5983a instanceof InterfaceC6056z) {
            return m28796G(interfaceC5983a, abstractC2706r0Mo12675f, interfaceC5983a2, abstractC2706r0Mo12675f2, c2713t1M28828l);
        }
        if (!(interfaceC5983a instanceof InterfaceC6055y0)) {
            C9993h.m38666a("Unexpected callable: ", interfaceC5983a.getClass());
            return false;
        }
        InterfaceC6055y0 interfaceC6055y0 = (InterfaceC6055y0) interfaceC5983a;
        InterfaceC6055y0 interfaceC6055y02 = (InterfaceC6055y0) interfaceC5983a2;
        if (m28793A(interfaceC6055y0.mo12677i(), interfaceC6055y02.mo12677i())) {
            return (interfaceC6055y0.mo12681n0() && interfaceC6055y02.mo12681n0()) ? C2664g.f6996a.m9417m(c2713t1M28828l, abstractC2706r0Mo12675f.mo9510W0(), abstractC2706r0Mo12675f2.mo9510W0()) : (interfaceC6055y0.mo12681n0() || !interfaceC6055y02.mo12681n0()) && m28796G(interfaceC5983a, abstractC2706r0Mo12675f, interfaceC5983a2, abstractC2706r0Mo12675f2, c2713t1M28828l);
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m28795C(InterfaceC5983a interfaceC5983a, Collection collection) {
        if (interfaceC5983a == null) {
            m28802a(69);
        }
        if (collection == null) {
            m28802a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m28794B(interfaceC5983a, (InterfaceC5983a) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m28796G(InterfaceC5983a interfaceC5983a, AbstractC2706r0 abstractC2706r0, InterfaceC5983a interfaceC5983a2, AbstractC2706r0 abstractC2706r02, C2713t1 c2713t1) {
        if (interfaceC5983a == null) {
            m28802a(71);
        }
        if (abstractC2706r0 == null) {
            m28802a(72);
        }
        if (interfaceC5983a2 == null) {
            m28802a(73);
        }
        if (abstractC2706r02 == null) {
            m28802a(74);
        }
        if (c2713t1 == null) {
            m28802a(75);
        }
        return C2664g.f6996a.m9424t(c2713t1, abstractC2706r0.mo9510W0(), abstractC2706r02.mo9510W0());
    }

    /* JADX INFO: renamed from: H */
    public static boolean m28797H(InterfaceC6031q interfaceC6031q, InterfaceC6031q interfaceC6031q2) {
        if (interfaceC6031q == null) {
            m28802a(67);
        }
        if (interfaceC6031q2 == null) {
            m28802a(68);
        }
        Integer numM24075d = AbstractC6040t.m24075d(interfaceC6031q.mo5587g(), interfaceC6031q2.mo5587g());
        return numM24075d == null || numM24075d.intValue() >= 0;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m28798I(InterfaceC5993d0 interfaceC5993d0, InterfaceC5993d0 interfaceC5993d02, boolean z10) {
        if (interfaceC5993d0 == null) {
            m28802a(55);
        }
        if (interfaceC5993d02 == null) {
            m28802a(56);
        }
        return !AbstractC6040t.m24078g(interfaceC5993d02.mo5587g()) && AbstractC6040t.m24079h(interfaceC5993d02, interfaceC5993d0, z10);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m28799J(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, boolean z10, boolean z11) {
        if (interfaceC5983a == null) {
            m28802a(13);
        }
        if (interfaceC5983a2 == null) {
            m28802a(14);
        }
        if (!interfaceC5983a.equals(interfaceC5983a2) && C7257g.f24129a.m28712k(interfaceC5983a.mo12664a(), interfaceC5983a2.mo12664a(), z10, z11)) {
            return true;
        }
        InterfaceC5983a interfaceC5983aMo12664a = interfaceC5983a2.mo12664a();
        Iterator it = AbstractC7259i.m28751d(interfaceC5983a).iterator();
        while (it.hasNext()) {
            if (C7257g.f24129a.m28712k(interfaceC5983aMo12664a, (InterfaceC5983a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: K */
    public static void m28800K(InterfaceC5986b interfaceC5986b, InterfaceC0184l interfaceC0184l) {
        AbstractC6043u abstractC6043u;
        if (interfaceC5986b == null) {
            m28802a(Opcodes.LMUL);
        }
        for (InterfaceC5986b interfaceC5986b2 : interfaceC5986b.mo12674e()) {
            if (interfaceC5986b2.mo5587g() == AbstractC6040t.f18988g) {
                m28800K(interfaceC5986b2, interfaceC0184l);
            }
        }
        if (interfaceC5986b.mo5587g() != AbstractC6040t.f18988g) {
            return;
        }
        AbstractC6043u abstractC6043uM28809h = m28809h(interfaceC5986b);
        if (abstractC6043uM28809h == null) {
            if (interfaceC0184l != null) {
                interfaceC0184l.mo27m(interfaceC5986b);
            }
            abstractC6043u = AbstractC6040t.f18986e;
        } else {
            abstractC6043u = abstractC6043uM28809h;
        }
        if (interfaceC5986b instanceof C7222k0) {
            ((C7222k0) interfaceC5986b).m28530i1(abstractC6043u);
            Iterator it = ((InterfaceC6055y0) interfaceC5986b).mo12671B().iterator();
            while (it.hasNext()) {
                m28800K((InterfaceC6053x0) it.next(), abstractC6043uM28809h == null ? null : interfaceC0184l);
            }
            return;
        }
        if (interfaceC5986b instanceof AbstractC7237s) {
            ((AbstractC7237s) interfaceC5986b).m28612p1(abstractC6043u);
            return;
        }
        AbstractC7220j0 abstractC7220j0 = (AbstractC7220j0) interfaceC5986b;
        abstractC7220j0.m28510T0(abstractC6043u);
        if (abstractC6043u != abstractC7220j0.mo24109F0().mo5587g()) {
            abstractC7220j0.m28508R0(false);
        }
    }

    /* JADX INFO: renamed from: L */
    public static Object m28801L(Collection collection, InterfaceC0184l interfaceC0184l) {
        Object next;
        if (collection == null) {
            m28802a(76);
        }
        if (interfaceC0184l == null) {
            m28802a(77);
        }
        if (collection.size() == 1) {
            Object objM20575i0 = AbstractC5081g0.m20575i0(collection);
            if (objM20575i0 == null) {
                m28802a(78);
            }
            return objM20575i0;
        }
        ArrayList arrayList = new ArrayList(2);
        List listM20590x0 = AbstractC5081g0.m20590x0(collection, interfaceC0184l);
        Object objM20575i02 = AbstractC5081g0.m20575i0(collection);
        InterfaceC5983a interfaceC5983a = (InterfaceC5983a) interfaceC0184l.mo27m(objM20575i02);
        for (Object obj : collection) {
            InterfaceC5983a interfaceC5983a2 = (InterfaceC5983a) interfaceC0184l.mo27m(obj);
            if (m28795C(interfaceC5983a2, listM20590x0)) {
                arrayList.add(obj);
            }
            if (m28794B(interfaceC5983a2, interfaceC5983a) && !m28794B(interfaceC5983a, interfaceC5983a2)) {
                objM20575i02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM20575i02 == null) {
                m28802a(79);
            }
            return objM20575i02;
        }
        if (arrayList.size() == 1) {
            Object objM20575i03 = AbstractC5081g0.m20575i0(arrayList);
            if (objM20575i03 == null) {
                m28802a(80);
            }
            return objM20575i03;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!AbstractC2685l0.m9493b(((InterfaceC5983a) interfaceC0184l.mo27m(next)).mo12675f())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objM20575i04 = AbstractC5081g0.m20575i0(arrayList);
        if (objM20575i04 == null) {
            m28802a(82);
        }
        return objM20575i04;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m28802a(int r24) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.C7265o.m28802a(int):void");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m28803b(Collection collection) {
        if (collection == null) {
            m28802a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return AbstractC5081g0.m20553X(collection, new c(((InterfaceC5986b) collection.iterator().next()).mo7443b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m28804c(p229p9.InterfaceC6018l1 r4, p229p9.InterfaceC6018l1 r5, gb.C2713t1 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            m28802a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            m28802a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            m28802a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            gb.r0 r5 = (gb.AbstractC2706r0) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            gb.r0 r3 = (gb.AbstractC2706r0) r3
            boolean r3 = m28805d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.C7265o.m28804c(p9.l1, p9.l1, gb.t1):boolean");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m28805d(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, C2713t1 c2713t1) {
        if (abstractC2706r0 == null) {
            m28802a(44);
        }
        if (abstractC2706r02 == null) {
            m28802a(45);
        }
        if (c2713t1 == null) {
            m28802a(46);
        }
        if (AbstractC2718v0.m9643a(abstractC2706r0) && AbstractC2718v0.m9643a(abstractC2706r02)) {
            return true;
        }
        return C2664g.f6996a.m9417m(c2713t1, abstractC2706r0.mo9510W0(), abstractC2706r02.mo9510W0());
    }

    /* JADX INFO: renamed from: e */
    public static i m28806e(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
        if ((interfaceC5983a.mo12682q0() == null) != (interfaceC5983a2.mo12682q0() == null)) {
            return i.m28840d("Receiver presence mismatch");
        }
        if (interfaceC5983a.mo12680m().size() != interfaceC5983a2.mo12680m().size()) {
            return i.m28840d("Value parameter number mismatch");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m28807f(InterfaceC5986b interfaceC5986b, Set set) {
        if (interfaceC5986b == null) {
            m28802a(17);
        }
        if (set == null) {
            m28802a(18);
        }
        if (interfaceC5986b.mo12678j().m23992a()) {
            set.add(interfaceC5986b);
        } else {
            if (interfaceC5986b.mo12674e().isEmpty()) {
                C6494d0.m25749a("No overridden descriptors found for (fake override) ", interfaceC5986b);
                return;
            }
            Iterator it = interfaceC5986b.mo12674e().iterator();
            while (it.hasNext()) {
                m28807f((InterfaceC5986b) it.next(), set);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static List m28808g(InterfaceC5983a interfaceC5983a) {
        InterfaceC5988b1 interfaceC5988b1Mo12682q0 = interfaceC5983a.mo12682q0();
        ArrayList arrayList = new ArrayList();
        if (interfaceC5988b1Mo12682q0 != null) {
            arrayList.add(interfaceC5988b1Mo12682q0.getType());
        }
        Iterator it = interfaceC5983a.mo12680m().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC6039s1) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC6043u m28809h(InterfaceC5986b interfaceC5986b) {
        if (interfaceC5986b == null) {
            m28802a(106);
        }
        Collection<InterfaceC5986b> collectionMo12674e = interfaceC5986b.mo12674e();
        AbstractC6043u abstractC6043uM28820u = m28820u(collectionMo12674e);
        if (abstractC6043uM28820u == null) {
            return null;
        }
        if (interfaceC5986b.mo12678j() != InterfaceC5986b.a.FAKE_OVERRIDE) {
            return abstractC6043uM28820u.mo24055f();
        }
        for (InterfaceC5986b interfaceC5986b2 : collectionMo12674e) {
            if (interfaceC5986b2.mo5592p() != EnumC5996e0.f18939u && !interfaceC5986b2.mo5587g().equals(abstractC6043uM28820u)) {
                return null;
            }
        }
        return abstractC6043uM28820u;
    }

    /* JADX INFO: renamed from: i */
    public static C7265o m28810i(AbstractC2949h abstractC2949h, InterfaceC2947f.a aVar) {
        if (abstractC2949h == null) {
            m28802a(3);
        }
        if (aVar == null) {
            m28802a(4);
        }
        return new C7265o(aVar, abstractC2949h, AbstractC2948g.a.f7783a, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m28811j(Collection collection, InterfaceC5995e interfaceC5995e, AbstractC7264n abstractC7264n) {
        if (collection == null) {
            m28802a(83);
        }
        if (interfaceC5995e == null) {
            m28802a(84);
        }
        if (abstractC7264n == null) {
            m28802a(85);
        }
        Collection collectionM28819t = m28819t(interfaceC5995e, collection);
        boolean zIsEmpty = collectionM28819t.isEmpty();
        if (!zIsEmpty) {
            collection = collectionM28819t;
        }
        InterfaceC5986b interfaceC5986bMo12636M = ((InterfaceC5986b) m28801L(collection, new d())).mo12636M(interfaceC5995e, m28814n(collection, interfaceC5995e), zIsEmpty ? AbstractC6040t.f18989h : AbstractC6040t.f18988g, InterfaceC5986b.a.FAKE_OVERRIDE, false);
        abstractC7264n.mo28792d(interfaceC5986bMo12636M, collection);
        abstractC7264n.mo7475a(interfaceC5986bMo12636M);
    }

    /* JADX INFO: renamed from: k */
    public static void m28812k(InterfaceC5995e interfaceC5995e, Collection collection, AbstractC7264n abstractC7264n) {
        if (interfaceC5995e == null) {
            m28802a(62);
        }
        if (collection == null) {
            m28802a(63);
        }
        if (abstractC7264n == null) {
            m28802a(64);
        }
        if (m28803b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                m28811j(Collections.singleton((InterfaceC5986b) it.next()), interfaceC5995e, abstractC7264n);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                m28811j(m28816q(AbstractC7274x.m28852a(linkedList), linkedList, abstractC7264n), interfaceC5995e, abstractC7264n);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static C7265o m28813m(AbstractC2949h abstractC2949h) {
        if (abstractC2949h == null) {
            m28802a(0);
        }
        return new C7265o(f24144g, abstractC2949h, AbstractC2948g.a.f7783a, null);
    }

    /* JADX INFO: renamed from: n */
    public static EnumC5996e0 m28814n(Collection collection, InterfaceC5995e interfaceC5995e) {
        if (collection == null) {
            m28802a(86);
        }
        if (interfaceC5995e == null) {
            m28802a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            InterfaceC5986b interfaceC5986b = (InterfaceC5986b) it.next();
            int i10 = h.f24155c[interfaceC5986b.mo5592p().ordinal()];
            if (i10 == 1) {
                EnumC5996e0 enumC5996e0 = EnumC5996e0.f18936r;
                if (enumC5996e0 == null) {
                    m28802a(88);
                }
                return enumC5996e0;
            }
            if (i10 == 2) {
                C6494d0.m25749a("Member cannot have SEALED modality: ", interfaceC5986b);
                return null;
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC5995e.mo5576R() && interfaceC5995e.mo5592p() != EnumC5996e0.f18939u && interfaceC5995e.mo5592p() != EnumC5996e0.f18937s) {
            z10 = true;
        }
        if (z11 && !z12) {
            EnumC5996e0 enumC5996e02 = EnumC5996e0.f18938t;
            if (enumC5996e02 == null) {
                m28802a(89);
            }
            return enumC5996e02;
        }
        if (!z11 && z12) {
            EnumC5996e0 enumC5996e0Mo5592p = z10 ? interfaceC5995e.mo5592p() : EnumC5996e0.f18939u;
            if (enumC5996e0Mo5592p == null) {
                m28802a(90);
            }
            return enumC5996e0Mo5592p;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(m28824z((InterfaceC5986b) it2.next()));
        }
        return m28823y(m28817r(hashSet), z10, interfaceC5995e.mo5592p());
    }

    /* JADX INFO: renamed from: p */
    public static Collection m28815p(Object obj, Collection collection, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        if (obj == null) {
            m28802a(97);
        }
        if (collection == null) {
            m28802a(98);
        }
        if (interfaceC0184l == null) {
            m28802a(99);
        }
        if (interfaceC0184l2 == null) {
            m28802a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC5983a interfaceC5983a = (InterfaceC5983a) interfaceC0184l.mo27m(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC5983a interfaceC5983a2 = (InterfaceC5983a) interfaceC0184l.mo27m(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a aVarM28822x = m28822x(interfaceC5983a, interfaceC5983a2);
                if (aVarM28822x == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarM28822x == i.a.CONFLICT) {
                    interfaceC0184l2.mo27m(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static Collection m28816q(InterfaceC5986b interfaceC5986b, Queue queue, AbstractC7264n abstractC7264n) {
        if (interfaceC5986b == null) {
            m28802a(HttpStatusCodesKt.HTTP_PROCESSING);
        }
        if (queue == null) {
            m28802a(HttpStatusCodesKt.HTTP_EARLY_HINTS);
        }
        if (abstractC7264n == null) {
            m28802a(Opcodes.IMUL);
        }
        return m28815p(interfaceC5986b, queue, new f(), new g(abstractC7264n, interfaceC5986b));
    }

    /* JADX INFO: renamed from: r */
    public static Set m28817r(Set set) {
        if (set == null) {
            m28802a(8);
        }
        return m28818s(set, !set.isEmpty() && AbstractC9211e.m35870y(AbstractC9211e.m35864s((InterfaceC6019m) set.iterator().next())), null, new b());
    }

    /* JADX INFO: renamed from: s */
    public static Set m28818s(Set set, boolean z10, InterfaceC0173a interfaceC0173a, InterfaceC0188p interfaceC0188p) {
        if (set == null) {
            m28802a(9);
        }
        if (interfaceC0188p == null) {
            m28802a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                C4711r c4711r = (C4711r) interfaceC0188p.invoke(obj, it.next());
                InterfaceC5983a interfaceC5983a = (InterfaceC5983a) c4711r.m18792a();
                InterfaceC5983a interfaceC5983a2 = (InterfaceC5983a) c4711r.m18793b();
                if (!m28799J(interfaceC5983a, interfaceC5983a2, z10, true)) {
                    if (m28799J(interfaceC5983a2, interfaceC5983a, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: t */
    public static Collection m28819t(InterfaceC5995e interfaceC5995e, Collection collection) {
        if (interfaceC5995e == null) {
            m28802a(94);
        }
        if (collection == null) {
            m28802a(95);
        }
        List listM20569f0 = AbstractC5081g0.m20569f0(collection, new e(interfaceC5995e));
        if (listM20569f0 == null) {
            m28802a(96);
        }
        return listM20569f0;
    }

    /* JADX INFO: renamed from: u */
    public static AbstractC6043u m28820u(Collection collection) {
        AbstractC6043u abstractC6043u;
        if (collection == null) {
            m28802a(107);
        }
        if (collection.isEmpty()) {
            return AbstractC6040t.f18993l;
        }
        Iterator it = collection.iterator();
        loop0: while (true) {
            abstractC6043u = null;
            while (it.hasNext()) {
                AbstractC6043u abstractC6043uMo5587g = ((InterfaceC5986b) it.next()).mo5587g();
                if (abstractC6043u != null) {
                    Integer numM24075d = AbstractC6040t.m24075d(abstractC6043uMo5587g, abstractC6043u);
                    if (numM24075d == null) {
                        break;
                    }
                    if (numM24075d.intValue() > 0) {
                    }
                }
                abstractC6043u = abstractC6043uMo5587g;
            }
        }
        if (abstractC6043u == null) {
            return null;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numM24075d2 = AbstractC6040t.m24075d(abstractC6043u, ((InterfaceC5986b) it2.next()).mo5587g());
            if (numM24075d2 == null || numM24075d2.intValue() < 0) {
                return null;
            }
        }
        return abstractC6043u;
    }

    /* JADX INFO: renamed from: w */
    public static i m28821w(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
        boolean z10;
        if (interfaceC5983a == null) {
            m28802a(38);
        }
        if (interfaceC5983a2 == null) {
            m28802a(39);
        }
        boolean z11 = interfaceC5983a instanceof InterfaceC6056z;
        if ((z11 && !(interfaceC5983a2 instanceof InterfaceC6056z)) || (((z10 = interfaceC5983a instanceof InterfaceC6055y0)) && !(interfaceC5983a2 instanceof InterfaceC6055y0))) {
            return i.m28840d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            C0307f.m923a("This type of CallableDescriptor cannot be checked for overridability: ", interfaceC5983a);
            return null;
        }
        if (!interfaceC5983a.getName().equals(interfaceC5983a2.getName())) {
            return i.m28840d("Name mismatch");
        }
        i iVarM28806e = m28806e(interfaceC5983a, interfaceC5983a2);
        if (iVarM28806e != null) {
            return iVarM28806e;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static i.a m28822x(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2) {
        C7265o c7265o = f24143f;
        i.a aVarM28842c = c7265o.m28825D(interfaceC5983a2, interfaceC5983a, null).m28842c();
        i.a aVarM28842c2 = c7265o.m28825D(interfaceC5983a, interfaceC5983a2, null).m28842c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarM28842c == aVar && aVarM28842c2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarM28842c == aVar2 || aVarM28842c2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    /* JADX INFO: renamed from: y */
    public static EnumC5996e0 m28823y(Collection collection, boolean z10, EnumC5996e0 enumC5996e0) {
        if (collection == null) {
            m28802a(91);
        }
        if (enumC5996e0 == null) {
            m28802a(92);
        }
        EnumC5996e0 enumC5996e02 = EnumC5996e0.f18939u;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC5986b interfaceC5986b = (InterfaceC5986b) it.next();
            EnumC5996e0 enumC5996e0Mo5592p = (z10 && interfaceC5986b.mo5592p() == EnumC5996e0.f18939u) ? enumC5996e0 : interfaceC5986b.mo5592p();
            if (enumC5996e0Mo5592p.compareTo(enumC5996e02) < 0) {
                enumC5996e02 = enumC5996e0Mo5592p;
            }
        }
        if (enumC5996e02 == null) {
            m28802a(93);
        }
        return enumC5996e02;
    }

    /* JADX INFO: renamed from: z */
    public static Set m28824z(InterfaceC5986b interfaceC5986b) {
        if (interfaceC5986b == null) {
            m28802a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m28807f(interfaceC5986b, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: D */
    public i m28825D(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC5995e interfaceC5995e) {
        if (interfaceC5983a == null) {
            m28802a(19);
        }
        if (interfaceC5983a2 == null) {
            m28802a(20);
        }
        i iVarM28826E = m28826E(interfaceC5983a, interfaceC5983a2, interfaceC5995e, false);
        if (iVarM28826E == null) {
            m28802a(21);
        }
        return iVarM28826E;
    }

    /* JADX INFO: renamed from: E */
    public i m28826E(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC5995e interfaceC5995e, boolean z10) {
        if (interfaceC5983a == null) {
            m28802a(22);
        }
        if (interfaceC5983a2 == null) {
            m28802a(23);
        }
        i iVarM28827F = m28827F(interfaceC5983a, interfaceC5983a2, z10);
        boolean z11 = iVarM28827F.m28842c() == i.a.OVERRIDABLE;
        for (InterfaceC7260j interfaceC7260j : f24142e) {
            if (interfaceC7260j.mo28774a() != InterfaceC7260j.a.CONFLICTS_ONLY && (!z11 || interfaceC7260j.mo28774a() != InterfaceC7260j.a.SUCCESS_ONLY)) {
                int i10 = h.f24153a[interfaceC7260j.mo28775b(interfaceC5983a, interfaceC5983a2, interfaceC5995e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarM28840d = i.m28840d("External condition");
                    if (iVarM28840d == null) {
                        m28802a(24);
                    }
                    return iVarM28840d;
                }
            }
        }
        if (!z11) {
            return iVarM28827F;
        }
        for (InterfaceC7260j interfaceC7260j2 : f24142e) {
            if (interfaceC7260j2.mo28774a() == InterfaceC7260j.a.CONFLICTS_ONLY) {
                int i11 = h.f24153a[interfaceC7260j2.mo28775b(interfaceC5983a, interfaceC5983a2, interfaceC5995e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC7260j2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarM28840d2 = i.m28840d("External condition");
                    if (iVarM28840d2 == null) {
                        m28802a(26);
                    }
                    return iVarM28840d2;
                }
            }
        }
        i iVarM28841e = i.m28841e();
        if (iVarM28841e == null) {
            m28802a(27);
        }
        return iVarM28841e;
    }

    /* JADX INFO: renamed from: F */
    public i m28827F(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, boolean z10) {
        if (interfaceC5983a == null) {
            m28802a(28);
        }
        if (interfaceC5983a2 == null) {
            m28802a(29);
        }
        i iVarM28821w = m28821w(interfaceC5983a, interfaceC5983a2);
        if (iVarM28821w != null) {
            return iVarM28821w;
        }
        List listM28808g = m28808g(interfaceC5983a);
        List listM28808g2 = m28808g(interfaceC5983a2);
        List typeParameters = interfaceC5983a.getTypeParameters();
        List typeParameters2 = interfaceC5983a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listM28808g.size()) {
                if (!InterfaceC2947f.f7782a.mo10841d((AbstractC2706r0) listM28808g.get(i10), (AbstractC2706r0) listM28808g2.get(i10))) {
                    i iVarM28840d = i.m28840d("Type parameter number mismatch");
                    if (iVarM28840d == null) {
                        m28802a(31);
                    }
                    return iVarM28840d;
                }
                i10++;
            }
            i iVarM28839b = i.m28839b("Type parameter number mismatch");
            if (iVarM28839b == null) {
                m28802a(32);
            }
            return iVarM28839b;
        }
        C2713t1 c2713t1M28828l = m28828l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!m28804c((InterfaceC6018l1) typeParameters.get(i11), (InterfaceC6018l1) typeParameters2.get(i11), c2713t1M28828l)) {
                i iVarM28840d2 = i.m28840d("Type parameter bounds mismatch");
                if (iVarM28840d2 == null) {
                    m28802a(33);
                }
                return iVarM28840d2;
            }
        }
        while (i10 < listM28808g.size()) {
            if (!m28805d((AbstractC2706r0) listM28808g.get(i10), (AbstractC2706r0) listM28808g2.get(i10), c2713t1M28828l)) {
                i iVarM28840d3 = i.m28840d("Value parameter type mismatch");
                if (iVarM28840d3 == null) {
                    m28802a(34);
                }
                return iVarM28840d3;
            }
            i10++;
        }
        if ((interfaceC5983a instanceof InterfaceC6056z) && (interfaceC5983a2 instanceof InterfaceC6056z) && ((InterfaceC6056z) interfaceC5983a).mo7423n() != ((InterfaceC6056z) interfaceC5983a2).mo7423n()) {
            i iVarM28839b2 = i.m28839b("Incompatible suspendability");
            if (iVarM28839b2 == null) {
                m28802a(35);
            }
            return iVarM28839b2;
        }
        if (z10) {
            AbstractC2706r0 abstractC2706r0Mo12675f = interfaceC5983a.mo12675f();
            AbstractC2706r0 abstractC2706r0Mo12675f2 = interfaceC5983a2.mo12675f();
            if (abstractC2706r0Mo12675f != null && abstractC2706r0Mo12675f2 != null && ((!AbstractC2718v0.m9643a(abstractC2706r0Mo12675f2) || !AbstractC2718v0.m9643a(abstractC2706r0Mo12675f)) && !C2664g.f6996a.m9424t(c2713t1M28828l, abstractC2706r0Mo12675f2.mo9510W0(), abstractC2706r0Mo12675f.mo9510W0()))) {
                i iVarM28839b3 = i.m28839b("Return type mismatch");
                if (iVarM28839b3 == null) {
                    m28802a(36);
                }
                return iVarM28839b3;
            }
        }
        i iVarM28841e = i.m28841e();
        if (iVarM28841e == null) {
            m28802a(37);
        }
        return iVarM28841e;
    }

    /* JADX INFO: renamed from: l */
    public final C2713t1 m28828l(List list, List list2) {
        if (list == null) {
            m28802a(40);
        }
        if (list2 == null) {
            m28802a(41);
        }
        if (list.isEmpty()) {
            C2713t1 c2713t1Mo10956z0 = new C7267q(null, this.f24147c, this.f24145a, this.f24146b, this.f24148d).mo10956z0(true, true, false);
            if (c2713t1Mo10956z0 == null) {
                m28802a(42);
            }
            return c2713t1Mo10956z0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((InterfaceC6018l1) list.get(i10)).mo5591o(), ((InterfaceC6018l1) list2.get(i10)).mo5591o());
        }
        C2713t1 c2713t1Mo10956z02 = new C7267q(map, this.f24147c, this.f24145a, this.f24146b, this.f24148d).mo10956z0(true, true, false);
        if (c2713t1Mo10956z02 == null) {
            m28802a(43);
        }
        return c2713t1Mo10956z02;
    }

    /* JADX INFO: renamed from: o */
    public final Collection m28829o(InterfaceC5986b interfaceC5986b, Collection collection, InterfaceC5995e interfaceC5995e, AbstractC7264n abstractC7264n) {
        if (interfaceC5986b == null) {
            m28802a(57);
        }
        if (collection == null) {
            m28802a(58);
        }
        if (interfaceC5995e == null) {
            m28802a(59);
        }
        if (abstractC7264n == null) {
            m28802a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C6380k c6380kM25378c = C6380k.m25378c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC5986b interfaceC5986b2 = (InterfaceC5986b) it.next();
            i.a aVarM28842c = m28825D(interfaceC5986b2, interfaceC5986b, interfaceC5995e).m28842c();
            boolean zM28798I = m28798I(interfaceC5986b, interfaceC5986b2, false);
            int i10 = h.f24154b[aVarM28842c.ordinal()];
            if (i10 == 1) {
                if (zM28798I) {
                    c6380kM25378c.add(interfaceC5986b2);
                }
                arrayList.add(interfaceC5986b2);
            } else if (i10 == 2) {
                if (zM28798I) {
                    abstractC7264n.mo28791c(interfaceC5986b2, interfaceC5986b);
                }
                arrayList.add(interfaceC5986b2);
            }
        }
        abstractC7264n.mo28792d(interfaceC5986b, c6380kM25378c);
        return arrayList;
    }

    /* JADX INFO: renamed from: v */
    public void m28830v(C5695f c5695f, Collection collection, Collection collection2, InterfaceC5995e interfaceC5995e, AbstractC7264n abstractC7264n) {
        if (c5695f == null) {
            m28802a(50);
        }
        if (collection == null) {
            m28802a(51);
        }
        if (collection2 == null) {
            m28802a(52);
        }
        if (interfaceC5995e == null) {
            m28802a(53);
        }
        if (abstractC7264n == null) {
            m28802a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(m28829o((InterfaceC5986b) it.next(), collection, interfaceC5995e, abstractC7264n));
        }
        m28812k(interfaceC5995e, linkedHashSet, abstractC7264n);
    }

    /* JADX INFO: renamed from: sa.o$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d implements InterfaceC0184l {
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5986b mo27m(InterfaceC5986b interfaceC5986b) {
            return interfaceC5986b;
        }
    }

    /* JADX INFO: renamed from: sa.o$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f implements InterfaceC0184l {
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5983a mo27m(InterfaceC5986b interfaceC5986b) {
            return interfaceC5986b;
        }
    }
}

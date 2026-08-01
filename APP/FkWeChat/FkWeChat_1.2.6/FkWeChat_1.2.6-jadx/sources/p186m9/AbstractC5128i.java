package p186m9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2650c1;
import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import gb.AbstractC2707r1;
import gb.C2651c2;
import gb.C2715u0;
import gb.EnumC2691m2;
import gb.InterfaceC2643a2;
import gb.InterfaceC2716u1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.HttpStatusCodesKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p082fb.InterfaceC2405g;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p186m9.C5135p;
import p199n9.C5519a;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;
import p229p9.AbstractC6037s;
import p229p9.AbstractC6054y;
import p229p9.InterfaceC5985a1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6057z0;
import p243q9.InterfaceC6333h;
import p254r5.C6494d0;
import p258r9.InterfaceC6545a;
import p258r9.InterfaceC6547c;
import p273s9.C7212f0;
import p327wa.AbstractC9211e;
import p342x9.EnumC9470d;
import sa.AbstractC7259i;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: m9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5128i {

    /* JADX INFO: renamed from: g */
    public static final C5695f f15441g = C5695f.m23029m("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public C7212f0 f15442a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2407i f15443b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2407i f15444c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2407i f15445d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2405g f15446e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2412n f15447f;

    /* JADX INFO: renamed from: m9.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements InterfaceC0173a {
        public a() {
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection invoke() {
            return Arrays.asList(AbstractC5128i.this.m20930s().mo12666e0(C5135p.f15488A), AbstractC5128i.this.m20930s().mo12666e0(C5135p.f15490C), AbstractC5128i.this.m20930s().mo12666e0(C5135p.f15491D), AbstractC5128i.this.m20930s().mo12666e0(C5135p.f15489B));
        }
    }

    /* JADX INFO: renamed from: m9.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements InterfaceC0173a {
        public b() {
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(EnumC5132m.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (EnumC5132m enumC5132m : EnumC5132m.values()) {
                AbstractC2650c1 abstractC2650c1M20929r = AbstractC5128i.this.m20929r(enumC5132m.m20952l().m23030c());
                AbstractC2650c1 abstractC2650c1M20929r2 = AbstractC5128i.this.m20929r(enumC5132m.m20950j().m23030c());
                enumMap.put(enumC5132m, abstractC2650c1M20929r2);
                map.put(abstractC2650c1M20929r, abstractC2650c1M20929r2);
                map2.put(abstractC2650c1M20929r2, abstractC2650c1M20929r);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: renamed from: m9.i$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class c implements InterfaceC0184l {
        public c() {
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC5995e mo27m(C5695f c5695f) {
            InterfaceC6004h interfaceC6004hMo5518f = AbstractC5128i.this.m20931t().mo5518f(c5695f, EnumC9470d.f32176t);
            if (interfaceC6004hMo5518f == null) {
                C5129j.m20943a("Built-in class ", C5135p.f15488A.m22995b(c5695f), " is not found");
                return null;
            }
            if (interfaceC6004hMo5518f instanceof InterfaceC5995e) {
                return (InterfaceC5995e) interfaceC6004hMo5518f;
            }
            throw new AssertionError("Must be a class descriptor " + c5695f + ", but was " + interfaceC6004hMo5518f);
        }
    }

    /* JADX INFO: renamed from: m9.i$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class d implements InterfaceC0173a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C7212f0 f15451q;

        public d(C7212f0 c7212f0) {
            this.f15451q = c7212f0;
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            C7212f0 c7212f0 = AbstractC5128i.this.f15442a;
            AbstractC5128i abstractC5128i = AbstractC5128i.this;
            if (c7212f0 == null) {
                abstractC5128i.f15442a = this.f15451q;
                return null;
            }
            StringBuilder sb2 = new StringBuilder("Built-ins module is already set: ");
            sb2.append(abstractC5128i.f15442a);
            C7212f0 c7212f02 = this.f15451q;
            sb2.append(" (attempting to reset to ");
            sb2.append(c7212f02);
            sb2.append(")");
            throw new AssertionError(sb2.toString());
        }
    }

    public AbstractC5128i(InterfaceC2412n interfaceC2412n) {
        if (interfaceC2412n == null) {
            m20863a(0);
        }
        this.f15447f = interfaceC2412n;
        this.f15445d = interfaceC2412n.mo8663f(new a());
        this.f15444c = interfaceC2412n.mo8663f(new b());
        this.f15446e = interfaceC2412n.mo8659b(new c());
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m20854A0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.LXOR);
        }
        return m20876j0(abstractC2706r0, C5135p.a.f15545K0.m23002i());
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC2706r0 m20855B(AbstractC2706r0 abstractC2706r0, InterfaceC6005h0 interfaceC6005h0) {
        C5691b c5691bM35859n;
        C5691b c5691bM20982a;
        InterfaceC5995e interfaceC5995eM24112b;
        if (abstractC2706r0 == null) {
            m20863a(71);
        }
        if (interfaceC6005h0 == null) {
            m20863a(72);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u == null) {
            return null;
        }
        C5139t c5139t = C5139t.f15642a;
        if (!c5139t.m20983b(interfaceC6004hMo5602u.getName()) || (c5691bM35859n = AbstractC9211e.m35859n(interfaceC6004hMo5602u)) == null || (c5691bM20982a = c5139t.m20982a(c5691bM35859n)) == null || (interfaceC5995eM24112b = AbstractC6054y.m24112b(interfaceC6005h0, c5691bM20982a)) == null) {
            return null;
        }
        return interfaceC5995eM24112b.mo7508x();
    }

    /* JADX INFO: renamed from: B0 */
    public static boolean m20856B0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.LOR);
        }
        return m20876j0(abstractC2706r0, C5135p.a.f15541I0.m23002i());
    }

    /* JADX INFO: renamed from: C0 */
    public static boolean m20857C0(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m20863a(10);
        }
        while (interfaceC6019m != null) {
            if (interfaceC6019m instanceof InterfaceC6023n0) {
                return ((InterfaceC6023n0) interfaceC6019m).mo24031d().m23001h(C5135p.f15523z);
            }
            interfaceC6019m = interfaceC6019m.mo7443b();
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m20858D0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.D2I);
        }
        return m20880n0(abstractC2706r0, C5135p.a.f15582f);
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m20859E0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.IINC);
        }
        return m20891y0(abstractC2706r0) || m20856B0(abstractC2706r0) || m20892z0(abstractC2706r0) || m20854A0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: O */
    public static EnumC5132m m20860O(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(92);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u == null) {
            return null;
        }
        return m20861Q(interfaceC6004hMo5602u);
    }

    /* JADX INFO: renamed from: Q */
    public static EnumC5132m m20861Q(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m20863a(77);
        }
        if (C5135p.a.f15563T0.contains(interfaceC6019m.getName())) {
            return (EnumC5132m) C5135p.a.f15567V0.get(AbstractC7259i.m28760m(interfaceC6019m));
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static EnumC5132m m20862T(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m20863a(76);
        }
        if (C5135p.a.f15561S0.contains(interfaceC6019m.getName())) {
            return (EnumC5132m) C5135p.a.f15565U0.get(AbstractC7259i.m28760m(interfaceC6019m));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m20863a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p186m9.AbstractC5128i.m20863a(int):void");
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m20865b0(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m20863a(Opcodes.IDIV);
        }
        return m20870e(interfaceC5995e, C5135p.a.f15574b);
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m20867c0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.F2I);
        }
        return m20875i0(abstractC2706r0, C5135p.a.f15574b);
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m20869d0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(88);
        }
        return m20875i0(abstractC2706r0, C5135p.a.f15588i);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20870e(InterfaceC6004h interfaceC6004h, C5693d c5693d) {
        if (interfaceC6004h == null) {
            m20863a(HttpStatusCodesKt.HTTP_EARLY_HINTS);
        }
        if (c5693d == null) {
            m20863a(Opcodes.IMUL);
        }
        return interfaceC6004h.getName().equals(c5693d.m23013j()) && c5693d.equals(AbstractC7259i.m28760m(interfaceC6004h));
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m20871e0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(90);
        }
        return m20869d0(abstractC2706r0) || m20884r0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m20872f0(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m20863a(89);
        }
        return m20870e(interfaceC5995e, C5135p.a.f15588i) || m20861Q(interfaceC5995e) != null;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m20873g0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(110);
        }
        return m20876j0(abstractC2706r0, C5135p.a.f15590j);
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m20874h0(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m20863a(9);
        }
        return AbstractC7259i.m28765r(interfaceC6019m, InterfaceC5122c.class, false) != null;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m20875i0(AbstractC2706r0 abstractC2706r0, C5693d c5693d) {
        if (abstractC2706r0 == null) {
            m20863a(97);
        }
        if (c5693d == null) {
            m20863a(98);
        }
        return m20890x0(abstractC2706r0.mo9332T0(), c5693d);
    }

    /* JADX INFO: renamed from: j0 */
    public static boolean m20876j0(AbstractC2706r0 abstractC2706r0, C5693d c5693d) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.I2F);
        }
        if (c5693d == null) {
            m20863a(Opcodes.I2D);
        }
        return m20875i0(abstractC2706r0, c5693d) && !abstractC2706r0.mo9258U0();
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m20877k0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(141);
        }
        return m20883q0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m20878l0(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m20863a(Opcodes.IF_ICMPNE);
        }
        if (interfaceC6019m.mo12664a().getAnnotations().mo3927i(C5135p.a.f15620y)) {
            return true;
        }
        if (interfaceC6019m instanceof InterfaceC6055y0) {
            InterfaceC6055y0 interfaceC6055y0 = (InterfaceC6055y0) interfaceC6019m;
            boolean zMo12681n0 = interfaceC6055y0.mo12681n0();
            InterfaceC6057z0 interfaceC6057z0Mo12676h = interfaceC6055y0.mo12676h();
            InterfaceC5985a1 interfaceC5985a1Mo12677i = interfaceC6055y0.mo12677i();
            if (interfaceC6057z0Mo12676h != null && m20878l0(interfaceC6057z0Mo12676h) && (!zMo12681n0 || (interfaceC5985a1Mo12677i != null && m20878l0(interfaceC5985a1Mo12677i)))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m20879m0(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m20863a(Opcodes.IFLE);
        }
        return m20870e(interfaceC5995e, C5135p.a.f15595l0);
    }

    /* JADX INFO: renamed from: n0 */
    public static boolean m20880n0(AbstractC2706r0 abstractC2706r0, C5693d c5693d) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.LMUL);
        }
        if (c5693d == null) {
            m20863a(106);
        }
        return !abstractC2706r0.mo9258U0() && m20875i0(abstractC2706r0, c5693d);
    }

    /* JADX INFO: renamed from: o0 */
    public static boolean m20881o0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.L2I);
        }
        return m20882p0(abstractC2706r0) && !AbstractC2675i2.m9464l(abstractC2706r0);
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m20882p0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(138);
        }
        return m20875i0(abstractC2706r0, C5135p.a.f15576c);
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m20883q0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.F2L);
        }
        return m20867c0(abstractC2706r0) && abstractC2706r0.mo9258U0();
    }

    /* JADX INFO: renamed from: r0 */
    public static boolean m20884r0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(91);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        return (interfaceC6004hMo5602u == null || m20861Q(interfaceC6004hMo5602u) == null) ? false : true;
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m20885s0(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m20863a(96);
        }
        return m20862T(interfaceC5995e) != null;
    }

    /* JADX INFO: renamed from: t0 */
    public static boolean m20886t0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(94);
        }
        return !abstractC2706r0.mo9258U0() && m20887u0(abstractC2706r0);
    }

    /* JADX INFO: renamed from: u0 */
    public static boolean m20887u0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(95);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        return (interfaceC6004hMo5602u instanceof InterfaceC5995e) && m20885s0((InterfaceC5995e) interfaceC6004hMo5602u);
    }

    /* JADX INFO: renamed from: v0 */
    public static boolean m20888v0(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m20863a(107);
        }
        return m20870e(interfaceC5995e, C5135p.a.f15574b) || m20870e(interfaceC5995e, C5135p.a.f15576c);
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m20889w0(AbstractC2706r0 abstractC2706r0) {
        return abstractC2706r0 != null && m20880n0(abstractC2706r0, C5135p.a.f15586h);
    }

    /* JADX INFO: renamed from: x0 */
    public static boolean m20890x0(InterfaceC2716u1 interfaceC2716u1, C5693d c5693d) {
        if (interfaceC2716u1 == null) {
            m20863a(101);
        }
        if (c5693d == null) {
            m20863a(HttpStatusCodesKt.HTTP_PROCESSING);
        }
        InterfaceC6004h interfaceC6004hMo5602u = interfaceC2716u1.mo5602u();
        return (interfaceC6004hMo5602u instanceof InterfaceC5995e) && m20870e(interfaceC6004hMo5602u, c5693d);
    }

    /* JADX INFO: renamed from: y0 */
    public static boolean m20891y0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(128);
        }
        return m20876j0(abstractC2706r0, C5135p.a.f15539H0.m23002i());
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m20892z0(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(Opcodes.IXOR);
        }
        return m20876j0(abstractC2706r0, C5135p.a.f15543J0.m23002i());
    }

    /* JADX INFO: renamed from: A */
    public AbstractC2650c1 m20893A() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15461D);
        if (abstractC2650c1M20909S == null) {
            m20863a(62);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: C */
    public AbstractC2650c1 m20894C() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15459B);
        if (abstractC2650c1M20909S == null) {
            m20863a(61);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: D */
    public InterfaceC5995e m20895D(int i10) {
        return m20928q(C5135p.m20962b(i10));
    }

    /* JADX INFO: renamed from: E */
    public AbstractC2650c1 m20896E() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15458A);
        if (abstractC2650c1M20909S == null) {
            m20863a(59);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: F */
    public InterfaceC5995e m20897F() {
        InterfaceC5995e interfaceC5995eM20927p = m20927p(C5135p.a.f15595l0.m23016m());
        if (interfaceC5995eM20927p == null) {
            m20863a(21);
        }
        return interfaceC5995eM20927p;
    }

    /* JADX INFO: renamed from: F0 */
    public void m20898F0(C7212f0 c7212f0) {
        if (c7212f0 == null) {
            m20863a(1);
        }
        this.f15447f.mo8664g(new d(c7212f0));
    }

    /* JADX INFO: renamed from: G */
    public AbstractC2650c1 m20899G() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15460C);
        if (abstractC2650c1M20909S == null) {
            m20863a(60);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: H */
    public InterfaceC5995e m20900H() {
        return m20928q("Nothing");
    }

    /* JADX INFO: renamed from: I */
    public AbstractC2650c1 m20901I() {
        AbstractC2650c1 abstractC2650c1Mo7508x = m20900H().mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(49);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: J */
    public AbstractC2650c1 m20902J() {
        AbstractC2650c1 abstractC2650c1Mo9259a1 = m20920i().mo7032X0(true);
        if (abstractC2650c1Mo9259a1 == null) {
            m20863a(52);
        }
        return abstractC2650c1Mo9259a1;
    }

    /* JADX INFO: renamed from: K */
    public AbstractC2650c1 m20903K() {
        AbstractC2650c1 abstractC2650c1Mo9259a1 = m20901I().mo7032X0(true);
        if (abstractC2650c1Mo9259a1 == null) {
            m20863a(50);
        }
        return abstractC2650c1Mo9259a1;
    }

    /* JADX INFO: renamed from: L */
    public InterfaceC5995e m20904L() {
        return m20928q("Number");
    }

    /* JADX INFO: renamed from: M */
    public AbstractC2650c1 m20905M() {
        AbstractC2650c1 abstractC2650c1Mo7508x = m20904L().mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(56);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: N */
    public InterfaceC6547c mo20906N() {
        InterfaceC6547c.b bVar = InterfaceC6547c.b.f20500a;
        if (bVar == null) {
            m20863a(4);
        }
        return bVar;
    }

    /* JADX INFO: renamed from: P */
    public AbstractC2650c1 m20907P(EnumC5132m enumC5132m) {
        if (enumC5132m == null) {
            m20863a(73);
        }
        AbstractC2650c1 abstractC2650c1 = (AbstractC2650c1) ((e) this.f15444c.invoke()).f15453a.get(enumC5132m);
        if (abstractC2650c1 == null) {
            m20863a(74);
        }
        return abstractC2650c1;
    }

    /* JADX INFO: renamed from: R */
    public final InterfaceC5995e m20908R(EnumC5132m enumC5132m) {
        if (enumC5132m == null) {
            m20863a(16);
        }
        return m20928q(enumC5132m.m20952l().m23030c());
    }

    /* JADX INFO: renamed from: S */
    public AbstractC2650c1 m20909S(EnumC5132m enumC5132m) {
        if (enumC5132m == null) {
            m20863a(54);
        }
        AbstractC2650c1 abstractC2650c1Mo7508x = m20908R(enumC5132m).mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(55);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: U */
    public AbstractC2650c1 m20910U() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15469z);
        if (abstractC2650c1M20909S == null) {
            m20863a(58);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: V */
    public InterfaceC2412n m20911V() {
        InterfaceC2412n interfaceC2412n = this.f15447f;
        if (interfaceC2412n == null) {
            m20863a(6);
        }
        return interfaceC2412n;
    }

    /* JADX INFO: renamed from: W */
    public InterfaceC5995e m20912W() {
        return m20928q("String");
    }

    /* JADX INFO: renamed from: X */
    public AbstractC2650c1 m20913X() {
        AbstractC2650c1 abstractC2650c1Mo7508x = m20912W().mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(66);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: Y */
    public InterfaceC5995e m20914Y(int i10) {
        InterfaceC5995e interfaceC5995eM20927p = m20927p(C5135p.f15516s.m22995b(C5695f.m23027j(C5135p.m20964d(i10))));
        if (interfaceC5995eM20927p == null) {
            m20863a(18);
        }
        return interfaceC5995eM20927p;
    }

    /* JADX INFO: renamed from: Z */
    public InterfaceC5995e m20915Z() {
        return m20928q("Unit");
    }

    /* JADX INFO: renamed from: a0 */
    public AbstractC2650c1 m20916a0() {
        AbstractC2650c1 abstractC2650c1Mo7508x = m20915Z().mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(65);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: f */
    public void m20917f(boolean z10) {
        C7212f0 c7212f0 = new C7212f0(f15441g, this.f15447f, this, null);
        this.f15442a = c7212f0;
        c7212f0.m28464U0(InterfaceC5121b.f15433a.m20825c().mo7044a(this.f15447f, this.f15442a, mo20934w(), mo20906N(), mo20918g(), z10));
        C7212f0 c7212f02 = this.f15442a;
        c7212f02.m28469c1(c7212f02);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC6545a mo20918g() {
        InterfaceC6545a.a aVar = InterfaceC6545a.a.f20498a;
        if (aVar == null) {
            m20863a(3);
        }
        return aVar;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC5995e m20919h() {
        return m20928q("Any");
    }

    /* JADX INFO: renamed from: i */
    public AbstractC2650c1 m20920i() {
        AbstractC2650c1 abstractC2650c1Mo7508x = m20919h().mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(51);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC5995e m20921j() {
        return m20928q("Array");
    }

    /* JADX INFO: renamed from: k */
    public AbstractC2706r0 m20922k(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m20863a(68);
        }
        AbstractC2706r0 abstractC2706r0M20923l = m20923l(abstractC2706r0);
        if (abstractC2706r0M20923l != null) {
            return abstractC2706r0M20923l;
        }
        C6494d0.m25749a("not array: ", abstractC2706r0);
        return null;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC2706r0 m20923l(AbstractC2706r0 abstractC2706r0) {
        AbstractC2706r0 abstractC2706r0M20855B;
        if (abstractC2706r0 == null) {
            m20863a(70);
        }
        if (m20869d0(abstractC2706r0)) {
            if (abstractC2706r0.mo9330R0().size() != 1) {
                return null;
            }
            return ((InterfaceC2643a2) abstractC2706r0.mo9330R0().get(0)).getType();
        }
        AbstractC2706r0 abstractC2706r0M9466n = AbstractC2675i2.m9466n(abstractC2706r0);
        AbstractC2706r0 abstractC2706r02 = (AbstractC2706r0) ((e) this.f15444c.invoke()).f15455c.get(abstractC2706r0M9466n);
        if (abstractC2706r02 != null) {
            return abstractC2706r02;
        }
        InterfaceC6005h0 interfaceC6005h0M28755h = AbstractC7259i.m28755h(abstractC2706r0M9466n);
        if (interfaceC6005h0M28755h == null || (abstractC2706r0M20855B = m20855B(abstractC2706r0M9466n, interfaceC6005h0M28755h)) == null) {
            return null;
        }
        return abstractC2706r0M20855B;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC2650c1 m20924m(EnumC2691m2 enumC2691m2, AbstractC2706r0 abstractC2706r0) {
        if (enumC2691m2 == null) {
            m20863a(82);
        }
        if (abstractC2706r0 == null) {
            m20863a(83);
        }
        AbstractC2650c1 abstractC2650c1M20925n = m20925n(enumC2691m2, abstractC2706r0, InterfaceC6333h.f19873o.m25003b());
        if (abstractC2650c1M20925n == null) {
            m20863a(84);
        }
        return abstractC2650c1M20925n;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC2650c1 m20925n(EnumC2691m2 enumC2691m2, AbstractC2706r0 abstractC2706r0, InterfaceC6333h interfaceC6333h) {
        if (enumC2691m2 == null) {
            m20863a(78);
        }
        if (abstractC2706r0 == null) {
            m20863a(79);
        }
        if (interfaceC6333h == null) {
            m20863a(80);
        }
        AbstractC2650c1 abstractC2650c1M9626h = C2715u0.m9626h(AbstractC2707r1.m9589b(interfaceC6333h), m20921j(), Collections.singletonList(new C2651c2(enumC2691m2, abstractC2706r0)));
        if (abstractC2650c1M9626h == null) {
            m20863a(81);
        }
        return abstractC2650c1M9626h;
    }

    /* JADX INFO: renamed from: o */
    public AbstractC2650c1 m20926o() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15466w);
        if (abstractC2650c1M20909S == null) {
            m20863a(64);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC5995e m20927p(C5692c c5692c) {
        if (c5692c == null) {
            m20863a(12);
        }
        InterfaceC5995e interfaceC5995eM24063d = AbstractC6037s.m24063d(m20930s(), c5692c, EnumC9470d.f32176t);
        if (interfaceC5995eM24063d == null) {
            m20863a(13);
        }
        return interfaceC5995eM24063d;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC5995e m20928q(String str) {
        if (str == null) {
            m20863a(14);
        }
        InterfaceC5995e interfaceC5995e = (InterfaceC5995e) this.f15446e.mo27m(C5695f.m23027j(str));
        if (interfaceC5995e == null) {
            m20863a(15);
        }
        return interfaceC5995e;
    }

    /* JADX INFO: renamed from: r */
    public final AbstractC2650c1 m20929r(String str) {
        if (str == null) {
            m20863a(47);
        }
        AbstractC2650c1 abstractC2650c1Mo7508x = m20928q(str).mo7508x();
        if (abstractC2650c1Mo7508x == null) {
            m20863a(48);
        }
        return abstractC2650c1Mo7508x;
    }

    /* JADX INFO: renamed from: s */
    public C7212f0 m20930s() {
        if (this.f15442a == null) {
            this.f15442a = (C7212f0) this.f15443b.invoke();
        }
        C7212f0 c7212f0 = this.f15442a;
        if (c7212f0 == null) {
            m20863a(7);
        }
        return c7212f0;
    }

    /* JADX INFO: renamed from: t */
    public InterfaceC9913k m20931t() {
        InterfaceC9913k interfaceC9913kMo24098v = m20930s().mo12666e0(C5135p.f15488A).mo24098v();
        if (interfaceC9913kMo24098v == null) {
            m20863a(11);
        }
        return interfaceC9913kMo24098v;
    }

    /* JADX INFO: renamed from: u */
    public AbstractC2650c1 m20932u() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15468y);
        if (abstractC2650c1M20909S == null) {
            m20863a(57);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: v */
    public AbstractC2650c1 m20933v() {
        AbstractC2650c1 abstractC2650c1M20909S = m20909S(EnumC5132m.f15467x);
        if (abstractC2650c1M20909S == null) {
            m20863a(63);
        }
        return abstractC2650c1M20909S;
    }

    /* JADX INFO: renamed from: w */
    public Iterable mo20934w() {
        List listSingletonList = Collections.singletonList(new C5519a(this.f15447f, m20930s()));
        if (listSingletonList == null) {
            m20863a(5);
        }
        return listSingletonList;
    }

    /* JADX INFO: renamed from: x */
    public InterfaceC5995e m20935x() {
        InterfaceC5995e interfaceC5995eM20927p = m20927p(C5135p.a.f15569X);
        if (interfaceC5995eM20927p == null) {
            m20863a(35);
        }
        return interfaceC5995eM20927p;
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC5995e m20936y() {
        return m20928q("Comparable");
    }

    /* JADX INFO: renamed from: z */
    public AbstractC2650c1 m20937z() {
        AbstractC2650c1 abstractC2650c1M20902J = m20902J();
        if (abstractC2650c1M20902J == null) {
            m20863a(53);
        }
        return abstractC2650c1M20902J;
    }

    /* JADX INFO: renamed from: m9.i$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final Map f15453a;

        /* JADX INFO: renamed from: b */
        public final Map f15454b;

        /* JADX INFO: renamed from: c */
        public final Map f15455c;

        public e(Map map, Map map2, Map map3) {
            if (map == null) {
                m20942a(0);
            }
            if (map2 == null) {
                m20942a(1);
            }
            if (map3 == null) {
                m20942a(2);
            }
            this.f15453a = map;
            this.f15454b = map2;
            this.f15455c = map3;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20942a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }
    }
}

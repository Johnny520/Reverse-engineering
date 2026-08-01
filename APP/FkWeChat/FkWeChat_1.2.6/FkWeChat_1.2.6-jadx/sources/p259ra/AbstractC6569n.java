package p259ra;

import gb.AbstractC2706r0;
import gb.InterfaceC2643a2;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p185m8.AbstractC5068b1;
import p186m9.AbstractC5128i;
import p213oa.C5693d;
import p213oa.C5695f;
import p215oc.C5725t;
import p215oc.C5729x;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6007i;
import p229p9.InterfaceC6015k1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6039s1;
import p243q9.EnumC6330e;
import p243q9.InterfaceC6328c;
import p259ra.InterfaceC6551b;
import p343xa.C9475e;

/* JADX INFO: renamed from: ra.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6569n {

    /* JADX INFO: renamed from: a */
    public static final a f20545a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC6569n f20546b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC6569n f20547c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC6569n f20548d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC6569n f20549e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC6569n f20550f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC6569n f20551g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC6569n f20552h;

    /* JADX INFO: renamed from: i */
    public static final AbstractC6569n f20553i;

    /* JADX INFO: renamed from: j */
    public static final AbstractC6569n f20554j;

    /* JADX INFO: renamed from: k */
    public static final AbstractC6569n f20555k;

    /* JADX INFO: renamed from: l */
    public static final AbstractC6569n f20556l;

    /* JADX INFO: renamed from: ra.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {

        /* JADX INFO: renamed from: ra.n$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a implements b {

            /* JADX INFO: renamed from: a */
            public static final a f20558a = new a();

            @Override // p259ra.AbstractC6569n.b
            /* JADX INFO: renamed from: a */
            public void mo25916a(InterfaceC6039s1 interfaceC6039s1, int i10, int i11, StringBuilder sb2) {
                interfaceC6039s1.getClass();
                sb2.getClass();
                if (i10 != i11 - 1) {
                    sb2.append(", ");
                }
            }

            @Override // p259ra.AbstractC6569n.b
            /* JADX INFO: renamed from: b */
            public void mo25917b(InterfaceC6039s1 interfaceC6039s1, int i10, int i11, StringBuilder sb2) {
                interfaceC6039s1.getClass();
                sb2.getClass();
            }

            @Override // p259ra.AbstractC6569n.b
            /* JADX INFO: renamed from: c */
            public void mo25918c(int i10, StringBuilder sb2) {
                sb2.getClass();
                sb2.append("(");
            }

            @Override // p259ra.AbstractC6569n.b
            /* JADX INFO: renamed from: d */
            public void mo25919d(int i10, StringBuilder sb2) {
                sb2.getClass();
                sb2.append(")");
            }
        }

        /* JADX INFO: renamed from: a */
        void mo25916a(InterfaceC6039s1 interfaceC6039s1, int i10, int i11, StringBuilder sb2);

        /* JADX INFO: renamed from: b */
        void mo25917b(InterfaceC6039s1 interfaceC6039s1, int i10, int i11, StringBuilder sb2);

        /* JADX INFO: renamed from: c */
        void mo25918c(int i10, StringBuilder sb2);

        /* JADX INFO: renamed from: d */
        void mo25919d(int i10, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f20545a = aVar;
        f20546b = aVar.m25915b(C6553c.f20515q);
        f20547c = aVar.m25915b(C6557e.f20527q);
        f20548d = aVar.m25915b(C6559f.f20533q);
        f20549e = aVar.m25915b(C6561g.f20538q);
        f20550f = aVar.m25915b(C6563h.f20539q);
        f20551g = aVar.m25915b(C6564i.f20540q);
        f20552h = aVar.m25915b(C6565j.f20541q);
        f20553i = aVar.m25915b(C6566k.f20542q);
        f20554j = aVar.m25915b(C6567l.f20543q);
        f20555k = aVar.m25915b(C6568m.f20544q);
        f20556l = aVar.m25915b(C6555d.f20521q);
    }

    /* JADX INFO: renamed from: A */
    public static final C4700i0 m25883A(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26015e(AbstractC5068b1.m20483e());
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ String m25895O(AbstractC6569n abstractC6569n, InterfaceC6328c interfaceC6328c, EnumC6330e enumC6330e, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: renderAnnotation");
            return null;
        }
        if ((i10 & 2) != 0) {
            enumC6330e = null;
        }
        return abstractC6569n.mo25907N(interfaceC6328c, enumC6330e);
    }

    /* JADX INFO: renamed from: q */
    public static final C4700i0 m25896q(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26018f(false);
        interfaceC6578w.mo26015e(AbstractC5068b1.m20483e());
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: r */
    public static final C4700i0 m25897r(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26018f(false);
        interfaceC6578w.mo26015e(AbstractC5068b1.m20483e());
        interfaceC6578w.mo26024h(true);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: s */
    public static final C4700i0 m25898s(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26018f(false);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: t */
    public static final C4700i0 m25899t(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26015e(AbstractC5068b1.m20483e());
        interfaceC6578w.mo26027i(InterfaceC6551b.b.f20512a);
        interfaceC6578w.mo26006b(EnumC6556d0.f20523r);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: u */
    public static final C4700i0 m25900u(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26030j(true);
        interfaceC6578w.mo26027i(InterfaceC6551b.a.f20511a);
        interfaceC6578w.mo26015e(EnumC6577v.f20583t);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: v */
    public static final C4700i0 m25901v(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26015e(EnumC6577v.f20582s);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: w */
    public static final C4700i0 m25902w(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26015e(EnumC6577v.f20583t);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: x */
    public static final C4700i0 m25903x(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26003a(EnumC6560f0.f20535r);
        interfaceC6578w.mo26015e(EnumC6577v.f20583t);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: y */
    public static final C4700i0 m25904y(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26018f(false);
        interfaceC6578w.mo26015e(AbstractC5068b1.m20483e());
        interfaceC6578w.mo26027i(InterfaceC6551b.b.f20512a);
        interfaceC6578w.mo26049p(true);
        interfaceC6578w.mo26006b(EnumC6556d0.f20524s);
        interfaceC6578w.mo26036l(true);
        interfaceC6578w.mo26033k(true);
        interfaceC6578w.mo26024h(true);
        interfaceC6578w.mo26012d(true);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: z */
    public static final C4700i0 m25905z(InterfaceC6578w interfaceC6578w) {
        interfaceC6578w.getClass();
        interfaceC6578w.mo26027i(InterfaceC6551b.b.f20512a);
        interfaceC6578w.mo26006b(EnumC6556d0.f20523r);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: M */
    public abstract String mo25906M(InterfaceC6019m interfaceC6019m);

    /* JADX INFO: renamed from: N */
    public abstract String mo25907N(InterfaceC6328c interfaceC6328c, EnumC6330e enumC6330e);

    /* JADX INFO: renamed from: P */
    public abstract String mo25908P(String str, String str2, AbstractC5128i abstractC5128i);

    /* JADX INFO: renamed from: Q */
    public abstract String mo25909Q(C5693d c5693d);

    /* JADX INFO: renamed from: R */
    public abstract String mo25910R(C5695f c5695f, boolean z10);

    /* JADX INFO: renamed from: S */
    public abstract String mo25911S(AbstractC2706r0 abstractC2706r0);

    /* JADX INFO: renamed from: T */
    public abstract String mo25912T(InterfaceC2643a2 interfaceC2643a2);

    /* JADX INFO: renamed from: U */
    public final AbstractC6569n m25913U(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        C6581z c6581zM26144s = ((C6576u) this).m25971K0().m26144s();
        interfaceC0184l.mo27m(c6581zM26144s);
        c6581zM26144s.m26142q0();
        return new C6576u(c6581zM26144s);
    }

    /* JADX INFO: renamed from: ra.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: ra.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public /* synthetic */ class C10189a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f20557a;

            static {
                int[] iArr = new int[EnumC5998f.values().length];
                try {
                    iArr[EnumC5998f.f18948r.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5998f.f18949s.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5998f.f18950t.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC5998f.f18953w.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC5998f.f18952v.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC5998f.f18951u.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f20557a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m25914a(InterfaceC6007i interfaceC6007i) {
            interfaceC6007i.getClass();
            if (interfaceC6007i instanceof InterfaceC6015k1) {
                return "typealias";
            }
            if (!(interfaceC6007i instanceof InterfaceC5995e)) {
                C9475e.m36910a("Unexpected classifier: ", interfaceC6007i);
                return null;
            }
            InterfaceC5995e interfaceC5995e = (InterfaceC5995e) interfaceC6007i;
            if (interfaceC5995e.mo5568D()) {
                return "companion object";
            }
            switch (C10189a.f20557a[interfaceC5995e.mo5588j().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    C5729x.m23182a();
                    return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC6569n m25915b(InterfaceC0184l interfaceC0184l) {
            interfaceC0184l.getClass();
            C6581z c6581z = new C6581z();
            interfaceC0184l.mo27m(c6581z);
            c6581z.m26142q0();
            return new C6576u(c6581z);
        }

        public a() {
        }
    }
}

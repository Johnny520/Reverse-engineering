package gb;

import java.util.ArrayDeque;
import java.util.Set;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p160kb.InterfaceC4224d;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4238r;
import p215oc.C5725t;
import p244qb.C6380k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: gb.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2713t1 {

    /* JADX INFO: renamed from: a */
    public final boolean f7084a;

    /* JADX INFO: renamed from: b */
    public final boolean f7085b;

    /* JADX INFO: renamed from: c */
    public final boolean f7086c;

    /* JADX INFO: renamed from: d */
    public final boolean f7087d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4238r f7088e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2702q f7089f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2705r f7090g;

    /* JADX INFO: renamed from: h */
    public int f7091h;

    /* JADX INFO: renamed from: i */
    public boolean f7092i;

    /* JADX INFO: renamed from: j */
    public ArrayDeque f7093j;

    /* JADX INFO: renamed from: k */
    public Set f7094k;

    /* JADX INFO: renamed from: gb.t1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {

        /* JADX INFO: renamed from: gb.t1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10085a implements a {

            /* JADX INFO: renamed from: a */
            public boolean f7095a;

            @Override // gb.C2713t1.a
            /* JADX INFO: renamed from: a */
            public void mo9615a(InterfaceC0173a interfaceC0173a) {
                interfaceC0173a.getClass();
                if (this.f7095a) {
                    return;
                }
                this.f7095a = ((Boolean) interfaceC0173a.invoke()).booleanValue();
            }

            /* JADX INFO: renamed from: b */
            public final boolean m9616b() {
                return this.f7095a;
            }
        }

        /* JADX INFO: renamed from: a */
        void mo9615a(InterfaceC0173a interfaceC0173a);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: gb.t1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: q */
        public static final b f7096q = new b("CHECK_ONLY_LOWER", 0);

        /* JADX INFO: renamed from: r */
        public static final b f7097r = new b("CHECK_SUBTYPE_AND_LOWER", 1);

        /* JADX INFO: renamed from: s */
        public static final b f7098s = new b("SKIP_LOWER", 2);

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ b[] f7099t;

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ InterfaceC7197a f7100u;

        static {
            b[] bVarArrM9617a = m9617a();
            f7099t = bVarArrM9617a;
            f7100u = AbstractC7198b.m28437a(bVarArrM9617a);
        }

        public b(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ b[] m9617a() {
            return new b[]{f7096q, f7097r, f7098s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f7099t.clone();
        }
    }

    public C2713t1(boolean z10, boolean z11, boolean z12, boolean z13, InterfaceC4238r interfaceC4238r, AbstractC2702q abstractC2702q, AbstractC2705r abstractC2705r) {
        interfaceC4238r.getClass();
        abstractC2702q.getClass();
        abstractC2705r.getClass();
        this.f7084a = z10;
        this.f7085b = z11;
        this.f7086c = z12;
        this.f7087d = z13;
        this.f7088e = interfaceC4238r;
        this.f7089f = abstractC2702q;
        this.f7090g = abstractC2705r;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m9599d(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
            return null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c2713t1.m9600c(interfaceC4229i, interfaceC4229i2, z10);
    }

    /* JADX INFO: renamed from: c */
    public Boolean m9600c(InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2, boolean z10) {
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m9601e() {
        ArrayDeque arrayDeque = this.f7093j;
        arrayDeque.getClass();
        arrayDeque.clear();
        Set set = this.f7094k;
        set.getClass();
        set.clear();
        this.f7092i = false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo9602f(InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2) {
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public b m9603g(InterfaceC4230j interfaceC4230j, InterfaceC4224d interfaceC4224d) {
        interfaceC4230j.getClass();
        interfaceC4224d.getClass();
        return b.f7097r;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayDeque m9604h() {
        return this.f7093j;
    }

    /* JADX INFO: renamed from: i */
    public final Set m9605i() {
        return this.f7094k;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC4238r m9606j() {
        return this.f7088e;
    }

    /* JADX INFO: renamed from: k */
    public final void m9607k() {
        this.f7092i = true;
        if (this.f7093j == null) {
            this.f7093j = new ArrayDeque(4);
        }
        if (this.f7094k == null) {
            this.f7094k = C6380k.f20125s.m25381a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9608l(InterfaceC4229i interfaceC4229i) {
        interfaceC4229i.getClass();
        return this.f7087d && this.f7088e.mo10896H0(interfaceC4229i);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m9609m() {
        return this.f7086c;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m9610n() {
        return this.f7084a;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m9611o() {
        return this.f7085b;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC4229i m9612p(InterfaceC4229i interfaceC4229i) {
        interfaceC4229i.getClass();
        return this.f7089f.mo9561a(interfaceC4229i);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC4229i m9613q(InterfaceC4229i interfaceC4229i) {
        interfaceC4229i.getClass();
        return this.f7090g.mo9586a(interfaceC4229i);
    }

    /* JADX INFO: renamed from: r */
    public boolean m9614r(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        a.C10085a c10085a = new a.C10085a();
        interfaceC0184l.mo27m(c10085a);
        return c10085a.m9616b();
    }

    /* JADX INFO: renamed from: gb.t1$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class c {

        /* JADX INFO: renamed from: gb.t1$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: gb.t1$c$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends c {

            /* JADX INFO: renamed from: a */
            public static final b f7101a = new b();

            public b() {
                super(null);
            }

            @Override // gb.C2713t1.c
            /* JADX INFO: renamed from: a */
            public InterfaceC4230j mo9618a(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i) {
                c2713t1.getClass();
                interfaceC4229i.getClass();
                return c2713t1.m9606j().mo10942s0(interfaceC4229i);
            }
        }

        /* JADX INFO: renamed from: gb.t1$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10086c extends c {

            /* JADX INFO: renamed from: a */
            public static final C10086c f7102a = new C10086c();

            public C10086c() {
                super(null);
            }

            @Override // gb.C2713t1.c
            /* JADX INFO: renamed from: a */
            public /* bridge */ /* synthetic */ InterfaceC4230j mo9618a(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i) {
                return (InterfaceC4230j) m9619b(c2713t1, interfaceC4229i);
            }

            /* JADX INFO: renamed from: b */
            public Void m9619b(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i) {
                c2713t1.getClass();
                interfaceC4229i.getClass();
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: gb.t1$c$d */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class d extends c {

            /* JADX INFO: renamed from: a */
            public static final d f7103a = new d();

            public d() {
                super(null);
            }

            @Override // gb.C2713t1.c
            /* JADX INFO: renamed from: a */
            public InterfaceC4230j mo9618a(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i) {
                c2713t1.getClass();
                interfaceC4229i.getClass();
                return c2713t1.m9606j().mo10893F0(interfaceC4229i);
            }
        }

        public /* synthetic */ c(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC4230j mo9618a(C2713t1 c2713t1, InterfaceC4229i interfaceC4229i);

        public c() {
        }
    }
}

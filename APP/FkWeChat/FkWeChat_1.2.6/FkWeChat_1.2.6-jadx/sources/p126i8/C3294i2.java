package p126i8;

import ec.AbstractC2204y;
import ec.InterfaceC2193v0;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p126i8.C3294i2;
import p141j8.AbstractC3645v;
import p141j8.C3623b0;
import p157k8.AbstractC4119o;
import p157k8.C4035c1;
import p157k8.C4058f1;
import p157k8.C4072h1;
import p157k8.C4079i1;
import p157k8.C4083i5;
import p157k8.C4104l5;
import p157k8.C4112n;
import p157k8.C4127p0;
import p157k8.InterfaceC4150s2;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p314vb.C8898e;
import p339x6.C9450c;
import p344xb.C9479b;
import p375zc.AbstractC9957l;
import p375zc.C9950h0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i8.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3294i2 extends AbstractC3645v {

    /* JADX INFO: renamed from: m */
    public final C4035c1 f8965m;

    /* JADX INFO: renamed from: n */
    public final String f8966n;

    /* JADX INFO: renamed from: o */
    public final String f8967o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0173a f8968p;

    /* JADX INFO: renamed from: q */
    public InterfaceC0173a f8969q;

    /* JADX INFO: renamed from: r */
    public C4112n f8970r;

    /* JADX INFO: renamed from: s */
    public C4035c1 f8971s;

    /* JADX INFO: renamed from: t */
    public final C4083i5 f8972t;

    /* JADX INFO: renamed from: u */
    public volatile /* synthetic */ Object f8973u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC3251a f8974v;

    /* JADX INFO: renamed from: i8.i2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f8975q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f8976r;

        public a(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C4058f1 c4058f1 = (C4058f1) this.f8976r;
            AbstractC6325c.m24992g();
            if (this.f8975q == 0) {
                AbstractC4713t.m18808b(obj);
                return C3294i2.this.m12430Z(c4058f1);
            }
            C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C4058f1 c4058f1, C3623b0 c3623b0, InterfaceC5976f interfaceC5976f) {
            a aVar = C3294i2.this.new a(interfaceC5976f);
            aVar.f8976r = c4058f1;
            return aVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX INFO: renamed from: i8.i2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public int f8978q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f8979r;

        public b(InterfaceC5976f interfaceC5976f) {
            super(3, interfaceC5976f);
        }

        /* JADX INFO: renamed from: r */
        public static Object m12435r(C4104l5 c4104l5) {
            return "Logging level set to: " + c4104l5.getParams().getLevel();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            final C4104l5 c4104l5 = (C4104l5) this.f8979r;
            AbstractC6325c.m24992g();
            if (this.f8978q != 0) {
                C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4713t.m18808b(obj);
            C3294i2.this.f8973u = c4104l5.getParams().getLevel();
            AbstractC3306l2.f8993a.mo22822c(new InterfaceC0173a() { // from class: i8.j2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3294i2.b.m12435r(c4104l5);
                }
            });
            return new C4127p0((C9950h0) null, 1, (AbstractC1043k) (0 == true ? 1 : 0));
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object mo236e(C4104l5 c4104l5, C3623b0 c3623b0, InterfaceC5976f interfaceC5976f) {
            b bVar = C3294i2.this.new b(interfaceC5976f);
            bVar.f8979r = c4104l5;
            return bVar.invokeSuspend(C4700i0.f13910a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3294i2(C4035c1 c4035c1, C3345v1 c3345v1, String str) {
        super(c3345v1);
        c4035c1.getClass();
        c3345v1.getClass();
        this.f8965m = c4035c1;
        this.f8966n = str;
        this.f8967o = C9479b.f32211s.m36931f().toString();
        this.f8968p = new InterfaceC0173a() { // from class: i8.h2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12418O();
            }
        };
        this.f8969q = new InterfaceC0173a() { // from class: i8.x1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12415L();
            }
        };
        this.f8972t = c3345v1.m12540a();
        this.f8973u = null;
        m13593J(InterfaceC4150s2.c.f12199s, new a(null));
        m13592I(InterfaceC4150s2.c.f12181C, new InterfaceC0184l() { // from class: i8.y1
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C3294i2.m12417N(this.f9149q, (C4079i1) obj);
            }
        });
        if (c3345v1.m12540a().getLogging() != null) {
            m13593J(InterfaceC4150s2.c.f12191M, new b(null));
        }
        this.f8974v = new C3256b(this);
    }

    /* JADX INFO: renamed from: K */
    public static C4700i0 m12414K(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2) {
        interfaceC0173a.invoke();
        interfaceC0173a2.invoke();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: L */
    public static C4700i0 m12415L() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: M */
    public static Object m12416M() {
        return "Server connection closing";
    }

    /* JADX INFO: renamed from: N */
    public static InterfaceC2193v0 m12417N(C3294i2 c3294i2, C4079i1 c4079i1) {
        c4079i1.getClass();
        c3294i2.f8968p.invoke();
        return AbstractC2204y.m7935b(C4700i0.f13910a);
    }

    /* JADX INFO: renamed from: O */
    public static C4700i0 m12418O() {
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: P */
    public static Object m12419P(InterfaceC4150s2 interfaceC4150s2) {
        return "Asserting notification capability for method: " + interfaceC4150s2.getValue();
    }

    /* JADX INFO: renamed from: Q */
    public static Object m12420Q() {
        return "Handling initialization request from client";
    }

    /* JADX INFO: renamed from: R */
    public static Object m12421R(InterfaceC4150s2 interfaceC4150s2) {
        return "Server does not support logging (required for " + interfaceC4150s2 + ")";
    }

    /* JADX INFO: renamed from: S */
    public static Object m12422S() {
        return "Server capability assertion failed: logging not supported";
    }

    /* JADX INFO: renamed from: T */
    public static Object m12423T(String str) {
        return "Client requested unsupported protocol version " + str + ", falling back to 2025-06-18";
    }

    /* JADX INFO: renamed from: U */
    public static Object m12424U(InterfaceC4150s2 interfaceC4150s2) {
        return "Asserting request handler capability for method: " + interfaceC4150s2.getValue();
    }

    /* JADX INFO: renamed from: V */
    public static Object m12425V() {
        return "Server capability assertion failed: sampling not supported";
    }

    @Override // p141j8.AbstractC3645v
    /* JADX INFO: renamed from: C */
    public void mo12427C() {
        AbstractC3306l2.f8993a.mo22822c(new InterfaceC0173a() { // from class: i8.b2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12416M();
            }
        });
        this.f8969q.invoke();
    }

    /* JADX INFO: renamed from: X */
    public final InterfaceC3251a m12428X() {
        return this.f8974v;
    }

    /* JADX INFO: renamed from: Y */
    public final String m12429Y() {
        return this.f8967o;
    }

    /* JADX INFO: renamed from: Z */
    public final C4072h1 m12430Z(C4058f1 c4058f1) {
        AbstractC3306l2.f8993a.mo22822c(new InterfaceC0173a() { // from class: i8.c2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12420Q();
            }
        });
        this.f8970r = c4058f1.getParams().getCapabilities();
        this.f8971s = c4058f1.getParams().getClientInfo();
        final String protocolVersion = c4058f1.getParams().getProtocolVersion();
        if (!AbstractC4119o.m16339a().contains(protocolVersion)) {
            AbstractC3306l2.f8993a.mo22826g(new InterfaceC0173a() { // from class: i8.d2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3294i2.m12423T(protocolVersion);
                }
            });
            protocolVersion = "2025-06-18";
        }
        return new C4072h1(protocolVersion, this.f8972t, this.f8965m, this.f8966n, (C9950h0) null, 16, (AbstractC1043k) null);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12431a0(final InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        final InterfaceC0173a interfaceC0173a2 = this.f8969q;
        this.f8969q = new InterfaceC0173a() { // from class: i8.g2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12414K(interfaceC0173a2, interfaceC0173a);
            }
        };
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3294i2) {
            return AbstractC1061t.m3842c(this.f8967o, ((C3294i2) obj).f8967o);
        }
        return false;
    }

    public int hashCode() {
        return this.f8967o.hashCode();
    }

    @Override // p141j8.AbstractC3645v
    /* JADX INFO: renamed from: t */
    public void mo12432t(final InterfaceC4150s2 interfaceC4150s2) {
        interfaceC4150s2.getClass();
        AbstractC3306l2.f8993a.mo22820a(new InterfaceC0173a() { // from class: i8.e2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12419P(interfaceC4150s2);
            }
        });
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12183E) {
            if (this.f8972t.getLogging() != null) {
                return;
            }
            AbstractC3306l2.f8993a.mo22825f(new InterfaceC0173a() { // from class: i8.f2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3294i2.m12422S();
                }
            });
            C9450c.m36816a("Server does not support logging (required for ", interfaceC4150s2.getValue(), ")");
            return;
        }
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12184F || interfaceC4150s2 == InterfaceC4150s2.c.f12185G) {
            if (this.f8972t.getResources() != null) {
                return;
            }
            C9450c.m36816a("Server does not support notifying about resources (required for ", interfaceC4150s2.getValue(), ")");
        } else if (interfaceC4150s2 == InterfaceC4150s2.c.f12186H) {
            if (this.f8972t.getTools() != null) {
                return;
            }
            C9450c.m36816a("Server does not support notifying of tool list changes (required for ", interfaceC4150s2.getValue(), ")");
        } else if (interfaceC4150s2 != InterfaceC4150s2.c.f12188J) {
            InterfaceC4150s2.c.Companion companion = InterfaceC4150s2.c.INSTANCE;
        } else {
            if (this.f8972t.getPrompts() != null) {
                return;
            }
            C9450c.m36816a("Server does not support notifying of prompt list changes (required for ", interfaceC4150s2.getValue(), ")");
        }
    }

    @Override // p141j8.AbstractC3645v
    /* JADX INFO: renamed from: u */
    public void mo12433u(final InterfaceC4150s2 interfaceC4150s2) {
        interfaceC4150s2.getClass();
        AbstractC3306l2.f8993a.mo22820a(new InterfaceC0173a() { // from class: i8.w1
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C3294i2.m12424U(interfaceC4150s2);
            }
        });
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12192N) {
            C9950h0 experimental = this.f8972t.getExperimental();
            if ((experimental != null ? (AbstractC9957l) experimental.get("sampling") : null) != null) {
                return;
            }
            AbstractC3306l2.f8993a.mo22825f(new InterfaceC0173a() { // from class: i8.z1
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3294i2.m12425V();
                }
            });
            C8898e.m34135a("Server does not support sampling (required for ", interfaceC4150s2, ")");
            return;
        }
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12191M) {
            if (this.f8972t.getLogging() != null) {
                return;
            }
            AbstractC3306l2.f8993a.mo22825f(new InterfaceC0173a() { // from class: i8.a2
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C3294i2.m12421R(interfaceC4150s2);
                }
            });
            C8898e.m34135a("Server does not support logging (required for ", interfaceC4150s2, ")");
            return;
        }
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12179A || interfaceC4150s2 == InterfaceC4150s2.c.f12206z) {
            if (this.f8972t.getPrompts() != null) {
                return;
            }
            C8898e.m34135a("Server does not support prompts (required for ", interfaceC4150s2, ")");
            return;
        }
        if (interfaceC4150s2 == InterfaceC4150s2.c.f12201u || interfaceC4150s2 == InterfaceC4150s2.c.f12202v || interfaceC4150s2 == InterfaceC4150s2.c.f12203w || interfaceC4150s2 == InterfaceC4150s2.c.f12204x || interfaceC4150s2 == InterfaceC4150s2.c.f12205y) {
            if (this.f8972t.getResources() != null) {
                return;
            }
            C8898e.m34135a("Server does not support resources (required for ", interfaceC4150s2, ")");
        } else if (interfaceC4150s2 != InterfaceC4150s2.c.f12190L && interfaceC4150s2 != InterfaceC4150s2.c.f12189K) {
            InterfaceC4150s2.c.Companion companion = InterfaceC4150s2.c.INSTANCE;
        } else {
            if (this.f8972t.getTools() != null) {
                return;
            }
            C8898e.m34135a("Server does not support tools (required for ", interfaceC4150s2, ")");
        }
    }
}

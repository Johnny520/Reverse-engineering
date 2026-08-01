package p212o9;

import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5081g0;
import p186m9.AbstractC5128i;
import p215oc.C5729x;
import p229p9.InterfaceC6005h0;
import p258r9.InterfaceC6545a;
import p258r9.InterfaceC6547c;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;
import p273s9.C7212f0;

/* JADX INFO: renamed from: o9.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5675k extends AbstractC5128i {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ InterfaceC2557k[] f17833k = {AbstractC1052o0.m3814i(new C1038h0(C5675k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h */
    public final a f17834h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0173a f17835i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2407i f17836j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o9.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f17837q = new a("FROM_DEPENDENCIES", 0);

        /* JADX INFO: renamed from: r */
        public static final a f17838r = new a("FROM_CLASS_LOADER", 1);

        /* JADX INFO: renamed from: s */
        public static final a f17839s = new a("FALLBACK", 2);

        /* JADX INFO: renamed from: t */
        public static final /* synthetic */ a[] f17840t;

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ InterfaceC7197a f17841u;

        static {
            a[] aVarArrM22924a = m22924a();
            f17840t = aVarArrM22924a;
            f17841u = AbstractC7198b.m28437a(aVarArrM22924a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m22924a() {
            return new a[]{f17837q, f17838r, f17839s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f17840t.clone();
        }
    }

    /* JADX INFO: renamed from: o9.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6005h0 f17842a;

        /* JADX INFO: renamed from: b */
        public final boolean f17843b;

        public b(InterfaceC6005h0 interfaceC6005h0, boolean z10) {
            interfaceC6005h0.getClass();
            this.f17842a = interfaceC6005h0;
            this.f17843b = z10;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC6005h0 m22925a() {
            return this.f17842a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m22926b() {
            return this.f17843b;
        }
    }

    /* JADX INFO: renamed from: o9.k$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17844a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f17837q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f17838r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f17839s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17844a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5675k(InterfaceC2412n interfaceC2412n, a aVar) {
        super(interfaceC2412n);
        interfaceC2412n.getClass();
        aVar.getClass();
        this.f17834h = aVar;
        this.f17836j = interfaceC2412n.mo8663f(new C5672h(this, interfaceC2412n));
        int i10 = c.f17844a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                m20917f(false);
            } else if (i10 == 3) {
                m20917f(true);
            } else {
                C5729x.m23182a();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final C5685u m22917J0(C5675k c5675k, InterfaceC2412n interfaceC2412n) {
        C7212f0 c7212f0M20930s = c5675k.m20930s();
        c7212f0M20930s.getClass();
        return new C5685u(c7212f0M20930s, interfaceC2412n, new C5674j(c5675k));
    }

    /* JADX INFO: renamed from: K0 */
    public static final b m22918K0(C5675k c5675k) {
        InterfaceC0173a interfaceC0173a = c5675k.f17835i;
        if (interfaceC0173a == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) interfaceC0173a.invoke();
        c5675k.f17835i = null;
        return bVar;
    }

    /* JADX INFO: renamed from: O0 */
    public static final b m22919O0(InterfaceC6005h0 interfaceC6005h0, boolean z10) {
        return new b(interfaceC6005h0, z10);
    }

    @Override // p186m9.AbstractC5128i
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List mo20934w() {
        Iterable iterableMo20934w = super.mo20934w();
        iterableMo20934w.getClass();
        InterfaceC2412n interfaceC2412nM20911V = m20911V();
        interfaceC2412nM20911V.getClass();
        C7212f0 c7212f0M20930s = m20930s();
        c7212f0M20930s.getClass();
        return AbstractC5081g0.m20532D0(iterableMo20934w, new C5671g(interfaceC2412nM20911V, c7212f0M20930s, null, 4, null));
    }

    /* JADX INFO: renamed from: M0 */
    public final C5685u m22921M0() {
        return (C5685u) AbstractC2411m.m8702a(this.f17836j, this, f17833k[0]);
    }

    @Override // p186m9.AbstractC5128i
    /* JADX INFO: renamed from: N */
    public InterfaceC6547c mo20906N() {
        return m22921M0();
    }

    /* JADX INFO: renamed from: N0 */
    public final void m22922N0(InterfaceC6005h0 interfaceC6005h0, boolean z10) {
        interfaceC6005h0.getClass();
        m22923P0(new C5673i(interfaceC6005h0, z10));
    }

    /* JADX INFO: renamed from: P0 */
    public final void m22923P0(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        this.f17835i = interfaceC0173a;
    }

    @Override // p186m9.AbstractC5128i
    /* JADX INFO: renamed from: g */
    public InterfaceC6545a mo20918g() {
        return m22921M0();
    }
}

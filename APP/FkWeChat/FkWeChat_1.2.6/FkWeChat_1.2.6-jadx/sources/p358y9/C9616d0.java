package p358y9;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.C1055q;
import p213oa.C5692c;

/* JADX INFO: renamed from: y9.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9616d0 {

    /* JADX INFO: renamed from: d */
    public static final b f32739d = new b(null);

    /* JADX INFO: renamed from: e */
    public static final C9616d0 f32740e = new C9616d0(AbstractC9612b0.m37602b(null, 1, null), a.f32744y);

    /* JADX INFO: renamed from: a */
    public final C9622g0 f32741a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f32742b;

    /* JADX INFO: renamed from: c */
    public final boolean f32743c;

    /* JADX INFO: renamed from: y9.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {

        /* JADX INFO: renamed from: y */
        public static final a f32744y = new a();

        public a() {
            super(1, AbstractC9612b0.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final EnumC9638o0 mo27m(C5692c c5692c) {
            c5692c.getClass();
            return AbstractC9612b0.m37604d(c5692c);
        }
    }

    public C9616d0(C9622g0 c9622g0, InterfaceC0184l interfaceC0184l) {
        c9622g0.getClass();
        interfaceC0184l.getClass();
        this.f32741a = c9622g0;
        this.f32742b = interfaceC0184l;
        this.f32743c = c9622g0.m37639f() || interfaceC0184l.mo27m(AbstractC9612b0.m37605e()) == EnumC9638o0.f32827s;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37622b() {
        return this.f32743c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l m37623c() {
        return this.f32742b;
    }

    /* JADX INFO: renamed from: d */
    public final C9622g0 m37624d() {
        return this.f32741a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f32741a + ", getReportLevelForAnnotation=" + this.f32742b + ')';
    }

    /* JADX INFO: renamed from: y9.d0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9616d0 m37626a() {
            return C9616d0.f32740e;
        }

        public b() {
        }
    }
}

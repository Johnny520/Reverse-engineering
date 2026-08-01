package p305v1;

import android.graphics.Matrix;
import android.graphics.Outline;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p172l8.C4700i0;
import p265s1.AbstractC7060c3;
import p265s1.AbstractC7133r1;
import p265s1.C7128q1;
import p265s1.InterfaceC7088i1;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: v1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8763d {

    /* JADX INFO: renamed from: a */
    public static final a f29184a = a.f29185a;

    /* JADX INFO: renamed from: v1.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f29185a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC0184l f29186b = C10248a.f29187r;

        /* JADX INFO: renamed from: v1.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10248a extends AbstractC1067w implements InterfaceC0184l {

            /* JADX INFO: renamed from: r */
            public static final C10248a f29187r = new C10248a();

            public C10248a() {
                super(1);
            }

            /* JADX INFO: renamed from: a */
            public final void m33719a(InterfaceC8487f interfaceC8487f) {
                InterfaceC8487f.m32658w1(interfaceC8487f, C7128q1.f23644b.m28146g(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
                m33719a((InterfaceC8487f) obj);
                return C4700i0.f13910a;
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l m33718a() {
            return f29186b;
        }
    }

    /* JADX INFO: renamed from: A */
    void mo33675A(float f10);

    /* JADX INFO: renamed from: B */
    void mo33676B(InterfaceC7088i1 interfaceC7088i1);

    /* JADX INFO: renamed from: C */
    float mo33677C();

    /* JADX INFO: renamed from: D */
    float mo33678D();

    /* JADX INFO: renamed from: E */
    void mo33679E(boolean z10);

    /* JADX INFO: renamed from: F */
    float mo33680F();

    /* JADX INFO: renamed from: G */
    long mo33681G();

    /* JADX INFO: renamed from: H */
    void mo33682H(float f10);

    /* JADX INFO: renamed from: I */
    void mo33683I(long j10);

    /* JADX INFO: renamed from: J */
    void mo33684J(AbstractC7060c3 abstractC7060c3);

    /* JADX INFO: renamed from: K */
    void mo33685K(float f10);

    /* JADX INFO: renamed from: L */
    float mo33686L();

    /* JADX INFO: renamed from: M */
    void mo33687M(float f10);

    /* JADX INFO: renamed from: N */
    void mo33688N(int i10);

    /* JADX INFO: renamed from: O */
    Matrix mo33689O();

    /* JADX INFO: renamed from: P */
    default boolean mo33690P() {
        return false;
    }

    /* JADX INFO: renamed from: Q */
    float mo33691Q();

    /* JADX INFO: renamed from: a */
    float mo33692a();

    /* JADX INFO: renamed from: b */
    void mo33693b(boolean z10);

    /* JADX INFO: renamed from: c */
    void mo33694c(int i10);

    /* JADX INFO: renamed from: d */
    AbstractC7133r1 mo33695d();

    /* JADX INFO: renamed from: e */
    void mo33696e(float f10);

    /* JADX INFO: renamed from: f */
    void mo33697f(AbstractC7133r1 abstractC7133r1);

    /* JADX INFO: renamed from: g */
    int mo33698g();

    /* JADX INFO: renamed from: h */
    void mo33699h(float f10);

    /* JADX INFO: renamed from: i */
    float mo33700i();

    /* JADX INFO: renamed from: j */
    void mo33701j(float f10);

    /* JADX INFO: renamed from: k */
    void mo33702k(float f10);

    /* JADX INFO: renamed from: l */
    AbstractC7060c3 mo33703l();

    /* JADX INFO: renamed from: m */
    void mo33704m(float f10);

    /* JADX INFO: renamed from: n */
    void mo33705n(Outline outline, long j10);

    /* JADX INFO: renamed from: o */
    void mo33706o();

    /* JADX INFO: renamed from: p */
    void mo33707p(float f10);

    /* JADX INFO: renamed from: q */
    int mo33708q();

    /* JADX INFO: renamed from: r */
    float mo33709r();

    /* JADX INFO: renamed from: s */
    float mo33710s();

    /* JADX INFO: renamed from: t */
    void mo33711t(int i10, int i11, long j10);

    /* JADX INFO: renamed from: u */
    default boolean mo33712u() {
        return true;
    }

    /* JADX INFO: renamed from: v */
    void mo33713v(InterfaceC3175e interfaceC3175e, EnumC3191u enumC3191u, C8761c c8761c, InterfaceC0184l interfaceC0184l);

    /* JADX INFO: renamed from: w */
    float mo33714w();

    /* JADX INFO: renamed from: x */
    void mo33715x(long j10);

    /* JADX INFO: renamed from: y */
    void mo33716y(long j10);

    /* JADX INFO: renamed from: z */
    long mo33717z();
}

package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0342j4 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: A */
    public static final C0342j4 f2685A;

    /* JADX INFO: renamed from: B */
    public static final C0342j4 f2686B;

    /* JADX INFO: renamed from: C */
    public static final C0342j4 f2687C;

    /* JADX INFO: renamed from: D */
    public static final C0342j4 f2688D;

    /* JADX INFO: renamed from: E */
    public static final C0342j4 f2689E;

    /* JADX INFO: renamed from: F */
    public static final C0342j4 f2690F;

    /* JADX INFO: renamed from: G */
    public static final C0342j4 f2691G;

    /* JADX INFO: renamed from: H */
    public static final C0342j4 f2692H;

    /* JADX INFO: renamed from: e */
    public static final C0342j4 f2693e;

    /* JADX INFO: renamed from: f */
    public static final C0342j4 f2694f;

    /* JADX INFO: renamed from: g */
    public static final C0342j4 f2695g;

    /* JADX INFO: renamed from: h */
    public static final C0342j4 f2696h;

    /* JADX INFO: renamed from: i */
    public static final C0342j4 f2697i;

    /* JADX INFO: renamed from: j */
    public static final C0342j4 f2698j;

    /* JADX INFO: renamed from: k */
    public static final C0342j4 f2699k;

    /* JADX INFO: renamed from: l */
    public static final C0342j4 f2700l;

    /* JADX INFO: renamed from: m */
    public static final C0342j4 f2701m;

    /* JADX INFO: renamed from: n */
    public static final C0342j4 f2702n;

    /* JADX INFO: renamed from: o */
    public static final C0342j4 f2703o;

    /* JADX INFO: renamed from: p */
    public static final C0342j4 f2704p;

    /* JADX INFO: renamed from: q */
    public static final C0342j4 f2705q;

    /* JADX INFO: renamed from: r */
    public static final C0342j4 f2706r;

    /* JADX INFO: renamed from: s */
    public static final C0342j4 f2707s;

    /* JADX INFO: renamed from: t */
    public static final C0342j4 f2708t;

    /* JADX INFO: renamed from: u */
    public static final C0342j4 f2709u;

    /* JADX INFO: renamed from: v */
    public static final C0342j4 f2710v;

    /* JADX INFO: renamed from: w */
    public static final C0342j4 f2711w;

    /* JADX INFO: renamed from: x */
    public static final C0342j4 f2712x;

    /* JADX INFO: renamed from: y */
    public static final C0342j4 f2713y;

    /* JADX INFO: renamed from: z */
    public static final C0342j4 f2714z;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2715d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        f2693e = new C0342j4(i, 0);
        f2694f = new C0342j4(i, 1);
        f2695g = new C0342j4(i, 2);
        f2696h = new C0342j4(i, 3);
        f2697i = new C0342j4(i, 4);
        f2698j = new C0342j4(i, 5);
        f2699k = new C0342j4(i, 6);
        f2700l = new C0342j4(i, 7);
        f2701m = new C0342j4(i, 8);
        f2702n = new C0342j4(i, 9);
        f2703o = new C0342j4(i, 10);
        f2704p = new C0342j4(i, 11);
        f2705q = new C0342j4(i, 12);
        f2706r = new C0342j4(i, 13);
        f2707s = new C0342j4(i, 14);
        f2708t = new C0342j4(i, 15);
        f2709u = new C0342j4(i, 16);
        f2710v = new C0342j4(i, 17);
        f2711w = new C0342j4(i, 18);
        f2712x = new C0342j4(i, 19);
        f2713y = new C0342j4(i, 20);
        f2714z = new C0342j4(i, 21);
        f2685A = new C0342j4(i, 22);
        f2686B = new C0342j4(i, 23);
        f2687C = new C0342j4(i, 24);
        f2688D = new C0342j4(i, 25);
        f2689E = new C0342j4(i, 26);
        f2690F = new C0342j4(i, 27);
        f2691G = new C0342j4(i, 28);
        f2692H = new C0342j4(i, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0342j4(int i, int i2) {
        super(i);
        this.f2715d = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() throws Throwable {
        AbstractC0030at abstractC0030atM5216a;
        InterfaceC0618pk interfaceC0618pkM1540p;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.f2715d) {
            case 0:
                AbstractC0676r4.m3379b("LocalConfiguration");
                throw null;
            case 1:
                AbstractC0676r4.m3379b("LocalContext");
                throw null;
            case 2:
                AbstractC0676r4.m3379b("LocalImageVectorCache");
                throw null;
            case 3:
                AbstractC0676r4.m3379b("LocalResourceIdCache");
                throw null;
            case 4:
                AbstractC0676r4.m3379b("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C0436lm c0436lm = AbstractC0326io.f2592a;
                    C0300hy c0300hy = ad0.f110a;
                    InterfaceC0904ww c0500n6 = new C0500n6(2, objArr == true ? 1 : 0, 0);
                    Thread threadCurrentThread = Thread.currentThread();
                    C0496n2 c0496n2 = C0496n2.f4163w;
                    AbstractC0692rk abstractC0692rk = (AbstractC0692rk) c0300hy.mo64l(c0496n2);
                    C0220fs c0220fs = C0220fs.f1799d;
                    if (abstractC0692rk == null) {
                        abstractC0030atM5216a = y71.m5216a();
                        interfaceC0618pkM1540p = AbstractC0307i4.m1540p(c0220fs, pf1.m3034J(c0300hy, abstractC0030atM5216a), true);
                        C0436lm c0436lm2 = AbstractC0326io.f2592a;
                        if (interfaceC0618pkM1540p != c0436lm2 && interfaceC0618pkM1540p.mo64l(c0496n2) == null) {
                            interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm2);
                        }
                    } else {
                        abstractC0030atM5216a = (AbstractC0030at) y71.f7566a.get();
                        interfaceC0618pkM1540p = AbstractC0307i4.m1540p(c0220fs, c0300hy, true);
                        C0436lm c0436lm3 = AbstractC0326io.f2592a;
                        if (interfaceC0618pkM1540p != c0436lm3 && interfaceC0618pkM1540p.mo64l(c0496n2) == null) {
                            interfaceC0618pkM1540p = interfaceC0618pkM1540p.mo63h(c0436lm3);
                        }
                    }
                    C0467ma c0467ma = new C0467ma(interfaceC0618pkM1540p, threadCurrentThread, abstractC0030atM5216a);
                    c0467ma.m3990l0(EnumC0059bl.f538d, c0467ma, c0500n6);
                    AbstractC0030at abstractC0030at = c0467ma.f3893j;
                    if (abstractC0030at != null) {
                        int i = AbstractC0030at.f260i;
                        abstractC0030at.m203m(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jMo204q = abstractC0030at != null ? abstractC0030at.mo204q() : Long.MAX_VALUE;
                            if (c0467ma.m1622N() instanceof y00) {
                                LockSupport.parkNanos(c0467ma, jMo204q);
                            } else {
                                if (abstractC0030at != null) {
                                    int i2 = AbstractC0030at.f260i;
                                    abstractC0030at.m201j(false);
                                }
                                Object objM4034U = s91.m4034U(c0467ma.m1622N());
                                C0688rg c0688rg = objM4034U instanceof C0688rg ? (C0688rg) objM4034U : null;
                                if (c0688rg != null) {
                                    throw c0688rg.f5416a;
                                }
                                choreographer = (Choreographer) objM4034U;
                            }
                        } catch (Throwable th) {
                            if (abstractC0030at != null) {
                                int i3 = AbstractC0030at.f260i;
                                abstractC0030at.m201j(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    c0467ma.m1612A(interruptedException);
                    throw interruptedException;
                } else {
                    choreographer = Choreographer.getInstance();
                }
                C0641q6 c0641q6 = new C0641q6(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return pf1.m3034J(c0641q6, c0641q6.f5055o);
            case 9:
            case 10:
                return null;
            case 11:
                AbstractC0131dj.m716b("LocalAutofillManager");
                throw null;
            case 12:
                AbstractC0131dj.m716b("LocalAutofillTree");
                throw null;
            case 13:
                AbstractC0131dj.m716b("LocalClipboard");
                throw null;
            case 14:
                AbstractC0131dj.m716b("LocalClipboardManager");
                throw null;
            case j50.f2734e /* 15 */:
                return Boolean.TRUE;
            case 16:
                AbstractC0131dj.m716b("LocalDensity");
                throw null;
            case 17:
                AbstractC0131dj.m716b("LocalFocusManager");
                throw null;
            case 18:
                AbstractC0131dj.m716b("LocalFontFamilyResolver");
                throw null;
            case 19:
                AbstractC0131dj.m716b("LocalFontLoader");
                throw null;
            case 20:
                AbstractC0131dj.m716b("LocalGraphicsContext");
                throw null;
            case 21:
                AbstractC0131dj.m716b("LocalHapticFeedback");
                throw null;
            case 22:
                AbstractC0131dj.m716b("LocalInputManager");
                throw null;
            case 23:
                AbstractC0131dj.m716b("LocalLayoutDirection");
                throw null;
            case 24:
                return null;
            case 25:
                return Boolean.FALSE;
            case 26:
            case 27:
                return null;
            case 28:
                AbstractC0131dj.m716b("LocalTextToolbar");
                throw null;
            default:
                AbstractC0131dj.m716b("LocalUriHandler");
                throw null;
        }
    }
}

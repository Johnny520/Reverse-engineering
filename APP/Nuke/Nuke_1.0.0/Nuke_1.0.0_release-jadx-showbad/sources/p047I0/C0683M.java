package p047I0;

import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import me.dartcv.nuke.BuildConfig;
import p074O2.C1047e;
import p074O2.C1052j;
import p074O2.InterfaceC1048f;
import p074O2.InterfaceC1051i;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p128a.AbstractC1785a;
import p160f3.AbstractC2100C;
import p160f3.AbstractC2109L;
import p160f3.AbstractC2144k0;
import p160f3.AbstractC2162v;
import p160f3.C2122Z;
import p160f3.C2127c;
import p160f3.C2149n;
import p160f3.EnumC2161u;
import p160f3.InterfaceC2112O;
import p166g3.C2187d;
import p190k3.AbstractC2466n;
import p201m3.C2608e;

/* JADX INFO: renamed from: I0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0683M extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: A */
    public static final C0683M f2169A;

    /* JADX INFO: renamed from: B */
    public static final C0683M f2170B;

    /* JADX INFO: renamed from: C */
    public static final C0683M f2171C;

    /* JADX INFO: renamed from: D */
    public static final C0683M f2172D;

    /* JADX INFO: renamed from: E */
    public static final C0683M f2173E;

    /* JADX INFO: renamed from: F */
    public static final C0683M f2174F;

    /* JADX INFO: renamed from: G */
    public static final C0683M f2175G;

    /* JADX INFO: renamed from: H */
    public static final C0683M f2176H;

    /* JADX INFO: renamed from: I */
    public static final C0683M f2177I;

    /* JADX INFO: renamed from: f */
    public static final C0683M f2178f;

    /* JADX INFO: renamed from: g */
    public static final C0683M f2179g;

    /* JADX INFO: renamed from: h */
    public static final C0683M f2180h;

    /* JADX INFO: renamed from: i */
    public static final C0683M f2181i;

    /* JADX INFO: renamed from: j */
    public static final C0683M f2182j;

    /* JADX INFO: renamed from: k */
    public static final C0683M f2183k;

    /* JADX INFO: renamed from: l */
    public static final C0683M f2184l;

    /* JADX INFO: renamed from: m */
    public static final C0683M f2185m;

    /* JADX INFO: renamed from: n */
    public static final C0683M f2186n;

    /* JADX INFO: renamed from: o */
    public static final C0683M f2187o;

    /* JADX INFO: renamed from: p */
    public static final C0683M f2188p;

    /* JADX INFO: renamed from: q */
    public static final C0683M f2189q;

    /* JADX INFO: renamed from: r */
    public static final C0683M f2190r;

    /* JADX INFO: renamed from: s */
    public static final C0683M f2191s;

    /* JADX INFO: renamed from: t */
    public static final C0683M f2192t;

    /* JADX INFO: renamed from: u */
    public static final C0683M f2193u;

    /* JADX INFO: renamed from: v */
    public static final C0683M f2194v;

    /* JADX INFO: renamed from: w */
    public static final C0683M f2195w;

    /* JADX INFO: renamed from: x */
    public static final C0683M f2196x;

    /* JADX INFO: renamed from: y */
    public static final C0683M f2197y;

    /* JADX INFO: renamed from: z */
    public static final C0683M f2198z;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2199e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 0;
        f2178f = new C0683M(i5, 0);
        f2179g = new C0683M(i5, 1);
        f2180h = new C0683M(i5, 2);
        f2181i = new C0683M(i5, 3);
        f2182j = new C0683M(i5, 4);
        f2183k = new C0683M(i5, 5);
        f2184l = new C0683M(i5, 6);
        f2185m = new C0683M(i5, 7);
        f2186n = new C0683M(i5, 8);
        f2187o = new C0683M(i5, 9);
        f2188p = new C0683M(i5, 10);
        f2189q = new C0683M(i5, 11);
        f2190r = new C0683M(i5, 12);
        f2191s = new C0683M(i5, 13);
        f2192t = new C0683M(i5, 14);
        f2193u = new C0683M(i5, 15);
        f2194v = new C0683M(i5, 16);
        f2195w = new C0683M(i5, 17);
        f2196x = new C0683M(i5, 18);
        f2197y = new C0683M(i5, 19);
        f2198z = new C0683M(i5, 20);
        f2169A = new C0683M(i5, 21);
        f2170B = new C0683M(i5, 22);
        f2171C = new C0683M(i5, 23);
        f2172D = new C0683M(i5, 24);
        f2173E = new C0683M(i5, 25);
        f2174F = new C0683M(i5, 26);
        f2175G = new C0683M(i5, 27);
        f2176H = new C0683M(i5, 28);
        f2177I = new C0683M(i5, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0683M(int i5, int i6) {
        super(i5);
        this.f2199e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws Throwable {
        AbstractC2109L abstractC2109LM3973a;
        InterfaceC1051i interfaceC1051iM3985g;
        Choreographer choreographer;
        switch (this.f2199e) {
            case 0:
                AbstractC0691Q.m1200b("LocalConfiguration");
                throw null;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0691Q.m1200b("LocalContext");
                throw null;
            case 2:
                AbstractC0691Q.m1200b("LocalImageVectorCache");
                throw null;
            case 3:
                AbstractC0691Q.m1200b("LocalResourceIdCache");
                throw null;
            case 4:
                AbstractC0691Q.m1200b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C2608e c2608e = AbstractC2100C.f7029a;
                    C2187d c2187d = AbstractC2466n.f7954a;
                    InterfaceC1603e c0700v = new C0700V(2, null);
                    Thread threadCurrentThread = Thread.currentThread();
                    C1047e c1047e = C1047e.f3285d;
                    InterfaceC1048f interfaceC1048f = (InterfaceC1048f) c2187d.mo1166C(c1047e);
                    C1052j c1052j = C1052j.f3286d;
                    if (interfaceC1048f == null) {
                        abstractC2109LM3973a = AbstractC2144k0.m3973a();
                        interfaceC1051iM3985g = AbstractC2162v.m3985g(c1052j, AbstractC1785a.m3254o(c2187d, abstractC2109LM3973a), true);
                        C2608e c2608e2 = AbstractC2100C.f7029a;
                        if (interfaceC1051iM3985g != c2608e2 && interfaceC1051iM3985g.mo1166C(c1047e) == null) {
                            interfaceC1051iM3985g = interfaceC1051iM3985g.mo1168m(c2608e2);
                        }
                    } else {
                        if (interfaceC1048f instanceof AbstractC2109L) {
                        }
                        abstractC2109LM3973a = (AbstractC2109L) AbstractC2144k0.f7083a.get();
                        interfaceC1051iM3985g = AbstractC2162v.m3985g(c1052j, c2187d, true);
                        C2608e c2608e3 = AbstractC2100C.f7029a;
                        if (interfaceC1051iM3985g != c2608e3 && interfaceC1051iM3985g.mo1166C(c1047e) == null) {
                            interfaceC1051iM3985g = interfaceC1051iM3985g.mo1168m(c2608e3);
                        }
                    }
                    C2127c c2127c = new C2127c(interfaceC1051iM3985g, threadCurrentThread, abstractC2109LM3973a);
                    c2127c.m3949f0(EnumC2161u.f7105d, c2127c, c0700v);
                    AbstractC2109L abstractC2109L = c2127c.f7068h;
                    if (abstractC2109L != null) {
                        int i5 = AbstractC2109L.f7042i;
                        abstractC2109L.m3901J(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jMo3890K = abstractC2109L != null ? abstractC2109L.mo3890K() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2122Z.f7062d;
                            if (atomicReferenceFieldUpdater.get(c2127c) instanceof InterfaceC2112O) {
                                LockSupport.parkNanos(c2127c, jMo3890K);
                            } else {
                                if (abstractC2109L != null) {
                                    int i6 = AbstractC2109L.f7042i;
                                    abstractC2109L.m3898G(false);
                                }
                                Object objM3999u = AbstractC2162v.m3999u(atomicReferenceFieldUpdater.get(c2127c));
                                C2149n c2149n = objM3999u instanceof C2149n ? (C2149n) objM3999u : null;
                                if (c2149n != null) {
                                    throw c2149n.f7092a;
                                }
                                choreographer = (Choreographer) objM3999u;
                            }
                        } catch (Throwable th) {
                            if (abstractC2109L != null) {
                                int i7 = AbstractC2109L.f7042i;
                                abstractC2109L.m3898G(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    c2127c.m3945y(interruptedException);
                    throw interruptedException;
                } else {
                    choreographer = Choreographer.getInstance();
                }
                C0706Y c0706y = new C0706Y(choreographer, AbstractC1785a.m3245e(Looper.getMainLooper()));
                return AbstractC1785a.m3254o(c0706y, c0706y.f2244o);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC0757q0.m1272b("LocalAutofillManager");
                throw null;
            case 9:
                AbstractC0757q0.m1272b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC0757q0.m1272b("LocalClipboard");
                throw null;
            case 11:
                AbstractC0757q0.m1272b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC0757q0.m1272b("LocalDensity");
                throw null;
            case 14:
                AbstractC0757q0.m1272b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC0757q0.m1272b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC0757q0.m1272b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC0757q0.m1272b("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC0757q0.m1272b("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC0757q0.m1272b("LocalInputManager");
                throw null;
            case 20:
                AbstractC0757q0.m1272b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                AbstractC0757q0.m1272b("LocalTextToolbar");
                throw null;
            case 26:
                AbstractC0757q0.m1272b("LocalUriHandler");
                throw null;
            case 27:
                AbstractC0757q0.m1272b("LocalViewConfiguration");
                throw null;
            case 28:
                AbstractC0757q0.m1272b("LocalWindowInfo");
                throw null;
            default:
                return null;
        }
    }
}

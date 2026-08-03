package p357y1;

import android.os.Looper;
import android.view.Choreographer;
import gg.AbstractC1417m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3565g0;
import p249qg.AbstractC3569h1;
import p249qg.AbstractC3591p;
import p249qg.AbstractC3603v;
import p249qg.C3552c;
import p249qg.C3585n;
import p249qg.C3610y0;
import p249qg.EnumC3601u;
import p249qg.InterfaceC3589o0;
import p251r.C3638w;
import p263rg.C3808e;
import p353xg.C5808e;
import vg.AbstractC4564m;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5887h0 extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: A */
    public static final C5887h0 f23888A;

    /* JADX INFO: renamed from: B */
    public static final C5887h0 f23889B;

    /* JADX INFO: renamed from: C */
    public static final C5887h0 f23890C;

    /* JADX INFO: renamed from: D */
    public static final C5887h0 f23891D;

    /* JADX INFO: renamed from: E */
    public static final C5887h0 f23892E;

    /* JADX INFO: renamed from: F */
    public static final C5887h0 f23893F;

    /* JADX INFO: renamed from: G */
    public static final C5887h0 f23894G;

    /* JADX INFO: renamed from: H */
    public static final C5887h0 f23895H;

    /* JADX INFO: renamed from: I */
    public static final C5887h0 f23896I;

    /* JADX INFO: renamed from: J */
    public static final C5887h0 f23897J;

    /* JADX INFO: renamed from: K */
    public static final C5887h0 f23898K;

    /* JADX INFO: renamed from: h */
    public static final C5887h0 f23899h;

    /* JADX INFO: renamed from: i */
    public static final C5887h0 f23900i;

    /* JADX INFO: renamed from: j */
    public static final C5887h0 f23901j;

    /* JADX INFO: renamed from: k */
    public static final C5887h0 f23902k;

    /* JADX INFO: renamed from: l */
    public static final C5887h0 f23903l;

    /* JADX INFO: renamed from: m */
    public static final C5887h0 f23904m;

    /* JADX INFO: renamed from: n */
    public static final C5887h0 f23905n;

    /* JADX INFO: renamed from: o */
    public static final C5887h0 f23906o;

    /* JADX INFO: renamed from: p */
    public static final C5887h0 f23907p;

    /* JADX INFO: renamed from: q */
    public static final C5887h0 f23908q;

    /* JADX INFO: renamed from: r */
    public static final C5887h0 f23909r;

    /* JADX INFO: renamed from: s */
    public static final C5887h0 f23910s;

    /* JADX INFO: renamed from: t */
    public static final C5887h0 f23911t;

    /* JADX INFO: renamed from: u */
    public static final C5887h0 f23912u;

    /* JADX INFO: renamed from: v */
    public static final C5887h0 f23913v;

    /* JADX INFO: renamed from: w */
    public static final C5887h0 f23914w;

    /* JADX INFO: renamed from: x */
    public static final C5887h0 f23915x;

    /* JADX INFO: renamed from: y */
    public static final C5887h0 f23916y;

    /* JADX INFO: renamed from: z */
    public static final C5887h0 f23917z;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23918g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 0;
        f23899h = new C5887h0(i9, 0);
        f23900i = new C5887h0(i9, 1);
        f23901j = new C5887h0(i9, 2);
        f23902k = new C5887h0(i9, 3);
        f23903l = new C5887h0(i9, 4);
        f23904m = new C5887h0(i9, 5);
        f23905n = new C5887h0(i9, 6);
        f23906o = new C5887h0(i9, 7);
        f23907p = new C5887h0(i9, 8);
        f23908q = new C5887h0(i9, 9);
        f23909r = new C5887h0(i9, 10);
        f23910s = new C5887h0(i9, 11);
        f23911t = new C5887h0(i9, 12);
        f23912u = new C5887h0(i9, 13);
        f23913v = new C5887h0(i9, 14);
        f23914w = new C5887h0(i9, 15);
        f23915x = new C5887h0(i9, 16);
        f23916y = new C5887h0(i9, 17);
        f23917z = new C5887h0(i9, 18);
        f23888A = new C5887h0(i9, 19);
        f23889B = new C5887h0(i9, 20);
        f23890C = new C5887h0(i9, 21);
        f23891D = new C5887h0(i9, 22);
        f23892E = new C5887h0(i9, 23);
        f23893F = new C5887h0(i9, 24);
        f23894G = new C5887h0(i9, 25);
        f23895H = new C5887h0(i9, 26);
        f23896I = new C5887h0(i9, 27);
        f23897J = new C5887h0(i9, 28);
        f23898K = new C5887h0(i9, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5887h0(int i9, int i10) {
        super(i9);
        this.f23918g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() throws Throwable {
        AbstractC3565g0 abstractC3565g0M7527a;
        InterfaceC5561g interfaceC5561gM7554h;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.f23918g) {
            case 0:
                AbstractC5891i0.m10611a("LocalConfiguration");
                throw null;
            case 1:
                AbstractC5891i0.m10611a("LocalContext");
                throw null;
            case 2:
                AbstractC5891i0.m10611a("LocalImageVectorCache");
                throw null;
            case 3:
                AbstractC5891i0.m10611a("LocalResourceIdCache");
                throw null;
            case 4:
                AbstractC5891i0.m10611a("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    C3808e c3808e = AbstractC4564m.f15049a;
                    InterfaceC1235p c3638w = new C3638w(2, objArr == true ? 1 : 0, 1);
                    Thread threadCurrentThread = Thread.currentThread();
                    C5558d c5558d = C5558d.f22660g;
                    AbstractC3591p abstractC3591p = (AbstractC3591p) c3808e.mo2062s(c5558d);
                    C5562h c5562h = C5562h.f22661g;
                    if (abstractC3591p == null) {
                        abstractC3565g0M7527a = AbstractC3569h1.m7527a();
                        interfaceC5561gM7554h = AbstractC3603v.m7554h(c5562h, AbstractC1089i.m2786q0(c3808e, abstractC3565g0M7527a), true);
                        C5808e c5808e2 = AbstractC3553c0.f11555a;
                        if (interfaceC5561gM7554h != c5808e2 && interfaceC5561gM7554h.mo2062s(c5558d) == null) {
                            interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e2);
                        }
                    } else {
                        if (abstractC3591p instanceof AbstractC3565g0) {
                        }
                        abstractC3565g0M7527a = (AbstractC3565g0) AbstractC3569h1.f11575a.get();
                        interfaceC5561gM7554h = AbstractC3603v.m7554h(c5562h, c3808e, true);
                        C5808e c5808e3 = AbstractC3553c0.f11555a;
                        if (interfaceC5561gM7554h != c5808e3 && interfaceC5561gM7554h.mo2062s(c5558d) == null) {
                            interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e3);
                        }
                    }
                    C3552c c3552c = new C3552c(interfaceC5561gM7554h, threadCurrentThread, abstractC3565g0M7527a);
                    c3552c.m7472c0(EnumC3601u.f11613g, c3552c, c3638w);
                    AbstractC3565g0 abstractC3565g0 = c3552c.f11554k;
                    if (abstractC3565g0 != null) {
                        int i9 = AbstractC3565g0.f11568l;
                        abstractC3565g0.m7523B(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jMo7524C = abstractC3565g0 != null ? abstractC3565g0.mo7524C() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3610y0.f11641g;
                            if (atomicReferenceFieldUpdater.get(c3552c) instanceof InterfaceC3589o0) {
                                LockSupport.parkNanos(c3552c, jMo7524C);
                            } else {
                                if (abstractC3565g0 != null) {
                                    int i10 = AbstractC3565g0.f11568l;
                                    abstractC3565g0.m7526z(false);
                                }
                                Object objM7568v = AbstractC3603v.m7568v(atomicReferenceFieldUpdater.get(c3552c));
                                C3585n c3585n = objM7568v instanceof C3585n ? (C3585n) objM7568v : null;
                                if (c3585n != null) {
                                    throw c3585n.f11599a;
                                }
                                choreographer = (Choreographer) objM7568v;
                            }
                        } catch (Throwable th2) {
                            if (abstractC3565g0 != null) {
                                int i11 = AbstractC3565g0.f11568l;
                                abstractC3565g0.m7526z(false);
                            }
                            throw th2;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    c3552c.m7595v(interruptedException);
                    throw interruptedException;
                } else {
                    choreographer = Choreographer.getInstance();
                }
                C5911n0 c5911n0 = new C5911n0(choreographer, AbstractC0000a.m4C(Looper.getMainLooper()));
                return AbstractC1089i.m2786q0(c5911n0, c5911n0.f23995r);
            case 6:
            case 7:
                return null;
            case 8:
                AbstractC5888h1.m10609b("LocalAutofillManager");
                throw null;
            case 9:
                AbstractC5888h1.m10609b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC5888h1.m10609b("LocalClipboard");
                throw null;
            case 11:
                AbstractC5888h1.m10609b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                AbstractC5888h1.m10609b("LocalDensity");
                throw null;
            case 14:
                AbstractC5888h1.m10609b("LocalFocusManager");
                throw null;
            case 15:
                AbstractC5888h1.m10609b("LocalFontFamilyResolver");
                throw null;
            case 16:
                AbstractC5888h1.m10609b("LocalFontLoader");
                throw null;
            case 17:
                AbstractC5888h1.m10609b("LocalGraphicsContext");
                throw null;
            case 18:
                AbstractC5888h1.m10609b("LocalHapticFeedback");
                throw null;
            case 19:
                AbstractC5888h1.m10609b("LocalInputManager");
                throw null;
            case 20:
                AbstractC5888h1.m10609b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                AbstractC5888h1.m10609b("LocalProvidableLocaleList");
                throw null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case 26:
                AbstractC5888h1.m10609b("LocalTextToolbar");
                throw null;
            case 27:
                AbstractC5888h1.m10609b("LocalUriHandler");
                throw null;
            case 28:
                AbstractC5888h1.m10609b("LocalViewConfiguration");
                throw null;
            default:
                AbstractC5888h1.m10609b("LocalWindowInfo");
                throw null;
        }
    }
}

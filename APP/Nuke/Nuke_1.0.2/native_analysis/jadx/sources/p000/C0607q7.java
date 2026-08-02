package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607q7 extends w51 implements xm0 {

    /* JADX INFO: renamed from: A */
    public static final C0607q7 f8776A;

    /* JADX INFO: renamed from: B */
    public static final C0607q7 f8777B;

    /* JADX INFO: renamed from: C */
    public static final C0607q7 f8778C;

    /* JADX INFO: renamed from: D */
    public static final C0607q7 f8779D;

    /* JADX INFO: renamed from: E */
    public static final C0607q7 f8780E;

    /* JADX INFO: renamed from: F */
    public static final C0607q7 f8781F;

    /* JADX INFO: renamed from: G */
    public static final C0607q7 f8782G;

    /* JADX INFO: renamed from: H */
    public static final C0607q7 f8783H;

    /* JADX INFO: renamed from: I */
    public static final C0607q7 f8784I;

    /* JADX INFO: renamed from: J */
    public static final C0607q7 f8785J;

    /* JADX INFO: renamed from: K */
    public static final C0607q7 f8786K;

    /* JADX INFO: renamed from: L */
    public static final C0607q7 f8787L;

    /* JADX INFO: renamed from: M */
    public static final C0607q7 f8788M;

    /* JADX INFO: renamed from: j */
    public static final C0607q7 f8789j;

    /* JADX INFO: renamed from: k */
    public static final C0607q7 f8790k;

    /* JADX INFO: renamed from: l */
    public static final C0607q7 f8791l;

    /* JADX INFO: renamed from: m */
    public static final C0607q7 f8792m;

    /* JADX INFO: renamed from: n */
    public static final C0607q7 f8793n;

    /* JADX INFO: renamed from: o */
    public static final C0607q7 f8794o;

    /* JADX INFO: renamed from: p */
    public static final C0607q7 f8795p;

    /* JADX INFO: renamed from: q */
    public static final C0607q7 f8796q;

    /* JADX INFO: renamed from: r */
    public static final C0607q7 f8797r;

    /* JADX INFO: renamed from: s */
    public static final C0607q7 f8798s;

    /* JADX INFO: renamed from: t */
    public static final C0607q7 f8799t;

    /* JADX INFO: renamed from: u */
    public static final C0607q7 f8800u;

    /* JADX INFO: renamed from: v */
    public static final C0607q7 f8801v;

    /* JADX INFO: renamed from: w */
    public static final C0607q7 f8802w;

    /* JADX INFO: renamed from: x */
    public static final C0607q7 f8803x;

    /* JADX INFO: renamed from: y */
    public static final C0607q7 f8804y;

    /* JADX INFO: renamed from: z */
    public static final C0607q7 f8805z;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8806i;

    static {
        int i = 0;
        f8789j = new C0607q7(i, 0);
        f8790k = new C0607q7(i, 1);
        f8791l = new C0607q7(i, 2);
        f8792m = new C0607q7(i, 3);
        f8793n = new C0607q7(i, 4);
        f8794o = new C0607q7(i, 5);
        f8795p = new C0607q7(i, 6);
        f8796q = new C0607q7(i, 7);
        f8797r = new C0607q7(i, 8);
        f8798s = new C0607q7(i, 9);
        f8799t = new C0607q7(i, 10);
        f8800u = new C0607q7(i, 11);
        f8801v = new C0607q7(i, 12);
        f8802w = new C0607q7(i, 13);
        f8803x = new C0607q7(i, 14);
        f8804y = new C0607q7(i, 15);
        f8805z = new C0607q7(i, 16);
        f8776A = new C0607q7(i, 17);
        f8777B = new C0607q7(i, 18);
        f8778C = new C0607q7(i, 19);
        f8779D = new C0607q7(i, 20);
        f8780E = new C0607q7(i, 21);
        f8781F = new C0607q7(i, 22);
        f8782G = new C0607q7(i, 23);
        f8783H = new C0607q7(i, 24);
        f8784I = new C0607q7(i, 25);
        f8785J = new C0607q7(i, 26);
        f8786K = new C0607q7(i, 27);
        f8787L = new C0607q7(i, 28);
        f8788M = new C0607q7(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0607q7(int i, int i2) {
        super(i);
        this.f8806i = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws Throwable {
        lg0 lg0VarM20a;
        a20 a20VarM4487w;
        long jMo2907J;
        Choreographer choreographer;
        int i = this.f8806i;
        a83 a83Var = a83.f116a;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                AbstractC0646r7.m4398a("LocalConfiguration");
                throw null;
            case 1:
                AbstractC0646r7.m4398a("LocalContext");
                throw null;
            case 2:
                AbstractC0646r7.m4398a("LocalImageVectorCache");
                throw null;
            case 3:
                AbstractC0646r7.m4398a("LocalResourceIdCache");
                throw null;
            case 4:
                AbstractC0646r7.m4398a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    c60 c60Var = o90.f7590a;
                    vr0 vr0Var = ie1.f4583a;
                    mn0 c0688sb = new C0688sb(2, objArr == true ? 1 : 0, 0);
                    gd3 gd3Var = gd3.f3438p;
                    c20 c20Var = (c20) vr0Var.mo15o(gd3Var);
                    zd0 zd0Var = zd0.f13837h;
                    if (c20Var == null) {
                        lg0VarM20a = a23.m20a();
                        a20VarM4487w = rg3.m4487w(zd0Var, xe1.m6120f0(vr0Var, lg0VarM20a), true);
                        c60 c60Var2 = o90.f7590a;
                        if (a20VarM4487w != c60Var2 && a20VarM4487w.mo15o(gd3Var) == null) {
                            a20VarM4487w = a20VarM4487w.mo14k(c60Var2);
                        }
                    } else {
                        lg0VarM20a = (lg0) a23.f41a.get();
                        a20VarM4487w = rg3.m4487w(zd0Var, vr0Var, true);
                        c60 c60Var3 = o90.f7590a;
                        if (a20VarM4487w != c60Var3 && a20VarM4487w.mo15o(gd3Var) == null) {
                            a20VarM4487w = a20VarM4487w.mo14k(c60Var3);
                        }
                    }
                    C0244gl c0244gl = new C0244gl(a20VarM4487w, Thread.currentThread(), lg0VarM20a);
                    c0244gl.m3680i0(m20.f6440h, c0244gl, c0688sb);
                    lg0 lg0Var = c0244gl.f3568l;
                    if (lg0Var != null) {
                        int i2 = lg0.f6106m;
                        lg0Var.m2906I(false);
                    }
                    while (true) {
                        if (lg0Var != null) {
                            try {
                                jMo2907J = lg0Var.mo2907J();
                            } catch (Throwable th) {
                                if (lg0Var != null) {
                                    int i3 = lg0.f6106m;
                                    lg0Var.m2904G(false);
                                }
                                throw th;
                            }
                        } else {
                            jMo2907J = Long.MAX_VALUE;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.f9330h;
                        if (atomicReferenceFieldUpdater.get(c0244gl) instanceof cy0) {
                            LockSupport.parkNanos(c0244gl, jMo2907J);
                            if (Thread.interrupted()) {
                                c0244gl.m4326z(new InterruptedException());
                            }
                        } else {
                            if (lg0Var != null) {
                                int i4 = lg0.f6106m;
                                lg0Var.m2904G(false);
                            }
                            Object objM1455e0 = AbstractC0179eu.m1455e0(atomicReferenceFieldUpdater.get(c0244gl));
                            C0557ov c0557ov = objM1455e0 instanceof C0557ov ? (C0557ov) objM1455e0 : null;
                            if (c0557ov != null) {
                                throw c0557ov.f7856a;
                            }
                            choreographer = (Choreographer) objM1455e0;
                        }
                    }
                }
                C0804vb c0804vb = new C0804vb(choreographer, AbstractC0691se.m4812A(Looper.getMainLooper()));
                return xe1.m6120f0(c0804vb, c0804vb.f11883s);
            case 10:
            case 11:
            case 12:
                return a83Var;
            case 13:
            case 14:
                return null;
            case 15:
                AbstractC0441ly.m2987b("LocalAutofillManager");
                throw null;
            case 16:
                AbstractC0441ly.m2987b("LocalAutofillTree");
                throw null;
            case 17:
                AbstractC0441ly.m2987b("LocalClipboard");
                throw null;
            case 18:
                AbstractC0441ly.m2987b("LocalClipboardManager");
                throw null;
            case 19:
                return Boolean.TRUE;
            case AIChatConfig.MaxContextRounds /* 20 */:
                AbstractC0441ly.m2987b("LocalDensity");
                throw null;
            case 21:
                AbstractC0441ly.m2987b("LocalFocusManager");
                throw null;
            case 22:
                AbstractC0441ly.m2987b("LocalFontFamilyResolver");
                throw null;
            case 23:
                AbstractC0441ly.m2987b("LocalFontLoader");
                throw null;
            case 24:
                AbstractC0441ly.m2987b("LocalGraphicsContext");
                throw null;
            case 25:
                AbstractC0441ly.m2987b("LocalHapticFeedback");
                throw null;
            case 26:
                AbstractC0441ly.m2987b("LocalInputManager");
                throw null;
            case 27:
                AbstractC0441ly.m2987b("LocalLayoutDirection");
                throw null;
            case 28:
                return null;
            default:
                AbstractC0441ly.m2987b("LocalProvidableLocaleList");
                throw null;
        }
    }
}

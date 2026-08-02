package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends w51 implements xm0 {
    public static final q7 A;
    public static final q7 B;
    public static final q7 C;
    public static final q7 D;
    public static final q7 E;
    public static final q7 F;
    public static final q7 G;
    public static final q7 H;
    public static final q7 I;
    public static final q7 J;
    public static final q7 K;
    public static final q7 L;
    public static final q7 M;
    public static final q7 j;
    public static final q7 k;
    public static final q7 l;
    public static final q7 m;
    public static final q7 n;
    public static final q7 o;
    public static final q7 p;
    public static final q7 q;
    public static final q7 r;
    public static final q7 s;
    public static final q7 t;
    public static final q7 u;
    public static final q7 v;
    public static final q7 w;
    public static final q7 x;
    public static final q7 y;
    public static final q7 z;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 0;
        j = new q7(i, 0);
        k = new q7(i, 1);
        l = new q7(i, 2);
        m = new q7(i, 3);
        n = new q7(i, 4);
        o = new q7(i, 5);
        p = new q7(i, 6);
        q = new q7(i, 7);
        r = new q7(i, 8);
        s = new q7(i, 9);
        t = new q7(i, 10);
        u = new q7(i, 11);
        v = new q7(i, 12);
        w = new q7(i, 13);
        x = new q7(i, 14);
        y = new q7(i, 15);
        z = new q7(i, 16);
        A = new q7(i, 17);
        B = new q7(i, 18);
        C = new q7(i, 19);
        D = new q7(i, 20);
        E = new q7(i, 21);
        F = new q7(i, 22);
        G = new q7(i, 23);
        H = new q7(i, 24);
        I = new q7(i, 25);
        J = new q7(i, 26);
        K = new q7(i, 27);
        L = new q7(i, 28);
        M = new q7(i, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q7(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm0
    public final Object a() throws Throwable {
        lg0 lg0VarA;
        a20 a20VarW;
        long J2;
        Choreographer choreographer;
        int i = this.i;
        a83 a83Var = a83.a;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                r7.a("LocalConfiguration");
                throw null;
            case 1:
                r7.a("LocalContext");
                throw null;
            case 2:
                r7.a("LocalImageVectorCache");
                throw null;
            case 3:
                r7.a("LocalResourceIdCache");
                throw null;
            case 4:
                r7.a("LocalView");
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
                    c60 c60Var = o90.a;
                    vr0 vr0Var = ie1.a;
                    mn0 sbVar = new sb(2, objArr == true ? 1 : 0, 0);
                    gd3 gd3Var = gd3.p;
                    c20 c20Var = (c20) vr0Var.o(gd3Var);
                    zd0 zd0Var = zd0.h;
                    if (c20Var == null) {
                        lg0VarA = a23.a();
                        a20VarW = rg3.w(zd0Var, xe1.f0(vr0Var, lg0VarA), true);
                        c60 c60Var2 = o90.a;
                        if (a20VarW != c60Var2 && a20VarW.o(gd3Var) == null) {
                            a20VarW = a20VarW.k(c60Var2);
                        }
                    } else {
                        lg0VarA = (lg0) a23.a.get();
                        a20VarW = rg3.w(zd0Var, vr0Var, true);
                        c60 c60Var3 = o90.a;
                        if (a20VarW != c60Var3 && a20VarW.o(gd3Var) == null) {
                            a20VarW = a20VarW.k(c60Var3);
                        }
                    }
                    gl glVar = new gl(a20VarW, Thread.currentThread(), lg0VarA);
                    glVar.i0(m20.h, glVar, sbVar);
                    lg0 lg0Var = glVar.l;
                    if (lg0Var != null) {
                        int i2 = lg0.m;
                        lg0Var.I(false);
                    }
                    while (true) {
                        if (lg0Var != null) {
                            try {
                                J2 = lg0Var.J();
                            } catch (Throwable th) {
                                if (lg0Var != null) {
                                    int i3 = lg0.m;
                                    lg0Var.G(false);
                                }
                                throw th;
                            }
                        } else {
                            J2 = Long.MAX_VALUE;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r21.h;
                        if (atomicReferenceFieldUpdater.get(glVar) instanceof cy0) {
                            LockSupport.parkNanos(glVar, J2);
                            if (Thread.interrupted()) {
                                glVar.z(new InterruptedException());
                            }
                        } else {
                            if (lg0Var != null) {
                                int i4 = lg0.m;
                                lg0Var.G(false);
                            }
                            Object objE0 = eu.e0(atomicReferenceFieldUpdater.get(glVar));
                            ov ovVar = objE0 instanceof ov ? (ov) objE0 : null;
                            if (ovVar != null) {
                                throw ovVar.a;
                            }
                            choreographer = (Choreographer) objE0;
                        }
                    }
                }
                vb vbVar = new vb(choreographer, se.A(Looper.getMainLooper()));
                return xe1.f0(vbVar, vbVar.s);
            case 10:
            case 11:
            case 12:
                return a83Var;
            case 13:
            case 14:
                return null;
            case 15:
                ly.b("LocalAutofillManager");
                throw null;
            case 16:
                ly.b("LocalAutofillTree");
                throw null;
            case 17:
                ly.b("LocalClipboard");
                throw null;
            case 18:
                ly.b("LocalClipboardManager");
                throw null;
            case 19:
                return Boolean.TRUE;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ly.b("LocalDensity");
                throw null;
            case 21:
                ly.b("LocalFocusManager");
                throw null;
            case 22:
                ly.b("LocalFontFamilyResolver");
                throw null;
            case 23:
                ly.b("LocalFontLoader");
                throw null;
            case 24:
                ly.b("LocalGraphicsContext");
                throw null;
            case 25:
                ly.b("LocalHapticFeedback");
                throw null;
            case 26:
                ly.b("LocalInputManager");
                throw null;
            case 27:
                ly.b("LocalLayoutDirection");
                throw null;
            case 28:
                return null;
            default:
                ly.b("LocalProvidableLocaleList");
                throw null;
        }
    }
}

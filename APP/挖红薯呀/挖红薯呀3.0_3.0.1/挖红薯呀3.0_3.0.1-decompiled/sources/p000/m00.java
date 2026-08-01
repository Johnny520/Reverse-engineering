package p000;

import android.R;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Environment;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m00 extends Dialog {

    /* JADX INFO: renamed from: A0 */
    public static final boolean f3640A0 = false;

    /* JADX INFO: renamed from: A1 */
    private static final u60 f3641A1;

    /* JADX INFO: renamed from: B0 */
    private static final u60 f3642B0;

    /* JADX INFO: renamed from: B1 */
    public static final boolean f3643B1 = false;

    /* JADX INFO: renamed from: C0 */
    public static final boolean f3644C0 = false;

    /* JADX INFO: renamed from: C1 */
    private static final u60 f3645C1;

    /* JADX INFO: renamed from: D0 */
    private static final u60 f3646D0;

    /* JADX INFO: renamed from: D1 */
    public static final boolean f3647D1 = false;

    /* JADX INFO: renamed from: E0 */
    public static final boolean f3648E0 = false;

    /* JADX INFO: renamed from: F0 */
    private static final u60 f3650F0;

    /* JADX INFO: renamed from: G0 */
    public static final boolean f3651G0 = false;

    /* JADX INFO: renamed from: H0 */
    private static final u60 f3652H0;

    /* JADX INFO: renamed from: I0 */
    public static final boolean f3653I0 = false;

    /* JADX INFO: renamed from: J0 */
    private static final u60 f3654J0;

    /* JADX INFO: renamed from: K0 */
    public static final boolean f3655K0 = false;

    /* JADX INFO: renamed from: L0 */
    private static final u60 f3656L0;

    /* JADX INFO: renamed from: M0 */
    public static final boolean f3657M0 = false;

    /* JADX INFO: renamed from: N0 */
    private static final u60 f3658N0;

    /* JADX INFO: renamed from: O0 */
    public static final boolean f3659O0 = false;

    /* JADX INFO: renamed from: P0 */
    private static final u60 f3660P0;

    /* JADX INFO: renamed from: Q0 */
    public static final boolean f3661Q0 = false;

    /* JADX INFO: renamed from: R0 */
    private static final u60 f3662R0;

    /* JADX INFO: renamed from: S0 */
    public static final boolean f3664S0 = false;

    /* JADX INFO: renamed from: T0 */
    private static final u60 f3666T0;

    /* JADX INFO: renamed from: U */
    private static final u60 f3667U;

    /* JADX INFO: renamed from: U0 */
    public static final int f3668U0 = 31;

    /* JADX INFO: renamed from: V */
    private static final u60 f3669V;

    /* JADX INFO: renamed from: V0 */
    private static final u60 f3670V0;

    /* JADX INFO: renamed from: W0 */
    public static final boolean f3672W0 = true;

    /* JADX INFO: renamed from: X */
    private static final u60 f3673X;

    /* JADX INFO: renamed from: X0 */
    private static final u60 f3674X0;

    /* JADX INFO: renamed from: Y0 */
    public static final int f3676Y0 = 48;

    /* JADX INFO: renamed from: Z */
    public static final int f3677Z = 30;

    /* JADX INFO: renamed from: Z0 */
    private static final u60 f3678Z0;

    /* JADX INFO: renamed from: a0 */
    public static final int f3679a0 = 100;

    /* JADX INFO: renamed from: a1 */
    private static final u60 f3680a1;

    /* JADX INFO: renamed from: b0 */
    private static final u60 f3681b0;

    /* JADX INFO: renamed from: b1 */
    public static final int f3682b1 = 30;

    /* JADX INFO: renamed from: c0 */
    private static final u60 f3683c0;

    /* JADX INFO: renamed from: c1 */
    public static final int f3684c1 = 80;

    /* JADX INFO: renamed from: d1 */
    private static final u60 f3686d1;

    /* JADX INFO: renamed from: e0 */
    private static final u60 f3687e0;

    /* JADX INFO: renamed from: e1 */
    public static final boolean f3688e1 = true;

    /* JADX INFO: renamed from: f0 */
    private static final u60 f3689f0;

    /* JADX INFO: renamed from: f1 */
    private static final u60 f3690f1;

    /* JADX INFO: renamed from: g0 */
    public static final boolean f3691g0 = true;

    /* JADX INFO: renamed from: g1 */
    public static final int f3692g1 = 44;

    /* JADX INFO: renamed from: h0 */
    private static final u60 f3693h0;

    /* JADX INFO: renamed from: h1 */
    private static final u60 f3694h1;

    /* JADX INFO: renamed from: i0 */
    public static final boolean f3695i0 = true;

    /* JADX INFO: renamed from: i1 */
    private static final u60 f3696i1;

    /* JADX INFO: renamed from: j0 */
    private static final u60 f3697j0;

    /* JADX INFO: renamed from: j1 */
    public static final int f3698j1 = 30;

    /* JADX INFO: renamed from: k0 */
    public static final boolean f3699k0 = false;

    /* JADX INFO: renamed from: k1 */
    public static final int f3700k1 = 72;

    /* JADX INFO: renamed from: l0 */
    private static final u60 f3701l0;

    /* JADX INFO: renamed from: l1 */
    private static final u60 f3702l1;

    /* JADX INFO: renamed from: m0 */
    public static final boolean f3703m0 = false;

    /* JADX INFO: renamed from: m1 */
    public static final boolean f3704m1 = false;

    /* JADX INFO: renamed from: n0 */
    private static final u60 f3705n0;

    /* JADX INFO: renamed from: n1 */
    private static final u60 f3706n1;

    /* JADX INFO: renamed from: o0 */
    public static final boolean f3707o0 = false;

    /* JADX INFO: renamed from: o1 */
    public static final boolean f3708o1 = false;

    /* JADX INFO: renamed from: p0 */
    private static final u60 f3709p0;

    /* JADX INFO: renamed from: p1 */
    private static final u60 f3710p1;

    /* JADX INFO: renamed from: q0 */
    public static final boolean f3711q0 = false;

    /* JADX INFO: renamed from: q1 */
    private static final u60 f3712q1;

    /* JADX INFO: renamed from: r0 */
    private static final u60 f3713r0;

    /* JADX INFO: renamed from: r1 */
    public static final boolean f3714r1 = false;

    /* JADX INFO: renamed from: s0 */
    public static final boolean f3715s0 = false;

    /* JADX INFO: renamed from: s1 */
    private static final u60 f3716s1;

    /* JADX INFO: renamed from: t0 */
    private static final u60 f3717t0;

    /* JADX INFO: renamed from: t1 */
    public static final boolean f3718t1 = false;

    /* JADX INFO: renamed from: u0 */
    public static final boolean f3719u0 = false;

    /* JADX INFO: renamed from: u1 */
    private static final u60 f3720u1;

    /* JADX INFO: renamed from: v0 */
    private static final u60 f3721v0;

    /* JADX INFO: renamed from: v1 */
    public static final boolean f3722v1 = false;

    /* JADX INFO: renamed from: w0 */
    public static final boolean f3723w0 = false;

    /* JADX INFO: renamed from: w1 */
    private static final u60 f3724w1;

    /* JADX INFO: renamed from: x0 */
    private static final u60 f3725x0;

    /* JADX INFO: renamed from: x1 */
    public static final String f3726x1 = "666";

    /* JADX INFO: renamed from: y0 */
    public static final boolean f3727y0 = false;

    /* JADX INFO: renamed from: y1 */
    private static final u60 f3728y1;

    /* JADX INFO: renamed from: z0 */
    private static final u60 f3729z0;

    /* JADX INFO: renamed from: z1 */
    public static final boolean f3730z1 = true;

    /* JADX INFO: renamed from: A */
    private float f3731A;

    /* JADX INFO: renamed from: B */
    private boolean f3732B;

    /* JADX INFO: renamed from: C */
    private final int f3733C;

    /* JADX INFO: renamed from: D */
    private final int f3734D;

    /* JADX INFO: renamed from: E */
    private final int f3735E;

    /* JADX INFO: renamed from: F */
    private final int f3736F;

    /* JADX INFO: renamed from: G */
    private final int f3737G;

    /* JADX INFO: renamed from: H */
    private final int f3738H;

    /* JADX INFO: renamed from: I */
    private final int f3739I;

    /* JADX INFO: renamed from: J */
    private final int f3740J;

    /* JADX INFO: renamed from: K */
    private final int f3741K;

    /* JADX INFO: renamed from: L */
    private final int f3742L;

    /* JADX INFO: renamed from: M */
    private final int f3743M;

    /* JADX INFO: renamed from: N */
    private final int f3744N;

    /* JADX INFO: renamed from: O */
    private final int f3745O;

    /* JADX INFO: renamed from: P */
    private final int f3746P;

    /* JADX INFO: renamed from: Q */
    private final int f3747Q;

    /* JADX INFO: renamed from: R */
    private final int f3748R;

    /* JADX INFO: renamed from: d */
    private final List<String> f3749d;

    /* JADX INFO: renamed from: e */
    private int f3750e;

    /* JADX INFO: renamed from: f */
    private boolean f3751f;

    /* JADX INFO: renamed from: g */
    private boolean f3752g;

    /* JADX INFO: renamed from: h */
    private final Set<String> f3753h;

    /* JADX INFO: renamed from: i */
    private ImageView f3754i;

    /* JADX INFO: renamed from: j */
    private LinearLayout f3755j;

    /* JADX INFO: renamed from: k */
    private HorizontalScrollView f3756k;

    /* JADX INFO: renamed from: l */
    private TextView f3757l;

    /* JADX INFO: renamed from: m */
    private TextView f3758m;

    /* JADX INFO: renamed from: n */
    private TextView f3759n;

    /* JADX INFO: renamed from: o */
    private TextView f3760o;

    /* JADX INFO: renamed from: p */
    private TextView f3761p;

    /* JADX INFO: renamed from: q */
    private TextView f3762q;

    /* JADX INFO: renamed from: r */
    private TextView f3763r;

    /* JADX INFO: renamed from: s */
    private TextView f3764s;

    /* JADX INFO: renamed from: t */
    private TextView f3765t;

    /* JADX INFO: renamed from: u */
    private GestureDetector f3766u;

    /* JADX INFO: renamed from: v */
    private ScaleGestureDetector f3767v;

    /* JADX INFO: renamed from: w */
    private GestureDetector f3768w;

    /* JADX INFO: renamed from: x */
    private final Matrix f3769x;

    /* JADX INFO: renamed from: y */
    private float f3770y;

    /* JADX INFO: renamed from: z */
    private float f3771z;

    /* JADX INFO: renamed from: S */
    public static final C0452a f3663S = new C0452a(null);

    /* JADX INFO: renamed from: T */
    public static final int f3665T = 8;

    /* JADX INFO: renamed from: W */
    private static final int f3671W = 52;

    /* JADX INFO: renamed from: Y */
    private static final boolean f3675Y = true;

    /* JADX INFO: renamed from: d0 */
    private static final String f3685d0 = Environment.DIRECTORY_DCIM;

    /* JADX INFO: renamed from: E1 */
    private static final List<uo0> f3649E1 = o30.m2783w(new uo0(Environment.DIRECTORY_PICTURES, "Pictures"), new uo0(Environment.DIRECTORY_DCIM, "DCIM"), new uo0(Environment.DIRECTORY_DOWNLOADS, "Download"));

    /* JADX INFO: renamed from: m00$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public final class C0453b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        private final int f3772a = 80;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0453b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            motionEvent2.getClass();
            if (motionEvent == null) {
                return false;
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= this.f3772a) {
                return false;
            }
            m00 m00Var = m00.this;
            if (x < 0.0f) {
                m00Var.m2227d3(m00Var.f3750e + 1);
            } else {
                m00Var.m2227d3(m00Var.f3750e - 1);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: m00$c */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public final class C0454c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0454c() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            float fM4906m = w60.m4906m(m00.this.f3770y * scaleGestureDetector.getScaleFactor(), m00.this.f3771z, m00.this.f3731A);
            if (Math.abs(fM4906m - m00.this.f3770y) < 0.001f) {
                return false;
            }
            float f = fM4906m / m00.this.f3770y;
            m00.this.f3770y = fM4906m;
            m00.this.f3769x.postScale(f, f, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ImageView imageView = m00.this.f3754i;
            if (imageView != null) {
                imageView.setImageMatrix(m00.this.f3769x);
                return true;
            }
            p30.m2986V("fullImageView");
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            m00.this.f3732B = true;
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getClass();
            m00.this.f3732B = true;
            m00.this.m2123E2();
        }
    }

    /* JADX INFO: renamed from: m00$d */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public final class C0455d extends GestureDetector.SimpleOnGestureListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0455d() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            motionEvent2.getClass();
            m00.this.f3769x.postTranslate(-f, -f2);
            ImageView imageView = m00.this.f3754i;
            if (imageView != null) {
                imageView.setImageMatrix(m00.this.f3769x);
                return true;
            }
            p30.m2986V("fullImageView");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        final int i = 8;
        final int i2 = 21;
        f3667U = new x51(new C0658qn(i2));
        final int i3 = 2;
        f3669V = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i4 = 13;
        f3673X = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i5 = 1;
        final int i6 = 24;
        f3681b0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i7 = 0;
        f3683c0 = new x51(new a00(i7));
        f3687e0 = new x51(new a00(i5));
        f3689f0 = new x51(new a00(i3));
        final int i8 = 3;
        f3693h0 = new x51(new a00(i8));
        final int i9 = 4;
        f3697j0 = new x51(new a00(i9));
        final int i10 = 5;
        f3701l0 = new x51(new a00(i10));
        final int i11 = 22;
        f3705n0 = new x51(new C0658qn(i11));
        final int i12 = 23;
        f3709p0 = new x51(new C0658qn(i12));
        f3713r0 = new x51(new C0658qn(i6));
        final int i13 = 25;
        f3717t0 = new x51(new C0658qn(i13));
        final int i14 = 26;
        f3721v0 = new x51(new C0658qn(i14));
        final int i15 = 27;
        f3725x0 = new x51(new C0658qn(i15));
        final int i16 = 28;
        f3729z0 = new x51(new C0658qn(i16));
        final int i17 = 29;
        f3642B0 = new x51(new C0658qn(i17));
        f3646D0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3650F0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3652H0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3654J0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3656L0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i18 = 6;
        f3658N0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i19 = 7;
        f3660P0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3662R0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i20 = 9;
        f3666T0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i21 = 10;
        f3670V0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i22 = 11;
        f3674X0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i23 = 12;
        f3678Z0 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i24 = 14;
        f3680a1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i25 = 15;
        f3686d1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i26 = 16;
        f3690f1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i27 = 17;
        f3694h1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i28 = 18;
        f3696i1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i29 = 19;
        f3702l1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        final int i30 = 20;
        f3706n1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3710p1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3712q1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3716s1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3720u1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3724w1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3728y1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3641A1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
        f3645C1 = new x51(new InterfaceC0298hw() { // from class: yz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return m00.m2153M0();
                    case 1:
                        return m00.m2157N0();
                    case 2:
                        return m00.m2125F0();
                    case 3:
                        return m00.m2137I0();
                    case 4:
                        return m00.m2185U0();
                    case 5:
                        return m00.m2145K0();
                    case 6:
                        return m00.m2189V0();
                    case 7:
                        return m00.m2108B0();
                    case 8:
                        return m00.m2173R0();
                    case 9:
                        return m00.m2177S0();
                    case 10:
                        return m00.m2245h1();
                    case 11:
                        return m00.m2255j1();
                    case 12:
                        return m00.m2250i1();
                    case 13:
                        return m00.m2121E0();
                    case 14:
                        return m00.m2260k1();
                    case j50.f2734e /* 15 */:
                        return m00.m2201Y0();
                    case 16:
                        return m00.m2210a1();
                    case 17:
                        return m00.m2205Z0();
                    case 18:
                        return m00.m2215b1();
                    case 19:
                        return m00.m2197X0();
                    case 20:
                        return m00.m2225d1();
                    case 21:
                        return m00.m2220c1();
                    case 22:
                        return m00.m2230e1();
                    case 23:
                        return m00.m2103A0();
                    case 24:
                        return m00.m2240g1();
                    case 25:
                        return m00.m2113C0();
                    case 26:
                        return m00.m2117D0();
                    case 27:
                        return m00.m2275n1();
                    case 28:
                        return m00.m2265l1();
                    default:
                        return m00.m2270m1();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(Context context) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        context.getClass();
        this.f3753h = new LinkedHashSet();
        this.f3769x = new Matrix();
        this.f3770y = 1.0f;
        this.f3771z = 1.0f;
        this.f3731A = 10.0f;
        this.f3733C = Color.argb(255, 230, 230, 230);
        this.f3734D = Color.argb(180, 240, 240, 240);
        this.f3735E = Color.argb(255, 10, 10, 10);
        this.f3736F = Color.argb(200, 255, 255, 255);
        this.f3737G = Color.argb(140, 255, 255, 255);
        this.f3738H = Color.argb(200, 45, 45, 50);
        this.f3739I = Color.argb(150, 0, 0, 0);
        this.f3740J = Color.argb(100, 0, 0, 0);
        this.f3741K = Color.argb(60, 255, 255, 255);
        this.f3742L = -1;
        this.f3743M = Color.argb(140, 70, 70, 80);
        this.f3744N = Color.argb(200, 255, 255, 255);
        this.f3745O = Color.argb(180, 50, 50, 55);
        this.f3746P = -1;
        this.f3747Q = -12303292;
        this.f3748R = Color.argb(200, 240, 240, 240);
        this.f3749d = C0745sz.f5862a.m4121i();
        this.f3766u = new GestureDetector(context, new C0453b());
        this.f3768w = new GestureDetector(context, new C0455d());
        this.f3767v = new ScaleGestureDetector(context, new C0454c());
        m2105A2();
        m2163O2();
        m2321w2();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final String m2103A0() {
        return ik0.f2579a.m1592a(53, 22, 5, 69, 46, 26, 2, 31, 44, 38, 29, 84, 44, 21, 21, 95, 63, 54, 21, 70);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A2 */
    private final void m2105A2() {
        View decorView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(this.f3735E);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: e00
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return m00.m2110B2(this.f1252a, view, motionEvent);
            }
        });
        this.f3754i = imageView;
        frameLayout.addView(imageView);
        TextView textViewM2203Y2 = m2203Y2("‹", 8388611);
        textViewM2203Y2.setOnClickListener(new ViewOnClickListenerC0944xz(this, 2));
        this.f3759n = textViewM2203Y2;
        frameLayout.addView(textViewM2203Y2);
        TextView textViewM2203Y22 = m2203Y2("›", 8388613);
        textViewM2203Y22.setOnClickListener(new ViewOnClickListenerC0944xz(this, 3));
        this.f3760o = textViewM2203Y22;
        frameLayout.addView(textViewM2203Y22);
        linearLayout.addView(frameLayout);
        linearLayout.addView(m2187U2());
        TextView textView = new TextView(getContext());
        textView.setTextSize(11.0f);
        textView.setTextColor(this.f3737G);
        textView.setGravity(17);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setPadding(0, m2151L2(2), 0, m2151L2(2));
        this.f3765t = textView;
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText("当前预览为压缩图以便快速预览，下载不受影响，直接获取原始画质");
        textView2.setTextSize(9.0f);
        textView2.setTextColor(this.f3737G);
        textView2.setGravity(17);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setPadding(0, 0, 0, m2151L2(2));
        linearLayout.addView(textView2);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        horizontalScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, m2151L2(96)));
        horizontalScrollView.setBackgroundColor(this.f3739I);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3756k = horizontalScrollView;
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        linearLayout2.setPadding(m2151L2(6), m2151L2(6), m2151L2(6), m2151L2(6));
        this.f3755j = linearLayout2;
        HorizontalScrollView horizontalScrollView2 = this.f3756k;
        if (horizontalScrollView2 == null) {
            p30.m2986V("thumbScroll");
            throw null;
        }
        horizontalScrollView2.addView(linearLayout2);
        View view = this.f3756k;
        if (view == null) {
            p30.m2986V("thumbScroll");
            throw null;
        }
        linearLayout.addView(view);
        linearLayout.addView(m2175R2());
        setContentView(linearLayout);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(this.f3735E));
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(-16777216);
        }
        Window window4 = getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        m2106A3();
        m2327x3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A3 */
    private final void m2106A3() {
        TextView textView = this.f3759n;
        if (textView == null) {
            p30.m2986V("btnPrev");
            throw null;
        }
        textView.setVisibility(this.f3750e > 0 ? 0 : 4);
        TextView textView2 = this.f3760o;
        if (textView2 != null) {
            textView2.setVisibility(this.f3750e < this.f3749d.size() + (-1) ? 0 : 4);
        } else {
            p30.m2986V("btnNext");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final String m2108B0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 17, 5, 14, 1, 2, 12, 5, 1, 18, 3, 21, 19, 20, 15, 13, 14, 1, 22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final boolean m2110B2(m00 m00Var, View view, MotionEvent motionEvent) {
        motionEvent.getClass();
        return m00Var.m2272m3(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B3 */
    private final void m2111B3() {
        try {
            Object systemService = getContext().getSystemService("vibrator");
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator == null) {
                return;
            }
            vibrator.vibrate(VibrationEffect.createOneShot(50L, -1));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final String m2113C0() {
        return ik0.f2579a.m1592a(40, 21, 4, 114, 62, 10, 2, 84, 37, 24, 2, 84, 37, 28, 28, 84, 57, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final void m2115C2(m00 m00Var, View view) {
        m00Var.m2227d3(m00Var.f3750e - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final String m2117D0() {
        return ik0.f2579a.m1592a(40, 21, 4, 114, 62, 10, 2, 84, 37, 24, 2, 94, 29, 48, 15, 84, 36, 29, 50);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m2119D2(m00 m00Var, View view) {
        m00Var.m2227d3(m00Var.f3750e + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final String m2121E0() {
        return ik0.f2579a.m1592a(45, 20, 31, 80, 63, 39, 18, 69, 37, 39, 21, 95, 42, 26, 28, 84, 47);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public final void m2123E2() {
        float f = this.f3770y;
        float f2 = this.f3771z;
        if (f < 0.98f * f2) {
            float f3 = f2 / f;
            this.f3770y = f2;
            Matrix matrix = this.f3769x;
            if (this.f3754i == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            float width = r2.getWidth() / 2.0f;
            if (this.f3754i == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            matrix.postScale(f3, f3, width, r6.getHeight() / 2.0f);
            ImageView imageView = this.f3754i;
            if (imageView == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            imageView.setImageMatrix(this.f3769x);
        }
        float f4 = this.f3770y;
        float f5 = this.f3731A;
        if (f4 > 1.02f * f5) {
            float f6 = f5 / f4;
            this.f3770y = f5;
            Matrix matrix2 = this.f3769x;
            if (this.f3754i == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            float width2 = r2.getWidth() / 2.0f;
            if (this.f3754i == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            matrix2.postScale(f6, f6, width2, r6.getHeight() / 2.0f);
            ImageView imageView2 = this.f3754i;
            if (imageView2 != null) {
                imageView2.setImageMatrix(this.f3769x);
            } else {
                p30.m2986V("fullImageView");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final String m2125F0() {
        return ik0.f2579a.m1592a(45, 20, 31, 80, 63, 39, 18, 69, 37, 39, 3, 88, 49, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F2 */
    private final void m2127F2() {
        m2111B3();
        int size = this.f3749d.size();
        List<String> list = this.f3749d;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            arrayList.add(new uo0((String) obj, Integer.valueOf(i)));
            i = i2;
        }
        C0439lp c0439lp = C0439lp.f3566a;
        Context context = getContext();
        context.getClass();
        boolean zM2050f = c0439lp.m2050f(context);
        TextView textView = this.f3762q;
        int i3 = 1;
        if (!zM2050f) {
            if (textView == null) {
                p30.m2986V("btnDownloadAll");
                throw null;
            }
            textView.setText("下载中(0/" + size + ")");
            C0870vz c0870vz = C0870vz.f6878a;
            Context context2 = getContext();
            context2.getClass();
            c0870vz.m4818f(context2, arrayList, new k00(this, size, i3));
            return;
        }
        if (textView == null) {
            p30.m2986V("btnDownloadAll");
            throw null;
        }
        textView.setText("下载中...");
        c0439lp.m2053i();
        Context context3 = getContext();
        context3.getClass();
        DialogC0402kp dialogC0402kp = new DialogC0402kp(context3, "图片 0/" + size);
        dialogC0402kp.show();
        C0870vz c0870vz2 = C0870vz.f6878a;
        Context context4 = getContext();
        context4.getClass();
        c0870vz2.m4819i(context4, arrayList, new j00(this, size, dialogC0402kp, i3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final String m2129G0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 1, 8, 12, 8, 15, 18, 9, 5, 14, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final na1 m2131G2(final m00 m00Var, final int i, final DialogC0402kp dialogC0402kp, final int i2, int i3) {
        final boolean zM2048d = C0439lp.f3566a.m2048d();
        TextView textView = m00Var.f3762q;
        if (textView != null) {
            textView.post(new Runnable() { // from class: f00
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    m00.m2135H2(zM2048d, m00Var, i2, i, dialogC0402kp);
                }
            });
            return na1.f4229a;
        }
        p30.m2986V("btnDownloadAll");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final String m2133H0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 8, 1, 18, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final void m2135H2(boolean z, m00 m00Var, int i, int i2, DialogC0402kp dialogC0402kp) {
        if (z) {
            TextView textView = m00Var.f3762q;
            if (textView == null) {
                p30.m2986V("btnDownloadAll");
                throw null;
            }
            textView.setText("已取消");
            Toast.makeText(m00Var.getContext(), "已取消下载", 0).show();
            return;
        }
        TextView textView2 = m00Var.f3762q;
        if (textView2 == null) {
            p30.m2986V("btnDownloadAll");
            throw null;
        }
        textView2.setText("下载中(" + i + "/" + i2 + ")");
        if (i >= i2) {
            TextView textView3 = m00Var.f3762q;
            if (textView3 == null) {
                p30.m2986V("btnDownloadAll");
                throw null;
            }
            textView3.setText("全部下载");
            TextView textView4 = m00Var.f3762q;
            if (textView4 == null) {
                p30.m2986V("btnDownloadAll");
                throw null;
            }
            textView4.postDelayed(new RunnableC0327ip(dialogC0402kp, 2), 400L);
            Toast.makeText(m00Var.getContext(), "已保存 " + i2 + " 张到红薯仓", 0).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final String m2137I0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 12, 15, 13, 13, 21, 14, 9, 20, 25, 18, 21, 12, 5, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final void m2139I2(DialogC0402kp dialogC0402kp) {
        dialogC0402kp.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final String m2141J0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 2, 63, 9, 3, 3, 2, 9, 30, 4, 18, 20, 3, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final na1 m2143J2(final m00 m00Var, final int i, final int i2, int i3) {
        TextView textView = m00Var.f3762q;
        if (textView != null) {
            textView.post(new Runnable() { // from class: l00
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    m00.m2147K2(this.f3297d, i2, i);
                }
            });
            return na1.f4229a;
        }
        p30.m2986V("btnDownloadAll");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final String m2145K0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 14, 5, 12, 16, 3, 5, 14, 20, 5, 18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final void m2147K2(m00 m00Var, int i, int i2) {
        TextView textView = m00Var.f3762q;
        if (textView == null) {
            p30.m2986V("btnDownloadAll");
            throw null;
        }
        textView.setText("下载中(" + i + "/" + i2 + ")");
        if (i >= i2) {
            TextView textView2 = m00Var.f3762q;
            if (textView2 == null) {
                p30.m2986V("btnDownloadAll");
                throw null;
            }
            textView2.setText("全部下载");
            Toast.makeText(m00Var.getContext(), "已保存 " + i2 + " 张到红薯仓", 0).show();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final String m2149L0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 5, 19, 20, 15, 12, 25);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L2 */
    private final int m2151L2(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final String m2153M0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 10, 9, 14, 9, 16, 18, 15, 7, 18, 1, 13, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M2 */
    private final void m2155M2() {
        ImageView imageView = this.f3754i;
        if (imageView == null) {
            p30.m2986V("fullImageView");
            throw null;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 1) {
                intrinsicWidth = 1;
            }
            float f = intrinsicWidth;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight < 1) {
                intrinsicHeight = 1;
            }
            float f2 = intrinsicHeight;
            ImageView imageView2 = this.f3754i;
            if (imageView2 == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            int width = imageView2.getWidth();
            if (width < 1) {
                width = 1;
            }
            float f3 = width;
            ImageView imageView3 = this.f3754i;
            if (imageView3 == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            int height = imageView3.getHeight();
            float f4 = height >= 1 ? height : 1;
            float fMin = Math.min(f3 / f, f4 / f2);
            this.f3771z = fMin;
            this.f3770y = fMin;
            this.f3769x.reset();
            this.f3769x.setScale(fMin, fMin);
            this.f3769x.postTranslate((f3 - (f * fMin)) / 2.0f, (f4 - (f2 * fMin)) / 2.0f);
        } else {
            this.f3771z = 1.0f;
            this.f3770y = 1.0f;
            this.f3769x.reset();
        }
        ImageView imageView4 = this.f3754i;
        if (imageView4 == null) {
            p30.m2986V("fullImageView");
            throw null;
        }
        imageView4.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView imageView5 = this.f3754i;
        if (imageView5 == null) {
            p30.m2986V("fullImageView");
            throw null;
        }
        imageView5.setImageMatrix(this.f3769x);
        TextView textView = this.f3761p;
        if (textView == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        textView.setText("✕ 缩放");
        TextView textView2 = this.f3761p;
        if (textView2 == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(m2151L2(14));
        gradientDrawableM4150h.setColor(this.f3748R);
        textView2.setBackground(gradientDrawableM4150h);
        TextView textView3 = this.f3761p;
        if (textView3 == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        textView3.setTextColor(Color.argb(200, 40, 40, 40));
        TextView textView4 = this.f3765t;
        if (textView4 != null) {
            textView4.setText("缩放模式 — 双指缩放 / 单指拖动");
        } else {
            p30.m2986V("modeLabel");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final String m2157N0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 11, 15, 13, 5, 14, 20, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N2 */
    private final void m2159N2() {
        this.f3752g = false;
        this.f3769x.reset();
        ImageView imageView = this.f3754i;
        if (imageView == null) {
            p30.m2986V("fullImageView");
            throw null;
        }
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        TextView textView = this.f3761p;
        if (textView == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        textView.setText("▐ 放大");
        TextView textView2 = this.f3761p;
        if (textView2 == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(m2151L2(14));
        gradientDrawableM4150h.setColor(this.f3743M);
        textView2.setBackground(gradientDrawableM4150h);
        TextView textView3 = this.f3761p;
        if (textView3 == null) {
            p30.m2986V("btnZoom");
            throw null;
        }
        textView3.setTextColor(this.f3744N);
        m2332y3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final String m2161O0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 6, 2, 25, 12, 8, 15, 23, 14, 12, 1, 4, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O2 */
    private final void m2163O2() {
        String str = this.f3749d.get(this.f3750e);
        C0745sz c0745sz = C0745sz.f5862a;
        Bitmap bitmapM4118f = c0745sz.m4118f(str);
        ImageView imageView = this.f3754i;
        if (bitmapM4118f != null) {
            if (imageView != null) {
                imageView.setImageBitmap(bitmapM4118f);
                return;
            } else {
                p30.m2986V("fullImageView");
                throw null;
            }
        }
        if (imageView == null) {
            p30.m2986V("fullImageView");
            throw null;
        }
        imageView.setImageDrawable(null);
        Bitmap bitmapM4119g = c0745sz.m4119g(str);
        if (bitmapM4119g != null) {
            ImageView imageView2 = this.f3754i;
            if (imageView2 == null) {
                p30.m2986V("fullImageView");
                throw null;
            }
            imageView2.setImageBitmap(bitmapM4119g);
        }
        C0870vz.f6878a.m4821o(c0745sz.m4122j(str), new C0073c(7, str, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final String m2165P0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 3, 2, 25, 12, 18, 1, 6, 20, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final na1 m2167P2(String str, m00 m00Var, Bitmap bitmap) {
        if (bitmap != null) {
            C0745sz.f5862a.m4131w(str, bitmap);
            if (p30.m3002l(m00Var.f3749d.get(m00Var.f3750e), str)) {
                ImageView imageView = m00Var.f3754i;
                if (imageView == null) {
                    p30.m2986V("fullImageView");
                    throw null;
                }
                imageView.post(new RunnableC0751t4(5, m00Var, bitmap));
            }
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final String m2169Q0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 4, 2, 25, 12, 22, 9, 7, 4, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final void m2171Q2(m00 m00Var, Bitmap bitmap) {
        ImageView imageView = m00Var.f3754i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            p30.m2986V("fullImageView");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final String m2173R0() {
        return ik0.f2579a.m1592a(35, 17, 20, 84, 20, 6, 17, 69, 34, 14, 5, 78, 41, 7, 4, 69, 36, 5, 47, 95, 42, 14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R2 */
    private final LinearLayout m2175R2() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        final int i = 0;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(m2151L2(10), m2151L2(6), m2151L2(10), m2151L2(20));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM2212a3 = m2212a3(this, "多选模式", this.f3745O, new InterfaceC0298hw(this) { // from class: b00

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ m00 f307e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f307e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i2 = i;
                m00 m00Var = this.f307e;
                switch (i2) {
                    case 0:
                        return m00.m2179S2(m00Var);
                    default:
                        return m00.m2183T2(m00Var);
                }
            }
        }, 0, 8, null);
        this.f3757l = textViewM2212a3;
        if (textViewM2212a3 == null) {
            p30.m2986V("btnMultiSelect");
            throw null;
        }
        linearLayout.addView(textViewM2212a3);
        final int i2 = 1;
        TextView textViewM2207Z2 = m2207Z2("下载当前", this.f3734D, new InterfaceC0298hw(this) { // from class: b00

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ m00 f307e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f307e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i22 = i2;
                m00 m00Var = this.f307e;
                switch (i22) {
                    case 0:
                        return m00.m2179S2(m00Var);
                    default:
                        return m00.m2183T2(m00Var);
                }
            }
        }, Color.argb(200, 40, 40, 40));
        this.f3758m = textViewM2207Z2;
        if (textViewM2207Z2 != null) {
            linearLayout.addView(textViewM2207Z2);
            return linearLayout;
        }
        p30.m2986V("btnDownload");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final String m2177S0() {
        return ik0.f2579a.m1592a(35, 17, 20, 84, 20, 6, 17, 69, 34, 14, 5, 78, 41, 25, 18, 66, 20, 5, 17, 66, 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final na1 m2179S2(m00 m00Var) {
        m00Var.m2312u3();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final String m2181T0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 7, 18, 8, 5, 18, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final na1 m2183T2(m00 m00Var) {
        m00Var.m2232e3();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final String m2185U0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 13, 13, 1, 14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U2 */
    private final LinearLayout m2187U2() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(m2151L2(12), m2151L2(4), m2151L2(8), 0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(" /  ");
        textView.setTextSize(13.0f);
        textView.setTextColor(this.f3736F);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m2151L2(12));
        gradientDrawable.setColor(this.f3738H);
        textView.setBackground(gradientDrawable);
        textView.setPadding(m2151L2(16), m2151L2(4), m2151L2(16), m2151L2(4));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f3764s = textView;
        linearLayout.addView(textView);
        TextView textViewM2222c3 = m2222c3();
        textViewM2222c3.setText("模块设置");
        textViewM2222c3.setTextColor(Color.argb(200, 255, 255, 255));
        int i = 1;
        textViewM2222c3.setOnClickListener(new ViewOnClickListenerC0363jp(textViewM2222c3, i));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(m2151L2(6), 0, 0, 0);
        textViewM2222c3.setLayoutParams(layoutParams);
        this.f3763r = textViewM2222c3;
        linearLayout.addView(textViewM2222c3);
        View view = new View(linearLayout.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(view);
        TextView textViewM2222c32 = m2222c3();
        textViewM2222c32.setOnClickListener(new ViewOnClickListenerC0944xz(this, 0));
        this.f3761p = textViewM2222c32;
        linearLayout.addView(textViewM2222c32);
        TextView textViewM2222c33 = m2222c3();
        textViewM2222c33.setText("全部下载");
        textViewM2222c33.setTextColor(-1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(m2151L2(14));
        gradientDrawable2.setColor(Color.argb(200, 33, 150, 243));
        textViewM2222c33.setBackground(gradientDrawable2);
        textViewM2222c33.setOnClickListener(new ViewOnClickListenerC0944xz(this, i));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(m2151L2(6), 0, 0, 0);
        textViewM2222c33.setLayoutParams(layoutParams2);
        this.f3762q = textViewM2222c33;
        linearLayout.addView(textViewM2222c33);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final String m2189V0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 15, 5, 20, 20, 9, 14, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final void m2191V2(TextView textView, View view) {
        vf0 vf0Var = vf0.f6671a;
        Context context = textView.getContext();
        context.getClass();
        vf0Var.m4714B1(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final String m2193W0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 9, 23, 1, 12, 12, 5, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final void m2195W2(m00 m00Var, View view) {
        m00Var.m2322w3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final String m2197X0() {
        return ik0.f2579a.m1592a(8, 51);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final void m2199X2(m00 m00Var, View view) {
        m00Var.m2127F2();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final String m2201Y0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 18, 24, 13, 27, 14, 69, 34, 14, 30, 95, 62, 5, 18, 69, 36, 8, 15, 84, 37, 25, 18, 93, 46, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y2 */
    private final TextView m2203Y2(String str, int i) {
        int iM2151L2 = m2151L2(44);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(1);
        gradientDrawableM4150h.setColor(this.f3740J);
        gradientDrawableM4150h.setStroke(m2151L2(1), this.f3741K);
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(24.0f);
        textView.setTextColor(this.f3742L);
        textView.setGravity(17);
        textView.setBackground(gradientDrawableM4150h);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iM2151L2, iM2151L2);
        layoutParams.gravity = i | 16;
        layoutParams.setMargins(m2151L2(8), 0, m2151L2(8), 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final String m2205Z0() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 18, 24, 13, 27, 14, 69, 34, 14, 30, 95, 62, 5, 18, 93, 46, 22, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z2 */
    private final TextView m2207Z2(String str, int i, InterfaceC0298hw interfaceC0298hw, int i2) {
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(m2151L2(22));
        gradientDrawableM4150h.setColor(i);
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(i2);
        textView.setGravity(17);
        textView.setBackground(gradientDrawableM4150h);
        textView.setPadding(m2151L2(12), m2151L2(11), m2151L2(12), m2151L2(11));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(m2151L2(5), 0, m2151L2(5), 0);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new d00(0, interfaceC0298hw));
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final String m2210a1() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 18, 24, 13, 27, 14, 69, 34, 14, 30, 95, 62, 5, 18, 66, 34, 10, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ TextView m2212a3(m00 m00Var, String str, int i, InterfaceC0298hw interfaceC0298hw, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = m00Var.f3746P;
        }
        return m00Var.m2207Z2(str, i, interfaceC0298hw, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final String m2215b1() {
        return ik0.f2579a.m1592a(44, 20, 9, 4, 83, 63, 18, 24, 13, 27, 14, 69, 34, 14, 30, 95, 62, 5, 18, 69, 36, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final void m2217b3(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final String m2220c1() {
        return ik0.f2579a.m1592a(32, 29, 9, 78, 57, 29, 19, 80, 39, 20, 21, 85, 20, 21, 3, 86, 20, 17, 20, 66);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c3 */
    private final TextView m2222c3() {
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(m2151L2(14));
        gradientDrawableM4150h.setColor(this.f3743M);
        TextView textView = new TextView(getContext());
        textView.setText("🔍 放大");
        textView.setTextSize(11.0f);
        textView.setTextColor(this.f3744N);
        textView.setGravity(17);
        textView.setBackground(gradientDrawableM4150h);
        textView.setPadding(m2151L2(10), m2151L2(5), m2151L2(10), m2151L2(5));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final String m2225d1() {
        return ik0.f2579a.m1592a(32, 29, 9, 78, 57, 29, 19, 80, 39, 20, 15, 84, 37, 25, 18, 93, 46, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public final void m2227d3(int i) {
        if (i < 0 || i >= this.f3749d.size()) {
            return;
        }
        if (this.f3752g) {
            m2159N2();
        }
        this.f3750e = i;
        m2163O2();
        m2106A3();
        m2327x3();
        m2307t3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final String m2230e1() {
        return ik0.f2579a.m1592a(32, 29, 9, 110, 57, 29, 3, 69, 36, 10, 21, 110, 56, 17, 20, 84, 41, 25, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e3 */
    private final void m2232e3() {
        if (!this.f3751f) {
            m2277n3(this.f3749d.get(this.f3750e), this.f3750e);
            return;
        }
        if (this.f3753h.isEmpty()) {
            return;
        }
        Set<String> set = this.f3753h;
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(set));
        for (String str : set) {
            arrayList.add(new uo0(str, Integer.valueOf(this.f3749d.indexOf(str))));
        }
        int size = arrayList.size();
        m2111B3();
        C0439lp c0439lp = C0439lp.f3566a;
        Context context = getContext();
        context.getClass();
        boolean zM2050f = c0439lp.m2050f(context);
        TextView textView = this.f3758m;
        int i = 0;
        if (!zM2050f) {
            if (textView == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView.setText("下载中(0/" + size + ")");
            C0870vz c0870vz = C0870vz.f6878a;
            Context context2 = getContext();
            context2.getClass();
            c0870vz.m4818f(context2, arrayList, new k00(this, size, i));
            return;
        }
        if (textView == null) {
            p30.m2986V("btnDownload");
            throw null;
        }
        textView.setText("下载中...");
        c0439lp.m2053i();
        Context context3 = getContext();
        context3.getClass();
        DialogC0402kp dialogC0402kp = new DialogC0402kp(context3, "图片 0/" + size);
        dialogC0402kp.show();
        C0870vz c0870vz2 = C0870vz.f6878a;
        Context context4 = getContext();
        context4.getClass();
        c0870vz2.m4819i(context4, arrayList, new j00(this, size, dialogC0402kp, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final String m2235f1() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 56, 25, 6, 84, 20, 27, 5, 66, 63, 23, 29, 110, 37, 25, 29, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final na1 m2237f3(final m00 m00Var, final int i, final DialogC0402kp dialogC0402kp, final int i2, final int i3) {
        final boolean zM2048d = C0439lp.f3566a.m2048d();
        TextView textView = m00Var.f3758m;
        if (textView != null) {
            textView.post(new Runnable() { // from class: zz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    m00.m2242g3(zM2048d, m00Var, i2, i3, i, dialogC0402kp);
                }
            });
            return na1.f4229a;
        }
        p30.m2986V("btnDownload");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final String m2240g1() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 56, 25, 6, 84, 20, 8, 5, 83, 39, 17, 19, 110, 47, 17, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final void m2242g3(boolean z, m00 m00Var, int i, int i2, int i3, DialogC0402kp dialogC0402kp) {
        if (z) {
            TextView textView = m00Var.f3758m;
            if (textView == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView.setText("已取消");
            Toast.makeText(m00Var.getContext(), "已取消下载", 0).show();
            return;
        }
        TextView textView2 = m00Var.f3758m;
        if (textView2 == null) {
            p30.m2986V("btnDownload");
            throw null;
        }
        textView2.setText("下载中(" + i + "/" + i2 + ")");
        if (i >= i2) {
            TextView textView3 = m00Var.f3758m;
            if (textView3 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView3.setText("完成");
            TextView textView4 = m00Var.f3758m;
            if (textView4 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView4.postDelayed(new RunnableC0327ip(dialogC0402kp, 1), 400L);
            Toast.makeText(m00Var.getContext(), "已保存 " + i3 + " 张到红薯仓", 0).show();
            m00Var.f3753h.clear();
            TextView textView5 = m00Var.f3758m;
            if (textView5 != null) {
                textView5.postDelayed(new RunnableC0907wz(m00Var, 2), 700L);
            } else {
                p30.m2986V("btnDownload");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final String m2245h1() {
        return ik0.f2579a.m1592a(56, 27, 2, 94, 35, 20, 15, 69, 36, 8, 15, 84, 37, 25, 18, 93, 46, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final void m2247h3(DialogC0402kp dialogC0402kp) {
        dialogC0402kp.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final String m2250i1() {
        return ik0.f2579a.m1592a(56, 27, 2, 94, 35, 20, 15, 69, 36, 8, 15, 93, 46, 22, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final void m2252i3(m00 m00Var) {
        m00Var.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final String m2255j1() {
        return ik0.f2579a.m1592a(56, 27, 2, 94, 35, 20, 15, 69, 36, 8, 15, 66, 34, 10, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public static final na1 m2257j3(final m00 m00Var, final int i, final int i2, final int i3) {
        TextView textView = m00Var.f3758m;
        if (textView != null) {
            textView.post(new Runnable() { // from class: i00
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    m00.m2262k3(this.f2386d, i2, i3, i);
                }
            });
            return na1.f4229a;
        }
        p30.m2986V("btnDownload");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final String m2260k1() {
        return ik0.f2579a.m1592a(56, 27, 2, 94, 35, 20, 15, 69, 36, 8, 15, 69, 36, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public static final void m2262k3(m00 m00Var, int i, int i2, int i3) {
        TextView textView = m00Var.f3758m;
        if (textView == null) {
            p30.m2986V("btnDownload");
            throw null;
        }
        textView.setText("下载中(" + i + "/" + i2 + ")");
        if (i >= i2) {
            TextView textView2 = m00Var.f3758m;
            if (textView2 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView2.setText("完成");
            int i4 = 0;
            Toast.makeText(m00Var.getContext(), "已保存 " + i3 + " 张到红薯仓", 0).show();
            m00Var.f3753h.clear();
            TextView textView3 = m00Var.f3758m;
            if (textView3 != null) {
                textView3.postDelayed(new RunnableC0907wz(m00Var, i4), 300L);
            } else {
                p30.m2986V("btnDownload");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final String m2265l1() {
        return ik0.f2579a.m1592a(51, 16, 3, 78, 62, 8, 20, 80, 63, 29, 15, 83, 39, 23, 19, 90);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final void m2267l3(m00 m00Var) {
        m00Var.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final String m2270m1() {
        return ik0.f2579a.m1592a(51, 16, 3, 78, 62, 8, 20, 80, 63, 29, 15, 85, 22, 26, 5, 86);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m3 */
    private final boolean m2272m3(MotionEvent motionEvent) {
        if (!this.f3752g) {
            GestureDetector gestureDetector = this.f3766u;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
                return true;
            }
            p30.m2986V("galleryGestureDetector");
            throw null;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f3732B = false;
        }
        ScaleGestureDetector scaleGestureDetector = this.f3767v;
        if (scaleGestureDetector == null) {
            p30.m2986V("scaleGestureDetector");
            throw null;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getPointerCount() == 1 && !this.f3732B) {
            GestureDetector gestureDetector2 = this.f3768w;
            if (gestureDetector2 == null) {
                p30.m2986V("zoomPanDetector");
                throw null;
            }
            gestureDetector2.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final String m2275n1() {
        return ik0.f2579a.m1592a(51, 16, 3, 78, 62, 8, 20, 80, 63, 29, 15, 92, 42, 11, 4, 84, 57);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n3 */
    private final void m2277n3(String str, int i) {
        m2111B3();
        TextView textView = this.f3758m;
        if (textView == null) {
            p30.m2986V("btnDownload");
            throw null;
        }
        textView.setText("下载中...");
        C0870vz c0870vz = C0870vz.f6878a;
        Context context = getContext();
        context.getClass();
        c0870vz.m4820m(context, str, i, new h00(i, 0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final String m2280o1() {
        return ik0.f2579a.m1592a(51, 8, 65, 110, 38, 23, 20, 68, 39, 29, 47, 66, 46, 12, 4, 88, 37, 31, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final na1 m2282o3(final m00 m00Var, final int i, final boolean z) {
        TextView textView = m00Var.f3758m;
        if (textView != null) {
            textView.post(new Runnable(m00Var) { // from class: c00

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ m00 f622e;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f622e = m00Var;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    m00.m2287p3(z, this.f622e, i);
                }
            });
            return na1.f4229a;
        }
        p30.m2986V("btnDownload");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final void m2287p3(boolean z, m00 m00Var, int i) {
        int i2 = 1;
        if (z) {
            TextView textView = m00Var.f3758m;
            if (textView == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView.setText("✔ 已保存");
            Toast.makeText(m00Var.getContext(), "已保存第" + (i + 1) + "张到红薯仓", 0).show();
        } else {
            TextView textView2 = m00Var.f3758m;
            if (textView2 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView2.setText("✘ 失败");
            Toast.makeText(m00Var.getContext(), "下载失败，请重试", 0).show();
        }
        TextView textView3 = m00Var.f3758m;
        if (textView3 != null) {
            textView3.postDelayed(new RunnableC0907wz(m00Var, i2), 2000L);
        } else {
            p30.m2986V("btnDownload");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final void m2292q3(m00 m00Var) {
        TextView textView = m00Var.f3758m;
        if (textView != null) {
            textView.setText("下载当前");
        } else {
            p30.m2986V("btnDownload");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r3 */
    private final void m2297r3(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.7f);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setRepeatCount(1);
        view.startAnimation(alphaAnimation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s3 */
    private final void m2302s3() {
        View childAt;
        LinearLayout linearLayout = this.f3755j;
        if (linearLayout == null) {
            p30.m2986V("thumbContainer");
            throw null;
        }
        int childCount = linearLayout.getChildCount();
        int size = this.f3749d.size();
        if (childCount > size) {
            childCount = size;
        }
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout2 = this.f3755j;
            if (linearLayout2 == null) {
                p30.m2986V("thumbContainer");
                throw null;
            }
            View childAt2 = linearLayout2.getChildAt(i);
            ViewGroup viewGroup = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
            if (viewGroup != null) {
                View childAt3 = viewGroup.getChildAt(0);
                ImageView imageView = childAt3 instanceof ImageView ? (ImageView) childAt3 : null;
                if (imageView != null && (childAt = viewGroup.getChildAt(1)) != null) {
                    if (this.f3753h.contains(this.f3749d.get(i))) {
                        childAt.setBackgroundColor(this.f3733C);
                        imageView.setPadding(m2151L2(3), m2151L2(3), m2151L2(3), m2151L2(3));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setCornerRadius(m2151L2(6));
                        gradientDrawable.setStroke(m2151L2(2), this.f3733C);
                        gradientDrawable.setColor(0);
                        imageView.setBackground(gradientDrawable);
                    } else {
                        childAt.setBackgroundColor(0);
                        imageView.setPadding(0, 0, 0, 0);
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setShape(0);
                        gradientDrawable2.setCornerRadius(m2151L2(6));
                        gradientDrawable2.setColor(this.f3747Q);
                        imageView.setBackground(gradientDrawable2);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t3 */
    private final void m2307t3() {
        LinearLayout linearLayout = this.f3755j;
        if (linearLayout == null) {
            p30.m2986V("thumbContainer");
            throw null;
        }
        if (linearLayout.getChildCount() != 0) {
            int i = this.f3750e;
            LinearLayout linearLayout2 = this.f3755j;
            if (linearLayout2 == null) {
                p30.m2986V("thumbContainer");
                throw null;
            }
            if (i >= linearLayout2.getChildCount()) {
                return;
            }
            LinearLayout linearLayout3 = this.f3755j;
            if (linearLayout3 == null) {
                p30.m2986V("thumbContainer");
                throw null;
            }
            View childAt = linearLayout3.getChildAt(this.f3750e);
            if (childAt == null) {
                return;
            }
            int left = childAt.getLeft();
            HorizontalScrollView horizontalScrollView = this.f3756k;
            if (horizontalScrollView == null) {
                p30.m2986V("thumbScroll");
                throw null;
            }
            int width = (childAt.getWidth() / 2) + (left - (horizontalScrollView.getWidth() / 2));
            HorizontalScrollView horizontalScrollView2 = this.f3756k;
            if (horizontalScrollView2 == null) {
                p30.m2986V("thumbScroll");
                throw null;
            }
            if (width < 0) {
                width = 0;
            }
            horizontalScrollView2.smoothScrollTo(width, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u3 */
    private final void m2312u3() {
        boolean z = this.f3751f;
        this.f3751f = !z;
        if (z) {
            this.f3753h.clear();
        }
        m2337z3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v3 */
    private final void m2317v3(String str, View view) {
        String str2;
        boolean zContains = this.f3753h.contains(str);
        Set<String> set = this.f3753h;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        view.getClass();
        ViewGroup viewGroup = (ViewGroup) view;
        View childAt = viewGroup.getChildAt(0);
        childAt.getClass();
        ImageView imageView = (ImageView) childAt;
        View childAt2 = viewGroup.getChildAt(1);
        if (this.f3753h.contains(str)) {
            childAt2.setBackgroundColor(this.f3733C);
            imageView.setPadding(m2151L2(3), m2151L2(3), m2151L2(3), m2151L2(3));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(m2151L2(6));
            gradientDrawable.setStroke(m2151L2(2), this.f3733C);
            gradientDrawable.setColor(0);
            imageView.setBackground(gradientDrawable);
        } else {
            childAt2.setBackgroundColor(0);
            imageView.setPadding(0, 0, 0, 0);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(m2151L2(6));
            gradientDrawable2.setColor(this.f3747Q);
            imageView.setBackground(gradientDrawable2);
        }
        TextView textView = this.f3758m;
        if (textView == null) {
            p30.m2986V("btnDownload");
            throw null;
        }
        if (this.f3753h.isEmpty()) {
            str2 = "下载当前";
        } else {
            str2 = "下载已选(" + this.f3753h.size() + ")";
        }
        textView.setText(str2);
        TextView textView2 = this.f3758m;
        if (textView2 != null) {
            m2297r3(textView2);
        } else {
            p30.m2986V("btnDownload");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final String m2319w0() {
        return ik0.f2579a.m1592a(32489, 34263, 20131);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w2 */
    private final void m2321w2() {
        LinearLayout linearLayout = this.f3755j;
        if (linearLayout == null) {
            p30.m2986V("thumbContainer");
            throw null;
        }
        linearLayout.removeAllViews();
        final int i = 0;
        for (final String str : this.f3749d) {
            int i2 = i + 1;
            final LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m2151L2(72), m2151L2(86));
            layoutParams.setMargins(m2151L2(3), 0, m2151L2(3), 0);
            linearLayout2.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(m2151L2(6));
            gradientDrawable.setColor(this.f3747Q);
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m2151L2(68), m2151L2(68));
            layoutParams2.gravity = 1;
            imageView.setLayoutParams(layoutParams2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setBackground(gradientDrawable);
            imageView.setClipToOutline(true);
            C0745sz c0745sz = C0745sz.f5862a;
            Bitmap bitmapM4119g = c0745sz.m4119g(str);
            if (bitmapM4119g != null) {
                imageView.setImageBitmap(bitmapM4119g);
            } else {
                C0870vz.f6878a.m4821o(c0745sz.m4125m(str), new C0073c(8, str, imageView));
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: g00
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m00.m2336z2(this.f1834a, str, linearLayout2, i, view);
                }
            });
            linearLayout2.addView(imageView);
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(m2151L2(68), m2151L2(3));
            layoutParams3.topMargin = m2151L2(2);
            view.setLayoutParams(layoutParams3);
            view.setBackgroundColor(this.f3753h.contains(str) ? this.f3733C : 0);
            linearLayout2.addView(view);
            if (this.f3753h.contains(str)) {
                imageView.setPadding(m2151L2(3), m2151L2(3), m2151L2(3), m2151L2(3));
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(m2151L2(6));
                gradientDrawable2.setStroke(m2151L2(2), this.f3733C);
                gradientDrawable2.setColor(0);
                imageView.setBackground(gradientDrawable2);
            }
            LinearLayout linearLayout3 = this.f3755j;
            if (linearLayout3 == null) {
                p30.m2986V("thumbContainer");
                throw null;
            }
            linearLayout3.addView(linearLayout2);
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w3 */
    private final void m2322w3() {
        boolean z = this.f3752g;
        this.f3752g = !z;
        if (z) {
            m2159N2();
        } else {
            m2155M2();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final String m2324x0() {
        return ik0.f2579a.m1592a(40, 25, 4, 78, 56, 25, 6, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final na1 m2326x2(String str, ImageView imageView, Bitmap bitmap) {
        if (bitmap != null) {
            C0745sz.f5862a.m4132x(str, bitmap);
            imageView.post(new RunnableC0751t4(4, imageView, bitmap));
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x3 */
    private final void m2327x3() {
        TextView textView = this.f3764s;
        if (textView == null) {
            p30.m2986V("counterText");
            throw null;
        }
        textView.setText((this.f3750e + 1) + " / " + this.f3749d.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final String m2329y0() {
        return ik0.f2579a.m1592a(47, 25, 4, 84, 20, 30, 31, 93, 47, 29, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final void m2331y2(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y3 */
    private final void m2332y3() {
        TextView textView = this.f3765t;
        if (textView != null) {
            textView.setText(this.f3752g ? "缩放模式 — 双指缩放 / 单指拖动" : "普通模式 — 单击缩略图切换图片");
        } else {
            p30.m2986V("modeLabel");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final String m2334z0() {
        return ik0.f2579a.m1592a(15, 52, 47, 97, 25, 55, 39, 99, 14, 43, 35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final void m2336z2(m00 m00Var, String str, LinearLayout linearLayout, int i, View view) {
        if (m00Var.f3751f) {
            m00Var.m2317v3(str, linearLayout);
        } else {
            m00Var.m2227d3(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z3 */
    private final void m2337z3() {
        String str;
        boolean z = this.f3751f;
        TextView textView = this.f3757l;
        if (z) {
            if (textView == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            textView.setText("普通模式");
            TextView textView2 = this.f3757l;
            if (textView2 == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            textView2.setTextColor(-1);
            TextView textView3 = this.f3757l;
            if (textView3 == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            Drawable background = textView3.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(Color.argb(200, 254, 44, 85));
            }
            TextView textView4 = this.f3765t;
            if (textView4 == null) {
                p30.m2986V("modeLabel");
                throw null;
            }
            textView4.setText("多选模式 — 点击缩略图选择/取消");
            TextView textView5 = this.f3758m;
            if (textView5 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            if (this.f3753h.isEmpty()) {
                str = "下载已选";
            } else {
                str = "下载已选(" + this.f3753h.size() + ")";
            }
            textView5.setText(str);
        } else {
            if (textView == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            textView.setText("多选模式");
            TextView textView6 = this.f3757l;
            if (textView6 == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            textView6.setTextColor(this.f3746P);
            TextView textView7 = this.f3757l;
            if (textView7 == null) {
                p30.m2986V("btnMultiSelect");
                throw null;
            }
            Drawable background2 = textView7.getBackground();
            GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(this.f3745O);
            }
            m2332y3();
            TextView textView8 = this.f3758m;
            if (textView8 == null) {
                p30.m2986V("btnDownload");
                throw null;
            }
            textView8.setText("下载当前");
        }
        m2302s3();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: m00$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0452a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: m00.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0452a(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: A */
        public final String m2338A() {
            return (String) m00.f3713r0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: B */
        public final String m2339B() {
            return (String) m00.f3662R0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: C */
        public final String m2340C() {
            return (String) m00.f3666T0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: D */
        public final String m2341D() {
            return (String) m00.f3725x0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: E */
        public final String m2342E() {
            return (String) m00.f3654J0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: F */
        public final String m2343F() {
            return (String) m00.f3658N0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: G */
        public final String m2344G() {
            return (String) m00.f3642B0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: H */
        public final String m2345H() {
            return (String) m00.f3702l1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: I */
        public final String m2346I() {
            return (String) m00.f3686d1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: J */
        public final String m2347J() {
            return (String) m00.f3694h1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: K */
        public final String m2348K() {
            return (String) m00.f3690f1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: L */
        public final String m2349L() {
            return (String) m00.f3696i1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: M */
        public final String m2350M() {
            return (String) m00.f3710p1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: N */
        public final String m2351N() {
            return (String) m00.f3706n1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: O */
        public final String m2352O() {
            return (String) m00.f3712q1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: P */
        public final String m2353P() {
            return (String) m00.f3683c0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: Q */
        public final String m2354Q() {
            return (String) m00.f3681b0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: R */
        public final String m2355R() {
            return (String) m00.f3670V0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: S */
        public final String m2356S() {
            return (String) m00.f3678Z0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: T */
        public final String m2357T() {
            return (String) m00.f3674X0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: U */
        public final String m2358U() {
            return (String) m00.f3680a1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: V */
        public final String m2359V() {
            return (String) m00.f3641A1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: W */
        public final String m2360W() {
            return (String) m00.f3645C1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: X */
        public final String m2361X() {
            return (String) m00.f3728y1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: Y */
        public final String m2362Y() {
            return (String) m00.f3667U.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: Z */
        public final List<uo0> m2363Z() {
            return m00.f3649E1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m2364a(Context context) {
            context.getClass();
            String string = context.getSharedPreferences(m2362Y(), 0).getString(m2353P(), m2366b());
            return string == null ? m2366b() : string;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a0 */
        public final File m2365a0(Context context) {
            context.getClass();
            String strM2369c0 = m2369c0(context);
            String strM2364a = m2364a(context);
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(strM2369c0);
            if (strM2364a.length() > 0) {
                externalStoragePublicDirectory = new File(externalStoragePublicDirectory, strM2364a);
            }
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            return externalStoragePublicDirectory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final String m2366b() {
            return (String) m00.f3687e0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b0 */
        public final String m2367b0(Context context) {
            Object next;
            StringBuilder sb;
            String str;
            context.getClass();
            String strM2369c0 = m2369c0(context);
            String strM2364a = m2364a(context);
            Iterator<T> it = m2363Z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (p30.m3002l(((uo0) next).f6274d, strM2369c0)) {
                    break;
                }
            }
            uo0 uo0Var = (uo0) next;
            if (uo0Var != null && (str = (String) uo0Var.f6275e) != null) {
                strM2369c0 = str;
            }
            if (strM2364a.length() > 0) {
                sb = new StringBuilder();
                sb.append(strM2369c0);
                sb.append("/");
                sb.append(strM2364a);
            } else {
                sb = new StringBuilder();
                sb.append(strM2369c0);
            }
            sb.append("/");
            return sb.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final boolean m2368c() {
            return m00.f3675Y;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c0 */
        public final String m2369c0(Context context) {
            context.getClass();
            String string = context.getSharedPreferences(m2362Y(), 0).getString(m2354Q(), m2372e());
            if (string != null) {
                return string;
            }
            String strM2372e = m2372e();
            strM2372e.getClass();
            return strM2372e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final int m2370d() {
            return m00.f3671W;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d0 */
        public final boolean m2371d0(Context context) {
            context.getClass();
            return context.getSharedPreferences(m2362Y(), 0).getBoolean(m2378h(), true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final String m2372e() {
            return m00.f3685d0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e0 */
        public final boolean m2373e0(Context context) {
            context.getClass();
            return context.getSharedPreferences(m2362Y(), 0).getBoolean(m2380i(), true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final String m2374f() {
            Calendar calendar = Calendar.getInstance();
            return calendar.get(1) + "." + (calendar.get(2) + 1) + "." + calendar.get(5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f0 */
        public final boolean m2375f0(Context context) {
            context.getClass();
            return context.getSharedPreferences(m2362Y(), 0).getBoolean(m2339B(), false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final int m2376g(Context context) {
            context.getClass();
            return context.getSharedPreferences(m2362Y(), 0).getInt(m2340C(), 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g0 */
        public final boolean m2377g0(Context context) {
            context.getClass();
            Object systemService = context.getSystemService("uimode");
            systemService.getClass();
            return ((UiModeManager) systemService).getNightMode() == 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final String m2378h() {
            return (String) m00.f3689f0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h0 */
        public final boolean m2379h0(Context context) {
            context.getClass();
            return context.getSharedPreferences(m2362Y(), 0).getBoolean(m2386l(), false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final String m2380i() {
            return (String) m00.f3693h0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i0 */
        public final File m2381i0(Context context, String str) {
            context.getClass();
            File fileM2365a0 = m2365a0(context);
            if (m2373e0(context)) {
                fileM2365a0 = new File(fileM2365a0, m2374f());
            }
            if (str != null && m2371d0(context)) {
                fileM2365a0 = new File(fileM2365a0, str);
            }
            if (!fileM2365a0.exists()) {
                fileM2365a0.mkdirs();
            }
            return fileM2365a0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j */
        public final String m2382j() {
            return (String) m00.f3697j0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j0 */
        public final void m2383j0(Context context, int i) {
            context.getClass();
            context.getSharedPreferences(m2362Y(), 0).edit().putInt(m2340C(), i).apply();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: k */
        public final String m2384k() {
            return (String) m00.f3716s1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: k0 */
        public final boolean m2385k0(Context context, String str) {
            context.getClass();
            str.getClass();
            if (!m2379h0(context)) {
                return false;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(m2362Y(), 0);
            switch (str.hashCode()) {
                case -1895213300:
                    if (str.equals("my_events")) {
                        return sharedPreferences.getBoolean(m2338A(), false);
                    }
                    return false;
                case -1875378232:
                    if (str.equals("creator_center")) {
                        return sharedPreferences.getBoolean(m2395t(), false);
                    }
                    return false;
                case -795192327:
                    if (str.equals("wallet")) {
                        return sharedPreferences.getBoolean(m2344G(), false);
                    }
                    return false;
                case -793238695:
                    if (str.equals("applets")) {
                        return sharedPreferences.getBoolean(m2398w(), false);
                    }
                    return false;
                case -432451613:
                    if (str.equals("hey_post")) {
                        return sharedPreferences.getBoolean(m2399x(), false);
                    }
                    return false;
                case 3046176:
                    if (str.equals("cart")) {
                        return sharedPreferences.getBoolean(m2393r(), false);
                    }
                    return false;
                case 3524221:
                    if (str.equals("scan")) {
                        return sharedPreferences.getBoolean(m2342E(), false);
                    }
                    return false;
                case 95844769:
                    if (str.equals("draft")) {
                        return sharedPreferences.getBoolean(m2401z(), false);
                    }
                    return false;
                case 106006350:
                    if (str.equals("order")) {
                        return sharedPreferences.getBoolean(m2341D(), false);
                    }
                    return false;
                case 761757459:
                    if (str.equals("help_center")) {
                        return sharedPreferences.getBoolean(m2396u(), false);
                    }
                    return false;
                case 841591186:
                    if (str.equals("community_rule")) {
                        return sharedPreferences.getBoolean(m2394s(), false);
                    }
                    return false;
                case 926934164:
                    if (str.equals("history")) {
                        return sharedPreferences.getBoolean(m2397v(), false);
                    }
                    return false;
                case 1427818632:
                    if (str.equals("download")) {
                        return sharedPreferences.getBoolean(m2400y(), false);
                    }
                    return false;
                case 1928687423:
                    if (str.equals("discover_friends")) {
                        return sharedPreferences.getBoolean(m2392q(), false);
                    }
                    return false;
                case 1985941072:
                    if (str.equals("setting")) {
                        return sharedPreferences.getBoolean(m2343F(), false);
                    }
                    return false;
                default:
                    return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: l */
        public final String m2386l() {
            return (String) m00.f3660P0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: l0 */
        public final void m2387l0(Context context) {
            context.getClass();
            vf0.f6671a.m4714B1(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: m */
        public final String m2388m() {
            return (String) m00.f3720u1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: n */
        public final String m2389n() {
            return (String) m00.f3724w1.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: o */
        public final String m2390o() {
            return (String) m00.f3673X.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: p */
        public final String m2391p() {
            return (String) m00.f3669V.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: q */
        public final String m2392q() {
            return (String) m00.f3701l0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: r */
        public final String m2393r() {
            return (String) m00.f3729z0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: s */
        public final String m2394s() {
            return (String) m00.f3652H0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: t */
        public final String m2395t() {
            return (String) m00.f3705n0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: u */
        public final String m2396u() {
            return (String) m00.f3656L0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: v */
        public final String m2397v() {
            return (String) m00.f3717t0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: w */
        public final String m2398w() {
            return (String) m00.f3646D0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: x */
        public final String m2399x() {
            return (String) m00.f3650F0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: y */
        public final String m2400y() {
            return (String) m00.f3721v0.getValue();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: z */
        public final String m2401z() {
            return (String) m00.f3709p0.getValue();
        }

        private C0452a() {
        }
    }
}

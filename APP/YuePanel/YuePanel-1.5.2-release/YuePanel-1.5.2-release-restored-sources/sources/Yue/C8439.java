package Yue;

import Yue.C6989;
import Yue.C8472;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.material.color.utilities.Contrast;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8439 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f3503 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f25287 = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: ۥ */
    public C8446 f3504;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟ */
    public static abstract class AbstractC1537 {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC8440 {
        }

        public AbstractC1537(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }

        public void onEnd(@InterfaceC6391 C8439 c8439) {
        }

        public void onPrepare(@InterfaceC6391 C8439 c8439) {
        }

        @InterfaceC6391
        public abstract C8472 onProgress(@InterfaceC6391 C8472 c8472, @InterfaceC6391 List<C8439> list);

        @InterfaceC6391
        public C1536 onStart(@InterfaceC6391 C8439 c8439, @InterfaceC6391 C1536 c1536) {
            return c1536;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(21)
    public static class C8441 extends C8446 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final Interpolator f25288 = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final Interpolator f25289 = new C4789();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final Interpolator f25290 = new DecelerateInterpolator();

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ */
        @InterfaceC7113(21)
        public static class ViewOnApplyWindowInsetsListenerC1538 implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static final int f25291 = 160;

            /* JADX INFO: renamed from: ۥ */
            public final AbstractC1537 f3507;

            /* JADX INFO: renamed from: ۥ۟ */
            public C8472 f3508;

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ, reason: contains not printable characters */
            public class C8442 implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: ۥ */
                public final /* synthetic */ C8439 f3509;

                /* JADX INFO: renamed from: ۥ۟ */
                public final /* synthetic */ C8472 f3510;

                /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
                public final /* synthetic */ C8472 f25292;

                /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
                public final /* synthetic */ int f25293;

                /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
                public final /* synthetic */ View f25294;

                /* JADX DEBUG: Incorrect args count in method signature: ()V */
                public C8442(C8439 c8439, C8472 c8472, C8472 c84722, int i, View view) {
                    this.f3509 = c8439;
                    this.f3510 = c8472;
                    this.f25292 = c84722;
                    this.f25293 = i;
                    this.f25294 = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f3509.m28231(valueAnimator.getAnimatedFraction());
                    C8441.m28241(this.f25294, C8441.m28245(this.f3510, this.f25292, this.f3509.m28227(), this.f25293), Collections.singletonList(this.f3509));
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟, reason: contains not printable characters */
            public class C8443 extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: ۥ */
                public final /* synthetic */ C8439 f3511;

                /* JADX INFO: renamed from: ۥ۟ */
                public final /* synthetic */ View f3512;

                public C8443(C8439 c8439, View view) {
                    this.f3511 = c8439;
                    this.f3512 = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f3511.m28231(1.0f);
                    C8441.m28239(this.f3512, this.f3511);
                }
            }

            /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟$ۥ$ۥ۟۟, reason: contains not printable characters */
            public class RunnableC8444 implements Runnable {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public final /* synthetic */ View f25297;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ C8439 f25298;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ C1536 f25299;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final /* synthetic */ ValueAnimator f25300;

                /* JADX DEBUG: Incorrect args count in method signature: ()V */
                public RunnableC8444(View view, C8439 c8439, C1536 c1536, ValueAnimator valueAnimator) {
                    this.f25297 = view;
                    this.f25298 = c8439;
                    this.f25299 = c1536;
                    this.f25300 = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C8441.m28242(this.f25297, this.f25298, this.f25299);
                    this.f25300.start();
                }
            }

            public ViewOnApplyWindowInsetsListenerC1538(@InterfaceC6391 View view, @InterfaceC6391 AbstractC1537 abstractC1537) {
                this.f3507 = abstractC1537;
                C8472 c8472M27371 = C8273.m27371(view);
                this.f3508 = c8472M27371 != null ? new C8472.C1543(c8472M27371).m4466() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iM28235;
                if (!view.isLaidOut()) {
                    this.f3508 = C8472.m28277(windowInsets, view);
                    return C8441.m28243(view, windowInsets);
                }
                C8472 c8472M28277 = C8472.m28277(windowInsets, view);
                if (this.f3508 == null) {
                    this.f3508 = C8273.m27371(view);
                }
                if (this.f3508 == null) {
                    this.f3508 = c8472M28277;
                    return C8441.m28243(view, windowInsets);
                }
                AbstractC1537 abstractC1537M28244 = C8441.m28244(view);
                if ((abstractC1537M28244 == null || !Objects.equals(abstractC1537M28244.mDispachedInsets, windowInsets)) && (iM28235 = C8441.m28235(c8472M28277, this.f3508)) != 0) {
                    C8472 c8472 = this.f3508;
                    C8439 c8439 = new C8439(iM28235, C8441.m28237(iM28235, c8472M28277, c8472), 160L);
                    c8439.m28231(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c8439.m4428());
                    C1536 c1536M28236 = C8441.m28236(c8472M28277, c8472, iM28235);
                    C8441.m28240(view, c8439, windowInsets, false);
                    duration.addUpdateListener(new C8442(c8439, c8472M28277, c8472, iM28235, view));
                    duration.addListener(new C8443(c8439, view));
                    ViewTreeObserverOnPreDrawListenerC6565.m3026(view, new RunnableC8444(view, c8439, c1536M28236, duration));
                    this.f3508 = c8472M28277;
                    return C8441.m28243(view, windowInsets);
                }
                return C8441.m28243(view, windowInsets);
            }
        }

        public C8441(int i, @InterfaceC6490 Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static int m28235(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8472 c84722) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!c8472.m28281(i2).equals(c84722.m28281(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C1536 m28236(@InterfaceC6391 C8472 c8472, @InterfaceC6391 C8472 c84722, int i) {
            C5450 c5450M28281 = c8472.m28281(i);
            C5450 c5450M282812 = c84722.m28281(i);
            return new C1536(C5450.m16958(Math.min(c5450M28281.f1520, c5450M282812.f1520), Math.min(c5450M28281.f1521, c5450M282812.f1521), Math.min(c5450M28281.f13399, c5450M282812.f13399), Math.min(c5450M28281.f13400, c5450M282812.f13400)), C5450.m16958(Math.max(c5450M28281.f1520, c5450M282812.f1520), Math.max(c5450M28281.f1521, c5450M282812.f1521), Math.max(c5450M28281.f13399, c5450M282812.f13399), Math.max(c5450M28281.f13400, c5450M282812.f13400)));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static Interpolator m28237(int i, C8472 c8472, C8472 c84722) {
            return (i & 8) != 0 ? c8472.m28281(C8472.C8483.m28355()).f13400 > c84722.m28281(C8472.C8483.m28355()).f13400 ? f25288 : f25289 : f25290;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static View.OnApplyWindowInsetsListener m28238(@InterfaceC6391 View view, @InterfaceC6391 AbstractC1537 abstractC1537) {
            return new ViewOnApplyWindowInsetsListenerC1538(view, abstractC1537);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static void m28239(@InterfaceC6391 View view, @InterfaceC6391 C8439 c8439) {
            AbstractC1537 abstractC1537M28244 = m28244(view);
            if (abstractC1537M28244 != null) {
                abstractC1537M28244.onEnd(c8439);
                if (abstractC1537M28244.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m28239(viewGroup.getChildAt(i), c8439);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static void m28240(View view, C8439 c8439, WindowInsets windowInsets, boolean z) {
            AbstractC1537 abstractC1537M28244 = m28244(view);
            if (abstractC1537M28244 != null) {
                abstractC1537M28244.mDispachedInsets = windowInsets;
                if (!z) {
                    abstractC1537M28244.onPrepare(c8439);
                    z = abstractC1537M28244.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m28240(viewGroup.getChildAt(i), c8439, windowInsets, z);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static void m28241(@InterfaceC6391 View view, @InterfaceC6391 C8472 c8472, @InterfaceC6391 List<C8439> list) {
            AbstractC1537 abstractC1537M28244 = m28244(view);
            if (abstractC1537M28244 != null) {
                c8472 = abstractC1537M28244.onProgress(c8472, list);
                if (abstractC1537M28244.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m28241(viewGroup.getChildAt(i), c8472, list);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static void m28242(View view, C8439 c8439, C1536 c1536) {
            AbstractC1537 abstractC1537M28244 = m28244(view);
            if (abstractC1537M28244 != null) {
                abstractC1537M28244.onStart(c8439, c1536);
                if (abstractC1537M28244.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m28242(viewGroup.getChildAt(i), c8439, c1536);
                }
            }
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static WindowInsets m28243(@InterfaceC6391 View view, @InterfaceC6391 WindowInsets windowInsets) {
            return view.getTag(C6989.C6992.f21068) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static AbstractC1537 m28244(View view) {
            Object tag = view.getTag(C6989.C6992.f21076);
            if (tag instanceof ViewOnApplyWindowInsetsListenerC1538) {
                return ((ViewOnApplyWindowInsetsListenerC1538) tag).f3507;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static C8472 m28245(C8472 c8472, C8472 c84722, float f, int i) {
            C8472.C1543 c1543 = new C8472.C1543(c8472);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c1543.m28311(i2, c8472.m28281(i2));
                } else {
                    C5450 c5450M28281 = c8472.m28281(i2);
                    C5450 c5450M282812 = c84722.m28281(i2);
                    float f2 = 1.0f - f;
                    c1543.m28311(i2, C8472.m28275(c5450M28281, (int) (((double) ((c5450M28281.f1520 - c5450M282812.f1520) * f2)) + 0.5d), (int) (((double) ((c5450M28281.f1521 - c5450M282812.f1521) * f2)) + 0.5d), (int) (((double) ((c5450M28281.f13399 - c5450M282812.f13399) * f2)) + 0.5d), (int) (((double) ((c5450M28281.f13400 - c5450M282812.f13400) * f2)) + 0.5d)));
                }
            }
            return c1543.m4466();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static void m28246(@InterfaceC6391 View view, @InterfaceC6490 AbstractC1537 abstractC1537) {
            Object tag = view.getTag(C6989.C6992.f21068);
            if (abstractC1537 == null) {
                view.setTag(C6989.C6992.f21076, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM28238 = m28238(view, abstractC1537);
            view.setTag(C6989.C6992.f21076, onApplyWindowInsetsListenerM28238);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM28238);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8446 {

        /* JADX INFO: renamed from: ۥ */
        public final int f3515;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f3516;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public final Interpolator f25305;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final long f25306;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f25307;

        public C8446(int i, @InterfaceC6490 Interpolator interpolator, long j) {
            this.f3515 = i;
            this.f25305 = interpolator;
            this.f25306 = j;
        }

        /* JADX INFO: renamed from: ۥ */
        public float m4433() {
            return this.f25307;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public long mo4431() {
            return this.f25306;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public float mo28251() {
            return this.f3516;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public float mo28252() {
            Interpolator interpolator = this.f25305;
            return interpolator != null ? interpolator.getInterpolation(this.f3516) : this.f3516;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Interpolator mo28253() {
            return this.f25305;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public int mo28254() {
            return this.f3515;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m28256(float f) {
            this.f25307 = f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo28255(float f) {
            this.f3516 = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8439(int i, @InterfaceC6490 Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3504 = new C8445(i, interpolator, j);
        } else {
            this.f3504 = new C8441(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m28224(@InterfaceC6391 View view, @InterfaceC6490 AbstractC1537 abstractC1537) {
        if (Build.VERSION.SDK_INT >= 30) {
            C8445.m28250(view, abstractC1537);
        } else {
            C8441.m28246(view, abstractC1537);
        }
    }

    @InterfaceC7113(30)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static C8439 m28225(WindowInsetsAnimation windowInsetsAnimation) {
        return new C8439(windowInsetsAnimation);
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    /* JADX INFO: renamed from: ۥ */
    public float m4427() {
        return this.f3504.m4433();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public long m4428() {
        return this.f3504.mo4431();
    }

    @InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m28226() {
        return this.f3504.mo28251();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m28227() {
        return this.f3504.mo28252();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Interpolator m28228() {
        return this.f3504.mo28253();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m28229() {
        return this.f3504.mo28254();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m28230(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.f3504.m28256(f);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28231(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        this.f3504.mo28255(f);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8445 extends C8446 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        @InterfaceC6391
        public final WindowInsetsAnimation f25302;

        /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ۟۟۟$ۥ */
        @InterfaceC7113(30)
        public static class C1539 extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: ۥ */
            public final AbstractC1537 f3513;

            /* JADX INFO: renamed from: ۥ۟ */
            public List<C8439> f3514;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public ArrayList<C8439> f25303;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public final HashMap<WindowInsetsAnimation, C8439> f25304;

            public C1539(@InterfaceC6391 AbstractC1537 abstractC1537) {
                super(abstractC1537.getDispatchMode());
                this.f25304 = new HashMap<>();
                this.f3513 = abstractC1537;
            }

            public void onEnd(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation) {
                this.f3513.onEnd(m4432(windowInsetsAnimation));
                this.f25304.remove(windowInsetsAnimation);
            }

            public void onPrepare(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation) {
                this.f3513.onPrepare(m4432(windowInsetsAnimation));
            }

            @InterfaceC6391
            public WindowInsets onProgress(@InterfaceC6391 WindowInsets windowInsets, @InterfaceC6391 List<WindowInsetsAnimation> list) {
                ArrayList<C8439> arrayList = this.f25303;
                if (arrayList == null) {
                    ArrayList<C8439> arrayList2 = new ArrayList<>(list.size());
                    this.f25303 = arrayList2;
                    this.f3514 = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM4446 = C8459.m4446(list.get(size));
                    C8439 c8439M4432 = m4432(windowInsetsAnimationM4446);
                    c8439M4432.m28231(windowInsetsAnimationM4446.getFraction());
                    this.f25303.add(c8439M4432);
                }
                return this.f3513.onProgress(C8472.m28276(windowInsets), this.f3514).m28310();
            }

            @InterfaceC6391
            public WindowInsetsAnimation.Bounds onStart(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation, @InterfaceC6391 WindowInsetsAnimation.Bounds bounds) {
                return this.f3513.onStart(m4432(windowInsetsAnimation), C1536.m28232(bounds)).m28234();
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public final C8439 m4432(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation) {
                C8439 c8439 = this.f25304.get(windowInsetsAnimation);
                if (c8439 != null) {
                    return c8439;
                }
                C8439 c8439M28225 = C8439.m28225(windowInsetsAnimation);
                this.f25304.put(windowInsetsAnimation, c8439M28225);
                return c8439M28225;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8445(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f25302 = windowInsetsAnimation;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static WindowInsetsAnimation.Bounds m28247(@InterfaceC6391 C1536 c1536) {
            C8449.m4436();
            return C8448.m4435(c1536.m4429().m16963(), c1536.m4430().m16963());
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static C5450 m28248(@InterfaceC6391 WindowInsetsAnimation.Bounds bounds) {
            return C5450.m16961(bounds.getUpperBound());
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static C5450 m28249(@InterfaceC6391 WindowInsetsAnimation.Bounds bounds) {
            return C5450.m16961(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m28250(@InterfaceC6391 View view, @InterfaceC6490 AbstractC1537 abstractC1537) {
            view.setWindowInsetsAnimationCallback(abstractC1537 != null ? new C1539(abstractC1537) : null);
        }

        @Override // Yue.C8439.C8446
        /* JADX INFO: renamed from: ۥ۟ */
        public long mo4431() {
            return this.f25302.getDurationMillis();
        }

        @Override // Yue.C8439.C8446
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float mo28251() {
            return this.f25302.getFraction();
        }

        @Override // Yue.C8439.C8446
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float mo28252() {
            return this.f25302.getInterpolatedFraction();
        }

        @Override // Yue.C8439.C8446
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Interpolator mo28253() {
            return this.f25302.getInterpolator();
        }

        @Override // Yue.C8439.C8446
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int mo28254() {
            return this.f25302.getTypeMask();
        }

        @Override // Yue.C8439.C8446
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo28255(float f) {
            this.f25302.setFraction(f);
        }

        public C8445(int i, Interpolator interpolator, long j) {
            this(C8458.m4445(i, interpolator, j));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۥ$ۥ */
    public static final class C1536 {

        /* JADX INFO: renamed from: ۥ */
        public final C5450 f3505;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C5450 f3506;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1536(@InterfaceC6391 C5450 c5450, @InterfaceC6391 C5450 c54502) {
            this.f3505 = c5450;
            this.f3506 = c54502;
        }

        @InterfaceC6391
        @InterfaceC7113(30)
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static C1536 m28232(@InterfaceC6391 WindowInsetsAnimation.Bounds bounds) {
            return new C1536(bounds);
        }

        public String toString() {
            return "Bounds{lower=" + this.f3505 + " upper=" + this.f3506 + "}";
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C5450 m4429() {
            return this.f3505;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C5450 m4430() {
            return this.f3506;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C1536 m28233(@InterfaceC6391 C5450 c5450) {
            return new C1536(C8472.m28275(this.f3505, c5450.f1520, c5450.f1521, c5450.f13399, c5450.f13400), C8472.m28275(this.f3506, c5450.f1520, c5450.f1521, c5450.f13399, c5450.f13400));
        }

        @InterfaceC6391
        @InterfaceC7113(30)
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public WindowInsetsAnimation.Bounds m28234() {
            return C8445.m28247(this);
        }

        @InterfaceC7113(30)
        public C1536(@InterfaceC6391 WindowInsetsAnimation.Bounds bounds) {
            this.f3505 = C8445.m28249(bounds);
            this.f3506 = C8445.m28248(bounds);
        }
    }

    @InterfaceC7113(30)
    public C8439(@InterfaceC6391 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3504 = new C8445(windowInsetsAnimation);
        }
    }
}

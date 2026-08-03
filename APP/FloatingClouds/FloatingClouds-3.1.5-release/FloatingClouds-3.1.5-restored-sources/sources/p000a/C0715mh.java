package p000a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.C1066R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0734nh;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.mh */
/* JADX INFO: loaded from: classes.dex */
public final class C0715mh {

    /* JADX INFO: renamed from: a */
    public e f2705a;

    /* JADX INFO: renamed from: a.mh$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C0479a9 f2706a;

        /* JADX INFO: renamed from: b */
        public final C0479a9 f2707b;

        public a(C0479a9 c0479a9, C0479a9 c0479a92) {
            this.f2706a = c0479a9;
            this.f2707b = c0479a92;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f2706a + " upper=" + this.f2707b + "}";
        }
    }

    /* JADX INFO: renamed from: a.mh$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public WindowInsets f2708a;

        /* JADX INFO: renamed from: a */
        public abstract C0734nh mo1228a(C0734nh c0734nh, List<C0715mh> list);
    }

    /* JADX INFO: renamed from: a.mh$c */
    public static class c extends e {

        /* JADX INFO: renamed from: e */
        public static final PathInterpolator f2709e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: f */
        public static final C0685l6 f2710f = new C0685l6();

        /* JADX INFO: renamed from: g */
        public static final DecelerateInterpolator f2711g = new DecelerateInterpolator();

        /* JADX INFO: renamed from: a.mh$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final C0498b9 f2712a;

            /* JADX INFO: renamed from: b */
            public C0734nh f2713b;

            /* JADX INFO: renamed from: a.mh$c$a$a, reason: collision with other inner class name */
            public class C1336a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0715mh f2714a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0734nh f2715b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C0734nh f2716c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2717d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f2718e;

                public C1336a(C0715mh c0715mh, C0734nh c0734nh, C0734nh c0734nh2, int i, View view) {
                    this.f2714a = c0715mh;
                    this.f2715b = c0734nh;
                    this.f2716c = c0734nh2;
                    this.f2717d = i;
                    this.f2718e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    int i;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    C0715mh c0715mh = this.f2714a;
                    c0715mh.f2705a.mo1638d(animatedFraction);
                    float fMo1636b = c0715mh.f2705a.mo1636b();
                    PathInterpolator pathInterpolator = c.f2709e;
                    int i2 = Build.VERSION.SDK_INT;
                    C0734nh c0734nh = this.f2715b;
                    C0734nh.e dVar = i2 >= 30 ? new C0734nh.d(c0734nh) : i2 >= 29 ? new C0734nh.c(c0734nh) : new C0734nh.b(c0734nh);
                    int i3 = 1;
                    while (i3 <= 256) {
                        int i4 = this.f2717d & i3;
                        C0734nh.k kVar = c0734nh.f2857a;
                        if (i4 == 0) {
                            dVar.mo1703c(i3, kVar.mo1710f(i3));
                            f = fMo1636b;
                            i = 1;
                        } else {
                            C0479a9 c0479a9Mo1710f = kVar.mo1710f(i3);
                            C0479a9 c0479a9Mo1710f2 = this.f2716c.f2857a.mo1710f(i3);
                            float f2 = 1.0f - fMo1636b;
                            f = fMo1636b;
                            i = 1;
                            dVar.mo1703c(i3, C0734nh.m1689e(c0479a9Mo1710f, (int) (((double) ((c0479a9Mo1710f.f1798a - c0479a9Mo1710f2.f1798a) * f2)) + 0.5d), (int) (((double) ((c0479a9Mo1710f.f1799b - c0479a9Mo1710f2.f1799b) * f2)) + 0.5d), (int) (((double) ((c0479a9Mo1710f.f1800c - c0479a9Mo1710f2.f1800c) * f2)) + 0.5d), (int) (((double) ((c0479a9Mo1710f.f1801d - c0479a9Mo1710f2.f1801d) * f2)) + 0.5d)));
                        }
                        i3 <<= i;
                        fMo1636b = f;
                    }
                    c.m1631g(this.f2718e, dVar.mo1697b(), Collections.singletonList(c0715mh));
                }
            }

            /* JADX INFO: renamed from: a.mh$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C0715mh f2719a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f2720b;

                public b(C0715mh c0715mh, View view) {
                    this.f2719a = c0715mh;
                    this.f2720b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C0715mh c0715mh = this.f2719a;
                    c0715mh.f2705a.mo1638d(1.0f);
                    c.m1629e(c0715mh, this.f2720b);
                }
            }

            /* JADX INFO: renamed from: a.mh$c$a$c, reason: collision with other inner class name */
            public class RunnableC1337c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f2721a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0715mh f2722b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ a f2723c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f2724d;

                public RunnableC1337c(View view, C0715mh c0715mh, a aVar, ValueAnimator valueAnimator) {
                    this.f2721a = view;
                    this.f2722b = c0715mh;
                    this.f2723c = aVar;
                    this.f2724d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.m1632h(this.f2721a, this.f2722b, this.f2723c);
                    this.f2724d.start();
                }
            }

            public a(View view, C0498b9 c0498b9) {
                C0734nh c0734nhMo1697b;
                this.f2712a = c0498b9;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0734nh c0734nhM2035a = C0866ug.e.m2035a(view);
                if (c0734nhM2035a != null) {
                    int i = Build.VERSION.SDK_INT;
                    c0734nhMo1697b = (i >= 30 ? new C0734nh.d(c0734nhM2035a) : i >= 29 ? new C0734nh.c(c0734nhM2035a) : new C0734nh.b(c0734nhM2035a)).mo1697b();
                } else {
                    c0734nhMo1697b = null;
                }
                this.f2713b = c0734nhMo1697b;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0734nh.k kVar;
                if (!view.isLaidOut()) {
                    this.f2713b = C0734nh.m1690g(view, windowInsets);
                    return c.m1633i(view, windowInsets);
                }
                C0734nh c0734nhM1690g = C0734nh.m1690g(view, windowInsets);
                if (this.f2713b == null) {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    this.f2713b = C0866ug.e.m2035a(view);
                }
                if (this.f2713b == null) {
                    this.f2713b = c0734nhM1690g;
                    return c.m1633i(view, windowInsets);
                }
                b bVarM1634j = c.m1634j(view);
                if (bVarM1634j != null && Objects.equals(bVarM1634j.f2708a, windowInsets)) {
                    return c.m1633i(view, windowInsets);
                }
                C0734nh c0734nh = this.f2713b;
                int i = 1;
                int i2 = 0;
                while (true) {
                    kVar = c0734nhM1690g.f2857a;
                    if (i > 256) {
                        break;
                    }
                    if (!kVar.mo1710f(i).equals(c0734nh.f2857a.mo1710f(i))) {
                        i2 |= i;
                    }
                    i <<= 1;
                }
                if (i2 == 0) {
                    return c.m1633i(view, windowInsets);
                }
                C0734nh c0734nh2 = this.f2713b;
                C0715mh c0715mh = new C0715mh(i2, (i2 & 8) != 0 ? kVar.mo1710f(8).f1801d > c0734nh2.f2857a.mo1710f(8).f1801d ? c.f2709e : c.f2710f : c.f2711g, 160L);
                c0715mh.f2705a.mo1638d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0715mh.f2705a.mo1635a());
                C0479a9 c0479a9Mo1710f = kVar.mo1710f(i2);
                C0479a9 c0479a9Mo1710f2 = c0734nh2.f2857a.mo1710f(i2);
                int iMin = Math.min(c0479a9Mo1710f.f1798a, c0479a9Mo1710f2.f1798a);
                int i3 = c0479a9Mo1710f.f1799b;
                int i4 = c0479a9Mo1710f2.f1799b;
                int iMin2 = Math.min(i3, i4);
                int i5 = c0479a9Mo1710f.f1800c;
                int i6 = c0479a9Mo1710f2.f1800c;
                int iMin3 = Math.min(i5, i6);
                int i7 = c0479a9Mo1710f.f1801d;
                int i8 = i2;
                int i9 = c0479a9Mo1710f2.f1801d;
                a aVar = new a(C0479a9.m1165b(iMin, iMin2, iMin3, Math.min(i7, i9)), C0479a9.m1165b(Math.max(c0479a9Mo1710f.f1798a, c0479a9Mo1710f2.f1798a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                c.m1630f(view, c0715mh, windowInsets, false);
                duration.addUpdateListener(new C1336a(c0715mh, c0734nhM1690g, c0734nh2, i8, view));
                duration.addListener(new b(c0715mh, view));
                ViewTreeObserverOnPreDrawListenerC0615hc.m1466a(view, new RunnableC1337c(view, c0715mh, aVar, duration));
                this.f2713b = c0734nhM1690g;
                return c.m1633i(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m1629e(C0715mh c0715mh, View view) {
            b bVarM1634j = m1634j(view);
            if (bVarM1634j != null) {
                ((C0498b9) bVarM1634j).f1843b.setTranslationY(0.0f);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m1629e(c0715mh, viewGroup.getChildAt(i));
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m1630f(View view, C0715mh c0715mh, WindowInsets windowInsets, boolean z) {
            b bVarM1634j = m1634j(view);
            if (bVarM1634j != null) {
                bVarM1634j.f2708a = windowInsets;
                if (!z) {
                    C0498b9 c0498b9 = (C0498b9) bVarM1634j;
                    View view2 = c0498b9.f1843b;
                    int[] iArr = c0498b9.f1846e;
                    view2.getLocationOnScreen(iArr);
                    z = true;
                    c0498b9.f1844c = iArr[1];
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m1630f(viewGroup.getChildAt(i), c0715mh, windowInsets, z);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m1631g(View view, C0734nh c0734nh, List<C0715mh> list) {
            b bVarM1634j = m1634j(view);
            if (bVarM1634j != null) {
                bVarM1634j.mo1228a(c0734nh, list);
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m1631g(viewGroup.getChildAt(i), c0734nh, list);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static void m1632h(View view, C0715mh c0715mh, a aVar) {
            b bVarM1634j = m1634j(view);
            if (bVarM1634j == null) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        m1632h(viewGroup.getChildAt(i), c0715mh, aVar);
                    }
                    return;
                }
                return;
            }
            C0498b9 c0498b9 = (C0498b9) bVarM1634j;
            View view2 = c0498b9.f1843b;
            int[] iArr = c0498b9.f1846e;
            view2.getLocationOnScreen(iArr);
            int i2 = c0498b9.f1844c - iArr[1];
            c0498b9.f1845d = i2;
            view2.setTranslationY(i2);
        }

        /* JADX INFO: renamed from: i */
        public static WindowInsets m1633i(View view, WindowInsets windowInsets) {
            return view.getTag(C1066R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: j */
        public static b m1634j(View view) {
            Object tag = view.getTag(C1066R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f2712a;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a.mh$d */
    public static class d extends e {

        /* JADX INFO: renamed from: e */
        public final WindowInsetsAnimation f2725e;

        /* JADX INFO: renamed from: a.mh$d$a */
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final C0498b9 f2726a;

            /* JADX INFO: renamed from: b */
            public List<C0715mh> f2727b;

            /* JADX INFO: renamed from: c */
            public ArrayList<C0715mh> f2728c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, C0715mh> f2729d;

            public a(C0498b9 c0498b9) {
                super(0);
                this.f2729d = new HashMap<>();
                this.f2726a = c0498b9;
            }

            /* JADX INFO: renamed from: a */
            public final C0715mh m1639a(WindowInsetsAnimation windowInsetsAnimation) {
                C0715mh c0715mh = this.f2729d.get(windowInsetsAnimation);
                if (c0715mh == null) {
                    c0715mh = new C0715mh(0, null, 0L);
                    if (Build.VERSION.SDK_INT >= 30) {
                        c0715mh.f2705a = new d(windowInsetsAnimation);
                    }
                    this.f2729d.put(windowInsetsAnimation, c0715mh);
                }
                return c0715mh;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                C0498b9 c0498b9 = this.f2726a;
                m1639a(windowInsetsAnimation);
                c0498b9.f1843b.setTranslationY(0.0f);
                this.f2729d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                C0498b9 c0498b9 = this.f2726a;
                m1639a(windowInsetsAnimation);
                View view = c0498b9.f1843b;
                int[] iArr = c0498b9.f1846e;
                view.getLocationOnScreen(iArr);
                c0498b9.f1844c = iArr[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C0715mh> arrayList = this.f2728c;
                if (arrayList == null) {
                    ArrayList<C0715mh> arrayList2 = new ArrayList<>(list.size());
                    this.f2728c = arrayList2;
                    this.f2727b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM231j = C0092F.m231j(list.get(size));
                    C0715mh c0715mhM1639a = m1639a(windowInsetsAnimationM231j);
                    c0715mhM1639a.f2705a.mo1638d(windowInsetsAnimationM231j.getFraction());
                    this.f2728c.add(c0715mhM1639a);
                }
                C0498b9 c0498b9 = this.f2726a;
                C0734nh c0734nhM1690g = C0734nh.m1690g(null, windowInsets);
                c0498b9.mo1228a(c0734nhM1690g, this.f2727b);
                return c0734nhM1690g.m1695f();
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                C0498b9 c0498b9 = this.f2726a;
                m1639a(windowInsetsAnimation);
                C0479a9 c0479a9M1166c = C0479a9.m1166c(bounds.getLowerBound());
                C0479a9 c0479a9M1166c2 = C0479a9.m1166c(bounds.getUpperBound());
                View view = c0498b9.f1843b;
                int[] iArr = c0498b9.f1846e;
                view.getLocationOnScreen(iArr);
                int i = c0498b9.f1844c - iArr[1];
                c0498b9.f1845d = i;
                view.setTranslationY(i);
                C0092F.m234m();
                return C0092F.m229h(c0479a9M1166c.m1167d(), c0479a9M1166c2.m1167d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f2725e = windowInsetsAnimation;
        }

        @Override // p000a.C0715mh.e
        /* JADX INFO: renamed from: a */
        public final long mo1635a() {
            return this.f2725e.getDurationMillis();
        }

        @Override // p000a.C0715mh.e
        /* JADX INFO: renamed from: b */
        public final float mo1636b() {
            return this.f2725e.getInterpolatedFraction();
        }

        @Override // p000a.C0715mh.e
        /* JADX INFO: renamed from: c */
        public final int mo1637c() {
            return this.f2725e.getTypeMask();
        }

        @Override // p000a.C0715mh.e
        /* JADX INFO: renamed from: d */
        public final void mo1638d(float f) {
            this.f2725e.setFraction(f);
        }
    }

    /* JADX INFO: renamed from: a.mh$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final int f2730a;

        /* JADX INFO: renamed from: b */
        public float f2731b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f2732c;

        /* JADX INFO: renamed from: d */
        public final long f2733d;

        public e(int i, Interpolator interpolator, long j) {
            this.f2730a = i;
            this.f2732c = interpolator;
            this.f2733d = j;
        }

        /* JADX INFO: renamed from: a */
        public long mo1635a() {
            return this.f2733d;
        }

        /* JADX INFO: renamed from: b */
        public float mo1636b() {
            Interpolator interpolator = this.f2732c;
            return interpolator != null ? interpolator.getInterpolation(this.f2731b) : this.f2731b;
        }

        /* JADX INFO: renamed from: c */
        public int mo1637c() {
            return this.f2730a;
        }

        /* JADX INFO: renamed from: d */
        public void mo1638d(float f) {
            this.f2731b = f;
        }
    }

    public C0715mh(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2705a = new d(C0092F.m230i(i, interpolator, j));
        } else {
            this.f2705a = new c(i, interpolator, j);
        }
    }
}

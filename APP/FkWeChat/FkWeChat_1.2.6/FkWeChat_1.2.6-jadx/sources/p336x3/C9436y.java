package p336x3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p075f4.C2287a;
import p206o3.AbstractC5632b;
import p252r3.C6475f;
import p336x3.C9408m0;

/* JADX INFO: renamed from: x3.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9436y {

    /* JADX INFO: renamed from: a */
    public e f32036a;

    /* JADX INFO: renamed from: x3.y$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends e {

        /* JADX INFO: renamed from: f */
        public static final Interpolator f32041f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        public static final Interpolator f32042g = new C2287a();

        /* JADX INFO: renamed from: h */
        public static final Interpolator f32043h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        public static final Interpolator f32044i = new AccelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: x3.y$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final b f32045a;

            /* JADX INFO: renamed from: b */
            public C9408m0 f32046b;

            /* JADX INFO: renamed from: x3.y$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public class C10253a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C9436y f32047a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C9408m0 f32048b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C9408m0 f32049c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f32050d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f32051e;

                public C10253a(C9436y c9436y, C9408m0 c9408m0, C9408m0 c9408m02, int i10, View view) {
                    this.f32047a = c9436y;
                    this.f32048b = c9408m0;
                    this.f32049c = c9408m02;
                    this.f32050d = i10;
                    this.f32051e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f32047a.m36716f(valueAnimator.getAnimatedFraction());
                    c.m36729l(this.f32051e, c.m36733p(this.f32048b, this.f32049c, this.f32047a.m36714c(), this.f32050d), Collections.singletonList(this.f32047a));
                }
            }

            /* JADX INFO: renamed from: x3.y$c$a$b */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C9436y f32053a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f32054b;

                public b(C9436y c9436y, View view) {
                    this.f32053a = c9436y;
                    this.f32054b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f32053a.m36716f(1.0f);
                    c.m36727j(this.f32054b, this.f32053a);
                }
            }

            /* JADX INFO: renamed from: x3.y$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public class RunnableC10254c implements Runnable {

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ View f32056q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C9436y f32057r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ a f32058s;

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ ValueAnimator f32059t;

                public RunnableC10254c(View view, C9436y c9436y, a aVar, ValueAnimator valueAnimator) {
                    this.f32056q = view;
                    this.f32057r = c9436y;
                    this.f32058s = aVar;
                    this.f32059t = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m36730m(this.f32056q, this.f32057r, this.f32058s);
                    this.f32059t.start();
                }
            }

            public a(View view, b bVar) {
                this.f32045a = bVar;
                C9408m0 c9408m0M36657g = AbstractC9428u.m36657g(view);
                this.f32046b = c9408m0M36657g != null ? new C9408m0.a(c9408m0M36657g).m36570a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f32046b = C9408m0.m36552t(windowInsets, view);
                    return c.m36731n(view, windowInsets);
                }
                C9408m0 c9408m0M36552t = C9408m0.m36552t(windowInsets, view);
                if (this.f32046b == null) {
                    this.f32046b = AbstractC9428u.m36657g(view);
                }
                if (this.f32046b == null) {
                    this.f32046b = c9408m0M36552t;
                    return c.m36731n(view, windowInsets);
                }
                b bVarM36732o = c.m36732o(view);
                if (bVarM36732o != null && Objects.equals(bVarM36732o.f32039q, c9408m0M36552t)) {
                    return c.m36731n(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.m36723f(c9408m0M36552t, this.f32046b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f32046b = c9408m0M36552t;
                    return c.m36731n(view, windowInsets);
                }
                C9408m0 c9408m0 = this.f32046b;
                C9436y c9436y = new C9436y(i12, c.m36725h(i10, i11), (C9408m0.n.m36615d() & i12) != 0 ? 160L : 250L);
                c9436y.m36716f(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c9436y.m36713b());
                a aVarM36724g = c.m36724g(c9408m0M36552t, c9408m0, i12);
                c.m36728k(view, c9436y, c9408m0M36552t, false);
                duration.addUpdateListener(new C10253a(c9436y, c9408m0M36552t, c9408m0, i12, view));
                duration.addListener(new b(c9436y, view));
                ViewTreeObserverOnPreDrawListenerC9398j.m36535a(view, new RunnableC10254c(view, c9436y, aVarM36724g, duration));
                this.f32046b = c9408m0M36552t;
                return c.m36731n(view, windowInsets);
            }
        }

        public c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        /* JADX INFO: renamed from: f */
        public static void m36723f(C9408m0 c9408m0, C9408m0 c9408m02, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                C6475f c6475fM36558f = c9408m0.m36558f(i10);
                C6475f c6475fM36558f2 = c9408m02.m36558f(i10);
                int i11 = c6475fM36558f.f20347a;
                int i12 = c6475fM36558f2.f20347a;
                boolean z10 = i11 > i12 || c6475fM36558f.f20348b > c6475fM36558f2.f20348b || c6475fM36558f.f20349c > c6475fM36558f2.f20349c || c6475fM36558f.f20350d > c6475fM36558f2.f20350d;
                if (z10 != (i11 < i12 || c6475fM36558f.f20348b < c6475fM36558f2.f20348b || c6475fM36558f.f20349c < c6475fM36558f2.f20349c || c6475fM36558f.f20350d < c6475fM36558f2.f20350d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static a m36724g(C9408m0 c9408m0, C9408m0 c9408m02, int i10) {
            C6475f c6475fM36558f = c9408m0.m36558f(i10);
            C6475f c6475fM36558f2 = c9408m02.m36558f(i10);
            return new a(C6475f.m25652b(Math.min(c6475fM36558f.f20347a, c6475fM36558f2.f20347a), Math.min(c6475fM36558f.f20348b, c6475fM36558f2.f20348b), Math.min(c6475fM36558f.f20349c, c6475fM36558f2.f20349c), Math.min(c6475fM36558f.f20350d, c6475fM36558f2.f20350d)), C6475f.m25652b(Math.max(c6475fM36558f.f20347a, c6475fM36558f2.f20347a), Math.max(c6475fM36558f.f20348b, c6475fM36558f2.f20348b), Math.max(c6475fM36558f.f20349c, c6475fM36558f2.f20349c), Math.max(c6475fM36558f.f20350d, c6475fM36558f2.f20350d)));
        }

        /* JADX INFO: renamed from: h */
        public static Interpolator m36725h(int i10, int i11) {
            if ((C9408m0.n.m36615d() & i10) != 0) {
                return f32041f;
            }
            if ((C9408m0.n.m36615d() & i11) != 0) {
                return f32042g;
            }
            if ((i10 & C9408m0.n.m36620i()) != 0) {
                return f32043h;
            }
            if ((C9408m0.n.m36620i() & i11) != 0) {
                return f32044i;
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static View.OnApplyWindowInsetsListener m36726i(View view, b bVar) {
            return new a(view, bVar);
        }

        /* JADX INFO: renamed from: j */
        public static void m36727j(View view, C9436y c9436y) {
            b bVarM36732o = m36732o(view);
            if (bVarM36732o != null) {
                bVarM36732o.mo13333c(c9436y);
                if (bVarM36732o.m36722b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m36727j(viewGroup.getChildAt(i10), c9436y);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m36728k(View view, C9436y c9436y, C9408m0 c9408m0, boolean z10) {
            b bVarM36732o = m36732o(view);
            if (bVarM36732o != null) {
                bVarM36732o.f32039q = c9408m0;
                if (!z10) {
                    bVarM36732o.mo13334d(c9436y);
                    z10 = bVarM36732o.m36722b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m36728k(viewGroup.getChildAt(i10), c9436y, c9408m0, z10);
                }
            }
        }

        /* JADX INFO: renamed from: l */
        public static void m36729l(View view, C9408m0 c9408m0, List list) {
            b bVarM36732o = m36732o(view);
            if (bVarM36732o != null) {
                c9408m0 = bVarM36732o.mo13335e(c9408m0, list);
                if (bVarM36732o.m36722b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m36729l(viewGroup.getChildAt(i10), c9408m0, list);
                }
            }
        }

        /* JADX INFO: renamed from: m */
        public static void m36730m(View view, C9436y c9436y, a aVar) {
            b bVarM36732o = m36732o(view);
            if (bVarM36732o != null) {
                bVarM36732o.mo13336f(c9436y, aVar);
                if (bVarM36732o.m36722b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m36730m(viewGroup.getChildAt(i10), c9436y, aVar);
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public static WindowInsets m36731n(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC5632b.f17654M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: o */
        public static b m36732o(View view) {
            Object tag = view.getTag(AbstractC5632b.f17659R);
            if (tag instanceof a) {
                return ((a) tag).f32045a;
            }
            return null;
        }

        /* JADX INFO: renamed from: p */
        public static C9408m0 m36733p(C9408m0 c9408m0, C9408m0 c9408m02, float f10, int i10) {
            C9408m0.a aVar = new C9408m0.a(c9408m0);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.m36571b(i11, c9408m0.m36558f(i11));
                } else {
                    C6475f c6475fM36558f = c9408m0.m36558f(i11);
                    C6475f c6475fM36558f2 = c9408m02.m36558f(i11);
                    float f11 = 1.0f - f10;
                    aVar.m36571b(i11, C9408m0.m36550k(c6475fM36558f, (int) (((double) ((c6475fM36558f.f20347a - c6475fM36558f2.f20347a) * f11)) + 0.5d), (int) (((double) ((c6475fM36558f.f20348b - c6475fM36558f2.f20348b) * f11)) + 0.5d), (int) (((double) ((c6475fM36558f.f20349c - c6475fM36558f2.f20349c) * f11)) + 0.5d), (int) (((double) ((c6475fM36558f.f20350d - c6475fM36558f2.f20350d) * f11)) + 0.5d)));
                }
            }
            return aVar.m36570a();
        }

        /* JADX INFO: renamed from: q */
        public static void m36734q(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerM36726i = bVar != null ? m36726i(view, bVar) : null;
            view.setTag(AbstractC5632b.f17659R, onApplyWindowInsetsListenerM36726i);
            if (view.getTag(AbstractC5632b.f17653L) == null && view.getTag(AbstractC5632b.f17654M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerM36726i);
            }
        }
    }

    /* JADX INFO: renamed from: x3.y$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final int f32066a;

        /* JADX INFO: renamed from: b */
        public float f32067b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f32068c;

        /* JADX INFO: renamed from: d */
        public final long f32069d;

        /* JADX INFO: renamed from: e */
        public float f32070e = 1.0f;

        public e(int i10, Interpolator interpolator, long j10) {
            this.f32066a = i10;
            this.f32068c = interpolator;
            this.f32069d = j10;
        }

        /* JADX INFO: renamed from: a */
        public float mo36739a() {
            return this.f32070e;
        }

        /* JADX INFO: renamed from: b */
        public long mo36740b() {
            return this.f32069d;
        }

        /* JADX INFO: renamed from: c */
        public float mo36741c() {
            Interpolator interpolator = this.f32068c;
            float f10 = this.f32067b;
            return interpolator != null ? interpolator.getInterpolation(f10) : f10;
        }

        /* JADX INFO: renamed from: d */
        public int mo36742d() {
            return this.f32066a;
        }

        /* JADX INFO: renamed from: e */
        public void mo36743e(float f10) {
            this.f32067b = f10;
        }
    }

    public C9436y(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f32036a = new d(i10, interpolator, j10);
        } else {
            this.f32036a = new c(i10, interpolator, j10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m36710e(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.m36738i(view, bVar);
        } else {
            c.m36734q(view, bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C9436y m36711g(WindowInsetsAnimation windowInsetsAnimation) {
        return new C9436y(windowInsetsAnimation);
    }

    /* JADX INFO: renamed from: a */
    public float m36712a() {
        return this.f32036a.mo36739a();
    }

    /* JADX INFO: renamed from: b */
    public long m36713b() {
        return this.f32036a.mo36740b();
    }

    /* JADX INFO: renamed from: c */
    public float m36714c() {
        return this.f32036a.mo36741c();
    }

    /* JADX INFO: renamed from: d */
    public int m36715d() {
        return this.f32036a.mo36742d();
    }

    /* JADX INFO: renamed from: f */
    public void m36716f(float f10) {
        this.f32036a.mo36743e(f10);
    }

    /* JADX INFO: renamed from: x3.y$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends e {

        /* JADX INFO: renamed from: f */
        public final WindowInsetsAnimation f32061f;

        /* JADX INFO: renamed from: x3.y$d$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final b f32062a;

            /* JADX INFO: renamed from: b */
            public List f32063b;

            /* JADX INFO: renamed from: c */
            public ArrayList f32064c;

            /* JADX INFO: renamed from: d */
            public final HashMap f32065d;

            public a(b bVar) {
                super(bVar.m36722b());
                this.f32065d = new HashMap();
                this.f32062a = bVar;
            }

            /* JADX INFO: renamed from: a */
            public final C9436y m36744a(WindowInsetsAnimation windowInsetsAnimation) {
                C9436y c9436y = (C9436y) this.f32065d.get(windowInsetsAnimation);
                if (c9436y != null) {
                    return c9436y;
                }
                C9436y c9436yM36711g = C9436y.m36711g(windowInsetsAnimation);
                this.f32065d.put(windowInsetsAnimation, c9436yM36711g);
                return c9436yM36711g;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f32062a.mo13333c(m36744a(windowInsetsAnimation));
                this.f32065d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f32062a.mo13334d(m36744a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f32064c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f32064c = arrayList2;
                    this.f32063b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM36539a = AbstractC9402k0.m36539a(list.get(size));
                    C9436y c9436yM36744a = m36744a(windowInsetsAnimationM36539a);
                    c9436yM36744a.m36716f(windowInsetsAnimationM36539a.getFraction());
                    this.f32064c.add(c9436yM36744a);
                }
                return this.f32062a.mo13335e(C9408m0.m36551s(windowInsets), this.f32063b).m36569r();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f32062a.mo13336f(m36744a(windowInsetsAnimation), a.m36717e(bounds)).m36721d();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f32061f = windowInsetsAnimation;
        }

        /* JADX INFO: renamed from: f */
        public static WindowInsetsAnimation.Bounds m36735f(a aVar) {
            AbstractC9378c0.m36509a();
            return AbstractC9375b0.m36494a(aVar.m36718a().m25655e(), aVar.m36719b().m25655e());
        }

        /* JADX INFO: renamed from: g */
        public static C6475f m36736g(WindowInsetsAnimation.Bounds bounds) {
            return C6475f.m25654d(bounds.getUpperBound());
        }

        /* JADX INFO: renamed from: h */
        public static C6475f m36737h(WindowInsetsAnimation.Bounds bounds) {
            return C6475f.m25654d(bounds.getLowerBound());
        }

        /* JADX INFO: renamed from: i */
        public static void m36738i(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // p336x3.C9436y.e
        /* JADX INFO: renamed from: a */
        public float mo36739a() {
            return this.f32061f.getAlpha();
        }

        @Override // p336x3.C9436y.e
        /* JADX INFO: renamed from: b */
        public long mo36740b() {
            return this.f32061f.getDurationMillis();
        }

        @Override // p336x3.C9436y.e
        /* JADX INFO: renamed from: c */
        public float mo36741c() {
            return this.f32061f.getInterpolatedFraction();
        }

        @Override // p336x3.C9436y.e
        /* JADX INFO: renamed from: d */
        public int mo36742d() {
            return this.f32061f.getTypeMask();
        }

        @Override // p336x3.C9436y.e
        /* JADX INFO: renamed from: e */
        public void mo36743e(float f10) {
            this.f32061f.setFraction(f10);
        }

        public d(int i10, Interpolator interpolator, long j10) {
            this(AbstractC9438z.m36746a(i10, interpolator, j10));
        }
    }

    /* JADX INFO: renamed from: x3.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C6475f f32037a;

        /* JADX INFO: renamed from: b */
        public final C6475f f32038b;

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f32037a = d.m36737h(bounds);
            this.f32038b = d.m36736g(bounds);
        }

        /* JADX INFO: renamed from: e */
        public static a m36717e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        /* JADX INFO: renamed from: a */
        public C6475f m36718a() {
            return this.f32037a;
        }

        /* JADX INFO: renamed from: b */
        public C6475f m36719b() {
            return this.f32038b;
        }

        /* JADX INFO: renamed from: c */
        public a m36720c(C6475f c6475f) {
            return new a(C9408m0.m36550k(this.f32037a, c6475f.f20347a, c6475f.f20348b, c6475f.f20349c, c6475f.f20350d), C9408m0.m36550k(this.f32038b, c6475f.f20347a, c6475f.f20348b, c6475f.f20349c, c6475f.f20350d));
        }

        /* JADX INFO: renamed from: d */
        public WindowInsetsAnimation.Bounds m36721d() {
            return d.m36735f(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f32037a + " upper=" + this.f32038b + "}";
        }

        public a(C6475f c6475f, C6475f c6475f2) {
            this.f32037a = c6475f;
            this.f32038b = c6475f2;
        }
    }

    /* JADX INFO: renamed from: x3.y$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b {

        /* JADX INFO: renamed from: q */
        public C9408m0 f32039q;

        /* JADX INFO: renamed from: r */
        public final int f32040r;

        public b(int i10) {
            this.f32040r = i10;
        }

        /* JADX INFO: renamed from: b */
        public final int m36722b() {
            return this.f32040r;
        }

        /* JADX INFO: renamed from: e */
        public abstract C9408m0 mo13335e(C9408m0 c9408m0, List list);

        /* JADX INFO: renamed from: c */
        public void mo13333c(C9436y c9436y) {
        }

        /* JADX INFO: renamed from: d */
        public void mo13334d(C9436y c9436y) {
        }

        /* JADX INFO: renamed from: f */
        public a mo13336f(C9436y c9436y, a aVar) {
            return aVar;
        }
    }

    public C9436y(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f32036a = new d(windowInsetsAnimation);
        }
    }
}

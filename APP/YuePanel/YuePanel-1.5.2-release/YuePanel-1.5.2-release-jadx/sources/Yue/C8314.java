package Yue;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: Yue.ۥۢۤۦ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,414:1\n37#1:415\n53#1:416\n326#1,4:420\n43#2,3:417\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n68#1:415\n68#1:416\n310#1:420,4\n232#1:417,3\n*E\n"})
public final class C8314 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ */
    @InterfaceC4313(m1272c = "androidx.core.view.ViewKt$allViews$1", m1273f = "View.kt", m1274i = {0}, m1275l = {409, 411}, m1276m = "invokeSuspend", m1277n = {"$this$sequence"}, m1278s = {"L$0"})
    public static final class C1483 extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super View>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f24805;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f24806;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ View f24807;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1483(View view, InterfaceC4199<? super C1483> interfaceC4199) {
            super(2, interfaceC4199);
            this.f24807 = view;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1483 c1483 = new C1483(this.f24807, interfaceC4199);
            c1483.f24806 = obj;
            return c1483;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Object objM17142 = C5508.m17142();
            int i = this.f24805;
            if (i == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f24806;
                View view = this.f24807;
                this.f24806 = abstractC7328;
                this.f24805 = 1;
                if (abstractC7328.mo3574(view, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                    return C8107.f3222;
                }
                abstractC7328 = (AbstractC7328) this.f24806;
                C7149.m22422(obj);
            }
            View view2 = this.f24807;
            if (view2 instanceof ViewGroup) {
                InterfaceC7326<View> interfaceC7326M27686 = C8308.m27686((ViewGroup) view2);
                this.f24806 = null;
                this.f24805 = 2;
                if (abstractC7328.m3575(interfaceC7326M27686, this) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super View> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1483) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟ */
    public /* synthetic */ class C1484 extends C5153 implements InterfaceC5124<ViewParent, ViewParent> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1484 f24808 = new C1484();

        public C1484() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final ViewParent invoke(@InterfaceC6399 ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC8315 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f24809;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<View, C8107> f24810;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super android.view.View, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnAttachStateChangeListenerC8315(View view, InterfaceC5124<? super View, C8107> interfaceC5124) {
            this.f24809 = view;
            this.f24810 = interfaceC5124;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC6399 View view) {
            this.f24809.removeOnAttachStateChangeListener(this);
            this.f24810.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC6399 View view) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnDetach$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnAttachStateChangeListenerC8316 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ View f24811;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<View, C8107> f24812;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super android.view.View, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnAttachStateChangeListenerC8316(View view, InterfaceC5124<? super View, C8107> interfaceC5124) {
            this.f24811 = view;
            this.f24812 = interfaceC5124;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC6399 View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC6399 View view) {
            this.f24811.removeOnAttachStateChangeListener(this);
            this.f24812.invoke(view);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,414:1\n69#2,2:415\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC8317 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5124 f3404;

        public ViewOnLayoutChangeListenerC8317(InterfaceC5124 interfaceC5124) {
            this.f3404 = interfaceC5124;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@InterfaceC6399 View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f3404.invoke(view);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n*L\n1#1,414:1\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC8318 implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5124<View, C8107> f3405;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super android.view.View, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnLayoutChangeListenerC8318(InterfaceC5124<? super View, C8107> interfaceC5124) {
            this.f3405 = interfaceC5124;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@InterfaceC6399 View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            this.f3405.invoke(view);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC8319 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<View, C8107> f24813;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ View f24814;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super android.view.View, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public RunnableC8319(InterfaceC5124<? super View, C8107> interfaceC5124, View view) {
            this.f24813 = interfaceC5124;
            this.f24814 = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24813.invoke(this.f24814);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$postDelayed$runnable$1\n*L\n1#1,414:1\n*E\n"})
    public static final class RunnableC8320 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f24815;

        public RunnableC8320(InterfaceC5122<C8107> interfaceC5122) {
            this.f24815 = interfaceC5122;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f24815.invoke();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4300(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        if (view.isAttachedToWindow()) {
            interfaceC5124.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8315(view, interfaceC5124));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m27702(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8316(view, interfaceC5124));
        } else {
            interfaceC5124.invoke(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m27703(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8317(interfaceC5124));
        } else {
            interfaceC5124.invoke(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m27704(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8318(interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final ViewTreeObserverOnPreDrawListenerC6565 m27705(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        return ViewTreeObserverOnPreDrawListenerC6565.m3026(view, new RunnableC8319(interfaceC5124, view));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Bitmap m27706(@InterfaceC6399 View view, @InterfaceC6399 Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ Bitmap m27707(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return m27706(view, config);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7326<View> m27708(@InterfaceC6399 View view) {
        return C7330.m3577(new C1483(view, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final InterfaceC7326<ViewParent> m27709(@InterfaceC6399 View view) {
        return C7332.m22878(view.getParent(), C1484.f24808);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int m27710(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m27711(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m27712(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int m27713(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m27714(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m27715(@InterfaceC6399 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final boolean m27716(@InterfaceC6399 View view) {
        return view.getVisibility() == 8;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final boolean m27717(@InterfaceC6399 View view) {
        return view.getVisibility() == 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final boolean m27718(@InterfaceC6399 View view) {
        return view.getVisibility() == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final Runnable m27719(@InterfaceC6399 View view, long j, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        RunnableC8320 runnableC8320 = new RunnableC8320(interfaceC5122);
        view.postDelayed(runnableC8320, j);
        return runnableC8320;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Runnable m27720(@InterfaceC6399 View view, long j, @InterfaceC6399 final InterfaceC5122<C8107> interfaceC5122) {
        Runnable runnable = new Runnable() { // from class: Yue.ۥۢۤۦ
            @Override // java.lang.Runnable
            public final void run() {
                C8314.m27721(interfaceC5122);
            }
        };
        view.postOnAnimationDelayed(runnable, j);
        return runnable;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final void m27721(InterfaceC5122 interfaceC5122) {
        interfaceC5122.invoke();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final void m27722(@InterfaceC6399 View view, boolean z) {
        view.setVisibility(z ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final void m27723(@InterfaceC6399 View view, boolean z) {
        view.setVisibility(z ? 4 : 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final void m27724(@InterfaceC6399 View view, @InterfaceC6844 int i) {
        view.setPadding(i, i, i, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final void m27725(@InterfaceC6399 View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final void m27726(@InterfaceC6399 View view, @InterfaceC6399 InterfaceC5124<? super ViewGroup.LayoutParams, C8107> interfaceC5124) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        interfaceC5124.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @InterfaceC5572(name = "updateLayoutParamsTyped")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void m27727(View view, InterfaceC5124<? super T, C8107> interfaceC5124) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C5499.m17112(1, C4750.f10502);
        interfaceC5124.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final void m27728(@InterfaceC6399 View view, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ void m27729(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPadding(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final void m27730(@InterfaceC6399 View view, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ void m27731(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i, i2, i3, i4);
    }
}

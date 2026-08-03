package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nFragmentContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n55#2,6:349\n55#2,6:355\n1855#3,2:361\n*S KotlinDebug\n*F\n+ 1 FragmentContainerView.kt\nandroidx/fragment/app/FragmentContainerView\n*L\n113#1:349,6\n135#1:355,6\n221#1:361,2\n*E\n"})
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001CB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020$H\u0001¢\u0006\u0004\b,\u0010-J)\u00101\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010.\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b5\u0010)J\u0017\u00106\u001a\u00020\u00102\u0006\u0010'\u001a\u00020 H\u0016¢\u0006\u0004\b6\u0010)J\u001f\u00109\u001a\u00020\u00102\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00102\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010@\u001a\u00028\u0000\"\n\b\u0000\u0010?*\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010B\u001a\u00020 H\u0002¢\u0006\u0004\bC\u0010)R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020 0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020 0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010L\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010+\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/animation/LayoutTransition;", "transition", "LYue/ۥۣۢ۠ۤ;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "v", "ۥ", "", "ۥۣ۟۟۠", "Ljava/util/List;", "disappearingFragmentChildren", "ۥ۟۟۠ۤ", "transitioningFragmentViews", "ۥ۟۟۠ۥ", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "ۥ۟۟۠ۦ", "Z", "fragment_release"}, k = 1, mv = {1, 8, 0})
public final class FragmentContainerView extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<android.view.View> f29163;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<android.view.View> f29164;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public android.view.View.OnApplyWindowInsetsListener f29165;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean f29166;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentContainerView$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static final class C7573 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final androidx.fragment.app.FragmentContainerView.C7573 f29167 = null;

        static {
                androidx.fragment.app.FragmentContainerView$ۥ r0 = new androidx.fragment.app.FragmentContainerView$ۥ
                r0.<init>()
                androidx.fragment.app.FragmentContainerView.C7573.f29167 = r0
                return
        }

        public C7573() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.WindowInsets m29075(@Yue.InterfaceC4418 android.view.View.OnApplyWindowInsetsListener r2, @Yue.InterfaceC4418 android.view.View r3, @Yue.InterfaceC4418 android.view.WindowInsets r4) {
                r1 = this;
                java.lang.String r0 = "onApplyWindowInsetsListener"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "v"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r0 = "insets"
                Yue.C3329.m13906(r4, r0)
                android.view.WindowInsets r2 = r2.onApplyWindowInsets(r3, r4)
                java.lang.String r3 = "onApplyWindowInsetsListe…lyWindowInsets(v, insets)"
                Yue.C3329.m13905(r2, r3)
                return r2
        }
    }

    public FragmentContainerView(@Yue.InterfaceC4418 android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r2, r0)
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f29163 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f29164 = r2
            r2 = 1
            r1.f29166 = r2
            return
    }

    @Yue.InterfaceC3422
    public FragmentContainerView(@Yue.InterfaceC4418 android.content.Context r8, @Yue.InterfaceC4543 android.util.AttributeSet r9) {
            r7 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r8, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @Yue.InterfaceC3422
    public FragmentContainerView(@Yue.InterfaceC4418 android.content.Context r3, @Yue.InterfaceC4543 android.util.AttributeSet r4, int r5) {
            r2 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r3, r0)
            r2.<init>(r3, r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f29163 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f29164 = r5
            r5 = 1
            r2.f29166 = r5
            if (r4 == 0) goto L68
            java.lang.String r5 = r4.getClassAttribute()
            int[] r0 = Yue.C5040.C5044.f16391
            java.lang.String r1 = "FragmentContainerView"
            Yue.C3329.m13905(r0, r1)
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            if (r5 != 0) goto L36
            int r4 = Yue.C5040.C5044.f16392
            java.lang.String r5 = r3.getString(r4)
            java.lang.String r4 = "android:name"
            goto L38
        L36:
            java.lang.String r4 = "class"
        L38:
            r3.recycle()
            if (r5 == 0) goto L68
            boolean r3 = r2.isInEditMode()
            if (r3 == 0) goto L44
            goto L68
        L44:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentContainerView must be within a FragmentActivity to use "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "=\""
            r0.append(r4)
            r0.append(r5)
            r4 = 34
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L68:
            return
    }

    public /* synthetic */ FragmentContainerView(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, Yue.C1769 r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public FragmentContainerView(@Yue.InterfaceC4418 android.content.Context r6, @Yue.InterfaceC4418 android.util.AttributeSet r7, @Yue.InterfaceC4418 androidx.fragment.app.FragmentManager r8) {
            r5 = this;
            java.lang.String r0 = "context"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "attrs"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "fm"
            Yue.C3329.m13906(r8, r0)
            r5.<init>(r6, r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f29163 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f29164 = r0
            r0 = 1
            r5.f29166 = r0
            java.lang.String r1 = r7.getClassAttribute()
            int[] r2 = Yue.C5040.C5044.f16391
            java.lang.String r3 = "FragmentContainerView"
            Yue.C3329.m13905(r2, r3)
            r3 = 0
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2, r3, r3)
            if (r1 != 0) goto L3b
            int r1 = Yue.C5040.C5044.f16392
            java.lang.String r1 = r2.getString(r1)
        L3b:
            int r3 = Yue.C5040.C5044.f16393
            java.lang.String r3 = r2.getString(r3)
            r2.recycle()
            int r2 = r5.getId()
            androidx.fragment.app.Fragment r4 = r8.m29146(r2)
            if (r1 == 0) goto La7
            if (r4 != 0) goto La7
            r4 = -1
            if (r2 != r4) goto L83
            if (r3 == 0) goto L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " with tag "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            goto L69
        L67:
            java.lang.String r6 = ""
        L69:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "FragmentContainerView must have an android:id to add Fragment "
            r8.append(r0)
            r8.append(r1)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L83:
            androidx.fragment.app.ۥ۟۟۟ۡ r2 = r8.m29160()
            java.lang.ClassLoader r4 = r6.getClassLoader()
            androidx.fragment.app.Fragment r1 = r2.mo29237(r4, r1)
            java.lang.String r2 = "fm.fragmentFactory.insta…ontext.classLoader, name)"
            Yue.C3329.m13905(r1, r2)
            r2 = 0
            r1.onInflate(r6, r7, r2)
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r8.m29100()
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r6.m29458(r0)
            androidx.fragment.app.ۥ۟۟۠۟ r6 = r6.m29436(r5, r1, r3)
            r6.mo29271()
        La7:
            r8.m29192(r5)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(@Yue.InterfaceC4418 android.view.View r2, int r3, @Yue.InterfaceC4543 android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            java.lang.String r0 = "child"
            Yue.C3329.m13906(r2, r0)
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.m29089(r2)
            if (r0 == 0) goto Lf
            super.addView(r2, r3, r4)
            return
        Lf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Views added to a FragmentContainerView must be associated with a Fragment. View "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " is not associated with a Fragment."
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(20)
    public android.view.WindowInsets dispatchApplyWindowInsets(@Yue.InterfaceC4418 android.view.WindowInsets r5) {
            r4 = this;
            java.lang.String r0 = "insets"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r5)
            java.lang.String r1 = "toWindowInsetsCompat(insets)"
            Yue.C3329.m13905(r0, r1)
            android.view.View$OnApplyWindowInsetsListener r1 = r4.f29165
            if (r1 == 0) goto L20
            androidx.fragment.app.FragmentContainerView$ۥ r0 = androidx.fragment.app.FragmentContainerView.C7573.f29167
            Yue.C3329.m13903(r1)
            android.view.WindowInsets r0 = r0.m29075(r1, r4, r5)
            Yue.ۥۢۥۦ r0 = Yue.C7065.m27276(r0)
            goto L24
        L20:
            Yue.ۥۢۥۦ r0 = Yue.C6794.m26200(r4, r0)
        L24:
            java.lang.String r1 = "if (applyWindowInsetsLis…, insetsCompat)\n        }"
            Yue.C3329.m13905(r0, r1)
            boolean r1 = r0.m27303()
            if (r1 != 0) goto L40
            int r1 = r4.getChildCount()
            r2 = 0
        L34:
            if (r2 >= r1) goto L40
            android.view.View r3 = r4.getChildAt(r2)
            Yue.C6794.m26101(r3, r0)
            int r2 = r2 + 1
            goto L34
        L40:
            return r5
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@Yue.InterfaceC4418 android.graphics.Canvas r5) {
            r4 = this;
            java.lang.String r0 = "canvas"
            Yue.C3329.m13906(r5, r0)
            boolean r0 = r4.f29166
            if (r0 == 0) goto L23
            java.util.List<android.view.View> r0 = r4.f29163
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            long r2 = r4.getDrawingTime()
            super.drawChild(r5, r1, r2)
            goto Lf
        L23:
            super.dispatchDraw(r5)
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@Yue.InterfaceC4418 android.graphics.Canvas r2, @Yue.InterfaceC4418 android.view.View r3, long r4) {
            r1 = this;
            java.lang.String r0 = "canvas"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "child"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r1.f29166
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.f29163
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L22
            java.util.List<android.view.View> r0 = r1.f29163
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L22
            r2 = 0
            return r2
        L22:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            java.util.List<android.view.View> r0 = r1.f29164
            r0.remove(r2)
            java.util.List<android.view.View> r0 = r1.f29163
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L15
            r0 = 1
            r1.f29166 = r0
        L15:
            super.endViewTransition(r2)
            return
    }

    public final <F extends androidx.fragment.app.Fragment> F getFragment() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = androidx.fragment.app.FragmentManager.m29087(r2)
            int r1 = r2.getId()
            androidx.fragment.app.Fragment r0 = r0.m29146(r1)
            return r0
    }

    @Override // android.view.View
    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(20)
    public android.view.WindowInsets onApplyWindowInsets(@Yue.InterfaceC4418 android.view.WindowInsets r2) {
            r1 = this;
            java.lang.String r0 = "insets"
            Yue.C3329.m13906(r2, r0)
            return r2
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
            r3 = this;
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
        L6:
            r1 = -1
            if (r1 >= r0) goto L18
            android.view.View r1 = r3.getChildAt(r0)
            java.lang.String r2 = "view"
            Yue.C3329.m13905(r1, r2)
            r3.m29074(r1)
            int r0 = r0 + (-1)
            goto L6
        L18:
            super.removeAllViewsInLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            r1.m29074(r2)
            super.removeView(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int r3) {
            r2 = this;
            android.view.View r0 = r2.getChildAt(r3)
            java.lang.String r1 = "view"
            Yue.C3329.m13905(r0, r1)
            r2.m29074(r0)
            super.removeViewAt(r3)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            r1.m29074(r2)
            super.removeViewInLayout(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViews(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            Yue.C3329.m13905(r2, r3)
            r4.m29074(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViews(r5, r6)
            return
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int r5, int r6) {
            r4 = this;
            int r0 = r5 + r6
            r1 = r5
        L3:
            if (r1 >= r0) goto L14
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "view"
            Yue.C3329.m13905(r2, r3)
            r4.m29074(r2)
            int r1 = r1 + 1
            goto L3
        L14:
            super.removeViewsInLayout(r5, r6)
            return
    }

    @Yue.InterfaceC3421(name = "setDrawDisappearingViewsLast")
    public final void setDrawDisappearingViewsLast(boolean r1) {
            r0 = this;
            r0.f29166 = r1
            return
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Yue.InterfaceC4543 android.animation.LayoutTransition r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\"."
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Yue.InterfaceC4418 android.view.View.OnApplyWindowInsetsListener r2) {
            r1 = this;
            java.lang.String r0 = "listener"
            Yue.C3329.m13906(r2, r0)
            r1.f29165 = r2
            return
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@Yue.InterfaceC4418 android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != r1) goto L10
            java.util.List<android.view.View> r0 = r1.f29164
            r0.add(r2)
        L10:
            super.startViewTransition(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m29074(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f29164
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Ld
            java.util.List<android.view.View> r0 = r1.f29163
            r0.add(r2)
        Ld:
            return
    }
}

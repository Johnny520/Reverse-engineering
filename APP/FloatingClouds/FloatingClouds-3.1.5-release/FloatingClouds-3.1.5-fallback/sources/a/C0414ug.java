package a;

/* JADX INFO: renamed from: a.ug, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0414ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.util.WeakHashMap<android.view.View, a.Jg> f721a = null;
    public static java.lang.reflect.Field b = null;
    public static boolean c = false;
    public static final int[] d = null;
    public static final a.C0325pg e = null;
    public static final a.C0414ug.a f = null;

    /* JADX INFO: renamed from: a.ug$a */
    public static class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.WeakHashMap<android.view.View, java.lang.Boolean> f722a;

        public a() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.f722a = r0
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnGlobalLayoutListener(r0)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$b */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f723a;
        public final java.lang.Class<T> b;
        public final int c;
        public final int d;

        public b(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.f723a = r1
                r0.b = r2
                r0.d = r3
                r0.c = r4
                return
        }

        public abstract T a(android.view.View r1);

        public abstract void b(android.view.View r1, T r2);

        public final void c(android.view.View r3, T r4) {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.c
                if (r0 < r1) goto La
                r2.b(r3, r4)
                return
            La:
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.c
                if (r0 < r1) goto L15
                java.lang.Object r0 = r2.a(r3)
                goto L25
            L15:
                int r0 = r2.f723a
                java.lang.Object r0 = r3.getTag(r0)
                java.lang.Class<T> r1 = r2.b
                boolean r1 = r1.isInstance(r0)
                if (r1 == 0) goto L24
                goto L25
            L24:
                r0 = 0
            L25:
                boolean r0 = r2.d(r0, r4)
                if (r0 == 0) goto L56
                android.view.View$AccessibilityDelegate r0 = a.C0414ug.b(r3)
                if (r0 != 0) goto L33
                r0 = 0
                goto L42
            L33:
                boolean r1 = r0 instanceof a.C.a
                if (r1 == 0) goto L3c
                a.C$a r0 = (a.C.a) r0
                a.C r0 = r0.f37a
                goto L42
            L3c:
                a.C r1 = new a.C
                r1.<init>(r0)
                r0 = r1
            L42:
                if (r0 != 0) goto L49
                a.C r0 = new a.C
                r0.<init>()
            L49:
                a.C0414ug.j(r3, r0)
                int r0 = r2.f723a
                r3.setTag(r0, r4)
                int r4 = r2.d
                a.C0414ug.e(r3, r4)
            L56:
                return
        }

        public abstract boolean d(T r1, T r2);
    }

    /* JADX INFO: renamed from: a.ug$c */
    public static class c {
        public static android.view.WindowInsets a(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
                return r0
        }

        public static android.view.WindowInsets b(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
                return r0
        }

        public static void c(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$d */
    public static class d {

        /* JADX INFO: renamed from: a.ug$d$a */
        public class a implements android.view.View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public a.nh f724a;
            public final /* synthetic */ android.view.View b;
            public final /* synthetic */ a.Tb c;

            public a(android.view.View r1, a.Tb r2) {
                    r0 = this;
                    r0.b = r1
                    r0.c = r2
                    r0.<init>()
                    r1 = 0
                    r0.f724a = r1
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View r6, android.view.WindowInsets r7) {
                    r5 = this;
                    a.nh r0 = a.nh.g(r6, r7)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    a.Tb r2 = r5.c
                    r3 = 30
                    if (r1 >= r3) goto L22
                    android.view.View r4 = r5.b
                    a.C0414ug.d.a(r7, r4)
                    a.nh r7 = r5.f724a
                    boolean r7 = r0.equals(r7)
                    if (r7 == 0) goto L22
                    a.nh r6 = r2.a(r6, r0)
                    android.view.WindowInsets r6 = r6.f()
                    return r6
                L22:
                    r5.f724a = r0
                    a.nh r7 = r2.a(r6, r0)
                    if (r1 < r3) goto L2f
                    android.view.WindowInsets r6 = r7.f()
                    return r6
                L2f:
                    java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                    a.C0414ug.c.c(r6)
                    android.view.WindowInsets r6 = r7.f()
                    return r6
            }
        }

        public static void a(android.view.WindowInsets r1, android.view.View r2) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        public static a.nh b(android.view.View r1, a.nh r2, android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.f()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                a.nh r1 = a.nh.g(r1, r2)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        public static boolean c(android.view.View r0, float r1, float r2, boolean r3) {
                boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
                return r0
        }

        public static boolean d(android.view.View r0, float r1, float r2) {
                boolean r0 = r0.dispatchNestedPreFling(r1, r2)
                return r0
        }

        public static boolean e(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
                boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
                return r0
        }

        public static boolean f(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
                boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
                return r0
        }

        public static android.content.res.ColorStateList g(android.view.View r0) {
                android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
                return r0
        }

        public static android.graphics.PorterDuff.Mode h(android.view.View r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
                return r0
        }

        public static float i(android.view.View r0) {
                float r0 = r0.getElevation()
                return r0
        }

        public static a.nh j(android.view.View r6) {
                boolean r0 = a.nh.a.d
                if (r0 == 0) goto L90
                boolean r0 = r6.isAttachedToWindow()
                if (r0 != 0) goto Lc
                goto L90
            Lc:
                android.view.View r0 = r6.getRootView()
                java.lang.reflect.Field r1 = a.nh.a.f604a     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.IllegalAccessException -> L78
                if (r0 == 0) goto L90
                java.lang.reflect.Field r1 = a.nh.a.b     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.IllegalAccessException -> L78
                android.graphics.Rect r1 = (android.graphics.Rect) r1     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.reflect.Field r2 = a.nh.a.c     // Catch: java.lang.IllegalAccessException -> L78
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.IllegalAccessException -> L78
                android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch: java.lang.IllegalAccessException -> L78
                if (r1 == 0) goto L90
                if (r0 == 0) goto L90
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalAccessException -> L78
                r3 = 30
                if (r2 < r3) goto L38
                a.nh$d r2 = new a.nh$d     // Catch: java.lang.IllegalAccessException -> L78
                r2.<init>()     // Catch: java.lang.IllegalAccessException -> L78
                goto L47
            L38:
                r3 = 29
                if (r2 < r3) goto L42
                a.nh$c r2 = new a.nh$c     // Catch: java.lang.IllegalAccessException -> L78
                r2.<init>()     // Catch: java.lang.IllegalAccessException -> L78
                goto L47
            L42:
                a.nh$b r2 = new a.nh$b     // Catch: java.lang.IllegalAccessException -> L78
                r2.<init>()     // Catch: java.lang.IllegalAccessException -> L78
            L47:
                int r3 = r1.left     // Catch: java.lang.IllegalAccessException -> L78
                int r4 = r1.top     // Catch: java.lang.IllegalAccessException -> L78
                int r5 = r1.right     // Catch: java.lang.IllegalAccessException -> L78
                int r1 = r1.bottom     // Catch: java.lang.IllegalAccessException -> L78
                a.a9 r1 = a.C0047a9.b(r3, r4, r5, r1)     // Catch: java.lang.IllegalAccessException -> L78
                r2.e(r1)     // Catch: java.lang.IllegalAccessException -> L78
                int r1 = r0.left     // Catch: java.lang.IllegalAccessException -> L78
                int r3 = r0.top     // Catch: java.lang.IllegalAccessException -> L78
                int r4 = r0.right     // Catch: java.lang.IllegalAccessException -> L78
                int r0 = r0.bottom     // Catch: java.lang.IllegalAccessException -> L78
                a.a9 r0 = a.C0047a9.b(r1, r3, r4, r0)     // Catch: java.lang.IllegalAccessException -> L78
                r2.g(r0)     // Catch: java.lang.IllegalAccessException -> L78
                a.nh r0 = r2.b()     // Catch: java.lang.IllegalAccessException -> L78
                a.nh$k r1 = r0.f603a     // Catch: java.lang.IllegalAccessException -> L78
                r1.p(r0)     // Catch: java.lang.IllegalAccessException -> L78
                android.view.View r6 = r6.getRootView()     // Catch: java.lang.IllegalAccessException -> L78
                a.nh$k r1 = r0.f603a     // Catch: java.lang.IllegalAccessException -> L78
                r1.d(r6)     // Catch: java.lang.IllegalAccessException -> L78
                return r0
            L78:
                r6 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to get insets from AttachInfo. "
                r0.<init>(r1)
                java.lang.String r1 = r6.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "WindowInsetsCompat"
                android.util.Log.w(r1, r0, r6)
            L90:
                r6 = 0
                return r6
        }

        public static java.lang.String k(android.view.View r0) {
                java.lang.String r0 = r0.getTransitionName()
                return r0
        }

        public static float l(android.view.View r0) {
                float r0 = r0.getTranslationZ()
                return r0
        }

        public static float m(android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }

        public static boolean n(android.view.View r0) {
                boolean r0 = r0.hasNestedScrollingParent()
                return r0
        }

        public static boolean o(android.view.View r0) {
                boolean r0 = r0.isImportantForAccessibility()
                return r0
        }

        public static boolean p(android.view.View r0) {
                boolean r0 = r0.isNestedScrollingEnabled()
                return r0
        }

        public static void q(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        public static void r(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        public static void s(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        public static void t(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        public static void u(android.view.View r2, a.Tb r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lb
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                r2.setTag(r0, r3)
            Lb:
                if (r3 != 0) goto L19
                int r3 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L19:
                a.ug$d$a r0 = new a.ug$d$a
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }

        public static void v(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        public static void w(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        public static void x(android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        public static boolean y(android.view.View r0, int r1) {
                boolean r0 = r0.startNestedScroll(r1)
                return r0
        }

        public static void z(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$e */
    public static class e {
        public static a.nh a(android.view.View r2) {
                android.view.WindowInsets r0 = r2.getRootWindowInsets()
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                a.nh r0 = a.nh.g(r1, r0)
                a.nh$k r1 = r0.f603a
                r1.p(r0)
                android.view.View r2 = r2.getRootView()
                r1.d(r2)
                return r0
        }

        public static int b(android.view.View r0) {
                int r0 = r0.getScrollIndicators()
                return r0
        }

        public static void c(android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        public static void d(android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$f */
    public static class f {
        public static void a(android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
                r0.addKeyboardNavigationClusters(r1, r2)
                return
        }

        public static android.view.autofill.AutofillId b(android.view.View r0) {
                android.view.autofill.AutofillId r0 = r0.getAutofillId()
                return r0
        }

        public static int c(android.view.View r0) {
                int r0 = r0.getImportantForAutofill()
                return r0
        }

        public static int d(android.view.View r0) {
                int r0 = r0.getNextClusterForwardId()
                return r0
        }

        public static boolean e(android.view.View r0) {
                boolean r0 = r0.hasExplicitFocusable()
                return r0
        }

        public static boolean f(android.view.View r0) {
                boolean r0 = r0.isFocusedByDefault()
                return r0
        }

        public static boolean g(android.view.View r0) {
                boolean r0 = r0.isImportantForAutofill()
                return r0
        }

        public static boolean h(android.view.View r0) {
                boolean r0 = r0.isKeyboardNavigationCluster()
                return r0
        }

        public static android.view.View i(android.view.View r0, android.view.View r1, int r2) {
                android.view.View r0 = r0.keyboardNavigationClusterSearch(r1, r2)
                return r0
        }

        public static boolean j(android.view.View r0) {
                boolean r0 = r0.restoreDefaultFocus()
                return r0
        }

        public static void k(android.view.View r0, java.lang.String... r1) {
                r0.setAutofillHints(r1)
                return
        }

        public static void l(android.view.View r0, boolean r1) {
                r0.setFocusedByDefault(r1)
                return
        }

        public static void m(android.view.View r0, int r1) {
                r0.setImportantForAutofill(r1)
                return
        }

        public static void n(android.view.View r0, boolean r1) {
                r0.setKeyboardNavigationCluster(r1)
                return
        }

        public static void o(android.view.View r0, int r1) {
                r0.setNextClusterForwardId(r1)
                return
        }

        public static void p(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$g */
    public static class g {
        public static void a(android.view.View r2, a.C0414ug.l r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r2.getTag(r0)
                a.ge r0 = (a.C0162ge) r0
                if (r0 != 0) goto L14
                a.ge r0 = new a.ge
                r0.<init>()
                int r1 = androidx.core.R.id.tag_unhandled_key_listeners
                r2.setTag(r1, r0)
            L14:
                java.util.Objects.requireNonNull(r3)
                a.vg r1 = new a.vg
                r1.<init>()
                r0.put(r3, r1)
                r2.addOnUnhandledKeyEventListener(r1)
                return
        }

        public static java.lang.CharSequence b(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
                return r0
        }

        public static boolean c(android.view.View r0) {
                boolean r0 = r0.isAccessibilityHeading()
                return r0
        }

        public static boolean d(android.view.View r0) {
                boolean r0 = r0.isScreenReaderFocusable()
                return r0
        }

        public static void e(android.view.View r2, a.C0414ug.l r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r2.getTag(r0)
                a.ge r0 = (a.C0162ge) r0
                if (r0 != 0) goto Lb
                goto L17
            Lb:
                r1 = 0
                java.lang.Object r3 = r0.getOrDefault(r3, r1)
                android.view.View$OnUnhandledKeyEventListener r3 = (android.view.View.OnUnhandledKeyEventListener) r3
                if (r3 == 0) goto L17
                r2.removeOnUnhandledKeyEventListener(r3)
            L17:
                return
        }

        public static <T> T f(android.view.View r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }

        public static void g(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        public static void h(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        public static void i(android.view.View r0, a.Q1 r1) {
                r1 = 0
                r0.setAutofillId(r1)
                return
        }

        public static void j(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$h */
    public static class h {
        public static android.view.View.AccessibilityDelegate a(android.view.View r0) {
                android.view.View$AccessibilityDelegate r0 = r0.getAccessibilityDelegate()
                return r0
        }

        public static android.view.contentcapture.ContentCaptureSession b(android.view.View r0) {
                android.view.contentcapture.ContentCaptureSession r0 = r0.getContentCaptureSession()
                return r0
        }

        public static java.util.List<android.graphics.Rect> c(android.view.View r0) {
                java.util.List r0 = r0.getSystemGestureExclusionRects()
                return r0
        }

        public static void d(android.view.View r0, android.content.Context r1, int[] r2, android.util.AttributeSet r3, android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }

        public static void e(android.view.View r0, a.T3 r1) {
                r1 = 0
                r0.setContentCaptureSession(r1)
                return
        }

        public static void f(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
                r0.setSystemGestureExclusionRects(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$i */
    public static class i {
        public static int a(android.view.View r0) {
                int r0 = r0.getImportantForContentCapture()
                return r0
        }

        public static java.lang.CharSequence b(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getStateDescription()
                return r0
        }

        public static boolean c(android.view.View r0) {
                boolean r0 = r0.isImportantForContentCapture()
                return r0
        }

        public static void d(android.view.View r0, int r1) {
                r0.setImportantForContentCapture(r1)
                return
        }

        public static void e(android.view.View r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$j */
    public static final class j {
        public static java.lang.String[] a(android.view.View r0) {
                java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
                return r0
        }

        public static a.W3 b(android.view.View r1, a.W3 r2) {
                a.W3$e r0 = r2.f314a
                android.view.ContentInfo r0 = r0.c()
                java.util.Objects.requireNonNull(r0)
                android.view.ContentInfo r0 = a.C0382t2.g(r0)
                android.view.ContentInfo r1 = r1.performReceiveContent(r0)
                if (r1 != 0) goto L15
                r1 = 0
                return r1
            L15:
                if (r1 != r0) goto L18
                return r2
            L18:
                a.W3 r2 = new a.W3
                a.W3$d r0 = new a.W3$d
                r0.<init>(r1)
                r2.<init>(r0)
                return r2
        }

        public static void c(android.view.View r1, java.lang.String[] r2, a.InterfaceC0106dc r3) {
                if (r3 != 0) goto L7
                r3 = 0
                r1.setOnReceiveContentListener(r2, r3)
                return
            L7:
                a.ug$k r0 = new a.ug$k
                r0.<init>(r3)
                r1.setOnReceiveContentListener(r2, r0)
                return
        }
    }

    /* JADX INFO: renamed from: a.ug$k */
    public static final class k implements android.view.OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0106dc f725a;

        public k(a.InterfaceC0106dc r1) {
                r0 = this;
                r0.<init>()
                r0.f725a = r1
                return
        }

        public final android.view.ContentInfo onReceiveContent(android.view.View r3, android.view.ContentInfo r4) {
                r2 = this;
                a.W3 r0 = new a.W3
                a.W3$d r1 = new a.W3$d
                r1.<init>(r4)
                r0.<init>(r1)
                a.dc r1 = r2.f725a
                a.W3 r3 = r1.a(r3, r0)
                if (r3 != 0) goto L14
                r3 = 0
                return r3
            L14:
                if (r3 != r0) goto L17
                return r4
            L17:
                a.W3$e r3 = r3.f314a
                android.view.ContentInfo r3 = r3.c()
                java.util.Objects.requireNonNull(r3)
                android.view.ContentInfo r3 = a.C0382t2.g(r3)
                return r3
        }
    }

    /* JADX INFO: renamed from: a.ug$l */
    public interface l {
        boolean a();
    }

    static {
            int r1 = androidx.core.R.id.accessibility_custom_action_0
            int r2 = androidx.core.R.id.accessibility_custom_action_1
            int r3 = androidx.core.R.id.accessibility_custom_action_2
            int r4 = androidx.core.R.id.accessibility_custom_action_3
            int r5 = androidx.core.R.id.accessibility_custom_action_4
            int r6 = androidx.core.R.id.accessibility_custom_action_5
            int r7 = androidx.core.R.id.accessibility_custom_action_6
            int r8 = androidx.core.R.id.accessibility_custom_action_7
            int r9 = androidx.core.R.id.accessibility_custom_action_8
            int r10 = androidx.core.R.id.accessibility_custom_action_9
            int r11 = androidx.core.R.id.accessibility_custom_action_10
            int r12 = androidx.core.R.id.accessibility_custom_action_11
            int r13 = androidx.core.R.id.accessibility_custom_action_12
            int r14 = androidx.core.R.id.accessibility_custom_action_13
            int r15 = androidx.core.R.id.accessibility_custom_action_14
            int r16 = androidx.core.R.id.accessibility_custom_action_15
            int r17 = androidx.core.R.id.accessibility_custom_action_16
            int r18 = androidx.core.R.id.accessibility_custom_action_17
            int r19 = androidx.core.R.id.accessibility_custom_action_18
            int r20 = androidx.core.R.id.accessibility_custom_action_19
            int r21 = androidx.core.R.id.accessibility_custom_action_20
            int r22 = androidx.core.R.id.accessibility_custom_action_21
            int r23 = androidx.core.R.id.accessibility_custom_action_22
            int r24 = androidx.core.R.id.accessibility_custom_action_23
            int r25 = androidx.core.R.id.accessibility_custom_action_24
            int r26 = androidx.core.R.id.accessibility_custom_action_25
            int r27 = androidx.core.R.id.accessibility_custom_action_26
            int r28 = androidx.core.R.id.accessibility_custom_action_27
            int r29 = androidx.core.R.id.accessibility_custom_action_28
            int r30 = androidx.core.R.id.accessibility_custom_action_29
            int r31 = androidx.core.R.id.accessibility_custom_action_30
            int r32 = androidx.core.R.id.accessibility_custom_action_31
            int[] r0 = new int[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            a.C0414ug.d = r0
            a.pg r0 = new a.pg
            r0.<init>()
            a.C0414ug.e = r0
            a.ug$a r0 = new a.ug$a
            r0.<init>()
            a.C0414ug.f = r0
            return
    }

    @java.lang.Deprecated
    public static a.Jg a(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            a.C0414ug.f721a = r0
        Lb:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            java.lang.Object r0 = r0.get(r2)
            a.Jg r0 = (a.Jg) r0
            if (r0 != 0) goto L1f
            a.Jg r0 = new a.Jg
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            r1.put(r2, r0)
        L1f:
            return r0
    }

    public static android.view.View.AccessibilityDelegate b(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r3 = a.C0414ug.h.a(r3)
            return r3
        Lb:
            boolean r0 = a.C0414ug.c
            if (r0 == 0) goto L10
            goto L35
        L10:
            java.lang.reflect.Field r0 = a.C0414ug.b
            r1 = 1
            if (r0 != 0) goto L26
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r2 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L23
            a.C0414ug.b = r0     // Catch: java.lang.Throwable -> L23
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            a.C0414ug.c = r1
            goto L35
        L26:
            java.lang.reflect.Field r0 = a.C0414ug.b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L33
            boolean r0 = r3 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L35
            android.view.View$AccessibilityDelegate r3 = (android.view.View.AccessibilityDelegate) r3     // Catch: java.lang.Throwable -> L33
            return r3
        L33:
            a.C0414ug.c = r1
        L35:
            r3 = 0
            return r3
    }

    public static java.util.ArrayList c(android.view.View r2) {
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = androidx.core.R.id.tag_accessibility_actions
            r2.setTag(r1, r0)
        L14:
            return r0
    }

    public static java.lang.String[] d(a.Z0 r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = a.C0414ug.j.a(r2)
            return r2
        Lb:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static void e(android.view.View r5, int r6) {
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            goto L7e
        L13:
            java.lang.CharSequence r1 = a.C0414ug.g.b(r5)
            r2 = 1
            if (r1 == 0) goto L28
            boolean r1 = r5.isShown()
            if (r1 == 0) goto L28
            int r1 = r5.getWindowVisibility()
            if (r1 != 0) goto L28
            r1 = r2
            goto L29
        L28:
            r1 = 0
        L29:
            int r3 = r5.getAccessibilityLiveRegion()
            r4 = 32
            if (r3 != 0) goto L7f
            if (r1 == 0) goto L34
            goto L7f
        L34:
            if (r6 != r4) goto L58
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r4)
            r1.setContentChangeTypes(r6)
            r1.setSource(r5)
            r5.onPopulateAccessibilityEvent(r1)
            java.util.List r6 = r1.getText()
            java.lang.CharSequence r5 = a.C0414ug.g.b(r5)
            r6.add(r5)
            r0.sendAccessibilityEvent(r1)
            return
        L58:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L7e
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch: java.lang.AbstractMethodError -> L66
            return
        L66:
            r6 = move-exception
            android.view.ViewParent r5 = r5.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = " does not fully implement ViewParent"
            java.lang.String r5 = r5.concat(r0)
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r5, r6)
        L7e:
            return
        L7f:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L86
            goto L88
        L86:
            r4 = 2048(0x800, float:2.87E-42)
        L88:
            r0.setEventType(r4)
            r0.setContentChangeTypes(r6)
            if (r1 == 0) goto La4
            java.util.List r6 = r0.getText()
            java.lang.CharSequence r1 = a.C0414ug.g.b(r5)
            r6.add(r1)
            int r6 = r5.getImportantForAccessibility()
            if (r6 != 0) goto La4
            r5.setImportantForAccessibility(r2)
        La4:
            r5.sendAccessibilityEventUnchecked(r0)
            return
    }

    public static a.W3 f(android.view.View r3, a.W3 r4) {
            java.lang.String r0 = "ViewCompat"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "performReceiveContent: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", view="
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getId()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L3b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L46
            a.W3 r3 = a.C0414ug.j.b(r3, r4)
            return r3
        L46:
            int r0 = androidx.core.R.id.tag_on_receive_content_listener
            java.lang.Object r0 = r3.getTag(r0)
            a.dc r0 = (a.InterfaceC0106dc) r0
            a.pg r1 = a.C0414ug.e
            if (r0 == 0) goto L66
            a.W3 r4 = r0.a(r3, r4)
            if (r4 != 0) goto L5a
            r3 = 0
            return r3
        L5a:
            boolean r0 = r3 instanceof a.InterfaceC0124ec
            if (r0 == 0) goto L61
            r1 = r3
            a.ec r1 = (a.InterfaceC0124ec) r1
        L61:
            a.W3 r3 = r1.a(r4)
            return r3
        L66:
            boolean r0 = r3 instanceof a.InterfaceC0124ec
            if (r0 == 0) goto L6d
            r1 = r3
            a.ec r1 = (a.InterfaceC0124ec) r1
        L6d:
            a.W3 r3 = r1.a(r4)
            return r3
    }

    public static void g(android.view.View r2, int r3) {
            java.util.ArrayList r2 = c(r2)
            r0 = 0
        L5:
            int r1 = r2.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r2.get(r0)
            a.I$a r1 = (a.I.a) r1
            int r1 = r1.a()
            if (r1 != r3) goto L1b
            r2.remove(r0)
            return
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void h(android.view.View r6, a.I.a r7, a.K r8) {
            a.I$a r0 = new a.I$a
            int r2 = r7.b
            java.lang.Class<? extends a.K$a> r5 = r7.c
            r1 = 0
            r3 = 0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            android.view.View$AccessibilityDelegate r7 = b(r6)
            if (r7 != 0) goto L14
            r7 = 0
            goto L23
        L14:
            boolean r8 = r7 instanceof a.C.a
            if (r8 == 0) goto L1d
            a.C$a r7 = (a.C.a) r7
            a.C r7 = r7.f37a
            goto L23
        L1d:
            a.C r8 = new a.C
            r8.<init>(r7)
            r7 = r8
        L23:
            if (r7 != 0) goto L2a
            a.C r7 = new a.C
            r7.<init>()
        L2a:
            j(r6, r7)
            int r7 = r0.a()
            g(r6, r7)
            java.util.ArrayList r7 = c(r6)
            r7.add(r0)
            r7 = 0
            e(r6, r7)
            return
    }

    public static void i(android.view.View r9, @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r10, int[] r11, android.util.AttributeSet r12, android.content.res.TypedArray r13, int r14) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            a.C0414ug.h.d(r2, r3, r4, r5, r6, r7, r8)
        L10:
            return
    }

    public static void j(android.view.View r1, a.C r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = b(r1)
            boolean r0 = r0 instanceof a.C.a
            if (r0 == 0) goto Lf
            a.C r2 = new a.C
            r2.<init>()
        Lf:
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto L19
            r0 = 1
            r1.setImportantForAccessibility(r0)
        L19:
            if (r2 != 0) goto L1d
            r2 = 0
            goto L1f
        L1d:
            a.C$a r2 = r2.b
        L1f:
            r1.setAccessibilityDelegate(r2)
            return
    }

    public static void k(android.view.View r5, java.lang.CharSequence r6) {
            a.rg r0 = new a.rg
            int r1 = androidx.core.R.id.tag_accessibility_pane_title
            r2 = 28
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r4 = 8
            r0.<init>(r1, r3, r4, r2)
            r0.c(r5, r6)
            a.ug$a r0 = a.C0414ug.f
            if (r6 == 0) goto L3d
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r6 = r0.f722a
            boolean r1 = r5.isShown()
            if (r1 == 0) goto L24
            int r1 = r5.getWindowVisibility()
            if (r1 != 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.put(r5, r1)
            r5.addOnAttachStateChangeListener(r0)
            boolean r6 = r5.isAttachedToWindow()
            if (r6 == 0) goto L3c
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            r5.addOnGlobalLayoutListener(r0)
        L3c:
            return
        L3d:
            java.util.WeakHashMap<android.view.View, java.lang.Boolean> r6 = r0.f722a
            r6.remove(r5)
            r5.removeOnAttachStateChangeListener(r0)
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            r5.removeOnGlobalLayoutListener(r0)
            return
    }
}

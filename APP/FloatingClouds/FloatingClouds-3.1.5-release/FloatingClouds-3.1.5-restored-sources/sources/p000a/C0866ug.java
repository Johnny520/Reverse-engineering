package p000a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.C1066R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0038C;
import p000a.C0146I;
import p000a.C0401W3;
import p000a.C0734nh;

/* JADX INFO: renamed from: a.ug */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C0866ug {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, C0181Jg> f3395a = null;

    /* JADX INFO: renamed from: b */
    public static Field f3396b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f3397c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f3398d = {C1066R.id.accessibility_custom_action_0, C1066R.id.accessibility_custom_action_1, C1066R.id.accessibility_custom_action_2, C1066R.id.accessibility_custom_action_3, C1066R.id.accessibility_custom_action_4, C1066R.id.accessibility_custom_action_5, C1066R.id.accessibility_custom_action_6, C1066R.id.accessibility_custom_action_7, C1066R.id.accessibility_custom_action_8, C1066R.id.accessibility_custom_action_9, C1066R.id.accessibility_custom_action_10, C1066R.id.accessibility_custom_action_11, C1066R.id.accessibility_custom_action_12, C1066R.id.accessibility_custom_action_13, C1066R.id.accessibility_custom_action_14, C1066R.id.accessibility_custom_action_15, C1066R.id.accessibility_custom_action_16, C1066R.id.accessibility_custom_action_17, C1066R.id.accessibility_custom_action_18, C1066R.id.accessibility_custom_action_19, C1066R.id.accessibility_custom_action_20, C1066R.id.accessibility_custom_action_21, C1066R.id.accessibility_custom_action_22, C1066R.id.accessibility_custom_action_23, C1066R.id.accessibility_custom_action_24, C1066R.id.accessibility_custom_action_25, C1066R.id.accessibility_custom_action_26, C1066R.id.accessibility_custom_action_27, C1066R.id.accessibility_custom_action_28, C1066R.id.accessibility_custom_action_29, C1066R.id.accessibility_custom_action_30, C1066R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final C0771pg f3399e = new C0771pg();

    /* JADX INFO: renamed from: f */
    public static final a f3400f = new a();

    /* JADX INFO: renamed from: a.ug$a */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f3401a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: a.ug$b */
    public static abstract class b<T> {

        /* JADX INFO: renamed from: a */
        public final int f3402a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f3403b;

        /* JADX INFO: renamed from: c */
        public final int f3404c;

        /* JADX INFO: renamed from: d */
        public final int f3405d;

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f3402a = i;
            this.f3403b = cls;
            this.f3405d = i2;
            this.f3404c = i3;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo1846a(View view);

        /* JADX INFO: renamed from: b */
        public abstract void mo1847b(View view, T t);

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.ug$b<T> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public final void m2005c(View view, T t) {
            Object tag;
            if (Build.VERSION.SDK_INT >= this.f3404c) {
                mo1847b(view, t);
                return;
            }
            if (Build.VERSION.SDK_INT >= this.f3404c) {
                tag = mo1846a(view);
            } else {
                tag = view.getTag(this.f3402a);
                if (!this.f3403b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (mo1848d(tag, t)) {
                View.AccessibilityDelegate accessibilityDelegateM1995b = C0866ug.m1995b(view);
                C0038C c0038c = accessibilityDelegateM1995b == null ? null : accessibilityDelegateM1995b instanceof C0038C.a ? ((C0038C.a) accessibilityDelegateM1995b).f139a : new C0038C(accessibilityDelegateM1995b);
                if (c0038c == null) {
                    c0038c = new C0038C();
                }
                C0866ug.m2003j(view, c0038c);
                view.setTag(this.f3402a, t);
                C0866ug.m1998e(view, this.f3405d);
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract boolean mo1848d(T t, T t2);
    }

    /* JADX INFO: renamed from: a.ug$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static WindowInsets m2006a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsets m2007b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        public static void m2008c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: a.ug$d */
    public static class d {

        /* JADX INFO: renamed from: a.ug$d$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public C0734nh f3406a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f3407b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ InterfaceC0355Tb f3408c;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(View view, InterfaceC0355Tb interfaceC0355Tb) {
                this.f3407b = view;
                this.f3408c = interfaceC0355Tb;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0734nh c0734nhM1690g = C0734nh.m1690g(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                InterfaceC0355Tb interfaceC0355Tb = this.f3408c;
                if (i < 30) {
                    d.m2009a(windowInsets, this.f3407b);
                    if (c0734nhM1690g.equals(this.f3406a)) {
                        return interfaceC0355Tb.mo691a(view, c0734nhM1690g).m1695f();
                    }
                }
                this.f3406a = c0734nhM1690g;
                C0734nh c0734nhMo691a = interfaceC0355Tb.mo691a(view, c0734nhM1690g);
                if (i >= 30) {
                    return c0734nhMo691a.m1695f();
                }
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                c.m2008c(view);
                return c0734nhMo691a.m1695f();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m2009a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C1066R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static C0734nh m2010b(View view, C0734nh c0734nh, Rect rect) {
            WindowInsets windowInsetsM1695f = c0734nh.m1695f();
            if (windowInsetsM1695f != null) {
                return C0734nh.m1690g(view, view.computeSystemWindowInsets(windowInsetsM1695f, rect));
            }
            rect.setEmpty();
            return c0734nh;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m2011c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m2012d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* JADX INFO: renamed from: e */
        public static boolean m2013e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* JADX INFO: renamed from: f */
        public static boolean m2014f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* JADX INFO: renamed from: g */
        public static ColorStateList m2015g(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: h */
        public static PorterDuff.Mode m2016h(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: i */
        public static float m2017i(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: j */
        public static C0734nh m2018j(View view) {
            if (!C0734nh.a.f2861d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = C0734nh.a.f2858a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) C0734nh.a.f2859b.get(obj);
                Rect rect2 = (Rect) C0734nh.a.f2860c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i = Build.VERSION.SDK_INT;
                C0734nh.e dVar = i >= 30 ? new C0734nh.d() : i >= 29 ? new C0734nh.c() : new C0734nh.b();
                dVar.mo1698e(C0479a9.m1165b(rect.left, rect.top, rect.right, rect.bottom));
                dVar.mo1699g(C0479a9.m1165b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                C0734nh c0734nhMo1697b = dVar.mo1697b();
                c0734nhMo1697b.f2857a.mo1715p(c0734nhMo1697b);
                c0734nhMo1697b.f2857a.mo1709d(view.getRootView());
                return c0734nhMo1697b;
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                return null;
            }
        }

        /* JADX INFO: renamed from: k */
        public static String m2019k(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: l */
        public static float m2020l(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: m */
        public static float m2021m(View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: n */
        public static boolean m2022n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* JADX INFO: renamed from: o */
        public static boolean m2023o(View view) {
            return view.isImportantForAccessibility();
        }

        /* JADX INFO: renamed from: p */
        public static boolean m2024p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: q */
        public static void m2025q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: r */
        public static void m2026r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: s */
        public static void m2027s(View view, float f) {
            view.setElevation(f);
        }

        /* JADX INFO: renamed from: t */
        public static void m2028t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* JADX INFO: renamed from: u */
        public static void m2029u(View view, InterfaceC0355Tb interfaceC0355Tb) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C1066R.id.tag_on_apply_window_listener, interfaceC0355Tb);
            }
            if (interfaceC0355Tb == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C1066R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC0355Tb));
            }
        }

        /* JADX INFO: renamed from: v */
        public static void m2030v(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: w */
        public static void m2031w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* JADX INFO: renamed from: x */
        public static void m2032x(View view, float f) {
            view.setZ(f);
        }

        /* JADX INFO: renamed from: y */
        public static boolean m2033y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* JADX INFO: renamed from: z */
        public static void m2034z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: a.ug$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static C0734nh m2035a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0734nh c0734nhM1690g = C0734nh.m1690g(null, rootWindowInsets);
            C0734nh.k kVar = c0734nhM1690g.f2857a;
            kVar.mo1715p(c0734nhM1690g);
            kVar.mo1709d(view.getRootView());
            return c0734nhM1690g;
        }

        /* JADX INFO: renamed from: b */
        public static int m2036b(View view) {
            return view.getScrollIndicators();
        }

        /* JADX INFO: renamed from: c */
        public static void m2037c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* JADX INFO: renamed from: d */
        public static void m2038d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: a.ug$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static void m2039a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* JADX INFO: renamed from: b */
        public static AutofillId m2040b(View view) {
            return view.getAutofillId();
        }

        /* JADX INFO: renamed from: c */
        public static int m2041c(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: d */
        public static int m2042d(View view) {
            return view.getNextClusterForwardId();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m2043e(View view) {
            return view.hasExplicitFocusable();
        }

        /* JADX INFO: renamed from: f */
        public static boolean m2044f(View view) {
            return view.isFocusedByDefault();
        }

        /* JADX INFO: renamed from: g */
        public static boolean m2045g(View view) {
            return view.isImportantForAutofill();
        }

        /* JADX INFO: renamed from: h */
        public static boolean m2046h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* JADX INFO: renamed from: i */
        public static View m2047i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* JADX INFO: renamed from: j */
        public static boolean m2048j(View view) {
            return view.restoreDefaultFocus();
        }

        /* JADX INFO: renamed from: k */
        public static void m2049k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* JADX INFO: renamed from: l */
        public static void m2050l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* JADX INFO: renamed from: m */
        public static void m2051m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* JADX INFO: renamed from: n */
        public static void m2052n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* JADX INFO: renamed from: o */
        public static void m2053o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* JADX INFO: renamed from: p */
        public static void m2054p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: a.ug$g */
    public static class g {
        /* JADX INFO: renamed from: a */
        public static void m2055a(View view, l lVar) {
            C0598ge c0598ge = (C0598ge) view.getTag(C1066R.id.tag_unhandled_key_listeners);
            if (c0598ge == null) {
                c0598ge = new C0598ge();
                view.setTag(C1066R.id.tag_unhandled_key_listeners, c0598ge);
            }
            Objects.requireNonNull(lVar);
            ViewOnUnhandledKeyEventListenerC0885vg viewOnUnhandledKeyEventListenerC0885vg = new ViewOnUnhandledKeyEventListenerC0885vg();
            c0598ge.put(lVar, viewOnUnhandledKeyEventListenerC0885vg);
            view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0885vg);
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m2056b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m2057c(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m2058d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: e */
        public static void m2059e(View view, l lVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C0598ge c0598ge = (C0598ge) view.getTag(C1066R.id.tag_unhandled_key_listeners);
            if (c0598ge == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0598ge.getOrDefault(lVar, null)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* JADX INFO: renamed from: f */
        public static <T> T m2060f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        /* JADX INFO: renamed from: g */
        public static void m2061g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* JADX INFO: renamed from: h */
        public static void m2062h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: i */
        public static void m2063i(View view, C0292Q1 c0292q1) {
            view.setAutofillId(null);
        }

        /* JADX INFO: renamed from: j */
        public static void m2064j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: a.ug$h */
    public static class h {
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m2065a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        public static ContentCaptureSession m2066b(View view) {
            return view.getContentCaptureSession();
        }

        /* JADX INFO: renamed from: c */
        public static List<Rect> m2067c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* JADX INFO: renamed from: d */
        public static void m2068d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* JADX INFO: renamed from: e */
        public static void m2069e(View view, C0347T3 c0347t3) {
            view.setContentCaptureSession(null);
        }

        /* JADX INFO: renamed from: f */
        public static void m2070f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: a.ug$i */
    public static class i {
        /* JADX INFO: renamed from: a */
        public static int m2071a(View view) {
            return view.getImportantForContentCapture();
        }

        /* JADX INFO: renamed from: b */
        public static CharSequence m2072b(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m2073c(View view) {
            return view.isImportantForContentCapture();
        }

        /* JADX INFO: renamed from: d */
        public static void m2074d(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        /* JADX INFO: renamed from: e */
        public static void m2075e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: a.ug$j */
    public static final class j {
        /* JADX INFO: renamed from: a */
        public static String[] m2076a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* JADX INFO: renamed from: b */
        public static C0401W3 m2077b(View view, C0401W3 c0401w3) {
            ContentInfo contentInfoMo1046c = c0401w3.f1528a.mo1046c();
            Objects.requireNonNull(contentInfoMo1046c);
            ContentInfo contentInfoM1939g = C0833t2.m1939g(contentInfoMo1046c);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM1939g);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM1939g ? c0401w3 : new C0401W3(new C0401W3.d(contentInfoPerformReceiveContent));
        }

        /* JADX INFO: renamed from: c */
        public static void m2078c(View view, String[] strArr, InterfaceC0539dc interfaceC0539dc) {
            if (interfaceC0539dc == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new k(interfaceC0539dc));
            }
        }
    }

    /* JADX INFO: renamed from: a.ug$k */
    public static final class k implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0539dc f3409a;

        public k(InterfaceC0539dc interfaceC0539dc) {
            this.f3409a = interfaceC0539dc;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0401W3 c0401w3 = new C0401W3(new C0401W3.d(contentInfo));
            C0401W3 c0401w3Mo1172a = this.f3409a.mo1172a(view, c0401w3);
            if (c0401w3Mo1172a == null) {
                return null;
            }
            if (c0401w3Mo1172a == c0401w3) {
                return contentInfo;
            }
            ContentInfo contentInfoMo1046c = c0401w3Mo1172a.f1528a.mo1046c();
            Objects.requireNonNull(contentInfoMo1046c);
            return C0833t2.m1939g(contentInfoMo1046c);
        }
    }

    /* JADX INFO: renamed from: a.ug$l */
    public interface l {
        /* JADX INFO: renamed from: a */
        boolean m2079a();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static C0181Jg m1994a(View view) {
        if (f3395a == null) {
            f3395a = new WeakHashMap<>();
        }
        C0181Jg c0181Jg = f3395a.get(view);
        if (c0181Jg != null) {
            return c0181Jg;
        }
        C0181Jg c0181Jg2 = new C0181Jg(view);
        f3395a.put(view, c0181Jg2);
        return c0181Jg2;
    }

    /* JADX INFO: renamed from: b */
    public static View.AccessibilityDelegate m1995b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.m2065a(view);
        }
        if (f3397c) {
            return null;
        }
        if (f3396b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3396b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3397c = true;
                return null;
            }
        }
        try {
            Object obj = f3396b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3397c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m1996c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C1066R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C1066R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static String[] m1997d(C0452Z0 c0452z0) {
        return Build.VERSION.SDK_INT >= 31 ? j.m2076a(c0452z0) : (String[]) c0452z0.getTag(C1066R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: e */
    public static void m1998e(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = g.m2056b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    accessibilityEventObtain.getText().add(g.m2056b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(g.m2056b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0401W3 m1999f(View view, C0401W3 c0401w3) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0401w3 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j.m2077b(view, c0401w3);
        }
        InterfaceC0539dc interfaceC0539dc = (InterfaceC0539dc) view.getTag(C1066R.id.tag_on_receive_content_listener);
        InterfaceC0558ec interfaceC0558ec = f3399e;
        if (interfaceC0539dc == null) {
            if (view instanceof InterfaceC0558ec) {
                interfaceC0558ec = (InterfaceC0558ec) view;
            }
            return interfaceC0558ec.mo1114a(c0401w3);
        }
        C0401W3 c0401w3Mo1172a = interfaceC0539dc.mo1172a(view, c0401w3);
        if (c0401w3Mo1172a == null) {
            return null;
        }
        if (view instanceof InterfaceC0558ec) {
            interfaceC0558ec = (InterfaceC0558ec) view;
        }
        return interfaceC0558ec.mo1114a(c0401w3Mo1172a);
    }

    /* JADX INFO: renamed from: g */
    public static void m2000g(View view, int i2) {
        ArrayList arrayListM1996c = m1996c(view);
        for (int i3 = 0; i3 < arrayListM1996c.size(); i3++) {
            if (((C0146I.a) arrayListM1996c.get(i3)).m384a() == i2) {
                arrayListM1996c.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m2001h(View view, C0146I.a aVar, InterfaceC0182K interfaceC0182K) {
        C0146I.a aVar2 = new C0146I.a(null, aVar.f516b, null, interfaceC0182K, aVar.f517c);
        View.AccessibilityDelegate accessibilityDelegateM1995b = m1995b(view);
        C0038C c0038c = accessibilityDelegateM1995b == null ? null : accessibilityDelegateM1995b instanceof C0038C.a ? ((C0038C.a) accessibilityDelegateM1995b).f139a : new C0038C(accessibilityDelegateM1995b);
        if (c0038c == null) {
            c0038c = new C0038C();
        }
        m2003j(view, c0038c);
        m2000g(view, aVar2.m384a());
        m1996c(view).add(aVar2);
        m1998e(view, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m2002i(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            h.m2068d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2003j(View view, C0038C c0038c) {
        if (c0038c == null && (m1995b(view) instanceof C0038C.a)) {
            c0038c = new C0038C();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0038c == null ? null : c0038c.f138b);
    }

    /* JADX INFO: renamed from: k */
    public static void m2004k(View view, CharSequence charSequence) {
        new C0809rg(C1066R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2005c(view, charSequence);
        a aVar = f3400f;
        if (charSequence == null) {
            aVar.f3401a.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.f3401a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }
}

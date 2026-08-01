package androidx.core.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.C0128;
import androidx.core.widget.C2300;
import com.davemorrissey.labs.subscaleview.R;
import com.lxj.xpopup.core.AbstractC3775;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p155.C7609;
import p155.InterfaceC7614;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f6591 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field f6592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static WeakHashMap f6593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f6590 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2199 f6589 = new C2199();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC2196 f6588 = new ViewTreeObserverOnGlobalLayoutListenerC2196();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static CharSequence m4223(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC2284.m4267(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static View.AccessibilityDelegate m4224(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2288.m4274(view);
        }
        if (f6591) {
            return null;
        }
        if (f6592 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6592 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6591 = true;
                return null;
            }
        }
        try {
            Object obj = f6592.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6591 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4225(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C2271.f6594;
        C2271 c2271 = (C2271) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c2271 == null) {
            c2271 = new C2271();
            c2271.f6597 = null;
            c2271.f6596 = null;
            c2271.f6595 = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2271);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2271.f6597;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C2271.f6594;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c2271.f6597 == null) {
                            c2271.f6597 = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C2271.f6594;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c2271.f6597.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c2271.f6597.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM4242 = c2271.m4242(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM4242 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c2271.f6596 == null) {
                    c2271.f6596 = new SparseArray();
                }
                c2271.f6596.put(keyCode, new WeakReference(viewM4242));
            }
        }
        return viewM4242 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2225 m4226(View view, C2225 c2225) {
        WindowInsets windowInsetsM4059 = c2225.m4059();
        if (windowInsetsM4059 != null) {
            WindowInsets windowInsetsM4276 = Build.VERSION.SDK_INT >= 30 ? AbstractC2289.m4276(view, windowInsetsM4059) : AbstractC2191.m3986(view, windowInsetsM4059);
            if (!windowInsetsM4276.equals(windowInsetsM4059)) {
                return C2225.m4053(view, windowInsetsM4276);
            }
        }
        return c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2282 m4227(View view) {
        if (f6593 == null) {
            f6593 = new WeakHashMap();
        }
        C2282 c2282 = (C2282) f6593.get(view);
        if (c2282 != null) {
            return c2282;
        }
        C2282 c22822 = new C2282(view);
        f6593.put(view, c22822);
        return c22822;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4228(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m4229(View view, C7609 c7609, InterfaceC7614 interfaceC7614) {
        C7609 c76092 = new C7609(null, c7609.f20651, null, interfaceC7614, c7609.f20650);
        View.AccessibilityDelegate accessibilityDelegateM4224 = m4224(view);
        C2246 c2246 = accessibilityDelegateM4224 == null ? null : accessibilityDelegateM4224 instanceof C2247 ? ((C2247) accessibilityDelegateM4224).f6547 : new C2246(accessibilityDelegateM4224);
        if (c2246 == null) {
            c2246 = new C2246();
        }
        m4234(view, c2246);
        m4238(view, c76092.m12820());
        m4236(view).add(c76092);
        m4239(view, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4230(View view, AbstractC3775 abstractC3775) {
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2284.m4264(view, abstractC3775);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(abstractC3775);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (C2271.f6594) {
            int i = 0;
            while (true) {
                try {
                    ArrayList arrayList2 = C2271.f6594;
                    if (i >= arrayList2.size()) {
                        return;
                    }
                    if (((WeakReference) arrayList2.get(i)).get() == view) {
                        arrayList2.remove(i);
                        return;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static void m4231(View view, CharSequence charSequence) {
        new C2195(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m3993(charSequence, view);
        ViewTreeObserverOnGlobalLayoutListenerC2196 viewTreeObserverOnGlobalLayoutListenerC2196 = f6588;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2196.f6471.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2196);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2196.f6471.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m4232(View view, AbstractC2279 abstractC2279) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC2279 != null ? new C2273(abstractC2279) : null);
            return;
        }
        PathInterpolator pathInterpolator = C2277.f6611;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC2276 = abstractC2279 != null ? new ViewOnApplyWindowInsetsListenerC2276(view, abstractC2279) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC2276);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2276);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m4233(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2288.m4273(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m4234(View view, C2246 c2246) {
        if (c2246 == null && (m4224(view) instanceof C2247)) {
            c2246 = new C2246();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2246 == null ? null : c2246.f6545);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String[] m4235(C0128 c0128) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC2286.m4272(c0128) : (String[]) c0128.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ArrayList m4236(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C2260 m4237(View view, C2260 c2260) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2260 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2286.m4271(view, c2260);
        }
        C2300 c2300 = (C2300) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2204 interfaceC2204 = f6589;
        if (c2300 == null) {
            if (view instanceof InterfaceC2204) {
                interfaceC2204 = (InterfaceC2204) view;
            }
            return interfaceC2204.mo535(c2260);
        }
        C2260 c2260M4313 = C2300.m4313(view, c2260);
        if (c2260M4313 == null) {
            return null;
        }
        if (view instanceof InterfaceC2204) {
            interfaceC2204 = (InterfaceC2204) view;
        }
        return interfaceC2204.mo535(c2260M4313);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m4238(View view, int i) {
        ArrayList arrayListM4236 = m4236(view);
        for (int i2 = 0; i2 < arrayListM4236.size(); i2++) {
            if (((C7609) arrayListM4236.get(i2)).m12820() == i) {
                arrayListM4236.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4239(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m4223(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m4223(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m4223(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C2225 m4240(View view, C2225 c2225) {
        WindowInsets windowInsetsM4059 = c2225.m4059();
        if (windowInsetsM4059 != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM4059);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM4059)) {
                return C2225.m4053(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return c2225;
    }
}

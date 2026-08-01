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
import com.lxj.xpopup.core.AbstractC3776;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p155.C7610;
import p155.InterfaceC7615;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2270 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f6592 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field f6593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static WeakHashMap f6594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f6591 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2199 f6590 = new C2199();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC2196 f6589 = new ViewTreeObserverOnGlobalLayoutListenerC2196();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static CharSequence m4233(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC2284.m4277(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static View.AccessibilityDelegate m4234(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC2288.m4284(view);
        }
        if (f6592) {
            return null;
        }
        if (f6593 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6593 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6592 = true;
                return null;
            }
        }
        try {
            Object obj = f6593.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6592 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4235(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C2271.f6595;
        C2271 c2271 = (C2271) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c2271 == null) {
            c2271 = new C2271();
            c2271.f6598 = null;
            c2271.f6597 = null;
            c2271.f6596 = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c2271);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c2271.f6598;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C2271.f6595;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c2271.f6598 == null) {
                            c2271.f6598 = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C2271.f6595;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c2271.f6598.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c2271.f6598.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM4252 = c2271.m4252(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM4252 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c2271.f6597 == null) {
                    c2271.f6597 = new SparseArray();
                }
                c2271.f6597.put(keyCode, new WeakReference(viewM4252));
            }
        }
        return viewM4252 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C2225 m4236(View view, C2225 c2225) {
        WindowInsets windowInsetsM4069 = c2225.m4069();
        if (windowInsetsM4069 != null) {
            WindowInsets windowInsetsM4286 = Build.VERSION.SDK_INT >= 30 ? AbstractC2289.m4286(view, windowInsetsM4069) : AbstractC2191.m3996(view, windowInsetsM4069);
            if (!windowInsetsM4286.equals(windowInsetsM4069)) {
                return C2225.m4063(view, windowInsetsM4286);
            }
        }
        return c2225;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2282 m4237(View view) {
        if (f6594 == null) {
            f6594 = new WeakHashMap();
        }
        C2282 c2282 = (C2282) f6594.get(view);
        if (c2282 != null) {
            return c2282;
        }
        C2282 c22822 = new C2282(view);
        f6594.put(view, c22822);
        return c22822;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4238(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m4239(View view, C7610 c7610, InterfaceC7615 interfaceC7615) {
        C7610 c76102 = new C7610(null, c7610.f20646, null, interfaceC7615, c7610.f20645);
        View.AccessibilityDelegate accessibilityDelegateM4234 = m4234(view);
        C2246 c2246 = accessibilityDelegateM4234 == null ? null : accessibilityDelegateM4234 instanceof C2247 ? ((C2247) accessibilityDelegateM4234).f6548 : new C2246(accessibilityDelegateM4234);
        if (c2246 == null) {
            c2246 = new C2246();
        }
        m4244(view, c2246);
        m4248(view, c76102.m12849());
        m4246(view).add(c76102);
        m4249(view, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4240(View view, AbstractC3776 abstractC3776) {
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC2284.m4274(view, abstractC3776);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(abstractC3776);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (C2271.f6595) {
            int i = 0;
            while (true) {
                try {
                    ArrayList arrayList2 = C2271.f6595;
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
    public static void m4241(View view, CharSequence charSequence) {
        new C2195(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m4003(charSequence, view);
        ViewTreeObserverOnGlobalLayoutListenerC2196 viewTreeObserverOnGlobalLayoutListenerC2196 = f6589;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC2196.f6472.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2196);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC2196.f6472.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2196);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m4242(View view, AbstractC2279 abstractC2279) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC2279 != null ? new C2273(abstractC2279) : null);
            return;
        }
        PathInterpolator pathInterpolator = C2277.f6612;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC2276 = abstractC2279 != null ? new ViewOnApplyWindowInsetsListenerC2276(view, abstractC2279) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC2276);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC2276);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m4243(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC2288.m4283(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m4244(View view, C2246 c2246) {
        if (c2246 == null && (m4234(view) instanceof C2247)) {
            c2246 = new C2246();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c2246 == null ? null : c2246.f6546);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String[] m4245(C0128 c0128) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC2286.m4282(c0128) : (String[]) c0128.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ArrayList m4246(View view) {
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
    public static C2260 m4247(View view, C2260 c2260) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2260 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2286.m4281(view, c2260);
        }
        C2300 c2300 = (C2300) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2204 interfaceC2204 = f6590;
        if (c2300 == null) {
            if (view instanceof InterfaceC2204) {
                interfaceC2204 = (InterfaceC2204) view;
            }
            return interfaceC2204.mo536(c2260);
        }
        C2260 c2260M4323 = C2300.m4323(view, c2260);
        if (c2260M4323 == null) {
            return null;
        }
        if (view instanceof InterfaceC2204) {
            interfaceC2204 = (InterfaceC2204) view;
        }
        return interfaceC2204.mo536(c2260M4323);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m4248(View view, int i) {
        ArrayList arrayListM4246 = m4246(view);
        for (int i2 = 0; i2 < arrayListM4246.size(); i2++) {
            if (((C7610) arrayListM4246.get(i2)).m12849() == i) {
                arrayListM4246.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4249(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m4233(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m4233(view));
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
            accessibilityEventObtain2.getText().add(m4233(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C2225 m4250(View view, C2225 c2225) {
        WindowInsets windowInsetsM4069 = c2225.m4069();
        if (windowInsetsM4069 != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM4069);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM4069)) {
                return C2225.m4063(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return c2225;
    }
}

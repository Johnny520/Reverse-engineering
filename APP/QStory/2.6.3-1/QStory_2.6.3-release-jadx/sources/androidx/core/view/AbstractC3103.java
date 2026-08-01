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
import androidx.appcompat.widget.C0975;
import androidx.core.widget.C3133;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.lxj.xpopup.core.AbstractC4608;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p171.C8439;
import p171.InterfaceC8444;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3103 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean f6937 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Field f6938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static WeakHashMap f6939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int[] f6936 = {C0328R.id.accessibility_custom_action_0, C0328R.id.accessibility_custom_action_1, C0328R.id.accessibility_custom_action_2, C0328R.id.accessibility_custom_action_3, C0328R.id.accessibility_custom_action_4, C0328R.id.accessibility_custom_action_5, C0328R.id.accessibility_custom_action_6, C0328R.id.accessibility_custom_action_7, C0328R.id.accessibility_custom_action_8, C0328R.id.accessibility_custom_action_9, C0328R.id.accessibility_custom_action_10, C0328R.id.accessibility_custom_action_11, C0328R.id.accessibility_custom_action_12, C0328R.id.accessibility_custom_action_13, C0328R.id.accessibility_custom_action_14, C0328R.id.accessibility_custom_action_15, C0328R.id.accessibility_custom_action_16, C0328R.id.accessibility_custom_action_17, C0328R.id.accessibility_custom_action_18, C0328R.id.accessibility_custom_action_19, C0328R.id.accessibility_custom_action_20, C0328R.id.accessibility_custom_action_21, C0328R.id.accessibility_custom_action_22, C0328R.id.accessibility_custom_action_23, C0328R.id.accessibility_custom_action_24, C0328R.id.accessibility_custom_action_25, C0328R.id.accessibility_custom_action_26, C0328R.id.accessibility_custom_action_27, C0328R.id.accessibility_custom_action_28, C0328R.id.accessibility_custom_action_29, C0328R.id.accessibility_custom_action_30, C0328R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3032 f6935 = new C3032();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC3029 f6934 = new ViewTreeObserverOnGlobalLayoutListenerC3029();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static CharSequence m4793(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC3117.m4837(view);
        } else {
            tag = view.getTag(C0328R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static View.AccessibilityDelegate m4794(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC3121.m4844(view);
        }
        if (f6937) {
            return null;
        }
        if (f6938 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6938 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6937 = true;
                return null;
            }
        }
        try {
            Object obj = f6938.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6937 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m4795(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C3104.f6940;
        C3104 c3104 = (C3104) view.getTag(C0328R.id.tag_unhandled_key_event_manager);
        if (c3104 == null) {
            c3104 = new C3104();
            c3104.f6943 = null;
            c3104.f6942 = null;
            c3104.f6941 = null;
            view.setTag(C0328R.id.tag_unhandled_key_event_manager, c3104);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c3104.f6943;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C3104.f6940;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c3104.f6943 == null) {
                            c3104.f6943 = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C3104.f6940;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c3104.f6943.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c3104.f6943.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM4812 = c3104.m4812(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM4812 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c3104.f6942 == null) {
                    c3104.f6942 = new SparseArray();
                }
                c3104.f6942.put(keyCode, new WeakReference(viewM4812));
            }
        }
        return viewM4812 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C3058 m4796(View view, C3058 c3058) {
        WindowInsets windowInsetsM4629 = c3058.m4629();
        if (windowInsetsM4629 != null) {
            WindowInsets windowInsetsM4846 = Build.VERSION.SDK_INT >= 30 ? AbstractC3122.m4846(view, windowInsetsM4629) : AbstractC3024.m4556(view, windowInsetsM4629);
            if (!windowInsetsM4846.equals(windowInsetsM4629)) {
                return C3058.m4623(view, windowInsetsM4846);
            }
        }
        return c3058;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3115 m4797(View view) {
        if (f6939 == null) {
            f6939 = new WeakHashMap();
        }
        C3115 c3115 = (C3115) f6939.get(view);
        if (c3115 != null) {
            return c3115;
        }
        C3115 c31152 = new C3115(view);
        f6939.put(view, c31152);
        return c31152;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4798(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(C0328R.id.view_tree_disjoint_parent, viewGroup);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static void m4799(View view, C8439 c8439, InterfaceC8444 interfaceC8444) {
        C8439 c84392 = new C8439(null, c8439.f20991, null, interfaceC8444, c8439.f20990);
        View.AccessibilityDelegate accessibilityDelegateM4794 = m4794(view);
        C3079 c3079 = accessibilityDelegateM4794 == null ? null : accessibilityDelegateM4794 instanceof C3080 ? ((C3080) accessibilityDelegateM4794).f6893 : new C3079(accessibilityDelegateM4794);
        if (c3079 == null) {
            c3079 = new C3079();
        }
        m4804(view, c3079);
        m4808(view, c84392.m13408());
        m4806(view).add(c84392);
        m4809(view, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4800(View view, AbstractC4608 abstractC4608) {
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC3117.m4834(view, abstractC4608);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0328R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(abstractC4608);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (C3104.f6940) {
            int i = 0;
            while (true) {
                try {
                    ArrayList arrayList2 = C3104.f6940;
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
    public static void m4801(View view, CharSequence charSequence) {
        new C3028(C0328R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m4563(charSequence, view);
        ViewTreeObserverOnGlobalLayoutListenerC3029 viewTreeObserverOnGlobalLayoutListenerC3029 = f6934;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC3029.f6817.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3029);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3029);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC3029.f6817.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3029);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3029);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m4802(View view, AbstractC3112 abstractC3112) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC3112 != null ? new C3106(abstractC3112) : null);
            return;
        }
        PathInterpolator pathInterpolator = C3110.f6957;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC3109 = abstractC3112 != null ? new ViewOnApplyWindowInsetsListenerC3109(view, abstractC3112) : null;
        view.setTag(C0328R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC3109);
        if (view.getTag(C0328R.id.tag_compat_insets_dispatch) == null && view.getTag(C0328R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC3109);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m4803(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3121.m4843(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static void m4804(View view, C3079 c3079) {
        if (c3079 == null && (m4794(view) instanceof C3080)) {
            c3079 = new C3079();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c3079 == null ? null : c3079.f6891);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String[] m4805(C0975 c0975) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC3119.m4842(c0975) : (String[]) c0975.getTag(C0328R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ArrayList m4806(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0328R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0328R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C3093 m4807(View view, C3093 c3093) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c3093 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC3119.m4841(view, c3093);
        }
        C3133 c3133 = (C3133) view.getTag(C0328R.id.tag_on_receive_content_listener);
        InterfaceC3037 interfaceC3037 = f6935;
        if (c3133 == null) {
            if (view instanceof InterfaceC3037) {
                interfaceC3037 = (InterfaceC3037) view;
            }
            return interfaceC3037.mo1096(c3093);
        }
        C3093 c3093M4883 = C3133.m4883(view, c3093);
        if (c3093M4883 == null) {
            return null;
        }
        if (view instanceof InterfaceC3037) {
            interfaceC3037 = (InterfaceC3037) view;
        }
        return interfaceC3037.mo1096(c3093M4883);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static void m4808(View view, int i) {
        ArrayList arrayListM4806 = m4806(view);
        for (int i2 = 0; i2 < arrayListM4806.size(); i2++) {
            if (((C8439) arrayListM4806.get(i2)).m13408() == i) {
                arrayListM4806.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4809(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m4793(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m4793(view));
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
            accessibilityEventObtain2.getText().add(m4793(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C3058 m4810(View view, C3058 c3058) {
        WindowInsets windowInsetsM4629 = c3058.m4629();
        if (windowInsetsM4629 != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM4629);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM4629)) {
                return C3058.m4623(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return c3058;
    }
}

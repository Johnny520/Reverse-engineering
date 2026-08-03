package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import io.github.cherrywechat.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2185lE {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f7617a = null;

    /* JADX INFO: renamed from: b */
    public static Field f7618b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f7619c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f7620d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final C1088ZD f7621e = new C1088ZD();

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1212bE f7622f = new ViewTreeObserverOnGlobalLayoutListenerC1212bE();

    /* JADX INFO: renamed from: a */
    public static C0273GE m4388a(View view) {
        if (f7617a == null) {
            f7617a = new WeakHashMap();
        }
        C0273GE c0273ge = (C0273GE) f7617a.get(view);
        if (c0273ge != null) {
            return c0273ge;
        }
        C0273GE c0273ge2 = new C0273GE(view);
        f7617a.put(view, c0273ge2);
        return c0273ge2;
    }

    /* JADX INFO: renamed from: b */
    public static C0489LF m4389b(View view, C0489LF c0489lf) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM945g = c0489lf.m945g();
        if (windowInsetsM945g != null) {
            WindowInsets windowInsetsM4277a = i >= 30 ? AbstractC2093jE.m4277a(view, windowInsetsM945g) : AbstractC1255cE.m2368a(view, windowInsetsM945g);
            if (!windowInsetsM4277a.equals(windowInsetsM945g)) {
                return C0489LF.m939h(view, windowInsetsM4277a);
            }
        }
        return c0489lf;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m4390c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1536iE.m2913a(view);
        }
        if (f7619c) {
            return null;
        }
        if (f7618b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7618b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7619c = true;
                return null;
            }
        }
        try {
            Object obj = f7618b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7619c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m4391d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static String[] m4392e(C0348I3 c0348i3) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC2137kE.m4319a(c0348i3) : (String[]) c0348i3.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: f */
    public static void m4393f(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = AbstractC1492hE.m2850a(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(AbstractC1492hE.m2850a(view));
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
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
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
            accessibilityEventObtain2.getText().add(AbstractC1492hE.m2850a(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C0489LF m4394g(View view, C0489LF c0489lf) {
        WindowInsets windowInsetsM945g = c0489lf.m945g();
        if (windowInsetsM945g != null) {
            WindowInsets windowInsetsM2369b = AbstractC1255cE.m2369b(view, windowInsetsM945g);
            if (!windowInsetsM2369b.equals(windowInsetsM945g)) {
                return C0489LF.m939h(view, windowInsetsM2369b);
            }
        }
        return c0489lf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C2798zb m4395h(View view, C2798zb c2798zb) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c2798zb);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC2137kE.m4320b(view, c2798zb);
        }
        C2791zA c2791zA = (C2791zA) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2472rt interfaceC2472rt = f7621e;
        if (c2791zA == null) {
            if (view instanceof InterfaceC2472rt) {
                interfaceC2472rt = (InterfaceC2472rt) view;
            }
            return interfaceC2472rt.mo751a(c2798zb);
        }
        C2798zb c2798zbM5360a = C2791zA.m5360a(view, c2798zb);
        if (c2798zbM5360a == null) {
            return null;
        }
        if (view instanceof InterfaceC2472rt) {
            interfaceC2472rt = (InterfaceC2472rt) view;
        }
        return interfaceC2472rt.mo751a(c2798zbM5360a);
    }

    /* JADX INFO: renamed from: i */
    public static void m4396i(View view, int i) {
        ArrayList arrayListM4391d = m4391d(view);
        for (int i2 = 0; i2 < arrayListM4391d.size(); i2++) {
            if (((C0902V) arrayListM4391d.get(i2)).m1752a() == i) {
                arrayListM4391d.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m4397j(View view, C0902V c0902v, InterfaceC2123k0 interfaceC2123k0) {
        if (interfaceC2123k0 == null) {
            m4396i(view, c0902v.m1752a());
            m4393f(view, 0);
            return;
        }
        C0902V c0902v2 = new C0902V(null, c0902v.f2811b, null, interfaceC2123k0, c0902v.f2812c);
        View.AccessibilityDelegate accessibilityDelegateM4390c = m4390c(view);
        C0645P c0645p = accessibilityDelegateM4390c == null ? null : accessibilityDelegateM4390c instanceof C0602O ? ((C0602O) accessibilityDelegateM4390c).f1942a : new C0645P(accessibilityDelegateM4390c);
        if (c0645p == null) {
            c0645p = new C0645P();
        }
        m4399l(view, c0645p);
        m4396i(view, c0902v2.m1752a());
        m4391d(view).add(c0902v2);
        m4393f(view, 0);
    }

    /* JADX INFO: renamed from: k */
    public static void m4398k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1536iE.m2914b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4399l(View view, C0645P c0645p) {
        if (c0645p == null && (m4390c(view) instanceof C0602O)) {
            c0645p = new C0645P();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0645p == null ? null : c0645p.f2083b);
    }

    /* JADX INFO: renamed from: m */
    public static void m4400m(View view, CharSequence charSequence) {
        new C1132aE(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m4627f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1212bE viewTreeObserverOnGlobalLayoutListenerC1212bE = f7622f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1212bE.f4143a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1212bE);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1212bE);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1212bE.f4143a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1212bE);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1212bE);
            }
        }
    }
}

package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class oa0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f3426a;

    /* JADX INFO: renamed from: b */
    public static Field f3427b;

    /* JADX INFO: renamed from: c */
    public static boolean f3428c;

    /* JADX INFO: renamed from: d */
    public static final int[] f3429d;

    /* JADX INFO: renamed from: e */
    public static final t90 f3430e;

    /* JADX INFO: renamed from: f */
    public static final v90 f3431f;

    static {
        new AtomicInteger(1);
        f3426a = null;
        f3428c = false;
        f3429d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f3430e = new t90();
        f3431f = new v90();
    }

    /* JADX INFO: renamed from: a */
    public static bb0 m2001a(View view) {
        if (f3426a == null) {
            f3426a = new WeakHashMap();
        }
        bb0 bb0Var = (bb0) f3426a.get(view);
        if (bb0Var != null) {
            return bb0Var;
        }
        bb0 bb0Var2 = new bb0(view);
        f3426a.put(view, bb0Var2);
        return bb0Var2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2002b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = na0.f3255d;
        na0 na0Var = (na0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (na0Var == null) {
            na0Var = new na0();
            na0Var.f3256a = null;
            na0Var.f3257b = null;
            na0Var.f3258c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, na0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = na0Var.f3256a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = na0.f3255d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (na0Var.f3256a == null) {
                            na0Var.f3256a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = na0.f3255d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                na0Var.f3256a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    na0Var.f3256a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM1937a = na0Var.m1937a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM1937a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (na0Var.f3257b == null) {
                    na0Var.f3257b = new SparseArray();
                }
                na0Var.f3257b.put(keyCode, new WeakReference(viewM1937a));
            }
        }
        return viewM1937a != null;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m2003c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return ia0.m1491a(view);
        }
        if (f3428c) {
            return null;
        }
        if (f3427b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3427b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3428c = true;
                return null;
            }
        }
        try {
            Object obj = f3427b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3428c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m2004d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = ha0.m1364b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m2005e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static String[] m2006f(C0842w3 c0842w3) {
        return Build.VERSION.SDK_INT >= 31 ? ka0.m1672a(c0842w3) : (String[]) c0842w3.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: g */
    public static void m2007g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m2004d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (aa0.m38a(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                aa0.m44g(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(m2004d(view));
                    if (x90.m2655c(view) == 0) {
                        x90.m2671s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (x90.m2655c((View) parent) == 4) {
                            x90.m2671s(view, 2);
                            break;
                        }
                        parent = parent.getParent();
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        aa0.m42e(view.getParent(), view, view, i);
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
            aa0.m44g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m2004d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C0481md m2008h(View view, C0481md c0481md) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0481md + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ka0.m1673b(view, c0481md);
        }
        InterfaceC0353ix interfaceC0353ix = (InterfaceC0353ix) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0390jx interfaceC0390jx = f3430e;
        if (interfaceC0353ix == null) {
            if (view instanceof InterfaceC0390jx) {
                interfaceC0390jx = (InterfaceC0390jx) view;
            }
            return interfaceC0390jx.mo1639a(c0481md);
        }
        C0481md c0481mdM2544a = ((v60) interfaceC0353ix).m2544a(view, c0481md);
        if (c0481mdM2544a == null) {
            return null;
        }
        if (view instanceof InterfaceC0390jx) {
            interfaceC0390jx = (InterfaceC0390jx) view;
        }
        return interfaceC0390jx.mo1639a(c0481mdM2544a);
    }

    /* JADX INFO: renamed from: i */
    public static void m2009i(View view, int i) {
        ArrayList arrayListM2005e = m2005e(view);
        for (int i2 = 0; i2 < arrayListM2005e.size(); i2++) {
            if (((C0281h0) arrayListM2005e.get(i2)).m1348a() == i) {
                arrayListM2005e.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2010j(View view, C0281h0 c0281h0, InterfaceC0801v0 interfaceC0801v0) {
        C0281h0 c0281h02 = new C0281h0(null, c0281h0.f2077b, null, interfaceC0801v0, c0281h0.f2078c);
        View.AccessibilityDelegate accessibilityDelegateM2003c = m2003c(view);
        C0875x c0875x = accessibilityDelegateM2003c == null ? null : accessibilityDelegateM2003c instanceof C0800v ? ((C0800v) accessibilityDelegateM2003c).f4870a : new C0875x(accessibilityDelegateM2003c);
        if (c0875x == null) {
            c0875x = new C0875x();
        }
        m2012l(view, c0875x);
        m2009i(view, c0281h02.m1348a());
        m2005e(view).add(c0281h02);
        m2007g(view, 0);
    }

    /* JADX INFO: renamed from: k */
    public static void m2011k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            ia0.m1493c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2012l(View view, C0875x c0875x) {
        if (c0875x == null && (m2003c(view) instanceof C0800v)) {
            c0875x = new C0875x();
        }
        view.setAccessibilityDelegate(c0875x == null ? null : c0875x.f5148b);
    }

    /* JADX INFO: renamed from: m */
    public static void m2013m(View view, CharSequence charSequence) {
        new u90(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m2796d(view, charSequence);
        v90 v90Var = f3431f;
        if (charSequence == null) {
            v90Var.f4921a.remove(view);
            view.removeOnAttachStateChangeListener(v90Var);
            x90.m2667o(view.getViewTreeObserver(), v90Var);
        } else {
            v90Var.f4921a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(v90Var);
            if (aa0.m39b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(v90Var);
            }
        }
    }
}

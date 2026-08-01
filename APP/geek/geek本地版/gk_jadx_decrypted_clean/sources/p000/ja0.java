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
public abstract class ja0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f2600a;

    /* JADX INFO: renamed from: b */
    public static Field f2601b;

    /* JADX INFO: renamed from: c */
    public static boolean f2602c;

    /* JADX INFO: renamed from: d */
    public static final int[] f2603d;

    /* JADX INFO: renamed from: e */
    public static final o90 f2604e;

    /* JADX INFO: renamed from: f */
    public static final q90 f2605f;

    static {
        new AtomicInteger(1);
        f2600a = null;
        f2602c = false;
        f2603d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f2604e = new o90();
        f2605f = new q90();
    }

    /* JADX INFO: renamed from: a */
    public static wa0 m1564a(View view) {
        if (f2600a == null) {
            f2600a = new WeakHashMap();
        }
        wa0 wa0Var = (wa0) f2600a.get(view);
        if (wa0Var != null) {
            return wa0Var;
        }
        wa0 wa0Var2 = new wa0(view);
        f2600a.put(view, wa0Var2);
        return wa0Var2;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1565b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = ia0.f2401d;
        ia0 ia0Var = (ia0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (ia0Var == null) {
            ia0Var = new ia0();
            ia0Var.f2402a = null;
            ia0Var.f2403b = null;
            ia0Var.f2404c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, ia0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = ia0Var.f2402a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = ia0.f2401d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (ia0Var.f2402a == null) {
                            ia0Var.f2402a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = ia0.f2401d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                ia0Var.f2402a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    ia0Var.f2402a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM1424a = ia0Var.m1424a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM1424a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (ia0Var.f2403b == null) {
                    ia0Var.f2403b = new SparseArray();
                }
                ia0Var.f2403b.put(keyCode, new WeakReference(viewM1424a));
            }
        }
        return viewM1424a != null;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m1566c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return da0.m929a(view);
        }
        if (f2602c) {
            return null;
        }
        if (f2601b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2601b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2602c = true;
                return null;
            }
        }
        try {
            Object obj = f2601b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2602c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m1567d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = ca0.m649b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m1568e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public static String[] m1569f(C0842w3 c0842w3) {
        return Build.VERSION.SDK_INT >= 31 ? fa0.m1152a(c0842w3) : (String[]) c0842w3.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: g */
    public static void m1570g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m1567d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (v90.m2494a(view) != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                v90.m2500g(accessibilityEventObtain, i);
                if (z) {
                    accessibilityEventObtain.getText().add(m1567d(view));
                    if (s90.m2311c(view) == 0) {
                        s90.m2327s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        if (s90.m2311c((View) parent) == 4) {
                            s90.m2327s(view, 2);
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
                        v90.m2498e(view.getParent(), view, view, i);
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
            v90.m2500g(accessibilityEventObtain2, i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m1567d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C0100cd m1571h(View view, C0100cd c0100cd) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0100cd + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return fa0.m1153b(view, c0100cd);
        }
        InterfaceC0047ax interfaceC0047ax = (InterfaceC0047ax) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0084bx interfaceC0084bx = f2604e;
        if (interfaceC0047ax == null) {
            if (view instanceof InterfaceC0084bx) {
                interfaceC0084bx = (InterfaceC0084bx) view;
            }
            return interfaceC0084bx.mo584a(c0100cd);
        }
        C0100cd c0100cdM2045a = ((p60) interfaceC0047ax).m2045a(view, c0100cd);
        if (c0100cdM2045a == null) {
            return null;
        }
        if (view instanceof InterfaceC0084bx) {
            interfaceC0084bx = (InterfaceC0084bx) view;
        }
        return interfaceC0084bx.mo584a(c0100cdM2045a);
    }

    /* JADX INFO: renamed from: i */
    public static void m1572i(View view, int i) {
        ArrayList arrayListM1568e = m1568e(view);
        for (int i2 = 0; i2 < arrayListM1568e.size(); i2++) {
            if (((C0281h0) arrayListM1568e.get(i2)).m1335a() == i) {
                arrayListM1568e.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m1573j(View view, C0281h0 c0281h0, InterfaceC0802v0 interfaceC0802v0) {
        C0281h0 c0281h02 = new C0281h0(null, c0281h0.f2189b, null, interfaceC0802v0, c0281h0.f2190c);
        View.AccessibilityDelegate accessibilityDelegateM1566c = m1566c(view);
        C0875x c0875x = accessibilityDelegateM1566c == null ? null : accessibilityDelegateM1566c instanceof C0801v ? ((C0801v) accessibilityDelegateM1566c).f4784a : new C0875x(accessibilityDelegateM1566c);
        if (c0875x == null) {
            c0875x = new C0875x();
        }
        m1575l(view, c0875x);
        m1572i(view, c0281h02.m1335a());
        m1568e(view).add(c0281h02);
        m1570g(view, 0);
    }

    /* JADX INFO: renamed from: k */
    public static void m1574k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            da0.m931c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m1575l(View view, C0875x c0875x) {
        if (c0875x == null && (m1566c(view) instanceof C0801v)) {
            c0875x = new C0875x();
        }
        view.setAccessibilityDelegate(c0875x == null ? null : c0875x.f5077b);
    }

    /* JADX INFO: renamed from: m */
    public static void m1576m(View view, CharSequence charSequence) {
        new p90(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m2360d(view, charSequence);
        q90 q90Var = f2605f;
        if (charSequence == null) {
            q90Var.f4047a.remove(view);
            view.removeOnAttachStateChangeListener(q90Var);
            s90.m2323o(view.getViewTreeObserver(), q90Var);
        } else {
            q90Var.f4047a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(q90Var);
            if (v90.m2495b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(q90Var);
            }
        }
    }
}

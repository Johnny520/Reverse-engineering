package p099y;

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
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p006D.C0092u;
import p069i.C0721v;
import p090t0.AbstractC1008c;

/* JADX INFO: renamed from: y.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1048L {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f3662a = null;

    /* JADX INFO: renamed from: b */
    public static Field f3663b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f3664c = false;

    /* JADX INFO: renamed from: d */
    public static final C1091w f3665d = new C1091w();

    /* JADX INFO: renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1093y f3666e = new ViewTreeObserverOnGlobalLayoutListenerC1093y();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1054S m2282a(View view) {
        if (f3662a == null) {
            f3662a = new WeakHashMap();
        }
        C1054S c1054s = (C1054S) f3662a.get(view);
        if (c1054s != null) {
            return c1054s;
        }
        C1054S c1054s2 = new C1054S(view);
        f3662a.put(view, c1054s2);
        return c1054s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2283b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1047K.f3658d;
        C1047K c1047k = (C1047K) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c1047k == null) {
            c1047k = new C1047K();
            c1047k.f3659a = null;
            c1047k.f3660b = null;
            c1047k.f3661c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1047k);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c1047k.f3659a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1047K.f3658d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c1047k.f3659a == null) {
                            c1047k.f3659a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C1047K.f3658d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c1047k.f3659a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c1047k.f3659a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM2281a = c1047k.m2281a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM2281a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1047k.f3660b == null) {
                    c1047k.f3660b = new SparseArray();
                }
                c1047k.f3660b.put(keyCode, new WeakReference(viewM2281a));
            }
        }
        return viewM2281a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m2284c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1042F.m2266a(view);
        }
        if (f3664c) {
            return null;
        }
        if (f3663b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3663b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3664c = true;
                return null;
            }
        }
        try {
            Object obj = f3663b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f3664c = true;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String[] m2285d(C0721v c0721v) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1044H.m2277a(c0721v) : (String[]) c0721v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2286e(View view, int i2) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i3 = Build.VERSION.SDK_INT;
            Object objM2257b = null;
            if (i3 >= 28) {
                tag = AbstractC1041E.m2257b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z2 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i3 >= 28) {
                        objM2257b = AbstractC1041E.m2257b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objM2257b = tag2;
                        }
                    }
                    text.add((CharSequence) objM2257b);
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
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i3 >= 28) {
                objM2257b = AbstractC1041E.m2257b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objM2257b = tag3;
                }
            }
            text2.add((CharSequence) objM2257b);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C1074g m2287f(View view, C1074g c1074g) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1074g + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1044H.m2278b(view, c1074g);
        }
        InterfaceC1085q interfaceC1085q = (InterfaceC1085q) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1086r interfaceC1086r = f3665d;
        if (interfaceC1085q == null) {
            if (view instanceof InterfaceC1086r) {
                interfaceC1086r = (InterfaceC1086r) view;
            }
            return interfaceC1086r.mo1371a(c1074g);
        }
        C1074g c1074gM241a = ((C0092u) interfaceC1085q).m241a(view, c1074g);
        if (c1074gM241a == null) {
            return null;
        }
        if (view instanceof InterfaceC1086r) {
            interfaceC1086r = (InterfaceC1086r) view;
        }
        return interfaceC1086r.mo1371a(c1074gM241a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2288g(AbstractC1008c abstractC1008c, AbstractC1008c abstractC1008c2) {
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1041E.m2260e(abstractC1008c, abstractC1008c2);
            return;
        }
        ArrayList arrayList = (ArrayList) abstractC1008c.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(abstractC1008c2);
        if (arrayList.size() != 0) {
            return;
        }
        synchronized (C1047K.f3658d) {
            int i2 = 0;
            while (true) {
                try {
                    ArrayList arrayList2 = C1047K.f3658d;
                    if (i2 >= arrayList2.size()) {
                        return;
                    }
                    if (((WeakReference) arrayList2.get(i2)).get() == abstractC1008c) {
                        arrayList2.remove(i2);
                        return;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2289h(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1042F.m2269d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2290i(View view, C1064b c1064b) {
        if (c1064b == null && (m2284c(view) instanceof C1062a)) {
            c1064b = new C1064b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1064b == null ? null : c1064b.f3693b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2291j(View view, CharSequence charSequence) {
        new C1092x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m306d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1093y viewTreeObserverOnGlobalLayoutListenerC1093y = f3666e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1093y.f3732b.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1093y);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1093y);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1093y.f3732b.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1093y);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1093y);
            }
        }
    }
}

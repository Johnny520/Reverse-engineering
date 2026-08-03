package p006D;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import org.luckypray.dexkit.C1031R;
import p008E.C0151e;
import p008E.InterfaceC0166t;
import p017J.C0230s;

/* JADX INFO: renamed from: D.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080Q {

    /* JADX INFO: renamed from: a */
    public static Field f219a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f220b = false;

    /* JADX INFO: renamed from: c */
    public static final int[] f221c = {C1031R.id.accessibility_custom_action_0, C1031R.id.accessibility_custom_action_1, C1031R.id.accessibility_custom_action_2, C1031R.id.accessibility_custom_action_3, C1031R.id.accessibility_custom_action_4, C1031R.id.accessibility_custom_action_5, C1031R.id.accessibility_custom_action_6, C1031R.id.accessibility_custom_action_7, C1031R.id.accessibility_custom_action_8, C1031R.id.accessibility_custom_action_9, C1031R.id.accessibility_custom_action_10, C1031R.id.accessibility_custom_action_11, C1031R.id.accessibility_custom_action_12, C1031R.id.accessibility_custom_action_13, C1031R.id.accessibility_custom_action_14, C1031R.id.accessibility_custom_action_15, C1031R.id.accessibility_custom_action_16, C1031R.id.accessibility_custom_action_17, C1031R.id.accessibility_custom_action_18, C1031R.id.accessibility_custom_action_19, C1031R.id.accessibility_custom_action_20, C1031R.id.accessibility_custom_action_21, C1031R.id.accessibility_custom_action_22, C1031R.id.accessibility_custom_action_23, C1031R.id.accessibility_custom_action_24, C1031R.id.accessibility_custom_action_25, C1031R.id.accessibility_custom_action_26, C1031R.id.accessibility_custom_action_27, C1031R.id.accessibility_custom_action_28, C1031R.id.accessibility_custom_action_29, C1031R.id.accessibility_custom_action_30, C1031R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: d */
    public static final C0064A f222d = new C0064A();

    /* JADX INFO: renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0066C f223e = new ViewTreeObserverOnGlobalLayoutListenerC0066C();

    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m282a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0075L.m267a(view);
        }
        if (f220b) {
            return null;
        }
        if (f219a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f219a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f220b = true;
                return null;
            }
        }
        try {
            Object obj = f219a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f220b = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m283b(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC0074K.m258b(view);
        } else {
            tag = view.getTag(C1031R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m284c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C1031R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C1031R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static String[] m285d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0077N.m279a(view) : (String[]) view.getTag(C1031R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: e */
    public static void m286e(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m283b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(m283b(view));
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
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m283b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0103h m287f(View view, C0103h c0103h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0103h);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0077N.m280b(view, c0103h);
        }
        InterfaceC0123r interfaceC0123r = (InterfaceC0123r) view.getTag(C1031R.id.tag_on_receive_content_listener);
        InterfaceC0125s interfaceC0125s = f222d;
        if (interfaceC0123r == null) {
            if (view instanceof InterfaceC0125s) {
                interfaceC0125s = (InterfaceC0125s) view;
            }
            return interfaceC0125s.mo201a(c0103h);
        }
        C0103h c0103hM630a = ((C0230s) interfaceC0123r).m630a(view, c0103h);
        if (c0103hM630a == null) {
            return null;
        }
        if (view instanceof InterfaceC0125s) {
            interfaceC0125s = (InterfaceC0125s) view;
        }
        return interfaceC0125s.mo201a(c0103hM630a);
    }

    /* JADX INFO: renamed from: g */
    public static void m288g(View view, int i2) {
        ArrayList arrayListM284c = m284c(view);
        for (int i3 = 0; i3 < arrayListM284c.size(); i3++) {
            if (((C0151e) arrayListM284c.get(i3)).m477a() == i2) {
                arrayListM284c.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m289h(View view, C0151e c0151e, InterfaceC0166t interfaceC0166t) {
        C0151e c0151e2 = new C0151e(null, c0151e.f353b, null, interfaceC0166t, c0151e.f354c);
        View.AccessibilityDelegate accessibilityDelegateM282a = m282a(view);
        C0091b c0091b = accessibilityDelegateM282a == null ? null : accessibilityDelegateM282a instanceof C0089a ? ((C0089a) accessibilityDelegateM282a).f237a : new C0091b(accessibilityDelegateM282a);
        if (c0091b == null) {
            c0091b = new C0091b();
        }
        m291j(view, c0091b);
        m288g(view, c0151e2.m477a());
        m284c(view).add(c0151e2);
        m286e(view, 0);
    }

    /* JADX INFO: renamed from: i */
    public static void m290i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0075L.m270d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m291j(View view, C0091b c0091b) {
        if (c0091b == null && (m282a(view) instanceof C0089a)) {
            c0091b = new C0091b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0091b == null ? null : c0091b.f244b);
    }

    /* JADX INFO: renamed from: k */
    public static void m292k(View view, CharSequence charSequence) {
        new C0065B(C1031R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).m207e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0066C viewTreeObserverOnGlobalLayoutListenerC0066C = f223e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0066C.f210a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0066C);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0066C);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0066C.f210a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0066C);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0066C);
            }
        }
    }
}

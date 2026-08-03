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
import java.util.WeakHashMap;
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
    public static final int[] f221c = null;

    /* JADX INFO: renamed from: d */
    public static final C0064A f222d = null;

    /* JADX INFO: renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0066C f223e = null;

    static {
        f221c = new int[]{C1031R.id.accessibility_custom_action_0, C1031R.id.accessibility_custom_action_1, C1031R.id.accessibility_custom_action_2, C1031R.id.accessibility_custom_action_3, C1031R.id.accessibility_custom_action_4, C1031R.id.accessibility_custom_action_5, C1031R.id.accessibility_custom_action_6, C1031R.id.accessibility_custom_action_7, C1031R.id.accessibility_custom_action_8, C1031R.id.accessibility_custom_action_9, C1031R.id.accessibility_custom_action_10, C1031R.id.accessibility_custom_action_11, C1031R.id.accessibility_custom_action_12, C1031R.id.accessibility_custom_action_13, C1031R.id.accessibility_custom_action_14, C1031R.id.accessibility_custom_action_15, C1031R.id.accessibility_custom_action_16, C1031R.id.accessibility_custom_action_17, C1031R.id.accessibility_custom_action_18, C1031R.id.accessibility_custom_action_19, C1031R.id.accessibility_custom_action_20, C1031R.id.accessibility_custom_action_21, C1031R.id.accessibility_custom_action_22, C1031R.id.accessibility_custom_action_23, C1031R.id.accessibility_custom_action_24, C1031R.id.accessibility_custom_action_25, C1031R.id.accessibility_custom_action_26, C1031R.id.accessibility_custom_action_27, C1031R.id.accessibility_custom_action_28, C1031R.id.accessibility_custom_action_29, C1031R.id.accessibility_custom_action_30, C1031R.id.accessibility_custom_action_31};
        f222d = new C0064A();
        f223e = new ViewTreeObserverOnGlobalLayoutListenerC0066C();
    }

    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m282a(View r4) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return AbstractC0075L.m267a(r4);
    L7:
        if (f220b == false) goto L10;
        return null;
    L10:
        if (f219a != null) goto L22;
        Field r02 = View.class.getDeclaredField("mAccessibilityDelegate");     // Catch: Throwable -> L13
        f219a = r02;     // Catch: Throwable -> L13
        r02.setAccessible(true);     // Catch: Throwable -> L13
    L13:
        f220b = true;
        return null;
    L22:
        Object r42 = f219a.get(r4);     // Catch: Throwable -> L18
        if ((r42 instanceof View.AccessibilityDelegate) == false) goto L25;
        return (View.AccessibilityDelegate) r42;
    L25:
        return null;
    L18:
        f220b = true;
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m283b(View r2) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Object r22 = AbstractC0074K.m258b(r2);
    L10:
        return (CharSequence) r22;
    L5:
        r22 = r2.getTag(C1031R.id.tag_accessibility_pane_title);
        if (CharSequence.class.isInstance(r22) == true) goto L10;
        r22 = null;
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m284c(View r2) {
        ArrayList r1 = (ArrayList) r2.getTag(C1031R.id.tag_accessibility_actions);
        if (r1 != null) goto L6;
        ArrayList r12 = new ArrayList();
        r2.setTag(C1031R.id.tag_accessibility_actions, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: d */
    public static String[] m285d(View r2) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return AbstractC0077N.m279a(r2);
    L7:
        return (String[]) r2.getTag(C1031R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: e */
    public static void m286e(View r5, int r6) {
        AccessibilityManager r02 = (AccessibilityManager) r5.getContext().getSystemService("accessibility");
        if (r02.isEnabled() == true) goto L6;
        return;
    L6:
        if (m283b(r5) != null) goto L8;
    L12:
        boolean r1 = false;
    L13:
        int r4 = 32;
        if (r5.getAccessibilityLiveRegion() != 0) goto L25;
        if (r1 == true) goto L25;
        if (r6 != 32) goto L20;
        AccessibilityEvent r12 = AccessibilityEvent.obtain();
        r5.onInitializeAccessibilityEvent(r12);
        r12.setEventType(32);
        r12.setContentChangeTypes(r6);
        r12.setSource(r5);
        r5.onPopulateAccessibilityEvent(r12);
        r12.getText().add(m283b(r5));
        r02.sendAccessibilityEvent(r12);
        return;
    L20:
        if (r5.getParent() != null) goto L36;
        return;
    L36:
        r5.getParent().notifySubtreeAccessibilityStateChanged(r5, r5, r6);     // Catch: AbstractMethodError -> L24
        return;
    L24:
        r5.getParent().getClass();
        return;
    L25:
        AccessibilityEvent r03 = AccessibilityEvent.obtain();
        if (r1 == true) goto L29;
        r4 = 2048;
    L29:
        r03.setEventType(r4);
        r03.setContentChangeTypes(r6);
        if (r1 == false) goto L34;
        r03.getText().add(m283b(r5));
        if (r5.getImportantForAccessibility() != 0) goto L34;
        r5.setImportantForAccessibility(1);
    L34:
        r5.sendAccessibilityEventUnchecked(r03);
        return;
    L8:
        if (r5.isShown() == false) goto L12;
        if (r5.getWindowVisibility() != 0) goto L12;
        r1 = true;
        goto L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0103h m287f(View r2, C0103h r3) {
        if (Log.isLoggable("ViewCompat", 3) == false) goto L6;
        Objects.toString(r3);
        r2.getClass();
        r2.getId();
    L6:
        if (Build.VERSION.SDK_INT >= 31) goto L8;
        InterfaceC0123r r02 = (InterfaceC0123r) r2.getTag(C1031R.id.tag_on_receive_content_listener);
        InterfaceC0125s r1 = f222d;
        if (r02 == null) goto L20;
        C0103h r32 = ((C0230s) r02).m630a(r2, r3);
        if (r32 != null) goto L15;
        return null;
    L15:
        if ((r2 instanceof InterfaceC0125s) == false) goto L18;
        r1 = (InterfaceC0125s) r2;
    L18:
        return r1.mo201a(r32);
    L20:
        if ((r2 instanceof InterfaceC0125s) == false) goto L23;
        r1 = (InterfaceC0125s) r2;
    L23:
        return r1.mo201a(r3);
    L8:
        return AbstractC0077N.m280b(r2, r3);
    }

    /* JADX INFO: renamed from: g */
    public static void m288g(View r2, int r3) {
        ArrayList r22 = m284c(r2);
        int r02 = 0;
    L4:
        if (r02 >= r22.size()) goto L12;
        if (((C0151e) r22.get(r02)).m477a() == r3) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        r22.remove(r02);
        return;
    }

    /* JADX INFO: renamed from: h */
    public static void m289h(View r7, C0151e r8, InterfaceC0166t r9) {
        C0151e r6 = new C0151e(null, r8.f353b, null, r9, r8.f354c);
        View.AccessibilityDelegate r82 = m282a(r7);
        if (r82 != null) goto L6;
        C0091b r83 = null;
    L9:
        if (r83 != null) goto L11;
        r83 = new C0091b();
    L11:
        m291j(r7, r83);
        m288g(r7, r6.m477a());
        m284c(r7).add(r6);
        m286e(r7, 0);
        return;
    L6:
        if ((r82 instanceof C0089a) == false) goto L8;
        r83 = ((C0089a) r82).f237a;
        goto L9
    L8:
        r83 = new C0091b(r82);
        goto L9
    }

    /* JADX INFO: renamed from: i */
    public static void m290i(View r9, Context r10, int[] r11, AttributeSet r12, TypedArray r13, int r14) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        AbstractC0075L.m270d(r9, r10, r11, r12, r13, r14, 0);
        return;
    }

    /* JADX INFO: renamed from: j */
    public static void m291j(View r1, C0091b r2) {
        if (r2 != null) goto L7;
        if ((m282a(r1) instanceof C0089a) == false) goto L7;
        r2 = new C0091b();
    L7:
        if (r1.getImportantForAccessibility() != 0) goto L9;
        r1.setImportantForAccessibility(1);
    L9:
        if (r2 != null) goto L11;
        C0089a r22 = null;
    L12:
        r1.setAccessibilityDelegate(r22);
        return;
    L11:
        r22 = r2.f244b;
        goto L12
    }

    /* JADX INFO: renamed from: k */
    public static void m292k(View r7, CharSequence r8) {
        new C0065B(C1031R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).m207e(r7, r8);
        ViewTreeObserverOnGlobalLayoutListenerC0066C r02 = f223e;
        if (r8 == null) goto L13;
        WeakHashMap r82 = r02.f210a;
        if (r7.isShown() == true) goto L7;
    L9:
        boolean r1 = false;
    L10:
        r82.put(r7, Boolean.valueOf(r1));
        r7.addOnAttachStateChangeListener(r02);
        if (r7.isAttachedToWindow() == false) goto L15;
        r7.getViewTreeObserver().addOnGlobalLayoutListener(r02);
        return;
    L15:
        return;
    L7:
        if (r7.getWindowVisibility() != 0) goto L9;
        r1 = true;
        goto L10
    L13:
        r02.f210a.remove(r7);
        r7.removeOnAttachStateChangeListener(r02);
        r7.getViewTreeObserver().removeOnGlobalLayoutListener(r02);
    }
}

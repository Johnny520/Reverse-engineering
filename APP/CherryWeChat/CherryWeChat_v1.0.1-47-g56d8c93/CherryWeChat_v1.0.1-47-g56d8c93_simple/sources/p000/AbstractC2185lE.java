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
    public static final int[] f7620d = null;

    /* JADX INFO: renamed from: e */
    public static final C1088ZD f7621e = null;

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1212bE f7622f = null;

    static {
        f7620d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f7621e = new C1088ZD();
        f7622f = new ViewTreeObserverOnGlobalLayoutListenerC1212bE();
    }

    /* JADX INFO: renamed from: a */
    public static C0273GE m4388a(View r2) {
        if (f7617a != null) goto L5;
        f7617a = new WeakHashMap();
    L5:
        C0273GE r0 = (C0273GE) f7617a.get(r2);
        if (r0 != null) goto L9;
        C0273GE r02 = new C0273GE(r2);
        f7617a.put(r2, r02);
        return r02;
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: b */
    public static C0489LF m4389b(View r3, C0489LF r4) {
        int r0 = Build.VERSION.SDK_INT;
        WindowInsets r1 = r4.m945g();
        if (r1 != null) goto L5;
    L12:
        return r4;
    L5:
        if (r0 < 30) goto L7;
        WindowInsets r02 = AbstractC2093jE.m4277a(r3, r1);
    L9:
        if (r02.equals(r1) == true) goto L12;
        return C0489LF.m939h(r3, r02);
    L7:
        r02 = AbstractC1255cE.m2368a(r3, r1);
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m4390c(View r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return AbstractC1536iE.m2913a(r3);
    L7:
        if (f7619c == false) goto L10;
        return null;
    L10:
        if (f7618b == null) goto L23;
    L21:
        Object r32 = f7618b.get(r3);     // Catch: Throwable -> L18
        if ((r32 instanceof View.AccessibilityDelegate) == false) goto L26;
        return (View.AccessibilityDelegate) r32;
    L26:
        return null;
    L18:
        f7619c = true;
        return null;
    L23:
        Field r0 = View.class.getDeclaredField("mAccessibilityDelegate");     // Catch: Throwable -> L13
        f7618b = r0;     // Catch: Throwable -> L13
        r0.setAccessible(true);     // Catch: Throwable -> L13
    L13:
        f7619c = true;
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m4391d(View r2) {
        ArrayList r1 = (ArrayList) r2.getTag(R.id.tag_accessibility_actions);
        if (r1 != null) goto L6;
        ArrayList r12 = new ArrayList();
        r2.setTag(R.id.tag_accessibility_actions, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: e */
    public static String[] m4392e(C0348I3 r2) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return AbstractC2137kE.m4319a(r2);
    L7:
        return (String[]) r2.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: f */
    public static void m4393f(View r5, int r6) {
        AccessibilityManager r0 = (AccessibilityManager) r5.getContext().getSystemService("accessibility");
        if (r0.isEnabled() == true) goto L6;
        return;
    L6:
        if (AbstractC1492hE.m2850a(r5) != null) goto L8;
    L12:
        boolean r1 = false;
    L13:
        int r4 = 32;
        if (r5.getAccessibilityLiveRegion() != 0) goto L27;
        if (r1 == true) goto L27;
        if (r6 != 32) goto L21;
        AccessibilityEvent r12 = AccessibilityEvent.obtain();
        r5.onInitializeAccessibilityEvent(r12);
        r12.setEventType(32);
        r12.setContentChangeTypes(r6);
        r12.setSource(r5);
        r5.onPopulateAccessibilityEvent(r12);
        r12.getText().add(AbstractC1492hE.m2850a(r5));
        r0.sendAccessibilityEvent(r12);
        return;
    L21:
        if (r5.getParent() != null) goto L38;
        return;
    L38:
        r5.getParent().notifySubtreeAccessibilityStateChanged(r5, r5, r6);     // Catch: AbstractMethodError -> L25
        return;
    L25:
        r5.getParent().getClass();
        return;
    L27:
        AccessibilityEvent r02 = AccessibilityEvent.obtain();
        if (r1 == true) goto L31;
        r4 = 2048;
    L31:
        r02.setEventType(r4);
        r02.setContentChangeTypes(r6);
        if (r1 == false) goto L36;
        r02.getText().add(AbstractC1492hE.m2850a(r5));
        if (r5.getImportantForAccessibility() != 0) goto L36;
        r5.setImportantForAccessibility(1);
    L36:
        r5.sendAccessibilityEventUnchecked(r02);
        return;
    L8:
        if (r5.isShown() == false) goto L12;
        if (r5.getWindowVisibility() != 0) goto L12;
        r1 = true;
        goto L13
    }

    /* JADX INFO: renamed from: g */
    public static C0489LF m4394g(View r2, C0489LF r3) {
        WindowInsets r0 = r3.m945g();
        if (r0 == null) goto L8;
        WindowInsets r1 = AbstractC1255cE.m2369b(r2, r0);
        if (r1.equals(r0) == true) goto L8;
        return C0489LF.m939h(r2, r1);
    L8:
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static C2798zb m4395h(View r2, C2798zb r3) {
        if (Log.isLoggable("ViewCompat", 3) == false) goto L6;
        Objects.toString(r3);
        r2.getClass();
        r2.getId();
    L6:
        if (Build.VERSION.SDK_INT >= 31) goto L8;
        C2791zA r0 = (C2791zA) r2.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2472rt r1 = f7621e;
        if (r0 == null) goto L21;
        C2798zb r32 = C2791zA.m5360a(r2, r3);
        if (r32 != null) goto L16;
        return null;
    L16:
        if ((r2 instanceof InterfaceC2472rt) == false) goto L19;
        r1 = (InterfaceC2472rt) r2;
    L19:
        return r1.mo751a(r32);
    L21:
        if ((r2 instanceof InterfaceC2472rt) == false) goto L24;
        r1 = (InterfaceC2472rt) r2;
    L24:
        return r1.mo751a(r3);
    L8:
        return AbstractC2137kE.m4320b(r2, r3);
    }

    /* JADX INFO: renamed from: i */
    public static void m4396i(View r2, int r3) {
        ArrayList r22 = m4391d(r2);
        int r0 = 0;
    L4:
        if (r0 >= r22.size()) goto L10;
        if (((C0902V) r22.get(r0)).m1752a() == r3) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        r22.remove(r0);
        return;
    }

    /* JADX INFO: renamed from: j */
    public static void m4397j(View r7, C0902V r8, InterfaceC2123k0 r9) {
        if (r9 != null) goto L6;
        m4396i(r7, r8.m1752a());
        m4393f(r7, 0);
        return;
    L6:
        C0902V r1 = new C0902V(null, r8.f2811b, null, r9, r8.f2812c);
        View.AccessibilityDelegate r82 = m4390c(r7);
        if (r82 != null) goto L10;
        C0645P r83 = null;
    L13:
        if (r83 != null) goto L15;
        r83 = new C0645P();
    L15:
        m4399l(r7, r83);
        m4396i(r7, r1.m1752a());
        m4391d(r7).add(r1);
        m4393f(r7, 0);
        return;
    L10:
        if ((r82 instanceof C0602O) == false) goto L12;
        r83 = ((C0602O) r82).f1942a;
        goto L13
    L12:
        r83 = new C0645P(r82);
        goto L13
    }

    /* JADX INFO: renamed from: k */
    public static void m4398k(View r9, Context r10, int[] r11, AttributeSet r12, TypedArray r13, int r14) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        AbstractC1536iE.m2914b(r9, r10, r11, r12, r13, r14, 0);
        return;
    }

    /* JADX INFO: renamed from: l */
    public static void m4399l(View r1, C0645P r2) {
        if (r2 != null) goto L7;
        if ((m4390c(r1) instanceof C0602O) == false) goto L7;
        r2 = new C0645P();
    L7:
        if (r1.getImportantForAccessibility() != 0) goto L9;
        r1.setImportantForAccessibility(1);
    L9:
        if (r2 != null) goto L11;
        C0602O r22 = null;
    L12:
        r1.setAccessibilityDelegate(r22);
        return;
    L11:
        r22 = r2.f2083b;
        goto L12
    }

    /* JADX INFO: renamed from: m */
    public static void m4400m(View r6, CharSequence r7) {
        new C1132aE(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m4627f(r6, r7);
        ViewTreeObserverOnGlobalLayoutListenerC1212bE r0 = f7622f;
        if (r7 == null) goto L14;
        WeakHashMap r72 = r0.f4143a;
        if (r6.isShown() == true) goto L7;
    L9:
        boolean r1 = false;
    L10:
        r72.put(r6, Boolean.valueOf(r1));
        r6.addOnAttachStateChangeListener(r0);
        if (r6.isAttachedToWindow() == false) goto L16;
        r6.getViewTreeObserver().addOnGlobalLayoutListener(r0);
        return;
    L16:
        return;
    L7:
        if (r6.getWindowVisibility() != 0) goto L9;
        r1 = true;
        goto L10
    L14:
        r0.f4143a.remove(r6);
        r6.removeOnAttachStateChangeListener(r0);
        r6.getViewTreeObserver().removeOnGlobalLayoutListener(r0);
    }
}

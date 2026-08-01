package defpackage;

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
    public static WeakHashMap a;
    public static Field b;
    public static boolean c;
    public static final int[] d = null;
    public static final o90 e = null;
    public static final q90 f = null;

    static {
        new AtomicInteger(1);
        a = null;
        c = false;
        d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        e = new o90();
        f = new q90();
    }

    public static wa0 a(View r2) {
        if (a != null) goto L5;
        a = new WeakHashMap();
    L5:
        wa0 r0 = (wa0) a.get(r2);
        if (r0 != null) goto L9;
        wa0 r02 = new wa0(r2);
        a.put(r2, r02);
        return r02;
    L9:
        return r0;
    }

    public static boolean b(View r8, KeyEvent r9) {
        if (Build.VERSION.SDK_INT >= 28) goto L55;
        ArrayList r0 = ia0.d;
        ia0 r1 = (ia0) r8.getTag(R.id.tag_unhandled_key_event_manager);
        if (r1 != null) goto L9;
        r1 = new ia0();
        r1.a = null;
        r1.b = null;
        r1.c = null;
        r8.setTag(R.id.tag_unhandled_key_event_manager, r1);
    L9:
        if (r9.getAction() != 0) goto L36;
        WeakHashMap r02 = r1.a;
        if (r02 == null) goto L13;
        r02.clear();
    L13:
        ArrayList r03 = ia0.d;
        if (r03.isEmpty() == true) goto L36;
        monitor-enter(r03);
    L20:
        th = move-exception;
        throw th;
    L18:
        if (r1.a != null) goto L22;
        r1.a = new WeakHashMap();     // Catch: Throwable -> L20
    L22:
        int r3 = r03.size() - 1;     // Catch: Throwable -> L20
    L23:
        if (r3 < 0) goto L32;
        ArrayList r4 = ia0.d;     // Catch: Throwable -> L20
        View r5 = (View) ((WeakReference) r4.get(r3)).get();     // Catch: Throwable -> L20
        if (r5 != null) goto L27;
        r4.remove(r3);     // Catch: Throwable -> L20
    L31:
        r3 = r3 - 1;
        goto L23
    L27:
        r1.a.put(r5, Boolean.TRUE);     // Catch: Throwable -> L20
        ViewParent r42 = r5.getParent();     // Catch: Throwable -> L20
    L29:
        if ((r42 instanceof View) == false) goto L31;
        r1.a.put((View) r42, Boolean.TRUE);     // Catch: Throwable -> L20
        r42 = r42.getParent();     // Catch: Throwable -> L20
        goto L29
    L32:
        monitor-exit(r03);     // Catch: Throwable -> L20
    L36:
        View r82 = r1.a(r8);
        if (r9.getAction() != 0) goto L46;
        int r92 = r9.getKeyCode();
        if (r82 == null) goto L46;
        if (KeyEvent.isModifierKey(r92) == true) goto L46;
        if (r1.b != null) goto L45;
        r1.b = new SparseArray();
    L45:
        r1.b.put(r92, new WeakReference(r82));
    L46:
        if (r82 == null) goto L48;
        return true;
    L48:
        return false;
    L55:
        return false;
    }

    public static View.AccessibilityDelegate c(View r3) {
        if (Build.VERSION.SDK_INT < 29) goto L7;
        return da0.a(r3);
    L7:
        if (c == false) goto L10;
        return null;
    L10:
        if (b == null) goto L23;
    L21:
        Object r32 = b.get(r3);     // Catch: Throwable -> L18
        if ((r32 instanceof View.AccessibilityDelegate) == false) goto L26;
        return (View.AccessibilityDelegate) r32;
    L26:
        return null;
    L18:
        c = true;
        return null;
    L23:
        Field r0 = View.class.getDeclaredField("mAccessibilityDelegate");     // Catch: Throwable -> L13
        b = r0;     // Catch: Throwable -> L13
        r0.setAccessible(true);     // Catch: Throwable -> L13
    L13:
        c = true;
        return null;
    }

    public static CharSequence d(View r2) {
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Object r22 = ca0.b(r2);
    L10:
        return (CharSequence) r22;
    L5:
        r22 = r2.getTag(R.id.tag_accessibility_pane_title);
        if (CharSequence.class.isInstance(r22) == true) goto L10;
        r22 = null;
        goto L10
    }

    public static ArrayList e(View r2) {
        ArrayList r1 = (ArrayList) r2.getTag(R.id.tag_accessibility_actions);
        if (r1 != null) goto L6;
        ArrayList r12 = new ArrayList();
        r2.setTag(R.id.tag_accessibility_actions, r12);
        return r12;
    L6:
        return r1;
    }

    public static String[] f(w3 r2) {
        if (Build.VERSION.SDK_INT < 31) goto L7;
        return fa0.a(r2);
    L7:
        return (String[]) r2.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View r5, int r6) {
        AccessibilityManager r0 = (AccessibilityManager) r5.getContext().getSystemService("accessibility");
        if (r0.isEnabled() == true) goto L6;
        return;
    L6:
        if (d(r5) != null) goto L8;
    L12:
        boolean r1 = false;
    L13:
        int r4 = 32;
        if (v90.a(r5) != 0) goto L28;
        if (r1 == true) goto L28;
        if (r6 != 32) goto L21;
        AccessibilityEvent r12 = AccessibilityEvent.obtain();
        r5.onInitializeAccessibilityEvent(r12);
        r12.setEventType(32);
        v90.g(r12, r6);
        r12.setSource(r5);
        r5.onPopulateAccessibilityEvent(r12);
        r12.getText().add(d(r5));
        r0.sendAccessibilityEvent(r12);
        return;
    L21:
        if (r5.getParent() != null) goto L46;
        return;
    L46:
        v90.e(r5.getParent(), r5, r5, r6);     // Catch: AbstractMethodError -> L25
        return;
    L25:
        e = move-exception;
        Log.e("ViewCompat", r5.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
        return;
    L28:
        AccessibilityEvent r02 = AccessibilityEvent.obtain();
        if (r1 == true) goto L32;
        r4 = 2048;
    L32:
        r02.setEventType(r4);
        v90.g(r02, r6);
        if (r1 == false) goto L44;
        r02.getText().add(d(r5));
        if (s90.c(r5) != 0) goto L37;
        s90.s(r5, 1);
    L37:
        ViewParent r62 = r5.getParent();
    L39:
        if ((r62 instanceof View) == false) goto L44;
        if (s90.c((View) r62) == 4) goto L42;
        r62 = r62.getParent();
        goto L39
    L42:
        s90.s(r5, 2);
    L44:
        r5.sendAccessibilityEventUnchecked(r02);
        return;
    L8:
        if (r5.isShown() == false) goto L12;
        if (r5.getWindowVisibility() != 0) goto L12;
        r1 = true;
        goto L13
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static cd h(View r3, cd r4) {
        if (Log.isLoggable("ViewCompat", 3) == false) goto L6;
        Log.d("ViewCompat", "performReceiveContent: " + r4 + ", view=" + r3.getClass().getSimpleName() + "[" + r3.getId() + "]");
    L6:
        if (Build.VERSION.SDK_INT >= 31) goto L8;
        ax r0 = (ax) r3.getTag(R.id.tag_on_receive_content_listener);
        bx r1 = e;
        if (r0 == null) goto L21;
        cd r42 = ((p60) r0).a(r3, r4);
        if (r42 != null) goto L16;
        return null;
    L16:
        if ((r3 instanceof bx) == false) goto L19;
        r1 = (bx) r3;
    L19:
        return r1.a(r42);
    L21:
        if ((r3 instanceof bx) == false) goto L24;
        r1 = (bx) r3;
    L24:
        return r1.a(r4);
    L8:
        return fa0.b(r3, r4);
    }

    public static void i(View r2, int r3) {
        ArrayList r22 = e(r2);
        int r0 = 0;
    L4:
        if (r0 >= r22.size()) goto L10;
        if (((h0) r22.get(r0)).a() == r3) goto L7;
        r0 = r0 + 1;
        goto L4
    L7:
        r22.remove(r0);
        return;
    }

    public static void j(View r6, h0 r7, v0 r8) {
        h0 r0 = new h0(null, r7.b, null, r8, r7.c);
        View.AccessibilityDelegate r72 = c(r6);
        if (r72 != null) goto L6;
        x r73 = null;
    L9:
        if (r73 != null) goto L11;
        r73 = new x();
    L11:
        l(r6, r73);
        i(r6, r0.a());
        e(r6).add(r0);
        g(r6, 0);
        return;
    L6:
        if ((r72 instanceof v) == false) goto L8;
        r73 = ((v) r72).a;
        goto L9
    L8:
        r73 = new x(r72);
        goto L9
    }

    public static void k(View r9, Context r10, int[] r11, AttributeSet r12, TypedArray r13, int r14) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        da0.c(r9, r10, r11, r12, r13, r14, 0);
        return;
    }

    public static void l(View r1, x r2) {
        if (r2 == null) goto L4;
    L6:
        if (r2 != null) goto L8;
        v r22 = null;
    L9:
        r1.setAccessibilityDelegate(r22);
        return;
    L8:
        r22 = r2.b;
        goto L9
    L4:
        if ((c(r1) instanceof v) == false) goto L6;
        r2 = new x();
        goto L6
    }

    public static void m(View r6, CharSequence r7) {
        new p90(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(r6, r7);
        q90 r0 = f;
        if (r7 == null) goto L14;
        WeakHashMap r72 = r0.a;
        if (r6.isShown() == true) goto L7;
    L9:
        boolean r1 = false;
    L10:
        r72.put(r6, Boolean.valueOf(r1));
        r6.addOnAttachStateChangeListener(r0);
        if (v90.b(r6) == false) goto L16;
        r6.getViewTreeObserver().addOnGlobalLayoutListener(r0);
        return;
    L16:
        return;
    L7:
        if (r6.getWindowVisibility() != 0) goto L9;
        r1 = true;
        goto L10
    L14:
        r0.a.remove(r6);
        r6.removeOnAttachStateChangeListener(r0);
        s90.o(r6.getViewTreeObserver(), r0);
    }
}

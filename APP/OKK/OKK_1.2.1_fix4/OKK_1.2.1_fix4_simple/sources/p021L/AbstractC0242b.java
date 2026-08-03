package p021L;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p006D.C0091b;
import p008E.C0156j;
import p008E.C0158l;
import p063j.C0967l;
import p074o0.C1028d;
import p089x0.C1121e;

/* JADX INFO: renamed from: L.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242b extends C0091b {

    /* JADX INFO: renamed from: n */
    public static final Rect f484n = null;

    /* JADX INFO: renamed from: o */
    public static final C1121e f485o = null;

    /* JADX INFO: renamed from: p */
    public static final C1121e f486p = null;

    /* JADX INFO: renamed from: d */
    public final Rect f487d;

    /* JADX INFO: renamed from: e */
    public final Rect f488e;

    /* JADX INFO: renamed from: f */
    public final Rect f489f;

    /* JADX INFO: renamed from: g */
    public final int[] f490g;

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f491h;

    /* JADX INFO: renamed from: i */
    public final View f492i;

    /* JADX INFO: renamed from: j */
    public C0241a f493j;

    /* JADX INFO: renamed from: k */
    public int f494k;

    /* JADX INFO: renamed from: l */
    public int f495l;

    /* JADX INFO: renamed from: m */
    public int f496m;

    static {
        f484n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        f485o = new C1121e(1);
        f486p = new C1121e(2);
    }

    public AbstractC0242b(View r3) {
        this.f487d = new Rect();
        this.f488e = new Rect();
        this.f489f = new Rect();
        this.f490g = new int[2];
        this.f494k = Integer.MIN_VALUE;
        this.f495l = Integer.MIN_VALUE;
        this.f496m = Integer.MIN_VALUE;
        if (r3 == null) goto L9;
        this.f492i = r3;
        this.f491h = (AccessibilityManager) r3.getContext().getSystemService("accessibility");
        r3.setFocusable(true);
        Field r1 = AbstractC0080Q.f219a;
        if (r3.getImportantForAccessibility() != 0) goto L10;
        r3.setImportantForAccessibility(1);
        return;
    L10:
        return;
    L9:
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: b */
    public final C0158l mo314b(View r1) {
        if (this.f493j != null) goto L6;
        this.f493j = new C0241a(this);
    L6:
        return this.f493j;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r2, C0156j r3) {
        View.AccessibilityDelegate r02 = this.f243a;
        AccessibilityNodeInfo r32 = r3.f357a;
        r02.onInitializeAccessibilityNodeInfo(r2, r32);
        Chip r22 = ((C1028d) this).f3776q;
        r32.setCheckable(r22.m1871d());
        r32.setClickable(r22.isClickable());
        r32.setClassName(r22.getAccessibilityClassName());
        r32.setText(r22.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m661j(int r4) {
        if (this.f495l == r4) goto L5;
        return false;
    L5:
        this.f495l = Integer.MIN_VALUE;
        C1028d r02 = (C1028d) this;
        if (r4 != 1) goto L8;
        Chip r03 = r02.f3776q;
        r03.f2378m = false;
        r03.refreshDrawableState();
    L8:
        m668q(r4, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C0156j m662k(int r13) {
        AccessibilityNodeInfo r02 = AccessibilityNodeInfo.obtain();
        C0156j r1 = new C0156j(r02);
        r02.setEnabled(true);
        r02.setFocusable(true);
        r02.setClassName("android.view.View");
        Rect r3 = f484n;
        r02.setBoundsInParent(r3);
        r02.setBoundsInScreen(r3);
        r1.f358b = -1;
        View r5 = this.f492i;
        r02.setParent(r5);
        mo666o(r13, r1);
        if (r1.m510g() == null) goto L5;
    L9:
        Rect r6 = this.f488e;
        r1.m509f(r6);
        if (r6.equals(r3) == true) goto L63;
        int r7 = r02.getActions();
        if ((r7 & 64) != 0) goto L61;
        if ((r7 & 128) != 0) goto L59;
        r02.setPackageName(r5.getContext().getPackageName());
        r1.f359c = r13;
        r02.setSource(r5, r13);
        if (this.f494k != r13) goto L18;
        r02.setAccessibilityFocused(true);
        r1.m505a(128);
    L20:
        if (this.f495l != r13) goto L22;
        boolean r132 = true;
    L23:
        if (r132 == false) goto L26;
        r1.m505a(2);
    L28:
        r02.setFocused(r132);
        int[] r133 = this.f490g;
        r5.getLocationOnScreen(r133);
        Rect r72 = this.f487d;
        r02.getBoundsInScreen(r72);
        if (r72.equals(r3) == false) goto L36;
        r1.m509f(r72);
        if (r1.f358b == (-1)) goto L35;
        C0156j r10 = new C0156j(AccessibilityNodeInfo.obtain());
        int r8 = r1.f358b;
    L33:
        if (r8 == (-1)) goto L35;
        r10.f358b = -1;
        AccessibilityNodeInfo r11 = r10.f357a;
        r11.setParent(r5, -1);
        r11.setBoundsInParent(r3);
        mo666o(r8, r10);
        r10.m509f(r6);
        r72.offset(r6.left, r6.top);
        r8 = r10.f358b;
    L35:
        r72.offset(r133[0] - r5.getScrollX(), r133[1] - r5.getScrollY());
    L36:
        Rect r32 = this.f489f;
        if (r5.getLocalVisibleRect(r32) == false) goto L57;
        r32.offset(r133[0] - r5.getScrollX(), r133[1] - r5.getScrollY());
        if (r72.intersect(r32) == false) goto L57;
        r1.f357a.setBoundsInScreen(r72);
        if (r72.isEmpty() == true) goto L57;
        if (r5.getWindowVisibility() != 0) goto L57;
        Object r134 = r5.getParent();
    L48:
        if ((r134 instanceof View) == false) goto L55;
        View r135 = (View) r134;
        if (r135.getAlpha() <= 0.0f) goto L57;
        if (r135.getVisibility() != 0) goto L57;
        r134 = r135.getParent();
        goto L48
    L55:
        if (r134 == null) goto L57;
        r02.setVisibleToUser(true);
    L57:
        return r1;
    L26:
        if (r02.isFocusable() == false) goto L28;
        r1.m505a(1);
        goto L28
    L22:
        r132 = false;
        goto L23
    L18:
        r02.setAccessibilityFocused(false);
        r1.m505a(64);
        goto L20
    L59:
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    L61:
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    L63:
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    L5:
        if (r02.getContentDescription() != null) goto L9;
        throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo663l(ArrayList r1);

    /* JADX INFO: renamed from: m */
    public final boolean m664m(int r20, Rect r21) {
        ArrayList r4 = new ArrayList();
        mo663l(r4);
        C0967l r5 = new C0967l();
        int r7 = 0;
    L4:
        if (r7 >= r4.size()) goto L6;
        r5.m2328d(((Integer) r4.get(r7)).intValue(), m662k(((Integer) r4.get(r7)).intValue()));
        r7 = r7 + 1;
        goto L4
    L6:
        int r42 = this.f495l;
        int r72 = Integer.MIN_VALUE;
        if (r42 != Integer.MIN_VALUE) goto L9;
        C0156j r43 = null;
    L10:
        C1121e r9 = f485o;
        C1121e r10 = f486p;
        View r11 = this.f492i;
        if (r20 == 1) goto L71;
        if (r20 == 2) goto L71;
        if (r20 == 17) goto L21;
        if (r20 == 33) goto L21;
        if (r20 == 66) goto L21;
        if (r20 == 130) goto L21;
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L21:
        Rect r3 = new Rect();
        int r6 = this.f495l;
        if (r6 == Integer.MIN_VALUE) goto L25;
        m665n(r6).m509f(r3);
    L24:
        int r18 = -1;
    L38:
        Rect r2 = new Rect(r3);
        if (r20 == 17) goto L48;
        if (r20 == 33) goto L47;
        if (r20 == 66) goto L46;
        if (r20 != 130) goto L45;
        int r14 = 0;
        r2.offset(0, -(r3.height() + 1));
    L49:
        r10.getClass();
        int r62 = r5.f3436c;
        Rect r8 = new Rect();
        int r112 = r14;
        C0156j r16 = null;
    L50:
        if (r112 >= r62) goto L70;
        C0156j r102 = (C0156j) r5.f3435b[r112];
        if (r102 == r43) goto L69;
        r9.getClass();
        r102.m509f(r8);
        if (AbstractC0040p.m79B(r20, r3, r8) == false) goto L69;
        if (AbstractC0040p.m79B(r20, r3, r2) == true) goto L61;
    L68:
        r2.set(r8);
        r16 = r102;
        goto L69
    L61:
        if (AbstractC0040p.m100d(r20, r3, r8, r2) == true) goto L68;
        if (AbstractC0040p.m100d(r20, r3, r2, r8) == true) goto L69;
        int r12 = AbstractC0040p.m83G(r20, r3, r8);
        int r13 = AbstractC0040p.m84H(r20, r3, r8);
        int r132 = (r13 * r13) + ((r12 * 13) * r12);
        int r122 = AbstractC0040p.m83G(r20, r3, r2);
        int r15 = AbstractC0040p.m84H(r20, r3, r2);
        if (r132 < ((r15 * r15) + ((r122 * 13) * r122))) goto L68;
    L69:
        r112 = r112 + 1;
    L70:
        C0156j r1 = r16;
        if (r1 == null) goto L111;
        int r63 = r14;
    L103:
        if (r63 >= r5.f3436c) goto L108;
        if (r5.f3435b[r63] == r1) goto L106;
        r63 = r63 + 1;
        goto L103
    L106:
        int r133 = r63;
    L109:
        r72 = r5.f3434a[r133];
        goto L111
    L108:
        r133 = r18;
    L111:
        return m667p(r72);
    L45:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L46:
        r14 = 0;
        r2.offset(-(r3.width() + 1), 0);
        goto L49
    L47:
        r14 = 0;
        r2.offset(0, r3.height() + 1);
        goto L49
    L48:
        r14 = 0;
        r2.offset(r3.width() + 1, 0);
        goto L49
    L25:
        if (r21 == null) goto L27;
        r3.set(r21);
        goto L24
    L27:
        int r22 = r11.getWidth();
        int r64 = r11.getHeight();
        if (r20 == 17) goto L37;
        if (r20 == 33) goto L36;
        if (r20 == 66) goto L35;
        if (r20 != 130) goto L34;
        r3.set(0, -1, r22, -1);
        r18 = -1;
        goto L38
    L34:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L35:
        r3.set(-1, 0, -1, r64);
        r18 = -1;
        goto L38
    L36:
        r18 = -1;
        r3.set(0, r64, r22, r64);
        goto L38
    L37:
        r18 = -1;
        r3.set(r22, 0, r22, r64);
    L71:
        r14 = 0;
        r18 = -1;
        Field r23 = AbstractC0080Q.f219a;
        if (r11.getLayoutDirection() != 1) goto L74;
        boolean r24 = true;
    L75:
        r10.getClass();
        int r32 = r5.f3436c;
        ArrayList r65 = new ArrayList(r32);
        int r113 = 0;
    L76:
        if (r113 >= r32) goto L78;
        r65.add((C0156j) r5.f3435b[r113]);
        r113 = r113 + 1;
        goto L76
    L78:
        Collections.sort(r65, new C0243c(r24, r9));
        if (r20 == 1) goto L91;
        if (r20 != 2) goto L90;
        int r17 = r65.size();
        if (r43 != null) goto L84;
        int r25 = -1;
    L85:
        int r26 = r25 + 1;
        if (r26 >= r17) goto L88;
        Object r82 = r65.get(r26);
    L98:
        r16 = (C0156j) r82;
    L88:
        r82 = null;
        goto L98
    L84:
        r25 = r65.lastIndexOf(r43);
        goto L85
    L90:
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    L91:
        int r19 = r65.size();
        if (r43 == null) goto L95;
        r19 = r65.indexOf(r43);
    L95:
        int r110 = r19 - 1;
        if (r110 < 0) goto L88;
        r82 = r65.get(r110);
        goto L98
    L74:
        r24 = false;
        goto L75
    L9:
        r43 = (C0156j) r5.m2327c(r42, null);
        goto L10
    }

    /* JADX INFO: renamed from: n */
    public final C0156j m665n(int r7) {
        if (r7 != (-1)) goto L16;
        View r72 = this.f492i;
        AccessibilityNodeInfo r02 = AccessibilityNodeInfo.obtain(r72);
        C0156j r1 = new C0156j(r02);
        Field r2 = AbstractC0080Q.f219a;
        r72.onInitializeAccessibilityNodeInfo(r02);
        ArrayList r22 = new ArrayList();
        mo663l(r22);
        if (r02.getChildCount() > 0) goto L7;
    L11:
        int r03 = r22.size();
        int r3 = 0;
    L12:
        if (r3 >= r03) goto L14;
        int r4 = ((Integer) r22.get(r3)).intValue();
        r1.f357a.addChild(r72, r4);
        r3 = r3 + 1;
        goto L12
    L14:
        return r1;
    L7:
        if (r22.size() <= 0) goto L11;
        throw new RuntimeException("Views cannot have both real and virtual children");
    L16:
        return m662k(r7);
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo666o(int r1, C0156j r2);

    /* JADX INFO: renamed from: p */
    public final boolean m667p(int r4) {
        View r02 = this.f492i;
        if (r02.isFocused() == false) goto L5;
    L7:
        int r03 = this.f495l;
        if (r03 != r4) goto L11;
        return false;
    L11:
        if (r03 == Integer.MIN_VALUE) goto L13;
        m661j(r03);
    L13:
        if (r4 != Integer.MIN_VALUE) goto L15;
        return false;
    L15:
        this.f495l = r4;
        C1028d r04 = (C1028d) this;
        if (r4 != 1) goto L18;
        Chip r05 = r04.f3776q;
        r05.f2378m = true;
        r05.refreshDrawableState();
    L18:
        m668q(r4, 8);
        return true;
    L5:
        if (r02.requestFocus() == true) goto L7;
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m668q(int r6, int r7) {
        if (r6 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.f491h.isEnabled() == false) goto L24;
        View r02 = this.f492i;
        ViewParent r1 = r02.getParent();
        if (r1 != null) goto L11;
        return;
    L11:
        if (r6 == (-1)) goto L20;
        AccessibilityEvent r72 = AccessibilityEvent.obtain(r7);
        C0156j r2 = m665n(r6);
        r72.getText().add(r2.m510g());
        AccessibilityNodeInfo r22 = r2.f357a;
        r72.setContentDescription(r22.getContentDescription());
        r72.setScrollable(r22.isScrollable());
        r72.setPassword(r22.isPassword());
        r72.setEnabled(r22.isEnabled());
        r72.setChecked(r22.isChecked());
        if (r72.getText().isEmpty() == true) goto L15;
    L19:
        r72.setClassName(r22.getClassName());
        r72.setSource(r02, r6);
        r72.setPackageName(r02.getContext().getPackageName());
    L21:
        r1.requestSendAccessibilityEvent(r02, r72);
        return;
    L15:
        if (r72.getContentDescription() != null) goto L19;
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    L20:
        r72 = AccessibilityEvent.obtain(r7);
        r02.onInitializeAccessibilityEvent(r72);
        goto L21
    }
}

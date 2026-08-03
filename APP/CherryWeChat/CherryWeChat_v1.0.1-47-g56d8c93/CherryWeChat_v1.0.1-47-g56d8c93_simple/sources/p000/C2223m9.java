package p000;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2223m9 extends C0645P {

    /* JADX INFO: renamed from: o */
    public static final Rect f7722o = null;

    /* JADX INFO: renamed from: p */
    public static final C0668Pg f7723p = null;

    /* JADX INFO: renamed from: q */
    public static final C0668Pg f7724q = null;

    /* JADX INFO: renamed from: d */
    public final Rect f7725d;

    /* JADX INFO: renamed from: e */
    public final Rect f7726e;

    /* JADX INFO: renamed from: f */
    public final Rect f7727f;

    /* JADX INFO: renamed from: g */
    public final int[] f7728g;

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f7729h;

    /* JADX INFO: renamed from: i */
    public final Chip f7730i;

    /* JADX INFO: renamed from: j */
    public C0711Qg f7731j;

    /* JADX INFO: renamed from: k */
    public int f7732k;

    /* JADX INFO: renamed from: l */
    public int f7733l;

    /* JADX INFO: renamed from: m */
    public int f7734m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Chip f7735n;

    static {
        f7722o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        f7723p = new C0668Pg(0);
        f7724q = new C0668Pg(1);
    }

    public C2223m9(Chip r2, Chip r3) {
        this.f7735n = r2;
        this.f7725d = new Rect();
        this.f7726e = new Rect();
        this.f7727f = new Rect();
        this.f7728g = new int[2];
        this.f7732k = Integer.MIN_VALUE;
        this.f7733l = Integer.MIN_VALUE;
        this.f7734m = Integer.MIN_VALUE;
        this.f7730i = r3;
        this.f7729h = (AccessibilityManager) r3.getContext().getSystemService("accessibility");
        r3.setFocusable(true);
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        if (r3.getImportantForAccessibility() != 0) goto L6;
        r3.setImportantForAccessibility(1);
        return;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: b */
    public final C0132D2 mo317b(View r1) {
        if (this.f7731j != null) goto L6;
        this.f7731j = new C0711Qg(this);
    L6:
        return this.f7731j;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r3, C1118a0 r4) {
        AccessibilityNodeInfo r0 = r4.f3530a;
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r0);
        Chip r32 = this.f7735n;
        C2309o9 r1 = r32.f4511e;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        r0.setCheckable(r12);
        r0.setClickable(r32.isClickable());
        r4.m2046h(r32.getAccessibilityClassName());
        r0.setText(r32.getText());
        return;
    L5:
        if (r1.f8125Z == false) goto L7;
        r12 = true;
        goto L8
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4474j(int r3) {
        if (this.f7733l == r3) goto L5;
        return false;
    L5:
        this.f7733l = Integer.MIN_VALUE;
        m4479o(r3, false);
        m4481q(r3, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C1118a0 m4475k(int r12) {
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain();
        C1118a0 r1 = new C1118a0(r0);
        r0.setEnabled(true);
        r0.setFocusable(true);
        r1.m2046h("android.view.View");
        Rect r3 = f7722o;
        r0.setBoundsInParent(r3);
        r0.setBoundsInScreen(r3);
        Chip r4 = this.f7730i;
        r0.setParent(r4);
        AccessibilityNodeInfo r6 = r1.f3530a;
        CharSequence r7 = "";
        if (r12 != 1) goto L12;
        Chip r5 = this.f7735n;
        CharSequence r8 = r5.getCloseIconContentDescription();
        if (r8 == null) goto L7;
        r6.setContentDescription(r8);
    L11:
        r6.setBoundsInParent(Chip.m2460a(r5));
        r1.m2041b(C0902V.f2802e);
        r6.setEnabled(r5.isEnabled());
        r1.m2046h(Button.class.getName());
    L14:
        if (r1.m2045g() == null) goto L16;
    L20:
        Rect r52 = this.f7726e;
        r1.m2044f(r52);
        if (r52.equals(r3) == true) goto L69;
        int r53 = r0.getActions();
        if ((r53 & 64) != 0) goto L67;
        if ((r53 & 128) != 0) goto L65;
        r0.setPackageName(r4.getContext().getPackageName());
        r1.f3531b = r12;
        r0.setSource(r4, r12);
        if (this.f7732k != r12) goto L29;
        r0.setAccessibilityFocused(true);
        r1.m2040a(128);
    L31:
        if (this.f7733l != r12) goto L33;
        boolean r122 = true;
    L34:
        if (r122 == false) goto L37;
        r1.m2040a(2);
    L39:
        r0.setFocused(r122);
        int[] r123 = this.f7728g;
        r4.getLocationOnScreen(r123);
        Rect r54 = this.f7725d;
        r0.getBoundsInScreen(r54);
        if (r54.equals(r3) == false) goto L42;
        r1.m2044f(r54);
        r54.offset(r123[0] - r4.getScrollX(), r123[1] - r4.getScrollY());
    L42:
        Rect r32 = this.f7727f;
        if (r4.getLocalVisibleRect(r32) == false) goto L63;
        r32.offset(r123[0] - r4.getScrollX(), r123[1] - r4.getScrollY());
        if (r54.intersect(r32) == false) goto L63;
        r0.setBoundsInScreen(r54);
        if (r54.isEmpty() == true) goto L63;
        if (r4.getWindowVisibility() != 0) goto L63;
        Object r124 = r4.getParent();
    L54:
        if ((r124 instanceof View) == false) goto L61;
        View r125 = (View) r124;
        if (r125.getAlpha() <= 0.0f) goto L63;
        if (r125.getVisibility() != 0) goto L63;
        r124 = r125.getParent();
        goto L54
    L61:
        if (r124 == null) goto L63;
        r1.f3530a.setVisibleToUser(true);
    L63:
        return r1;
    L37:
        if (r0.isFocusable() == false) goto L39;
        r1.m2040a(1);
        goto L39
    L33:
        r122 = false;
        goto L34
    L29:
        r0.setAccessibilityFocused(false);
        r1.m2040a(64);
        goto L31
    L65:
        throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    L67:
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    L69:
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    L16:
        if (r0.getContentDescription() != null) goto L20;
        throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
    L7:
        CharSequence r82 = r5.getText();
        Context r9 = r5.getContext();
        if (TextUtils.isEmpty(r82) == true) goto L10;
        r7 = r82;
    L10:
        r6.setContentDescription(r9.getString(R.string.mtrl_chip_close_icon_content_description, new Object[]{r7}).trim());
        goto L11
    L12:
        r6.setContentDescription("");
        r6.setBoundsInParent(Chip.f4508w);
        goto L14
    }

    /* JADX INFO: renamed from: l */
    public final void m4476l(ArrayList r3) {
        r3.add(0);
        Rect r0 = Chip.f4508w;
        Chip r02 = this.f7735n;
        if (r02.m2462c() == false) goto L12;
        C2309o9 r1 = r02.f4511e;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.f8119T == true) goto L9;
        return;
    L9:
        if (r02.f4514h == null) goto L15;
        r3.add(1);
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m4477m(int r19, Rect r20) {
        ArrayList r3 = new ArrayList();
        m4476l(r3);
        C0471Ky r4 = new C0471Ky();
        int r6 = 0;
    L4:
        if (r6 >= r3.size()) goto L6;
        r4.m920c(((Integer) r3.get(r6)).intValue(), m4475k(((Integer) r3.get(r6)).intValue()));
        r6 = r6 + 1;
        goto L4
    L6:
        int r32 = this.f7733l;
        if (r32 != Integer.MIN_VALUE) goto L9;
        C1118a0 r33 = null;
    L10:
        C0668Pg r8 = f7723p;
        C0668Pg r9 = f7724q;
        Chip r10 = this.f7730i;
        if (r19 == 1) goto L72;
        if (r19 == 2) goto L72;
        if (r19 == 17) goto L21;
        if (r19 == 33) goto L21;
        if (r19 == 66) goto L21;
        if (r19 == 130) goto L21;
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L21:
        Rect r13 = new Rect();
        int r5 = this.f7733l;
        if (r5 == Integer.MIN_VALUE) goto L25;
        m4478n(r5).m2044f(r13);
    L24:
        int r102 = -1;
    L38:
        Rect r2 = new Rect(r13);
        if (r19 == 17) goto L48;
        if (r19 == 33) goto L47;
        if (r19 == 66) goto L46;
        if (r19 != 130) goto L45;
        int r7 = 0;
        r2.offset(0, -(r13.height() + 1));
    L49:
        r9.getClass();
        int r52 = r4.f1531c;
        Rect r62 = new Rect();
        int r92 = r7;
        C1118a0 r16 = null;
    L50:
        if (r92 >= r52) goto L70;
        C1118a0 r11 = (C1118a0) r4.f1530b[r92];
        if (r11 == r33) goto L69;
        r8.getClass();
        r11.m2044f(r62);
        if (AbstractC0714Qj.m1502x(r19, r13, r62) == false) goto L69;
        if (AbstractC0714Qj.m1502x(r19, r13, r2) == true) goto L61;
    L68:
        r2.set(r62);
        r16 = r11;
        goto L69
    L61:
        if (AbstractC0714Qj.m1480b(r19, r13, r62, r2) == true) goto L68;
        if (AbstractC0714Qj.m1480b(r19, r13, r2, r62) == true) goto L69;
        int r12 = AbstractC0714Qj.m1504z(r19, r13, r62);
        int r14 = AbstractC0714Qj.m1470A(r19, r13, r62);
        int r142 = (r14 * r14) + ((r12 * 13) * r12);
        int r122 = AbstractC0714Qj.m1504z(r19, r13, r2);
        int r15 = AbstractC0714Qj.m1470A(r19, r13, r2);
        if (r142 < ((r15 * r15) + ((r122 * 13) * r122))) goto L68;
    L69:
        r92 = r92 + 1;
        goto L50
    L70:
        int r22 = r102;
    L71:
        C1118a0 r1 = r16;
        if (r1 != null) goto L102;
        int r72 = Integer.MIN_VALUE;
    L111:
        return m4480p(r72);
    L102:
        int r34 = r4.f1531c;
        int r53 = r7;
    L103:
        if (r53 >= r34) goto L108;
        if (r4.f1530b[r53] == r1) goto L106;
        r53 = r53 + 1;
        goto L103
    L106:
        int r123 = r53;
    L109:
        r72 = r4.f1529a[r123];
        goto L111
    L108:
        r123 = r22;
        goto L109
    L45:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L46:
        r7 = 0;
        r2.offset(-(r13.width() + 1), 0);
        goto L49
    L47:
        r7 = 0;
        r2.offset(0, r13.height() + 1);
        goto L49
    L48:
        r7 = 0;
        r2.offset(r13.width() + 1, 0);
        goto L49
    L25:
        if (r20 == null) goto L27;
        r13.set(r20);
        goto L24
    L27:
        int r23 = r10.getWidth();
        int r54 = r10.getHeight();
        if (r19 == 17) goto L37;
        if (r19 == 33) goto L36;
        if (r19 == 66) goto L35;
        if (r19 != 130) goto L34;
        r102 = -1;
        r13.set(0, -1, r23, -1);
        goto L38
    L34:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L35:
        r102 = -1;
        r13.set(-1, 0, -1, r54);
        goto L38
    L36:
        r102 = -1;
        r13.set(0, r54, r23, r54);
        goto L38
    L37:
        r102 = -1;
        r13.set(r23, 0, r23, r54);
    L72:
        r22 = -1;
        r7 = 0;
        WeakHashMap r55 = AbstractC2185lE.f7617a;
        if (r10.getLayoutDirection() != 1) goto L75;
        boolean r56 = true;
    L76:
        r9.getClass();
        int r63 = r4.f1531c;
        ArrayList r93 = new ArrayList(r63);
        int r103 = 0;
    L77:
        if (r103 >= r63) goto L79;
        r93.add((C1118a0) r4.f1530b[r103]);
        r103 = r103 + 1;
        goto L77
    L79:
        Collections.sort(r93, new C0411Jh(r56, r8));
        if (r19 == 1) goto L92;
        if (r19 != 2) goto L91;
        int r17 = r93.size();
        if (r33 != null) goto L85;
        int r104 = -1;
    L86:
        int r105 = r104 + 1;
        if (r105 >= r17) goto L89;
        Object r64 = r93.get(r105);
    L99:
        r16 = (C1118a0) r64;
    L89:
        r64 = null;
        goto L99
    L85:
        r104 = r93.lastIndexOf(r33);
        goto L86
    L91:
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    L92:
        int r18 = r93.size();
        if (r33 == null) goto L96;
        r18 = r93.indexOf(r33);
    L96:
        int r110 = r18 - 1;
        if (r110 < 0) goto L89;
        r64 = r93.get(r110);
        goto L99
    L75:
        r56 = false;
        goto L76
    L9:
        r33 = (C1118a0) r4.m919b(r32);
        goto L10
    }

    /* JADX INFO: renamed from: n */
    public final C1118a0 m4478n(int r7) {
        if (r7 != (-1)) goto L16;
        Chip r72 = this.f7730i;
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain(r72);
        C1118a0 r1 = new C1118a0(r0);
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        r72.onInitializeAccessibilityNodeInfo(r0);
        ArrayList r22 = new ArrayList();
        m4476l(r22);
        if (r0.getChildCount() > 0) goto L7;
    L11:
        int r02 = r22.size();
        int r3 = 0;
    L12:
        if (r3 >= r02) goto L14;
        int r4 = ((Integer) r22.get(r3)).intValue();
        r1.f3530a.addChild(r72, r4);
        r3 = r3 + 1;
        goto L12
    L14:
        return r1;
    L7:
        if (r22.size() <= 0) goto L11;
        throw new RuntimeException("Views cannot have both real and virtual children");
    L16:
        return m4475k(r7);
    }

    /* JADX INFO: renamed from: o */
    public final void m4479o(int r5, boolean r6) {
        Chip r0 = this.f7735n;
        if (r5 != 1) goto L5;
        r0.f4519m = r6;
    L5:
        C2309o9 r52 = r0.f4511e;
        boolean r62 = r0.f4519m;
        boolean r3 = false;
        if (r52.f8120U == null) goto L11;
        if (r62 == false) goto L9;
        int[] r63 = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    L10:
        r3 = r52.m4705R(r63);
        goto L11
    L9:
        r63 = C2309o9.f8090O0;
    L11:
        if (r3 == false) goto L14;
        r0.refreshDrawableState();
        return;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4480p(int r3) {
        Chip r0 = this.f7730i;
        if (r0.isFocused() == false) goto L5;
    L7:
        int r02 = this.f7733l;
        if (r02 != r3) goto L11;
        return false;
    L11:
        if (r02 == Integer.MIN_VALUE) goto L13;
        m4474j(r02);
    L13:
        if (r3 != Integer.MIN_VALUE) goto L16;
        return false;
    L16:
        this.f7733l = r3;
        m4479o(r3, true);
        m4481q(r3, 8);
        return true;
    L5:
        if (r0.requestFocus() == true) goto L7;
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m4481q(int r6, int r7) {
        if (r6 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.f7729h.isEnabled() == false) goto L24;
        View r0 = this.f7730i;
        ViewParent r1 = r0.getParent();
        if (r1 != null) goto L11;
        return;
    L11:
        if (r6 == (-1)) goto L20;
        AccessibilityEvent r72 = AccessibilityEvent.obtain(r7);
        C1118a0 r2 = m4478n(r6);
        r72.getText().add(r2.m2045g());
        AccessibilityNodeInfo r22 = r2.f3530a;
        r72.setContentDescription(r22.getContentDescription());
        r72.setScrollable(r22.isScrollable());
        r72.setPassword(r22.isPassword());
        r72.setEnabled(r22.isEnabled());
        r72.setChecked(r22.isChecked());
        if (r72.getText().isEmpty() == true) goto L15;
    L19:
        r72.setClassName(r22.getClassName());
        r72.setSource(r0, r6);
        r72.setPackageName(r0.getContext().getPackageName());
    L21:
        r1.requestSendAccessibilityEvent(r0, r72);
        return;
    L15:
        if (r72.getContentDescription() != null) goto L19;
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    L20:
        r72 = AccessibilityEvent.obtain(r7);
        r0.onInitializeAccessibilityEvent(r72);
        goto L21
    }
}

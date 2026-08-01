package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends x {
    public static final Rect o = null;
    public static final vh p = null;
    public static final vh q = null;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final int[] g;
    public final AccessibilityManager h;
    public final Chip i;
    public mj j;
    public int k;
    public int l;
    public int m;
    public final /* synthetic */ Chip n;

    static {
        o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        p = new vh(20);
        q = new vh(21);
    }

    public ia(Chip r2, Chip r3) {
        this.n = r2;
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new int[2];
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.i = r3;
        this.h = (AccessibilityManager) r3.getContext().getSystemService("accessibility");
        r3.setFocusable(true);
        WeakHashMap r0 = ja0.a;
        if (s90.c(r3) != 0) goto L6;
        s90.s(r3, 1);
        return;
    }

    @Override // defpackage.x
    public final l0 b(View r1) {
        if (this.j != null) goto L6;
        this.j = new mj(this);
    L6:
        return this.j;
    }

    @Override // defpackage.x
    public final void d(View r2, j0 r3) {
        AccessibilityNodeInfo r32 = r3.a;
        this.a.onInitializeAccessibilityNodeInfo(r2, r32);
        Chip r22 = this.n;
        ka r0 = r22.e;
        if (r0 != null) goto L5;
    L7:
        boolean r02 = false;
    L8:
        r32.setCheckable(r02);
        r32.setClickable(r22.isClickable());
        r32.setClassName(r22.getAccessibilityClassName());
        r32.setText(r22.getText());
        return;
    L5:
        if (r0.Q == false) goto L7;
        r02 = true;
        goto L8
    }

    public final boolean j(int r4) {
        if (this.l == r4) goto L5;
        return false;
    L5:
        this.l = Integer.MIN_VALUE;
        if (r4 != 1) goto L8;
        Chip r2 = this.n;
        r2.m = false;
        r2.refreshDrawableState();
    L8:
        p(r4, 8);
        return true;
    }

    public final j0 k(int r12) {
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain();
        j0 r1 = new j0(r0);
        r0.setEnabled(true);
        r0.setFocusable(true);
        r0.setClassName("android.view.View");
        Rect r3 = o;
        r0.setBoundsInParent(r3);
        r0.setBoundsInScreen(r3);
        Chip r4 = this.i;
        r0.setParent(r4);
        AccessibilityNodeInfo r6 = r1.a;
        CharSequence r7 = "";
        if (r12 != 1) goto L12;
        Chip r5 = this.n;
        CharSequence r8 = r5.getCloseIconContentDescription();
        if (r8 == null) goto L7;
        r6.setContentDescription(r8);
    L11:
        r6.setBoundsInParent(Chip.a(r5));
        r1.b(h0.e);
        r6.setEnabled(r5.isEnabled());
    L14:
        if (r1.e() == null) goto L16;
    L20:
        Rect r52 = this.e;
        r1.d(r52);
        if (r52.equals(r3) == true) goto L69;
        int r53 = r0.getActions();
        if ((r53 & 64) != 0) goto L67;
        if ((r53 & 128) != 0) goto L65;
        r0.setPackageName(r4.getContext().getPackageName());
        r1.b = r12;
        r0.setSource(r4, r12);
        if (this.k != r12) goto L29;
        r0.setAccessibilityFocused(true);
        r1.a(128);
    L31:
        if (this.l != r12) goto L33;
        boolean r122 = true;
    L34:
        if (r122 == false) goto L37;
        r1.a(2);
    L39:
        r0.setFocused(r122);
        int[] r123 = this.g;
        r4.getLocationOnScreen(r123);
        Rect r54 = this.d;
        r0.getBoundsInScreen(r54);
        if (r54.equals(r3) == false) goto L42;
        r1.d(r54);
        r54.offset(r123[0] - r4.getScrollX(), r123[1] - r4.getScrollY());
    L42:
        Rect r32 = this.f;
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
        r0.setVisibleToUser(true);
    L63:
        return r1;
    L37:
        if (r0.isFocusable() == false) goto L39;
        r1.a(1);
        goto L39
    L33:
        r122 = false;
        goto L34
    L29:
        r0.setAccessibilityFocused(false);
        r1.a(64);
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
        r6.setBoundsInParent(Chip.w);
        goto L14
    }

    public final void l(ArrayList r3) {
        r3.add(0);
        Rect r0 = Chip.w;
        Chip r02 = this.n;
        if (r02.c() == false) goto L12;
        ka r1 = r02.e;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.K == true) goto L9;
        return;
    L9:
        if (r02.h == null) goto L15;
        r3.add(1);
        return;
    L15:
        return;
    }

    public final boolean m(int r19, Rect r20) {
        ArrayList r3 = new ArrayList();
        l(r3);
        e40 r4 = new e40();
        int r6 = 0;
    L4:
        if (r6 >= r3.size()) goto L6;
        r4.c(((Integer) r3.get(r6)).intValue(), k(((Integer) r3.get(r6)).intValue()));
        r6 = r6 + 1;
        goto L4
    L6:
        int r32 = this.l;
        if (r32 != Integer.MIN_VALUE) goto L9;
        j0 r33 = null;
    L10:
        vh r8 = p;
        vh r9 = q;
        Chip r10 = this.i;
        if (r19 == 1) goto L72;
        if (r19 == 2) goto L72;
        if (r19 == 17) goto L21;
        if (r19 == 33) goto L21;
        if (r19 == 66) goto L21;
        if (r19 == 130) goto L21;
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L21:
        Rect r13 = new Rect();
        int r5 = this.l;
        if (r5 == Integer.MIN_VALUE) goto L25;
        n(r5).d(r13);
    L24:
        int r102 = -1;
    L38:
        Rect r2 = new Rect(r13);
        if (r19 == 17) goto L48;
        if (r19 == 33) goto L47;
        if (r19 == 66) goto L46;
        if (r19 != 130) goto L45;
        int r62 = 0;
        r2.offset(0, -(r13.height() + 1));
    L49:
        r9.getClass();
        int r52 = r4.c;
        Rect r7 = new Rect();
        int r92 = r62;
        j0 r16 = null;
    L50:
        if (r92 >= r52) goto L70;
        j0 r11 = (j0) r4.b[r92];
        if (r11 == r33) goto L69;
        r8.getClass();
        r11.d(r7);
        if (ip.B(r19, r13, r7) == false) goto L69;
        if (ip.B(r19, r13, r2) == true) goto L61;
    L68:
        r2.set(r7);
        r16 = r11;
        goto L69
    L61:
        if (ip.j(r19, r13, r7, r2) == true) goto L68;
        if (ip.j(r19, r13, r2, r7) == true) goto L69;
        int r12 = ip.D(r19, r13, r7);
        int r14 = ip.E(r19, r13, r7);
        int r142 = (r14 * r14) + ((r12 * 13) * r12);
        int r122 = ip.D(r19, r13, r2);
        int r15 = ip.E(r19, r13, r2);
        if (r142 < ((r15 * r15) + ((r122 * 13) * r122))) goto L68;
    L69:
        r92 = r92 + 1;
        goto L50
    L70:
        int r22 = r102;
    L71:
        j0 r1 = r16;
        if (r1 != null) goto L102;
        int r63 = Integer.MIN_VALUE;
    L112:
        return o(r63);
    L102:
        int r53 = r62;
    L104:
        if (r53 >= r4.c) goto L109;
        if (r4.b[r53] == r1) goto L107;
        r53 = r53 + 1;
        goto L104
    L107:
        int r123 = r53;
    L110:
        r63 = r4.a[r123];
        goto L112
    L109:
        r123 = r22;
        goto L110
    L45:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    L46:
        r62 = 0;
        r2.offset(-(r13.width() + 1), 0);
        goto L49
    L47:
        r62 = 0;
        r2.offset(0, r13.height() + 1);
        goto L49
    L48:
        r62 = 0;
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
        r62 = 0;
        WeakHashMap r55 = ja0.a;
        if (t90.d(r10) != 1) goto L75;
        boolean r56 = true;
    L76:
        r9.getClass();
        int r72 = r4.c;
        ArrayList r93 = new ArrayList(r72);
        int r103 = 0;
    L77:
        if (r103 >= r72) goto L79;
        r93.add((j0) r4.b[r103]);
        r103 = r103 + 1;
        goto L77
    L79:
        Collections.sort(r93, new sk(r8, r56));
        if (r19 == 1) goto L92;
        if (r19 != 2) goto L91;
        int r17 = r93.size();
        if (r33 != null) goto L85;
        int r104 = -1;
    L86:
        int r105 = r104 + 1;
        if (r105 >= r17) goto L89;
        Object r73 = r93.get(r105);
    L99:
        r16 = (j0) r73;
    L89:
        r73 = null;
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
        r73 = r93.get(r110);
        goto L99
    L75:
        r56 = false;
        goto L76
    L9:
        r33 = (j0) r4.b(r32, null);
        goto L10
    }

    public final j0 n(int r7) {
        if (r7 != (-1)) goto L16;
        Chip r72 = this.i;
        AccessibilityNodeInfo r0 = AccessibilityNodeInfo.obtain(r72);
        j0 r1 = new j0(r0);
        WeakHashMap r2 = ja0.a;
        r72.onInitializeAccessibilityNodeInfo(r0);
        ArrayList r22 = new ArrayList();
        l(r22);
        if (r0.getChildCount() > 0) goto L7;
    L11:
        int r02 = r22.size();
        int r3 = 0;
    L12:
        if (r3 >= r02) goto L14;
        int r4 = ((Integer) r22.get(r3)).intValue();
        r1.a.addChild(r72, r4);
        r3 = r3 + 1;
        goto L12
    L14:
        return r1;
    L7:
        if (r22.size() <= 0) goto L11;
        throw new RuntimeException("Views cannot have both real and virtual children");
    L16:
        return k(r7);
    }

    public final boolean o(int r3) {
        Chip r0 = this.i;
        if (r0.isFocused() == false) goto L5;
    L7:
        int r02 = this.l;
        if (r02 != r3) goto L11;
        return false;
    L11:
        if (r02 == Integer.MIN_VALUE) goto L13;
        j(r02);
    L13:
        if (r3 != Integer.MIN_VALUE) goto L16;
        return false;
    L16:
        this.l = r3;
        if (r3 != 1) goto L19;
        Chip r1 = this.n;
        r1.m = true;
        r1.refreshDrawableState();
    L19:
        p(r3, 8);
        return true;
    L5:
        if (r0.requestFocus() == true) goto L7;
        return false;
    }

    public final void p(int r6, int r7) {
        if (r6 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (this.h.isEnabled() == false) goto L24;
        View r0 = this.i;
        ViewParent r1 = r0.getParent();
        if (r1 != null) goto L11;
        return;
    L11:
        if (r6 == (-1)) goto L20;
        AccessibilityEvent r72 = AccessibilityEvent.obtain(r7);
        j0 r2 = n(r6);
        r72.getText().add(r2.e());
        AccessibilityNodeInfo r22 = r2.a;
        r72.setContentDescription(r22.getContentDescription());
        r72.setScrollable(r22.isScrollable());
        r72.setPassword(r22.isPassword());
        r72.setEnabled(r22.isEnabled());
        r72.setChecked(r22.isChecked());
        if (r72.getText().isEmpty() == true) goto L15;
    L19:
        r72.setClassName(r22.getClassName());
        n0.a(r72, r0, r6);
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

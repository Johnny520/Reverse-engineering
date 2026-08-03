package p000;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1118a0 {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f3530a;

    /* JADX INFO: renamed from: b */
    public int f3531b;

    public C1118a0(AccessibilityNodeInfo r2) {
        this.f3531b = -1;
        this.f3530a = r2;
    }

    /* JADX INFO: renamed from: d */
    public static String m2039d(int r1) {
        if (r1 != 1) goto L5;
        return "ACTION_FOCUS";
    L5:
        if (r1 == 2) goto L92;
        switch(r1) {
            case 4: goto L90;
            case 8: goto L88;
            case 16: goto L86;
            case 32: goto L84;
            case 64: goto L82;
            case 128: goto L80;
            case 256: goto L78;
            case 512: goto L76;
            case 1024: goto L74;
            case 2048: goto L72;
            case 4096: goto L70;
            case 8192: goto L68;
            case 16384: goto L66;
            case 32768: goto L64;
            case 65536: goto L62;
            case 131072: goto L60;
            case 262144: goto L58;
            case 524288: goto L56;
            case 2097152: goto L54;
            case 16908354: goto L52;
            case 16908382: goto L50;
            default: goto L7;
        };
    L7:
        switch(r1) {
            case 16908342: goto L48;
            case 16908343: goto L46;
            case 16908344: goto L44;
            case 16908345: goto L42;
            case 16908346: goto L40;
            case 16908347: goto L38;
            case 16908348: goto L36;
            case 16908349: goto L34;
            default: goto L8;
        };
    L8:
        switch(r1) {
            case 16908356: goto L32;
            case 16908357: goto L30;
            case 16908358: goto L28;
            case 16908359: goto L26;
            case 16908360: goto L24;
            case 16908361: goto L22;
            case 16908362: goto L20;
            default: goto L9;
        };
    L9:
        switch(r1) {
            case 16908372: goto L18;
            case 16908373: goto L16;
            case 16908374: goto L14;
            case 16908375: goto L12;
            default: goto L10;
        };
    L10:
        return "ACTION_UNKNOWN";
    L12:
        return "ACTION_DRAG_CANCEL";
    L14:
        return "ACTION_DRAG_DROP";
    L16:
        return "ACTION_DRAG_START";
    L18:
        return "ACTION_IME_ENTER";
    L20:
        return "ACTION_PRESS_AND_HOLD";
    L22:
        return "ACTION_PAGE_RIGHT";
    L24:
        return "ACTION_PAGE_LEFT";
    L26:
        return "ACTION_PAGE_DOWN";
    L28:
        return "ACTION_PAGE_UP";
    L30:
        return "ACTION_HIDE_TOOLTIP";
    L32:
        return "ACTION_SHOW_TOOLTIP";
    L34:
        return "ACTION_SET_PROGRESS";
    L36:
        return "ACTION_CONTEXT_CLICK";
    L38:
        return "ACTION_SCROLL_RIGHT";
    L40:
        return "ACTION_SCROLL_DOWN";
    L42:
        return "ACTION_SCROLL_LEFT";
    L44:
        return "ACTION_SCROLL_UP";
    L46:
        return "ACTION_SCROLL_TO_POSITION";
    L48:
        return "ACTION_SHOW_ON_SCREEN";
    L50:
        return "ACTION_SCROLL_IN_DIRECTION";
    L52:
        return "ACTION_MOVE_WINDOW";
    L54:
        return "ACTION_SET_TEXT";
    L56:
        return "ACTION_COLLAPSE";
    L58:
        return "ACTION_EXPAND";
    L60:
        return "ACTION_SET_SELECTION";
    L62:
        return "ACTION_CUT";
    L64:
        return "ACTION_PASTE";
    L66:
        return "ACTION_COPY";
    L68:
        return "ACTION_SCROLL_BACKWARD";
    L70:
        return "ACTION_SCROLL_FORWARD";
    L72:
        return "ACTION_PREVIOUS_HTML_ELEMENT";
    L74:
        return "ACTION_NEXT_HTML_ELEMENT";
    L76:
        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
    L78:
        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
    L80:
        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
    L82:
        return "ACTION_ACCESSIBILITY_FOCUS";
    L84:
        return "ACTION_LONG_CLICK";
    L86:
        return "ACTION_CLICK";
    L88:
        return "ACTION_CLEAR_SELECTION";
    L90:
        return "ACTION_SELECT";
    L92:
        return "ACTION_CLEAR_FOCUS";
    }

    /* JADX INFO: renamed from: a */
    public final void m2040a(int r2) {
        this.f3530a.addAction(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2041b(C0902V r2) {
        AccessibilityNodeInfo.AccessibilityAction r22 = (AccessibilityNodeInfo.AccessibilityAction) r2.f2810a;
        this.f3530a.addAction(r22);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m2042c(String r3) {
        AccessibilityNodeInfo r0 = this.f3530a;
        ArrayList<Integer> r1 = r0.getExtras().getIntegerArrayList(r3);
        if (r1 != null) goto L6;
        ArrayList<Integer> r12 = new ArrayList();
        r0.getExtras().putIntegerArrayList(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2043e(int r4) {
        Bundle r0 = this.f3530a.getExtras();
        if (r0 != null) goto L6;
    L9:
        return false;
    L6:
        if ((r0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & r4) != r4) goto L9;
        return true;
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 != null) goto L8;
        return false;
    L8:
        if ((r4 instanceof C1118a0) == false) goto L23;
        C1118a0 r42 = (C1118a0) r4;
        AccessibilityNodeInfo r1 = r42.f3530a;
        AccessibilityNodeInfo r2 = this.f3530a;
        if (r2 != null) goto L15;
        if (r1 == null) goto L18;
        return false;
    L18:
        if (this.f3531b == r42.f3531b) goto L21;
        return false;
    L21:
        return true;
    L15:
        if (r2.equals(r1) == true) goto L18;
        return false;
    L23:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2044f(Rect r2) {
        this.f3530a.getBoundsInParent(r2);
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m2045g() {
        boolean r1 = m2042c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo r2 = this.f3530a;
        if (r1 == true) goto L10;
        ArrayList r0 = m2042c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList r12 = m2042c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList r3 = m2042c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList r4 = m2042c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int r8 = 0;
        SpannableString r5 = new SpannableString(TextUtils.substring(r2.getText(), 0, r2.getText().length()));
    L6:
        if (r8 >= r0.size()) goto L8;
        r5.setSpan(new C0559N(((Integer) r4.get(r8)).intValue(), this, r2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) r0.get(r8)).intValue(), ((Integer) r12.get(r8)).intValue(), ((Integer) r3.get(r8)).intValue());
        r8 = r8 + 1;
        goto L6
    L8:
        return r5;
    L10:
        return r2.getText();
    }

    /* JADX INFO: renamed from: h */
    public final void m2046h(CharSequence r2) {
        this.f3530a.setClassName(r2);
    }

    public final int hashCode() {
        AccessibilityNodeInfo r0 = this.f3530a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m2047i(AbstractC0714Qj r2) {
        this.f3530a.setCollectionInfo(null);
    }

    /* JADX INFO: renamed from: j */
    public final void m2048j(boolean r2) {
        this.f3530a.setScrollable(r2);
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        r1.append(super.toString());
        Rect r2 = new Rect();
        m2044f(r2);
        r1.append("; boundsInParent: " + r2);
        AccessibilityNodeInfo r3 = this.f3530a;
        r3.getBoundsInScreen(r2);
        r1.append("; boundsInScreen: " + r2);
        int r4 = Build.VERSION.SDK_INT;
        if (r4 < 34) goto L5;
        AbstractC1031Y.m1955c(r3, r2);
    L8:
        r1.append("; boundsInWindow: " + r2);
        r1.append("; packageName: ");
        r1.append(r3.getPackageName());
        r1.append("; className: ");
        r1.append(r3.getClassName());
        r1.append("; text: ");
        r1.append(m2045g());
        r1.append("; error: ");
        r1.append(r3.getError());
        r1.append("; maxTextLength: ");
        r1.append(r3.getMaxTextLength());
        r1.append("; stateDescription: ");
        if (r4 < 30) goto L11;
        CharSequence r22 = AbstractC0945W.m1801b(r3);
    L12:
        r1.append(r22);
        r1.append("; contentDescription: ");
        r1.append(r3.getContentDescription());
        r1.append("; supplementalDescription: ");
        if (r4 < 36) goto L15;
        CharSequence r6 = AbstractC1074Z.m2015c(r3);
    L16:
        r1.append(r6);
        r1.append("; tooltipText: ");
        r1.append(r3.getTooltipText());
        r1.append("; viewIdResName: ");
        r1.append(r3.getViewIdResourceName());
        r1.append("; uniqueId: ");
        if (r4 < 33) goto L19;
        String r7 = AbstractC0988X.m1878d(r3);
    L20:
        r1.append(r7);
        r1.append("; checkable: ");
        r1.append(r3.isCheckable());
        r1.append("; checked: ");
        if (r4 < 36) goto L23;
        int r72 = AbstractC1074Z.m2013a(r3);
    L24:
        String r8 = "PARTIAL";
        if (r72 != 1) goto L27;
        String r73 = "TRUE";
    L30:
        r1.append(r73);
        r1.append("; fieldRequired: ");
        if (r4 < 36) goto L33;
        boolean r74 = AbstractC1074Z.m2016d(r3);
    L34:
        r1.append(r74);
        r1.append("; focusable: ");
        r1.append(r3.isFocusable());
        r1.append("; focused: ");
        r1.append(r3.isFocused());
        r1.append("; selected: ");
        r1.append(r3.isSelected());
        r1.append("; clickable: ");
        r1.append(r3.isClickable());
        r1.append("; longClickable: ");
        r1.append(r3.isLongClickable());
        r1.append("; contextClickable: ");
        r1.append(r3.isContextClickable());
        r1.append("; expandedState: ");
        int r75 = 0;
        if (r4 < 36) goto L37;
        int r23 = AbstractC1074Z.m2014b(r3);
    L38:
        if (r23 == 0) goto L46;
        if (r23 == 1) goto L45;
        if (r23 != 2) goto L42;
    L47:
        r1.append(r8);
        r1.append("; enabled: ");
        r1.append(r3.isEnabled());
        r1.append("; password: ");
        r1.append(r3.isPassword());
        r1.append("; scrollable: " + r3.isScrollable());
        r1.append("; containerTitle: ");
        if (r4 < 34) goto L50;
        CharSequence r24 = AbstractC1031Y.m1956d(r3);
    L51:
        r1.append(r24);
        r1.append("; granularScrollingSupported: ");
        r1.append(m2043e(67108864));
        r1.append("; importantForAccessibility: ");
        r1.append(r3.isImportantForAccessibility());
        r1.append("; visible: ");
        r1.append(r3.isVisibleToUser());
        r1.append("; isTextSelectable: ");
        if (r4 < 33) goto L54;
        boolean r25 = AbstractC0988X.m1879e(r3);
    L55:
        r1.append(r25);
        r1.append("; accessibilityDataSensitive: ");
        if (r4 < 34) goto L58;
        boolean r26 = AbstractC1031Y.m1959g(r3);
    L59:
        r1.append(r26);
        r1.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> r27 = r3.getActionList();
        ArrayList r32 = new ArrayList();
        int r42 = r27.size();
        int r5 = 0;
    L60:
        if (r5 >= r42) goto L63;
        r32.add(new C0902V(r27.get(r5), 0, null, null, null));
        r5 = r5 + 1;
    L63:
        if (r75 >= r32.size()) goto L73;
        C0902V r28 = (C0902V) r32.get(r75);
        int r43 = r28.m1752a();
        Object r29 = r28.f2810a;
        String r44 = m2039d(r43);
        if (r44.equals("ACTION_UNKNOWN") == true) goto L67;
    L69:
        r1.append(r44);
        if (r75 == (r32.size() - 1)) goto L72;
        r1.append(", ");
    L72:
        r75 = r75 + 1;
        goto L63
    L67:
        if (((AccessibilityNodeInfo.AccessibilityAction) r29).getLabel() == null) goto L69;
        r44 = ((AccessibilityNodeInfo.AccessibilityAction) r29).getLabel().toString();
        goto L69
    L73:
        r1.append("]");
        return r1.toString();
    L58:
        r26 = m2043e(64);
        goto L59
    L54:
        r25 = m2043e(8388608);
        goto L55
    L50:
        r24 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        goto L51
    L42:
        if (r23 == 3) goto L44;
        r8 = "UNKNOWN";
        goto L47
    L44:
        r8 = "FULL";
        goto L47
    L45:
        r8 = "COLLAPSED";
        goto L47
    L46:
        r8 = "UNDEFINED";
        goto L47
    L37:
        r23 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        goto L38
    L33:
        r74 = r3.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        goto L34
    L27:
        if (r72 != 2) goto L29;
        r73 = "PARTIAL";
        goto L30
    L29:
        r73 = "FALSE";
        goto L30
    L23:
        r72 = r3.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", r3.isChecked() ? 1 : 0);
        goto L24
    L19:
        r7 = r3.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        goto L20
    L15:
        r6 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        goto L16
    L11:
        r22 = r3.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        goto L12
    L5:
        Rect r62 = (Rect) r3.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (r62 == null) goto L8;
        r2.set(r62.left, r62.top, r62.right, r62.bottom);
        goto L8
    }
}

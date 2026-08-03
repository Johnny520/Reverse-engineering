package p008E;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002B.AbstractC0053c;

/* JADX INFO: renamed from: E.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0156j {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f357a;

    /* JADX INFO: renamed from: b */
    public int f358b;

    /* JADX INFO: renamed from: c */
    public int f359c;

    public C0156j(AccessibilityNodeInfo r1, int r2) {
        this.f358b = -1;
        this.f359c = -1;
        this.f357a = r1;
    }

    /* JADX INFO: renamed from: d */
    public static String m504d(int r1) {
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
    public final void m505a(int r2) {
        this.f357a.addAction(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m506b(C0151e r2) {
        AccessibilityNodeInfo.AccessibilityAction r22 = (AccessibilityNodeInfo.AccessibilityAction) r2.f352a;
        this.f357a.addAction(r22);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m507c(String r3) {
        AccessibilityNodeInfo r02 = this.f357a;
        ArrayList<Integer> r1 = r02.getExtras().getIntegerArrayList(r3);
        if (r1 != null) goto L6;
        ArrayList<Integer> r12 = new ArrayList();
        r02.getExtras().putIntegerArrayList(r3, r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m508e(int r4) {
        Bundle r02 = this.f357a.getExtras();
        if (r02 != null) goto L6;
        return false;
    L6:
        if ((r02.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & r4) != r4) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if ((r5 instanceof C0156j) == true) goto L11;
        return false;
    L11:
        C0156j r52 = (C0156j) r5;
        AccessibilityNodeInfo r2 = r52.f357a;
        AccessibilityNodeInfo r3 = this.f357a;
        if (r3 != null) goto L16;
        if (r2 == null) goto L19;
        return false;
    L19:
        if (this.f359c == r52.f359c) goto L22;
        return false;
    L22:
        if (this.f358b == r52.f358b) goto L24;
        return false;
    L24:
        return true;
    L16:
        if (r3.equals(r2) == true) goto L19;
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m509f(Rect r2) {
        this.f357a.getBoundsInParent(r2);
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m510g() {
        boolean r1 = !m507c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo r2 = this.f357a;
        if (r1 == false) goto L10;
        ArrayList r02 = m507c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList r12 = m507c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList r3 = m507c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList r4 = m507c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int r8 = 0;
        SpannableString r5 = new SpannableString(TextUtils.substring(r2.getText(), 0, r2.getText().length()));
    L6:
        if (r8 >= r02.size()) goto L8;
        r5.setSpan(new C0147a(((Integer) r4.get(r8)).intValue(), this, r2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) r02.get(r8)).intValue(), ((Integer) r12.get(r8)).intValue(), ((Integer) r3.get(r8)).intValue());
        r8 = r8 + 1;
        goto L6
    L8:
        return r5;
    L10:
        return r2.getText();
    }

    /* JADX INFO: renamed from: h */
    public final void m511h(C0155i r2) {
        AccessibilityNodeInfo.CollectionItemInfo r22 = (AccessibilityNodeInfo.CollectionItemInfo) r2.f356a;
        this.f357a.setCollectionItemInfo(r22);
    }

    public final int hashCode() {
        AccessibilityNodeInfo r02 = this.f357a;
        if (r02 != null) goto L6;
        return 0;
    L6:
        return r02.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append(super.toString());
        Rect r1 = new Rect();
        m509f(r1);
        r02.append("; boundsInParent: " + r1);
        AccessibilityNodeInfo r2 = this.f357a;
        r2.getBoundsInScreen(r1);
        r02.append("; boundsInScreen: " + r1);
        int r3 = Build.VERSION.SDK_INT;
        if (r3 < 34) goto L5;
        AbstractC0154h.m492b(r2, r1);
    L8:
        r02.append("; boundsInWindow: " + r1);
        r02.append("; packageName: ");
        r02.append(r2.getPackageName());
        r02.append("; className: ");
        r02.append(r2.getClassName());
        r02.append("; text: ");
        r02.append(m510g());
        r02.append("; error: ");
        r02.append(r2.getError());
        r02.append("; maxTextLength: ");
        r02.append(r2.getMaxTextLength());
        r02.append("; stateDescription: ");
        if (r3 < 30) goto L11;
        CharSequence r12 = AbstractC0152f.m479b(r2);
    L12:
        r02.append(r12);
        r02.append("; contentDescription: ");
        r02.append(r2.getContentDescription());
        r02.append("; tooltipText: ");
        if (r3 < 28) goto L15;
        CharSequence r13 = AbstractC0053c.m184o(r2);
    L16:
        r02.append(r13);
        r02.append("; viewIdResName: ");
        r02.append(r2.getViewIdResourceName());
        r02.append("; uniqueId: ");
        if (r3 < 33) goto L19;
        String r5 = AbstractC0153g.m487g(r2);
    L20:
        r02.append(r5);
        r02.append("; checkable: ");
        r02.append(r2.isCheckable());
        r02.append("; checked: ");
        r02.append(r2.isChecked());
        r02.append("; focusable: ");
        r02.append(r2.isFocusable());
        r02.append("; focused: ");
        r02.append(r2.isFocused());
        r02.append("; selected: ");
        r02.append(r2.isSelected());
        r02.append("; clickable: ");
        r02.append(r2.isClickable());
        r02.append("; longClickable: ");
        r02.append(r2.isLongClickable());
        r02.append("; contextClickable: ");
        r02.append(r2.isContextClickable());
        r02.append("; enabled: ");
        r02.append(r2.isEnabled());
        r02.append("; password: ");
        r02.append(r2.isPassword());
        r02.append("; scrollable: " + r2.isScrollable());
        r02.append("; containerTitle: ");
        if (r3 < 34) goto L23;
        CharSequence r52 = AbstractC0154h.m493c(r2);
    L24:
        r02.append(r52);
        r02.append("; granularScrollingSupported: ");
        r02.append(m508e(67108864));
        r02.append("; importantForAccessibility: ");
        r02.append(r2.isImportantForAccessibility());
        r02.append("; visible: ");
        r02.append(r2.isVisibleToUser());
        r02.append("; isTextSelectable: ");
        if (r3 < 33) goto L27;
        boolean r14 = AbstractC0153g.m488h(r2);
    L28:
        r02.append(r14);
        r02.append("; accessibilityDataSensitive: ");
        if (r3 < 34) goto L31;
        boolean r15 = AbstractC0154h.m496f(r2);
    L32:
        r02.append(r15);
        r02.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> r16 = r2.getActionList();
        int r22 = 0;
        if (r16 == null) goto L37;
        ?? r32 = new ArrayList();
        int r4 = r16.size();
        int r53 = 0;
    L35:
        if (r53 >= r4) goto L39;
        r32.add(new C0151e(r16.get(r53), 0, null, null, null));
        r53 = r53 + 1;
    L39:
        if (r22 >= r32.size()) goto L49;
        C0151e r17 = (C0151e) r32.get(r22);
        String r42 = m504d(r17.m477a());
        if (r42.equals("ACTION_UNKNOWN") == false) goto L45;
        Object r18 = r17.f352a;
        if (((AccessibilityNodeInfo.AccessibilityAction) r18).getLabel() == null) goto L45;
        r42 = ((AccessibilityNodeInfo.AccessibilityAction) r18).getLabel().toString();
    L45:
        r02.append(r42);
        if (r22 == (r32.size() - 1)) goto L48;
        r02.append(", ");
    L48:
        r22 = r22 + 1;
        goto L39
    L49:
        r02.append("]");
        return r02.toString();
    L37:
        r32 = Collections.emptyList();
        goto L39
    L31:
        r15 = m508e(64);
        goto L32
    L27:
        r14 = m508e(8388608);
        goto L28
    L23:
        r52 = r2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        goto L24
    L19:
        r5 = r2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        goto L20
    L15:
        r13 = r2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        goto L16
    L11:
        r12 = r2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        goto L12
    L5:
        Rect r54 = (Rect) r2.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (r54 == null) goto L8;
        r1.set(r54.left, r54.top, r54.right, r54.bottom);
        goto L8
    }

    public C0156j(AccessibilityNodeInfo r2) {
        this.f358b = -1;
        this.f359c = -1;
        this.f357a = r2;
    }
}

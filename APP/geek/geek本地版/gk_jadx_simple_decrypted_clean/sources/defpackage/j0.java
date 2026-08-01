package defpackage;

import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final AccessibilityNodeInfo a;
    public int b;

    public j0(AccessibilityNodeInfo r2) {
        this.b = -1;
        this.a = r2;
    }

    public final void a(int r2) {
        this.a.addAction(r2);
    }

    public final void b(h0 r2) {
        AccessibilityNodeInfo.AccessibilityAction r22 = (AccessibilityNodeInfo.AccessibilityAction) r2.a;
        this.a.addAction(r22);
    }

    public final ArrayList c(String r3) {
        AccessibilityNodeInfo r0 = this.a;
        ArrayList<Integer> r1 = r0.getExtras().getIntegerArrayList(r3);
        if (r1 != null) goto L6;
        ArrayList<Integer> r12 = new ArrayList();
        r0.getExtras().putIntegerArrayList(r3, r12);
        return r12;
    L6:
        return r1;
    }

    public final void d(Rect r2) {
        this.a.getBoundsInParent(r2);
    }

    public final CharSequence e() {
        boolean r1 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo r2 = this.a;
        if (r1 == true) goto L10;
        ArrayList r0 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList r12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList r3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList r4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int r8 = 0;
        SpannableString r5 = new SpannableString(TextUtils.substring(r2.getText(), 0, r2.getText().length()));
    L6:
        if (r8 >= r0.size()) goto L8;
        r5.setSpan(new u(((Integer) r4.get(r8)).intValue(), this, r2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) r0.get(r8)).intValue(), ((Integer) r12.get(r8)).intValue(), ((Integer) r3.get(r8)).intValue());
        r8 = r8 + 1;
        goto L6
    L8:
        return r5;
    L10:
        return r2.getText();
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L5;
        return true;
    L5:
        if (r4 != null) goto L8;
        return false;
    L8:
        if ((r4 instanceof j0) == false) goto L23;
        j0 r42 = (j0) r4;
        AccessibilityNodeInfo r1 = r42.a;
        AccessibilityNodeInfo r2 = this.a;
        if (r2 != null) goto L15;
        if (r1 == null) goto L18;
        return false;
    L18:
        if (this.b == r42.b) goto L21;
        return false;
    L21:
        return true;
    L15:
        if (r2.equals(r1) == true) goto L18;
        return false;
    L23:
        return false;
    }

    public final void f(i0 r2) {
        AccessibilityNodeInfo.CollectionItemInfo r22 = (AccessibilityNodeInfo.CollectionItemInfo) r2.a;
        this.a.setCollectionItemInfo(r22);
    }

    public final int hashCode() {
        AccessibilityNodeInfo r0 = this.a;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        Rect r1 = new Rect();
        d(r1);
        r0.append("; boundsInParent: " + r1);
        AccessibilityNodeInfo r2 = this.a;
        r2.getBoundsInScreen(r1);
        r0.append("; boundsInScreen: " + r1);
        r0.append("; packageName: ");
        r0.append(r2.getPackageName());
        r0.append("; className: ");
        r0.append(r2.getClassName());
        r0.append("; text: ");
        r0.append(e());
        r0.append("; contentDescription: ");
        r0.append(r2.getContentDescription());
        r0.append("; viewId: ");
        r0.append(r2.getViewIdResourceName());
        r0.append("; uniqueId: ");
        if (ip.A() == false) goto L5;
        String r12 = e0.f(r2);
    L6:
        r0.append(r12);
        r0.append("; checkable: ");
        r0.append(r2.isCheckable());
        r0.append("; checked: ");
        r0.append(r2.isChecked());
        r0.append("; focusable: ");
        r0.append(r2.isFocusable());
        r0.append("; focused: ");
        r0.append(r2.isFocused());
        r0.append("; selected: ");
        r0.append(r2.isSelected());
        r0.append("; clickable: ");
        r0.append(r2.isClickable());
        r0.append("; longClickable: ");
        r0.append(r2.isLongClickable());
        r0.append("; enabled: ");
        r0.append(r2.isEnabled());
        r0.append("; password: ");
        r0.append(r2.isPassword());
        r0.append("; scrollable: " + r2.isScrollable());
        r0.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> r13 = r2.getActionList();
        int r22 = 0;
        if (r13 == null) goto L11;
        ?? r3 = new ArrayList();
        int r4 = r13.size();
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L13;
        r3.add(new h0(r13.get(r5), 0, null, null, null));
        r5 = r5 + 1;
    L13:
        if (r22 >= r3.size()) goto L73;
        h0 r14 = (h0) r3.get(r22);
        int r42 = r14.a();
        Object r15 = r14.a;
        if (r42 != 1) goto L17;
        String r43 = "ACTION_FOCUS";
    L65:
        if (r43.equals("ACTION_UNKNOWN") == true) goto L67;
    L69:
        r0.append(r43);
        if (r22 == (r3.size() - 1)) goto L72;
        r0.append(", ");
    L72:
        r22 = r22 + 1;
        goto L13
    L67:
        if (((AccessibilityNodeInfo.AccessibilityAction) r15).getLabel() == null) goto L69;
        r43 = ((AccessibilityNodeInfo.AccessibilityAction) r15).getLabel().toString();
        goto L69
    L17:
        if (r42 == 2) goto L62;
        switch(r42) {
            case 4: goto L61;
            case 8: goto L60;
            case 16: goto L59;
            case 32: goto L58;
            case 64: goto L57;
            case 128: goto L56;
            case 256: goto L55;
            case 512: goto L54;
            case 1024: goto L53;
            case 2048: goto L52;
            case 4096: goto L51;
            case 8192: goto L50;
            case 16384: goto L49;
            case 32768: goto L48;
            case 65536: goto L47;
            case 131072: goto L46;
            case 262144: goto L45;
            case 524288: goto L44;
            case 2097152: goto L43;
            case 16908354: goto L42;
            default: goto L19;
        };
    L19:
        switch(r42) {
            case 16908342: goto L41;
            case 16908343: goto L40;
            case 16908344: goto L39;
            case 16908345: goto L38;
            case 16908346: goto L37;
            case 16908347: goto L36;
            case 16908348: goto L35;
            case 16908349: goto L34;
            default: goto L20;
        };
    L20:
        switch(r42) {
            case 16908356: goto L33;
            case 16908357: goto L32;
            case 16908358: goto L31;
            case 16908359: goto L30;
            case 16908360: goto L29;
            case 16908361: goto L28;
            case 16908362: goto L27;
            default: goto L21;
        };
    L21:
        switch(r42) {
            case 16908372: goto L26;
            case 16908373: goto L25;
            case 16908374: goto L24;
            case 16908375: goto L23;
            default: goto L22;
        };
    L22:
        r43 = "ACTION_UNKNOWN";
        goto L65
    L23:
        r43 = "ACTION_DRAG_CANCEL";
        goto L65
    L24:
        r43 = "ACTION_DRAG_DROP";
        goto L65
    L25:
        r43 = "ACTION_DRAG_START";
        goto L65
    L26:
        r43 = "ACTION_IME_ENTER";
        goto L65
    L27:
        r43 = "ACTION_PRESS_AND_HOLD";
        goto L65
    L28:
        r43 = "ACTION_PAGE_RIGHT";
        goto L65
    L29:
        r43 = "ACTION_PAGE_LEFT";
        goto L65
    L30:
        r43 = "ACTION_PAGE_DOWN";
        goto L65
    L31:
        r43 = "ACTION_PAGE_UP";
        goto L65
    L32:
        r43 = "ACTION_HIDE_TOOLTIP";
        goto L65
    L33:
        r43 = "ACTION_SHOW_TOOLTIP";
        goto L65
    L34:
        r43 = "ACTION_SET_PROGRESS";
        goto L65
    L35:
        r43 = "ACTION_CONTEXT_CLICK";
        goto L65
    L36:
        r43 = "ACTION_SCROLL_RIGHT";
        goto L65
    L37:
        r43 = "ACTION_SCROLL_DOWN";
        goto L65
    L38:
        r43 = "ACTION_SCROLL_LEFT";
        goto L65
    L39:
        r43 = "ACTION_SCROLL_UP";
        goto L65
    L40:
        r43 = "ACTION_SCROLL_TO_POSITION";
        goto L65
    L41:
        r43 = "ACTION_SHOW_ON_SCREEN";
        goto L65
    L42:
        r43 = "ACTION_MOVE_WINDOW";
        goto L65
    L43:
        r43 = "ACTION_SET_TEXT";
        goto L65
    L44:
        r43 = "ACTION_COLLAPSE";
        goto L65
    L45:
        r43 = "ACTION_EXPAND";
        goto L65
    L46:
        r43 = "ACTION_SET_SELECTION";
        goto L65
    L47:
        r43 = "ACTION_CUT";
        goto L65
    L48:
        r43 = "ACTION_PASTE";
        goto L65
    L49:
        r43 = "ACTION_COPY";
        goto L65
    L50:
        r43 = "ACTION_SCROLL_BACKWARD";
        goto L65
    L51:
        r43 = "ACTION_SCROLL_FORWARD";
        goto L65
    L52:
        r43 = "ACTION_PREVIOUS_HTML_ELEMENT";
        goto L65
    L53:
        r43 = "ACTION_NEXT_HTML_ELEMENT";
        goto L65
    L54:
        r43 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        goto L65
    L55:
        r43 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        goto L65
    L56:
        r43 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        goto L65
    L57:
        r43 = "ACTION_ACCESSIBILITY_FOCUS";
        goto L65
    L58:
        r43 = "ACTION_LONG_CLICK";
        goto L65
    L59:
        r43 = "ACTION_CLICK";
        goto L65
    L60:
        r43 = "ACTION_CLEAR_SELECTION";
        goto L65
    L61:
        r43 = "ACTION_SELECT";
        goto L65
    L62:
        r43 = "ACTION_CLEAR_FOCUS";
        goto L65
    L73:
        r0.append("]");
        return r0.toString();
    L11:
        r3 = Collections.EMPTY_LIST;
        goto L13
    L5:
        r12 = r2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        goto L6
    }
}

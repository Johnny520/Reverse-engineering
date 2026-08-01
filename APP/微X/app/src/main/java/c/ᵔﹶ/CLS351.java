// Decompiled by JEB v5.42.0.202606242140

package c.ᵔﹶ;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;

public class CLS351 {
    public static class CLS350 {
        public static final CLS350 FLD1538;
        public static final CLS350 FLD1539;
        public static final CLS350 FLD1540;
        public static final CLS350 FLD1541;
        public static final CLS350 FLD1542;
        public final Object FLD1543;
        public static final CLS350 FLD1544;
        public static final CLS350 FLD1545;
        public static final CLS350 FLD1546;
        public static final CLS350 FLD1547;
        public static final CLS350 FLD1548;
        public static final CLS350 FLD1549;
        public static final CLS350 FLD1550;
        public static final CLS350 FLD1551;
        public static final CLS350 FLD1552;
        public static final CLS350 FLD1553;
        public static final CLS350 FLD1554;
        public static final CLS350 FLD1555;
        public static final CLS350 FLD1556;
        public static final CLS350 FLD1557;
        public static final CLS350 FLD1558;
        public static final CLS350 FLD1559;
        public static final CLS350 FLD1560;
        public static final CLS350 FLD1561;
        public static final CLS350 FLD1562;
        public static final CLS350 FLD1563;
        public static final CLS350 FLD1564;
        public static final CLS350 FLD1565;
        public static final CLS350 FLD1566;
        public static final CLS350 FLD1567;
        public static final CLS350 FLD1568;
        public static final CLS350 FLD1569;
        public static final CLS350 FLD1570;
        public static final CLS350 FLD1571;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
            CLS350.FLD1539 = new CLS350(1, null);
            CLS350.FLD1560 = new CLS350(2, null);
            CLS350.FLD1568 = new CLS350(4, null);
            CLS350.FLD1541 = new CLS350(8, null);
            CLS350.FLD1567 = new CLS350(16, null);
            CLS350.FLD1563 = new CLS350(0x20, null);
            CLS350.FLD1565 = new CLS350(0x40, null);
            CLS350.FLD1551 = new CLS350(0x80, null);
            CLS350.FLD1556 = new CLS350(0x100, null);
            CLS350.FLD1546 = new CLS350(0x200, null);
            CLS350.FLD1540 = new CLS350(0x400, null);
            CLS350.FLD1557 = new CLS350(0x800, null);
            CLS350.FLD1550 = new CLS350(0x1000, null);
            CLS350.FLD1542 = new CLS350(0x2000, null);
            CLS350.FLD1552 = new CLS350(0x4000, null);
            CLS350.FLD1555 = new CLS350(0x8000, null);
            CLS350.FLD1562 = new CLS350(0x10000, null);
            CLS350.FLD1558 = new CLS350(0x20000, null);
            CLS350.FLD1559 = new CLS350(0x40000, null);
            CLS350.FLD1549 = new CLS350(0x80000, null);
            CLS350.FLD1571 = new CLS350(0x100000, null);
            CLS350.FLD1561 = new CLS350(0x200000, null);
            int v = Build.VERSION.SDK_INT;
            CLS350.FLD1564 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN));
            CLS350.FLD1548 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION));
            CLS350.FLD1554 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP));
            CLS350.FLD1553 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT));
            CLS350.FLD1544 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN));
            CLS350.FLD1569 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT));
            CLS350.FLD1545 = new CLS350((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK));
            CLS350.FLD1538 = new CLS350((v < 24 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS));
            CLS350.FLD1547 = new CLS350((v < 26 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW));
            CLS350.FLD1570 = new CLS350((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP));
            if(v >= 28) {
                accessibilityNodeInfo$AccessibilityAction0 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            CLS350.FLD1566 = new CLS350(accessibilityNodeInfo$AccessibilityAction0);
        }

        public CLS350(int v, CharSequence charSequence0) {
            this((Build.VERSION.SDK_INT < 21 ? null : new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0)));
        }

        public CLS350(Object object0) {
            this.FLD1543 = object0;
        }
    }

    public int FLD1572;
    public final AccessibilityNodeInfo FLD1573;

    public CLS351(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.FLD1572 = -1;
        this.FLD1573 = accessibilityNodeInfo0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(this.getClass() != object0.getClass()) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = ((CLS351)object0).FLD1573;
        return this.FLD1573 == null ? accessibilityNodeInfo0 == null : this.FLD1573.equals(accessibilityNodeInfo0);
    }

    @Override
    public int hashCode() {
        return this.FLD1573 == null ? 0 : this.FLD1573.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.MTH4860(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0);
        this.MTH4888(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0);
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.MTH4870());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.MTH4883());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.MTH4876());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.MTH4885());
        stringBuilder0.append("; viewId: ");
        stringBuilder0.append(this.MTH4865());
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.MTH4877());
        stringBuilder0.append("; checked: ");
        stringBuilder0.append(this.MTH4869());
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.MTH4874());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.MTH4882());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.MTH4895());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.MTH4861());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.MTH4878());
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.MTH4871());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.MTH4879());
        stringBuilder0.append("; scrollable: " + this.MTH4868());
        stringBuilder0.append("; [");
        int v = this.MTH4889();
        while(v != 0) {
            int v1 = Integer.numberOfTrailingZeros(v);
            v &= ~(1 << v1);
            stringBuilder0.append(CLS351.MTH4880(1 << v1));
            if(v != 0) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public void MTH4853(boolean z) {
        this.FLD1573.setClickable(z);
    }

    public void MTH4854(boolean z) {
        this.FLD1573.setFocused(z);
    }

    public void MTH4855(View view0) {
        this.FLD1573.addChild(view0);
    }

    public void MTH4856(View view0) {
        this.FLD1573.setSource(view0);
    }

    public void MTH4857(CharSequence charSequence0) {
        this.FLD1573.setPackageName(charSequence0);
    }

    public void MTH4858(boolean z) {
        if(Build.VERSION.SDK_INT >= 16) {
            this.FLD1573.setVisibleToUser(z);
        }
    }

    public boolean MTH4859() {
        return Build.VERSION.SDK_INT < 16 ? false : this.FLD1573.isAccessibilityFocused();
    }

    public void MTH4860(Rect rect0) {
        this.FLD1573.getBoundsInParent(rect0);
    }

    public boolean MTH4861() {
        return this.FLD1573.isClickable();
    }

    public void MTH4862(int v) {
        this.FLD1573.addAction(v);
    }

    public void MTH4863(Rect rect0) {
        this.FLD1573.setBoundsInParent(rect0);
    }

    public void MTH4864(CharSequence charSequence0) {
        this.FLD1573.setClassName(charSequence0);
    }

    public String MTH4865() {
        return Build.VERSION.SDK_INT < 18 ? null : this.FLD1573.getViewIdResourceName();
    }

    public void MTH4866(CharSequence charSequence0) {
        this.FLD1573.setContentDescription(charSequence0);
    }

    public void MTH4867() {
        this.FLD1573.recycle();
    }

    public boolean MTH4868() {
        return this.FLD1573.isScrollable();
    }

    public boolean MTH4869() {
        return this.FLD1573.isChecked();
    }

    public CharSequence MTH4870() {
        return this.FLD1573.getPackageName();
    }

    public boolean MTH4871() {
        return this.FLD1573.isEnabled();
    }

    public void MTH4872(boolean z) {
        if(Build.VERSION.SDK_INT >= 16) {
            this.FLD1573.setAccessibilityFocused(z);
        }
    }

    public boolean MTH4873(CLS350 ٴˈ$ˆٴ0) {
        return Build.VERSION.SDK_INT < 21 ? false : this.FLD1573.removeAction(((AccessibilityNodeInfo.AccessibilityAction)ٴˈ$ˆٴ0.FLD1543));
    }

    public boolean MTH4874() {
        return this.FLD1573.isFocusable();
    }

    public void MTH4875(View view0) {
        this.FLD1573.setParent(view0);
    }

    public CharSequence MTH4876() {
        return this.FLD1573.getText();
    }

    public boolean MTH4877() {
        return this.FLD1573.isCheckable();
    }

    public boolean MTH4878() {
        return this.FLD1573.isLongClickable();
    }

    public boolean MTH4879() {
        return this.FLD1573.isPassword();
    }

    public static String MTH4880(int v) {
        switch(v) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 0x20: {
                return "ACTION_LONG_CLICK";
            }
            case 0x40: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 0x80: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 0x100: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 0x200: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 0x400: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 0x800: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 0x1000: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 0x2000: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 0x4000: {
                return "ACTION_COPY";
            }
            case 0x8000: {
                return "ACTION_PASTE";
            }
            case 0x10000: {
                return "ACTION_CUT";
            }
            case 0x20000: {
                return "ACTION_SET_SELECTION";
            }
            default: {
                return "ACTION_UNKNOWN";
            }
        }
    }

    public boolean MTH4881() {
        return Build.VERSION.SDK_INT < 16 ? false : this.FLD1573.isVisibleToUser();
    }

    public boolean MTH4882() {
        return this.FLD1573.isFocused();
    }

    public CharSequence MTH4883() {
        return this.FLD1573.getClassName();
    }

    public static CLS351 MTH4884(CLS351 ٴˈ0) {
        return CLS351.MTH4887(AccessibilityNodeInfo.obtain(ٴˈ0.FLD1573));
    }

    public CharSequence MTH4885() {
        return this.FLD1573.getContentDescription();
    }

    public void MTH4886(boolean z) {
        this.FLD1573.setFocusable(z);
    }

    public static CLS351 MTH4887(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return new CLS351(accessibilityNodeInfo0);
    }

    public void MTH4888(Rect rect0) {
        this.FLD1573.getBoundsInScreen(rect0);
    }

    public int MTH4889() {
        return this.FLD1573.getActions();
    }

    public void MTH4890(Rect rect0) {
        this.FLD1573.setBoundsInScreen(rect0);
    }

    public void MTH4891(boolean z) {
        this.FLD1573.setEnabled(z);
    }

    public void MTH4892(boolean z) {
        this.FLD1573.setLongClickable(z);
    }

    public void MTH4893(boolean z) {
        this.FLD1573.setSelected(z);
    }

    public AccessibilityNodeInfo MTH4894() {
        return this.FLD1573;
    }

    public boolean MTH4895() {
        return this.FLD1573.isSelected();
    }
}


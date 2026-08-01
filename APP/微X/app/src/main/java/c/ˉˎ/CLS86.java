// Decompiled by JEB v5.42.0.202606242140

package c.ˉˎ;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;

public class CLS86 {
    public static class CLS85 {
        public static final CLS85 FLD258;
        public static final CLS85 FLD259;
        public static final CLS85 FLD260;
        public static final CLS85 FLD261;
        public static final CLS85 FLD262;
        public static final CLS85 FLD263;
        public static final CLS85 FLD264;
        public static final CLS85 FLD265;
        public static final CLS85 FLD266;
        public static final CLS85 FLD267;
        public static final CLS85 FLD268;
        public static final CLS85 FLD269;
        public static final CLS85 FLD270;
        public static final CLS85 FLD271;
        public static final CLS85 FLD272;
        public static final CLS85 FLD273;
        public static final CLS85 FLD274;
        public static final CLS85 FLD275;
        public static final CLS85 FLD276;
        public static final CLS85 FLD277;
        public static final CLS85 FLD278;
        public static final CLS85 FLD279;
        public static final CLS85 FLD280;
        public static final CLS85 FLD281;
        public static final CLS85 FLD282;
        public static final CLS85 FLD283;
        public static final CLS85 FLD284;
        public static final CLS85 FLD285;
        public static final CLS85 FLD286;
        public final Object FLD287;
        public static final CLS85 FLD288;
        public static final CLS85 FLD289;
        public static final CLS85 FLD290;
        public static final CLS85 FLD291;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
            CLS85.FLD291 = new CLS85(1, null);
            CLS85.FLD261 = new CLS85(2, null);
            CLS85.FLD267 = new CLS85(4, null);
            CLS85.FLD265 = new CLS85(8, null);
            CLS85.FLD270 = new CLS85(16, null);
            CLS85.FLD290 = new CLS85(0x20, null);
            CLS85.FLD285 = new CLS85(0x40, null);
            CLS85.FLD262 = new CLS85(0x80, null);
            CLS85.FLD286 = new CLS85(0x100, null);
            CLS85.FLD269 = new CLS85(0x200, null);
            CLS85.FLD264 = new CLS85(0x400, null);
            CLS85.FLD266 = new CLS85(0x800, null);
            CLS85.FLD272 = new CLS85(0x1000, null);
            CLS85.FLD284 = new CLS85(0x2000, null);
            CLS85.FLD288 = new CLS85(0x4000, null);
            CLS85.FLD278 = new CLS85(0x8000, null);
            CLS85.FLD282 = new CLS85(0x10000, null);
            CLS85.FLD275 = new CLS85(0x20000, null);
            CLS85.FLD276 = new CLS85(0x40000, null);
            CLS85.FLD273 = new CLS85(0x80000, null);
            CLS85.FLD281 = new CLS85(0x100000, null);
            CLS85.FLD260 = new CLS85(0x200000, null);
            int v = Build.VERSION.SDK_INT;
            CLS85.FLD258 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN));
            CLS85.FLD268 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION));
            CLS85.FLD289 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP));
            CLS85.FLD279 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT));
            CLS85.FLD271 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN));
            CLS85.FLD263 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT));
            CLS85.FLD277 = new CLS85((v < 23 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK));
            CLS85.FLD283 = new CLS85((v < 24 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS));
            CLS85.FLD280 = new CLS85((v < 26 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW));
            CLS85.FLD259 = new CLS85((v < 28 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP));
            if(v >= 28) {
                accessibilityNodeInfo$AccessibilityAction0 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            CLS85.FLD274 = new CLS85(accessibilityNodeInfo$AccessibilityAction0);
        }

        public CLS85(int v, CharSequence charSequence0) {
            this((Build.VERSION.SDK_INT < 21 ? null : new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0)));
        }

        public CLS85(Object object0) {
            this.FLD287 = object0;
        }
    }

    public final AccessibilityNodeInfo FLD292;
    public int FLD293;

    public CLS86(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.FLD293 = -1;
        this.FLD292 = accessibilityNodeInfo0;
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
        AccessibilityNodeInfo accessibilityNodeInfo0 = ((CLS86)object0).FLD292;
        return this.FLD292 == null ? accessibilityNodeInfo0 == null : this.FLD292.equals(accessibilityNodeInfo0);
    }

    @Override
    public int hashCode() {
        return this.FLD292 == null ? 0 : this.FLD292.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.MTH1192(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0);
        this.MTH1197(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0);
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.MTH1188());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.MTH1224());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.MTH1217());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.MTH1216());
        stringBuilder0.append("; viewId: ");
        stringBuilder0.append(this.MTH1196());
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.MTH1193());
        stringBuilder0.append("; checked: ");
        stringBuilder0.append(this.MTH1199());
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.MTH1205());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.MTH1212());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.MTH1209());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.MTH1214());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.MTH1202());
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.MTH1221());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.MTH1203());
        stringBuilder0.append("; scrollable: " + this.MTH1200());
        stringBuilder0.append("; [");
        int v = this.MTH1194();
        while(v != 0) {
            int v1 = Integer.numberOfTrailingZeros(v);
            v &= ~(1 << v1);
            stringBuilder0.append(CLS86.MTH1187(1 << v1));
            if(v != 0) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public static CLS86 MTH1183(CLS86 ᴵˉ0) {
        return CLS86.MTH1218(AccessibilityNodeInfo.obtain(ᴵˉ0.FLD292));
    }

    public void MTH1184(View view0) {
        this.FLD292.setSource(view0);
    }

    public void MTH1185(boolean z) {
        this.FLD292.setEnabled(z);
    }

    public boolean MTH1186() {
        return Build.VERSION.SDK_INT < 16 ? false : this.FLD292.isVisibleToUser();
    }

    public static String MTH1187(int v) {
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

    public CharSequence MTH1188() {
        return this.FLD292.getPackageName();
    }

    public void MTH1189(Rect rect0) {
        this.FLD292.setBoundsInScreen(rect0);
    }

    public void MTH1190(boolean z) {
        if(Build.VERSION.SDK_INT >= 16) {
            this.FLD292.setVisibleToUser(z);
        }
    }

    public boolean MTH1191() {
        return Build.VERSION.SDK_INT < 16 ? false : this.FLD292.isAccessibilityFocused();
    }

    public void MTH1192(Rect rect0) {
        this.FLD292.getBoundsInParent(rect0);
    }

    public boolean MTH1193() {
        return this.FLD292.isCheckable();
    }

    public int MTH1194() {
        return this.FLD292.getActions();
    }

    public void MTH1195() {
        this.FLD292.recycle();
    }

    public String MTH1196() {
        return Build.VERSION.SDK_INT < 18 ? null : this.FLD292.getViewIdResourceName();
    }

    public void MTH1197(Rect rect0) {
        this.FLD292.getBoundsInScreen(rect0);
    }

    public void MTH1198(Rect rect0) {
        this.FLD292.setBoundsInParent(rect0);
    }

    public boolean MTH1199() {
        return this.FLD292.isChecked();
    }

    public boolean MTH1200() {
        return this.FLD292.isScrollable();
    }

    public void MTH1201(boolean z) {
        this.FLD292.setFocusable(z);
    }

    public boolean MTH1202() {
        return this.FLD292.isLongClickable();
    }

    public boolean MTH1203() {
        return this.FLD292.isPassword();
    }

    public void MTH1204(CharSequence charSequence0) {
        this.FLD292.setClassName(charSequence0);
    }

    public boolean MTH1205() {
        return this.FLD292.isFocusable();
    }

    public void MTH1206(boolean z) {
        if(Build.VERSION.SDK_INT >= 16) {
            this.FLD292.setAccessibilityFocused(z);
        }
    }

    public void MTH1207(CharSequence charSequence0) {
        this.FLD292.setContentDescription(charSequence0);
    }

    public void MTH1208(boolean z) {
        this.FLD292.setLongClickable(z);
    }

    public boolean MTH1209() {
        return this.FLD292.isSelected();
    }

    public void MTH1210(CharSequence charSequence0) {
        this.FLD292.setPackageName(charSequence0);
    }

    public AccessibilityNodeInfo MTH1211() {
        return this.FLD292;
    }

    public boolean MTH1212() {
        return this.FLD292.isFocused();
    }

    public void MTH1213(boolean z) {
        this.FLD292.setClickable(z);
    }

    public boolean MTH1214() {
        return this.FLD292.isClickable();
    }

    public void MTH1215(View view0) {
        this.FLD292.setParent(view0);
    }

    public CharSequence MTH1216() {
        return this.FLD292.getContentDescription();
    }

    public CharSequence MTH1217() {
        return this.FLD292.getText();
    }

    public static CLS86 MTH1218(AccessibilityNodeInfo accessibilityNodeInfo0) {
        return new CLS86(accessibilityNodeInfo0);
    }

    public void MTH1219(int v) {
        this.FLD292.addAction(v);
    }

    public void MTH1220(boolean z) {
        this.FLD292.setFocused(z);
    }

    public boolean MTH1221() {
        return this.FLD292.isEnabled();
    }

    public void MTH1222(boolean z) {
        this.FLD292.setSelected(z);
    }

    public boolean MTH1223(CLS85 ᴵˉ$ⁱˋ0) {
        return Build.VERSION.SDK_INT < 21 ? false : this.FLD292.removeAction(((AccessibilityNodeInfo.AccessibilityAction)ᴵˉ$ⁱˋ0.FLD287));
    }

    public CharSequence MTH1224() {
        return this.FLD292.getClassName();
    }

    public void MTH1225(View view0) {
        this.FLD292.addChild(view0);
    }
}


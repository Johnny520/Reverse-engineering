// Decompiled by JEB v5.42.0.202606242140

package c.ʾʻ;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c.ˉˎ.CLS83;
import c.ˉˎ.CLS86;

public class CLS27 {
    public static final class CLS26 extends View.AccessibilityDelegate {
        public final CLS27 FLD122;

        public CLS26(CLS27 ʾʻ0) {
            this.FLD122 = ʾʻ0;
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            return this.FLD122.MTH824(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
            CLS83 ˏᴵ0 = this.FLD122.MTH826(view0);
            return ˏᴵ0 == null ? null : ((AccessibilityNodeProvider)ˏᴵ0.MTH1174());
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD122.MTH820(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
            CLS86 ᴵˉ0 = CLS86.MTH1218(accessibilityNodeInfo0);
            this.FLD122.MTH819(view0, ᴵˉ0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD122.MTH821(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return this.FLD122.MTH825(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
            return this.FLD122.MTH822(view0, v, bundle0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEvent(View view0, int v) {
            this.FLD122.MTH818(view0, v);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD122.MTH823(view0, accessibilityEvent0);
        }
    }

    public final View.AccessibilityDelegate FLD123;
    public static final View.AccessibilityDelegate FLD124;

    static {
        CLS27.FLD124 = new View.AccessibilityDelegate();
    }

    public CLS27() {
        this.FLD123 = new CLS26(this);
    }

    public View.AccessibilityDelegate MTH817() {
        return this.FLD123;
    }

    public void MTH818(View view0, int v) {
        CLS27.FLD124.sendAccessibilityEvent(view0, v);
    }

    public void MTH819(View view0, CLS86 ᴵˉ0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = ᴵˉ0.MTH1211();
        CLS27.FLD124.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
    }

    public void MTH820(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS27.FLD124.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void MTH821(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS27.FLD124.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean MTH822(View view0, int v, Bundle bundle0) {
        return Build.VERSION.SDK_INT < 16 ? false : CLS27.FLD124.performAccessibilityAction(view0, v, bundle0);
    }

    public void MTH823(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS27.FLD124.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }

    public boolean MTH824(View view0, AccessibilityEvent accessibilityEvent0) {
        return CLS27.FLD124.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean MTH825(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return CLS27.FLD124.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public CLS83 MTH826(View view0) {
        if(Build.VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider0 = CLS27.FLD124.getAccessibilityNodeProvider(view0);
            return accessibilityNodeProvider0 == null ? null : new CLS83(accessibilityNodeProvider0);
        }
        return null;
    }
}


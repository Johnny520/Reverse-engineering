// Decompiled by JEB v5.42.0.202606242140

package c.ـᵎ;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import c.ᵔﹶ.CLS348;
import c.ᵔﹶ.CLS351;

public class CLS276 {
    public static final class CLS275 extends View.AccessibilityDelegate {
        public final CLS276 FLD1196;

        public CLS275(CLS276 ـᵎ0) {
            this.FLD1196 = ـᵎ0;
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            return this.FLD1196.MTH4176(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view0) {
            CLS348 יᵢ0 = this.FLD1196.MTH4174(view0);
            return יᵢ0 == null ? null : ((AccessibilityNodeProvider)יᵢ0.MTH4844());
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD1196.MTH4183(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
            CLS351 ٴˈ0 = CLS351.MTH4887(accessibilityNodeInfo0);
            this.FLD1196.MTH4175(view0, ٴˈ0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD1196.MTH4182(view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
            return this.FLD1196.MTH4180(viewGroup0, view0, accessibilityEvent0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public boolean performAccessibilityAction(View view0, int v, Bundle bundle0) {
            return this.FLD1196.MTH4181(view0, v, bundle0);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEvent(View view0, int v) {
            this.FLD1196.MTH4177(view0, v);
        }

        @Override  // android.view.View$AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view0, AccessibilityEvent accessibilityEvent0) {
            this.FLD1196.MTH4178(view0, accessibilityEvent0);
        }
    }

    public static final View.AccessibilityDelegate FLD1197;
    public final View.AccessibilityDelegate FLD1198;

    static {
        CLS276.FLD1197 = new View.AccessibilityDelegate();
    }

    public CLS276() {
        this.FLD1198 = new CLS275(this);
    }

    public CLS348 MTH4174(View view0) {
        if(Build.VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider accessibilityNodeProvider0 = CLS276.FLD1197.getAccessibilityNodeProvider(view0);
            return accessibilityNodeProvider0 == null ? null : new CLS348(accessibilityNodeProvider0);
        }
        return null;
    }

    public void MTH4175(View view0, CLS351 ٴˈ0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = ٴˈ0.MTH4894();
        CLS276.FLD1197.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
    }

    public boolean MTH4176(View view0, AccessibilityEvent accessibilityEvent0) {
        return CLS276.FLD1197.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void MTH4177(View view0, int v) {
        CLS276.FLD1197.sendAccessibilityEvent(view0, v);
    }

    public void MTH4178(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS276.FLD1197.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }

    public View.AccessibilityDelegate MTH4179() {
        return this.FLD1198;
    }

    public boolean MTH4180(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return CLS276.FLD1197.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public boolean MTH4181(View view0, int v, Bundle bundle0) {
        return Build.VERSION.SDK_INT < 16 ? false : CLS276.FLD1197.performAccessibilityAction(view0, v, bundle0);
    }

    public void MTH4182(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS276.FLD1197.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void MTH4183(View view0, AccessibilityEvent accessibilityEvent0) {
        CLS276.FLD1197.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }
}


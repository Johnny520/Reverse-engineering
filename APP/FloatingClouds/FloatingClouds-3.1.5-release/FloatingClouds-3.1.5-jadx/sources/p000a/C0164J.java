package p000a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: a.J */
/* JADX INFO: loaded from: classes.dex */
public class C0164J {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeProvider f586a;

    /* JADX INFO: renamed from: a.J$a */
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final C0164J f587a;

        public a(C0164J c0164j) {
            this.f587a = c0164j;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0146I c0146iMo453a = this.f587a.mo453a(i);
            if (c0146iMo453a == null) {
                return null;
            }
            return c0146iMo453a.f505a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f587a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            C0146I c0146iMo454b = this.f587a.mo454b(i);
            if (c0146iMo454b == null) {
                return null;
            }
            return c0146iMo454b.f505a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f587a.mo455c(i, i2, bundle);
        }
    }

    /* JADX INFO: renamed from: a.J$b */
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f587a.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0164J() {
        this.f586a = new b(this);
    }

    /* JADX INFO: renamed from: a */
    public C0146I mo453a(int i) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public C0146I mo454b(int i) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo455c(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0164J(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f586a = accessibilityNodeProvider;
    }
}

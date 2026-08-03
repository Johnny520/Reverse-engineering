package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.github.cherrywechat.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: O */
/* JADX INFO: loaded from: classes.dex */
public final class C0602O extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C0645P f1942a;

    public C0602O(C0645P r1) {
        this.f1942a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        return this.f1942a.mo316a(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View r2) {
        C0132D2 r22 = this.f1942a.mo317b(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return (AccessibilityNodeProvider) r22.f328b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.f1942a.mo318c(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r5, AccessibilityNodeInfo r6) {
        C1118a0 r0 = new C1118a0(r6);
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        r6.setScreenReaderFocusable(Boolean.valueOf(AbstractC1492hE.m2852c(r5)).booleanValue());
        r6.setHeading(Boolean.valueOf(AbstractC1492hE.m2851b(r5)).booleanValue());
        r6.setPaneTitle(AbstractC1492hE.m2850a(r5));
        if (Build.VERSION.SDK_INT < 30) goto L5;
        Object r12 = AbstractC2093jE.m4278b(r5);
    L9:
        CharSequence r13 = (CharSequence) r12;
        if (Build.VERSION.SDK_INT < 30) goto L12;
        AbstractC0945W.m1805f(r6, r13);
    L13:
        this.f1942a.mo319d(r5, r0);
        r6.getText();
        List r52 = (List) r5.getTag(R.id.tag_accessibility_actions);
        if (r52 != null) goto L16;
        r52 = Collections.EMPTY_LIST;
    L16:
        int r62 = 0;
    L18:
        if (r62 >= r52.size()) goto L20;
        r0.m2041b((C0902V) r52.get(r62));
        r62 = r62 + 1;
        goto L18
    L20:
        return;
    L12:
        r6.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", r13);
        goto L13
    L5:
        r12 = r5.getTag(R.id.tag_state_description);
        if (CharSequence.class.isInstance(r12) == true) goto L9;
        r12 = null;
        goto L9
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.f1942a.mo320e(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.f1942a.mo321f(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View r2, int r3, Bundle r4) {
        return this.f1942a.mo322g(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View r2, int r3) {
        this.f1942a.mo323h(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View r2, AccessibilityEvent r3) {
        this.f1942a.mo324i(r2, r3);
    }
}

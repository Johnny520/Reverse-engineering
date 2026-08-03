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

    public C0602O(C0645P c0645p) {
        this.f1942a = c0645p;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1942a.mo316a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0132D2 c0132d2Mo317b = this.f1942a.mo317b(view);
        if (c0132d2Mo317b != null) {
            return (AccessibilityNodeProvider) c0132d2Mo317b.f328b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1942a.mo318c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        C1118a0 c1118a0 = new C1118a0(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(AbstractC1492hE.m2852c(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(AbstractC1492hE.m2851b(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(AbstractC1492hE.m2850a(view));
        if (Build.VERSION.SDK_INT >= 30) {
            tag = AbstractC2093jE.m4278b(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0945W.m1805f(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f1942a.mo319d(view, c1118a0);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i = 0; i < list.size(); i++) {
            c1118a0.m2041b((C0902V) list.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f1942a.mo320e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1942a.mo321f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f1942a.mo322g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f1942a.mo323h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f1942a.mo324i(view, accessibilityEvent);
    }
}

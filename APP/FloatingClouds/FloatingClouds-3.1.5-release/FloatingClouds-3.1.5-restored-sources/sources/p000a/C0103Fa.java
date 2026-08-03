package p000a;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: a.Fa */
/* JADX INFO: loaded from: classes.dex */
public final class C0103Fa extends C0038C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f359d;

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        switch (this.f359d) {
            case 0:
                this.f137a.onInitializeAccessibilityNodeInfo(view, c0146i.f505a);
                c0146i.m383i(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate = this.f137a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
        }
    }
}

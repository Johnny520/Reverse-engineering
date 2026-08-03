package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0155i {

    /* JADX INFO: renamed from: a */
    public final Object f356a;

    public C0155i(AccessibilityNodeInfo.CollectionItemInfo r1) {
        this.f356a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static C0155i m503a(boolean r7, int r8, int r9, int r10, int r11) {
        return new C0155i(AccessibilityNodeInfo.CollectionItemInfo.obtain(r8, r9, r10, r11, false, r7));
    }
}

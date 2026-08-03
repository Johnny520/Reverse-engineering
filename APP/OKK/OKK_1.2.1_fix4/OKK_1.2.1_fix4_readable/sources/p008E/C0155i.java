package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0155i {

    /* JADX INFO: renamed from: a */
    public final Object f356a;

    public C0155i(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f356a = collectionItemInfo;
    }

    /* JADX INFO: renamed from: a */
    public static C0155i m503a(boolean z2, int i2, int i3, int i4, int i5) {
        return new C0155i(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, false, z2));
    }
}

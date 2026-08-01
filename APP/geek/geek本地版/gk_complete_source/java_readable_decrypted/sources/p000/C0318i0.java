package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0318i0 {

    /* JADX INFO: renamed from: b */
    public static C0318i0 f2323b;

    /* JADX INFO: renamed from: a */
    public final Object f2324a;

    public C0318i0() {
        this.f2324a = new Object();
        new Handler(Looper.getMainLooper(), new v30(this));
    }

    /* JADX INFO: renamed from: a */
    public static C0318i0 m1382a(boolean z, int i, int i2, int i3, int i4) {
        return new C0318i0(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public C0318i0(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f2324a = collectionItemInfo;
    }
}

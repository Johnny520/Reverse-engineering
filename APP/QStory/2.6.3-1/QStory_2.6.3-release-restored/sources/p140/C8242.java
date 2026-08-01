package p140;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
import p250.C8907;

/* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8242 f20443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f20444;

    public C8242() {
        this.f20444 = new Object();
        new Handler(Looper.getMainLooper(), new C8907(this, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C8242 m13201(boolean z, int i, int i2, int i3, int i4) {
        return new C8242(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8242 m13202(int i, int i2, int i3) {
        return new C8242(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public /* synthetic */ C8242(Object obj) {
        this.f20444 = obj;
    }
}

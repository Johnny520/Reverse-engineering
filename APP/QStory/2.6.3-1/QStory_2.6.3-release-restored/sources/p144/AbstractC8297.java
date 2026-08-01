package p144;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8297 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8295 f20551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8301 f20552;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f20552 = new C8302();
        } else {
            f20552 = new C8301();
        }
        f20551 = new C8295("translationAlpha", 5, Float.class);
        new C8295("clipBounds", 6, Rect.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m13244(View view, int i) {
        f20552.mo13249(view, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13245(View view, int i, int i2, int i3, int i4) {
        f20552.mo13251(view, i, i2, i3, i4);
    }
}

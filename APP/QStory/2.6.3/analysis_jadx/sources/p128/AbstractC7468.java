package p128;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7466 f20206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7472 f20207;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f20207 = new C7473();
        } else {
            f20207 = new C7472();
        }
        f20206 = new C7466("translationAlpha", 5, Float.class);
        new C7466("clipBounds", 6, Rect.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12685(View view, int i) {
        f20207.mo12690(view, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12686(View view, int i, int i2, int i3, int i4) {
        f20207.mo12692(view, i, i2, i3, i4);
    }
}

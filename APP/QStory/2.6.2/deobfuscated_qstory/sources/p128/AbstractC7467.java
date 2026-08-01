package p128;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7467 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7465 f20211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7471 f20212;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f20212 = new C7472(15);
        } else {
            f20212 = new C7471(15);
        }
        f20211 = new C7465("translationAlpha", 5, Float.class);
        new C7465("clipBounds", 6, Rect.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12658(View view, int i) {
        f20212.mo12663(view, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12659(View view, int i, int i2, int i3, int i4) {
        f20212.mo12665(view, i, i2, i3, i4);
    }
}

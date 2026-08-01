package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.AbstractC0626;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2275 f6603;

    public C2274(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6603 = new C2272(AbstractC0626.m1409(i, interpolator, j));
        } else {
            this.f6603 = new C2277(i, interpolator, j);
        }
    }
}

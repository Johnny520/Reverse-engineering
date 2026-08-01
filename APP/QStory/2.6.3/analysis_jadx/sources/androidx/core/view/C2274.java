package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.AbstractC0626;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2275 f6604;

    public C2274(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6604 = new C2272(AbstractC0626.m1419(i, interpolator, j));
        } else {
            this.f6604 = new C2277(i, interpolator, j);
        }
    }
}

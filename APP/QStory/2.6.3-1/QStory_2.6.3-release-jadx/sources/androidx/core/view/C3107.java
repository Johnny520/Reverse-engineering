package androidx.core.view;

import android.os.Build;
import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.AbstractC1467;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3108 f6949;

    public C3107(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6949 = new C3105(AbstractC1467.m1979(i, interpolator, j));
        } else {
            this.f6949 = new C3110(i, interpolator, j);
        }
    }
}

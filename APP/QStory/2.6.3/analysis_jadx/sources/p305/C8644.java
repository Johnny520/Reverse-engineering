package p305;

import android.graphics.RectF;
import androidx.activity.AbstractC0053;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8644 implements InterfaceC8625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24327;

    public C8644(float f) {
        this.f24327 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8644) && this.f24327 == ((C8644) obj).f24327;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24327)});
    }

    public final String toString() {
        return AbstractC0053.m147(new StringBuilder(), "%", (int) (this.f24327 * 100.0f));
    }

    @Override // p305.InterfaceC8625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14312(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f24327;
    }
}

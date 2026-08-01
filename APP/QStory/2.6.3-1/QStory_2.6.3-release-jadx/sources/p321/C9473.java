package p321;

import android.graphics.RectF;
import androidx.activity.AbstractC0900;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9473 implements InterfaceC9454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24672;

    public C9473(float f) {
        this.f24672 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9473) && this.f24672 == ((C9473) obj).f24672;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24672)});
    }

    public final String toString() {
        return AbstractC0900.m707(new StringBuilder(), "%", (int) (this.f24672 * 100.0f));
    }

    @Override // p321.InterfaceC9454
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14871(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f24672;
    }
}

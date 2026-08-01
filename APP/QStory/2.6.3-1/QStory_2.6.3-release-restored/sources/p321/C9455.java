package p321;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9455 implements InterfaceC9454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24566;

    public C9455(float f) {
        this.f24566 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9455) && this.f24566 == ((C9455) obj).f24566;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24566)});
    }

    @Override // p321.InterfaceC9454
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14871(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.f24566;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }
}

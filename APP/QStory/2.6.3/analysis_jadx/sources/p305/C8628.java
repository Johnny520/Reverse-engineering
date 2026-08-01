package p305;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8628 implements InterfaceC8625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24224;

    public C8628(float f) {
        this.f24224 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8628) && this.f24224 == ((C8628) obj).f24224;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24224)});
    }

    public final String toString() {
        return this.f24224 + "px";
    }

    @Override // p305.InterfaceC8625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14312(RectF rectF) {
        return this.f24224;
    }
}

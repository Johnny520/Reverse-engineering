package p305;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8636 implements InterfaceC8633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f24233;

    public C8636(float f) {
        this.f24233 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8636) && this.f24233 == ((C8636) obj).f24233;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24233)});
    }

    public final String toString() {
        return this.f24233 + "px";
    }

    @Override // p305.InterfaceC8633
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14294(RectF rectF) {
        return this.f24233;
    }
}

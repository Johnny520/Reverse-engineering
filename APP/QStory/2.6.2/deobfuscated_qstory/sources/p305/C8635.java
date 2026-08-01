package p305;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8635 implements InterfaceC8633 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8633 f24232;

    public C8635(float f, InterfaceC8633 interfaceC8633) {
        while (interfaceC8633 instanceof C8635) {
            interfaceC8633 = ((C8635) interfaceC8633).f24232;
            f += ((C8635) interfaceC8633).f24231;
        }
        this.f24232 = interfaceC8633;
        this.f24231 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8635)) {
            return false;
        }
        C8635 c8635 = (C8635) obj;
        return this.f24232.equals(c8635.f24232) && this.f24231 == c8635.f24231;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24232, Float.valueOf(this.f24231)});
    }

    @Override // p305.InterfaceC8633
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14294(RectF rectF) {
        return Math.max(0.0f, this.f24232.mo14294(rectF) + this.f24231);
    }
}

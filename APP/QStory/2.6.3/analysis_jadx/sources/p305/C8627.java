package p305;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8627 implements InterfaceC8625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8625 f24223;

    public C8627(float f, InterfaceC8625 interfaceC8625) {
        while (interfaceC8625 instanceof C8627) {
            interfaceC8625 = ((C8627) interfaceC8625).f24223;
            f += ((C8627) interfaceC8625).f24222;
        }
        this.f24223 = interfaceC8625;
        this.f24222 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8627)) {
            return false;
        }
        C8627 c8627 = (C8627) obj;
        return this.f24223.equals(c8627.f24223) && this.f24222 == c8627.f24222;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24223, Float.valueOf(this.f24222)});
    }

    @Override // p305.InterfaceC8625
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14312(RectF rectF) {
        return Math.max(0.0f, this.f24223.mo14312(rectF) + this.f24222);
    }
}

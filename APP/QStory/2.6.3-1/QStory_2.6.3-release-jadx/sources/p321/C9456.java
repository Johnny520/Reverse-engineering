package p321;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世子哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9456 implements InterfaceC9454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f24567;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC9454 f24568;

    public C9456(float f, InterfaceC9454 interfaceC9454) {
        while (interfaceC9454 instanceof C9456) {
            interfaceC9454 = ((C9456) interfaceC9454).f24568;
            f += ((C9456) interfaceC9454).f24567;
        }
        this.f24568 = interfaceC9454;
        this.f24567 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9456)) {
            return false;
        }
        C9456 c9456 = (C9456) obj;
        return this.f24568.equals(c9456.f24568) && this.f24567 == c9456.f24567;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24568, Float.valueOf(this.f24567)});
    }

    @Override // p321.InterfaceC9454
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo14871(RectF rectF) {
        return Math.max(0.0f, this.f24568.mo14871(rectF) + this.f24567);
    }
}

package androidx.compose.ui.graphics.painter;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import kotlin.jvm.internal.AbstractC4395;
import p205.C7906;
import p205.C7908;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1529 extends AbstractC1528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1610 f4425;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f4426;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4427;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4428;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1607 f4429;

    public C1529(C1610 c1610) {
        int i;
        long width = (((long) c1610.f4719.getWidth()) << 32) | (((long) c1610.f4719.getHeight()) & 4294967295L);
        this.f4425 = c1610;
        this.f4424 = width;
        this.f4427 = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > c1610.f4719.getWidth() || i > c1610.f4719.getHeight()) {
            C5925.m11310("Failed requirement.");
            throw null;
        }
        this.f4426 = width;
        this.f4428 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1529)) {
            return false;
        }
        C1529 c1529 = (C1529) obj;
        return AbstractC4395.m8907(this.f4425, c1529.f4425) && C7908.m13364(0L, 0L) && C7906.m13357(this.f4424, c1529.f4424) && this.f4427 == c1529.f4427;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4427) + AbstractC0053.m142(AbstractC0053.m142(this.f4425.hashCode() * 31, 31, 0L), 31, this.f4424);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f4425);
        sb.append(", srcOffset=");
        sb.append((Object) C7908.m13361(0L));
        sb.append(", srcSize=");
        sb.append((Object) C7906.m13356(this.f4424));
        sb.append(", filterQuality=");
        int i = this.f4427;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2807(InterfaceC1504 interfaceC1504) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC1504.mo2705() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC1504.mo2705() & 4294967295L)));
        float f = this.f4428;
        C1607 c1607 = this.f4429;
        int i = this.f4427;
        InterfaceC1504.m2699(interfaceC1504, this.f4425, this.f4424, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, c1607, i, 328);
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2808() {
        return AbstractC0455.m1140(this.f4426);
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2810(C1607 c1607) {
        this.f4429 = c1607;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2811(float f) {
        this.f4428 = f;
    }
}

package androidx.compose.ui.graphics.painter;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import kotlin.jvm.internal.AbstractC4394;
import p205.C7905;
import p205.C7907;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1529 extends AbstractC1528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1610 f4424;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f4425;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4426;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4427;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1607 f4428;

    public C1529(C1610 c1610) {
        int i;
        long width = (((long) c1610.f4718.getWidth()) << 32) | (((long) c1610.f4718.getHeight()) & 4294967295L);
        this.f4424 = c1610;
        this.f4423 = width;
        this.f4426 = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > c1610.f4718.getWidth() || i > c1610.f4718.getHeight()) {
            C5919.m11249("Failed requirement.");
            throw null;
        }
        this.f4425 = width;
        this.f4427 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1529)) {
            return false;
        }
        C1529 c1529 = (C1529) obj;
        return AbstractC4394.m8917(this.f4424, c1529.f4424) && C7907.m13336(0L, 0L) && C7905.m13329(this.f4423, c1529.f4423) && this.f4426 == c1529.f4426;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4426) + AbstractC0053.m141(AbstractC0053.m141(this.f4424.hashCode() * 31, 31, 0L), 31, this.f4423);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f4424);
        sb.append(", srcOffset=");
        sb.append((Object) C7907.m13333(0L));
        sb.append(", srcSize=");
        sb.append((Object) C7905.m13328(this.f4423));
        sb.append(", filterQuality=");
        int i = this.f4426;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2797(InterfaceC1504 interfaceC1504) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC1504.mo2695() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC1504.mo2695() & 4294967295L)));
        float f = this.f4427;
        C1607 c1607 = this.f4428;
        int i = this.f4426;
        InterfaceC1504.m2689(interfaceC1504, this.f4424, this.f4423, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, c1607, i, 328);
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo2798() {
        return AbstractC8189.m13654(this.f4425);
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2800(C1607 c1607) {
        this.f4428 = c1607;
    }

    @Override // androidx.compose.ui.graphics.painter.AbstractC1528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2801(float f) {
        this.f4427 = f;
    }
}

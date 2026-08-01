package androidx.compose.p001ui.graphics.painter;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import kotlin.jvm.internal.AbstractC5227;
import p221.C8735;
import p221.C8737;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.painter.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2364 extends AbstractC2363 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4769;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2445 f4770;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f4771;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4772;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4773;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2442 f4774;

    public C2364(C2445 c2445) {
        int i;
        long width = (((long) c2445.f5064.getWidth()) << 32) | (((long) c2445.f5064.getHeight()) & 4294967295L);
        this.f4770 = c2445;
        this.f4769 = width;
        this.f4772 = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > c2445.f5064.getWidth() || i > c2445.f5064.getHeight()) {
            C6755.m11869("Failed requirement.");
            throw null;
        }
        this.f4771 = width;
        this.f4773 = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2364)) {
            return false;
        }
        C2364 c2364 = (C2364) obj;
        return AbstractC5227.m9466(this.f4770, c2364.f4770) && C8737.m13923(0L, 0L) && C8735.m13916(this.f4769, c2364.f4769) && this.f4772 == c2364.f4772;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4772) + AbstractC0900.m702(AbstractC0900.m702(this.f4770.hashCode() * 31, 31, 0L), 31, this.f4769);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f4770);
        sb.append(", srcOffset=");
        sb.append((Object) C8737.m13920(0L));
        sb.append(", srcSize=");
        sb.append((Object) C8735.m13915(this.f4769));
        sb.append(", filterQuality=");
        int i = this.f4772;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3367(InterfaceC2339 interfaceC2339) {
        int iRound = Math.round(Float.intBitsToFloat((int) (interfaceC2339.mo3265() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (interfaceC2339.mo3265() & 4294967295L)));
        float f = this.f4773;
        C2442 c2442 = this.f4774;
        int i = this.f4772;
        InterfaceC2339.m3259(interfaceC2339, this.f4770, this.f4769, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f, c2442, i, 328);
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo3368() {
        return AbstractC1298.m1700(this.f4771);
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3370(C2442 c2442) {
        this.f4774 = c2442;
    }

    @Override // androidx.compose.p001ui.graphics.painter.AbstractC2363
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3371(float f) {
        this.f4773 = f;
    }
}

package androidx.compose.p001ui.graphics.drawscope;

import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8155;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f4632;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2436 f4633;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public LayoutDirection f4634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8725 f4635;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2343)) {
            return false;
        }
        C2343 c2343 = (C2343) obj;
        return AbstractC5227.m9466(this.f4635, c2343.f4635) && this.f4634 == c2343.f4634 && AbstractC5227.m9466(this.f4633, c2343.f4633) && C8155.m13074(this.f4632, c2343.f4632);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4632) + ((this.f4633.hashCode() + ((this.f4634.hashCode() + (this.f4635.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f4635 + ", layoutDirection=" + this.f4634 + ", canvas=" + this.f4633 + ", size=" + ((Object) C8155.m13071(this.f4632)) + ')';
    }
}

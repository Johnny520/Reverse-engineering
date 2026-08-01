package androidx.compose.ui.input.pointer;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f4780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f4781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f4782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4784;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f4785;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4786;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f4788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f4789;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f4790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f4791;

    public C1636(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f4784 = j;
        this.f4783 = j2;
        this.f4782 = j3;
        this.f4781 = j4;
        this.f4780 = z;
        this.f4779 = f;
        this.f4787 = i;
        this.f4786 = z2;
        this.f4790 = arrayList;
        this.f4791 = j5;
        this.f4788 = f2;
        this.f4789 = j6;
        this.f4785 = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636)) {
            return false;
        }
        C1636 c1636 = (C1636) obj;
        return AbstractC1646.m3016(this.f4784, c1636.f4784) && this.f4783 == c1636.f4783 && C7328.m12501(this.f4782, c1636.f4782) && C7328.m12501(this.f4781, c1636.f4781) && this.f4780 == c1636.f4780 && Float.compare(this.f4779, c1636.f4779) == 0 && this.f4787 == c1636.f4787 && this.f4786 == c1636.f4786 && this.f4790.equals(c1636.f4790) && C7328.m12501(this.f4791, c1636.f4791) && Float.compare(this.f4788, c1636.f4788) == 0 && C7328.m12501(this.f4789, c1636.f4789) && C7328.m12501(this.f4785, c1636.f4785);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4785) + AbstractC0053.m141(AbstractC0053.m144(AbstractC0053.m141((this.f4790.hashCode() + AbstractC0053.m140(AbstractC0053.m143(this.f4787, AbstractC0053.m144(AbstractC0053.m140(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(Long.hashCode(this.f4784) * 31, 31, this.f4783), 31, this.f4782), 31, this.f4781), 31, this.f4780), this.f4779, 31), 31), 31, this.f4786)) * 31, 31, this.f4791), this.f4788, 31), 31, this.f4789);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC1646.m3024(this.f4784)) + ", uptime=" + this.f4783 + ", positionOnScreen=" + ((Object) C7328.m12504(this.f4782)) + ", position=" + ((Object) C7328.m12504(this.f4781)) + ", down=" + this.f4780 + ", pressure=" + this.f4779 + ", type=" + ((Object) AbstractC1638.m3007(this.f4787)) + ", activeHover=" + this.f4786 + ", historical=" + this.f4790 + ", scrollDelta=" + ((Object) C7328.m12504(this.f4791)) + ", scaleGestureFactor=" + this.f4788 + ", panGestureOffset=" + ((Object) C7328.m12504(this.f4789)) + ", originalEventPosition=" + ((Object) C7328.m12504(this.f4785)) + ')';
    }
}

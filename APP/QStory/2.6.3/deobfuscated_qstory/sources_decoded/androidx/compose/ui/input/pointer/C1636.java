package androidx.compose.ui.input.pointer;

import androidx.activity.AbstractC0053;
import java.util.ArrayList;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f4780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f4781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f4782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f4783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4784;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4785;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f4786;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4787;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f4788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f4789;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f4790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f4791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f4792;

    public C1636(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f4785 = j;
        this.f4784 = j2;
        this.f4783 = j3;
        this.f4782 = j4;
        this.f4781 = z;
        this.f4780 = f;
        this.f4788 = i;
        this.f4787 = z2;
        this.f4791 = arrayList;
        this.f4792 = j5;
        this.f4789 = f2;
        this.f4790 = j6;
        this.f4786 = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1636)) {
            return false;
        }
        C1636 c1636 = (C1636) obj;
        return AbstractC1646.m3026(this.f4785, c1636.f4785) && this.f4784 == c1636.f4784 && C7329.m12528(this.f4783, c1636.f4783) && C7329.m12528(this.f4782, c1636.f4782) && this.f4781 == c1636.f4781 && Float.compare(this.f4780, c1636.f4780) == 0 && this.f4788 == c1636.f4788 && this.f4787 == c1636.f4787 && this.f4791.equals(c1636.f4791) && C7329.m12528(this.f4792, c1636.f4792) && Float.compare(this.f4789, c1636.f4789) == 0 && C7329.m12528(this.f4790, c1636.f4790) && C7329.m12528(this.f4786, c1636.f4786);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4786) + AbstractC0053.m142(AbstractC0053.m145(AbstractC0053.m142((this.f4791.hashCode() + AbstractC0053.m141(AbstractC0053.m144(this.f4788, AbstractC0053.m145(AbstractC0053.m141(AbstractC0053.m142(AbstractC0053.m142(AbstractC0053.m142(Long.hashCode(this.f4785) * 31, 31, this.f4784), 31, this.f4783), 31, this.f4782), 31, this.f4781), this.f4780, 31), 31), 31, this.f4787)) * 31, 31, this.f4792), this.f4789, 31), 31, this.f4790);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC1646.m3034(this.f4785)) + ", uptime=" + this.f4784 + ", positionOnScreen=" + ((Object) C7329.m12531(this.f4783)) + ", position=" + ((Object) C7329.m12531(this.f4782)) + ", down=" + this.f4781 + ", pressure=" + this.f4780 + ", type=" + ((Object) AbstractC1638.m3017(this.f4788)) + ", activeHover=" + this.f4787 + ", historical=" + this.f4791 + ", scrollDelta=" + ((Object) C7329.m12531(this.f4792)) + ", scaleGestureFactor=" + this.f4789 + ", panGestureOffset=" + ((Object) C7329.m12531(this.f4790)) + ", originalEventPosition=" + ((Object) C7329.m12531(this.f4786)) + ')';
    }
}

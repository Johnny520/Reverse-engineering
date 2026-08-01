package androidx.compose.ui.input.pointer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f4805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f4806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4808;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long f4809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f4810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1643 f4811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f4812;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4813;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f4815;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f4816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f4817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f4818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f4819;

    public C1643(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f4808 = j;
        this.f4807 = j2;
        this.f4806 = j3;
        this.f4805 = z;
        this.f4804 = f;
        this.f4803 = j4;
        this.f4815 = j5;
        this.f4814 = z2;
        this.f4818 = i;
        this.f4819 = j6;
        this.f4816 = f2;
        this.f4817 = j7;
        this.f4809 = 0L;
        this.f4812 = z3;
        this.f4813 = z3;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) AbstractC1646.m3024(this.f4808)) + ", uptimeMillis=" + this.f4807 + ", position=" + ((Object) C7328.m12504(this.f4806)) + ", pressed=" + this.f4805 + ", pressure=" + this.f4804 + ", previousUptimeMillis=" + this.f4803 + ", previousPosition=" + ((Object) C7328.m12504(this.f4815)) + ", previousPressed=" + this.f4814 + ", isConsumed=" + m3012() + ", type=" + ((Object) AbstractC1638.m3007(this.f4818)) + ", historical=" + m3013() + ", scrollDelta=" + ((Object) C7328.m12504(this.f4819)) + ", scaleFactor=" + this.f4816 + ", panOffset=" + ((Object) C7328.m12504(this.f4817)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3012() {
        C1643 c1643 = this.f4811;
        return c1643 != null ? c1643.m3012() : this.f4812 || this.f4813;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m3013() {
        ArrayList arrayList = this.f4810;
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3014() {
        C1643 c1643 = this.f4811;
        if (c1643 == null) {
            this.f4812 = true;
            this.f4813 = true;
        } else if (c1643 != null) {
            c1643.m3014();
        }
    }

    public C1643(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f4810 = arrayList;
        this.f4809 = j8;
    }
}

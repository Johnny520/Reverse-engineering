package androidx.compose.ui.input.pointer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1643 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f4804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f4805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f4806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f4807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4808;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long f4810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f4811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1643 f4812;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f4813;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f4815;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f4816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f4817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f4818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f4819;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f4820;

    public C1643(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f4809 = j;
        this.f4808 = j2;
        this.f4807 = j3;
        this.f4806 = z;
        this.f4805 = f;
        this.f4804 = j4;
        this.f4816 = j5;
        this.f4815 = z2;
        this.f4819 = i;
        this.f4820 = j6;
        this.f4817 = f2;
        this.f4818 = j7;
        this.f4810 = 0L;
        this.f4813 = z3;
        this.f4814 = z3;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) AbstractC1646.m3034(this.f4809)) + ", uptimeMillis=" + this.f4808 + ", position=" + ((Object) C7329.m12531(this.f4807)) + ", pressed=" + this.f4806 + ", pressure=" + this.f4805 + ", previousUptimeMillis=" + this.f4804 + ", previousPosition=" + ((Object) C7329.m12531(this.f4816)) + ", previousPressed=" + this.f4815 + ", isConsumed=" + m3022() + ", type=" + ((Object) AbstractC1638.m3017(this.f4819)) + ", historical=" + m3023() + ", scrollDelta=" + ((Object) C7329.m12531(this.f4820)) + ", scaleFactor=" + this.f4817 + ", panOffset=" + ((Object) C7329.m12531(this.f4818)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3022() {
        C1643 c1643 = this.f4812;
        return c1643 != null ? c1643.m3022() : this.f4813 || this.f4814;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m3023() {
        ArrayList arrayList = this.f4811;
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3024() {
        C1643 c1643 = this.f4812;
        if (c1643 == null) {
            this.f4813 = true;
            this.f4814 = true;
        } else if (c1643 != null) {
            c1643.m3024();
        }
    }

    public C1643(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f4811 = arrayList;
        this.f4810 = j8;
    }
}

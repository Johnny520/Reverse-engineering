package androidx.compose.p001ui.input.pointer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f5149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f5150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f5151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f5152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long f5155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final ArrayList f5156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2478 f5157;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f5158;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f5159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f5160;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f5161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f5162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f5163;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f5164;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f5165;

    public C2478(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f5154 = j;
        this.f5153 = j2;
        this.f5152 = j3;
        this.f5151 = z;
        this.f5150 = f;
        this.f5149 = j4;
        this.f5161 = j5;
        this.f5160 = z2;
        this.f5164 = i;
        this.f5165 = j6;
        this.f5162 = f2;
        this.f5163 = j7;
        this.f5155 = 0L;
        this.f5158 = z3;
        this.f5159 = z3;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) AbstractC2481.m3594(this.f5154)) + ", uptimeMillis=" + this.f5153 + ", position=" + ((Object) C8158.m13090(this.f5152)) + ", pressed=" + this.f5151 + ", pressure=" + this.f5150 + ", previousUptimeMillis=" + this.f5149 + ", previousPosition=" + ((Object) C8158.m13090(this.f5161)) + ", previousPressed=" + this.f5160 + ", isConsumed=" + m3582() + ", type=" + ((Object) AbstractC2473.m3577(this.f5164)) + ", historical=" + m3583() + ", scrollDelta=" + ((Object) C8158.m13090(this.f5165)) + ", scaleFactor=" + this.f5162 + ", panOffset=" + ((Object) C8158.m13090(this.f5163)) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m3582() {
        C2478 c2478 = this.f5157;
        return c2478 != null ? c2478.m3582() : this.f5158 || this.f5159;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m3583() {
        ArrayList arrayList = this.f5156;
        return arrayList == null ? EmptyList.INSTANCE : arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3584() {
        C2478 c2478 = this.f5157;
        if (c2478 == null) {
            this.f5158 = true;
            this.f5159 = true;
        } else if (c2478 != null) {
            c2478.m3584();
        }
    }

    public C2478(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f5156 = arrayList;
        this.f5155 = j8;
    }
}

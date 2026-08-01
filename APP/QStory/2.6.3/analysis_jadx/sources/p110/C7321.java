package p110;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.input.pointer.AbstractC1646;
import p112.C7329;

/* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7321 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f19516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f19518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f19519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f19520;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19521;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19522;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f19523;

    public C7321(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f19520 = j;
        this.f19519 = j2;
        this.f19518 = j3;
        this.f19517 = z;
        this.f19516 = f;
        this.f19515 = j4;
        this.f19522 = j5;
        this.f19521 = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) AbstractC1646.m3034(this.f19520));
        sb.append(", uptimeMillis=");
        sb.append(this.f19519);
        sb.append(", position=");
        sb.append((Object) C7329.m12531(this.f19518));
        sb.append(", pressed=");
        sb.append(this.f19517);
        sb.append(", pressure=");
        sb.append(this.f19516);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f19515);
        sb.append(", previousPosition=");
        sb.append((Object) C7329.m12531(this.f19522));
        sb.append(", previousPressed=");
        sb.append(this.f19521);
        sb.append(", isConsumed=");
        return AbstractC0053.m152(sb, this.f19523, ')');
    }
}

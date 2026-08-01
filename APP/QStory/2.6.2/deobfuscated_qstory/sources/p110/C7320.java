package p110;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.input.pointer.AbstractC1646;
import p112.C7328;

/* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7320 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f19521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f19523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f19524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f19525;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19527;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f19528;

    public C7320(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f19525 = j;
        this.f19524 = j2;
        this.f19523 = j3;
        this.f19522 = z;
        this.f19521 = f;
        this.f19520 = j4;
        this.f19527 = j5;
        this.f19526 = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) AbstractC1646.m3024(this.f19525));
        sb.append(", uptimeMillis=");
        sb.append(this.f19524);
        sb.append(", position=");
        sb.append((Object) C7328.m12504(this.f19523));
        sb.append(", pressed=");
        sb.append(this.f19522);
        sb.append(", pressure=");
        sb.append(this.f19521);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f19520);
        sb.append(", previousPosition=");
        sb.append((Object) C7328.m12504(this.f19527));
        sb.append(", previousPressed=");
        sb.append(this.f19526);
        sb.append(", isConsumed=");
        return AbstractC0053.m150(sb, this.f19528, ')');
    }
}

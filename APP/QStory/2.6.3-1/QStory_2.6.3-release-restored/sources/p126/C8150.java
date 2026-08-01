package p126;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import p128.C8158;

/* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f19860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f19861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f19863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f19864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f19865;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19866;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f19867;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f19868;

    public C8150(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f19865 = j;
        this.f19864 = j2;
        this.f19863 = j3;
        this.f19862 = z;
        this.f19861 = f;
        this.f19860 = j4;
        this.f19867 = j5;
        this.f19866 = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) AbstractC2481.m3594(this.f19865));
        sb.append(", uptimeMillis=");
        sb.append(this.f19864);
        sb.append(", position=");
        sb.append((Object) C8158.m13090(this.f19863));
        sb.append(", pressed=");
        sb.append(this.f19862);
        sb.append(", pressure=");
        sb.append(this.f19861);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f19860);
        sb.append(", previousPosition=");
        sb.append((Object) C8158.m13090(this.f19867));
        sb.append(", previousPressed=");
        sb.append(this.f19866);
        sb.append(", isConsumed=");
        return AbstractC0900.m712(sb, this.f19868, ')');
    }
}

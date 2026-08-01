package p176;

import android.os.Parcel;
import androidx.compose.ui.graphics.C1599;
import androidx.window.area.AbstractC2567;
import p205.C7899;
import p205.C7901;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7742 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Parcel f21002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m13098(long j) {
        long jM13344 = C7899.m13344(j);
        byte b = 0;
        if (!C7901.m13346(jM13344, 0L)) {
            if (C7901.m13346(jM13344, 4294967296L)) {
                b = 1;
            } else if (C7901.m13346(jM13344, 8589934592L)) {
                b = 2;
            }
        }
        m13100(b);
        if (C7901.m13346(C7899.m13344(j), 0L)) {
            return;
        }
        m13099(C7899.m13343(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m13099(float f) {
        this.f21002.writeFloat(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13100(byte b) {
        this.f21002.writeByte(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long m13101() {
        Parcel parcel = this.f21002;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return C7901.m13346(j, 0L) ? C7899.f21866 : AbstractC2567.m5062(parcel.readFloat(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long m13102() {
        int i = C1599.f4699;
        long j = this.f21002.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }
}

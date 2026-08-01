package p176;

import android.os.Parcel;
import androidx.compose.ui.graphics.C1599;
import p205.C7898;
import p205.C7900;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7741 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Parcel f21005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m13070(long j) {
        long jM13316 = C7898.m13316(j);
        byte b = 0;
        if (!C7900.m13318(jM13316, 0L)) {
            if (C7900.m13318(jM13316, 4294967296L)) {
                b = 1;
            } else if (C7900.m13318(jM13316, 8589934592L)) {
                b = 2;
            }
        }
        m13072(b);
        if (C7900.m13318(C7898.m13316(j), 0L)) {
            return;
        }
        m13071(C7898.m13315(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m13071(float f) {
        this.f21005.writeFloat(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13072(byte b) {
        this.f21005.writeByte(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long m13073() {
        Parcel parcel = this.f21005;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return C7900.m13318(j, 0L) ? C7898.f21869 : AbstractC9124.m14667(parcel.readFloat(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long m13074() {
        int i = C1599.f4698;
        long j = this.f21005.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }
}

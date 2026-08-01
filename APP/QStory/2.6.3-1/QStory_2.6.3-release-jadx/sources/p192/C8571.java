package p192;

import android.os.Parcel;
import androidx.compose.p001ui.graphics.C2434;
import androidx.window.area.AbstractC3400;
import p221.C8728;
import p221.C8730;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Parcel f21347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m13657(long j) {
        long jM13903 = C8728.m13903(j);
        byte b = 0;
        if (!C8730.m13905(jM13903, 0L)) {
            if (C8730.m13905(jM13903, 4294967296L)) {
                b = 1;
            } else if (C8730.m13905(jM13903, 8589934592L)) {
                b = 2;
            }
        }
        m13659(b);
        if (C8730.m13905(C8728.m13903(j), 0L)) {
            return;
        }
        m13658(C8728.m13902(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m13658(float f) {
        this.f21347.writeFloat(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13659(byte b) {
        this.f21347.writeByte(b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long m13660() {
        Parcel parcel = this.f21347;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return C8730.m13905(j, 0L) ? C8728.f22211 : AbstractC3400.m5622(parcel.readFloat(), j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long m13661() {
        int i = C2434.f5044;
        long j = this.f21347.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }
}

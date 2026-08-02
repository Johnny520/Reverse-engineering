package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 {

    /* JADX INFO: renamed from: a */
    public Parcel f11097a;

    /* JADX INFO: renamed from: a */
    public long m5463a() {
        int i = C0363ju.f5218h;
        long j = this.f11097a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    /* JADX INFO: renamed from: b */
    public long m5464b() {
        Parcel parcel = this.f11097a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return q13.m4041a(j, 0L) ? p13.f7928c : rg3.m4455I(parcel.readFloat(), j);
    }

    /* JADX INFO: renamed from: c */
    public void m5465c(byte b) {
        this.f11097a.writeByte(b);
    }

    /* JADX INFO: renamed from: d */
    public void m5466d(float f) {
        this.f11097a.writeFloat(f);
    }

    /* JADX INFO: renamed from: e */
    public void m5467e(long j) {
        long jM3674b = p13.m3674b(j);
        byte b = 0;
        if (!q13.m4041a(jM3674b, 0L)) {
            if (q13.m4041a(jM3674b, 4294967296L)) {
                b = 1;
            } else if (q13.m4041a(jM3674b, 8589934592L)) {
                b = 2;
            }
        }
        m5465c(b);
        if (q13.m4041a(p13.m3674b(j), 0L)) {
            return;
        }
        m5466d(p13.m3675c(j));
    }
}

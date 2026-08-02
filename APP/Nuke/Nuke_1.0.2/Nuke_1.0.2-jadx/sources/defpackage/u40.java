package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 {
    public Parcel a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long a() {
        int i = ju.h;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long b() {
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return q13.a(j, 0L) ? p13.c : rg3.I(parcel.readFloat(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(byte b) {
        this.a.writeByte(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(float f) {
        this.a.writeFloat(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(long j) {
        long jB = p13.b(j);
        byte b = 0;
        if (!q13.a(jB, 0L)) {
            if (q13.a(jB, 4294967296L)) {
                b = 1;
            } else if (q13.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (q13.a(p13.b(j), 0L)) {
            return;
        }
        d(p13.c(j));
    }
}

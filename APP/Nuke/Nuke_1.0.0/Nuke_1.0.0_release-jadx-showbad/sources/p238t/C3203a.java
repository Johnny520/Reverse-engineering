package p238t;

import android.os.Parcel;
import com.bumptech.glide.AbstractC1926h;
import p153e1.C2019o;
import p153e1.C2020p;
import p211o0.C2762u;

/* JADX INFO: renamed from: t.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3203a {

    /* JADX INFO: renamed from: a */
    public Parcel f9976a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long m5470a() {
        int i5 = C2762u.f8763h;
        long j5 = this.f9976a.readLong();
        long j6 = 63 & j5;
        return j6 < 16 ? j5 : (j5 & (-64)) | (j6 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public long m5471b() {
        Parcel parcel = this.f9976a;
        byte b2 = parcel.readByte();
        long j5 = b2 == 1 ? 4294967296L : b2 == 2 ? 8589934592L : 0L;
        return C2020p.m3712a(j5, 0L) ? C2019o.f6747c : AbstractC1926h.m3582y(parcel.readFloat(), j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m5472c(byte b2) {
        this.f9976a.writeByte(b2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m5473d(float f2) {
        this.f9976a.writeFloat(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m5474e(long j5) {
        long jM3709b = C2019o.m3709b(j5);
        byte b2 = 0;
        if (!C2020p.m3712a(jM3709b, 0L)) {
            if (C2020p.m3712a(jM3709b, 4294967296L)) {
                b2 = 1;
            } else if (C2020p.m3712a(jM3709b, 8589934592L)) {
                b2 = 2;
            }
        }
        m5472c(b2);
        if (C2020p.m3712a(C2019o.m3709b(j5), 0L)) {
            return;
        }
        m5473d(C2019o.m3710c(j5));
    }
}

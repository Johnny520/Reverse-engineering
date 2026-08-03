package p201o;

import android.os.Parcel;
import p071f1.C1034w;
import p293u2.C4245o;
import p293u2.C4246p;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3025a {

    /* JADX INFO: renamed from: a */
    public Parcel f9830a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public long m6423a() {
        int i9 = C1034w.f3264h;
        long j3 = this.f9830a.readLong();
        long j4 = 63 & j3;
        return j4 < 16 ? j3 : (j3 & (-64)) | (j4 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public long m6424b() {
        Parcel parcel = this.f9830a;
        byte b10 = parcel.readByte();
        long j3 = b10 == 1 ? 4294967296L : b10 == 2 ? 8589934592L : 0L;
        return C4246p.m8542a(j3, 0L) ? C4245o.f13924c : AbstractC5700d.m10260R(j3, parcel.readFloat());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m6425c(byte b10) {
        this.f9830a.writeByte(b10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m6426d(float f3) {
        this.f9830a.writeFloat(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m6427e(long j3) {
        long jM8539b = C4245o.m8539b(j3);
        byte b10 = 0;
        if (!C4246p.m8542a(jM8539b, 0L)) {
            if (C4246p.m8542a(jM8539b, 4294967296L)) {
                b10 = 1;
            } else if (C4246p.m8542a(jM8539b, 8589934592L)) {
                b10 = 2;
            }
        }
        m6425c(b10);
        if (C4246p.m8542a(C4245o.m8539b(j3), 0L)) {
            return;
        }
        m6426d(C4245o.m8540c(j3));
    }
}

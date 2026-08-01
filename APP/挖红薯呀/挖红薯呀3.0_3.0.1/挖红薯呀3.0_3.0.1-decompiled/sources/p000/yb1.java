package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 extends xb1 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f7601d;

    /* JADX INFO: renamed from: e */
    public final Parcel f7602e;

    /* JADX INFO: renamed from: f */
    public final int f7603f;

    /* JADX INFO: renamed from: g */
    public final int f7604g;

    /* JADX INFO: renamed from: h */
    public final String f7605h;

    /* JADX INFO: renamed from: i */
    public int f7606i;

    /* JADX INFO: renamed from: j */
    public int f7607j;

    /* JADX INFO: renamed from: k */
    public int f7608k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yb1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0121d9(0), new C0121d9(0), new C0121d9(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xb1
    /* JADX INFO: renamed from: a */
    public final yb1 mo5114a() {
        Parcel parcel = this.f7602e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f7607j;
        if (i == this.f7603f) {
            i = this.f7604g;
        }
        return new yb1(parcel, iDataPosition, i, this.f7605h + "  ", this.f7320a, this.f7321b, this.f7322c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xb1
    /* JADX INFO: renamed from: e */
    public final boolean mo5118e(int i) {
        while (true) {
            int i2 = this.f7607j;
            int i3 = this.f7608k;
            if (i2 >= this.f7604g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f7607j;
            Parcel parcel = this.f7602e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f7608k = parcel.readInt();
            this.f7607j += i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xb1
    /* JADX INFO: renamed from: h */
    public final void mo5121h(int i) {
        int i2 = this.f7606i;
        SparseIntArray sparseIntArray = this.f7601d;
        Parcel parcel = this.f7602e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f7606i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public yb1(Parcel parcel, int i, int i2, String str, C0121d9 c0121d9, C0121d9 c0121d92, C0121d9 c0121d93) {
        super(c0121d9, c0121d92, c0121d93);
        this.f7601d = new SparseIntArray();
        this.f7606i = -1;
        this.f7608k = -1;
        this.f7602e = parcel;
        this.f7603f = i;
        this.f7604g = i2;
        this.f7607j = i;
        this.f7605h = str;
    }
}

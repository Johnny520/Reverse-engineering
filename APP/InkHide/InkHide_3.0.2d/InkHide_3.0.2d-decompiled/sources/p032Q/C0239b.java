package p032Q;

import android.os.Parcel;
import android.util.SparseIntArray;
import p022L.AbstractC0174d;
import p075l.C0744b;

/* JADX INFO: renamed from: Q.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0239b extends AbstractC0238a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f575d;

    /* JADX INFO: renamed from: e */
    public final Parcel f576e;

    /* JADX INFO: renamed from: f */
    public final int f577f;

    /* JADX INFO: renamed from: g */
    public final int f578g;

    /* JADX INFO: renamed from: h */
    public final String f579h;

    /* JADX INFO: renamed from: i */
    public int f580i;

    /* JADX INFO: renamed from: j */
    public int f581j;

    /* JADX INFO: renamed from: k */
    public int f582k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0239b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0744b(), new C0744b(), new C0744b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p032Q.AbstractC0238a
    /* JADX INFO: renamed from: a */
    public final C0239b mo449a() {
        Parcel parcel = this.f576e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f581j;
        if (i2 == this.f577f) {
            i2 = this.f578g;
        }
        return new C0239b(parcel, iDataPosition, i2, AbstractC0174d.m356l(new StringBuilder(), this.f579h, "  "), this.f572a, this.f573b, this.f574c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p032Q.AbstractC0238a
    /* JADX INFO: renamed from: e */
    public final boolean mo453e(int i2) {
        while (this.f581j < this.f578g) {
            int i3 = this.f582k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f581j;
            Parcel parcel = this.f576e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f582k = parcel.readInt();
            this.f581j += i5;
        }
        return this.f582k == i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p032Q.AbstractC0238a
    /* JADX INFO: renamed from: h */
    public final void mo456h(int i2) {
        int i3 = this.f580i;
        SparseIntArray sparseIntArray = this.f575d;
        Parcel parcel = this.f576e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f580i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C0239b(Parcel parcel, int i2, int i3, String str, C0744b c0744b, C0744b c0744b2, C0744b c0744b3) {
        super(c0744b, c0744b2, c0744b3);
        this.f575d = new SparseIntArray();
        this.f580i = -1;
        this.f582k = -1;
        this.f576e = parcel;
        this.f577f = i2;
        this.f578g = i3;
        this.f581j = i2;
        this.f579h = str;
    }
}

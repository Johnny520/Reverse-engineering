package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends o90 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f3625d;

    /* JADX INFO: renamed from: e */
    public final Parcel f3626e;

    /* JADX INFO: renamed from: f */
    public final int f3627f;

    /* JADX INFO: renamed from: g */
    public final int f3628g;

    /* JADX INFO: renamed from: h */
    public final String f3629h;

    /* JADX INFO: renamed from: i */
    public int f3630i;

    /* JADX INFO: renamed from: j */
    public int f3631j;

    /* JADX INFO: renamed from: k */
    public int f3632k;

    public p90(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0511n6(), new C0511n6(), new C0511n6());
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: a */
    public final p90 mo1992a() {
        Parcel parcel = this.f3626e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f3631j;
        if (i == this.f3627f) {
            i = this.f3628g;
        }
        return new p90(parcel, iDataPosition, i, g40.m1149l(new StringBuilder(), this.f3629h, "  "), this.f3422a, this.f3423b, this.f3424c);
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: e */
    public final boolean mo1996e(int i) {
        while (this.f3631j < this.f3628g) {
            int i2 = this.f3632k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3631j;
            Parcel parcel = this.f3626e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f3632k = parcel.readInt();
            this.f3631j += i4;
        }
        return this.f3632k == i;
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: h */
    public final void mo1999h(int i) {
        int i2 = this.f3630i;
        SparseIntArray sparseIntArray = this.f3625d;
        Parcel parcel = this.f3626e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f3630i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public p90(Parcel parcel, int i, int i2, String str, C0511n6 c0511n6, C0511n6 c0511n62, C0511n6 c0511n63) {
        super(c0511n6, c0511n62, c0511n63);
        this.f3625d = new SparseIntArray();
        this.f3630i = -1;
        this.f3632k = -1;
        this.f3626e = parcel;
        this.f3627f = i;
        this.f3628g = i2;
        this.f3631j = i;
        this.f3629h = str;
    }
}

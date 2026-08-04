package yyds;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: yyds.ᲈᛵᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2664 extends AbstractC1172 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final String f13071;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f13072;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Parcel f13073;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f13074;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int f13075;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f13076;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f13077;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final SparseIntArray f13078;

    public C2664(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1505(0), new C1505(0), new C1505(0));
    }

    @Override // yyds.AbstractC1172
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo2360(int i) {
        int i2 = this.f13072;
        SparseIntArray sparseIntArray = this.f13078;
        Parcel parcel = this.f13073;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f13072 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // yyds.AbstractC1172
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final boolean mo2362(int i) {
        while (true) {
            int i2 = this.f13076;
            int i3 = this.f13075;
            if (i2 >= this.f13074) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f13076;
            Parcel parcel = this.f13073;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f13075 = parcel.readInt();
            this.f13076 += i5;
        }
    }

    @Override // yyds.AbstractC1172
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C2664 mo2363() {
        Parcel parcel = this.f13073;
        int iDataPosition = parcel.dataPosition();
        int i = this.f13076;
        if (i == this.f13077) {
            i = this.f13074;
        }
        return new C2664(parcel, iDataPosition, i, AbstractC2104.m4015(new StringBuilder(), this.f13071, "  "), this.f5378, this.f5379, this.f5380);
    }

    public C2664(Parcel parcel, int i, int i2, String str, C1505 c1505, C1505 c15052, C1505 c15053) {
        super(c1505, c15052, c15053);
        this.f13078 = new SparseIntArray();
        this.f13072 = -1;
        this.f13075 = -1;
        this.f13073 = parcel;
        this.f13077 = i;
        this.f13074 = i2;
        this.f13076 = i;
        this.f13071 = str;
    }
}

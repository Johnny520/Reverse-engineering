package p047a0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p063j.C0957b;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0472b extends AbstractC0471a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f1053d;

    /* JADX INFO: renamed from: e */
    public final Parcel f1054e;

    /* JADX INFO: renamed from: f */
    public final int f1055f;

    /* JADX INFO: renamed from: g */
    public final int f1056g;

    /* JADX INFO: renamed from: h */
    public final String f1057h;

    /* JADX INFO: renamed from: i */
    public int f1058i;

    /* JADX INFO: renamed from: j */
    public int f1059j;

    /* JADX INFO: renamed from: k */
    public int f1060k;

    public C0472b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0957b(), new C0957b(), new C0957b());
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: a */
    public final C0472b mo1102a() {
        Parcel parcel = this.f1054e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f1059j;
        if (i2 == this.f1055f) {
            i2 = this.f1056g;
        }
        return new C0472b(parcel, iDataPosition, i2, this.f1057h + "  ", this.f1050a, this.f1051b, this.f1052c);
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: e */
    public final boolean mo1106e(int i2) {
        while (this.f1059j < this.f1056g) {
            int i3 = this.f1060k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1059j;
            Parcel parcel = this.f1054e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f1060k = parcel.readInt();
            this.f1059j += i5;
        }
        return this.f1060k == i2;
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: h */
    public final void mo1109h(int i2) {
        int i3 = this.f1058i;
        SparseIntArray sparseIntArray = this.f1053d;
        Parcel parcel = this.f1054e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f1058i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C0472b(Parcel parcel, int i2, int i3, String str, C0957b c0957b, C0957b c0957b2, C0957b c0957b3) {
        super(c0957b, c0957b2, c0957b3);
        this.f1053d = new SparseIntArray();
        this.f1058i = -1;
        this.f1060k = -1;
        this.f1054e = parcel;
        this.f1055f = i2;
        this.f1056g = i3;
        this.f1059j = i2;
        this.f1057h = str;
    }
}

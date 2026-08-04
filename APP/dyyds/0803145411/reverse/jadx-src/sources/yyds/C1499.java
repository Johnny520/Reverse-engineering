package yyds;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: renamed from: yyds.ᛷᛲᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1499 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f7069;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7069) {
            case 0:
                C1752 c1752 = new C1752(parcel);
                c1752.f8815 = parcel.readByte() != 0;
                return c1752;
            case 1:
                return new C1480();
            case 2:
                C1273 c1273 = new C1273();
                c1273.f5859 = parcel.readInt();
                c1273.f5860 = parcel.readInt();
                c1273.f5858 = parcel.readInt() == 1;
                return c1273;
            case 3:
                C2437 c2437 = new C2437(parcel);
                c2437.f11997 = parcel.readInt();
                return c2437;
            case 4:
                return new ParcelImpl(parcel);
            case 5:
                return new C1098();
            case 6:
                return new C2157();
            case 7:
                return new C0874();
            case 8:
                return new C0620();
            case 9:
                return new C0964();
            case 10:
                C0618 c0618 = new C0618();
                c0618.f2986 = parcel.readInt();
                c0618.f2988 = parcel.readInt();
                c0618.f2987 = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c0618.f2985 = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0618;
            default:
                C0265 c0265 = new C0265();
                c0265.f1460 = parcel.readInt();
                c0265.f1462 = parcel.readInt();
                int i2 = parcel.readInt();
                c0265.f1455 = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c0265.f1461 = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c0265.f1456 = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c0265.f1453 = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0265.f1459 = parcel.readInt() == 1;
                c0265.f1457 = parcel.readInt() == 1;
                c0265.f1458 = parcel.readInt() == 1;
                c0265.f1454 = parcel.readArrayList(C0618.class.getClassLoader());
                return c0265;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7069) {
            case 0:
                return new C1752[i];
            case 1:
                return new C1480[i];
            case 2:
                return new C1273[i];
            case 3:
                return new C2437[i];
            case 4:
                return new ParcelImpl[i];
            case 5:
                return new C1098[i];
            case 6:
                return new C2157[i];
            case 7:
                return new C0874[i];
            case 8:
                return new C0620[i];
            case 9:
                return new C0964[i];
            case 10:
                return new C0618[i];
            default:
                return new C0265[i];
        }
    }
}

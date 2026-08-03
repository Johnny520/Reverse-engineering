package p017J;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import p037U.C0360U;
import p037U.C0361V;
import p037U.C0384t;

/* JADX INFO: renamed from: J.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0222k implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f463a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f463a) {
            case 0:
                C0223l c0223l = new C0223l(parcel);
                c0223l.f464a = parcel.readInt();
                return c0223l;
            case 1:
                C0384t c0384t = new C0384t();
                c0384t.f869a = parcel.readInt();
                c0384t.f870b = parcel.readInt();
                c0384t.f871c = parcel.readInt() == 1;
                return c0384t;
            case 2:
                C0360U c0360u = new C0360U();
                c0360u.f747a = parcel.readInt();
                c0360u.f748b = parcel.readInt();
                c0360u.f750d = parcel.readInt() == 1;
                int i2 = parcel.readInt();
                if (i2 > 0) {
                    int[] iArr = new int[i2];
                    c0360u.f749c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0360u;
            case 3:
                C0361V c0361v = new C0361V();
                c0361v.f751a = parcel.readInt();
                c0361v.f752b = parcel.readInt();
                int i3 = parcel.readInt();
                c0361v.f753c = i3;
                if (i3 > 0) {
                    int[] iArr2 = new int[i3];
                    c0361v.f754d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i4 = parcel.readInt();
                c0361v.f755e = i4;
                if (i4 > 0) {
                    int[] iArr3 = new int[i4];
                    c0361v.f756f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0361v.f758h = parcel.readInt() == 1;
                c0361v.f759i = parcel.readInt() == 1;
                c0361v.f760j = parcel.readInt() == 1;
                c0361v.f757g = parcel.readArrayList(C0360U.class.getClassLoader());
                return c0361v;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f463a) {
            case 0:
                return new C0223l[i2];
            case 1:
                return new C0384t[i2];
            case 2:
                return new C0360U[i2];
            case 3:
                return new C0361V[i2];
            default:
                return new ParcelImpl[i2];
        }
    }
}

package p078r;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1063f extends AbstractC0239b {
    public static final Parcelable.Creator<C1063f> CREATOR = new C0023I(6);

    /* JADX INFO: renamed from: c */
    public SparseArray f4081c;

    public C1063f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        int[] iArr = new int[i2];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f4081c = new SparseArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4081c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f4081c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f4081c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f4081c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}

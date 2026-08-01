package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: be */
/* JADX INFO: loaded from: classes.dex */
public final class C0065be extends AbstractC0133d {
    public static final Parcelable.Creator<C0065be> CREATOR = new C0086c(3);

    /* JADX INFO: renamed from: c */
    public SparseArray f809c;

    public C0065be(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f809c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f809c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f809c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f809c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f809c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}

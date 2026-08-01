package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0101ce extends AbstractC0133d {
    public static final Parcelable.Creator<C0101ce> CREATOR = new C0086c(3);

    /* JADX INFO: renamed from: c */
    public SparseArray f891c;

    public C0101ce(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f891c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f891c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC0133d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f891c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f891c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f891c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}

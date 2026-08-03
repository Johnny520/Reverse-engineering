package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: Vb */
/* JADX INFO: loaded from: classes.dex */
public final class C0920Vb extends AbstractC2393q {
    public static final Parcelable.Creator<C0920Vb> CREATOR = new C2342p(3);

    /* JADX INFO: renamed from: c */
    public SparseArray f2875c;

    public C0920Vb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f2875c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f2875c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.AbstractC2393q, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f2875c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f2875c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f2875c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}

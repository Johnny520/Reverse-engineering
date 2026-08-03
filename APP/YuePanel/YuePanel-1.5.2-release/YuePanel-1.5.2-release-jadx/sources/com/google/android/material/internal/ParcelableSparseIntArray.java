package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ParcelableSparseIntArray extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseIntArray> CREATOR = new Parcelable.Creator<ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public ParcelableSparseIntArray createFromParcel(@InterfaceC6391 Parcel parcel) {
            int i = parcel.readInt();
            ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i);
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i2 = 0; i2 < i; i2++) {
                parcelableSparseIntArray.put(iArr[i2], iArr2[i2]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public ParcelableSparseIntArray[] newArray(int i) {
            return new ParcelableSparseIntArray[i];
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelableSparseIntArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            iArr2[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ParcelableSparseIntArray(int i) {
        super(i);
    }

    public ParcelableSparseIntArray(@InterfaceC6391 SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); i++) {
            put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }
}

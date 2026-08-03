package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSparseArray> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSparseArray>() { // from class: com.google.android.material.internal.ParcelableSparseArray.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public ParcelableSparseArray[] newArray(int i) {
            return new ParcelableSparseArray[i];
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @InterfaceC6391
        public ParcelableSparseArray createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6490
        public ParcelableSparseArray createFromParcel(@InterfaceC6391 Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelableSparseArray() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ParcelableSparseArray(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < i; i2++) {
            put(iArr[i2], parcelableArray[i2]);
        }
    }
}

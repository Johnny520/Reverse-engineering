package com.google.android.material.stateful;

import Yue.AbstractC2967;
import Yue.C7467;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ExtendableSavedState extends AbstractC2967 {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6391
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        @InterfaceC6391
        public ExtendableSavedState createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @InterfaceC6490
        public ExtendableSavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }
    };

    @InterfaceC6391
    public final C7467<String, Bundle> extendableStates;

    @InterfaceC6391
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // Yue.AbstractC2967, android.os.Parcelable
    public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.extendableStates.keyAt(i2);
            bundleArr[i2] = this.extendableStates.valueAt(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new C7467<>();
    }

    private ExtendableSavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new C7467<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.extendableStates.put(strArr[i2], bundleArr[i2]);
        }
    }
}

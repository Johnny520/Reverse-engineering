package com.google.android.material.internal;

import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.versionedparcelable.ParcelImpl;
import com.android.dx.io.Opcodes;
import com.google.android.material.badge.BadgeState$State;
import java.util.Locale;
import p174.BinderC7736;
import p174.C7738;
import p174.InterfaceC7737;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3163 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10526;

    public /* synthetic */ C3163(int i) {
        this.f10526 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        InterfaceC7737 interfaceC7737 = null;
        switch (this.f10526) {
            case 0:
                int i2 = parcel.readInt();
                ParcelableSparseBooleanArray parcelableSparseBooleanArray = new ParcelableSparseBooleanArray(i2);
                int[] iArr = new int[i2];
                boolean[] zArr = new boolean[i2];
                parcel.readIntArray(iArr);
                parcel.readBooleanArray(zArr);
                while (i < i2) {
                    parcelableSparseBooleanArray.put(iArr[i], zArr[i]);
                    i++;
                }
                return parcelableSparseBooleanArray;
            case 1:
                int i3 = parcel.readInt();
                ParcelableSparseIntArray parcelableSparseIntArray = new ParcelableSparseIntArray(i3);
                int[] iArr2 = new int[i3];
                int[] iArr3 = new int[i3];
                parcel.readIntArray(iArr2);
                parcel.readIntArray(iArr3);
                while (i < i3) {
                    parcelableSparseIntArray.put(iArr2[i], iArr3[i]);
                    i++;
                }
                return parcelableSparseIntArray;
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                parcel.getClass();
                return new ActivityResult(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 4:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 5:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = parcel.readStrongBinder();
                int i4 = BinderC7736.f20995;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC7737.f20996);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC7737)) {
                        C7738 c7738 = new C7738();
                        c7738.f20997 = strongBinder;
                        interfaceC7737 = c7738;
                    } else {
                        interfaceC7737 = (InterfaceC7737) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f0 = interfaceC7737;
                return resultReceiver;
            default:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f9977 = Opcodes.CONST_METHOD_TYPE;
                badgeState$State.f9966 = -2;
                badgeState$State.f9965 = -2;
                badgeState$State.f9964 = -2;
                badgeState$State.f9970 = Boolean.TRUE;
                badgeState$State.f9982 = parcel.readInt();
                badgeState$State.f9980 = (Integer) parcel.readSerializable();
                badgeState$State.f9981 = (Integer) parcel.readSerializable();
                badgeState$State.f9975 = (Integer) parcel.readSerializable();
                badgeState$State.f9974 = (Integer) parcel.readSerializable();
                badgeState$State.f9978 = (Integer) parcel.readSerializable();
                badgeState$State.f9979 = (Integer) parcel.readSerializable();
                badgeState$State.f9976 = (Integer) parcel.readSerializable();
                badgeState$State.f9977 = parcel.readInt();
                badgeState$State.f9967 = parcel.readString();
                badgeState$State.f9966 = parcel.readInt();
                badgeState$State.f9965 = parcel.readInt();
                badgeState$State.f9964 = parcel.readInt();
                badgeState$State.f9962 = parcel.readString();
                badgeState$State.f9973 = parcel.readString();
                badgeState$State.f9972 = parcel.readInt();
                badgeState$State.f9971 = (Integer) parcel.readSerializable();
                badgeState$State.f9969 = (Integer) parcel.readSerializable();
                badgeState$State.f9968 = (Integer) parcel.readSerializable();
                badgeState$State.f9959 = (Integer) parcel.readSerializable();
                badgeState$State.f9958 = (Integer) parcel.readSerializable();
                badgeState$State.f9961 = (Integer) parcel.readSerializable();
                badgeState$State.f9960 = (Integer) parcel.readSerializable();
                badgeState$State.f9954 = (Integer) parcel.readSerializable();
                badgeState$State.f9956 = (Integer) parcel.readSerializable();
                badgeState$State.f9957 = (Integer) parcel.readSerializable();
                badgeState$State.f9970 = (Boolean) parcel.readSerializable();
                badgeState$State.f9963 = (Locale) parcel.readSerializable();
                badgeState$State.f9953 = (Boolean) parcel.readSerializable();
                badgeState$State.f9955 = (Integer) parcel.readSerializable();
                return badgeState$State;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10526) {
            case 0:
                return new ParcelableSparseBooleanArray[i];
            case 1:
                return new ParcelableSparseIntArray[i];
            case 2:
                return new ParcelImpl[i];
            case 3:
                return new ActivityResult[i];
            case 4:
                return new IntentSenderRequest[i];
            case 5:
                return new ResultReceiver[i];
            default:
                return new BadgeState$State[i];
        }
    }
}

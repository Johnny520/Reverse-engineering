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
import com.android.p002dx.p005io.Opcodes;
import com.google.android.material.badge.BadgeState$State;
import java.util.Locale;
import p190.BinderC8565;
import p190.C8567;
import p190.InterfaceC8566;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3995 implements Parcelable.Creator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10871;

    public /* synthetic */ C3995(int i) {
        this.f10871 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 0;
        InterfaceC8566 interfaceC8566 = null;
        switch (this.f10871) {
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
                int i4 = BinderC8565.f21340;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC8566.f21341);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC8566)) {
                        C8567 c8567 = new C8567();
                        c8567.f21342 = strongBinder;
                        interfaceC8566 = c8567;
                    } else {
                        interfaceC8566 = (InterfaceC8566) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f345 = interfaceC8566;
                return resultReceiver;
            default:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.f10322 = Opcodes.CONST_METHOD_TYPE;
                badgeState$State.f10311 = -2;
                badgeState$State.f10310 = -2;
                badgeState$State.f10309 = -2;
                badgeState$State.f10315 = Boolean.TRUE;
                badgeState$State.f10327 = parcel.readInt();
                badgeState$State.f10325 = (Integer) parcel.readSerializable();
                badgeState$State.f10326 = (Integer) parcel.readSerializable();
                badgeState$State.f10320 = (Integer) parcel.readSerializable();
                badgeState$State.f10319 = (Integer) parcel.readSerializable();
                badgeState$State.f10323 = (Integer) parcel.readSerializable();
                badgeState$State.f10324 = (Integer) parcel.readSerializable();
                badgeState$State.f10321 = (Integer) parcel.readSerializable();
                badgeState$State.f10322 = parcel.readInt();
                badgeState$State.f10312 = parcel.readString();
                badgeState$State.f10311 = parcel.readInt();
                badgeState$State.f10310 = parcel.readInt();
                badgeState$State.f10309 = parcel.readInt();
                badgeState$State.f10307 = parcel.readString();
                badgeState$State.f10318 = parcel.readString();
                badgeState$State.f10317 = parcel.readInt();
                badgeState$State.f10316 = (Integer) parcel.readSerializable();
                badgeState$State.f10314 = (Integer) parcel.readSerializable();
                badgeState$State.f10313 = (Integer) parcel.readSerializable();
                badgeState$State.f10304 = (Integer) parcel.readSerializable();
                badgeState$State.f10303 = (Integer) parcel.readSerializable();
                badgeState$State.f10306 = (Integer) parcel.readSerializable();
                badgeState$State.f10305 = (Integer) parcel.readSerializable();
                badgeState$State.f10299 = (Integer) parcel.readSerializable();
                badgeState$State.f10301 = (Integer) parcel.readSerializable();
                badgeState$State.f10302 = (Integer) parcel.readSerializable();
                badgeState$State.f10315 = (Boolean) parcel.readSerializable();
                badgeState$State.f10308 = (Locale) parcel.readSerializable();
                badgeState$State.f10298 = (Boolean) parcel.readSerializable();
                badgeState$State.f10300 = (Integer) parcel.readSerializable();
                return badgeState$State;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10871) {
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

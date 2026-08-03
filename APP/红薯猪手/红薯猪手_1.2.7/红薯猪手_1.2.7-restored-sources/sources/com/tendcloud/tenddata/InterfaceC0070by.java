package com.tendcloud.tenddata;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.tendcloud.tenddata.by */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC0070by extends IInterface {

    /* JADX INFO: renamed from: com.tendcloud.tenddata.by$a */
    public static abstract class a extends Binder implements InterfaceC0070by {
        public a() {
            attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                C0115h.iForInternal("transact first");
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                callback(parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readFloat(), parcel.readDouble(), parcel.readString());
            } else {
                if (i != 2) {
                    C0115h.iForInternal("transact !2");
                    if (i != 1598968902) {
                        C0115h.iForInternal("transact !transaction");
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                    return true;
                }
                C0115h.iForInternal("transact else");
                parcel.enforceInterface("com.hihonor.cloudservice.oaid.IOAIDCallBack");
                callback(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void callback(int i, long j, boolean z, float f, double d, String str);

    void callback(int i, Bundle bundle);
}

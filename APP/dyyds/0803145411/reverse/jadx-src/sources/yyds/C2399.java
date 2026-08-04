package yyds;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: yyds.ᲇᛲᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2399 implements InterfaceC0933 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public IBinder f11820;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11820;
    }

    @Override // yyds.InterfaceC0933
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo2050(InterfaceC1187 interfaceC1187, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0933.f4287);
            parcelObtain.writeStrongInterface(interfaceC1187);
            parcelObtain.writeString(str);
            this.f11820.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // yyds.InterfaceC0933
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo2051(String[] strArr, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0933.f4287);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.f11820.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

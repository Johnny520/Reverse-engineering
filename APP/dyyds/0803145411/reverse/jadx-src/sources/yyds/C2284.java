package yyds;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: yyds.ᲁᛷᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2284 implements InterfaceC1187 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public IBinder f11243;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11243;
    }

    @Override // yyds.InterfaceC1187
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1577(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1187.f5433);
            parcelObtain.writeStringArray(strArr);
            this.f11243.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

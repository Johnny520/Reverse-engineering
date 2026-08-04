package yyds;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: yyds.ᛳᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0661 extends Binder implements InterfaceC1187 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1735 f3154;

    public BinderC0661(C1735 c1735) {
        this.f3154 = c1735;
        attachInterface(this, InterfaceC1187.f5433);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1187.f5433;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo1577(parcel.createStringArray());
        return true;
    }

    @Override // yyds.InterfaceC1187
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo1577(String[] strArr) {
        C1735 c1735 = this.f3154;
        AbstractC2071.m3959(c1735.f8782, null, new C0219(strArr, c1735, null, 9), 3);
    }
}

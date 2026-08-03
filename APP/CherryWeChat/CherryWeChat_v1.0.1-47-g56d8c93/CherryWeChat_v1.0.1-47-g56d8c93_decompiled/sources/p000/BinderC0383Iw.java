package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: Iw */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0383Iw extends Binder implements InterfaceC1058Yk {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f1316c = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0426Jw f1317b;

    public BinderC0383Iw(C0426Jw c0426Jw) {
        this.f1317b = c0426Jw;
        attachInterface(this, InterfaceC1058Yk.f3366a);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1058Yk.f3366a;
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
        this.f1317b.mo882a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}

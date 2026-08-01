package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public final class y80 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UnusedAppRestrictionsBackportService f5362a;

    public y80(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.f5362a = unusedAppRestrictionsBackportService;
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0825vo c0825vo;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c0825vo = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C0825vo)) {
                C0825vo c0825vo2 = new C0825vo();
                c0825vo2.f4969a = strongBinder;
                c0825vo = c0825vo2;
            } else {
                c0825vo = (C0825vo) iInterfaceQueryLocalInterface;
            }
        }
        if (c0825vo == null) {
            return true;
        }
        this.f5362a.m217a();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

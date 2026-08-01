package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.core.content.UnusedAppRestrictionsBackportService;

/* JADX INFO: loaded from: classes.dex */
public final class t80 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UnusedAppRestrictionsBackportService f4548a;

    public t80(UnusedAppRestrictionsBackportService unusedAppRestrictionsBackportService) {
        this.f4548a = unusedAppRestrictionsBackportService;
        attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C0678ro c0678ro;
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
            c0678ro = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C0678ro)) {
                C0678ro c0678ro2 = new C0678ro();
                c0678ro2.f4332a = strongBinder;
                c0678ro = c0678ro2;
            } else {
                c0678ro = (C0678ro) iInterfaceQueryLocalInterface;
            }
        }
        if (c0678ro == null) {
            return true;
        }
        this.f4548a.m232a();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}

package p001;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import p001.InterfaceC0464y3;

/* JADX INFO: renamed from: ۟.z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0477z3 extends Binder implements IInterface {
    public AbstractBinderC0477z3() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC0464y3 c0497a = null;
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                c0497a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0464y3)) ? new InterfaceC0464y3.a.C0497a(strongBinder) : (InterfaceC0464y3) iInterfaceQueryLocalInterface;
            }
            int iM980 = ((MultiInstanceInvalidationService.BinderC0001b) this).m980(c0497a, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iM980);
            return true;
        }
        if (i != 2) {
            if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                ((MultiInstanceInvalidationService.BinderC0001b) this).m0(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            c0497a = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0464y3)) ? new InterfaceC0464y3.a.C0497a(strongBinder2) : (InterfaceC0464y3) iInterfaceQueryLocalInterface2;
        }
        int i3 = parcel.readInt();
        MultiInstanceInvalidationService.BinderC0001b binderC0001b = (MultiInstanceInvalidationService.BinderC0001b) this;
        synchronized (MultiInstanceInvalidationService.this.f1242) {
            MultiInstanceInvalidationService.this.f1242.unregister(c0497a);
            MultiInstanceInvalidationService.this.f1.remove(Integer.valueOf(i3));
        }
        parcel2.writeNoException();
        return true;
    }
}

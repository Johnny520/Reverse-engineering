package yyds;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: yyds.ᲈᛸ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0032 extends Binder implements InterfaceC0933 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ int f13338 = 0;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ MultiInstanceInvalidationService f13339;

    public BinderC0032(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f13339 = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0933.f4287);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0933.f4287;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC1187 interfaceC1187 = null;
        InterfaceC1187 interfaceC11872 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1187.f5433);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1187)) {
                    C2284 c2284 = new C2284();
                    c2284.f11243 = strongBinder;
                    interfaceC1187 = c2284;
                } else {
                    interfaceC1187 = (InterfaceC1187) iInterfaceQueryLocalInterface;
                }
            }
            int iMo2050 = mo2050(interfaceC1187, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iMo2050);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo2051(parcel.createStringArray(), parcel.readInt());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC1187.f5433);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC1187)) {
                C2284 c22842 = new C2284();
                c22842.f11243 = strongBinder2;
                interfaceC11872 = c22842;
            } else {
                interfaceC11872 = (InterfaceC1187) iInterfaceQueryLocalInterface2;
            }
        }
        int i3 = parcel.readInt();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f13339;
        synchronized (multiInstanceInvalidationService.f367) {
            multiInstanceInvalidationService.f367.unregister(interfaceC11872);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // yyds.InterfaceC0933
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo2050(InterfaceC1187 interfaceC1187, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f13339;
        synchronized (multiInstanceInvalidationService.f367) {
            try {
                int i2 = multiInstanceInvalidationService.f368 + 1;
                multiInstanceInvalidationService.f368 = i2;
                if (multiInstanceInvalidationService.f367.register(interfaceC1187, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f370.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f368--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // yyds.InterfaceC0933
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo2051(String[] strArr, int i) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f13339;
        synchronized (multiInstanceInvalidationService.f367) {
            String str = (String) multiInstanceInvalidationService.f370.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f367.beginBroadcast();
            int i2 = 0;
            while (true) {
                RemoteCallbackListC0218 remoteCallbackListC0218 = multiInstanceInvalidationService.f367;
                if (i2 >= iBeginBroadcast) {
                    remoteCallbackListC0218.finishBroadcast();
                    return;
                }
                try {
                    Integer num = (Integer) remoteCallbackListC0218.getBroadcastCookie(i2);
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f370.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((InterfaceC1187) multiInstanceInvalidationService.f367.getBroadcastItem(i2)).mo1577(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.f367.finishBroadcast();
                    throw th;
                }
            }
        }
    }
}

package Yue;

import Yue.InterfaceC5406;
import Yue.InterfaceC7144;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public interface InterfaceC5408 extends IInterface {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f13298 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace(C8039.f23873, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۨ$ۥ */
    public static class C0750 implements InterfaceC5408 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // Yue.InterfaceC5408
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo16896(InterfaceC5406 interfaceC5406) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۨ$ۥ۟ */
    public static abstract class AbstractBinderC0751 extends Binder implements InterfaceC5408 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13299 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۨ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C5409 implements InterfaceC5408 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public IBinder f13300;

            public C5409(IBinder iBinder) {
                this.f13300 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13300;
            }

            @Override // Yue.InterfaceC5408
            /* JADX INFO: renamed from: ۥ۟۟ */
            public void mo16896(InterfaceC5406 interfaceC5406) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5408.f13298);
                    parcelObtain.writeStrongInterface(interfaceC5406);
                    this.f13300.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String m16898() {
                return InterfaceC5408.f13298;
            }
        }

        public AbstractBinderC0751() {
            attachInterface(this, InterfaceC5408.f13298);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC5408 m16897(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5408.f13298);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5408)) ? new C5409(iBinder) : (InterfaceC5408) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5408.f13298;
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
            mo16896(InterfaceC5406.AbstractBinderC0749.m16894(parcel.readStrongBinder()));
            return true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    void mo16896(InterfaceC5406 interfaceC5406) throws RemoteException;
}

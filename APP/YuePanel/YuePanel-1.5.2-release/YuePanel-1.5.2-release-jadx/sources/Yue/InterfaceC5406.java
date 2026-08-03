package Yue;

import Yue.InterfaceC7144;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public interface InterfaceC5406 extends IInterface {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f13295 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace(C8039.f23873, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ */
    public static class C0748 implements InterfaceC5406 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // Yue.InterfaceC5406
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo16893(boolean z, boolean z2) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ۟ */
    public static abstract class AbstractBinderC0749 extends Binder implements InterfaceC5406 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13296 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۧ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C5407 implements InterfaceC5406 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public IBinder f13297;

            public C5407(IBinder iBinder) {
                this.f13297 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13297;
            }

            @Override // Yue.InterfaceC5406
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public void mo16893(boolean z, boolean z2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5406.f13295);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    this.f13297.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String m16895() {
                return InterfaceC5406.f13295;
            }
        }

        public AbstractBinderC0749() {
            attachInterface(this, InterfaceC5406.f13295);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC5406 m16894(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5406.f13295);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5406)) ? new C5407(iBinder) : (InterfaceC5406) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5406.f13295;
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
            mo16893(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    void mo16893(boolean z, boolean z2) throws RemoteException;
}

package Yue;

import Yue.InterfaceC7144;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public interface InterfaceC5402 extends IInterface {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1491 = "android$support$v4$os$IResultReceiver2".replace(C8039.f23873, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ */
    public static class C0746 implements InterfaceC5402 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // Yue.InterfaceC5402
        /* JADX INFO: renamed from: ۥ */
        public void mo2175(int i, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟ */
    public static abstract class AbstractBinderC0747 extends Binder implements InterfaceC5402 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13293 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C5403 implements InterfaceC5402 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public IBinder f13294;

            public C5403(IBinder iBinder) {
                this.f13294 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13294;
            }

            @Override // Yue.InterfaceC5402
            /* JADX INFO: renamed from: ۥ */
            public void mo2175(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5402.f1491);
                    parcelObtain.writeInt(i);
                    C5404.m16892(parcelObtain, bundle, 0);
                    this.f13294.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String m16890() {
                return InterfaceC5402.f1491;
            }
        }

        public AbstractBinderC0747() {
            attachInterface(this, InterfaceC5402.f1491);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC5402 m16889(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5402.f1491);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5402)) ? new C5403(iBinder) : (InterfaceC5402) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5402.f1491;
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
            mo2175(parcel.readInt(), (Bundle) C5404.m16891(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C5404 {
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m16891(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends Parcelable> void m16892(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    void mo2175(int i, Bundle bundle) throws RemoteException;
}

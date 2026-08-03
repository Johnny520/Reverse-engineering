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

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public interface InterfaceC5399 extends IInterface {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f13290 = "android$support$v4$os$IResultReceiver".replace(C8039.f23873, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ */
    public static class C0744 implements InterfaceC5399 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // Yue.InterfaceC5399
        /* JADX INFO: renamed from: ۥ */
        public void mo2172(int i, Bundle bundle) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟ */
    public static abstract class AbstractBinderC0745 extends Binder implements InterfaceC5399 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13291 = 1;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C5400 implements InterfaceC5399 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public IBinder f13292;

            public C5400(IBinder iBinder) {
                this.f13292 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13292;
            }

            @Override // Yue.InterfaceC5399
            /* JADX INFO: renamed from: ۥ */
            public void mo2172(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5399.f13290);
                    parcelObtain.writeInt(i);
                    C5401.m16888(parcelObtain, bundle, 0);
                    this.f13292.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String m16886() {
                return InterfaceC5399.f13290;
            }
        }

        public AbstractBinderC0745() {
            attachInterface(this, InterfaceC5399.f13290);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC5399 m16885(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5399.f13290);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5399)) ? new C5400(iBinder) : (InterfaceC5399) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5399.f13290;
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
            mo2172(parcel.readInt(), (Bundle) C5401.m16887(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C5401 {
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m16887(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends Parcelable> void m16888(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    void mo2172(int i, Bundle bundle) throws RemoteException;
}

package Yue;

import Yue.InterfaceC7144;
import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public interface InterfaceC5395 extends IInterface {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1490 = "android$support$v4$app$INotificationSideChannel".replace(C8039.f23873, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ */
    public static class C0742 implements InterfaceC5395 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2167(String str) throws RemoteException {
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo16878(String str, int i, String str2) throws RemoteException {
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo16879(String str, int i, String str2, Notification notification) throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟ */
    public static abstract class AbstractBinderC0743 extends Binder implements InterfaceC5395 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f13286 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f13287 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f13288 = 3;

        /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class C5396 implements InterfaceC5395 {

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public IBinder f13289;

            public C5396(IBinder iBinder) {
                this.f13289 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13289;
            }

            @Override // Yue.InterfaceC5395
            /* JADX INFO: renamed from: ۥ۟ */
            public void mo2167(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5395.f1490);
                    parcelObtain.writeString(str);
                    this.f13289.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // Yue.InterfaceC5395
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public void mo16878(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5395.f1490);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.f13289.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // Yue.InterfaceC5395
            /* JADX INFO: renamed from: ۥ۟۟۟۠ */
            public void mo16879(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC5395.f1490);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    C5397.m16883(parcelObtain, notification, 0);
                    this.f13289.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public String m16881() {
                return InterfaceC5395.f1490;
            }
        }

        public AbstractBinderC0743() {
            attachInterface(this, InterfaceC5395.f1490);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static InterfaceC5395 m16880(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC5395.f1490);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5395)) ? new C5396(iBinder) : (InterfaceC5395) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = InterfaceC5395.f1490;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                mo16879(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C5397.m16882(parcel, Notification.CREATOR));
            } else if (i == 2) {
                mo16878(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                mo2167(parcel.readString());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C5397 {
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m16882(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends Parcelable> void m16883(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    void mo2167(String str) throws RemoteException;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    void mo16878(String str, int i, String str2) throws RemoteException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    void mo16879(String str, int i, String str2, Notification notification) throws RemoteException;
}

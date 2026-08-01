package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: android.support.v4.os.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0344a extends IInterface {

    /* JADX INFO: renamed from: a */
    public static final String f983a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: renamed from: android.support.v4.os.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static Object m1097b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo1094a(int i10, Bundle bundle);

    /* JADX INFO: renamed from: android.support.v4.os.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a extends Binder implements InterfaceC0344a {

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static class C10042a implements InterfaceC0344a {

            /* JADX INFO: renamed from: b */
            public IBinder f984b;

            public C10042a(IBinder iBinder) {
                this.f984b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f984b;
            }
        }

        public a() {
            attachInterface(this, InterfaceC0344a.f983a);
        }

        /* JADX INFO: renamed from: b */
        public static InterfaceC0344a m1095b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0344a.f983a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0344a)) ? new C10042a(iBinder) : (InterfaceC0344a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC0344a.f983a;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            mo1094a(parcel.readInt(), (Bundle) b.m1097b(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

package io.github.libxposed.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public interface IXposedScopeCallback extends IInterface {
    public static final String DESCRIPTOR = "io.github.libxposed.service.IXposedScopeCallback";

    void onScopeRequestApproved(List<String> list);

    void onScopeRequestFailed(String str);

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static class Default implements IXposedScopeCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // io.github.libxposed.service.IXposedScopeCallback
        public void onScopeRequestApproved(List<String> list) {
        }

        @Override // io.github.libxposed.service.IXposedScopeCallback
        public void onScopeRequestFailed(String str) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static abstract class Stub extends Binder implements IXposedScopeCallback {
        static final int TRANSACTION_onScopeRequestApproved = 2;
        static final int TRANSACTION_onScopeRequestFailed = 3;

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public static class Proxy implements IXposedScopeCallback {
            private IBinder mRemote;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String getInterfaceDescriptor() {
                return IXposedScopeCallback.DESCRIPTOR;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedScopeCallback
            public void onScopeRequestApproved(List<String> list) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedScopeCallback.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(Stub.TRANSACTION_onScopeRequestApproved, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedScopeCallback
            public void onScopeRequestFailed(String str) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedScopeCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_onScopeRequestFailed, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Stub() {
            attachInterface(this, IXposedScopeCallback.DESCRIPTOR);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static IXposedScopeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IXposedScopeCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXposedScopeCallback)) ? new Proxy(iBinder) : (IXposedScopeCallback) iInterfaceQueryLocalInterface;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IXposedScopeCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IXposedScopeCallback.DESCRIPTOR);
                return true;
            }
            if (i == TRANSACTION_onScopeRequestApproved) {
                onScopeRequestApproved(parcel.createStringArrayList());
            } else {
                if (i != TRANSACTION_onScopeRequestFailed) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onScopeRequestFailed(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

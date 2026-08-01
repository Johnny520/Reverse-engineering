package io.github.libxposed.service;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import io.github.libxposed.service.IXposedScopeCallback;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public interface IXposedService extends IInterface {
    public static final String AUTHORITY_SUFFIX = ".XposedService";
    public static final String DESCRIPTOR = "io.github.libxposed.service.IXposedService";
    public static final int LIB_API = 101;
    public static final long PROP_CAP_REMOTE = 2;
    public static final long PROP_CAP_SYSTEM = 1;
    public static final long PROP_RT_API_PROTECTION = 4;
    public static final String SEND_BINDER = "SendBinder";

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static class _Parcel {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    boolean deleteRemoteFile(String str);

    void deleteRemotePreferences(String str);

    int getApiVersion();

    String getFrameworkName();

    long getFrameworkProperties();

    String getFrameworkVersion();

    long getFrameworkVersionCode();

    List<String> getScope();

    String[] listRemoteFiles();

    ParcelFileDescriptor openRemoteFile(String str);

    void removeScope(List<String> list);

    Bundle requestRemotePreferences(String str);

    void requestScope(List<String> list, IXposedScopeCallback iXposedScopeCallback);

    void updateRemotePreferences(String str, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static class Default implements IXposedService {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public boolean deleteRemoteFile(String str) {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public int getApiVersion() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public String getFrameworkName() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public long getFrameworkProperties() {
            return 0L;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public String getFrameworkVersion() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public long getFrameworkVersionCode() {
            return 0L;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public List<String> getScope() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public String[] listRemoteFiles() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public ParcelFileDescriptor openRemoteFile(String str) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // io.github.libxposed.service.IXposedService
        public Bundle requestRemotePreferences(String str) {
            return null;
        }

        @Override // io.github.libxposed.service.IXposedService
        public void deleteRemotePreferences(String str) {
        }

        @Override // io.github.libxposed.service.IXposedService
        public void removeScope(List<String> list) {
        }

        @Override // io.github.libxposed.service.IXposedService
        public void requestScope(List<String> list, IXposedScopeCallback iXposedScopeCallback) {
        }

        @Override // io.github.libxposed.service.IXposedService
        public void updateRemotePreferences(String str, Bundle bundle) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static abstract class Stub extends Binder implements IXposedService {
        static final int TRANSACTION_deleteRemoteFile = 33;
        static final int TRANSACTION_deleteRemotePreferences = 23;
        static final int TRANSACTION_getApiVersion = 2;
        static final int TRANSACTION_getFrameworkName = 3;
        static final int TRANSACTION_getFrameworkProperties = 6;
        static final int TRANSACTION_getFrameworkVersion = 4;
        static final int TRANSACTION_getFrameworkVersionCode = 5;
        static final int TRANSACTION_getScope = 11;
        static final int TRANSACTION_listRemoteFiles = 31;
        static final int TRANSACTION_openRemoteFile = 32;
        static final int TRANSACTION_removeScope = 13;
        static final int TRANSACTION_requestRemotePreferences = 21;
        static final int TRANSACTION_requestScope = 12;
        static final int TRANSACTION_updateRemotePreferences = 22;

        /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
        public static class Proxy implements IXposedService {
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
            @Override // io.github.libxposed.service.IXposedService
            public boolean deleteRemoteFile(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_deleteRemoteFile, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public void deleteRemotePreferences(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_deleteRemotePreferences, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public int getApiVersion() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getApiVersion, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public String getFrameworkName() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getFrameworkName, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public long getFrameworkProperties() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getFrameworkProperties, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public String getFrameworkVersion() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getFrameworkVersion, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public long getFrameworkVersionCode() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getFrameworkVersionCode, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public String getInterfaceDescriptor() {
                return IXposedService.DESCRIPTOR;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public List<String> getScope() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getScope, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArrayList();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public String[] listRemoteFiles() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_listRemoteFiles, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createStringArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public ParcelFileDescriptor openRemoteFile(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_openRemoteFile, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ParcelFileDescriptor) _Parcel.readTypedObject(parcelObtain2, ParcelFileDescriptor.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public void removeScope(List<String> list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    this.mRemote.transact(Stub.TRANSACTION_removeScope, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public Bundle requestRemotePreferences(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_requestRemotePreferences, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.readTypedObject(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public void requestScope(List<String> list, IXposedScopeCallback iXposedScopeCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeStrongInterface(iXposedScopeCallback);
                    this.mRemote.transact(Stub.TRANSACTION_requestScope, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // io.github.libxposed.service.IXposedService
            public void updateRemotePreferences(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IXposedService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    _Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(Stub.TRANSACTION_updateRemotePreferences, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Stub() {
            attachInterface(this, IXposedService.DESCRIPTOR);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static IXposedService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IXposedService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IXposedService)) ? new Proxy(iBinder) : (IXposedService) iInterfaceQueryLocalInterface;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IXposedService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IXposedService.DESCRIPTOR);
                return true;
            }
            if (i == TRANSACTION_getApiVersion) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i == TRANSACTION_getFrameworkName) {
                String frameworkName = getFrameworkName();
                parcel2.writeNoException();
                parcel2.writeString(frameworkName);
                return true;
            }
            if (i == TRANSACTION_getFrameworkVersion) {
                String frameworkVersion = getFrameworkVersion();
                parcel2.writeNoException();
                parcel2.writeString(frameworkVersion);
                return true;
            }
            if (i == TRANSACTION_getFrameworkVersionCode) {
                long frameworkVersionCode = getFrameworkVersionCode();
                parcel2.writeNoException();
                parcel2.writeLong(frameworkVersionCode);
                return true;
            }
            if (i == TRANSACTION_getFrameworkProperties) {
                long frameworkProperties = getFrameworkProperties();
                parcel2.writeNoException();
                parcel2.writeLong(frameworkProperties);
                return true;
            }
            switch (i) {
                case TRANSACTION_getScope /* 11 */:
                    List<String> scope = getScope();
                    parcel2.writeNoException();
                    parcel2.writeStringList(scope);
                    return true;
                case TRANSACTION_requestScope /* 12 */:
                    requestScope(parcel.createStringArrayList(), IXposedScopeCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case TRANSACTION_removeScope /* 13 */:
                    removeScope(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case TRANSACTION_requestRemotePreferences /* 21 */:
                            Bundle bundleRequestRemotePreferences = requestRemotePreferences(parcel.readString());
                            parcel2.writeNoException();
                            _Parcel.writeTypedObject(parcel2, bundleRequestRemotePreferences, 1);
                            return true;
                        case TRANSACTION_updateRemotePreferences /* 22 */:
                            updateRemotePreferences(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                            parcel2.writeNoException();
                            return true;
                        case TRANSACTION_deleteRemotePreferences /* 23 */:
                            deleteRemotePreferences(parcel.readString());
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case TRANSACTION_listRemoteFiles /* 31 */:
                                    String[] strArrListRemoteFiles = listRemoteFiles();
                                    parcel2.writeNoException();
                                    parcel2.writeStringArray(strArrListRemoteFiles);
                                    return true;
                                case TRANSACTION_openRemoteFile /* 32 */:
                                    ParcelFileDescriptor parcelFileDescriptorOpenRemoteFile = openRemoteFile(parcel.readString());
                                    parcel2.writeNoException();
                                    _Parcel.writeTypedObject(parcel2, parcelFileDescriptorOpenRemoteFile, 1);
                                    return true;
                                case TRANSACTION_deleteRemoteFile /* 33 */:
                                    boolean zDeleteRemoteFile = deleteRemoteFile(parcel.readString());
                                    parcel2.writeNoException();
                                    parcel2.writeInt(zDeleteRemoteFile ? 1 : 0);
                                    return true;
                                default:
                                    return super.onTransact(i, parcel, parcel2, i2);
                            }
                    }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

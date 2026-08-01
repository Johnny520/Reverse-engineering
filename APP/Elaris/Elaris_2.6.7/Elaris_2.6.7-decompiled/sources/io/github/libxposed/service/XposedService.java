package io.github.libxposed.service;

import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import io.github.libxposed.service.IXposedScopeCallback;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0555ye;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedService {
    public static final long PROP_CAP_REMOTE = 2;
    public static final long PROP_CAP_SYSTEM = 1;
    public static final long PROP_RT_API_PROTECTION = 4;
    private static final Map<OnScopeEventListener, IXposedScopeCallback> scopeCallbacks = new ConcurrentHashMap();
    private final Map<String, RemotePreferences> mRemotePrefs = new HashMap();
    private final IXposedService mService;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public XposedService(IXposedService iXposedService) {
        this.mService = iXposedService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ RemotePreferences lambda$getRemotePreferences$0(String str) {
        try {
            return RemotePreferences.newInstance(this, str);
        } catch (RemoteException e) {
            Throwable cause = e.getCause();
            if (cause instanceof UnsupportedOperationException) {
                throw ((UnsupportedOperationException) cause);
            }
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IXposedService asInterface() {
        return this.mService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean deleteRemoteFile(String str) {
        try {
            return this.mService.deleteRemoteFile(str);
        } catch (RemoteException e) {
            Throwable cause = e.getCause();
            if (cause instanceof UnsupportedOperationException) {
                throw ((UnsupportedOperationException) cause);
            }
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void deleteRemotePreferences(String str) {
        try {
            try {
                RemotePreferences remotePreferences = this.mRemotePrefs.get(str);
                if (remotePreferences != null) {
                    remotePreferences.onDelete();
                }
                this.mService.deleteRemotePreferences(str);
            } catch (RemoteException e) {
                Throwable cause = e.getCause();
                if (!(cause instanceof UnsupportedOperationException)) {
                    throw new ServiceException(e);
                }
                throw ((UnsupportedOperationException) cause);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getApiVersion() {
        try {
            return this.mService.getApiVersion();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getFrameworkName() {
        try {
            return this.mService.getFrameworkName();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getFrameworkProperties() {
        try {
            return this.mService.getFrameworkProperties();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getFrameworkVersion() {
        try {
            return this.mService.getFrameworkVersion();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getFrameworkVersionCode() {
        try {
            return this.mService.getFrameworkVersionCode();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized SharedPreferences getRemotePreferences(String str) {
        return this.mRemotePrefs.computeIfAbsent(str, new C0555ye(0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<String> getScope() {
        try {
            return this.mService.getScope();
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] listRemoteFiles() {
        try {
            String[] strArrListRemoteFiles = this.mService.listRemoteFiles();
            if (strArrListRemoteFiles != null) {
                return strArrListRemoteFiles;
            }
            throw new ServiceException("Framework returns null");
        } catch (RemoteException e) {
            Throwable cause = e.getCause();
            if (cause instanceof UnsupportedOperationException) {
                throw ((UnsupportedOperationException) cause);
            }
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelFileDescriptor openRemoteFile(String str) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenRemoteFile = this.mService.openRemoteFile(str);
            if (parcelFileDescriptorOpenRemoteFile != null) {
                return parcelFileDescriptorOpenRemoteFile;
            }
            throw new ServiceException("Framework returns null");
        } catch (RemoteException e) {
            Throwable cause = e.getCause();
            if (cause instanceof UnsupportedOperationException) {
                throw ((UnsupportedOperationException) cause);
            }
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeScope(List<String> list) {
        try {
            this.mService.removeScope(list);
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestScope(List<String> list, OnScopeEventListener onScopeEventListener) {
        try {
            this.mService.requestScope(list, onScopeEventListener.asInterface());
        } catch (RemoteException e) {
            throw new ServiceException(e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class ServiceException extends RuntimeException {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ServiceException(RemoteException remoteException) {
            super("Xposed service error", remoteException);
        }

        public ServiceException(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public interface OnScopeEventListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        default IXposedScopeCallback asInterface() {
            return (IXposedScopeCallback) XposedService.scopeCallbacks.computeIfAbsent(this, new C0555ye(1, this));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: Access modifiers changed from: private */
        /* synthetic */ default IXposedScopeCallback lambda$asInterface$0(final OnScopeEventListener onScopeEventListener) {
            return new IXposedScopeCallback.Stub() { // from class: io.github.libxposed.service.XposedService.OnScopeEventListener.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // io.github.libxposed.service.IXposedScopeCallback
                public void onScopeRequestApproved(List<String> list) {
                    onScopeEventListener.onScopeRequestApproved(list);
                    XposedService.scopeCallbacks.remove(onScopeEventListener);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // io.github.libxposed.service.IXposedScopeCallback
                public void onScopeRequestFailed(String str) {
                    onScopeEventListener.onScopeRequestFailed(str);
                    XposedService.scopeCallbacks.remove(onScopeEventListener);
                }
            };
        }

        default void onScopeRequestApproved(List<String> list) {
        }

        default void onScopeRequestFailed(String str) {
        }
    }
}

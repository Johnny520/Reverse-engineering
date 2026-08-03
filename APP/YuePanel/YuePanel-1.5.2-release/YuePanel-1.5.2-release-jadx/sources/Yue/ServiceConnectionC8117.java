package Yue;

import Yue.InterfaceC5406;
import Yue.InterfaceC5408;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC8117 implements ServiceConnection {

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public C7120<Integer> f3225;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Context f24042;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC8392
    @InterfaceC6490
    public InterfaceC5408 f3224 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f24043 = false;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۢ$ۥ */
    public class BinderC1438 extends InterfaceC5406.AbstractBinderC0749 {
        public BinderC1438() {
        }

        @Override // Yue.InterfaceC5406
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo16893(boolean z, boolean z2) throws RemoteException {
            if (!z) {
                ServiceConnectionC8117.this.f3225.mo5833(0);
                Log.e(C6591.f2154, "Unable to retrieve the permission revocation setting from the backport");
            } else if (z2) {
                ServiceConnectionC8117.this.f3225.mo5833(3);
            } else {
                ServiceConnectionC8117.this.f3225.mo5833(2);
            }
        }
    }

    public ServiceConnectionC8117(@InterfaceC6391 Context context) {
        this.f24042 = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC5408 interfaceC5408M16897 = InterfaceC5408.AbstractBinderC0751.m16897(iBinder);
        this.f3224 = interfaceC5408M16897;
        try {
            interfaceC5408M16897.mo16896(m26722());
        } catch (RemoteException unused) {
            this.f3225.mo5833(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f3224 = null;
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4149(@InterfaceC6391 C7120<Integer> c7120) {
        if (this.f24043) {
            throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
        }
        this.f24043 = true;
        this.f3225 = c7120;
        this.f24042.bindService(new Intent(AbstractServiceC8116.f24039).setPackage(C6591.m3050(this.f24042.getPackageManager())), this, 1);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4150() {
        if (!this.f24043) {
            throw new IllegalStateException("bindService must be called before unbind");
        }
        this.f24043 = false;
        this.f24042.unbindService(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC5406 m26722() {
        return new BinderC1438();
    }
}

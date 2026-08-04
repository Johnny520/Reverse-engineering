package yyds;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: yyds.ᛲᛸ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0015 implements ServiceConnection {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1735 f2141;

    public ServiceConnectionC0015(C1735 c1735) {
        this.f2141 = c1735;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0933 interfaceC0933;
        int i = BinderC0032.f13338;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0933.f4287);
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0933)) {
            C2399 c2399 = new C2399();
            c2399.f11820 = iBinder;
            interfaceC0933 = c2399;
        } else {
            interfaceC0933 = (InterfaceC0933) iInterfaceQueryLocalInterface;
        }
        C1735 c1735 = this.f2141;
        c1735.f8777 = interfaceC0933;
        try {
            c1735.f8781 = interfaceC0933.mo2050(c1735.f8779, c1735.f8775);
        } catch (RemoteException e) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f2141.f8777 = null;
    }
}

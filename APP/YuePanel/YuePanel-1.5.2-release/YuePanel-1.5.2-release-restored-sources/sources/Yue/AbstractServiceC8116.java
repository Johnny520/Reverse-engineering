package Yue;

import Yue.InterfaceC5408;
import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC8116 extends Service {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f24039 = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC5408.AbstractBinderC0751 f24040 = new BinderC1437();

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ */
    public class BinderC1437 extends InterfaceC5408.AbstractBinderC0751 {
        public BinderC1437() {
        }

        @Override // Yue.InterfaceC5408
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo16896(@InterfaceC6490 InterfaceC5406 interfaceC5406) throws RemoteException {
            if (interfaceC5406 == null) {
                return;
            }
            AbstractServiceC8116.this.m4148(new C8115(interfaceC5406));
        }
    }

    @Override // android.app.Service
    @InterfaceC6490
    public IBinder onBind(@InterfaceC6490 Intent intent) {
        return this.f24040;
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void m4148(@InterfaceC6391 C8115 c8115);
}

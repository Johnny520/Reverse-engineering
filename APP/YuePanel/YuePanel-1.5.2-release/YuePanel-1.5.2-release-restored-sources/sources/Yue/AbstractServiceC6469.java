package Yue;

import Yue.InterfaceC5395;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: renamed from: Yue.ۥۡۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC6469 extends Service {

    /* JADX INFO: renamed from: Yue.ۥۡۢۦۣ$ۥ */
    public class BinderC0995 extends InterfaceC5395.AbstractBinderC0743 {
        public BinderC0995() {
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo2167(String str) {
            AbstractServiceC6469.this.m20421(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC6469.this.m2970(str);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo16878(String str, int i, String str2) throws RemoteException {
            AbstractServiceC6469.this.m20421(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC6469.this.m2969(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // Yue.InterfaceC5395
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo16879(String str, int i, String str2, Notification notification) throws RemoteException {
            AbstractServiceC6469.this.m20421(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                AbstractServiceC6469.this.m20422(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    @Override // android.app.Service
    @InterfaceC4373(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent) {
        intent.getAction().equals(C6470.f16572);
        return null;
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void m2969(String str, int i, String str2);

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract void m2970(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m20421(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void m20422(String str, int i, String str2, Notification notification);
}

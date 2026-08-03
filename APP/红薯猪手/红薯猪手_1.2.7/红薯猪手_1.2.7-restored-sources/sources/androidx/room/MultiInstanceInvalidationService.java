package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import p001.AbstractBinderC0477z3;
import p001.InterfaceC0464y3;

/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: ۥ */
    public int f0 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public final HashMap<Integer, String> f1 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final RemoteCallbackListC0000a f1242 = new RemoteCallbackListC0000a();

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final BinderC0001b f1243 = new BinderC0001b();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    public class RemoteCallbackListC0000a extends RemoteCallbackList<InterfaceC0464y3> {
        public RemoteCallbackListC0000a() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(IInterface iInterface, Object obj) {
            MultiInstanceInvalidationService.this.f1.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    public class BinderC0001b extends AbstractBinderC0477z3 {
        public BinderC0001b() {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m0(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1242) {
                String str = MultiInstanceInvalidationService.this.f1.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f1242.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f1242.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1.get(Integer.valueOf(iIntValue));
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f1242.getBroadcastItem(i2).mo967(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f1242.finishBroadcast();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m980(InterfaceC0464y3 interfaceC0464y3, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1242) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f0 + 1;
                multiInstanceInvalidationService.f0 = i;
                if (multiInstanceInvalidationService.f1242.register(interfaceC0464y3, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f1.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f0--;
                return 0;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1243;
    }
}

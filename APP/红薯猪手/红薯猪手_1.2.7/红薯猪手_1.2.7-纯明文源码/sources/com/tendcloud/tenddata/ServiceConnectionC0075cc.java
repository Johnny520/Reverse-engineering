package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.tendcloud.tenddata.C0074cb;
import com.tendcloud.tenddata.InterfaceC0070by;
import com.tendcloud.tenddata.InterfaceC0080ch;
import java.util.concurrent.CountDownLatch;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cc */
/* JADX INFO: loaded from: classes.dex */
class ServiceConnectionC0075cc implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public C0074cb.a f368a;

    /* JADX INFO: renamed from: b */
    public CountDownLatch f369b = new CountDownLatch(2);

    /* JADX INFO: renamed from: c */
    public b f370c = new b();

    /* JADX INFO: renamed from: d */
    public a f371d = new a();

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cc$a */
    public class a extends InterfaceC0070by.a {
        public a() {
        }

        @Override // com.tendcloud.tenddata.InterfaceC0070by
        public void callback(int i, long j, boolean z, float f, double d, String str) {
            C0115h.iForInternal("SSSS", "OAIDCallback.callback(" + i + "," + j + "," + z + "," + f + "," + d + "," + str + ")");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.tendcloud.tenddata.InterfaceC0070by
        public void callback(int i, Bundle bundle) {
            C0115h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult retcode=" + i + " retInfo=" + bundle);
            if (i != 0 || bundle == null) {
                C0115h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult error retcode=$ " + i);
            } else {
                C0074cb.a aVar = ServiceConnectionC0075cc.this.f368a;
                if (aVar != null) {
                    aVar.f367id = bundle.getString("oa_id_flag");
                    StringBuilder sbM1039 = C0167c4.m1039("OAIDCallBack handleResult success:");
                    sbM1039.append(ServiceConnectionC0075cc.this.f368a.f367id);
                    C0115h.iForInternal("SSSS-AdvertisingIdPlatform", sbM1039.toString());
                }
            }
            ServiceConnectionC0075cc.this.f369b.countDown();
        }
    }

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cc$b */
    public class b extends InterfaceC0070by.a {
        public b() {
        }

        @Override // com.tendcloud.tenddata.InterfaceC0070by
        public void callback(int i, long j, boolean z, float f, double d, String str) {
            C0115h.iForInternal("SSSS", "OAIDLimitCallback.callback(" + i + "," + j + "," + z + "," + f + "," + d + "," + str + ")");
        }

        @Override // com.tendcloud.tenddata.InterfaceC0070by
        public void callback(int i, Bundle bundle) {
            C0115h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDCallBack handleResult retCode=" + i + " retInfo= " + bundle);
            if (i != 0 || bundle == null) {
                C0115h.eForInternal("SSSS-AdvertisingIdPlatform", "OAIDLimitCallback handleResult error retCode= " + i);
            } else if (ServiceConnectionC0075cc.this.f368a != null) {
                boolean z = bundle.getBoolean("oa_id_limit_state");
                ServiceConnectionC0075cc.this.f368a.isLimit = z;
                C0115h.iForInternal("SSSS-AdvertisingIdPlatform", "OAIDLimitCallback handleResult success  isLimit=" + z);
            }
            ServiceConnectionC0075cc.this.f369b.countDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0115h.iForInternal("SSSS-AdvertisingIdPlatform", "onServiceConnected ");
        this.f368a = new C0074cb.a();
        if (iBinder == null) {
            C0115h.iForInternal("SSSS", "service connected but service is null");
            return;
        }
        C0115h.iForInternal("SSSS", "service connected and do get");
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.hihonor.cloudservice.oaid.IOAIDService");
        if (iInterfaceQueryLocalInterface == null) {
            C0115h.iForInternal("SSSS", "local interface is null");
        } else {
            StringBuilder sbM1039 = C0167c4.m1039("local interface class:");
            sbM1039.append(iInterfaceQueryLocalInterface.getClass().getCanonicalName());
            C0115h.iForInternal("SSSS", sbM1039.toString());
        }
        InterfaceC0080ch.a.C0489a c0489a = new InterfaceC0080ch.a.C0489a(iBinder);
        c0489a.mo409a(this.f371d);
        c0489a.mo410b(this.f370c);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C0115h.iForInternal("AdvertisingIdPlatform", "onServiceDisconnected ");
        this.f369b.countDown();
        this.f369b.countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void unbind(Context context) {
        C0115h.iForInternal("AdvertisingIdPlatform", "disconnect");
        try {
            context.unbindService(this);
        } catch (Exception e) {
            StringBuilder sbM1039 = C0167c4.m1039("OAIDClientImpl#disconnect#Disconnect error::");
            sbM1039.append(e.getMessage());
            C0115h.eForInternal("AdvertisingIdPlatform", sbM1039.toString());
        }
    }
}

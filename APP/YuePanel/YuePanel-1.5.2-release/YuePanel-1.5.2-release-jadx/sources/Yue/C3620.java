package Yue;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C3620 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static IBinder m672(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str) {
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m673(@InterfaceC6391 Bundle bundle, @InterfaceC6490 String str, @InterfaceC6490 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

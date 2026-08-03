package androidx.core.app;

import Yue.AbstractC8178;
import Yue.InterfaceC7144;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC8178 abstractC8178) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3750 = (IconCompat) abstractC8178.m27036(remoteActionCompat.f3750, 1);
        remoteActionCompat.f3751 = abstractC8178.m26999(remoteActionCompat.f3751, 2);
        remoteActionCompat.f29453 = abstractC8178.m26999(remoteActionCompat.f29453, 3);
        remoteActionCompat.f29454 = (PendingIntent) abstractC8178.m27025(remoteActionCompat.f29454, 4);
        remoteActionCompat.f29455 = abstractC8178.m26989(remoteActionCompat.f29455, 5);
        remoteActionCompat.f29456 = abstractC8178.m26989(remoteActionCompat.f29456, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC8178 abstractC8178) {
        abstractC8178.mo27038(false, false);
        abstractC8178.m27093(remoteActionCompat.f3750, 1);
        abstractC8178.m27054(remoteActionCompat.f3751, 2);
        abstractC8178.m27054(remoteActionCompat.f29453, 3);
        abstractC8178.m27078(remoteActionCompat.f29454, 4);
        abstractC8178.m27042(remoteActionCompat.f29455, 5);
        abstractC8178.m27042(remoteActionCompat.f29456, 6);
    }
}

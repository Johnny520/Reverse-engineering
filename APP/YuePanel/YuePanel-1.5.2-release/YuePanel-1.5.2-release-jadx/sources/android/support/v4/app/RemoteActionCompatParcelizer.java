package android.support.v4.app;

import Yue.AbstractC8178;
import Yue.InterfaceC7144;
import androidx.core.app.RemoteActionCompat;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC8178 abstractC8178) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(abstractC8178);
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC8178 abstractC8178) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, abstractC8178);
    }
}

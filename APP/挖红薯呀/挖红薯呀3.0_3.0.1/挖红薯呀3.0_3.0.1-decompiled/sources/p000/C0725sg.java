package p000;

import android.os.RemoteException;

/* JADX INFO: renamed from: sg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0725sg extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0725sg(RemoteException remoteException) {
        super("Xposed service error", remoteException);
    }
}

package p000;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0449lz f3481a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ConcurrentHashMap();
        ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public lf1(InterfaceC0449lz interfaceC0449lz) {
        new HashMap();
        this.f3481a = interfaceC0449lz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m2020a() {
        try {
            C0373jz c0373jz = (C0373jz) this.f3481a;
            c0373jz.getClass();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("io.github.libxposed.service.IXposedService");
                c0373jz.f2960a.transact(5, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readLong();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            throw new C0725sg(e);
        }
    }
}

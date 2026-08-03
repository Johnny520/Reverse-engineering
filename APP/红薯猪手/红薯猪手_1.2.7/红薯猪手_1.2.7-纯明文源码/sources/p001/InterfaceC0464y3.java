package p001;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۟.y3 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0464y3 extends IInterface {

    /* JADX INFO: renamed from: ۟.y3$a */
    public static abstract class a extends Binder implements InterfaceC0464y3 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int f1207 = 0;

        /* JADX INFO: renamed from: ۟.y3$a$a, reason: collision with other inner class name */
        public static class C0497a implements InterfaceC0464y3 {

            /* JADX INFO: renamed from: ۥ */
            public IBinder f1208;

            public C0497a(IBinder iBinder) {
                this.f1208 = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f1208;
            }

            @Override // p001.InterfaceC0464y3
            /* JADX INFO: renamed from: ۥ */
            public final void mo967(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    if (!this.f1208.transact(1, parcelObtain, null, 1)) {
                        int i = a.f1207;
                    }
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    void mo967(String[] strArr);
}

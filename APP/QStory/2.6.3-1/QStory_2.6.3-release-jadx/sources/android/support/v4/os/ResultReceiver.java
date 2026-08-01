package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3995;
import p190.BinderC8565;
import p190.InterfaceC8566;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C3995(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC8566 f345;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f345 == null) {
                    BinderC8565 binderC8565 = new BinderC8565();
                    binderC8565.attachInterface(binderC8565, InterfaceC8566.f21341);
                    this.f345 = binderC8565;
                }
                parcel.writeStrongBinder(this.f345.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

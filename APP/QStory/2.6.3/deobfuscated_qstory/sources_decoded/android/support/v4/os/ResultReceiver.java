package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3163;
import p174.BinderC7736;
import p174.InterfaceC7737;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C3163(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7737 f0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f0 == null) {
                    BinderC7736 binderC7736 = new BinderC7736();
                    binderC7736.attachInterface(binderC7736, InterfaceC7737.f20996);
                    this.f0 = binderC7736;
                }
                parcel.writeStrongBinder(this.f0.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package android.support.v4.os;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3162;
import p174.BinderC7735;
import p174.InterfaceC7736;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C3162(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7736 f0;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f0 == null) {
                    BinderC7735 binderC7735 = new BinderC7735();
                    binderC7735.attachInterface(binderC7735, InterfaceC7736.f21001);
                    this.f0 = binderC7735;
                }
                parcel.writeStrongBinder(this.f0.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

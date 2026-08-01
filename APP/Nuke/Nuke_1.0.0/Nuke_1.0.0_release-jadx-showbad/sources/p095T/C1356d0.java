package p095T;

import android.os.Parcel;
import android.os.Parcelable;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: T.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1356d0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4792a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4792a) {
            case 0:
                return new C1358e0(parcel.readFloat());
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1360f0(parcel.readInt());
            default:
                return new C1362g0(parcel.readLong());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f4792a) {
            case 0:
                return new C1358e0[i5];
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C1360f0[i5];
            default:
                return new C1362g0[i5];
        }
    }
}

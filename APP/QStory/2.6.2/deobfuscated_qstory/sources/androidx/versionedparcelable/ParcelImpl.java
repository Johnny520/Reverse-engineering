package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3162;
import p149.C7574;
import p149.InterfaceC7573;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C3162(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7573 f7643;

    public ParcelImpl(Parcel parcel) {
        this.f7643 = new C7574(parcel).m12776();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C7574(parcel).m12777(this.f7643);
    }
}

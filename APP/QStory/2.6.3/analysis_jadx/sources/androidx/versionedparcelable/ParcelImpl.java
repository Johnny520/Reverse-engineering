package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.C3163;
import p149.C7575;
import p149.InterfaceC7574;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C3163(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7574 f7644;

    public ParcelImpl(Parcel parcel) {
        this.f7644 = new C7575(parcel).m12805();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C7575(parcel).m12806(this.f7644);
    }
}

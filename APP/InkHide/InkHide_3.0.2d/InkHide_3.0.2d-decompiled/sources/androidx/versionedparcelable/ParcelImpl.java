package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p006D.C0085n;
import p032Q.C0239b;
import p032Q.InterfaceC0240c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0085n(1);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0240c f1544a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ParcelImpl(Parcel parcel) {
        this.f1544a = new C0239b(parcel).m455g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        new C0239b(parcel).m457i(this.f1544a);
    }
}

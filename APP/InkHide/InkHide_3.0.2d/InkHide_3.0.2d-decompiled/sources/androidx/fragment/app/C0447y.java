package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p006D.C0085n;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0447y implements Parcelable {
    public static final Parcelable.Creator<C0447y> CREATOR = new C0085n(4);

    /* JADX INFO: renamed from: a */
    public String f1421a;

    /* JADX INFO: renamed from: b */
    public int f1422b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1421a);
        parcel.writeInt(this.f1422b);
    }
}

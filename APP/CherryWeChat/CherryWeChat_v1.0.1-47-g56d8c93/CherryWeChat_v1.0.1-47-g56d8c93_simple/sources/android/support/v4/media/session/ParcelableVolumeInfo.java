package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f3664a;

    /* JADX INFO: renamed from: b */
    public int f3665b;

    /* JADX INFO: renamed from: c */
    public int f3666c;

    /* JADX INFO: renamed from: d */
    public int f3667d;

    /* JADX INFO: renamed from: e */
    public int f3668e;

    static {
        CREATOR = new C0646P0(20);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f3664a);
        r1.writeInt(this.f3666c);
        r1.writeInt(this.f3667d);
        r1.writeInt(this.f3668e);
        r1.writeInt(this.f3665b);
    }
}

package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0646P0(22);

    /* JADX INFO: renamed from: a */
    public final int f3657a;

    /* JADX INFO: renamed from: b */
    public final float f3658b;

    public RatingCompat(int i, float f) {
        this.f3657a = i;
        this.f3658b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3657a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f3657a);
        sb.append(" rating=");
        float f = this.f3658b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3657a);
        parcel.writeFloat(this.f3658b);
    }
}

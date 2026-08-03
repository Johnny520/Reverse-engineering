package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final int f3657a;

    /* JADX INFO: renamed from: b */
    public final float f3658b;

    static {
        CREATOR = new C0646P0(22);
    }

    public RatingCompat(int r1, float r2) {
        this.f3657a = r1;
        this.f3658b = r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f3657a;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Rating:style=");
        r0.append(this.f3657a);
        r0.append(" rating=");
        float r2 = this.f3658b;
        if (r2 >= 0.0f) goto L5;
        String r1 = "unrated";
    L6:
        r0.append(r1);
        return r0.toString();
    L5:
        r1 = String.valueOf(r2);
        goto L6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f3657a);
        r1.writeFloat(this.f3658b);
    }
}

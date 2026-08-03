package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.AbstractC1293cr;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0646P0(21);

    /* JADX INFO: renamed from: a */
    public final int f3669a;

    /* JADX INFO: renamed from: b */
    public final long f3670b;

    /* JADX INFO: renamed from: c */
    public final long f3671c;

    /* JADX INFO: renamed from: d */
    public final float f3672d;

    /* JADX INFO: renamed from: e */
    public final long f3673e;

    /* JADX INFO: renamed from: f */
    public final int f3674f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f3675g;

    /* JADX INFO: renamed from: h */
    public final long f3676h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3677i;

    /* JADX INFO: renamed from: j */
    public final long f3678j;

    /* JADX INFO: renamed from: k */
    public final Bundle f3679k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C1151b();

        /* JADX INFO: renamed from: a */
        public final String f3680a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f3681b;

        /* JADX INFO: renamed from: c */
        public final int f3682c;

        /* JADX INFO: renamed from: d */
        public final Bundle f3683d;

        public CustomAction(Parcel parcel) {
            this.f3680a = parcel.readString();
            this.f3681b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3682c = parcel.readInt();
            this.f3683d = parcel.readBundle(AbstractC1293cr.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3681b) + ", mIcon=" + this.f3682c + ", mExtras=" + this.f3683d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f3680a);
            TextUtils.writeToParcel(this.f3681b, parcel, i);
            parcel.writeInt(this.f3682c);
            parcel.writeBundle(this.f3683d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3669a = parcel.readInt();
        this.f3670b = parcel.readLong();
        this.f3672d = parcel.readFloat();
        this.f3676h = parcel.readLong();
        this.f3671c = parcel.readLong();
        this.f3673e = parcel.readLong();
        this.f3675g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3677i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3678j = parcel.readLong();
        this.f3679k = parcel.readBundle(AbstractC1293cr.class.getClassLoader());
        this.f3674f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3669a + ", position=" + this.f3670b + ", buffered position=" + this.f3671c + ", speed=" + this.f3672d + ", updated=" + this.f3676h + ", actions=" + this.f3673e + ", error code=" + this.f3674f + ", error message=" + this.f3675g + ", custom actions=" + this.f3677i + ", active item id=" + this.f3678j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3669a);
        parcel.writeLong(this.f3670b);
        parcel.writeFloat(this.f3672d);
        parcel.writeLong(this.f3676h);
        parcel.writeLong(this.f3671c);
        parcel.writeLong(this.f3673e);
        TextUtils.writeToParcel(this.f3675g, parcel, i);
        parcel.writeTypedList(this.f3677i);
        parcel.writeLong(this.f3678j);
        parcel.writeBundle(this.f3679k);
        parcel.writeInt(this.f3674f);
    }
}

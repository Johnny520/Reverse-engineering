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
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = null;

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
        public static final Parcelable.Creator<CustomAction> CREATOR = null;

        /* JADX INFO: renamed from: a */
        public final String f3680a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f3681b;

        /* JADX INFO: renamed from: c */
        public final int f3682c;

        /* JADX INFO: renamed from: d */
        public final Bundle f3683d;

        static {
            CREATOR = new C1151b();
        }

        public CustomAction(Parcel r2) {
            this.f3680a = r2.readString();
            this.f3681b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r2);
            this.f3682c = r2.readInt();
            this.f3683d = r2.readBundle(AbstractC1293cr.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f3681b + ", mIcon=" + this.f3682c + ", mExtras=" + this.f3683d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            r2.writeString(this.f3680a);
            TextUtils.writeToParcel(this.f3681b, r2, r3);
            r2.writeInt(this.f3682c);
            r2.writeBundle(this.f3683d);
        }
    }

    static {
        CREATOR = new C0646P0(21);
    }

    public PlaybackStateCompat(Parcel r3) {
        this.f3669a = r3.readInt();
        this.f3670b = r3.readLong();
        this.f3672d = r3.readFloat();
        this.f3676h = r3.readLong();
        this.f3671c = r3.readLong();
        this.f3673e = r3.readLong();
        this.f3675g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(r3);
        this.f3677i = r3.createTypedArrayList(CustomAction.CREATOR);
        this.f3678j = r3.readLong();
        this.f3679k = r3.readBundle(AbstractC1293cr.class.getClassLoader());
        this.f3674f = r3.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3669a + ", position=" + this.f3670b + ", buffered position=" + this.f3671c + ", speed=" + this.f3672d + ", updated=" + this.f3676h + ", actions=" + this.f3673e + ", error code=" + this.f3674f + ", error message=" + this.f3675g + ", custom actions=" + this.f3677i + ", active item id=" + this.f3678j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.writeInt(this.f3669a);
        r3.writeLong(this.f3670b);
        r3.writeFloat(this.f3672d);
        r3.writeLong(this.f3676h);
        r3.writeLong(this.f3671c);
        r3.writeLong(this.f3673e);
        TextUtils.writeToParcel(this.f3675g, r3, r4);
        r3.writeTypedList(this.f3677i);
        r3.writeLong(this.f3678j);
        r3.writeBundle(this.f3679k);
        r3.writeInt(this.f3674f);
    }
}

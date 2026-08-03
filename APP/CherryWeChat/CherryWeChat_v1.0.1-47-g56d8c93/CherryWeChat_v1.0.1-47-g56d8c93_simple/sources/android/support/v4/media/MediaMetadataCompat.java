package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC1293cr;
import p000.C0521M4;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final Bundle f3656a;

    static {
        C0521M4 r0 = new C0521M4(0);
        r0.put("android.media.metadata.TITLE", 1);
        r0.put("android.media.metadata.ARTIST", 1);
        r0.put("android.media.metadata.DURATION", 0);
        r0.put("android.media.metadata.ALBUM", 1);
        r0.put("android.media.metadata.AUTHOR", 1);
        r0.put("android.media.metadata.WRITER", 1);
        r0.put("android.media.metadata.COMPOSER", 1);
        r0.put("android.media.metadata.COMPILATION", 1);
        r0.put("android.media.metadata.DATE", 1);
        r0.put("android.media.metadata.YEAR", 0);
        r0.put("android.media.metadata.GENRE", 1);
        r0.put("android.media.metadata.TRACK_NUMBER", 0);
        r0.put("android.media.metadata.NUM_TRACKS", 0);
        r0.put("android.media.metadata.DISC_NUMBER", 0);
        r0.put("android.media.metadata.ALBUM_ARTIST", 1);
        r0.put("android.media.metadata.ART", 2);
        r0.put("android.media.metadata.ART_URI", 1);
        r0.put("android.media.metadata.ALBUM_ART", 2);
        r0.put("android.media.metadata.ALBUM_ART_URI", 1);
        r0.put("android.media.metadata.USER_RATING", 3);
        r0.put("android.media.metadata.RATING", 3);
        r0.put("android.media.metadata.DISPLAY_TITLE", 1);
        r0.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        r0.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        r0.put("android.media.metadata.DISPLAY_ICON", 2);
        r0.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        r0.put("android.media.metadata.MEDIA_ID", 1);
        r0.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        r0.put("android.media.metadata.MEDIA_URI", 1);
        r0.put("android.media.metadata.ADVERTISEMENT", 0);
        r0.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0646P0(14);
    }

    public MediaMetadataCompat(Parcel r2) {
        this.f3656a = r2.readBundle(AbstractC1293cr.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeBundle(this.f3656a);
    }
}

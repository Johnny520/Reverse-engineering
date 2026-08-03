package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1151b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r2) {
        return new PlaybackStateCompat.CustomAction(r2);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new PlaybackStateCompat.CustomAction[r1];
    }
}

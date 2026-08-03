package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1150a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r3) {
        MediaSessionCompat$ResultReceiverWrapper r0 = new MediaSessionCompat$ResultReceiverWrapper();
        r0.f3661a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(r3);
        return r0;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r1) {
        return new MediaSessionCompat$ResultReceiverWrapper[r1];
    }
}

package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import p000.AbstractC1293cr;
import p000.C0426Jw;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C0426Jw {
    @Override // p000.C0426Jw
    /* JADX INFO: renamed from: a */
    public final void mo882a(int r3, Bundle r4) {
        if (r4 == null) goto L8;
        r4.setClassLoader(AbstractC1293cr.class.getClassLoader());
        r4.isEmpty();     // Catch: BadParcelableException -> L7
    L7:
        r4 = null;
    L8:
        if (r3 != 0) goto L20;
        if (r4 != null) goto L11;
        throw null;
    L11:
        if (r4.containsKey("media_item") == false) goto L24;
        Parcelable r32 = r4.getParcelable("media_item");
        if (r32 != null) goto L15;
    L18:
        MediaBrowserCompat$MediaItem r33 = (MediaBrowserCompat$MediaItem) r32;
        throw null;
    L15:
        if ((r32 instanceof MediaBrowserCompat$MediaItem) == true) goto L18;
        throw null;
    L24:
        throw null;
    L20:
        throw null;
    }
}

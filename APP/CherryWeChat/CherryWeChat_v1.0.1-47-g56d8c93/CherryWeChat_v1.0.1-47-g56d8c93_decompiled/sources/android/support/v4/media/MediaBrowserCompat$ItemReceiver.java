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
    public final void mo882a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(AbstractC1293cr.class.getClassLoader());
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}

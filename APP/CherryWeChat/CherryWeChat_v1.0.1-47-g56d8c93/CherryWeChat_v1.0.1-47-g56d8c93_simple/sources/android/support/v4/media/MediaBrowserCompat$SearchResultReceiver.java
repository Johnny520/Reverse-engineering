package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import p000.AbstractC1293cr;
import p000.C0426Jw;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends C0426Jw {
    @Override // p000.C0426Jw
    /* JADX INFO: renamed from: a */
    public final void mo882a(int r5, Bundle r6) {
        if (r6 == null) goto L8;
        r6.setClassLoader(AbstractC1293cr.class.getClassLoader());
        r6.isEmpty();     // Catch: BadParcelableException -> L7
    L7:
        r6 = null;
    L8:
        if (r5 != 0) goto L16;
        if (r6 != null) goto L11;
        throw null;
    L11:
        if (r6.containsKey("search_results") == false) goto L21;
        Parcelable[] r52 = r6.getParcelableArray("search_results");
        r52.getClass();
        ArrayList r62 = new ArrayList(r52.length);
        int r1 = r52.length;
        int r2 = 0;
    L13:
        if (r2 >= r1) goto L15;
        r62.add((MediaBrowserCompat$MediaItem) r52[r2]);
        r2 = r2 + 1;
        goto L13
    L15:
        throw null;
    L21:
        throw null;
    L16:
        throw null;
    }
}

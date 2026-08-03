package p000;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1232br {
    /* JADX INFO: renamed from: a */
    public static Uri m2354a(MediaDescription r0) {
        return r0.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m2355b(MediaDescription.Builder r0, Uri r1) {
        r0.setMediaUri(r1);
    }
}

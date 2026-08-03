package p000;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: renamed from: br */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1232br {
    /* JADX INFO: renamed from: a */
    public static Uri m2354a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* JADX INFO: renamed from: b */
    public static void m2355b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}

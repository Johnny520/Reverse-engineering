package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: fr */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1424fr {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ AssetFileDescriptor m2736a(ContentResolver r2, Uri r3) {
        return MediaStore.openAssetFileDescriptor(r2, r3, "r", null);
    }
}

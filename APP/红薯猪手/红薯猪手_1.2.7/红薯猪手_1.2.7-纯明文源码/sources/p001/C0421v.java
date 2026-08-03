package p001;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import p001.AbstractC0469y8;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0421v extends AbstractC0469y8 {

    /* JADX INFO: renamed from: ۥ */
    public final AssetManager f1144;

    public C0421v(Context context) {
        this.f1144 = context.getAssets();
    }

    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo831(C0443w8 c0443w8) {
        Uri uri = c0443w8.f1842;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) {
        return new AbstractC0469y8.a(this.f1144.open(c0443w8.f1842.toString().substring(22)), C0481z7.e.DISK);
    }
}

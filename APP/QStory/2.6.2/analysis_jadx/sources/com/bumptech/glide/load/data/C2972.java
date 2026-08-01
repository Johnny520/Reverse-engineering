package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2972 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f9396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AssetManager f9397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f9398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f9399;

    public C2972(AssetManager assetManager, String str, int i) {
        this.f9396 = i;
        this.f9397 = assetManager;
        this.f9399 = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f9397;
            String str = this.f9399;
            switch (this.f9396) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f9398 = objOpenFd;
            interfaceC2962.mo6376(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC2962.mo6377(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        Object obj = this.f9398;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f9396) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        switch (this.f9396) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
    }
}

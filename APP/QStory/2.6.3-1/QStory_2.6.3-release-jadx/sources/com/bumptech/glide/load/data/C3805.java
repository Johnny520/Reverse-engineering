package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3805 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f9743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AssetManager f9744;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f9745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f9746;

    public C3805(AssetManager assetManager, String str, int i) {
        this.f9743 = i;
        this.f9744 = assetManager;
        this.f9746 = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f9744;
            String str = this.f9746;
            switch (this.f9743) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f9745 = objOpenFd;
            interfaceC3795.mo6994(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            interfaceC3795.mo6995(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        Object obj = this.f9745;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f9743) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        switch (this.f9743) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
    }
}

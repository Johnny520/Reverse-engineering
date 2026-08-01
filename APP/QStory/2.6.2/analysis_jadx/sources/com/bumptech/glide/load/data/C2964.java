package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3064;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2964 extends AbstractC2966 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f9376;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2964(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f9376 = i;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2966
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo6378(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        int i = this.f9376;
        boolean z = this.f9381;
        ContentResolver contentResolver2 = this.f9380;
        switch (i) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z || !AbstractC3064.m6779(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    C2941.m6342(uri, "FileDescriptor is null for: ");
                }
                break;
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z || !AbstractC3064.m6779(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
                    C2941.m6342(uri, "FileDescriptor is null for: ");
                }
                break;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2966
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6379(Object obj) throws IOException {
        switch (this.f9376) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        switch (this.f9376) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }
}

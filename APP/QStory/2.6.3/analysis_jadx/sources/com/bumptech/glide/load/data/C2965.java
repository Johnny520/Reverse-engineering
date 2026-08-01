package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.alibaba.fastjson2.C2942;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.reflect.jvm.internal.AbstractC5062;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2965 extends AbstractC2967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f9378;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2965(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f9378 = i;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2967
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object mo6436(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        int i = this.f9378;
        boolean z = this.f9383;
        ContentResolver contentResolver2 = this.f9382;
        switch (i) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z || !AbstractC5062.m10041(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    C2942.m6400(uri, "FileDescriptor is null for: ");
                }
                break;
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z || !AbstractC5062.m10041(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
                    C2942.m6400(uri, "FileDescriptor is null for: ");
                }
                break;
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.AbstractC2967
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo6437(Object obj) throws IOException {
        switch (this.f9378) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        switch (this.f9378) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.bumptech.glide.AbstractC1925g;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1931a extends AbstractC1942l {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6564h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1931a(ContentResolver contentResolver, Uri uri, boolean z5, int i5) {
        super(contentResolver, uri, z5);
        this.f6564h = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f6564h) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.AbstractC1942l
    /* JADX INFO: renamed from: e */
    public final void mo3596e(Object obj) throws IOException {
        switch (this.f6564h) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.AbstractC1942l
    /* JADX INFO: renamed from: f */
    public final Object mo3597f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f6564h) {
            case 0:
                boolean z5 = this.f6586d;
                ContentResolver contentResolver2 = this.f6588f;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z5 || !AbstractC1925g.m3546w(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z6 = this.f6586d;
                ContentResolver contentResolver3 = this.f6588f;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z6 || !AbstractC1925g.m3546w(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver3.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver3, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}

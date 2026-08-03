package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: T4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821T4 extends AbstractC1019Xo {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0821T4(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f2593e = i;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch (this.f2593e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: b */
    public final void mo1623b(Object obj) throws IOException {
        switch (this.f2593e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // p000.AbstractC1019Xo
    /* JADX INFO: renamed from: e */
    public final Object mo1624e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.f2593e) {
            case 0:
                boolean z = this.f3227a;
                ContentResolver contentResolver2 = this.f3229c;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (!z || !AbstractC0628Oj.m1227H(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver2.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor;
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
            default:
                boolean z2 = this.f3227a;
                ContentResolver contentResolver3 = this.f3229c;
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (!z2 || !AbstractC0628Oj.m1227H(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) ? contentResolver3.openAssetFileDescriptor(uri, "r") : MediaStore.openAssetFileDescriptor(contentResolver3, uri, "r", null);
                if (assetFileDescriptorOpenAssetFileDescriptor2 != null) {
                    return assetFileDescriptorOpenAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException("FileDescriptor is null for: " + uri);
        }
    }
}

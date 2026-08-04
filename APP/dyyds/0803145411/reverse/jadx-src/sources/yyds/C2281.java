package yyds;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᲁᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281 extends AbstractC0112 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11221;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2281(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.f11221 = i;
    }

    @Override // yyds.AbstractC0112
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final Object mo416(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        int i = this.f11221;
        boolean z = this.f789;
        ContentResolver contentResolver2 = this.f788;
        switch (i) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = (z && AbstractC0598.m1481(uri) && SdkExtensions.getExtensionVersion(30) >= 17) ? MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    C1693.m3441(uri, "FileDescriptor is null for: ");
                }
                break;
            default:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = (z && AbstractC0598.m1481(uri) && SdkExtensions.getExtensionVersion(30) >= 17) ? MediaStore.openAssetFileDescriptor(contentResolver2, uri, "r", null) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorOpenAssetFileDescriptor2 == null) {
                    C1693.m3441(uri, "FileDescriptor is null for: ");
                }
                break;
        }
        return null;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        switch (this.f11221) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // yyds.AbstractC0112
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo418(Object obj) throws IOException {
        switch (this.f11221) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }
}

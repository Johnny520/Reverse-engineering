package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class AssetFileDescriptorLocalUriFetcher extends LocalUriFetcher<AssetFileDescriptor> {
    public AssetFileDescriptorLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @InterfaceC6391
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: loadResource(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public AssetFileDescriptor loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}

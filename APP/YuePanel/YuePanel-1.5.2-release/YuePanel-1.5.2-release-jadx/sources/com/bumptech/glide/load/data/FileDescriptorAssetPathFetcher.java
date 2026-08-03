package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorAssetPathFetcher extends AssetPathFetcher<AssetFileDescriptor> {
    public FileDescriptorAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @InterfaceC6391
    public Class<AssetFileDescriptor> getDataClass() {
        return AssetFileDescriptor.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: loadResource(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public AssetFileDescriptor loadResource(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}

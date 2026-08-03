package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class StreamAssetPathFetcher extends AssetPathFetcher<InputStream> {
    public StreamAssetPathFetcher(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @InterfaceC6391
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public void close(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: loadResource(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public InputStream loadResource(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}

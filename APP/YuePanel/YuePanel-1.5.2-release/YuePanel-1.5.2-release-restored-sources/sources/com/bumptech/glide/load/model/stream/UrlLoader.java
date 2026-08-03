package com.bumptech.glide.load.model.stream;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class UrlLoader implements ModelLoader<URL, InputStream> {
    private final ModelLoader<GlideUrl, InputStream> glideUrlLoader;

    public static class StreamFactory implements ModelLoaderFactory<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<URL, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlLoader(multiModelLoaderFactory.build(GlideUrl.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public UrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this.glideUrlLoader = modelLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 URL url) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<InputStream> buildLoadData(@InterfaceC6391 URL url, int i, int i2, @InterfaceC6391 Options options) {
        return this.glideUrlLoader.buildLoadData(new GlideUrl(url), i, i2, options);
    }
}

package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {
    private static final Set<String> SCHEMES = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final ModelLoader<GlideUrl, Data> urlLoader;

    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Uri, InputStream> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.build(GlideUrl.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public UrlUriLoader(ModelLoader<GlideUrl, Data> modelLoader) {
        this.urlLoader = modelLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@InterfaceC6391 Uri uri, int i, int i2, @InterfaceC6391 Options options) {
        return this.urlLoader.buildLoadData(new GlideUrl(uri.toString()), i, i2, options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 Uri uri) {
        return SCHEMES.contains(uri.getScheme());
    }
}

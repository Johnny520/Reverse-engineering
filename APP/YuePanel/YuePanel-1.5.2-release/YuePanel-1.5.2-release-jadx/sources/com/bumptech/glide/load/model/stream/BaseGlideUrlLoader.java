package com.bumptech.glide.load.model.stream;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseGlideUrlLoader<Model> implements ModelLoader<Model, InputStream> {
    private final ModelLoader<GlideUrl, InputStream> concreteLoader;

    @InterfaceC6490
    private final ModelCache<Model, GlideUrl> modelCache;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader) {
        this(modelLoader, null);
    }

    private static List<Key> getAlternateKeys(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new GlideUrl(it.next()));
        }
        return arrayList;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    @InterfaceC6490
    public ModelLoader.LoadData<InputStream> buildLoadData(@InterfaceC6391 Model model, int i, int i2, @InterfaceC6391 Options options) {
        ModelCache<Model, GlideUrl> modelCache = this.modelCache;
        GlideUrl glideUrl = modelCache != null ? modelCache.get(model, i, i2) : null;
        if (glideUrl == null) {
            String url = getUrl(model, i, i2, options);
            if (TextUtils.isEmpty(url)) {
                return null;
            }
            GlideUrl glideUrl2 = new GlideUrl(url, getHeaders(model, i, i2, options));
            ModelCache<Model, GlideUrl> modelCache2 = this.modelCache;
            if (modelCache2 != null) {
                modelCache2.put(model, i, i2, glideUrl2);
            }
            glideUrl = glideUrl2;
        }
        List<String> alternateUrls = getAlternateUrls(model, i, i2, options);
        ModelLoader.LoadData<InputStream> loadDataBuildLoadData = this.concreteLoader.buildLoadData(glideUrl, i, i2, options);
        return (loadDataBuildLoadData == null || alternateUrls.isEmpty()) ? loadDataBuildLoadData : new ModelLoader.LoadData<>(loadDataBuildLoadData.sourceKey, getAlternateKeys(alternateUrls), loadDataBuildLoadData.fetcher);
    }

    public List<String> getAlternateUrls(Model model, int i, int i2, Options options) {
        return Collections.emptyList();
    }

    @InterfaceC6490
    public Headers getHeaders(Model model, int i, int i2, Options options) {
        return Headers.DEFAULT;
    }

    public abstract String getUrl(Model model, int i, int i2, Options options);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BaseGlideUrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader, @InterfaceC6490 ModelCache<Model, GlideUrl> modelCache) {
        this.concreteLoader = modelLoader;
        this.modelCache = modelCache;
    }
}

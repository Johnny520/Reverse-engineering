package com.bumptech.glide;

import Yue.InterfaceC5225;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GlideContext extends ContextWrapper {

    @InterfaceC8392
    static final TransitionOptions<?, ?> DEFAULT_TRANSITION_OPTIONS = new GenericTransitionOptions();
    private final ArrayPool arrayPool;
    private final List<RequestListener<Object>> defaultRequestListeners;

    @InterfaceC5225("this")
    @InterfaceC6490
    private RequestOptions defaultRequestOptions;
    private final Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final Map<Class<?>, TransitionOptions<?, ?>> defaultTransitionOptions;
    private final Engine engine;
    private final GlideExperiments experiments;
    private final ImageViewTargetFactory imageViewTargetFactory;
    private final int logLevel;
    private final GlideSuppliers.GlideSupplier<Registry> registry;

    public GlideContext(@InterfaceC6391 Context context, @InterfaceC6391 ArrayPool arrayPool, @InterfaceC6391 GlideSuppliers.GlideSupplier<Registry> glideSupplier, @InterfaceC6391 ImageViewTargetFactory imageViewTargetFactory, @InterfaceC6391 Glide.RequestOptionsFactory requestOptionsFactory, @InterfaceC6391 Map<Class<?>, TransitionOptions<?, ?>> map, @InterfaceC6391 List<RequestListener<Object>> list, @InterfaceC6391 Engine engine, @InterfaceC6391 GlideExperiments glideExperiments, int i) {
        super(context.getApplicationContext());
        this.arrayPool = arrayPool;
        this.imageViewTargetFactory = imageViewTargetFactory;
        this.defaultRequestOptionsFactory = requestOptionsFactory;
        this.defaultRequestListeners = list;
        this.defaultTransitionOptions = map;
        this.engine = engine;
        this.experiments = glideExperiments;
        this.logLevel = i;
        this.registry = GlideSuppliers.memorize(glideSupplier);
    }

    @InterfaceC6391
    public <X> ViewTarget<ImageView, X> buildImageViewTarget(@InterfaceC6391 ImageView imageView, @InterfaceC6391 Class<X> cls) {
        return this.imageViewTargetFactory.buildTarget(imageView, cls);
    }

    @InterfaceC6391
    public ArrayPool getArrayPool() {
        return this.arrayPool;
    }

    public List<RequestListener<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized RequestOptions getDefaultRequestOptions() {
        try {
            if (this.defaultRequestOptions == null) {
                this.defaultRequestOptions = this.defaultRequestOptionsFactory.build().lock();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.defaultRequestOptions;
    }

    @InterfaceC6391
    public <T> TransitionOptions<?, T> getDefaultTransitionOptions(@InterfaceC6391 Class<T> cls) {
        TransitionOptions<?, T> transitionOptions = (TransitionOptions) this.defaultTransitionOptions.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry<Class<?>, TransitionOptions<?, ?>> entry : this.defaultTransitionOptions.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        return transitionOptions == null ? (TransitionOptions<?, T>) DEFAULT_TRANSITION_OPTIONS : transitionOptions;
    }

    @InterfaceC6391
    public Engine getEngine() {
        return this.engine;
    }

    public GlideExperiments getExperiments() {
        return this.experiments;
    }

    public int getLogLevel() {
        return this.logLevel;
    }

    @InterfaceC6391
    public Registry getRegistry() {
        return this.registry.get();
    }
}

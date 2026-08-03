package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ResourceUriLoader<DataT> implements ModelLoader<Uri, DataT> {
    private static final int INVALID_RESOURCE_ID = 0;
    private static final String TAG = "ResourceUriLoader";
    private final Context context;
    private final ModelLoader<Integer, DataT> delegate;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor> {
        private final Context context;

        public AssetFileDescriptorFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Uri, AssetFileDescriptor> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.context, multiModelLoaderFactory.build(Integer.class, AssetFileDescriptor.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        private final Context context;

        public InputStreamFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Uri, InputStream> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceUriLoader(this.context, multiModelLoaderFactory.build(Integer.class, InputStream.class));
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public ResourceUriLoader(Context context, ModelLoader<Integer, DataT> modelLoader) {
        this.context = context.getApplicationContext();
        this.delegate = modelLoader;
    }

    public static ModelLoaderFactory<Uri, AssetFileDescriptor> newAssetFileDescriptorFactory(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory<Uri, InputStream> newStreamFactory(Context context) {
        return new InputStreamFactory(context);
    }

    @InterfaceC6490
    private ModelLoader.LoadData<DataT> parseResourceIdUri(@InterfaceC6391 Uri uri, int i, int i2, @InterfaceC6391 Options options) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 != 0) {
                return this.delegate.buildLoadData(Integer.valueOf(i3), i, i2, options);
            }
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Failed to parse resource id from: " + uri, e);
            }
            return null;
        }
    }

    @InterfaceC6490
    private ModelLoader.LoadData<DataT> parseResourceNameUri(@InterfaceC6391 Uri uri, int i, int i2, @InterfaceC6391 Options options) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.context.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.context.getPackageName());
        if (identifier != 0) {
            return this.delegate.buildLoadData(Integer.valueOf(identifier), i, i2, options);
        }
        if (!Log.isLoggable(TAG, 5)) {
            return null;
        }
        Log.w(TAG, "Failed to find resource id for: " + uri);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    @InterfaceC6490
    public ModelLoader.LoadData<DataT> buildLoadData(@InterfaceC6391 Uri uri, int i, int i2, @InterfaceC6391 Options options) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return parseResourceIdUri(uri, i, i2, options);
        }
        if (pathSegments.size() == 2) {
            return parseResourceNameUri(uri, i, i2, options);
        }
        if (!Log.isLoggable(TAG, 5)) {
            return null;
        }
        Log.w(TAG, "Failed to parse resource uri: " + uri);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.context.getPackageName().equals(uri.getAuthority());
    }
}

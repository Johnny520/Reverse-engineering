package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class DirectResourceLoader<DataT> implements ModelLoader<Integer, DataT> {
    private final Context context;
    private final ResourceOpener<DataT> resourceOpener;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor>, ResourceOpener<AssetFileDescriptor> {
        private final Context context;

        public AssetFileDescriptorFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Integer, AssetFileDescriptor> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.context, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public Class<AssetFileDescriptor> getDataClass() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public void close(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: open(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public AssetFileDescriptor open(@InterfaceC6490 Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }
    }

    public static final class DrawableFactory implements ModelLoaderFactory<Integer, Drawable>, ResourceOpener<Drawable> {
        private final Context context;

        public DrawableFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Integer, Drawable> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.context, this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public void close(Drawable drawable) throws IOException {
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public Class<Drawable> getDataClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: open(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public Drawable open(@InterfaceC6490 Resources.Theme theme, Resources resources, int i) {
            return DrawableDecoderCompat.getDrawable(this.context, i, theme);
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Integer, InputStream>, ResourceOpener<InputStream> {
        private final Context context;

        public InputStreamFactory(Context context) {
            this.context = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<Integer, InputStream> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.context, this);
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: close(Ljava/lang/Object;)V */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public void close(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: open(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public InputStream open(@InterfaceC6490 Resources.Theme theme, Resources resources, int i) {
            return resources.openRawResource(i);
        }
    }

    public static final class ResourceDataFetcher<DataT> implements DataFetcher<DataT> {

        @InterfaceC6490
        private DataT data;
        private final int resourceId;
        private final ResourceOpener<DataT> resourceOpener;
        private final Resources resources;

        @InterfaceC6490
        private final Resources.Theme theme;

        public ResourceDataFetcher(@InterfaceC6490 Resources.Theme theme, Resources resources, ResourceOpener<DataT> resourceOpener, int i) {
            this.theme = theme;
            this.resources = resources;
            this.resourceOpener = resourceOpener;
            this.resourceId = i;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
            DataT datat = this.data;
            if (datat != null) {
                try {
                    this.resourceOpener.close(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public Class<DataT> getDataClass() {
            return this.resourceOpener.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@InterfaceC6391 Priority priority, @InterfaceC6391 DataFetcher.DataCallback<? super DataT> dataCallback) {
            try {
                DataT datatOpen = this.resourceOpener.open(this.theme, this.resources, this.resourceId);
                this.data = datatOpen;
                dataCallback.onDataReady(datatOpen);
            } catch (Resources.NotFoundException e) {
                dataCallback.onLoadFailed(e);
            }
        }
    }

    public interface ResourceOpener<DataT> {
        void close(DataT datat) throws IOException;

        Class<DataT> getDataClass();

        DataT open(@InterfaceC6490 Resources.Theme theme, Resources resources, int i);
    }

    public DirectResourceLoader(Context context, ResourceOpener<DataT> resourceOpener) {
        this.context = context.getApplicationContext();
        this.resourceOpener = resourceOpener;
    }

    public static ModelLoaderFactory<Integer, AssetFileDescriptor> assetFileDescriptorFactory(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory<Integer, Drawable> drawableFactory(Context context) {
        return new DrawableFactory(context);
    }

    public static ModelLoaderFactory<Integer, InputStream> inputStreamFactory(Context context) {
        return new InputStreamFactory(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 Integer num) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<DataT> buildLoadData(@InterfaceC6391 Integer num, int i, int i2, @InterfaceC6391 Options options) {
        Resources.Theme theme = (Resources.Theme) options.get(ResourceDrawableDecoder.THEME);
        return new ModelLoader.LoadData<>(new ObjectKey(num), new ResourceDataFetcher(theme, theme != null ? theme.getResources() : this.context.getResources(), this.resourceOpener, num.intValue()));
    }
}

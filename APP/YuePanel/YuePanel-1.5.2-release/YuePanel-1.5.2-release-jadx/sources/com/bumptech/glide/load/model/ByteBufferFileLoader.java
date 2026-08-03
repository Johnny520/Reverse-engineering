package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {
    private static final String TAG = "ByteBufferFileLoader";

    public static final class ByteBufferFetcher implements DataFetcher<ByteBuffer> {
        private final File file;

        public ByteBufferFetcher(File file) {
            this.file = file;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@InterfaceC6391 Priority priority, @InterfaceC6391 DataFetcher.DataCallback<? super ByteBuffer> dataCallback) {
            try {
                dataCallback.onDataReady(ByteBufferUtil.fromFile(this.file));
            } catch (IOException e) {
                if (Log.isLoggable(ByteBufferFileLoader.TAG, 3)) {
                    Log.d(ByteBufferFileLoader.TAG, "Failed to obtain ByteBuffer for file", e);
                }
                dataCallback.onLoadFailed(e);
            }
        }
    }

    public static class Factory implements ModelLoaderFactory<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<File, ByteBuffer> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteBufferFileLoader();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 File file) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<ByteBuffer> buildLoadData(@InterfaceC6391 File file, int i, int i2, @InterfaceC6391 Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new ByteBufferFetcher(file));
    }
}

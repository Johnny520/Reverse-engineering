package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {
    private final Converter<Data> converter;

    public static class ByteBufferFactory implements ModelLoaderFactory<byte[], ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<byte[], ByteBuffer> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<ByteBuffer>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public Class<ByteBuffer> getDataClass() {
                    return ByteBuffer.class;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: convert([B)Ljava/lang/Object; */
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public ByteBuffer convert(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public interface Converter<Data> {
        Data convert(byte[] bArr);

        Class<Data> getDataClass();
    }

    public static class Fetcher<Data> implements DataFetcher<Data> {
        private final Converter<Data> converter;
        private final byte[] model;

        public Fetcher(byte[] bArr, Converter<Data> converter) {
            this.model = bArr;
            this.converter = converter;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cleanup() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public Class<Data> getDataClass() {
            return this.converter.getDataClass();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @InterfaceC6391
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void loadData(@InterfaceC6391 Priority priority, @InterfaceC6391 DataFetcher.DataCallback<? super Data> dataCallback) {
            dataCallback.onDataReady(this.converter.convert(this.model));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<byte[], InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @InterfaceC6391
        public ModelLoader<byte[], InputStream> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<InputStream>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public Class<InputStream> getDataClass() {
                    return InputStream.class;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: convert([B)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public InputStream convert(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public ByteArrayLoader(Converter<Data> converter) {
        this.converter = converter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;)Z */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@InterfaceC6391 byte[] bArr) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: buildLoadData(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/model/ModelLoader$LoadData; */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<Data> buildLoadData(@InterfaceC6391 byte[] bArr, int i, int i2, @InterfaceC6391 Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(bArr), new Fetcher(bArr, this.converter));
    }
}

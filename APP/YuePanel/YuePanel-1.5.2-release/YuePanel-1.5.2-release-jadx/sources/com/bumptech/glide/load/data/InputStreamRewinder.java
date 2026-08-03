package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InputStreamRewinder implements DataRewinder<InputStream> {
    private static final int MARK_READ_LIMIT = 5242880;
    private final RecyclableBufferedInputStream bufferedStream;

    public static final class Factory implements DataRewinder.Factory<InputStream> {
        private final ArrayPool byteArrayPool;

        public Factory(ArrayPool arrayPool) {
            this.byteArrayPool = arrayPool;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: build(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/DataRewinder; */
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public DataRewinder<InputStream> build(InputStream inputStream) {
            return new InputStreamRewinder(inputStream, this.byteArrayPool);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool arrayPool) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        this.bufferedStream = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(MARK_READ_LIMIT);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
        this.bufferedStream.release();
    }

    public void fixMarkLimits() {
        this.bufferedStream.fixMarkLimit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: rewindAndGet()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @InterfaceC6391
    public InputStream rewindAndGet() throws IOException {
        this.bufferedStream.reset();
        return this.bufferedStream;
    }
}

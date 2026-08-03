package com.bumptech.glide.load.resource.bytes;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {
    private final ByteBuffer buffer;

    public static class Factory implements DataRewinder.Factory<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: build(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/DataRewinder; */
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @InterfaceC6391
        public DataRewinder<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: rewindAndGet()Ljava/lang/Object; */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @InterfaceC6391
    public ByteBuffer rewindAndGet() {
        this.buffer.position(0);
        return this.buffer;
    }
}

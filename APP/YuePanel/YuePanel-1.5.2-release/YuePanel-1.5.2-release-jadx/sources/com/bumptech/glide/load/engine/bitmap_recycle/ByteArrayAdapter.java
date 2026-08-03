package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayAdapter implements ArrayAdapterInterface<byte[]> {
    private static final String TAG = "ByteArrayPool";

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public int getElementSizeInBytes() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public String getTag() {
        return TAG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getArrayLength(Ljava/lang/Object;)I */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public int getArrayLength(byte[] bArr) {
        return bArr.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: newArray(I)Ljava/lang/Object; */
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public byte[] newArray(int i) {
        return new byte[i];
    }
}

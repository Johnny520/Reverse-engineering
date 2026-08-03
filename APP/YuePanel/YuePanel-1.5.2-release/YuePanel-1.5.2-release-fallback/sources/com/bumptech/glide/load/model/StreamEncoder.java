package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public class StreamEncoder implements com.bumptech.glide.load.Encoder<java.io.InputStream> {
    private static final java.lang.String TAG = "StreamEncoder";
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;

    public StreamEncoder(com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1) {
            r0 = this;
            r0.<init>()
            r0.byteArrayPool = r1
            return
    }

    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public boolean encode2(@Yue.InterfaceC4410 java.io.InputStream r5, @Yue.InterfaceC4410 java.io.File r6, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r7) {
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r4.byteArrayPool
            r1 = 65536(0x10000, float:9.1835E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.get(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L35
        L15:
            int r6 = r5.read(r0)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r2 = -1
            if (r6 == r2) goto L26
            r3.write(r0, r1, r6)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            goto L15
        L20:
            r5 = move-exception
            r2 = r3
            goto L4d
        L23:
            r5 = move-exception
            r2 = r3
            goto L36
        L26:
            r3.close()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L23
            r3.close()     // Catch: java.io.IOException -> L2c
        L2c:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r4.byteArrayPool
            r5.put(r0)
            r1 = 1
            goto L4c
        L33:
            r5 = move-exception
            goto L4d
        L35:
            r5 = move-exception
        L36:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L42
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch: java.lang.Throwable -> L33
        L42:
            if (r2 == 0) goto L47
            r2.close()     // Catch: java.io.IOException -> L47
        L47:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r5 = r4.byteArrayPool
            r5.put(r0)
        L4c:
            return r1
        L4d:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L52
        L52:
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r6 = r4.byteArrayPool
            r6.put(r0)
            throw r5
    }

    @Override // com.bumptech.glide.load.Encoder
    public /* bridge */ /* synthetic */ boolean encode(@Yue.InterfaceC4410 java.io.InputStream r1, @Yue.InterfaceC4410 java.io.File r2, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r3) {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            boolean r1 = r0.encode2(r1, r2, r3)
            return r1
    }
}

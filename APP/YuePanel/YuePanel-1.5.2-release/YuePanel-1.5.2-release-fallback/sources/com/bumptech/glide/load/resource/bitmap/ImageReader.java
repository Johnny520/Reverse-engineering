package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
interface ImageReader {

    public static final class ByteArrayReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final byte[] bytes;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public ByteArrayReader(byte[] r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
                r0 = this;
                r0.<init>()
                r0.bytes = r1
                r0.parsers = r2
                r0.byteArrayPool = r3
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Yue.InterfaceC4544
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r4) {
                r3 = this;
                byte[] r0 = r3.bytes
                r1 = 0
                int r2 = r0.length
                android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r2, r4)
                return r4
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                byte[] r1 = r3.bytes
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r2 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r2.parsers
                byte[] r1 = r2.bytes
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r0 = this;
                return
        }
    }

    public static final class ByteBufferReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final java.nio.ByteBuffer buffer;
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public ByteBufferReader(java.nio.ByteBuffer r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
                r0 = this;
                r0.<init>()
                r0.buffer = r1
                r0.parsers = r2
                r0.byteArrayPool = r3
                return
        }

        private java.io.InputStream stream() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.buffer
                java.nio.ByteBuffer r0 = com.bumptech.glide.util.ByteBufferUtil.rewind(r0)
                java.io.InputStream r0 = com.bumptech.glide.util.ByteBufferUtil.toStream(r0)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Yue.InterfaceC4544
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r3) {
                r2 = this;
                java.io.InputStream r0 = r2.stream()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                java.nio.ByteBuffer r1 = r3.buffer
                java.nio.ByteBuffer r1 = com.bumptech.glide.util.ByteBufferUtil.rewind(r1)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r2 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r2.parsers
                java.nio.ByteBuffer r1 = r2.buffer
                java.nio.ByteBuffer r1 = com.bumptech.glide.util.ByteBufferUtil.rewind(r1)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r0 = this;
                return
        }
    }

    public static final class FileReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final java.io.File file;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public FileReader(java.io.File r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
                r0 = this;
                r0.<init>()
                r0.file = r1
                r0.parsers = r2
                r0.byteArrayPool = r3
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Yue.InterfaceC4544
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r5) throws java.io.FileNotFoundException {
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch: java.lang.Throwable -> L1a
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1a
                java.io.File r3 = r4.file     // Catch: java.lang.Throwable -> L1a
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1a
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = r4.byteArrayPool     // Catch: java.lang.Throwable -> L1a
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1a
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r1, r0, r5)     // Catch: java.lang.Throwable -> L17
                r1.close()     // Catch: java.io.IOException -> L16
            L16:
                return r5
            L17:
                r5 = move-exception
                r0 = r1
                goto L1b
            L1a:
                r5 = move-exception
            L1b:
                if (r0 == 0) goto L20
                r0.close()     // Catch: java.io.IOException -> L20
            L20:
                throw r5
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r5 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch: java.lang.Throwable -> L1d
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1d
                java.io.File r3 = r5.file     // Catch: java.lang.Throwable -> L1d
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = r5.byteArrayPool     // Catch: java.lang.Throwable -> L1d
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1d
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r5.parsers     // Catch: java.lang.Throwable -> L1b
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r5.byteArrayPool     // Catch: java.lang.Throwable -> L1b
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)     // Catch: java.lang.Throwable -> L1b
                r1.close()     // Catch: java.io.IOException -> L1a
            L1a:
                return r0
            L1b:
                r0 = move-exception
                goto L21
            L1d:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L21:
                if (r1 == 0) goto L26
                r1.close()     // Catch: java.io.IOException -> L26
            L26:
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r5 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch: java.lang.Throwable -> L1d
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1d
                java.io.File r3 = r5.file     // Catch: java.lang.Throwable -> L1d
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = r5.byteArrayPool     // Catch: java.lang.Throwable -> L1d
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1d
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r5.parsers     // Catch: java.lang.Throwable -> L1b
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r5.byteArrayPool     // Catch: java.lang.Throwable -> L1b
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1, r2)     // Catch: java.lang.Throwable -> L1b
                r1.close()     // Catch: java.io.IOException -> L1a
            L1a:
                return r0
            L1b:
                r0 = move-exception
                goto L21
            L1d:
                r1 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L21:
                if (r1 == 0) goto L26
                r1.close()     // Catch: java.io.IOException -> L26
            L26:
                throw r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r0 = this;
                return
        }
    }

    public static final class InputStreamImageReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final com.bumptech.glide.load.data.InputStreamRewinder dataRewinder;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public InputStreamImageReader(java.io.InputStream r2, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r3, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = com.bumptech.glide.util.Preconditions.checkNotNull(r4)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r0
                r1.byteArrayPool = r0
                java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
                java.util.List r3 = (java.util.List) r3
                r1.parsers = r3
                com.bumptech.glide.load.data.InputStreamRewinder r3 = new com.bumptech.glide.load.data.InputStreamRewinder
                r3.<init>(r2, r4)
                r1.dataRewinder = r3
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Yue.InterfaceC4544
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.InputStreamRewinder r0 = r2.dataRewinder
                java.io.InputStream r0 = r0.rewindAndGet()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.InputStreamRewinder r1 = r3.dataRewinder
                java.io.InputStream r1 = r1.rewindAndGet()
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.InputStreamRewinder r1 = r3.dataRewinder
                java.io.InputStream r1 = r1.rewindAndGet()
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r1 = this;
                com.bumptech.glide.load.data.InputStreamRewinder r0 = r1.dataRewinder
                r0.fixMarkLimits()
                return
        }
    }

    @Yue.InterfaceC5336(21)
    public static final class ParcelFileDescriptorImageReader implements com.bumptech.glide.load.resource.bitmap.ImageReader {
        private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool byteArrayPool;
        private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder dataRewinder;
        private final java.util.List<com.bumptech.glide.load.ImageHeaderParser> parsers;

        public ParcelFileDescriptorImageReader(android.os.ParcelFileDescriptor r1, java.util.List<com.bumptech.glide.load.ImageHeaderParser> r2, com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r3 = com.bumptech.glide.util.Preconditions.checkNotNull(r3)
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r3 = (com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool) r3
                r0.byteArrayPool = r3
                java.lang.Object r2 = com.bumptech.glide.util.Preconditions.checkNotNull(r2)
                java.util.List r2 = (java.util.List) r2
                r0.parsers = r2
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r2 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r2.<init>(r1)
                r0.dataRewinder = r2
                return
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Yue.InterfaceC4544
        public android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r3) throws java.io.IOException {
                r2 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r2.dataRewinder
                android.os.ParcelFileDescriptor r0 = r0.rewindAndGet()
                java.io.FileDescriptor r0 = r0.getFileDescriptor()
                r1 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r1, r3)
                return r3
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.dataRewinder
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException {
                r3 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r1 = r3.dataRewinder
                com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r3.byteArrayPool
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getType(r0, r1, r2)
                return r0
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
                r0 = this;
                return
        }
    }

    @Yue.InterfaceC4544
    android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r1) throws java.io.IOException;

    int getImageOrientation() throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType getImageType() throws java.io.IOException;

    void stopGrowingBuffers();
}

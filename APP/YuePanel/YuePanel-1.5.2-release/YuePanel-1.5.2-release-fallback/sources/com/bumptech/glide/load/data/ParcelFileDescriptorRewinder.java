package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements com.bumptech.glide.load.data.DataRewinder<android.os.ParcelFileDescriptor> {
    private final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder.InternalRewinder rewinder;

    @Yue.InterfaceC5336(21)
    public static final class Factory implements com.bumptech.glide.load.data.DataRewinder.Factory<android.os.ParcelFileDescriptor> {
        public Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: build, reason: avoid collision after fix types in other method */
        public com.bumptech.glide.load.data.DataRewinder<android.os.ParcelFileDescriptor> build2(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r2) {
                r1 = this;
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder
                r0.<init>(r2)
                return r0
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @Yue.InterfaceC4410
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.DataRewinder<android.os.ParcelFileDescriptor> build(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r1) {
                r0 = this;
                android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1
                com.bumptech.glide.load.data.DataRewinder r1 = r0.build2(r1)
                return r1
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @Yue.InterfaceC4410
        public java.lang.Class<android.os.ParcelFileDescriptor> getDataClass() {
                r1 = this;
                java.lang.Class<android.os.ParcelFileDescriptor> r0 = android.os.ParcelFileDescriptor.class
                return r0
        }
    }

    @Yue.InterfaceC5336(21)
    public static final class InternalRewinder {
        private final android.os.ParcelFileDescriptor parcelFileDescriptor;

        public InternalRewinder(android.os.ParcelFileDescriptor r1) {
                r0 = this;
                r0.<init>()
                r0.parcelFileDescriptor = r1
                return
        }

        public android.os.ParcelFileDescriptor rewind() throws java.io.IOException {
                r4 = this;
                android.os.ParcelFileDescriptor r0 = r4.parcelFileDescriptor     // Catch: android.system.ErrnoException -> L10
                java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: android.system.ErrnoException -> L10
                int r1 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> L10
                r2 = 0
                android.system.Os.lseek(r0, r2, r1)     // Catch: android.system.ErrnoException -> L10
                android.os.ParcelFileDescriptor r0 = r4.parcelFileDescriptor
                return r0
            L10:
                r0 = move-exception
                java.io.IOException r1 = new java.io.IOException
                r1.<init>(r0)
                throw r1
        }
    }

    @Yue.InterfaceC5336(21)
    public ParcelFileDescriptorRewinder(android.os.ParcelFileDescriptor r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder
            r0.<init>(r2)
            r1.rewinder = r0
            return
    }

    public static boolean isSupported() {
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
            r0 = this;
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(21)
    public android.os.ParcelFileDescriptor rewindAndGet() throws java.io.IOException {
            r1 = this;
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = r1.rewinder
            android.os.ParcelFileDescriptor r0 = r0.rewind()
            return r0
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(21)
    public /* bridge */ /* synthetic */ android.os.ParcelFileDescriptor rewindAndGet() throws java.io.IOException {
            r1 = this;
            android.os.ParcelFileDescriptor r0 = r1.rewindAndGet()
            return r0
    }
}

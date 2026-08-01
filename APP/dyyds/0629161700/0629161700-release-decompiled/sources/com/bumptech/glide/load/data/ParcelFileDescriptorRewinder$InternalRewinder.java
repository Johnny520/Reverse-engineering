package com.bumptech.glide.load.data;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.os.ParcelFileDescriptor f346;

    public ParcelFileDescriptorRewinder$InternalRewinder(android.os.ParcelFileDescriptor r1) {
            r0 = this;
            r0.<init>()
            r0.f346 = r1
            return
    }

    public android.os.ParcelFileDescriptor rewind() {
            r4 = this;
            android.os.ParcelFileDescriptor r4 = r4.f346
            java.io.FileDescriptor r0 = r4.getFileDescriptor()     // Catch: android.system.ErrnoException -> Le
            int r1 = android.system.OsConstants.SEEK_SET     // Catch: android.system.ErrnoException -> Le
            r2 = 0
            android.system.Os.lseek(r0, r2, r1)     // Catch: android.system.ErrnoException -> Le
            return r4
        Le:
            r4 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r4)
            throw r0
    }
}

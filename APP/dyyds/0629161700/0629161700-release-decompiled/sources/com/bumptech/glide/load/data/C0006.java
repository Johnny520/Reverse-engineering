package com.bumptech.glide.load.data;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ᛷᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006 implements defpackage.InterfaceC0590 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder f347;

    public C0006(android.os.ParcelFileDescriptor r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = new com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder
            r0.<init>(r2)
            r1.f347 = r0
            return
    }

    @Override // defpackage.InterfaceC0590
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final java.lang.Object mo229() {
            r0 = this;
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = r0.f347
            android.os.ParcelFileDescriptor r0 = r0.rewind()
            return r0
    }

    @Override // defpackage.InterfaceC0590
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo230() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.os.ParcelFileDescriptor m231() {
            r0 = this;
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder r0 = r0.f347
            android.os.ParcelFileDescriptor r0 = r0.rewind()
            return r0
    }
}

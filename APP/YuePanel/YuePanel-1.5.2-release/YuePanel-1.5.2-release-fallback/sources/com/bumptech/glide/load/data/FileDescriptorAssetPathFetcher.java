package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class FileDescriptorAssetPathFetcher extends com.bumptech.glide.load.data.AssetPathFetcher<android.content.res.AssetFileDescriptor> {
    public FileDescriptorAssetPathFetcher(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: close, reason: avoid collision after fix types in other method */
    public void close2(android.content.res.AssetFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public /* bridge */ /* synthetic */ void close(android.content.res.AssetFileDescriptor r1) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = (android.content.res.AssetFileDescriptor) r1
            r0.close2(r1)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @Yue.InterfaceC4410
    public java.lang.Class<android.content.res.AssetFileDescriptor> getDataClass() {
            r1 = this;
            java.lang.Class<android.content.res.AssetFileDescriptor> r0 = android.content.res.AssetFileDescriptor.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public android.content.res.AssetFileDescriptor loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            return r1
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r0.loadResource(r1, r2)
            return r1
    }
}

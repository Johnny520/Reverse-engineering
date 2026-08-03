package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class StreamAssetPathFetcher extends com.bumptech.glide.load.data.AssetPathFetcher<java.io.InputStream> {
    public StreamAssetPathFetcher(android.content.res.AssetManager r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: close, reason: avoid collision after fix types in other method */
    public void close2(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public /* bridge */ /* synthetic */ void close(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r0.close2(r1)
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @Yue.InterfaceC4410
    public java.lang.Class<java.io.InputStream> getDataClass() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public java.io.InputStream loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r1.open(r2)
            return r1
    }

    @Override // com.bumptech.glide.load.data.AssetPathFetcher
    public /* bridge */ /* synthetic */ java.io.InputStream loadResource(android.content.res.AssetManager r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = r0.loadResource(r1, r2)
            return r1
    }
}

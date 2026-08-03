package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public final class Options implements com.bumptech.glide.load.Key {
    private final Yue.C0573<com.bumptech.glide.load.Option<?>, java.lang.Object> values;

    public Options() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.util.CachedHashCodeArrayMap r0 = new com.bumptech.glide.util.CachedHashCodeArrayMap
            r0.<init>()
            r1.values = r0
            return
    }

    private static <T> void updateDiskCacheKey(@Yue.InterfaceC4410 com.bumptech.glide.load.Option<T> r0, @Yue.InterfaceC4410 java.lang.Object r1, @Yue.InterfaceC4410 java.security.MessageDigest r2) {
            r0.update(r1, r2)
            return
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.Options
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.Options r2 = (com.bumptech.glide.load.Options) r2
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r2.values
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Yue.InterfaceC4544
    public <T> T get(@Yue.InterfaceC4410 com.bumptech.glide.load.Option<T> r2) {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            java.lang.Object r2 = r0.get(r2)
            goto L13
        Lf:
            java.lang.Object r2 = r2.getDefaultValue()
        L13:
            return r2
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            int r0 = r0.hashCode()
            return r0
    }

    public void putAll(@Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r2.values
            r0.putAll(r2)
            return
    }

    public com.bumptech.glide.load.Options remove(@Yue.InterfaceC4410 com.bumptech.glide.load.Option<?> r2) {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            r0.remove(r2)
            return r1
    }

    @Yue.InterfaceC4410
    public <T> com.bumptech.glide.load.Options set(@Yue.InterfaceC4410 com.bumptech.glide.load.Option<T> r2, @Yue.InterfaceC4410 T r3) {
            r1 = this;
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r0 = r1.values
            r0.put(r2, r3)
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Options{values="
            r0.append(r1)
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r2.values
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@Yue.InterfaceC4410 java.security.MessageDigest r4) {
            r3 = this;
            r0 = 0
        L1:
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r3.values
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r1 = r3.values
            java.lang.Object r1 = r1.keyAt(r0)
            com.bumptech.glide.load.Option r1 = (com.bumptech.glide.load.Option) r1
            Yue.ۥ۟ۡۨۡ<com.bumptech.glide.load.Option<?>, java.lang.Object> r2 = r3.values
            java.lang.Object r2 = r2.valueAt(r0)
            updateDiskCacheKey(r1, r2, r4)
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }
}

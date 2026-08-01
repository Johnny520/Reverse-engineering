package org.luckypray.dexkit.cache;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeKeys {
    public static final org.luckypray.dexkit.cache.CacheBridgeKeys INSTANCE = null;
    private static final char[] hexDigits = null;

    static {
            org.luckypray.dexkit.cache.CacheBridgeKeys r0 = new org.luckypray.dexkit.cache.CacheBridgeKeys
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE = r0
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            r0.getClass()
            org.luckypray.dexkit.cache.CacheBridgeKeys.hexDigits = r0
            return
    }

    private CacheBridgeKeys() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String cacheKeyOf$default(org.luckypray.dexkit.cache.CacheBridgeKeys r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, org.luckypray.dexkit.query.base.BaseFinder r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = r0.cacheKeyOf(r1, r2, r3, r4)
            return r0
    }

    private final boolean isReserved(char r1) {
            r0 = this;
            r0 = 58
            if (r1 == r0) goto Lb
            r0 = 37
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public final java.lang.String cacheKeyOf(java.lang.String r2, java.lang.String r3, java.lang.String r4, org.luckypray.dexkit.query.base.BaseFinder r5) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.lang.String r2 = r1.cachePrefixOf(r2)
            java.lang.String r0 = ":"
            java.lang.String r2 = p000.lz1.m3688(r2, r0, r3)
            if (r4 == 0) goto L1d
            java.lang.String r1 = r1.encodeSegment(r4)
            java.lang.String r3 = ":user:"
            java.lang.String r1 = p000.lz1.m3688(r2, r3, r1)
            return r1
        L1d:
            if (r5 == 0) goto L2e
            java.lang.String r3 = r5.hashKey()
            java.lang.String r1 = r1.encodeSegment(r3)
            java.lang.String r3 = ":auto:"
            java.lang.String r1 = p000.lz1.m3688(r2, r3, r1)
            return r1
        L2e:
            java.lang.String r1 = "Either key or query must be provided for auto-generated cache key."
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }

    public final java.lang.String cachePrefixOf(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = r0.encodeSegment(r1)
            java.lang.String r1 = "dkcb:"
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            return r0
    }

    public final java.lang.String encodeSegment(java.lang.String r8) {
            r7 = this;
            r8.getClass()
            java.nio.charset.Charset r0 = p000.AbstractC0547mf.f7105
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
        L14:
            if (r2 >= r1) goto L3d
            r3 = r8[r2]
            r4 = r3 & 255(0xff, float:3.57E-43)
            char r5 = (char) r4
            boolean r6 = r7.isReserved(r5)
            if (r6 == 0) goto L37
            r5 = 37
            r0.append(r5)
            char[] r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.hexDigits
            int r4 = r4 >>> 4
            char r4 = r5[r4]
            r0.append(r4)
            r3 = r3 & 15
            char r3 = r5[r3]
            r0.append(r3)
            goto L3a
        L37:
            r0.append(r5)
        L3a:
            int r2 = r2 + 1
            goto L14
        L3d:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public final java.lang.String mapGroupKey(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.lang.String r0 = r0.encodeSegment(r2)
            java.lang.String r2 = ":group:"
            java.lang.String r0 = p000.lz1.m3688(r1, r2, r0)
            return r0
    }

    public final java.lang.String mapGroupsKey(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = ":meta:groups"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}

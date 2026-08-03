package org.luckypray.dexkit.cache;

/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4201(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeKeys;", "", "()V", "hexDigits", "", "cacheKeyOf", "", "appTag", "kind", "key", "query", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "cachePrefixOf", "encodeSegment", "raw", "isReserved", "", "ch", "", "mapGroupKey", "cacheKey", "groupKey", "mapGroupsKey", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CacheBridgeKeys {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.cache.CacheBridgeKeys INSTANCE = null;

    @Yue.InterfaceC4418
    private static final char[] hexDigits = null;

    static {
            org.luckypray.dexkit.cache.CacheBridgeKeys r0 = new org.luckypray.dexkit.cache.CacheBridgeKeys
            r0.<init>()
            org.luckypray.dexkit.cache.CacheBridgeKeys.INSTANCE = r0
            java.lang.String r0 = "0123456789ABCDEF"
            char[] r0 = r0.toCharArray()
            java.lang.String r1 = "(this as java.lang.String).toCharArray()"
            Yue.C3329.m13905(r0, r1)
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

    private final boolean isReserved(char r2) {
            r1 = this;
            r0 = 58
            if (r2 == r0) goto Lb
            r0 = 37
            if (r2 != r0) goto L9
            goto Lb
        L9:
            r2 = 0
            goto Lc
        Lb:
            r2 = 1
        Lc:
            return r2
    }

    @Yue.InterfaceC4418
    public final java.lang.String cacheKeyOf(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4543 java.lang.String r4, @Yue.InterfaceC4543 org.luckypray.dexkit.query.base.BaseFinder r5) {
            r1 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "kind"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r2 = r1.cachePrefixOf(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            if (r4 == 0) goto L3d
            java.lang.String r3 = r1.encodeSegment(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ":user:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            return r2
        L3d:
            if (r5 == 0) goto L5c
            java.lang.String r3 = r5.hashKey()
            java.lang.String r3 = r1.encodeSegment(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = ":auto:"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            return r2
        L5c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Either key or query must be provided for auto-generated cache key."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4418
    public final java.lang.String cachePrefixOf(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "appTag"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r3 = r2.encodeSegment(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dkcb:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.String encodeSegment(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "raw"
            Yue.C3329.m13906(r8, r0)
            java.nio.charset.Charset r0 = Yue.C1099.f3261
            byte[] r8 = r8.getBytes(r0)
            java.lang.String r0 = "(this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r8, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
        L18:
            if (r2 >= r1) goto L41
            r3 = r8[r2]
            r4 = r3 & 255(0xff, float:3.57E-43)
            char r5 = (char) r4
            boolean r6 = r7.isReserved(r5)
            if (r6 == 0) goto L3b
            r5 = 37
            r0.append(r5)
            char[] r5 = org.luckypray.dexkit.cache.CacheBridgeKeys.hexDigits
            int r4 = r4 >>> 4
            char r4 = r5[r4]
            r0.append(r4)
            r3 = r3 & 15
            char r3 = r5[r3]
            r0.append(r3)
            goto L3e
        L3b:
            r0.append(r5)
        L3e:
            int r2 = r2 + 1
            goto L18
        L41:
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "out.toString()"
            Yue.C3329.m13905(r8, r0)
            return r8
    }

    @Yue.InterfaceC4418
    public final java.lang.String mapGroupKey(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "cacheKey"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "groupKey"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r3 = r1.encodeSegment(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ":group:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Yue.InterfaceC4418
    public final java.lang.String mapGroupsKey(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "cacheKey"
            Yue.C3329.m13906(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ":meta:groups"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

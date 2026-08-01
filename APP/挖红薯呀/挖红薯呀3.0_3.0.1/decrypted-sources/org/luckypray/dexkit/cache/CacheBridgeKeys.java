package org.luckypray.dexkit.cache;

import org.luckypray.dexkit.query.base.BaseFinder;
import p000.AbstractC0959yd;
import p000.C0921xc;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class CacheBridgeKeys {
    public static final CacheBridgeKeys INSTANCE = new CacheBridgeKeys();
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private CacheBridgeKeys() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ String cacheKeyOf$default(CacheBridgeKeys cacheBridgeKeys, String str, String str2, String str3, BaseFinder baseFinder, int i, Object obj) {
        if ((i & 8) != 0) {
            baseFinder = null;
        }
        return cacheBridgeKeys.cacheKeyOf(str, str2, str3, baseFinder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isReserved(char c) {
        return c == ':' || c == '%';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String cacheKeyOf(String str, String str2, String str3, BaseFinder baseFinder) {
        str.getClass();
        str2.getClass();
        String str4 = cachePrefixOf(str) + ":" + str2;
        if (str3 != null) {
            return str4 + ":user:" + encodeSegment(str3);
        }
        if (baseFinder == null) {
            C0921xc.m5131l("Either key or query must be provided for auto-generated cache key.");
            return null;
        }
        return str4 + ":auto:" + encodeSegment(baseFinder.hashKey());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String cachePrefixOf(String str) {
        str.getClass();
        return "dkcb:" + encodeSegment(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String encodeSegment(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC0959yd.f7611a);
        bytes.getClass();
        StringBuilder sb = new StringBuilder(bytes.length);
        for (byte b : bytes) {
            int i = b & 255;
            char c = (char) i;
            if (isReserved(c)) {
                sb.append('%');
                char[] cArr = hexDigits;
                sb.append(cArr[i >>> 4]);
                sb.append(cArr[b & 15]);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String mapGroupKey(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + ":group:" + encodeSegment(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String mapGroupsKey(String str) {
        str.getClass();
        return str.concat(":meta:groups");
    }
}

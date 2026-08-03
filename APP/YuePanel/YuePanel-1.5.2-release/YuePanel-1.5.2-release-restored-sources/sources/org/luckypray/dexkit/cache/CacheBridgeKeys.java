package org.luckypray.dexkit.cache;

import Yue.C3794;
import Yue.C5282;
import Yue.C5499;
import Yue.C6659;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;
import org.luckypray.dexkit.query.base.BaseFinder;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m2699d2 = {"Lorg/luckypray/dexkit/cache/CacheBridgeKeys;", "", "()V", "hexDigits", "", "cacheKeyOf", "", "appTag", "kind", C6659.f17103, "query", "Lorg/luckypray/dexkit/query/base/BaseFinder;", "cachePrefixOf", "encodeSegment", "raw", "isReserved", "", "ch", "", "mapGroupKey", "cacheKey", "groupKey", "mapGroupsKey", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class CacheBridgeKeys {

    @InterfaceC6399
    public static final CacheBridgeKeys INSTANCE = new CacheBridgeKeys();

    @InterfaceC6399
    private static final char[] hexDigits;

    static {
        char[] charArray = C5282.f1387.toCharArray();
        C5499.m17102(charArray, "(this as java.lang.String).toCharArray()");
        hexDigits = charArray;
    }

    private CacheBridgeKeys() {
    }

    public static /* synthetic */ String cacheKeyOf$default(CacheBridgeKeys cacheBridgeKeys, String str, String str2, String str3, BaseFinder baseFinder, int i, Object obj) {
        if ((i & 8) != 0) {
            baseFinder = null;
        }
        return cacheBridgeKeys.cacheKeyOf(str, str2, str3, baseFinder);
    }

    private final boolean isReserved(char c) {
        return c == ':' || c == '%';
    }

    @InterfaceC6399
    public final String cacheKeyOf(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6489 String str3, @InterfaceC6489 BaseFinder baseFinder) {
        C5499.m17103(str, "appTag");
        C5499.m17103(str2, "kind");
        String str4 = cachePrefixOf(str) + ":" + str2;
        if (str3 != null) {
            return str4 + ":user:" + encodeSegment(str3);
        }
        if (baseFinder == null) {
            throw new IllegalArgumentException("Either key or query must be provided for auto-generated cache key.".toString());
        }
        return str4 + ":auto:" + encodeSegment(baseFinder.hashKey());
    }

    @InterfaceC6399
    public final String cachePrefixOf(@InterfaceC6399 String str) {
        C5499.m17103(str, "appTag");
        return "dkcb:" + encodeSegment(str);
    }

    @InterfaceC6399
    public final String encodeSegment(@InterfaceC6399 String str) {
        C5499.m17103(str, "raw");
        byte[] bytes = str.getBytes(C3794.f505);
        C5499.m17102(bytes, "(this as java.lang.String).getBytes(charset)");
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
        String string = sb.toString();
        C5499.m17102(string, "out.toString()");
        return string;
    }

    @InterfaceC6399
    public final String mapGroupKey(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "cacheKey");
        C5499.m17103(str2, "groupKey");
        return str + ":group:" + encodeSegment(str2);
    }

    @InterfaceC6399
    public final String mapGroupsKey(@InterfaceC6399 String str) {
        C5499.m17103(str, "cacheKey");
        return str + ":meta:groups";
    }
}

package com.bumptech.glide.load;

import Yue.C6193;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Option<T> {
    private static final CacheKeyUpdater<Object> EMPTY_UPDATER = new CacheKeyUpdater<Object>() { // from class: com.bumptech.glide.load.Option.1
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public void update(@InterfaceC6391 byte[] bArr, @InterfaceC6391 Object obj, @InterfaceC6391 MessageDigest messageDigest) {
        }
    };
    private final CacheKeyUpdater<T> cacheKeyUpdater;
    private final T defaultValue;
    private final String key;
    private volatile byte[] keyBytes;

    public interface CacheKeyUpdater<T> {
        void update(@InterfaceC6391 byte[] bArr, @InterfaceC6391 T t, @InterfaceC6391 MessageDigest messageDigest);
    }

    private Option(@InterfaceC6391 String str, @InterfaceC6490 T t, @InterfaceC6391 CacheKeyUpdater<T> cacheKeyUpdater) {
        this.key = Preconditions.checkNotEmpty(str);
        this.defaultValue = t;
        this.cacheKeyUpdater = (CacheKeyUpdater) Preconditions.checkNotNull(cacheKeyUpdater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T> Option<T> disk(@InterfaceC6391 String str, @InterfaceC6391 CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, null, cacheKeyUpdater);
    }

    @InterfaceC6391
    private static <T> CacheKeyUpdater<T> emptyUpdater() {
        return (CacheKeyUpdater<T>) EMPTY_UPDATER;
    }

    @InterfaceC6391
    private byte[] getKeyBytes() {
        if (this.keyBytes == null) {
            this.keyBytes = this.key.getBytes(Key.CHARSET);
        }
        return this.keyBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public static <T> Option<T> memory(@InterfaceC6391 String str) {
        return new Option<>(str, null, emptyUpdater());
    }

    public boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.key.equals(((Option) obj).key);
        }
        return false;
    }

    @InterfaceC6490
    public T getDefaultValue() {
        return this.defaultValue;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.key + '\'' + C6193.f1885;
    }

    public void update(@InterfaceC6391 T t, @InterfaceC6391 MessageDigest messageDigest) {
        this.cacheKeyUpdater.update(getKeyBytes(), t, messageDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T> Option<T> disk(@InterfaceC6391 String str, @InterfaceC6490 T t, @InterfaceC6391 CacheKeyUpdater<T> cacheKeyUpdater) {
        return new Option<>(str, t, cacheKeyUpdater);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public static <T> Option<T> memory(@InterfaceC6391 String str, @InterfaceC6391 T t) {
        return new Option<>(str, t, emptyUpdater());
    }
}

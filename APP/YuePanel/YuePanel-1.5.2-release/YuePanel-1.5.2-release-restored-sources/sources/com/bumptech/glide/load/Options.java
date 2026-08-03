package com.bumptech.glide.load;

import Yue.C3394;
import Yue.C6193;
import Yue.C7467;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Options implements Key {
    private final C3394<Option<?>, Object> values = new CachedHashCodeArrayMap();

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof Options) {
            return this.values.equals(((Options) obj).values);
        }
        return false;
    }

    @InterfaceC6490
    public <T> T get(@InterfaceC6391 Option<T> option) {
        return this.values.containsKey(option) ? (T) this.values.get(option) : option.getDefaultValue();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.values.hashCode();
    }

    public void putAll(@InterfaceC6391 Options options) {
        this.values.putAll((C7467<? extends Option<?>, ? extends Object>) options.values);
    }

    public Options remove(@InterfaceC6391 Option<?> option) {
        this.values.remove(option);
        return this;
    }

    @InterfaceC6391
    public <T> Options set(@InterfaceC6391 Option<T> option, @InterfaceC6391 T t) {
        this.values.put(option, t);
        return this;
    }

    public String toString() {
        return "Options{values=" + this.values + C6193.f1885;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@InterfaceC6391 MessageDigest messageDigest) {
        for (int i = 0; i < this.values.size(); i++) {
            updateDiskCacheKey(this.values.keyAt(i), this.values.valueAt(i), messageDigest);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void updateDiskCacheKey(@InterfaceC6391 Option<T> option, @InterfaceC6391 Object obj, @InterfaceC6391 MessageDigest messageDigest) {
        option.update(obj, messageDigest);
    }
}

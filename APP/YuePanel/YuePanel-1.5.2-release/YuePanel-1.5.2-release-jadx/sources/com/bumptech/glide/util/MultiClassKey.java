package com.bumptech.glide.util;

import Yue.C6193;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;

/* JADX INFO: loaded from: classes.dex */
public class MultiClassKey {
    private Class<?> first;
    private Class<?> second;
    private Class<?> third;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MultiClassKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.first.equals(multiClassKey.first) && this.second.equals(multiClassKey.second) && Util.bothNullOrEqual(this.third, multiClassKey.third);
    }

    public int hashCode() {
        int iHashCode = ((this.first.hashCode() * 31) + this.second.hashCode()) * 31;
        Class<?> cls = this.third;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void set(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2) {
        set(cls, cls2, null);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.first + ", second=" + this.second + C6193.f1885;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MultiClassKey(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2) {
        set(cls, cls2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void set(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2, @InterfaceC6490 Class<?> cls3) {
        this.first = cls;
        this.second = cls2;
        this.third = cls3;
    }

    public MultiClassKey(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2, @InterfaceC6490 Class<?> cls3) {
        set(cls, cls2, cls3);
    }
}

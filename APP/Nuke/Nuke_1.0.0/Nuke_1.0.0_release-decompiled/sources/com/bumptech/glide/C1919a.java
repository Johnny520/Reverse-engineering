package com.bumptech.glide;

import p183j2.C2380a;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1919a implements Cloneable {

    /* JADX INFO: renamed from: d */
    public C2380a f6510d;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1919a clone() {
        try {
            return (C1919a) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3411e(Object obj) {
        if (obj instanceof C1919a) {
            return AbstractC2511o.m4453b(this.f6510d, ((C1919a) obj).f6510d);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1919a) && m3411e(obj);
    }

    /* JADX INFO: renamed from: g */
    public final int m3412g() {
        C2380a c2380a = this.f6510d;
        if (c2380a != null) {
            return c2380a.hashCode();
        }
        return 0;
    }

    public final int hashCode() {
        return m3412g();
    }
}

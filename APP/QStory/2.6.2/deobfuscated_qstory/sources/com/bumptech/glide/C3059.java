package com.bumptech.glide;

import p222.AbstractC7988;
import p224.C7996;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3059 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7996 f9766;

    public final boolean equals(Object obj) {
        return (obj instanceof C3059) && m6725(obj);
    }

    public final int hashCode() {
        return m6724();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m6724() {
        C7996 c7996 = this.f9766;
        if (c7996 != null) {
            return c7996.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m6725(Object obj) {
        if (obj instanceof C3059) {
            return AbstractC7988.m13444(this.f9766, ((C3059) obj).f9766);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3059 clone() {
        try {
            return (C3059) super.clone();
        } catch (CloneNotSupportedException e) {
            C5919.m11252(e);
            return null;
        }
    }
}

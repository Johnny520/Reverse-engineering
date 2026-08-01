package com.bumptech.glide;

import p222.AbstractC7989;
import p224.C7997;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3060 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7997 f9775;

    public final boolean equals(Object obj) {
        return (obj instanceof C3060) && m6770(obj);
    }

    public final int hashCode() {
        return m6769();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m6769() {
        C7997 c7997 = this.f9775;
        if (c7997 != null) {
            return c7997.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m6770(Object obj) {
        if (obj instanceof C3060) {
            return AbstractC7989.m13472(this.f9775, ((C3060) obj).f9775);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3060 clone() {
        try {
            return (C3060) super.clone();
        } catch (CloneNotSupportedException e) {
            C5925.m11313(e);
            return null;
        }
    }
}

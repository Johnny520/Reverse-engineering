package com.bumptech.glide;

import p238.AbstractC8818;
import p240.C8826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3892 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C8826 f10120;

    public final boolean equals(Object obj) {
        return (obj instanceof C3892) && m7330(obj);
    }

    public final int hashCode() {
        return m7329();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7329() {
        C8826 c8826 = this.f10120;
        if (c8826 != null) {
            return c8826.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7330(Object obj) {
        if (obj instanceof C3892) {
            return AbstractC8818.m14031(this.f10120, ((C3892) obj).f10120);
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C3892 clone() {
        try {
            return (C3892) super.clone();
        } catch (CloneNotSupportedException e) {
            C6755.m11872(e);
            return null;
        }
    }
}

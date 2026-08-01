package com.google.gson;

import p275.C9073;
import p275.C9074;
import p287.AbstractC9123;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4073 extends AbstractC9123 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC4083 f11256 = null;

    @Override // p287.AbstractC9123
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4083 mo7887() {
        AbstractC4083 abstractC4083 = this.f11256;
        if (abstractC4083 != null) {
            return abstractC4083;
        }
        C6755.m11870("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7881(C9073 c9073, Object obj) {
        AbstractC4083 abstractC4083 = this.f11256;
        if (abstractC4083 != null) {
            abstractC4083.mo7881(c9073, obj);
        } else {
            C6755.m11870("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.AbstractC4083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7882(C9074 c9074) {
        AbstractC4083 abstractC4083 = this.f11256;
        if (abstractC4083 != null) {
            return abstractC4083.mo7882(c9074);
        }
        C6755.m11870("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}

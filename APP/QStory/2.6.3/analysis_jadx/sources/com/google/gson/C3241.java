package com.google.gson;

import p259.C8244;
import p259.C8245;
import p271.AbstractC8294;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3241 extends AbstractC8294 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3251 f10911 = null;

    @Override // p271.AbstractC8294
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3251 mo7328() {
        AbstractC3251 abstractC3251 = this.f10911;
        if (abstractC3251 != null) {
            return abstractC3251;
        }
        C5925.m11311("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7322(C8244 c8244, Object obj) {
        AbstractC3251 abstractC3251 = this.f10911;
        if (abstractC3251 != null) {
            abstractC3251.mo7322(c8244, obj);
        } else {
            C5925.m11311("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.AbstractC3251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7323(C8245 c8245) {
        AbstractC3251 abstractC3251 = this.f10911;
        if (abstractC3251 != null) {
            return abstractC3251.mo7323(c8245);
        }
        C5925.m11311("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}

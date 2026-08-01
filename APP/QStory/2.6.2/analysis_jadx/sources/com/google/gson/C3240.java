package com.google.gson;

import p259.C8243;
import p259.C8244;
import p271.AbstractC8293;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3240 extends AbstractC8293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC3250 f10906 = null;

    @Override // p271.AbstractC8293
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3250 mo7341() {
        AbstractC3250 abstractC3250 = this.f10906;
        if (abstractC3250 != null) {
            return abstractC3250;
        }
        C5919.m11250("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo7335(C8243 c8243, Object obj) {
        AbstractC3250 abstractC3250 = this.f10906;
        if (abstractC3250 != null) {
            abstractC3250.mo7335(c8243, obj);
        } else {
            C5919.m11250("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7336(C8244 c8244) {
        AbstractC3250 abstractC3250 = this.f10906;
        if (abstractC3250 != null) {
            return abstractC3250.mo7336(c8244);
        }
        C5919.m11250("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}

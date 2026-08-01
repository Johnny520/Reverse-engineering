package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3834 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12037;

    public C3834(C3837 c3837, String str) {
        super(TokenType.COMMENT, c3837, null, null);
        this.f12037 = str;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3834) obj).f12037.equals(this.f12037);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        return AbstractC6136.m11539((this.f12048.hashCode() + 41) * 41, 41, this.f12037);
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("'#"), this.f12037, "' (COMMENT)");
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3834;
    }
}

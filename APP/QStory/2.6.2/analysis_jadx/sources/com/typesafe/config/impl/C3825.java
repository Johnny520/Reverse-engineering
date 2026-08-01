package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3825 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12021;

    public C3825(C3837 c3837, String str) {
        super(TokenType.IGNORED_WHITESPACE, c3837, null, null);
        this.f12021 = str;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3825) obj).f12021.equals(this.f12021);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        return this.f12021.hashCode() + ((this.f12048.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("'"), this.f12021, "' (WHITESPACE)");
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3825;
    }
}

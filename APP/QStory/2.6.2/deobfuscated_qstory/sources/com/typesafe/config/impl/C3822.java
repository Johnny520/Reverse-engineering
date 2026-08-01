package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3822 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12019;

    public C3822(InterfaceC8160 interfaceC8160, String str) {
        super(TokenType.UNQUOTED_TEXT, interfaceC8160, null, null);
        this.f12019 = str;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3822) obj).f12019.equals(this.f12019);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        return this.f12019.hashCode() + ((this.f12048.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        return AbstractC0053.m146(new StringBuilder("'"), this.f12019, "'");
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3822;
    }
}

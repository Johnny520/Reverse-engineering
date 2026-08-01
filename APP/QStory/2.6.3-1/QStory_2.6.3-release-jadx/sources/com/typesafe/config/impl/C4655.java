package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4655 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12369;

    public C4655(InterfaceC8990 interfaceC8990, String str) {
        super(TokenType.UNQUOTED_TEXT, interfaceC8990, null, null);
        this.f12369 = str;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C4655) obj).f12369.equals(this.f12369);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        return this.f12369.hashCode() + ((this.f12398.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        return AbstractC0900.m711(new StringBuilder("'"), this.f12369, "'");
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4655;
    }
}

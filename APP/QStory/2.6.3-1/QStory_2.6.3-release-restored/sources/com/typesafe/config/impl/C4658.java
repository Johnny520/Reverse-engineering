package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4658 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12371;

    public C4658(C4670 c4670, String str) {
        super(TokenType.IGNORED_WHITESPACE, c4670, null, null);
        this.f12371 = str;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C4658) obj).f12371.equals(this.f12371);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        return this.f12371.hashCode() + ((this.f12398.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        return AbstractC0900.m711(new StringBuilder("'"), this.f12371, "' (WHITESPACE)");
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4658;
    }
}

package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4667 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12387;

    public C4667(C4670 c4670, String str) {
        super(TokenType.COMMENT, c4670, null, null);
        this.f12387 = str;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C4667) obj).f12387.equals(this.f12387);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        return AbstractC7012.m12131((this.f12398.hashCode() + 41) * 41, 41, this.f12387);
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        return AbstractC0900.m711(new StringBuilder("'#"), this.f12387, "' (COMMENT)");
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4667;
    }
}

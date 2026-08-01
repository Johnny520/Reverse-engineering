package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4660 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12374;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12375;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Throwable f12376;

    public C4660(InterfaceC8990 interfaceC8990, String str, String str2, boolean z, Throwable th) {
        super(TokenType.PROBLEM, interfaceC8990, null, null);
        this.f12375 = str;
        this.f12374 = str2;
        this.f12373 = z;
        this.f12376 = th;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C4660 c4660 = (C4660) obj;
        return c4660.f12375.equals(this.f12375) && c4660.f12374.equals(this.f12374) && c4660.f12373 == this.f12373 && AbstractC4696.m8808(c4660.f12376, this.f12376);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        int iHashCode = (Boolean.valueOf(this.f12373).hashCode() + AbstractC7012.m12131(AbstractC7012.m12131((this.f12398.hashCode() + 41) * 41, 41, this.f12375), 41, this.f12374)) * 41;
        Throwable th = this.f12376;
        return th != null ? (th.hashCode() + iHashCode) * 41 : iHashCode;
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(this.f12375);
        sb.append("' (");
        return AbstractC0900.m711(sb, this.f12374, ")");
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4660;
    }
}

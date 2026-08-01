package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4659 extends C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12372;

    public C4659(C4670 c4670, boolean z, ArrayList arrayList) {
        super(TokenType.SUBSTITUTION, c4670, null, null);
        this.f12372 = arrayList;
    }

    @Override // com.typesafe.config.impl.C4669
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C4659) obj).f12372.equals(this.f12372);
    }

    @Override // com.typesafe.config.impl.C4669
    public final int hashCode() {
        return this.f12372.hashCode() + ((this.f12398.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C4669
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f12372.iterator();
        while (it.hasNext()) {
            sb.append(((C4669) it.next()).toString());
        }
        return "'${" + sb.toString() + "}'";
    }

    @Override // com.typesafe.config.impl.C4669
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8756(C4669 c4669) {
        return c4669 instanceof C4659;
    }
}

package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3826 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12022;

    public C3826(C3837 c3837, boolean z, ArrayList arrayList) {
        super(TokenType.SUBSTITUTION, c3837, null, null);
        this.f12022 = arrayList;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3826) obj).f12022.equals(this.f12022);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        return this.f12022.hashCode() + ((this.f12048.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f12022.iterator();
        while (it.hasNext()) {
            sb.append(((C3836) it.next()).toString());
        }
        return "'${" + sb.toString() + "}'";
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3826;
    }
}

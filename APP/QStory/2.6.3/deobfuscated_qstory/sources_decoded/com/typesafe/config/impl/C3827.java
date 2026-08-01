package com.typesafe.config.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3827 extends C3837 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f12027;

    public C3827(C3838 c3838, boolean z, ArrayList arrayList) {
        super(TokenType.SUBSTITUTION, c3838, null, null);
        this.f12027 = arrayList;
    }

    @Override // com.typesafe.config.impl.C3837
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3827) obj).f12027.equals(this.f12027);
    }

    @Override // com.typesafe.config.impl.C3837
    public final int hashCode() {
        return this.f12027.hashCode() + ((this.f12053.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3837
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f12027.iterator();
        while (it.hasNext()) {
            sb.append(((C3837) it.next()).toString());
        }
        return "'${" + sb.toString() + "}'";
    }

    @Override // com.typesafe.config.impl.C3837
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8197(C3837 c3837) {
        return c3837 instanceof C3827;
    }
}

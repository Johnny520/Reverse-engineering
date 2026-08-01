package org.luckypray.dexkit.result;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p034.AbstractC6347;
import p365.AbstractC8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5720 extends AbstractC8948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f15682;

    public C5720(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f15682 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.f15682) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            C5725 c5725 = (C5725) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c5725);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}

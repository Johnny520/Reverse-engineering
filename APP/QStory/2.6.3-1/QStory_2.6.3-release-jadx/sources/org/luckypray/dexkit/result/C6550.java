package org.luckypray.dexkit.result;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p050.AbstractC7176;
import p381.AbstractC9777;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6550 extends AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f16027;

    public C6550(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f16027 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.f16027) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            C6555 c6555 = (C6555) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c6555);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}

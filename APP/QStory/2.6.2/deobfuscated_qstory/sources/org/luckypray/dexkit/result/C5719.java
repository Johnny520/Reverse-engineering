package org.luckypray.dexkit.result;

import java.util.ArrayList;
import org.luckypray.dexkit.DexKitBridge;
import p253.AbstractC8189;
import p365.AbstractC8944;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5719 extends AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f15682;

    public C5719(DexKitBridge dexKitBridge, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f15682 = arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Object obj : this.f15682) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            C5724 c5724 = (C5724) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c5724);
            i = i2;
        }
        sb.append("}");
        return sb.toString();
    }
}

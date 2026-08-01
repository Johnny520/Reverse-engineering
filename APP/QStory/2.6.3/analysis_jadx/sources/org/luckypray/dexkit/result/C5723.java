package org.luckypray.dexkit.result;

import java.util.ArrayList;
import kotlin.AbstractC5187;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC5731;
import org.luckypray.dexkit.wrap.C5736;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p365.AbstractC8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5723 extends AbstractC8948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f15686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15687;

    public C5723(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f15687 = str;
        this.f15686 = arrayList;
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.AnnotationData$dexClass$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5736 invoke() {
                return new C5736(this.this$0.f15687);
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@".concat(AbstractC5731.m11131(this.f15687)));
        sb.append("(");
        int i = 0;
        for (Object obj : this.f15686) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            C5722 c5722 = (C5722) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c5722);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }
}
